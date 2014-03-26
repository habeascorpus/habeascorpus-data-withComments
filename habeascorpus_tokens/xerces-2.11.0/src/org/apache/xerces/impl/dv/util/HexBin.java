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
/** * format validation * * This class encodes/decodes hexadecimal data * * @xerces.internal * * @author Jeffrey Rodriguez * @version $Id: HexBin.java 446747 2006-09-15 21:46:20Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 format validation * This class encodes/decodes hexadecimal data * @xerces.internal * @author Jeffrey Rodriguez @version $Id: HexBin.java 446747 2006-09-15 21:46:20Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
HexBin	TokenNameIdentifier	 Hex Bin
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
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hexNumberTable	TokenNameIdentifier	 hex Number Table
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
lookUpHexAlphabet	TokenNameIdentifier	 look Up Hex Alphabet
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hexNumberTable	TokenNameIdentifier	 hex Number Table
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
hexNumberTable	TokenNameIdentifier	 hex Number Table
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
'F'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hexNumberTable	TokenNameIdentifier	 hex Number Table
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
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hexNumberTable	TokenNameIdentifier	 hex Number Table
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
10	TokenNameIntegerLiteral	
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lookUpHexAlphabet	TokenNameIdentifier	 look Up Hex Alphabet
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
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lookUpHexAlphabet	TokenNameIdentifier	 look Up Hex Alphabet
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
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Encode a byte array to hex string * * @param binaryData array of byte to encode * @return return encoded string */	TokenNameCOMMENT_JAVADOC	 Encode a byte array to hex string * @param binaryData array of byte to encode @return return encoded string 
static	TokenNamestatic	
public	TokenNamepublic	
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
lengthData	TokenNameIdentifier	 length Data
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
lengthEncode	TokenNameIdentifier	 length Encode
=	TokenNameEQUAL	
lengthData	TokenNameIdentifier	 length Data
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encodedData	TokenNameIdentifier	 encoded Data
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
lengthEncode	TokenNameIdentifier	 length Encode
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
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
lengthData	TokenNameIdentifier	 length Data
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
temp	TokenNameIdentifier	 temp
+=	TokenNamePLUS_EQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpHexAlphabet	TokenNameIdentifier	 look Up Hex Alphabet
[	TokenNameLBRACKET	
temp	TokenNameIdentifier	 temp
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodedData	TokenNameIdentifier	 encoded Data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookUpHexAlphabet	TokenNameIdentifier	 look Up Hex Alphabet
[	TokenNameLBRACKET	
temp	TokenNameIdentifier	 temp
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
/** * Decode hex string to a byte array * * @param encoded encoded string * @return return array of byte to encode */	TokenNameCOMMENT_JAVADOC	 Decode hex string to a byte array * @param encoded encoded string @return return array of byte to encode 
static	TokenNamestatic	
public	TokenNamepublic	
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
int	TokenNameint	
lengthData	TokenNameIdentifier	 length Data
=	TokenNameEQUAL	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthData	TokenNameIdentifier	 length Data
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binaryData	TokenNameIdentifier	 binary Data
=	TokenNameEQUAL	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lengthDecode	TokenNameIdentifier	 length Decode
=	TokenNameEQUAL	
lengthData	TokenNameIdentifier	 length Data
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decodedData	TokenNameIdentifier	 decoded Data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
lengthDecode	TokenNameIdentifier	 length Decode
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
temp1	TokenNameIdentifier	 temp1
,	TokenNameCOMMA	
temp2	TokenNameIdentifier	 temp2
;	TokenNameSEMICOLON	
char	TokenNamechar	
tempChar	TokenNameIdentifier	 temp Char
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
lengthDecode	TokenNameIdentifier	 length Decode
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempChar	TokenNameIdentifier	 temp Char
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
temp1	TokenNameIdentifier	 temp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tempChar	TokenNameIdentifier	 temp Char
<	TokenNameLESS	
BASELENGTH	TokenNameIdentifier	 BASELENGTH
)	TokenNameRPAREN	
?	TokenNameQUESTION	
hexNumberTable	TokenNameIdentifier	 hex Number Table
[	TokenNameLBRACKET	
tempChar	TokenNameIdentifier	 temp Char
]	TokenNameRBRACKET	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp1	TokenNameIdentifier	 temp1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
tempChar	TokenNameIdentifier	 temp Char
=	TokenNameEQUAL	
binaryData	TokenNameIdentifier	 binary Data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
temp2	TokenNameIdentifier	 temp2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tempChar	TokenNameIdentifier	 temp Char
<	TokenNameLESS	
BASELENGTH	TokenNameIdentifier	 BASELENGTH
)	TokenNameRPAREN	
?	TokenNameQUESTION	
hexNumberTable	TokenNameIdentifier	 hex Number Table
[	TokenNameLBRACKET	
tempChar	TokenNameIdentifier	 temp Char
]	TokenNameRBRACKET	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp2	TokenNameIdentifier	 temp2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
decodedData	TokenNameIdentifier	 decoded Data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
temp1	TokenNameIdentifier	 temp1
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
temp2	TokenNameIdentifier	 temp2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
decodedData	TokenNameIdentifier	 decoded Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
