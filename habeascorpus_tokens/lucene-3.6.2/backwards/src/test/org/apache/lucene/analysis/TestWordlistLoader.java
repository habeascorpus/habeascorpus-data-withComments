package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
StringReader	TokenNameIdentifier	 String Reader
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
public	TokenNamepublic	
class	TokenNameclass	
TestWordlistLoader	TokenNameIdentifier	 Test Wordlist Loader
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWordlistLoading	TokenNameIdentifier	 test Wordlist Loading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"ONE two three"	TokenNameStringLiteral	ONE two three
;	TokenNameSEMICOLON	
CharArraySet	TokenNameIdentifier	 Char Array Set
wordSet1	TokenNameIdentifier	 word Set1
=	TokenNameEQUAL	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
.	TokenNameDOT	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkSet	TokenNameIdentifier	 check Set
(	TokenNameLPAREN	
wordSet1	TokenNameIdentifier	 word Set1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharArraySet	TokenNameIdentifier	 Char Array Set
wordSet2	TokenNameIdentifier	 word Set2
=	TokenNameEQUAL	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
.	TokenNameDOT	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkSet	TokenNameIdentifier	 check Set
(	TokenNameLPAREN	
wordSet2	TokenNameIdentifier	 word Set2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testComments	TokenNameIdentifier	 test Comments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"ONE two three #comment"	TokenNameStringLiteral	ONE two three #comment
;	TokenNameSEMICOLON	
CharArraySet	TokenNameIdentifier	 Char Array Set
wordSet1	TokenNameIdentifier	 word Set1
=	TokenNameEQUAL	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
.	TokenNameDOT	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"#"	TokenNameStringLiteral	#
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkSet	TokenNameIdentifier	 check Set
(	TokenNameLPAREN	
wordSet1	TokenNameIdentifier	 word Set1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
wordSet1	TokenNameIdentifier	 word Set1
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"#comment"	TokenNameStringLiteral	#comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
wordSet1	TokenNameIdentifier	 word Set1
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"comment"	TokenNameStringLiteral	comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkSet	TokenNameIdentifier	 check Set
(	TokenNameLPAREN	
CharArraySet	TokenNameIdentifier	 Char Array Set
wordset	TokenNameIdentifier	 wordset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"ONE"	TokenNameStringLiteral	ONE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// case is not modified 	TokenNameCOMMENT_LINE	case is not modified 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// surrounding whitespace is removed 	TokenNameCOMMENT_LINE	surrounding whitespace is removed 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test stopwords in snowball format */	TokenNameCOMMENT_JAVADOC	 Test stopwords in snowball format 
public	TokenNamepublic	
void	TokenNamevoid	
testSnowballListLoading	TokenNameIdentifier	 test Snowball List Loading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"|comment "	TokenNameStringLiteral	|comment 
+	TokenNamePLUS	
// commented line 	TokenNameCOMMENT_LINE	commented line 
" |comment "	TokenNameStringLiteral	 |comment 
+	TokenNamePLUS	
// commented line with leading whitespace 	TokenNameCOMMENT_LINE	commented line with leading whitespace 
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
// blank line 	TokenNameCOMMENT_LINE	blank line 
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
// line with only whitespace 	TokenNameCOMMENT_LINE	line with only whitespace 
" |comment | comment "	TokenNameStringLiteral	 |comment | comment 
+	TokenNamePLUS	
// commented line with comment 	TokenNameCOMMENT_LINE	commented line with comment 
"ONE "	TokenNameStringLiteral	ONE 
+	TokenNamePLUS	
// stopword, in uppercase 	TokenNameCOMMENT_LINE	stopword, in uppercase 
" two "	TokenNameStringLiteral	 two 
+	TokenNamePLUS	
// stopword with leading/trailing space 	TokenNameCOMMENT_LINE	stopword with leading/trailing space 
" three four five "	TokenNameStringLiteral	 three four five 
+	TokenNamePLUS	
// multiple stopwords 	TokenNameCOMMENT_LINE	multiple stopwords 
"six seven | comment "	TokenNameStringLiteral	six seven | comment 
;	TokenNameSEMICOLON	
//multiple stopwords + comment 	TokenNameCOMMENT_LINE	multiple stopwords + comment 
CharArraySet	TokenNameIdentifier	 Char Array Set
wordset	TokenNameIdentifier	 wordset
=	TokenNameEQUAL	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
.	TokenNameDOT	
getSnowballWordSet	TokenNameIdentifier	 get Snowball Word Set
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"ONE"	TokenNameStringLiteral	ONE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"five"	TokenNameStringLiteral	five
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"six"	TokenNameStringLiteral	six
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordset	TokenNameIdentifier	 wordset
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"seven"	TokenNameStringLiteral	seven
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
