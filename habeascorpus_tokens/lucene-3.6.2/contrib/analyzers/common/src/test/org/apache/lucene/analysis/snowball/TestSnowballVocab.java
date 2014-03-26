package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
snowball	TokenNameIdentifier	 snowball
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
/** * Test the snowball filters against the snowball data tests */	TokenNameCOMMENT_JAVADOC	 Test the snowball filters against the snowball data tests 
public	TokenNamepublic	
class	TokenNameclass	
TestSnowballVocab	TokenNameIdentifier	 Test Snowball Vocab
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** * Run all languages against their snowball vocabulary tests. */	TokenNameCOMMENT_JAVADOC	 Run all languages against their snowball vocabulary tests. 
public	TokenNamepublic	
void	TokenNamevoid	
testStemmers	TokenNameIdentifier	 test Stemmers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Danish"	TokenNameStringLiteral	Danish
,	TokenNameCOMMA	
"danish"	TokenNameStringLiteral	danish
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Dutch"	TokenNameStringLiteral	Dutch
,	TokenNameCOMMA	
"dutch"	TokenNameStringLiteral	dutch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"English"	TokenNameStringLiteral	English
,	TokenNameCOMMA	
"english"	TokenNameStringLiteral	english
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// disabled due to snowball java code generation bug: 	TokenNameCOMMENT_LINE	disabled due to snowball java code generation bug: 
// see http://article.gmane.org/gmane.comp.search.snowball/1139 	TokenNameCOMMENT_LINE	see http://article.gmane.org/gmane.comp.search.snowball/1139 
// assertCorrectOutput("Finnish", "finnish"); 	TokenNameCOMMENT_LINE	assertCorrectOutput("Finnish", "finnish"); 
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"French"	TokenNameStringLiteral	French
,	TokenNameCOMMA	
"french"	TokenNameStringLiteral	french
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"German"	TokenNameStringLiteral	German
,	TokenNameCOMMA	
"german"	TokenNameStringLiteral	german
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"German2"	TokenNameStringLiteral	German2
,	TokenNameCOMMA	
"german2"	TokenNameStringLiteral	german2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Hungarian"	TokenNameStringLiteral	Hungarian
,	TokenNameCOMMA	
"hungarian"	TokenNameStringLiteral	hungarian
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Italian"	TokenNameStringLiteral	Italian
,	TokenNameCOMMA	
"italian"	TokenNameStringLiteral	italian
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Kp"	TokenNameStringLiteral	Kp
,	TokenNameCOMMA	
"kraaij_pohlmann"	TokenNameStringLiteral	kraaij_pohlmann
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// disabled due to snowball java code generation bug: 	TokenNameCOMMENT_LINE	disabled due to snowball java code generation bug: 
// see http://article.gmane.org/gmane.comp.search.snowball/1139 	TokenNameCOMMENT_LINE	see http://article.gmane.org/gmane.comp.search.snowball/1139 
// assertCorrectOutput("Lovins", "lovins"); 	TokenNameCOMMENT_LINE	assertCorrectOutput("Lovins", "lovins"); 
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Norwegian"	TokenNameStringLiteral	Norwegian
,	TokenNameCOMMA	
"norwegian"	TokenNameStringLiteral	norwegian
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Porter"	TokenNameStringLiteral	Porter
,	TokenNameCOMMA	
"porter"	TokenNameStringLiteral	porter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Portuguese"	TokenNameStringLiteral	Portuguese
,	TokenNameCOMMA	
"portuguese"	TokenNameStringLiteral	portuguese
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Romanian"	TokenNameStringLiteral	Romanian
,	TokenNameCOMMA	
"romanian"	TokenNameStringLiteral	romanian
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Russian"	TokenNameStringLiteral	Russian
,	TokenNameCOMMA	
"russian"	TokenNameStringLiteral	russian
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Spanish"	TokenNameStringLiteral	Spanish
,	TokenNameCOMMA	
"spanish"	TokenNameStringLiteral	spanish
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Swedish"	TokenNameStringLiteral	Swedish
,	TokenNameCOMMA	
"swedish"	TokenNameStringLiteral	swedish
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
"Turkish"	TokenNameStringLiteral	Turkish
,	TokenNameCOMMA	
"turkish"	TokenNameStringLiteral	turkish
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For the supplied language, run the stemmer against all strings in voc.txt * The output should be the same as the string in output.txt */	TokenNameCOMMENT_JAVADOC	 For the supplied language, run the stemmer against all strings in voc.txt The output should be the same as the string in output.txt 
private	TokenNameprivate	
void	TokenNamevoid	
assertCorrectOutput	TokenNameIdentifier	 assert Correct Output
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
snowballLanguage	TokenNameIdentifier	 snowball Language
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dataDirectory	TokenNameIdentifier	 data Directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"checking snowball language: "	TokenNameStringLiteral	checking snowball language: 
+	TokenNamePLUS	
snowballLanguage	TokenNameIdentifier	 snowball Language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
t	TokenNameIdentifier	 t
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
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
new	TokenNamenew	
SnowballFilter	TokenNameIdentifier	 Snowball Filter
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
snowballLanguage	TokenNameIdentifier	 snowball Language
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertVocabulary	TokenNameIdentifier	 assert Vocabulary
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
getDataFile	TokenNameIdentifier	 get Data File
(	TokenNameLPAREN	
"TestSnowballVocabData.zip"	TokenNameStringLiteral	TestSnowballVocabData.zip
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dataDirectory	TokenNameIdentifier	 data Directory
+	TokenNamePLUS	
"/voc.txt"	TokenNameStringLiteral	/voc.txt
,	TokenNameCOMMA	
dataDirectory	TokenNameIdentifier	 data Directory
+	TokenNamePLUS	
"/output.txt"	TokenNameStringLiteral	/output.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
