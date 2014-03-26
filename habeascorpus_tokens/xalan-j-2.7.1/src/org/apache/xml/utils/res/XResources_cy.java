/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XResources_cy.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XResources_cy.java 468655 2006-10-28 07:12:06Z minchau $ 
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
/** * The Cyrillic resource bundle. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 The Cyrillic resource bundle. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
XResources_cy	TokenNameIdentifier	 X Resources cy
extends	TokenNameextends	
XResourceBundle	TokenNameIdentifier	 X Resource Bundle
{	TokenNameLBRACE	
/** * Get the association list. * * @return The association list. */	TokenNameCOMMENT_JAVADOC	 Get the association list. * @return The association list. 
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
"cy"	TokenNameStringLiteral	cy
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"cy"	TokenNameStringLiteral	cy
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"cy"	TokenNameStringLiteral	cy
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
0x0430	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0433	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0434	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0435	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0437	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0438	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0439	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04A9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0457	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x046F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0447	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0440	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0441	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0442	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0443	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0444	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0445	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0470	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0446	TokenNameIntegerLiteral	
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
//{"numbering", "additive"}, 	TokenNameCOMMENT_LINE	{"numbering", "additive"}, 
{	TokenNameLBRACE	
"numbering"	TokenNameStringLiteral	numbering
,	TokenNameCOMMA	
"multiplicative-additive"	TokenNameStringLiteral	multiplicative-additive
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"multiplierOrder"	TokenNameStringLiteral	multiplierOrder
,	TokenNameCOMMA	
"precedes"	TokenNameStringLiteral	precedes
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
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//These only used for mutiplicative-additive numbering 	TokenNameCOMMENT_LINE	These only used for mutiplicative-additive numbering 
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
1000	TokenNameIntegerLiteral	
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
0x03D9	TokenNameIntegerLiteral	
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
//{"digits", new char[]{'a','b','c','d','e','f','g','h','i'}}, 	TokenNameCOMMENT_LINE	{"digits", new char[]{'a','b','c','d','e','f','g','h','i'}}, 
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
0x0430	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0433	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0434	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0435	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0437	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0438	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0439	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04A9	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"tens"	TokenNameStringLiteral	tens
,	TokenNameCOMMA	
new	TokenNamenew	
CharArrayWrapper	TokenNameIdentifier	 Char Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0457	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x046F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x043F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0447	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"hundreds"	TokenNameStringLiteral	hundreds
,	TokenNameCOMMA	
new	TokenNamenew	
CharArrayWrapper	TokenNameIdentifier	 Char Array Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0440	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0441	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0442	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0443	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0444	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0445	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0470	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0446	TokenNameIntegerLiteral	
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
"hundreds"	TokenNameStringLiteral	hundreds
,	TokenNameCOMMA	
"tens"	TokenNameStringLiteral	tens
,	TokenNameCOMMA	
"digits"	TokenNameStringLiteral	digits
}	TokenNameRBRACE	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
