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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
;	TokenNameSEMICOLON	
/** * Tokenizer for testing. * <p> * This tokenizer is a replacement for {@link #WHITESPACE}, {@link #SIMPLE}, and {@link #KEYWORD} * tokenizers. If you are writing a component such as a TokenFilter, its a great idea to test * it wrapping this tokenizer instead for extra checks. This tokenizer has the following behavior: * <ul> * <li>An internal state-machine is used for checking consumer consistency. These checks can * be disabled with {@link #setEnableChecks(boolean)}. * <li>For convenience, optionally lowercases terms that it outputs. * </ul> */	TokenNameCOMMENT_JAVADOC	 Tokenizer for testing. <p> This tokenizer is a replacement for {@link #WHITESPACE}, {@link #SIMPLE}, and {@link #KEYWORD} tokenizers. If you are writing a component such as a TokenFilter, its a great idea to test it wrapping this tokenizer instead for extra checks. This tokenizer has the following behavior: <ul> <li>An internal state-machine is used for checking consumer consistency. These checks can be disabled with {@link #setEnableChecks(boolean)}. <li>For convenience, optionally lowercases terms that it outputs. </ul> 
public	TokenNamepublic	
class	TokenNameclass	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
/** Acts Similar to WhitespaceTokenizer */	TokenNameCOMMENT_JAVADOC	 Acts Similar to WhitespaceTokenizer 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Acts Similar to KeywordTokenizer. * TODO: Keyword returns an "empty" token for an empty reader... */	TokenNameCOMMENT_JAVADOC	 Acts Similar to KeywordTokenizer. TODO: Keyword returns an "empty" token for an empty reader... 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KEYWORD	TokenNameIdentifier	 KEYWORD
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Acts like LetterTokenizer. */	TokenNameCOMMENT_JAVADOC	 Acts like LetterTokenizer. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SIMPLE	TokenNameIdentifier	 SIMPLE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
lowerCase	TokenNameIdentifier	 lower Case
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxTokenLength	TokenNameIdentifier	 max Token Length
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_TOKEN_LENGTH	TokenNameIdentifier	 DEFAULT  MAX  TOKEN  LENGTH
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
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
int	TokenNameint	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// TODO: "register" with LuceneTestCase to ensure all streams are closed() ? 	TokenNameCOMMENT_LINE	TODO: "register" with LuceneTestCase to ensure all streams are closed() ? 
// currently, we can only check that the lifecycle is correct if someone is reusing, 	TokenNameCOMMENT_LINE	currently, we can only check that the lifecycle is correct if someone is reusing, 
// but not for "one-offs". 	TokenNameCOMMENT_LINE	but not for "one-offs". 
private	TokenNameprivate	
static	TokenNamestatic	
enum	TokenNameenum	
State	TokenNameIdentifier	 State
{	TokenNameLBRACE	
SETREADER	TokenNameIdentifier	 SETREADER
,	TokenNameCOMMA	
// consumer set a reader input either via ctor or via reset(Reader) 	TokenNameCOMMENT_LINE	consumer set a reader input either via ctor or via reset(Reader) 
RESET	TokenNameIdentifier	 RESET
,	TokenNameCOMMA	
// consumer has called reset() 	TokenNameCOMMENT_LINE	consumer has called reset() 
INCREMENT	TokenNameIdentifier	 INCREMENT
,	TokenNameCOMMA	
// consumer is consuming, has called incrementToken() == true 	TokenNameCOMMENT_LINE	consumer is consuming, has called incrementToken() == true 
INCREMENT_FALSE	TokenNameIdentifier	 INCREMENT  FALSE
,	TokenNameCOMMA	
// consumer has called incrementToken() which returned false 	TokenNameCOMMENT_LINE	consumer has called incrementToken() which returned false 
END	TokenNameIdentifier	 END
,	TokenNameCOMMA	
// consumer has called end() to perform end of stream operations 	TokenNameCOMMENT_LINE	consumer has called end() to perform end of stream operations 
CLOSE	TokenNameIdentifier	 CLOSE
// consumer has called close() to release any resources 	TokenNameCOMMENT_LINE	consumer has called close() to release any resources 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
State	TokenNameIdentifier	 State
streamState	TokenNameIdentifier	 stream State
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
CLOSE	TokenNameIdentifier	 CLOSE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
enableChecks	TokenNameIdentifier	 enable Checks
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
boolean	TokenNameboolean	
lowerCase	TokenNameIdentifier	 lower Case
,	TokenNameCOMMA	
int	TokenNameint	
maxTokenLength	TokenNameIdentifier	 max Token Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lowerCase	TokenNameIdentifier	 lower Case
=	TokenNameEQUAL	
lowerCase	TokenNameIdentifier	 lower Case
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
streamState	TokenNameIdentifier	 stream State
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
SETREADER	TokenNameIdentifier	 SETREADER
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxTokenLength	TokenNameIdentifier	 max Token Length
=	TokenNameEQUAL	
maxTokenLength	TokenNameIdentifier	 max Token Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
boolean	TokenNameboolean	
lowerCase	TokenNameIdentifier	 lower Case
,	TokenNameCOMMA	
int	TokenNameint	
maxTokenLength	TokenNameIdentifier	 max Token Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
.	TokenNameDOT	
DEFAULT_ATTRIBUTE_FACTORY	TokenNameIdentifier	 DEFAULT  ATTRIBUTE  FACTORY
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
lowerCase	TokenNameIdentifier	 lower Case
,	TokenNameCOMMA	
maxTokenLength	TokenNameIdentifier	 max Token Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
boolean	TokenNameboolean	
lowerCase	TokenNameIdentifier	 lower Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
lowerCase	TokenNameIdentifier	 lower Case
,	TokenNameCOMMA	
DEFAULT_MAX_TOKEN_LENGTH	TokenNameIdentifier	 DEFAULT  MAX  TOKEN  LENGTH
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
assert	TokenNameassert	
!	TokenNameNOT	
enableChecks	TokenNameIdentifier	 enable Checks
||	TokenNameOR_OR	
(	TokenNameLPAREN	
streamState	TokenNameIdentifier	 stream State
==	TokenNameEQUAL_EQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
RESET	TokenNameIdentifier	 RESET
||	TokenNameOR_OR	
streamState	TokenNameIdentifier	 stream State
==	TokenNameEQUAL_EQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
INCREMENT	TokenNameIdentifier	 INCREMENT
)	TokenNameRPAREN	
:	TokenNameCOLON	
"incrementToken() called while in wrong state: "	TokenNameStringLiteral	incrementToken() called while in wrong state: 
+	TokenNamePLUS	
streamState	TokenNameIdentifier	 stream State
;	TokenNameSEMICOLON	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
int	TokenNameint	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
readCodePoint	TokenNameIdentifier	 read Code Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
char	TokenNamechar	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
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
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
maxTokenLength	TokenNameIdentifier	 max Token Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
readCodePoint	TokenNameIdentifier	 read Code Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streamState	TokenNameIdentifier	 stream State
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
INCREMENT	TokenNameIdentifier	 INCREMENT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
streamState	TokenNameIdentifier	 stream State
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
INCREMENT_FALSE	TokenNameIdentifier	 INCREMENT  FALSE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
readCodePoint	TokenNameIdentifier	 read Code Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
0xffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* only on 3.x */	TokenNameCOMMENT_BLOCK	 only on 3.x 
assert	TokenNameassert	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toCodePoint	TokenNameIdentifier	 to Code Point
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
:	TokenNameCOLON	
return	TokenNamereturn	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
KEYWORD	TokenNameIdentifier	 KEYWORD
:	TokenNameCOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SIMPLE	TokenNameIdentifier	 SIMPLE
:	TokenNameCOLON	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"invalid pattern constant:"	TokenNameStringLiteral	invalid pattern constant:
+	TokenNamePLUS	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lowerCase	TokenNameIdentifier	 lower Case
?	TokenNameQUESTION	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
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
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
enableChecks	TokenNameIdentifier	 enable Checks
||	TokenNameOR_OR	
streamState	TokenNameIdentifier	 stream State
!=	TokenNameNOT_EQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
RESET	TokenNameIdentifier	 RESET
:	TokenNameCOLON	
"double reset()"	TokenNameStringLiteral	double reset()
;	TokenNameSEMICOLON	
streamState	TokenNameIdentifier	 stream State
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
RESET	TokenNameIdentifier	 RESET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// in some exceptional cases (e.g. TestIndexWriterExceptions) a test can prematurely close() 	TokenNameCOMMENT_LINE	in some exceptional cases (e.g. TestIndexWriterExceptions) a test can prematurely close() 
// these tests should disable this check, by default we check the normal workflow. 	TokenNameCOMMENT_LINE	these tests should disable this check, by default we check the normal workflow. 
// TODO: investigate the CachingTokenFilter "double-close"... for now we ignore this 	TokenNameCOMMENT_LINE	TODO: investigate the CachingTokenFilter "double-close"... for now we ignore this 
assert	TokenNameassert	
!	TokenNameNOT	
enableChecks	TokenNameIdentifier	 enable Checks
||	TokenNameOR_OR	
streamState	TokenNameIdentifier	 stream State
==	TokenNameEQUAL_EQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
END	TokenNameIdentifier	 END
||	TokenNameOR_OR	
streamState	TokenNameIdentifier	 stream State
==	TokenNameEQUAL_EQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
CLOSE	TokenNameIdentifier	 CLOSE
:	TokenNameCOLON	
"close() called in wrong state: "	TokenNameStringLiteral	close() called in wrong state: 
+	TokenNamePLUS	
streamState	TokenNameIdentifier	 stream State
;	TokenNameSEMICOLON	
streamState	TokenNameIdentifier	 stream State
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
CLOSE	TokenNameIdentifier	 CLOSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
enableChecks	TokenNameIdentifier	 enable Checks
||	TokenNameOR_OR	
streamState	TokenNameIdentifier	 stream State
==	TokenNameEQUAL_EQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
CLOSE	TokenNameIdentifier	 CLOSE
:	TokenNameCOLON	
"setReader() called in wrong state: "	TokenNameStringLiteral	setReader() called in wrong state: 
+	TokenNamePLUS	
streamState	TokenNameIdentifier	 stream State
;	TokenNameSEMICOLON	
streamState	TokenNameIdentifier	 stream State
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
SETREADER	TokenNameIdentifier	 SETREADER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
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
// some tokenizers, such as limiting tokenizers, call end() before incrementToken() returns false. 	TokenNameCOMMENT_LINE	some tokenizers, such as limiting tokenizers, call end() before incrementToken() returns false. 
// these tests should disable this check (in general you should consume the entire stream) 	TokenNameCOMMENT_LINE	these tests should disable this check (in general you should consume the entire stream) 
assert	TokenNameassert	
!	TokenNameNOT	
enableChecks	TokenNameIdentifier	 enable Checks
||	TokenNameOR_OR	
streamState	TokenNameIdentifier	 stream State
==	TokenNameEQUAL_EQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
INCREMENT_FALSE	TokenNameIdentifier	 INCREMENT  FALSE
:	TokenNameCOLON	
"end() called before incrementToken() returned false!"	TokenNameStringLiteral	end() called before incrementToken() returned false!
;	TokenNameSEMICOLON	
streamState	TokenNameIdentifier	 stream State
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Toggle consumer workflow checking: if your test consumes tokenstreams normally you * should leave this enabled. */	TokenNameCOMMENT_JAVADOC	 Toggle consumer workflow checking: if your test consumes tokenstreams normally you should leave this enabled. 
public	TokenNamepublic	
void	TokenNamevoid	
setEnableChecks	TokenNameIdentifier	 set Enable Checks
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enableChecks	TokenNameIdentifier	 enable Checks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
enableChecks	TokenNameIdentifier	 enable Checks
=	TokenNameEQUAL	
enableChecks	TokenNameIdentifier	 enable Checks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
