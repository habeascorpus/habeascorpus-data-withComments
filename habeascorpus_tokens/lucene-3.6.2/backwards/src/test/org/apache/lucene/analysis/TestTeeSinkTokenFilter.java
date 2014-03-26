package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Copyright 2004 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2004 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
StandardFilter	TokenNameIdentifier	 Standard Filter
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
English	TokenNameIdentifier	 English
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
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
/** * tests for the TestTeeSinkTokenFilter */	TokenNameCOMMENT_JAVADOC	 tests for the TestTeeSinkTokenFilter 
public	TokenNamepublic	
class	TokenNameclass	
TestTeeSinkTokenFilter	TokenNameIdentifier	 Test Tee Sink Token Filter
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
protected	TokenNameprotected	
StringBuilder	TokenNameIdentifier	 String Builder
buffer1	TokenNameIdentifier	 buffer1
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
StringBuilder	TokenNameIdentifier	 String Builder
buffer2	TokenNameIdentifier	 buffer2
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens1	TokenNameIdentifier	 tokens1
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens2	TokenNameIdentifier	 tokens2
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
tokens1	TokenNameIdentifier	 tokens1
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
"Burgundy"	TokenNameStringLiteral	Burgundy
,	TokenNameCOMMA	
"Fox"	TokenNameStringLiteral	Fox
,	TokenNameCOMMA	
"jumped"	TokenNameStringLiteral	jumped
,	TokenNameCOMMA	
"over"	TokenNameStringLiteral	over
,	TokenNameCOMMA	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
"lazy"	TokenNameStringLiteral	lazy
,	TokenNameCOMMA	
"Red"	TokenNameStringLiteral	Red
,	TokenNameCOMMA	
"Dogs"	TokenNameStringLiteral	Dogs
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
tokens2	TokenNameIdentifier	 tokens2
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
"Lazy"	TokenNameStringLiteral	Lazy
,	TokenNameCOMMA	
"Dogs"	TokenNameStringLiteral	Dogs
,	TokenNameCOMMA	
"should"	TokenNameStringLiteral	should
,	TokenNameCOMMA	
"stay"	TokenNameStringLiteral	stay
,	TokenNameCOMMA	
"on"	TokenNameStringLiteral	on
,	TokenNameCOMMA	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
"porch"	TokenNameStringLiteral	porch
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
buffer1	TokenNameIdentifier	 buffer1
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
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
tokens1	TokenNameIdentifier	 tokens1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer1	TokenNameIdentifier	 buffer1
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tokens1	TokenNameIdentifier	 tokens1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer2	TokenNameIdentifier	 buffer2
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
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
tokens2	TokenNameIdentifier	 tokens2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer2	TokenNameIdentifier	 buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tokens2	TokenNameIdentifier	 tokens2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
.	TokenNameDOT	
SinkFilter	TokenNameIdentifier	 Sink Filter
theFilter	TokenNameIdentifier	 the Filter
=	TokenNameEQUAL	
new	TokenNamenew	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
.	TokenNameDOT	
SinkFilter	TokenNameIdentifier	 Sink Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"The"	TokenNameStringLiteral	The
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
.	TokenNameDOT	
SinkFilter	TokenNameIdentifier	 Sink Filter
dogFilter	TokenNameIdentifier	 dog Filter
=	TokenNameEQUAL	
new	TokenNamenew	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
.	TokenNameDOT	
SinkFilter	TokenNameIdentifier	 Sink Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"Dogs"	TokenNameStringLiteral	Dogs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testGeneral	TokenNameIdentifier	 test General
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
buffer1	TokenNameIdentifier	 buffer1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
sink1	TokenNameIdentifier	 sink1
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
sink2	TokenNameIdentifier	 sink2
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
theFilter	TokenNameIdentifier	 the Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sink1	TokenNameIdentifier	 sink1
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sink2	TokenNameIdentifier	 sink2
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
tokens1	TokenNameIdentifier	 tokens1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
sink1	TokenNameIdentifier	 sink1
,	TokenNameCOMMA	
tokens1	TokenNameIdentifier	 tokens1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
sink2	TokenNameIdentifier	 sink2
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
"the"	TokenNameStringLiteral	the
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultipleSources	TokenNameIdentifier	 test Multiple Sources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
tee1	TokenNameIdentifier	 tee1
=	TokenNameEQUAL	
new	TokenNamenew	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
buffer1	TokenNameIdentifier	 buffer1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
.	TokenNameDOT	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
dogDetector	TokenNameIdentifier	 dog Detector
=	TokenNameEQUAL	
tee1	TokenNameIdentifier	 tee1
.	TokenNameDOT	
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
dogFilter	TokenNameIdentifier	 dog Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
.	TokenNameDOT	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
theDetector	TokenNameIdentifier	 the Detector
=	TokenNameEQUAL	
tee1	TokenNameIdentifier	 tee1
.	TokenNameDOT	
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
theFilter	TokenNameIdentifier	 the Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tee1	TokenNameIdentifier	 tee1
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
source1	TokenNameIdentifier	 source1
=	TokenNameEQUAL	
new	TokenNamenew	
CachingTokenFilter	TokenNameIdentifier	 Caching Token Filter
(	TokenNameLPAREN	
tee1	TokenNameIdentifier	 tee1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tee1	TokenNameIdentifier	 tee1
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dogDetector	TokenNameIdentifier	 dog Detector
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
theDetector	TokenNameIdentifier	 the Detector
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
tee2	TokenNameIdentifier	 tee2
=	TokenNameEQUAL	
new	TokenNamenew	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
buffer2	TokenNameIdentifier	 buffer2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tee2	TokenNameIdentifier	 tee2
.	TokenNameDOT	
addSinkTokenStream	TokenNameIdentifier	 add Sink Token Stream
(	TokenNameLPAREN	
dogDetector	TokenNameIdentifier	 dog Detector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tee2	TokenNameIdentifier	 tee2
.	TokenNameDOT	
addSinkTokenStream	TokenNameIdentifier	 add Sink Token Stream
(	TokenNameLPAREN	
theDetector	TokenNameIdentifier	 the Detector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
source2	TokenNameIdentifier	 source2
=	TokenNameEQUAL	
tee2	TokenNameIdentifier	 tee2
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
source1	TokenNameIdentifier	 source1
,	TokenNameCOMMA	
tokens1	TokenNameIdentifier	 tokens1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
source2	TokenNameIdentifier	 source2
,	TokenNameCOMMA	
tokens2	TokenNameIdentifier	 tokens2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
theDetector	TokenNameIdentifier	 the Detector
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
"the"	TokenNameStringLiteral	the
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
dogDetector	TokenNameIdentifier	 dog Detector
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Dogs"	TokenNameStringLiteral	Dogs
,	TokenNameCOMMA	
"Dogs"	TokenNameStringLiteral	Dogs
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source1	TokenNameIdentifier	 source1
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
lowerCasing	TokenNameIdentifier	 lower Casing
=	TokenNameEQUAL	
new	TokenNamenew	
LowerCaseFilter	TokenNameIdentifier	 Lower Case Filter
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
source1	TokenNameIdentifier	 source1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lowerCaseTokens	TokenNameIdentifier	 lower Case Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tokens1	TokenNameIdentifier	 tokens1
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
tokens1	TokenNameIdentifier	 tokens1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
lowerCaseTokens	TokenNameIdentifier	 lower Case Tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tokens1	TokenNameIdentifier	 tokens1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
lowerCasing	TokenNameIdentifier	 lower Casing
,	TokenNameCOMMA	
lowerCaseTokens	TokenNameIdentifier	 lower Case Tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Not an explicit test, just useful to print out some info on performance * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Not an explicit test, just useful to print out some info on performance * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
performance	TokenNameIdentifier	 performance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokCount	TokenNameIdentifier	 tok Count
=	TokenNameEQUAL	
{	TokenNameLBRACE	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
modCounts	TokenNameIdentifier	 mod Counts
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
500	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
tokCount	TokenNameIdentifier	 tok Count
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"-----Tokens: "	TokenNameStringLiteral	-----Tokens: 
+	TokenNamePLUS	
tokCount	TokenNameIdentifier	 tok Count
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"-----"	TokenNameStringLiteral	-----
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
tokCount	TokenNameIdentifier	 tok Count
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
English	TokenNameIdentifier	 English
.	TokenNameDOT	
intToEnglish	TokenNameIdentifier	 int To English
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//make sure we produce the same tokens 	TokenNameCOMMENT_LINE	make sure we produce the same tokens 
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
teeStream	TokenNameIdentifier	 tee Stream
=	TokenNameEQUAL	
new	TokenNamenew	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
sink	TokenNameIdentifier	 sink
=	TokenNameEQUAL	
teeStream	TokenNameIdentifier	 tee Stream
.	TokenNameDOT	
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
new	TokenNamenew	
ModuloSinkFilter	TokenNameIdentifier	 Modulo Sink Filter
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
teeStream	TokenNameIdentifier	 tee Stream
.	TokenNameDOT	
consumeAllTokens	TokenNameIdentifier	 consume All Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
ModuloTokenFilter	TokenNameIdentifier	 Modulo Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
tfTok	TokenNameIdentifier	 tf Tok
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
sinkTok	TokenNameIdentifier	 sink Tok
=	TokenNameEQUAL	
sink	TokenNameIdentifier	 sink
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sink	TokenNameIdentifier	 sink
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
tfTok	TokenNameIdentifier	 tf Tok
+	TokenNamePLUS	
" is not equal to "	TokenNameStringLiteral	 is not equal to 
+	TokenNamePLUS	
sinkTok	TokenNameIdentifier	 sink Tok
+	TokenNamePLUS	
" at token: "	TokenNameStringLiteral	 at token: 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
tfTok	TokenNameIdentifier	 tf Tok
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sinkTok	TokenNameIdentifier	 sink Tok
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//simulate two fields, each being analyzed once, for 20 documents 	TokenNameCOMMENT_LINE	simulate two fields, each being analyzed once, for 20 documents 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
modCounts	TokenNameIdentifier	 mod Counts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tfPos	TokenNameIdentifier	 tf Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
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
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tfPos	TokenNameIdentifier	 tf Pos
+=	TokenNamePLUS_EQUAL	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
ModuloTokenFilter	TokenNameIdentifier	 Modulo Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
modCounts	TokenNameIdentifier	 mod Counts
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tfPos	TokenNameIdentifier	 tf Pos
+=	TokenNamePLUS_EQUAL	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
long	TokenNamelong	
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ModCount: "	TokenNameStringLiteral	ModCount: 
+	TokenNamePLUS	
modCounts	TokenNameIdentifier	 mod Counts
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" Two fields took "	TokenNameStringLiteral	 Two fields took 
+	TokenNamePLUS	
(	TokenNameLPAREN	
finish	TokenNameIdentifier	 finish
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ms"	TokenNameStringLiteral	 ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sinkPos	TokenNameIdentifier	 sink Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//simulate one field with one sink 	TokenNameCOMMENT_LINE	simulate one field with one sink 
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
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
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
teeStream	TokenNameIdentifier	 tee Stream
=	TokenNameEQUAL	
new	TokenNamenew	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sink	TokenNameIdentifier	 sink
=	TokenNameEQUAL	
teeStream	TokenNameIdentifier	 tee Stream
.	TokenNameDOT	
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
new	TokenNamenew	
ModuloSinkFilter	TokenNameIdentifier	 Modulo Sink Filter
(	TokenNameLPAREN	
modCounts	TokenNameIdentifier	 mod Counts
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
teeStream	TokenNameIdentifier	 tee Stream
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
teeStream	TokenNameIdentifier	 tee Stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sinkPos	TokenNameIdentifier	 sink Pos
+=	TokenNamePLUS_EQUAL	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("Modulo--------"); 	TokenNameCOMMENT_LINE	System.out.println("Modulo--------"); 
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
sink	TokenNameIdentifier	 sink
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sink	TokenNameIdentifier	 sink
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sinkPos	TokenNameIdentifier	 sink Pos
+=	TokenNamePLUS_EQUAL	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ModCount: "	TokenNameStringLiteral	ModCount: 
+	TokenNamePLUS	
modCounts	TokenNameIdentifier	 mod Counts
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" Tee fields took "	TokenNameStringLiteral	 Tee fields took 
+	TokenNamePLUS	
(	TokenNameLPAREN	
finish	TokenNameIdentifier	 finish
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ms"	TokenNameStringLiteral	 ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sinkPos	TokenNameIdentifier	 sink Pos
+	TokenNamePLUS	
" does not equal: "	TokenNameStringLiteral	 does not equal: 
+	TokenNamePLUS	
tfPos	TokenNameIdentifier	 tf Pos
,	TokenNameCOMMA	
sinkPos	TokenNameIdentifier	 sink Pos
==	TokenNameEQUAL_EQUAL	
tfPos	TokenNameIdentifier	 tf Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"- End Tokens: "	TokenNameStringLiteral	- End Tokens: 
+	TokenNamePLUS	
tokCount	TokenNameIdentifier	 tok Count
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"-----"	TokenNameStringLiteral	-----
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
ModuloTokenFilter	TokenNameIdentifier	 Modulo Token Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
int	TokenNameint	
modCount	TokenNameIdentifier	 mod Count
;	TokenNameSEMICOLON	
ModuloTokenFilter	TokenNameIdentifier	 Modulo Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modCount	TokenNameIdentifier	 mod Count
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//return every 100 tokens 	TokenNameCOMMENT_LINE	return every 100 tokens 
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
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
hasNext	TokenNameIdentifier	 has Next
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasNext	TokenNameIdentifier	 has Next
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
%	TokenNameREMAINDER	
modCount	TokenNameIdentifier	 mod Count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hasNext	TokenNameIdentifier	 has Next
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hasNext	TokenNameIdentifier	 has Next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
ModuloSinkFilter	TokenNameIdentifier	 Modulo Sink Filter
extends	TokenNameextends	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
.	TokenNameDOT	
SinkFilter	TokenNameIdentifier	 Sink Filter
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
modCount	TokenNameIdentifier	 mod Count
;	TokenNameSEMICOLON	
ModuloSinkFilter	TokenNameIdentifier	 Modulo Sink Filter
(	TokenNameLPAREN	
int	TokenNameint	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modCount	TokenNameIdentifier	 mod Count
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
%	TokenNameREMAINDER	
modCount	TokenNameIdentifier	 mod Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
