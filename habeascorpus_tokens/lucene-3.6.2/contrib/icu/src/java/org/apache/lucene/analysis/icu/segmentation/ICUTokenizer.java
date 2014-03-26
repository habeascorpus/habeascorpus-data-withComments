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
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
ScriptAttribute	TokenNameIdentifier	 Script Attribute
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
TypeAttribute	TokenNameIdentifier	 Type Attribute
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
UCharacter	TokenNameIdentifier	 U Character
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
/** * Breaks text into words according to UAX #29: Unicode Text Segmentation * (http://www.unicode.org/reports/tr29/) * <p> * Words are broken across script boundaries, then segmented according to * the BreakIterator and typing provided by the {@link ICUTokenizerConfig} * </p> * @see ICUTokenizerConfig * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Breaks text into words according to UAX #29: Unicode Text Segmentation (http://www.unicode.org/reports/tr29/) <p> Words are broken across script boundaries, then segmented according to the BreakIterator and typing provided by the {@link ICUTokenizerConfig} </p> @see ICUTokenizerConfig @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ICUTokenizer	TokenNameIdentifier	 ICU Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IOBUFFER	TokenNameIdentifier	 IOBUFFER
=	TokenNameEQUAL	
4096	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
IOBUFFER	TokenNameIdentifier	 IOBUFFER
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** true length of text in the buffer */	TokenNameCOMMENT_JAVADOC	 true length of text in the buffer 
private	TokenNameprivate	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** length in buffer that can be evaluated safely, up to a safe end point */	TokenNameCOMMENT_JAVADOC	 length in buffer that can be evaluated safely, up to a safe end point 
private	TokenNameprivate	
int	TokenNameint	
usableLength	TokenNameIdentifier	 usable Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** accumulated offset of previous buffers for this reader, for offsetAtt */	TokenNameCOMMENT_JAVADOC	 accumulated offset of previous buffers for this reader, for offsetAtt 
private	TokenNameprivate	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CompositeBreakIterator	TokenNameIdentifier	 Composite Break Iterator
breaker	TokenNameIdentifier	 breaker
;	TokenNameSEMICOLON	
/* tokenizes a char[] of text */	TokenNameCOMMENT_BLOCK	 tokenizes a char[] of text 
private	TokenNameprivate	
final	TokenNamefinal	
ICUTokenizerConfig	TokenNameIdentifier	 ICU Tokenizer Config
config	TokenNameIdentifier	 config
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
ScriptAttribute	TokenNameIdentifier	 Script Attribute
scriptAtt	TokenNameIdentifier	 script Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
ScriptAttribute	TokenNameIdentifier	 Script Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct a new ICUTokenizer that breaks text into words from the given * Reader. * <p> * The default script-specific handling is used. * * @param input Reader containing text to tokenize. * @see DefaultICUTokenizerConfig */	TokenNameCOMMENT_JAVADOC	 Construct a new ICUTokenizer that breaks text into words from the given Reader. <p> The default script-specific handling is used. * @param input Reader containing text to tokenize. @see DefaultICUTokenizerConfig 
public	TokenNamepublic	
ICUTokenizer	TokenNameIdentifier	 ICU Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
new	TokenNamenew	
DefaultICUTokenizerConfig	TokenNameIdentifier	 Default ICU Tokenizer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new ICUTokenizer that breaks text into words from the given * Reader, using a tailored BreakIterator configuration. * * @param input Reader containing text to tokenize. * @param config Tailored BreakIterator configuration */	TokenNameCOMMENT_JAVADOC	 Construct a new ICUTokenizer that breaks text into words from the given Reader, using a tailored BreakIterator configuration. * @param input Reader containing text to tokenize. @param config Tailored BreakIterator configuration 
public	TokenNamepublic	
ICUTokenizer	TokenNameIdentifier	 ICU Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
ICUTokenizerConfig	TokenNameIdentifier	 ICU Tokenizer Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
breaker	TokenNameIdentifier	 breaker
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeBreakIterator	TokenNameIdentifier	 Composite Break Iterator
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
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
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
incrementTokenBuffer	TokenNameIdentifier	 increment Token Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// no more bytes to read; 	TokenNameCOMMENT_LINE	no more bytes to read; 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
breaker	TokenNameIdentifier	 breaker
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
usableLength	TokenNameIdentifier	 usable Length
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
final	TokenNamefinal	
int	TokenNameint	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
offset	TokenNameIdentifier	 offset
:	TokenNameCOLON	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * This tokenizes text based upon the longest matching rule, and because of * this, isn't friendly to a Reader. * * Text is read from the input stream in 4kB chunks. Within a 4kB chunk of * text, the last unambiguous break point is found (in this implementation: * white space character) Any remaining characters represent possible partial * words, so are appended to the front of the next chunk. * * There is the possibility that there are no unambiguous break points within * an entire 4kB chunk of text (binary data). So there is a maximum word limit * of 4kB since it will not try to grow the buffer in this case. */	TokenNameCOMMENT_BLOCK	 This tokenizes text based upon the longest matching rule, and because of this, isn't friendly to a Reader. * Text is read from the input stream in 4kB chunks. Within a 4kB chunk of text, the last unambiguous break point is found (in this implementation: white space character) Any remaining characters represent possible partial words, so are appended to the front of the next chunk. * There is the possibility that there are no unambiguous break points within an entire 4kB chunk of text (binary data). So there is a maximum word limit of 4kB since it will not try to grow the buffer in this case. 
/** * Returns the last unambiguous break position in the text. * * @return position of character, or -1 if one does not exist */	TokenNameCOMMENT_JAVADOC	 Returns the last unambiguous break position in the text. * @return position of character, or -1 if one does not exist 
private	TokenNameprivate	
int	TokenNameint	
findSafeEnd	TokenNameIdentifier	 find Safe End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
UCharacter	TokenNameIdentifier	 U Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Refill the buffer, accumulating the offset and setting usableLength to the * last unambiguous break position * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Refill the buffer, accumulating the offset and setting usableLength to the last unambiguous break position * @throws IOException 
private	TokenNameprivate	
void	TokenNamevoid	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
usableLength	TokenNameIdentifier	 usable Length
;	TokenNameSEMICOLON	
int	TokenNameint	
leftover	TokenNameIdentifier	 leftover
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
usableLength	TokenNameIdentifier	 usable Length
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
usableLength	TokenNameIdentifier	 usable Length
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
leftover	TokenNameIdentifier	 leftover
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
requested	TokenNameIdentifier	 requested
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
leftover	TokenNameIdentifier	 leftover
;	TokenNameSEMICOLON	
int	TokenNameint	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
leftover	TokenNameIdentifier	 leftover
,	TokenNameCOMMA	
requested	TokenNameIdentifier	 requested
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
returned	TokenNameIdentifier	 returned
+	TokenNamePLUS	
leftover	TokenNameIdentifier	 leftover
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
returned	TokenNameIdentifier	 returned
<	TokenNameLESS	
requested	TokenNameIdentifier	 requested
)	TokenNameRPAREN	
/* reader has been emptied, process the rest */	TokenNameCOMMENT_BLOCK	 reader has been emptied, process the rest 
usableLength	TokenNameIdentifier	 usable Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
/* still more data to be read, find a safe-stopping place */	TokenNameCOMMENT_BLOCK	 still more data to be read, find a safe-stopping place 
usableLength	TokenNameIdentifier	 usable Length
=	TokenNameEQUAL	
findSafeEnd	TokenNameIdentifier	 find Safe End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
usableLength	TokenNameIdentifier	 usable Length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
usableLength	TokenNameIdentifier	 usable Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/* * more than IOBUFFER of text without space, * gonna possibly truncate tokens */	TokenNameCOMMENT_BLOCK	 more than IOBUFFER of text without space, gonna possibly truncate tokens 
}	TokenNameRBRACE	
breaker	TokenNameIdentifier	 breaker
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
usableLength	TokenNameIdentifier	 usable Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: refactor to a shared readFully somewhere 	TokenNameCOMMENT_LINE	TODO: refactor to a shared readFully somewhere 
// (NGramTokenizer does this too): 	TokenNameCOMMENT_LINE	(NGramTokenizer does this too): 
/** commons-io's readFully, but without bugs if offset != 0 */	TokenNameCOMMENT_JAVADOC	 commons-io's readFully, but without bugs if offset != 0 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"length must not be negative: "	TokenNameStringLiteral	length must not be negative: 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
remaining	TokenNameIdentifier	 remaining
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EOF 	TokenNameCOMMENT_LINE	EOF 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
remaining	TokenNameIdentifier	 remaining
-=	TokenNameMINUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * return true if there is a token from the buffer, or null if it is * exhausted. */	TokenNameCOMMENT_BLOCK	 return true if there is a token from the buffer, or null if it is exhausted. 
private	TokenNameprivate	
boolean	TokenNameboolean	
incrementTokenBuffer	TokenNameIdentifier	 increment Token Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
breaker	TokenNameIdentifier	 breaker
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// BreakIterator exhausted 	TokenNameCOMMENT_LINE	BreakIterator exhausted 
// find the next set of boundaries, skipping over non-tokens (rule status 0) 	TokenNameCOMMENT_LINE	find the next set of boundaries, skipping over non-tokens (rule status 0) 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
breaker	TokenNameIdentifier	 breaker
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
&&	TokenNameAND_AND	
breaker	TokenNameIdentifier	 breaker
.	TokenNameDOT	
getRuleStatus	TokenNameIdentifier	 get Rule Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
breaker	TokenNameIdentifier	 breaker
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// BreakIterator exhausted 	TokenNameCOMMENT_LINE	BreakIterator exhausted 
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
breaker	TokenNameIdentifier	 breaker
.	TokenNameDOT	
getScriptCode	TokenNameIdentifier	 get Script Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
breaker	TokenNameIdentifier	 breaker
.	TokenNameDOT	
getRuleStatus	TokenNameIdentifier	 get Rule Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scriptAtt	TokenNameIdentifier	 script Att
.	TokenNameDOT	
setCode	TokenNameIdentifier	 set Code
(	TokenNameLPAREN	
breaker	TokenNameIdentifier	 breaker
.	TokenNameDOT	
getScriptCode	TokenNameIdentifier	 get Script Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
