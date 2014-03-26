package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
TypeAttribute	TokenNameIdentifier	 Type Attribute
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
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestUAX29URLEmailTokenizer	TokenNameIdentifier	 Test UA X29 URL Email Tokenizer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
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
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
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
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Passes through tokens with type "<URL>" and blocks all other types. */	TokenNameCOMMENT_JAVADOC	 Passes through tokens with type "<URL>" and blocks all other types. 
private	TokenNameprivate	
class	TokenNameclass	
URLFilter	TokenNameIdentifier	 URL Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
URLFilter	TokenNameIdentifier	 URL Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isTokenAvailable	TokenNameIdentifier	 is Token Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isTokenAvailable	TokenNameIdentifier	 is Token Available
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
isTokenAvailable	TokenNameIdentifier	 is Token Available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Passes through tokens with type "<EMAIL>" and blocks all other types. */	TokenNameCOMMENT_JAVADOC	 Passes through tokens with type "<EMAIL>" and blocks all other types. 
private	TokenNameprivate	
class	TokenNameclass	
EmailFilter	TokenNameIdentifier	 Email Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EmailFilter	TokenNameIdentifier	 Email Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isTokenAvailable	TokenNameIdentifier	 is Token Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
.	TokenNameDOT	
TOKEN_TYPES	TokenNameIdentifier	 TOKEN  TYPES
[	TokenNameLBRACKET	
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
.	TokenNameDOT	
EMAIL	TokenNameIdentifier	 EMAIL
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isTokenAvailable	TokenNameIdentifier	 is Token Available
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
isTokenAvailable	TokenNameIdentifier	 is Token Available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Analyzer	TokenNameIdentifier	 Analyzer
urlAnalyzer	TokenNameIdentifier	 url Analyzer
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
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
setMaxTokenLength	TokenNameIdentifier	 set Max Token Length
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tokenize arbitrary length URLs 	TokenNameCOMMENT_LINE	Tokenize arbitrary length URLs 
TokenFilter	TokenNameIdentifier	 Token Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
URLFilter	TokenNameIdentifier	 URL Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Analyzer	TokenNameIdentifier	 Analyzer
emailAnalyzer	TokenNameIdentifier	 email Analyzer
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
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenFilter	TokenNameIdentifier	 Token Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
EmailFilter	TokenNameIdentifier	 Email Filter
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
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
"Վիքիպեդիայի"	TokenNameStringLiteral	Վիքիպեդիայի
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
"Վիքիպեդիայի"	TokenNameStringLiteral	Վիքիպեդիայի
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
"Truth"	TokenNameStringLiteral	Truth
,	TokenNameCOMMA	
"in"	TokenNameStringLiteral	in
,	TokenNameCOMMA	
"Numbers"	TokenNameStringLiteral	Numbers
,	TokenNameCOMMA	
"The"	TokenNameStringLiteral	The
,	TokenNameCOMMA	
"Wikipedia"	TokenNameStringLiteral	Wikipedia
,	TokenNameCOMMA	
"Story"	TokenNameStringLiteral	Story
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
"Wikipedia"	TokenNameStringLiteral	Wikipedia
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
"Γράφεται"	TokenNameStringLiteral	Γράφεται
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
"Ｔｅｓｔｓ"	TokenNameStringLiteral	Ｔｅｓｔｓ
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
/* * Standard analyzer does not correctly tokenize combining character U+0364 COMBINING LATIN SMALL LETTRE E. * The word "moͤchte" is incorrectly tokenized into "mo" "chte", the combining character is lost. * Expected result is only on token "moͤchte". */	TokenNameCOMMENT_BLOCK	 Standard analyzer does not correctly tokenize combining character U+0364 COMBINING LATIN SMALL LETTRE E. The word "moͤchte" is incorrectly tokenized into "mo" "chte", the combining character is lost. Expected result is only on token "moͤchte". 
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
"B2B"	TokenNameStringLiteral	B2B
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
"2B"	TokenNameStringLiteral	2B
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
"O'Reilly"	TokenNameStringLiteral	O'Reilly
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
"Jim's"	TokenNameStringLiteral	Jim's
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
"O'Reilly's"	TokenNameStringLiteral	O'Reilly's
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
"R2D2"	TokenNameStringLiteral	R2D2
,	TokenNameCOMMA	
"C3PO"	TokenNameStringLiteral	C3PO
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
"David"	TokenNameStringLiteral	David
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
"C"	TokenNameStringLiteral	C
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
"FOO"	TokenNameStringLiteral	FOO
,	TokenNameCOMMA	
"BAR"	TokenNameStringLiteral	BAR
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
"FOO"	TokenNameStringLiteral	FOO
,	TokenNameCOMMA	
"BAR"	TokenNameStringLiteral	BAR
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
"QUOTED"	TokenNameStringLiteral	QUOTED
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
"David"	TokenNameStringLiteral	David
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
"David has 5000 bones"	TokenNameStringLiteral	David has 5000 bones
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"David"	TokenNameStringLiteral	David
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
testWikiURLs	TokenNameIdentifier	 test Wiki UR Ls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
luceneResourcesWikiPage	TokenNameIdentifier	 lucene Resources Wiki Page
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"LuceneResourcesWikiPage.html"	TokenNameStringLiteral	LuceneResourcesWikiPage.html
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numCharsRead	TokenNameIdentifier	 num Chars Read
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
numCharsRead	TokenNameIdentifier	 num Chars Read
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numCharsRead	TokenNameIdentifier	 num Chars Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
luceneResourcesWikiPage	TokenNameIdentifier	 lucene Resources Wiki Page
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
luceneResourcesWikiPage	TokenNameIdentifier	 lucene Resources Wiki Page
&&	TokenNameAND_AND	
luceneResourcesWikiPage	TokenNameIdentifier	 lucene Resources Wiki Page
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
bufferedReader	TokenNameIdentifier	 buffered Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
urls	TokenNameIdentifier	 urls
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
urlList	TokenNameIdentifier	 url List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferedReader	TokenNameIdentifier	 buffered Reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"LuceneResourcesWikiPageURLs.txt"	TokenNameStringLiteral	LuceneResourcesWikiPageURLs.txt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
bufferedReader	TokenNameIdentifier	 buffered Reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
urlList	TokenNameIdentifier	 url List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
urls	TokenNameIdentifier	 urls
=	TokenNameEQUAL	
urlList	TokenNameIdentifier	 url List
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
urlList	TokenNameIdentifier	 url List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
bufferedReader	TokenNameIdentifier	 buffered Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferedReader	TokenNameIdentifier	 buffered Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
urls	TokenNameIdentifier	 urls
&&	TokenNameAND_AND	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
urlAnalyzer	TokenNameIdentifier	 url Analyzer
,	TokenNameCOMMA	
luceneResourcesWikiPage	TokenNameIdentifier	 lucene Resources Wiki Page
,	TokenNameCOMMA	
urls	TokenNameIdentifier	 urls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmails	TokenNameIdentifier	 test Emails
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
randomTextWithEmails	TokenNameIdentifier	 random Text With Emails
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"random.text.with.email.addresses.txt"	TokenNameStringLiteral	random.text.with.email.addresses.txt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numCharsRead	TokenNameIdentifier	 num Chars Read
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
numCharsRead	TokenNameIdentifier	 num Chars Read
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numCharsRead	TokenNameIdentifier	 num Chars Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
randomTextWithEmails	TokenNameIdentifier	 random Text With Emails
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
randomTextWithEmails	TokenNameIdentifier	 random Text With Emails
&&	TokenNameAND_AND	
randomTextWithEmails	TokenNameIdentifier	 random Text With Emails
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
bufferedReader	TokenNameIdentifier	 buffered Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
emails	TokenNameIdentifier	 emails
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emailList	TokenNameIdentifier	 email List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferedReader	TokenNameIdentifier	 buffered Reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"email.addresses.from.random.text.with.email.addresses.txt"	TokenNameStringLiteral	email.addresses.from.random.text.with.email.addresses.txt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
bufferedReader	TokenNameIdentifier	 buffered Reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emailList	TokenNameIdentifier	 email List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
emails	TokenNameIdentifier	 emails
=	TokenNameEQUAL	
emailList	TokenNameIdentifier	 email List
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
emailList	TokenNameIdentifier	 email List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
bufferedReader	TokenNameIdentifier	 buffered Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferedReader	TokenNameIdentifier	 buffered Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
emails	TokenNameIdentifier	 emails
&&	TokenNameAND_AND	
emails	TokenNameIdentifier	 emails
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
emailAnalyzer	TokenNameIdentifier	 email Analyzer
,	TokenNameCOMMA	
randomTextWithEmails	TokenNameIdentifier	 random Text With Emails
,	TokenNameCOMMA	
emails	TokenNameIdentifier	 emails
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
"mailto:test@example.org"	TokenNameStringLiteral	mailto:test@example.org
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
"personA@example.com"	TokenNameStringLiteral	personA@example.com
,	TokenNameCOMMA	
// TODO: recognize ',' address delimiter. Also, see examples of ';' delimiter use at: http://www.mailto.co.uk/ 	TokenNameCOMMENT_LINE	TODO: recognize ',' address delimiter. Also, see examples of ';' delimiter use at: http://www.mailto.co.uk/ 
",personB@example.com"	TokenNameStringLiteral	,personB@example.com
,	TokenNameCOMMA	
"?cc=personC@example.com"	TokenNameStringLiteral	?cc=personC@example.com
,	TokenNameCOMMA	
// TODO: split field keys/values 	TokenNameCOMMENT_LINE	TODO: split field keys/values 
"subject"	TokenNameStringLiteral	subject
,	TokenNameCOMMA	
"Subjectivity"	TokenNameStringLiteral	Subjectivity
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"Corpusivity"	TokenNameStringLiteral	Corpusivity
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
testURLs	TokenNameIdentifier	 test UR Ls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
randomTextWithURLs	TokenNameIdentifier	 random Text With UR Ls
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"random.text.with.urls.txt"	TokenNameStringLiteral	random.text.with.urls.txt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numCharsRead	TokenNameIdentifier	 num Chars Read
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
numCharsRead	TokenNameIdentifier	 num Chars Read
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numCharsRead	TokenNameIdentifier	 num Chars Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
randomTextWithURLs	TokenNameIdentifier	 random Text With UR Ls
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
randomTextWithURLs	TokenNameIdentifier	 random Text With UR Ls
&&	TokenNameAND_AND	
randomTextWithURLs	TokenNameIdentifier	 random Text With UR Ls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
bufferedReader	TokenNameIdentifier	 buffered Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
urls	TokenNameIdentifier	 urls
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
urlList	TokenNameIdentifier	 url List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferedReader	TokenNameIdentifier	 buffered Reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"urls.from.random.text.with.urls.txt"	TokenNameStringLiteral	urls.from.random.text.with.urls.txt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
bufferedReader	TokenNameIdentifier	 buffered Reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
urlList	TokenNameIdentifier	 url List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
urls	TokenNameIdentifier	 urls
=	TokenNameEQUAL	
urlList	TokenNameIdentifier	 url List
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
urlList	TokenNameIdentifier	 url List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
bufferedReader	TokenNameIdentifier	 buffered Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferedReader	TokenNameIdentifier	 buffered Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
urls	TokenNameIdentifier	 urls
&&	TokenNameAND_AND	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
.	TokenNameDOT	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
urlAnalyzer	TokenNameIdentifier	 url Analyzer
,	TokenNameCOMMA	
randomTextWithURLs	TokenNameIdentifier	 random Text With UR Ls
,	TokenNameCOMMA	
urls	TokenNameIdentifier	 urls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnicodeWordBreaks	TokenNameIdentifier	 test Unicode Word Breaks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
WordBreakTestUnicode_6_0_0	TokenNameIdentifier	 Word Break Test Unicode 6 0 0
wordBreakTest	TokenNameIdentifier	 word Break Test
=	TokenNameEQUAL	
new	TokenNamenew	
WordBreakTestUnicode_6_0_0	TokenNameIdentifier	 Word Break Test Unicode 6 0 0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordBreakTest	TokenNameIdentifier	 word Break Test
.	TokenNameDOT	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
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
UAX29URLEmailTokenizer	TokenNameIdentifier	 UA X29 URL Email Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** blast some random large strings through the analyzer */	TokenNameCOMMENT_JAVADOC	 blast some random large strings through the analyzer 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomHugeStrings	TokenNameIdentifier	 test Random Huge Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
,	TokenNameCOMMA	
8192	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
