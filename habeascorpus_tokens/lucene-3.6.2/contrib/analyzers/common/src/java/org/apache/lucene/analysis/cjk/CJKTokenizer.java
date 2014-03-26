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
/** * CJKTokenizer is designed for Chinese, Japanese, and Korean languages. * <p> * The tokens returned are every two adjacent characters with overlap match. * </p> * <p> * Example: "java C1C2C3C4" will be segmented to: "java" "C1C2" "C2C3" "C3C4". * </p> * Additionally, the following is applied to Latin text (such as English): * <ul> * <li>Text is converted to lowercase. * <li>Numeric digits, '+', '#', and '_' are tokenized as letters. * <li>Full-width forms are converted to half-width forms. * </ul> * For more info on Asian language (Chinese, Japanese, and Korean) text segmentation: * please search <a * href="http://www.google.com/search?q=word+chinese+segment">google</a> * * @deprecated Use StandardTokenizer, CJKWidthFilter, CJKBigramFilter, and LowerCaseFilter instead. */	TokenNameCOMMENT_JAVADOC	 CJKTokenizer is designed for Chinese, Japanese, and Korean languages. <p> The tokens returned are every two adjacent characters with overlap match. </p> <p> Example: "java C1C2C3C4" will be segmented to: "java" "C1C2" "C2C3" "C3C4". </p> Additionally, the following is applied to Latin text (such as English): <ul> <li>Text is converted to lowercase. <li>Numeric digits, '+', '#', and '_' are tokenized as letters. <li>Full-width forms are converted to half-width forms. </ul> For more info on Asian language (Chinese, Japanese, and Korean) text segmentation: please search <a href="http://www.google.com/search?q=word+chinese+segment">google</a> * @deprecated Use StandardTokenizer, CJKWidthFilter, CJKBigramFilter, and LowerCaseFilter instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
//~ Static fields/initializers --------------------------------------------- 	TokenNameCOMMENT_LINE	~ Static fields/initializers --------------------------------------------- 
/** Word token type */	TokenNameCOMMENT_JAVADOC	 Word token type 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WORD_TYPE	TokenNameIdentifier	 WORD  TYPE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Single byte token type */	TokenNameCOMMENT_JAVADOC	 Single byte token type 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Double byte token type */	TokenNameCOMMENT_JAVADOC	 Double byte token type 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Names for token types */	TokenNameCOMMENT_JAVADOC	 Names for token types 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TOKEN_TYPE_NAMES	TokenNameIdentifier	 TOKEN  TYPE  NAMES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"single"	TokenNameStringLiteral	single
,	TokenNameCOMMA	
"double"	TokenNameStringLiteral	double
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Max word length */	TokenNameCOMMENT_JAVADOC	 Max word length 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_WORD_LEN	TokenNameIdentifier	 MAX  WORD  LEN
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** buffer size: */	TokenNameCOMMENT_JAVADOC	 buffer size: 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IO_BUFFER_SIZE	TokenNameIdentifier	 IO  BUFFER  SIZE
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//~ Instance fields -------------------------------------------------------- 	TokenNameCOMMENT_LINE	~ Instance fields -------------------------------------------------------- 
/** word offset, used to imply which character(in ) is parsed */	TokenNameCOMMENT_JAVADOC	 word offset, used to imply which character(in ) is parsed 
private	TokenNameprivate	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** the index used only for ioBuffer */	TokenNameCOMMENT_JAVADOC	 the index used only for ioBuffer 
private	TokenNameprivate	
int	TokenNameint	
bufferIndex	TokenNameIdentifier	 buffer Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** data length */	TokenNameCOMMENT_JAVADOC	 data length 
private	TokenNameprivate	
int	TokenNameint	
dataLen	TokenNameIdentifier	 data Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * character buffer, store the characters which are used to compose <br> * the returned Token */	TokenNameCOMMENT_JAVADOC	 character buffer, store the characters which are used to compose <br> the returned Token 
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
MAX_WORD_LEN	TokenNameIdentifier	 MAX  WORD  LEN
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * I/O buffer, used to store the content of the input(one of the <br> * members of Tokenizer) */	TokenNameCOMMENT_JAVADOC	 I/O buffer, used to store the content of the input(one of the <br> members of Tokenizer) 
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ioBuffer	TokenNameIdentifier	 io Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
IO_BUFFER_SIZE	TokenNameIdentifier	 IO  BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** word type: single=>ASCII double=>non-ASCII word=>default */	TokenNameCOMMENT_JAVADOC	 word type: single=>ASCII double=>non-ASCII word=>default 
private	TokenNameprivate	
int	TokenNameint	
tokenType	TokenNameIdentifier	 token Type
=	TokenNameEQUAL	
WORD_TYPE	TokenNameIdentifier	 WORD  TYPE
;	TokenNameSEMICOLON	
/** * tag: previous character is a cached double-byte character "C1C2C3C4" * ----(set the C1 isTokened) C1C2 "C2C3C4" ----(set the C2 isTokened) * C1C2 C2C3 "C3C4" ----(set the C3 isTokened) "C1C2 C2C3 C3C4" */	TokenNameCOMMENT_JAVADOC	 tag: previous character is a cached double-byte character "C1C2C3C4" ----(set the C1 isTokened) C1C2 "C2C3C4" ----(set the C2 isTokened) C1C2 C2C3 "C3C4" ----(set the C3 isTokened) "C1C2 C2C3 C3C4" 
private	TokenNameprivate	
boolean	TokenNameboolean	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
=	TokenNameEQUAL	
false	TokenNamefalse	
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
//~ Constructors ----------------------------------------------------------- 	TokenNameCOMMENT_LINE	~ Constructors ----------------------------------------------------------- 
/** * Construct a token stream processing the given input. * * @param in I/O reader */	TokenNameCOMMENT_JAVADOC	 Construct a token stream processing the given input. * @param in I/O reader 
public	TokenNamepublic	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//~ Methods ---------------------------------------------------------------- 	TokenNameCOMMENT_LINE	~ Methods ---------------------------------------------------------------- 
/** * Returns true for the next token in the stream, or false at EOS. * See http://java.sun.com/j2se/1.3/docs/api/java/lang/Character.UnicodeBlock.html * for detail. * * @return false for end of stream, true otherwise * * @throws java.io.IOException - throw IOException when read error <br> * happened in the InputStream * */	TokenNameCOMMENT_JAVADOC	 Returns true for the next token in the stream, or false at EOS. See http://java.sun.com/j2se/1.3/docs/api/java/lang/Character.UnicodeBlock.html for detail. * @return false for end of stream, true otherwise * @throws java.io.IOException - throw IOException when read error <br> happened in the InputStream 
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
/** how many character(s) has been stored in buffer */	TokenNameCOMMENT_JAVADOC	 how many character(s) has been stored in buffer 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// loop until we find a non-empty token 	TokenNameCOMMENT_LINE	loop until we find a non-empty token 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** the position used to create Token */	TokenNameCOMMENT_JAVADOC	 the position used to create Token 
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// loop until we've found a full token 	TokenNameCOMMENT_LINE	loop until we've found a full token 
/** current character */	TokenNameCOMMENT_JAVADOC	 current character 
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
/** unicode block of current character for detail */	TokenNameCOMMENT_JAVADOC	 unicode block of current character for detail 
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
ub	TokenNameIdentifier	 ub
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bufferIndex	TokenNameIdentifier	 buffer Index
>=	TokenNameGREATER_EQUAL	
dataLen	TokenNameIdentifier	 data Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataLen	TokenNameIdentifier	 data Len
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
ioBuffer	TokenNameIdentifier	 io Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferIndex	TokenNameIdentifier	 buffer Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dataLen	TokenNameIdentifier	 data Len
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//get current character 	TokenNameCOMMENT_LINE	get current character 
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ioBuffer	TokenNameIdentifier	 io Buffer
[	TokenNameLBRACKET	
bufferIndex	TokenNameIdentifier	 buffer Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//get the UnicodeBlock of the current character 	TokenNameCOMMENT_LINE	get the UnicodeBlock of the current character 
ub	TokenNameIdentifier	 ub
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//if the current character is ASCII or Extend ASCII 	TokenNameCOMMENT_LINE	if the current character is ASCII or Extend ASCII 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
.	TokenNameDOT	
BASIC_LATIN	TokenNameIdentifier	 BASIC  LATIN
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
.	TokenNameDOT	
HALFWIDTH_AND_FULLWIDTH_FORMS	TokenNameIdentifier	 HALFWIDTH  AND  FULLWIDTH  FORMS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
.	TokenNameDOT	
HALFWIDTH_AND_FULLWIDTH_FORMS	TokenNameIdentifier	 HALFWIDTH  AND  FULLWIDTH  FORMS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
65281	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
65374	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// convert certain HALFWIDTH_AND_FULLWIDTH_FORMS to BASIC_LATIN 	TokenNameCOMMENT_LINE	convert certain HALFWIDTH_AND_FULLWIDTH_FORMS to BASIC_LATIN 
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
65248	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if the current character is a letter or "_" "+" "#" 	TokenNameCOMMENT_LINE	if the current character is a letter or "_" "+" "#" 
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "javaC1C2C3C4linux" <br> 	TokenNameCOMMENT_LINE	"javaC1C2C3C4linux" <br> 
// ^--: the current character begin to token the ASCII 	TokenNameCOMMENT_LINE	^--: the current character begin to token the ASCII 
// letter 	TokenNameCOMMENT_LINE	letter 
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenType	TokenNameIdentifier	 token Type
==	TokenNameEQUAL_EQUAL	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "javaC1C2C3C4linux" <br> 	TokenNameCOMMENT_LINE	"javaC1C2C3C4linux" <br> 
// ^--: the previous non-ASCII 	TokenNameCOMMENT_LINE	^--: the previous non-ASCII 
// : the current character 	TokenNameCOMMENT_LINE	: the current character 
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
bufferIndex	TokenNameIdentifier	 buffer Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// there is only one non-ASCII has been stored 	TokenNameCOMMENT_LINE	there is only one non-ASCII has been stored 
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// store the LowerCase(c) in the buffer 	TokenNameCOMMENT_LINE	store the LowerCase(c) in the buffer 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenType	TokenNameIdentifier	 token Type
=	TokenNameEQUAL	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
;	TokenNameSEMICOLON	
// break the procedure if buffer overflowed! 	TokenNameCOMMENT_LINE	break the procedure if buffer overflowed! 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
MAX_WORD_LEN	TokenNameIdentifier	 MAX  WORD  LEN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// non-ASCII letter, e.g."C1C2C3C4" 	TokenNameCOMMENT_LINE	non-ASCII letter, e.g."C1C2C3C4" 
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
tokenType	TokenNameIdentifier	 token Type
=	TokenNameEQUAL	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenType	TokenNameIdentifier	 token Type
==	TokenNameEQUAL_EQUAL	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
bufferIndex	TokenNameIdentifier	 buffer Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
//return the previous ASCII characters 	TokenNameCOMMENT_LINE	return the previous ASCII characters 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
tokenType	TokenNameIdentifier	 token Type
=	TokenNameEQUAL	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
bufferIndex	TokenNameIdentifier	 buffer Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty the buffer 	TokenNameCOMMENT_LINE	empty the buffer 
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
TOKEN_TYPE_NAMES	TokenNameIdentifier	 TOKEN  TYPE  NAMES
[	TokenNameLBRACKET	
tokenType	TokenNameIdentifier	 token Type
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dataLen	TokenNameIdentifier	 data Len
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Cycle back and try for the next token (don't 	TokenNameCOMMENT_LINE	Cycle back and try for the next token (don't 
// return an empty string) 	TokenNameCOMMENT_LINE	return an empty string) 
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
final	TokenNamefinal	
int	TokenNameint	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
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
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
bufferIndex	TokenNameIdentifier	 buffer Index
=	TokenNameEQUAL	
dataLen	TokenNameIdentifier	 data Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
preIsTokened	TokenNameIdentifier	 pre Is Tokened
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
tokenType	TokenNameIdentifier	 token Type
=	TokenNameEQUAL	
WORD_TYPE	TokenNameIdentifier	 WORD  TYPE
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
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
