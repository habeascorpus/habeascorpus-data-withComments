package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tr	TokenNameIdentifier	 tr
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** * Normalizes Turkish token text to lower case. * <p> * Turkish and Azeri have unique casing behavior for some characters. This * filter applies Turkish lowercase rules. For more information, see <a * href="http://en.wikipedia.org/wiki/Turkish_dotted_and_dotless_I" * >http://en.wikipedia.org/wiki/Turkish_dotted_and_dotless_I</a> * </p> */	TokenNameCOMMENT_JAVADOC	 Normalizes Turkish token text to lower case. <p> Turkish and Azeri have unique casing behavior for some characters. This filter applies Turkish lowercase rules. For more information, see <a href="http://en.wikipedia.org/wiki/Turkish_dotted_and_dotless_I" >http://en.wikipedia.org/wiki/Turkish_dotted_and_dotless_I</a> </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TurkishLowerCaseFilter	TokenNameIdentifier	 Turkish Lower Case Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LATIN_CAPITAL_LETTER_I	TokenNameIdentifier	 LATIN  CAPITAL  LETTER  I
=	TokenNameEQUAL	
'I'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LATIN_SMALL_LETTER_I	TokenNameIdentifier	 LATIN  SMALL  LETTER  I
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LATIN_SMALL_LETTER_DOTLESS_I	TokenNameIdentifier	 LATIN  SMALL  LETTER  DOTLESS  I
=	TokenNameEQUAL	
'õ'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMBINING_DOT_ABOVE	TokenNameIdentifier	 COMBINING  DOT  ABOVE
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
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
/** * Create a new TurkishLowerCaseFilter, that normalizes Turkish token text * to lower case. * * @param in TokenStream to filter */	TokenNameCOMMENT_JAVADOC	 Create a new TurkishLowerCaseFilter, that normalizes Turkish token text to lower case. * @param in TokenStream to filter 
public	TokenNamepublic	
TurkishLowerCaseFilter	TokenNameIdentifier	 Turkish Lower Case Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
iOrAfter	TokenNameIdentifier	 i Or After
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
int	TokenNameint	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iOrAfter	TokenNameIdentifier	 i Or After
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
LATIN_CAPITAL_LETTER_I	TokenNameIdentifier	 LATIN  CAPITAL  LETTER  I
||	TokenNameOR_OR	
(	TokenNameLPAREN	
iOrAfter	TokenNameIdentifier	 i Or After
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
NON_SPACING_MARK	TokenNameIdentifier	 NON  SPACING  MARK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iOrAfter	TokenNameIdentifier	 i Or After
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// all the special I turkish handling happens here. 	TokenNameCOMMENT_LINE	all the special I turkish handling happens here. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// remove COMBINING_DOT_ABOVE to mimic composed lowercase 	TokenNameCOMMENT_LINE	remove COMBINING_DOT_ABOVE to mimic composed lowercase 
case	TokenNamecase	
COMBINING_DOT_ABOVE	TokenNameIdentifier	 COMBINING  DOT  ABOVE
:	TokenNameCOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// i itself, it depends if it is followed by COMBINING_DOT_ABOVE 	TokenNameCOMMENT_LINE	i itself, it depends if it is followed by COMBINING_DOT_ABOVE 
// if it is, we will make it small i and later remove the dot 	TokenNameCOMMENT_LINE	if it is, we will make it small i and later remove the dot 
case	TokenNamecase	
LATIN_CAPITAL_LETTER_I	TokenNameIdentifier	 LATIN  CAPITAL  LETTER  I
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isBeforeDot	TokenNameIdentifier	 is Before Dot
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
LATIN_SMALL_LETTER_I	TokenNameIdentifier	 LATIN  SMALL  LETTER  I
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
LATIN_SMALL_LETTER_DOTLESS_I	TokenNameIdentifier	 LATIN  SMALL  LETTER  DOTLESS  I
;	TokenNameSEMICOLON	
// below is an optimization. no COMBINING_DOT_ABOVE follows, 	TokenNameCOMMENT_LINE	below is an optimization. no COMBINING_DOT_ABOVE follows, 
// so don't waste time calculating Character.getType(), etc 	TokenNameCOMMENT_LINE	so don't waste time calculating Character.getType(), etc 
iOrAfter	TokenNameIdentifier	 i Or After
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * lookahead for a combining dot above. * other NSMs may be in between. */	TokenNameCOMMENT_JAVADOC	 lookahead for a combining dot above. other NSMs may be in between. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isBeforeDot	TokenNameIdentifier	 is Before Dot
(	TokenNameLPAREN	
char	TokenNamechar	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
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
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
NON_SPACING_MARK	TokenNameIdentifier	 NON  SPACING  MARK
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
COMBINING_DOT_ABOVE	TokenNameIdentifier	 COMBINING  DOT  ABOVE
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * delete a character in-place. * rarely happens, only if COMBINING_DOT_ABOVE is found after an i */	TokenNameCOMMENT_JAVADOC	 delete a character in-place. rarely happens, only if COMBINING_DOT_ABOVE is found after an i 
private	TokenNameprivate	
int	TokenNameint	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
char	TokenNamechar	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
