/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XResources_ja_JP_I.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XResources_ja_JP_I.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// LangResources_en.properties 	TokenNameCOMMENT_LINE	LangResources_en.properties 
// 	TokenNameCOMMENT_LINE	 
/** * The Japanese (Katakana) resource bundle. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 The Japanese (Katakana) resource bundle. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
XResources_ja_JP_I	TokenNameIdentifier	 X Resources ja  JP  I
extends	TokenNameextends	
XResourceBundle	TokenNameIdentifier	 X Resource Bundle
{	TokenNameLBRACE	
/** * Get the association table for this resource. * * * @return the association table for this resource. */	TokenNameCOMMENT_JAVADOC	 Get the association table for this resource. * @return the association table for this resource. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getContents	TokenNameIdentifier	 get Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"ui_language"	TokenNameStringLiteral	ui_language
,	TokenNameCOMMA	
"ja"	TokenNameStringLiteral	ja
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"ja"	TokenNameStringLiteral	ja
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"ja"	TokenNameStringLiteral	ja
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"alphabet"	TokenNameStringLiteral	alphabet
,	TokenNameCOMMA	
new	TokenNamenew	
CharArrayWrapper	TokenNameIdentifier	 Char Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x30a4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30ed	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30cf	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30cb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30db	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30d8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30c8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30c1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30ea	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30cc	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30eb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30f2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30ef	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30ab	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30e8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30bf	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30ec	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30bd	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30c4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30cd	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30ca	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30e9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30e0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30a6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30f0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30ce	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30aa	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30af	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30e4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30de	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30b1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30d5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30b3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30a8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30c6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30a2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30b5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30ad	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30e6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30e1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30df	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30b7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30f1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30d2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30e2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30bb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30b9	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"tradAlphabet"	TokenNameStringLiteral	tradAlphabet
,	TokenNameCOMMA	
new	TokenNamenew	
CharArrayWrapper	TokenNameIdentifier	 Char Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
'Y'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'Z'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//language orientation 	TokenNameCOMMENT_LINE	language orientation 
{	TokenNameLBRACE	
"orientation"	TokenNameStringLiteral	orientation
,	TokenNameCOMMA	
"LeftToRight"	TokenNameStringLiteral	LeftToRight
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//language numbering 	TokenNameCOMMENT_LINE	language numbering 
{	TokenNameLBRACE	
"numbering"	TokenNameStringLiteral	numbering
,	TokenNameCOMMA	
"multiplicative-additive"	TokenNameStringLiteral	multiplicative-additive
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"multiplierOrder"	TokenNameStringLiteral	multiplierOrder
,	TokenNameCOMMA	
"follows"	TokenNameStringLiteral	follows
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// largest numerical value 	TokenNameCOMMENT_LINE	largest numerical value 
//{"MaxNumericalValue", new Integer(10000000000)}, 	TokenNameCOMMENT_LINE	{"MaxNumericalValue", new Integer(10000000000)}, 
//These would not be used for EN. Only used for traditional numbering 	TokenNameCOMMENT_LINE	These would not be used for EN. Only used for traditional numbering 
{	TokenNameLBRACE	
"numberGroups"	TokenNameStringLiteral	numberGroups
,	TokenNameCOMMA	
new	TokenNamenew	
IntArrayWrapper	TokenNameIdentifier	 Int Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//These only used for mutiplicative-additive numbering 	TokenNameCOMMENT_LINE	These only used for mutiplicative-additive numbering 
// Note that we are using longs and that the last two 	TokenNameCOMMENT_LINE	Note that we are using longs and that the last two 
// multipliers are not supported. This is a known limitation. 	TokenNameCOMMENT_LINE	multipliers are not supported. This is a known limitation. 
{	TokenNameLBRACE	
"multiplier"	TokenNameStringLiteral	multiplier
,	TokenNameCOMMA	
new	TokenNamenew	
LongArrayWrapper	TokenNameIdentifier	 Long Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
100000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"multiplierChar"	TokenNameStringLiteral	multiplierChar
,	TokenNameCOMMA	
new	TokenNamenew	
CharArrayWrapper	TokenNameIdentifier	 Char Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x4EAC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5146	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4E07	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5343	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x767e	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5341	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// chinese only?? 	TokenNameCOMMENT_LINE	chinese only?? 
{	TokenNameLBRACE	
"zero"	TokenNameStringLiteral	zero
,	TokenNameCOMMA	
new	TokenNamenew	
CharArrayWrapper	TokenNameIdentifier	 Char Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"digits"	TokenNameStringLiteral	digits
,	TokenNameCOMMA	
new	TokenNamenew	
CharArrayWrapper	TokenNameIdentifier	 Char Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x4E00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4E8C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4E09	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x56DB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4E94	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x516D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4E03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x516B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4E5D	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"tables"	TokenNameStringLiteral	tables
,	TokenNameCOMMA	
new	TokenNamenew	
StringArrayWrapper	TokenNameIdentifier	 String Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"digits"	TokenNameStringLiteral	digits
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
