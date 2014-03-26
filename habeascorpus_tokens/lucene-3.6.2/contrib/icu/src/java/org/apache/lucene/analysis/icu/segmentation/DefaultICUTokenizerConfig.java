package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
segmentation	TokenNameIdentifier	 segmentation
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UScript	TokenNameIdentifier	 U Script
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BreakIterator	TokenNameIdentifier	 Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ULocale	TokenNameIdentifier	 U Locale
;	TokenNameSEMICOLON	
/** * Default {@link ICUTokenizerConfig} that is generally applicable * to many languages. * <p> * Generally tokenizes Unicode text according to UAX#29 * ({@link BreakIterator#getWordInstance(ULocale) BreakIterator.getWordInstance(ULocale.ROOT)}), * but with the following tailorings: * <ul> * <li>Thai text is broken into words with a * {@link com.ibm.icu.text.DictionaryBasedBreakIterator} * <li>Lao, Myanmar, and Khmer text is broken into syllables * based on custom BreakIterator rules. * <li>Hebrew text has custom tailorings to handle special cases * involving punctuation. * </ul> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Default {@link ICUTokenizerConfig} that is generally applicable to many languages. <p> Generally tokenizes Unicode text according to UAX#29 ({@link BreakIterator#getWordInstance(ULocale) BreakIterator.getWordInstance(ULocale.ROOT)}), but with the following tailorings: <ul> <li>Thai text is broken into words with a {@link com.ibm.icu.text.DictionaryBasedBreakIterator} <li>Lao, Myanmar, and Khmer text is broken into syllables based on custom BreakIterator rules. <li>Hebrew text has custom tailorings to handle special cases involving punctuation. </ul> @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
DefaultICUTokenizerConfig	TokenNameIdentifier	 Default ICU Tokenizer Config
extends	TokenNameextends	
ICUTokenizerConfig	TokenNameIdentifier	 ICU Tokenizer Config
{	TokenNameLBRACE	
/** Token type for words containing ideographic characters */	TokenNameCOMMENT_JAVADOC	 Token type for words containing ideographic characters 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WORD_IDEO	TokenNameIdentifier	 WORD  IDEO
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
/** Token type for words containing Japanese hiragana */	TokenNameCOMMENT_JAVADOC	 Token type for words containing Japanese hiragana 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WORD_HIRAGANA	TokenNameIdentifier	 WORD  HIRAGANA
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
/** Token type for words containing Japanese katakana */	TokenNameCOMMENT_JAVADOC	 Token type for words containing Japanese katakana 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WORD_KATAKANA	TokenNameIdentifier	 WORD  KATAKANA
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
/** Token type for words containing Korean hangul */	TokenNameCOMMENT_JAVADOC	 Token type for words containing Korean hangul 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WORD_HANGUL	TokenNameIdentifier	 WORD  HANGUL
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
/** Token type for words that contain letters */	TokenNameCOMMENT_JAVADOC	 Token type for words that contain letters 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WORD_LETTER	TokenNameIdentifier	 WORD  LETTER
=	TokenNameEQUAL	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
ALPHANUM	TokenNameIdentifier	 ALPHANUM
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Token type for words that appear to be numbers */	TokenNameCOMMENT_JAVADOC	 Token type for words that appear to be numbers 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WORD_NUMBER	TokenNameIdentifier	 WORD  NUMBER
=	TokenNameEQUAL	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
NUM	TokenNameIdentifier	 NUM
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/* * the default breakiterators in use. these can be expensive to * instantiate, cheap to clone. */	TokenNameCOMMENT_BLOCK	 the default breakiterators in use. these can be expensive to instantiate, cheap to clone. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BreakIterator	TokenNameIdentifier	 Break Iterator
rootBreakIterator	TokenNameIdentifier	 root Break Iterator
=	TokenNameEQUAL	
readBreakIterator	TokenNameIdentifier	 read Break Iterator
(	TokenNameLPAREN	
"Default.brk"	TokenNameStringLiteral	Default.brk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BreakIterator	TokenNameIdentifier	 Break Iterator
thaiBreakIterator	TokenNameIdentifier	 thai Break Iterator
=	TokenNameEQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
getWordInstance	TokenNameIdentifier	 get Word Instance
(	TokenNameLPAREN	
new	TokenNamenew	
ULocale	TokenNameIdentifier	 U Locale
(	TokenNameLPAREN	
"th_TH"	TokenNameStringLiteral	th_TH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BreakIterator	TokenNameIdentifier	 Break Iterator
hebrewBreakIterator	TokenNameIdentifier	 hebrew Break Iterator
=	TokenNameEQUAL	
readBreakIterator	TokenNameIdentifier	 read Break Iterator
(	TokenNameLPAREN	
"Hebrew.brk"	TokenNameStringLiteral	Hebrew.brk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BreakIterator	TokenNameIdentifier	 Break Iterator
khmerBreakIterator	TokenNameIdentifier	 khmer Break Iterator
=	TokenNameEQUAL	
readBreakIterator	TokenNameIdentifier	 read Break Iterator
(	TokenNameLPAREN	
"Khmer.brk"	TokenNameStringLiteral	Khmer.brk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BreakIterator	TokenNameIdentifier	 Break Iterator
laoBreakIterator	TokenNameIdentifier	 lao Break Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
LaoBreakIterator	TokenNameIdentifier	 Lao Break Iterator
(	TokenNameLPAREN	
readBreakIterator	TokenNameIdentifier	 read Break Iterator
(	TokenNameLPAREN	
"Lao.brk"	TokenNameStringLiteral	Lao.brk
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BreakIterator	TokenNameIdentifier	 Break Iterator
myanmarBreakIterator	TokenNameIdentifier	 myanmar Break Iterator
=	TokenNameEQUAL	
readBreakIterator	TokenNameIdentifier	 read Break Iterator
(	TokenNameLPAREN	
"Myanmar.brk"	TokenNameStringLiteral	Myanmar.brk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
BreakIterator	TokenNameIdentifier	 Break Iterator
getBreakIterator	TokenNameIdentifier	 get Break Iterator
(	TokenNameLPAREN	
int	TokenNameint	
script	TokenNameIdentifier	 script
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
script	TokenNameIdentifier	 script
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
THAI	TokenNameIdentifier	 THAI
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
)	TokenNameRPAREN	
thaiBreakIterator	TokenNameIdentifier	 thai Break Iterator
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
HEBREW	TokenNameIdentifier	 HEBREW
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
)	TokenNameRPAREN	
hebrewBreakIterator	TokenNameIdentifier	 hebrew Break Iterator
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
KHMER	TokenNameIdentifier	 KHMER
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
)	TokenNameRPAREN	
khmerBreakIterator	TokenNameIdentifier	 khmer Break Iterator
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
LAO	TokenNameIdentifier	 LAO
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
)	TokenNameRPAREN	
laoBreakIterator	TokenNameIdentifier	 lao Break Iterator
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
MYANMAR	TokenNameIdentifier	 MYANMAR
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
)	TokenNameRPAREN	
myanmarBreakIterator	TokenNameIdentifier	 myanmar Break Iterator
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
)	TokenNameRPAREN	
rootBreakIterator	TokenNameIdentifier	 root Break Iterator
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
int	TokenNameint	
script	TokenNameIdentifier	 script
,	TokenNameCOMMA	
int	TokenNameint	
ruleStatus	TokenNameIdentifier	 rule Status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ruleStatus	TokenNameIdentifier	 rule Status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
WORD_IDEO	TokenNameIdentifier	 WORD  IDEO
:	TokenNameCOLON	
return	TokenNamereturn	
WORD_IDEO	TokenNameIdentifier	 WORD  IDEO
;	TokenNameSEMICOLON	
case	TokenNamecase	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
WORD_KANA	TokenNameIdentifier	 WORD  KANA
:	TokenNameCOLON	
return	TokenNamereturn	
script	TokenNameIdentifier	 script
==	TokenNameEQUAL_EQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
HIRAGANA	TokenNameIdentifier	 HIRAGANA
?	TokenNameQUESTION	
WORD_HIRAGANA	TokenNameIdentifier	 WORD  HIRAGANA
:	TokenNameCOLON	
WORD_KATAKANA	TokenNameIdentifier	 WORD  KATAKANA
;	TokenNameSEMICOLON	
case	TokenNamecase	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
WORD_LETTER	TokenNameIdentifier	 WORD  LETTER
:	TokenNameCOLON	
return	TokenNamereturn	
script	TokenNameIdentifier	 script
==	TokenNameEQUAL_EQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
HANGUL	TokenNameIdentifier	 HANGUL
?	TokenNameQUESTION	
WORD_HANGUL	TokenNameIdentifier	 WORD  HANGUL
:	TokenNameCOLON	
WORD_LETTER	TokenNameIdentifier	 WORD  LETTER
;	TokenNameSEMICOLON	
case	TokenNamecase	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
WORD_NUMBER	TokenNameIdentifier	 WORD  NUMBER
:	TokenNameCOLON	
return	TokenNamereturn	
WORD_NUMBER	TokenNameIdentifier	 WORD  NUMBER
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
/* some other custom code */	TokenNameCOMMENT_BLOCK	 some other custom code 
return	TokenNamereturn	
"<OTHER>"	TokenNameStringLiteral	<OTHER>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
readBreakIterator	TokenNameIdentifier	 read Break Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
DefaultICUTokenizerConfig	TokenNameIdentifier	 Default ICU Tokenizer Config
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
getInstanceFromCompiledRules	TokenNameIdentifier	 get Instance From Compiled Rules
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
