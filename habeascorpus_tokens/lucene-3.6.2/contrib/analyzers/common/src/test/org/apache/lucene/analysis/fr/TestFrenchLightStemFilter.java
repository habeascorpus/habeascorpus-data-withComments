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
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
VocabularyAssert	TokenNameIdentifier	 Vocabulary Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Simple tests for {@link FrenchLightStemFilter} */	TokenNameCOMMENT_JAVADOC	 Simple tests for {@link FrenchLightStemFilter} 
public	TokenNamepublic	
class	TokenNameclass	
TestFrenchLightStemFilter	TokenNameIdentifier	 Test French Light Stem Filter
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
FrenchLightStemFilter	TokenNameIdentifier	 French Light Stem Filter
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Test some examples from the paper */	TokenNameCOMMENT_JAVADOC	 Test some examples from the paper 
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
"chevaux"	TokenNameStringLiteral	chevaux
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
,	TokenNameCOMMA	
"cheval"	TokenNameStringLiteral	cheval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"hiboux"	TokenNameStringLiteral	hiboux
,	TokenNameCOMMA	
"hibou"	TokenNameStringLiteral	hibou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"hibou"	TokenNameStringLiteral	hibou
,	TokenNameCOMMA	
"hibou"	TokenNameStringLiteral	hibou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"chantés"	TokenNameStringLiteral	chantés
,	TokenNameCOMMA	
"chant"	TokenNameStringLiteral	chant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"chanter"	TokenNameStringLiteral	chanter
,	TokenNameCOMMA	
"chant"	TokenNameStringLiteral	chant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"chante"	TokenNameStringLiteral	chante
,	TokenNameCOMMA	
"chant"	TokenNameStringLiteral	chant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"chant"	TokenNameStringLiteral	chant
,	TokenNameCOMMA	
"chant"	TokenNameStringLiteral	chant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"baronnes"	TokenNameStringLiteral	baronnes
,	TokenNameCOMMA	
"baron"	TokenNameStringLiteral	baron
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"barons"	TokenNameStringLiteral	barons
,	TokenNameCOMMA	
"baron"	TokenNameStringLiteral	baron
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"baron"	TokenNameStringLiteral	baron
,	TokenNameCOMMA	
"baron"	TokenNameStringLiteral	baron
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"peaux"	TokenNameStringLiteral	peaux
,	TokenNameCOMMA	
"peau"	TokenNameStringLiteral	peau
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"peau"	TokenNameStringLiteral	peau
,	TokenNameCOMMA	
"peau"	TokenNameStringLiteral	peau
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"anneaux"	TokenNameStringLiteral	anneaux
,	TokenNameCOMMA	
"aneau"	TokenNameStringLiteral	aneau
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"anneau"	TokenNameStringLiteral	anneau
,	TokenNameCOMMA	
"aneau"	TokenNameStringLiteral	aneau
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"neveux"	TokenNameStringLiteral	neveux
,	TokenNameCOMMA	
"neveu"	TokenNameStringLiteral	neveu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"neveu"	TokenNameStringLiteral	neveu
,	TokenNameCOMMA	
"neveu"	TokenNameStringLiteral	neveu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"affreux"	TokenNameStringLiteral	affreux
,	TokenNameCOMMA	
"afreu"	TokenNameStringLiteral	afreu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"affreuse"	TokenNameStringLiteral	affreuse
,	TokenNameCOMMA	
"afreu"	TokenNameStringLiteral	afreu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"investissement"	TokenNameStringLiteral	investissement
,	TokenNameCOMMA	
"investi"	TokenNameStringLiteral	investi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"investir"	TokenNameStringLiteral	investir
,	TokenNameCOMMA	
"investi"	TokenNameStringLiteral	investi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"assourdissant"	TokenNameStringLiteral	assourdissant
,	TokenNameCOMMA	
"asourdi"	TokenNameStringLiteral	asourdi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"assourdir"	TokenNameStringLiteral	assourdir
,	TokenNameCOMMA	
"asourdi"	TokenNameStringLiteral	asourdi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"pratiquement"	TokenNameStringLiteral	pratiquement
,	TokenNameCOMMA	
"pratiqu"	TokenNameStringLiteral	pratiqu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"pratique"	TokenNameStringLiteral	pratique
,	TokenNameCOMMA	
"pratiqu"	TokenNameStringLiteral	pratiqu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"administrativement"	TokenNameStringLiteral	administrativement
,	TokenNameCOMMA	
"administratif"	TokenNameStringLiteral	administratif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"administratif"	TokenNameStringLiteral	administratif
,	TokenNameCOMMA	
"administratif"	TokenNameStringLiteral	administratif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"justificatrice"	TokenNameStringLiteral	justificatrice
,	TokenNameCOMMA	
"justifi"	TokenNameStringLiteral	justifi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"justificateur"	TokenNameStringLiteral	justificateur
,	TokenNameCOMMA	
"justifi"	TokenNameStringLiteral	justifi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"justifier"	TokenNameStringLiteral	justifier
,	TokenNameCOMMA	
"justifi"	TokenNameStringLiteral	justifi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"educatrice"	TokenNameStringLiteral	educatrice
,	TokenNameCOMMA	
"eduqu"	TokenNameStringLiteral	eduqu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"eduquer"	TokenNameStringLiteral	eduquer
,	TokenNameCOMMA	
"eduqu"	TokenNameStringLiteral	eduqu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"communicateur"	TokenNameStringLiteral	communicateur
,	TokenNameCOMMA	
"comuniqu"	TokenNameStringLiteral	comuniqu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"communiquer"	TokenNameStringLiteral	communiquer
,	TokenNameCOMMA	
"comuniqu"	TokenNameStringLiteral	comuniqu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"accompagnatrice"	TokenNameStringLiteral	accompagnatrice
,	TokenNameCOMMA	
"acompagn"	TokenNameStringLiteral	acompagn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"accompagnateur"	TokenNameStringLiteral	accompagnateur
,	TokenNameCOMMA	
"acompagn"	TokenNameStringLiteral	acompagn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"administrateur"	TokenNameStringLiteral	administrateur
,	TokenNameCOMMA	
"administr"	TokenNameStringLiteral	administr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"administrer"	TokenNameStringLiteral	administrer
,	TokenNameCOMMA	
"administr"	TokenNameStringLiteral	administr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"productrice"	TokenNameStringLiteral	productrice
,	TokenNameCOMMA	
"product"	TokenNameStringLiteral	product
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"producteur"	TokenNameStringLiteral	producteur
,	TokenNameCOMMA	
"product"	TokenNameStringLiteral	product
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"acheteuse"	TokenNameStringLiteral	acheteuse
,	TokenNameCOMMA	
"achet"	TokenNameStringLiteral	achet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"acheteur"	TokenNameStringLiteral	acheteur
,	TokenNameCOMMA	
"achet"	TokenNameStringLiteral	achet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"planteur"	TokenNameStringLiteral	planteur
,	TokenNameCOMMA	
"plant"	TokenNameStringLiteral	plant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"plante"	TokenNameStringLiteral	plante
,	TokenNameCOMMA	
"plant"	TokenNameStringLiteral	plant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"poreuse"	TokenNameStringLiteral	poreuse
,	TokenNameCOMMA	
"poreu"	TokenNameStringLiteral	poreu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"poreux"	TokenNameStringLiteral	poreux
,	TokenNameCOMMA	
"poreu"	TokenNameStringLiteral	poreu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"plieuse"	TokenNameStringLiteral	plieuse
,	TokenNameCOMMA	
"plieu"	TokenNameStringLiteral	plieu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"bijoutière"	TokenNameStringLiteral	bijoutière
,	TokenNameCOMMA	
"bijouti"	TokenNameStringLiteral	bijouti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"bijoutier"	TokenNameStringLiteral	bijoutier
,	TokenNameCOMMA	
"bijouti"	TokenNameStringLiteral	bijouti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"caissière"	TokenNameStringLiteral	caissière
,	TokenNameCOMMA	
"caisi"	TokenNameStringLiteral	caisi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"caissier"	TokenNameStringLiteral	caissier
,	TokenNameCOMMA	
"caisi"	TokenNameStringLiteral	caisi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"abrasive"	TokenNameStringLiteral	abrasive
,	TokenNameCOMMA	
"abrasif"	TokenNameStringLiteral	abrasif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"abrasif"	TokenNameStringLiteral	abrasif
,	TokenNameCOMMA	
"abrasif"	TokenNameStringLiteral	abrasif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"folle"	TokenNameStringLiteral	folle
,	TokenNameCOMMA	
"fou"	TokenNameStringLiteral	fou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"fou"	TokenNameStringLiteral	fou
,	TokenNameCOMMA	
"fou"	TokenNameStringLiteral	fou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"personnelle"	TokenNameStringLiteral	personnelle
,	TokenNameCOMMA	
"person"	TokenNameStringLiteral	person
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"personne"	TokenNameStringLiteral	personne
,	TokenNameCOMMA	
"person"	TokenNameStringLiteral	person
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// algo bug: too short length 	TokenNameCOMMENT_LINE	algo bug: too short length 
//checkOneTerm(analyzer, "personnel", "person"); 	TokenNameCOMMENT_LINE	checkOneTerm(analyzer, "personnel", "person"); 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"complète"	TokenNameStringLiteral	complète
,	TokenNameCOMMA	
"complet"	TokenNameStringLiteral	complet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"complet"	TokenNameStringLiteral	complet
,	TokenNameCOMMA	
"complet"	TokenNameStringLiteral	complet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"aromatique"	TokenNameStringLiteral	aromatique
,	TokenNameCOMMA	
"aromat"	TokenNameStringLiteral	aromat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"faiblesse"	TokenNameStringLiteral	faiblesse
,	TokenNameCOMMA	
"faibl"	TokenNameStringLiteral	faibl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"faible"	TokenNameStringLiteral	faible
,	TokenNameCOMMA	
"faibl"	TokenNameStringLiteral	faibl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"patinage"	TokenNameStringLiteral	patinage
,	TokenNameCOMMA	
"patin"	TokenNameStringLiteral	patin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"patin"	TokenNameStringLiteral	patin
,	TokenNameCOMMA	
"patin"	TokenNameStringLiteral	patin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"sonorisation"	TokenNameStringLiteral	sonorisation
,	TokenNameCOMMA	
"sono"	TokenNameStringLiteral	sono
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"ritualisation"	TokenNameStringLiteral	ritualisation
,	TokenNameCOMMA	
"rituel"	TokenNameStringLiteral	rituel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"rituel"	TokenNameStringLiteral	rituel
,	TokenNameCOMMA	
"rituel"	TokenNameStringLiteral	rituel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// algo bug: masked by rules above 	TokenNameCOMMENT_LINE	algo bug: masked by rules above 
//checkOneTerm(analyzer, "colonisateur", "colon"); 	TokenNameCOMMENT_LINE	checkOneTerm(analyzer, "colonisateur", "colon"); 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"nomination"	TokenNameStringLiteral	nomination
,	TokenNameCOMMA	
"nomin"	TokenNameStringLiteral	nomin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"disposition"	TokenNameStringLiteral	disposition
,	TokenNameCOMMA	
"dispos"	TokenNameStringLiteral	dispos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"dispose"	TokenNameStringLiteral	dispose
,	TokenNameCOMMA	
"dispos"	TokenNameStringLiteral	dispos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test against a vocabulary from the reference impl */	TokenNameCOMMENT_JAVADOC	 Test against a vocabulary from the reference impl 
public	TokenNamepublic	
void	TokenNamevoid	
testVocabulary	TokenNameIdentifier	 test Vocabulary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertVocabulary	TokenNameIdentifier	 assert Vocabulary
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
getDataFile	TokenNameIdentifier	 get Data File
(	TokenNameLPAREN	
"frlighttestdata.zip"	TokenNameStringLiteral	frlighttestdata.zip
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"frlight.txt"	TokenNameStringLiteral	frlight.txt
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
FrenchLightStemFilter	TokenNameIdentifier	 French Light Stem Filter
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
