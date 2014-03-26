package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
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
IndexReader	TokenNameIdentifier	 Index Reader
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
IndexWriter	TokenNameIdentifier	 Index Writer
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
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
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
Term	TokenNameIdentifier	 Term
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
TermPositions	TokenNameIdentifier	 Term Positions
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
RAMDirectory	TokenNameIdentifier	 RAM Directory
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * Copyright 2004 The Apache Software Foundation * <p/> * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * <p/> * http://www.apache.org/licenses/LICENSE-2.0 * <p/> * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2004 The Apache Software Foundation <p/> Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at <p/> http://www.apache.org/licenses/LICENSE-2.0 <p/> Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestClassicAnalyzer	TokenNameIdentifier	 Test Classic Analyzer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testMaxTermLength	TokenNameIdentifier	 test Max Term Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
sa	TokenNameIdentifier	 sa
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sa	TokenNameIdentifier	 sa
.	TokenNameDOT	
setMaxTokenLength	TokenNameIdentifier	 set Max Token Length
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
sa	TokenNameIdentifier	 sa
,	TokenNameCOMMA	
"ab cd toolong xy z"	TokenNameStringLiteral	ab cd toolong xy z
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
"cd"	TokenNameStringLiteral	cd
,	TokenNameCOMMA	
"xy"	TokenNameStringLiteral	xy
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMaxTermLength2	TokenNameIdentifier	 test Max Term Length2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
sa	TokenNameIdentifier	 sa
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
sa	TokenNameIdentifier	 sa
,	TokenNameCOMMA	
"ab cd toolong xy z"	TokenNameStringLiteral	ab cd toolong xy z
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
"cd"	TokenNameStringLiteral	cd
,	TokenNameCOMMA	
"toolong"	TokenNameStringLiteral	toolong
,	TokenNameCOMMA	
"xy"	TokenNameStringLiteral	xy
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sa	TokenNameIdentifier	 sa
.	TokenNameDOT	
setMaxTokenLength	TokenNameIdentifier	 set Max Token Length
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
sa	TokenNameIdentifier	 sa
,	TokenNameCOMMA	
"ab cd toolong xy z"	TokenNameStringLiteral	ab cd toolong xy z
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
"cd"	TokenNameStringLiteral	cd
,	TokenNameCOMMA	
"xy"	TokenNameStringLiteral	xy
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMaxTermLength3	TokenNameIdentifier	 test Max Term Length3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
255	TokenNameIntegerLiteral	
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
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
longTerm	TokenNameIdentifier	 long Term
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ab cd "	TokenNameStringLiteral	ab cd 
+	TokenNamePLUS	
longTerm	TokenNameIdentifier	 long Term
+	TokenNamePLUS	
" xy z"	TokenNameStringLiteral	 xy z
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
"cd"	TokenNameStringLiteral	cd
,	TokenNameCOMMA	
longTerm	TokenNameIdentifier	 long Term
,	TokenNameCOMMA	
"xy"	TokenNameStringLiteral	xy
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ab cd "	TokenNameStringLiteral	ab cd 
+	TokenNamePLUS	
longTerm	TokenNameIdentifier	 long Term
+	TokenNamePLUS	
"a xy z"	TokenNameStringLiteral	a xy z
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
"cd"	TokenNameStringLiteral	cd
,	TokenNameCOMMA	
"xy"	TokenNameStringLiteral	xy
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAlphanumeric	TokenNameIdentifier	 test Alphanumeric
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// alphanumeric tokens 	TokenNameCOMMENT_LINE	alphanumeric tokens 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"B2B"	TokenNameStringLiteral	B2B
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"b2b"	TokenNameStringLiteral	b2b
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"2B"	TokenNameStringLiteral	2B
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"2b"	TokenNameStringLiteral	2b
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnderscores	TokenNameIdentifier	 test Underscores
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// underscores are delimiters, but not in email addresses (below) 	TokenNameCOMMENT_LINE	underscores are delimiters, but not in email addresses (below) 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"word_having_underscore"	TokenNameStringLiteral	word_having_underscore
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"having"	TokenNameStringLiteral	having
,	TokenNameCOMMA	
"underscore"	TokenNameStringLiteral	underscore
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"word_with_underscore_and_stopwords"	TokenNameStringLiteral	word_with_underscore_and_stopwords
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
"underscore"	TokenNameStringLiteral	underscore
,	TokenNameCOMMA	
"stopwords"	TokenNameStringLiteral	stopwords
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDelimiters	TokenNameIdentifier	 test Delimiters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// other delimiters: "-", "/", "," 	TokenNameCOMMENT_LINE	other delimiters: "-", "/", "," 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"some-dashed-phrase"	TokenNameStringLiteral	some-dashed-phrase
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"some"	TokenNameStringLiteral	some
,	TokenNameCOMMA	
"dashed"	TokenNameStringLiteral	dashed
,	TokenNameCOMMA	
"phrase"	TokenNameStringLiteral	phrase
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"dogs,chase,cats"	TokenNameStringLiteral	dogs,chase,cats
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"dogs"	TokenNameStringLiteral	dogs
,	TokenNameCOMMA	
"chase"	TokenNameStringLiteral	chase
,	TokenNameCOMMA	
"cats"	TokenNameStringLiteral	cats
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ac/dc"	TokenNameStringLiteral	ac/dc
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ac"	TokenNameStringLiteral	ac
,	TokenNameCOMMA	
"dc"	TokenNameStringLiteral	dc
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testApostrophes	TokenNameIdentifier	 test Apostrophes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// internal apostrophes: O'Reilly, you're, O'Reilly's 	TokenNameCOMMENT_LINE	internal apostrophes: O'Reilly, you're, O'Reilly's 
// possessives are actually removed by StardardFilter, not the tokenizer 	TokenNameCOMMENT_LINE	possessives are actually removed by StardardFilter, not the tokenizer 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"O'Reilly"	TokenNameStringLiteral	O'Reilly
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"o'reilly"	TokenNameStringLiteral	o'reilly
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"you're"	TokenNameStringLiteral	you're
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"you're"	TokenNameStringLiteral	you're
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"she's"	TokenNameStringLiteral	she's
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"she"	TokenNameStringLiteral	she
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"Jim's"	TokenNameStringLiteral	Jim's
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jim"	TokenNameStringLiteral	jim
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"don't"	TokenNameStringLiteral	don't
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"don't"	TokenNameStringLiteral	don't
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"O'Reilly's"	TokenNameStringLiteral	O'Reilly's
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"o'reilly"	TokenNameStringLiteral	o'reilly
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTSADash	TokenNameIdentifier	 test TSA Dash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// t and s had been stopwords in Lucene <= 2.0, which made it impossible 	TokenNameCOMMENT_LINE	t and s had been stopwords in Lucene <= 2.0, which made it impossible 
// to correctly search for these terms: 	TokenNameCOMMENT_LINE	to correctly search for these terms: 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"s-class"	TokenNameStringLiteral	s-class
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"s"	TokenNameStringLiteral	s
,	TokenNameCOMMA	
"class"	TokenNameStringLiteral	class
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"t-com"	TokenNameStringLiteral	t-com
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"t"	TokenNameStringLiteral	t
,	TokenNameCOMMA	
"com"	TokenNameStringLiteral	com
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'a' is still a stopword: 	TokenNameCOMMENT_LINE	'a' is still a stopword: 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"a-class"	TokenNameStringLiteral	a-class
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"class"	TokenNameStringLiteral	class
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCompanyNames	TokenNameIdentifier	 test Company Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// company names 	TokenNameCOMMENT_LINE	company names 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"AT&T"	TokenNameStringLiteral	AT&T
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"at&t"	TokenNameStringLiteral	at&t
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"Excite@Home"	TokenNameStringLiteral	Excite@Home
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"excite@home"	TokenNameStringLiteral	excite@home
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLucene1140	TokenNameIdentifier	 test Lucene1140
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"www.nutch.org."	TokenNameStringLiteral	www.nutch.org.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"www.nutch.org"	TokenNameStringLiteral	www.nutch.org
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<HOST>"	TokenNameStringLiteral	<HOST>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should not throw an NPE and it did"	TokenNameStringLiteral	Should not throw an NPE and it did
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDomainNames	TokenNameIdentifier	 test Domain Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Current lucene should not show the bug 	TokenNameCOMMENT_LINE	Current lucene should not show the bug 
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// domain names 	TokenNameCOMMENT_LINE	domain names 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
"www.nutch.org"	TokenNameStringLiteral	www.nutch.org
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"www.nutch.org"	TokenNameStringLiteral	www.nutch.org
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Notice the trailing . See https://issues.apache.org/jira/browse/LUCENE-1068. 	TokenNameCOMMENT_LINE	Notice the trailing . See https://issues.apache.org/jira/browse/LUCENE-1068. 
// the following should be recognized as HOST: 	TokenNameCOMMENT_LINE	the following should be recognized as HOST: 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
"www.nutch.org."	TokenNameStringLiteral	www.nutch.org.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"www.nutch.org"	TokenNameStringLiteral	www.nutch.org
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<HOST>"	TokenNameStringLiteral	<HOST>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2.3 should show the bug 	TokenNameCOMMENT_LINE	2.3 should show the bug 
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_23	TokenNameIdentifier	 LUCENE 23
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
"www.nutch.org."	TokenNameStringLiteral	www.nutch.org.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"wwwnutchorg"	TokenNameStringLiteral	wwwnutchorg
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<ACRONYM>"	TokenNameStringLiteral	<ACRONYM>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2.4 should not show the bug 	TokenNameCOMMENT_LINE	2.4 should not show the bug 
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_24	TokenNameIdentifier	 LUCENE 24
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
"www.nutch.org."	TokenNameStringLiteral	www.nutch.org.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"www.nutch.org"	TokenNameStringLiteral	www.nutch.org
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<HOST>"	TokenNameStringLiteral	<HOST>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEMailAddresses	TokenNameIdentifier	 test E Mail Addresses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// email addresses, possibly with underscores, periods, etc 	TokenNameCOMMENT_LINE	email addresses, possibly with underscores, periods, etc 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"test@example.com"	TokenNameStringLiteral	test@example.com
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"test@example.com"	TokenNameStringLiteral	test@example.com
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"first.lastname@example.com"	TokenNameStringLiteral	first.lastname@example.com
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"first.lastname@example.com"	TokenNameStringLiteral	first.lastname@example.com
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"first_lastname@example.com"	TokenNameStringLiteral	first_lastname@example.com
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"first_lastname@example.com"	TokenNameStringLiteral	first_lastname@example.com
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNumeric	TokenNameIdentifier	 test Numeric
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// floating point, serial, model numbers, ip addresses, etc. 	TokenNameCOMMENT_LINE	floating point, serial, model numbers, ip addresses, etc. 
// every other segment must have at least one digit 	TokenNameCOMMENT_LINE	every other segment must have at least one digit 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"21.35"	TokenNameStringLiteral	21.35
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"21.35"	TokenNameStringLiteral	21.35
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"R2D2 C3PO"	TokenNameStringLiteral	R2D2 C3PO
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"r2d2"	TokenNameStringLiteral	r2d2
,	TokenNameCOMMA	
"c3po"	TokenNameStringLiteral	c3po
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"216.239.63.104"	TokenNameStringLiteral	216.239.63.104
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"216.239.63.104"	TokenNameStringLiteral	216.239.63.104
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"1-2-3"	TokenNameStringLiteral	1-2-3
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"1-2-3"	TokenNameStringLiteral	1-2-3
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"a1-b2-c3"	TokenNameStringLiteral	a1-b2-c3
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"a1-b2-c3"	TokenNameStringLiteral	a1-b2-c3
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"a1-b-c3"	TokenNameStringLiteral	a1-b-c3
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"a1-b-c3"	TokenNameStringLiteral	a1-b-c3
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTextWithNumbers	TokenNameIdentifier	 test Text With Numbers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// numbers 	TokenNameCOMMENT_LINE	numbers 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"David has 5000 bones"	TokenNameStringLiteral	David has 5000 bones
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"david"	TokenNameStringLiteral	david
,	TokenNameCOMMA	
"has"	TokenNameStringLiteral	has
,	TokenNameCOMMA	
"5000"	TokenNameStringLiteral	5000
,	TokenNameCOMMA	
"bones"	TokenNameStringLiteral	bones
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVariousText	TokenNameIdentifier	 test Various Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// various 	TokenNameCOMMENT_LINE	various 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"C embedded developers wanted"	TokenNameStringLiteral	C embedded developers wanted
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"embedded"	TokenNameStringLiteral	embedded
,	TokenNameCOMMA	
"developers"	TokenNameStringLiteral	developers
,	TokenNameCOMMA	
"wanted"	TokenNameStringLiteral	wanted
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"foo bar FOO BAR"	TokenNameStringLiteral	foo bar FOO BAR
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"foo bar . FOO <> BAR"	TokenNameStringLiteral	foo bar . FOO <> BAR
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
""QUOTED" word"	TokenNameStringLiteral	"QUOTED" word
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"quoted"	TokenNameStringLiteral	quoted
,	TokenNameCOMMA	
"word"	TokenNameStringLiteral	word
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAcronyms	TokenNameIdentifier	 test Acronyms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// acronyms have their dots stripped 	TokenNameCOMMENT_LINE	acronyms have their dots stripped 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"U.S.A."	TokenNameStringLiteral	U.S.A.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"usa"	TokenNameStringLiteral	usa
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCPlusPlusHash	TokenNameIdentifier	 test C Plus Plus Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// It would be nice to change the grammar in StandardTokenizer.jj to make "C#" and "C++" end up as tokens. 	TokenNameCOMMENT_LINE	It would be nice to change the grammar in StandardTokenizer.jj to make "C#" and "C++" end up as tokens. 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"C++"	TokenNameStringLiteral	C++
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"c"	TokenNameStringLiteral	c
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"C#"	TokenNameStringLiteral	C#
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"c"	TokenNameStringLiteral	c
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testKorean	TokenNameIdentifier	 test Korean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Korean words 	TokenNameCOMMENT_LINE	Korean words 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"안녕하세요 한글입니다"	TokenNameStringLiteral	안녕하세요 한글입니다
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"안녕하세요"	TokenNameStringLiteral	안녕하세요
,	TokenNameCOMMA	
"한글입니다"	TokenNameStringLiteral	한글입니다
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compliance with the "old" JavaCC-based analyzer, see: 	TokenNameCOMMENT_LINE	Compliance with the "old" JavaCC-based analyzer, see: 
// https://issues.apache.org/jira/browse/LUCENE-966#action_12516752 	TokenNameCOMMENT_LINE	https://issues.apache.org/jira/browse/LUCENE-966#action_12516752 
public	TokenNamepublic	
void	TokenNamevoid	
testComplianceFileName	TokenNameIdentifier	 test Compliance File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"2004.jpg"	TokenNameStringLiteral	2004.jpg
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"2004.jpg"	TokenNameStringLiteral	2004.jpg
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<HOST>"	TokenNameStringLiteral	<HOST>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testComplianceNumericIncorrect	TokenNameIdentifier	 test Compliance Numeric Incorrect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"62.46"	TokenNameStringLiteral	62.46
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"62.46"	TokenNameStringLiteral	62.46
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<HOST>"	TokenNameStringLiteral	<HOST>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testComplianceNumericLong	TokenNameIdentifier	 test Compliance Numeric Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"978-0-94045043-1"	TokenNameStringLiteral	978-0-94045043-1
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"978-0-94045043-1"	TokenNameStringLiteral	978-0-94045043-1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<NUM>"	TokenNameStringLiteral	<NUM>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testComplianceNumericFile	TokenNameIdentifier	 test Compliance Numeric File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"78academyawards/rules/rule02.html"	TokenNameStringLiteral	78academyawards/rules/rule02.html
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"78academyawards/rules/rule02.html"	TokenNameStringLiteral	78academyawards/rules/rule02.html
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<NUM>"	TokenNameStringLiteral	<NUM>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testComplianceNumericWithUnderscores	TokenNameIdentifier	 test Compliance Numeric With Underscores
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"2006-03-11t082958z_01_ban130523_rtridst_0_ozabs"	TokenNameStringLiteral	2006-03-11t082958z_01_ban130523_rtridst_0_ozabs
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"2006-03-11t082958z_01_ban130523_rtridst_0_ozabs"	TokenNameStringLiteral	2006-03-11t082958z_01_ban130523_rtridst_0_ozabs
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<NUM>"	TokenNameStringLiteral	<NUM>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testComplianceNumericWithDash	TokenNameIdentifier	 test Compliance Numeric With Dash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"mid-20th"	TokenNameStringLiteral	mid-20th
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mid-20th"	TokenNameStringLiteral	mid-20th
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<NUM>"	TokenNameStringLiteral	<NUM>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testComplianceManyTokens	TokenNameIdentifier	 test Compliance Many Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"/money.cnn.com/magazines/fortune/fortune_archive/2007/03/19/8402357/index.htm "	TokenNameStringLiteral	/money.cnn.com/magazines/fortune/fortune_archive/2007/03/19/8402357/index.htm 
+	TokenNamePLUS	
"safari-0-sheikh-zayed-grand-mosque.jpg"	TokenNameStringLiteral	safari-0-sheikh-zayed-grand-mosque.jpg
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"money.cnn.com"	TokenNameStringLiteral	money.cnn.com
,	TokenNameCOMMA	
"magazines"	TokenNameStringLiteral	magazines
,	TokenNameCOMMA	
"fortune"	TokenNameStringLiteral	fortune
,	TokenNameCOMMA	
"fortune"	TokenNameStringLiteral	fortune
,	TokenNameCOMMA	
"archive/2007/03/19/8402357"	TokenNameStringLiteral	archive/2007/03/19/8402357
,	TokenNameCOMMA	
"index.htm"	TokenNameStringLiteral	index.htm
,	TokenNameCOMMA	
"safari-0-sheikh"	TokenNameStringLiteral	safari-0-sheikh
,	TokenNameCOMMA	
"zayed"	TokenNameStringLiteral	zayed
,	TokenNameCOMMA	
"grand"	TokenNameStringLiteral	grand
,	TokenNameCOMMA	
"mosque.jpg"	TokenNameStringLiteral	mosque.jpg
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<HOST>"	TokenNameStringLiteral	<HOST>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<NUM>"	TokenNameStringLiteral	<NUM>
,	TokenNameCOMMA	
"<HOST>"	TokenNameStringLiteral	<HOST>
,	TokenNameCOMMA	
"<NUM>"	TokenNameStringLiteral	<NUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<HOST>"	TokenNameStringLiteral	<HOST>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJava14BWCompatibility	TokenNameIdentifier	 test Java14 BW Compatibility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
sa	TokenNameIdentifier	 sa
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
sa	TokenNameIdentifier	 sa
,	TokenNameCOMMA	
"test�test"	TokenNameStringLiteral	test�test
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make sure we skip wicked long terms. */	TokenNameCOMMENT_JAVADOC	 Make sure we skip wicked long terms. 
public	TokenNamepublic	
void	TokenNamevoid	
testWickedLongTerm	TokenNameIdentifier	 test Wicked Long Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
RAMDirectory	TokenNameIdentifier	 RAM Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
IndexWriter	TokenNameIdentifier	 Index Writer
.	TokenNameDOT	
MAX_TERM_LENGTH	TokenNameIdentifier	 MAX  TERM  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bigTerm	TokenNameIdentifier	 big Term
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This produces a too-long term: 	TokenNameCOMMENT_LINE	This produces a too-long term: 
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
"abc xyz x"	TokenNameStringLiteral	abc xyz x
+	TokenNamePLUS	
bigTerm	TokenNameIdentifier	 big Term
+	TokenNamePLUS	
" another term"	TokenNameStringLiteral	 another term
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure we can add another normal document 	TokenNameCOMMENT_LINE	Make sure we can add another normal document 
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"abc bbb ccc"	TokenNameStringLiteral	abc bbb ccc
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure all terms < max size were indexed 	TokenNameCOMMENT_LINE	Make sure all terms < max size were indexed 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"bbb"	TokenNameStringLiteral	bbb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"term"	TokenNameStringLiteral	term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"another"	TokenNameStringLiteral	another
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure position is still incremented when 	TokenNameCOMMENT_LINE	Make sure position is still incremented when 
// massive term is skipped: 	TokenNameCOMMENT_LINE	massive term is skipped: 
TermPositions	TokenNameIdentifier	 Term Positions
tps	TokenNameIdentifier	 tps
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"another"	TokenNameStringLiteral	another
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
tps	TokenNameIdentifier	 tps
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tps	TokenNameIdentifier	 tps
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tps	TokenNameIdentifier	 tps
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure the doc that has the massive term is in 	TokenNameCOMMENT_LINE	Make sure the doc that has the massive term is in 
// the index: 	TokenNameCOMMENT_LINE	the index: 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"document with wicked long term should is not in the index!"	TokenNameStringLiteral	document with wicked long term should is not in the index!
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure we can add a document with exactly the 	TokenNameCOMMENT_LINE	Make sure we can add a document with exactly the 
// maximum length term, and search on that term: 	TokenNameCOMMENT_LINE	maximum length term, and search on that term: 
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
bigTerm	TokenNameIdentifier	 big Term
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
sa	TokenNameIdentifier	 sa
=	TokenNameEQUAL	
new	TokenNamenew	
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sa	TokenNameIdentifier	 sa
.	TokenNameDOT	
setMaxTokenLength	TokenNameIdentifier	 set Max Token Length
(	TokenNameLPAREN	
100000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
sa	TokenNameIdentifier	 sa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
bigTerm	TokenNameIdentifier	 big Term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
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
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
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
ClassicAnalyzer	TokenNameIdentifier	 Classic Analyzer
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
}	TokenNameRBRACE	
