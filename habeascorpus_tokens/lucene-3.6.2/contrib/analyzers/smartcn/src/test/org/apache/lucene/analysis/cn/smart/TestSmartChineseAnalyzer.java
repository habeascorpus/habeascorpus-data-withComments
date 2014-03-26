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
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
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
TokenFilter	TokenNameIdentifier	 Token Filter
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
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestSmartChineseAnalyzer	TokenNameIdentifier	 Test Smart Chinese Analyzer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testChineseStopWordsDefault	TokenNameIdentifier	 test Chinese Stop Words Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* will load stopwords */	TokenNameCOMMENT_BLOCK	 will load stopwords 
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
=	TokenNameEQUAL	
"我购买了道具和服装。"	TokenNameStringLiteral	我购买了道具和服装。
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
,	TokenNameCOMMA	
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set stop-words from the outer world - must yield same behavior 	TokenNameCOMMENT_LINE	set stop-words from the outer world - must yield same behavior 
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
.	TokenNameDOT	
getDefaultStopSet	TokenNameIdentifier	 get Default Stop Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
,	TokenNameCOMMA	
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * This test is the same as the above, except with two phrases. * This tests to ensure the SentenceTokenizer->WordTokenFilter chain works correctly. */	TokenNameCOMMENT_BLOCK	 This test is the same as the above, except with two phrases. This tests to ensure the SentenceTokenizer->WordTokenFilter chain works correctly. 
public	TokenNamepublic	
void	TokenNamevoid	
testChineseStopWordsDefaultTwoPhrases	TokenNameIdentifier	 test Chinese Stop Words Default Two Phrases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* will load stopwords */	TokenNameCOMMENT_BLOCK	 will load stopwords 
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
=	TokenNameEQUAL	
"我购买了道具和服装。 我购买了道具和服装。"	TokenNameStringLiteral	我购买了道具和服装。 我购买了道具和服装。
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
,	TokenNameCOMMA	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
,	TokenNameCOMMA	
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * This test is the same as the above, except using an ideographic space as a separator. * This tests to ensure the stopwords are working correctly. */	TokenNameCOMMENT_BLOCK	 This test is the same as the above, except using an ideographic space as a separator. This tests to ensure the stopwords are working correctly. 
public	TokenNamepublic	
void	TokenNamevoid	
testChineseStopWordsDefaultTwoPhrasesIdeoSpace	TokenNameIdentifier	 test Chinese Stop Words Default Two Phrases Ideo Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* will load stopwords */	TokenNameCOMMENT_BLOCK	 will load stopwords 
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
=	TokenNameEQUAL	
"我购买了道具和服装　我购买了道具和服装。"	TokenNameStringLiteral	我购买了道具和服装　我购买了道具和服装。
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
,	TokenNameCOMMA	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
,	TokenNameCOMMA	
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Punctuation is handled in a strange way if you disable stopwords * In this example the IDEOGRAPHIC FULL STOP is converted into a comma. * if you don't supply (true) to the constructor, or use a different stopwords list, * then punctuation is indexed. */	TokenNameCOMMENT_BLOCK	 Punctuation is handled in a strange way if you disable stopwords In this example the IDEOGRAPHIC FULL STOP is converted into a comma. if you don't supply (true) to the constructor, or use a different stopwords list, then punctuation is indexed. 
public	TokenNamepublic	
void	TokenNamevoid	
testChineseStopWordsOff	TokenNameIdentifier	 test Chinese Stop Words Off
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
analyzers	TokenNameIdentifier	 analyzers
=	TokenNameEQUAL	
new	TokenNamenew	
Analyzer	TokenNameIdentifier	 Analyzer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/* doesn't load stopwords */	TokenNameCOMMENT_BLOCK	 doesn't load stopwords 
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
/* sets stopwords to empty set */	TokenNameCOMMENT_BLOCK	 sets stopwords to empty set 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
=	TokenNameEQUAL	
"我购买了道具和服装。"	TokenNameStringLiteral	我购买了道具和服装。
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
:	TokenNameCOLON	
analyzers	TokenNameIdentifier	 analyzers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Check that position increments after stopwords are correct, * when stopfilter is configured with enablePositionIncrements */	TokenNameCOMMENT_BLOCK	 Check that position increments after stopwords are correct, when stopfilter is configured with enablePositionIncrements 
public	TokenNamepublic	
void	TokenNamevoid	
testChineseStopWords2	TokenNameIdentifier	 test Chinese Stop Words2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* will load stopwords */	TokenNameCOMMENT_BLOCK	 will load stopwords 
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
=	TokenNameEQUAL	
"Title:San"	TokenNameStringLiteral	Title:San
;	TokenNameSEMICOLON	
// : is a stopword 	TokenNameCOMMENT_LINE	: is a stopword 
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"titl"	TokenNameStringLiteral	titl
,	TokenNameCOMMA	
"san"	TokenNameStringLiteral	san
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
posIncr	TokenNameIdentifier	 pos Incr
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
,	TokenNameCOMMA	
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
posIncr	TokenNameIdentifier	 pos Incr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testChineseAnalyzer	TokenNameIdentifier	 test Chinese Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
=	TokenNameEQUAL	
"我购买了道具和服装。"	TokenNameStringLiteral	我购买了道具和服装。
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
,	TokenNameCOMMA	
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * English words are lowercased and porter-stemmed. */	TokenNameCOMMENT_BLOCK	 English words are lowercased and porter-stemmed. 
public	TokenNamepublic	
void	TokenNamevoid	
testMixedLatinChinese	TokenNameIdentifier	 test Mixed Latin Chinese
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"我购买 Tests 了道具和服装"	TokenNameStringLiteral	我购买 Tests 了道具和服装
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Numerics are parsed as their own tokens */	TokenNameCOMMENT_BLOCK	 Numerics are parsed as their own tokens 
public	TokenNamepublic	
void	TokenNamevoid	
testNumerics	TokenNameIdentifier	 test Numerics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"我购买 Tests 了道具和服装1234"	TokenNameStringLiteral	我购买 Tests 了道具和服装1234
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
,	TokenNameCOMMA	
"1234"	TokenNameStringLiteral	1234
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Full width alphas and numerics are folded to half-width */	TokenNameCOMMENT_BLOCK	 Full width alphas and numerics are folded to half-width 
public	TokenNamepublic	
void	TokenNamevoid	
testFullWidth	TokenNameIdentifier	 test Full Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"我购买 Ｔｅｓｔｓ 了道具和服装１２３４"	TokenNameStringLiteral	我购买 Ｔｅｓｔｓ 了道具和服装１２３４
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
,	TokenNameCOMMA	
"1234"	TokenNameStringLiteral	1234
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Presentation form delimiters are removed */	TokenNameCOMMENT_BLOCK	 Presentation form delimiters are removed 
public	TokenNamepublic	
void	TokenNamevoid	
testDelimiters	TokenNameIdentifier	 test Delimiters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"我购买︱ Tests 了道具和服装"	TokenNameStringLiteral	我购买︱ Tests 了道具和服装
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Text from writing systems other than Chinese and Latin are parsed as individual characters. * (regardless of Unicode category) */	TokenNameCOMMENT_BLOCK	 Text from writing systems other than Chinese and Latin are parsed as individual characters. (regardless of Unicode category) 
public	TokenNamepublic	
void	TokenNamevoid	
testNonChinese	TokenNameIdentifier	 test Non Chinese
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"我购买 روبرتTests 了道具和服装"	TokenNameStringLiteral	我购买 روبرتTests 了道具和服装
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"ر"	TokenNameStringLiteral	ر
,	TokenNameCOMMA	
"و"	TokenNameStringLiteral	و
,	TokenNameCOMMA	
"ب"	TokenNameStringLiteral	ب
,	TokenNameCOMMA	
"ر"	TokenNameStringLiteral	ر
,	TokenNameCOMMA	
"ت"	TokenNameStringLiteral	ت
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Test what the analyzer does with out-of-vocabulary words. * In this case the name is Yousaf Raza Gillani. * Currently it is being analyzed into single characters... */	TokenNameCOMMENT_BLOCK	 Test what the analyzer does with out-of-vocabulary words. In this case the name is Yousaf Raza Gillani. Currently it is being analyzed into single characters... 
public	TokenNamepublic	
void	TokenNamevoid	
testOOV	TokenNameIdentifier	 test OOV
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"优素福·拉扎·吉拉尼"	TokenNameStringLiteral	优素福·拉扎·吉拉尼
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"优"	TokenNameStringLiteral	优
,	TokenNameCOMMA	
"素"	TokenNameStringLiteral	素
,	TokenNameCOMMA	
"福"	TokenNameStringLiteral	福
,	TokenNameCOMMA	
"拉"	TokenNameStringLiteral	拉
,	TokenNameCOMMA	
"扎"	TokenNameStringLiteral	扎
,	TokenNameCOMMA	
"吉"	TokenNameStringLiteral	吉
,	TokenNameCOMMA	
"拉"	TokenNameStringLiteral	拉
,	TokenNameCOMMA	
"尼"	TokenNameStringLiteral	尼
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"优素福拉扎吉拉尼"	TokenNameStringLiteral	优素福拉扎吉拉尼
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"优"	TokenNameStringLiteral	优
,	TokenNameCOMMA	
"素"	TokenNameStringLiteral	素
,	TokenNameCOMMA	
"福"	TokenNameStringLiteral	福
,	TokenNameCOMMA	
"拉"	TokenNameStringLiteral	拉
,	TokenNameCOMMA	
"扎"	TokenNameStringLiteral	扎
,	TokenNameCOMMA	
"吉"	TokenNameStringLiteral	吉
,	TokenNameCOMMA	
"拉"	TokenNameStringLiteral	拉
,	TokenNameCOMMA	
"尼"	TokenNameStringLiteral	尼
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOffsets	TokenNameIdentifier	 test Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"我购买了道具和服装"	TokenNameStringLiteral	我购买了道具和服装
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReusableTokenStream	TokenNameIdentifier	 test Reusable Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"我购买 Tests 了道具和服装"	TokenNameStringLiteral	我购买 Tests 了道具和服装
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"我购买了道具和服装。"	TokenNameStringLiteral	我购买了道具和服装。
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"购买"	TokenNameStringLiteral	购买
,	TokenNameCOMMA	
"了"	TokenNameStringLiteral	了
,	TokenNameCOMMA	
"道具"	TokenNameStringLiteral	道具
,	TokenNameCOMMA	
"和"	TokenNameStringLiteral	和
,	TokenNameCOMMA	
"服装"	TokenNameStringLiteral	服装
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-3026 	TokenNameCOMMENT_LINE	LUCENE-3026 
public	TokenNamepublic	
void	TokenNamevoid	
testLargeDocument	TokenNameIdentifier	 test Large Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
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
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"我购买了道具和服装。"	TokenNameStringLiteral	我购买了道具和服装。
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// LUCENE-3026 	TokenNameCOMMENT_LINE	LUCENE-3026 
public	TokenNamepublic	
void	TokenNamevoid	
testLargeSentence	TokenNameIdentifier	 test Large Sentence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
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
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"我购买了道具和服装"	TokenNameStringLiteral	我购买了道具和服装
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// LUCENE-3642 	TokenNameCOMMENT_LINE	LUCENE-3642 
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidOffset	TokenNameIdentifier	 test Invalid Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
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
TokenFilter	TokenNameIdentifier	 Token Filter
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
new	TokenNamenew	
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
new	TokenNamenew	
WordTokenFilter	TokenNameIdentifier	 Word Token Filter
(	TokenNameLPAREN	
filters	TokenNameIdentifier	 filters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"mosfellsbær"	TokenNameStringLiteral	mosfellsbær
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mosfellsbaer"	TokenNameStringLiteral	mosfellsbaer
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
11	TokenNameIntegerLiteral	
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
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
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
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
new	TokenNamenew	
SmartChineseAnalyzer	TokenNameIdentifier	 Smart Chinese Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
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
WordTokenFilter	TokenNameIdentifier	 Word Token Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
