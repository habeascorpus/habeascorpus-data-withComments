package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cjk	TokenNameIdentifier	 cjk
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
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
TypeAttribute	TokenNameIdentifier	 Type Attribute
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
ArrayUtil	TokenNameIdentifier	 Array Util
;	TokenNameSEMICOLON	
/** * Forms bigrams of CJK terms that are generated from StandardTokenizer * or ICUTokenizer. * <p> * CJK types are set by these tokenizers, but you can also use * {@link #CJKBigramFilter(TokenStream, int)} to explicitly control which * of the CJK scripts are turned into bigrams. * <p> * In all cases, all non-CJK input is passed thru unmodified. */	TokenNameCOMMENT_JAVADOC	 Forms bigrams of CJK terms that are generated from StandardTokenizer or ICUTokenizer. <p> CJK types are set by these tokenizers, but you can also use {@link #CJKBigramFilter(TokenStream, int)} to explicitly control which of the CJK scripts are turned into bigrams. <p> In all cases, all non-CJK input is passed thru unmodified. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CJKBigramFilter	TokenNameIdentifier	 CJK Bigram Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
// configuration 	TokenNameCOMMENT_LINE	configuration 
/** bigram flag for Han Ideographs */	TokenNameCOMMENT_JAVADOC	 bigram flag for Han Ideographs 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HAN	TokenNameIdentifier	 HAN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** bigram flag for Hiragana */	TokenNameCOMMENT_JAVADOC	 bigram flag for Hiragana 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HIRAGANA	TokenNameIdentifier	 HIRAGANA
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** bigram flag for Katakana */	TokenNameCOMMENT_JAVADOC	 bigram flag for Katakana 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KATAKANA	TokenNameIdentifier	 KATAKANA
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** bigram flag for Hangul */	TokenNameCOMMENT_JAVADOC	 bigram flag for Hangul 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HANGUL	TokenNameIdentifier	 HANGUL
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** when we emit a bigram, its then marked as this type */	TokenNameCOMMENT_JAVADOC	 when we emit a bigram, its then marked as this type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOUBLE_TYPE	TokenNameIdentifier	 DOUBLE  TYPE
=	TokenNameEQUAL	
"<DOUBLE>"	TokenNameStringLiteral	<DOUBLE>
;	TokenNameSEMICOLON	
/** when we emit a unigram, its then marked as this type */	TokenNameCOMMENT_JAVADOC	 when we emit a unigram, its then marked as this type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SINGLE_TYPE	TokenNameIdentifier	 SINGLE  TYPE
=	TokenNameEQUAL	
"<SINGLE>"	TokenNameStringLiteral	<SINGLE>
;	TokenNameSEMICOLON	
// the types from standardtokenizer 	TokenNameCOMMENT_LINE	the types from standardtokenizer 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HAN_TYPE	TokenNameIdentifier	 HAN  TYPE
=	TokenNameEQUAL	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
IDEOGRAPHIC	TokenNameIdentifier	 IDEOGRAPHIC
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HIRAGANA_TYPE	TokenNameIdentifier	 HIRAGANA  TYPE
=	TokenNameEQUAL	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
HIRAGANA	TokenNameIdentifier	 HIRAGANA
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KATAKANA_TYPE	TokenNameIdentifier	 KATAKANA  TYPE
=	TokenNameEQUAL	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
KATAKANA	TokenNameIdentifier	 KATAKANA
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HANGUL_TYPE	TokenNameIdentifier	 HANGUL  TYPE
=	TokenNameEQUAL	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
HANGUL	TokenNameIdentifier	 HANGUL
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// sentinel value for ignoring a script 	TokenNameCOMMENT_LINE	sentinel value for ignoring a script 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
NO	TokenNameIdentifier	 NO
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// these are set to either their type or NO if we want to pass them thru 	TokenNameCOMMENT_LINE	these are set to either their type or NO if we want to pass them thru 
private	TokenNameprivate	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
doHan	TokenNameIdentifier	 do Han
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
doHiragana	TokenNameIdentifier	 do Hiragana
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
doKatakana	TokenNameIdentifier	 do Katakana
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
doHangul	TokenNameIdentifier	 do Hangul
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
private	TokenNameprivate	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// buffers containing codepoint and offsets in parallel 	TokenNameCOMMENT_LINE	buffers containing codepoint and offsets in parallel 
int	TokenNameint	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// length of valid buffer 	TokenNameCOMMENT_LINE	length of valid buffer 
int	TokenNameint	
bufferLen	TokenNameIdentifier	 buffer Len
;	TokenNameSEMICOLON	
// current buffer index 	TokenNameCOMMENT_LINE	current buffer index 
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// the last end offset, to determine if we should bigram across tokens 	TokenNameCOMMENT_LINE	the last end offset, to determine if we should bigram across tokens 
int	TokenNameint	
lastEndOffset	TokenNameIdentifier	 last End Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
exhausted	TokenNameIdentifier	 exhausted
;	TokenNameSEMICOLON	
/** * Calls {@link CJKBigramFilter#CJKBigramFilter(TokenStream, int) * CJKBigramFilter(HAN | HIRAGANA | KATAKANA | HANGUL)} */	TokenNameCOMMENT_JAVADOC	 Calls {@link CJKBigramFilter#CJKBigramFilter(TokenStream, int) CJKBigramFilter(HAN | HIRAGANA | KATAKANA | HANGUL)} 
public	TokenNamepublic	
CJKBigramFilter	TokenNameIdentifier	 CJK Bigram Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
HAN	TokenNameIdentifier	 HAN
|	TokenNameOR	
HIRAGANA	TokenNameIdentifier	 HIRAGANA
|	TokenNameOR	
KATAKANA	TokenNameIdentifier	 KATAKANA
|	TokenNameOR	
HANGUL	TokenNameIdentifier	 HANGUL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new CJKBigramFilter, specifying which writing systems should be bigrammed. * @param flags OR'ed set from {@link CJKBigramFilter#HAN}, {@link CJKBigramFilter#HIRAGANA}, * {@link CJKBigramFilter#KATAKANA}, {@link CJKBigramFilter#HANGUL} */	TokenNameCOMMENT_JAVADOC	 Create a new CJKBigramFilter, specifying which writing systems should be bigrammed. @param flags OR'ed set from {@link CJKBigramFilter#HAN}, {@link CJKBigramFilter#HIRAGANA}, {@link CJKBigramFilter#KATAKANA}, {@link CJKBigramFilter#HANGUL} 
public	TokenNamepublic	
CJKBigramFilter	TokenNameIdentifier	 CJK Bigram Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doHan	TokenNameIdentifier	 do Han
=	TokenNameEQUAL	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
HAN	TokenNameIdentifier	 HAN
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
NO	TokenNameIdentifier	 NO
:	TokenNameCOLON	
HAN_TYPE	TokenNameIdentifier	 HAN  TYPE
;	TokenNameSEMICOLON	
doHiragana	TokenNameIdentifier	 do Hiragana
=	TokenNameEQUAL	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
HIRAGANA	TokenNameIdentifier	 HIRAGANA
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
NO	TokenNameIdentifier	 NO
:	TokenNameCOLON	
HIRAGANA_TYPE	TokenNameIdentifier	 HIRAGANA  TYPE
;	TokenNameSEMICOLON	
doKatakana	TokenNameIdentifier	 do Katakana
=	TokenNameEQUAL	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
KATAKANA	TokenNameIdentifier	 KATAKANA
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
NO	TokenNameIdentifier	 NO
:	TokenNameCOLON	
KATAKANA_TYPE	TokenNameIdentifier	 KATAKANA  TYPE
;	TokenNameSEMICOLON	
doHangul	TokenNameIdentifier	 do Hangul
=	TokenNameEQUAL	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
HANGUL	TokenNameIdentifier	 HANGUL
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
NO	TokenNameIdentifier	 NO
:	TokenNameCOLON	
HANGUL_TYPE	TokenNameIdentifier	 HANGUL  TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * much of this complexity revolves around handling the special case of a * "lone cjk character" where cjktokenizer would output a unigram. this * is also the only time we ever have to captureState. */	TokenNameCOMMENT_BLOCK	 much of this complexity revolves around handling the special case of a "lone cjk character" where cjktokenizer would output a unigram. this is also the only time we ever have to captureState. 
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
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasBufferedBigram	TokenNameIdentifier	 has Buffered Bigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// case 1: we have multiple remaining codepoints buffered, 	TokenNameCOMMENT_LINE	case 1: we have multiple remaining codepoints buffered, 
// so we can emit a bigram here. 	TokenNameCOMMENT_LINE	so we can emit a bigram here. 
flushBigram	TokenNameIdentifier	 flush Bigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
doNext	TokenNameIdentifier	 do Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// case 2: look at the token type. should we form any n-grams? 	TokenNameCOMMENT_LINE	case 2: look at the token type. should we form any n-grams? 
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
doHan	TokenNameIdentifier	 do Han
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
doHiragana	TokenNameIdentifier	 do Hiragana
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
doKatakana	TokenNameIdentifier	 do Katakana
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
doHangul	TokenNameIdentifier	 do Hangul
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// acceptable CJK type: we form n-grams from these. 	TokenNameCOMMENT_LINE	acceptable CJK type: we form n-grams from these. 
// as long as the offsets are aligned, we just add these to our current buffer. 	TokenNameCOMMENT_LINE	as long as the offsets are aligned, we just add these to our current buffer. 
// otherwise, we clear the buffer and start over. 	TokenNameCOMMENT_LINE	otherwise, we clear the buffer and start over. 
if	TokenNameif	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
lastEndOffset	TokenNameIdentifier	 last End Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// unaligned, clear queue 	TokenNameCOMMENT_LINE	unaligned, clear queue 
if	TokenNameif	
(	TokenNameLPAREN	
hasBufferedUnigram	TokenNameIdentifier	 has Buffered Unigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have a buffered unigram, and we peeked ahead to see if we could form 	TokenNameCOMMENT_LINE	we have a buffered unigram, and we peeked ahead to see if we could form 
// a bigram, but we can't, because the offsets are unaligned. capture the state 	TokenNameCOMMENT_LINE	a bigram, but we can't, because the offsets are unaligned. capture the state 
// of this peeked data to be revisited next time thru the loop, and dump our unigram. 	TokenNameCOMMENT_LINE	of this peeked data to be revisited next time thru the loop, and dump our unigram. 
loneState	TokenNameIdentifier	 lone State
=	TokenNameEQUAL	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flushUnigram	TokenNameIdentifier	 flush Unigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bufferLen	TokenNameIdentifier	 buffer Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// not a CJK type: we just return these as-is. 	TokenNameCOMMENT_LINE	not a CJK type: we just return these as-is. 
if	TokenNameif	
(	TokenNameLPAREN	
hasBufferedUnigram	TokenNameIdentifier	 has Buffered Unigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have a buffered unigram, and we peeked ahead to see if we could form 	TokenNameCOMMENT_LINE	we have a buffered unigram, and we peeked ahead to see if we could form 
// a bigram, but we can't, because its not a CJK type. capture the state 	TokenNameCOMMENT_LINE	a bigram, but we can't, because its not a CJK type. capture the state 
// of this peeked data to be revisited next time thru the loop, and dump our unigram. 	TokenNameCOMMENT_LINE	of this peeked data to be revisited next time thru the loop, and dump our unigram. 
loneState	TokenNameIdentifier	 lone State
=	TokenNameEQUAL	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flushUnigram	TokenNameIdentifier	 flush Unigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// case 3: we have only zero or 1 codepoints buffered, 	TokenNameCOMMENT_LINE	case 3: we have only zero or 1 codepoints buffered, 
// so not enough to form a bigram. But, we also have no 	TokenNameCOMMENT_LINE	so not enough to form a bigram. But, we also have no 
// more input. So if we have a buffered codepoint, emit 	TokenNameCOMMENT_LINE	more input. So if we have a buffered codepoint, emit 
// a unigram, otherwise, its end of stream. 	TokenNameCOMMENT_LINE	a unigram, otherwise, its end of stream. 
if	TokenNameif	
(	TokenNameLPAREN	
hasBufferedUnigram	TokenNameIdentifier	 has Buffered Unigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushUnigram	TokenNameIdentifier	 flush Unigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// flush our remaining unigram 	TokenNameCOMMENT_LINE	flush our remaining unigram 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
State	TokenNameIdentifier	 State
loneState	TokenNameIdentifier	 lone State
;	TokenNameSEMICOLON	
// rarely used: only for "lone cjk characters", where we emit unigrams 	TokenNameCOMMENT_LINE	rarely used: only for "lone cjk characters", where we emit unigrams 
/** * looks at next input token, returning false is none is available */	TokenNameCOMMENT_JAVADOC	 looks at next input token, returning false is none is available 
private	TokenNameprivate	
boolean	TokenNameboolean	
doNext	TokenNameIdentifier	 do Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loneState	TokenNameIdentifier	 lone State
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
loneState	TokenNameIdentifier	 lone State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loneState	TokenNameIdentifier	 lone State
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exhausted	TokenNameIdentifier	 exhausted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * refills buffers with new data from the current token. */	TokenNameCOMMENT_JAVADOC	 refills buffers with new data from the current token. 
private	TokenNameprivate	
void	TokenNamevoid	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// compact buffers to keep them smallish if they become large 	TokenNameCOMMENT_LINE	compact buffers to keep them smallish if they become large 
// just a safety check, but technically we only need the last codepoint 	TokenNameCOMMENT_LINE	just a safety check, but technically we only need the last codepoint 
if	TokenNameif	
(	TokenNameLPAREN	
bufferLen	TokenNameIdentifier	 buffer Len
>	TokenNameGREATER	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
bufferLen	TokenNameIdentifier	 buffer Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
last	TokenNameIdentifier	 last
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
[	TokenNameLBRACKET	
last	TokenNameIdentifier	 last
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
[	TokenNameLBRACKET	
last	TokenNameIdentifier	 last
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bufferLen	TokenNameIdentifier	 buffer Len
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
-=	TokenNameMINUS_EQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
termBuffer	TokenNameIdentifier	 term Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
bufferLen	TokenNameIdentifier	 buffer Len
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastEndOffset	TokenNameIdentifier	 last End Offset
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// crazy offsets (modified by synonym or charfilter): just preserve 	TokenNameCOMMENT_LINE	crazy offsets (modified by synonym or charfilter): just preserve 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferLen	TokenNameIdentifier	 buffer Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
termBuffer	TokenNameIdentifier	 term Buffer
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
[	TokenNameLBRACKET	
bufferLen	TokenNameIdentifier	 buffer Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
[	TokenNameLBRACKET	
bufferLen	TokenNameIdentifier	 buffer Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
bufferLen	TokenNameIdentifier	 buffer Len
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// normal offsets 	TokenNameCOMMENT_LINE	normal offsets 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cpLen	TokenNameIdentifier	 cp Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
cpLen	TokenNameIdentifier	 cp Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferLen	TokenNameIdentifier	 buffer Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
termBuffer	TokenNameIdentifier	 term Buffer
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cpLen	TokenNameIdentifier	 cp Len
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
[	TokenNameLBRACKET	
bufferLen	TokenNameIdentifier	 buffer Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
[	TokenNameLBRACKET	
bufferLen	TokenNameIdentifier	 buffer Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
cpLen	TokenNameIdentifier	 cp Len
;	TokenNameSEMICOLON	
bufferLen	TokenNameIdentifier	 buffer Len
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Flushes a bigram token to output from our buffer * This is the normal case, e.g. ABC -> AB BC */	TokenNameCOMMENT_JAVADOC	 Flushes a bigram token to output from our buffer This is the normal case, e.g. ABC -> AB BC 
private	TokenNameprivate	
void	TokenNamevoid	
flushBigram	TokenNameIdentifier	 flush Bigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
termBuffer	TokenNameIdentifier	 term Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// maximum bigram length in code units (2 supplementaries) 	TokenNameCOMMENT_LINE	maximum bigram length in code units (2 supplementaries) 
int	TokenNameint	
len1	TokenNameIdentifier	 len1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
termBuffer	TokenNameIdentifier	 term Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len2	TokenNameIdentifier	 len2
=	TokenNameEQUAL	
len1	TokenNameIdentifier	 len1
+	TokenNamePLUS	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
termBuffer	TokenNameIdentifier	 term Buffer
,	TokenNameCOMMA	
len1	TokenNameIdentifier	 len1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
DOUBLE_TYPE	TokenNameIdentifier	 DOUBLE  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flushes a unigram token to output from our buffer. * This happens when we encounter isolated CJK characters, either the whole * CJK string is a single character, or we encounter a CJK character surrounded * by space, punctuation, english, etc, but not beside any other CJK. */	TokenNameCOMMENT_JAVADOC	 Flushes a unigram token to output from our buffer. This happens when we encounter isolated CJK characters, either the whole CJK string is a single character, or we encounter a CJK character surrounded by space, punctuation, english, etc, but not beside any other CJK. 
private	TokenNameprivate	
void	TokenNamevoid	
flushUnigram	TokenNameIdentifier	 flush Unigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
termBuffer	TokenNameIdentifier	 term Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// maximum unigram length (2 surrogates) 	TokenNameCOMMENT_LINE	maximum unigram length (2 surrogates) 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
termBuffer	TokenNameIdentifier	 term Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
SINGLE_TYPE	TokenNameIdentifier	 SINGLE  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True if we have multiple codepoints sitting in our buffer */	TokenNameCOMMENT_JAVADOC	 True if we have multiple codepoints sitting in our buffer 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasBufferedBigram	TokenNameIdentifier	 has Buffered Bigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferLen	TokenNameIdentifier	 buffer Len
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True if we have a single codepoint sitting in our buffer, where its future * (whether it is emitted as unigram or forms a bigram) depends upon not-yet-seen * inputs. */	TokenNameCOMMENT_JAVADOC	 True if we have a single codepoint sitting in our buffer, where its future (whether it is emitted as unigram or forms a bigram) depends upon not-yet-seen inputs. 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasBufferedUnigram	TokenNameIdentifier	 has Buffered Unigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferLen	TokenNameIdentifier	 buffer Len
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferLen	TokenNameIdentifier	 buffer Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lastEndOffset	TokenNameIdentifier	 last End Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
loneState	TokenNameIdentifier	 lone State
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
