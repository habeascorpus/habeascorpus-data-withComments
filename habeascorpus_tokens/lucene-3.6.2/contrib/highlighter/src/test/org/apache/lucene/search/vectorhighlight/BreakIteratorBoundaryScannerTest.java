package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
vectorhighlight	TokenNameIdentifier	 vectorhighlight
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
public	TokenNamepublic	
class	TokenNameclass	
BreakIteratorBoundaryScannerTest	TokenNameIdentifier	 Break Iterator Boundary Scanner Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT	TokenNameIdentifier	 TEXT
=	TokenNameEQUAL	
"Apache Lucene(TM) is a high-performance, full-featured text search engine library written entirely in Java."	TokenNameStringLiteral	Apache Lucene(TM) is a high-performance, full-featured text search engine library written entirely in Java.
+	TokenNamePLUS	
" It is a technology suitable for nearly any application that requires "	TokenNameStringLiteral	 It is a technology suitable for nearly any application that requires 
+	TokenNamePLUS	
"full-text search, especially cross-platform. Apache Lucene is an open source project available for free download."	TokenNameStringLiteral	full-text search, especially cross-platform. Apache Lucene is an open source project available for free download.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testOutOfRange	TokenNameIdentifier	 test Out Of Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
getWordInstance	TokenNameIdentifier	 get Word Instance
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
BreakIteratorBoundaryScanner	TokenNameIdentifier	 Break Iterator Boundary Scanner
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
findStartOffset	TokenNameIdentifier	 find Start Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
findEndOffset	TokenNameIdentifier	 find End Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
findStartOffset	TokenNameIdentifier	 find Start Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
findEndOffset	TokenNameIdentifier	 find End Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWordBoundary	TokenNameIdentifier	 test Word Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
getWordInstance	TokenNameIdentifier	 get Word Instance
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
BreakIteratorBoundaryScanner	TokenNameIdentifier	 Break Iterator Boundary Scanner
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"formance"	TokenNameStringLiteral	formance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"high-performance"	TokenNameStringLiteral	high-performance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testFindStartOffset	TokenNameIdentifier	 test Find Start Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
", full"	TokenNameStringLiteral	, full
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testFindEndOffset	TokenNameIdentifier	 test Find End Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSentenceBoundary	TokenNameIdentifier	 test Sentence Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
getSentenceInstance	TokenNameIdentifier	 get Sentence Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
BreakIteratorBoundaryScanner	TokenNameIdentifier	 Break Iterator Boundary Scanner
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"any application"	TokenNameStringLiteral	any application
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"It is a"	TokenNameStringLiteral	It is a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testFindStartOffset	TokenNameIdentifier	 test Find Start Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Apache Lucene is an open source"	TokenNameStringLiteral	Apache Lucene is an open source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testFindEndOffset	TokenNameIdentifier	 test Find End Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLineBoundary	TokenNameIdentifier	 test Line Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
getLineInstance	TokenNameIdentifier	 get Line Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
BreakIteratorBoundaryScanner	TokenNameIdentifier	 Break Iterator Boundary Scanner
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"any application"	TokenNameStringLiteral	any application
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"nearly"	TokenNameStringLiteral	nearly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testFindStartOffset	TokenNameIdentifier	 test Find Start Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"application that requires"	TokenNameStringLiteral	application that requires
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testFindEndOffset	TokenNameIdentifier	 test Find End Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testFindStartOffset	TokenNameIdentifier	 test Find Start Offset
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
findStartOffset	TokenNameIdentifier	 find Start Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testFindEndOffset	TokenNameIdentifier	 test Find End Offset
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
findEndOffset	TokenNameIdentifier	 find End Offset
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
