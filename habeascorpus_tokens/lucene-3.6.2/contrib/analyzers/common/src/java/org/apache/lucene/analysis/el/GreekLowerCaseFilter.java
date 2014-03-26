package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
el	TokenNameIdentifier	 el
;	TokenNameSEMICOLON	
/** * Copyright 2005 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2005 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenFilter	TokenNameIdentifier	 Token Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CharacterUtils	TokenNameIdentifier	 Character Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * Normalizes token text to lower case, removes some Greek diacritics, * and standardizes final sigma to sigma. * <a name="version"/> * <p>You must specify the required {@link Version} * compatibility when creating GreekLowerCaseFilter: * <ul> * <li> As of 3.1, supplementary characters are properly lowercased. * </ul> */	TokenNameCOMMENT_JAVADOC	 Normalizes token text to lower case, removes some Greek diacritics, and standardizes final sigma to sigma. <a name="version"/> <p>You must specify the required {@link Version} compatibility when creating GreekLowerCaseFilter: <ul> <li> As of 3.1, supplementary characters are properly lowercased. </ul> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
GreekLowerCaseFilter	TokenNameIdentifier	 Greek Lower Case Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
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
private	TokenNameprivate	
final	TokenNamefinal	
CharacterUtils	TokenNameIdentifier	 Character Utils
charUtils	TokenNameIdentifier	 char Utils
;	TokenNameSEMICOLON	
/** @deprecated Use {@link #GreekLowerCaseFilter(Version, TokenStream)} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link #GreekLowerCaseFilter(Version, TokenStream)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
GreekLowerCaseFilter	TokenNameIdentifier	 Greek Lower Case Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a GreekLowerCaseFilter that normalizes Greek token text. * * @param matchVersion Lucene compatibility version, * See <a href="#version">above</a> * @param in TokenStream to filter */	TokenNameCOMMENT_JAVADOC	 Create a GreekLowerCaseFilter that normalizes Greek token text. * @param matchVersion Lucene compatibility version, See <a href="#version">above</a> @param in TokenStream to filter 
public	TokenNamepublic	
GreekLowerCaseFilter	TokenNameIdentifier	 Greek Lower Case Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charUtils	TokenNameIdentifier	 char Utils
=	TokenNameEQUAL	
CharacterUtils	TokenNameIdentifier	 Character Utils
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
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
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chArray	TokenNameIdentifier	 ch Array
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chLen	TokenNameIdentifier	 ch Len
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
chLen	TokenNameIdentifier	 ch Len
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
lowerCase	TokenNameIdentifier	 lower Case
(	TokenNameLPAREN	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
chArray	TokenNameIdentifier	 ch Array
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chArray	TokenNameIdentifier	 ch Array
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
lowerCase	TokenNameIdentifier	 lower Case
(	TokenNameLPAREN	
int	TokenNameint	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* There are two lowercase forms of sigma: * U+03C2: small final sigma (end of word) * U+03C3: small sigma (otherwise) * * Standardize both to U+03C3 */	TokenNameCOMMENT_BLOCK	 There are two lowercase forms of sigma: U+03C2: small final sigma (end of word) U+03C3: small sigma (otherwise) * Standardize both to U+03C3 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small final sigma */	TokenNameCOMMENT_BLOCK	 small final sigma 
return	TokenNamereturn	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/* small sigma */	TokenNameCOMMENT_BLOCK	 small sigma 
/* Some greek characters contain diacritics. * This filter removes these, converting to the lowercase base form. */	TokenNameCOMMENT_BLOCK	 Some greek characters contain diacritics. This filter removes these, converting to the lowercase base form. 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* capital alpha with tonos */	TokenNameCOMMENT_BLOCK	 capital alpha with tonos 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small alpha with tonos */	TokenNameCOMMENT_BLOCK	 small alpha with tonos 
return	TokenNamereturn	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/* small alpha */	TokenNameCOMMENT_BLOCK	 small alpha 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* capital epsilon with tonos */	TokenNameCOMMENT_BLOCK	 capital epsilon with tonos 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small epsilon with tonos */	TokenNameCOMMENT_BLOCK	 small epsilon with tonos 
return	TokenNamereturn	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/* small epsilon */	TokenNameCOMMENT_BLOCK	 small epsilon 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* capital eta with tonos */	TokenNameCOMMENT_BLOCK	 capital eta with tonos 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small eta with tonos */	TokenNameCOMMENT_BLOCK	 small eta with tonos 
return	TokenNamereturn	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/* small eta */	TokenNameCOMMENT_BLOCK	 small eta 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* capital iota with tonos */	TokenNameCOMMENT_BLOCK	 capital iota with tonos 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* capital iota with dialytika */	TokenNameCOMMENT_BLOCK	 capital iota with dialytika 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small iota with tonos */	TokenNameCOMMENT_BLOCK	 small iota with tonos 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small iota with dialytika */	TokenNameCOMMENT_BLOCK	 small iota with dialytika 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small iota with dialytika and tonos */	TokenNameCOMMENT_BLOCK	 small iota with dialytika and tonos 
return	TokenNamereturn	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/* small iota */	TokenNameCOMMENT_BLOCK	 small iota 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* capital upsilon with tonos */	TokenNameCOMMENT_BLOCK	 capital upsilon with tonos 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* capital upsilon with dialytika */	TokenNameCOMMENT_BLOCK	 capital upsilon with dialytika 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small upsilon with tonos */	TokenNameCOMMENT_BLOCK	 small upsilon with tonos 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small upsilon with dialytika */	TokenNameCOMMENT_BLOCK	 small upsilon with dialytika 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small upsilon with dialytika and tonos */	TokenNameCOMMENT_BLOCK	 small upsilon with dialytika and tonos 
return	TokenNamereturn	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/* small upsilon */	TokenNameCOMMENT_BLOCK	 small upsilon 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* capital omicron with tonos */	TokenNameCOMMENT_BLOCK	 capital omicron with tonos 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small omicron with tonos */	TokenNameCOMMENT_BLOCK	 small omicron with tonos 
return	TokenNamereturn	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/* small omicron */	TokenNameCOMMENT_BLOCK	 small omicron 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* capital omega with tonos */	TokenNameCOMMENT_BLOCK	 capital omega with tonos 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* small omega with tonos */	TokenNameCOMMENT_BLOCK	 small omega with tonos 
return	TokenNamereturn	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/* small omega */	TokenNameCOMMENT_BLOCK	 small omega 
/* The previous implementation did the conversion below. * Only implemented for backwards compatibility with old indexes. */	TokenNameCOMMENT_BLOCK	 The previous implementation did the conversion below. Only implemented for backwards compatibility with old indexes. 
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
/* reserved */	TokenNameCOMMENT_BLOCK	 reserved 
return	TokenNamereturn	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/* small final sigma */	TokenNameCOMMENT_BLOCK	 small final sigma 
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
