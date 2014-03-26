package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
miscellaneous	TokenNameIdentifier	 miscellaneous
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
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
UncaughtExceptionHandler	TokenNameIdentifier	 Uncaught Exception Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
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
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
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
/** * Verifies the behavior of PatternAnalyzer. */	TokenNameCOMMENT_JAVADOC	 Verifies the behavior of PatternAnalyzer. 
public	TokenNamepublic	
class	TokenNameclass	
PatternAnalyzerTest	TokenNameIdentifier	 Pattern Analyzer Test
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
/** * Test PatternAnalyzer when it is configured with a non-word pattern. * Behavior can be similar to SimpleAnalyzer (depending upon options) */	TokenNameCOMMENT_JAVADOC	 Test PatternAnalyzer when it is configured with a non-word pattern. Behavior can be similar to SimpleAnalyzer (depending upon options) 
public	TokenNamepublic	
void	TokenNamevoid	
testNonWordPattern	TokenNameIdentifier	 test Non Word Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Split on non-letter pattern, do not lowercase, no stopwords 	TokenNameCOMMENT_LINE	Split on non-letter pattern, do not lowercase, no stopwords 
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
.	TokenNameDOT	
NON_WORD_PATTERN	TokenNameIdentifier	 NON  WORD  PATTERN
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"The quick brown Fox,the abcd1234 (56.78) dc."	TokenNameStringLiteral	The quick brown Fox,the abcd1234 (56.78) dc.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
"Fox"	TokenNameStringLiteral	Fox
,	TokenNameCOMMA	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
"abcd"	TokenNameStringLiteral	abcd
,	TokenNameCOMMA	
"dc"	TokenNameStringLiteral	dc
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// split on non-letter pattern, lowercase, english stopwords 	TokenNameCOMMENT_LINE	split on non-letter pattern, lowercase, english stopwords 
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
.	TokenNameDOT	
NON_WORD_PATTERN	TokenNameIdentifier	 NON  WORD  PATTERN
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
.	TokenNameDOT	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
"The quick brown Fox,the abcd1234 (56.78) dc."	TokenNameStringLiteral	The quick brown Fox,the abcd1234 (56.78) dc.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
"fox"	TokenNameStringLiteral	fox
,	TokenNameCOMMA	
"abcd"	TokenNameStringLiteral	abcd
,	TokenNameCOMMA	
"dc"	TokenNameStringLiteral	dc
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test PatternAnalyzer when it is configured with a whitespace pattern. * Behavior can be similar to WhitespaceAnalyzer (depending upon options) */	TokenNameCOMMENT_JAVADOC	 Test PatternAnalyzer when it is configured with a whitespace pattern. Behavior can be similar to WhitespaceAnalyzer (depending upon options) 
public	TokenNamepublic	
void	TokenNamevoid	
testWhitespacePattern	TokenNameIdentifier	 test Whitespace Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Split on whitespace patterns, do not lowercase, no stopwords 	TokenNameCOMMENT_LINE	Split on whitespace patterns, do not lowercase, no stopwords 
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
.	TokenNameDOT	
WHITESPACE_PATTERN	TokenNameIdentifier	 WHITESPACE  PATTERN
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"The quick brown Fox,the abcd1234 (56.78) dc."	TokenNameStringLiteral	The quick brown Fox,the abcd1234 (56.78) dc.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
"Fox,the"	TokenNameStringLiteral	Fox,the
,	TokenNameCOMMA	
"abcd1234"	TokenNameStringLiteral	abcd1234
,	TokenNameCOMMA	
"(56.78)"	TokenNameStringLiteral	(56.78)
,	TokenNameCOMMA	
"dc."	TokenNameStringLiteral	dc.
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Split on whitespace patterns, lowercase, english stopwords 	TokenNameCOMMENT_LINE	Split on whitespace patterns, lowercase, english stopwords 
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
.	TokenNameDOT	
WHITESPACE_PATTERN	TokenNameIdentifier	 WHITESPACE  PATTERN
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
.	TokenNameDOT	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
"The quick brown Fox,the abcd1234 (56.78) dc."	TokenNameStringLiteral	The quick brown Fox,the abcd1234 (56.78) dc.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
"fox,the"	TokenNameStringLiteral	fox,the
,	TokenNameCOMMA	
"abcd1234"	TokenNameStringLiteral	abcd1234
,	TokenNameCOMMA	
"(56.78)"	TokenNameStringLiteral	(56.78)
,	TokenNameCOMMA	
"dc."	TokenNameStringLiteral	dc.
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test PatternAnalyzer when it is configured with a custom pattern. In this * case, text is tokenized on the comma "," */	TokenNameCOMMENT_JAVADOC	 Test PatternAnalyzer when it is configured with a custom pattern. In this case, text is tokenized on the comma "," 
public	TokenNamepublic	
void	TokenNamevoid	
testCustomPattern	TokenNameIdentifier	 test Custom Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Split on comma, do not lowercase, no stopwords 	TokenNameCOMMENT_LINE	Split on comma, do not lowercase, no stopwords 
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"Here,Are,some,Comma,separated,words,"	TokenNameStringLiteral	Here,Are,some,Comma,separated,words,
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Here"	TokenNameStringLiteral	Here
,	TokenNameCOMMA	
"Are"	TokenNameStringLiteral	Are
,	TokenNameCOMMA	
"some"	TokenNameStringLiteral	some
,	TokenNameCOMMA	
"Comma"	TokenNameStringLiteral	Comma
,	TokenNameCOMMA	
"separated"	TokenNameStringLiteral	separated
,	TokenNameCOMMA	
"words"	TokenNameStringLiteral	words
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// split on comma, lowercase, english stopwords 	TokenNameCOMMENT_LINE	split on comma, lowercase, english stopwords 
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
.	TokenNameDOT	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
"Here,Are,some,Comma,separated,words,"	TokenNameStringLiteral	Here,Are,some,Comma,separated,words,
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"some"	TokenNameStringLiteral	some
,	TokenNameCOMMA	
"comma"	TokenNameStringLiteral	comma
,	TokenNameCOMMA	
"separated"	TokenNameStringLiteral	separated
,	TokenNameCOMMA	
"words"	TokenNameStringLiteral	words
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test PatternAnalyzer against a large document. */	TokenNameCOMMENT_JAVADOC	 Test PatternAnalyzer against a large document. 
public	TokenNamepublic	
void	TokenNamevoid	
testHugeDocument	TokenNameIdentifier	 test Huge Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 5000 a's 	TokenNameCOMMENT_LINE	5000 a's 
char	TokenNamechar	
largeWord	TokenNameIdentifier	 large Word
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
5000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
largeWord	TokenNameIdentifier	 large Word
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
largeWord	TokenNameIdentifier	 large Word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a space 	TokenNameCOMMENT_LINE	a space 
document	TokenNameIdentifier	 document
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2000 b's 	TokenNameCOMMENT_LINE	2000 b's 
char	TokenNamechar	
largeWord2	TokenNameIdentifier	 large Word2
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
largeWord2	TokenNameIdentifier	 large Word2
,	TokenNameCOMMA	
'b'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
largeWord2	TokenNameIdentifier	 large Word2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Split on whitespace patterns, do not lowercase, no stopwords 	TokenNameCOMMENT_LINE	Split on whitespace patterns, do not lowercase, no stopwords 
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
.	TokenNameDOT	
WHITESPACE_PATTERN	TokenNameIdentifier	 WHITESPACE  PATTERN
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
largeWord	TokenNameIdentifier	 large Word
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
largeWord2	TokenNameIdentifier	 large Word2
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Verify the analyzer analyzes to the expected contents. For PatternAnalyzer, * several methods are verified: * <ul> * <li>Analysis with a normal Reader * <li>Analysis with a FastStringReader * <li>Analysis with a String * </ul> */	TokenNameCOMMENT_JAVADOC	 Verify the analyzer analyzes to the expected contents. For PatternAnalyzer, several methods are verified: <ul> <li>Analysis with a normal Reader <li>Analysis with a FastStringReader <li>Analysis with a String </ul> 
private	TokenNameprivate	
void	TokenNamevoid	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// ordinary analysis of a Reader 	TokenNameCOMMENT_LINE	ordinary analysis of a Reader 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// analysis with a "FastStringReader" 	TokenNameCOMMENT_LINE	analysis with a "FastStringReader" 
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
new	TokenNamenew	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
.	TokenNameDOT	
FastStringReader	TokenNameIdentifier	 Fast String Reader
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// analysis of a String, uses PatternAnalyzer.tokenStream(String, String) 	TokenNameCOMMENT_LINE	analysis of a String, uses PatternAnalyzer.tokenStream(String, String) 
TokenStream	TokenNameIdentifier	 Token Stream
ts2	TokenNameIdentifier	 ts2
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts2	TokenNameIdentifier	 ts2
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
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
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PatternAnalyzer	TokenNameIdentifier	 Pattern Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
.	TokenNameDOT	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dodge jre bug http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=7104012 	TokenNameCOMMENT_LINE	dodge jre bug http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=7104012 
final	TokenNamefinal	
UncaughtExceptionHandler	TokenNameIdentifier	 Uncaught Exception Handler
savedHandler	TokenNameIdentifier	 saved Handler
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
getDefaultUncaughtExceptionHandler	TokenNameIdentifier	 get Default Uncaught Exception Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
setDefaultUncaughtExceptionHandler	TokenNameIdentifier	 set Default Uncaught Exception Handler
(	TokenNameLPAREN	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
UncaughtExceptionHandler	TokenNameIdentifier	 Uncaught Exception Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not in Java 5: @Override 	TokenNameCOMMENT_LINE	Not in Java 5: @Override 
public	TokenNamepublic	
void	TokenNamevoid	
uncaughtException	TokenNameIdentifier	 uncaught Exception
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assumeTrue	TokenNameIdentifier	 assume True
(	TokenNameLPAREN	
"not failing due to jre bug "	TokenNameStringLiteral	not failing due to jre bug 
,	TokenNameCOMMA	
!	TokenNameNOT	
isJREBug7104012	TokenNameIdentifier	 is JRE Bug7104012
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// otherwise its some other bug, pass to default handler 	TokenNameCOMMENT_LINE	otherwise its some other bug, pass to default handler 
savedHandler	TokenNameIdentifier	 saved Handler
.	TokenNameDOT	
uncaughtException	TokenNameIdentifier	 uncaught Exception
(	TokenNameLPAREN	
thread	TokenNameIdentifier	 thread
,	TokenNameCOMMA	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
getDefaultUncaughtExceptionHandler	TokenNameIdentifier	 get Default Uncaught Exception Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assumeTrue	TokenNameIdentifier	 assume True
(	TokenNameLPAREN	
"not failing due to jre bug "	TokenNameStringLiteral	not failing due to jre bug 
,	TokenNameCOMMA	
!	TokenNameNOT	
isJREBug7104012	TokenNameIdentifier	 is JRE Bug7104012
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
// otherwise rethrow 	TokenNameCOMMENT_LINE	otherwise rethrow 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
setDefaultUncaughtExceptionHandler	TokenNameIdentifier	 set Default Uncaught Exception Handler
(	TokenNameLPAREN	
savedHandler	TokenNameIdentifier	 saved Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
boolean	TokenNameboolean	
isJREBug7104012	TokenNameIdentifier	 is JRE Bug7104012
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// BaseTokenStreamTestCase now wraps exc in a new RuntimeException: 	TokenNameCOMMENT_LINE	BaseTokenStreamTestCase now wraps exc in a new RuntimeException: 
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
StackTraceElement	TokenNameIdentifier	 Stack Trace Element
trace	TokenNameIdentifier	 trace
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getStackTrace	TokenNameIdentifier	 get Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
StackTraceElement	TokenNameIdentifier	 Stack Trace Element
st	TokenNameIdentifier	 st
:	TokenNameCOLON	
trace	TokenNameIdentifier	 trace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"java.text.RuleBasedBreakIterator"	TokenNameStringLiteral	java.text.RuleBasedBreakIterator
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
"lookupBackwardState"	TokenNameStringLiteral	lookupBackwardState
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
getMethodName	TokenNameIdentifier	 get Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
