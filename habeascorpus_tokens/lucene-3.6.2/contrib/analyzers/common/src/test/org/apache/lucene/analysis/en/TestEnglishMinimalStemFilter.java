package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
en	TokenNameIdentifier	 en
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
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
;	TokenNameSEMICOLON	
/** * Simple tests for {@link EnglishMinimalStemFilter} */	TokenNameCOMMENT_JAVADOC	 Simple tests for {@link EnglishMinimalStemFilter} 
public	TokenNamepublic	
class	TokenNameclass	
TestEnglishMinimalStemFilter	TokenNameIdentifier	 Test English Minimal Stem Filter
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
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
source	TokenNameIdentifier	 source
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
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
new	TokenNamenew	
EnglishMinimalStemFilter	TokenNameIdentifier	 English Minimal Stem Filter
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Test some examples from various papers about this technique */	TokenNameCOMMENT_JAVADOC	 Test some examples from various papers about this technique 
public	TokenNamepublic	
void	TokenNamevoid	
testExamples	TokenNameIdentifier	 test Examples
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"queries"	TokenNameStringLiteral	queries
,	TokenNameCOMMA	
"query"	TokenNameStringLiteral	query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"phrases"	TokenNameStringLiteral	phrases
,	TokenNameCOMMA	
"phrase"	TokenNameStringLiteral	phrase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"corpus"	TokenNameStringLiteral	corpus
,	TokenNameCOMMA	
"corpus"	TokenNameStringLiteral	corpus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"stress"	TokenNameStringLiteral	stress
,	TokenNameCOMMA	
"stress"	TokenNameStringLiteral	stress
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"kings"	TokenNameStringLiteral	kings
,	TokenNameCOMMA	
"king"	TokenNameStringLiteral	king
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"panels"	TokenNameStringLiteral	panels
,	TokenNameCOMMA	
"panel"	TokenNameStringLiteral	panel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"aerodynamics"	TokenNameStringLiteral	aerodynamics
,	TokenNameCOMMA	
"aerodynamic"	TokenNameStringLiteral	aerodynamic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"congress"	TokenNameStringLiteral	congress
,	TokenNameCOMMA	
"congress"	TokenNameStringLiteral	congress
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"serious"	TokenNameStringLiteral	serious
,	TokenNameCOMMA	
"serious"	TokenNameStringLiteral	serious
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
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
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
EnglishMinimalStemFilter	TokenNameIdentifier	 English Minimal Stem Filter
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
