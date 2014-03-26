package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ar	TokenNameIdentifier	 ar
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StemmerUtil	TokenNameIdentifier	 Stemmer Util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Normalizer for Arabic. * <p> * Normalization is done in-place for efficiency, operating on a termbuffer. * <p> * Normalization is defined as: * <ul> * <li> Normalization of hamza with alef seat to a bare alef. * <li> Normalization of teh marbuta to heh * <li> Normalization of dotless yeh (alef maksura) to yeh. * <li> Removal of Arabic diacritics (the harakat) * <li> Removal of tatweel (stretching character). * </ul> * */	TokenNameCOMMENT_JAVADOC	 Normalizer for Arabic. <p> Normalization is done in-place for efficiency, operating on a termbuffer. <p> Normalization is defined as: <ul> <li> Normalization of hamza with alef seat to a bare alef. <li> Normalization of teh marbuta to heh <li> Normalization of dotless yeh (alef maksura) to yeh. <li> Removal of Arabic diacritics (the harakat) <li> Removal of tatweel (stretching character). </ul> 
public	TokenNamepublic	
class	TokenNameclass	
ArabicNormalizer	TokenNameIdentifier	 Arabic Normalizer
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ALEF	TokenNameIdentifier	 ALEF
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ALEF_MADDA	TokenNameIdentifier	 ALEF  MADDA
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ALEF_HAMZA_ABOVE	TokenNameIdentifier	 ALEF  HAMZA  ABOVE
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ALEF_HAMZA_BELOW	TokenNameIdentifier	 ALEF  HAMZA  BELOW
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
YEH	TokenNameIdentifier	 YEH
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DOTLESS_YEH	TokenNameIdentifier	 DOTLESS  YEH
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
TEH_MARBUTA	TokenNameIdentifier	 TEH  MARBUTA
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
HEH	TokenNameIdentifier	 HEH
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
TATWEEL	TokenNameIdentifier	 TATWEEL
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
FATHATAN	TokenNameIdentifier	 FATHATAN
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DAMMATAN	TokenNameIdentifier	 DAMMATAN
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
KASRATAN	TokenNameIdentifier	 KASRATAN
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
FATHA	TokenNameIdentifier	 FATHA
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DAMMA	TokenNameIdentifier	 DAMMA
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
KASRA	TokenNameIdentifier	 KASRA
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
SHADDA	TokenNameIdentifier	 SHADDA
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
SUKUN	TokenNameIdentifier	 SUKUN
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Normalize an input buffer of Arabic text * * @param s input buffer * @param len length of input buffer * @return length of input buffer after normalization */	TokenNameCOMMENT_JAVADOC	 Normalize an input buffer of Arabic text * @param s input buffer @param len length of input buffer @return length of input buffer after normalization 
public	TokenNamepublic	
int	TokenNameint	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
char	TokenNamechar	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ALEF_MADDA	TokenNameIdentifier	 ALEF  MADDA
:	TokenNameCOLON	
case	TokenNamecase	
ALEF_HAMZA_ABOVE	TokenNameIdentifier	 ALEF  HAMZA  ABOVE
:	TokenNameCOLON	
case	TokenNamecase	
ALEF_HAMZA_BELOW	TokenNameIdentifier	 ALEF  HAMZA  BELOW
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALEF	TokenNameIdentifier	 ALEF
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOTLESS_YEH	TokenNameIdentifier	 DOTLESS  YEH
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
YEH	TokenNameIdentifier	 YEH
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TEH_MARBUTA	TokenNameIdentifier	 TEH  MARBUTA
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
HEH	TokenNameIdentifier	 HEH
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TATWEEL	TokenNameIdentifier	 TATWEEL
:	TokenNameCOLON	
case	TokenNamecase	
KASRATAN	TokenNameIdentifier	 KASRATAN
:	TokenNameCOLON	
case	TokenNamecase	
DAMMATAN	TokenNameIdentifier	 DAMMATAN
:	TokenNameCOLON	
case	TokenNamecase	
FATHATAN	TokenNameIdentifier	 FATHATAN
:	TokenNameCOLON	
case	TokenNamecase	
FATHA	TokenNameIdentifier	 FATHA
:	TokenNameCOLON	
case	TokenNamecase	
DAMMA	TokenNameIdentifier	 DAMMA
:	TokenNameCOLON	
case	TokenNamecase	
KASRA	TokenNameIdentifier	 KASRA
:	TokenNameCOLON	
case	TokenNamecase	
SHADDA	TokenNameIdentifier	 SHADDA
:	TokenNameCOLON	
case	TokenNamecase	
SUKUN	TokenNameIdentifier	 SUKUN
:	TokenNameCOLON	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
