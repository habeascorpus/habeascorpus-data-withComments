/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * BASE 64 encoding of a String or an array of bytes. * * Based on RFC 1421. * **/	TokenNameCOMMENT_JAVADOC	 BASE 64 encoding of a String or an array of bytes. * Based on RFC 1421. *
public	TokenNamepublic	
class	TokenNameclass	
Base64Converter	TokenNameIdentifier	 Base64 Converter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE	TokenNameIdentifier	 BYTE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WORD	TokenNameIdentifier	 WORD
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_0_MASK	TokenNameIdentifier	 POS 0  MASK
=	TokenNameEQUAL	
0x0000003F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_1_MASK	TokenNameIdentifier	 POS 1  MASK
=	TokenNameEQUAL	
0x00000FC0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_1_SHIFT	TokenNameIdentifier	 POS 1  SHIFT
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_2_MASK	TokenNameIdentifier	 POS 2  MASK
=	TokenNameEQUAL	
0x0003F000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_2_SHIFT	TokenNameIdentifier	 POS 2  SHIFT
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_3_MASK	TokenNameIdentifier	 POS 3  MASK
=	TokenNameEQUAL	
0x00FC0000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POS_3_SHIFT	TokenNameIdentifier	 POS 3  SHIFT
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ALPHABET	TokenNameIdentifier	 ALPHABET
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'A'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'B'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'C'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'D'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'E'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'F'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'G'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'H'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// 0 to 7 	TokenNameCOMMENT_LINE	0 to 7 
'I'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'J'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'K'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'L'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'M'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'N'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'O'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'P'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// 8 to 15 	TokenNameCOMMENT_LINE	8 to 15 
'Q'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'R'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'S'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'T'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'U'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'V'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'W'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'X'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// 16 to 23 	TokenNameCOMMENT_LINE	16 to 23 
'Y'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'Z'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'b'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'd'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'f'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// 24 to 31 	TokenNameCOMMENT_LINE	24 to 31 
'g'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'h'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'j'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'k'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'l'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'm'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// 32 to 39 	TokenNameCOMMENT_LINE	32 to 39 
'o'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'p'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'q'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'u'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'v'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// 40 to 47 	TokenNameCOMMENT_LINE	40 to 47 
'w'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'x'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'y'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'z'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'1'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'2'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'3'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// 48 to 55 	TokenNameCOMMENT_LINE	48 to 55 
'4'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'5'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'6'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'7'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'8'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'9'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'+'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 56 to 63 	TokenNameCOMMENT_LINE	56 to 63 
// CheckStyle:ConstantNameCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:ConstantNameCheck OFF - bc 
/** Provided for BC purposes */	TokenNameCOMMENT_JAVADOC	 Provided for BC purposes 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
alphabet	TokenNameIdentifier	 alphabet
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
;	TokenNameSEMICOLON	
// CheckStyle:ConstantNameCheck ON 	TokenNameCOMMENT_LINE	CheckStyle:ConstantNameCheck ON 
/** * Encode a string into base64 encoding. * @param s the string to encode. * @return the encoded string. */	TokenNameCOMMENT_JAVADOC	 Encode a string into base64 encoding. @param s the string to encode. @return the encoded string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Encode a byte array into base64 encoding. * @param octetString the byte array to encode. * @return the encoded string. */	TokenNameCOMMENT_JAVADOC	 Encode a byte array into base64 encoding. @param octetString the byte array to encode. @return the encoded string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
octetString	TokenNameIdentifier	 octet String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bits24	TokenNameIdentifier	 bits24
;	TokenNameSEMICOLON	
int	TokenNameint	
bits6	TokenNameIdentifier	 bits6
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
octetString	TokenNameIdentifier	 octet String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
int	TokenNameint	
outIndex	TokenNameIdentifier	 out Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
octetString	TokenNameIdentifier	 octet String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
// store the octets 	TokenNameCOMMENT_LINE	store the octets 
bits24	TokenNameIdentifier	 bits24
=	TokenNameEQUAL	
(	TokenNameLPAREN	
octetString	TokenNameIdentifier	 octet String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
bits24	TokenNameIdentifier	 bits24
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
octetString	TokenNameIdentifier	 octet String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
BYTE	TokenNameIdentifier	 BYTE
;	TokenNameSEMICOLON	
bits24	TokenNameIdentifier	 bits24
|=	TokenNameOR_EQUAL	
octetString	TokenNameIdentifier	 octet String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits6	TokenNameIdentifier	 bits6
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits24	TokenNameIdentifier	 bits24
&	TokenNameAND	
POS_3_MASK	TokenNameIdentifier	 POS 3  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
POS_3_SHIFT	TokenNameIdentifier	 POS 3  SHIFT
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
[	TokenNameLBRACKET	
bits6	TokenNameIdentifier	 bits6
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits6	TokenNameIdentifier	 bits6
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits24	TokenNameIdentifier	 bits24
&	TokenNameAND	
POS_2_MASK	TokenNameIdentifier	 POS 2  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
POS_2_SHIFT	TokenNameIdentifier	 POS 2  SHIFT
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
[	TokenNameLBRACKET	
bits6	TokenNameIdentifier	 bits6
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits6	TokenNameIdentifier	 bits6
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits24	TokenNameIdentifier	 bits24
&	TokenNameAND	
POS_1_MASK	TokenNameIdentifier	 POS 1  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
POS_1_SHIFT	TokenNameIdentifier	 POS 1  SHIFT
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
[	TokenNameLBRACKET	
bits6	TokenNameIdentifier	 bits6
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits6	TokenNameIdentifier	 bits6
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits24	TokenNameIdentifier	 bits24
&	TokenNameAND	
POS_0_MASK	TokenNameIdentifier	 POS 0  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
[	TokenNameLBRACKET	
bits6	TokenNameIdentifier	 bits6
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
octetString	TokenNameIdentifier	 octet String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// store the octets 	TokenNameCOMMENT_LINE	store the octets 
bits24	TokenNameIdentifier	 bits24
=	TokenNameEQUAL	
(	TokenNameLPAREN	
octetString	TokenNameIdentifier	 octet String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
bits24	TokenNameIdentifier	 bits24
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
octetString	TokenNameIdentifier	 octet String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
BYTE	TokenNameIdentifier	 BYTE
;	TokenNameSEMICOLON	
bits6	TokenNameIdentifier	 bits6
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits24	TokenNameIdentifier	 bits24
&	TokenNameAND	
POS_3_MASK	TokenNameIdentifier	 POS 3  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
POS_3_SHIFT	TokenNameIdentifier	 POS 3  SHIFT
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
[	TokenNameLBRACKET	
bits6	TokenNameIdentifier	 bits6
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits6	TokenNameIdentifier	 bits6
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits24	TokenNameIdentifier	 bits24
&	TokenNameAND	
POS_2_MASK	TokenNameIdentifier	 POS 2  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
POS_2_SHIFT	TokenNameIdentifier	 POS 2  SHIFT
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
[	TokenNameLBRACKET	
bits6	TokenNameIdentifier	 bits6
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits6	TokenNameIdentifier	 bits6
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits24	TokenNameIdentifier	 bits24
&	TokenNameAND	
POS_1_MASK	TokenNameIdentifier	 POS 1  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
POS_1_SHIFT	TokenNameIdentifier	 POS 1  SHIFT
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
[	TokenNameLBRACKET	
bits6	TokenNameIdentifier	 bits6
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// padding 	TokenNameCOMMENT_LINE	padding 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'='	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
octetString	TokenNameIdentifier	 octet String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// store the octets 	TokenNameCOMMENT_LINE	store the octets 
bits24	TokenNameIdentifier	 bits24
=	TokenNameEQUAL	
(	TokenNameLPAREN	
octetString	TokenNameIdentifier	 octet String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
WORD	TokenNameIdentifier	 WORD
;	TokenNameSEMICOLON	
bits6	TokenNameIdentifier	 bits6
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits24	TokenNameIdentifier	 bits24
&	TokenNameAND	
POS_3_MASK	TokenNameIdentifier	 POS 3  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
POS_3_SHIFT	TokenNameIdentifier	 POS 3  SHIFT
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
[	TokenNameLBRACKET	
bits6	TokenNameIdentifier	 bits6
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits6	TokenNameIdentifier	 bits6
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits24	TokenNameIdentifier	 bits24
&	TokenNameAND	
POS_2_MASK	TokenNameIdentifier	 POS 2  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
POS_2_SHIFT	TokenNameIdentifier	 POS 2  SHIFT
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALPHABET	TokenNameIdentifier	 ALPHABET
[	TokenNameLBRACKET	
bits6	TokenNameIdentifier	 bits6
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// padding 	TokenNameCOMMENT_LINE	padding 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'='	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'='	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
