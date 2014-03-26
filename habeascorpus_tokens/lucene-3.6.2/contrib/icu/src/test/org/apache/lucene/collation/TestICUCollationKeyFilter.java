package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
collation	TokenNameIdentifier	 collation
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
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
CollationTestBase	TokenNameIdentifier	 Collation Test Base
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
TokenStream	TokenNameIdentifier	 Token Stream
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
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestICUCollationKeyFilter	TokenNameIdentifier	 Test ICU Collation Key Filter
extends	TokenNameextends	
CollationTestBase	TokenNameIdentifier	 Collation Test Base
{	TokenNameLBRACE	
private	TokenNameprivate	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"fa"	TokenNameStringLiteral	fa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
TestAnalyzer	TokenNameIdentifier	 Test Analyzer
(	TokenNameLPAREN	
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
firstRangeBeginning	TokenNameIdentifier	 first Range Beginning
=	TokenNameEQUAL	
encodeCollationKey	TokenNameIdentifier	 encode Collation Key
(	TokenNameLPAREN	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
firstRangeBeginningOriginal	TokenNameIdentifier	 first Range Beginning Original
)	TokenNameRPAREN	
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
firstRangeEnd	TokenNameIdentifier	 first Range End
=	TokenNameEQUAL	
encodeCollationKey	TokenNameIdentifier	 encode Collation Key
(	TokenNameLPAREN	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
firstRangeEndOriginal	TokenNameIdentifier	 first Range End Original
)	TokenNameRPAREN	
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
secondRangeBeginning	TokenNameIdentifier	 second Range Beginning
=	TokenNameEQUAL	
encodeCollationKey	TokenNameIdentifier	 encode Collation Key
(	TokenNameLPAREN	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
secondRangeBeginningOriginal	TokenNameIdentifier	 second Range Beginning Original
)	TokenNameRPAREN	
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
secondRangeEnd	TokenNameIdentifier	 second Range End
=	TokenNameEQUAL	
encodeCollationKey	TokenNameIdentifier	 encode Collation Key
(	TokenNameLPAREN	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
secondRangeEndOriginal	TokenNameIdentifier	 second Range End Original
)	TokenNameRPAREN	
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TestAnalyzer	TokenNameIdentifier	 Test Analyzer
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
private	TokenNameprivate	
Collator	TokenNameIdentifier	 Collator
_collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
TestAnalyzer	TokenNameIdentifier	 Test Analyzer
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ICUCollationKeyFilter	TokenNameIdentifier	 ICU Collation Key Filter
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
_collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFarsiRangeFilterCollating	TokenNameIdentifier	 test Farsi Range Filter Collating
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testFarsiRangeFilterCollating	TokenNameIdentifier	 test Farsi Range Filter Collating
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
firstRangeBeginning	TokenNameIdentifier	 first Range Beginning
,	TokenNameCOMMA	
firstRangeEnd	TokenNameIdentifier	 first Range End
,	TokenNameCOMMA	
secondRangeBeginning	TokenNameIdentifier	 second Range Beginning
,	TokenNameCOMMA	
secondRangeEnd	TokenNameIdentifier	 second Range End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFarsiRangeQueryCollating	TokenNameIdentifier	 test Farsi Range Query Collating
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testFarsiRangeQueryCollating	TokenNameIdentifier	 test Farsi Range Query Collating
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
firstRangeBeginning	TokenNameIdentifier	 first Range Beginning
,	TokenNameCOMMA	
firstRangeEnd	TokenNameIdentifier	 first Range End
,	TokenNameCOMMA	
secondRangeBeginning	TokenNameIdentifier	 second Range Beginning
,	TokenNameCOMMA	
secondRangeEnd	TokenNameIdentifier	 second Range End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFarsiTermRangeQuery	TokenNameIdentifier	 test Farsi Term Range Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testFarsiTermRangeQuery	TokenNameIdentifier	 test Farsi Term Range Query
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
firstRangeBeginning	TokenNameIdentifier	 first Range Beginning
,	TokenNameCOMMA	
firstRangeEnd	TokenNameIdentifier	 first Range End
,	TokenNameCOMMA	
secondRangeBeginning	TokenNameIdentifier	 second Range Beginning
,	TokenNameCOMMA	
secondRangeEnd	TokenNameIdentifier	 second Range End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test using various international locales with accented characters (which 	TokenNameCOMMENT_LINE	Test using various international locales with accented characters (which 
// sort differently depending on locale) 	TokenNameCOMMENT_LINE	sort differently depending on locale) 
// 	TokenNameCOMMENT_LINE	 
// Copied (and slightly modified) from 	TokenNameCOMMENT_LINE	Copied (and slightly modified) from 
// org.apache.lucene.search.TestSort.testInternationalSort() 	TokenNameCOMMENT_LINE	org.apache.lucene.search.TestSort.testInternationalSort() 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
testCollationKeySort	TokenNameIdentifier	 test Collation Key Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
usAnalyzer	TokenNameIdentifier	 us Analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
TestAnalyzer	TokenNameIdentifier	 Test Analyzer
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Analyzer	TokenNameIdentifier	 Analyzer
franceAnalyzer	TokenNameIdentifier	 france Analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
TestAnalyzer	TokenNameIdentifier	 Test Analyzer
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
FRANCE	TokenNameIdentifier	 FRANCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Analyzer	TokenNameIdentifier	 Analyzer
swedenAnalyzer	TokenNameIdentifier	 sweden Analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
TestAnalyzer	TokenNameIdentifier	 Test Analyzer
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"sv"	TokenNameStringLiteral	sv
,	TokenNameCOMMA	
"se"	TokenNameStringLiteral	se
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Analyzer	TokenNameIdentifier	 Analyzer
denmarkAnalyzer	TokenNameIdentifier	 denmark Analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
TestAnalyzer	TokenNameIdentifier	 Test Analyzer
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"da"	TokenNameStringLiteral	da
,	TokenNameCOMMA	
"dk"	TokenNameStringLiteral	dk
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The ICU Collator and java.text.Collator implementations differ in their 	TokenNameCOMMENT_LINE	The ICU Collator and java.text.Collator implementations differ in their 
// orderings - "BFJHD" is the ordering for the ICU Collator for Locale.US. 	TokenNameCOMMENT_LINE	orderings - "BFJHD" is the ordering for the ICU Collator for Locale.US. 
testCollationKeySort	TokenNameIdentifier	 test Collation Key Sort
(	TokenNameLPAREN	
usAnalyzer	TokenNameIdentifier	 us Analyzer
,	TokenNameCOMMA	
franceAnalyzer	TokenNameIdentifier	 france Analyzer
,	TokenNameCOMMA	
swedenAnalyzer	TokenNameIdentifier	 sweden Analyzer
,	TokenNameCOMMA	
denmarkAnalyzer	TokenNameIdentifier	 denmark Analyzer
,	TokenNameCOMMA	
"BFJHD"	TokenNameStringLiteral	BFJHD
,	TokenNameCOMMA	
"ECAGI"	TokenNameStringLiteral	ECAGI
,	TokenNameCOMMA	
"BJDFH"	TokenNameStringLiteral	BJDFH
,	TokenNameCOMMA	
"BJDHF"	TokenNameStringLiteral	BJDHF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
