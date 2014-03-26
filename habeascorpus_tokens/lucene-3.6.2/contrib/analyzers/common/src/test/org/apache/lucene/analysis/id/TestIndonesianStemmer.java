package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
id	TokenNameIdentifier	 id
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
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
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
/** * Tests {@link IndonesianStemmer} */	TokenNameCOMMENT_JAVADOC	 Tests {@link IndonesianStemmer} 
public	TokenNamepublic	
class	TokenNameclass	
TestIndonesianStemmer	TokenNameIdentifier	 Test Indonesian Stemmer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
/* full stemming, no stopwords */	TokenNameCOMMENT_BLOCK	 full stemming, no stopwords 
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
public	TokenNamepublic	
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
IndonesianStemFilter	TokenNameIdentifier	 Indonesian Stem Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Some examples from the paper */	TokenNameCOMMENT_JAVADOC	 Some examples from the paper 
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
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bukukah"	TokenNameStringLiteral	bukukah
,	TokenNameCOMMA	
"buku"	TokenNameStringLiteral	buku
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"adalah"	TokenNameStringLiteral	adalah
,	TokenNameCOMMA	
"ada"	TokenNameStringLiteral	ada
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bukupun"	TokenNameStringLiteral	bukupun
,	TokenNameCOMMA	
"buku"	TokenNameStringLiteral	buku
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bukuku"	TokenNameStringLiteral	bukuku
,	TokenNameCOMMA	
"buku"	TokenNameStringLiteral	buku
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bukumu"	TokenNameStringLiteral	bukumu
,	TokenNameCOMMA	
"buku"	TokenNameStringLiteral	buku
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bukunya"	TokenNameStringLiteral	bukunya
,	TokenNameCOMMA	
"buku"	TokenNameStringLiteral	buku
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"mengukur"	TokenNameStringLiteral	mengukur
,	TokenNameCOMMA	
"ukur"	TokenNameStringLiteral	ukur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"menyapu"	TokenNameStringLiteral	menyapu
,	TokenNameCOMMA	
"sapu"	TokenNameStringLiteral	sapu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"menduga"	TokenNameStringLiteral	menduga
,	TokenNameCOMMA	
"duga"	TokenNameStringLiteral	duga
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"menuduh"	TokenNameStringLiteral	menuduh
,	TokenNameCOMMA	
"uduh"	TokenNameStringLiteral	uduh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"membaca"	TokenNameStringLiteral	membaca
,	TokenNameCOMMA	
"baca"	TokenNameStringLiteral	baca
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"merusak"	TokenNameStringLiteral	merusak
,	TokenNameCOMMA	
"rusak"	TokenNameStringLiteral	rusak
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"pengukur"	TokenNameStringLiteral	pengukur
,	TokenNameCOMMA	
"ukur"	TokenNameStringLiteral	ukur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"penyapu"	TokenNameStringLiteral	penyapu
,	TokenNameCOMMA	
"sapu"	TokenNameStringLiteral	sapu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"penduga"	TokenNameStringLiteral	penduga
,	TokenNameCOMMA	
"duga"	TokenNameStringLiteral	duga
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"pembaca"	TokenNameStringLiteral	pembaca
,	TokenNameCOMMA	
"baca"	TokenNameStringLiteral	baca
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"diukur"	TokenNameStringLiteral	diukur
,	TokenNameCOMMA	
"ukur"	TokenNameStringLiteral	ukur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tersapu"	TokenNameStringLiteral	tersapu
,	TokenNameCOMMA	
"sapu"	TokenNameStringLiteral	sapu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kekasih"	TokenNameStringLiteral	kekasih
,	TokenNameCOMMA	
"kasih"	TokenNameStringLiteral	kasih
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"berlari"	TokenNameStringLiteral	berlari
,	TokenNameCOMMA	
"lari"	TokenNameStringLiteral	lari
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"belajar"	TokenNameStringLiteral	belajar
,	TokenNameCOMMA	
"ajar"	TokenNameStringLiteral	ajar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bekerja"	TokenNameStringLiteral	bekerja
,	TokenNameCOMMA	
"kerja"	TokenNameStringLiteral	kerja
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"perjelas"	TokenNameStringLiteral	perjelas
,	TokenNameCOMMA	
"jelas"	TokenNameStringLiteral	jelas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"pelajar"	TokenNameStringLiteral	pelajar
,	TokenNameCOMMA	
"ajar"	TokenNameStringLiteral	ajar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"pekerja"	TokenNameStringLiteral	pekerja
,	TokenNameCOMMA	
"kerja"	TokenNameStringLiteral	kerja
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tarikkan"	TokenNameStringLiteral	tarikkan
,	TokenNameCOMMA	
"tarik"	TokenNameStringLiteral	tarik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ambilkan"	TokenNameStringLiteral	ambilkan
,	TokenNameCOMMA	
"ambil"	TokenNameStringLiteral	ambil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"mengambilkan"	TokenNameStringLiteral	mengambilkan
,	TokenNameCOMMA	
"ambil"	TokenNameStringLiteral	ambil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"makanan"	TokenNameStringLiteral	makanan
,	TokenNameCOMMA	
"makan"	TokenNameStringLiteral	makan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"janjian"	TokenNameStringLiteral	janjian
,	TokenNameCOMMA	
"janji"	TokenNameStringLiteral	janji
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"perjanjian"	TokenNameStringLiteral	perjanjian
,	TokenNameCOMMA	
"janji"	TokenNameStringLiteral	janji
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"tandai"	TokenNameStringLiteral	tandai
,	TokenNameCOMMA	
"tanda"	TokenNameStringLiteral	tanda
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"dapati"	TokenNameStringLiteral	dapati
,	TokenNameCOMMA	
"dapat"	TokenNameStringLiteral	dapat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"mendapati"	TokenNameStringLiteral	mendapati
,	TokenNameCOMMA	
"dapat"	TokenNameStringLiteral	dapat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"pantai"	TokenNameStringLiteral	pantai
,	TokenNameCOMMA	
"panta"	TokenNameStringLiteral	panta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Some detailed analysis examples (that might not be the best) */	TokenNameCOMMENT_JAVADOC	 Some detailed analysis examples (that might not be the best) 
public	TokenNamepublic	
void	TokenNamevoid	
testIRExamples	TokenNameIdentifier	 test IR Examples
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"penyalahgunaan"	TokenNameStringLiteral	penyalahgunaan
,	TokenNameCOMMA	
"salahguna"	TokenNameStringLiteral	salahguna
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"menyalahgunakan"	TokenNameStringLiteral	menyalahgunakan
,	TokenNameCOMMA	
"salahguna"	TokenNameStringLiteral	salahguna
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"disalahgunakan"	TokenNameStringLiteral	disalahgunakan
,	TokenNameCOMMA	
"salahguna"	TokenNameStringLiteral	salahguna
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"pertanggungjawaban"	TokenNameStringLiteral	pertanggungjawaban
,	TokenNameCOMMA	
"tanggungjawab"	TokenNameStringLiteral	tanggungjawab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"mempertanggungjawabkan"	TokenNameStringLiteral	mempertanggungjawabkan
,	TokenNameCOMMA	
"tanggungjawab"	TokenNameStringLiteral	tanggungjawab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"dipertanggungjawabkan"	TokenNameStringLiteral	dipertanggungjawabkan
,	TokenNameCOMMA	
"tanggungjawab"	TokenNameStringLiteral	tanggungjawab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"pelaksanaan"	TokenNameStringLiteral	pelaksanaan
,	TokenNameCOMMA	
"laksana"	TokenNameStringLiteral	laksana
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"pelaksana"	TokenNameStringLiteral	pelaksana
,	TokenNameCOMMA	
"laksana"	TokenNameStringLiteral	laksana
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"melaksanakan"	TokenNameStringLiteral	melaksanakan
,	TokenNameCOMMA	
"laksana"	TokenNameStringLiteral	laksana
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"dilaksanakan"	TokenNameStringLiteral	dilaksanakan
,	TokenNameCOMMA	
"laksana"	TokenNameStringLiteral	laksana
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"melibatkan"	TokenNameStringLiteral	melibatkan
,	TokenNameCOMMA	
"libat"	TokenNameStringLiteral	libat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"terlibat"	TokenNameStringLiteral	terlibat
,	TokenNameCOMMA	
"libat"	TokenNameStringLiteral	libat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"penculikan"	TokenNameStringLiteral	penculikan
,	TokenNameCOMMA	
"culik"	TokenNameStringLiteral	culik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"menculik"	TokenNameStringLiteral	menculik
,	TokenNameCOMMA	
"culik"	TokenNameStringLiteral	culik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"diculik"	TokenNameStringLiteral	diculik
,	TokenNameCOMMA	
"culik"	TokenNameStringLiteral	culik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"penculik"	TokenNameStringLiteral	penculik
,	TokenNameCOMMA	
"culik"	TokenNameStringLiteral	culik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"perubahan"	TokenNameStringLiteral	perubahan
,	TokenNameCOMMA	
"ubah"	TokenNameStringLiteral	ubah
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"peledakan"	TokenNameStringLiteral	peledakan
,	TokenNameCOMMA	
"ledak"	TokenNameStringLiteral	ledak
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"penanganan"	TokenNameStringLiteral	penanganan
,	TokenNameCOMMA	
"tangan"	TokenNameStringLiteral	tangan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kepolisian"	TokenNameStringLiteral	kepolisian
,	TokenNameCOMMA	
"polisi"	TokenNameStringLiteral	polisi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kenaikan"	TokenNameStringLiteral	kenaikan
,	TokenNameCOMMA	
"naik"	TokenNameStringLiteral	naik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bersenjata"	TokenNameStringLiteral	bersenjata
,	TokenNameCOMMA	
"senjata"	TokenNameStringLiteral	senjata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"penyelewengan"	TokenNameStringLiteral	penyelewengan
,	TokenNameCOMMA	
"seleweng"	TokenNameStringLiteral	seleweng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"kecelakaan"	TokenNameStringLiteral	kecelakaan
,	TokenNameCOMMA	
"celaka"	TokenNameStringLiteral	celaka
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* inflectional-only stemming */	TokenNameCOMMENT_BLOCK	 inflectional-only stemming 
Analyzer	TokenNameIdentifier	 Analyzer
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
IndonesianStemFilter	TokenNameIdentifier	 Indonesian Stem Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Test stemming only inflectional suffixes */	TokenNameCOMMENT_JAVADOC	 Test stemming only inflectional suffixes 
public	TokenNamepublic	
void	TokenNamevoid	
testInflectionalOnly	TokenNameIdentifier	 test Inflectional Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
"bukunya"	TokenNameStringLiteral	bukunya
,	TokenNameCOMMA	
"buku"	TokenNameStringLiteral	buku
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
"bukukah"	TokenNameStringLiteral	bukukah
,	TokenNameCOMMA	
"buku"	TokenNameStringLiteral	buku
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
"bukunyakah"	TokenNameStringLiteral	bukunyakah
,	TokenNameCOMMA	
"buku"	TokenNameStringLiteral	buku
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
"dibukukannya"	TokenNameStringLiteral	dibukukannya
,	TokenNameCOMMA	
"dibukukan"	TokenNameStringLiteral	dibukukan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldntStem	TokenNameIdentifier	 test Shouldnt Stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bersenjata"	TokenNameStringLiteral	bersenjata
,	TokenNameCOMMA	
"senjata"	TokenNameStringLiteral	senjata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"bukukah"	TokenNameStringLiteral	bukukah
,	TokenNameCOMMA	
"buku"	TokenNameStringLiteral	buku
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"gigi"	TokenNameStringLiteral	gigi
,	TokenNameCOMMA	
"gigi"	TokenNameStringLiteral	gigi
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
IndonesianStemFilter	TokenNameIdentifier	 Indonesian Stem Filter
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
