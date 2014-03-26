package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BreakIterator	TokenNameIdentifier	 Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestCharArrayIterator	TokenNameIdentifier	 Test Char Array Iterator
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWordInstance	TokenNameIdentifier	 test Word Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTests	TokenNameIdentifier	 do Tests
(	TokenNameLPAREN	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
.	TokenNameDOT	
newWordInstance	TokenNameIdentifier	 new Word Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConsumeWordInstance	TokenNameIdentifier	 test Consume Word Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
getWordInstance	TokenNameIdentifier	 get Word Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
ci	TokenNameIdentifier	 ci
=	TokenNameEQUAL	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
.	TokenNameDOT	
newWordInstance	TokenNameIdentifier	 new Word Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomUnicodeString	TokenNameIdentifier	 random Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* run this to test if your JRE is buggy public void testWordInstanceJREBUG() { BreakIterator bi = BreakIterator.getWordInstance(); Segment ci = new Segment(); for (int i = 0; i < 10000; i++) { char text[] = _TestUtil.randomUnicodeString(random).toCharArray(); ci.array = text; ci.offset = 0; ci.count = text.length; consume(bi, ci); } } */	TokenNameCOMMENT_BLOCK	 run this to test if your JRE is buggy public void testWordInstanceJREBUG() { BreakIterator bi = BreakIterator.getWordInstance(); Segment ci = new Segment(); for (int i = 0; i < 10000; i++) { char text[] = _TestUtil.randomUnicodeString(random).toCharArray(); ci.array = text; ci.offset = 0; ci.count = text.length; consume(bi, ci); } } 
public	TokenNamepublic	
void	TokenNamevoid	
testSentenceInstance	TokenNameIdentifier	 test Sentence Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTests	TokenNameIdentifier	 do Tests
(	TokenNameLPAREN	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
.	TokenNameDOT	
newSentenceInstance	TokenNameIdentifier	 new Sentence Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConsumeSentenceInstance	TokenNameIdentifier	 test Consume Sentence Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
getSentenceInstance	TokenNameIdentifier	 get Sentence Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
ci	TokenNameIdentifier	 ci
=	TokenNameEQUAL	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
.	TokenNameDOT	
newSentenceInstance	TokenNameIdentifier	 new Sentence Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomUnicodeString	TokenNameIdentifier	 random Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* run this to test if your JRE is buggy public void testSentenceInstanceJREBUG() { BreakIterator bi = BreakIterator.getSentenceInstance(); Segment ci = new Segment(); for (int i = 0; i < 10000; i++) { char text[] = _TestUtil.randomUnicodeString(random).toCharArray(); ci.array = text; ci.offset = 0; ci.count = text.length; consume(bi, ci); } } */	TokenNameCOMMENT_BLOCK	 run this to test if your JRE is buggy public void testSentenceInstanceJREBUG() { BreakIterator bi = BreakIterator.getSentenceInstance(); Segment ci = new Segment(); for (int i = 0; i < 10000; i++) { char text[] = _TestUtil.randomUnicodeString(random).toCharArray(); ci.array = text; ci.offset = 0; ci.count = text.length; consume(bi, ci); } } 
private	TokenNameprivate	
void	TokenNamevoid	
doTests	TokenNameIdentifier	 do Tests
(	TokenNameLPAREN	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// basics 	TokenNameCOMMENT_LINE	basics 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"testing"	TokenNameStringLiteral	testing
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"testing"	TokenNameStringLiteral	testing
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
'g'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first() 	TokenNameCOMMENT_LINE	first() 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"testing"	TokenNameStringLiteral	testing
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"testing"	TokenNameStringLiteral	testing
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Sets the position to getBeginIndex() and returns the character at that position. 	TokenNameCOMMENT_LINE	Sets the position to getBeginIndex() and returns the character at that position. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// or DONE if the text is empty 	TokenNameCOMMENT_LINE	or DONE if the text is empty 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// last() 	TokenNameCOMMENT_LINE	last() 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"testing"	TokenNameStringLiteral	testing
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"testing"	TokenNameStringLiteral	testing
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty) 	TokenNameCOMMENT_LINE	Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty) 
// and returns the character at that position. 	TokenNameCOMMENT_LINE	and returns the character at that position. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
'g'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// or DONE if the text is empty 	TokenNameCOMMENT_LINE	or DONE if the text is empty 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// current() 	TokenNameCOMMENT_LINE	current() 
// Gets the character at the current position (as returned by getIndex()). 	TokenNameCOMMENT_LINE	Gets the character at the current position (as returned by getIndex()). 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"testing"	TokenNameStringLiteral	testing
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"testing"	TokenNameStringLiteral	testing
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// or DONE if the current position is off the end of the text. 	TokenNameCOMMENT_LINE	or DONE if the current position is off the end of the text. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// next() 	TokenNameCOMMENT_LINE	next() 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"te"	TokenNameStringLiteral	te
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Increments the iterator's index by one and returns the character at the new index. 	TokenNameCOMMENT_LINE	Increments the iterator's index by one and returns the character at the new index. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// or DONE if the new position is off the end of the text range. 	TokenNameCOMMENT_LINE	or DONE if the new position is off the end of the text range. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// setIndex() 	TokenNameCOMMENT_LINE	setIndex() 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clone() 	TokenNameCOMMENT_LINE	clone() 
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"testing"	TokenNameStringLiteral	testing
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
ci2	TokenNameIdentifier	 ci2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
)	TokenNameRPAREN	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ci2	TokenNameIdentifier	 ci2
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ci2	TokenNameIdentifier	 ci2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ci2	TokenNameIdentifier	 ci2
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
CharacterIterator	TokenNameIdentifier	 Character Iterator
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
