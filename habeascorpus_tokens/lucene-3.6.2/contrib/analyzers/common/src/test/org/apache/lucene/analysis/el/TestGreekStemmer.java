package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
el	TokenNameIdentifier	 el
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
public	TokenNamepublic	
class	TokenNameclass	
TestGreekStemmer	TokenNameIdentifier	 Test Greek Stemmer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
GreekAnalyzer	TokenNameIdentifier	 Greek Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testMasculineNouns	TokenNameIdentifier	 test Masculine Nouns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// -ος 	TokenNameCOMMENT_LINE	-ος 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"άνθρωπος"	TokenNameStringLiteral	άνθρωπος
,	TokenNameCOMMA	
"ανθρωπ"	TokenNameStringLiteral	ανθρωπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανθρώπου"	TokenNameStringLiteral	ανθρώπου
,	TokenNameCOMMA	
"ανθρωπ"	TokenNameStringLiteral	ανθρωπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"άνθρωπο"	TokenNameStringLiteral	άνθρωπο
,	TokenNameCOMMA	
"ανθρωπ"	TokenNameStringLiteral	ανθρωπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"άνθρωπε"	TokenNameStringLiteral	άνθρωπε
,	TokenNameCOMMA	
"ανθρωπ"	TokenNameStringLiteral	ανθρωπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"άνθρωποι"	TokenNameStringLiteral	άνθρωποι
,	TokenNameCOMMA	
"ανθρωπ"	TokenNameStringLiteral	ανθρωπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανθρώπων"	TokenNameStringLiteral	ανθρώπων
,	TokenNameCOMMA	
"ανθρωπ"	TokenNameStringLiteral	ανθρωπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανθρώπους"	TokenNameStringLiteral	ανθρώπους
,	TokenNameCOMMA	
"ανθρωπ"	TokenNameStringLiteral	ανθρωπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"άνθρωποι"	TokenNameStringLiteral	άνθρωποι
,	TokenNameCOMMA	
"ανθρωπ"	TokenNameStringLiteral	ανθρωπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ης 	TokenNameCOMMENT_LINE	-ης 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πελάτης"	TokenNameStringLiteral	πελάτης
,	TokenNameCOMMA	
"πελατ"	TokenNameStringLiteral	πελατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πελάτη"	TokenNameStringLiteral	πελάτη
,	TokenNameCOMMA	
"πελατ"	TokenNameStringLiteral	πελατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πελάτες"	TokenNameStringLiteral	πελάτες
,	TokenNameCOMMA	
"πελατ"	TokenNameStringLiteral	πελατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πελατών"	TokenNameStringLiteral	πελατών
,	TokenNameCOMMA	
"πελατ"	TokenNameStringLiteral	πελατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ας/-ες 	TokenNameCOMMENT_LINE	-ας/-ες 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ελέφαντας"	TokenNameStringLiteral	ελέφαντας
,	TokenNameCOMMA	
"ελεφαντ"	TokenNameStringLiteral	ελεφαντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ελέφαντα"	TokenNameStringLiteral	ελέφαντα
,	TokenNameCOMMA	
"ελεφαντ"	TokenNameStringLiteral	ελεφαντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ελέφαντες"	TokenNameStringLiteral	ελέφαντες
,	TokenNameCOMMA	
"ελεφαντ"	TokenNameStringLiteral	ελεφαντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ελεφάντων"	TokenNameStringLiteral	ελεφάντων
,	TokenNameCOMMA	
"ελεφαντ"	TokenNameStringLiteral	ελεφαντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ας/-αδες 	TokenNameCOMMENT_LINE	-ας/-αδες 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μπαμπάς"	TokenNameStringLiteral	μπαμπάς
,	TokenNameCOMMA	
"μπαμπ"	TokenNameStringLiteral	μπαμπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μπαμπά"	TokenNameStringLiteral	μπαμπά
,	TokenNameCOMMA	
"μπαμπ"	TokenNameStringLiteral	μπαμπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μπαμπάδες"	TokenNameStringLiteral	μπαμπάδες
,	TokenNameCOMMA	
"μπαμπ"	TokenNameStringLiteral	μπαμπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μπαμπάδων"	TokenNameStringLiteral	μπαμπάδων
,	TokenNameCOMMA	
"μπαμπ"	TokenNameStringLiteral	μπαμπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ης/-ηδες 	TokenNameCOMMENT_LINE	-ης/-ηδες 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μπακάλης"	TokenNameStringLiteral	μπακάλης
,	TokenNameCOMMA	
"μπακαλ"	TokenNameStringLiteral	μπακαλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μπακάλη"	TokenNameStringLiteral	μπακάλη
,	TokenNameCOMMA	
"μπακαλ"	TokenNameStringLiteral	μπακαλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μπακάληδες"	TokenNameStringLiteral	μπακάληδες
,	TokenNameCOMMA	
"μπακαλ"	TokenNameStringLiteral	μπακαλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μπακάληδων"	TokenNameStringLiteral	μπακάληδων
,	TokenNameCOMMA	
"μπακαλ"	TokenNameStringLiteral	μπακαλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ες 	TokenNameCOMMENT_LINE	-ες 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καφές"	TokenNameStringLiteral	καφές
,	TokenNameCOMMA	
"καφ"	TokenNameStringLiteral	καφ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καφέ"	TokenNameStringLiteral	καφέ
,	TokenNameCOMMA	
"καφ"	TokenNameStringLiteral	καφ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καφέδες"	TokenNameStringLiteral	καφέδες
,	TokenNameCOMMA	
"καφ"	TokenNameStringLiteral	καφ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καφέδων"	TokenNameStringLiteral	καφέδων
,	TokenNameCOMMA	
"καφ"	TokenNameStringLiteral	καφ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -έας/είς 	TokenNameCOMMENT_LINE	-έας/είς 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γραμματέας"	TokenNameStringLiteral	γραμματέας
,	TokenNameCOMMA	
"γραμματε"	TokenNameStringLiteral	γραμματε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γραμματέα"	TokenNameStringLiteral	γραμματέα
,	TokenNameCOMMA	
"γραμματε"	TokenNameStringLiteral	γραμματε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// plural forms conflate w/ each other, not w/ the sing forms 	TokenNameCOMMENT_LINE	plural forms conflate w/ each other, not w/ the sing forms 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γραμματείς"	TokenNameStringLiteral	γραμματείς
,	TokenNameCOMMA	
"γραμματ"	TokenNameStringLiteral	γραμματ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γραμματέων"	TokenNameStringLiteral	γραμματέων
,	TokenNameCOMMA	
"γραμματ"	TokenNameStringLiteral	γραμματ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ους/οι 	TokenNameCOMMENT_LINE	-ους/οι 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"απόπλους"	TokenNameStringLiteral	απόπλους
,	TokenNameCOMMA	
"αποπλ"	TokenNameStringLiteral	αποπλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"απόπλου"	TokenNameStringLiteral	απόπλου
,	TokenNameCOMMA	
"αποπλ"	TokenNameStringLiteral	αποπλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"απόπλοι"	TokenNameStringLiteral	απόπλοι
,	TokenNameCOMMA	
"αποπλ"	TokenNameStringLiteral	αποπλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"απόπλων"	TokenNameStringLiteral	απόπλων
,	TokenNameCOMMA	
"αποπλ"	TokenNameStringLiteral	αποπλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ους/-ουδες 	TokenNameCOMMENT_LINE	-ους/-ουδες 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"παππούς"	TokenNameStringLiteral	παππούς
,	TokenNameCOMMA	
"παππ"	TokenNameStringLiteral	παππ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"παππού"	TokenNameStringLiteral	παππού
,	TokenNameCOMMA	
"παππ"	TokenNameStringLiteral	παππ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"παππούδες"	TokenNameStringLiteral	παππούδες
,	TokenNameCOMMA	
"παππ"	TokenNameStringLiteral	παππ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"παππούδων"	TokenNameStringLiteral	παππούδων
,	TokenNameCOMMA	
"παππ"	TokenNameStringLiteral	παππ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ης/-εις 	TokenNameCOMMENT_LINE	-ης/-εις 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λάτρης"	TokenNameStringLiteral	λάτρης
,	TokenNameCOMMA	
"λατρ"	TokenNameStringLiteral	λατρ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λάτρη"	TokenNameStringLiteral	λάτρη
,	TokenNameCOMMA	
"λατρ"	TokenNameStringLiteral	λατρ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λάτρεις"	TokenNameStringLiteral	λάτρεις
,	TokenNameCOMMA	
"λατρ"	TokenNameStringLiteral	λατρ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λάτρεων"	TokenNameStringLiteral	λάτρεων
,	TokenNameCOMMA	
"λατρ"	TokenNameStringLiteral	λατρ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -υς 	TokenNameCOMMENT_LINE	-υς 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέλεκυς"	TokenNameStringLiteral	πέλεκυς
,	TokenNameCOMMA	
"πελεκ"	TokenNameStringLiteral	πελεκ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέλεκυ"	TokenNameStringLiteral	πέλεκυ
,	TokenNameCOMMA	
"πελεκ"	TokenNameStringLiteral	πελεκ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πελέκεις"	TokenNameStringLiteral	πελέκεις
,	TokenNameCOMMA	
"πελεκ"	TokenNameStringLiteral	πελεκ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πελέκεων"	TokenNameStringLiteral	πελέκεων
,	TokenNameCOMMA	
"πελεκ"	TokenNameStringLiteral	πελεκ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ωρ 	TokenNameCOMMENT_LINE	-ωρ 
// note: nom./voc. doesn't conflate w/ the rest 	TokenNameCOMMENT_LINE	note: nom./voc. doesn't conflate w/ the rest 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μέντωρ"	TokenNameStringLiteral	μέντωρ
,	TokenNameCOMMA	
"μεντωρ"	TokenNameStringLiteral	μεντωρ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μέντορος"	TokenNameStringLiteral	μέντορος
,	TokenNameCOMMA	
"μεντορ"	TokenNameStringLiteral	μεντορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μέντορα"	TokenNameStringLiteral	μέντορα
,	TokenNameCOMMA	
"μεντορ"	TokenNameStringLiteral	μεντορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μέντορες"	TokenNameStringLiteral	μέντορες
,	TokenNameCOMMA	
"μεντορ"	TokenNameStringLiteral	μεντορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μεντόρων"	TokenNameStringLiteral	μεντόρων
,	TokenNameCOMMA	
"μεντορ"	TokenNameStringLiteral	μεντορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ων 	TokenNameCOMMENT_LINE	-ων 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγώνας"	TokenNameStringLiteral	αγώνας
,	TokenNameCOMMA	
"αγων"	TokenNameStringLiteral	αγων
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγώνος"	TokenNameStringLiteral	αγώνος
,	TokenNameCOMMA	
"αγων"	TokenNameStringLiteral	αγων
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγώνα"	TokenNameStringLiteral	αγώνα
,	TokenNameCOMMA	
"αγων"	TokenNameStringLiteral	αγων
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγώνα"	TokenNameStringLiteral	αγώνα
,	TokenNameCOMMA	
"αγων"	TokenNameStringLiteral	αγων
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγώνες"	TokenNameStringLiteral	αγώνες
,	TokenNameCOMMA	
"αγων"	TokenNameStringLiteral	αγων
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγώνων"	TokenNameStringLiteral	αγώνων
,	TokenNameCOMMA	
"αγων"	TokenNameStringLiteral	αγων
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ας/-ηδες 	TokenNameCOMMENT_LINE	-ας/-ηδες 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αέρας"	TokenNameStringLiteral	αέρας
,	TokenNameCOMMA	
"αερ"	TokenNameStringLiteral	αερ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αέρα"	TokenNameStringLiteral	αέρα
,	TokenNameCOMMA	
"αερ"	TokenNameStringLiteral	αερ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αέρηδες"	TokenNameStringLiteral	αέρηδες
,	TokenNameCOMMA	
"αερ"	TokenNameStringLiteral	αερ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αέρηδων"	TokenNameStringLiteral	αέρηδων
,	TokenNameCOMMA	
"αερ"	TokenNameStringLiteral	αερ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ης/-ητες 	TokenNameCOMMENT_LINE	-ης/-ητες 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γόης"	TokenNameStringLiteral	γόης
,	TokenNameCOMMA	
"γο"	TokenNameStringLiteral	γο
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γόη"	TokenNameStringLiteral	γόη
,	TokenNameCOMMA	
"γοη"	TokenNameStringLiteral	γοη
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// too short 	TokenNameCOMMENT_LINE	too short 
// the two plural forms conflate 	TokenNameCOMMENT_LINE	the two plural forms conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γόητες"	TokenNameStringLiteral	γόητες
,	TokenNameCOMMA	
"γοητ"	TokenNameStringLiteral	γοητ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γοήτων"	TokenNameStringLiteral	γοήτων
,	TokenNameCOMMA	
"γοητ"	TokenNameStringLiteral	γοητ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFeminineNouns	TokenNameIdentifier	 test Feminine Nouns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// -α/-ες,-ών 	TokenNameCOMMENT_LINE	-α/-ες,-ών 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορά"	TokenNameStringLiteral	φορά
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φοράς"	TokenNameStringLiteral	φοράς
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορές"	TokenNameStringLiteral	φορές
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορών"	TokenNameStringLiteral	φορών
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -α/-ες,-ων 	TokenNameCOMMENT_LINE	-α/-ες,-ων 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγελάδα"	TokenNameStringLiteral	αγελάδα
,	TokenNameCOMMA	
"αγελαδ"	TokenNameStringLiteral	αγελαδ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγελάδας"	TokenNameStringLiteral	αγελάδας
,	TokenNameCOMMA	
"αγελαδ"	TokenNameStringLiteral	αγελαδ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγελάδες"	TokenNameStringLiteral	αγελάδες
,	TokenNameCOMMA	
"αγελαδ"	TokenNameStringLiteral	αγελαδ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αγελάδων"	TokenNameStringLiteral	αγελάδων
,	TokenNameCOMMA	
"αγελαδ"	TokenNameStringLiteral	αγελαδ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -η/-ες 	TokenNameCOMMENT_LINE	-η/-ες 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ζάχαρη"	TokenNameStringLiteral	ζάχαρη
,	TokenNameCOMMA	
"ζαχαρ"	TokenNameStringLiteral	ζαχαρ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ζάχαρης"	TokenNameStringLiteral	ζάχαρης
,	TokenNameCOMMA	
"ζαχαρ"	TokenNameStringLiteral	ζαχαρ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ζάχαρες"	TokenNameStringLiteral	ζάχαρες
,	TokenNameCOMMA	
"ζαχαρ"	TokenNameStringLiteral	ζαχαρ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ζαχάρεων"	TokenNameStringLiteral	ζαχάρεων
,	TokenNameCOMMA	
"ζαχαρ"	TokenNameStringLiteral	ζαχαρ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -η/-εις 	TokenNameCOMMENT_LINE	-η/-εις 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"τηλεόραση"	TokenNameStringLiteral	τηλεόραση
,	TokenNameCOMMA	
"τηλεορασ"	TokenNameStringLiteral	τηλεορασ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"τηλεόρασης"	TokenNameStringLiteral	τηλεόρασης
,	TokenNameCOMMA	
"τηλεορασ"	TokenNameStringLiteral	τηλεορασ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"τηλεοράσεις"	TokenNameStringLiteral	τηλεοράσεις
,	TokenNameCOMMA	
"τηλεορασ"	TokenNameStringLiteral	τηλεορασ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"τηλεοράσεων"	TokenNameStringLiteral	τηλεοράσεων
,	TokenNameCOMMA	
"τηλεορασ"	TokenNameStringLiteral	τηλεορασ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -α/-αδες 	TokenNameCOMMENT_LINE	-α/-αδες 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μαμά"	TokenNameStringLiteral	μαμά
,	TokenNameCOMMA	
"μαμ"	TokenNameStringLiteral	μαμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μαμάς"	TokenNameStringLiteral	μαμάς
,	TokenNameCOMMA	
"μαμ"	TokenNameStringLiteral	μαμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μαμάδες"	TokenNameStringLiteral	μαμάδες
,	TokenNameCOMMA	
"μαμ"	TokenNameStringLiteral	μαμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μαμάδων"	TokenNameStringLiteral	μαμάδων
,	TokenNameCOMMA	
"μαμ"	TokenNameStringLiteral	μαμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ος 	TokenNameCOMMENT_LINE	-ος 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λεωφόρος"	TokenNameStringLiteral	λεωφόρος
,	TokenNameCOMMA	
"λεωφορ"	TokenNameStringLiteral	λεωφορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λεωφόρου"	TokenNameStringLiteral	λεωφόρου
,	TokenNameCOMMA	
"λεωφορ"	TokenNameStringLiteral	λεωφορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λεωφόρο"	TokenNameStringLiteral	λεωφόρο
,	TokenNameCOMMA	
"λεωφορ"	TokenNameStringLiteral	λεωφορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λεωφόρε"	TokenNameStringLiteral	λεωφόρε
,	TokenNameCOMMA	
"λεωφορ"	TokenNameStringLiteral	λεωφορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λεωφόροι"	TokenNameStringLiteral	λεωφόροι
,	TokenNameCOMMA	
"λεωφορ"	TokenNameStringLiteral	λεωφορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λεωφόρων"	TokenNameStringLiteral	λεωφόρων
,	TokenNameCOMMA	
"λεωφορ"	TokenNameStringLiteral	λεωφορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λεωφόρους"	TokenNameStringLiteral	λεωφόρους
,	TokenNameCOMMA	
"λεωφορ"	TokenNameStringLiteral	λεωφορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ου 	TokenNameCOMMENT_LINE	-ου 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αλεπού"	TokenNameStringLiteral	αλεπού
,	TokenNameCOMMA	
"αλεπ"	TokenNameStringLiteral	αλεπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αλεπούς"	TokenNameStringLiteral	αλεπούς
,	TokenNameCOMMA	
"αλεπ"	TokenNameStringLiteral	αλεπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αλεπούδες"	TokenNameStringLiteral	αλεπούδες
,	TokenNameCOMMA	
"αλεπ"	TokenNameStringLiteral	αλεπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αλεπούδων"	TokenNameStringLiteral	αλεπούδων
,	TokenNameCOMMA	
"αλεπ"	TokenNameStringLiteral	αλεπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -έας/είς 	TokenNameCOMMENT_LINE	-έας/είς 
// note: not all forms conflate 	TokenNameCOMMENT_LINE	note: not all forms conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γραμματέας"	TokenNameStringLiteral	γραμματέας
,	TokenNameCOMMA	
"γραμματε"	TokenNameStringLiteral	γραμματε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γραμματέως"	TokenNameStringLiteral	γραμματέως
,	TokenNameCOMMA	
"γραμματ"	TokenNameStringLiteral	γραμματ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γραμματέα"	TokenNameStringLiteral	γραμματέα
,	TokenNameCOMMA	
"γραμματε"	TokenNameStringLiteral	γραμματε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γραμματείς"	TokenNameStringLiteral	γραμματείς
,	TokenNameCOMMA	
"γραμματ"	TokenNameStringLiteral	γραμματ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γραμματέων"	TokenNameStringLiteral	γραμματέων
,	TokenNameCOMMA	
"γραμματ"	TokenNameStringLiteral	γραμματ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNeuterNouns	TokenNameIdentifier	 test Neuter Nouns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// ending with -ο 	TokenNameCOMMENT_LINE	ending with -ο 
// note: nom doesnt conflate 	TokenNameCOMMENT_LINE	note: nom doesnt conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βιβλίο"	TokenNameStringLiteral	βιβλίο
,	TokenNameCOMMA	
"βιβλι"	TokenNameStringLiteral	βιβλι
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βιβλίου"	TokenNameStringLiteral	βιβλίου
,	TokenNameCOMMA	
"βιβλ"	TokenNameStringLiteral	βιβλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βιβλία"	TokenNameStringLiteral	βιβλία
,	TokenNameCOMMA	
"βιβλ"	TokenNameStringLiteral	βιβλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βιβλίων"	TokenNameStringLiteral	βιβλίων
,	TokenNameCOMMA	
"βιβλ"	TokenNameStringLiteral	βιβλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -ι 	TokenNameCOMMENT_LINE	ending with -ι 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πουλί"	TokenNameStringLiteral	πουλί
,	TokenNameCOMMA	
"πουλ"	TokenNameStringLiteral	πουλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πουλιού"	TokenNameStringLiteral	πουλιού
,	TokenNameCOMMA	
"πουλ"	TokenNameStringLiteral	πουλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πουλιά"	TokenNameStringLiteral	πουλιά
,	TokenNameCOMMA	
"πουλ"	TokenNameStringLiteral	πουλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πουλιών"	TokenNameStringLiteral	πουλιών
,	TokenNameCOMMA	
"πουλ"	TokenNameStringLiteral	πουλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -α 	TokenNameCOMMENT_LINE	ending with -α 
// note: nom. doesnt conflate 	TokenNameCOMMENT_LINE	note: nom. doesnt conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πρόβλημα"	TokenNameStringLiteral	πρόβλημα
,	TokenNameCOMMA	
"προβλημ"	TokenNameStringLiteral	προβλημ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"προβλήματος"	TokenNameStringLiteral	προβλήματος
,	TokenNameCOMMA	
"προβλημα"	TokenNameStringLiteral	προβλημα
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"προβλήματα"	TokenNameStringLiteral	προβλήματα
,	TokenNameCOMMA	
"προβλημα"	TokenNameStringLiteral	προβλημα
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"προβλημάτων"	TokenNameStringLiteral	προβλημάτων
,	TokenNameCOMMA	
"προβλημα"	TokenNameStringLiteral	προβλημα
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -ος/-ους 	TokenNameCOMMENT_LINE	ending with -ος/-ους 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέλαγος"	TokenNameStringLiteral	πέλαγος
,	TokenNameCOMMA	
"πελαγ"	TokenNameStringLiteral	πελαγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πελάγους"	TokenNameStringLiteral	πελάγους
,	TokenNameCOMMA	
"πελαγ"	TokenNameStringLiteral	πελαγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πελάγη"	TokenNameStringLiteral	πελάγη
,	TokenNameCOMMA	
"πελαγ"	TokenNameStringLiteral	πελαγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πελάγων"	TokenNameStringLiteral	πελάγων
,	TokenNameCOMMA	
"πελαγ"	TokenNameStringLiteral	πελαγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -ός/-ότος 	TokenNameCOMMENT_LINE	ending with -ός/-ότος 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γεγονός"	TokenNameStringLiteral	γεγονός
,	TokenNameCOMMA	
"γεγον"	TokenNameStringLiteral	γεγον
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γεγονότος"	TokenNameStringLiteral	γεγονότος
,	TokenNameCOMMA	
"γεγον"	TokenNameStringLiteral	γεγον
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γεγονότα"	TokenNameStringLiteral	γεγονότα
,	TokenNameCOMMA	
"γεγον"	TokenNameStringLiteral	γεγον
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γεγονότων"	TokenNameStringLiteral	γεγονότων
,	TokenNameCOMMA	
"γεγον"	TokenNameStringLiteral	γεγον
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -υ/-ιου 	TokenNameCOMMENT_LINE	ending with -υ/-ιου 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βράδυ"	TokenNameStringLiteral	βράδυ
,	TokenNameCOMMA	
"βραδ"	TokenNameStringLiteral	βραδ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βράδι"	TokenNameStringLiteral	βράδι
,	TokenNameCOMMA	
"βραδ"	TokenNameStringLiteral	βραδ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βραδιού"	TokenNameStringLiteral	βραδιού
,	TokenNameCOMMA	
"βραδ"	TokenNameStringLiteral	βραδ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βράδια"	TokenNameStringLiteral	βράδια
,	TokenNameCOMMA	
"βραδ"	TokenNameStringLiteral	βραδ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βραδιών"	TokenNameStringLiteral	βραδιών
,	TokenNameCOMMA	
"βραδ"	TokenNameStringLiteral	βραδ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -υ/-ατος 	TokenNameCOMMENT_LINE	ending with -υ/-ατος 
// note: nom. doesnt conflate 	TokenNameCOMMENT_LINE	note: nom. doesnt conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"δόρυ"	TokenNameStringLiteral	δόρυ
,	TokenNameCOMMA	
"δορ"	TokenNameStringLiteral	δορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"δόρατος"	TokenNameStringLiteral	δόρατος
,	TokenNameCOMMA	
"δορατ"	TokenNameStringLiteral	δορατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"δόρατα"	TokenNameStringLiteral	δόρατα
,	TokenNameCOMMA	
"δορατ"	TokenNameStringLiteral	δορατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"δοράτων"	TokenNameStringLiteral	δοράτων
,	TokenNameCOMMA	
"δορατ"	TokenNameStringLiteral	δορατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -ας 	TokenNameCOMMENT_LINE	ending with -ας 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρέας"	TokenNameStringLiteral	κρέας
,	TokenNameCOMMA	
"κρε"	TokenNameStringLiteral	κρε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρέατος"	TokenNameStringLiteral	κρέατος
,	TokenNameCOMMA	
"κρε"	TokenNameStringLiteral	κρε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρέατα"	TokenNameStringLiteral	κρέατα
,	TokenNameCOMMA	
"κρε"	TokenNameStringLiteral	κρε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρεάτων"	TokenNameStringLiteral	κρεάτων
,	TokenNameCOMMA	
"κρε"	TokenNameStringLiteral	κρε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -ως 	TokenNameCOMMENT_LINE	ending with -ως 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λυκόφως"	TokenNameStringLiteral	λυκόφως
,	TokenNameCOMMA	
"λυκοφω"	TokenNameStringLiteral	λυκοφω
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λυκόφωτος"	TokenNameStringLiteral	λυκόφωτος
,	TokenNameCOMMA	
"λυκοφω"	TokenNameStringLiteral	λυκοφω
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λυκόφωτα"	TokenNameStringLiteral	λυκόφωτα
,	TokenNameCOMMA	
"λυκοφω"	TokenNameStringLiteral	λυκοφω
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"λυκοφώτων"	TokenNameStringLiteral	λυκοφώτων
,	TokenNameCOMMA	
"λυκοφω"	TokenNameStringLiteral	λυκοφω
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -ον/-ου 	TokenNameCOMMENT_LINE	ending with -ον/-ου 
// note: nom. doesnt conflate 	TokenNameCOMMENT_LINE	note: nom. doesnt conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μέσον"	TokenNameStringLiteral	μέσον
,	TokenNameCOMMA	
"μεσον"	TokenNameStringLiteral	μεσον
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μέσου"	TokenNameStringLiteral	μέσου
,	TokenNameCOMMA	
"μεσ"	TokenNameStringLiteral	μεσ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μέσα"	TokenNameStringLiteral	μέσα
,	TokenNameCOMMA	
"μεσ"	TokenNameStringLiteral	μεσ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"μέσων"	TokenNameStringLiteral	μέσων
,	TokenNameCOMMA	
"μεσ"	TokenNameStringLiteral	μεσ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending in -ον/-οντος 	TokenNameCOMMENT_LINE	ending in -ον/-οντος 
// note: nom. doesnt conflate 	TokenNameCOMMENT_LINE	note: nom. doesnt conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ενδιαφέρον"	TokenNameStringLiteral	ενδιαφέρον
,	TokenNameCOMMA	
"ενδιαφερον"	TokenNameStringLiteral	ενδιαφερον
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ενδιαφέροντος"	TokenNameStringLiteral	ενδιαφέροντος
,	TokenNameCOMMA	
"ενδιαφεροντ"	TokenNameStringLiteral	ενδιαφεροντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ενδιαφέροντα"	TokenNameStringLiteral	ενδιαφέροντα
,	TokenNameCOMMA	
"ενδιαφεροντ"	TokenNameStringLiteral	ενδιαφεροντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ενδιαφερόντων"	TokenNameStringLiteral	ενδιαφερόντων
,	TokenNameCOMMA	
"ενδιαφεροντ"	TokenNameStringLiteral	ενδιαφεροντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -εν/-εντος 	TokenNameCOMMENT_LINE	ending with -εν/-εντος 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανακοινωθέν"	TokenNameStringLiteral	ανακοινωθέν
,	TokenNameCOMMA	
"ανακοινωθεν"	TokenNameStringLiteral	ανακοινωθεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανακοινωθέντος"	TokenNameStringLiteral	ανακοινωθέντος
,	TokenNameCOMMA	
"ανακοινωθεντ"	TokenNameStringLiteral	ανακοινωθεντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανακοινωθέντα"	TokenNameStringLiteral	ανακοινωθέντα
,	TokenNameCOMMA	
"ανακοινωθεντ"	TokenNameStringLiteral	ανακοινωθεντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανακοινωθέντων"	TokenNameStringLiteral	ανακοινωθέντων
,	TokenNameCOMMA	
"ανακοινωθεντ"	TokenNameStringLiteral	ανακοινωθεντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -αν/-αντος 	TokenNameCOMMENT_LINE	ending with -αν/-αντος 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"σύμπαν"	TokenNameStringLiteral	σύμπαν
,	TokenNameCOMMA	
"συμπ"	TokenNameStringLiteral	συμπ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"σύμπαντος"	TokenNameStringLiteral	σύμπαντος
,	TokenNameCOMMA	
"συμπαντ"	TokenNameStringLiteral	συμπαντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"σύμπαντα"	TokenNameStringLiteral	σύμπαντα
,	TokenNameCOMMA	
"συμπαντ"	TokenNameStringLiteral	συμπαντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συμπάντων"	TokenNameStringLiteral	συμπάντων
,	TokenNameCOMMA	
"συμπαντ"	TokenNameStringLiteral	συμπαντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -α/-ακτος 	TokenNameCOMMENT_LINE	ending with -α/-ακτος 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γάλα"	TokenNameStringLiteral	γάλα
,	TokenNameCOMMA	
"γαλ"	TokenNameStringLiteral	γαλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γάλακτος"	TokenNameStringLiteral	γάλακτος
,	TokenNameCOMMA	
"γαλακτ"	TokenNameStringLiteral	γαλακτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γάλατα"	TokenNameStringLiteral	γάλατα
,	TokenNameCOMMA	
"γαλατ"	TokenNameStringLiteral	γαλατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"γαλάκτων"	TokenNameStringLiteral	γαλάκτων
,	TokenNameCOMMA	
"γαλακτ"	TokenNameStringLiteral	γαλακτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAdjectives	TokenNameIdentifier	 test Adjectives
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// ending with -ής, -ές/-είς, -ή 	TokenNameCOMMENT_LINE	ending with -ής, -ές/-είς, -ή 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνεχής"	TokenNameStringLiteral	συνεχής
,	TokenNameCOMMA	
"συνεχ"	TokenNameStringLiteral	συνεχ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνεχούς"	TokenNameStringLiteral	συνεχούς
,	TokenNameCOMMA	
"συνεχ"	TokenNameStringLiteral	συνεχ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνεχή"	TokenNameStringLiteral	συνεχή
,	TokenNameCOMMA	
"συνεχ"	TokenNameStringLiteral	συνεχ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνεχών"	TokenNameStringLiteral	συνεχών
,	TokenNameCOMMA	
"συνεχ"	TokenNameStringLiteral	συνεχ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνεχείς"	TokenNameStringLiteral	συνεχείς
,	TokenNameCOMMA	
"συνεχ"	TokenNameStringLiteral	συνεχ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνεχές"	TokenNameStringLiteral	συνεχές
,	TokenNameCOMMA	
"συνεχ"	TokenNameStringLiteral	συνεχ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -ης, -ες/-εις, -η 	TokenNameCOMMENT_LINE	ending with -ης, -ες/-εις, -η 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνήθης"	TokenNameStringLiteral	συνήθης
,	TokenNameCOMMA	
"συνηθ"	TokenNameStringLiteral	συνηθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνήθους"	TokenNameStringLiteral	συνήθους
,	TokenNameCOMMA	
"συνηθ"	TokenNameStringLiteral	συνηθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνήθη"	TokenNameStringLiteral	συνήθη
,	TokenNameCOMMA	
"συνηθ"	TokenNameStringLiteral	συνηθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note: doesn't conflate 	TokenNameCOMMENT_LINE	note: doesn't conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνήθεις"	TokenNameStringLiteral	συνήθεις
,	TokenNameCOMMA	
"συν"	TokenNameStringLiteral	συν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"συνήθων"	TokenNameStringLiteral	συνήθων
,	TokenNameCOMMA	
"συνηθ"	TokenNameStringLiteral	συνηθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"σύνηθες"	TokenNameStringLiteral	σύνηθες
,	TokenNameCOMMA	
"συνηθ"	TokenNameStringLiteral	συνηθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ending with -υς, -υ/-εις, -ια 	TokenNameCOMMENT_LINE	ending with -υς, -υ/-εις, -ια 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθύς"	TokenNameStringLiteral	βαθύς
,	TokenNameCOMMA	
"βαθ"	TokenNameStringLiteral	βαθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθέος"	TokenNameStringLiteral	βαθέος
,	TokenNameCOMMA	
"βαθε"	TokenNameStringLiteral	βαθε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθύ"	TokenNameStringLiteral	βαθύ
,	TokenNameCOMMA	
"βαθ"	TokenNameStringLiteral	βαθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθείς"	TokenNameStringLiteral	βαθείς
,	TokenNameCOMMA	
"βαθ"	TokenNameStringLiteral	βαθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθέων"	TokenNameStringLiteral	βαθέων
,	TokenNameCOMMA	
"βαθ"	TokenNameStringLiteral	βαθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθιά"	TokenNameStringLiteral	βαθιά
,	TokenNameCOMMA	
"βαθ"	TokenNameStringLiteral	βαθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθιάς"	TokenNameStringLiteral	βαθιάς
,	TokenNameCOMMA	
"βαθι"	TokenNameStringLiteral	βαθι
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθιές"	TokenNameStringLiteral	βαθιές
,	TokenNameCOMMA	
"βαθι"	TokenNameStringLiteral	βαθι
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθιών"	TokenNameStringLiteral	βαθιών
,	TokenNameCOMMA	
"βαθ"	TokenNameStringLiteral	βαθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"βαθέα"	TokenNameStringLiteral	βαθέα
,	TokenNameCOMMA	
"βαθε"	TokenNameStringLiteral	βαθε
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// comparative/superlative 	TokenNameCOMMENT_LINE	comparative/superlative 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ψηλός"	TokenNameStringLiteral	ψηλός
,	TokenNameCOMMA	
"ψηλ"	TokenNameStringLiteral	ψηλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ψηλότερος"	TokenNameStringLiteral	ψηλότερος
,	TokenNameCOMMA	
"ψηλ"	TokenNameStringLiteral	ψηλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ψηλότατος"	TokenNameStringLiteral	ψηλότατος
,	TokenNameCOMMA	
"ψηλ"	TokenNameStringLiteral	ψηλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ωραίος"	TokenNameStringLiteral	ωραίος
,	TokenNameCOMMA	
"ωραι"	TokenNameStringLiteral	ωραι
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ωραιότερος"	TokenNameStringLiteral	ωραιότερος
,	TokenNameCOMMA	
"ωραι"	TokenNameStringLiteral	ωραι
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ωραιότατος"	TokenNameStringLiteral	ωραιότατος
,	TokenNameCOMMA	
"ωραι"	TokenNameStringLiteral	ωραι
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"επιεικής"	TokenNameStringLiteral	επιεικής
,	TokenNameCOMMA	
"επιεικ"	TokenNameStringLiteral	επιεικ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"επιεικέστερος"	TokenNameStringLiteral	επιεικέστερος
,	TokenNameCOMMA	
"επιεικ"	TokenNameStringLiteral	επιεικ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"επιεικέστατος"	TokenNameStringLiteral	επιεικέστατος
,	TokenNameCOMMA	
"επιεικ"	TokenNameStringLiteral	επιεικ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVerbs	TokenNameIdentifier	 test Verbs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// note, past/present verb stems will not conflate (from the paper) 	TokenNameCOMMENT_LINE	note, past/present verb stems will not conflate (from the paper) 
//-ω,-α/-.ω,-.α 	TokenNameCOMMENT_LINE	-ω,-α/-.ω,-.α 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορίζω"	TokenNameStringLiteral	ορίζω
,	TokenNameCOMMA	
"οριζ"	TokenNameStringLiteral	οριζ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"όριζα"	TokenNameStringLiteral	όριζα
,	TokenNameCOMMA	
"οριζ"	TokenNameStringLiteral	οριζ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"όριζε"	TokenNameStringLiteral	όριζε
,	TokenNameCOMMA	
"οριζ"	TokenNameStringLiteral	οριζ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορίζοντας"	TokenNameStringLiteral	ορίζοντας
,	TokenNameCOMMA	
"οριζ"	TokenNameStringLiteral	οριζ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορίζομαι"	TokenNameStringLiteral	ορίζομαι
,	TokenNameCOMMA	
"οριζ"	TokenNameStringLiteral	οριζ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"οριζόμουν"	TokenNameStringLiteral	οριζόμουν
,	TokenNameCOMMA	
"οριζ"	TokenNameStringLiteral	οριζ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορίζεσαι"	TokenNameStringLiteral	ορίζεσαι
,	TokenNameCOMMA	
"οριζ"	TokenNameStringLiteral	οριζ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"όρισα"	TokenNameStringLiteral	όρισα
,	TokenNameCOMMA	
"ορισ"	TokenNameStringLiteral	ορισ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορίσω"	TokenNameStringLiteral	ορίσω
,	TokenNameCOMMA	
"ορισ"	TokenNameStringLiteral	ορισ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"όρισε"	TokenNameStringLiteral	όρισε
,	TokenNameCOMMA	
"ορισ"	TokenNameStringLiteral	ορισ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορίσει"	TokenNameStringLiteral	ορίσει
,	TokenNameCOMMA	
"ορισ"	TokenNameStringLiteral	ορισ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορίστηκα"	TokenNameStringLiteral	ορίστηκα
,	TokenNameCOMMA	
"οριστ"	TokenNameStringLiteral	οριστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"οριστώ"	TokenNameStringLiteral	οριστώ
,	TokenNameCOMMA	
"οριστ"	TokenNameStringLiteral	οριστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"οριστείς"	TokenNameStringLiteral	οριστείς
,	TokenNameCOMMA	
"οριστ"	TokenNameStringLiteral	οριστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"οριστεί"	TokenNameStringLiteral	οριστεί
,	TokenNameCOMMA	
"οριστ"	TokenNameStringLiteral	οριστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορισμένο"	TokenNameStringLiteral	ορισμένο
,	TokenNameCOMMA	
"ορισμεν"	TokenNameStringLiteral	ορισμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορισμένη"	TokenNameStringLiteral	ορισμένη
,	TokenNameCOMMA	
"ορισμεν"	TokenNameStringLiteral	ορισμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ορισμένος"	TokenNameStringLiteral	ορισμένος
,	TokenNameCOMMA	
"ορισμεν"	TokenNameStringLiteral	ορισμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ω,-α/-ξω,-ξα 	TokenNameCOMMENT_LINE	-ω,-α/-ξω,-ξα 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοίγω"	TokenNameStringLiteral	ανοίγω
,	TokenNameCOMMA	
"ανοιγ"	TokenNameStringLiteral	ανοιγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"άνοιγα"	TokenNameStringLiteral	άνοιγα
,	TokenNameCOMMA	
"ανοιγ"	TokenNameStringLiteral	ανοιγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"άνοιγε"	TokenNameStringLiteral	άνοιγε
,	TokenNameCOMMA	
"ανοιγ"	TokenNameStringLiteral	ανοιγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοίγοντας"	TokenNameStringLiteral	ανοίγοντας
,	TokenNameCOMMA	
"ανοιγ"	TokenNameStringLiteral	ανοιγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοίγομαι"	TokenNameStringLiteral	ανοίγομαι
,	TokenNameCOMMA	
"ανοιγ"	TokenNameStringLiteral	ανοιγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοιγόμουν"	TokenNameStringLiteral	ανοιγόμουν
,	TokenNameCOMMA	
"ανοιγ"	TokenNameStringLiteral	ανοιγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"άνοιξα"	TokenNameStringLiteral	άνοιξα
,	TokenNameCOMMA	
"ανοιξ"	TokenNameStringLiteral	ανοιξ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοίξω"	TokenNameStringLiteral	ανοίξω
,	TokenNameCOMMA	
"ανοιξ"	TokenNameStringLiteral	ανοιξ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"άνοιξε"	TokenNameStringLiteral	άνοιξε
,	TokenNameCOMMA	
"ανοιξ"	TokenNameStringLiteral	ανοιξ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοίξει"	TokenNameStringLiteral	ανοίξει
,	TokenNameCOMMA	
"ανοιξ"	TokenNameStringLiteral	ανοιξ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοίχτηκα"	TokenNameStringLiteral	ανοίχτηκα
,	TokenNameCOMMA	
"ανοιχτ"	TokenNameStringLiteral	ανοιχτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοιχτώ"	TokenNameStringLiteral	ανοιχτώ
,	TokenNameCOMMA	
"ανοιχτ"	TokenNameStringLiteral	ανοιχτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοίχτηκα"	TokenNameStringLiteral	ανοίχτηκα
,	TokenNameCOMMA	
"ανοιχτ"	TokenNameStringLiteral	ανοιχτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοιχτείς"	TokenNameStringLiteral	ανοιχτείς
,	TokenNameCOMMA	
"ανοιχτ"	TokenNameStringLiteral	ανοιχτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοιχτεί"	TokenNameStringLiteral	ανοιχτεί
,	TokenNameCOMMA	
"ανοιχτ"	TokenNameStringLiteral	ανοιχτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ανοίξου"	TokenNameStringLiteral	ανοίξου
,	TokenNameCOMMA	
"ανοιξ"	TokenNameStringLiteral	ανοιξ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-ώ/-άω,-ούσα/-άσω,-ασα 	TokenNameCOMMENT_LINE	-ώ/-άω,-ούσα/-άσω,-ασα 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περνώ"	TokenNameStringLiteral	περνώ
,	TokenNameCOMMA	
"περν"	TokenNameStringLiteral	περν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περνάω"	TokenNameStringLiteral	περνάω
,	TokenNameCOMMA	
"περν"	TokenNameStringLiteral	περν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περνούσα"	TokenNameStringLiteral	περνούσα
,	TokenNameCOMMA	
"περν"	TokenNameStringLiteral	περν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέρναγα"	TokenNameStringLiteral	πέρναγα
,	TokenNameCOMMA	
"περν"	TokenNameStringLiteral	περν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέρνα"	TokenNameStringLiteral	πέρνα
,	TokenNameCOMMA	
"περν"	TokenNameStringLiteral	περν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περνώντας"	TokenNameStringLiteral	περνώντας
,	TokenNameCOMMA	
"περν"	TokenNameStringLiteral	περν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέρασα"	TokenNameStringLiteral	πέρασα
,	TokenNameCOMMA	
"περασ"	TokenNameStringLiteral	περασ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περάσω"	TokenNameStringLiteral	περάσω
,	TokenNameCOMMA	
"περασ"	TokenNameStringLiteral	περασ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέρασε"	TokenNameStringLiteral	πέρασε
,	TokenNameCOMMA	
"περασ"	TokenNameStringLiteral	περασ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περάσει"	TokenNameStringLiteral	περάσει
,	TokenNameCOMMA	
"περασ"	TokenNameStringLiteral	περασ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περνιέμαι"	TokenNameStringLiteral	περνιέμαι
,	TokenNameCOMMA	
"περν"	TokenNameStringLiteral	περν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περνιόμουν"	TokenNameStringLiteral	περνιόμουν
,	TokenNameCOMMA	
"περν"	TokenNameStringLiteral	περν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περάστηκα"	TokenNameStringLiteral	περάστηκα
,	TokenNameCOMMA	
"περαστ"	TokenNameStringLiteral	περαστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περαστώ"	TokenNameStringLiteral	περαστώ
,	TokenNameCOMMA	
"περαστ"	TokenNameStringLiteral	περαστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περαστείς"	TokenNameStringLiteral	περαστείς
,	TokenNameCOMMA	
"περαστ"	TokenNameStringLiteral	περαστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περαστεί"	TokenNameStringLiteral	περαστεί
,	TokenNameCOMMA	
"περαστ"	TokenNameStringLiteral	περαστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περασμένο"	TokenNameStringLiteral	περασμένο
,	TokenNameCOMMA	
"περασμεν"	TokenNameStringLiteral	περασμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περασμένη"	TokenNameStringLiteral	περασμένη
,	TokenNameCOMMA	
"περασμεν"	TokenNameStringLiteral	περασμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"περασμένος"	TokenNameStringLiteral	περασμένος
,	TokenNameCOMMA	
"περασμεν"	TokenNameStringLiteral	περασμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ώ/-άω,-ούσα/-άξω,-αξα 	TokenNameCOMMENT_LINE	-ώ/-άω,-ούσα/-άξω,-αξα 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πετώ"	TokenNameStringLiteral	πετώ
,	TokenNameCOMMA	
"πετ"	TokenNameStringLiteral	πετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πετάω"	TokenNameStringLiteral	πετάω
,	TokenNameCOMMA	
"πετ"	TokenNameStringLiteral	πετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πετούσα"	TokenNameStringLiteral	πετούσα
,	TokenNameCOMMA	
"πετ"	TokenNameStringLiteral	πετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέταγα"	TokenNameStringLiteral	πέταγα
,	TokenNameCOMMA	
"πετ"	TokenNameStringLiteral	πετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέτα"	TokenNameStringLiteral	πέτα
,	TokenNameCOMMA	
"πετ"	TokenNameStringLiteral	πετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πετώντας"	TokenNameStringLiteral	πετώντας
,	TokenNameCOMMA	
"πετ"	TokenNameStringLiteral	πετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πετιέμαι"	TokenNameStringLiteral	πετιέμαι
,	TokenNameCOMMA	
"πετ"	TokenNameStringLiteral	πετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πετιόμουν"	TokenNameStringLiteral	πετιόμουν
,	TokenNameCOMMA	
"πετ"	TokenNameStringLiteral	πετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέταξα"	TokenNameStringLiteral	πέταξα
,	TokenNameCOMMA	
"πεταξ"	TokenNameStringLiteral	πεταξ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πετάξω"	TokenNameStringLiteral	πετάξω
,	TokenNameCOMMA	
"πεταξ"	TokenNameStringLiteral	πεταξ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πέταξε"	TokenNameStringLiteral	πέταξε
,	TokenNameCOMMA	
"πεταξ"	TokenNameStringLiteral	πεταξ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πετάξει"	TokenNameStringLiteral	πετάξει
,	TokenNameCOMMA	
"πεταξ"	TokenNameStringLiteral	πεταξ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πετάχτηκα"	TokenNameStringLiteral	πετάχτηκα
,	TokenNameCOMMA	
"πεταχτ"	TokenNameStringLiteral	πεταχτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πεταχτώ"	TokenNameStringLiteral	πεταχτώ
,	TokenNameCOMMA	
"πεταχτ"	TokenNameStringLiteral	πεταχτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πεταχτείς"	TokenNameStringLiteral	πεταχτείς
,	TokenNameCOMMA	
"πεταχτ"	TokenNameStringLiteral	πεταχτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πεταχτεί"	TokenNameStringLiteral	πεταχτεί
,	TokenNameCOMMA	
"πεταχτ"	TokenNameStringLiteral	πεταχτ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πεταμένο"	TokenNameStringLiteral	πεταμένο
,	TokenNameCOMMA	
"πεταμεν"	TokenNameStringLiteral	πεταμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πεταμένη"	TokenNameStringLiteral	πεταμένη
,	TokenNameCOMMA	
"πεταμεν"	TokenNameStringLiteral	πεταμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"πεταμένος"	TokenNameStringLiteral	πεταμένος
,	TokenNameCOMMA	
"πεταμεν"	TokenNameStringLiteral	πεταμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ώ/-άω,-ούσα / -έσω,-εσα 	TokenNameCOMMENT_LINE	-ώ/-άω,-ούσα / -έσω,-εσα 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλώ"	TokenNameStringLiteral	καλώ
,	TokenNameCOMMA	
"καλ"	TokenNameStringLiteral	καλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλούσα"	TokenNameStringLiteral	καλούσα
,	TokenNameCOMMA	
"καλ"	TokenNameStringLiteral	καλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλείς"	TokenNameStringLiteral	καλείς
,	TokenNameCOMMA	
"καλ"	TokenNameStringLiteral	καλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλώντας"	TokenNameStringLiteral	καλώντας
,	TokenNameCOMMA	
"καλ"	TokenNameStringLiteral	καλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλούμαι"	TokenNameStringLiteral	καλούμαι
,	TokenNameCOMMA	
"καλ"	TokenNameStringLiteral	καλ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pass. imperfect /imp. progressive doesnt conflate 	TokenNameCOMMENT_LINE	pass. imperfect /imp. progressive doesnt conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλούμουν"	TokenNameStringLiteral	καλούμουν
,	TokenNameCOMMA	
"καλουμ"	TokenNameStringLiteral	καλουμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλείσαι"	TokenNameStringLiteral	καλείσαι
,	TokenNameCOMMA	
"καλεισα"	TokenNameStringLiteral	καλεισα
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλέστηκα"	TokenNameStringLiteral	καλέστηκα
,	TokenNameCOMMA	
"καλεστ"	TokenNameStringLiteral	καλεστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλεστώ"	TokenNameStringLiteral	καλεστώ
,	TokenNameCOMMA	
"καλεστ"	TokenNameStringLiteral	καλεστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλεστείς"	TokenNameStringLiteral	καλεστείς
,	TokenNameCOMMA	
"καλεστ"	TokenNameStringLiteral	καλεστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλεστεί"	TokenNameStringLiteral	καλεστεί
,	TokenNameCOMMA	
"καλεστ"	TokenNameStringLiteral	καλεστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλεσμένο"	TokenNameStringLiteral	καλεσμένο
,	TokenNameCOMMA	
"καλεσμεν"	TokenNameStringLiteral	καλεσμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλεσμένη"	TokenNameStringLiteral	καλεσμένη
,	TokenNameCOMMA	
"καλεσμεν"	TokenNameStringLiteral	καλεσμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καλεσμένος"	TokenNameStringLiteral	καλεσμένος
,	TokenNameCOMMA	
"καλεσμεν"	TokenNameStringLiteral	καλεσμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορώ"	TokenNameStringLiteral	φορώ
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φοράω"	TokenNameStringLiteral	φοράω
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορούσα"	TokenNameStringLiteral	φορούσα
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φόραγα"	TokenNameStringLiteral	φόραγα
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φόρα"	TokenNameStringLiteral	φόρα
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορώντας"	TokenNameStringLiteral	φορώντας
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φοριέμαι"	TokenNameStringLiteral	φοριέμαι
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φοριόμουν"	TokenNameStringLiteral	φοριόμουν
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φοριέσαι"	TokenNameStringLiteral	φοριέσαι
,	TokenNameCOMMA	
"φορ"	TokenNameStringLiteral	φορ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φόρεσα"	TokenNameStringLiteral	φόρεσα
,	TokenNameCOMMA	
"φορεσ"	TokenNameStringLiteral	φορεσ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορέσω"	TokenNameStringLiteral	φορέσω
,	TokenNameCOMMA	
"φορεσ"	TokenNameStringLiteral	φορεσ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φόρεσε"	TokenNameStringLiteral	φόρεσε
,	TokenNameCOMMA	
"φορεσ"	TokenNameStringLiteral	φορεσ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορέσει"	TokenNameStringLiteral	φορέσει
,	TokenNameCOMMA	
"φορεσ"	TokenNameStringLiteral	φορεσ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορέθηκα"	TokenNameStringLiteral	φορέθηκα
,	TokenNameCOMMA	
"φορεθ"	TokenNameStringLiteral	φορεθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορεθώ"	TokenNameStringLiteral	φορεθώ
,	TokenNameCOMMA	
"φορεθ"	TokenNameStringLiteral	φορεθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορεθείς"	TokenNameStringLiteral	φορεθείς
,	TokenNameCOMMA	
"φορεθ"	TokenNameStringLiteral	φορεθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορεθεί"	TokenNameStringLiteral	φορεθεί
,	TokenNameCOMMA	
"φορεθ"	TokenNameStringLiteral	φορεθ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορεμένο"	TokenNameStringLiteral	φορεμένο
,	TokenNameCOMMA	
"φορεμεν"	TokenNameStringLiteral	φορεμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορεμένη"	TokenNameStringLiteral	φορεμένη
,	TokenNameCOMMA	
"φορεμεν"	TokenNameStringLiteral	φορεμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"φορεμένος"	TokenNameStringLiteral	φορεμένος
,	TokenNameCOMMA	
"φορεμεν"	TokenNameStringLiteral	φορεμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -ώ/-άω,-ούσα / -ήσω,-ησα 	TokenNameCOMMENT_LINE	-ώ/-άω,-ούσα / -ήσω,-ησα 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατώ"	TokenNameStringLiteral	κρατώ
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατάω"	TokenNameStringLiteral	κρατάω
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατούσα"	TokenNameStringLiteral	κρατούσα
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κράταγα"	TokenNameStringLiteral	κράταγα
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κράτα"	TokenNameStringLiteral	κράτα
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατώντας"	TokenNameStringLiteral	κρατώντας
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κράτησα"	TokenNameStringLiteral	κράτησα
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατήσω"	TokenNameStringLiteral	κρατήσω
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κράτησε"	TokenNameStringLiteral	κράτησε
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατήσει"	TokenNameStringLiteral	κρατήσει
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατούμαι"	TokenNameStringLiteral	κρατούμαι
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατιέμαι"	TokenNameStringLiteral	κρατιέμαι
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this imperfect form doesnt conflate 	TokenNameCOMMENT_LINE	this imperfect form doesnt conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατούμουν"	TokenNameStringLiteral	κρατούμουν
,	TokenNameCOMMA	
"κρατουμ"	TokenNameStringLiteral	κρατουμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατιόμουν"	TokenNameStringLiteral	κρατιόμουν
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this imp. prog form doesnt conflate 	TokenNameCOMMENT_LINE	this imp. prog form doesnt conflate 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατείσαι"	TokenNameStringLiteral	κρατείσαι
,	TokenNameCOMMA	
"κρατεισα"	TokenNameStringLiteral	κρατεισα
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατήθηκα"	TokenNameStringLiteral	κρατήθηκα
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατηθώ"	TokenNameStringLiteral	κρατηθώ
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατηθείς"	TokenNameStringLiteral	κρατηθείς
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατηθεί"	TokenNameStringLiteral	κρατηθεί
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατήσου"	TokenNameStringLiteral	κρατήσου
,	TokenNameCOMMA	
"κρατ"	TokenNameStringLiteral	κρατ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατημένο"	TokenNameStringLiteral	κρατημένο
,	TokenNameCOMMA	
"κρατημεν"	TokenNameStringLiteral	κρατημεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατημένη"	TokenNameStringLiteral	κρατημένη
,	TokenNameCOMMA	
"κρατημεν"	TokenNameStringLiteral	κρατημεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κρατημένος"	TokenNameStringLiteral	κρατημένος
,	TokenNameCOMMA	
"κρατημεν"	TokenNameStringLiteral	κρατημεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -.μαι,-.μουν / -.ώ,-.ηκα 	TokenNameCOMMENT_LINE	-.μαι,-.μουν / -.ώ,-.ηκα 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμάμαι"	TokenNameStringLiteral	κοιμάμαι
,	TokenNameCOMMA	
"κοιμ"	TokenNameStringLiteral	κοιμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμόμουν"	TokenNameStringLiteral	κοιμόμουν
,	TokenNameCOMMA	
"κοιμ"	TokenNameStringLiteral	κοιμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμάσαι"	TokenNameStringLiteral	κοιμάσαι
,	TokenNameCOMMA	
"κοιμ"	TokenNameStringLiteral	κοιμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμήθηκα"	TokenNameStringLiteral	κοιμήθηκα
,	TokenNameCOMMA	
"κοιμ"	TokenNameStringLiteral	κοιμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμηθώ"	TokenNameStringLiteral	κοιμηθώ
,	TokenNameCOMMA	
"κοιμ"	TokenNameStringLiteral	κοιμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμήσου"	TokenNameStringLiteral	κοιμήσου
,	TokenNameCOMMA	
"κοιμ"	TokenNameStringLiteral	κοιμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμηθεί"	TokenNameStringLiteral	κοιμηθεί
,	TokenNameCOMMA	
"κοιμ"	TokenNameStringLiteral	κοιμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμισμένο"	TokenNameStringLiteral	κοιμισμένο
,	TokenNameCOMMA	
"κοιμισμεν"	TokenNameStringLiteral	κοιμισμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμισμένη"	TokenNameStringLiteral	κοιμισμένη
,	TokenNameCOMMA	
"κοιμισμεν"	TokenNameStringLiteral	κοιμισμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"κοιμισμένος"	TokenNameStringLiteral	κοιμισμένος
,	TokenNameCOMMA	
"κοιμισμεν"	TokenNameStringLiteral	κοιμισμεν
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExceptions	TokenNameIdentifier	 test Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καθεστώτα"	TokenNameStringLiteral	καθεστώτα
,	TokenNameCOMMA	
"καθεστ"	TokenNameStringLiteral	καθεστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καθεστώτος"	TokenNameStringLiteral	καθεστώτος
,	TokenNameCOMMA	
"καθεστ"	TokenNameStringLiteral	καθεστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καθεστώς"	TokenNameStringLiteral	καθεστώς
,	TokenNameCOMMA	
"καθεστ"	TokenNameStringLiteral	καθεστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"καθεστώτων"	TokenNameStringLiteral	καθεστώτων
,	TokenNameCOMMA	
"καθεστ"	TokenNameStringLiteral	καθεστ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"χουμε"	TokenNameStringLiteral	χουμε
,	TokenNameCOMMA	
"χουμ"	TokenNameStringLiteral	χουμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"χουμ"	TokenNameStringLiteral	χουμ
,	TokenNameCOMMA	
"χουμ"	TokenNameStringLiteral	χουμ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"υποταγεσ"	TokenNameStringLiteral	υποταγεσ
,	TokenNameCOMMA	
"υποταγ"	TokenNameStringLiteral	υποταγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"υποταγ"	TokenNameStringLiteral	υποταγ
,	TokenNameCOMMA	
"υποταγ"	TokenNameStringLiteral	υποταγ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"εμετε"	TokenNameStringLiteral	εμετε
,	TokenNameCOMMA	
"εμετ"	TokenNameStringLiteral	εμετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"εμετ"	TokenNameStringLiteral	εμετ
,	TokenNameCOMMA	
"εμετ"	TokenNameStringLiteral	εμετ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αρχοντασ"	TokenNameStringLiteral	αρχοντασ
,	TokenNameCOMMA	
"αρχοντ"	TokenNameStringLiteral	αρχοντ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"αρχοντων"	TokenNameStringLiteral	αρχοντων
,	TokenNameCOMMA	
"αρχοντ"	TokenNameStringLiteral	αρχοντ
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
GreekStemFilter	TokenNameIdentifier	 Greek Stem Filter
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
