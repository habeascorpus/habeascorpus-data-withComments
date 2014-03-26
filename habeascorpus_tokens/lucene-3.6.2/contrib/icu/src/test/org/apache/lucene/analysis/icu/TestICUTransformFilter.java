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
TokenStream	TokenNameIdentifier	 Token Stream
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
Transliterator	TokenNameIdentifier	 Transliterator
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
UnicodeSet	TokenNameIdentifier	 Unicode Set
;	TokenNameSEMICOLON	
/** * Test the ICUTransformFilter with some basic examples. */	TokenNameCOMMENT_JAVADOC	 Test the ICUTransformFilter with some basic examples. 
public	TokenNamepublic	
class	TokenNameclass	
TestICUTransformFilter	TokenNameIdentifier	 Test ICU Transform Filter
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasicFunctionality	TokenNameIdentifier	 test Basic Functionality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"Traditional-Simplified"	TokenNameStringLiteral	Traditional-Simplified
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"簡化字"	TokenNameStringLiteral	簡化字
,	TokenNameCOMMA	
"简化字"	TokenNameStringLiteral	简化字
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"Katakana-Hiragana"	TokenNameStringLiteral	Katakana-Hiragana
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"ヒラガナ"	TokenNameStringLiteral	ヒラガナ
,	TokenNameCOMMA	
"ひらがな"	TokenNameStringLiteral	ひらがな
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"Fullwidth-Halfwidth"	TokenNameStringLiteral	Fullwidth-Halfwidth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"アルアノリウ"	TokenNameStringLiteral	アルアノリウ
,	TokenNameCOMMA	
"ｱﾙｱﾉﾘｳ"	TokenNameStringLiteral	ｱﾙｱﾉﾘｳ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"Any-Latin"	TokenNameStringLiteral	Any-Latin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"Αλφαβητικός Κατάλογος"	TokenNameStringLiteral	Αλφαβητικός Κατάλογος
,	TokenNameCOMMA	
"Alphabētikós Katálogos"	TokenNameStringLiteral	Alphabētikós Katálogos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"NFD; [:Nonspacing Mark:] Remove"	TokenNameStringLiteral	NFD; [:Nonspacing Mark:] Remove
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"Alphabētikós Katálogos"	TokenNameStringLiteral	Alphabētikós Katálogos
,	TokenNameCOMMA	
"Alphabetikos Katalogos"	TokenNameStringLiteral	Alphabetikos Katalogos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"Han-Latin"	TokenNameStringLiteral	Han-Latin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"中国"	TokenNameStringLiteral	中国
,	TokenNameCOMMA	
"zhōng guó"	TokenNameStringLiteral	zhōng guó
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCustomFunctionality	TokenNameIdentifier	 test Custom Functionality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
"a > b; b > c;"	TokenNameStringLiteral	a > b; b > c;
;	TokenNameSEMICOLON	
// convert a's to b's and b's to c's 	TokenNameCOMMENT_LINE	convert a's to b's and b's to c's 
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
createFromRules	TokenNameIdentifier	 create From Rules
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
FORWARD	TokenNameIdentifier	 FORWARD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"abacadaba"	TokenNameStringLiteral	abacadaba
,	TokenNameCOMMA	
"bcbcbdbcb"	TokenNameStringLiteral	bcbcbdbcb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCustomFunctionality2	TokenNameIdentifier	 test Custom Functionality2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
"c { a > b; a > d;"	TokenNameStringLiteral	c { a > b; a > d;
;	TokenNameSEMICOLON	
// convert a's to b's and b's to c's 	TokenNameCOMMENT_LINE	convert a's to b's and b's to c's 
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
createFromRules	TokenNameIdentifier	 create From Rules
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
FORWARD	TokenNameIdentifier	 FORWARD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"caa"	TokenNameStringLiteral	caa
,	TokenNameCOMMA	
"cbd"	TokenNameStringLiteral	cbd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOptimizer	TokenNameIdentifier	 test Optimizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
"a > b; b > c;"	TokenNameStringLiteral	a > b; b > c;
;	TokenNameSEMICOLON	
// convert a's to b's and b's to c's 	TokenNameCOMMENT_LINE	convert a's to b's and b's to c's 
Transliterator	TokenNameIdentifier	 Transliterator
custom	TokenNameIdentifier	 custom
=	TokenNameEQUAL	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
createFromRules	TokenNameIdentifier	 create From Rules
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
FORWARD	TokenNameIdentifier	 FORWARD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
custom	TokenNameIdentifier	 custom
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ICUTransformFilter	TokenNameIdentifier	 ICU Transform Filter
(	TokenNameLPAREN	
new	TokenNamenew	
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
custom	TokenNameIdentifier	 custom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
custom	TokenNameIdentifier	 custom
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
new	TokenNamenew	
UnicodeSet	TokenNameIdentifier	 Unicode Set
(	TokenNameLPAREN	
"[ab]"	TokenNameStringLiteral	[ab]
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOptimizer2	TokenNameIdentifier	 test Optimizer2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"Traditional-Simplified; CaseFold"	TokenNameStringLiteral	Traditional-Simplified; CaseFold
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"ABCDE"	TokenNameStringLiteral	ABCDE
,	TokenNameCOMMA	
"abcde"	TokenNameStringLiteral	abcde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOptimizerSurrogate	TokenNameIdentifier	 test Optimizer Surrogate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
"\U00020087 > x;"	TokenNameStringLiteral	\U00020087 > x;
;	TokenNameSEMICOLON	
// convert CJK UNIFIED IDEOGRAPH-20087 to an x 	TokenNameCOMMENT_LINE	convert CJK UNIFIED IDEOGRAPH-20087 to an x 
Transliterator	TokenNameIdentifier	 Transliterator
custom	TokenNameIdentifier	 custom
=	TokenNameEQUAL	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
createFromRules	TokenNameIdentifier	 create From Rules
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
FORWARD	TokenNameIdentifier	 FORWARD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
custom	TokenNameIdentifier	 custom
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ICUTransformFilter	TokenNameIdentifier	 ICU Transform Filter
(	TokenNameLPAREN	
new	TokenNamenew	
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
custom	TokenNameIdentifier	 custom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
custom	TokenNameIdentifier	 custom
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
new	TokenNamenew	
UnicodeSet	TokenNameIdentifier	 Unicode Set
(	TokenNameLPAREN	
"[\U00020087]"	TokenNameStringLiteral	[\U00020087]
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkToken	TokenNameIdentifier	 check Token
(	TokenNameLPAREN	
Transliterator	TokenNameIdentifier	 Transliterator
transform	TokenNameIdentifier	 transform
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
ICUTransformFilter	TokenNameIdentifier	 ICU Transform Filter
(	TokenNameLPAREN	
new	TokenNamenew	
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
expected	TokenNameIdentifier	 expected
}	TokenNameRBRACE	
)	TokenNameRPAREN	
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
final	TokenNamefinal	
Transliterator	TokenNameIdentifier	 Transliterator
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"Any-Latin"	TokenNameStringLiteral	Any-Latin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
ICUTransformFilter	TokenNameIdentifier	 ICU Transform Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
transform	TokenNameIdentifier	 transform
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
1000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
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
ICUTransformFilter	TokenNameIdentifier	 ICU Transform Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"Any-Latin"	TokenNameStringLiteral	Any-Latin
)	TokenNameRPAREN	
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
