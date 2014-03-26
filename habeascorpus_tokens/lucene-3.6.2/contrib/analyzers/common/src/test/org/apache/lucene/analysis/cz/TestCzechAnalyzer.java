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
InputStream	TokenNameIdentifier	 Input Stream
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
/** * Test the CzechAnalyzer * * Before Lucene 3.1, CzechAnalyzer was a StandardAnalyzer with a custom * stopword list. As of 3.1 it also includes a stemmer. * */	TokenNameCOMMENT_JAVADOC	 Test the CzechAnalyzer * Before Lucene 3.1, CzechAnalyzer was a StandardAnalyzer with a custom stopword list. As of 3.1 it also includes a stemmer. 
public	TokenNamepublic	
class	TokenNameclass	
TestCzechAnalyzer	TokenNameIdentifier	 Test Czech Analyzer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
/** * @deprecated Remove this test when support for 3.0 indexes is no longer needed. */	TokenNameCOMMENT_JAVADOC	 @deprecated Remove this test when support for 3.0 indexes is no longer needed. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testStopWordLegacy	TokenNameIdentifier	 test Stop Word Legacy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"Pokud mluvime o volnem"	TokenNameStringLiteral	Pokud mluvime o volnem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mluvime"	TokenNameStringLiteral	mluvime
,	TokenNameCOMMA	
"volnem"	TokenNameStringLiteral	volnem
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStopWord	TokenNameIdentifier	 test Stop Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"Pokud mluvime o volnem"	TokenNameStringLiteral	Pokud mluvime o volnem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mluvim"	TokenNameStringLiteral	mluvim
,	TokenNameCOMMA	
"voln"	TokenNameStringLiteral	voln
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated Remove this test when support for 3.0 indexes is no longer needed. */	TokenNameCOMMENT_JAVADOC	 @deprecated Remove this test when support for 3.0 indexes is no longer needed. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testReusableTokenStreamLegacy	TokenNameIdentifier	 test Reusable Token Stream Legacy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"Pokud mluvime o volnem"	TokenNameStringLiteral	Pokud mluvime o volnem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mluvime"	TokenNameStringLiteral	mluvime
,	TokenNameCOMMA	
"volnem"	TokenNameStringLiteral	volnem
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"Česká Republika"	TokenNameStringLiteral	Česká Republika
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"česká"	TokenNameStringLiteral	česká
,	TokenNameCOMMA	
"republika"	TokenNameStringLiteral	republika
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
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"Pokud mluvime o volnem"	TokenNameStringLiteral	Pokud mluvime o volnem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mluvim"	TokenNameStringLiteral	mluvim
,	TokenNameCOMMA	
"voln"	TokenNameStringLiteral	voln
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"Česká Republika"	TokenNameStringLiteral	Česká Republika
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"česk"	TokenNameStringLiteral	česk
,	TokenNameCOMMA	
"republik"	TokenNameStringLiteral	republik
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An input stream that always throws IOException for testing. * @deprecated Remove this class when the loadStopWords method is removed. */	TokenNameCOMMENT_JAVADOC	 An input stream that always throws IOException for testing. @deprecated Remove this class when the loadStopWords method is removed. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
class	TokenNameclass	
UnreliableInputStream	TokenNameIdentifier	 Unreliable Input Stream
extends	TokenNameextends	
InputStream	TokenNameIdentifier	 Input Stream
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The loadStopWords method does not throw IOException on error, * instead previously it set the stoptable to null (versus empty) * this would cause a NPE when it is time to create the StopFilter. * @deprecated Remove this test when the loadStopWords method is removed. */	TokenNameCOMMENT_JAVADOC	 The loadStopWords method does not throw IOException on error, instead previously it set the stoptable to null (versus empty) this would cause a NPE when it is time to create the StopFilter. @deprecated Remove this test when the loadStopWords method is removed. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidStopWordFile	TokenNameIdentifier	 test Invalid Stop Word File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cz	TokenNameIdentifier	 cz
.	TokenNameDOT	
loadStopWords	TokenNameIdentifier	 load Stop Words
(	TokenNameLPAREN	
new	TokenNamenew	
UnreliableInputStream	TokenNameIdentifier	 Unreliable Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"Pokud mluvime o volnem"	TokenNameStringLiteral	Pokud mluvime o volnem
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"pokud"	TokenNameStringLiteral	pokud
,	TokenNameCOMMA	
"mluvime"	TokenNameStringLiteral	mluvime
,	TokenNameCOMMA	
"o"	TokenNameStringLiteral	o
,	TokenNameCOMMA	
"volnem"	TokenNameStringLiteral	volnem
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that changes to the stop table via loadStopWords are applied immediately * when using reusable token streams. * @deprecated Remove this test when the loadStopWords method is removed. */	TokenNameCOMMENT_JAVADOC	 Test that changes to the stop table via loadStopWords are applied immediately when using reusable token streams. @deprecated Remove this test when the loadStopWords method is removed. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testStopWordFileReuse	TokenNameIdentifier	 test Stop Word File Reuse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"Česká Republika"	TokenNameStringLiteral	Česká Republika
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"česká"	TokenNameStringLiteral	česká
,	TokenNameCOMMA	
"republika"	TokenNameStringLiteral	republika
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
stopwords	TokenNameIdentifier	 stopwords
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"customStopWordFile.txt"	TokenNameStringLiteral	customStopWordFile.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cz	TokenNameIdentifier	 cz
.	TokenNameDOT	
loadStopWords	TokenNameIdentifier	 load Stop Words
(	TokenNameLPAREN	
stopwords	TokenNameIdentifier	 stopwords
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"Česká Republika"	TokenNameStringLiteral	Česká Republika
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"česká"	TokenNameStringLiteral	česká
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithStemExclusionSet	TokenNameIdentifier	 test With Stem Exclusion Set
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
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
cz	TokenNameIdentifier	 cz
=	TokenNameEQUAL	
new	TokenNamenew	
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
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
cz	TokenNameIdentifier	 cz
,	TokenNameCOMMA	
"hole desek"	TokenNameStringLiteral	hole desek
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
CzechAnalyzer	TokenNameIdentifier	 Czech Analyzer
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
}	TokenNameRBRACE	
