package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
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
Analyzer	TokenNameIdentifier	 Analyzer
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
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
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
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
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
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
Token	TokenNameIdentifier	 Token
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
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
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
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ShingleFilterTest	TokenNameIdentifier	 Shingle Filter Test
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
class	TokenNameclass	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
protected	TokenNameprotected	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testToken	TokenNameIdentifier	 test Token
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testToken	TokenNameIdentifier	 test Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
testToken	TokenNameIdentifier	 test Token
=	TokenNameEQUAL	
testToken	TokenNameIdentifier	 test Token
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
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
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
testToken	TokenNameIdentifier	 test Token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
testToken	TokenNameIdentifier	 test Token
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
UNIGRAM_ONLY_POSITION_INCREMENTS	TokenNameIdentifier	 UNIGRAM  ONLY  POSITION  INCREMENTS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
UNIGRAM_ONLY_TYPES	TokenNameIdentifier	 UNIGRAM  ONLY  TYPES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testTokenWithHoles	TokenNameIdentifier	 test Token With Holes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TOKENS	TokenNameIdentifier	 BI  GRAM  TOKENS
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_POSITION_INCREMENTS	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TYPES	TokenNameIdentifier	 BI  GRAM  TYPES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TOKENS_WITH_HOLES	TokenNameIdentifier	 BI  GRAM  TOKENS  WITH  HOLES
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide _"	TokenNameStringLiteral	divide _
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ sentence"	TokenNameStringLiteral	_ sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence _"	TokenNameStringLiteral	sentence _
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ shingles"	TokenNameStringLiteral	_ shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_POSITION_INCREMENTS_WITH_HOLES	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITH  HOLES
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TYPES_WITH_HOLES	TokenNameIdentifier	 BI  GRAM  TYPES  WITH  HOLES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TOKENS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  TOKENS  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TYPES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  TYPES  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TOKENS_WITH_HOLES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  TOKENS  WITH  HOLES  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide _"	TokenNameStringLiteral	divide _
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ sentence"	TokenNameStringLiteral	_ sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence _"	TokenNameStringLiteral	sentence _
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ shingles"	TokenNameStringLiteral	_ shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_POSITION_INCREMENTS_WITH_HOLES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITH  HOLES  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TEST_SINGLE_TOKEN	TokenNameIdentifier	 TEST  SINGLE  TOKEN
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SINGLE_TOKEN	TokenNameIdentifier	 SINGLE  TOKEN
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SINGLE_TOKEN_INCREMENTS	TokenNameIdentifier	 SINGLE  TOKEN  INCREMENTS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SINGLE_TOKEN_TYPES	TokenNameIdentifier	 SINGLE  TOKEN  TYPES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_TOKEN_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  ARRAY
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_TOKEN_INCREMENTS_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  INCREMENTS  ARRAY
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_TOKEN_TYPES_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  TYPES  ARRAY
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS	TokenNameIdentifier	 TRI  GRAM  TOKENS
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES	TokenNameIdentifier	 TRI  GRAM  TYPES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TOKENS  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TYPES  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TOKENS	TokenNameIdentifier	 FOUR  GRAM  TOKENS
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this sentence"	TokenNameStringLiteral	please divide this sentence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence into"	TokenNameStringLiteral	divide this sentence into
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into shingles"	TokenNameStringLiteral	this sentence into shingles
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_POSITION_INCREMENTS	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TYPES	TokenNameIdentifier	 FOUR  GRAM  TYPES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TOKENS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 FOUR  GRAM  TOKENS  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this sentence"	TokenNameStringLiteral	please divide this sentence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence into"	TokenNameStringLiteral	divide this sentence into
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into shingles"	TokenNameStringLiteral	this sentence into shingles
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TYPES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 FOUR  GRAM  TYPES  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  TOKENS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  TYPES  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  TOKENS  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  TYPES  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TOKENS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  TOKENS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this sentence"	TokenNameStringLiteral	please divide this sentence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence into"	TokenNameStringLiteral	divide this sentence into
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into shingles"	TokenNameStringLiteral	this sentence into shingles
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_POSITION_INCREMENTS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TYPES_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  TYPES  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TOKENS_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  TOKENS  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this sentence"	TokenNameStringLiteral	please divide this sentence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence into"	TokenNameStringLiteral	divide this sentence into
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into shingles"	TokenNameStringLiteral	this sentence into shingles
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TYPES_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  TYPES  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TOKENS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  TOKENS  MIN  FOUR  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this sentence"	TokenNameStringLiteral	please divide this sentence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence into"	TokenNameStringLiteral	divide this sentence into
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into shingles"	TokenNameStringLiteral	this sentence into shingles
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_POSITION_INCREMENTS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  MIN  FOUR  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TYPES_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  TYPES  MIN  FOUR  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TOKENS_WITHOUT_UNIGRAMS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  TOKENS  WITHOUT  UNIGRAMS  MIN  FOUR  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this sentence"	TokenNameStringLiteral	please divide this sentence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence into"	TokenNameStringLiteral	divide this sentence into
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into shingles"	TokenNameStringLiteral	this sentence into shingles
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  MIN  FOUR  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FOUR_GRAM_TYPES_WITHOUT_UNIGRAMS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  TYPES  WITHOUT  UNIGRAMS  MIN  FOUR  GRAM
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TOKENS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TOKENS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"pleasedivide"	TokenNameStringLiteral	pleasedivide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"dividethis"	TokenNameStringLiteral	dividethis
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"thissentence"	TokenNameStringLiteral	thissentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentenceinto"	TokenNameStringLiteral	sentenceinto
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"intoshingles"	TokenNameStringLiteral	intoshingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_POSITION_INCREMENTS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TYPES_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TYPES  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TOKENS_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TOKENS  WITHOUT  UNIGRAMS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"pleasedivide"	TokenNameStringLiteral	pleasedivide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"dividethis"	TokenNameStringLiteral	dividethis
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"thissentence"	TokenNameStringLiteral	thissentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentenceinto"	TokenNameStringLiteral	sentenceinto
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"intoshingles"	TokenNameStringLiteral	intoshingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TYPES_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TYPES  WITHOUT  UNIGRAMS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"pleasedivide"	TokenNameStringLiteral	pleasedivide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"pleasedividethis"	TokenNameStringLiteral	pleasedividethis
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"dividethis"	TokenNameStringLiteral	dividethis
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"dividethissentence"	TokenNameStringLiteral	dividethissentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"thissentence"	TokenNameStringLiteral	thissentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"thissentenceinto"	TokenNameStringLiteral	thissentenceinto
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentenceinto"	TokenNameStringLiteral	sentenceinto
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentenceintoshingles"	TokenNameStringLiteral	sentenceintoshingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"intoshingles"	TokenNameStringLiteral	intoshingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  WITHOUT  UNIGRAMS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"pleasedivide"	TokenNameStringLiteral	pleasedivide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"pleasedividethis"	TokenNameStringLiteral	pleasedividethis
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"dividethis"	TokenNameStringLiteral	dividethis
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"dividethissentence"	TokenNameStringLiteral	dividethissentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"thissentence"	TokenNameStringLiteral	thissentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"thissentenceinto"	TokenNameStringLiteral	thissentenceinto
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentenceinto"	TokenNameStringLiteral	sentenceinto
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentenceintoshingles"	TokenNameStringLiteral	sentenceintoshingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"intoshingles"	TokenNameStringLiteral	intoshingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  WITHOUT  UNIGRAMS  NO  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TOKENS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TOKENS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please<SEP>divide"	TokenNameStringLiteral	please<SEP>divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide<SEP>this"	TokenNameStringLiteral	divide<SEP>this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this<SEP>sentence"	TokenNameStringLiteral	this<SEP>sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence<SEP>into"	TokenNameStringLiteral	sentence<SEP>into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into<SEP>shingles"	TokenNameStringLiteral	into<SEP>shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_POSITION_INCREMENTS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TYPES_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TYPES  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TOKENS_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TOKENS  WITHOUT  UNIGRAMS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please<SEP>divide"	TokenNameStringLiteral	please<SEP>divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide<SEP>this"	TokenNameStringLiteral	divide<SEP>this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this<SEP>sentence"	TokenNameStringLiteral	this<SEP>sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence<SEP>into"	TokenNameStringLiteral	sentence<SEP>into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into<SEP>shingles"	TokenNameStringLiteral	into<SEP>shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BI_GRAM_TYPES_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TYPES  WITHOUT  UNIGRAMS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please<SEP>divide"	TokenNameStringLiteral	please<SEP>divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please<SEP>divide<SEP>this"	TokenNameStringLiteral	please<SEP>divide<SEP>this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide<SEP>this"	TokenNameStringLiteral	divide<SEP>this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide<SEP>this<SEP>sentence"	TokenNameStringLiteral	divide<SEP>this<SEP>sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this<SEP>sentence"	TokenNameStringLiteral	this<SEP>sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this<SEP>sentence<SEP>into"	TokenNameStringLiteral	this<SEP>sentence<SEP>into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence<SEP>into"	TokenNameStringLiteral	sentence<SEP>into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence<SEP>into<SEP>shingles"	TokenNameStringLiteral	sentence<SEP>into<SEP>shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into<SEP>shingles"	TokenNameStringLiteral	into<SEP>shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  WITHOUT  UNIGRAMS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please<SEP>divide"	TokenNameStringLiteral	please<SEP>divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please<SEP>divide<SEP>this"	TokenNameStringLiteral	please<SEP>divide<SEP>this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide<SEP>this"	TokenNameStringLiteral	divide<SEP>this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide<SEP>this<SEP>sentence"	TokenNameStringLiteral	divide<SEP>this<SEP>sentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this<SEP>sentence"	TokenNameStringLiteral	this<SEP>sentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this<SEP>sentence<SEP>into"	TokenNameStringLiteral	this<SEP>sentence<SEP>into
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence<SEP>into"	TokenNameStringLiteral	sentence<SEP>into
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence<SEP>into<SEP>shingles"	TokenNameStringLiteral	sentence<SEP>into<SEP>shingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into<SEP>shingles"	TokenNameStringLiteral	into<SEP>shingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  WITHOUT  UNIGRAMS  ALT  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_NULL_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  NULL  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"pleasedivide"	TokenNameStringLiteral	pleasedivide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"pleasedividethis"	TokenNameStringLiteral	pleasedividethis
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"dividethis"	TokenNameStringLiteral	dividethis
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"dividethissentence"	TokenNameStringLiteral	dividethissentence
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"thissentence"	TokenNameStringLiteral	thissentence
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"thissentenceinto"	TokenNameStringLiteral	thissentenceinto
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentenceinto"	TokenNameStringLiteral	sentenceinto
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentenceintoshingles"	TokenNameStringLiteral	sentenceintoshingles
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"intoshingles"	TokenNameStringLiteral	intoshingles
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_NULL_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  NULL  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_NULL_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  NULL  SEPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TEST_TOKEN_POS_INCR_EQUAL_TO_N	TokenNameIdentifier	 TEST  TOKEN  POS  INCR  EQUAL  TO  N
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
49	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_POS_INCR_EQUAL_TO_N	TokenNameIdentifier	 TRI  GRAM  TOKENS  POS  INCR  EQUAL  TO  N
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this _"	TokenNameStringLiteral	divide this _
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this _"	TokenNameStringLiteral	this _
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this _ _"	TokenNameStringLiteral	this _ _
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ _ sentence"	TokenNameStringLiteral	_ _ sentence
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ sentence"	TokenNameStringLiteral	_ sentence
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ sentence into"	TokenNameStringLiteral	_ sentence into
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
49	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
49	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
49	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_POS_INCR_EQUAL_TO_N	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  POS  INCR  EQUAL  TO  N
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_POS_INCR_EQUAL_TO_N	TokenNameIdentifier	 TRI  GRAM  TYPES  POS  INCR  EQUAL  TO  N
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_POS_INCR_EQUAL_TO_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TOKENS  POS  INCR  EQUAL  TO  N  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this _"	TokenNameStringLiteral	divide this _
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this _"	TokenNameStringLiteral	this _
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this _ _"	TokenNameStringLiteral	this _ _
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ _ sentence"	TokenNameStringLiteral	_ _ sentence
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ sentence"	TokenNameStringLiteral	_ sentence
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ sentence into"	TokenNameStringLiteral	_ sentence into
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
49	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
49	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_POS_INCR_EQUAL_TO_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  POS  INCR  EQUAL  TO  N  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_POS_INCR_EQUAL_TO_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TYPES  POS  INCR  EQUAL  TO  N  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TEST_TOKEN_POS_INCR_GREATER_THAN_N	TokenNameIdentifier	 TEST  TOKEN  POS  INCR  GREATER  THAN  N
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
77	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_POS_INCR_GREATER_THAN_N	TokenNameIdentifier	 TRI  GRAM  TOKENS  POS  INCR  GREATER  THAN  N
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please _"	TokenNameStringLiteral	please _
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please _ _"	TokenNameStringLiteral	please _ _
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ _ divide"	TokenNameStringLiteral	_ _ divide
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ divide"	TokenNameStringLiteral	_ divide
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ divide this"	TokenNameStringLiteral	_ divide this
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
77	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
77	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
77	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_POS_INCR_GREATER_THAN_N	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  POS  INCR  GREATER  THAN  N
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_POS_INCR_GREATER_THAN_N	TokenNameIdentifier	 TRI  GRAM  TYPES  POS  INCR  GREATER  THAN  N
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TOKENS_POS_INCR_GREATER_THAN_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TOKENS  POS  INCR  GREATER  THAN  N  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please _"	TokenNameStringLiteral	please _
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please _ _"	TokenNameStringLiteral	please _ _
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ _ divide"	TokenNameStringLiteral	_ _ divide
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ divide"	TokenNameStringLiteral	_ divide
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"_ divide this"	TokenNameStringLiteral	_ divide this
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
77	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
77	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_POSITION_INCREMENTS_POS_INCR_GREATER_THAN_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  POS  INCR  GREATER  THAN  N  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TRI_GRAM_TYPES_POS_INCR_GREATER_THAN_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TYPES  POS  INCR  GREATER  THAN  N  WITHOUT  UNIGRAMS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testTokenWithHoles	TokenNameIdentifier	 test Token With Holes
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Class under test for void ShingleFilter(TokenStream, int) */	TokenNameCOMMENT_BLOCK	 Class under test for void ShingleFilter(TokenStream, int) 
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilter	TokenNameIdentifier	 test Bi Gram Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
BI_GRAM_TOKENS	TokenNameIdentifier	 BI  GRAM  TOKENS
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS
,	TokenNameCOMMA	
BI_GRAM_TYPES	TokenNameIdentifier	 BI  GRAM  TYPES
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterWithHoles	TokenNameIdentifier	 test Bi Gram Filter With Holes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
testTokenWithHoles	TokenNameIdentifier	 test Token With Holes
,	TokenNameCOMMA	
BI_GRAM_TOKENS_WITH_HOLES	TokenNameIdentifier	 BI  GRAM  TOKENS  WITH  HOLES
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS_WITH_HOLES	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITH  HOLES
,	TokenNameCOMMA	
BI_GRAM_TYPES_WITH_HOLES	TokenNameIdentifier	 BI  GRAM  TYPES  WITH  HOLES
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterWithoutUnigrams	TokenNameIdentifier	 test Bi Gram Filter Without Unigrams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
BI_GRAM_TOKENS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  TOKENS  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
BI_GRAM_TYPES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  TYPES  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterWithHolesWithoutUnigrams	TokenNameIdentifier	 test Bi Gram Filter With Holes Without Unigrams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
testTokenWithHoles	TokenNameIdentifier	 test Token With Holes
,	TokenNameCOMMA	
BI_GRAM_TOKENS_WITH_HOLES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  TOKENS  WITH  HOLES  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS_WITH_HOLES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITH  HOLES  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
BI_GRAM_TYPES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  TYPES  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterWithSingleToken	TokenNameIdentifier	 test Bi Gram Filter With Single Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_SINGLE_TOKEN	TokenNameIdentifier	 TEST  SINGLE  TOKEN
,	TokenNameCOMMA	
SINGLE_TOKEN	TokenNameIdentifier	 SINGLE  TOKEN
,	TokenNameCOMMA	
SINGLE_TOKEN_INCREMENTS	TokenNameIdentifier	 SINGLE  TOKEN  INCREMENTS
,	TokenNameCOMMA	
SINGLE_TOKEN_TYPES	TokenNameIdentifier	 SINGLE  TOKEN  TYPES
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterWithSingleTokenWithoutUnigrams	TokenNameIdentifier	 test Bi Gram Filter With Single Token Without Unigrams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_SINGLE_TOKEN	TokenNameIdentifier	 TEST  SINGLE  TOKEN
,	TokenNameCOMMA	
EMPTY_TOKEN_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  ARRAY
,	TokenNameCOMMA	
EMPTY_TOKEN_INCREMENTS_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  INCREMENTS  ARRAY
,	TokenNameCOMMA	
EMPTY_TOKEN_TYPES_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  TYPES  ARRAY
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterWithEmptyTokenStream	TokenNameIdentifier	 test Bi Gram Filter With Empty Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EMPTY_TOKEN_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  ARRAY
,	TokenNameCOMMA	
EMPTY_TOKEN_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  ARRAY
,	TokenNameCOMMA	
EMPTY_TOKEN_INCREMENTS_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  INCREMENTS  ARRAY
,	TokenNameCOMMA	
EMPTY_TOKEN_TYPES_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  TYPES  ARRAY
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterWithEmptyTokenStreamWithoutUnigrams	TokenNameIdentifier	 test Bi Gram Filter With Empty Token Stream Without Unigrams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EMPTY_TOKEN_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  ARRAY
,	TokenNameCOMMA	
EMPTY_TOKEN_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  ARRAY
,	TokenNameCOMMA	
EMPTY_TOKEN_INCREMENTS_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  INCREMENTS  ARRAY
,	TokenNameCOMMA	
EMPTY_TOKEN_TYPES_ARRAY	TokenNameIdentifier	 EMPTY  TOKEN  TYPES  ARRAY
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTriGramFilter	TokenNameIdentifier	 test Tri Gram Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TRI_GRAM_TOKENS	TokenNameIdentifier	 TRI  GRAM  TOKENS
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS
,	TokenNameCOMMA	
TRI_GRAM_TYPES	TokenNameIdentifier	 TRI  GRAM  TYPES
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTriGramFilterWithoutUnigrams	TokenNameIdentifier	 test Tri Gram Filter Without Unigrams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TOKENS  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
TRI_GRAM_TYPES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TYPES  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFourGramFilter	TokenNameIdentifier	 test Four Gram Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
FOUR_GRAM_TOKENS	TokenNameIdentifier	 FOUR  GRAM  TOKENS
,	TokenNameCOMMA	
FOUR_GRAM_POSITION_INCREMENTS	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS
,	TokenNameCOMMA	
FOUR_GRAM_TYPES	TokenNameIdentifier	 FOUR  GRAM  TYPES
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFourGramFilterWithoutUnigrams	TokenNameIdentifier	 test Four Gram Filter Without Unigrams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
FOUR_GRAM_TOKENS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 FOUR  GRAM  TOKENS  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
FOUR_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
FOUR_GRAM_TYPES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 FOUR  GRAM  TYPES  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTriGramFilterMinTriGram	TokenNameIdentifier	 test Tri Gram Filter Min Tri Gram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  TOKENS  MIN  TRI  GRAM
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  MIN  TRI  GRAM
,	TokenNameCOMMA	
TRI_GRAM_TYPES_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  TYPES  MIN  TRI  GRAM
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTriGramFilterWithoutUnigramsMinTriGram	TokenNameIdentifier	 test Tri Gram Filter Without Unigrams Min Tri Gram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  TOKENS  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
,	TokenNameCOMMA	
TRI_GRAM_TYPES_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 TRI  GRAM  TYPES  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFourGramFilterMinTriGram	TokenNameIdentifier	 test Four Gram Filter Min Tri Gram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
FOUR_GRAM_TOKENS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  TOKENS  MIN  TRI  GRAM
,	TokenNameCOMMA	
FOUR_GRAM_POSITION_INCREMENTS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  MIN  TRI  GRAM
,	TokenNameCOMMA	
FOUR_GRAM_TYPES_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  TYPES  MIN  TRI  GRAM
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFourGramFilterWithoutUnigramsMinTriGram	TokenNameIdentifier	 test Four Gram Filter Without Unigrams Min Tri Gram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
FOUR_GRAM_TOKENS_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  TOKENS  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
,	TokenNameCOMMA	
FOUR_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
,	TokenNameCOMMA	
FOUR_GRAM_TYPES_WITHOUT_UNIGRAMS_MIN_TRI_GRAM	TokenNameIdentifier	 FOUR  GRAM  TYPES  WITHOUT  UNIGRAMS  MIN  TRI  GRAM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFourGramFilterMinFourGram	TokenNameIdentifier	 test Four Gram Filter Min Four Gram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
FOUR_GRAM_TOKENS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  TOKENS  MIN  FOUR  GRAM
,	TokenNameCOMMA	
FOUR_GRAM_POSITION_INCREMENTS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  MIN  FOUR  GRAM
,	TokenNameCOMMA	
FOUR_GRAM_TYPES_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  TYPES  MIN  FOUR  GRAM
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFourGramFilterWithoutUnigramsMinFourGram	TokenNameIdentifier	 test Four Gram Filter Without Unigrams Min Four Gram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
FOUR_GRAM_TOKENS_WITHOUT_UNIGRAMS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  TOKENS  WITHOUT  UNIGRAMS  MIN  FOUR  GRAM
,	TokenNameCOMMA	
FOUR_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  MIN  FOUR  GRAM
,	TokenNameCOMMA	
FOUR_GRAM_TYPES_WITHOUT_UNIGRAMS_MIN_FOUR_GRAM	TokenNameIdentifier	 FOUR  GRAM  TYPES  WITHOUT  UNIGRAMS  MIN  FOUR  GRAM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterNoSeparator	TokenNameIdentifier	 test Bi Gram Filter No Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
BI_GRAM_TOKENS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TOKENS  NO  SEPARATOR
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  NO  SEPARATOR
,	TokenNameCOMMA	
BI_GRAM_TYPES_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TYPES  NO  SEPARATOR
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterWithoutUnigramsNoSeparator	TokenNameIdentifier	 test Bi Gram Filter Without Unigrams No Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
BI_GRAM_TOKENS_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TOKENS  WITHOUT  UNIGRAMS  NO  SEPARATOR
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  NO  SEPARATOR
,	TokenNameCOMMA	
BI_GRAM_TYPES_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TYPES  WITHOUT  UNIGRAMS  NO  SEPARATOR
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTriGramFilterNoSeparator	TokenNameIdentifier	 test Tri Gram Filter No Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  NO  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  NO  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_TYPES_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  NO  SEPARATOR
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTriGramFilterWithoutUnigramsNoSeparator	TokenNameIdentifier	 test Tri Gram Filter Without Unigrams No Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  WITHOUT  UNIGRAMS  NO  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  NO  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_TYPES_WITHOUT_UNIGRAMS_NO_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  WITHOUT  UNIGRAMS  NO  SEPARATOR
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterAltSeparator	TokenNameIdentifier	 test Bi Gram Filter Alt Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
"<SEP>"	TokenNameStringLiteral	<SEP>
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
BI_GRAM_TOKENS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TOKENS  ALT  SEPARATOR
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  ALT  SEPARATOR
,	TokenNameCOMMA	
BI_GRAM_TYPES_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TYPES  ALT  SEPARATOR
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBiGramFilterWithoutUnigramsAltSeparator	TokenNameIdentifier	 test Bi Gram Filter Without Unigrams Alt Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
"<SEP>"	TokenNameStringLiteral	<SEP>
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
BI_GRAM_TOKENS_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TOKENS  WITHOUT  UNIGRAMS  ALT  SEPARATOR
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  ALT  SEPARATOR
,	TokenNameCOMMA	
BI_GRAM_TYPES_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 BI  GRAM  TYPES  WITHOUT  UNIGRAMS  ALT  SEPARATOR
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTriGramFilterAltSeparator	TokenNameIdentifier	 test Tri Gram Filter Alt Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
"<SEP>"	TokenNameStringLiteral	<SEP>
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  ALT  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  ALT  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_TYPES_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  ALT  SEPARATOR
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTriGramFilterWithoutUnigramsAltSeparator	TokenNameIdentifier	 test Tri Gram Filter Without Unigrams Alt Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
"<SEP>"	TokenNameStringLiteral	<SEP>
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  WITHOUT  UNIGRAMS  ALT  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS  ALT  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_TYPES_WITHOUT_UNIGRAMS_ALT_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  WITHOUT  UNIGRAMS  ALT  SEPARATOR
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTriGramFilterNullSeparator	TokenNameIdentifier	 test Tri Gram Filter Null Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_NULL_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TOKENS  NULL  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_NULL_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  NULL  SEPARATOR
,	TokenNameCOMMA	
TRI_GRAM_TYPES_NULL_SEPARATOR	TokenNameIdentifier	 TRI  GRAM  TYPES  NULL  SEPARATOR
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPositionIncrementEqualToN	TokenNameIdentifier	 test Position Increment Equal To N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN_POS_INCR_EQUAL_TO_N	TokenNameIdentifier	 TEST  TOKEN  POS  INCR  EQUAL  TO  N
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_POS_INCR_EQUAL_TO_N	TokenNameIdentifier	 TRI  GRAM  TOKENS  POS  INCR  EQUAL  TO  N
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_POS_INCR_EQUAL_TO_N	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  POS  INCR  EQUAL  TO  N
,	TokenNameCOMMA	
TRI_GRAM_TYPES_POS_INCR_EQUAL_TO_N	TokenNameIdentifier	 TRI  GRAM  TYPES  POS  INCR  EQUAL  TO  N
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPositionIncrementEqualToNWithoutUnigrams	TokenNameIdentifier	 test Position Increment Equal To N Without Unigrams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN_POS_INCR_EQUAL_TO_N	TokenNameIdentifier	 TEST  TOKEN  POS  INCR  EQUAL  TO  N
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_POS_INCR_EQUAL_TO_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TOKENS  POS  INCR  EQUAL  TO  N  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_POS_INCR_EQUAL_TO_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  POS  INCR  EQUAL  TO  N  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
TRI_GRAM_TYPES_POS_INCR_EQUAL_TO_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TYPES  POS  INCR  EQUAL  TO  N  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPositionIncrementGreaterThanN	TokenNameIdentifier	 test Position Increment Greater Than N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN_POS_INCR_GREATER_THAN_N	TokenNameIdentifier	 TEST  TOKEN  POS  INCR  GREATER  THAN  N
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_POS_INCR_GREATER_THAN_N	TokenNameIdentifier	 TRI  GRAM  TOKENS  POS  INCR  GREATER  THAN  N
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_POS_INCR_GREATER_THAN_N	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  POS  INCR  GREATER  THAN  N
,	TokenNameCOMMA	
TRI_GRAM_TYPES_POS_INCR_GREATER_THAN_N	TokenNameIdentifier	 TRI  GRAM  TYPES  POS  INCR  GREATER  THAN  N
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPositionIncrementGreaterThanNWithoutUnigrams	TokenNameIdentifier	 test Position Increment Greater Than N Without Unigrams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN_POS_INCR_GREATER_THAN_N	TokenNameIdentifier	 TEST  TOKEN  POS  INCR  GREATER  THAN  N
,	TokenNameCOMMA	
TRI_GRAM_TOKENS_POS_INCR_GREATER_THAN_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TOKENS  POS  INCR  GREATER  THAN  N  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
TRI_GRAM_POSITION_INCREMENTS_POS_INCR_GREATER_THAN_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  POSITION  INCREMENTS  POS  INCR  GREATER  THAN  N  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
TRI_GRAM_TYPES_POS_INCR_GREATER_THAN_N_WITHOUT_UNIGRAMS	TokenNameIdentifier	 TRI  GRAM  TYPES  POS  INCR  GREATER  THAN  N  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReset	TokenNameIdentifier	 test Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Tokenizer	TokenNameIdentifier	 Tokenizer
wsTokenizer	TokenNameIdentifier	 ws Tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"please divide this sentence"	TokenNameStringLiteral	please divide this sentence
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
wsTokenizer	TokenNameIdentifier	 ws Tokenizer
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
"sentence"	TokenNameStringLiteral	sentence
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wsTokenizer	TokenNameIdentifier	 ws Tokenizer
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"please divide this sentence"	TokenNameStringLiteral	please divide this sentence
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
"sentence"	TokenNameStringLiteral	sentence
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
,	TokenNameCOMMA	
"shingle"	TokenNameStringLiteral	shingle
,	TokenNameCOMMA	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOutputUnigramsIfNoShinglesSingleTokenCase	TokenNameIdentifier	 test Output Unigrams If No Shingles Single Token Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Single token input with outputUnigrams==false is the primary case where 	TokenNameCOMMENT_LINE	Single token input with outputUnigrams==false is the primary case where 
// enabling this option should alter program behavior. 	TokenNameCOMMENT_LINE	enabling this option should alter program behavior. 
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_SINGLE_TOKEN	TokenNameIdentifier	 TEST  SINGLE  TOKEN
,	TokenNameCOMMA	
SINGLE_TOKEN	TokenNameIdentifier	 SINGLE  TOKEN
,	TokenNameCOMMA	
SINGLE_TOKEN_INCREMENTS	TokenNameIdentifier	 SINGLE  TOKEN  INCREMENTS
,	TokenNameCOMMA	
SINGLE_TOKEN_TYPES	TokenNameIdentifier	 SINGLE  TOKEN  TYPES
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOutputUnigramsIfNoShinglesWithSimpleBigram	TokenNameIdentifier	 test Output Unigrams If No Shingles With Simple Bigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Here we expect the same result as with testBiGramFilter(). 	TokenNameCOMMENT_LINE	Here we expect the same result as with testBiGramFilter(). 
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
BI_GRAM_TOKENS	TokenNameIdentifier	 BI  GRAM  TOKENS
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS
,	TokenNameCOMMA	
BI_GRAM_TYPES	TokenNameIdentifier	 BI  GRAM  TYPES
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOutputUnigramsIfNoShinglesWithSimpleUnigramlessBigram	TokenNameIdentifier	 test Output Unigrams If No Shingles With Simple Unigramless Bigram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Here we expect the same result as with testBiGramFilterWithoutUnigrams(). 	TokenNameCOMMENT_LINE	Here we expect the same result as with testBiGramFilterWithoutUnigrams(). 
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
BI_GRAM_TOKENS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  TOKENS  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
BI_GRAM_POSITION_INCREMENTS_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  POSITION  INCREMENTS  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
BI_GRAM_TYPES_WITHOUT_UNIGRAMS	TokenNameIdentifier	 BI  GRAM  TYPES  WITHOUT  UNIGRAMS
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOutputUnigramsIfNoShinglesWithMultipleInputTokens	TokenNameIdentifier	 test Output Unigrams If No Shingles With Multiple Input Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Test when the minimum shingle size is greater than the number of input tokens 	TokenNameCOMMENT_LINE	Test when the minimum shingle size is greater than the number of input tokens 
this	TokenNamethis	
.	TokenNameDOT	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
UNIGRAM_ONLY_POSITION_INCREMENTS	TokenNameIdentifier	 UNIGRAM  ONLY  POSITION  INCREMENTS
,	TokenNameCOMMA	
UNIGRAM_ONLY_TYPES	TokenNameIdentifier	 UNIGRAM  ONLY  TYPES
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokensToShingle	TokenNameIdentifier	 tokens To Shingle
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positionIncrements	TokenNameIdentifier	 position Increments
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
(	TokenNameLPAREN	
tokensToShingle	TokenNameIdentifier	 tokens To Shingle
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setOutputUnigrams	TokenNameIdentifier	 set Output Unigrams
(	TokenNameLPAREN	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shingleFilterTestCommon	TokenNameIdentifier	 shingle Filter Test Common
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
,	TokenNameCOMMA	
positionIncrements	TokenNameIdentifier	 position Increments
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokensToShingle	TokenNameIdentifier	 tokens To Shingle
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positionIncrements	TokenNameIdentifier	 position Increments
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
(	TokenNameLPAREN	
tokensToShingle	TokenNameIdentifier	 tokens To Shingle
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setOutputUnigrams	TokenNameIdentifier	 set Output Unigrams
(	TokenNameLPAREN	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shingleFilterTestCommon	TokenNameIdentifier	 shingle Filter Test Common
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
,	TokenNameCOMMA	
positionIncrements	TokenNameIdentifier	 position Increments
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokensToShingle	TokenNameIdentifier	 tokens To Shingle
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positionIncrements	TokenNameIdentifier	 position Increments
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
,	TokenNameCOMMA	
boolean	TokenNameboolean	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
(	TokenNameLPAREN	
tokensToShingle	TokenNameIdentifier	 tokens To Shingle
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setOutputUnigrams	TokenNameIdentifier	 set Output Unigrams
(	TokenNameLPAREN	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setOutputUnigramsIfNoShingles	TokenNameIdentifier	 set Output Unigrams If No Shingles
(	TokenNameLPAREN	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shingleFilterTestCommon	TokenNameIdentifier	 shingle Filter Test Common
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
,	TokenNameCOMMA	
positionIncrements	TokenNameIdentifier	 position Increments
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
shingleFilterTest	TokenNameIdentifier	 shingle Filter Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tokenSeparator	TokenNameIdentifier	 token Separator
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokensToShingle	TokenNameIdentifier	 tokens To Shingle
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positionIncrements	TokenNameIdentifier	 position Increments
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
(	TokenNameLPAREN	
tokensToShingle	TokenNameIdentifier	 tokens To Shingle
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setTokenSeparator	TokenNameIdentifier	 set Token Separator
(	TokenNameLPAREN	
tokenSeparator	TokenNameIdentifier	 token Separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setOutputUnigrams	TokenNameIdentifier	 set Output Unigrams
(	TokenNameLPAREN	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shingleFilterTestCommon	TokenNameIdentifier	 shingle Filter Test Common
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
,	TokenNameCOMMA	
positionIncrements	TokenNameIdentifier	 position Increments
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
shingleFilterTestCommon	TokenNameIdentifier	 shingle Filter Test Common
(	TokenNameLPAREN	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positionIncrements	TokenNameIdentifier	 position Increments
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
tokensToCompare	TokenNameIdentifier	 tokens To Compare
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tokensToCompare	TokenNameIdentifier	 tokens To Compare
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
positionIncrements	TokenNameIdentifier	 position Increments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
positionIncrement	TokenNameIdentifier	 position Increment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
positionIncrement	TokenNameIdentifier	 position Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** blast some random strings through the analyzer */	TokenNameCOMMENT_JAVADOC	 blast some random strings through the analyzer 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomStrings	TokenNameIdentifier	 test Random Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tokenizer	TokenNameIdentifier	 Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** blast some random large strings through the analyzer */	TokenNameCOMMENT_JAVADOC	 blast some random large strings through the analyzer 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomHugeStrings	TokenNameIdentifier	 test Random Huge Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tokenizer	TokenNameIdentifier	 Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
,	TokenNameCOMMA	
8192	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyTerm	TokenNameIdentifier	 test Empty Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tokenizer	TokenNameIdentifier	 Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
new	TokenNamenew	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
