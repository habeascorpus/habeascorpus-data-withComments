package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
UAX29URLEmailAnalyzer	TokenNameIdentifier	 UA X29 URL Email Analyzer
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
public	TokenNamepublic	
class	TokenNameclass	
TestUAX29URLEmailAnalyzer	TokenNameIdentifier	 Test UA X29 URL Email Analyzer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
UAX29URLEmailAnalyzer	TokenNameIdentifier	 UA X29 URL Email Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testHugeDoc	TokenNameIdentifier	 test Huge Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
whitespace	TokenNameIdentifier	 whitespace
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
4094	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
whitespace	TokenNameIdentifier	 whitespace
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
whitespace	TokenNameIdentifier	 whitespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"testing 1234"	TokenNameStringLiteral	testing 1234
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"testing"	TokenNameStringLiteral	testing
,	TokenNameCOMMA	
"1234"	TokenNameStringLiteral	1234
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testArmenian	TokenNameIdentifier	 test Armenian
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"Վիքիպեդիայի 13 միլիոն հոդվածները (4,600` հայերեն վիքիպեդիայում) գրվել են կամավորների կողմից ու համարյա բոլոր հոդվածները կարող է խմբագրել ցանկաց մարդ ով կարող է բացել Վիքիպեդիայի կայքը։"	TokenNameStringLiteral	Վիքիպեդիայի 13 միլիոն հոդվածները (4,600` հայերեն վիքիպեդիայում) գրվել են կամավորների կողմից ու համարյա բոլոր հոդվածները կարող է խմբագրել ցանկաց մարդ ով կարող է բացել Վիքիպեդիայի կայքը։
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"վիքիպեդիայի"	TokenNameStringLiteral	վիքիպեդիայի
,	TokenNameCOMMA	
"13"	TokenNameStringLiteral	13
,	TokenNameCOMMA	
"միլիոն"	TokenNameStringLiteral	միլիոն
,	TokenNameCOMMA	
"հոդվածները"	TokenNameStringLiteral	հոդվածները
,	TokenNameCOMMA	
"4,600"	TokenNameStringLiteral	4,600
,	TokenNameCOMMA	
"հայերեն"	TokenNameStringLiteral	հայերեն
,	TokenNameCOMMA	
"վիքիպեդիայում"	TokenNameStringLiteral	վիքիպեդիայում
,	TokenNameCOMMA	
"գրվել"	TokenNameStringLiteral	գրվել
,	TokenNameCOMMA	
"են"	TokenNameStringLiteral	են
,	TokenNameCOMMA	
"կամավորների"	TokenNameStringLiteral	կամավորների
,	TokenNameCOMMA	
"կողմից"	TokenNameStringLiteral	կողմից
,	TokenNameCOMMA	
"ու"	TokenNameStringLiteral	ու
,	TokenNameCOMMA	
"համարյա"	TokenNameStringLiteral	համարյա
,	TokenNameCOMMA	
"բոլոր"	TokenNameStringLiteral	բոլոր
,	TokenNameCOMMA	
"հոդվածները"	TokenNameStringLiteral	հոդվածները
,	TokenNameCOMMA	
"կարող"	TokenNameStringLiteral	կարող
,	TokenNameCOMMA	
"է"	TokenNameStringLiteral	է
,	TokenNameCOMMA	
"խմբագրել"	TokenNameStringLiteral	խմբագրել
,	TokenNameCOMMA	
"ցանկաց"	TokenNameStringLiteral	ցանկաց
,	TokenNameCOMMA	
"մարդ"	TokenNameStringLiteral	մարդ
,	TokenNameCOMMA	
"ով"	TokenNameStringLiteral	ով
,	TokenNameCOMMA	
"կարող"	TokenNameStringLiteral	կարող
,	TokenNameCOMMA	
"է"	TokenNameStringLiteral	է
,	TokenNameCOMMA	
"բացել"	TokenNameStringLiteral	բացել
,	TokenNameCOMMA	
"վիքիպեդիայի"	TokenNameStringLiteral	վիքիպեդիայի
,	TokenNameCOMMA	
"կայքը"	TokenNameStringLiteral	կայքը
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAmharic	TokenNameIdentifier	 test Amharic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ዊኪፔድያ የባለ ብዙ ቋንቋ የተሟላ ትክክለኛና ነጻ መዝገበ ዕውቀት (ኢንሳይክሎፒዲያ) ነው። ማንኛውም"	TokenNameStringLiteral	ዊኪፔድያ የባለ ብዙ ቋንቋ የተሟላ ትክክለኛና ነጻ መዝገበ ዕውቀት (ኢንሳይክሎፒዲያ) ነው። ማንኛውም
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ዊኪፔድያ"	TokenNameStringLiteral	ዊኪፔድያ
,	TokenNameCOMMA	
"የባለ"	TokenNameStringLiteral	የባለ
,	TokenNameCOMMA	
"ብዙ"	TokenNameStringLiteral	ብዙ
,	TokenNameCOMMA	
"ቋንቋ"	TokenNameStringLiteral	ቋንቋ
,	TokenNameCOMMA	
"የተሟላ"	TokenNameStringLiteral	የተሟላ
,	TokenNameCOMMA	
"ትክክለኛና"	TokenNameStringLiteral	ትክክለኛና
,	TokenNameCOMMA	
"ነጻ"	TokenNameStringLiteral	ነጻ
,	TokenNameCOMMA	
"መዝገበ"	TokenNameStringLiteral	መዝገበ
,	TokenNameCOMMA	
"ዕውቀት"	TokenNameStringLiteral	ዕውቀት
,	TokenNameCOMMA	
"ኢንሳይክሎፒዲያ"	TokenNameStringLiteral	ኢንሳይክሎፒዲያ
,	TokenNameCOMMA	
"ነው"	TokenNameStringLiteral	ነው
,	TokenNameCOMMA	
"ማንኛውም"	TokenNameStringLiteral	ማንኛውም
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testArabic	TokenNameIdentifier	 test Arabic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"الفيلم الوثائقي الأول عن ويكيبيديا يسمى "الحقيقة بالأرقام: قصة ويكيبيديا" (بالإنجليزية: Truth in Numbers: The Wikipedia Story)، سيتم إطلاقه في 2008."	TokenNameStringLiteral	الفيلم الوثائقي الأول عن ويكيبيديا يسمى "الحقيقة بالأرقام: قصة ويكيبيديا" (بالإنجليزية: Truth in Numbers: The Wikipedia Story)، سيتم إطلاقه في 2008.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"الفيلم"	TokenNameStringLiteral	الفيلم
,	TokenNameCOMMA	
"الوثائقي"	TokenNameStringLiteral	الوثائقي
,	TokenNameCOMMA	
"الأول"	TokenNameStringLiteral	الأول
,	TokenNameCOMMA	
"عن"	TokenNameStringLiteral	عن
,	TokenNameCOMMA	
"ويكيبيديا"	TokenNameStringLiteral	ويكيبيديا
,	TokenNameCOMMA	
"يسمى"	TokenNameStringLiteral	يسمى
,	TokenNameCOMMA	
"الحقيقة"	TokenNameStringLiteral	الحقيقة
,	TokenNameCOMMA	
"بالأرقام"	TokenNameStringLiteral	بالأرقام
,	TokenNameCOMMA	
"قصة"	TokenNameStringLiteral	قصة
,	TokenNameCOMMA	
"ويكيبيديا"	TokenNameStringLiteral	ويكيبيديا
,	TokenNameCOMMA	
"بالإنجليزية"	TokenNameStringLiteral	بالإنجليزية
,	TokenNameCOMMA	
"truth"	TokenNameStringLiteral	truth
,	TokenNameCOMMA	
"numbers"	TokenNameStringLiteral	numbers
,	TokenNameCOMMA	
"wikipedia"	TokenNameStringLiteral	wikipedia
,	TokenNameCOMMA	
"story"	TokenNameStringLiteral	story
,	TokenNameCOMMA	
"سيتم"	TokenNameStringLiteral	سيتم
,	TokenNameCOMMA	
"إطلاقه"	TokenNameStringLiteral	إطلاقه
,	TokenNameCOMMA	
"في"	TokenNameStringLiteral	في
,	TokenNameCOMMA	
"2008"	TokenNameStringLiteral	2008
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAramaic	TokenNameIdentifier	 test Aramaic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ܘܝܩܝܦܕܝܐ (ܐܢܓܠܝܐ: Wikipedia) ܗܘ ܐܝܢܣܩܠܘܦܕܝܐ ܚܐܪܬܐ ܕܐܢܛܪܢܛ ܒܠܫܢ̈ܐ ܣܓܝܐ̈ܐ܂ ܫܡܗ ܐܬܐ ܡܢ ܡ̈ܠܬܐ ܕ"ܘܝܩܝ" ܘ"ܐܝܢܣܩܠܘܦܕܝܐ"܀"	TokenNameStringLiteral	ܘܝܩܝܦܕܝܐ (ܐܢܓܠܝܐ: Wikipedia) ܗܘ ܐܝܢܣܩܠܘܦܕܝܐ ܚܐܪܬܐ ܕܐܢܛܪܢܛ ܒܠܫܢ̈ܐ ܣܓܝܐ̈ܐ܂ ܫܡܗ ܐܬܐ ܡܢ ܡ̈ܠܬܐ ܕ"ܘܝܩܝ" ܘ"ܐܝܢܣܩܠܘܦܕܝܐ"܀
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ܘܝܩܝܦܕܝܐ"	TokenNameStringLiteral	ܘܝܩܝܦܕܝܐ
,	TokenNameCOMMA	
"ܐܢܓܠܝܐ"	TokenNameStringLiteral	ܐܢܓܠܝܐ
,	TokenNameCOMMA	
"wikipedia"	TokenNameStringLiteral	wikipedia
,	TokenNameCOMMA	
"ܗܘ"	TokenNameStringLiteral	ܗܘ
,	TokenNameCOMMA	
"ܐܝܢܣܩܠܘܦܕܝܐ"	TokenNameStringLiteral	ܐܝܢܣܩܠܘܦܕܝܐ
,	TokenNameCOMMA	
"ܚܐܪܬܐ"	TokenNameStringLiteral	ܚܐܪܬܐ
,	TokenNameCOMMA	
"ܕܐܢܛܪܢܛ"	TokenNameStringLiteral	ܕܐܢܛܪܢܛ
,	TokenNameCOMMA	
"ܒܠܫܢ̈ܐ"	TokenNameStringLiteral	ܒܠܫܢ̈ܐ
,	TokenNameCOMMA	
"ܣܓܝܐ̈ܐ"	TokenNameStringLiteral	ܣܓܝܐ̈ܐ
,	TokenNameCOMMA	
"ܫܡܗ"	TokenNameStringLiteral	ܫܡܗ
,	TokenNameCOMMA	
"ܐܬܐ"	TokenNameStringLiteral	ܐܬܐ
,	TokenNameCOMMA	
"ܡܢ"	TokenNameStringLiteral	ܡܢ
,	TokenNameCOMMA	
"ܡ̈ܠܬܐ"	TokenNameStringLiteral	ܡ̈ܠܬܐ
,	TokenNameCOMMA	
"ܕ"	TokenNameStringLiteral	ܕ
,	TokenNameCOMMA	
"ܘܝܩܝ"	TokenNameStringLiteral	ܘܝܩܝ
,	TokenNameCOMMA	
"ܘ"	TokenNameStringLiteral	ܘ
,	TokenNameCOMMA	
"ܐܝܢܣܩܠܘܦܕܝܐ"	TokenNameStringLiteral	ܐܝܢܣܩܠܘܦܕܝܐ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBengali	TokenNameIdentifier	 test Bengali
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"এই বিশ্বকোষ পরিচালনা করে উইকিমিডিয়া ফাউন্ডেশন (একটি অলাভজনক সংস্থা)। উইকিপিডিয়ার শুরু ১৫ জানুয়ারি, ২০০১ সালে। এখন পর্যন্ত ২০০টিরও বেশী ভাষায় উইকিপিডিয়া রয়েছে।"	TokenNameStringLiteral	এই বিশ্বকোষ পরিচালনা করে উইকিমিডিয়া ফাউন্ডেশন (একটি অলাভজনক সংস্থা)। উইকিপিডিয়ার শুরু ১৫ জানুয়ারি, ২০০১ সালে। এখন পর্যন্ত ২০০টিরও বেশী ভাষায় উইকিপিডিয়া রয়েছে।
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"এই"	TokenNameStringLiteral	এই
,	TokenNameCOMMA	
"বিশ্বকোষ"	TokenNameStringLiteral	বিশ্বকোষ
,	TokenNameCOMMA	
"পরিচালনা"	TokenNameStringLiteral	পরিচালনা
,	TokenNameCOMMA	
"করে"	TokenNameStringLiteral	করে
,	TokenNameCOMMA	
"উইকিমিডিয়া"	TokenNameStringLiteral	উইকিমিডিয়া
,	TokenNameCOMMA	
"ফাউন্ডেশন"	TokenNameStringLiteral	ফাউন্ডেশন
,	TokenNameCOMMA	
"একটি"	TokenNameStringLiteral	একটি
,	TokenNameCOMMA	
"অলাভজনক"	TokenNameStringLiteral	অলাভজনক
,	TokenNameCOMMA	
"সংস্থা"	TokenNameStringLiteral	সংস্থা
,	TokenNameCOMMA	
"উইকিপিডিয়ার"	TokenNameStringLiteral	উইকিপিডিয়ার
,	TokenNameCOMMA	
"শুরু"	TokenNameStringLiteral	শুরু
,	TokenNameCOMMA	
"১৫"	TokenNameStringLiteral	১৫
,	TokenNameCOMMA	
"জানুয়ারি"	TokenNameStringLiteral	জানুয়ারি
,	TokenNameCOMMA	
"২০০১"	TokenNameStringLiteral	২০০১
,	TokenNameCOMMA	
"সালে"	TokenNameStringLiteral	সালে
,	TokenNameCOMMA	
"এখন"	TokenNameStringLiteral	এখন
,	TokenNameCOMMA	
"পর্যন্ত"	TokenNameStringLiteral	পর্যন্ত
,	TokenNameCOMMA	
"২০০টিরও"	TokenNameStringLiteral	২০০টিরও
,	TokenNameCOMMA	
"বেশী"	TokenNameStringLiteral	বেশী
,	TokenNameCOMMA	
"ভাষায়"	TokenNameStringLiteral	ভাষায়
,	TokenNameCOMMA	
"উইকিপিডিয়া"	TokenNameStringLiteral	উইকিপিডিয়া
,	TokenNameCOMMA	
"রয়েছে"	TokenNameStringLiteral	রয়েছে
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFarsi	TokenNameIdentifier	 test Farsi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ویکی پدیای انگلیسی در تاریخ ۲۵ دی ۱۳۷۹ به صورت مکملی برای دانشنامهٔ تخصصی نوپدیا نوشته شد."	TokenNameStringLiteral	ویکی پدیای انگلیسی در تاریخ ۲۵ دی ۱۳۷۹ به صورت مکملی برای دانشنامهٔ تخصصی نوپدیا نوشته شد.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ویکی"	TokenNameStringLiteral	ویکی
,	TokenNameCOMMA	
"پدیای"	TokenNameStringLiteral	پدیای
,	TokenNameCOMMA	
"انگلیسی"	TokenNameStringLiteral	انگلیسی
,	TokenNameCOMMA	
"در"	TokenNameStringLiteral	در
,	TokenNameCOMMA	
"تاریخ"	TokenNameStringLiteral	تاریخ
,	TokenNameCOMMA	
"۲۵"	TokenNameStringLiteral	۲۵
,	TokenNameCOMMA	
"دی"	TokenNameStringLiteral	دی
,	TokenNameCOMMA	
"۱۳۷۹"	TokenNameStringLiteral	۱۳۷۹
,	TokenNameCOMMA	
"به"	TokenNameStringLiteral	به
,	TokenNameCOMMA	
"صورت"	TokenNameStringLiteral	صورت
,	TokenNameCOMMA	
"مکملی"	TokenNameStringLiteral	مکملی
,	TokenNameCOMMA	
"برای"	TokenNameStringLiteral	برای
,	TokenNameCOMMA	
"دانشنامهٔ"	TokenNameStringLiteral	دانشنامهٔ
,	TokenNameCOMMA	
"تخصصی"	TokenNameStringLiteral	تخصصی
,	TokenNameCOMMA	
"نوپدیا"	TokenNameStringLiteral	نوپدیا
,	TokenNameCOMMA	
"نوشته"	TokenNameStringLiteral	نوشته
,	TokenNameCOMMA	
"شد"	TokenNameStringLiteral	شد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGreek	TokenNameIdentifier	 test Greek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"Γράφεται σε συνεργασία από εθελοντές με το λογισμικό wiki, κάτι που σημαίνει ότι άρθρα μπορεί να προστεθούν ή να αλλάξουν από τον καθένα."	TokenNameStringLiteral	Γράφεται σε συνεργασία από εθελοντές με το λογισμικό wiki, κάτι που σημαίνει ότι άρθρα μπορεί να προστεθούν ή να αλλάξουν από τον καθένα.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"γράφεται"	TokenNameStringLiteral	γράφεται
,	TokenNameCOMMA	
"σε"	TokenNameStringLiteral	σε
,	TokenNameCOMMA	
"συνεργασία"	TokenNameStringLiteral	συνεργασία
,	TokenNameCOMMA	
"από"	TokenNameStringLiteral	από
,	TokenNameCOMMA	
"εθελοντές"	TokenNameStringLiteral	εθελοντές
,	TokenNameCOMMA	
"με"	TokenNameStringLiteral	με
,	TokenNameCOMMA	
"το"	TokenNameStringLiteral	το
,	TokenNameCOMMA	
"λογισμικό"	TokenNameStringLiteral	λογισμικό
,	TokenNameCOMMA	
"wiki"	TokenNameStringLiteral	wiki
,	TokenNameCOMMA	
"κάτι"	TokenNameStringLiteral	κάτι
,	TokenNameCOMMA	
"που"	TokenNameStringLiteral	που
,	TokenNameCOMMA	
"σημαίνει"	TokenNameStringLiteral	σημαίνει
,	TokenNameCOMMA	
"ότι"	TokenNameStringLiteral	ότι
,	TokenNameCOMMA	
"άρθρα"	TokenNameStringLiteral	άρθρα
,	TokenNameCOMMA	
"μπορεί"	TokenNameStringLiteral	μπορεί
,	TokenNameCOMMA	
"να"	TokenNameStringLiteral	να
,	TokenNameCOMMA	
"προστεθούν"	TokenNameStringLiteral	προστεθούν
,	TokenNameCOMMA	
"ή"	TokenNameStringLiteral	ή
,	TokenNameCOMMA	
"να"	TokenNameStringLiteral	να
,	TokenNameCOMMA	
"αλλάξουν"	TokenNameStringLiteral	αλλάξουν
,	TokenNameCOMMA	
"από"	TokenNameStringLiteral	από
,	TokenNameCOMMA	
"τον"	TokenNameStringLiteral	τον
,	TokenNameCOMMA	
"καθένα"	TokenNameStringLiteral	καθένα
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testThai	TokenNameIdentifier	 test Thai
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"การที่ได้ต้องแสดงว่างานดี. แล้วเธอจะไปไหน? ๑๒๓๔"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี. แล้วเธอจะไปไหน? ๑๒๓๔
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การที่ได้ต้องแสดงว่างานดี"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี
,	TokenNameCOMMA	
"แล้วเธอจะไปไหน"	TokenNameStringLiteral	แล้วเธอจะไปไหน
,	TokenNameCOMMA	
"๑๒๓๔"	TokenNameStringLiteral	๑๒๓๔
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLao	TokenNameIdentifier	 test Lao
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ສາທາລະນະລັດ ປະຊາທິປະໄຕ ປະຊາຊົນລາວ"	TokenNameStringLiteral	ສາທາລະນະລັດ ປະຊາທິປະໄຕ ປະຊາຊົນລາວ
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ສາທາລະນະລັດ"	TokenNameStringLiteral	ສາທາລະນະລັດ
,	TokenNameCOMMA	
"ປະຊາທິປະໄຕ"	TokenNameStringLiteral	ປະຊາທິປະໄຕ
,	TokenNameCOMMA	
"ປະຊາຊົນລາວ"	TokenNameStringLiteral	ປະຊາຊົນລາວ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTibetan	TokenNameIdentifier	 test Tibetan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"སྣོན་མཛོད་དང་ལས་འདིས་བོད་ཡིག་མི་ཉམས་གོང་འཕེལ་དུ་གཏོང་བར་ཧ་ཅང་དགེ་མཚན་མཆིས་སོ། །"	TokenNameStringLiteral	སྣོན་མཛོད་དང་ལས་འདིས་བོད་ཡིག་མི་ཉམས་གོང་འཕེལ་དུ་གཏོང་བར་ཧ་ཅང་དགེ་མཚན་མཆིས་སོ། །
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"སྣོན"	TokenNameStringLiteral	སྣོན
,	TokenNameCOMMA	
"མཛོད"	TokenNameStringLiteral	མཛོད
,	TokenNameCOMMA	
"དང"	TokenNameStringLiteral	དང
,	TokenNameCOMMA	
"ལས"	TokenNameStringLiteral	ལས
,	TokenNameCOMMA	
"འདིས"	TokenNameStringLiteral	འདིས
,	TokenNameCOMMA	
"བོད"	TokenNameStringLiteral	བོད
,	TokenNameCOMMA	
"ཡིག"	TokenNameStringLiteral	ཡིག
,	TokenNameCOMMA	
"མི"	TokenNameStringLiteral	མི
,	TokenNameCOMMA	
"ཉམས"	TokenNameStringLiteral	ཉམས
,	TokenNameCOMMA	
"གོང"	TokenNameStringLiteral	གོང
,	TokenNameCOMMA	
"འཕེལ"	TokenNameStringLiteral	འཕེལ
,	TokenNameCOMMA	
"དུ"	TokenNameStringLiteral	དུ
,	TokenNameCOMMA	
"གཏོང"	TokenNameStringLiteral	གཏོང
,	TokenNameCOMMA	
"བར"	TokenNameStringLiteral	བར
,	TokenNameCOMMA	
"ཧ"	TokenNameStringLiteral	ཧ
,	TokenNameCOMMA	
"ཅང"	TokenNameStringLiteral	ཅང
,	TokenNameCOMMA	
"དགེ"	TokenNameStringLiteral	དགེ
,	TokenNameCOMMA	
"མཚན"	TokenNameStringLiteral	མཚན
,	TokenNameCOMMA	
"མཆིས"	TokenNameStringLiteral	མཆིས
,	TokenNameCOMMA	
"སོ"	TokenNameStringLiteral	སོ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * For chinese, tokenize as char (these can later form bigrams or whatever) */	TokenNameCOMMENT_BLOCK	 For chinese, tokenize as char (these can later form bigrams or whatever) 
public	TokenNamepublic	
void	TokenNamevoid	
testChinese	TokenNameIdentifier	 test Chinese
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"我是中国人。 １２３４ Ｔｅｓｔｓ "	TokenNameStringLiteral	我是中国人。 １２３４ Ｔｅｓｔｓ 
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"我"	TokenNameStringLiteral	我
,	TokenNameCOMMA	
"是"	TokenNameStringLiteral	是
,	TokenNameCOMMA	
"中"	TokenNameStringLiteral	中
,	TokenNameCOMMA	
"国"	TokenNameStringLiteral	国
,	TokenNameCOMMA	
"人"	TokenNameStringLiteral	人
,	TokenNameCOMMA	
"１２３４"	TokenNameStringLiteral	１２３４
,	TokenNameCOMMA	
"ｔｅｓｔｓ"	TokenNameStringLiteral	ｔｅｓｔｓ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
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
/* test various jira issues this analyzer is related to */	TokenNameCOMMENT_BLOCK	 test various jira issues this analyzer is related to 
public	TokenNamepublic	
void	TokenNamevoid	
testLUCENE1545	TokenNameIdentifier	 test LUCEN E1545
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* * Standard analyzer does not correctly tokenize combining character U+0364 COMBINING LATIN SMALL LETTER E. * The word "moͤchte" is incorrectly tokenized into "mo" "chte", the combining character is lost. * Expected result is only one token "moͤchte". */	TokenNameCOMMENT_BLOCK	 Standard analyzer does not correctly tokenize combining character U+0364 COMBINING LATIN SMALL LETTER E. The word "moͤchte" is incorrectly tokenized into "mo" "chte", the combining character is lost. Expected result is only one token "moͤchte". 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"moͤchte"	TokenNameStringLiteral	moͤchte
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"moͤchte"	TokenNameStringLiteral	moͤchte
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Tests from StandardAnalyzer, just to show behavior is similar */	TokenNameCOMMENT_BLOCK	 Tests from StandardAnalyzer, just to show behavior is similar 
public	TokenNamepublic	
void	TokenNamevoid	
testAlphanumericSA	TokenNameIdentifier	 test Alphanumeric SA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// alphanumeric tokens 	TokenNameCOMMENT_LINE	alphanumeric tokens 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
testDelimitersSA	TokenNameIdentifier	 test Delimiters SA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// other delimiters: "-", "/", "," 	TokenNameCOMMENT_LINE	other delimiters: "-", "/", "," 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
testApostrophesSA	TokenNameIdentifier	 test Apostrophes SA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// internal apostrophes: O'Reilly, you're, O'Reilly's 	TokenNameCOMMENT_LINE	internal apostrophes: O'Reilly, you're, O'Reilly's 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
"she's"	TokenNameStringLiteral	she's
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
"jim's"	TokenNameStringLiteral	jim's
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
"o'reilly's"	TokenNameStringLiteral	o'reilly's
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNumericSA	TokenNameIdentifier	 test Numeric SA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// floating point, serial, model numbers, ip addresses, etc. 	TokenNameCOMMENT_LINE	floating point, serial, model numbers, ip addresses, etc. 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTextWithNumbersSA	TokenNameIdentifier	 test Text With Numbers SA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// numbers 	TokenNameCOMMENT_LINE	numbers 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
testVariousTextSA	TokenNameIdentifier	 test Various Text SA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// various 	TokenNameCOMMENT_LINE	various 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
testKoreanSA	TokenNameIdentifier	 test Korean SA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Korean words 	TokenNameCOMMENT_LINE	Korean words 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
public	TokenNamepublic	
void	TokenNamevoid	
testOffsets	TokenNameIdentifier	 test Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
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
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTypes	TokenNameIdentifier	 test Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"david has 5000 bones"	TokenNameStringLiteral	david has 5000 bones
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
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<NUM>"	TokenNameStringLiteral	<NUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSupplementary	TokenNameIdentifier	 test Supplementary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"𩬅艱鍟䇹愯瀛"	TokenNameStringLiteral	𩬅艱鍟䇹愯瀛
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"𩬅"	TokenNameStringLiteral	𩬅
,	TokenNameCOMMA	
"艱"	TokenNameStringLiteral	艱
,	TokenNameCOMMA	
"鍟"	TokenNameStringLiteral	鍟
,	TokenNameCOMMA	
"䇹"	TokenNameStringLiteral	䇹
,	TokenNameCOMMA	
"愯"	TokenNameStringLiteral	愯
,	TokenNameCOMMA	
"瀛"	TokenNameStringLiteral	瀛
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
,	TokenNameCOMMA	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
,	TokenNameCOMMA	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
,	TokenNameCOMMA	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
,	TokenNameCOMMA	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
,	TokenNameCOMMA	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"훈민정음"	TokenNameStringLiteral	훈민정음
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"훈민정음"	TokenNameStringLiteral	훈민정음
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<HANGUL>"	TokenNameStringLiteral	<HANGUL>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJapanese	TokenNameIdentifier	 test Japanese
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"仮名遣い カタカナ"	TokenNameStringLiteral	仮名遣い カタカナ
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"仮"	TokenNameStringLiteral	仮
,	TokenNameCOMMA	
"名"	TokenNameStringLiteral	名
,	TokenNameCOMMA	
"遣"	TokenNameStringLiteral	遣
,	TokenNameCOMMA	
"い"	TokenNameStringLiteral	い
,	TokenNameCOMMA	
"カタカナ"	TokenNameStringLiteral	カタカナ
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
,	TokenNameCOMMA	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
,	TokenNameCOMMA	
"<IDEOGRAPHIC>"	TokenNameStringLiteral	<IDEOGRAPHIC>
,	TokenNameCOMMA	
"<HIRAGANA>"	TokenNameStringLiteral	<HIRAGANA>
,	TokenNameCOMMA	
"<KATAKANA>"	TokenNameStringLiteral	<KATAKANA>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCombiningMarks	TokenNameIdentifier	 test Combining Marks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ざ"	TokenNameStringLiteral	ざ
,	TokenNameCOMMA	
"ざ"	TokenNameStringLiteral	ざ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hiragana 	TokenNameCOMMENT_LINE	hiragana 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ザ"	TokenNameStringLiteral	ザ
,	TokenNameCOMMA	
"ザ"	TokenNameStringLiteral	ザ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// katakana 	TokenNameCOMMENT_LINE	katakana 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"壹゙"	TokenNameStringLiteral	壹゙
,	TokenNameCOMMA	
"壹゙"	TokenNameStringLiteral	壹゙
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ideographic 	TokenNameCOMMENT_LINE	ideographic 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"아゙"	TokenNameStringLiteral	아゙
,	TokenNameCOMMA	
"아゙"	TokenNameStringLiteral	아゙
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hangul 	TokenNameCOMMENT_LINE	hangul 
}	TokenNameRBRACE	
/** @deprecated remove this and sophisticated backwards layer in 5.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this and sophisticated backwards layer in 5.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testCombiningMarksBackwards	TokenNameIdentifier	 test Combining Marks Backwards
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
UAX29URLEmailAnalyzer	TokenNameIdentifier	 UA X29 URL Email Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_33	TokenNameIdentifier	 LUCENE 33
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ざ"	TokenNameStringLiteral	ざ
,	TokenNameCOMMA	
"さ"	TokenNameStringLiteral	さ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hiragana Bug 	TokenNameCOMMENT_LINE	hiragana Bug 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"ザ"	TokenNameStringLiteral	ザ
,	TokenNameCOMMA	
"ザ"	TokenNameStringLiteral	ザ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// katakana Works 	TokenNameCOMMENT_LINE	katakana Works 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"壹゙"	TokenNameStringLiteral	壹゙
,	TokenNameCOMMA	
"壹"	TokenNameStringLiteral	壹
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ideographic Bug 	TokenNameCOMMENT_LINE	ideographic Bug 
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"아゙"	TokenNameStringLiteral	아゙
,	TokenNameCOMMA	
"아゙"	TokenNameStringLiteral	아゙
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hangul Works 	TokenNameCOMMENT_LINE	hangul Works 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasicEmails	TokenNameIdentifier	 test Basic Emails
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"one test@example.com two three [A@example.CO.UK] "ArakaBanassaMassanaBakarA" <info@Info.info>"	TokenNameStringLiteral	one test@example.com two three [A@example.CO.UK] "ArakaBanassaMassanaBakarA" <info@Info.info>
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"test@example.com"	TokenNameStringLiteral	test@example.com
,	TokenNameCOMMA	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
"a@example.co.uk"	TokenNameStringLiteral	a@example.co.uk
,	TokenNameCOMMA	
"arakabanassamassanabakara"	TokenNameStringLiteral	arakabanassamassanabakara
,	TokenNameCOMMA	
"info@info.info"	TokenNameStringLiteral	info@info.info
,	TokenNameCOMMA	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<EMAIL>"	TokenNameStringLiteral	<EMAIL>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<EMAIL>"	TokenNameStringLiteral	<EMAIL>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<EMAIL>"	TokenNameStringLiteral	<EMAIL>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMailtoSchemeEmails	TokenNameIdentifier	 test Mailto Scheme Emails
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// See LUCENE-3880 	TokenNameCOMMENT_LINE	See LUCENE-3880 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"MAILTO:Test@Example.ORG"	TokenNameStringLiteral	MAILTO:Test@Example.ORG
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mailto"	TokenNameStringLiteral	mailto
,	TokenNameCOMMA	
"test@example.org"	TokenNameStringLiteral	test@example.org
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<EMAIL>"	TokenNameStringLiteral	<EMAIL>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: Support full mailto: scheme URIs. See RFC 6068: http://tools.ietf.org/html/rfc6068 	TokenNameCOMMENT_LINE	TODO: Support full mailto: scheme URIs. See RFC 6068: http://tools.ietf.org/html/rfc6068 
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"mailto:personA@example.com,personB@example.com?cc=personC@example.com"	TokenNameStringLiteral	mailto:personA@example.com,personB@example.com?cc=personC@example.com
+	TokenNamePLUS	
"&subject=Subjectivity&body=Corpusivity%20or%20something%20like%20that"	TokenNameStringLiteral	&subject=Subjectivity&body=Corpusivity%20or%20something%20like%20that
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"mailto"	TokenNameStringLiteral	mailto
,	TokenNameCOMMA	
"persona@example.com"	TokenNameStringLiteral	persona@example.com
,	TokenNameCOMMA	
// TODO: recognize ',' address delimiter. Also, see examples of ';' delimiter use at: http://www.mailto.co.uk/ 	TokenNameCOMMENT_LINE	TODO: recognize ',' address delimiter. Also, see examples of ';' delimiter use at: http://www.mailto.co.uk/ 
",personb@example.com"	TokenNameStringLiteral	,personb@example.com
,	TokenNameCOMMA	
"?cc=personc@example.com"	TokenNameStringLiteral	?cc=personc@example.com
,	TokenNameCOMMA	
// TODO: split field keys/values 	TokenNameCOMMENT_LINE	TODO: split field keys/values 
"subject"	TokenNameStringLiteral	subject
,	TokenNameCOMMA	
"subjectivity"	TokenNameStringLiteral	subjectivity
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"corpusivity"	TokenNameStringLiteral	corpusivity
,	TokenNameCOMMA	
"20or"	TokenNameStringLiteral	20or
,	TokenNameCOMMA	
"20something"	TokenNameStringLiteral	20something
,	TokenNameCOMMA	
"20like"	TokenNameStringLiteral	20like
,	TokenNameCOMMA	
"20that"	TokenNameStringLiteral	20that
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// TODO: Hex decoding + re-tokenization 	TokenNameCOMMENT_LINE	TODO: Hex decoding + re-tokenization 
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<EMAIL>"	TokenNameStringLiteral	<EMAIL>
,	TokenNameCOMMA	
"<EMAIL>"	TokenNameStringLiteral	<EMAIL>
,	TokenNameCOMMA	
"<EMAIL>"	TokenNameStringLiteral	<EMAIL>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasicURLs	TokenNameIdentifier	 test Basic UR Ls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"a <HTTPs://example.net/omg/isnt/that/NICE?no=its&n%30t#mntl-E>b-D ftp://www.example.com/ABC.txt file:///C:/path/to/a/FILE.txt C"	TokenNameStringLiteral	a <HTTPs://example.net/omg/isnt/that/NICE?no=its&n%30t#mntl-E>b-D ftp://www.example.com/ABC.txt file:///C:/path/to/a/FILE.txt C
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"https://example.net/omg/isnt/that/nice?no=its&n%30t#mntl-e"	TokenNameStringLiteral	https://example.net/omg/isnt/that/nice?no=its&n%30t#mntl-e
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
"ftp://www.example.com/abc.txt"	TokenNameStringLiteral	ftp://www.example.com/abc.txt
,	TokenNameCOMMA	
"file:///c:/path/to/a/file.txt"	TokenNameStringLiteral	file:///c:/path/to/a/file.txt
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<URL>"	TokenNameStringLiteral	<URL>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<URL>"	TokenNameStringLiteral	<URL>
,	TokenNameCOMMA	
"<URL>"	TokenNameStringLiteral	<URL>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
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
UAX29URLEmailAnalyzer	TokenNameIdentifier	 UA X29 URL Email Analyzer
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
