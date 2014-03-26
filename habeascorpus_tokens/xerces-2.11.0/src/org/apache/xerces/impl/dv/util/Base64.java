/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * This class provides encode/decode for RFC 2045 Base64 as * defined by RFC 2045, N. Freed and N. Borenstein. * RFC 2045: Multipurpose Internet Mail Extensions (MIME) * Part One: Format of Internet Message Bodies. Reference * 1996 Available at: http://www.ietf.org/rfc/rfc2045.txt * This class is used by XML Schema binary format validation * * This implementation does not encode/decode streaming * data. You need the data that you will encode/decode * already on a byte arrray. * * @xerces.internal * * @author Jeffrey Rodriguez * @author Sandy Gao * @version $Id: Base64.java 446747 2006-09-15 21:46:20Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class provides encode/decode for RFC 2045 Base64 as defined by RFC 2045, N. Freed and N. Borenstein. RFC 2045: Multipurpose Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies. Reference 1996 Available at: http://www.ietf.org/rfc/rfc2045.txt This class is used by XML Schema binary format validation * This implementation does not encode/decode streaming data. You need the data that you will encode/decode already on a byte arrray. * @xerces.internal * @author Jeffrey Rodriguez @author Sandy Gao @version $Id: Base64.java 446747 2006-09-15 21:46:20Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Base64	TokenNameIdentifier	 Base64
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
BASELENGTH	TokenNameIdentifier	 BASELENGTH
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
LOOKUPLENGTH	TokenNameIdentifier	 LOOKUPLENGTH
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
TWENTYFOURBITGROUP	TokenNameIdentifier	 TWENTYFOURBITGROUP
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
EIGHTBIT	TokenNameIdentifier	 EIGHTBIT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
SIXTEENBIT	TokenNameIdentifier	 SIXTEENBIT
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
SIXBIT	TokenNameIdentifier	 SIXBIT
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
FOURBYTE	TokenNameIdentifier	 FOURBYTE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
SIGN	TokenNameIdentifier	 SIGN
=	TokenNameEQUAL	
-	TokenNameMINUS	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
PAD	TokenNameIdentifier	 PAD
=	TokenNameEQUAL	
'='	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fDebug	TokenNameIdentifier	 f Debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BASELENGTH	TokenNameIdentifier	 BASELENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
LOOKUPLENGTH	TokenNameIdentifier	 LOOKUPLENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
BASELENGTH	TokenNameIdentifier	 BASELENGTH
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
'Z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
'z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
'a'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
26	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
52	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
'+'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
62	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
'/'	TokenNameCharacterLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
'A'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
51	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
61	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
62	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
'+'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
63	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
'/'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
char	TokenNamechar	
octect	TokenNameIdentifier	 octect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
octect	TokenNameIdentifier	 octect
==	TokenNameEQUAL_EQUAL	
0x20	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
octect	TokenNameIdentifier	 octect
==	TokenNameEQUAL_EQUAL	
0xd	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
octect	TokenNameIdentifier	 octect
==	TokenNameEQUAL_EQUAL	
0xa	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
octect	TokenNameIdentifier	 octect
==	TokenNameEQUAL_EQUAL	
0x9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
isPad	TokenNameIdentifier	 is Pad
(	TokenNameLPAREN	
char	TokenNamechar	
octect	TokenNameIdentifier	 octect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
octect	TokenNameIdentifier	 octect
==	TokenNameEQUAL_EQUAL	
PAD	TokenNameIdentifier	 PAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
char	TokenNamechar	
octect	TokenNameIdentifier	 octect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
octect	TokenNameIdentifier	 octect
<	TokenNameLESS	
BASELENGTH	TokenNameIdentifier	 BASELENGTH
&&	TokenNameAND_AND	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
octect	TokenNameIdentifier	 octect
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
isBase64	TokenNameIdentifier	 is Base64
(	TokenNameLPAREN	
char	TokenNamechar	
octect	TokenNameIdentifier	 octect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
octect	TokenNameIdentifier	 octect
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isPad	TokenNameIdentifier	 is Pad
(	TokenNameLPAREN	
octect	TokenNameIdentifier	 octect
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
octect	TokenNameIdentifier	 octect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Encodes hex octects into Base64 * * @param binaryData Array containing binaryData * @return Encoded Base64 array */	TokenNameCOMMENT_JAVADOC	 Encodes hex octects into Base64 * @param binaryData Array containing binaryData @return Encoded Base64 array 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binaryData	TokenNameIdentifier	 binary Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
binaryData	TokenNameIdentifier	 binary Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
lengthDataBits	TokenNameIdentifier	 length Data Bits
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
EIGHTBIT	TokenNameIdentifier	 EIGHTBIT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthDataBits	TokenNameIdentifier	 length Data Bits
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
fewerThan24bits	TokenNameIdentifier	 fewer Than24bits
=	TokenNameEQUAL	
lengthDataBits	TokenNameIdentifier	 length Data Bits
%	TokenNameREMAINDER	
TWENTYFOURBITGROUP	TokenNameIdentifier	 TWENTYFOURBITGROUP
;	TokenNameSEMICOLON	
int	TokenNameint	
numberTriplets	TokenNameIdentifier	 number Triplets
=	TokenNameEQUAL	
lengthDataBits	TokenNameIdentifier	 length Data Bits
/	TokenNameDIVIDE	
TWENTYFOURBITGROUP	TokenNameIdentifier	 TWENTYFOURBITGROUP
;	TokenNameSEMICOLON	
int	TokenNameint	
numberQuartet	TokenNameIdentifier	 number Quartet
=	TokenNameEQUAL	
fewerThan24bits	TokenNameIdentifier	 fewer Than24bits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
numberTriplets	TokenNameIdentifier	 number Triplets
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
numberTriplets	TokenNameIdentifier	 number Triplets
;	TokenNameSEMICOLON	
char	TokenNamechar	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
numberQuartet	TokenNameIdentifier	 number Quartet
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedIndex	TokenNameIdentifier	 encoded Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDebug	TokenNameIdentifier	 f Debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"number of triplets = "	TokenNameStringLiteral	number of triplets = 
+	TokenNamePLUS	
numberTriplets	TokenNameIdentifier	 number Triplets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numberTriplets	TokenNameIdentifier	 number Triplets
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDebug	TokenNameIdentifier	 f Debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"b1= "	TokenNameStringLiteral	b1= 
+	TokenNamePLUS	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
", b2= "	TokenNameStringLiteral	, b2= 
+	TokenNamePLUS	
b2	TokenNameIdentifier	 b2
+	TokenNamePLUS	
", b3= "	TokenNameStringLiteral	, b3= 
+	TokenNamePLUS	
b3	TokenNameIdentifier	 b3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x03	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val1	TokenNameIdentifier	 val1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
SIGN	TokenNameIdentifier	 SIGN
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
^	TokenNameXOR	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
SIGN	TokenNameIdentifier	 SIGN
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
^	TokenNameXOR	
0xf0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val3	TokenNameIdentifier	 val3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
&	TokenNameAND	
SIGN	TokenNameIdentifier	 SIGN
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
^	TokenNameXOR	
0xfc	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDebug	TokenNameIdentifier	 f Debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"val2 = "	TokenNameStringLiteral	val2 = 
+	TokenNamePLUS	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"k4 = "	TokenNameStringLiteral	k4 = 
+	TokenNamePLUS	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"vak = "	TokenNameStringLiteral	vak = 
+	TokenNamePLUS	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
|	TokenNameOR	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
val1	TokenNameIdentifier	 val1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
val2	TokenNameIdentifier	 val2
|	TokenNameOR	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
val3	TokenNameIdentifier	 val3
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
b3	TokenNameIdentifier	 b3
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// form integral number of 6-bit groups 	TokenNameCOMMENT_LINE	form integral number of 6-bit groups 
if	TokenNameif	
(	TokenNameLPAREN	
fewerThan24bits	TokenNameIdentifier	 fewer Than24bits
==	TokenNameEQUAL_EQUAL	
EIGHTBIT	TokenNameIdentifier	 EIGHTBIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x03	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDebug	TokenNameIdentifier	 f Debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"b1="	TokenNameStringLiteral	b1=
+	TokenNamePLUS	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"b1<<2 = "	TokenNameStringLiteral	b1<<2 = 
+	TokenNamePLUS	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
val1	TokenNameIdentifier	 val1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
SIGN	TokenNameIdentifier	 SIGN
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
^	TokenNameXOR	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
val1	TokenNameIdentifier	 val1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
PAD	TokenNameIdentifier	 PAD
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
PAD	TokenNameIdentifier	 PAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fewerThan24bits	TokenNameIdentifier	 fewer Than24bits
==	TokenNameEQUAL_EQUAL	
SIXTEENBIT	TokenNameIdentifier	 SIXTEENBIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
0x03	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val1	TokenNameIdentifier	 val1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
&	TokenNameAND	
SIGN	TokenNameIdentifier	 SIGN
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
^	TokenNameXOR	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
SIGN	TokenNameIdentifier	 SIGN
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
^	TokenNameXOR	
0xf0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
val1	TokenNameIdentifier	 val1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
val2	TokenNameIdentifier	 val2
|	TokenNameOR	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpBase64Alphabet	TokenNameIdentifier	 look Up Base64 Alphabet
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
PAD	TokenNameIdentifier	 PAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
encodedData	TokenNameIdentifier	 encoded Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decodes Base64 data into octects * * @param encoded string containing Base64 data * @return Array containind decoded data. */	TokenNameCOMMENT_JAVADOC	 Decodes Base64 data into octects * @param encoded string containing Base64 data @return Array containind decoded data. 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoded	TokenNameIdentifier	 encoded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
base64Data	TokenNameIdentifier	 base64 Data
=	TokenNameEQUAL	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove white spaces 	TokenNameCOMMENT_LINE	remove white spaces 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
removeWhiteSpace	TokenNameIdentifier	 remove White Space
(	TokenNameLPAREN	
base64Data	TokenNameIdentifier	 base64 Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
%	TokenNameREMAINDER	
FOURBYTE	TokenNameIdentifier	 FOURBYTE
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//should be divisible by four 	TokenNameCOMMENT_LINE	should be divisible by four 
}	TokenNameRBRACE	
int	TokenNameint	
numberQuadruple	TokenNameIdentifier	 number Quadruple
=	TokenNameEQUAL	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
/	TokenNameDIVIDE	
FOURBYTE	TokenNameIdentifier	 FOURBYTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numberQuadruple	TokenNameIdentifier	 number Quadruple
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
decodedData	TokenNameIdentifier	 decoded Data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b4	TokenNameIdentifier	 b4
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
d2	TokenNameIdentifier	 d2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
d3	TokenNameIdentifier	 d3
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
d4	TokenNameIdentifier	 d4
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedIndex	TokenNameIdentifier	 encoded Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
decodedData	TokenNameIdentifier	 decoded Data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
numberQuadruple	TokenNameIdentifier	 number Quadruple
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numberQuadruple	TokenNameIdentifier	 number Quadruple
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
base64Data	TokenNameIdentifier	 base64 Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d2	TokenNameIdentifier	 d2
=	TokenNameEQUAL	
base64Data	TokenNameIdentifier	 base64 Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d3	TokenNameIdentifier	 d3
=	TokenNameEQUAL	
base64Data	TokenNameIdentifier	 base64 Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d4	TokenNameIdentifier	 d4
=	TokenNameEQUAL	
base64Data	TokenNameIdentifier	 base64 Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//if found "no data" just return null 	TokenNameCOMMENT_LINE	if found "no data" just return null 
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
d1	TokenNameIdentifier	 d1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
d2	TokenNameIdentifier	 d2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
d3	TokenNameIdentifier	 d3
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b4	TokenNameIdentifier	 b4
=	TokenNameEQUAL	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
d4	TokenNameIdentifier	 d4
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
decodedData	TokenNameIdentifier	 decoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
|	TokenNameOR	
b2	TokenNameIdentifier	 b2
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decodedData	TokenNameIdentifier	 decoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decodedData	TokenNameIdentifier	 decoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
|	TokenNameOR	
b4	TokenNameIdentifier	 b4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
base64Data	TokenNameIdentifier	 base64 Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d2	TokenNameIdentifier	 d2
=	TokenNameEQUAL	
base64Data	TokenNameIdentifier	 base64 Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//if found "no data" just return null 	TokenNameCOMMENT_LINE	if found "no data" just return null 
}	TokenNameRBRACE	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
d1	TokenNameIdentifier	 d1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
d2	TokenNameIdentifier	 d2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
d3	TokenNameIdentifier	 d3
=	TokenNameEQUAL	
base64Data	TokenNameIdentifier	 base64 Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
d4	TokenNameIdentifier	 d4
=	TokenNameEQUAL	
base64Data	TokenNameIdentifier	 base64 Data
[	TokenNameLBRACKET	
dataIndex	TokenNameIdentifier	 data Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d3	TokenNameIdentifier	 d3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isData	TokenNameIdentifier	 is Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d4	TokenNameIdentifier	 d4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Check if they are PAD characters 	TokenNameCOMMENT_LINE	Check if they are PAD characters 
if	TokenNameif	
(	TokenNameLPAREN	
isPad	TokenNameIdentifier	 is Pad
(	TokenNameLPAREN	
d3	TokenNameIdentifier	 d3
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isPad	TokenNameIdentifier	 is Pad
(	TokenNameLPAREN	
d4	TokenNameIdentifier	 d4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Two PAD e.g. 3c[Pad][Pad] 	TokenNameCOMMENT_LINE	Two PAD e.g. 3c[Pad][Pad] 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
//last 4 bits should be zero 	TokenNameCOMMENT_LINE	last 4 bits should be zero 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
decodedData	TokenNameIdentifier	 decoded Data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
|	TokenNameOR	
b2	TokenNameIdentifier	 b2
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isPad	TokenNameIdentifier	 is Pad
(	TokenNameLPAREN	
d3	TokenNameIdentifier	 d3
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isPad	TokenNameIdentifier	 is Pad
(	TokenNameLPAREN	
d4	TokenNameIdentifier	 d4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//One PAD e.g. 3cQ[Pad] 	TokenNameCOMMENT_LINE	One PAD e.g. 3cQ[Pad] 
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
d3	TokenNameIdentifier	 d3
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
&	TokenNameAND	
0x3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
//last 2 bits should be zero 	TokenNameCOMMENT_LINE	last 2 bits should be zero 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
decodedData	TokenNameIdentifier	 decoded Data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
|	TokenNameOR	
b2	TokenNameIdentifier	 b2
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//an error like "3c[Pad]r", "3cdX", "3cXd", "3cXX" where X is non data 	TokenNameCOMMENT_LINE	an error like "3c[Pad]r", "3cdX", "3cXd", "3cXX" where X is non data 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//No PAD e.g 3cQl 	TokenNameCOMMENT_LINE	No PAD e.g 3cQl 
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
d3	TokenNameIdentifier	 d3
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b4	TokenNameIdentifier	 b4
=	TokenNameEQUAL	
base64Alphabet	TokenNameIdentifier	 base64 Alphabet
[	TokenNameLBRACKET	
d4	TokenNameIdentifier	 d4
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
decodedData	TokenNameIdentifier	 decoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
|	TokenNameOR	
b2	TokenNameIdentifier	 b2
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decodedData	TokenNameIdentifier	 decoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decodedData	TokenNameIdentifier	 decoded Data
[	TokenNameLBRACKET	
encodedIndex	TokenNameIdentifier	 encoded Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
|	TokenNameOR	
b4	TokenNameIdentifier	 b4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
decodedData	TokenNameIdentifier	 decoded Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * remove WhiteSpace from MIME containing encoded Base64 data. * * @param data the byte array of base64 data (with WS) * @return the new length */	TokenNameCOMMENT_JAVADOC	 remove WhiteSpace from MIME containing encoded Base64 data. * @param data the byte array of base64 data (with WS) @return the new length 
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
removeWhiteSpace	TokenNameIdentifier	 remove White Space
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// count characters that's not whitespace 	TokenNameCOMMENT_LINE	count characters that's not whitespace 
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
