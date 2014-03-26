package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cz	TokenNameIdentifier	 cz
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
CharArraySet	TokenNameIdentifier	 Char Array Set
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
KeywordMarkerFilter	TokenNameIdentifier	 Keyword Marker Filter
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
/** * Test the Czech Stemmer. * * Note: its algorithmic, so some stems are nonsense * */	TokenNameCOMMENT_JAVADOC	 Test the Czech Stemmer. * Note: its algorithmic, so some stems are nonsense 
public	TokenNamepublic	
class	TokenNameclass	
TestCzechStemmer	TokenNameIdentifier	 Test Czech Stemmer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
/** * Test showing how masculine noun forms conflate */	TokenNameCOMMENT_JAVADOC	 Test showing how masculine noun forms conflate 
public	TokenNamepublic	
void	TokenNamevoid	
testMasculineNouns	TokenNameIdentifier	 test Masculine Nouns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* animate ending with a hard consonant */	TokenNameCOMMENT_BLOCK	 animate ending with a hard consonant 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"pán"	TokenNameStringLiteral	pán
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"páni"	TokenNameStringLiteral	páni
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"pánové"	TokenNameStringLiteral	pánové
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"pána"	TokenNameStringLiteral	pána
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"pánů"	TokenNameStringLiteral	pánů
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"pánovi"	TokenNameStringLiteral	pánovi
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"pánům"	TokenNameStringLiteral	pánům
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"pány"	TokenNameStringLiteral	pány
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"páne"	TokenNameStringLiteral	páne
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"pánech"	TokenNameStringLiteral	pánech
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"pánem"	TokenNameStringLiteral	pánem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pán"	TokenNameStringLiteral	pán
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* inanimate ending with hard consonant */	TokenNameCOMMENT_BLOCK	 inanimate ending with hard consonant 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hrad"	TokenNameStringLiteral	hrad
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hrad"	TokenNameStringLiteral	hrad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hradu"	TokenNameStringLiteral	hradu
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hrad"	TokenNameStringLiteral	hrad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hrade"	TokenNameStringLiteral	hrade
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hrad"	TokenNameStringLiteral	hrad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hradem"	TokenNameStringLiteral	hradem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hrad"	TokenNameStringLiteral	hrad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hrady"	TokenNameStringLiteral	hrady
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hrad"	TokenNameStringLiteral	hrad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hradech"	TokenNameStringLiteral	hradech
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hrad"	TokenNameStringLiteral	hrad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hradům"	TokenNameStringLiteral	hradům
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hrad"	TokenNameStringLiteral	hrad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hradů"	TokenNameStringLiteral	hradů
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hrad"	TokenNameStringLiteral	hrad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* animate ending with a soft consonant */	TokenNameCOMMENT_BLOCK	 animate ending with a soft consonant 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"muž"	TokenNameStringLiteral	muž
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"muh"	TokenNameStringLiteral	muh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"muži"	TokenNameStringLiteral	muži
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"muh"	TokenNameStringLiteral	muh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"muže"	TokenNameStringLiteral	muže
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"muh"	TokenNameStringLiteral	muh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mužů"	TokenNameStringLiteral	mužů
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"muh"	TokenNameStringLiteral	muh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mužům"	TokenNameStringLiteral	mužům
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"muh"	TokenNameStringLiteral	muh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mužích"	TokenNameStringLiteral	mužích
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"muh"	TokenNameStringLiteral	muh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mužem"	TokenNameStringLiteral	mužem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"muh"	TokenNameStringLiteral	muh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* inanimate ending with a soft consonant */	TokenNameCOMMENT_BLOCK	 inanimate ending with a soft consonant 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"stroj"	TokenNameStringLiteral	stroj
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stroj"	TokenNameStringLiteral	stroj
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"stroje"	TokenNameStringLiteral	stroje
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stroj"	TokenNameStringLiteral	stroj
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"strojů"	TokenNameStringLiteral	strojů
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stroj"	TokenNameStringLiteral	stroj
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"stroji"	TokenNameStringLiteral	stroji
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stroj"	TokenNameStringLiteral	stroj
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"strojům"	TokenNameStringLiteral	strojům
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stroj"	TokenNameStringLiteral	stroj
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"strojích"	TokenNameStringLiteral	strojích
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stroj"	TokenNameStringLiteral	stroj
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"strojem"	TokenNameStringLiteral	strojem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stroj"	TokenNameStringLiteral	stroj
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with a */	TokenNameCOMMENT_BLOCK	 ending with a 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předseda"	TokenNameStringLiteral	předseda
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předsedové"	TokenNameStringLiteral	předsedové
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předsedy"	TokenNameStringLiteral	předsedy
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předsedů"	TokenNameStringLiteral	předsedů
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předsedovi"	TokenNameStringLiteral	předsedovi
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předsedům"	TokenNameStringLiteral	předsedům
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předsedu"	TokenNameStringLiteral	předsedu
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předsedo"	TokenNameStringLiteral	předsedo
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předsedech"	TokenNameStringLiteral	předsedech
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"předsedou"	TokenNameStringLiteral	předsedou
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"předsd"	TokenNameStringLiteral	předsd
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with e */	TokenNameCOMMENT_BLOCK	 ending with e 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"soudce"	TokenNameStringLiteral	soudce
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"soudk"	TokenNameStringLiteral	soudk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"soudci"	TokenNameStringLiteral	soudci
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"soudk"	TokenNameStringLiteral	soudk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"soudců"	TokenNameStringLiteral	soudců
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"soudk"	TokenNameStringLiteral	soudk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"soudcům"	TokenNameStringLiteral	soudcům
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"soudk"	TokenNameStringLiteral	soudk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"soudcích"	TokenNameStringLiteral	soudcích
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"soudk"	TokenNameStringLiteral	soudk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"soudcem"	TokenNameStringLiteral	soudcem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"soudk"	TokenNameStringLiteral	soudk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test showing how feminine noun forms conflate */	TokenNameCOMMENT_JAVADOC	 Test showing how feminine noun forms conflate 
public	TokenNamepublic	
void	TokenNamevoid	
testFeminineNouns	TokenNameIdentifier	 test Feminine Nouns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with hard consonant */	TokenNameCOMMENT_BLOCK	 ending with hard consonant 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kost"	TokenNameStringLiteral	kost
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kost"	TokenNameStringLiteral	kost
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kosti"	TokenNameStringLiteral	kosti
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kost"	TokenNameStringLiteral	kost
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kostí"	TokenNameStringLiteral	kostí
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kost"	TokenNameStringLiteral	kost
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kostem"	TokenNameStringLiteral	kostem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kost"	TokenNameStringLiteral	kost
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kostech"	TokenNameStringLiteral	kostech
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kost"	TokenNameStringLiteral	kost
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kostmi"	TokenNameStringLiteral	kostmi
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kost"	TokenNameStringLiteral	kost
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with a soft consonant */	TokenNameCOMMENT_BLOCK	 ending with a soft consonant 
// note: in this example sing nom. and sing acc. don't conflate w/ the rest 	TokenNameCOMMENT_LINE	note: in this example sing nom. and sing acc. don't conflate w/ the rest 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"píseň"	TokenNameStringLiteral	píseň
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"písň"	TokenNameStringLiteral	písň
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"písně"	TokenNameStringLiteral	písně
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"písn"	TokenNameStringLiteral	písn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"písni"	TokenNameStringLiteral	písni
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"písn"	TokenNameStringLiteral	písn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"písněmi"	TokenNameStringLiteral	písněmi
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"písn"	TokenNameStringLiteral	písn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"písních"	TokenNameStringLiteral	písních
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"písn"	TokenNameStringLiteral	písn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"písním"	TokenNameStringLiteral	písním
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"písn"	TokenNameStringLiteral	písn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with e */	TokenNameCOMMENT_BLOCK	 ending with e 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"růže"	TokenNameStringLiteral	růže
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"růh"	TokenNameStringLiteral	růh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"růží"	TokenNameStringLiteral	růží
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"růh"	TokenNameStringLiteral	růh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"růžím"	TokenNameStringLiteral	růžím
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"růh"	TokenNameStringLiteral	růh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"růžích"	TokenNameStringLiteral	růžích
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"růh"	TokenNameStringLiteral	růh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"růžemi"	TokenNameStringLiteral	růžemi
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"růh"	TokenNameStringLiteral	růh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"růži"	TokenNameStringLiteral	růži
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"růh"	TokenNameStringLiteral	růh
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with a */	TokenNameCOMMENT_BLOCK	 ending with a 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"žena"	TokenNameStringLiteral	žena
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"ženy"	TokenNameStringLiteral	ženy
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"žen"	TokenNameStringLiteral	žen
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"ženě"	TokenNameStringLiteral	ženě
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"ženám"	TokenNameStringLiteral	ženám
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"ženu"	TokenNameStringLiteral	ženu
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"ženo"	TokenNameStringLiteral	ženo
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"ženách"	TokenNameStringLiteral	ženách
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"ženou"	TokenNameStringLiteral	ženou
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"ženami"	TokenNameStringLiteral	ženami
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"žn"	TokenNameStringLiteral	žn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test showing how neuter noun forms conflate */	TokenNameCOMMENT_JAVADOC	 Test showing how neuter noun forms conflate 
public	TokenNamepublic	
void	TokenNamevoid	
testNeuterNouns	TokenNameIdentifier	 test Neuter Nouns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with o */	TokenNameCOMMENT_BLOCK	 ending with o 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"město"	TokenNameStringLiteral	město
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"měst"	TokenNameStringLiteral	měst
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"města"	TokenNameStringLiteral	města
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"měst"	TokenNameStringLiteral	měst
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"měst"	TokenNameStringLiteral	měst
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"měst"	TokenNameStringLiteral	měst
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"městu"	TokenNameStringLiteral	městu
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"měst"	TokenNameStringLiteral	měst
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"městům"	TokenNameStringLiteral	městům
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"měst"	TokenNameStringLiteral	měst
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"městě"	TokenNameStringLiteral	městě
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"měst"	TokenNameStringLiteral	měst
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"městech"	TokenNameStringLiteral	městech
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"měst"	TokenNameStringLiteral	měst
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"městem"	TokenNameStringLiteral	městem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"měst"	TokenNameStringLiteral	měst
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"městy"	TokenNameStringLiteral	městy
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"měst"	TokenNameStringLiteral	měst
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with e */	TokenNameCOMMENT_BLOCK	 ending with e 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"moře"	TokenNameStringLiteral	moře
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"moř"	TokenNameStringLiteral	moř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"moří"	TokenNameStringLiteral	moří
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"moř"	TokenNameStringLiteral	moř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mořím"	TokenNameStringLiteral	mořím
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"moř"	TokenNameStringLiteral	moř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"moři"	TokenNameStringLiteral	moři
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"moř"	TokenNameStringLiteral	moř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mořích"	TokenNameStringLiteral	mořích
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"moř"	TokenNameStringLiteral	moř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mořem"	TokenNameStringLiteral	mořem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"moř"	TokenNameStringLiteral	moř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with ě */	TokenNameCOMMENT_BLOCK	 ending with ě 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kuře"	TokenNameStringLiteral	kuře
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kuř"	TokenNameStringLiteral	kuř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kuřata"	TokenNameStringLiteral	kuřata
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kuř"	TokenNameStringLiteral	kuř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kuřete"	TokenNameStringLiteral	kuřete
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kuř"	TokenNameStringLiteral	kuř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kuřat"	TokenNameStringLiteral	kuřat
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kuř"	TokenNameStringLiteral	kuř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kuřeti"	TokenNameStringLiteral	kuřeti
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kuř"	TokenNameStringLiteral	kuř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kuřatům"	TokenNameStringLiteral	kuřatům
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kuř"	TokenNameStringLiteral	kuř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kuřatech"	TokenNameStringLiteral	kuřatech
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kuř"	TokenNameStringLiteral	kuř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kuřetem"	TokenNameStringLiteral	kuřetem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kuř"	TokenNameStringLiteral	kuř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kuřaty"	TokenNameStringLiteral	kuřaty
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kuř"	TokenNameStringLiteral	kuř
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with í */	TokenNameCOMMENT_BLOCK	 ending with í 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"stavení"	TokenNameStringLiteral	stavení
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stavn"	TokenNameStringLiteral	stavn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"stavením"	TokenNameStringLiteral	stavením
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stavn"	TokenNameStringLiteral	stavn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"staveních"	TokenNameStringLiteral	staveních
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stavn"	TokenNameStringLiteral	stavn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"staveními"	TokenNameStringLiteral	staveními
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"stavn"	TokenNameStringLiteral	stavn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test showing how adjectival forms conflate */	TokenNameCOMMENT_JAVADOC	 Test showing how adjectival forms conflate 
public	TokenNamepublic	
void	TokenNamevoid	
testAdjectives	TokenNameIdentifier	 test Adjectives
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with ý/á/é */	TokenNameCOMMENT_BLOCK	 ending with ý/á/é 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladý"	TokenNameStringLiteral	mladý
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladí"	TokenNameStringLiteral	mladí
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladého"	TokenNameStringLiteral	mladého
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladých"	TokenNameStringLiteral	mladých
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladému"	TokenNameStringLiteral	mladému
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladým"	TokenNameStringLiteral	mladým
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladé"	TokenNameStringLiteral	mladé
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladém"	TokenNameStringLiteral	mladém
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladými"	TokenNameStringLiteral	mladými
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladá"	TokenNameStringLiteral	mladá
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mladou"	TokenNameStringLiteral	mladou
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mlad"	TokenNameStringLiteral	mlad
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* ending with í */	TokenNameCOMMENT_BLOCK	 ending with í 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"jarní"	TokenNameStringLiteral	jarní
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jarn"	TokenNameStringLiteral	jarn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"jarního"	TokenNameStringLiteral	jarního
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jarn"	TokenNameStringLiteral	jarn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"jarních"	TokenNameStringLiteral	jarních
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jarn"	TokenNameStringLiteral	jarn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"jarnímu"	TokenNameStringLiteral	jarnímu
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jarn"	TokenNameStringLiteral	jarn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"jarním"	TokenNameStringLiteral	jarním
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jarn"	TokenNameStringLiteral	jarn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"jarními"	TokenNameStringLiteral	jarními
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jarn"	TokenNameStringLiteral	jarn
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test some possessive suffixes */	TokenNameCOMMENT_JAVADOC	 Test some possessive suffixes 
public	TokenNamepublic	
void	TokenNamevoid	
testPossessive	TokenNameIdentifier	 test Possessive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"Karlův"	TokenNameStringLiteral	Karlův
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"karl"	TokenNameStringLiteral	karl
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"jazykový"	TokenNameStringLiteral	jazykový
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"jazyk"	TokenNameStringLiteral	jazyk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test some exceptional rules, implemented as rewrites. */	TokenNameCOMMENT_JAVADOC	 Test some exceptional rules, implemented as rewrites. 
public	TokenNamepublic	
void	TokenNamevoid	
testExceptions	TokenNameIdentifier	 test Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* rewrite of št -> sk */	TokenNameCOMMENT_BLOCK	 rewrite of št -> sk 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"český"	TokenNameStringLiteral	český
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"česk"	TokenNameStringLiteral	česk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"čeští"	TokenNameStringLiteral	čeští
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"česk"	TokenNameStringLiteral	česk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* rewrite of čt -> ck */	TokenNameCOMMENT_BLOCK	 rewrite of čt -> ck 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"anglický"	TokenNameStringLiteral	anglický
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"anglick"	TokenNameStringLiteral	anglick
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"angličtí"	TokenNameStringLiteral	angličtí
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"anglick"	TokenNameStringLiteral	anglick
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* rewrite of z -> h */	TokenNameCOMMENT_BLOCK	 rewrite of z -> h 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kniha"	TokenNameStringLiteral	kniha
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"knih"	TokenNameStringLiteral	knih
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"knize"	TokenNameStringLiteral	knize
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"knih"	TokenNameStringLiteral	knih
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* rewrite of ž -> h */	TokenNameCOMMENT_BLOCK	 rewrite of ž -> h 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mazat"	TokenNameStringLiteral	mazat
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mah"	TokenNameStringLiteral	mah
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"mažu"	TokenNameStringLiteral	mažu
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mah"	TokenNameStringLiteral	mah
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* rewrite of c -> k */	TokenNameCOMMENT_BLOCK	 rewrite of c -> k 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kluk"	TokenNameStringLiteral	kluk
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kluk"	TokenNameStringLiteral	kluk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"kluci"	TokenNameStringLiteral	kluci
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kluk"	TokenNameStringLiteral	kluk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"klucích"	TokenNameStringLiteral	klucích
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"kluk"	TokenNameStringLiteral	kluk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* rewrite of č -> k */	TokenNameCOMMENT_BLOCK	 rewrite of č -> k 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hezký"	TokenNameStringLiteral	hezký
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hezk"	TokenNameStringLiteral	hezk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hezčí"	TokenNameStringLiteral	hezčí
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hezk"	TokenNameStringLiteral	hezk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* rewrite of *ů* -> *o* */	TokenNameCOMMENT_BLOCK	 rewrite of *ů* -> *o* 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hůl"	TokenNameStringLiteral	hůl
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hol"	TokenNameStringLiteral	hol
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hole"	TokenNameStringLiteral	hole
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hol"	TokenNameStringLiteral	hol
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* rewrite of e* -> * */	TokenNameCOMMENT_BLOCK	 rewrite of e* -> 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"deska"	TokenNameStringLiteral	deska
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"desk"	TokenNameStringLiteral	desk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"desek"	TokenNameStringLiteral	desek
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"desk"	TokenNameStringLiteral	desk
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that very short words are not stemmed. */	TokenNameCOMMENT_JAVADOC	 Test that very short words are not stemmed. 
public	TokenNamepublic	
void	TokenNamevoid	
testDontStem	TokenNameIdentifier	 test Dont Stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"e"	TokenNameStringLiteral	e
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"e"	TokenNameStringLiteral	e
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"zi"	TokenNameStringLiteral	zi
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"zi"	TokenNameStringLiteral	zi
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithKeywordAttribute	TokenNameIdentifier	 test With Keyword Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
"hole"	TokenNameStringLiteral	hole
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CzechStemFilter	TokenNameIdentifier	 Czech Stem Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
CzechStemFilter	TokenNameIdentifier	 Czech Stem Filter
(	TokenNameLPAREN	
new	TokenNamenew	
KeywordMarkerFilter	TokenNameIdentifier	 Keyword Marker Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"hole desek"	TokenNameStringLiteral	hole desek
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
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
"hole"	TokenNameStringLiteral	hole
,	TokenNameCOMMA	
"desk"	TokenNameStringLiteral	desk
}	TokenNameRBRACE	
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
CzechStemFilter	TokenNameIdentifier	 Czech Stem Filter
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
