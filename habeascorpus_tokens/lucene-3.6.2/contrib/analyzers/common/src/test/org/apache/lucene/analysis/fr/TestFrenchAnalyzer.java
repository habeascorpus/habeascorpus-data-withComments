package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
fr	TokenNameIdentifier	 fr
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
CharArraySet	TokenNameIdentifier	 Char Array Set
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
/** * Test case for FrenchAnalyzer. * * @version $version$ */	TokenNameCOMMENT_JAVADOC	 Test case for FrenchAnalyzer. * @version $version$ 
public	TokenNamepublic	
class	TokenNameclass	
TestFrenchAnalyzer	TokenNameIdentifier	 Test French Analyzer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAnalyzer	TokenNameIdentifier	 test Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
fa	TokenNameIdentifier	 fa
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"chien chat cheval"	TokenNameStringLiteral	chien chat cheval
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
,	TokenNameCOMMA	
"chat"	TokenNameStringLiteral	chat
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"chien CHAT CHEVAL"	TokenNameStringLiteral	chien CHAT CHEVAL
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
,	TokenNameCOMMA	
"chat"	TokenNameStringLiteral	chat
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
" chien ,? + = - CHAT /: > CHEVAL"	TokenNameStringLiteral	 chien ,? + = - CHAT /: > CHEVAL
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
,	TokenNameCOMMA	
"chat"	TokenNameStringLiteral	chat
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"chien++"	TokenNameStringLiteral	chien++
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"mot "entreguillemet""	TokenNameStringLiteral	mot "entreguillemet"
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mot"	TokenNameStringLiteral	mot
,	TokenNameCOMMA	
"entreguilemet"	TokenNameStringLiteral	entreguilemet
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// let's do some french specific tests now 	TokenNameCOMMENT_LINE	let's do some french specific tests now 
/* 1. couldn't resist I would expect this to stay one term as in French the minus sign is often used for composing words */	TokenNameCOMMENT_BLOCK	 1. couldn't resist I would expect this to stay one term as in French the minus sign is often used for composing words 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"Jean-François"	TokenNameStringLiteral	Jean-François
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jean"	TokenNameStringLiteral	jean
,	TokenNameCOMMA	
"francoi"	TokenNameStringLiteral	francoi
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2. stopwords 	TokenNameCOMMENT_LINE	2. stopwords 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"le la chien les aux chat du des à cheval"	TokenNameStringLiteral	le la chien les aux chat du des à cheval
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
,	TokenNameCOMMA	
"chat"	TokenNameStringLiteral	chat
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some nouns and adjectives 	TokenNameCOMMENT_LINE	some nouns and adjectives 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"lances chismes habitable chiste éléments captifs"	TokenNameStringLiteral	lances chismes habitable chiste éléments captifs
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"lanc"	TokenNameStringLiteral	lanc
,	TokenNameCOMMA	
"chism"	TokenNameStringLiteral	chism
,	TokenNameCOMMA	
"habitabl"	TokenNameStringLiteral	habitabl
,	TokenNameCOMMA	
"chist"	TokenNameStringLiteral	chist
,	TokenNameCOMMA	
"element"	TokenNameStringLiteral	element
,	TokenNameCOMMA	
"captif"	TokenNameStringLiteral	captif
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some verbs 	TokenNameCOMMENT_LINE	some verbs 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"finissions souffrirent rugissante"	TokenNameStringLiteral	finissions souffrirent rugissante
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"finision"	TokenNameStringLiteral	finision
,	TokenNameCOMMA	
"soufrirent"	TokenNameStringLiteral	soufrirent
,	TokenNameCOMMA	
"rugisant"	TokenNameStringLiteral	rugisant
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some everything else 	TokenNameCOMMENT_LINE	some everything else 
// aujourd'hui stays one term which is OK 	TokenNameCOMMENT_LINE	aujourd'hui stays one term which is OK 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"C3PO aujourd'hui oeuf ïâöûàä anticonstitutionnellement Java++ "	TokenNameStringLiteral	C3PO aujourd'hui oeuf ïâöûàä anticonstitutionnellement Java++ 
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"c3po"	TokenNameStringLiteral	c3po
,	TokenNameCOMMA	
"aujourd'hui"	TokenNameStringLiteral	aujourd'hui
,	TokenNameCOMMA	
"oeuf"	TokenNameStringLiteral	oeuf
,	TokenNameCOMMA	
"ïaöuaä"	TokenNameStringLiteral	ïaöuaä
,	TokenNameCOMMA	
"anticonstitutionel"	TokenNameStringLiteral	anticonstitutionel
,	TokenNameCOMMA	
"java"	TokenNameStringLiteral	java
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some more everything else 	TokenNameCOMMENT_LINE	some more everything else 
// here 1940-1945 stays as one term, 1940:1945 not ? 	TokenNameCOMMENT_LINE	here 1940-1945 stays as one term, 1940:1945 not ? 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"33Bis 1940-1945 1940:1945 (---i+++)*"	TokenNameStringLiteral	33Bis 1940-1945 1940:1945 (---i+++)*
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"33bi"	TokenNameStringLiteral	33bi
,	TokenNameCOMMA	
"1940"	TokenNameStringLiteral	1940
,	TokenNameCOMMA	
"1945"	TokenNameStringLiteral	1945
,	TokenNameCOMMA	
"1940"	TokenNameStringLiteral	1940
,	TokenNameCOMMA	
"1945"	TokenNameStringLiteral	1945
,	TokenNameCOMMA	
"i"	TokenNameStringLiteral	i
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated remove this test for Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this test for Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testAnalyzer30	TokenNameIdentifier	 test Analyzer30
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
fa	TokenNameIdentifier	 fa
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"chien chat cheval"	TokenNameStringLiteral	chien chat cheval
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
,	TokenNameCOMMA	
"chat"	TokenNameStringLiteral	chat
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"chien CHAT CHEVAL"	TokenNameStringLiteral	chien CHAT CHEVAL
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
,	TokenNameCOMMA	
"chat"	TokenNameStringLiteral	chat
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
" chien ,? + = - CHAT /: > CHEVAL"	TokenNameStringLiteral	 chien ,? + = - CHAT /: > CHEVAL
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
,	TokenNameCOMMA	
"chat"	TokenNameStringLiteral	chat
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"chien++"	TokenNameStringLiteral	chien++
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"mot "entreguillemet""	TokenNameStringLiteral	mot "entreguillemet"
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mot"	TokenNameStringLiteral	mot
,	TokenNameCOMMA	
"entreguillemet"	TokenNameStringLiteral	entreguillemet
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// let's do some french specific tests now 	TokenNameCOMMENT_LINE	let's do some french specific tests now 
/* 1. couldn't resist I would expect this to stay one term as in French the minus sign is often used for composing words */	TokenNameCOMMENT_BLOCK	 1. couldn't resist I would expect this to stay one term as in French the minus sign is often used for composing words 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"Jean-François"	TokenNameStringLiteral	Jean-François
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jean"	TokenNameStringLiteral	jean
,	TokenNameCOMMA	
"françois"	TokenNameStringLiteral	françois
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2. stopwords 	TokenNameCOMMENT_LINE	2. stopwords 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"le la chien les aux chat du des à cheval"	TokenNameStringLiteral	le la chien les aux chat du des à cheval
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
,	TokenNameCOMMA	
"chat"	TokenNameStringLiteral	chat
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some nouns and adjectives 	TokenNameCOMMENT_LINE	some nouns and adjectives 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"lances chismes habitable chiste éléments captifs"	TokenNameStringLiteral	lances chismes habitable chiste éléments captifs
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"lanc"	TokenNameStringLiteral	lanc
,	TokenNameCOMMA	
"chism"	TokenNameStringLiteral	chism
,	TokenNameCOMMA	
"habit"	TokenNameStringLiteral	habit
,	TokenNameCOMMA	
"chist"	TokenNameStringLiteral	chist
,	TokenNameCOMMA	
"élément"	TokenNameStringLiteral	élément
,	TokenNameCOMMA	
"captif"	TokenNameStringLiteral	captif
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some verbs 	TokenNameCOMMENT_LINE	some verbs 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"finissions souffrirent rugissante"	TokenNameStringLiteral	finissions souffrirent rugissante
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"fin"	TokenNameStringLiteral	fin
,	TokenNameCOMMA	
"souffr"	TokenNameStringLiteral	souffr
,	TokenNameCOMMA	
"rug"	TokenNameStringLiteral	rug
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some everything else 	TokenNameCOMMENT_LINE	some everything else 
// aujourd'hui stays one term which is OK 	TokenNameCOMMENT_LINE	aujourd'hui stays one term which is OK 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"C3PO aujourd'hui oeuf ïâöûàä anticonstitutionnellement Java++ "	TokenNameStringLiteral	C3PO aujourd'hui oeuf ïâöûàä anticonstitutionnellement Java++ 
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"c3po"	TokenNameStringLiteral	c3po
,	TokenNameCOMMA	
"aujourd'hui"	TokenNameStringLiteral	aujourd'hui
,	TokenNameCOMMA	
"oeuf"	TokenNameStringLiteral	oeuf
,	TokenNameCOMMA	
"ïâöûàä"	TokenNameStringLiteral	ïâöûàä
,	TokenNameCOMMA	
"anticonstitutionnel"	TokenNameStringLiteral	anticonstitutionnel
,	TokenNameCOMMA	
"jav"	TokenNameStringLiteral	jav
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some more everything else 	TokenNameCOMMENT_LINE	some more everything else 
// here 1940-1945 stays as one term, 1940:1945 not ? 	TokenNameCOMMENT_LINE	here 1940-1945 stays as one term, 1940:1945 not ? 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"33Bis 1940-1945 1940:1945 (---i+++)*"	TokenNameStringLiteral	33Bis 1940-1945 1940:1945 (---i+++)*
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"33bis"	TokenNameStringLiteral	33bis
,	TokenNameCOMMA	
"1940-1945"	TokenNameStringLiteral	1940-1945
,	TokenNameCOMMA	
"1940"	TokenNameStringLiteral	1940
,	TokenNameCOMMA	
"1945"	TokenNameStringLiteral	1945
,	TokenNameCOMMA	
"i"	TokenNameStringLiteral	i
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
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
fa	TokenNameIdentifier	 fa
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// stopwords 	TokenNameCOMMENT_LINE	stopwords 
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"le la chien les aux chat du des à cheval"	TokenNameStringLiteral	le la chien les aux chat du des à cheval
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"chien"	TokenNameStringLiteral	chien
,	TokenNameCOMMA	
"chat"	TokenNameStringLiteral	chat
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some nouns and adjectives 	TokenNameCOMMENT_LINE	some nouns and adjectives 
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"lances chismes habitable chiste éléments captifs"	TokenNameStringLiteral	lances chismes habitable chiste éléments captifs
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"lanc"	TokenNameStringLiteral	lanc
,	TokenNameCOMMA	
"chism"	TokenNameStringLiteral	chism
,	TokenNameCOMMA	
"habitabl"	TokenNameStringLiteral	habitabl
,	TokenNameCOMMA	
"chist"	TokenNameStringLiteral	chist
,	TokenNameCOMMA	
"element"	TokenNameStringLiteral	element
,	TokenNameCOMMA	
"captif"	TokenNameStringLiteral	captif
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Test that changes to the exclusion table are applied immediately * when using reusable token streams. */	TokenNameCOMMENT_BLOCK	 Test that changes to the exclusion table are applied immediately when using reusable token streams. 
public	TokenNamepublic	
void	TokenNamevoid	
testExclusionTableReuse	TokenNameIdentifier	 test Exclusion Table Reuse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
fa	TokenNameIdentifier	 fa
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"habitable"	TokenNameStringLiteral	habitable
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"habitabl"	TokenNameStringLiteral	habitabl
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fa	TokenNameIdentifier	 fa
.	TokenNameDOT	
setStemExclusionTable	TokenNameIdentifier	 set Stem Exclusion Table
(	TokenNameLPAREN	
"habitable"	TokenNameStringLiteral	habitable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"habitable"	TokenNameStringLiteral	habitable
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"habitable"	TokenNameStringLiteral	habitable
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExclusionTableViaCtor	TokenNameIdentifier	 test Exclusion Table Via Ctor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CharArraySet	TokenNameIdentifier	 Char Array Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"habitable"	TokenNameStringLiteral	habitable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
fa	TokenNameIdentifier	 fa
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"habitable chiste"	TokenNameStringLiteral	habitable chiste
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"habitable"	TokenNameStringLiteral	habitable
,	TokenNameCOMMA	
"chist"	TokenNameStringLiteral	chist
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fa	TokenNameIdentifier	 fa
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"habitable chiste"	TokenNameStringLiteral	habitable chiste
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"habitable"	TokenNameStringLiteral	habitable
,	TokenNameCOMMA	
"chist"	TokenNameStringLiteral	chist
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testElision	TokenNameIdentifier	 test Elision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
fa	TokenNameIdentifier	 fa
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
fa	TokenNameIdentifier	 fa
,	TokenNameCOMMA	
"voir l'embrouille"	TokenNameStringLiteral	voir l'embrouille
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"voir"	TokenNameStringLiteral	voir
,	TokenNameCOMMA	
"embrouil"	TokenNameStringLiteral	embrouil
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prior to 3.1, this analyzer had no lowercase filter. * stopwords were case sensitive. Preserve this for back compat. * @deprecated Remove this test in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Prior to 3.1, this analyzer had no lowercase filter. stopwords were case sensitive. Preserve this for back compat. @deprecated Remove this test in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testBuggyStopwordsCasing	TokenNameIdentifier	 test Buggy Stopwords Casing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"Votre"	TokenNameStringLiteral	Votre
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"votr"	TokenNameStringLiteral	votr
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that stopwords are not case sensitive */	TokenNameCOMMENT_JAVADOC	 Test that stopwords are not case sensitive 
public	TokenNamepublic	
void	TokenNamevoid	
testStopwordsCasing	TokenNameIdentifier	 test Stopwords Casing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"Votre"	TokenNameStringLiteral	Votre
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
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
/** test accent-insensitive */	TokenNameCOMMENT_JAVADOC	 test accent-insensitive 
public	TokenNamepublic	
void	TokenNamevoid	
testAccentInsensitive	TokenNameIdentifier	 test Accent Insensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
FrenchAnalyzer	TokenNameIdentifier	 French Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"sécuritaires"	TokenNameStringLiteral	sécuritaires
,	TokenNameCOMMA	
"securitair"	TokenNameStringLiteral	securitair
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"securitaires"	TokenNameStringLiteral	securitaires
,	TokenNameCOMMA	
"securitair"	TokenNameStringLiteral	securitair
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
