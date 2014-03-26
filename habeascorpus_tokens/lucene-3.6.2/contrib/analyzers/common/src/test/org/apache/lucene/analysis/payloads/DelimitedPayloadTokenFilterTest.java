package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
payloads	TokenNameIdentifier	 payloads
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Payload	TokenNameIdentifier	 Payload
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DelimitedPayloadTokenFilterTest	TokenNameIdentifier	 Delimited Payload Token Filter Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPayloads	TokenNameIdentifier	 test Payloads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"The quick|JJ red|JJ fox|NN jumped|VB over the lazy|JJ brown|JJ dogs|NN"	TokenNameStringLiteral	The quick|JJ red|JJ fox|NN jumped|VB over the lazy|JJ brown|JJ dogs|NN
;	TokenNameSEMICOLON	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
.	TokenNameDOT	
DEFAULT_DELIMITER	TokenNameIdentifier	 DEFAULT  DELIMITER
,	TokenNameCOMMA	
new	TokenNamenew	
IdentityEncoder	TokenNameIdentifier	 Identity Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
payAtt	TokenNameIdentifier	 pay Att
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
"JJ"	TokenNameStringLiteral	JJ
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"red"	TokenNameStringLiteral	red
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
"JJ"	TokenNameStringLiteral	JJ
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"fox"	TokenNameStringLiteral	fox
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
"NN"	TokenNameStringLiteral	NN
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"jumped"	TokenNameStringLiteral	jumped
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
"VB"	TokenNameStringLiteral	VB
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"over"	TokenNameStringLiteral	over
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"lazy"	TokenNameStringLiteral	lazy
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
"JJ"	TokenNameStringLiteral	JJ
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
"JJ"	TokenNameStringLiteral	JJ
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"dogs"	TokenNameStringLiteral	dogs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
"NN"	TokenNameStringLiteral	NN
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNext	TokenNameIdentifier	 test Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"The quick|JJ red|JJ fox|NN jumped|VB over the lazy|JJ brown|JJ dogs|NN"	TokenNameStringLiteral	The quick|JJ red|JJ fox|NN jumped|VB over the lazy|JJ brown|JJ dogs|NN
;	TokenNameSEMICOLON	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
.	TokenNameDOT	
DEFAULT_DELIMITER	TokenNameIdentifier	 DEFAULT  DELIMITER
,	TokenNameCOMMA	
new	TokenNamenew	
IdentityEncoder	TokenNameIdentifier	 Identity Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
"JJ"	TokenNameStringLiteral	JJ
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"red"	TokenNameStringLiteral	red
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
"JJ"	TokenNameStringLiteral	JJ
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"fox"	TokenNameStringLiteral	fox
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
"NN"	TokenNameStringLiteral	NN
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"jumped"	TokenNameStringLiteral	jumped
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
"VB"	TokenNameStringLiteral	VB
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"over"	TokenNameStringLiteral	over
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"lazy"	TokenNameStringLiteral	lazy
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
"JJ"	TokenNameStringLiteral	JJ
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
"JJ"	TokenNameStringLiteral	JJ
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"dogs"	TokenNameStringLiteral	dogs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
"NN"	TokenNameStringLiteral	NN
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFloatEncoding	TokenNameIdentifier	 test Float Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"The quick|1.0 red|2.0 fox|3.5 jumped|0.5 over the lazy|5 brown|99.3 dogs|83.7"	TokenNameStringLiteral	The quick|1.0 red|2.0 fox|3.5 jumped|0.5 over the lazy|5 brown|99.3 dogs|83.7
;	TokenNameSEMICOLON	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'|'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
FloatEncoder	TokenNameIdentifier	 Float Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
payAtt	TokenNameIdentifier	 pay Att
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeFloat	TokenNameIdentifier	 encode Float
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"red"	TokenNameStringLiteral	red
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeFloat	TokenNameIdentifier	 encode Float
(	TokenNameLPAREN	
2.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"fox"	TokenNameStringLiteral	fox
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeFloat	TokenNameIdentifier	 encode Float
(	TokenNameLPAREN	
3.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"jumped"	TokenNameStringLiteral	jumped
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeFloat	TokenNameIdentifier	 encode Float
(	TokenNameLPAREN	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"over"	TokenNameStringLiteral	over
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"lazy"	TokenNameStringLiteral	lazy
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeFloat	TokenNameIdentifier	 encode Float
(	TokenNameLPAREN	
5.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeFloat	TokenNameIdentifier	 encode Float
(	TokenNameLPAREN	
99.3f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"dogs"	TokenNameStringLiteral	dogs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeFloat	TokenNameIdentifier	 encode Float
(	TokenNameLPAREN	
83.7f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIntEncoding	TokenNameIdentifier	 test Int Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"The quick|1 red|2 fox|3 jumped over the lazy|5 brown|99 dogs|83"	TokenNameStringLiteral	The quick|1 red|2 fox|3 jumped over the lazy|5 brown|99 dogs|83
;	TokenNameSEMICOLON	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
DelimitedPayloadTokenFilter	TokenNameIdentifier	 Delimited Payload Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'|'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
IntegerEncoder	TokenNameIdentifier	 Integer Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
payAtt	TokenNameIdentifier	 pay Att
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeInt	TokenNameIdentifier	 encode Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"red"	TokenNameStringLiteral	red
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeInt	TokenNameIdentifier	 encode Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"fox"	TokenNameStringLiteral	fox
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeInt	TokenNameIdentifier	 encode Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"jumped"	TokenNameStringLiteral	jumped
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"over"	TokenNameStringLiteral	over
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"lazy"	TokenNameStringLiteral	lazy
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeInt	TokenNameIdentifier	 encode Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeInt	TokenNameIdentifier	 encode Int
(	TokenNameLPAREN	
99	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"dogs"	TokenNameStringLiteral	dogs
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
PayloadHelper	TokenNameIdentifier	 Payload Helper
.	TokenNameDOT	
encodeInt	TokenNameIdentifier	 encode Int
(	TokenNameLPAREN	
83	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectPay	TokenNameIdentifier	 expect Pay
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
payloadAtt	TokenNameIdentifier	 payload Att
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Payload	TokenNameIdentifier	 Payload
payload	TokenNameIdentifier	 payload
=	TokenNameEQUAL	
payloadAtt	TokenNameIdentifier	 payload Att
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not equal: "	TokenNameStringLiteral	 does not equal: 
+	TokenNamePLUS	
expectPay	TokenNameIdentifier	 expect Pay
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expectPay	TokenNameIdentifier	 expect Pay
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
expectPay	TokenNameIdentifier	 expect Pay
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectPay	TokenNameIdentifier	 expect Pay
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" does not equal: "	TokenNameStringLiteral	 does not equal: 
+	TokenNamePLUS	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
byteAt	TokenNameIdentifier	 byte At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expectPay	TokenNameIdentifier	 expect Pay
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
byteAt	TokenNameIdentifier	 byte At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expectPay is not null and it should be"	TokenNameStringLiteral	expectPay is not null and it should be
,	TokenNameCOMMA	
expectPay	TokenNameIdentifier	 expect Pay
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
payAtt	TokenNameIdentifier	 pay Att
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectPay	TokenNameIdentifier	 expect Pay
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Payload	TokenNameIdentifier	 Payload
payload	TokenNameIdentifier	 payload
=	TokenNameEQUAL	
payAtt	TokenNameIdentifier	 pay Att
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not equal: "	TokenNameStringLiteral	 does not equal: 
+	TokenNamePLUS	
expectPay	TokenNameIdentifier	 expect Pay
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expectPay	TokenNameIdentifier	 expect Pay
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
expectPay	TokenNameIdentifier	 expect Pay
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectPay	TokenNameIdentifier	 expect Pay
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" does not equal: "	TokenNameStringLiteral	 does not equal: 
+	TokenNamePLUS	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
byteAt	TokenNameIdentifier	 byte At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expectPay	TokenNameIdentifier	 expect Pay
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
byteAt	TokenNameIdentifier	 byte At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expectPay is not null and it should be"	TokenNameStringLiteral	expectPay is not null and it should be
,	TokenNameCOMMA	
expectPay	TokenNameIdentifier	 expect Pay
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
