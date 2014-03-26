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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
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
public	TokenNamepublic	
class	TokenNameclass	
TestIndexableBinaryStringTools	TokenNameIdentifier	 Test Indexable Binary String Tools
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
NUM_RANDOM_TESTS	TokenNameIdentifier	 NUM  RANDOM  TESTS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
;	TokenNameSEMICOLON	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
NUM_RANDOM_TESTS	TokenNameIdentifier	 NUM  RANDOM  TESTS
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated remove this test for Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this test for Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testSingleBinaryRoundTripNIO	TokenNameIdentifier	 test Single Binary Round Trip NIO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x76	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x7F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD8	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
binaryBuf	TokenNameIdentifier	 binary Buf
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
encoded	TokenNameIdentifier	 encoded
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
binaryBuf	TokenNameIdentifier	 binary Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decoded	TokenNameIdentifier	 decoded
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Round trip decode/decode returned different results:"	TokenNameStringLiteral	Round trip decode/decode returned different results:
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"original: "	TokenNameStringLiteral	original: 
+	TokenNamePLUS	
binaryDumpNIO	TokenNameIdentifier	 binary Dump NIO
(	TokenNameLPAREN	
binaryBuf	TokenNameIdentifier	 binary Buf
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" encoded: "	TokenNameStringLiteral	 encoded: 
+	TokenNamePLUS	
charArrayDumpNIO	TokenNameIdentifier	 char Array Dump NIO
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" decoded: "	TokenNameStringLiteral	 decoded: 
+	TokenNamePLUS	
binaryDumpNIO	TokenNameIdentifier	 binary Dump NIO
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryBuf	TokenNameIdentifier	 binary Buf
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSingleBinaryRoundTrip	TokenNameIdentifier	 test Single Binary Round Trip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x76	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x7F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD8	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedLen	TokenNameIdentifier	 encoded Len
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
encoded	TokenNameIdentifier	 encoded
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
encodedLen	TokenNameIdentifier	 encoded Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
decodedLen	TokenNameIdentifier	 decoded Len
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
decoded	TokenNameIdentifier	 decoded
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
decodedLen	TokenNameIdentifier	 decoded Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Round trip decode/decode returned different results:"	TokenNameStringLiteral	Round trip decode/decode returned different results:
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"original: "	TokenNameStringLiteral	original: 
+	TokenNamePLUS	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" encoded: "	TokenNameStringLiteral	 encoded: 
+	TokenNamePLUS	
charArrayDump	TokenNameIdentifier	 char Array Dump
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" decoded: "	TokenNameStringLiteral	 decoded: 
+	TokenNamePLUS	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated remove this test for Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this test for Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testEncodedSortabilityNIO	TokenNameIdentifier	 test Encoded Sortability NIO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
originalArray1	TokenNameIdentifier	 original Array1
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
originalBuf1	TokenNameIdentifier	 original Buf1
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
originalArray1	TokenNameIdentifier	 original Array1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
originalString1	TokenNameIdentifier	 original String1
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
originalStringBuf1	TokenNameIdentifier	 original String Buf1
=	TokenNameEQUAL	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
originalString1	TokenNameIdentifier	 original String1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoded1	TokenNameIdentifier	 encoded1
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
originalBuf1	TokenNameIdentifier	 original Buf1
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
encodedBuf1	TokenNameIdentifier	 encoded Buf1
=	TokenNameEQUAL	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
encoded1	TokenNameIdentifier	 encoded1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
original2	TokenNameIdentifier	 original2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
originalBuf2	TokenNameIdentifier	 original Buf2
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
original2	TokenNameIdentifier	 original2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
originalString2	TokenNameIdentifier	 original String2
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
originalStringBuf2	TokenNameIdentifier	 original String Buf2
=	TokenNameEQUAL	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
originalString2	TokenNameIdentifier	 original String2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoded2	TokenNameIdentifier	 encoded2
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
originalBuf2	TokenNameIdentifier	 original Buf2
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
encodedBuf2	TokenNameIdentifier	 encoded Buf2
=	TokenNameEQUAL	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
encoded2	TokenNameIdentifier	 encoded2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
testNum	TokenNameIdentifier	 test Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
testNum	TokenNameIdentifier	 test Num
<	TokenNameLESS	
NUM_RANDOM_TESTS	TokenNameIdentifier	 NUM  RANDOM  TESTS
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
testNum	TokenNameIdentifier	 test Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numBytes1	TokenNameIdentifier	 num Bytes1
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Min == 1 	TokenNameCOMMENT_LINE	Min == 1 
originalBuf1	TokenNameIdentifier	 original Buf1
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
numBytes1	TokenNameIdentifier	 num Bytes1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
originalStringBuf1	TokenNameIdentifier	 original String Buf1
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
numBytes1	TokenNameIdentifier	 num Bytes1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteNum	TokenNameIdentifier	 byte Num
<	TokenNameLESS	
numBytes1	TokenNameIdentifier	 num Bytes1
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
byteNum	TokenNameIdentifier	 byte Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
randomInt	TokenNameIdentifier	 random Int
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
originalArray1	TokenNameIdentifier	 original Array1
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
randomInt	TokenNameIdentifier	 random Int
;	TokenNameSEMICOLON	
originalString1	TokenNameIdentifier	 original String1
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
randomInt	TokenNameIdentifier	 random Int
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numBytes2	TokenNameIdentifier	 num Bytes2
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Min == 1 	TokenNameCOMMENT_LINE	Min == 1 
originalBuf2	TokenNameIdentifier	 original Buf2
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
numBytes2	TokenNameIdentifier	 num Bytes2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
originalStringBuf2	TokenNameIdentifier	 original String Buf2
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
numBytes2	TokenNameIdentifier	 num Bytes2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteNum	TokenNameIdentifier	 byte Num
<	TokenNameLESS	
numBytes2	TokenNameIdentifier	 num Bytes2
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
byteNum	TokenNameIdentifier	 byte Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
randomInt	TokenNameIdentifier	 random Int
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
original2	TokenNameIdentifier	 original2
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
randomInt	TokenNameIdentifier	 random Int
;	TokenNameSEMICOLON	
originalString2	TokenNameIdentifier	 original String2
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
randomInt	TokenNameIdentifier	 random Int
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
originalComparison	TokenNameIdentifier	 original Comparison
=	TokenNameEQUAL	
originalStringBuf1	TokenNameIdentifier	 original String Buf1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
originalStringBuf2	TokenNameIdentifier	 original String Buf2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
originalComparison	TokenNameIdentifier	 original Comparison
=	TokenNameEQUAL	
originalComparison	TokenNameIdentifier	 original Comparison
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
originalComparison	TokenNameIdentifier	 original Comparison
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
originalBuf1	TokenNameIdentifier	 original Buf1
,	TokenNameCOMMA	
encodedBuf1	TokenNameIdentifier	 encoded Buf1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
originalBuf2	TokenNameIdentifier	 original Buf2
,	TokenNameCOMMA	
encodedBuf2	TokenNameIdentifier	 encoded Buf2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedComparison	TokenNameIdentifier	 encoded Comparison
=	TokenNameEQUAL	
encodedBuf1	TokenNameIdentifier	 encoded Buf1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
encodedBuf2	TokenNameIdentifier	 encoded Buf2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encodedComparison	TokenNameIdentifier	 encoded Comparison
=	TokenNameEQUAL	
encodedComparison	TokenNameIdentifier	 encoded Comparison
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
encodedComparison	TokenNameIdentifier	 encoded Comparison
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Test #"	TokenNameStringLiteral	Test #
+	TokenNamePLUS	
(	TokenNameLPAREN	
testNum	TokenNameIdentifier	 test Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": Original bytes and encoded chars compare differently:"	TokenNameStringLiteral	: Original bytes and encoded chars compare differently:
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" binary 1: "	TokenNameStringLiteral	 binary 1: 
+	TokenNamePLUS	
binaryDumpNIO	TokenNameIdentifier	 binary Dump NIO
(	TokenNameLPAREN	
originalBuf1	TokenNameIdentifier	 original Buf1
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" binary 2: "	TokenNameStringLiteral	 binary 2: 
+	TokenNamePLUS	
binaryDumpNIO	TokenNameIdentifier	 binary Dump NIO
(	TokenNameLPAREN	
originalBuf2	TokenNameIdentifier	 original Buf2
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"encoded 1: "	TokenNameStringLiteral	encoded 1: 
+	TokenNamePLUS	
charArrayDumpNIO	TokenNameIdentifier	 char Array Dump NIO
(	TokenNameLPAREN	
encodedBuf1	TokenNameIdentifier	 encoded Buf1
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"encoded 2: "	TokenNameStringLiteral	encoded 2: 
+	TokenNamePLUS	
charArrayDumpNIO	TokenNameIdentifier	 char Array Dump NIO
(	TokenNameLPAREN	
encodedBuf2	TokenNameIdentifier	 encoded Buf2
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
originalComparison	TokenNameIdentifier	 original Comparison
,	TokenNameCOMMA	
encodedComparison	TokenNameIdentifier	 encoded Comparison
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEncodedSortability	TokenNameIdentifier	 test Encoded Sortability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
originalArray1	TokenNameIdentifier	 original Array1
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
originalString1	TokenNameIdentifier	 original String1
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoded1	TokenNameIdentifier	 encoded1
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
original2	TokenNameIdentifier	 original2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
originalString2	TokenNameIdentifier	 original String2
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoded2	TokenNameIdentifier	 encoded2
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
testNum	TokenNameIdentifier	 test Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
testNum	TokenNameIdentifier	 test Num
<	TokenNameLESS	
NUM_RANDOM_TESTS	TokenNameIdentifier	 NUM  RANDOM  TESTS
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
testNum	TokenNameIdentifier	 test Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numBytes1	TokenNameIdentifier	 num Bytes1
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Min == 1 	TokenNameCOMMENT_LINE	Min == 1 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteNum	TokenNameIdentifier	 byte Num
<	TokenNameLESS	
numBytes1	TokenNameIdentifier	 num Bytes1
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
byteNum	TokenNameIdentifier	 byte Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
randomInt	TokenNameIdentifier	 random Int
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
originalArray1	TokenNameIdentifier	 original Array1
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
randomInt	TokenNameIdentifier	 random Int
;	TokenNameSEMICOLON	
originalString1	TokenNameIdentifier	 original String1
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
randomInt	TokenNameIdentifier	 random Int
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numBytes2	TokenNameIdentifier	 num Bytes2
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Min == 1 	TokenNameCOMMENT_LINE	Min == 1 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteNum	TokenNameIdentifier	 byte Num
<	TokenNameLESS	
numBytes2	TokenNameIdentifier	 num Bytes2
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
byteNum	TokenNameIdentifier	 byte Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
randomInt	TokenNameIdentifier	 random Int
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
original2	TokenNameIdentifier	 original2
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
randomInt	TokenNameIdentifier	 random Int
;	TokenNameSEMICOLON	
originalString2	TokenNameIdentifier	 original String2
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
randomInt	TokenNameIdentifier	 random Int
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
originalComparison	TokenNameIdentifier	 original Comparison
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
originalString1	TokenNameIdentifier	 original String1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes1	TokenNameIdentifier	 num Bytes1
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
originalString2	TokenNameIdentifier	 original String2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes2	TokenNameIdentifier	 num Bytes2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
originalComparison	TokenNameIdentifier	 original Comparison
=	TokenNameEQUAL	
originalComparison	TokenNameIdentifier	 original Comparison
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
originalComparison	TokenNameIdentifier	 original Comparison
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedLen1	TokenNameIdentifier	 encoded Len1
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
originalArray1	TokenNameIdentifier	 original Array1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes1	TokenNameIdentifier	 num Bytes1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encodedLen1	TokenNameIdentifier	 encoded Len1
>	TokenNameGREATER	
encoded1	TokenNameIdentifier	 encoded1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
encoded1	TokenNameIdentifier	 encoded1
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
encodedLen1	TokenNameIdentifier	 encoded Len1
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
originalArray1	TokenNameIdentifier	 original Array1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes1	TokenNameIdentifier	 num Bytes1
,	TokenNameCOMMA	
encoded1	TokenNameIdentifier	 encoded1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encodedLen1	TokenNameIdentifier	 encoded Len1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedLen2	TokenNameIdentifier	 encoded Len2
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
original2	TokenNameIdentifier	 original2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes2	TokenNameIdentifier	 num Bytes2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encodedLen2	TokenNameIdentifier	 encoded Len2
>	TokenNameGREATER	
encoded2	TokenNameIdentifier	 encoded2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
encoded2	TokenNameIdentifier	 encoded2
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
encodedLen2	TokenNameIdentifier	 encoded Len2
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
original2	TokenNameIdentifier	 original2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes2	TokenNameIdentifier	 num Bytes2
,	TokenNameCOMMA	
encoded2	TokenNameIdentifier	 encoded2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encodedLen2	TokenNameIdentifier	 encoded Len2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedComparison	TokenNameIdentifier	 encoded Comparison
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
encoded1	TokenNameIdentifier	 encoded1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encodedLen1	TokenNameIdentifier	 encoded Len1
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
encoded2	TokenNameIdentifier	 encoded2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encodedLen2	TokenNameIdentifier	 encoded Len2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encodedComparison	TokenNameIdentifier	 encoded Comparison
=	TokenNameEQUAL	
encodedComparison	TokenNameIdentifier	 encoded Comparison
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
encodedComparison	TokenNameIdentifier	 encoded Comparison
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Test #"	TokenNameStringLiteral	Test #
+	TokenNamePLUS	
(	TokenNameLPAREN	
testNum	TokenNameIdentifier	 test Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": Original bytes and encoded chars compare differently:"	TokenNameStringLiteral	: Original bytes and encoded chars compare differently:
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" binary 1: "	TokenNameStringLiteral	 binary 1: 
+	TokenNamePLUS	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
originalArray1	TokenNameIdentifier	 original Array1
,	TokenNameCOMMA	
numBytes1	TokenNameIdentifier	 num Bytes1
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" binary 2: "	TokenNameStringLiteral	 binary 2: 
+	TokenNamePLUS	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
original2	TokenNameIdentifier	 original2
,	TokenNameCOMMA	
numBytes2	TokenNameIdentifier	 num Bytes2
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"encoded 1: "	TokenNameStringLiteral	encoded 1: 
+	TokenNamePLUS	
charArrayDump	TokenNameIdentifier	 char Array Dump
(	TokenNameLPAREN	
encoded1	TokenNameIdentifier	 encoded1
,	TokenNameCOMMA	
encodedLen1	TokenNameIdentifier	 encoded Len1
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"encoded 2: "	TokenNameStringLiteral	encoded 2: 
+	TokenNamePLUS	
charArrayDump	TokenNameIdentifier	 char Array Dump
(	TokenNameLPAREN	
encoded2	TokenNameIdentifier	 encoded2
,	TokenNameCOMMA	
encodedLen2	TokenNameIdentifier	 encoded Len2
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
originalComparison	TokenNameIdentifier	 original Comparison
,	TokenNameCOMMA	
encodedComparison	TokenNameIdentifier	 encoded Comparison
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** @deprecated remove this test for Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this test for Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyInputNIO	TokenNameIdentifier	 test Empty Input NIO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
encoded	TokenNameIdentifier	 encoded
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decoded	TokenNameIdentifier	 decoded
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"decode() returned null"	TokenNameStringLiteral	decode() returned null
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"decoded empty input was not empty"	TokenNameStringLiteral	decoded empty input was not empty
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyInput	TokenNameIdentifier	 test Empty Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedLen	TokenNameIdentifier	 encoded Len
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoded	TokenNameIdentifier	 encoded
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
encodedLen	TokenNameIdentifier	 encoded Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
decodedLen	TokenNameIdentifier	 decoded Len
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decoded	TokenNameIdentifier	 decoded
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
decodedLen	TokenNameIdentifier	 decoded Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"decoded empty input was not empty"	TokenNameStringLiteral	decoded empty input was not empty
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated remove this test for Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this test for Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testAllNullInputNIO	TokenNameIdentifier	 test All Null Input NIO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
binaryBuf	TokenNameIdentifier	 binary Buf
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
encoded	TokenNameIdentifier	 encoded
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
binaryBuf	TokenNameIdentifier	 binary Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"encode() returned null"	TokenNameStringLiteral	encode() returned null
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decodedBuf	TokenNameIdentifier	 decoded Buf
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"decode() returned null"	TokenNameStringLiteral	decode() returned null
,	TokenNameCOMMA	
decodedBuf	TokenNameIdentifier	 decoded Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Round trip decode/decode returned different results:"	TokenNameStringLiteral	Round trip decode/decode returned different results:
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" original: "	TokenNameStringLiteral	 original: 
+	TokenNamePLUS	
binaryDumpNIO	TokenNameIdentifier	 binary Dump NIO
(	TokenNameLPAREN	
binaryBuf	TokenNameIdentifier	 binary Buf
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"decodedBuf: "	TokenNameStringLiteral	decodedBuf: 
+	TokenNamePLUS	
binaryDumpNIO	TokenNameIdentifier	 binary Dump NIO
(	TokenNameLPAREN	
decodedBuf	TokenNameIdentifier	 decoded Buf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryBuf	TokenNameIdentifier	 binary Buf
,	TokenNameCOMMA	
decodedBuf	TokenNameIdentifier	 decoded Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAllNullInput	TokenNameIdentifier	 test All Null Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedLen	TokenNameIdentifier	 encoded Len
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
encoded	TokenNameIdentifier	 encoded
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
encodedLen	TokenNameIdentifier	 encoded Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
decodedLen	TokenNameIdentifier	 decoded Len
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decoded	TokenNameIdentifier	 decoded
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
decodedLen	TokenNameIdentifier	 decoded Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Round trip decode/decode returned different results:"	TokenNameStringLiteral	Round trip decode/decode returned different results:
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" original: "	TokenNameStringLiteral	 original: 
+	TokenNamePLUS	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"decodedBuf: "	TokenNameStringLiteral	decodedBuf: 
+	TokenNamePLUS	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
binary	TokenNameIdentifier	 binary
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated remove this test for Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this test for Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testRandomBinaryRoundTripNIO	TokenNameIdentifier	 test Random Binary Round Trip NIO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
binaryBuf	TokenNameIdentifier	 binary Buf
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoded	TokenNameIdentifier	 encoded
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
binaryBuf	TokenNameIdentifier	 binary Buf
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
encodedBuf	TokenNameIdentifier	 encoded Buf
=	TokenNameEQUAL	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decoded	TokenNameIdentifier	 decoded
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decodedBuf	TokenNameIdentifier	 decoded Buf
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
testNum	TokenNameIdentifier	 test Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
testNum	TokenNameIdentifier	 test Num
<	TokenNameLESS	
NUM_RANDOM_TESTS	TokenNameIdentifier	 NUM  RANDOM  TESTS
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
testNum	TokenNameIdentifier	 test Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Min == 1 	TokenNameCOMMENT_LINE	Min == 1 
binaryBuf	TokenNameIdentifier	 binary Buf
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteNum	TokenNameIdentifier	 byte Num
<	TokenNameLESS	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
byteNum	TokenNameIdentifier	 byte Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
binary	TokenNameIdentifier	 binary
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
binaryBuf	TokenNameIdentifier	 binary Buf
,	TokenNameCOMMA	
encodedBuf	TokenNameIdentifier	 encoded Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
encodedBuf	TokenNameIdentifier	 encoded Buf
,	TokenNameCOMMA	
decodedBuf	TokenNameIdentifier	 decoded Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Test #"	TokenNameStringLiteral	Test #
+	TokenNamePLUS	
(	TokenNameLPAREN	
testNum	TokenNameIdentifier	 test Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": Round trip decode/decode returned different results:"	TokenNameStringLiteral	: Round trip decode/decode returned different results:
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" original: "	TokenNameStringLiteral	 original: 
+	TokenNamePLUS	
binaryDumpNIO	TokenNameIdentifier	 binary Dump NIO
(	TokenNameLPAREN	
binaryBuf	TokenNameIdentifier	 binary Buf
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"encodedBuf: "	TokenNameStringLiteral	encodedBuf: 
+	TokenNamePLUS	
charArrayDumpNIO	TokenNameIdentifier	 char Array Dump NIO
(	TokenNameLPAREN	
encodedBuf	TokenNameIdentifier	 encoded Buf
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"decodedBuf: "	TokenNameStringLiteral	decodedBuf: 
+	TokenNamePLUS	
binaryDumpNIO	TokenNameIdentifier	 binary Dump NIO
(	TokenNameLPAREN	
decodedBuf	TokenNameIdentifier	 decoded Buf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryBuf	TokenNameIdentifier	 binary Buf
,	TokenNameCOMMA	
decodedBuf	TokenNameIdentifier	 decoded Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRandomBinaryRoundTrip	TokenNameIdentifier	 test Random Binary Round Trip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoded	TokenNameIdentifier	 encoded
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decoded	TokenNameIdentifier	 decoded
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
testNum	TokenNameIdentifier	 test Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
testNum	TokenNameIdentifier	 test Num
<	TokenNameLESS	
NUM_RANDOM_TESTS	TokenNameIdentifier	 NUM  RANDOM  TESTS
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
testNum	TokenNameIdentifier	 test Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
MAX_RANDOM_BINARY_LENGTH	TokenNameIdentifier	 MAX  RANDOM  BINARY  LENGTH
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Min == 1 	TokenNameCOMMENT_LINE	Min == 1 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteNum	TokenNameIdentifier	 byte Num
<	TokenNameLESS	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
byteNum	TokenNameIdentifier	 byte Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
binary	TokenNameIdentifier	 binary
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
encodedLen	TokenNameIdentifier	 encoded Len
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
encodedLen	TokenNameIdentifier	 encoded Len
)	TokenNameRPAREN	
encoded	TokenNameIdentifier	 encoded
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
encodedLen	TokenNameIdentifier	 encoded Len
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encodedLen	TokenNameIdentifier	 encoded Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
decodedLen	TokenNameIdentifier	 decoded Len
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encodedLen	TokenNameIdentifier	 encoded Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encodedLen	TokenNameIdentifier	 encoded Len
,	TokenNameCOMMA	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decodedLen	TokenNameIdentifier	 decoded Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Test #"	TokenNameStringLiteral	Test #
+	TokenNamePLUS	
(	TokenNameLPAREN	
testNum	TokenNameIdentifier	 test Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": Round trip decode/decode returned different results:"	TokenNameStringLiteral	: Round trip decode/decode returned different results:
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
" original: "	TokenNameStringLiteral	 original: 
+	TokenNamePLUS	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"encodedBuf: "	TokenNameStringLiteral	encodedBuf: 
+	TokenNamePLUS	
charArrayDump	TokenNameIdentifier	 char Array Dump
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
encodedLen	TokenNameIdentifier	 encoded Len
)	TokenNameRPAREN	
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"decodedBuf: "	TokenNameStringLiteral	decodedBuf: 
+	TokenNamePLUS	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
decodedLen	TokenNameIdentifier	 decoded Len
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
,	TokenNameCOMMA	
decodedLen	TokenNameIdentifier	 decoded Len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** @deprecated remove this method for Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this method for Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
String	TokenNameIdentifier	 String
binaryDumpNIO	TokenNameIdentifier	 binary Dump NIO
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
binaryBuf	TokenNameIdentifier	 binary Buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
binaryBuf	TokenNameIdentifier	 binary Buf
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
binaryBuf	TokenNameIdentifier	 binary Buf
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
binaryBuf	TokenNameIdentifier	 binary Buf
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
binaryDump	TokenNameIdentifier	 binary Dump
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
,	TokenNameCOMMA	
int	TokenNameint	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteNum	TokenNameIdentifier	 byte Num
<	TokenNameLESS	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
byteNum	TokenNameIdentifier	 byte Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
hex	TokenNameIdentifier	 hex
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
binary	TokenNameIdentifier	 binary
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hex	TokenNameIdentifier	 hex
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hex	TokenNameIdentifier	 hex
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
byteNum	TokenNameIdentifier	 byte Num
<	TokenNameLESS	
numBytes	TokenNameIdentifier	 num Bytes
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated remove this method for Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this method for Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
String	TokenNameIdentifier	 String
charArrayDumpNIO	TokenNameIdentifier	 char Array Dump NIO
(	TokenNameLPAREN	
CharBuffer	TokenNameIdentifier	 Char Buffer
charBuf	TokenNameIdentifier	 char Buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charArrayDump	TokenNameIdentifier	 char Array Dump
(	TokenNameLPAREN	
charBuf	TokenNameIdentifier	 char Buf
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
charBuf	TokenNameIdentifier	 char Buf
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
charBuf	TokenNameIdentifier	 char Buf
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
charArrayDump	TokenNameIdentifier	 char Array Dump
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
int	TokenNameint	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
charNum	TokenNameIdentifier	 char Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
charNum	TokenNameIdentifier	 char Num
<	TokenNameLESS	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
charNum	TokenNameIdentifier	 char Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
hex	TokenNameIdentifier	 hex
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
charNum	TokenNameIdentifier	 char Num
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
digit	TokenNameIdentifier	 digit
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
hex	TokenNameIdentifier	 hex
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
digit	TokenNameIdentifier	 digit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hex	TokenNameIdentifier	 hex
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charNum	TokenNameIdentifier	 char Num
<	TokenNameLESS	
numBytes	TokenNameIdentifier	 num Bytes
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
