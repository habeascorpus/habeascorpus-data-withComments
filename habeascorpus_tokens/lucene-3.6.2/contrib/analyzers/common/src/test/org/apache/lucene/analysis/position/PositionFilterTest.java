package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
position	TokenNameIdentifier	 position
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
shingle	TokenNameIdentifier	 shingle
.	TokenNameDOT	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
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
public	TokenNamepublic	
class	TokenNameclass	
PositionFilterTest	TokenNameIdentifier	 Position Filter Test
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
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testToken	TokenNameIdentifier	 test Token
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
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
public	TokenNamepublic	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
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
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
testToken	TokenNameIdentifier	 test Token
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TEST_TOKEN_POSITION_INCREMENTS	TokenNameIdentifier	 TEST  TOKEN  POSITION  INCREMENTS
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
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TEST_TOKEN_NON_ZERO_POSITION_INCREMENTS	TokenNameIdentifier	 TEST  TOKEN  NON  ZERO  POSITION  INCREMENTS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SIX_GRAM_NO_POSITIONS_TOKENS	TokenNameIdentifier	 SIX  GRAM  NO  POSITIONS  TOKENS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"please"	TokenNameStringLiteral	please
,	TokenNameCOMMA	
"please divide"	TokenNameStringLiteral	please divide
,	TokenNameCOMMA	
"please divide this"	TokenNameStringLiteral	please divide this
,	TokenNameCOMMA	
"please divide this sentence"	TokenNameStringLiteral	please divide this sentence
,	TokenNameCOMMA	
"please divide this sentence into"	TokenNameStringLiteral	please divide this sentence into
,	TokenNameCOMMA	
"please divide this sentence into shingles"	TokenNameStringLiteral	please divide this sentence into shingles
,	TokenNameCOMMA	
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
"divide this"	TokenNameStringLiteral	divide this
,	TokenNameCOMMA	
"divide this sentence"	TokenNameStringLiteral	divide this sentence
,	TokenNameCOMMA	
"divide this sentence into"	TokenNameStringLiteral	divide this sentence into
,	TokenNameCOMMA	
"divide this sentence into shingles"	TokenNameStringLiteral	divide this sentence into shingles
,	TokenNameCOMMA	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"this sentence"	TokenNameStringLiteral	this sentence
,	TokenNameCOMMA	
"this sentence into"	TokenNameStringLiteral	this sentence into
,	TokenNameCOMMA	
"this sentence into shingles"	TokenNameStringLiteral	this sentence into shingles
,	TokenNameCOMMA	
"sentence"	TokenNameStringLiteral	sentence
,	TokenNameCOMMA	
"sentence into"	TokenNameStringLiteral	sentence into
,	TokenNameCOMMA	
"sentence into shingles"	TokenNameStringLiteral	sentence into shingles
,	TokenNameCOMMA	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
"into shingles"	TokenNameStringLiteral	into shingles
,	TokenNameCOMMA	
"shingles"	TokenNameStringLiteral	shingles
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SIX_GRAM_NO_POSITIONS_INCREMENTS	TokenNameIdentifier	 SIX  GRAM  NO  POSITIONS  INCREMENTS
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
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SIX_GRAM_NO_POSITIONS_TYPES	TokenNameIdentifier	 SIX  GRAM  NO  POSITIONS  TYPES
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
void	TokenNamevoid	
testFilter	TokenNameIdentifier	 test Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
new	TokenNamenew	
PositionFilter	TokenNameIdentifier	 Position Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
(	TokenNameLPAREN	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TEST_TOKEN_POSITION_INCREMENTS	TokenNameIdentifier	 TEST  TOKEN  POSITION  INCREMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNonZeroPositionIncrement	TokenNameIdentifier	 test Non Zero Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
new	TokenNamenew	
PositionFilter	TokenNameIdentifier	 Position Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
(	TokenNameLPAREN	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TEST_TOKEN_NON_ZERO_POSITION_INCREMENTS	TokenNameIdentifier	 TEST  TOKEN  NON  ZERO  POSITION  INCREMENTS
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
PositionFilter	TokenNameIdentifier	 Position Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
PositionFilter	TokenNameIdentifier	 Position Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TestTokenStream	TokenNameIdentifier	 Test Token Stream
(	TokenNameLPAREN	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TEST_TOKEN_POSITION_INCREMENTS	TokenNameIdentifier	 TEST  TOKEN  POSITION  INCREMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure that the reset filter provides correct position increments 	TokenNameCOMMENT_LINE	Make sure that the reset filter provides correct position increments 
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
,	TokenNameCOMMA	
TEST_TOKEN_POSITION_INCREMENTS	TokenNameIdentifier	 TEST  TOKEN  POSITION  INCREMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests ShingleFilter up to six shingles against six terms. * Tests PositionFilter setting all but the first positionIncrement to zero. * @throws java.io.IOException @see Token#next(Token) */	TokenNameCOMMENT_JAVADOC	 Tests ShingleFilter up to six shingles against six terms. Tests PositionFilter setting all but the first positionIncrement to zero. @throws java.io.IOException @see Token#next(Token) 
public	TokenNamepublic	
void	TokenNamevoid	
test6GramFilterNoPositions	TokenNameIdentifier	 test6 Gram Filter No Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
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
TEST_TOKEN	TokenNameIdentifier	 TEST  TOKEN
)	TokenNameRPAREN	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
new	TokenNamenew	
PositionFilter	TokenNameIdentifier	 Position Filter
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SIX_GRAM_NO_POSITIONS_TOKENS	TokenNameIdentifier	 SIX  GRAM  NO  POSITIONS  TOKENS
,	TokenNameCOMMA	
SIX_GRAM_NO_POSITIONS_INCREMENTS	TokenNameIdentifier	 SIX  GRAM  NO  POSITIONS  INCREMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
