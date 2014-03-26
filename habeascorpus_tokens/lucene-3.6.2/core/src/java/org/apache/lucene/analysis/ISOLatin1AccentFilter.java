package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
;	TokenNameSEMICOLON	
/** * A filter that replaces accented characters in the ISO Latin 1 character set * (ISO-8859-1) by their unaccented equivalent. The case will not be altered. * <p> * For instance, '&agrave;' will be replaced by 'a'. * <p> * * @deprecated If you build a new index, use {@link ASCIIFoldingFilter} * which covers a superset of Latin 1. * This class is included for use with existing * indexes and will be removed in a future release (possibly Lucene 4.0). */	TokenNameCOMMENT_JAVADOC	 A filter that replaces accented characters in the ISO Latin 1 character set (ISO-8859-1) by their unaccented equivalent. The case will not be altered. <p> For instance, '&agrave;' will be replaced by 'a'. <p> * @deprecated If you build a new index, use {@link ASCIIFoldingFilter} which covers a superset of Latin 1. This class is included for use with existing indexes and will be removed in a future release (possibly Lucene 4.0). 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ISOLatin1AccentFilter	TokenNameIdentifier	 ISO Latin1 Accent Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
ISOLatin1AccentFilter	TokenNameIdentifier	 ISO Latin1 Accent Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
outputPos	TokenNameIdentifier	 output Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no characters actually require rewriting then we 	TokenNameCOMMENT_LINE	If no characters actually require rewriting then we 
// just return token as-is: 	TokenNameCOMMENT_LINE	just return token as-is: 
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
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'�'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeAccents	TokenNameIdentifier	 remove Accents
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
outputPos	TokenNameIdentifier	 output Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To replace accented characters in a String by unaccented equivalents. */	TokenNameCOMMENT_JAVADOC	 To replace accented characters in a String by unaccented equivalents. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
removeAccents	TokenNameIdentifier	 remove Accents
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Worst-case length required: 	TokenNameCOMMENT_LINE	Worst-case length required: 
final	TokenNamefinal	
int	TokenNameint	
maxSizeNeeded	TokenNameIdentifier	 max Size Needed
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
maxSizeNeeded	TokenNameIdentifier	 max Size Needed
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
!=	TokenNameNOT_EQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
outputPos	TokenNameIdentifier	 output Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Quick test: if it's not in range then just keep 	TokenNameCOMMENT_LINE	Quick test: if it's not in range then just keep 
// current character 	TokenNameCOMMENT_LINE	current character 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
'�'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// À 	TokenNameCOMMENT_LINE	À 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Á 	TokenNameCOMMENT_LINE	Á 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Â 	TokenNameCOMMENT_LINE	Â 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ã 	TokenNameCOMMENT_LINE	Ã 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ä 	TokenNameCOMMENT_LINE	Ä 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Å 	TokenNameCOMMENT_LINE	Å 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Æ 	TokenNameCOMMENT_LINE	Æ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'E'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ç 	TokenNameCOMMENT_LINE	Ç 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// È 	TokenNameCOMMENT_LINE	È 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// É 	TokenNameCOMMENT_LINE	É 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ê 	TokenNameCOMMENT_LINE	Ê 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ë 	TokenNameCOMMENT_LINE	Ë 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'E'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ì 	TokenNameCOMMENT_LINE	Ì 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Í 	TokenNameCOMMENT_LINE	Í 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Î 	TokenNameCOMMENT_LINE	Î 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ï 	TokenNameCOMMENT_LINE	Ï 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'I'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ĳ 	TokenNameCOMMENT_LINE	Ĳ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'I'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'J'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ð 	TokenNameCOMMENT_LINE	Ð 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'D'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ñ 	TokenNameCOMMENT_LINE	Ñ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'N'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ò 	TokenNameCOMMENT_LINE	Ò 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ó 	TokenNameCOMMENT_LINE	Ó 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ô 	TokenNameCOMMENT_LINE	Ô 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Õ 	TokenNameCOMMENT_LINE	Õ 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ö 	TokenNameCOMMENT_LINE	Ö 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ø 	TokenNameCOMMENT_LINE	Ø 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'O'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Œ 	TokenNameCOMMENT_LINE	Œ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'O'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'E'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Þ 	TokenNameCOMMENT_LINE	Þ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'T'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'H'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ù 	TokenNameCOMMENT_LINE	Ù 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ú 	TokenNameCOMMENT_LINE	Ú 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Û 	TokenNameCOMMENT_LINE	Û 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ü 	TokenNameCOMMENT_LINE	Ü 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'U'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ý 	TokenNameCOMMENT_LINE	Ý 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Ÿ 	TokenNameCOMMENT_LINE	Ÿ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'Y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// à 	TokenNameCOMMENT_LINE	à 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// á 	TokenNameCOMMENT_LINE	á 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// â 	TokenNameCOMMENT_LINE	â 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ã 	TokenNameCOMMENT_LINE	ã 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ä 	TokenNameCOMMENT_LINE	ä 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// å 	TokenNameCOMMENT_LINE	å 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// æ 	TokenNameCOMMENT_LINE	æ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'e'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ç 	TokenNameCOMMENT_LINE	ç 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'c'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// è 	TokenNameCOMMENT_LINE	è 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// é 	TokenNameCOMMENT_LINE	é 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ê 	TokenNameCOMMENT_LINE	ê 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ë 	TokenNameCOMMENT_LINE	ë 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'e'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ì 	TokenNameCOMMENT_LINE	ì 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// í 	TokenNameCOMMENT_LINE	í 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// î 	TokenNameCOMMENT_LINE	î 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ï 	TokenNameCOMMENT_LINE	ï 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ĳ 	TokenNameCOMMENT_LINE	ĳ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'j'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ð 	TokenNameCOMMENT_LINE	ð 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'd'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ñ 	TokenNameCOMMENT_LINE	ñ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ò 	TokenNameCOMMENT_LINE	ò 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ó 	TokenNameCOMMENT_LINE	ó 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ô 	TokenNameCOMMENT_LINE	ô 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// õ 	TokenNameCOMMENT_LINE	õ 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ö 	TokenNameCOMMENT_LINE	ö 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ø 	TokenNameCOMMENT_LINE	ø 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// œ 	TokenNameCOMMENT_LINE	œ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'e'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ß 	TokenNameCOMMENT_LINE	ß 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// þ 	TokenNameCOMMENT_LINE	þ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'h'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ù 	TokenNameCOMMENT_LINE	ù 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ú 	TokenNameCOMMENT_LINE	ú 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// û 	TokenNameCOMMENT_LINE	û 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ü 	TokenNameCOMMENT_LINE	ü 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'u'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ý 	TokenNameCOMMENT_LINE	ý 
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ÿ 	TokenNameCOMMENT_LINE	ÿ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬀ 	TokenNameCOMMENT_LINE	ﬀ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬁ 	TokenNameCOMMENT_LINE	ﬁ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'�'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬂ 	TokenNameCOMMENT_LINE	ﬂ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'l'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// following 2 are commented as they can break the maxSizeNeeded (and doing *3 could be expensive) 	TokenNameCOMMENT_LINE	following 2 are commented as they can break the maxSizeNeeded (and doing *3 could be expensive) 
// case '?	TokenNameCOMMENT_LINE	case '?
// output[outputPos++] = 'f'; 	TokenNameCOMMENT_LINE	output[outputPos++] = 'f'; 
// output[outputPos++] = 'f'; 	TokenNameCOMMENT_LINE	output[outputPos++] = 'f'; 
// output[outputPos++] = 'i'; 	TokenNameCOMMENT_LINE	output[outputPos++] = 'i'; 
// break; 	TokenNameCOMMENT_LINE	break; 
// case '?	TokenNameCOMMENT_LINE	case '?
// output[outputPos++] = 'f'; 	TokenNameCOMMENT_LINE	output[outputPos++] = 'f'; 
// output[outputPos++] = 'f'; 	TokenNameCOMMENT_LINE	output[outputPos++] = 'f'; 
// output[outputPos++] = 'l'; 	TokenNameCOMMENT_LINE	output[outputPos++] = 'l'; 
// break; 	TokenNameCOMMENT_LINE	break; 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬅ 	TokenNameCOMMENT_LINE	ﬅ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// ﬆ 	TokenNameCOMMENT_LINE	ﬆ 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
outputPos	TokenNameIdentifier	 output Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
