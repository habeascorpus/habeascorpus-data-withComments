package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
lv	TokenNameIdentifier	 lv
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
/** * Basic tests for {@link LatvianStemmer} */	TokenNameCOMMENT_JAVADOC	 Basic tests for {@link LatvianStemmer} 
public	TokenNamepublic	
class	TokenNameclass	
TestLatvianStemmer	TokenNameIdentifier	 Test Latvian Stemmer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
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
LatvianStemFilter	TokenNameIdentifier	 Latvian Stem Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testNouns1	TokenNameIdentifier	 test Nouns1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// decl. I 	TokenNameCOMMENT_LINE	decl. I 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvs"	TokenNameStringLiteral	tēvs
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvi"	TokenNameStringLiteral	tēvi
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. pl. 	TokenNameCOMMENT_LINE	nom. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēva"	TokenNameStringLiteral	tēva
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. sing. 	TokenNameCOMMENT_LINE	gen. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvu"	TokenNameStringLiteral	tēvu
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvam"	TokenNameStringLiteral	tēvam
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. sing. 	TokenNameCOMMENT_LINE	dat. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēviem"	TokenNameStringLiteral	tēviem
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. pl. 	TokenNameCOMMENT_LINE	dat. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvu"	TokenNameStringLiteral	tēvu
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. sing. 	TokenNameCOMMENT_LINE	acc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvus"	TokenNameStringLiteral	tēvus
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. pl. 	TokenNameCOMMENT_LINE	acc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvā"	TokenNameStringLiteral	tēvā
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. sing. 	TokenNameCOMMENT_LINE	loc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvos"	TokenNameStringLiteral	tēvos
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. pl. 	TokenNameCOMMENT_LINE	loc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvs"	TokenNameStringLiteral	tēvs
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. sing. 	TokenNameCOMMENT_LINE	voc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tēvi"	TokenNameStringLiteral	tēvi
,	TokenNameCOMMA	
"tēv"	TokenNameStringLiteral	tēv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. pl. 	TokenNameCOMMENT_LINE	voc. pl. 
}	TokenNameRBRACE	
/** * decl II nouns with (s,t) -> š and (d,z) -> ž * palatalization will generally conflate to two stems * due to the ambiguity (plural and singular). */	TokenNameCOMMENT_JAVADOC	 decl II nouns with (s,t) -> š and (d,z) -> ž palatalization will generally conflate to two stems due to the ambiguity (plural and singular). 
public	TokenNamepublic	
void	TokenNamevoid	
testNouns2	TokenNameIdentifier	 test Nouns2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// decl. II 	TokenNameCOMMENT_LINE	decl. II 
// c -> č palatalization 	TokenNameCOMMENT_LINE	c -> č palatalization 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lācis"	TokenNameStringLiteral	lācis
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lāči"	TokenNameStringLiteral	lāči
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. pl. 	TokenNameCOMMENT_LINE	nom. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lāča"	TokenNameStringLiteral	lāča
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. sing. 	TokenNameCOMMENT_LINE	gen. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lāču"	TokenNameStringLiteral	lāču
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lācim"	TokenNameStringLiteral	lācim
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. sing. 	TokenNameCOMMENT_LINE	dat. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lāčiem"	TokenNameStringLiteral	lāčiem
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. pl. 	TokenNameCOMMENT_LINE	dat. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lāci"	TokenNameStringLiteral	lāci
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. sing. 	TokenNameCOMMENT_LINE	acc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lāčus"	TokenNameStringLiteral	lāčus
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. pl. 	TokenNameCOMMENT_LINE	acc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lācī"	TokenNameStringLiteral	lācī
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. sing. 	TokenNameCOMMENT_LINE	loc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lāčos"	TokenNameStringLiteral	lāčos
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. pl. 	TokenNameCOMMENT_LINE	loc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lāci"	TokenNameStringLiteral	lāci
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. sing. 	TokenNameCOMMENT_LINE	voc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lāči"	TokenNameStringLiteral	lāči
,	TokenNameCOMMA	
"lāc"	TokenNameStringLiteral	lāc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. pl. 	TokenNameCOMMENT_LINE	voc. pl. 
// n -> ņ palatalization 	TokenNameCOMMENT_LINE	n -> ņ palatalization 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmens"	TokenNameStringLiteral	akmens
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmeņi"	TokenNameStringLiteral	akmeņi
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. pl. 	TokenNameCOMMENT_LINE	nom. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmens"	TokenNameStringLiteral	akmens
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. sing. 	TokenNameCOMMENT_LINE	gen. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmeņu"	TokenNameStringLiteral	akmeņu
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmenim"	TokenNameStringLiteral	akmenim
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. sing. 	TokenNameCOMMENT_LINE	dat. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmeņiem"	TokenNameStringLiteral	akmeņiem
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. pl. 	TokenNameCOMMENT_LINE	dat. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmeni"	TokenNameStringLiteral	akmeni
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. sing. 	TokenNameCOMMENT_LINE	acc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmeņus"	TokenNameStringLiteral	akmeņus
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. pl. 	TokenNameCOMMENT_LINE	acc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmenī"	TokenNameStringLiteral	akmenī
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. sing. 	TokenNameCOMMENT_LINE	loc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmeņos"	TokenNameStringLiteral	akmeņos
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. pl. 	TokenNameCOMMENT_LINE	loc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmens"	TokenNameStringLiteral	akmens
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. sing. 	TokenNameCOMMENT_LINE	voc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"akmeņi"	TokenNameStringLiteral	akmeņi
,	TokenNameCOMMA	
"akmen"	TokenNameStringLiteral	akmen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. pl. 	TokenNameCOMMENT_LINE	voc. pl. 
// no palatalization 	TokenNameCOMMENT_LINE	no palatalization 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmis"	TokenNameStringLiteral	kurmis
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmji"	TokenNameStringLiteral	kurmji
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. pl. 	TokenNameCOMMENT_LINE	nom. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmja"	TokenNameStringLiteral	kurmja
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. sing. 	TokenNameCOMMENT_LINE	gen. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmju"	TokenNameStringLiteral	kurmju
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmim"	TokenNameStringLiteral	kurmim
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. sing. 	TokenNameCOMMENT_LINE	dat. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmjiem"	TokenNameStringLiteral	kurmjiem
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. pl. 	TokenNameCOMMENT_LINE	dat. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmi"	TokenNameStringLiteral	kurmi
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. sing. 	TokenNameCOMMENT_LINE	acc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmjus"	TokenNameStringLiteral	kurmjus
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. pl. 	TokenNameCOMMENT_LINE	acc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmī"	TokenNameStringLiteral	kurmī
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. sing. 	TokenNameCOMMENT_LINE	loc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmjos"	TokenNameStringLiteral	kurmjos
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. pl. 	TokenNameCOMMENT_LINE	loc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmi"	TokenNameStringLiteral	kurmi
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. sing. 	TokenNameCOMMENT_LINE	voc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kurmji"	TokenNameStringLiteral	kurmji
,	TokenNameCOMMA	
"kurm"	TokenNameStringLiteral	kurm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. pl. 	TokenNameCOMMENT_LINE	voc. pl. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNouns3	TokenNameIdentifier	 test Nouns3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// decl III 	TokenNameCOMMENT_LINE	decl III 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietus"	TokenNameStringLiteral	lietus
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lieti"	TokenNameStringLiteral	lieti
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. pl. 	TokenNameCOMMENT_LINE	nom. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietus"	TokenNameStringLiteral	lietus
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. sing. 	TokenNameCOMMENT_LINE	gen. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietu"	TokenNameStringLiteral	lietu
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietum"	TokenNameStringLiteral	lietum
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. sing. 	TokenNameCOMMENT_LINE	dat. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietiem"	TokenNameStringLiteral	lietiem
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. pl. 	TokenNameCOMMENT_LINE	dat. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietu"	TokenNameStringLiteral	lietu
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. sing. 	TokenNameCOMMENT_LINE	acc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietus"	TokenNameStringLiteral	lietus
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. pl. 	TokenNameCOMMENT_LINE	acc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietū"	TokenNameStringLiteral	lietū
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. sing. 	TokenNameCOMMENT_LINE	loc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietos"	TokenNameStringLiteral	lietos
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. pl. 	TokenNameCOMMENT_LINE	loc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lietus"	TokenNameStringLiteral	lietus
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. sing. 	TokenNameCOMMENT_LINE	voc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lieti"	TokenNameStringLiteral	lieti
,	TokenNameCOMMA	
"liet"	TokenNameStringLiteral	liet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. pl. 	TokenNameCOMMENT_LINE	voc. pl. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNouns4	TokenNameIdentifier	 test Nouns4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// decl IV 	TokenNameCOMMENT_LINE	decl IV 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapa"	TokenNameStringLiteral	lapa
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapas"	TokenNameStringLiteral	lapas
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. pl. 	TokenNameCOMMENT_LINE	nom. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapas"	TokenNameStringLiteral	lapas
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. sing. 	TokenNameCOMMENT_LINE	gen. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapu"	TokenNameStringLiteral	lapu
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapai"	TokenNameStringLiteral	lapai
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. sing. 	TokenNameCOMMENT_LINE	dat. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapām"	TokenNameStringLiteral	lapām
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. pl. 	TokenNameCOMMENT_LINE	dat. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapu"	TokenNameStringLiteral	lapu
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. sing. 	TokenNameCOMMENT_LINE	acc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapas"	TokenNameStringLiteral	lapas
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. pl. 	TokenNameCOMMENT_LINE	acc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapā"	TokenNameStringLiteral	lapā
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. sing. 	TokenNameCOMMENT_LINE	loc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapās"	TokenNameStringLiteral	lapās
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. pl. 	TokenNameCOMMENT_LINE	loc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapa"	TokenNameStringLiteral	lapa
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. sing. 	TokenNameCOMMENT_LINE	voc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lapas"	TokenNameStringLiteral	lapas
,	TokenNameCOMMA	
"lap"	TokenNameStringLiteral	lap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. pl. 	TokenNameCOMMENT_LINE	voc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puika"	TokenNameStringLiteral	puika
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puikas"	TokenNameStringLiteral	puikas
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. pl. 	TokenNameCOMMENT_LINE	nom. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puikas"	TokenNameStringLiteral	puikas
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. sing. 	TokenNameCOMMENT_LINE	gen. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puiku"	TokenNameStringLiteral	puiku
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puikam"	TokenNameStringLiteral	puikam
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. sing. 	TokenNameCOMMENT_LINE	dat. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puikām"	TokenNameStringLiteral	puikām
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. pl. 	TokenNameCOMMENT_LINE	dat. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puiku"	TokenNameStringLiteral	puiku
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. sing. 	TokenNameCOMMENT_LINE	acc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puikas"	TokenNameStringLiteral	puikas
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. pl. 	TokenNameCOMMENT_LINE	acc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puikā"	TokenNameStringLiteral	puikā
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. sing. 	TokenNameCOMMENT_LINE	loc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puikās"	TokenNameStringLiteral	puikās
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. pl. 	TokenNameCOMMENT_LINE	loc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puika"	TokenNameStringLiteral	puika
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. sing. 	TokenNameCOMMENT_LINE	voc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"puikas"	TokenNameStringLiteral	puikas
,	TokenNameCOMMA	
"puik"	TokenNameStringLiteral	puik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. pl. 	TokenNameCOMMENT_LINE	voc. pl. 
}	TokenNameRBRACE	
/** * Genitive plural forms with (s,t) -> š and (d,z) -> ž * will not conflate due to ambiguity. */	TokenNameCOMMENT_JAVADOC	 Genitive plural forms with (s,t) -> š and (d,z) -> ž will not conflate due to ambiguity. 
public	TokenNamepublic	
void	TokenNamevoid	
testNouns5	TokenNameIdentifier	 test Nouns5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// decl V 	TokenNameCOMMENT_LINE	decl V 
// l -> ļ palatalization 	TokenNameCOMMENT_LINE	l -> ļ palatalization 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"egle"	TokenNameStringLiteral	egle
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"egles"	TokenNameStringLiteral	egles
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. pl. 	TokenNameCOMMENT_LINE	nom. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"egles"	TokenNameStringLiteral	egles
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. sing. 	TokenNameCOMMENT_LINE	gen. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"egļu"	TokenNameStringLiteral	egļu
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"eglei"	TokenNameStringLiteral	eglei
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. sing. 	TokenNameCOMMENT_LINE	dat. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"eglēm"	TokenNameStringLiteral	eglēm
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. pl. 	TokenNameCOMMENT_LINE	dat. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"egli"	TokenNameStringLiteral	egli
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. sing. 	TokenNameCOMMENT_LINE	acc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"egles"	TokenNameStringLiteral	egles
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. pl. 	TokenNameCOMMENT_LINE	acc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"eglē"	TokenNameStringLiteral	eglē
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. sing. 	TokenNameCOMMENT_LINE	loc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"eglēs"	TokenNameStringLiteral	eglēs
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. pl. 	TokenNameCOMMENT_LINE	loc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"egle"	TokenNameStringLiteral	egle
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. sing. 	TokenNameCOMMENT_LINE	voc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"egles"	TokenNameStringLiteral	egles
,	TokenNameCOMMA	
"egl"	TokenNameStringLiteral	egl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. pl. 	TokenNameCOMMENT_LINE	voc. pl. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNouns6	TokenNameIdentifier	 test Nouns6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// decl VI 	TokenNameCOMMENT_LINE	decl VI 
// no palatalization 	TokenNameCOMMENT_LINE	no palatalization 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govs"	TokenNameStringLiteral	govs
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govis"	TokenNameStringLiteral	govis
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. pl. 	TokenNameCOMMENT_LINE	nom. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govs"	TokenNameStringLiteral	govs
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. sing. 	TokenNameCOMMENT_LINE	gen. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govju"	TokenNameStringLiteral	govju
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govij"	TokenNameStringLiteral	govij
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. sing. 	TokenNameCOMMENT_LINE	dat. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govīm"	TokenNameStringLiteral	govīm
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dat. pl. 	TokenNameCOMMENT_LINE	dat. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govi "	TokenNameStringLiteral	govi 
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. sing. 	TokenNameCOMMENT_LINE	acc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govis"	TokenNameStringLiteral	govis
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acc. pl. 	TokenNameCOMMENT_LINE	acc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govi "	TokenNameStringLiteral	govi 
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// inst. sing. 	TokenNameCOMMENT_LINE	inst. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govīm"	TokenNameStringLiteral	govīm
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// inst. pl. 	TokenNameCOMMENT_LINE	inst. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govī"	TokenNameStringLiteral	govī
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. sing. 	TokenNameCOMMENT_LINE	loc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govīs"	TokenNameStringLiteral	govīs
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loc. pl. 	TokenNameCOMMENT_LINE	loc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govs"	TokenNameStringLiteral	govs
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. sing. 	TokenNameCOMMENT_LINE	voc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"govis"	TokenNameStringLiteral	govis
,	TokenNameCOMMA	
"gov"	TokenNameStringLiteral	gov
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. pl. 	TokenNameCOMMENT_LINE	voc. pl. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAdjectives	TokenNameIdentifier	 test Adjectives
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zils"	TokenNameStringLiteral	zils
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. nom. masc. sing. 	TokenNameCOMMENT_LINE	indef. nom. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilais"	TokenNameStringLiteral	zilais
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. nom. masc. sing. 	TokenNameCOMMENT_LINE	def. nom. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zili"	TokenNameStringLiteral	zili
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. nom. masc. pl. 	TokenNameCOMMENT_LINE	indef. nom. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilie"	TokenNameStringLiteral	zilie
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. nom. masc. pl. 	TokenNameCOMMENT_LINE	def. nom. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zila"	TokenNameStringLiteral	zila
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. nom. fem. sing. 	TokenNameCOMMENT_LINE	indef. nom. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilā"	TokenNameStringLiteral	zilā
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. nom. fem. sing. 	TokenNameCOMMENT_LINE	def. nom. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilas"	TokenNameStringLiteral	zilas
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. nom. fem. pl. 	TokenNameCOMMENT_LINE	indef. nom. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilās"	TokenNameStringLiteral	zilās
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. nom. fem. pl. 	TokenNameCOMMENT_LINE	def. nom. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zila"	TokenNameStringLiteral	zila
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. gen. masc. sing. 	TokenNameCOMMENT_LINE	indef. gen. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilā"	TokenNameStringLiteral	zilā
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. gen. masc. sing. 	TokenNameCOMMENT_LINE	def. gen. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilu"	TokenNameStringLiteral	zilu
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. gen. masc. pl. 	TokenNameCOMMENT_LINE	indef. gen. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilo"	TokenNameStringLiteral	zilo
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. gen. masc. pl. 	TokenNameCOMMENT_LINE	def. gen. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilas"	TokenNameStringLiteral	zilas
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. gen. fem. sing. 	TokenNameCOMMENT_LINE	indef. gen. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilās"	TokenNameStringLiteral	zilās
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. gen. fem. sing. 	TokenNameCOMMENT_LINE	def. gen. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilu"	TokenNameStringLiteral	zilu
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. gen. fem. pl. 	TokenNameCOMMENT_LINE	indef. gen. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilo"	TokenNameStringLiteral	zilo
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. gen. fem. pl. 	TokenNameCOMMENT_LINE	def. gen. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilam"	TokenNameStringLiteral	zilam
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. dat. masc. sing. 	TokenNameCOMMENT_LINE	indef. dat. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilajam"	TokenNameStringLiteral	zilajam
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. dat. masc. sing. 	TokenNameCOMMENT_LINE	def. dat. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ziliem"	TokenNameStringLiteral	ziliem
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. dat. masc. pl. 	TokenNameCOMMENT_LINE	indef. dat. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilajiem"	TokenNameStringLiteral	zilajiem
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. dat. masc. pl. 	TokenNameCOMMENT_LINE	def. dat. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilai"	TokenNameStringLiteral	zilai
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. dat. fem. sing. 	TokenNameCOMMENT_LINE	indef. dat. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilajai"	TokenNameStringLiteral	zilajai
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. dat. fem. sing. 	TokenNameCOMMENT_LINE	def. dat. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilām"	TokenNameStringLiteral	zilām
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. dat. fem. pl. 	TokenNameCOMMENT_LINE	indef. dat. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilajām"	TokenNameStringLiteral	zilajām
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. dat. fem. pl. 	TokenNameCOMMENT_LINE	def. dat. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilu"	TokenNameStringLiteral	zilu
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. acc. masc. sing. 	TokenNameCOMMENT_LINE	indef. acc. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilo"	TokenNameStringLiteral	zilo
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. acc. masc. sing. 	TokenNameCOMMENT_LINE	def. acc. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilus"	TokenNameStringLiteral	zilus
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. acc. masc. pl. 	TokenNameCOMMENT_LINE	indef. acc. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilos"	TokenNameStringLiteral	zilos
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. acc. masc. pl. 	TokenNameCOMMENT_LINE	def. acc. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilu"	TokenNameStringLiteral	zilu
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. acc. fem. sing. 	TokenNameCOMMENT_LINE	indef. acc. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilo"	TokenNameStringLiteral	zilo
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. acc. fem. sing. 	TokenNameCOMMENT_LINE	def. acc. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilās"	TokenNameStringLiteral	zilās
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. acc. fem. pl. 	TokenNameCOMMENT_LINE	indef. acc. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilās"	TokenNameStringLiteral	zilās
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. acc. fem. pl. 	TokenNameCOMMENT_LINE	def. acc. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilā"	TokenNameStringLiteral	zilā
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. loc. masc. sing. 	TokenNameCOMMENT_LINE	indef. loc. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilajā"	TokenNameStringLiteral	zilajā
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. loc. masc. sing. 	TokenNameCOMMENT_LINE	def. loc. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilos"	TokenNameStringLiteral	zilos
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. loc. masc. pl. 	TokenNameCOMMENT_LINE	indef. loc. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilajos"	TokenNameStringLiteral	zilajos
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. loc. masc. pl. 	TokenNameCOMMENT_LINE	def. loc. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilā"	TokenNameStringLiteral	zilā
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. loc. fem. sing. 	TokenNameCOMMENT_LINE	indef. loc. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilajā"	TokenNameStringLiteral	zilajā
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. loc. fem. sing. 	TokenNameCOMMENT_LINE	def. loc. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilās"	TokenNameStringLiteral	zilās
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indef. loc. fem. pl. 	TokenNameCOMMENT_LINE	indef. loc. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilajās"	TokenNameStringLiteral	zilajās
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// def. loc. fem. pl. 	TokenNameCOMMENT_LINE	def. loc. fem. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilais"	TokenNameStringLiteral	zilais
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. masc. sing. 	TokenNameCOMMENT_LINE	voc. masc. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilie"	TokenNameStringLiteral	zilie
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. masc. pl. 	TokenNameCOMMENT_LINE	voc. masc. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilā"	TokenNameStringLiteral	zilā
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. fem. sing. 	TokenNameCOMMENT_LINE	voc. fem. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zilās"	TokenNameStringLiteral	zilās
,	TokenNameCOMMA	
"zil"	TokenNameStringLiteral	zil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// voc. fem. pl. 	TokenNameCOMMENT_LINE	voc. fem. pl. 
}	TokenNameRBRACE	
/** * Note: we intentionally don't handle the ambiguous * (s,t) -> š and (d,z) -> ž */	TokenNameCOMMENT_JAVADOC	 Note: we intentionally don't handle the ambiguous (s,t) -> š and (d,z) -> ž 
public	TokenNamepublic	
void	TokenNamevoid	
testPalatalization	TokenNameIdentifier	 test Palatalization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"krāsns"	TokenNameStringLiteral	krāsns
,	TokenNameCOMMA	
"krāsn"	TokenNameStringLiteral	krāsn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"krāšņu"	TokenNameStringLiteral	krāšņu
,	TokenNameCOMMA	
"krāsn"	TokenNameStringLiteral	krāsn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zvaigzne"	TokenNameStringLiteral	zvaigzne
,	TokenNameCOMMA	
"zvaigzn"	TokenNameStringLiteral	zvaigzn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zvaigžņu"	TokenNameStringLiteral	zvaigžņu
,	TokenNameCOMMA	
"zvaigzn"	TokenNameStringLiteral	zvaigzn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kāpslis"	TokenNameStringLiteral	kāpslis
,	TokenNameCOMMA	
"kāpsl"	TokenNameStringLiteral	kāpsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kāpšļu"	TokenNameStringLiteral	kāpšļu
,	TokenNameCOMMA	
"kāpsl"	TokenNameStringLiteral	kāpsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zizlis"	TokenNameStringLiteral	zizlis
,	TokenNameCOMMA	
"zizl"	TokenNameStringLiteral	zizl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"zižļu"	TokenNameStringLiteral	zižļu
,	TokenNameCOMMA	
"zizl"	TokenNameStringLiteral	zizl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"vilnis"	TokenNameStringLiteral	vilnis
,	TokenNameCOMMA	
"viln"	TokenNameStringLiteral	viln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"viļņu"	TokenNameStringLiteral	viļņu
,	TokenNameCOMMA	
"viln"	TokenNameStringLiteral	viln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lelle"	TokenNameStringLiteral	lelle
,	TokenNameCOMMA	
"lell"	TokenNameStringLiteral	lell
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"leļļu"	TokenNameStringLiteral	leļļu
,	TokenNameCOMMA	
"lell"	TokenNameStringLiteral	lell
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"pinne"	TokenNameStringLiteral	pinne
,	TokenNameCOMMA	
"pinn"	TokenNameStringLiteral	pinn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"piņņu"	TokenNameStringLiteral	piņņu
,	TokenNameCOMMA	
"pinn"	TokenNameStringLiteral	pinn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"rīkste"	TokenNameStringLiteral	rīkste
,	TokenNameCOMMA	
"rīkst"	TokenNameStringLiteral	rīkst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nom. sing. 	TokenNameCOMMENT_LINE	nom. sing. 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"rīkšu"	TokenNameStringLiteral	rīkšu
,	TokenNameCOMMA	
"rīkst"	TokenNameStringLiteral	rīkst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gen. pl. 	TokenNameCOMMENT_LINE	gen. pl. 
}	TokenNameRBRACE	
/** * Test some length restrictions, we require a 3+ char stem, * with at least one vowel. */	TokenNameCOMMENT_JAVADOC	 Test some length restrictions, we require a 3+ char stem, with at least one vowel. 
public	TokenNamepublic	
void	TokenNamevoid	
testLength	TokenNameIdentifier	 test Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"usa"	TokenNameStringLiteral	usa
,	TokenNameCOMMA	
"usa"	TokenNameStringLiteral	usa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// length 	TokenNameCOMMENT_LINE	length 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"60ms"	TokenNameStringLiteral	60ms
,	TokenNameCOMMA	
"60ms"	TokenNameStringLiteral	60ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// vowel count 	TokenNameCOMMENT_LINE	vowel count 
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
LatvianStemFilter	TokenNameIdentifier	 Latvian Stem Filter
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
