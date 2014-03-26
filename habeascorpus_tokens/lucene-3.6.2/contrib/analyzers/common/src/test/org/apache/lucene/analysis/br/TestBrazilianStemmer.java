package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
br	TokenNameIdentifier	 br
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
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
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
/** * Test the Brazilian Stem Filter, which only modifies the term text. * * It is very similar to the snowball portuguese algorithm but not exactly the same. * */	TokenNameCOMMENT_JAVADOC	 Test the Brazilian Stem Filter, which only modifies the term text. * It is very similar to the snowball portuguese algorithm but not exactly the same. 
public	TokenNamepublic	
class	TokenNameclass	
TestBrazilianStemmer	TokenNameIdentifier	 Test Brazilian Stemmer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithSnowballExamples	TokenNameIdentifier	 test With Snowball Examples
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boa"	TokenNameStringLiteral	boa
,	TokenNameCOMMA	
"boa"	TokenNameStringLiteral	boa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boainain"	TokenNameStringLiteral	boainain
,	TokenNameCOMMA	
"boainain"	TokenNameStringLiteral	boainain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boas"	TokenNameStringLiteral	boas
,	TokenNameCOMMA	
"boas"	TokenNameStringLiteral	boas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bôas"	TokenNameStringLiteral	bôas
,	TokenNameCOMMA	
"boas"	TokenNameStringLiteral	boas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portugese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portugese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boassu"	TokenNameStringLiteral	boassu
,	TokenNameCOMMA	
"boassu"	TokenNameStringLiteral	boassu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boataria"	TokenNameStringLiteral	boataria
,	TokenNameCOMMA	
"boat"	TokenNameStringLiteral	boat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boate"	TokenNameStringLiteral	boate
,	TokenNameCOMMA	
"boat"	TokenNameStringLiteral	boat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boates"	TokenNameStringLiteral	boates
,	TokenNameCOMMA	
"boat"	TokenNameStringLiteral	boat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boatos"	TokenNameStringLiteral	boatos
,	TokenNameCOMMA	
"boat"	TokenNameStringLiteral	boat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bob"	TokenNameStringLiteral	bob
,	TokenNameCOMMA	
"bob"	TokenNameStringLiteral	bob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boba"	TokenNameStringLiteral	boba
,	TokenNameCOMMA	
"bob"	TokenNameStringLiteral	bob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bobagem"	TokenNameStringLiteral	bobagem
,	TokenNameCOMMA	
"bobag"	TokenNameStringLiteral	bobag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bobagens"	TokenNameStringLiteral	bobagens
,	TokenNameCOMMA	
"bobagens"	TokenNameStringLiteral	bobagens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bobalhões"	TokenNameStringLiteral	bobalhões
,	TokenNameCOMMA	
"bobalho"	TokenNameStringLiteral	bobalho
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portugese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portugese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bobear"	TokenNameStringLiteral	bobear
,	TokenNameCOMMA	
"bob"	TokenNameStringLiteral	bob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bobeira"	TokenNameStringLiteral	bobeira
,	TokenNameCOMMA	
"bobeir"	TokenNameStringLiteral	bobeir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bobinho"	TokenNameStringLiteral	bobinho
,	TokenNameCOMMA	
"bobinh"	TokenNameStringLiteral	bobinh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bobinhos"	TokenNameStringLiteral	bobinhos
,	TokenNameCOMMA	
"bobinh"	TokenNameStringLiteral	bobinh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bobo"	TokenNameStringLiteral	bobo
,	TokenNameCOMMA	
"bob"	TokenNameStringLiteral	bob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bobs"	TokenNameStringLiteral	bobs
,	TokenNameCOMMA	
"bobs"	TokenNameStringLiteral	bobs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boca"	TokenNameStringLiteral	boca
,	TokenNameCOMMA	
"boc"	TokenNameStringLiteral	boc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bocadas"	TokenNameStringLiteral	bocadas
,	TokenNameCOMMA	
"boc"	TokenNameStringLiteral	boc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bocadinho"	TokenNameStringLiteral	bocadinho
,	TokenNameCOMMA	
"bocadinh"	TokenNameStringLiteral	bocadinh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bocado"	TokenNameStringLiteral	bocado
,	TokenNameCOMMA	
"boc"	TokenNameStringLiteral	boc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bocaiúva"	TokenNameStringLiteral	bocaiúva
,	TokenNameCOMMA	
"bocaiuv"	TokenNameStringLiteral	bocaiuv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portuguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portuguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boçal"	TokenNameStringLiteral	boçal
,	TokenNameCOMMA	
"bocal"	TokenNameStringLiteral	bocal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portuguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portuguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bocarra"	TokenNameStringLiteral	bocarra
,	TokenNameCOMMA	
"bocarr"	TokenNameStringLiteral	bocarr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bocas"	TokenNameStringLiteral	bocas
,	TokenNameCOMMA	
"boc"	TokenNameStringLiteral	boc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bode"	TokenNameStringLiteral	bode
,	TokenNameCOMMA	
"bod"	TokenNameStringLiteral	bod
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bodoque"	TokenNameStringLiteral	bodoque
,	TokenNameCOMMA	
"bodoqu"	TokenNameStringLiteral	bodoqu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boeing"	TokenNameStringLiteral	boeing
,	TokenNameCOMMA	
"boeing"	TokenNameStringLiteral	boeing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boem"	TokenNameStringLiteral	boem
,	TokenNameCOMMA	
"boem"	TokenNameStringLiteral	boem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boemia"	TokenNameStringLiteral	boemia
,	TokenNameCOMMA	
"boem"	TokenNameStringLiteral	boem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boêmio"	TokenNameStringLiteral	boêmio
,	TokenNameCOMMA	
"boemi"	TokenNameStringLiteral	boemi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portuguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portuguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bogotá"	TokenNameStringLiteral	bogotá
,	TokenNameCOMMA	
"bogot"	TokenNameStringLiteral	bogot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boi"	TokenNameStringLiteral	boi
,	TokenNameCOMMA	
"boi"	TokenNameStringLiteral	boi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"bóia"	TokenNameStringLiteral	bóia
,	TokenNameCOMMA	
"boi"	TokenNameStringLiteral	boi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portuguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portuguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"boiando"	TokenNameStringLiteral	boiando
,	TokenNameCOMMA	
"boi"	TokenNameStringLiteral	boi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quiabo"	TokenNameStringLiteral	quiabo
,	TokenNameCOMMA	
"quiab"	TokenNameStringLiteral	quiab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quicaram"	TokenNameStringLiteral	quicaram
,	TokenNameCOMMA	
"quic"	TokenNameStringLiteral	quic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quickly"	TokenNameStringLiteral	quickly
,	TokenNameCOMMA	
"quickly"	TokenNameStringLiteral	quickly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quieto"	TokenNameStringLiteral	quieto
,	TokenNameCOMMA	
"quiet"	TokenNameStringLiteral	quiet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quietos"	TokenNameStringLiteral	quietos
,	TokenNameCOMMA	
"quiet"	TokenNameStringLiteral	quiet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilate"	TokenNameStringLiteral	quilate
,	TokenNameCOMMA	
"quilat"	TokenNameStringLiteral	quilat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilates"	TokenNameStringLiteral	quilates
,	TokenNameCOMMA	
"quilat"	TokenNameStringLiteral	quilat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilinhos"	TokenNameStringLiteral	quilinhos
,	TokenNameCOMMA	
"quilinh"	TokenNameStringLiteral	quilinh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilo"	TokenNameStringLiteral	quilo
,	TokenNameCOMMA	
"quil"	TokenNameStringLiteral	quil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilombo"	TokenNameStringLiteral	quilombo
,	TokenNameCOMMA	
"quilomb"	TokenNameStringLiteral	quilomb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilométricas"	TokenNameStringLiteral	quilométricas
,	TokenNameCOMMA	
"quilometr"	TokenNameStringLiteral	quilometr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portuguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portuguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilométricos"	TokenNameStringLiteral	quilométricos
,	TokenNameCOMMA	
"quilometr"	TokenNameStringLiteral	quilometr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portuguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portuguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilômetro"	TokenNameStringLiteral	quilômetro
,	TokenNameCOMMA	
"quilometr"	TokenNameStringLiteral	quilometr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portoguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portoguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilômetros"	TokenNameStringLiteral	quilômetros
,	TokenNameCOMMA	
"quilometr"	TokenNameStringLiteral	quilometr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portoguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portoguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilos"	TokenNameStringLiteral	quilos
,	TokenNameCOMMA	
"quil"	TokenNameStringLiteral	quil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quimica"	TokenNameStringLiteral	quimica
,	TokenNameCOMMA	
"quimic"	TokenNameStringLiteral	quimic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quilos"	TokenNameStringLiteral	quilos
,	TokenNameCOMMA	
"quil"	TokenNameStringLiteral	quil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quimica"	TokenNameStringLiteral	quimica
,	TokenNameCOMMA	
"quimic"	TokenNameStringLiteral	quimic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quimicas"	TokenNameStringLiteral	quimicas
,	TokenNameCOMMA	
"quimic"	TokenNameStringLiteral	quimic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quimico"	TokenNameStringLiteral	quimico
,	TokenNameCOMMA	
"quimic"	TokenNameStringLiteral	quimic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quimicos"	TokenNameStringLiteral	quimicos
,	TokenNameCOMMA	
"quimic"	TokenNameStringLiteral	quimic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quimioterapia"	TokenNameStringLiteral	quimioterapia
,	TokenNameCOMMA	
"quimioterap"	TokenNameStringLiteral	quimioterap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quimioterápicos"	TokenNameStringLiteral	quimioterápicos
,	TokenNameCOMMA	
"quimioterap"	TokenNameStringLiteral	quimioterap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portoguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portoguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quimono"	TokenNameStringLiteral	quimono
,	TokenNameCOMMA	
"quimon"	TokenNameStringLiteral	quimon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quincas"	TokenNameStringLiteral	quincas
,	TokenNameCOMMA	
"quinc"	TokenNameStringLiteral	quinc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quinhão"	TokenNameStringLiteral	quinhão
,	TokenNameCOMMA	
"quinha"	TokenNameStringLiteral	quinha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portoguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portoguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quinhentos"	TokenNameStringLiteral	quinhentos
,	TokenNameCOMMA	
"quinhent"	TokenNameStringLiteral	quinhent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quinn"	TokenNameStringLiteral	quinn
,	TokenNameCOMMA	
"quinn"	TokenNameStringLiteral	quinn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quino"	TokenNameStringLiteral	quino
,	TokenNameCOMMA	
"quin"	TokenNameStringLiteral	quin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quinta"	TokenNameStringLiteral	quinta
,	TokenNameCOMMA	
"quint"	TokenNameStringLiteral	quint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quintal"	TokenNameStringLiteral	quintal
,	TokenNameCOMMA	
"quintal"	TokenNameStringLiteral	quintal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quintana"	TokenNameStringLiteral	quintana
,	TokenNameCOMMA	
"quintan"	TokenNameStringLiteral	quintan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quintanilha"	TokenNameStringLiteral	quintanilha
,	TokenNameCOMMA	
"quintanilh"	TokenNameStringLiteral	quintanilh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quintão"	TokenNameStringLiteral	quintão
,	TokenNameCOMMA	
"quinta"	TokenNameStringLiteral	quinta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portoguese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portoguese 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quintessência"	TokenNameStringLiteral	quintessência
,	TokenNameCOMMA	
"quintessente"	TokenNameStringLiteral	quintessente
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// versus snowball portuguese 'quintessent' 	TokenNameCOMMENT_LINE	versus snowball portuguese 'quintessent' 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quintino"	TokenNameStringLiteral	quintino
,	TokenNameCOMMA	
"quintin"	TokenNameStringLiteral	quintin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quinto"	TokenNameStringLiteral	quinto
,	TokenNameCOMMA	
"quint"	TokenNameStringLiteral	quint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quintos"	TokenNameStringLiteral	quintos
,	TokenNameCOMMA	
"quint"	TokenNameStringLiteral	quint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quintuplicou"	TokenNameStringLiteral	quintuplicou
,	TokenNameCOMMA	
"quintuplic"	TokenNameStringLiteral	quintuplic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quinze"	TokenNameStringLiteral	quinze
,	TokenNameCOMMA	
"quinz"	TokenNameStringLiteral	quinz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quinzena"	TokenNameStringLiteral	quinzena
,	TokenNameCOMMA	
"quinzen"	TokenNameStringLiteral	quinzen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quiosque"	TokenNameStringLiteral	quiosque
,	TokenNameCOMMA	
"quiosqu"	TokenNameStringLiteral	quiosqu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNormalization	TokenNameIdentifier	 test Normalization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"Brasil"	TokenNameStringLiteral	Brasil
,	TokenNameCOMMA	
"brasil"	TokenNameStringLiteral	brasil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// lowercase by default 	TokenNameCOMMENT_LINE	lowercase by default 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"Brasília"	TokenNameStringLiteral	Brasília
,	TokenNameCOMMA	
"brasil"	TokenNameStringLiteral	brasil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove diacritics 	TokenNameCOMMENT_LINE	remove diacritics 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"quimio5terápicos"	TokenNameStringLiteral	quimio5terápicos
,	TokenNameCOMMA	
"quimio5terapicos"	TokenNameStringLiteral	quimio5terapicos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// contains non-letter, diacritic will still be removed 	TokenNameCOMMENT_LINE	contains non-letter, diacritic will still be removed 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"áá"	TokenNameStringLiteral	áá
,	TokenNameCOMMA	
"áá"	TokenNameStringLiteral	áá
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// token is too short: diacritics are not removed 	TokenNameCOMMENT_LINE	token is too short: diacritics are not removed 
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ááá"	TokenNameStringLiteral	ááá
,	TokenNameCOMMA	
"aaa"	TokenNameStringLiteral	aaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// normally, diacritics are removed 	TokenNameCOMMENT_LINE	normally, diacritics are removed 
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
BrazilianAnalyzer	TokenNameIdentifier	 Brazilian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReuse	TokenNameIdentifier	 check Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"boa"	TokenNameStringLiteral	boa
,	TokenNameCOMMA	
"boa"	TokenNameStringLiteral	boa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReuse	TokenNameIdentifier	 check Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"boainain"	TokenNameStringLiteral	boainain
,	TokenNameCOMMA	
"boainain"	TokenNameStringLiteral	boainain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReuse	TokenNameIdentifier	 check Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"boas"	TokenNameStringLiteral	boas
,	TokenNameCOMMA	
"boas"	TokenNameStringLiteral	boas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReuse	TokenNameIdentifier	 check Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bôas"	TokenNameStringLiteral	bôas
,	TokenNameCOMMA	
"boas"	TokenNameStringLiteral	boas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removes diacritic: different from snowball portugese 	TokenNameCOMMENT_LINE	removes diacritic: different from snowball portugese 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStemExclusionTable	TokenNameIdentifier	 test Stem Exclusion Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BrazilianAnalyzer	TokenNameIdentifier	 Brazilian Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
BrazilianAnalyzer	TokenNameIdentifier	 Brazilian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
,	TokenNameCOMMA	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
asSet	TokenNameIdentifier	 as Set
(	TokenNameLPAREN	
"quintessência"	TokenNameStringLiteral	quintessência
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReuse	TokenNameIdentifier	 check Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"quintessência"	TokenNameStringLiteral	quintessência
,	TokenNameCOMMA	
"quintessência"	TokenNameStringLiteral	quintessência
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// excluded words will be completely unchanged. 	TokenNameCOMMENT_LINE	excluded words will be completely unchanged. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStemExclusionTableBWCompat	TokenNameIdentifier	 test Stem Exclusion Table BW Compat
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
"Brasília"	TokenNameStringLiteral	Brasília
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
(	TokenNameLPAREN	
new	TokenNamenew	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"Brasília Brasilia"	TokenNameStringLiteral	Brasília Brasilia
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
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
"brasília"	TokenNameStringLiteral	brasília
,	TokenNameCOMMA	
"brasil"	TokenNameStringLiteral	brasil
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
"Brasília"	TokenNameStringLiteral	Brasília
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
(	TokenNameLPAREN	
new	TokenNamenew	
KeywordMarkerFilter	TokenNameIdentifier	 Keyword Marker Filter
(	TokenNameLPAREN	
new	TokenNamenew	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"Brasília Brasilia"	TokenNameStringLiteral	Brasília Brasilia
)	TokenNameRPAREN	
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
"brasília"	TokenNameStringLiteral	brasília
,	TokenNameCOMMA	
"brasil"	TokenNameStringLiteral	brasil
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithKeywordAttributeAndExclusionTable	TokenNameIdentifier	 test With Keyword Attribute And Exclusion Table
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
"Brasília"	TokenNameStringLiteral	Brasília
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharArraySet	TokenNameIdentifier	 Char Array Set
set1	TokenNameIdentifier	 set1
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
set1	TokenNameIdentifier	 set1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Brasilia"	TokenNameStringLiteral	Brasilia
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
(	TokenNameLPAREN	
new	TokenNamenew	
KeywordMarkerFilter	TokenNameIdentifier	 Keyword Marker Filter
(	TokenNameLPAREN	
new	TokenNamenew	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"Brasília Brasilia"	TokenNameStringLiteral	Brasília Brasilia
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
,	TokenNameCOMMA	
set1	TokenNameIdentifier	 set1
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
"brasília"	TokenNameStringLiteral	brasília
,	TokenNameCOMMA	
"brasilia"	TokenNameStringLiteral	brasilia
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
BrazilianAnalyzer	TokenNameIdentifier	 Brazilian Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
BrazilianAnalyzer	TokenNameIdentifier	 Brazilian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReuse	TokenNameIdentifier	 check Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"quintessência"	TokenNameStringLiteral	quintessência
,	TokenNameCOMMA	
"quintessente"	TokenNameStringLiteral	quintessente
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setStemExclusionTable	TokenNameIdentifier	 set Stem Exclusion Table
(	TokenNameLPAREN	
"quintessência"	TokenNameStringLiteral	quintessência
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReuse	TokenNameIdentifier	 check Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"quintessência"	TokenNameStringLiteral	quintessência
,	TokenNameCOMMA	
"quintessência"	TokenNameStringLiteral	quintessência
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
new	TokenNamenew	
BrazilianAnalyzer	TokenNameIdentifier	 Brazilian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkReuse	TokenNameIdentifier	 check Reuse
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
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
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
new	TokenNamenew	
BrazilianAnalyzer	TokenNameIdentifier	 Brazilian Analyzer
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
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
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
