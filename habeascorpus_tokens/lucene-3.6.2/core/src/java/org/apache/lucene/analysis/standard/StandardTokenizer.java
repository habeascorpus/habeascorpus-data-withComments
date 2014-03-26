/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
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
Tokenizer	TokenNameIdentifier	 Tokenizer
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
std31	TokenNameIdentifier	 std31
.	TokenNameDOT	
StandardTokenizerImpl31	TokenNameIdentifier	 Standard Tokenizer Impl31
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
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
AttributeSource	TokenNameIdentifier	 Attribute Source
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
/** A grammar-based tokenizer constructed with JFlex. * <p> * As of Lucene version 3.1, this class implements the Word Break rules from the * Unicode Text Segmentation algorithm, as specified in * <a href="http://unicode.org/reports/tr29/">Unicode Standard Annex #29</a>. * <p/> * <p>Many applications have specific tokenizer needs. If this tokenizer does * not suit your application, please consider copying this source code * directory to your project and maintaining your own grammar-based tokenizer. * * <a name="version"/> * <p>You must specify the required {@link Version} * compatibility when creating StandardTokenizer: * <ul> * <li> As of 3.4, Hiragana and Han characters are no longer wrongly split * from their combining characters. If you use a previous version number, * you get the exact broken behavior for backwards compatibility. * <li> As of 3.1, StandardTokenizer implements Unicode text segmentation. * If you use a previous version number, you get the exact behavior of * {@link ClassicTokenizer} for backwards compatibility. * </ul> */	TokenNameCOMMENT_JAVADOC	 A grammar-based tokenizer constructed with JFlex. <p> As of Lucene version 3.1, this class implements the Word Break rules from the Unicode Text Segmentation algorithm, as specified in <a href="http://unicode.org/reports/tr29/">Unicode Standard Annex #29</a>. <p/> <p>Many applications have specific tokenizer needs. If this tokenizer does not suit your application, please consider copying this source code directory to your project and maintaining your own grammar-based tokenizer. * <a name="version"/> <p>You must specify the required {@link Version} compatibility when creating StandardTokenizer: <ul> <li> As of 3.4, Hiragana and Han characters are no longer wrongly split from their combining characters. If you use a previous version number, you get the exact broken behavior for backwards compatibility. <li> As of 3.1, StandardTokenizer implements Unicode text segmentation. If you use a previous version number, you get the exact behavior of {@link ClassicTokenizer} for backwards compatibility. </ul> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
/** A private instance of the JFlex-constructed scanner */	TokenNameCOMMENT_JAVADOC	 A private instance of the JFlex-constructed scanner 
private	TokenNameprivate	
StandardTokenizerInterface	TokenNameIdentifier	 Standard Tokenizer Interface
scanner	TokenNameIdentifier	 scanner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALPHANUM	TokenNameIdentifier	 ALPHANUM
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** @deprecated */	TokenNameCOMMENT_JAVADOC	 @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
APOSTROPHE	TokenNameIdentifier	 APOSTROPHE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** @deprecated */	TokenNameCOMMENT_JAVADOC	 @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ACRONYM	TokenNameIdentifier	 ACRONYM
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** @deprecated */	TokenNameCOMMENT_JAVADOC	 @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPANY	TokenNameIdentifier	 COMPANY
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EMAIL	TokenNameIdentifier	 EMAIL
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** @deprecated */	TokenNameCOMMENT_JAVADOC	 @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HOST	TokenNameIdentifier	 HOST
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUM	TokenNameIdentifier	 NUM
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** @deprecated */	TokenNameCOMMENT_JAVADOC	 @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CJ	TokenNameIdentifier	 CJ
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * @deprecated this solves a bug where HOSTs that end with '.' are identified * as ACRONYMs. */	TokenNameCOMMENT_JAVADOC	 @deprecated this solves a bug where HOSTs that end with '.' are identified as ACRONYMs. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ACRONYM_DEP	TokenNameIdentifier	 ACRONYM  DEP
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SOUTHEAST_ASIAN	TokenNameIdentifier	 SOUTHEAST  ASIAN
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IDEOGRAPHIC	TokenNameIdentifier	 IDEOGRAPHIC
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HIRAGANA	TokenNameIdentifier	 HIRAGANA
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KATAKANA	TokenNameIdentifier	 KATAKANA
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HANGUL	TokenNameIdentifier	 HANGUL
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** String token types that correspond to token type int constants */	TokenNameCOMMENT_JAVADOC	 String token types that correspond to token type int constants 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<APOSTROPHE>"	TokenNameStringLiteral	<APOSTROPHE>
,	TokenNameCOMMA	
"<ACRONYM>"	TokenNameStringLiteral	<ACRONYM>
,	TokenNameCOMMA	
"<COMPANY>"	TokenNameStringLiteral	<COMPANY>
,	TokenNameCOMMA	
"<EMAIL>"	TokenNameStringLiteral	<EMAIL>
,	TokenNameCOMMA	
"<HOST>"	TokenNameStringLiteral	<HOST>
,	TokenNameCOMMA	
"<NUM>"	TokenNameStringLiteral	<NUM>
,	TokenNameCOMMA	
"<CJ>"	TokenNameStringLiteral	<CJ>
,	TokenNameCOMMA	
"<ACRONYM_DEP>"	TokenNameStringLiteral	<ACRONYM_DEP>
,	TokenNameCOMMA	
"<SOUTHEAST_ASIAN>"	TokenNameStringLiteral	<SOUTHEAST_ASIAN>
,	TokenNameCOMMA	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
,	TokenNameCOMMA	
"<HIRAGANA>"	TokenNameStringLiteral	<HIRAGANA>
,	TokenNameCOMMA	
"<KATAKANA>"	TokenNameStringLiteral	<KATAKANA>
,	TokenNameCOMMA	
"<HANGUL>"	TokenNameStringLiteral	<HANGUL>
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxTokenLength	TokenNameIdentifier	 max Token Length
=	TokenNameEQUAL	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
.	TokenNameDOT	
DEFAULT_MAX_TOKEN_LENGTH	TokenNameIdentifier	 DEFAULT  MAX  TOKEN  LENGTH
;	TokenNameSEMICOLON	
/** Set the max allowed token length. Any token longer * than this is skipped. */	TokenNameCOMMENT_JAVADOC	 Set the max allowed token length. Any token longer than this is skipped. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxTokenLength	TokenNameIdentifier	 set Max Token Length
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxTokenLength	TokenNameIdentifier	 max Token Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setMaxTokenLength */	TokenNameCOMMENT_JAVADOC	 @see #setMaxTokenLength 
public	TokenNamepublic	
int	TokenNameint	
getMaxTokenLength	TokenNameIdentifier	 get Max Token Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxTokenLength	TokenNameIdentifier	 max Token Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new instance of the {@link org.apache.lucene.analysis.standard.StandardTokenizer}. Attaches * the <code>input</code> to the newly created JFlex scanner. * * @param input The input reader * * See http://issues.apache.org/jira/browse/LUCENE-1068 */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of the {@link org.apache.lucene.analysis.standard.StandardTokenizer}. Attaches the <code>input</code> to the newly created JFlex scanner. * @param input The input reader * See http://issues.apache.org/jira/browse/LUCENE-1068 
public	TokenNamepublic	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new StandardTokenizer with a given {@link AttributeSource}. */	TokenNameCOMMENT_JAVADOC	 Creates a new StandardTokenizer with a given {@link AttributeSource}. 
public	TokenNamepublic	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new StandardTokenizer with a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory} */	TokenNameCOMMENT_JAVADOC	 Creates a new StandardTokenizer with a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory} 
public	TokenNamepublic	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_34	TokenNameIdentifier	 LUCENE 34
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
StandardTokenizerImpl	TokenNameIdentifier	 Standard Tokenizer Impl
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
StandardTokenizerImpl31	TokenNameIdentifier	 Standard Tokenizer Impl31
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicTokenizerImpl	TokenNameIdentifier	 Classic Tokenizer Impl
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_24	TokenNameIdentifier	 LUCENE 24
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// this tokenizer generates three attributes: 	TokenNameCOMMENT_LINE	this tokenizer generates three attributes: 
// term offset, positionIncrement and type 	TokenNameCOMMENT_LINE	term offset, positionIncrement and type 
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
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
/* * (non-Javadoc) * * @see org.apache.lucene.analysis.TokenStream#next() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.analysis.TokenStream#next() 
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
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
posIncr	TokenNameIdentifier	 pos Incr
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tokenType	TokenNameIdentifier	 token Type
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getNextToken	TokenNameIdentifier	 get Next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenType	TokenNameIdentifier	 token Type
==	TokenNameEQUAL_EQUAL	
StandardTokenizerInterface	TokenNameIdentifier	 Standard Tokenizer Interface
.	TokenNameDOT	
YYEOF	TokenNameIdentifier	 YYEOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yylength	TokenNameIdentifier	 yylength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
maxTokenLength	TokenNameIdentifier	 max Token Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
posIncr	TokenNameIdentifier	 pos Incr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yychar	TokenNameIdentifier	 yychar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This 'if' should be removed in the next release. For now, it converts 	TokenNameCOMMENT_LINE	This 'if' should be removed in the next release. For now, it converts 
// invalid acronyms to HOST. When removed, only the 'else' part should 	TokenNameCOMMENT_LINE	invalid acronyms to HOST. When removed, only the 'else' part should 
// remain. 	TokenNameCOMMENT_LINE	remain. 
if	TokenNameif	
(	TokenNameLPAREN	
tokenType	TokenNameIdentifier	 token Type
==	TokenNameEQUAL_EQUAL	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
ACRONYM_DEP	TokenNameIdentifier	 ACRONYM  DEP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
)	TokenNameRPAREN	
{	TokenNameLBRACE	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
HOST	TokenNameIdentifier	 HOST
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove extra '.' 	TokenNameCOMMENT_LINE	remove extra '.' 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
ACRONYM	TokenNameIdentifier	 ACRONYM
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
tokenType	TokenNameIdentifier	 token Type
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// When we skip a too-long term, we still increment the 	TokenNameCOMMENT_LINE	When we skip a too-long term, we still increment the 
// position increment 	TokenNameCOMMENT_LINE	position increment 
posIncr	TokenNameIdentifier	 pos Incr
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set final offset 	TokenNameCOMMENT_LINE	set final offset 
int	TokenNameint	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yychar	TokenNameIdentifier	 yychar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yylength	TokenNameIdentifier	 yylength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
finalOffset	TokenNameIdentifier	 final Offset
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
yyreset	TokenNameIdentifier	 yyreset
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prior to https://issues.apache.org/jira/browse/LUCENE-1068, StandardTokenizer mischaracterized as acronyms tokens like www.abc.com * when they should have been labeled as hosts instead. * @return true if StandardTokenizer now returns these tokens as Hosts, otherwise false * * @deprecated Remove in 3.X and make true the only valid value */	TokenNameCOMMENT_JAVADOC	 Prior to https://issues.apache.org/jira/browse/LUCENE-1068, StandardTokenizer mischaracterized as acronyms tokens like www.abc.com when they should have been labeled as hosts instead. @return true if StandardTokenizer now returns these tokens as Hosts, otherwise false * @deprecated Remove in 3.X and make true the only valid value 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
boolean	TokenNameboolean	
isReplaceInvalidAcronym	TokenNameIdentifier	 is Replace Invalid Acronym
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param replaceInvalidAcronym Set to true to replace mischaracterized acronyms as HOST. * @deprecated Remove in 3.X and make true the only valid value * * See https://issues.apache.org/jira/browse/LUCENE-1068 */	TokenNameCOMMENT_JAVADOC	 * @param replaceInvalidAcronym Set to true to replace mischaracterized acronyms as HOST. @deprecated Remove in 3.X and make true the only valid value * See https://issues.apache.org/jira/browse/LUCENE-1068 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setReplaceInvalidAcronym	TokenNameIdentifier	 set Replace Invalid Acronym
(	TokenNameLPAREN	
boolean	TokenNameboolean	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
=	TokenNameEQUAL	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
