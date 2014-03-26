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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
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
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
List	TokenNameIdentifier	 List
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestASCIIFoldingFilter	TokenNameIdentifier	 Test ASCII Folding Filter
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
// testLain1Accents() is a copy of TestLatin1AccentFilter.testU(). 	TokenNameCOMMENT_LINE	testLain1Accents() is a copy of TestLatin1AccentFilter.testU(). 
public	TokenNamepublic	
void	TokenNamevoid	
testLatin1Accents	TokenNameIdentifier	 test Latin1 Accents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"Des mot clés À LA CHAÎNE À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ĳ Ð Ñ"	TokenNameStringLiteral	Des mot clés À LA CHAÎNE À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ĳ Ð Ñ
+	TokenNamePLUS	
" Ò Ó Ô Õ Ö Ø Œ Þ Ù Ú Û Ü Ý Ÿ à á â ã ä å æ ç è é ê ë ì í î ï ĳ"	TokenNameStringLiteral	 Ò Ó Ô Õ Ö Ø Œ Þ Ù Ú Û Ü Ý Ÿ à á â ã ä å æ ç è é ê ë ì í î ï ĳ
+	TokenNamePLUS	
" ð ñ ò ó ô õ ö ø œ ß þ ù ú û ü ý ÿ ﬁ ﬂ"	TokenNameStringLiteral	 ð ñ ò ó ô õ ö ø œ ß þ ù ú û ü ý ÿ ﬁ ﬂ
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"Des"	TokenNameStringLiteral	Des
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"mot"	TokenNameStringLiteral	mot
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"cles"	TokenNameStringLiteral	cles
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"LA"	TokenNameStringLiteral	LA
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"CHAINE"	TokenNameStringLiteral	CHAINE
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"AE"	TokenNameStringLiteral	AE
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"E"	TokenNameStringLiteral	E
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"E"	TokenNameStringLiteral	E
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"E"	TokenNameStringLiteral	E
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"E"	TokenNameStringLiteral	E
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"I"	TokenNameStringLiteral	I
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"I"	TokenNameStringLiteral	I
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"I"	TokenNameStringLiteral	I
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"I"	TokenNameStringLiteral	I
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"IJ"	TokenNameStringLiteral	IJ
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"D"	TokenNameStringLiteral	D
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"N"	TokenNameStringLiteral	N
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"O"	TokenNameStringLiteral	O
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"O"	TokenNameStringLiteral	O
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"O"	TokenNameStringLiteral	O
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"O"	TokenNameStringLiteral	O
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"O"	TokenNameStringLiteral	O
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"O"	TokenNameStringLiteral	O
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"OE"	TokenNameStringLiteral	OE
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"TH"	TokenNameStringLiteral	TH
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"U"	TokenNameStringLiteral	U
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"U"	TokenNameStringLiteral	U
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"U"	TokenNameStringLiteral	U
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"U"	TokenNameStringLiteral	U
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"Y"	TokenNameStringLiteral	Y
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"Y"	TokenNameStringLiteral	Y
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"ae"	TokenNameStringLiteral	ae
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"ij"	TokenNameStringLiteral	ij
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"n"	TokenNameStringLiteral	n
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"o"	TokenNameStringLiteral	o
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"o"	TokenNameStringLiteral	o
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"o"	TokenNameStringLiteral	o
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"o"	TokenNameStringLiteral	o
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"o"	TokenNameStringLiteral	o
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"o"	TokenNameStringLiteral	o
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"oe"	TokenNameStringLiteral	oe
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"ss"	TokenNameStringLiteral	ss
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"th"	TokenNameStringLiteral	th
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"u"	TokenNameStringLiteral	u
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"u"	TokenNameStringLiteral	u
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"u"	TokenNameStringLiteral	u
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"u"	TokenNameStringLiteral	u
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"y"	TokenNameStringLiteral	y
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"y"	TokenNameStringLiteral	y
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"fi"	TokenNameStringLiteral	fi
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
"fl"	TokenNameStringLiteral	fl
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The following Perl script generated the foldings[] array automatically 	TokenNameCOMMENT_LINE	The following Perl script generated the foldings[] array automatically 
// from ASCIIFoldingFilter.java: 	TokenNameCOMMENT_LINE	from ASCIIFoldingFilter.java: 
// 	TokenNameCOMMENT_LINE	 
// ============== begin get.test.cases.pl ============== 	TokenNameCOMMENT_LINE	============== begin get.test.cases.pl ============== 
// 	TokenNameCOMMENT_LINE	 
// use strict; 	TokenNameCOMMENT_LINE	use strict; 
// use warnings; 	TokenNameCOMMENT_LINE	use warnings; 
// 	TokenNameCOMMENT_LINE	 
// my $file = "ASCIIFoldingFilter.java"; 	TokenNameCOMMENT_LINE	my $file = "ASCIIFoldingFilter.java"; 
// my $output = "testcases.txt"; 	TokenNameCOMMENT_LINE	my $output = "testcases.txt"; 
// my %codes = (); 	TokenNameCOMMENT_LINE	my %codes = (); 
// my $folded = ''; 	TokenNameCOMMENT_LINE	my $folded = ''; 
// 	TokenNameCOMMENT_LINE	 
// open IN, "<:utf8", $file || die "Error opening input file '$file': $!"; 	TokenNameCOMMENT_LINE	open IN, "<:utf8", $file || die "Error opening input file '$file': $!"; 
// open OUT, ">:utf8", $output || die "Error opening output file '$output': $!"; 	TokenNameCOMMENT_LINE	open OUT, ">:utf8", $output || die "Error opening output file '$output': $!"; 
// 	TokenNameCOMMENT_LINE	 
// while (my $line = <IN>) { 	TokenNameCOMMENT_LINE	while (my $line = <IN>) { 
// chomp($line); 	TokenNameCOMMENT_LINE	chomp($line); 
// # case '?	TokenNameCOMMENT_LINE	# case '?
// if ($line =~ /case\s+'\\u(....)':.*\[([^\]]+)\]/) { 	TokenNameCOMMENT_LINE	if ($line =~ /case\s+'\\u(....)':.*\[([^\]]+)\]/) { 
// my $code = $1; 	TokenNameCOMMENT_LINE	my $code = $1; 
// my $desc = $2; 	TokenNameCOMMENT_LINE	my $desc = $2; 
// $codes{$code} = $desc; 	TokenNameCOMMENT_LINE	$codes{$code} = $desc; 
// } 	TokenNameCOMMENT_LINE	} 
// # output[outputPos++] = 'A'; 	TokenNameCOMMENT_LINE	# output[outputPos++] = 'A'; 
// elsif ($line =~ /output\[outputPos\+\+\] = '(.+)';/) { 	TokenNameCOMMENT_LINE	elsif ($line =~ /output\[outputPos\+\+\] = '(.+)';/) { 
// my $output_char = $1; 	TokenNameCOMMENT_LINE	my $output_char = $1; 
// $folded .= $output_char; 	TokenNameCOMMENT_LINE	$folded .= $output_char; 
// } 	TokenNameCOMMENT_LINE	} 
// elsif ($line =~ /break;/ && length($folded) > 0) { 	TokenNameCOMMENT_LINE	elsif ($line =~ /break;/ && length($folded) > 0) { 
// my $first = 1; 	TokenNameCOMMENT_LINE	my $first = 1; 
// for my $code (sort { hex($a) <=> hex($b) } keys %codes) { 	TokenNameCOMMENT_LINE	for my $code (sort { hex($a) <=> hex($b) } keys %codes) { 
// my $desc = $codes{$code}; 	TokenNameCOMMENT_LINE	my $desc = $codes{$code}; 
// print OUT ' '; 	TokenNameCOMMENT_LINE	print OUT ' '; 
// print OUT '+ ' if (not $first); 	TokenNameCOMMENT_LINE	print OUT '+ ' if (not $first); 
// $first = 0; 	TokenNameCOMMENT_LINE	$first = 0; 
// print OUT '"', chr(hex($code)), qq!" // U+$code: $desc\n!; 	TokenNameCOMMENT_LINE	print OUT '"', chr(hex($code)), qq!" // U+$code: $desc\n!; 
// } 	TokenNameCOMMENT_LINE	} 
// print OUT qq! ,"$folded", // Folded result\n\n!; 	TokenNameCOMMENT_LINE	print OUT qq! ,"$folded", // Folded result\n\n!; 
// %codes = (); 	TokenNameCOMMENT_LINE	%codes = (); 
// $folded = ''; 	TokenNameCOMMENT_LINE	$folded = ''; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// close OUT; 	TokenNameCOMMENT_LINE	close OUT; 
// 	TokenNameCOMMENT_LINE	 
// ============== end get.test.cases.pl ============== 	TokenNameCOMMENT_LINE	============== end get.test.cases.pl ============== 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
testAllFoldings	TokenNameIdentifier	 test All Foldings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Alternating strings of: 	TokenNameCOMMENT_LINE	Alternating strings of: 
// 1. All non-ASCII characters to be folded, concatenated together as a 	TokenNameCOMMENT_LINE	1. All non-ASCII characters to be folded, concatenated together as a 
// single string. 	TokenNameCOMMENT_LINE	single string. 
// 2. The string of ASCII characters to which each of the above 	TokenNameCOMMENT_LINE	2. The string of ASCII characters to which each of the above 
// characters should be folded. 	TokenNameCOMMENT_LINE	characters should be folded. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
foldings	TokenNameIdentifier	 foldings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"À"	TokenNameStringLiteral	À
// U+00C0: LATIN CAPITAL LETTER A WITH GRAVE 	TokenNameCOMMENT_LINE	U+00C0: LATIN CAPITAL LETTER A WITH GRAVE 
+	TokenNamePLUS	
"Á"	TokenNameStringLiteral	Á
// U+00C1: LATIN CAPITAL LETTER A WITH ACUTE 	TokenNameCOMMENT_LINE	U+00C1: LATIN CAPITAL LETTER A WITH ACUTE 
+	TokenNamePLUS	
"Â"	TokenNameStringLiteral	Â
// U+00C2: LATIN CAPITAL LETTER A WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00C2: LATIN CAPITAL LETTER A WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ã"	TokenNameStringLiteral	Ã
// U+00C3: LATIN CAPITAL LETTER A WITH TILDE 	TokenNameCOMMENT_LINE	U+00C3: LATIN CAPITAL LETTER A WITH TILDE 
+	TokenNamePLUS	
"Ä"	TokenNameStringLiteral	Ä
// U+00C4: LATIN CAPITAL LETTER A WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00C4: LATIN CAPITAL LETTER A WITH DIAERESIS 
+	TokenNamePLUS	
"Å"	TokenNameStringLiteral	Å
// U+00C5: LATIN CAPITAL LETTER A WITH RING ABOVE 	TokenNameCOMMENT_LINE	U+00C5: LATIN CAPITAL LETTER A WITH RING ABOVE 
+	TokenNamePLUS	
"Ā"	TokenNameStringLiteral	Ā
// U+0100: LATIN CAPITAL LETTER A WITH MACRON 	TokenNameCOMMENT_LINE	U+0100: LATIN CAPITAL LETTER A WITH MACRON 
+	TokenNamePLUS	
"Ă"	TokenNameStringLiteral	Ă
// U+0102: LATIN CAPITAL LETTER A WITH BREVE 	TokenNameCOMMENT_LINE	U+0102: LATIN CAPITAL LETTER A WITH BREVE 
+	TokenNamePLUS	
"Ą"	TokenNameStringLiteral	Ą
// U+0104: LATIN CAPITAL LETTER A WITH OGONEK 	TokenNameCOMMENT_LINE	U+0104: LATIN CAPITAL LETTER A WITH OGONEK 
+	TokenNamePLUS	
"Ə"	TokenNameStringLiteral	Ə
// U+018F: LATIN CAPITAL LETTER SCHWA 	TokenNameCOMMENT_LINE	U+018F: LATIN CAPITAL LETTER SCHWA 
+	TokenNamePLUS	
"Ǎ"	TokenNameStringLiteral	Ǎ
// U+01CD: LATIN CAPITAL LETTER A WITH CARON 	TokenNameCOMMENT_LINE	U+01CD: LATIN CAPITAL LETTER A WITH CARON 
+	TokenNamePLUS	
"Ǟ"	TokenNameStringLiteral	Ǟ
// U+01DE: LATIN CAPITAL LETTER A WITH DIAERESIS AND MACRON 	TokenNameCOMMENT_LINE	U+01DE: LATIN CAPITAL LETTER A WITH DIAERESIS AND MACRON 
+	TokenNamePLUS	
"Ǡ"	TokenNameStringLiteral	Ǡ
// U+01E0: LATIN CAPITAL LETTER A WITH DOT ABOVE AND MACRON 	TokenNameCOMMENT_LINE	U+01E0: LATIN CAPITAL LETTER A WITH DOT ABOVE AND MACRON 
+	TokenNamePLUS	
"Ǻ"	TokenNameStringLiteral	Ǻ
// U+01FA: LATIN CAPITAL LETTER A WITH RING ABOVE AND ACUTE 	TokenNameCOMMENT_LINE	U+01FA: LATIN CAPITAL LETTER A WITH RING ABOVE AND ACUTE 
+	TokenNamePLUS	
"Ȁ"	TokenNameStringLiteral	Ȁ
// U+0200: LATIN CAPITAL LETTER A WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0200: LATIN CAPITAL LETTER A WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"Ȃ"	TokenNameStringLiteral	Ȃ
// U+0202: LATIN CAPITAL LETTER A WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+0202: LATIN CAPITAL LETTER A WITH INVERTED BREVE 
+	TokenNamePLUS	
"Ȧ"	TokenNameStringLiteral	Ȧ
// U+0226: LATIN CAPITAL LETTER A WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+0226: LATIN CAPITAL LETTER A WITH DOT ABOVE 
+	TokenNamePLUS	
"Ⱥ"	TokenNameStringLiteral	Ⱥ
// U+023A: LATIN CAPITAL LETTER A WITH STROKE 	TokenNameCOMMENT_LINE	U+023A: LATIN CAPITAL LETTER A WITH STROKE 
+	TokenNamePLUS	
"ᴀ"	TokenNameStringLiteral	ᴀ
// U+1D00: LATIN LETTER SMALL CAPITAL A 	TokenNameCOMMENT_LINE	U+1D00: LATIN LETTER SMALL CAPITAL A 
+	TokenNamePLUS	
"Ḁ"	TokenNameStringLiteral	Ḁ
// U+1E00: LATIN CAPITAL LETTER A WITH RING BELOW 	TokenNameCOMMENT_LINE	U+1E00: LATIN CAPITAL LETTER A WITH RING BELOW 
+	TokenNamePLUS	
"Ạ"	TokenNameStringLiteral	Ạ
// U+1EA0: LATIN CAPITAL LETTER A WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1EA0: LATIN CAPITAL LETTER A WITH DOT BELOW 
+	TokenNamePLUS	
"Ả"	TokenNameStringLiteral	Ả
// U+1EA2: LATIN CAPITAL LETTER A WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EA2: LATIN CAPITAL LETTER A WITH HOOK ABOVE 
+	TokenNamePLUS	
"Ấ"	TokenNameStringLiteral	Ấ
// U+1EA4: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND ACUTE 	TokenNameCOMMENT_LINE	U+1EA4: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND ACUTE 
+	TokenNamePLUS	
"Ầ"	TokenNameStringLiteral	Ầ
// U+1EA6: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND GRAVE 	TokenNameCOMMENT_LINE	U+1EA6: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND GRAVE 
+	TokenNamePLUS	
"Ẩ"	TokenNameStringLiteral	Ẩ
// U+1EA8: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EA8: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND HOOK ABOVE 
+	TokenNamePLUS	
"Ẫ"	TokenNameStringLiteral	Ẫ
// U+1EAA: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND TILDE 	TokenNameCOMMENT_LINE	U+1EAA: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND TILDE 
+	TokenNamePLUS	
"Ậ"	TokenNameStringLiteral	Ậ
// U+1EAC: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EAC: LATIN CAPITAL LETTER A WITH CIRCUMFLEX AND DOT BELOW 
+	TokenNamePLUS	
"Ắ"	TokenNameStringLiteral	Ắ
// U+1EAE: LATIN CAPITAL LETTER A WITH BREVE AND ACUTE 	TokenNameCOMMENT_LINE	U+1EAE: LATIN CAPITAL LETTER A WITH BREVE AND ACUTE 
+	TokenNamePLUS	
"Ằ"	TokenNameStringLiteral	Ằ
// U+1EB0: LATIN CAPITAL LETTER A WITH BREVE AND GRAVE 	TokenNameCOMMENT_LINE	U+1EB0: LATIN CAPITAL LETTER A WITH BREVE AND GRAVE 
+	TokenNamePLUS	
"Ẳ"	TokenNameStringLiteral	Ẳ
// U+1EB2: LATIN CAPITAL LETTER A WITH BREVE AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EB2: LATIN CAPITAL LETTER A WITH BREVE AND HOOK ABOVE 
+	TokenNamePLUS	
"Ẵ"	TokenNameStringLiteral	Ẵ
// U+1EB4: LATIN CAPITAL LETTER A WITH BREVE AND TILDE 	TokenNameCOMMENT_LINE	U+1EB4: LATIN CAPITAL LETTER A WITH BREVE AND TILDE 
+	TokenNamePLUS	
"Ặ"	TokenNameStringLiteral	Ặ
// U+1EB6: LATIN CAPITAL LETTER A WITH BREVE AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EB6: LATIN CAPITAL LETTER A WITH BREVE AND DOT BELOW 
+	TokenNamePLUS	
"Ⓐ"	TokenNameStringLiteral	Ⓐ
// U+24B6: CIRCLED LATIN CAPITAL LETTER A 	TokenNameCOMMENT_LINE	U+24B6: CIRCLED LATIN CAPITAL LETTER A 
+	TokenNamePLUS	
"Ａ"	TokenNameStringLiteral	Ａ
// U+FF21: FULLWIDTH LATIN CAPITAL LETTER A 	TokenNameCOMMENT_LINE	U+FF21: FULLWIDTH LATIN CAPITAL LETTER A 
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"à"	TokenNameStringLiteral	à
// U+00E0: LATIN SMALL LETTER A WITH GRAVE 	TokenNameCOMMENT_LINE	U+00E0: LATIN SMALL LETTER A WITH GRAVE 
+	TokenNamePLUS	
"á"	TokenNameStringLiteral	á
// U+00E1: LATIN SMALL LETTER A WITH ACUTE 	TokenNameCOMMENT_LINE	U+00E1: LATIN SMALL LETTER A WITH ACUTE 
+	TokenNamePLUS	
"â"	TokenNameStringLiteral	â
// U+00E2: LATIN SMALL LETTER A WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00E2: LATIN SMALL LETTER A WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ã"	TokenNameStringLiteral	ã
// U+00E3: LATIN SMALL LETTER A WITH TILDE 	TokenNameCOMMENT_LINE	U+00E3: LATIN SMALL LETTER A WITH TILDE 
+	TokenNamePLUS	
"ä"	TokenNameStringLiteral	ä
// U+00E4: LATIN SMALL LETTER A WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00E4: LATIN SMALL LETTER A WITH DIAERESIS 
+	TokenNamePLUS	
"å"	TokenNameStringLiteral	å
// U+00E5: LATIN SMALL LETTER A WITH RING ABOVE 	TokenNameCOMMENT_LINE	U+00E5: LATIN SMALL LETTER A WITH RING ABOVE 
+	TokenNamePLUS	
"ā"	TokenNameStringLiteral	ā
// U+0101: LATIN SMALL LETTER A WITH MACRON 	TokenNameCOMMENT_LINE	U+0101: LATIN SMALL LETTER A WITH MACRON 
+	TokenNamePLUS	
"ă"	TokenNameStringLiteral	ă
// U+0103: LATIN SMALL LETTER A WITH BREVE 	TokenNameCOMMENT_LINE	U+0103: LATIN SMALL LETTER A WITH BREVE 
+	TokenNamePLUS	
"ą"	TokenNameStringLiteral	ą
// U+0105: LATIN SMALL LETTER A WITH OGONEK 	TokenNameCOMMENT_LINE	U+0105: LATIN SMALL LETTER A WITH OGONEK 
+	TokenNamePLUS	
"ǎ"	TokenNameStringLiteral	ǎ
// U+01CE: LATIN SMALL LETTER A WITH CARON 	TokenNameCOMMENT_LINE	U+01CE: LATIN SMALL LETTER A WITH CARON 
+	TokenNamePLUS	
"ǟ"	TokenNameStringLiteral	ǟ
// U+01DF: LATIN SMALL LETTER A WITH DIAERESIS AND MACRON 	TokenNameCOMMENT_LINE	U+01DF: LATIN SMALL LETTER A WITH DIAERESIS AND MACRON 
+	TokenNamePLUS	
"ǡ"	TokenNameStringLiteral	ǡ
// U+01E1: LATIN SMALL LETTER A WITH DOT ABOVE AND MACRON 	TokenNameCOMMENT_LINE	U+01E1: LATIN SMALL LETTER A WITH DOT ABOVE AND MACRON 
+	TokenNamePLUS	
"ǻ"	TokenNameStringLiteral	ǻ
// U+01FB: LATIN SMALL LETTER A WITH RING ABOVE AND ACUTE 	TokenNameCOMMENT_LINE	U+01FB: LATIN SMALL LETTER A WITH RING ABOVE AND ACUTE 
+	TokenNamePLUS	
"ȁ"	TokenNameStringLiteral	ȁ
// U+0201: LATIN SMALL LETTER A WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0201: LATIN SMALL LETTER A WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"ȃ"	TokenNameStringLiteral	ȃ
// U+0203: LATIN SMALL LETTER A WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+0203: LATIN SMALL LETTER A WITH INVERTED BREVE 
+	TokenNamePLUS	
"ȧ"	TokenNameStringLiteral	ȧ
// U+0227: LATIN SMALL LETTER A WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+0227: LATIN SMALL LETTER A WITH DOT ABOVE 
+	TokenNamePLUS	
"ɐ"	TokenNameStringLiteral	ɐ
// U+0250: LATIN SMALL LETTER TURNED A 	TokenNameCOMMENT_LINE	U+0250: LATIN SMALL LETTER TURNED A 
+	TokenNamePLUS	
"ə"	TokenNameStringLiteral	ə
// U+0259: LATIN SMALL LETTER SCHWA 	TokenNameCOMMENT_LINE	U+0259: LATIN SMALL LETTER SCHWA 
+	TokenNamePLUS	
"ɚ"	TokenNameStringLiteral	ɚ
// U+025A: LATIN SMALL LETTER SCHWA WITH HOOK 	TokenNameCOMMENT_LINE	U+025A: LATIN SMALL LETTER SCHWA WITH HOOK 
+	TokenNamePLUS	
"ᶏ"	TokenNameStringLiteral	ᶏ
// U+1D8F: LATIN SMALL LETTER A WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+1D8F: LATIN SMALL LETTER A WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ḁ"	TokenNameStringLiteral	ḁ
// U+1E01: LATIN SMALL LETTER A WITH RING BELOW 	TokenNameCOMMENT_LINE	U+1E01: LATIN SMALL LETTER A WITH RING BELOW 
+	TokenNamePLUS	
"ᶕ"	TokenNameStringLiteral	ᶕ
// U+1D95: LATIN SMALL LETTER SCHWA WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+1D95: LATIN SMALL LETTER SCHWA WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ẚ"	TokenNameStringLiteral	ẚ
// U+1E9A: LATIN SMALL LETTER A WITH RIGHT HALF RING 	TokenNameCOMMENT_LINE	U+1E9A: LATIN SMALL LETTER A WITH RIGHT HALF RING 
+	TokenNamePLUS	
"ạ"	TokenNameStringLiteral	ạ
// U+1EA1: LATIN SMALL LETTER A WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1EA1: LATIN SMALL LETTER A WITH DOT BELOW 
+	TokenNamePLUS	
"ả"	TokenNameStringLiteral	ả
// U+1EA3: LATIN SMALL LETTER A WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EA3: LATIN SMALL LETTER A WITH HOOK ABOVE 
+	TokenNamePLUS	
"ấ"	TokenNameStringLiteral	ấ
// U+1EA5: LATIN SMALL LETTER A WITH CIRCUMFLEX AND ACUTE 	TokenNameCOMMENT_LINE	U+1EA5: LATIN SMALL LETTER A WITH CIRCUMFLEX AND ACUTE 
+	TokenNamePLUS	
"ầ"	TokenNameStringLiteral	ầ
// U+1EA7: LATIN SMALL LETTER A WITH CIRCUMFLEX AND GRAVE 	TokenNameCOMMENT_LINE	U+1EA7: LATIN SMALL LETTER A WITH CIRCUMFLEX AND GRAVE 
+	TokenNamePLUS	
"ẩ"	TokenNameStringLiteral	ẩ
// U+1EA9: LATIN SMALL LETTER A WITH CIRCUMFLEX AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EA9: LATIN SMALL LETTER A WITH CIRCUMFLEX AND HOOK ABOVE 
+	TokenNamePLUS	
"ẫ"	TokenNameStringLiteral	ẫ
// U+1EAB: LATIN SMALL LETTER A WITH CIRCUMFLEX AND TILDE 	TokenNameCOMMENT_LINE	U+1EAB: LATIN SMALL LETTER A WITH CIRCUMFLEX AND TILDE 
+	TokenNamePLUS	
"ậ"	TokenNameStringLiteral	ậ
// U+1EAD: LATIN SMALL LETTER A WITH CIRCUMFLEX AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EAD: LATIN SMALL LETTER A WITH CIRCUMFLEX AND DOT BELOW 
+	TokenNamePLUS	
"ắ"	TokenNameStringLiteral	ắ
// U+1EAF: LATIN SMALL LETTER A WITH BREVE AND ACUTE 	TokenNameCOMMENT_LINE	U+1EAF: LATIN SMALL LETTER A WITH BREVE AND ACUTE 
+	TokenNamePLUS	
"ằ"	TokenNameStringLiteral	ằ
// U+1EB1: LATIN SMALL LETTER A WITH BREVE AND GRAVE 	TokenNameCOMMENT_LINE	U+1EB1: LATIN SMALL LETTER A WITH BREVE AND GRAVE 
+	TokenNamePLUS	
"ẳ"	TokenNameStringLiteral	ẳ
// U+1EB3: LATIN SMALL LETTER A WITH BREVE AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EB3: LATIN SMALL LETTER A WITH BREVE AND HOOK ABOVE 
+	TokenNamePLUS	
"ẵ"	TokenNameStringLiteral	ẵ
// U+1EB5: LATIN SMALL LETTER A WITH BREVE AND TILDE 	TokenNameCOMMENT_LINE	U+1EB5: LATIN SMALL LETTER A WITH BREVE AND TILDE 
+	TokenNamePLUS	
"ặ"	TokenNameStringLiteral	ặ
// U+1EB7: LATIN SMALL LETTER A WITH BREVE AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EB7: LATIN SMALL LETTER A WITH BREVE AND DOT BELOW 
+	TokenNamePLUS	
"ₐ"	TokenNameStringLiteral	ₐ
// U+2090: LATIN SUBSCRIPT SMALL LETTER A 	TokenNameCOMMENT_LINE	U+2090: LATIN SUBSCRIPT SMALL LETTER A 
+	TokenNamePLUS	
"ₔ"	TokenNameStringLiteral	ₔ
// U+2094: LATIN SUBSCRIPT SMALL LETTER SCHWA 	TokenNameCOMMENT_LINE	U+2094: LATIN SUBSCRIPT SMALL LETTER SCHWA 
+	TokenNamePLUS	
"ⓐ"	TokenNameStringLiteral	ⓐ
// U+24D0: CIRCLED LATIN SMALL LETTER A 	TokenNameCOMMENT_LINE	U+24D0: CIRCLED LATIN SMALL LETTER A 
+	TokenNamePLUS	
"ⱥ"	TokenNameStringLiteral	ⱥ
// U+2C65: LATIN SMALL LETTER A WITH STROKE 	TokenNameCOMMENT_LINE	U+2C65: LATIN SMALL LETTER A WITH STROKE 
+	TokenNamePLUS	
"Ɐ"	TokenNameStringLiteral	Ɐ
// U+2C6F: LATIN CAPITAL LETTER TURNED A 	TokenNameCOMMENT_LINE	U+2C6F: LATIN CAPITAL LETTER TURNED A 
+	TokenNamePLUS	
"ａ"	TokenNameStringLiteral	ａ
// U+FF41: FULLWIDTH LATIN SMALL LETTER A 	TokenNameCOMMENT_LINE	U+FF41: FULLWIDTH LATIN SMALL LETTER A 
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ꜳ"	TokenNameStringLiteral	Ꜳ
// U+A732: LATIN CAPITAL LETTER AA 	TokenNameCOMMENT_LINE	U+A732: LATIN CAPITAL LETTER AA 
,	TokenNameCOMMA	
"AA"	TokenNameStringLiteral	AA
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Æ"	TokenNameStringLiteral	Æ
// U+00C6: LATIN CAPITAL LETTER AE 	TokenNameCOMMENT_LINE	U+00C6: LATIN CAPITAL LETTER AE 
+	TokenNamePLUS	
"Ǣ"	TokenNameStringLiteral	Ǣ
// U+01E2: LATIN CAPITAL LETTER AE WITH MACRON 	TokenNameCOMMENT_LINE	U+01E2: LATIN CAPITAL LETTER AE WITH MACRON 
+	TokenNamePLUS	
"Ǽ"	TokenNameStringLiteral	Ǽ
// U+01FC: LATIN CAPITAL LETTER AE WITH ACUTE 	TokenNameCOMMENT_LINE	U+01FC: LATIN CAPITAL LETTER AE WITH ACUTE 
+	TokenNamePLUS	
"ᴁ"	TokenNameStringLiteral	ᴁ
// U+1D01: LATIN LETTER SMALL CAPITAL AE 	TokenNameCOMMENT_LINE	U+1D01: LATIN LETTER SMALL CAPITAL AE 
,	TokenNameCOMMA	
"AE"	TokenNameStringLiteral	AE
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ꜵ"	TokenNameStringLiteral	Ꜵ
// U+A734: LATIN CAPITAL LETTER AO 	TokenNameCOMMENT_LINE	U+A734: LATIN CAPITAL LETTER AO 
,	TokenNameCOMMA	
"AO"	TokenNameStringLiteral	AO
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ꜷ"	TokenNameStringLiteral	Ꜷ
// U+A736: LATIN CAPITAL LETTER AU 	TokenNameCOMMENT_LINE	U+A736: LATIN CAPITAL LETTER AU 
,	TokenNameCOMMA	
"AU"	TokenNameStringLiteral	AU
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ꜹ"	TokenNameStringLiteral	Ꜹ
// U+A738: LATIN CAPITAL LETTER AV 	TokenNameCOMMENT_LINE	U+A738: LATIN CAPITAL LETTER AV 
+	TokenNamePLUS	
"Ꜻ"	TokenNameStringLiteral	Ꜻ
// U+A73A: LATIN CAPITAL LETTER AV WITH HORIZONTAL BAR 	TokenNameCOMMENT_LINE	U+A73A: LATIN CAPITAL LETTER AV WITH HORIZONTAL BAR 
,	TokenNameCOMMA	
"AV"	TokenNameStringLiteral	AV
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ꜽ"	TokenNameStringLiteral	Ꜽ
// U+A73C: LATIN CAPITAL LETTER AY 	TokenNameCOMMENT_LINE	U+A73C: LATIN CAPITAL LETTER AY 
,	TokenNameCOMMA	
"AY"	TokenNameStringLiteral	AY
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒜"	TokenNameStringLiteral	⒜
// U+249C: PARENTHESIZED LATIN SMALL LETTER A 	TokenNameCOMMENT_LINE	U+249C: PARENTHESIZED LATIN SMALL LETTER A 
,	TokenNameCOMMA	
"(a)"	TokenNameStringLiteral	(a)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ꜳ"	TokenNameStringLiteral	ꜳ
// U+A733: LATIN SMALL LETTER AA 	TokenNameCOMMENT_LINE	U+A733: LATIN SMALL LETTER AA 
,	TokenNameCOMMA	
"aa"	TokenNameStringLiteral	aa
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"æ"	TokenNameStringLiteral	æ
// U+00E6: LATIN SMALL LETTER AE 	TokenNameCOMMENT_LINE	U+00E6: LATIN SMALL LETTER AE 
+	TokenNamePLUS	
"ǣ"	TokenNameStringLiteral	ǣ
// U+01E3: LATIN SMALL LETTER AE WITH MACRON 	TokenNameCOMMENT_LINE	U+01E3: LATIN SMALL LETTER AE WITH MACRON 
+	TokenNamePLUS	
"ǽ"	TokenNameStringLiteral	ǽ
// U+01FD: LATIN SMALL LETTER AE WITH ACUTE 	TokenNameCOMMENT_LINE	U+01FD: LATIN SMALL LETTER AE WITH ACUTE 
+	TokenNamePLUS	
"ᴂ"	TokenNameStringLiteral	ᴂ
// U+1D02: LATIN SMALL LETTER TURNED AE 	TokenNameCOMMENT_LINE	U+1D02: LATIN SMALL LETTER TURNED AE 
,	TokenNameCOMMA	
"ae"	TokenNameStringLiteral	ae
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ꜵ"	TokenNameStringLiteral	ꜵ
// U+A735: LATIN SMALL LETTER AO 	TokenNameCOMMENT_LINE	U+A735: LATIN SMALL LETTER AO 
,	TokenNameCOMMA	
"ao"	TokenNameStringLiteral	ao
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ꜷ"	TokenNameStringLiteral	ꜷ
// U+A737: LATIN SMALL LETTER AU 	TokenNameCOMMENT_LINE	U+A737: LATIN SMALL LETTER AU 
,	TokenNameCOMMA	
"au"	TokenNameStringLiteral	au
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ꜹ"	TokenNameStringLiteral	ꜹ
// U+A739: LATIN SMALL LETTER AV 	TokenNameCOMMENT_LINE	U+A739: LATIN SMALL LETTER AV 
+	TokenNamePLUS	
"ꜻ"	TokenNameStringLiteral	ꜻ
// U+A73B: LATIN SMALL LETTER AV WITH HORIZONTAL BAR 	TokenNameCOMMENT_LINE	U+A73B: LATIN SMALL LETTER AV WITH HORIZONTAL BAR 
,	TokenNameCOMMA	
"av"	TokenNameStringLiteral	av
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ꜽ"	TokenNameStringLiteral	ꜽ
// U+A73D: LATIN SMALL LETTER AY 	TokenNameCOMMENT_LINE	U+A73D: LATIN SMALL LETTER AY 
,	TokenNameCOMMA	
"ay"	TokenNameStringLiteral	ay
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ɓ"	TokenNameStringLiteral	Ɓ
// U+0181: LATIN CAPITAL LETTER B WITH HOOK 	TokenNameCOMMENT_LINE	U+0181: LATIN CAPITAL LETTER B WITH HOOK 
+	TokenNamePLUS	
"Ƃ"	TokenNameStringLiteral	Ƃ
// U+0182: LATIN CAPITAL LETTER B WITH TOPBAR 	TokenNameCOMMENT_LINE	U+0182: LATIN CAPITAL LETTER B WITH TOPBAR 
+	TokenNamePLUS	
"Ƀ"	TokenNameStringLiteral	Ƀ
// U+0243: LATIN CAPITAL LETTER B WITH STROKE 	TokenNameCOMMENT_LINE	U+0243: LATIN CAPITAL LETTER B WITH STROKE 
+	TokenNamePLUS	
"ʙ"	TokenNameStringLiteral	ʙ
// U+0299: LATIN LETTER SMALL CAPITAL B 	TokenNameCOMMENT_LINE	U+0299: LATIN LETTER SMALL CAPITAL B 
+	TokenNamePLUS	
"ᴃ"	TokenNameStringLiteral	ᴃ
// U+1D03: LATIN LETTER SMALL CAPITAL BARRED B 	TokenNameCOMMENT_LINE	U+1D03: LATIN LETTER SMALL CAPITAL BARRED B 
+	TokenNamePLUS	
"Ḃ"	TokenNameStringLiteral	Ḃ
// U+1E02: LATIN CAPITAL LETTER B WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E02: LATIN CAPITAL LETTER B WITH DOT ABOVE 
+	TokenNamePLUS	
"Ḅ"	TokenNameStringLiteral	Ḅ
// U+1E04: LATIN CAPITAL LETTER B WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E04: LATIN CAPITAL LETTER B WITH DOT BELOW 
+	TokenNamePLUS	
"Ḇ"	TokenNameStringLiteral	Ḇ
// U+1E06: LATIN CAPITAL LETTER B WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E06: LATIN CAPITAL LETTER B WITH LINE BELOW 
+	TokenNamePLUS	
"Ⓑ"	TokenNameStringLiteral	Ⓑ
// U+24B7: CIRCLED LATIN CAPITAL LETTER B 	TokenNameCOMMENT_LINE	U+24B7: CIRCLED LATIN CAPITAL LETTER B 
+	TokenNamePLUS	
"Ｂ"	TokenNameStringLiteral	Ｂ
// U+FF22: FULLWIDTH LATIN CAPITAL LETTER B 	TokenNameCOMMENT_LINE	U+FF22: FULLWIDTH LATIN CAPITAL LETTER B 
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ƀ"	TokenNameStringLiteral	ƀ
// U+0180: LATIN SMALL LETTER B WITH STROKE 	TokenNameCOMMENT_LINE	U+0180: LATIN SMALL LETTER B WITH STROKE 
+	TokenNamePLUS	
"ƃ"	TokenNameStringLiteral	ƃ
// U+0183: LATIN SMALL LETTER B WITH TOPBAR 	TokenNameCOMMENT_LINE	U+0183: LATIN SMALL LETTER B WITH TOPBAR 
+	TokenNamePLUS	
"ɓ"	TokenNameStringLiteral	ɓ
// U+0253: LATIN SMALL LETTER B WITH HOOK 	TokenNameCOMMENT_LINE	U+0253: LATIN SMALL LETTER B WITH HOOK 
+	TokenNamePLUS	
"ᵬ"	TokenNameStringLiteral	ᵬ
// U+1D6C: LATIN SMALL LETTER B WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D6C: LATIN SMALL LETTER B WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ᶀ"	TokenNameStringLiteral	ᶀ
// U+1D80: LATIN SMALL LETTER B WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D80: LATIN SMALL LETTER B WITH PALATAL HOOK 
+	TokenNamePLUS	
"ḃ"	TokenNameStringLiteral	ḃ
// U+1E03: LATIN SMALL LETTER B WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E03: LATIN SMALL LETTER B WITH DOT ABOVE 
+	TokenNamePLUS	
"ḅ"	TokenNameStringLiteral	ḅ
// U+1E05: LATIN SMALL LETTER B WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E05: LATIN SMALL LETTER B WITH DOT BELOW 
+	TokenNamePLUS	
"ḇ"	TokenNameStringLiteral	ḇ
// U+1E07: LATIN SMALL LETTER B WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E07: LATIN SMALL LETTER B WITH LINE BELOW 
+	TokenNamePLUS	
"ⓑ"	TokenNameStringLiteral	ⓑ
// U+24D1: CIRCLED LATIN SMALL LETTER B 	TokenNameCOMMENT_LINE	U+24D1: CIRCLED LATIN SMALL LETTER B 
+	TokenNamePLUS	
"ｂ"	TokenNameStringLiteral	ｂ
// U+FF42: FULLWIDTH LATIN SMALL LETTER B 	TokenNameCOMMENT_LINE	U+FF42: FULLWIDTH LATIN SMALL LETTER B 
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒝"	TokenNameStringLiteral	⒝
// U+249D: PARENTHESIZED LATIN SMALL LETTER B 	TokenNameCOMMENT_LINE	U+249D: PARENTHESIZED LATIN SMALL LETTER B 
,	TokenNameCOMMA	
"(b)"	TokenNameStringLiteral	(b)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ç"	TokenNameStringLiteral	Ç
// U+00C7: LATIN CAPITAL LETTER C WITH CEDILLA 	TokenNameCOMMENT_LINE	U+00C7: LATIN CAPITAL LETTER C WITH CEDILLA 
+	TokenNamePLUS	
"Ć"	TokenNameStringLiteral	Ć
// U+0106: LATIN CAPITAL LETTER C WITH ACUTE 	TokenNameCOMMENT_LINE	U+0106: LATIN CAPITAL LETTER C WITH ACUTE 
+	TokenNamePLUS	
"Ĉ"	TokenNameStringLiteral	Ĉ
// U+0108: LATIN CAPITAL LETTER C WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0108: LATIN CAPITAL LETTER C WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ċ"	TokenNameStringLiteral	Ċ
// U+010A: LATIN CAPITAL LETTER C WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+010A: LATIN CAPITAL LETTER C WITH DOT ABOVE 
+	TokenNamePLUS	
"Č"	TokenNameStringLiteral	Č
// U+010C: LATIN CAPITAL LETTER C WITH CARON 	TokenNameCOMMENT_LINE	U+010C: LATIN CAPITAL LETTER C WITH CARON 
+	TokenNamePLUS	
"Ƈ"	TokenNameStringLiteral	Ƈ
// U+0187: LATIN CAPITAL LETTER C WITH HOOK 	TokenNameCOMMENT_LINE	U+0187: LATIN CAPITAL LETTER C WITH HOOK 
+	TokenNamePLUS	
"Ȼ"	TokenNameStringLiteral	Ȼ
// U+023B: LATIN CAPITAL LETTER C WITH STROKE 	TokenNameCOMMENT_LINE	U+023B: LATIN CAPITAL LETTER C WITH STROKE 
+	TokenNamePLUS	
"ʗ"	TokenNameStringLiteral	ʗ
// U+0297: LATIN LETTER STRETCHED C 	TokenNameCOMMENT_LINE	U+0297: LATIN LETTER STRETCHED C 
+	TokenNamePLUS	
"ᴄ"	TokenNameStringLiteral	ᴄ
// U+1D04: LATIN LETTER SMALL CAPITAL C 	TokenNameCOMMENT_LINE	U+1D04: LATIN LETTER SMALL CAPITAL C 
+	TokenNamePLUS	
"Ḉ"	TokenNameStringLiteral	Ḉ
// U+1E08: LATIN CAPITAL LETTER C WITH CEDILLA AND ACUTE 	TokenNameCOMMENT_LINE	U+1E08: LATIN CAPITAL LETTER C WITH CEDILLA AND ACUTE 
+	TokenNamePLUS	
"Ⓒ"	TokenNameStringLiteral	Ⓒ
// U+24B8: CIRCLED LATIN CAPITAL LETTER C 	TokenNameCOMMENT_LINE	U+24B8: CIRCLED LATIN CAPITAL LETTER C 
+	TokenNamePLUS	
"Ｃ"	TokenNameStringLiteral	Ｃ
// U+FF23: FULLWIDTH LATIN CAPITAL LETTER C 	TokenNameCOMMENT_LINE	U+FF23: FULLWIDTH LATIN CAPITAL LETTER C 
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ç"	TokenNameStringLiteral	ç
// U+00E7: LATIN SMALL LETTER C WITH CEDILLA 	TokenNameCOMMENT_LINE	U+00E7: LATIN SMALL LETTER C WITH CEDILLA 
+	TokenNamePLUS	
"ć"	TokenNameStringLiteral	ć
// U+0107: LATIN SMALL LETTER C WITH ACUTE 	TokenNameCOMMENT_LINE	U+0107: LATIN SMALL LETTER C WITH ACUTE 
+	TokenNamePLUS	
"ĉ"	TokenNameStringLiteral	ĉ
// U+0109: LATIN SMALL LETTER C WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0109: LATIN SMALL LETTER C WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ċ"	TokenNameStringLiteral	ċ
// U+010B: LATIN SMALL LETTER C WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+010B: LATIN SMALL LETTER C WITH DOT ABOVE 
+	TokenNamePLUS	
"č"	TokenNameStringLiteral	č
// U+010D: LATIN SMALL LETTER C WITH CARON 	TokenNameCOMMENT_LINE	U+010D: LATIN SMALL LETTER C WITH CARON 
+	TokenNamePLUS	
"ƈ"	TokenNameStringLiteral	ƈ
// U+0188: LATIN SMALL LETTER C WITH HOOK 	TokenNameCOMMENT_LINE	U+0188: LATIN SMALL LETTER C WITH HOOK 
+	TokenNamePLUS	
"ȼ"	TokenNameStringLiteral	ȼ
// U+023C: LATIN SMALL LETTER C WITH STROKE 	TokenNameCOMMENT_LINE	U+023C: LATIN SMALL LETTER C WITH STROKE 
+	TokenNamePLUS	
"ɕ"	TokenNameStringLiteral	ɕ
// U+0255: LATIN SMALL LETTER C WITH CURL 	TokenNameCOMMENT_LINE	U+0255: LATIN SMALL LETTER C WITH CURL 
+	TokenNamePLUS	
"ḉ"	TokenNameStringLiteral	ḉ
// U+1E09: LATIN SMALL LETTER C WITH CEDILLA AND ACUTE 	TokenNameCOMMENT_LINE	U+1E09: LATIN SMALL LETTER C WITH CEDILLA AND ACUTE 
+	TokenNamePLUS	
"ↄ"	TokenNameStringLiteral	ↄ
// U+2184: LATIN SMALL LETTER REVERSED C 	TokenNameCOMMENT_LINE	U+2184: LATIN SMALL LETTER REVERSED C 
+	TokenNamePLUS	
"ⓒ"	TokenNameStringLiteral	ⓒ
// U+24D2: CIRCLED LATIN SMALL LETTER C 	TokenNameCOMMENT_LINE	U+24D2: CIRCLED LATIN SMALL LETTER C 
+	TokenNamePLUS	
"Ꜿ"	TokenNameStringLiteral	Ꜿ
// U+A73E: LATIN CAPITAL LETTER REVERSED C WITH DOT 	TokenNameCOMMENT_LINE	U+A73E: LATIN CAPITAL LETTER REVERSED C WITH DOT 
+	TokenNamePLUS	
"ꜿ"	TokenNameStringLiteral	ꜿ
// U+A73F: LATIN SMALL LETTER REVERSED C WITH DOT 	TokenNameCOMMENT_LINE	U+A73F: LATIN SMALL LETTER REVERSED C WITH DOT 
+	TokenNamePLUS	
"ｃ"	TokenNameStringLiteral	ｃ
// U+FF43: FULLWIDTH LATIN SMALL LETTER C 	TokenNameCOMMENT_LINE	U+FF43: FULLWIDTH LATIN SMALL LETTER C 
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒞"	TokenNameStringLiteral	⒞
// U+249E: PARENTHESIZED LATIN SMALL LETTER C 	TokenNameCOMMENT_LINE	U+249E: PARENTHESIZED LATIN SMALL LETTER C 
,	TokenNameCOMMA	
"(c)"	TokenNameStringLiteral	(c)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ð"	TokenNameStringLiteral	Ð
// U+00D0: LATIN CAPITAL LETTER ETH 	TokenNameCOMMENT_LINE	U+00D0: LATIN CAPITAL LETTER ETH 
+	TokenNamePLUS	
"Ď"	TokenNameStringLiteral	Ď
// U+010E: LATIN CAPITAL LETTER D WITH CARON 	TokenNameCOMMENT_LINE	U+010E: LATIN CAPITAL LETTER D WITH CARON 
+	TokenNamePLUS	
"Đ"	TokenNameStringLiteral	Đ
// U+0110: LATIN CAPITAL LETTER D WITH STROKE 	TokenNameCOMMENT_LINE	U+0110: LATIN CAPITAL LETTER D WITH STROKE 
+	TokenNamePLUS	
"Ɖ"	TokenNameStringLiteral	Ɖ
// U+0189: LATIN CAPITAL LETTER AFRICAN D 	TokenNameCOMMENT_LINE	U+0189: LATIN CAPITAL LETTER AFRICAN D 
+	TokenNamePLUS	
"Ɗ"	TokenNameStringLiteral	Ɗ
// U+018A: LATIN CAPITAL LETTER D WITH HOOK 	TokenNameCOMMENT_LINE	U+018A: LATIN CAPITAL LETTER D WITH HOOK 
+	TokenNamePLUS	
"Ƌ"	TokenNameStringLiteral	Ƌ
// U+018B: LATIN CAPITAL LETTER D WITH TOPBAR 	TokenNameCOMMENT_LINE	U+018B: LATIN CAPITAL LETTER D WITH TOPBAR 
+	TokenNamePLUS	
"ᴅ"	TokenNameStringLiteral	ᴅ
// U+1D05: LATIN LETTER SMALL CAPITAL D 	TokenNameCOMMENT_LINE	U+1D05: LATIN LETTER SMALL CAPITAL D 
+	TokenNamePLUS	
"ᴆ"	TokenNameStringLiteral	ᴆ
// U+1D06: LATIN LETTER SMALL CAPITAL ETH 	TokenNameCOMMENT_LINE	U+1D06: LATIN LETTER SMALL CAPITAL ETH 
+	TokenNamePLUS	
"Ḋ"	TokenNameStringLiteral	Ḋ
// U+1E0A: LATIN CAPITAL LETTER D WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E0A: LATIN CAPITAL LETTER D WITH DOT ABOVE 
+	TokenNamePLUS	
"Ḍ"	TokenNameStringLiteral	Ḍ
// U+1E0C: LATIN CAPITAL LETTER D WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E0C: LATIN CAPITAL LETTER D WITH DOT BELOW 
+	TokenNamePLUS	
"Ḏ"	TokenNameStringLiteral	Ḏ
// U+1E0E: LATIN CAPITAL LETTER D WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E0E: LATIN CAPITAL LETTER D WITH LINE BELOW 
+	TokenNamePLUS	
"Ḑ"	TokenNameStringLiteral	Ḑ
// U+1E10: LATIN CAPITAL LETTER D WITH CEDILLA 	TokenNameCOMMENT_LINE	U+1E10: LATIN CAPITAL LETTER D WITH CEDILLA 
+	TokenNamePLUS	
"Ḓ"	TokenNameStringLiteral	Ḓ
// U+1E12: LATIN CAPITAL LETTER D WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E12: LATIN CAPITAL LETTER D WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"Ⓓ"	TokenNameStringLiteral	Ⓓ
// U+24B9: CIRCLED LATIN CAPITAL LETTER D 	TokenNameCOMMENT_LINE	U+24B9: CIRCLED LATIN CAPITAL LETTER D 
+	TokenNamePLUS	
"Ꝺ"	TokenNameStringLiteral	Ꝺ
// U+A779: LATIN CAPITAL LETTER INSULAR D 	TokenNameCOMMENT_LINE	U+A779: LATIN CAPITAL LETTER INSULAR D 
+	TokenNamePLUS	
"Ｄ"	TokenNameStringLiteral	Ｄ
// U+FF24: FULLWIDTH LATIN CAPITAL LETTER D 	TokenNameCOMMENT_LINE	U+FF24: FULLWIDTH LATIN CAPITAL LETTER D 
,	TokenNameCOMMA	
"D"	TokenNameStringLiteral	D
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ð"	TokenNameStringLiteral	ð
// U+00F0: LATIN SMALL LETTER ETH 	TokenNameCOMMENT_LINE	U+00F0: LATIN SMALL LETTER ETH 
+	TokenNamePLUS	
"ď"	TokenNameStringLiteral	ď
// U+010F: LATIN SMALL LETTER D WITH CARON 	TokenNameCOMMENT_LINE	U+010F: LATIN SMALL LETTER D WITH CARON 
+	TokenNamePLUS	
"đ"	TokenNameStringLiteral	đ
// U+0111: LATIN SMALL LETTER D WITH STROKE 	TokenNameCOMMENT_LINE	U+0111: LATIN SMALL LETTER D WITH STROKE 
+	TokenNamePLUS	
"ƌ"	TokenNameStringLiteral	ƌ
// U+018C: LATIN SMALL LETTER D WITH TOPBAR 	TokenNameCOMMENT_LINE	U+018C: LATIN SMALL LETTER D WITH TOPBAR 
+	TokenNamePLUS	
"ȡ"	TokenNameStringLiteral	ȡ
// U+0221: LATIN SMALL LETTER D WITH CURL 	TokenNameCOMMENT_LINE	U+0221: LATIN SMALL LETTER D WITH CURL 
+	TokenNamePLUS	
"ɖ"	TokenNameStringLiteral	ɖ
// U+0256: LATIN SMALL LETTER D WITH TAIL 	TokenNameCOMMENT_LINE	U+0256: LATIN SMALL LETTER D WITH TAIL 
+	TokenNamePLUS	
"ɗ"	TokenNameStringLiteral	ɗ
// U+0257: LATIN SMALL LETTER D WITH HOOK 	TokenNameCOMMENT_LINE	U+0257: LATIN SMALL LETTER D WITH HOOK 
+	TokenNamePLUS	
"ᵭ"	TokenNameStringLiteral	ᵭ
// U+1D6D: LATIN SMALL LETTER D WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D6D: LATIN SMALL LETTER D WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ᶁ"	TokenNameStringLiteral	ᶁ
// U+1D81: LATIN SMALL LETTER D WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D81: LATIN SMALL LETTER D WITH PALATAL HOOK 
+	TokenNamePLUS	
"ᶑ"	TokenNameStringLiteral	ᶑ
// U+1D91: LATIN SMALL LETTER D WITH HOOK AND TAIL 	TokenNameCOMMENT_LINE	U+1D91: LATIN SMALL LETTER D WITH HOOK AND TAIL 
+	TokenNamePLUS	
"ḋ"	TokenNameStringLiteral	ḋ
// U+1E0B: LATIN SMALL LETTER D WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E0B: LATIN SMALL LETTER D WITH DOT ABOVE 
+	TokenNamePLUS	
"ḍ"	TokenNameStringLiteral	ḍ
// U+1E0D: LATIN SMALL LETTER D WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E0D: LATIN SMALL LETTER D WITH DOT BELOW 
+	TokenNamePLUS	
"ḏ"	TokenNameStringLiteral	ḏ
// U+1E0F: LATIN SMALL LETTER D WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E0F: LATIN SMALL LETTER D WITH LINE BELOW 
+	TokenNamePLUS	
"ḑ"	TokenNameStringLiteral	ḑ
// U+1E11: LATIN SMALL LETTER D WITH CEDILLA 	TokenNameCOMMENT_LINE	U+1E11: LATIN SMALL LETTER D WITH CEDILLA 
+	TokenNamePLUS	
"ḓ"	TokenNameStringLiteral	ḓ
// U+1E13: LATIN SMALL LETTER D WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E13: LATIN SMALL LETTER D WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"ⓓ"	TokenNameStringLiteral	ⓓ
// U+24D3: CIRCLED LATIN SMALL LETTER D 	TokenNameCOMMENT_LINE	U+24D3: CIRCLED LATIN SMALL LETTER D 
+	TokenNamePLUS	
"ꝺ"	TokenNameStringLiteral	ꝺ
// U+A77A: LATIN SMALL LETTER INSULAR D 	TokenNameCOMMENT_LINE	U+A77A: LATIN SMALL LETTER INSULAR D 
+	TokenNamePLUS	
"ｄ"	TokenNameStringLiteral	ｄ
// U+FF44: FULLWIDTH LATIN SMALL LETTER D 	TokenNameCOMMENT_LINE	U+FF44: FULLWIDTH LATIN SMALL LETTER D 
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ǆ"	TokenNameStringLiteral	Ǆ
// U+01C4: LATIN CAPITAL LETTER DZ WITH CARON 	TokenNameCOMMENT_LINE	U+01C4: LATIN CAPITAL LETTER DZ WITH CARON 
+	TokenNamePLUS	
"Ǳ"	TokenNameStringLiteral	Ǳ
// U+01F1: LATIN CAPITAL LETTER DZ 	TokenNameCOMMENT_LINE	U+01F1: LATIN CAPITAL LETTER DZ 
,	TokenNameCOMMA	
"DZ"	TokenNameStringLiteral	DZ
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ǅ"	TokenNameStringLiteral	ǅ
// U+01C5: LATIN CAPITAL LETTER D WITH SMALL LETTER Z WITH CARON 	TokenNameCOMMENT_LINE	U+01C5: LATIN CAPITAL LETTER D WITH SMALL LETTER Z WITH CARON 
+	TokenNamePLUS	
"ǲ"	TokenNameStringLiteral	ǲ
// U+01F2: LATIN CAPITAL LETTER D WITH SMALL LETTER Z 	TokenNameCOMMENT_LINE	U+01F2: LATIN CAPITAL LETTER D WITH SMALL LETTER Z 
,	TokenNameCOMMA	
"Dz"	TokenNameStringLiteral	Dz
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒟"	TokenNameStringLiteral	⒟
// U+249F: PARENTHESIZED LATIN SMALL LETTER D 	TokenNameCOMMENT_LINE	U+249F: PARENTHESIZED LATIN SMALL LETTER D 
,	TokenNameCOMMA	
"(d)"	TokenNameStringLiteral	(d)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ȸ"	TokenNameStringLiteral	ȸ
// U+0238: LATIN SMALL LETTER DB DIGRAPH 	TokenNameCOMMENT_LINE	U+0238: LATIN SMALL LETTER DB DIGRAPH 
,	TokenNameCOMMA	
"db"	TokenNameStringLiteral	db
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ǆ"	TokenNameStringLiteral	ǆ
// U+01C6: LATIN SMALL LETTER DZ WITH CARON 	TokenNameCOMMENT_LINE	U+01C6: LATIN SMALL LETTER DZ WITH CARON 
+	TokenNamePLUS	
"ǳ"	TokenNameStringLiteral	ǳ
// U+01F3: LATIN SMALL LETTER DZ 	TokenNameCOMMENT_LINE	U+01F3: LATIN SMALL LETTER DZ 
+	TokenNamePLUS	
"ʣ"	TokenNameStringLiteral	ʣ
// U+02A3: LATIN SMALL LETTER DZ DIGRAPH 	TokenNameCOMMENT_LINE	U+02A3: LATIN SMALL LETTER DZ DIGRAPH 
+	TokenNamePLUS	
"ʥ"	TokenNameStringLiteral	ʥ
// U+02A5: LATIN SMALL LETTER DZ DIGRAPH WITH CURL 	TokenNameCOMMENT_LINE	U+02A5: LATIN SMALL LETTER DZ DIGRAPH WITH CURL 
,	TokenNameCOMMA	
"dz"	TokenNameStringLiteral	dz
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"È"	TokenNameStringLiteral	È
// U+00C8: LATIN CAPITAL LETTER E WITH GRAVE 	TokenNameCOMMENT_LINE	U+00C8: LATIN CAPITAL LETTER E WITH GRAVE 
+	TokenNamePLUS	
"É"	TokenNameStringLiteral	É
// U+00C9: LATIN CAPITAL LETTER E WITH ACUTE 	TokenNameCOMMENT_LINE	U+00C9: LATIN CAPITAL LETTER E WITH ACUTE 
+	TokenNamePLUS	
"Ê"	TokenNameStringLiteral	Ê
// U+00CA: LATIN CAPITAL LETTER E WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00CA: LATIN CAPITAL LETTER E WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ë"	TokenNameStringLiteral	Ë
// U+00CB: LATIN CAPITAL LETTER E WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00CB: LATIN CAPITAL LETTER E WITH DIAERESIS 
+	TokenNamePLUS	
"Ē"	TokenNameStringLiteral	Ē
// U+0112: LATIN CAPITAL LETTER E WITH MACRON 	TokenNameCOMMENT_LINE	U+0112: LATIN CAPITAL LETTER E WITH MACRON 
+	TokenNamePLUS	
"Ĕ"	TokenNameStringLiteral	Ĕ
// U+0114: LATIN CAPITAL LETTER E WITH BREVE 	TokenNameCOMMENT_LINE	U+0114: LATIN CAPITAL LETTER E WITH BREVE 
+	TokenNamePLUS	
"Ė"	TokenNameStringLiteral	Ė
// U+0116: LATIN CAPITAL LETTER E WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+0116: LATIN CAPITAL LETTER E WITH DOT ABOVE 
+	TokenNamePLUS	
"Ę"	TokenNameStringLiteral	Ę
// U+0118: LATIN CAPITAL LETTER E WITH OGONEK 	TokenNameCOMMENT_LINE	U+0118: LATIN CAPITAL LETTER E WITH OGONEK 
+	TokenNamePLUS	
"Ě"	TokenNameStringLiteral	Ě
// U+011A: LATIN CAPITAL LETTER E WITH CARON 	TokenNameCOMMENT_LINE	U+011A: LATIN CAPITAL LETTER E WITH CARON 
+	TokenNamePLUS	
"Ǝ"	TokenNameStringLiteral	Ǝ
// U+018E: LATIN CAPITAL LETTER REVERSED E 	TokenNameCOMMENT_LINE	U+018E: LATIN CAPITAL LETTER REVERSED E 
+	TokenNamePLUS	
"Ɛ"	TokenNameStringLiteral	Ɛ
// U+0190: LATIN CAPITAL LETTER OPEN E 	TokenNameCOMMENT_LINE	U+0190: LATIN CAPITAL LETTER OPEN E 
+	TokenNamePLUS	
"Ȅ"	TokenNameStringLiteral	Ȅ
// U+0204: LATIN CAPITAL LETTER E WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0204: LATIN CAPITAL LETTER E WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"Ȇ"	TokenNameStringLiteral	Ȇ
// U+0206: LATIN CAPITAL LETTER E WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+0206: LATIN CAPITAL LETTER E WITH INVERTED BREVE 
+	TokenNamePLUS	
"Ȩ"	TokenNameStringLiteral	Ȩ
// U+0228: LATIN CAPITAL LETTER E WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0228: LATIN CAPITAL LETTER E WITH CEDILLA 
+	TokenNamePLUS	
"Ɇ"	TokenNameStringLiteral	Ɇ
// U+0246: LATIN CAPITAL LETTER E WITH STROKE 	TokenNameCOMMENT_LINE	U+0246: LATIN CAPITAL LETTER E WITH STROKE 
+	TokenNamePLUS	
"ᴇ"	TokenNameStringLiteral	ᴇ
// U+1D07: LATIN LETTER SMALL CAPITAL E 	TokenNameCOMMENT_LINE	U+1D07: LATIN LETTER SMALL CAPITAL E 
+	TokenNamePLUS	
"Ḕ"	TokenNameStringLiteral	Ḕ
// U+1E14: LATIN CAPITAL LETTER E WITH MACRON AND GRAVE 	TokenNameCOMMENT_LINE	U+1E14: LATIN CAPITAL LETTER E WITH MACRON AND GRAVE 
+	TokenNamePLUS	
"Ḗ"	TokenNameStringLiteral	Ḗ
// U+1E16: LATIN CAPITAL LETTER E WITH MACRON AND ACUTE 	TokenNameCOMMENT_LINE	U+1E16: LATIN CAPITAL LETTER E WITH MACRON AND ACUTE 
+	TokenNamePLUS	
"Ḙ"	TokenNameStringLiteral	Ḙ
// U+1E18: LATIN CAPITAL LETTER E WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E18: LATIN CAPITAL LETTER E WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"Ḛ"	TokenNameStringLiteral	Ḛ
// U+1E1A: LATIN CAPITAL LETTER E WITH TILDE BELOW 	TokenNameCOMMENT_LINE	U+1E1A: LATIN CAPITAL LETTER E WITH TILDE BELOW 
+	TokenNamePLUS	
"Ḝ"	TokenNameStringLiteral	Ḝ
// U+1E1C: LATIN CAPITAL LETTER E WITH CEDILLA AND BREVE 	TokenNameCOMMENT_LINE	U+1E1C: LATIN CAPITAL LETTER E WITH CEDILLA AND BREVE 
+	TokenNamePLUS	
"Ẹ"	TokenNameStringLiteral	Ẹ
// U+1EB8: LATIN CAPITAL LETTER E WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1EB8: LATIN CAPITAL LETTER E WITH DOT BELOW 
+	TokenNamePLUS	
"Ẻ"	TokenNameStringLiteral	Ẻ
// U+1EBA: LATIN CAPITAL LETTER E WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EBA: LATIN CAPITAL LETTER E WITH HOOK ABOVE 
+	TokenNamePLUS	
"Ẽ"	TokenNameStringLiteral	Ẽ
// U+1EBC: LATIN CAPITAL LETTER E WITH TILDE 	TokenNameCOMMENT_LINE	U+1EBC: LATIN CAPITAL LETTER E WITH TILDE 
+	TokenNamePLUS	
"Ế"	TokenNameStringLiteral	Ế
// U+1EBE: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND ACUTE 	TokenNameCOMMENT_LINE	U+1EBE: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND ACUTE 
+	TokenNamePLUS	
"Ề"	TokenNameStringLiteral	Ề
// U+1EC0: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND GRAVE 	TokenNameCOMMENT_LINE	U+1EC0: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND GRAVE 
+	TokenNamePLUS	
"Ể"	TokenNameStringLiteral	Ể
// U+1EC2: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EC2: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND HOOK ABOVE 
+	TokenNamePLUS	
"Ễ"	TokenNameStringLiteral	Ễ
// U+1EC4: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND TILDE 	TokenNameCOMMENT_LINE	U+1EC4: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND TILDE 
+	TokenNamePLUS	
"Ệ"	TokenNameStringLiteral	Ệ
// U+1EC6: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EC6: LATIN CAPITAL LETTER E WITH CIRCUMFLEX AND DOT BELOW 
+	TokenNamePLUS	
"Ⓔ"	TokenNameStringLiteral	Ⓔ
// U+24BA: CIRCLED LATIN CAPITAL LETTER E 	TokenNameCOMMENT_LINE	U+24BA: CIRCLED LATIN CAPITAL LETTER E 
+	TokenNamePLUS	
"ⱻ"	TokenNameStringLiteral	ⱻ
// U+2C7B: LATIN LETTER SMALL CAPITAL TURNED E 	TokenNameCOMMENT_LINE	U+2C7B: LATIN LETTER SMALL CAPITAL TURNED E 
+	TokenNamePLUS	
"Ｅ"	TokenNameStringLiteral	Ｅ
// U+FF25: FULLWIDTH LATIN CAPITAL LETTER E 	TokenNameCOMMENT_LINE	U+FF25: FULLWIDTH LATIN CAPITAL LETTER E 
,	TokenNameCOMMA	
"E"	TokenNameStringLiteral	E
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"è"	TokenNameStringLiteral	è
// U+00E8: LATIN SMALL LETTER E WITH GRAVE 	TokenNameCOMMENT_LINE	U+00E8: LATIN SMALL LETTER E WITH GRAVE 
+	TokenNamePLUS	
"é"	TokenNameStringLiteral	é
// U+00E9: LATIN SMALL LETTER E WITH ACUTE 	TokenNameCOMMENT_LINE	U+00E9: LATIN SMALL LETTER E WITH ACUTE 
+	TokenNamePLUS	
"ê"	TokenNameStringLiteral	ê
// U+00EA: LATIN SMALL LETTER E WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00EA: LATIN SMALL LETTER E WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ë"	TokenNameStringLiteral	ë
// U+00EB: LATIN SMALL LETTER E WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00EB: LATIN SMALL LETTER E WITH DIAERESIS 
+	TokenNamePLUS	
"ē"	TokenNameStringLiteral	ē
// U+0113: LATIN SMALL LETTER E WITH MACRON 	TokenNameCOMMENT_LINE	U+0113: LATIN SMALL LETTER E WITH MACRON 
+	TokenNamePLUS	
"ĕ"	TokenNameStringLiteral	ĕ
// U+0115: LATIN SMALL LETTER E WITH BREVE 	TokenNameCOMMENT_LINE	U+0115: LATIN SMALL LETTER E WITH BREVE 
+	TokenNamePLUS	
"ė"	TokenNameStringLiteral	ė
// U+0117: LATIN SMALL LETTER E WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+0117: LATIN SMALL LETTER E WITH DOT ABOVE 
+	TokenNamePLUS	
"ę"	TokenNameStringLiteral	ę
// U+0119: LATIN SMALL LETTER E WITH OGONEK 	TokenNameCOMMENT_LINE	U+0119: LATIN SMALL LETTER E WITH OGONEK 
+	TokenNamePLUS	
"ě"	TokenNameStringLiteral	ě
// U+011B: LATIN SMALL LETTER E WITH CARON 	TokenNameCOMMENT_LINE	U+011B: LATIN SMALL LETTER E WITH CARON 
+	TokenNamePLUS	
"ǝ"	TokenNameStringLiteral	ǝ
// U+01DD: LATIN SMALL LETTER TURNED E 	TokenNameCOMMENT_LINE	U+01DD: LATIN SMALL LETTER TURNED E 
+	TokenNamePLUS	
"ȅ"	TokenNameStringLiteral	ȅ
// U+0205: LATIN SMALL LETTER E WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0205: LATIN SMALL LETTER E WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"ȇ"	TokenNameStringLiteral	ȇ
// U+0207: LATIN SMALL LETTER E WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+0207: LATIN SMALL LETTER E WITH INVERTED BREVE 
+	TokenNamePLUS	
"ȩ"	TokenNameStringLiteral	ȩ
// U+0229: LATIN SMALL LETTER E WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0229: LATIN SMALL LETTER E WITH CEDILLA 
+	TokenNamePLUS	
"ɇ"	TokenNameStringLiteral	ɇ
// U+0247: LATIN SMALL LETTER E WITH STROKE 	TokenNameCOMMENT_LINE	U+0247: LATIN SMALL LETTER E WITH STROKE 
+	TokenNamePLUS	
"ɘ"	TokenNameStringLiteral	ɘ
// U+0258: LATIN SMALL LETTER REVERSED E 	TokenNameCOMMENT_LINE	U+0258: LATIN SMALL LETTER REVERSED E 
+	TokenNamePLUS	
"ɛ"	TokenNameStringLiteral	ɛ
// U+025B: LATIN SMALL LETTER OPEN E 	TokenNameCOMMENT_LINE	U+025B: LATIN SMALL LETTER OPEN E 
+	TokenNamePLUS	
"ɜ"	TokenNameStringLiteral	ɜ
// U+025C: LATIN SMALL LETTER REVERSED OPEN E 	TokenNameCOMMENT_LINE	U+025C: LATIN SMALL LETTER REVERSED OPEN E 
+	TokenNamePLUS	
"ɝ"	TokenNameStringLiteral	ɝ
// U+025D: LATIN SMALL LETTER REVERSED OPEN E WITH HOOK 	TokenNameCOMMENT_LINE	U+025D: LATIN SMALL LETTER REVERSED OPEN E WITH HOOK 
+	TokenNamePLUS	
"ɞ"	TokenNameStringLiteral	ɞ
// U+025E: LATIN SMALL LETTER CLOSED REVERSED OPEN E 	TokenNameCOMMENT_LINE	U+025E: LATIN SMALL LETTER CLOSED REVERSED OPEN E 
+	TokenNamePLUS	
"ʚ"	TokenNameStringLiteral	ʚ
// U+029A: LATIN SMALL LETTER CLOSED OPEN E 	TokenNameCOMMENT_LINE	U+029A: LATIN SMALL LETTER CLOSED OPEN E 
+	TokenNamePLUS	
"ᴈ"	TokenNameStringLiteral	ᴈ
// U+1D08: LATIN SMALL LETTER TURNED OPEN E 	TokenNameCOMMENT_LINE	U+1D08: LATIN SMALL LETTER TURNED OPEN E 
+	TokenNamePLUS	
"ᶒ"	TokenNameStringLiteral	ᶒ
// U+1D92: LATIN SMALL LETTER E WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+1D92: LATIN SMALL LETTER E WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ᶓ"	TokenNameStringLiteral	ᶓ
// U+1D93: LATIN SMALL LETTER OPEN E WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+1D93: LATIN SMALL LETTER OPEN E WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ᶔ"	TokenNameStringLiteral	ᶔ
// U+1D94: LATIN SMALL LETTER REVERSED OPEN E WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+1D94: LATIN SMALL LETTER REVERSED OPEN E WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ḕ"	TokenNameStringLiteral	ḕ
// U+1E15: LATIN SMALL LETTER E WITH MACRON AND GRAVE 	TokenNameCOMMENT_LINE	U+1E15: LATIN SMALL LETTER E WITH MACRON AND GRAVE 
+	TokenNamePLUS	
"ḗ"	TokenNameStringLiteral	ḗ
// U+1E17: LATIN SMALL LETTER E WITH MACRON AND ACUTE 	TokenNameCOMMENT_LINE	U+1E17: LATIN SMALL LETTER E WITH MACRON AND ACUTE 
+	TokenNamePLUS	
"ḙ"	TokenNameStringLiteral	ḙ
// U+1E19: LATIN SMALL LETTER E WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E19: LATIN SMALL LETTER E WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"ḛ"	TokenNameStringLiteral	ḛ
// U+1E1B: LATIN SMALL LETTER E WITH TILDE BELOW 	TokenNameCOMMENT_LINE	U+1E1B: LATIN SMALL LETTER E WITH TILDE BELOW 
+	TokenNamePLUS	
"ḝ"	TokenNameStringLiteral	ḝ
// U+1E1D: LATIN SMALL LETTER E WITH CEDILLA AND BREVE 	TokenNameCOMMENT_LINE	U+1E1D: LATIN SMALL LETTER E WITH CEDILLA AND BREVE 
+	TokenNamePLUS	
"ẹ"	TokenNameStringLiteral	ẹ
// U+1EB9: LATIN SMALL LETTER E WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1EB9: LATIN SMALL LETTER E WITH DOT BELOW 
+	TokenNamePLUS	
"ẻ"	TokenNameStringLiteral	ẻ
// U+1EBB: LATIN SMALL LETTER E WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EBB: LATIN SMALL LETTER E WITH HOOK ABOVE 
+	TokenNamePLUS	
"ẽ"	TokenNameStringLiteral	ẽ
// U+1EBD: LATIN SMALL LETTER E WITH TILDE 	TokenNameCOMMENT_LINE	U+1EBD: LATIN SMALL LETTER E WITH TILDE 
+	TokenNamePLUS	
"ế"	TokenNameStringLiteral	ế
// U+1EBF: LATIN SMALL LETTER E WITH CIRCUMFLEX AND ACUTE 	TokenNameCOMMENT_LINE	U+1EBF: LATIN SMALL LETTER E WITH CIRCUMFLEX AND ACUTE 
+	TokenNamePLUS	
"ề"	TokenNameStringLiteral	ề
// U+1EC1: LATIN SMALL LETTER E WITH CIRCUMFLEX AND GRAVE 	TokenNameCOMMENT_LINE	U+1EC1: LATIN SMALL LETTER E WITH CIRCUMFLEX AND GRAVE 
+	TokenNamePLUS	
"ể"	TokenNameStringLiteral	ể
// U+1EC3: LATIN SMALL LETTER E WITH CIRCUMFLEX AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EC3: LATIN SMALL LETTER E WITH CIRCUMFLEX AND HOOK ABOVE 
+	TokenNamePLUS	
"ễ"	TokenNameStringLiteral	ễ
// U+1EC5: LATIN SMALL LETTER E WITH CIRCUMFLEX AND TILDE 	TokenNameCOMMENT_LINE	U+1EC5: LATIN SMALL LETTER E WITH CIRCUMFLEX AND TILDE 
+	TokenNamePLUS	
"ệ"	TokenNameStringLiteral	ệ
// U+1EC7: LATIN SMALL LETTER E WITH CIRCUMFLEX AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EC7: LATIN SMALL LETTER E WITH CIRCUMFLEX AND DOT BELOW 
+	TokenNamePLUS	
"ₑ"	TokenNameStringLiteral	ₑ
// U+2091: LATIN SUBSCRIPT SMALL LETTER E 	TokenNameCOMMENT_LINE	U+2091: LATIN SUBSCRIPT SMALL LETTER E 
+	TokenNamePLUS	
"ⓔ"	TokenNameStringLiteral	ⓔ
// U+24D4: CIRCLED LATIN SMALL LETTER E 	TokenNameCOMMENT_LINE	U+24D4: CIRCLED LATIN SMALL LETTER E 
+	TokenNamePLUS	
"ⱸ"	TokenNameStringLiteral	ⱸ
// U+2C78: LATIN SMALL LETTER E WITH NOTCH 	TokenNameCOMMENT_LINE	U+2C78: LATIN SMALL LETTER E WITH NOTCH 
+	TokenNamePLUS	
"ｅ"	TokenNameStringLiteral	ｅ
// U+FF45: FULLWIDTH LATIN SMALL LETTER E 	TokenNameCOMMENT_LINE	U+FF45: FULLWIDTH LATIN SMALL LETTER E 
,	TokenNameCOMMA	
"e"	TokenNameStringLiteral	e
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒠"	TokenNameStringLiteral	⒠
// U+24A0: PARENTHESIZED LATIN SMALL LETTER E 	TokenNameCOMMENT_LINE	U+24A0: PARENTHESIZED LATIN SMALL LETTER E 
,	TokenNameCOMMA	
"(e)"	TokenNameStringLiteral	(e)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ƒ"	TokenNameStringLiteral	Ƒ
// U+0191: LATIN CAPITAL LETTER F WITH HOOK 	TokenNameCOMMENT_LINE	U+0191: LATIN CAPITAL LETTER F WITH HOOK 
+	TokenNamePLUS	
"Ḟ"	TokenNameStringLiteral	Ḟ
// U+1E1E: LATIN CAPITAL LETTER F WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E1E: LATIN CAPITAL LETTER F WITH DOT ABOVE 
+	TokenNamePLUS	
"Ⓕ"	TokenNameStringLiteral	Ⓕ
// U+24BB: CIRCLED LATIN CAPITAL LETTER F 	TokenNameCOMMENT_LINE	U+24BB: CIRCLED LATIN CAPITAL LETTER F 
+	TokenNamePLUS	
"ꜰ"	TokenNameStringLiteral	ꜰ
// U+A730: LATIN LETTER SMALL CAPITAL F 	TokenNameCOMMENT_LINE	U+A730: LATIN LETTER SMALL CAPITAL F 
+	TokenNamePLUS	
"Ꝼ"	TokenNameStringLiteral	Ꝼ
// U+A77B: LATIN CAPITAL LETTER INSULAR F 	TokenNameCOMMENT_LINE	U+A77B: LATIN CAPITAL LETTER INSULAR F 
+	TokenNamePLUS	
"ꟻ"	TokenNameStringLiteral	ꟻ
// U+A7FB: LATIN EPIGRAPHIC LETTER REVERSED F 	TokenNameCOMMENT_LINE	U+A7FB: LATIN EPIGRAPHIC LETTER REVERSED F 
+	TokenNamePLUS	
"Ｆ"	TokenNameStringLiteral	Ｆ
// U+FF26: FULLWIDTH LATIN CAPITAL LETTER F 	TokenNameCOMMENT_LINE	U+FF26: FULLWIDTH LATIN CAPITAL LETTER F 
,	TokenNameCOMMA	
"F"	TokenNameStringLiteral	F
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ƒ"	TokenNameStringLiteral	ƒ
// U+0192: LATIN SMALL LETTER F WITH HOOK 	TokenNameCOMMENT_LINE	U+0192: LATIN SMALL LETTER F WITH HOOK 
+	TokenNamePLUS	
"ᵮ"	TokenNameStringLiteral	ᵮ
// U+1D6E: LATIN SMALL LETTER F WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D6E: LATIN SMALL LETTER F WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ᶂ"	TokenNameStringLiteral	ᶂ
// U+1D82: LATIN SMALL LETTER F WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D82: LATIN SMALL LETTER F WITH PALATAL HOOK 
+	TokenNamePLUS	
"ḟ"	TokenNameStringLiteral	ḟ
// U+1E1F: LATIN SMALL LETTER F WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E1F: LATIN SMALL LETTER F WITH DOT ABOVE 
+	TokenNamePLUS	
"ẛ"	TokenNameStringLiteral	ẛ
// U+1E9B: LATIN SMALL LETTER LONG S WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E9B: LATIN SMALL LETTER LONG S WITH DOT ABOVE 
+	TokenNamePLUS	
"ⓕ"	TokenNameStringLiteral	ⓕ
// U+24D5: CIRCLED LATIN SMALL LETTER F 	TokenNameCOMMENT_LINE	U+24D5: CIRCLED LATIN SMALL LETTER F 
+	TokenNamePLUS	
"ꝼ"	TokenNameStringLiteral	ꝼ
// U+A77C: LATIN SMALL LETTER INSULAR F 	TokenNameCOMMENT_LINE	U+A77C: LATIN SMALL LETTER INSULAR F 
+	TokenNamePLUS	
"ｆ"	TokenNameStringLiteral	ｆ
// U+FF46: FULLWIDTH LATIN SMALL LETTER F 	TokenNameCOMMENT_LINE	U+FF46: FULLWIDTH LATIN SMALL LETTER F 
,	TokenNameCOMMA	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒡"	TokenNameStringLiteral	⒡
// U+24A1: PARENTHESIZED LATIN SMALL LETTER F 	TokenNameCOMMENT_LINE	U+24A1: PARENTHESIZED LATIN SMALL LETTER F 
,	TokenNameCOMMA	
"(f)"	TokenNameStringLiteral	(f)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ﬀ"	TokenNameStringLiteral	ﬀ
// U+FB00: LATIN SMALL LIGATURE FF 	TokenNameCOMMENT_LINE	U+FB00: LATIN SMALL LIGATURE FF 
,	TokenNameCOMMA	
"ff"	TokenNameStringLiteral	ff
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ﬃ"	TokenNameStringLiteral	ﬃ
// U+FB03: LATIN SMALL LIGATURE FFI 	TokenNameCOMMENT_LINE	U+FB03: LATIN SMALL LIGATURE FFI 
,	TokenNameCOMMA	
"ffi"	TokenNameStringLiteral	ffi
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ﬄ"	TokenNameStringLiteral	ﬄ
// U+FB04: LATIN SMALL LIGATURE FFL 	TokenNameCOMMENT_LINE	U+FB04: LATIN SMALL LIGATURE FFL 
,	TokenNameCOMMA	
"ffl"	TokenNameStringLiteral	ffl
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ﬁ"	TokenNameStringLiteral	ﬁ
// U+FB01: LATIN SMALL LIGATURE FI 	TokenNameCOMMENT_LINE	U+FB01: LATIN SMALL LIGATURE FI 
,	TokenNameCOMMA	
"fi"	TokenNameStringLiteral	fi
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ﬂ"	TokenNameStringLiteral	ﬂ
// U+FB02: LATIN SMALL LIGATURE FL 	TokenNameCOMMENT_LINE	U+FB02: LATIN SMALL LIGATURE FL 
,	TokenNameCOMMA	
"fl"	TokenNameStringLiteral	fl
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ĝ"	TokenNameStringLiteral	Ĝ
// U+011C: LATIN CAPITAL LETTER G WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+011C: LATIN CAPITAL LETTER G WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ğ"	TokenNameStringLiteral	Ğ
// U+011E: LATIN CAPITAL LETTER G WITH BREVE 	TokenNameCOMMENT_LINE	U+011E: LATIN CAPITAL LETTER G WITH BREVE 
+	TokenNamePLUS	
"Ġ"	TokenNameStringLiteral	Ġ
// U+0120: LATIN CAPITAL LETTER G WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+0120: LATIN CAPITAL LETTER G WITH DOT ABOVE 
+	TokenNamePLUS	
"Ģ"	TokenNameStringLiteral	Ģ
// U+0122: LATIN CAPITAL LETTER G WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0122: LATIN CAPITAL LETTER G WITH CEDILLA 
+	TokenNamePLUS	
"Ɠ"	TokenNameStringLiteral	Ɠ
// U+0193: LATIN CAPITAL LETTER G WITH HOOK 	TokenNameCOMMENT_LINE	U+0193: LATIN CAPITAL LETTER G WITH HOOK 
+	TokenNamePLUS	
"Ǥ"	TokenNameStringLiteral	Ǥ
// U+01E4: LATIN CAPITAL LETTER G WITH STROKE 	TokenNameCOMMENT_LINE	U+01E4: LATIN CAPITAL LETTER G WITH STROKE 
+	TokenNamePLUS	
"ǥ"	TokenNameStringLiteral	ǥ
// U+01E5: LATIN SMALL LETTER G WITH STROKE 	TokenNameCOMMENT_LINE	U+01E5: LATIN SMALL LETTER G WITH STROKE 
+	TokenNamePLUS	
"Ǧ"	TokenNameStringLiteral	Ǧ
// U+01E6: LATIN CAPITAL LETTER G WITH CARON 	TokenNameCOMMENT_LINE	U+01E6: LATIN CAPITAL LETTER G WITH CARON 
+	TokenNamePLUS	
"ǧ"	TokenNameStringLiteral	ǧ
// U+01E7: LATIN SMALL LETTER G WITH CARON 	TokenNameCOMMENT_LINE	U+01E7: LATIN SMALL LETTER G WITH CARON 
+	TokenNamePLUS	
"Ǵ"	TokenNameStringLiteral	Ǵ
// U+01F4: LATIN CAPITAL LETTER G WITH ACUTE 	TokenNameCOMMENT_LINE	U+01F4: LATIN CAPITAL LETTER G WITH ACUTE 
+	TokenNamePLUS	
"ɢ"	TokenNameStringLiteral	ɢ
// U+0262: LATIN LETTER SMALL CAPITAL G 	TokenNameCOMMENT_LINE	U+0262: LATIN LETTER SMALL CAPITAL G 
+	TokenNamePLUS	
"ʛ"	TokenNameStringLiteral	ʛ
// U+029B: LATIN LETTER SMALL CAPITAL G WITH HOOK 	TokenNameCOMMENT_LINE	U+029B: LATIN LETTER SMALL CAPITAL G WITH HOOK 
+	TokenNamePLUS	
"Ḡ"	TokenNameStringLiteral	Ḡ
// U+1E20: LATIN CAPITAL LETTER G WITH MACRON 	TokenNameCOMMENT_LINE	U+1E20: LATIN CAPITAL LETTER G WITH MACRON 
+	TokenNamePLUS	
"Ⓖ"	TokenNameStringLiteral	Ⓖ
// U+24BC: CIRCLED LATIN CAPITAL LETTER G 	TokenNameCOMMENT_LINE	U+24BC: CIRCLED LATIN CAPITAL LETTER G 
+	TokenNamePLUS	
"Ᵹ"	TokenNameStringLiteral	Ᵹ
// U+A77D: LATIN CAPITAL LETTER INSULAR G 	TokenNameCOMMENT_LINE	U+A77D: LATIN CAPITAL LETTER INSULAR G 
+	TokenNamePLUS	
"Ꝿ"	TokenNameStringLiteral	Ꝿ
// U+A77E: LATIN CAPITAL LETTER TURNED INSULAR G 	TokenNameCOMMENT_LINE	U+A77E: LATIN CAPITAL LETTER TURNED INSULAR G 
+	TokenNamePLUS	
"Ｇ"	TokenNameStringLiteral	Ｇ
// U+FF27: FULLWIDTH LATIN CAPITAL LETTER G 	TokenNameCOMMENT_LINE	U+FF27: FULLWIDTH LATIN CAPITAL LETTER G 
,	TokenNameCOMMA	
"G"	TokenNameStringLiteral	G
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ĝ"	TokenNameStringLiteral	ĝ
// U+011D: LATIN SMALL LETTER G WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+011D: LATIN SMALL LETTER G WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ğ"	TokenNameStringLiteral	ğ
// U+011F: LATIN SMALL LETTER G WITH BREVE 	TokenNameCOMMENT_LINE	U+011F: LATIN SMALL LETTER G WITH BREVE 
+	TokenNamePLUS	
"ġ"	TokenNameStringLiteral	ġ
// U+0121: LATIN SMALL LETTER G WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+0121: LATIN SMALL LETTER G WITH DOT ABOVE 
+	TokenNamePLUS	
"ģ"	TokenNameStringLiteral	ģ
// U+0123: LATIN SMALL LETTER G WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0123: LATIN SMALL LETTER G WITH CEDILLA 
+	TokenNamePLUS	
"ǵ"	TokenNameStringLiteral	ǵ
// U+01F5: LATIN SMALL LETTER G WITH ACUTE 	TokenNameCOMMENT_LINE	U+01F5: LATIN SMALL LETTER G WITH ACUTE 
+	TokenNamePLUS	
"ɠ"	TokenNameStringLiteral	ɠ
// U+0260: LATIN SMALL LETTER G WITH HOOK 	TokenNameCOMMENT_LINE	U+0260: LATIN SMALL LETTER G WITH HOOK 
+	TokenNamePLUS	
"ɡ"	TokenNameStringLiteral	ɡ
// U+0261: LATIN SMALL LETTER SCRIPT G 	TokenNameCOMMENT_LINE	U+0261: LATIN SMALL LETTER SCRIPT G 
+	TokenNamePLUS	
"ᵷ"	TokenNameStringLiteral	ᵷ
// U+1D77: LATIN SMALL LETTER TURNED G 	TokenNameCOMMENT_LINE	U+1D77: LATIN SMALL LETTER TURNED G 
+	TokenNamePLUS	
"ᵹ"	TokenNameStringLiteral	ᵹ
// U+1D79: LATIN SMALL LETTER INSULAR G 	TokenNameCOMMENT_LINE	U+1D79: LATIN SMALL LETTER INSULAR G 
+	TokenNamePLUS	
"ᶃ"	TokenNameStringLiteral	ᶃ
// U+1D83: LATIN SMALL LETTER G WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D83: LATIN SMALL LETTER G WITH PALATAL HOOK 
+	TokenNamePLUS	
"ḡ"	TokenNameStringLiteral	ḡ
// U+1E21: LATIN SMALL LETTER G WITH MACRON 	TokenNameCOMMENT_LINE	U+1E21: LATIN SMALL LETTER G WITH MACRON 
+	TokenNamePLUS	
"ⓖ"	TokenNameStringLiteral	ⓖ
// U+24D6: CIRCLED LATIN SMALL LETTER G 	TokenNameCOMMENT_LINE	U+24D6: CIRCLED LATIN SMALL LETTER G 
+	TokenNamePLUS	
"ꝿ"	TokenNameStringLiteral	ꝿ
// U+A77F: LATIN SMALL LETTER TURNED INSULAR G 	TokenNameCOMMENT_LINE	U+A77F: LATIN SMALL LETTER TURNED INSULAR G 
+	TokenNamePLUS	
"ｇ"	TokenNameStringLiteral	ｇ
// U+FF47: FULLWIDTH LATIN SMALL LETTER G 	TokenNameCOMMENT_LINE	U+FF47: FULLWIDTH LATIN SMALL LETTER G 
,	TokenNameCOMMA	
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒢"	TokenNameStringLiteral	⒢
// U+24A2: PARENTHESIZED LATIN SMALL LETTER G 	TokenNameCOMMENT_LINE	U+24A2: PARENTHESIZED LATIN SMALL LETTER G 
,	TokenNameCOMMA	
"(g)"	TokenNameStringLiteral	(g)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ĥ"	TokenNameStringLiteral	Ĥ
// U+0124: LATIN CAPITAL LETTER H WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0124: LATIN CAPITAL LETTER H WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ħ"	TokenNameStringLiteral	Ħ
// U+0126: LATIN CAPITAL LETTER H WITH STROKE 	TokenNameCOMMENT_LINE	U+0126: LATIN CAPITAL LETTER H WITH STROKE 
+	TokenNamePLUS	
"Ȟ"	TokenNameStringLiteral	Ȟ
// U+021E: LATIN CAPITAL LETTER H WITH CARON 	TokenNameCOMMENT_LINE	U+021E: LATIN CAPITAL LETTER H WITH CARON 
+	TokenNamePLUS	
"ʜ"	TokenNameStringLiteral	ʜ
// U+029C: LATIN LETTER SMALL CAPITAL H 	TokenNameCOMMENT_LINE	U+029C: LATIN LETTER SMALL CAPITAL H 
+	TokenNamePLUS	
"Ḣ"	TokenNameStringLiteral	Ḣ
// U+1E22: LATIN CAPITAL LETTER H WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E22: LATIN CAPITAL LETTER H WITH DOT ABOVE 
+	TokenNamePLUS	
"Ḥ"	TokenNameStringLiteral	Ḥ
// U+1E24: LATIN CAPITAL LETTER H WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E24: LATIN CAPITAL LETTER H WITH DOT BELOW 
+	TokenNamePLUS	
"Ḧ"	TokenNameStringLiteral	Ḧ
// U+1E26: LATIN CAPITAL LETTER H WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+1E26: LATIN CAPITAL LETTER H WITH DIAERESIS 
+	TokenNamePLUS	
"Ḩ"	TokenNameStringLiteral	Ḩ
// U+1E28: LATIN CAPITAL LETTER H WITH CEDILLA 	TokenNameCOMMENT_LINE	U+1E28: LATIN CAPITAL LETTER H WITH CEDILLA 
+	TokenNamePLUS	
"Ḫ"	TokenNameStringLiteral	Ḫ
// U+1E2A: LATIN CAPITAL LETTER H WITH BREVE BELOW 	TokenNameCOMMENT_LINE	U+1E2A: LATIN CAPITAL LETTER H WITH BREVE BELOW 
+	TokenNamePLUS	
"Ⓗ"	TokenNameStringLiteral	Ⓗ
// U+24BD: CIRCLED LATIN CAPITAL LETTER H 	TokenNameCOMMENT_LINE	U+24BD: CIRCLED LATIN CAPITAL LETTER H 
+	TokenNamePLUS	
"Ⱨ"	TokenNameStringLiteral	Ⱨ
// U+2C67: LATIN CAPITAL LETTER H WITH DESCENDER 	TokenNameCOMMENT_LINE	U+2C67: LATIN CAPITAL LETTER H WITH DESCENDER 
+	TokenNamePLUS	
"Ⱶ"	TokenNameStringLiteral	Ⱶ
// U+2C75: LATIN CAPITAL LETTER HALF H 	TokenNameCOMMENT_LINE	U+2C75: LATIN CAPITAL LETTER HALF H 
+	TokenNamePLUS	
"Ｈ"	TokenNameStringLiteral	Ｈ
// U+FF28: FULLWIDTH LATIN CAPITAL LETTER H 	TokenNameCOMMENT_LINE	U+FF28: FULLWIDTH LATIN CAPITAL LETTER H 
,	TokenNameCOMMA	
"H"	TokenNameStringLiteral	H
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ĥ"	TokenNameStringLiteral	ĥ
// U+0125: LATIN SMALL LETTER H WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0125: LATIN SMALL LETTER H WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ħ"	TokenNameStringLiteral	ħ
// U+0127: LATIN SMALL LETTER H WITH STROKE 	TokenNameCOMMENT_LINE	U+0127: LATIN SMALL LETTER H WITH STROKE 
+	TokenNamePLUS	
"ȟ"	TokenNameStringLiteral	ȟ
// U+021F: LATIN SMALL LETTER H WITH CARON 	TokenNameCOMMENT_LINE	U+021F: LATIN SMALL LETTER H WITH CARON 
+	TokenNamePLUS	
"ɥ"	TokenNameStringLiteral	ɥ
// U+0265: LATIN SMALL LETTER TURNED H 	TokenNameCOMMENT_LINE	U+0265: LATIN SMALL LETTER TURNED H 
+	TokenNamePLUS	
"ɦ"	TokenNameStringLiteral	ɦ
// U+0266: LATIN SMALL LETTER H WITH HOOK 	TokenNameCOMMENT_LINE	U+0266: LATIN SMALL LETTER H WITH HOOK 
+	TokenNamePLUS	
"ʮ"	TokenNameStringLiteral	ʮ
// U+02AE: LATIN SMALL LETTER TURNED H WITH FISHHOOK 	TokenNameCOMMENT_LINE	U+02AE: LATIN SMALL LETTER TURNED H WITH FISHHOOK 
+	TokenNamePLUS	
"ʯ"	TokenNameStringLiteral	ʯ
// U+02AF: LATIN SMALL LETTER TURNED H WITH FISHHOOK AND TAIL 	TokenNameCOMMENT_LINE	U+02AF: LATIN SMALL LETTER TURNED H WITH FISHHOOK AND TAIL 
+	TokenNamePLUS	
"ḣ"	TokenNameStringLiteral	ḣ
// U+1E23: LATIN SMALL LETTER H WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E23: LATIN SMALL LETTER H WITH DOT ABOVE 
+	TokenNamePLUS	
"ḥ"	TokenNameStringLiteral	ḥ
// U+1E25: LATIN SMALL LETTER H WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E25: LATIN SMALL LETTER H WITH DOT BELOW 
+	TokenNamePLUS	
"ḧ"	TokenNameStringLiteral	ḧ
// U+1E27: LATIN SMALL LETTER H WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+1E27: LATIN SMALL LETTER H WITH DIAERESIS 
+	TokenNamePLUS	
"ḩ"	TokenNameStringLiteral	ḩ
// U+1E29: LATIN SMALL LETTER H WITH CEDILLA 	TokenNameCOMMENT_LINE	U+1E29: LATIN SMALL LETTER H WITH CEDILLA 
+	TokenNamePLUS	
"ḫ"	TokenNameStringLiteral	ḫ
// U+1E2B: LATIN SMALL LETTER H WITH BREVE BELOW 	TokenNameCOMMENT_LINE	U+1E2B: LATIN SMALL LETTER H WITH BREVE BELOW 
+	TokenNamePLUS	
"ẖ"	TokenNameStringLiteral	ẖ
// U+1E96: LATIN SMALL LETTER H WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E96: LATIN SMALL LETTER H WITH LINE BELOW 
+	TokenNamePLUS	
"ⓗ"	TokenNameStringLiteral	ⓗ
// U+24D7: CIRCLED LATIN SMALL LETTER H 	TokenNameCOMMENT_LINE	U+24D7: CIRCLED LATIN SMALL LETTER H 
+	TokenNamePLUS	
"ⱨ"	TokenNameStringLiteral	ⱨ
// U+2C68: LATIN SMALL LETTER H WITH DESCENDER 	TokenNameCOMMENT_LINE	U+2C68: LATIN SMALL LETTER H WITH DESCENDER 
+	TokenNamePLUS	
"ⱶ"	TokenNameStringLiteral	ⱶ
// U+2C76: LATIN SMALL LETTER HALF H 	TokenNameCOMMENT_LINE	U+2C76: LATIN SMALL LETTER HALF H 
+	TokenNamePLUS	
"ｈ"	TokenNameStringLiteral	ｈ
// U+FF48: FULLWIDTH LATIN SMALL LETTER H 	TokenNameCOMMENT_LINE	U+FF48: FULLWIDTH LATIN SMALL LETTER H 
,	TokenNameCOMMA	
"h"	TokenNameStringLiteral	h
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ƕ"	TokenNameStringLiteral	Ƕ
// U+01F6: LATIN CAPITAL LETTER HWAIR 	TokenNameCOMMENT_LINE	U+01F6: LATIN CAPITAL LETTER HWAIR 
,	TokenNameCOMMA	
"HV"	TokenNameStringLiteral	HV
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒣"	TokenNameStringLiteral	⒣
// U+24A3: PARENTHESIZED LATIN SMALL LETTER H 	TokenNameCOMMENT_LINE	U+24A3: PARENTHESIZED LATIN SMALL LETTER H 
,	TokenNameCOMMA	
"(h)"	TokenNameStringLiteral	(h)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ƕ"	TokenNameStringLiteral	ƕ
// U+0195: LATIN SMALL LETTER HV 	TokenNameCOMMENT_LINE	U+0195: LATIN SMALL LETTER HV 
,	TokenNameCOMMA	
"hv"	TokenNameStringLiteral	hv
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ì"	TokenNameStringLiteral	Ì
// U+00CC: LATIN CAPITAL LETTER I WITH GRAVE 	TokenNameCOMMENT_LINE	U+00CC: LATIN CAPITAL LETTER I WITH GRAVE 
+	TokenNamePLUS	
"Í"	TokenNameStringLiteral	Í
// U+00CD: LATIN CAPITAL LETTER I WITH ACUTE 	TokenNameCOMMENT_LINE	U+00CD: LATIN CAPITAL LETTER I WITH ACUTE 
+	TokenNamePLUS	
"Î"	TokenNameStringLiteral	Î
// U+00CE: LATIN CAPITAL LETTER I WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00CE: LATIN CAPITAL LETTER I WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ï"	TokenNameStringLiteral	Ï
// U+00CF: LATIN CAPITAL LETTER I WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00CF: LATIN CAPITAL LETTER I WITH DIAERESIS 
+	TokenNamePLUS	
"Ĩ"	TokenNameStringLiteral	Ĩ
// U+0128: LATIN CAPITAL LETTER I WITH TILDE 	TokenNameCOMMENT_LINE	U+0128: LATIN CAPITAL LETTER I WITH TILDE 
+	TokenNamePLUS	
"Ī"	TokenNameStringLiteral	Ī
// U+012A: LATIN CAPITAL LETTER I WITH MACRON 	TokenNameCOMMENT_LINE	U+012A: LATIN CAPITAL LETTER I WITH MACRON 
+	TokenNamePLUS	
"Ĭ"	TokenNameStringLiteral	Ĭ
// U+012C: LATIN CAPITAL LETTER I WITH BREVE 	TokenNameCOMMENT_LINE	U+012C: LATIN CAPITAL LETTER I WITH BREVE 
+	TokenNamePLUS	
"Į"	TokenNameStringLiteral	Į
// U+012E: LATIN CAPITAL LETTER I WITH OGONEK 	TokenNameCOMMENT_LINE	U+012E: LATIN CAPITAL LETTER I WITH OGONEK 
+	TokenNamePLUS	
"İ"	TokenNameStringLiteral	İ
// U+0130: LATIN CAPITAL LETTER I WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+0130: LATIN CAPITAL LETTER I WITH DOT ABOVE 
+	TokenNamePLUS	
"Ɩ"	TokenNameStringLiteral	Ɩ
// U+0196: LATIN CAPITAL LETTER IOTA 	TokenNameCOMMENT_LINE	U+0196: LATIN CAPITAL LETTER IOTA 
+	TokenNamePLUS	
"Ɨ"	TokenNameStringLiteral	Ɨ
// U+0197: LATIN CAPITAL LETTER I WITH STROKE 	TokenNameCOMMENT_LINE	U+0197: LATIN CAPITAL LETTER I WITH STROKE 
+	TokenNamePLUS	
"Ǐ"	TokenNameStringLiteral	Ǐ
// U+01CF: LATIN CAPITAL LETTER I WITH CARON 	TokenNameCOMMENT_LINE	U+01CF: LATIN CAPITAL LETTER I WITH CARON 
+	TokenNamePLUS	
"Ȉ"	TokenNameStringLiteral	Ȉ
// U+0208: LATIN CAPITAL LETTER I WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0208: LATIN CAPITAL LETTER I WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"Ȋ"	TokenNameStringLiteral	Ȋ
// U+020A: LATIN CAPITAL LETTER I WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+020A: LATIN CAPITAL LETTER I WITH INVERTED BREVE 
+	TokenNamePLUS	
"ɪ"	TokenNameStringLiteral	ɪ
// U+026A: LATIN LETTER SMALL CAPITAL I 	TokenNameCOMMENT_LINE	U+026A: LATIN LETTER SMALL CAPITAL I 
+	TokenNamePLUS	
"ᵻ"	TokenNameStringLiteral	ᵻ
// U+1D7B: LATIN SMALL CAPITAL LETTER I WITH STROKE 	TokenNameCOMMENT_LINE	U+1D7B: LATIN SMALL CAPITAL LETTER I WITH STROKE 
+	TokenNamePLUS	
"Ḭ"	TokenNameStringLiteral	Ḭ
// U+1E2C: LATIN CAPITAL LETTER I WITH TILDE BELOW 	TokenNameCOMMENT_LINE	U+1E2C: LATIN CAPITAL LETTER I WITH TILDE BELOW 
+	TokenNamePLUS	
"Ḯ"	TokenNameStringLiteral	Ḯ
// U+1E2E: LATIN CAPITAL LETTER I WITH DIAERESIS AND ACUTE 	TokenNameCOMMENT_LINE	U+1E2E: LATIN CAPITAL LETTER I WITH DIAERESIS AND ACUTE 
+	TokenNamePLUS	
"Ỉ"	TokenNameStringLiteral	Ỉ
// U+1EC8: LATIN CAPITAL LETTER I WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EC8: LATIN CAPITAL LETTER I WITH HOOK ABOVE 
+	TokenNamePLUS	
"Ị"	TokenNameStringLiteral	Ị
// U+1ECA: LATIN CAPITAL LETTER I WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1ECA: LATIN CAPITAL LETTER I WITH DOT BELOW 
+	TokenNamePLUS	
"Ⓘ"	TokenNameStringLiteral	Ⓘ
// U+24BE: CIRCLED LATIN CAPITAL LETTER I 	TokenNameCOMMENT_LINE	U+24BE: CIRCLED LATIN CAPITAL LETTER I 
+	TokenNamePLUS	
"ꟾ"	TokenNameStringLiteral	ꟾ
// U+A7FE: LATIN EPIGRAPHIC LETTER I LONGA 	TokenNameCOMMENT_LINE	U+A7FE: LATIN EPIGRAPHIC LETTER I LONGA 
+	TokenNamePLUS	
"Ｉ"	TokenNameStringLiteral	Ｉ
// U+FF29: FULLWIDTH LATIN CAPITAL LETTER I 	TokenNameCOMMENT_LINE	U+FF29: FULLWIDTH LATIN CAPITAL LETTER I 
,	TokenNameCOMMA	
"I"	TokenNameStringLiteral	I
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ì"	TokenNameStringLiteral	ì
// U+00EC: LATIN SMALL LETTER I WITH GRAVE 	TokenNameCOMMENT_LINE	U+00EC: LATIN SMALL LETTER I WITH GRAVE 
+	TokenNamePLUS	
"í"	TokenNameStringLiteral	í
// U+00ED: LATIN SMALL LETTER I WITH ACUTE 	TokenNameCOMMENT_LINE	U+00ED: LATIN SMALL LETTER I WITH ACUTE 
+	TokenNamePLUS	
"î"	TokenNameStringLiteral	î
// U+00EE: LATIN SMALL LETTER I WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00EE: LATIN SMALL LETTER I WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ï"	TokenNameStringLiteral	ï
// U+00EF: LATIN SMALL LETTER I WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00EF: LATIN SMALL LETTER I WITH DIAERESIS 
+	TokenNamePLUS	
"ĩ"	TokenNameStringLiteral	ĩ
// U+0129: LATIN SMALL LETTER I WITH TILDE 	TokenNameCOMMENT_LINE	U+0129: LATIN SMALL LETTER I WITH TILDE 
+	TokenNamePLUS	
"ī"	TokenNameStringLiteral	ī
// U+012B: LATIN SMALL LETTER I WITH MACRON 	TokenNameCOMMENT_LINE	U+012B: LATIN SMALL LETTER I WITH MACRON 
+	TokenNamePLUS	
"ĭ"	TokenNameStringLiteral	ĭ
// U+012D: LATIN SMALL LETTER I WITH BREVE 	TokenNameCOMMENT_LINE	U+012D: LATIN SMALL LETTER I WITH BREVE 
+	TokenNamePLUS	
"į"	TokenNameStringLiteral	į
// U+012F: LATIN SMALL LETTER I WITH OGONEK 	TokenNameCOMMENT_LINE	U+012F: LATIN SMALL LETTER I WITH OGONEK 
+	TokenNamePLUS	
"ı"	TokenNameStringLiteral	ı
// U+0131: LATIN SMALL LETTER DOTLESS I 	TokenNameCOMMENT_LINE	U+0131: LATIN SMALL LETTER DOTLESS I 
+	TokenNamePLUS	
"ǐ"	TokenNameStringLiteral	ǐ
// U+01D0: LATIN SMALL LETTER I WITH CARON 	TokenNameCOMMENT_LINE	U+01D0: LATIN SMALL LETTER I WITH CARON 
+	TokenNamePLUS	
"ȉ"	TokenNameStringLiteral	ȉ
// U+0209: LATIN SMALL LETTER I WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0209: LATIN SMALL LETTER I WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"ȋ"	TokenNameStringLiteral	ȋ
// U+020B: LATIN SMALL LETTER I WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+020B: LATIN SMALL LETTER I WITH INVERTED BREVE 
+	TokenNamePLUS	
"ɨ"	TokenNameStringLiteral	ɨ
// U+0268: LATIN SMALL LETTER I WITH STROKE 	TokenNameCOMMENT_LINE	U+0268: LATIN SMALL LETTER I WITH STROKE 
+	TokenNamePLUS	
"ᴉ"	TokenNameStringLiteral	ᴉ
// U+1D09: LATIN SMALL LETTER TURNED I 	TokenNameCOMMENT_LINE	U+1D09: LATIN SMALL LETTER TURNED I 
+	TokenNamePLUS	
"ᵢ"	TokenNameStringLiteral	ᵢ
// U+1D62: LATIN SUBSCRIPT SMALL LETTER I 	TokenNameCOMMENT_LINE	U+1D62: LATIN SUBSCRIPT SMALL LETTER I 
+	TokenNamePLUS	
"ᵼ"	TokenNameStringLiteral	ᵼ
// U+1D7C: LATIN SMALL LETTER IOTA WITH STROKE 	TokenNameCOMMENT_LINE	U+1D7C: LATIN SMALL LETTER IOTA WITH STROKE 
+	TokenNamePLUS	
"ᶖ"	TokenNameStringLiteral	ᶖ
// U+1D96: LATIN SMALL LETTER I WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+1D96: LATIN SMALL LETTER I WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ḭ"	TokenNameStringLiteral	ḭ
// U+1E2D: LATIN SMALL LETTER I WITH TILDE BELOW 	TokenNameCOMMENT_LINE	U+1E2D: LATIN SMALL LETTER I WITH TILDE BELOW 
+	TokenNamePLUS	
"ḯ"	TokenNameStringLiteral	ḯ
// U+1E2F: LATIN SMALL LETTER I WITH DIAERESIS AND ACUTE 	TokenNameCOMMENT_LINE	U+1E2F: LATIN SMALL LETTER I WITH DIAERESIS AND ACUTE 
+	TokenNamePLUS	
"ỉ"	TokenNameStringLiteral	ỉ
// U+1EC9: LATIN SMALL LETTER I WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EC9: LATIN SMALL LETTER I WITH HOOK ABOVE 
+	TokenNamePLUS	
"ị"	TokenNameStringLiteral	ị
// U+1ECB: LATIN SMALL LETTER I WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1ECB: LATIN SMALL LETTER I WITH DOT BELOW 
+	TokenNamePLUS	
"ⁱ"	TokenNameStringLiteral	ⁱ
// U+2071: SUPERSCRIPT LATIN SMALL LETTER I 	TokenNameCOMMENT_LINE	U+2071: SUPERSCRIPT LATIN SMALL LETTER I 
+	TokenNamePLUS	
"ⓘ"	TokenNameStringLiteral	ⓘ
// U+24D8: CIRCLED LATIN SMALL LETTER I 	TokenNameCOMMENT_LINE	U+24D8: CIRCLED LATIN SMALL LETTER I 
+	TokenNamePLUS	
"ｉ"	TokenNameStringLiteral	ｉ
// U+FF49: FULLWIDTH LATIN SMALL LETTER I 	TokenNameCOMMENT_LINE	U+FF49: FULLWIDTH LATIN SMALL LETTER I 
,	TokenNameCOMMA	
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ĳ"	TokenNameStringLiteral	Ĳ
// U+0132: LATIN CAPITAL LIGATURE IJ 	TokenNameCOMMENT_LINE	U+0132: LATIN CAPITAL LIGATURE IJ 
,	TokenNameCOMMA	
"IJ"	TokenNameStringLiteral	IJ
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒤"	TokenNameStringLiteral	⒤
// U+24A4: PARENTHESIZED LATIN SMALL LETTER I 	TokenNameCOMMENT_LINE	U+24A4: PARENTHESIZED LATIN SMALL LETTER I 
,	TokenNameCOMMA	
"(i)"	TokenNameStringLiteral	(i)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ĳ"	TokenNameStringLiteral	ĳ
// U+0133: LATIN SMALL LIGATURE IJ 	TokenNameCOMMENT_LINE	U+0133: LATIN SMALL LIGATURE IJ 
,	TokenNameCOMMA	
"ij"	TokenNameStringLiteral	ij
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ĵ"	TokenNameStringLiteral	Ĵ
// U+0134: LATIN CAPITAL LETTER J WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0134: LATIN CAPITAL LETTER J WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ɉ"	TokenNameStringLiteral	Ɉ
// U+0248: LATIN CAPITAL LETTER J WITH STROKE 	TokenNameCOMMENT_LINE	U+0248: LATIN CAPITAL LETTER J WITH STROKE 
+	TokenNamePLUS	
"ᴊ"	TokenNameStringLiteral	ᴊ
// U+1D0A: LATIN LETTER SMALL CAPITAL J 	TokenNameCOMMENT_LINE	U+1D0A: LATIN LETTER SMALL CAPITAL J 
+	TokenNamePLUS	
"Ⓙ"	TokenNameStringLiteral	Ⓙ
// U+24BF: CIRCLED LATIN CAPITAL LETTER J 	TokenNameCOMMENT_LINE	U+24BF: CIRCLED LATIN CAPITAL LETTER J 
+	TokenNamePLUS	
"Ｊ"	TokenNameStringLiteral	Ｊ
// U+FF2A: FULLWIDTH LATIN CAPITAL LETTER J 	TokenNameCOMMENT_LINE	U+FF2A: FULLWIDTH LATIN CAPITAL LETTER J 
,	TokenNameCOMMA	
"J"	TokenNameStringLiteral	J
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ĵ"	TokenNameStringLiteral	ĵ
// U+0135: LATIN SMALL LETTER J WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0135: LATIN SMALL LETTER J WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ǰ"	TokenNameStringLiteral	ǰ
// U+01F0: LATIN SMALL LETTER J WITH CARON 	TokenNameCOMMENT_LINE	U+01F0: LATIN SMALL LETTER J WITH CARON 
+	TokenNamePLUS	
"ȷ"	TokenNameStringLiteral	ȷ
// U+0237: LATIN SMALL LETTER DOTLESS J 	TokenNameCOMMENT_LINE	U+0237: LATIN SMALL LETTER DOTLESS J 
+	TokenNamePLUS	
"ɉ"	TokenNameStringLiteral	ɉ
// U+0249: LATIN SMALL LETTER J WITH STROKE 	TokenNameCOMMENT_LINE	U+0249: LATIN SMALL LETTER J WITH STROKE 
+	TokenNamePLUS	
"ɟ"	TokenNameStringLiteral	ɟ
// U+025F: LATIN SMALL LETTER DOTLESS J WITH STROKE 	TokenNameCOMMENT_LINE	U+025F: LATIN SMALL LETTER DOTLESS J WITH STROKE 
+	TokenNamePLUS	
"ʄ"	TokenNameStringLiteral	ʄ
// U+0284: LATIN SMALL LETTER DOTLESS J WITH STROKE AND HOOK 	TokenNameCOMMENT_LINE	U+0284: LATIN SMALL LETTER DOTLESS J WITH STROKE AND HOOK 
+	TokenNamePLUS	
"ʝ"	TokenNameStringLiteral	ʝ
// U+029D: LATIN SMALL LETTER J WITH CROSSED-TAIL 	TokenNameCOMMENT_LINE	U+029D: LATIN SMALL LETTER J WITH CROSSED-TAIL 
+	TokenNamePLUS	
"ⓙ"	TokenNameStringLiteral	ⓙ
// U+24D9: CIRCLED LATIN SMALL LETTER J 	TokenNameCOMMENT_LINE	U+24D9: CIRCLED LATIN SMALL LETTER J 
+	TokenNamePLUS	
"ⱼ"	TokenNameStringLiteral	ⱼ
// U+2C7C: LATIN SUBSCRIPT SMALL LETTER J 	TokenNameCOMMENT_LINE	U+2C7C: LATIN SUBSCRIPT SMALL LETTER J 
+	TokenNamePLUS	
"ｊ"	TokenNameStringLiteral	ｊ
// U+FF4A: FULLWIDTH LATIN SMALL LETTER J 	TokenNameCOMMENT_LINE	U+FF4A: FULLWIDTH LATIN SMALL LETTER J 
,	TokenNameCOMMA	
"j"	TokenNameStringLiteral	j
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒥"	TokenNameStringLiteral	⒥
// U+24A5: PARENTHESIZED LATIN SMALL LETTER J 	TokenNameCOMMENT_LINE	U+24A5: PARENTHESIZED LATIN SMALL LETTER J 
,	TokenNameCOMMA	
"(j)"	TokenNameStringLiteral	(j)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ķ"	TokenNameStringLiteral	Ķ
// U+0136: LATIN CAPITAL LETTER K WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0136: LATIN CAPITAL LETTER K WITH CEDILLA 
+	TokenNamePLUS	
"Ƙ"	TokenNameStringLiteral	Ƙ
// U+0198: LATIN CAPITAL LETTER K WITH HOOK 	TokenNameCOMMENT_LINE	U+0198: LATIN CAPITAL LETTER K WITH HOOK 
+	TokenNamePLUS	
"Ǩ"	TokenNameStringLiteral	Ǩ
// U+01E8: LATIN CAPITAL LETTER K WITH CARON 	TokenNameCOMMENT_LINE	U+01E8: LATIN CAPITAL LETTER K WITH CARON 
+	TokenNamePLUS	
"ᴋ"	TokenNameStringLiteral	ᴋ
// U+1D0B: LATIN LETTER SMALL CAPITAL K 	TokenNameCOMMENT_LINE	U+1D0B: LATIN LETTER SMALL CAPITAL K 
+	TokenNamePLUS	
"Ḱ"	TokenNameStringLiteral	Ḱ
// U+1E30: LATIN CAPITAL LETTER K WITH ACUTE 	TokenNameCOMMENT_LINE	U+1E30: LATIN CAPITAL LETTER K WITH ACUTE 
+	TokenNamePLUS	
"Ḳ"	TokenNameStringLiteral	Ḳ
// U+1E32: LATIN CAPITAL LETTER K WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E32: LATIN CAPITAL LETTER K WITH DOT BELOW 
+	TokenNamePLUS	
"Ḵ"	TokenNameStringLiteral	Ḵ
// U+1E34: LATIN CAPITAL LETTER K WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E34: LATIN CAPITAL LETTER K WITH LINE BELOW 
+	TokenNamePLUS	
"Ⓚ"	TokenNameStringLiteral	Ⓚ
// U+24C0: CIRCLED LATIN CAPITAL LETTER K 	TokenNameCOMMENT_LINE	U+24C0: CIRCLED LATIN CAPITAL LETTER K 
+	TokenNamePLUS	
"Ⱪ"	TokenNameStringLiteral	Ⱪ
// U+2C69: LATIN CAPITAL LETTER K WITH DESCENDER 	TokenNameCOMMENT_LINE	U+2C69: LATIN CAPITAL LETTER K WITH DESCENDER 
+	TokenNamePLUS	
"Ꝁ"	TokenNameStringLiteral	Ꝁ
// U+A740: LATIN CAPITAL LETTER K WITH STROKE 	TokenNameCOMMENT_LINE	U+A740: LATIN CAPITAL LETTER K WITH STROKE 
+	TokenNamePLUS	
"Ꝃ"	TokenNameStringLiteral	Ꝃ
// U+A742: LATIN CAPITAL LETTER K WITH DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+A742: LATIN CAPITAL LETTER K WITH DIAGONAL STROKE 
+	TokenNamePLUS	
"Ꝅ"	TokenNameStringLiteral	Ꝅ
// U+A744: LATIN CAPITAL LETTER K WITH STROKE AND DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+A744: LATIN CAPITAL LETTER K WITH STROKE AND DIAGONAL STROKE 
+	TokenNamePLUS	
"Ｋ"	TokenNameStringLiteral	Ｋ
// U+FF2B: FULLWIDTH LATIN CAPITAL LETTER K 	TokenNameCOMMENT_LINE	U+FF2B: FULLWIDTH LATIN CAPITAL LETTER K 
,	TokenNameCOMMA	
"K"	TokenNameStringLiteral	K
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ķ"	TokenNameStringLiteral	ķ
// U+0137: LATIN SMALL LETTER K WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0137: LATIN SMALL LETTER K WITH CEDILLA 
+	TokenNamePLUS	
"ƙ"	TokenNameStringLiteral	ƙ
// U+0199: LATIN SMALL LETTER K WITH HOOK 	TokenNameCOMMENT_LINE	U+0199: LATIN SMALL LETTER K WITH HOOK 
+	TokenNamePLUS	
"ǩ"	TokenNameStringLiteral	ǩ
// U+01E9: LATIN SMALL LETTER K WITH CARON 	TokenNameCOMMENT_LINE	U+01E9: LATIN SMALL LETTER K WITH CARON 
+	TokenNamePLUS	
"ʞ"	TokenNameStringLiteral	ʞ
// U+029E: LATIN SMALL LETTER TURNED K 	TokenNameCOMMENT_LINE	U+029E: LATIN SMALL LETTER TURNED K 
+	TokenNamePLUS	
"ᶄ"	TokenNameStringLiteral	ᶄ
// U+1D84: LATIN SMALL LETTER K WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D84: LATIN SMALL LETTER K WITH PALATAL HOOK 
+	TokenNamePLUS	
"ḱ"	TokenNameStringLiteral	ḱ
// U+1E31: LATIN SMALL LETTER K WITH ACUTE 	TokenNameCOMMENT_LINE	U+1E31: LATIN SMALL LETTER K WITH ACUTE 
+	TokenNamePLUS	
"ḳ"	TokenNameStringLiteral	ḳ
// U+1E33: LATIN SMALL LETTER K WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E33: LATIN SMALL LETTER K WITH DOT BELOW 
+	TokenNamePLUS	
"ḵ"	TokenNameStringLiteral	ḵ
// U+1E35: LATIN SMALL LETTER K WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E35: LATIN SMALL LETTER K WITH LINE BELOW 
+	TokenNamePLUS	
"ⓚ"	TokenNameStringLiteral	ⓚ
// U+24DA: CIRCLED LATIN SMALL LETTER K 	TokenNameCOMMENT_LINE	U+24DA: CIRCLED LATIN SMALL LETTER K 
+	TokenNamePLUS	
"ⱪ"	TokenNameStringLiteral	ⱪ
// U+2C6A: LATIN SMALL LETTER K WITH DESCENDER 	TokenNameCOMMENT_LINE	U+2C6A: LATIN SMALL LETTER K WITH DESCENDER 
+	TokenNamePLUS	
"ꝁ"	TokenNameStringLiteral	ꝁ
// U+A741: LATIN SMALL LETTER K WITH STROKE 	TokenNameCOMMENT_LINE	U+A741: LATIN SMALL LETTER K WITH STROKE 
+	TokenNamePLUS	
"ꝃ"	TokenNameStringLiteral	ꝃ
// U+A743: LATIN SMALL LETTER K WITH DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+A743: LATIN SMALL LETTER K WITH DIAGONAL STROKE 
+	TokenNamePLUS	
"ꝅ"	TokenNameStringLiteral	ꝅ
// U+A745: LATIN SMALL LETTER K WITH STROKE AND DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+A745: LATIN SMALL LETTER K WITH STROKE AND DIAGONAL STROKE 
+	TokenNamePLUS	
"ｋ"	TokenNameStringLiteral	ｋ
// U+FF4B: FULLWIDTH LATIN SMALL LETTER K 	TokenNameCOMMENT_LINE	U+FF4B: FULLWIDTH LATIN SMALL LETTER K 
,	TokenNameCOMMA	
"k"	TokenNameStringLiteral	k
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒦"	TokenNameStringLiteral	⒦
// U+24A6: PARENTHESIZED LATIN SMALL LETTER K 	TokenNameCOMMENT_LINE	U+24A6: PARENTHESIZED LATIN SMALL LETTER K 
,	TokenNameCOMMA	
"(k)"	TokenNameStringLiteral	(k)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ĺ"	TokenNameStringLiteral	Ĺ
// U+0139: LATIN CAPITAL LETTER L WITH ACUTE 	TokenNameCOMMENT_LINE	U+0139: LATIN CAPITAL LETTER L WITH ACUTE 
+	TokenNamePLUS	
"Ļ"	TokenNameStringLiteral	Ļ
// U+013B: LATIN CAPITAL LETTER L WITH CEDILLA 	TokenNameCOMMENT_LINE	U+013B: LATIN CAPITAL LETTER L WITH CEDILLA 
+	TokenNamePLUS	
"Ľ"	TokenNameStringLiteral	Ľ
// U+013D: LATIN CAPITAL LETTER L WITH CARON 	TokenNameCOMMENT_LINE	U+013D: LATIN CAPITAL LETTER L WITH CARON 
+	TokenNamePLUS	
"Ŀ"	TokenNameStringLiteral	Ŀ
// U+013F: LATIN CAPITAL LETTER L WITH MIDDLE DOT 	TokenNameCOMMENT_LINE	U+013F: LATIN CAPITAL LETTER L WITH MIDDLE DOT 
+	TokenNamePLUS	
"Ł"	TokenNameStringLiteral	Ł
// U+0141: LATIN CAPITAL LETTER L WITH STROKE 	TokenNameCOMMENT_LINE	U+0141: LATIN CAPITAL LETTER L WITH STROKE 
+	TokenNamePLUS	
"Ƚ"	TokenNameStringLiteral	Ƚ
// U+023D: LATIN CAPITAL LETTER L WITH BAR 	TokenNameCOMMENT_LINE	U+023D: LATIN CAPITAL LETTER L WITH BAR 
+	TokenNamePLUS	
"ʟ"	TokenNameStringLiteral	ʟ
// U+029F: LATIN LETTER SMALL CAPITAL L 	TokenNameCOMMENT_LINE	U+029F: LATIN LETTER SMALL CAPITAL L 
+	TokenNamePLUS	
"ᴌ"	TokenNameStringLiteral	ᴌ
// U+1D0C: LATIN LETTER SMALL CAPITAL L WITH STROKE 	TokenNameCOMMENT_LINE	U+1D0C: LATIN LETTER SMALL CAPITAL L WITH STROKE 
+	TokenNamePLUS	
"Ḷ"	TokenNameStringLiteral	Ḷ
// U+1E36: LATIN CAPITAL LETTER L WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E36: LATIN CAPITAL LETTER L WITH DOT BELOW 
+	TokenNamePLUS	
"Ḹ"	TokenNameStringLiteral	Ḹ
// U+1E38: LATIN CAPITAL LETTER L WITH DOT BELOW AND MACRON 	TokenNameCOMMENT_LINE	U+1E38: LATIN CAPITAL LETTER L WITH DOT BELOW AND MACRON 
+	TokenNamePLUS	
"Ḻ"	TokenNameStringLiteral	Ḻ
// U+1E3A: LATIN CAPITAL LETTER L WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E3A: LATIN CAPITAL LETTER L WITH LINE BELOW 
+	TokenNamePLUS	
"Ḽ"	TokenNameStringLiteral	Ḽ
// U+1E3C: LATIN CAPITAL LETTER L WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E3C: LATIN CAPITAL LETTER L WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"Ⓛ"	TokenNameStringLiteral	Ⓛ
// U+24C1: CIRCLED LATIN CAPITAL LETTER L 	TokenNameCOMMENT_LINE	U+24C1: CIRCLED LATIN CAPITAL LETTER L 
+	TokenNamePLUS	
"Ⱡ"	TokenNameStringLiteral	Ⱡ
// U+2C60: LATIN CAPITAL LETTER L WITH DOUBLE BAR 	TokenNameCOMMENT_LINE	U+2C60: LATIN CAPITAL LETTER L WITH DOUBLE BAR 
+	TokenNamePLUS	
"Ɫ"	TokenNameStringLiteral	Ɫ
// U+2C62: LATIN CAPITAL LETTER L WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+2C62: LATIN CAPITAL LETTER L WITH MIDDLE TILDE 
+	TokenNamePLUS	
"Ꝇ"	TokenNameStringLiteral	Ꝇ
// U+A746: LATIN CAPITAL LETTER BROKEN L 	TokenNameCOMMENT_LINE	U+A746: LATIN CAPITAL LETTER BROKEN L 
+	TokenNamePLUS	
"Ꝉ"	TokenNameStringLiteral	Ꝉ
// U+A748: LATIN CAPITAL LETTER L WITH HIGH STROKE 	TokenNameCOMMENT_LINE	U+A748: LATIN CAPITAL LETTER L WITH HIGH STROKE 
+	TokenNamePLUS	
"Ꞁ"	TokenNameStringLiteral	Ꞁ
// U+A780: LATIN CAPITAL LETTER TURNED L 	TokenNameCOMMENT_LINE	U+A780: LATIN CAPITAL LETTER TURNED L 
+	TokenNamePLUS	
"Ｌ"	TokenNameStringLiteral	Ｌ
// U+FF2C: FULLWIDTH LATIN CAPITAL LETTER L 	TokenNameCOMMENT_LINE	U+FF2C: FULLWIDTH LATIN CAPITAL LETTER L 
,	TokenNameCOMMA	
"L"	TokenNameStringLiteral	L
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ĺ"	TokenNameStringLiteral	ĺ
// U+013A: LATIN SMALL LETTER L WITH ACUTE 	TokenNameCOMMENT_LINE	U+013A: LATIN SMALL LETTER L WITH ACUTE 
+	TokenNamePLUS	
"ļ"	TokenNameStringLiteral	ļ
// U+013C: LATIN SMALL LETTER L WITH CEDILLA 	TokenNameCOMMENT_LINE	U+013C: LATIN SMALL LETTER L WITH CEDILLA 
+	TokenNamePLUS	
"ľ"	TokenNameStringLiteral	ľ
// U+013E: LATIN SMALL LETTER L WITH CARON 	TokenNameCOMMENT_LINE	U+013E: LATIN SMALL LETTER L WITH CARON 
+	TokenNamePLUS	
"ŀ"	TokenNameStringLiteral	ŀ
// U+0140: LATIN SMALL LETTER L WITH MIDDLE DOT 	TokenNameCOMMENT_LINE	U+0140: LATIN SMALL LETTER L WITH MIDDLE DOT 
+	TokenNamePLUS	
"ł"	TokenNameStringLiteral	ł
// U+0142: LATIN SMALL LETTER L WITH STROKE 	TokenNameCOMMENT_LINE	U+0142: LATIN SMALL LETTER L WITH STROKE 
+	TokenNamePLUS	
"ƚ"	TokenNameStringLiteral	ƚ
// U+019A: LATIN SMALL LETTER L WITH BAR 	TokenNameCOMMENT_LINE	U+019A: LATIN SMALL LETTER L WITH BAR 
+	TokenNamePLUS	
"ȴ"	TokenNameStringLiteral	ȴ
// U+0234: LATIN SMALL LETTER L WITH CURL 	TokenNameCOMMENT_LINE	U+0234: LATIN SMALL LETTER L WITH CURL 
+	TokenNamePLUS	
"ɫ"	TokenNameStringLiteral	ɫ
// U+026B: LATIN SMALL LETTER L WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+026B: LATIN SMALL LETTER L WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ɬ"	TokenNameStringLiteral	ɬ
// U+026C: LATIN SMALL LETTER L WITH BELT 	TokenNameCOMMENT_LINE	U+026C: LATIN SMALL LETTER L WITH BELT 
+	TokenNamePLUS	
"ɭ"	TokenNameStringLiteral	ɭ
// U+026D: LATIN SMALL LETTER L WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+026D: LATIN SMALL LETTER L WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ᶅ"	TokenNameStringLiteral	ᶅ
// U+1D85: LATIN SMALL LETTER L WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D85: LATIN SMALL LETTER L WITH PALATAL HOOK 
+	TokenNamePLUS	
"ḷ"	TokenNameStringLiteral	ḷ
// U+1E37: LATIN SMALL LETTER L WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E37: LATIN SMALL LETTER L WITH DOT BELOW 
+	TokenNamePLUS	
"ḹ"	TokenNameStringLiteral	ḹ
// U+1E39: LATIN SMALL LETTER L WITH DOT BELOW AND MACRON 	TokenNameCOMMENT_LINE	U+1E39: LATIN SMALL LETTER L WITH DOT BELOW AND MACRON 
+	TokenNamePLUS	
"ḻ"	TokenNameStringLiteral	ḻ
// U+1E3B: LATIN SMALL LETTER L WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E3B: LATIN SMALL LETTER L WITH LINE BELOW 
+	TokenNamePLUS	
"ḽ"	TokenNameStringLiteral	ḽ
// U+1E3D: LATIN SMALL LETTER L WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E3D: LATIN SMALL LETTER L WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"ⓛ"	TokenNameStringLiteral	ⓛ
// U+24DB: CIRCLED LATIN SMALL LETTER L 	TokenNameCOMMENT_LINE	U+24DB: CIRCLED LATIN SMALL LETTER L 
+	TokenNamePLUS	
"ⱡ"	TokenNameStringLiteral	ⱡ
// U+2C61: LATIN SMALL LETTER L WITH DOUBLE BAR 	TokenNameCOMMENT_LINE	U+2C61: LATIN SMALL LETTER L WITH DOUBLE BAR 
+	TokenNamePLUS	
"ꝇ"	TokenNameStringLiteral	ꝇ
// U+A747: LATIN SMALL LETTER BROKEN L 	TokenNameCOMMENT_LINE	U+A747: LATIN SMALL LETTER BROKEN L 
+	TokenNamePLUS	
"ꝉ"	TokenNameStringLiteral	ꝉ
// U+A749: LATIN SMALL LETTER L WITH HIGH STROKE 	TokenNameCOMMENT_LINE	U+A749: LATIN SMALL LETTER L WITH HIGH STROKE 
+	TokenNamePLUS	
"ꞁ"	TokenNameStringLiteral	ꞁ
// U+A781: LATIN SMALL LETTER TURNED L 	TokenNameCOMMENT_LINE	U+A781: LATIN SMALL LETTER TURNED L 
+	TokenNamePLUS	
"ｌ"	TokenNameStringLiteral	ｌ
// U+FF4C: FULLWIDTH LATIN SMALL LETTER L 	TokenNameCOMMENT_LINE	U+FF4C: FULLWIDTH LATIN SMALL LETTER L 
,	TokenNameCOMMA	
"l"	TokenNameStringLiteral	l
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ǉ"	TokenNameStringLiteral	Ǉ
// U+01C7: LATIN CAPITAL LETTER LJ 	TokenNameCOMMENT_LINE	U+01C7: LATIN CAPITAL LETTER LJ 
,	TokenNameCOMMA	
"LJ"	TokenNameStringLiteral	LJ
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ỻ"	TokenNameStringLiteral	Ỻ
// U+1EFA: LATIN CAPITAL LETTER MIDDLE-WELSH LL 	TokenNameCOMMENT_LINE	U+1EFA: LATIN CAPITAL LETTER MIDDLE-WELSH LL 
,	TokenNameCOMMA	
"LL"	TokenNameStringLiteral	LL
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ǈ"	TokenNameStringLiteral	ǈ
// U+01C8: LATIN CAPITAL LETTER L WITH SMALL LETTER J 	TokenNameCOMMENT_LINE	U+01C8: LATIN CAPITAL LETTER L WITH SMALL LETTER J 
,	TokenNameCOMMA	
"Lj"	TokenNameStringLiteral	Lj
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒧"	TokenNameStringLiteral	⒧
// U+24A7: PARENTHESIZED LATIN SMALL LETTER L 	TokenNameCOMMENT_LINE	U+24A7: PARENTHESIZED LATIN SMALL LETTER L 
,	TokenNameCOMMA	
"(l)"	TokenNameStringLiteral	(l)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ǉ"	TokenNameStringLiteral	ǉ
// U+01C9: LATIN SMALL LETTER LJ 	TokenNameCOMMENT_LINE	U+01C9: LATIN SMALL LETTER LJ 
,	TokenNameCOMMA	
"lj"	TokenNameStringLiteral	lj
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ỻ"	TokenNameStringLiteral	ỻ
// U+1EFB: LATIN SMALL LETTER MIDDLE-WELSH LL 	TokenNameCOMMENT_LINE	U+1EFB: LATIN SMALL LETTER MIDDLE-WELSH LL 
,	TokenNameCOMMA	
"ll"	TokenNameStringLiteral	ll
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ʪ"	TokenNameStringLiteral	ʪ
// U+02AA: LATIN SMALL LETTER LS DIGRAPH 	TokenNameCOMMENT_LINE	U+02AA: LATIN SMALL LETTER LS DIGRAPH 
,	TokenNameCOMMA	
"ls"	TokenNameStringLiteral	ls
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ʫ"	TokenNameStringLiteral	ʫ
// U+02AB: LATIN SMALL LETTER LZ DIGRAPH 	TokenNameCOMMENT_LINE	U+02AB: LATIN SMALL LETTER LZ DIGRAPH 
,	TokenNameCOMMA	
"lz"	TokenNameStringLiteral	lz
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ɯ"	TokenNameStringLiteral	Ɯ
// U+019C: LATIN CAPITAL LETTER TURNED M 	TokenNameCOMMENT_LINE	U+019C: LATIN CAPITAL LETTER TURNED M 
+	TokenNamePLUS	
"ᴍ"	TokenNameStringLiteral	ᴍ
// U+1D0D: LATIN LETTER SMALL CAPITAL M 	TokenNameCOMMENT_LINE	U+1D0D: LATIN LETTER SMALL CAPITAL M 
+	TokenNamePLUS	
"Ḿ"	TokenNameStringLiteral	Ḿ
// U+1E3E: LATIN CAPITAL LETTER M WITH ACUTE 	TokenNameCOMMENT_LINE	U+1E3E: LATIN CAPITAL LETTER M WITH ACUTE 
+	TokenNamePLUS	
"Ṁ"	TokenNameStringLiteral	Ṁ
// U+1E40: LATIN CAPITAL LETTER M WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E40: LATIN CAPITAL LETTER M WITH DOT ABOVE 
+	TokenNamePLUS	
"Ṃ"	TokenNameStringLiteral	Ṃ
// U+1E42: LATIN CAPITAL LETTER M WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E42: LATIN CAPITAL LETTER M WITH DOT BELOW 
+	TokenNamePLUS	
"Ⓜ"	TokenNameStringLiteral	Ⓜ
// U+24C2: CIRCLED LATIN CAPITAL LETTER M 	TokenNameCOMMENT_LINE	U+24C2: CIRCLED LATIN CAPITAL LETTER M 
+	TokenNamePLUS	
"Ɱ"	TokenNameStringLiteral	Ɱ
// U+2C6E: LATIN CAPITAL LETTER M WITH HOOK 	TokenNameCOMMENT_LINE	U+2C6E: LATIN CAPITAL LETTER M WITH HOOK 
+	TokenNamePLUS	
"ꟽ"	TokenNameStringLiteral	ꟽ
// U+A7FD: LATIN EPIGRAPHIC LETTER INVERTED M 	TokenNameCOMMENT_LINE	U+A7FD: LATIN EPIGRAPHIC LETTER INVERTED M 
+	TokenNamePLUS	
"ꟿ"	TokenNameStringLiteral	ꟿ
// U+A7FF: LATIN EPIGRAPHIC LETTER ARCHAIC M 	TokenNameCOMMENT_LINE	U+A7FF: LATIN EPIGRAPHIC LETTER ARCHAIC M 
+	TokenNamePLUS	
"Ｍ"	TokenNameStringLiteral	Ｍ
// U+FF2D: FULLWIDTH LATIN CAPITAL LETTER M 	TokenNameCOMMENT_LINE	U+FF2D: FULLWIDTH LATIN CAPITAL LETTER M 
,	TokenNameCOMMA	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ɯ"	TokenNameStringLiteral	ɯ
// U+026F: LATIN SMALL LETTER TURNED M 	TokenNameCOMMENT_LINE	U+026F: LATIN SMALL LETTER TURNED M 
+	TokenNamePLUS	
"ɰ"	TokenNameStringLiteral	ɰ
// U+0270: LATIN SMALL LETTER TURNED M WITH LONG LEG 	TokenNameCOMMENT_LINE	U+0270: LATIN SMALL LETTER TURNED M WITH LONG LEG 
+	TokenNamePLUS	
"ɱ"	TokenNameStringLiteral	ɱ
// U+0271: LATIN SMALL LETTER M WITH HOOK 	TokenNameCOMMENT_LINE	U+0271: LATIN SMALL LETTER M WITH HOOK 
+	TokenNamePLUS	
"ᵯ"	TokenNameStringLiteral	ᵯ
// U+1D6F: LATIN SMALL LETTER M WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D6F: LATIN SMALL LETTER M WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ᶆ"	TokenNameStringLiteral	ᶆ
// U+1D86: LATIN SMALL LETTER M WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D86: LATIN SMALL LETTER M WITH PALATAL HOOK 
+	TokenNamePLUS	
"ḿ"	TokenNameStringLiteral	ḿ
// U+1E3F: LATIN SMALL LETTER M WITH ACUTE 	TokenNameCOMMENT_LINE	U+1E3F: LATIN SMALL LETTER M WITH ACUTE 
+	TokenNamePLUS	
"ṁ"	TokenNameStringLiteral	ṁ
// U+1E41: LATIN SMALL LETTER M WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E41: LATIN SMALL LETTER M WITH DOT ABOVE 
+	TokenNamePLUS	
"ṃ"	TokenNameStringLiteral	ṃ
// U+1E43: LATIN SMALL LETTER M WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E43: LATIN SMALL LETTER M WITH DOT BELOW 
+	TokenNamePLUS	
"ⓜ"	TokenNameStringLiteral	ⓜ
// U+24DC: CIRCLED LATIN SMALL LETTER M 	TokenNameCOMMENT_LINE	U+24DC: CIRCLED LATIN SMALL LETTER M 
+	TokenNamePLUS	
"ｍ"	TokenNameStringLiteral	ｍ
// U+FF4D: FULLWIDTH LATIN SMALL LETTER M 	TokenNameCOMMENT_LINE	U+FF4D: FULLWIDTH LATIN SMALL LETTER M 
,	TokenNameCOMMA	
"m"	TokenNameStringLiteral	m
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒨"	TokenNameStringLiteral	⒨
// U+24A8: PARENTHESIZED LATIN SMALL LETTER M 	TokenNameCOMMENT_LINE	U+24A8: PARENTHESIZED LATIN SMALL LETTER M 
,	TokenNameCOMMA	
"(m)"	TokenNameStringLiteral	(m)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ñ"	TokenNameStringLiteral	Ñ
// U+00D1: LATIN CAPITAL LETTER N WITH TILDE 	TokenNameCOMMENT_LINE	U+00D1: LATIN CAPITAL LETTER N WITH TILDE 
+	TokenNamePLUS	
"Ń"	TokenNameStringLiteral	Ń
// U+0143: LATIN CAPITAL LETTER N WITH ACUTE 	TokenNameCOMMENT_LINE	U+0143: LATIN CAPITAL LETTER N WITH ACUTE 
+	TokenNamePLUS	
"Ņ"	TokenNameStringLiteral	Ņ
// U+0145: LATIN CAPITAL LETTER N WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0145: LATIN CAPITAL LETTER N WITH CEDILLA 
+	TokenNamePLUS	
"Ň"	TokenNameStringLiteral	Ň
// U+0147: LATIN CAPITAL LETTER N WITH CARON 	TokenNameCOMMENT_LINE	U+0147: LATIN CAPITAL LETTER N WITH CARON 
+	TokenNamePLUS	
"Ŋ"	TokenNameStringLiteral	Ŋ
// U+014A: LATIN CAPITAL LETTER ENG 	TokenNameCOMMENT_LINE	U+014A: LATIN CAPITAL LETTER ENG 
+	TokenNamePLUS	
"Ɲ"	TokenNameStringLiteral	Ɲ
// U+019D: LATIN CAPITAL LETTER N WITH LEFT HOOK 	TokenNameCOMMENT_LINE	U+019D: LATIN CAPITAL LETTER N WITH LEFT HOOK 
+	TokenNamePLUS	
"Ǹ"	TokenNameStringLiteral	Ǹ
// U+01F8: LATIN CAPITAL LETTER N WITH GRAVE 	TokenNameCOMMENT_LINE	U+01F8: LATIN CAPITAL LETTER N WITH GRAVE 
+	TokenNamePLUS	
"Ƞ"	TokenNameStringLiteral	Ƞ
// U+0220: LATIN CAPITAL LETTER N WITH LONG RIGHT LEG 	TokenNameCOMMENT_LINE	U+0220: LATIN CAPITAL LETTER N WITH LONG RIGHT LEG 
+	TokenNamePLUS	
"ɴ"	TokenNameStringLiteral	ɴ
// U+0274: LATIN LETTER SMALL CAPITAL N 	TokenNameCOMMENT_LINE	U+0274: LATIN LETTER SMALL CAPITAL N 
+	TokenNamePLUS	
"ᴎ"	TokenNameStringLiteral	ᴎ
// U+1D0E: LATIN LETTER SMALL CAPITAL REVERSED N 	TokenNameCOMMENT_LINE	U+1D0E: LATIN LETTER SMALL CAPITAL REVERSED N 
+	TokenNamePLUS	
"Ṅ"	TokenNameStringLiteral	Ṅ
// U+1E44: LATIN CAPITAL LETTER N WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E44: LATIN CAPITAL LETTER N WITH DOT ABOVE 
+	TokenNamePLUS	
"Ṇ"	TokenNameStringLiteral	Ṇ
// U+1E46: LATIN CAPITAL LETTER N WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E46: LATIN CAPITAL LETTER N WITH DOT BELOW 
+	TokenNamePLUS	
"Ṉ"	TokenNameStringLiteral	Ṉ
// U+1E48: LATIN CAPITAL LETTER N WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E48: LATIN CAPITAL LETTER N WITH LINE BELOW 
+	TokenNamePLUS	
"Ṋ"	TokenNameStringLiteral	Ṋ
// U+1E4A: LATIN CAPITAL LETTER N WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E4A: LATIN CAPITAL LETTER N WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"Ⓝ"	TokenNameStringLiteral	Ⓝ
// U+24C3: CIRCLED LATIN CAPITAL LETTER N 	TokenNameCOMMENT_LINE	U+24C3: CIRCLED LATIN CAPITAL LETTER N 
+	TokenNamePLUS	
"Ｎ"	TokenNameStringLiteral	Ｎ
// U+FF2E: FULLWIDTH LATIN CAPITAL LETTER N 	TokenNameCOMMENT_LINE	U+FF2E: FULLWIDTH LATIN CAPITAL LETTER N 
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ñ"	TokenNameStringLiteral	ñ
// U+00F1: LATIN SMALL LETTER N WITH TILDE 	TokenNameCOMMENT_LINE	U+00F1: LATIN SMALL LETTER N WITH TILDE 
+	TokenNamePLUS	
"ń"	TokenNameStringLiteral	ń
// U+0144: LATIN SMALL LETTER N WITH ACUTE 	TokenNameCOMMENT_LINE	U+0144: LATIN SMALL LETTER N WITH ACUTE 
+	TokenNamePLUS	
"ņ"	TokenNameStringLiteral	ņ
// U+0146: LATIN SMALL LETTER N WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0146: LATIN SMALL LETTER N WITH CEDILLA 
+	TokenNamePLUS	
"ň"	TokenNameStringLiteral	ň
// U+0148: LATIN SMALL LETTER N WITH CARON 	TokenNameCOMMENT_LINE	U+0148: LATIN SMALL LETTER N WITH CARON 
+	TokenNamePLUS	
"ŉ"	TokenNameStringLiteral	ŉ
// U+0149: LATIN SMALL LETTER N PRECEDED BY APOSTROPHE 	TokenNameCOMMENT_LINE	U+0149: LATIN SMALL LETTER N PRECEDED BY APOSTROPHE 
+	TokenNamePLUS	
"ŋ"	TokenNameStringLiteral	ŋ
// U+014B: LATIN SMALL LETTER ENG 	TokenNameCOMMENT_LINE	U+014B: LATIN SMALL LETTER ENG 
+	TokenNamePLUS	
"ƞ"	TokenNameStringLiteral	ƞ
// U+019E: LATIN SMALL LETTER N WITH LONG RIGHT LEG 	TokenNameCOMMENT_LINE	U+019E: LATIN SMALL LETTER N WITH LONG RIGHT LEG 
+	TokenNamePLUS	
"ǹ"	TokenNameStringLiteral	ǹ
// U+01F9: LATIN SMALL LETTER N WITH GRAVE 	TokenNameCOMMENT_LINE	U+01F9: LATIN SMALL LETTER N WITH GRAVE 
+	TokenNamePLUS	
"ȵ"	TokenNameStringLiteral	ȵ
// U+0235: LATIN SMALL LETTER N WITH CURL 	TokenNameCOMMENT_LINE	U+0235: LATIN SMALL LETTER N WITH CURL 
+	TokenNamePLUS	
"ɲ"	TokenNameStringLiteral	ɲ
// U+0272: LATIN SMALL LETTER N WITH LEFT HOOK 	TokenNameCOMMENT_LINE	U+0272: LATIN SMALL LETTER N WITH LEFT HOOK 
+	TokenNamePLUS	
"ɳ"	TokenNameStringLiteral	ɳ
// U+0273: LATIN SMALL LETTER N WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+0273: LATIN SMALL LETTER N WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ᵰ"	TokenNameStringLiteral	ᵰ
// U+1D70: LATIN SMALL LETTER N WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D70: LATIN SMALL LETTER N WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ᶇ"	TokenNameStringLiteral	ᶇ
// U+1D87: LATIN SMALL LETTER N WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D87: LATIN SMALL LETTER N WITH PALATAL HOOK 
+	TokenNamePLUS	
"ṅ"	TokenNameStringLiteral	ṅ
// U+1E45: LATIN SMALL LETTER N WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E45: LATIN SMALL LETTER N WITH DOT ABOVE 
+	TokenNamePLUS	
"ṇ"	TokenNameStringLiteral	ṇ
// U+1E47: LATIN SMALL LETTER N WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E47: LATIN SMALL LETTER N WITH DOT BELOW 
+	TokenNamePLUS	
"ṉ"	TokenNameStringLiteral	ṉ
// U+1E49: LATIN SMALL LETTER N WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E49: LATIN SMALL LETTER N WITH LINE BELOW 
+	TokenNamePLUS	
"ṋ"	TokenNameStringLiteral	ṋ
// U+1E4B: LATIN SMALL LETTER N WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E4B: LATIN SMALL LETTER N WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"ⁿ"	TokenNameStringLiteral	ⁿ
// U+207F: SUPERSCRIPT LATIN SMALL LETTER N 	TokenNameCOMMENT_LINE	U+207F: SUPERSCRIPT LATIN SMALL LETTER N 
+	TokenNamePLUS	
"ⓝ"	TokenNameStringLiteral	ⓝ
// U+24DD: CIRCLED LATIN SMALL LETTER N 	TokenNameCOMMENT_LINE	U+24DD: CIRCLED LATIN SMALL LETTER N 
+	TokenNamePLUS	
"ｎ"	TokenNameStringLiteral	ｎ
// U+FF4E: FULLWIDTH LATIN SMALL LETTER N 	TokenNameCOMMENT_LINE	U+FF4E: FULLWIDTH LATIN SMALL LETTER N 
,	TokenNameCOMMA	
"n"	TokenNameStringLiteral	n
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ǌ"	TokenNameStringLiteral	Ǌ
// U+01CA: LATIN CAPITAL LETTER NJ 	TokenNameCOMMENT_LINE	U+01CA: LATIN CAPITAL LETTER NJ 
,	TokenNameCOMMA	
"NJ"	TokenNameStringLiteral	NJ
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ǋ"	TokenNameStringLiteral	ǋ
// U+01CB: LATIN CAPITAL LETTER N WITH SMALL LETTER J 	TokenNameCOMMENT_LINE	U+01CB: LATIN CAPITAL LETTER N WITH SMALL LETTER J 
,	TokenNameCOMMA	
"Nj"	TokenNameStringLiteral	Nj
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒩"	TokenNameStringLiteral	⒩
// U+24A9: PARENTHESIZED LATIN SMALL LETTER N 	TokenNameCOMMENT_LINE	U+24A9: PARENTHESIZED LATIN SMALL LETTER N 
,	TokenNameCOMMA	
"(n)"	TokenNameStringLiteral	(n)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ǌ"	TokenNameStringLiteral	ǌ
// U+01CC: LATIN SMALL LETTER NJ 	TokenNameCOMMENT_LINE	U+01CC: LATIN SMALL LETTER NJ 
,	TokenNameCOMMA	
"nj"	TokenNameStringLiteral	nj
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ò"	TokenNameStringLiteral	Ò
// U+00D2: LATIN CAPITAL LETTER O WITH GRAVE 	TokenNameCOMMENT_LINE	U+00D2: LATIN CAPITAL LETTER O WITH GRAVE 
+	TokenNamePLUS	
"Ó"	TokenNameStringLiteral	Ó
// U+00D3: LATIN CAPITAL LETTER O WITH ACUTE 	TokenNameCOMMENT_LINE	U+00D3: LATIN CAPITAL LETTER O WITH ACUTE 
+	TokenNamePLUS	
"Ô"	TokenNameStringLiteral	Ô
// U+00D4: LATIN CAPITAL LETTER O WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00D4: LATIN CAPITAL LETTER O WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Õ"	TokenNameStringLiteral	Õ
// U+00D5: LATIN CAPITAL LETTER O WITH TILDE 	TokenNameCOMMENT_LINE	U+00D5: LATIN CAPITAL LETTER O WITH TILDE 
+	TokenNamePLUS	
"Ö"	TokenNameStringLiteral	Ö
// U+00D6: LATIN CAPITAL LETTER O WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00D6: LATIN CAPITAL LETTER O WITH DIAERESIS 
+	TokenNamePLUS	
"Ø"	TokenNameStringLiteral	Ø
// U+00D8: LATIN CAPITAL LETTER O WITH STROKE 	TokenNameCOMMENT_LINE	U+00D8: LATIN CAPITAL LETTER O WITH STROKE 
+	TokenNamePLUS	
"Ō"	TokenNameStringLiteral	Ō
// U+014C: LATIN CAPITAL LETTER O WITH MACRON 	TokenNameCOMMENT_LINE	U+014C: LATIN CAPITAL LETTER O WITH MACRON 
+	TokenNamePLUS	
"Ŏ"	TokenNameStringLiteral	Ŏ
// U+014E: LATIN CAPITAL LETTER O WITH BREVE 	TokenNameCOMMENT_LINE	U+014E: LATIN CAPITAL LETTER O WITH BREVE 
+	TokenNamePLUS	
"Ő"	TokenNameStringLiteral	Ő
// U+0150: LATIN CAPITAL LETTER O WITH DOUBLE ACUTE 	TokenNameCOMMENT_LINE	U+0150: LATIN CAPITAL LETTER O WITH DOUBLE ACUTE 
+	TokenNamePLUS	
"Ɔ"	TokenNameStringLiteral	Ɔ
// U+0186: LATIN CAPITAL LETTER OPEN O 	TokenNameCOMMENT_LINE	U+0186: LATIN CAPITAL LETTER OPEN O 
+	TokenNamePLUS	
"Ɵ"	TokenNameStringLiteral	Ɵ
// U+019F: LATIN CAPITAL LETTER O WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+019F: LATIN CAPITAL LETTER O WITH MIDDLE TILDE 
+	TokenNamePLUS	
"Ơ"	TokenNameStringLiteral	Ơ
// U+01A0: LATIN CAPITAL LETTER O WITH HORN 	TokenNameCOMMENT_LINE	U+01A0: LATIN CAPITAL LETTER O WITH HORN 
+	TokenNamePLUS	
"Ǒ"	TokenNameStringLiteral	Ǒ
// U+01D1: LATIN CAPITAL LETTER O WITH CARON 	TokenNameCOMMENT_LINE	U+01D1: LATIN CAPITAL LETTER O WITH CARON 
+	TokenNamePLUS	
"Ǫ"	TokenNameStringLiteral	Ǫ
// U+01EA: LATIN CAPITAL LETTER O WITH OGONEK 	TokenNameCOMMENT_LINE	U+01EA: LATIN CAPITAL LETTER O WITH OGONEK 
+	TokenNamePLUS	
"Ǭ"	TokenNameStringLiteral	Ǭ
// U+01EC: LATIN CAPITAL LETTER O WITH OGONEK AND MACRON 	TokenNameCOMMENT_LINE	U+01EC: LATIN CAPITAL LETTER O WITH OGONEK AND MACRON 
+	TokenNamePLUS	
"Ǿ"	TokenNameStringLiteral	Ǿ
// U+01FE: LATIN CAPITAL LETTER O WITH STROKE AND ACUTE 	TokenNameCOMMENT_LINE	U+01FE: LATIN CAPITAL LETTER O WITH STROKE AND ACUTE 
+	TokenNamePLUS	
"Ȍ"	TokenNameStringLiteral	Ȍ
// U+020C: LATIN CAPITAL LETTER O WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+020C: LATIN CAPITAL LETTER O WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"Ȏ"	TokenNameStringLiteral	Ȏ
// U+020E: LATIN CAPITAL LETTER O WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+020E: LATIN CAPITAL LETTER O WITH INVERTED BREVE 
+	TokenNamePLUS	
"Ȫ"	TokenNameStringLiteral	Ȫ
// U+022A: LATIN CAPITAL LETTER O WITH DIAERESIS AND MACRON 	TokenNameCOMMENT_LINE	U+022A: LATIN CAPITAL LETTER O WITH DIAERESIS AND MACRON 
+	TokenNamePLUS	
"Ȭ"	TokenNameStringLiteral	Ȭ
// U+022C: LATIN CAPITAL LETTER O WITH TILDE AND MACRON 	TokenNameCOMMENT_LINE	U+022C: LATIN CAPITAL LETTER O WITH TILDE AND MACRON 
+	TokenNamePLUS	
"Ȯ"	TokenNameStringLiteral	Ȯ
// U+022E: LATIN CAPITAL LETTER O WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+022E: LATIN CAPITAL LETTER O WITH DOT ABOVE 
+	TokenNamePLUS	
"Ȱ"	TokenNameStringLiteral	Ȱ
// U+0230: LATIN CAPITAL LETTER O WITH DOT ABOVE AND MACRON 	TokenNameCOMMENT_LINE	U+0230: LATIN CAPITAL LETTER O WITH DOT ABOVE AND MACRON 
+	TokenNamePLUS	
"ᴏ"	TokenNameStringLiteral	ᴏ
// U+1D0F: LATIN LETTER SMALL CAPITAL O 	TokenNameCOMMENT_LINE	U+1D0F: LATIN LETTER SMALL CAPITAL O 
+	TokenNamePLUS	
"ᴐ"	TokenNameStringLiteral	ᴐ
// U+1D10: LATIN LETTER SMALL CAPITAL OPEN O 	TokenNameCOMMENT_LINE	U+1D10: LATIN LETTER SMALL CAPITAL OPEN O 
+	TokenNamePLUS	
"Ṍ"	TokenNameStringLiteral	Ṍ
// U+1E4C: LATIN CAPITAL LETTER O WITH TILDE AND ACUTE 	TokenNameCOMMENT_LINE	U+1E4C: LATIN CAPITAL LETTER O WITH TILDE AND ACUTE 
+	TokenNamePLUS	
"Ṏ"	TokenNameStringLiteral	Ṏ
// U+1E4E: LATIN CAPITAL LETTER O WITH TILDE AND DIAERESIS 	TokenNameCOMMENT_LINE	U+1E4E: LATIN CAPITAL LETTER O WITH TILDE AND DIAERESIS 
+	TokenNamePLUS	
"Ṑ"	TokenNameStringLiteral	Ṑ
// U+1E50: LATIN CAPITAL LETTER O WITH MACRON AND GRAVE 	TokenNameCOMMENT_LINE	U+1E50: LATIN CAPITAL LETTER O WITH MACRON AND GRAVE 
+	TokenNamePLUS	
"Ṓ"	TokenNameStringLiteral	Ṓ
// U+1E52: LATIN CAPITAL LETTER O WITH MACRON AND ACUTE 	TokenNameCOMMENT_LINE	U+1E52: LATIN CAPITAL LETTER O WITH MACRON AND ACUTE 
+	TokenNamePLUS	
"Ọ"	TokenNameStringLiteral	Ọ
// U+1ECC: LATIN CAPITAL LETTER O WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1ECC: LATIN CAPITAL LETTER O WITH DOT BELOW 
+	TokenNamePLUS	
"Ỏ"	TokenNameStringLiteral	Ỏ
// U+1ECE: LATIN CAPITAL LETTER O WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1ECE: LATIN CAPITAL LETTER O WITH HOOK ABOVE 
+	TokenNamePLUS	
"Ố"	TokenNameStringLiteral	Ố
// U+1ED0: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND ACUTE 	TokenNameCOMMENT_LINE	U+1ED0: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND ACUTE 
+	TokenNamePLUS	
"Ồ"	TokenNameStringLiteral	Ồ
// U+1ED2: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND GRAVE 	TokenNameCOMMENT_LINE	U+1ED2: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND GRAVE 
+	TokenNamePLUS	
"Ổ"	TokenNameStringLiteral	Ổ
// U+1ED4: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1ED4: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND HOOK ABOVE 
+	TokenNamePLUS	
"Ỗ"	TokenNameStringLiteral	Ỗ
// U+1ED6: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND TILDE 	TokenNameCOMMENT_LINE	U+1ED6: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND TILDE 
+	TokenNamePLUS	
"Ộ"	TokenNameStringLiteral	Ộ
// U+1ED8: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1ED8: LATIN CAPITAL LETTER O WITH CIRCUMFLEX AND DOT BELOW 
+	TokenNamePLUS	
"Ớ"	TokenNameStringLiteral	Ớ
// U+1EDA: LATIN CAPITAL LETTER O WITH HORN AND ACUTE 	TokenNameCOMMENT_LINE	U+1EDA: LATIN CAPITAL LETTER O WITH HORN AND ACUTE 
+	TokenNamePLUS	
"Ờ"	TokenNameStringLiteral	Ờ
// U+1EDC: LATIN CAPITAL LETTER O WITH HORN AND GRAVE 	TokenNameCOMMENT_LINE	U+1EDC: LATIN CAPITAL LETTER O WITH HORN AND GRAVE 
+	TokenNamePLUS	
"Ở"	TokenNameStringLiteral	Ở
// U+1EDE: LATIN CAPITAL LETTER O WITH HORN AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EDE: LATIN CAPITAL LETTER O WITH HORN AND HOOK ABOVE 
+	TokenNamePLUS	
"Ỡ"	TokenNameStringLiteral	Ỡ
// U+1EE0: LATIN CAPITAL LETTER O WITH HORN AND TILDE 	TokenNameCOMMENT_LINE	U+1EE0: LATIN CAPITAL LETTER O WITH HORN AND TILDE 
+	TokenNamePLUS	
"Ợ"	TokenNameStringLiteral	Ợ
// U+1EE2: LATIN CAPITAL LETTER O WITH HORN AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EE2: LATIN CAPITAL LETTER O WITH HORN AND DOT BELOW 
+	TokenNamePLUS	
"Ⓞ"	TokenNameStringLiteral	Ⓞ
// U+24C4: CIRCLED LATIN CAPITAL LETTER O 	TokenNameCOMMENT_LINE	U+24C4: CIRCLED LATIN CAPITAL LETTER O 
+	TokenNamePLUS	
"Ꝋ"	TokenNameStringLiteral	Ꝋ
// U+A74A: LATIN CAPITAL LETTER O WITH LONG STROKE OVERLAY 	TokenNameCOMMENT_LINE	U+A74A: LATIN CAPITAL LETTER O WITH LONG STROKE OVERLAY 
+	TokenNamePLUS	
"Ꝍ"	TokenNameStringLiteral	Ꝍ
// U+A74C: LATIN CAPITAL LETTER O WITH LOOP 	TokenNameCOMMENT_LINE	U+A74C: LATIN CAPITAL LETTER O WITH LOOP 
+	TokenNamePLUS	
"Ｏ"	TokenNameStringLiteral	Ｏ
// U+FF2F: FULLWIDTH LATIN CAPITAL LETTER O 	TokenNameCOMMENT_LINE	U+FF2F: FULLWIDTH LATIN CAPITAL LETTER O 
,	TokenNameCOMMA	
"O"	TokenNameStringLiteral	O
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ò"	TokenNameStringLiteral	ò
// U+00F2: LATIN SMALL LETTER O WITH GRAVE 	TokenNameCOMMENT_LINE	U+00F2: LATIN SMALL LETTER O WITH GRAVE 
+	TokenNamePLUS	
"ó"	TokenNameStringLiteral	ó
// U+00F3: LATIN SMALL LETTER O WITH ACUTE 	TokenNameCOMMENT_LINE	U+00F3: LATIN SMALL LETTER O WITH ACUTE 
+	TokenNamePLUS	
"ô"	TokenNameStringLiteral	ô
// U+00F4: LATIN SMALL LETTER O WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00F4: LATIN SMALL LETTER O WITH CIRCUMFLEX 
+	TokenNamePLUS	
"õ"	TokenNameStringLiteral	õ
// U+00F5: LATIN SMALL LETTER O WITH TILDE 	TokenNameCOMMENT_LINE	U+00F5: LATIN SMALL LETTER O WITH TILDE 
+	TokenNamePLUS	
"ö"	TokenNameStringLiteral	ö
// U+00F6: LATIN SMALL LETTER O WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00F6: LATIN SMALL LETTER O WITH DIAERESIS 
+	TokenNamePLUS	
"ø"	TokenNameStringLiteral	ø
// U+00F8: LATIN SMALL LETTER O WITH STROKE 	TokenNameCOMMENT_LINE	U+00F8: LATIN SMALL LETTER O WITH STROKE 
+	TokenNamePLUS	
"ō"	TokenNameStringLiteral	ō
// U+014D: LATIN SMALL LETTER O WITH MACRON 	TokenNameCOMMENT_LINE	U+014D: LATIN SMALL LETTER O WITH MACRON 
+	TokenNamePLUS	
"ŏ"	TokenNameStringLiteral	ŏ
// U+014F: LATIN SMALL LETTER O WITH BREVE 	TokenNameCOMMENT_LINE	U+014F: LATIN SMALL LETTER O WITH BREVE 
+	TokenNamePLUS	
"ő"	TokenNameStringLiteral	ő
// U+0151: LATIN SMALL LETTER O WITH DOUBLE ACUTE 	TokenNameCOMMENT_LINE	U+0151: LATIN SMALL LETTER O WITH DOUBLE ACUTE 
+	TokenNamePLUS	
"ơ"	TokenNameStringLiteral	ơ
// U+01A1: LATIN SMALL LETTER O WITH HORN 	TokenNameCOMMENT_LINE	U+01A1: LATIN SMALL LETTER O WITH HORN 
+	TokenNamePLUS	
"ǒ"	TokenNameStringLiteral	ǒ
// U+01D2: LATIN SMALL LETTER O WITH CARON 	TokenNameCOMMENT_LINE	U+01D2: LATIN SMALL LETTER O WITH CARON 
+	TokenNamePLUS	
"ǫ"	TokenNameStringLiteral	ǫ
// U+01EB: LATIN SMALL LETTER O WITH OGONEK 	TokenNameCOMMENT_LINE	U+01EB: LATIN SMALL LETTER O WITH OGONEK 
+	TokenNamePLUS	
"ǭ"	TokenNameStringLiteral	ǭ
// U+01ED: LATIN SMALL LETTER O WITH OGONEK AND MACRON 	TokenNameCOMMENT_LINE	U+01ED: LATIN SMALL LETTER O WITH OGONEK AND MACRON 
+	TokenNamePLUS	
"ǿ"	TokenNameStringLiteral	ǿ
// U+01FF: LATIN SMALL LETTER O WITH STROKE AND ACUTE 	TokenNameCOMMENT_LINE	U+01FF: LATIN SMALL LETTER O WITH STROKE AND ACUTE 
+	TokenNamePLUS	
"ȍ"	TokenNameStringLiteral	ȍ
// U+020D: LATIN SMALL LETTER O WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+020D: LATIN SMALL LETTER O WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"ȏ"	TokenNameStringLiteral	ȏ
// U+020F: LATIN SMALL LETTER O WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+020F: LATIN SMALL LETTER O WITH INVERTED BREVE 
+	TokenNamePLUS	
"ȫ"	TokenNameStringLiteral	ȫ
// U+022B: LATIN SMALL LETTER O WITH DIAERESIS AND MACRON 	TokenNameCOMMENT_LINE	U+022B: LATIN SMALL LETTER O WITH DIAERESIS AND MACRON 
+	TokenNamePLUS	
"ȭ"	TokenNameStringLiteral	ȭ
// U+022D: LATIN SMALL LETTER O WITH TILDE AND MACRON 	TokenNameCOMMENT_LINE	U+022D: LATIN SMALL LETTER O WITH TILDE AND MACRON 
+	TokenNamePLUS	
"ȯ"	TokenNameStringLiteral	ȯ
// U+022F: LATIN SMALL LETTER O WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+022F: LATIN SMALL LETTER O WITH DOT ABOVE 
+	TokenNamePLUS	
"ȱ"	TokenNameStringLiteral	ȱ
// U+0231: LATIN SMALL LETTER O WITH DOT ABOVE AND MACRON 	TokenNameCOMMENT_LINE	U+0231: LATIN SMALL LETTER O WITH DOT ABOVE AND MACRON 
+	TokenNamePLUS	
"ɔ"	TokenNameStringLiteral	ɔ
// U+0254: LATIN SMALL LETTER OPEN O 	TokenNameCOMMENT_LINE	U+0254: LATIN SMALL LETTER OPEN O 
+	TokenNamePLUS	
"ɵ"	TokenNameStringLiteral	ɵ
// U+0275: LATIN SMALL LETTER BARRED O 	TokenNameCOMMENT_LINE	U+0275: LATIN SMALL LETTER BARRED O 
+	TokenNamePLUS	
"ᴖ"	TokenNameStringLiteral	ᴖ
// U+1D16: LATIN SMALL LETTER TOP HALF O 	TokenNameCOMMENT_LINE	U+1D16: LATIN SMALL LETTER TOP HALF O 
+	TokenNamePLUS	
"ᴗ"	TokenNameStringLiteral	ᴗ
// U+1D17: LATIN SMALL LETTER BOTTOM HALF O 	TokenNameCOMMENT_LINE	U+1D17: LATIN SMALL LETTER BOTTOM HALF O 
+	TokenNamePLUS	
"ᶗ"	TokenNameStringLiteral	ᶗ
// U+1D97: LATIN SMALL LETTER OPEN O WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+1D97: LATIN SMALL LETTER OPEN O WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ṍ"	TokenNameStringLiteral	ṍ
// U+1E4D: LATIN SMALL LETTER O WITH TILDE AND ACUTE 	TokenNameCOMMENT_LINE	U+1E4D: LATIN SMALL LETTER O WITH TILDE AND ACUTE 
+	TokenNamePLUS	
"ṏ"	TokenNameStringLiteral	ṏ
// U+1E4F: LATIN SMALL LETTER O WITH TILDE AND DIAERESIS 	TokenNameCOMMENT_LINE	U+1E4F: LATIN SMALL LETTER O WITH TILDE AND DIAERESIS 
+	TokenNamePLUS	
"ṑ"	TokenNameStringLiteral	ṑ
// U+1E51: LATIN SMALL LETTER O WITH MACRON AND GRAVE 	TokenNameCOMMENT_LINE	U+1E51: LATIN SMALL LETTER O WITH MACRON AND GRAVE 
+	TokenNamePLUS	
"ṓ"	TokenNameStringLiteral	ṓ
// U+1E53: LATIN SMALL LETTER O WITH MACRON AND ACUTE 	TokenNameCOMMENT_LINE	U+1E53: LATIN SMALL LETTER O WITH MACRON AND ACUTE 
+	TokenNamePLUS	
"ọ"	TokenNameStringLiteral	ọ
// U+1ECD: LATIN SMALL LETTER O WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1ECD: LATIN SMALL LETTER O WITH DOT BELOW 
+	TokenNamePLUS	
"ỏ"	TokenNameStringLiteral	ỏ
// U+1ECF: LATIN SMALL LETTER O WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1ECF: LATIN SMALL LETTER O WITH HOOK ABOVE 
+	TokenNamePLUS	
"ố"	TokenNameStringLiteral	ố
// U+1ED1: LATIN SMALL LETTER O WITH CIRCUMFLEX AND ACUTE 	TokenNameCOMMENT_LINE	U+1ED1: LATIN SMALL LETTER O WITH CIRCUMFLEX AND ACUTE 
+	TokenNamePLUS	
"ồ"	TokenNameStringLiteral	ồ
// U+1ED3: LATIN SMALL LETTER O WITH CIRCUMFLEX AND GRAVE 	TokenNameCOMMENT_LINE	U+1ED3: LATIN SMALL LETTER O WITH CIRCUMFLEX AND GRAVE 
+	TokenNamePLUS	
"ổ"	TokenNameStringLiteral	ổ
// U+1ED5: LATIN SMALL LETTER O WITH CIRCUMFLEX AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1ED5: LATIN SMALL LETTER O WITH CIRCUMFLEX AND HOOK ABOVE 
+	TokenNamePLUS	
"ỗ"	TokenNameStringLiteral	ỗ
// U+1ED7: LATIN SMALL LETTER O WITH CIRCUMFLEX AND TILDE 	TokenNameCOMMENT_LINE	U+1ED7: LATIN SMALL LETTER O WITH CIRCUMFLEX AND TILDE 
+	TokenNamePLUS	
"ộ"	TokenNameStringLiteral	ộ
// U+1ED9: LATIN SMALL LETTER O WITH CIRCUMFLEX AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1ED9: LATIN SMALL LETTER O WITH CIRCUMFLEX AND DOT BELOW 
+	TokenNamePLUS	
"ớ"	TokenNameStringLiteral	ớ
// U+1EDB: LATIN SMALL LETTER O WITH HORN AND ACUTE 	TokenNameCOMMENT_LINE	U+1EDB: LATIN SMALL LETTER O WITH HORN AND ACUTE 
+	TokenNamePLUS	
"ờ"	TokenNameStringLiteral	ờ
// U+1EDD: LATIN SMALL LETTER O WITH HORN AND GRAVE 	TokenNameCOMMENT_LINE	U+1EDD: LATIN SMALL LETTER O WITH HORN AND GRAVE 
+	TokenNamePLUS	
"ở"	TokenNameStringLiteral	ở
// U+1EDF: LATIN SMALL LETTER O WITH HORN AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EDF: LATIN SMALL LETTER O WITH HORN AND HOOK ABOVE 
+	TokenNamePLUS	
"ỡ"	TokenNameStringLiteral	ỡ
// U+1EE1: LATIN SMALL LETTER O WITH HORN AND TILDE 	TokenNameCOMMENT_LINE	U+1EE1: LATIN SMALL LETTER O WITH HORN AND TILDE 
+	TokenNamePLUS	
"ợ"	TokenNameStringLiteral	ợ
// U+1EE3: LATIN SMALL LETTER O WITH HORN AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EE3: LATIN SMALL LETTER O WITH HORN AND DOT BELOW 
+	TokenNamePLUS	
"ₒ"	TokenNameStringLiteral	ₒ
// U+2092: LATIN SUBSCRIPT SMALL LETTER O 	TokenNameCOMMENT_LINE	U+2092: LATIN SUBSCRIPT SMALL LETTER O 
+	TokenNamePLUS	
"ⓞ"	TokenNameStringLiteral	ⓞ
// U+24DE: CIRCLED LATIN SMALL LETTER O 	TokenNameCOMMENT_LINE	U+24DE: CIRCLED LATIN SMALL LETTER O 
+	TokenNamePLUS	
"ⱺ"	TokenNameStringLiteral	ⱺ
// U+2C7A: LATIN SMALL LETTER O WITH LOW RING INSIDE 	TokenNameCOMMENT_LINE	U+2C7A: LATIN SMALL LETTER O WITH LOW RING INSIDE 
+	TokenNamePLUS	
"ꝋ"	TokenNameStringLiteral	ꝋ
// U+A74B: LATIN SMALL LETTER O WITH LONG STROKE OVERLAY 	TokenNameCOMMENT_LINE	U+A74B: LATIN SMALL LETTER O WITH LONG STROKE OVERLAY 
+	TokenNamePLUS	
"ꝍ"	TokenNameStringLiteral	ꝍ
// U+A74D: LATIN SMALL LETTER O WITH LOOP 	TokenNameCOMMENT_LINE	U+A74D: LATIN SMALL LETTER O WITH LOOP 
+	TokenNamePLUS	
"ｏ"	TokenNameStringLiteral	ｏ
// U+FF4F: FULLWIDTH LATIN SMALL LETTER O 	TokenNameCOMMENT_LINE	U+FF4F: FULLWIDTH LATIN SMALL LETTER O 
,	TokenNameCOMMA	
"o"	TokenNameStringLiteral	o
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Œ"	TokenNameStringLiteral	Œ
// U+0152: LATIN CAPITAL LIGATURE OE 	TokenNameCOMMENT_LINE	U+0152: LATIN CAPITAL LIGATURE OE 
+	TokenNamePLUS	
"ɶ"	TokenNameStringLiteral	ɶ
// U+0276: LATIN LETTER SMALL CAPITAL OE 	TokenNameCOMMENT_LINE	U+0276: LATIN LETTER SMALL CAPITAL OE 
,	TokenNameCOMMA	
"OE"	TokenNameStringLiteral	OE
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ꝏ"	TokenNameStringLiteral	Ꝏ
// U+A74E: LATIN CAPITAL LETTER OO 	TokenNameCOMMENT_LINE	U+A74E: LATIN CAPITAL LETTER OO 
,	TokenNameCOMMA	
"OO"	TokenNameStringLiteral	OO
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ȣ"	TokenNameStringLiteral	Ȣ
// U+0222: LATIN CAPITAL LETTER OU 	TokenNameCOMMENT_LINE	U+0222: LATIN CAPITAL LETTER OU 
+	TokenNamePLUS	
"ᴕ"	TokenNameStringLiteral	ᴕ
// U+1D15: LATIN LETTER SMALL CAPITAL OU 	TokenNameCOMMENT_LINE	U+1D15: LATIN LETTER SMALL CAPITAL OU 
,	TokenNameCOMMA	
"OU"	TokenNameStringLiteral	OU
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒪"	TokenNameStringLiteral	⒪
// U+24AA: PARENTHESIZED LATIN SMALL LETTER O 	TokenNameCOMMENT_LINE	U+24AA: PARENTHESIZED LATIN SMALL LETTER O 
,	TokenNameCOMMA	
"(o)"	TokenNameStringLiteral	(o)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"œ"	TokenNameStringLiteral	œ
// U+0153: LATIN SMALL LIGATURE OE 	TokenNameCOMMENT_LINE	U+0153: LATIN SMALL LIGATURE OE 
+	TokenNamePLUS	
"ᴔ"	TokenNameStringLiteral	ᴔ
// U+1D14: LATIN SMALL LETTER TURNED OE 	TokenNameCOMMENT_LINE	U+1D14: LATIN SMALL LETTER TURNED OE 
,	TokenNameCOMMA	
"oe"	TokenNameStringLiteral	oe
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ꝏ"	TokenNameStringLiteral	ꝏ
// U+A74F: LATIN SMALL LETTER OO 	TokenNameCOMMENT_LINE	U+A74F: LATIN SMALL LETTER OO 
,	TokenNameCOMMA	
"oo"	TokenNameStringLiteral	oo
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ȣ"	TokenNameStringLiteral	ȣ
// U+0223: LATIN SMALL LETTER OU 	TokenNameCOMMENT_LINE	U+0223: LATIN SMALL LETTER OU 
,	TokenNameCOMMA	
"ou"	TokenNameStringLiteral	ou
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ƥ"	TokenNameStringLiteral	Ƥ
// U+01A4: LATIN CAPITAL LETTER P WITH HOOK 	TokenNameCOMMENT_LINE	U+01A4: LATIN CAPITAL LETTER P WITH HOOK 
+	TokenNamePLUS	
"ᴘ"	TokenNameStringLiteral	ᴘ
// U+1D18: LATIN LETTER SMALL CAPITAL P 	TokenNameCOMMENT_LINE	U+1D18: LATIN LETTER SMALL CAPITAL P 
+	TokenNamePLUS	
"Ṕ"	TokenNameStringLiteral	Ṕ
// U+1E54: LATIN CAPITAL LETTER P WITH ACUTE 	TokenNameCOMMENT_LINE	U+1E54: LATIN CAPITAL LETTER P WITH ACUTE 
+	TokenNamePLUS	
"Ṗ"	TokenNameStringLiteral	Ṗ
// U+1E56: LATIN CAPITAL LETTER P WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E56: LATIN CAPITAL LETTER P WITH DOT ABOVE 
+	TokenNamePLUS	
"Ⓟ"	TokenNameStringLiteral	Ⓟ
// U+24C5: CIRCLED LATIN CAPITAL LETTER P 	TokenNameCOMMENT_LINE	U+24C5: CIRCLED LATIN CAPITAL LETTER P 
+	TokenNamePLUS	
"Ᵽ"	TokenNameStringLiteral	Ᵽ
// U+2C63: LATIN CAPITAL LETTER P WITH STROKE 	TokenNameCOMMENT_LINE	U+2C63: LATIN CAPITAL LETTER P WITH STROKE 
+	TokenNamePLUS	
"Ꝑ"	TokenNameStringLiteral	Ꝑ
// U+A750: LATIN CAPITAL LETTER P WITH STROKE THROUGH DESCENDER 	TokenNameCOMMENT_LINE	U+A750: LATIN CAPITAL LETTER P WITH STROKE THROUGH DESCENDER 
+	TokenNamePLUS	
"Ꝓ"	TokenNameStringLiteral	Ꝓ
// U+A752: LATIN CAPITAL LETTER P WITH FLOURISH 	TokenNameCOMMENT_LINE	U+A752: LATIN CAPITAL LETTER P WITH FLOURISH 
+	TokenNamePLUS	
"Ꝕ"	TokenNameStringLiteral	Ꝕ
// U+A754: LATIN CAPITAL LETTER P WITH SQUIRREL TAIL 	TokenNameCOMMENT_LINE	U+A754: LATIN CAPITAL LETTER P WITH SQUIRREL TAIL 
+	TokenNamePLUS	
"Ｐ"	TokenNameStringLiteral	Ｐ
// U+FF30: FULLWIDTH LATIN CAPITAL LETTER P 	TokenNameCOMMENT_LINE	U+FF30: FULLWIDTH LATIN CAPITAL LETTER P 
,	TokenNameCOMMA	
"P"	TokenNameStringLiteral	P
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ƥ"	TokenNameStringLiteral	ƥ
// U+01A5: LATIN SMALL LETTER P WITH HOOK 	TokenNameCOMMENT_LINE	U+01A5: LATIN SMALL LETTER P WITH HOOK 
+	TokenNamePLUS	
"ᵱ"	TokenNameStringLiteral	ᵱ
// U+1D71: LATIN SMALL LETTER P WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D71: LATIN SMALL LETTER P WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ᵽ"	TokenNameStringLiteral	ᵽ
// U+1D7D: LATIN SMALL LETTER P WITH STROKE 	TokenNameCOMMENT_LINE	U+1D7D: LATIN SMALL LETTER P WITH STROKE 
+	TokenNamePLUS	
"ᶈ"	TokenNameStringLiteral	ᶈ
// U+1D88: LATIN SMALL LETTER P WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D88: LATIN SMALL LETTER P WITH PALATAL HOOK 
+	TokenNamePLUS	
"ṕ"	TokenNameStringLiteral	ṕ
// U+1E55: LATIN SMALL LETTER P WITH ACUTE 	TokenNameCOMMENT_LINE	U+1E55: LATIN SMALL LETTER P WITH ACUTE 
+	TokenNamePLUS	
"ṗ"	TokenNameStringLiteral	ṗ
// U+1E57: LATIN SMALL LETTER P WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E57: LATIN SMALL LETTER P WITH DOT ABOVE 
+	TokenNamePLUS	
"ⓟ"	TokenNameStringLiteral	ⓟ
// U+24DF: CIRCLED LATIN SMALL LETTER P 	TokenNameCOMMENT_LINE	U+24DF: CIRCLED LATIN SMALL LETTER P 
+	TokenNamePLUS	
"ꝑ"	TokenNameStringLiteral	ꝑ
// U+A751: LATIN SMALL LETTER P WITH STROKE THROUGH DESCENDER 	TokenNameCOMMENT_LINE	U+A751: LATIN SMALL LETTER P WITH STROKE THROUGH DESCENDER 
+	TokenNamePLUS	
"ꝓ"	TokenNameStringLiteral	ꝓ
// U+A753: LATIN SMALL LETTER P WITH FLOURISH 	TokenNameCOMMENT_LINE	U+A753: LATIN SMALL LETTER P WITH FLOURISH 
+	TokenNamePLUS	
"ꝕ"	TokenNameStringLiteral	ꝕ
// U+A755: LATIN SMALL LETTER P WITH SQUIRREL TAIL 	TokenNameCOMMENT_LINE	U+A755: LATIN SMALL LETTER P WITH SQUIRREL TAIL 
+	TokenNamePLUS	
"ꟼ"	TokenNameStringLiteral	ꟼ
// U+A7FC: LATIN EPIGRAPHIC LETTER REVERSED P 	TokenNameCOMMENT_LINE	U+A7FC: LATIN EPIGRAPHIC LETTER REVERSED P 
+	TokenNamePLUS	
"ｐ"	TokenNameStringLiteral	ｐ
// U+FF50: FULLWIDTH LATIN SMALL LETTER P 	TokenNameCOMMENT_LINE	U+FF50: FULLWIDTH LATIN SMALL LETTER P 
,	TokenNameCOMMA	
"p"	TokenNameStringLiteral	p
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒫"	TokenNameStringLiteral	⒫
// U+24AB: PARENTHESIZED LATIN SMALL LETTER P 	TokenNameCOMMENT_LINE	U+24AB: PARENTHESIZED LATIN SMALL LETTER P 
,	TokenNameCOMMA	
"(p)"	TokenNameStringLiteral	(p)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ɋ"	TokenNameStringLiteral	Ɋ
// U+024A: LATIN CAPITAL LETTER SMALL Q WITH HOOK TAIL 	TokenNameCOMMENT_LINE	U+024A: LATIN CAPITAL LETTER SMALL Q WITH HOOK TAIL 
+	TokenNamePLUS	
"Ⓠ"	TokenNameStringLiteral	Ⓠ
// U+24C6: CIRCLED LATIN CAPITAL LETTER Q 	TokenNameCOMMENT_LINE	U+24C6: CIRCLED LATIN CAPITAL LETTER Q 
+	TokenNamePLUS	
"Ꝗ"	TokenNameStringLiteral	Ꝗ
// U+A756: LATIN CAPITAL LETTER Q WITH STROKE THROUGH DESCENDER 	TokenNameCOMMENT_LINE	U+A756: LATIN CAPITAL LETTER Q WITH STROKE THROUGH DESCENDER 
+	TokenNamePLUS	
"Ꝙ"	TokenNameStringLiteral	Ꝙ
// U+A758: LATIN CAPITAL LETTER Q WITH DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+A758: LATIN CAPITAL LETTER Q WITH DIAGONAL STROKE 
+	TokenNamePLUS	
"Ｑ"	TokenNameStringLiteral	Ｑ
// U+FF31: FULLWIDTH LATIN CAPITAL LETTER Q 	TokenNameCOMMENT_LINE	U+FF31: FULLWIDTH LATIN CAPITAL LETTER Q 
,	TokenNameCOMMA	
"Q"	TokenNameStringLiteral	Q
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ĸ"	TokenNameStringLiteral	ĸ
// U+0138: LATIN SMALL LETTER KRA 	TokenNameCOMMENT_LINE	U+0138: LATIN SMALL LETTER KRA 
+	TokenNamePLUS	
"ɋ"	TokenNameStringLiteral	ɋ
// U+024B: LATIN SMALL LETTER Q WITH HOOK TAIL 	TokenNameCOMMENT_LINE	U+024B: LATIN SMALL LETTER Q WITH HOOK TAIL 
+	TokenNamePLUS	
"ʠ"	TokenNameStringLiteral	ʠ
// U+02A0: LATIN SMALL LETTER Q WITH HOOK 	TokenNameCOMMENT_LINE	U+02A0: LATIN SMALL LETTER Q WITH HOOK 
+	TokenNamePLUS	
"ⓠ"	TokenNameStringLiteral	ⓠ
// U+24E0: CIRCLED LATIN SMALL LETTER Q 	TokenNameCOMMENT_LINE	U+24E0: CIRCLED LATIN SMALL LETTER Q 
+	TokenNamePLUS	
"ꝗ"	TokenNameStringLiteral	ꝗ
// U+A757: LATIN SMALL LETTER Q WITH STROKE THROUGH DESCENDER 	TokenNameCOMMENT_LINE	U+A757: LATIN SMALL LETTER Q WITH STROKE THROUGH DESCENDER 
+	TokenNamePLUS	
"ꝙ"	TokenNameStringLiteral	ꝙ
// U+A759: LATIN SMALL LETTER Q WITH DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+A759: LATIN SMALL LETTER Q WITH DIAGONAL STROKE 
+	TokenNamePLUS	
"ｑ"	TokenNameStringLiteral	ｑ
// U+FF51: FULLWIDTH LATIN SMALL LETTER Q 	TokenNameCOMMENT_LINE	U+FF51: FULLWIDTH LATIN SMALL LETTER Q 
,	TokenNameCOMMA	
"q"	TokenNameStringLiteral	q
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒬"	TokenNameStringLiteral	⒬
// U+24AC: PARENTHESIZED LATIN SMALL LETTER Q 	TokenNameCOMMENT_LINE	U+24AC: PARENTHESIZED LATIN SMALL LETTER Q 
,	TokenNameCOMMA	
"(q)"	TokenNameStringLiteral	(q)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ȹ"	TokenNameStringLiteral	ȹ
// U+0239: LATIN SMALL LETTER QP DIGRAPH 	TokenNameCOMMENT_LINE	U+0239: LATIN SMALL LETTER QP DIGRAPH 
,	TokenNameCOMMA	
"qp"	TokenNameStringLiteral	qp
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ŕ"	TokenNameStringLiteral	Ŕ
// U+0154: LATIN CAPITAL LETTER R WITH ACUTE 	TokenNameCOMMENT_LINE	U+0154: LATIN CAPITAL LETTER R WITH ACUTE 
+	TokenNamePLUS	
"Ŗ"	TokenNameStringLiteral	Ŗ
// U+0156: LATIN CAPITAL LETTER R WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0156: LATIN CAPITAL LETTER R WITH CEDILLA 
+	TokenNamePLUS	
"Ř"	TokenNameStringLiteral	Ř
// U+0158: LATIN CAPITAL LETTER R WITH CARON 	TokenNameCOMMENT_LINE	U+0158: LATIN CAPITAL LETTER R WITH CARON 
+	TokenNamePLUS	
"Ȑ"	TokenNameStringLiteral	Ȑ
// U+0210: LATIN CAPITAL LETTER R WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0210: LATIN CAPITAL LETTER R WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"Ȓ"	TokenNameStringLiteral	Ȓ
// U+0212: LATIN CAPITAL LETTER R WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+0212: LATIN CAPITAL LETTER R WITH INVERTED BREVE 
+	TokenNamePLUS	
"Ɍ"	TokenNameStringLiteral	Ɍ
// U+024C: LATIN CAPITAL LETTER R WITH STROKE 	TokenNameCOMMENT_LINE	U+024C: LATIN CAPITAL LETTER R WITH STROKE 
+	TokenNamePLUS	
"ʀ"	TokenNameStringLiteral	ʀ
// U+0280: LATIN LETTER SMALL CAPITAL R 	TokenNameCOMMENT_LINE	U+0280: LATIN LETTER SMALL CAPITAL R 
+	TokenNamePLUS	
"ʁ"	TokenNameStringLiteral	ʁ
// U+0281: LATIN LETTER SMALL CAPITAL INVERTED R 	TokenNameCOMMENT_LINE	U+0281: LATIN LETTER SMALL CAPITAL INVERTED R 
+	TokenNamePLUS	
"ᴙ"	TokenNameStringLiteral	ᴙ
// U+1D19: LATIN LETTER SMALL CAPITAL REVERSED R 	TokenNameCOMMENT_LINE	U+1D19: LATIN LETTER SMALL CAPITAL REVERSED R 
+	TokenNamePLUS	
"ᴚ"	TokenNameStringLiteral	ᴚ
// U+1D1A: LATIN LETTER SMALL CAPITAL TURNED R 	TokenNameCOMMENT_LINE	U+1D1A: LATIN LETTER SMALL CAPITAL TURNED R 
+	TokenNamePLUS	
"Ṙ"	TokenNameStringLiteral	Ṙ
// U+1E58: LATIN CAPITAL LETTER R WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E58: LATIN CAPITAL LETTER R WITH DOT ABOVE 
+	TokenNamePLUS	
"Ṛ"	TokenNameStringLiteral	Ṛ
// U+1E5A: LATIN CAPITAL LETTER R WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E5A: LATIN CAPITAL LETTER R WITH DOT BELOW 
+	TokenNamePLUS	
"Ṝ"	TokenNameStringLiteral	Ṝ
// U+1E5C: LATIN CAPITAL LETTER R WITH DOT BELOW AND MACRON 	TokenNameCOMMENT_LINE	U+1E5C: LATIN CAPITAL LETTER R WITH DOT BELOW AND MACRON 
+	TokenNamePLUS	
"Ṟ"	TokenNameStringLiteral	Ṟ
// U+1E5E: LATIN CAPITAL LETTER R WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E5E: LATIN CAPITAL LETTER R WITH LINE BELOW 
+	TokenNamePLUS	
"Ⓡ"	TokenNameStringLiteral	Ⓡ
// U+24C7: CIRCLED LATIN CAPITAL LETTER R 	TokenNameCOMMENT_LINE	U+24C7: CIRCLED LATIN CAPITAL LETTER R 
+	TokenNamePLUS	
"Ɽ"	TokenNameStringLiteral	Ɽ
// U+2C64: LATIN CAPITAL LETTER R WITH TAIL 	TokenNameCOMMENT_LINE	U+2C64: LATIN CAPITAL LETTER R WITH TAIL 
+	TokenNamePLUS	
"Ꝛ"	TokenNameStringLiteral	Ꝛ
// U+A75A: LATIN CAPITAL LETTER R ROTUNDA 	TokenNameCOMMENT_LINE	U+A75A: LATIN CAPITAL LETTER R ROTUNDA 
+	TokenNamePLUS	
"Ꞃ"	TokenNameStringLiteral	Ꞃ
// U+A782: LATIN CAPITAL LETTER INSULAR R 	TokenNameCOMMENT_LINE	U+A782: LATIN CAPITAL LETTER INSULAR R 
+	TokenNamePLUS	
"Ｒ"	TokenNameStringLiteral	Ｒ
// U+FF32: FULLWIDTH LATIN CAPITAL LETTER R 	TokenNameCOMMENT_LINE	U+FF32: FULLWIDTH LATIN CAPITAL LETTER R 
,	TokenNameCOMMA	
"R"	TokenNameStringLiteral	R
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ŕ"	TokenNameStringLiteral	ŕ
// U+0155: LATIN SMALL LETTER R WITH ACUTE 	TokenNameCOMMENT_LINE	U+0155: LATIN SMALL LETTER R WITH ACUTE 
+	TokenNamePLUS	
"ŗ"	TokenNameStringLiteral	ŗ
// U+0157: LATIN SMALL LETTER R WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0157: LATIN SMALL LETTER R WITH CEDILLA 
+	TokenNamePLUS	
"ř"	TokenNameStringLiteral	ř
// U+0159: LATIN SMALL LETTER R WITH CARON 	TokenNameCOMMENT_LINE	U+0159: LATIN SMALL LETTER R WITH CARON 
+	TokenNamePLUS	
"ȑ"	TokenNameStringLiteral	ȑ
// U+0211: LATIN SMALL LETTER R WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0211: LATIN SMALL LETTER R WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"ȓ"	TokenNameStringLiteral	ȓ
// U+0213: LATIN SMALL LETTER R WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+0213: LATIN SMALL LETTER R WITH INVERTED BREVE 
+	TokenNamePLUS	
"ɍ"	TokenNameStringLiteral	ɍ
// U+024D: LATIN SMALL LETTER R WITH STROKE 	TokenNameCOMMENT_LINE	U+024D: LATIN SMALL LETTER R WITH STROKE 
+	TokenNamePLUS	
"ɼ"	TokenNameStringLiteral	ɼ
// U+027C: LATIN SMALL LETTER R WITH LONG LEG 	TokenNameCOMMENT_LINE	U+027C: LATIN SMALL LETTER R WITH LONG LEG 
+	TokenNamePLUS	
"ɽ"	TokenNameStringLiteral	ɽ
// U+027D: LATIN SMALL LETTER R WITH TAIL 	TokenNameCOMMENT_LINE	U+027D: LATIN SMALL LETTER R WITH TAIL 
+	TokenNamePLUS	
"ɾ"	TokenNameStringLiteral	ɾ
// U+027E: LATIN SMALL LETTER R WITH FISHHOOK 	TokenNameCOMMENT_LINE	U+027E: LATIN SMALL LETTER R WITH FISHHOOK 
+	TokenNamePLUS	
"ɿ"	TokenNameStringLiteral	ɿ
// U+027F: LATIN SMALL LETTER REVERSED R WITH FISHHOOK 	TokenNameCOMMENT_LINE	U+027F: LATIN SMALL LETTER REVERSED R WITH FISHHOOK 
+	TokenNamePLUS	
"ᵣ"	TokenNameStringLiteral	ᵣ
// U+1D63: LATIN SUBSCRIPT SMALL LETTER R 	TokenNameCOMMENT_LINE	U+1D63: LATIN SUBSCRIPT SMALL LETTER R 
+	TokenNamePLUS	
"ᵲ"	TokenNameStringLiteral	ᵲ
// U+1D72: LATIN SMALL LETTER R WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D72: LATIN SMALL LETTER R WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ᵳ"	TokenNameStringLiteral	ᵳ
// U+1D73: LATIN SMALL LETTER R WITH FISHHOOK AND MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D73: LATIN SMALL LETTER R WITH FISHHOOK AND MIDDLE TILDE 
+	TokenNamePLUS	
"ᶉ"	TokenNameStringLiteral	ᶉ
// U+1D89: LATIN SMALL LETTER R WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D89: LATIN SMALL LETTER R WITH PALATAL HOOK 
+	TokenNamePLUS	
"ṙ"	TokenNameStringLiteral	ṙ
// U+1E59: LATIN SMALL LETTER R WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E59: LATIN SMALL LETTER R WITH DOT ABOVE 
+	TokenNamePLUS	
"ṛ"	TokenNameStringLiteral	ṛ
// U+1E5B: LATIN SMALL LETTER R WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E5B: LATIN SMALL LETTER R WITH DOT BELOW 
+	TokenNamePLUS	
"ṝ"	TokenNameStringLiteral	ṝ
// U+1E5D: LATIN SMALL LETTER R WITH DOT BELOW AND MACRON 	TokenNameCOMMENT_LINE	U+1E5D: LATIN SMALL LETTER R WITH DOT BELOW AND MACRON 
+	TokenNamePLUS	
"ṟ"	TokenNameStringLiteral	ṟ
// U+1E5F: LATIN SMALL LETTER R WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E5F: LATIN SMALL LETTER R WITH LINE BELOW 
+	TokenNamePLUS	
"ⓡ"	TokenNameStringLiteral	ⓡ
// U+24E1: CIRCLED LATIN SMALL LETTER R 	TokenNameCOMMENT_LINE	U+24E1: CIRCLED LATIN SMALL LETTER R 
+	TokenNamePLUS	
"ꝛ"	TokenNameStringLiteral	ꝛ
// U+A75B: LATIN SMALL LETTER R ROTUNDA 	TokenNameCOMMENT_LINE	U+A75B: LATIN SMALL LETTER R ROTUNDA 
+	TokenNamePLUS	
"ꞃ"	TokenNameStringLiteral	ꞃ
// U+A783: LATIN SMALL LETTER INSULAR R 	TokenNameCOMMENT_LINE	U+A783: LATIN SMALL LETTER INSULAR R 
+	TokenNamePLUS	
"ｒ"	TokenNameStringLiteral	ｒ
// U+FF52: FULLWIDTH LATIN SMALL LETTER R 	TokenNameCOMMENT_LINE	U+FF52: FULLWIDTH LATIN SMALL LETTER R 
,	TokenNameCOMMA	
"r"	TokenNameStringLiteral	r
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒭"	TokenNameStringLiteral	⒭
// U+24AD: PARENTHESIZED LATIN SMALL LETTER R 	TokenNameCOMMENT_LINE	U+24AD: PARENTHESIZED LATIN SMALL LETTER R 
,	TokenNameCOMMA	
"(r)"	TokenNameStringLiteral	(r)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ś"	TokenNameStringLiteral	Ś
// U+015A: LATIN CAPITAL LETTER S WITH ACUTE 	TokenNameCOMMENT_LINE	U+015A: LATIN CAPITAL LETTER S WITH ACUTE 
+	TokenNamePLUS	
"Ŝ"	TokenNameStringLiteral	Ŝ
// U+015C: LATIN CAPITAL LETTER S WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+015C: LATIN CAPITAL LETTER S WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ş"	TokenNameStringLiteral	Ş
// U+015E: LATIN CAPITAL LETTER S WITH CEDILLA 	TokenNameCOMMENT_LINE	U+015E: LATIN CAPITAL LETTER S WITH CEDILLA 
+	TokenNamePLUS	
"Š"	TokenNameStringLiteral	Š
// U+0160: LATIN CAPITAL LETTER S WITH CARON 	TokenNameCOMMENT_LINE	U+0160: LATIN CAPITAL LETTER S WITH CARON 
+	TokenNamePLUS	
"Ș"	TokenNameStringLiteral	Ș
// U+0218: LATIN CAPITAL LETTER S WITH COMMA BELOW 	TokenNameCOMMENT_LINE	U+0218: LATIN CAPITAL LETTER S WITH COMMA BELOW 
+	TokenNamePLUS	
"Ṡ"	TokenNameStringLiteral	Ṡ
// U+1E60: LATIN CAPITAL LETTER S WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E60: LATIN CAPITAL LETTER S WITH DOT ABOVE 
+	TokenNamePLUS	
"Ṣ"	TokenNameStringLiteral	Ṣ
// U+1E62: LATIN CAPITAL LETTER S WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E62: LATIN CAPITAL LETTER S WITH DOT BELOW 
+	TokenNamePLUS	
"Ṥ"	TokenNameStringLiteral	Ṥ
// U+1E64: LATIN CAPITAL LETTER S WITH ACUTE AND DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E64: LATIN CAPITAL LETTER S WITH ACUTE AND DOT ABOVE 
+	TokenNamePLUS	
"Ṧ"	TokenNameStringLiteral	Ṧ
// U+1E66: LATIN CAPITAL LETTER S WITH CARON AND DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E66: LATIN CAPITAL LETTER S WITH CARON AND DOT ABOVE 
+	TokenNamePLUS	
"Ṩ"	TokenNameStringLiteral	Ṩ
// U+1E68: LATIN CAPITAL LETTER S WITH DOT BELOW AND DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E68: LATIN CAPITAL LETTER S WITH DOT BELOW AND DOT ABOVE 
+	TokenNamePLUS	
"Ⓢ"	TokenNameStringLiteral	Ⓢ
// U+24C8: CIRCLED LATIN CAPITAL LETTER S 	TokenNameCOMMENT_LINE	U+24C8: CIRCLED LATIN CAPITAL LETTER S 
+	TokenNamePLUS	
"ꜱ"	TokenNameStringLiteral	ꜱ
// U+A731: LATIN LETTER SMALL CAPITAL S 	TokenNameCOMMENT_LINE	U+A731: LATIN LETTER SMALL CAPITAL S 
+	TokenNamePLUS	
"ꞅ"	TokenNameStringLiteral	ꞅ
// U+A785: LATIN SMALL LETTER INSULAR S 	TokenNameCOMMENT_LINE	U+A785: LATIN SMALL LETTER INSULAR S 
+	TokenNamePLUS	
"Ｓ"	TokenNameStringLiteral	Ｓ
// U+FF33: FULLWIDTH LATIN CAPITAL LETTER S 	TokenNameCOMMENT_LINE	U+FF33: FULLWIDTH LATIN CAPITAL LETTER S 
,	TokenNameCOMMA	
"S"	TokenNameStringLiteral	S
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ś"	TokenNameStringLiteral	ś
// U+015B: LATIN SMALL LETTER S WITH ACUTE 	TokenNameCOMMENT_LINE	U+015B: LATIN SMALL LETTER S WITH ACUTE 
+	TokenNamePLUS	
"ŝ"	TokenNameStringLiteral	ŝ
// U+015D: LATIN SMALL LETTER S WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+015D: LATIN SMALL LETTER S WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ş"	TokenNameStringLiteral	ş
// U+015F: LATIN SMALL LETTER S WITH CEDILLA 	TokenNameCOMMENT_LINE	U+015F: LATIN SMALL LETTER S WITH CEDILLA 
+	TokenNamePLUS	
"š"	TokenNameStringLiteral	š
// U+0161: LATIN SMALL LETTER S WITH CARON 	TokenNameCOMMENT_LINE	U+0161: LATIN SMALL LETTER S WITH CARON 
+	TokenNamePLUS	
"ſ"	TokenNameStringLiteral	ſ
// U+017F: LATIN SMALL LETTER LONG S 	TokenNameCOMMENT_LINE	U+017F: LATIN SMALL LETTER LONG S 
+	TokenNamePLUS	
"ș"	TokenNameStringLiteral	ș
// U+0219: LATIN SMALL LETTER S WITH COMMA BELOW 	TokenNameCOMMENT_LINE	U+0219: LATIN SMALL LETTER S WITH COMMA BELOW 
+	TokenNamePLUS	
"ȿ"	TokenNameStringLiteral	ȿ
// U+023F: LATIN SMALL LETTER S WITH SWASH TAIL 	TokenNameCOMMENT_LINE	U+023F: LATIN SMALL LETTER S WITH SWASH TAIL 
+	TokenNamePLUS	
"ʂ"	TokenNameStringLiteral	ʂ
// U+0282: LATIN SMALL LETTER S WITH HOOK 	TokenNameCOMMENT_LINE	U+0282: LATIN SMALL LETTER S WITH HOOK 
+	TokenNamePLUS	
"ᵴ"	TokenNameStringLiteral	ᵴ
// U+1D74: LATIN SMALL LETTER S WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D74: LATIN SMALL LETTER S WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ᶊ"	TokenNameStringLiteral	ᶊ
// U+1D8A: LATIN SMALL LETTER S WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D8A: LATIN SMALL LETTER S WITH PALATAL HOOK 
+	TokenNamePLUS	
"ṡ"	TokenNameStringLiteral	ṡ
// U+1E61: LATIN SMALL LETTER S WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E61: LATIN SMALL LETTER S WITH DOT ABOVE 
+	TokenNamePLUS	
"ṣ"	TokenNameStringLiteral	ṣ
// U+1E63: LATIN SMALL LETTER S WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E63: LATIN SMALL LETTER S WITH DOT BELOW 
+	TokenNamePLUS	
"ṥ"	TokenNameStringLiteral	ṥ
// U+1E65: LATIN SMALL LETTER S WITH ACUTE AND DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E65: LATIN SMALL LETTER S WITH ACUTE AND DOT ABOVE 
+	TokenNamePLUS	
"ṧ"	TokenNameStringLiteral	ṧ
// U+1E67: LATIN SMALL LETTER S WITH CARON AND DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E67: LATIN SMALL LETTER S WITH CARON AND DOT ABOVE 
+	TokenNamePLUS	
"ṩ"	TokenNameStringLiteral	ṩ
// U+1E69: LATIN SMALL LETTER S WITH DOT BELOW AND DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E69: LATIN SMALL LETTER S WITH DOT BELOW AND DOT ABOVE 
+	TokenNamePLUS	
"ẜ"	TokenNameStringLiteral	ẜ
// U+1E9C: LATIN SMALL LETTER LONG S WITH DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+1E9C: LATIN SMALL LETTER LONG S WITH DIAGONAL STROKE 
+	TokenNamePLUS	
"ẝ"	TokenNameStringLiteral	ẝ
// U+1E9D: LATIN SMALL LETTER LONG S WITH HIGH STROKE 	TokenNameCOMMENT_LINE	U+1E9D: LATIN SMALL LETTER LONG S WITH HIGH STROKE 
+	TokenNamePLUS	
"ⓢ"	TokenNameStringLiteral	ⓢ
// U+24E2: CIRCLED LATIN SMALL LETTER S 	TokenNameCOMMENT_LINE	U+24E2: CIRCLED LATIN SMALL LETTER S 
+	TokenNamePLUS	
"Ꞅ"	TokenNameStringLiteral	Ꞅ
// U+A784: LATIN CAPITAL LETTER INSULAR S 	TokenNameCOMMENT_LINE	U+A784: LATIN CAPITAL LETTER INSULAR S 
+	TokenNamePLUS	
"ｓ"	TokenNameStringLiteral	ｓ
// U+FF53: FULLWIDTH LATIN SMALL LETTER S 	TokenNameCOMMENT_LINE	U+FF53: FULLWIDTH LATIN SMALL LETTER S 
,	TokenNameCOMMA	
"s"	TokenNameStringLiteral	s
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ẞ"	TokenNameStringLiteral	ẞ
// U+1E9E: LATIN CAPITAL LETTER SHARP S 	TokenNameCOMMENT_LINE	U+1E9E: LATIN CAPITAL LETTER SHARP S 
,	TokenNameCOMMA	
"SS"	TokenNameStringLiteral	SS
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒮"	TokenNameStringLiteral	⒮
// U+24AE: PARENTHESIZED LATIN SMALL LETTER S 	TokenNameCOMMENT_LINE	U+24AE: PARENTHESIZED LATIN SMALL LETTER S 
,	TokenNameCOMMA	
"(s)"	TokenNameStringLiteral	(s)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ß"	TokenNameStringLiteral	ß
// U+00DF: LATIN SMALL LETTER SHARP S 	TokenNameCOMMENT_LINE	U+00DF: LATIN SMALL LETTER SHARP S 
,	TokenNameCOMMA	
"ss"	TokenNameStringLiteral	ss
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ﬆ"	TokenNameStringLiteral	ﬆ
// U+FB06: LATIN SMALL LIGATURE ST 	TokenNameCOMMENT_LINE	U+FB06: LATIN SMALL LIGATURE ST 
,	TokenNameCOMMA	
"st"	TokenNameStringLiteral	st
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ţ"	TokenNameStringLiteral	Ţ
// U+0162: LATIN CAPITAL LETTER T WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0162: LATIN CAPITAL LETTER T WITH CEDILLA 
+	TokenNamePLUS	
"Ť"	TokenNameStringLiteral	Ť
// U+0164: LATIN CAPITAL LETTER T WITH CARON 	TokenNameCOMMENT_LINE	U+0164: LATIN CAPITAL LETTER T WITH CARON 
+	TokenNamePLUS	
"Ŧ"	TokenNameStringLiteral	Ŧ
// U+0166: LATIN CAPITAL LETTER T WITH STROKE 	TokenNameCOMMENT_LINE	U+0166: LATIN CAPITAL LETTER T WITH STROKE 
+	TokenNamePLUS	
"Ƭ"	TokenNameStringLiteral	Ƭ
// U+01AC: LATIN CAPITAL LETTER T WITH HOOK 	TokenNameCOMMENT_LINE	U+01AC: LATIN CAPITAL LETTER T WITH HOOK 
+	TokenNamePLUS	
"Ʈ"	TokenNameStringLiteral	Ʈ
// U+01AE: LATIN CAPITAL LETTER T WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+01AE: LATIN CAPITAL LETTER T WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"Ț"	TokenNameStringLiteral	Ț
// U+021A: LATIN CAPITAL LETTER T WITH COMMA BELOW 	TokenNameCOMMENT_LINE	U+021A: LATIN CAPITAL LETTER T WITH COMMA BELOW 
+	TokenNamePLUS	
"Ⱦ"	TokenNameStringLiteral	Ⱦ
// U+023E: LATIN CAPITAL LETTER T WITH DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+023E: LATIN CAPITAL LETTER T WITH DIAGONAL STROKE 
+	TokenNamePLUS	
"ᴛ"	TokenNameStringLiteral	ᴛ
// U+1D1B: LATIN LETTER SMALL CAPITAL T 	TokenNameCOMMENT_LINE	U+1D1B: LATIN LETTER SMALL CAPITAL T 
+	TokenNamePLUS	
"Ṫ"	TokenNameStringLiteral	Ṫ
// U+1E6A: LATIN CAPITAL LETTER T WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E6A: LATIN CAPITAL LETTER T WITH DOT ABOVE 
+	TokenNamePLUS	
"Ṭ"	TokenNameStringLiteral	Ṭ
// U+1E6C: LATIN CAPITAL LETTER T WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E6C: LATIN CAPITAL LETTER T WITH DOT BELOW 
+	TokenNamePLUS	
"Ṯ"	TokenNameStringLiteral	Ṯ
// U+1E6E: LATIN CAPITAL LETTER T WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E6E: LATIN CAPITAL LETTER T WITH LINE BELOW 
+	TokenNamePLUS	
"Ṱ"	TokenNameStringLiteral	Ṱ
// U+1E70: LATIN CAPITAL LETTER T WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E70: LATIN CAPITAL LETTER T WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"Ⓣ"	TokenNameStringLiteral	Ⓣ
// U+24C9: CIRCLED LATIN CAPITAL LETTER T 	TokenNameCOMMENT_LINE	U+24C9: CIRCLED LATIN CAPITAL LETTER T 
+	TokenNamePLUS	
"Ꞇ"	TokenNameStringLiteral	Ꞇ
// U+A786: LATIN CAPITAL LETTER INSULAR T 	TokenNameCOMMENT_LINE	U+A786: LATIN CAPITAL LETTER INSULAR T 
+	TokenNamePLUS	
"Ｔ"	TokenNameStringLiteral	Ｔ
// U+FF34: FULLWIDTH LATIN CAPITAL LETTER T 	TokenNameCOMMENT_LINE	U+FF34: FULLWIDTH LATIN CAPITAL LETTER T 
,	TokenNameCOMMA	
"T"	TokenNameStringLiteral	T
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ţ"	TokenNameStringLiteral	ţ
// U+0163: LATIN SMALL LETTER T WITH CEDILLA 	TokenNameCOMMENT_LINE	U+0163: LATIN SMALL LETTER T WITH CEDILLA 
+	TokenNamePLUS	
"ť"	TokenNameStringLiteral	ť
// U+0165: LATIN SMALL LETTER T WITH CARON 	TokenNameCOMMENT_LINE	U+0165: LATIN SMALL LETTER T WITH CARON 
+	TokenNamePLUS	
"ŧ"	TokenNameStringLiteral	ŧ
// U+0167: LATIN SMALL LETTER T WITH STROKE 	TokenNameCOMMENT_LINE	U+0167: LATIN SMALL LETTER T WITH STROKE 
+	TokenNamePLUS	
"ƫ"	TokenNameStringLiteral	ƫ
// U+01AB: LATIN SMALL LETTER T WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+01AB: LATIN SMALL LETTER T WITH PALATAL HOOK 
+	TokenNamePLUS	
"ƭ"	TokenNameStringLiteral	ƭ
// U+01AD: LATIN SMALL LETTER T WITH HOOK 	TokenNameCOMMENT_LINE	U+01AD: LATIN SMALL LETTER T WITH HOOK 
+	TokenNamePLUS	
"ț"	TokenNameStringLiteral	ț
// U+021B: LATIN SMALL LETTER T WITH COMMA BELOW 	TokenNameCOMMENT_LINE	U+021B: LATIN SMALL LETTER T WITH COMMA BELOW 
+	TokenNamePLUS	
"ȶ"	TokenNameStringLiteral	ȶ
// U+0236: LATIN SMALL LETTER T WITH CURL 	TokenNameCOMMENT_LINE	U+0236: LATIN SMALL LETTER T WITH CURL 
+	TokenNamePLUS	
"ʇ"	TokenNameStringLiteral	ʇ
// U+0287: LATIN SMALL LETTER TURNED T 	TokenNameCOMMENT_LINE	U+0287: LATIN SMALL LETTER TURNED T 
+	TokenNamePLUS	
"ʈ"	TokenNameStringLiteral	ʈ
// U+0288: LATIN SMALL LETTER T WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+0288: LATIN SMALL LETTER T WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ᵵ"	TokenNameStringLiteral	ᵵ
// U+1D75: LATIN SMALL LETTER T WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D75: LATIN SMALL LETTER T WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ṫ"	TokenNameStringLiteral	ṫ
// U+1E6B: LATIN SMALL LETTER T WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E6B: LATIN SMALL LETTER T WITH DOT ABOVE 
+	TokenNamePLUS	
"ṭ"	TokenNameStringLiteral	ṭ
// U+1E6D: LATIN SMALL LETTER T WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E6D: LATIN SMALL LETTER T WITH DOT BELOW 
+	TokenNamePLUS	
"ṯ"	TokenNameStringLiteral	ṯ
// U+1E6F: LATIN SMALL LETTER T WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E6F: LATIN SMALL LETTER T WITH LINE BELOW 
+	TokenNamePLUS	
"ṱ"	TokenNameStringLiteral	ṱ
// U+1E71: LATIN SMALL LETTER T WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E71: LATIN SMALL LETTER T WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"ẗ"	TokenNameStringLiteral	ẗ
// U+1E97: LATIN SMALL LETTER T WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+1E97: LATIN SMALL LETTER T WITH DIAERESIS 
+	TokenNamePLUS	
"ⓣ"	TokenNameStringLiteral	ⓣ
// U+24E3: CIRCLED LATIN SMALL LETTER T 	TokenNameCOMMENT_LINE	U+24E3: CIRCLED LATIN SMALL LETTER T 
+	TokenNamePLUS	
"ⱦ"	TokenNameStringLiteral	ⱦ
// U+2C66: LATIN SMALL LETTER T WITH DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+2C66: LATIN SMALL LETTER T WITH DIAGONAL STROKE 
+	TokenNamePLUS	
"ｔ"	TokenNameStringLiteral	ｔ
// U+FF54: FULLWIDTH LATIN SMALL LETTER T 	TokenNameCOMMENT_LINE	U+FF54: FULLWIDTH LATIN SMALL LETTER T 
,	TokenNameCOMMA	
"t"	TokenNameStringLiteral	t
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Þ"	TokenNameStringLiteral	Þ
// U+00DE: LATIN CAPITAL LETTER THORN 	TokenNameCOMMENT_LINE	U+00DE: LATIN CAPITAL LETTER THORN 
+	TokenNamePLUS	
"Ꝧ"	TokenNameStringLiteral	Ꝧ
// U+A766: LATIN CAPITAL LETTER THORN WITH STROKE THROUGH DESCENDER 	TokenNameCOMMENT_LINE	U+A766: LATIN CAPITAL LETTER THORN WITH STROKE THROUGH DESCENDER 
,	TokenNameCOMMA	
"TH"	TokenNameStringLiteral	TH
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ꜩ"	TokenNameStringLiteral	Ꜩ
// U+A728: LATIN CAPITAL LETTER TZ 	TokenNameCOMMENT_LINE	U+A728: LATIN CAPITAL LETTER TZ 
,	TokenNameCOMMA	
"TZ"	TokenNameStringLiteral	TZ
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒯"	TokenNameStringLiteral	⒯
// U+24AF: PARENTHESIZED LATIN SMALL LETTER T 	TokenNameCOMMENT_LINE	U+24AF: PARENTHESIZED LATIN SMALL LETTER T 
,	TokenNameCOMMA	
"(t)"	TokenNameStringLiteral	(t)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ʨ"	TokenNameStringLiteral	ʨ
// U+02A8: LATIN SMALL LETTER TC DIGRAPH WITH CURL 	TokenNameCOMMENT_LINE	U+02A8: LATIN SMALL LETTER TC DIGRAPH WITH CURL 
,	TokenNameCOMMA	
"tc"	TokenNameStringLiteral	tc
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"þ"	TokenNameStringLiteral	þ
// U+00FE: LATIN SMALL LETTER THORN 	TokenNameCOMMENT_LINE	U+00FE: LATIN SMALL LETTER THORN 
+	TokenNamePLUS	
"ᵺ"	TokenNameStringLiteral	ᵺ
// U+1D7A: LATIN SMALL LETTER TH WITH STRIKETHROUGH 	TokenNameCOMMENT_LINE	U+1D7A: LATIN SMALL LETTER TH WITH STRIKETHROUGH 
+	TokenNamePLUS	
"ꝧ"	TokenNameStringLiteral	ꝧ
// U+A767: LATIN SMALL LETTER THORN WITH STROKE THROUGH DESCENDER 	TokenNameCOMMENT_LINE	U+A767: LATIN SMALL LETTER THORN WITH STROKE THROUGH DESCENDER 
,	TokenNameCOMMA	
"th"	TokenNameStringLiteral	th
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ʦ"	TokenNameStringLiteral	ʦ
// U+02A6: LATIN SMALL LETTER TS DIGRAPH 	TokenNameCOMMENT_LINE	U+02A6: LATIN SMALL LETTER TS DIGRAPH 
,	TokenNameCOMMA	
"ts"	TokenNameStringLiteral	ts
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ꜩ"	TokenNameStringLiteral	ꜩ
// U+A729: LATIN SMALL LETTER TZ 	TokenNameCOMMENT_LINE	U+A729: LATIN SMALL LETTER TZ 
,	TokenNameCOMMA	
"tz"	TokenNameStringLiteral	tz
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ù"	TokenNameStringLiteral	Ù
// U+00D9: LATIN CAPITAL LETTER U WITH GRAVE 	TokenNameCOMMENT_LINE	U+00D9: LATIN CAPITAL LETTER U WITH GRAVE 
+	TokenNamePLUS	
"Ú"	TokenNameStringLiteral	Ú
// U+00DA: LATIN CAPITAL LETTER U WITH ACUTE 	TokenNameCOMMENT_LINE	U+00DA: LATIN CAPITAL LETTER U WITH ACUTE 
+	TokenNamePLUS	
"Û"	TokenNameStringLiteral	Û
// U+00DB: LATIN CAPITAL LETTER U WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00DB: LATIN CAPITAL LETTER U WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ü"	TokenNameStringLiteral	Ü
// U+00DC: LATIN CAPITAL LETTER U WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00DC: LATIN CAPITAL LETTER U WITH DIAERESIS 
+	TokenNamePLUS	
"Ũ"	TokenNameStringLiteral	Ũ
// U+0168: LATIN CAPITAL LETTER U WITH TILDE 	TokenNameCOMMENT_LINE	U+0168: LATIN CAPITAL LETTER U WITH TILDE 
+	TokenNamePLUS	
"Ū"	TokenNameStringLiteral	Ū
// U+016A: LATIN CAPITAL LETTER U WITH MACRON 	TokenNameCOMMENT_LINE	U+016A: LATIN CAPITAL LETTER U WITH MACRON 
+	TokenNamePLUS	
"Ŭ"	TokenNameStringLiteral	Ŭ
// U+016C: LATIN CAPITAL LETTER U WITH BREVE 	TokenNameCOMMENT_LINE	U+016C: LATIN CAPITAL LETTER U WITH BREVE 
+	TokenNamePLUS	
"Ů"	TokenNameStringLiteral	Ů
// U+016E: LATIN CAPITAL LETTER U WITH RING ABOVE 	TokenNameCOMMENT_LINE	U+016E: LATIN CAPITAL LETTER U WITH RING ABOVE 
+	TokenNamePLUS	
"Ű"	TokenNameStringLiteral	Ű
// U+0170: LATIN CAPITAL LETTER U WITH DOUBLE ACUTE 	TokenNameCOMMENT_LINE	U+0170: LATIN CAPITAL LETTER U WITH DOUBLE ACUTE 
+	TokenNamePLUS	
"Ų"	TokenNameStringLiteral	Ų
// U+0172: LATIN CAPITAL LETTER U WITH OGONEK 	TokenNameCOMMENT_LINE	U+0172: LATIN CAPITAL LETTER U WITH OGONEK 
+	TokenNamePLUS	
"Ư"	TokenNameStringLiteral	Ư
// U+01AF: LATIN CAPITAL LETTER U WITH HORN 	TokenNameCOMMENT_LINE	U+01AF: LATIN CAPITAL LETTER U WITH HORN 
+	TokenNamePLUS	
"Ǔ"	TokenNameStringLiteral	Ǔ
// U+01D3: LATIN CAPITAL LETTER U WITH CARON 	TokenNameCOMMENT_LINE	U+01D3: LATIN CAPITAL LETTER U WITH CARON 
+	TokenNamePLUS	
"Ǖ"	TokenNameStringLiteral	Ǖ
// U+01D5: LATIN CAPITAL LETTER U WITH DIAERESIS AND MACRON 	TokenNameCOMMENT_LINE	U+01D5: LATIN CAPITAL LETTER U WITH DIAERESIS AND MACRON 
+	TokenNamePLUS	
"Ǘ"	TokenNameStringLiteral	Ǘ
// U+01D7: LATIN CAPITAL LETTER U WITH DIAERESIS AND ACUTE 	TokenNameCOMMENT_LINE	U+01D7: LATIN CAPITAL LETTER U WITH DIAERESIS AND ACUTE 
+	TokenNamePLUS	
"Ǚ"	TokenNameStringLiteral	Ǚ
// U+01D9: LATIN CAPITAL LETTER U WITH DIAERESIS AND CARON 	TokenNameCOMMENT_LINE	U+01D9: LATIN CAPITAL LETTER U WITH DIAERESIS AND CARON 
+	TokenNamePLUS	
"Ǜ"	TokenNameStringLiteral	Ǜ
// U+01DB: LATIN CAPITAL LETTER U WITH DIAERESIS AND GRAVE 	TokenNameCOMMENT_LINE	U+01DB: LATIN CAPITAL LETTER U WITH DIAERESIS AND GRAVE 
+	TokenNamePLUS	
"Ȕ"	TokenNameStringLiteral	Ȕ
// U+0214: LATIN CAPITAL LETTER U WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0214: LATIN CAPITAL LETTER U WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"Ȗ"	TokenNameStringLiteral	Ȗ
// U+0216: LATIN CAPITAL LETTER U WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+0216: LATIN CAPITAL LETTER U WITH INVERTED BREVE 
+	TokenNamePLUS	
"Ʉ"	TokenNameStringLiteral	Ʉ
// U+0244: LATIN CAPITAL LETTER U BAR 	TokenNameCOMMENT_LINE	U+0244: LATIN CAPITAL LETTER U BAR 
+	TokenNamePLUS	
"ᴜ"	TokenNameStringLiteral	ᴜ
// U+1D1C: LATIN LETTER SMALL CAPITAL U 	TokenNameCOMMENT_LINE	U+1D1C: LATIN LETTER SMALL CAPITAL U 
+	TokenNamePLUS	
"ᵾ"	TokenNameStringLiteral	ᵾ
// U+1D7E: LATIN SMALL CAPITAL LETTER U WITH STROKE 	TokenNameCOMMENT_LINE	U+1D7E: LATIN SMALL CAPITAL LETTER U WITH STROKE 
+	TokenNamePLUS	
"Ṳ"	TokenNameStringLiteral	Ṳ
// U+1E72: LATIN CAPITAL LETTER U WITH DIAERESIS BELOW 	TokenNameCOMMENT_LINE	U+1E72: LATIN CAPITAL LETTER U WITH DIAERESIS BELOW 
+	TokenNamePLUS	
"Ṵ"	TokenNameStringLiteral	Ṵ
// U+1E74: LATIN CAPITAL LETTER U WITH TILDE BELOW 	TokenNameCOMMENT_LINE	U+1E74: LATIN CAPITAL LETTER U WITH TILDE BELOW 
+	TokenNamePLUS	
"Ṷ"	TokenNameStringLiteral	Ṷ
// U+1E76: LATIN CAPITAL LETTER U WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E76: LATIN CAPITAL LETTER U WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"Ṹ"	TokenNameStringLiteral	Ṹ
// U+1E78: LATIN CAPITAL LETTER U WITH TILDE AND ACUTE 	TokenNameCOMMENT_LINE	U+1E78: LATIN CAPITAL LETTER U WITH TILDE AND ACUTE 
+	TokenNamePLUS	
"Ṻ"	TokenNameStringLiteral	Ṻ
// U+1E7A: LATIN CAPITAL LETTER U WITH MACRON AND DIAERESIS 	TokenNameCOMMENT_LINE	U+1E7A: LATIN CAPITAL LETTER U WITH MACRON AND DIAERESIS 
+	TokenNamePLUS	
"Ụ"	TokenNameStringLiteral	Ụ
// U+1EE4: LATIN CAPITAL LETTER U WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1EE4: LATIN CAPITAL LETTER U WITH DOT BELOW 
+	TokenNamePLUS	
"Ủ"	TokenNameStringLiteral	Ủ
// U+1EE6: LATIN CAPITAL LETTER U WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EE6: LATIN CAPITAL LETTER U WITH HOOK ABOVE 
+	TokenNamePLUS	
"Ứ"	TokenNameStringLiteral	Ứ
// U+1EE8: LATIN CAPITAL LETTER U WITH HORN AND ACUTE 	TokenNameCOMMENT_LINE	U+1EE8: LATIN CAPITAL LETTER U WITH HORN AND ACUTE 
+	TokenNamePLUS	
"Ừ"	TokenNameStringLiteral	Ừ
// U+1EEA: LATIN CAPITAL LETTER U WITH HORN AND GRAVE 	TokenNameCOMMENT_LINE	U+1EEA: LATIN CAPITAL LETTER U WITH HORN AND GRAVE 
+	TokenNamePLUS	
"Ử"	TokenNameStringLiteral	Ử
// U+1EEC: LATIN CAPITAL LETTER U WITH HORN AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EEC: LATIN CAPITAL LETTER U WITH HORN AND HOOK ABOVE 
+	TokenNamePLUS	
"Ữ"	TokenNameStringLiteral	Ữ
// U+1EEE: LATIN CAPITAL LETTER U WITH HORN AND TILDE 	TokenNameCOMMENT_LINE	U+1EEE: LATIN CAPITAL LETTER U WITH HORN AND TILDE 
+	TokenNamePLUS	
"Ự"	TokenNameStringLiteral	Ự
// U+1EF0: LATIN CAPITAL LETTER U WITH HORN AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EF0: LATIN CAPITAL LETTER U WITH HORN AND DOT BELOW 
+	TokenNamePLUS	
"Ⓤ"	TokenNameStringLiteral	Ⓤ
// U+24CA: CIRCLED LATIN CAPITAL LETTER U 	TokenNameCOMMENT_LINE	U+24CA: CIRCLED LATIN CAPITAL LETTER U 
+	TokenNamePLUS	
"Ｕ"	TokenNameStringLiteral	Ｕ
// U+FF35: FULLWIDTH LATIN CAPITAL LETTER U 	TokenNameCOMMENT_LINE	U+FF35: FULLWIDTH LATIN CAPITAL LETTER U 
,	TokenNameCOMMA	
"U"	TokenNameStringLiteral	U
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ù"	TokenNameStringLiteral	ù
// U+00F9: LATIN SMALL LETTER U WITH GRAVE 	TokenNameCOMMENT_LINE	U+00F9: LATIN SMALL LETTER U WITH GRAVE 
+	TokenNamePLUS	
"ú"	TokenNameStringLiteral	ú
// U+00FA: LATIN SMALL LETTER U WITH ACUTE 	TokenNameCOMMENT_LINE	U+00FA: LATIN SMALL LETTER U WITH ACUTE 
+	TokenNamePLUS	
"û"	TokenNameStringLiteral	û
// U+00FB: LATIN SMALL LETTER U WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+00FB: LATIN SMALL LETTER U WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ü"	TokenNameStringLiteral	ü
// U+00FC: LATIN SMALL LETTER U WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00FC: LATIN SMALL LETTER U WITH DIAERESIS 
+	TokenNamePLUS	
"ũ"	TokenNameStringLiteral	ũ
// U+0169: LATIN SMALL LETTER U WITH TILDE 	TokenNameCOMMENT_LINE	U+0169: LATIN SMALL LETTER U WITH TILDE 
+	TokenNamePLUS	
"ū"	TokenNameStringLiteral	ū
// U+016B: LATIN SMALL LETTER U WITH MACRON 	TokenNameCOMMENT_LINE	U+016B: LATIN SMALL LETTER U WITH MACRON 
+	TokenNamePLUS	
"ŭ"	TokenNameStringLiteral	ŭ
// U+016D: LATIN SMALL LETTER U WITH BREVE 	TokenNameCOMMENT_LINE	U+016D: LATIN SMALL LETTER U WITH BREVE 
+	TokenNamePLUS	
"ů"	TokenNameStringLiteral	ů
// U+016F: LATIN SMALL LETTER U WITH RING ABOVE 	TokenNameCOMMENT_LINE	U+016F: LATIN SMALL LETTER U WITH RING ABOVE 
+	TokenNamePLUS	
"ű"	TokenNameStringLiteral	ű
// U+0171: LATIN SMALL LETTER U WITH DOUBLE ACUTE 	TokenNameCOMMENT_LINE	U+0171: LATIN SMALL LETTER U WITH DOUBLE ACUTE 
+	TokenNamePLUS	
"ų"	TokenNameStringLiteral	ų
// U+0173: LATIN SMALL LETTER U WITH OGONEK 	TokenNameCOMMENT_LINE	U+0173: LATIN SMALL LETTER U WITH OGONEK 
+	TokenNamePLUS	
"ư"	TokenNameStringLiteral	ư
// U+01B0: LATIN SMALL LETTER U WITH HORN 	TokenNameCOMMENT_LINE	U+01B0: LATIN SMALL LETTER U WITH HORN 
+	TokenNamePLUS	
"ǔ"	TokenNameStringLiteral	ǔ
// U+01D4: LATIN SMALL LETTER U WITH CARON 	TokenNameCOMMENT_LINE	U+01D4: LATIN SMALL LETTER U WITH CARON 
+	TokenNamePLUS	
"ǖ"	TokenNameStringLiteral	ǖ
// U+01D6: LATIN SMALL LETTER U WITH DIAERESIS AND MACRON 	TokenNameCOMMENT_LINE	U+01D6: LATIN SMALL LETTER U WITH DIAERESIS AND MACRON 
+	TokenNamePLUS	
"ǘ"	TokenNameStringLiteral	ǘ
// U+01D8: LATIN SMALL LETTER U WITH DIAERESIS AND ACUTE 	TokenNameCOMMENT_LINE	U+01D8: LATIN SMALL LETTER U WITH DIAERESIS AND ACUTE 
+	TokenNamePLUS	
"ǚ"	TokenNameStringLiteral	ǚ
// U+01DA: LATIN SMALL LETTER U WITH DIAERESIS AND CARON 	TokenNameCOMMENT_LINE	U+01DA: LATIN SMALL LETTER U WITH DIAERESIS AND CARON 
+	TokenNamePLUS	
"ǜ"	TokenNameStringLiteral	ǜ
// U+01DC: LATIN SMALL LETTER U WITH DIAERESIS AND GRAVE 	TokenNameCOMMENT_LINE	U+01DC: LATIN SMALL LETTER U WITH DIAERESIS AND GRAVE 
+	TokenNamePLUS	
"ȕ"	TokenNameStringLiteral	ȕ
// U+0215: LATIN SMALL LETTER U WITH DOUBLE GRAVE 	TokenNameCOMMENT_LINE	U+0215: LATIN SMALL LETTER U WITH DOUBLE GRAVE 
+	TokenNamePLUS	
"ȗ"	TokenNameStringLiteral	ȗ
// U+0217: LATIN SMALL LETTER U WITH INVERTED BREVE 	TokenNameCOMMENT_LINE	U+0217: LATIN SMALL LETTER U WITH INVERTED BREVE 
+	TokenNamePLUS	
"ʉ"	TokenNameStringLiteral	ʉ
// U+0289: LATIN SMALL LETTER U BAR 	TokenNameCOMMENT_LINE	U+0289: LATIN SMALL LETTER U BAR 
+	TokenNamePLUS	
"ᵤ"	TokenNameStringLiteral	ᵤ
// U+1D64: LATIN SUBSCRIPT SMALL LETTER U 	TokenNameCOMMENT_LINE	U+1D64: LATIN SUBSCRIPT SMALL LETTER U 
+	TokenNamePLUS	
"ᶙ"	TokenNameStringLiteral	ᶙ
// U+1D99: LATIN SMALL LETTER U WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+1D99: LATIN SMALL LETTER U WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ṳ"	TokenNameStringLiteral	ṳ
// U+1E73: LATIN SMALL LETTER U WITH DIAERESIS BELOW 	TokenNameCOMMENT_LINE	U+1E73: LATIN SMALL LETTER U WITH DIAERESIS BELOW 
+	TokenNamePLUS	
"ṵ"	TokenNameStringLiteral	ṵ
// U+1E75: LATIN SMALL LETTER U WITH TILDE BELOW 	TokenNameCOMMENT_LINE	U+1E75: LATIN SMALL LETTER U WITH TILDE BELOW 
+	TokenNamePLUS	
"ṷ"	TokenNameStringLiteral	ṷ
// U+1E77: LATIN SMALL LETTER U WITH CIRCUMFLEX BELOW 	TokenNameCOMMENT_LINE	U+1E77: LATIN SMALL LETTER U WITH CIRCUMFLEX BELOW 
+	TokenNamePLUS	
"ṹ"	TokenNameStringLiteral	ṹ
// U+1E79: LATIN SMALL LETTER U WITH TILDE AND ACUTE 	TokenNameCOMMENT_LINE	U+1E79: LATIN SMALL LETTER U WITH TILDE AND ACUTE 
+	TokenNamePLUS	
"ṻ"	TokenNameStringLiteral	ṻ
// U+1E7B: LATIN SMALL LETTER U WITH MACRON AND DIAERESIS 	TokenNameCOMMENT_LINE	U+1E7B: LATIN SMALL LETTER U WITH MACRON AND DIAERESIS 
+	TokenNamePLUS	
"ụ"	TokenNameStringLiteral	ụ
// U+1EE5: LATIN SMALL LETTER U WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1EE5: LATIN SMALL LETTER U WITH DOT BELOW 
+	TokenNamePLUS	
"ủ"	TokenNameStringLiteral	ủ
// U+1EE7: LATIN SMALL LETTER U WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EE7: LATIN SMALL LETTER U WITH HOOK ABOVE 
+	TokenNamePLUS	
"ứ"	TokenNameStringLiteral	ứ
// U+1EE9: LATIN SMALL LETTER U WITH HORN AND ACUTE 	TokenNameCOMMENT_LINE	U+1EE9: LATIN SMALL LETTER U WITH HORN AND ACUTE 
+	TokenNamePLUS	
"ừ"	TokenNameStringLiteral	ừ
// U+1EEB: LATIN SMALL LETTER U WITH HORN AND GRAVE 	TokenNameCOMMENT_LINE	U+1EEB: LATIN SMALL LETTER U WITH HORN AND GRAVE 
+	TokenNamePLUS	
"ử"	TokenNameStringLiteral	ử
// U+1EED: LATIN SMALL LETTER U WITH HORN AND HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EED: LATIN SMALL LETTER U WITH HORN AND HOOK ABOVE 
+	TokenNamePLUS	
"ữ"	TokenNameStringLiteral	ữ
// U+1EEF: LATIN SMALL LETTER U WITH HORN AND TILDE 	TokenNameCOMMENT_LINE	U+1EEF: LATIN SMALL LETTER U WITH HORN AND TILDE 
+	TokenNamePLUS	
"ự"	TokenNameStringLiteral	ự
// U+1EF1: LATIN SMALL LETTER U WITH HORN AND DOT BELOW 	TokenNameCOMMENT_LINE	U+1EF1: LATIN SMALL LETTER U WITH HORN AND DOT BELOW 
+	TokenNamePLUS	
"ⓤ"	TokenNameStringLiteral	ⓤ
// U+24E4: CIRCLED LATIN SMALL LETTER U 	TokenNameCOMMENT_LINE	U+24E4: CIRCLED LATIN SMALL LETTER U 
+	TokenNamePLUS	
"ｕ"	TokenNameStringLiteral	ｕ
// U+FF55: FULLWIDTH LATIN SMALL LETTER U 	TokenNameCOMMENT_LINE	U+FF55: FULLWIDTH LATIN SMALL LETTER U 
,	TokenNameCOMMA	
"u"	TokenNameStringLiteral	u
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒰"	TokenNameStringLiteral	⒰
// U+24B0: PARENTHESIZED LATIN SMALL LETTER U 	TokenNameCOMMENT_LINE	U+24B0: PARENTHESIZED LATIN SMALL LETTER U 
,	TokenNameCOMMA	
"(u)"	TokenNameStringLiteral	(u)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ᵫ"	TokenNameStringLiteral	ᵫ
// U+1D6B: LATIN SMALL LETTER UE 	TokenNameCOMMENT_LINE	U+1D6B: LATIN SMALL LETTER UE 
,	TokenNameCOMMA	
"ue"	TokenNameStringLiteral	ue
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ʋ"	TokenNameStringLiteral	Ʋ
// U+01B2: LATIN CAPITAL LETTER V WITH HOOK 	TokenNameCOMMENT_LINE	U+01B2: LATIN CAPITAL LETTER V WITH HOOK 
+	TokenNamePLUS	
"Ʌ"	TokenNameStringLiteral	Ʌ
// U+0245: LATIN CAPITAL LETTER TURNED V 	TokenNameCOMMENT_LINE	U+0245: LATIN CAPITAL LETTER TURNED V 
+	TokenNamePLUS	
"ᴠ"	TokenNameStringLiteral	ᴠ
// U+1D20: LATIN LETTER SMALL CAPITAL V 	TokenNameCOMMENT_LINE	U+1D20: LATIN LETTER SMALL CAPITAL V 
+	TokenNamePLUS	
"Ṽ"	TokenNameStringLiteral	Ṽ
// U+1E7C: LATIN CAPITAL LETTER V WITH TILDE 	TokenNameCOMMENT_LINE	U+1E7C: LATIN CAPITAL LETTER V WITH TILDE 
+	TokenNamePLUS	
"Ṿ"	TokenNameStringLiteral	Ṿ
// U+1E7E: LATIN CAPITAL LETTER V WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E7E: LATIN CAPITAL LETTER V WITH DOT BELOW 
+	TokenNamePLUS	
"Ỽ"	TokenNameStringLiteral	Ỽ
// U+1EFC: LATIN CAPITAL LETTER MIDDLE-WELSH V 	TokenNameCOMMENT_LINE	U+1EFC: LATIN CAPITAL LETTER MIDDLE-WELSH V 
+	TokenNamePLUS	
"Ⓥ"	TokenNameStringLiteral	Ⓥ
// U+24CB: CIRCLED LATIN CAPITAL LETTER V 	TokenNameCOMMENT_LINE	U+24CB: CIRCLED LATIN CAPITAL LETTER V 
+	TokenNamePLUS	
"Ꝟ"	TokenNameStringLiteral	Ꝟ
// U+A75E: LATIN CAPITAL LETTER V WITH DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+A75E: LATIN CAPITAL LETTER V WITH DIAGONAL STROKE 
+	TokenNamePLUS	
"Ꝩ"	TokenNameStringLiteral	Ꝩ
// U+A768: LATIN CAPITAL LETTER VEND 	TokenNameCOMMENT_LINE	U+A768: LATIN CAPITAL LETTER VEND 
+	TokenNamePLUS	
"Ｖ"	TokenNameStringLiteral	Ｖ
// U+FF36: FULLWIDTH LATIN CAPITAL LETTER V 	TokenNameCOMMENT_LINE	U+FF36: FULLWIDTH LATIN CAPITAL LETTER V 
,	TokenNameCOMMA	
"V"	TokenNameStringLiteral	V
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ʋ"	TokenNameStringLiteral	ʋ
// U+028B: LATIN SMALL LETTER V WITH HOOK 	TokenNameCOMMENT_LINE	U+028B: LATIN SMALL LETTER V WITH HOOK 
+	TokenNamePLUS	
"ʌ"	TokenNameStringLiteral	ʌ
// U+028C: LATIN SMALL LETTER TURNED V 	TokenNameCOMMENT_LINE	U+028C: LATIN SMALL LETTER TURNED V 
+	TokenNamePLUS	
"ᵥ"	TokenNameStringLiteral	ᵥ
// U+1D65: LATIN SUBSCRIPT SMALL LETTER V 	TokenNameCOMMENT_LINE	U+1D65: LATIN SUBSCRIPT SMALL LETTER V 
+	TokenNamePLUS	
"ᶌ"	TokenNameStringLiteral	ᶌ
// U+1D8C: LATIN SMALL LETTER V WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D8C: LATIN SMALL LETTER V WITH PALATAL HOOK 
+	TokenNamePLUS	
"ṽ"	TokenNameStringLiteral	ṽ
// U+1E7D: LATIN SMALL LETTER V WITH TILDE 	TokenNameCOMMENT_LINE	U+1E7D: LATIN SMALL LETTER V WITH TILDE 
+	TokenNamePLUS	
"ṿ"	TokenNameStringLiteral	ṿ
// U+1E7F: LATIN SMALL LETTER V WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E7F: LATIN SMALL LETTER V WITH DOT BELOW 
+	TokenNamePLUS	
"ⓥ"	TokenNameStringLiteral	ⓥ
// U+24E5: CIRCLED LATIN SMALL LETTER V 	TokenNameCOMMENT_LINE	U+24E5: CIRCLED LATIN SMALL LETTER V 
+	TokenNamePLUS	
"ⱱ"	TokenNameStringLiteral	ⱱ
// U+2C71: LATIN SMALL LETTER V WITH RIGHT HOOK 	TokenNameCOMMENT_LINE	U+2C71: LATIN SMALL LETTER V WITH RIGHT HOOK 
+	TokenNamePLUS	
"ⱴ"	TokenNameStringLiteral	ⱴ
// U+2C74: LATIN SMALL LETTER V WITH CURL 	TokenNameCOMMENT_LINE	U+2C74: LATIN SMALL LETTER V WITH CURL 
+	TokenNamePLUS	
"ꝟ"	TokenNameStringLiteral	ꝟ
// U+A75F: LATIN SMALL LETTER V WITH DIAGONAL STROKE 	TokenNameCOMMENT_LINE	U+A75F: LATIN SMALL LETTER V WITH DIAGONAL STROKE 
+	TokenNamePLUS	
"ｖ"	TokenNameStringLiteral	ｖ
// U+FF56: FULLWIDTH LATIN SMALL LETTER V 	TokenNameCOMMENT_LINE	U+FF56: FULLWIDTH LATIN SMALL LETTER V 
,	TokenNameCOMMA	
"v"	TokenNameStringLiteral	v
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ꝡ"	TokenNameStringLiteral	Ꝡ
// U+A760: LATIN CAPITAL LETTER VY 	TokenNameCOMMENT_LINE	U+A760: LATIN CAPITAL LETTER VY 
,	TokenNameCOMMA	
"VY"	TokenNameStringLiteral	VY
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒱"	TokenNameStringLiteral	⒱
// U+24B1: PARENTHESIZED LATIN SMALL LETTER V 	TokenNameCOMMENT_LINE	U+24B1: PARENTHESIZED LATIN SMALL LETTER V 
,	TokenNameCOMMA	
"(v)"	TokenNameStringLiteral	(v)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ꝡ"	TokenNameStringLiteral	ꝡ
// U+A761: LATIN SMALL LETTER VY 	TokenNameCOMMENT_LINE	U+A761: LATIN SMALL LETTER VY 
,	TokenNameCOMMA	
"vy"	TokenNameStringLiteral	vy
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ŵ"	TokenNameStringLiteral	Ŵ
// U+0174: LATIN CAPITAL LETTER W WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0174: LATIN CAPITAL LETTER W WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ƿ"	TokenNameStringLiteral	Ƿ
// U+01F7: LATIN CAPITAL LETTER WYNN 	TokenNameCOMMENT_LINE	U+01F7: LATIN CAPITAL LETTER WYNN 
+	TokenNamePLUS	
"ᴡ"	TokenNameStringLiteral	ᴡ
// U+1D21: LATIN LETTER SMALL CAPITAL W 	TokenNameCOMMENT_LINE	U+1D21: LATIN LETTER SMALL CAPITAL W 
+	TokenNamePLUS	
"Ẁ"	TokenNameStringLiteral	Ẁ
// U+1E80: LATIN CAPITAL LETTER W WITH GRAVE 	TokenNameCOMMENT_LINE	U+1E80: LATIN CAPITAL LETTER W WITH GRAVE 
+	TokenNamePLUS	
"Ẃ"	TokenNameStringLiteral	Ẃ
// U+1E82: LATIN CAPITAL LETTER W WITH ACUTE 	TokenNameCOMMENT_LINE	U+1E82: LATIN CAPITAL LETTER W WITH ACUTE 
+	TokenNamePLUS	
"Ẅ"	TokenNameStringLiteral	Ẅ
// U+1E84: LATIN CAPITAL LETTER W WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+1E84: LATIN CAPITAL LETTER W WITH DIAERESIS 
+	TokenNamePLUS	
"Ẇ"	TokenNameStringLiteral	Ẇ
// U+1E86: LATIN CAPITAL LETTER W WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E86: LATIN CAPITAL LETTER W WITH DOT ABOVE 
+	TokenNamePLUS	
"Ẉ"	TokenNameStringLiteral	Ẉ
// U+1E88: LATIN CAPITAL LETTER W WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E88: LATIN CAPITAL LETTER W WITH DOT BELOW 
+	TokenNamePLUS	
"Ⓦ"	TokenNameStringLiteral	Ⓦ
// U+24CC: CIRCLED LATIN CAPITAL LETTER W 	TokenNameCOMMENT_LINE	U+24CC: CIRCLED LATIN CAPITAL LETTER W 
+	TokenNamePLUS	
"Ⱳ"	TokenNameStringLiteral	Ⱳ
// U+2C72: LATIN CAPITAL LETTER W WITH HOOK 	TokenNameCOMMENT_LINE	U+2C72: LATIN CAPITAL LETTER W WITH HOOK 
+	TokenNamePLUS	
"Ｗ"	TokenNameStringLiteral	Ｗ
// U+FF37: FULLWIDTH LATIN CAPITAL LETTER W 	TokenNameCOMMENT_LINE	U+FF37: FULLWIDTH LATIN CAPITAL LETTER W 
,	TokenNameCOMMA	
"W"	TokenNameStringLiteral	W
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ŵ"	TokenNameStringLiteral	ŵ
// U+0175: LATIN SMALL LETTER W WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0175: LATIN SMALL LETTER W WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ƿ"	TokenNameStringLiteral	ƿ
// U+01BF: LATIN LETTER WYNN 	TokenNameCOMMENT_LINE	U+01BF: LATIN LETTER WYNN 
+	TokenNamePLUS	
"ʍ"	TokenNameStringLiteral	ʍ
// U+028D: LATIN SMALL LETTER TURNED W 	TokenNameCOMMENT_LINE	U+028D: LATIN SMALL LETTER TURNED W 
+	TokenNamePLUS	
"ẁ"	TokenNameStringLiteral	ẁ
// U+1E81: LATIN SMALL LETTER W WITH GRAVE 	TokenNameCOMMENT_LINE	U+1E81: LATIN SMALL LETTER W WITH GRAVE 
+	TokenNamePLUS	
"ẃ"	TokenNameStringLiteral	ẃ
// U+1E83: LATIN SMALL LETTER W WITH ACUTE 	TokenNameCOMMENT_LINE	U+1E83: LATIN SMALL LETTER W WITH ACUTE 
+	TokenNamePLUS	
"ẅ"	TokenNameStringLiteral	ẅ
// U+1E85: LATIN SMALL LETTER W WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+1E85: LATIN SMALL LETTER W WITH DIAERESIS 
+	TokenNamePLUS	
"ẇ"	TokenNameStringLiteral	ẇ
// U+1E87: LATIN SMALL LETTER W WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E87: LATIN SMALL LETTER W WITH DOT ABOVE 
+	TokenNamePLUS	
"ẉ"	TokenNameStringLiteral	ẉ
// U+1E89: LATIN SMALL LETTER W WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E89: LATIN SMALL LETTER W WITH DOT BELOW 
+	TokenNamePLUS	
"ẘ"	TokenNameStringLiteral	ẘ
// U+1E98: LATIN SMALL LETTER W WITH RING ABOVE 	TokenNameCOMMENT_LINE	U+1E98: LATIN SMALL LETTER W WITH RING ABOVE 
+	TokenNamePLUS	
"ⓦ"	TokenNameStringLiteral	ⓦ
// U+24E6: CIRCLED LATIN SMALL LETTER W 	TokenNameCOMMENT_LINE	U+24E6: CIRCLED LATIN SMALL LETTER W 
+	TokenNamePLUS	
"ⱳ"	TokenNameStringLiteral	ⱳ
// U+2C73: LATIN SMALL LETTER W WITH HOOK 	TokenNameCOMMENT_LINE	U+2C73: LATIN SMALL LETTER W WITH HOOK 
+	TokenNamePLUS	
"ｗ"	TokenNameStringLiteral	ｗ
// U+FF57: FULLWIDTH LATIN SMALL LETTER W 	TokenNameCOMMENT_LINE	U+FF57: FULLWIDTH LATIN SMALL LETTER W 
,	TokenNameCOMMA	
"w"	TokenNameStringLiteral	w
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒲"	TokenNameStringLiteral	⒲
// U+24B2: PARENTHESIZED LATIN SMALL LETTER W 	TokenNameCOMMENT_LINE	U+24B2: PARENTHESIZED LATIN SMALL LETTER W 
,	TokenNameCOMMA	
"(w)"	TokenNameStringLiteral	(w)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ẋ"	TokenNameStringLiteral	Ẋ
// U+1E8A: LATIN CAPITAL LETTER X WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E8A: LATIN CAPITAL LETTER X WITH DOT ABOVE 
+	TokenNamePLUS	
"Ẍ"	TokenNameStringLiteral	Ẍ
// U+1E8C: LATIN CAPITAL LETTER X WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+1E8C: LATIN CAPITAL LETTER X WITH DIAERESIS 
+	TokenNamePLUS	
"Ⓧ"	TokenNameStringLiteral	Ⓧ
// U+24CD: CIRCLED LATIN CAPITAL LETTER X 	TokenNameCOMMENT_LINE	U+24CD: CIRCLED LATIN CAPITAL LETTER X 
+	TokenNamePLUS	
"Ｘ"	TokenNameStringLiteral	Ｘ
// U+FF38: FULLWIDTH LATIN CAPITAL LETTER X 	TokenNameCOMMENT_LINE	U+FF38: FULLWIDTH LATIN CAPITAL LETTER X 
,	TokenNameCOMMA	
"X"	TokenNameStringLiteral	X
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ᶍ"	TokenNameStringLiteral	ᶍ
// U+1D8D: LATIN SMALL LETTER X WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D8D: LATIN SMALL LETTER X WITH PALATAL HOOK 
+	TokenNamePLUS	
"ẋ"	TokenNameStringLiteral	ẋ
// U+1E8B: LATIN SMALL LETTER X WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E8B: LATIN SMALL LETTER X WITH DOT ABOVE 
+	TokenNamePLUS	
"ẍ"	TokenNameStringLiteral	ẍ
// U+1E8D: LATIN SMALL LETTER X WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+1E8D: LATIN SMALL LETTER X WITH DIAERESIS 
+	TokenNamePLUS	
"ₓ"	TokenNameStringLiteral	ₓ
// U+2093: LATIN SUBSCRIPT SMALL LETTER X 	TokenNameCOMMENT_LINE	U+2093: LATIN SUBSCRIPT SMALL LETTER X 
+	TokenNamePLUS	
"ⓧ"	TokenNameStringLiteral	ⓧ
// U+24E7: CIRCLED LATIN SMALL LETTER X 	TokenNameCOMMENT_LINE	U+24E7: CIRCLED LATIN SMALL LETTER X 
+	TokenNamePLUS	
"ｘ"	TokenNameStringLiteral	ｘ
// U+FF58: FULLWIDTH LATIN SMALL LETTER X 	TokenNameCOMMENT_LINE	U+FF58: FULLWIDTH LATIN SMALL LETTER X 
,	TokenNameCOMMA	
"x"	TokenNameStringLiteral	x
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒳"	TokenNameStringLiteral	⒳
// U+24B3: PARENTHESIZED LATIN SMALL LETTER X 	TokenNameCOMMENT_LINE	U+24B3: PARENTHESIZED LATIN SMALL LETTER X 
,	TokenNameCOMMA	
"(x)"	TokenNameStringLiteral	(x)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ý"	TokenNameStringLiteral	Ý
// U+00DD: LATIN CAPITAL LETTER Y WITH ACUTE 	TokenNameCOMMENT_LINE	U+00DD: LATIN CAPITAL LETTER Y WITH ACUTE 
+	TokenNamePLUS	
"Ŷ"	TokenNameStringLiteral	Ŷ
// U+0176: LATIN CAPITAL LETTER Y WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0176: LATIN CAPITAL LETTER Y WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ÿ"	TokenNameStringLiteral	Ÿ
// U+0178: LATIN CAPITAL LETTER Y WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+0178: LATIN CAPITAL LETTER Y WITH DIAERESIS 
+	TokenNamePLUS	
"Ƴ"	TokenNameStringLiteral	Ƴ
// U+01B3: LATIN CAPITAL LETTER Y WITH HOOK 	TokenNameCOMMENT_LINE	U+01B3: LATIN CAPITAL LETTER Y WITH HOOK 
+	TokenNamePLUS	
"Ȳ"	TokenNameStringLiteral	Ȳ
// U+0232: LATIN CAPITAL LETTER Y WITH MACRON 	TokenNameCOMMENT_LINE	U+0232: LATIN CAPITAL LETTER Y WITH MACRON 
+	TokenNamePLUS	
"Ɏ"	TokenNameStringLiteral	Ɏ
// U+024E: LATIN CAPITAL LETTER Y WITH STROKE 	TokenNameCOMMENT_LINE	U+024E: LATIN CAPITAL LETTER Y WITH STROKE 
+	TokenNamePLUS	
"ʏ"	TokenNameStringLiteral	ʏ
// U+028F: LATIN LETTER SMALL CAPITAL Y 	TokenNameCOMMENT_LINE	U+028F: LATIN LETTER SMALL CAPITAL Y 
+	TokenNamePLUS	
"Ẏ"	TokenNameStringLiteral	Ẏ
// U+1E8E: LATIN CAPITAL LETTER Y WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E8E: LATIN CAPITAL LETTER Y WITH DOT ABOVE 
+	TokenNamePLUS	
"Ỳ"	TokenNameStringLiteral	Ỳ
// U+1EF2: LATIN CAPITAL LETTER Y WITH GRAVE 	TokenNameCOMMENT_LINE	U+1EF2: LATIN CAPITAL LETTER Y WITH GRAVE 
+	TokenNamePLUS	
"Ỵ"	TokenNameStringLiteral	Ỵ
// U+1EF4: LATIN CAPITAL LETTER Y WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1EF4: LATIN CAPITAL LETTER Y WITH DOT BELOW 
+	TokenNamePLUS	
"Ỷ"	TokenNameStringLiteral	Ỷ
// U+1EF6: LATIN CAPITAL LETTER Y WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EF6: LATIN CAPITAL LETTER Y WITH HOOK ABOVE 
+	TokenNamePLUS	
"Ỹ"	TokenNameStringLiteral	Ỹ
// U+1EF8: LATIN CAPITAL LETTER Y WITH TILDE 	TokenNameCOMMENT_LINE	U+1EF8: LATIN CAPITAL LETTER Y WITH TILDE 
+	TokenNamePLUS	
"Ỿ"	TokenNameStringLiteral	Ỿ
// U+1EFE: LATIN CAPITAL LETTER Y WITH LOOP 	TokenNameCOMMENT_LINE	U+1EFE: LATIN CAPITAL LETTER Y WITH LOOP 
+	TokenNamePLUS	
"Ⓨ"	TokenNameStringLiteral	Ⓨ
// U+24CE: CIRCLED LATIN CAPITAL LETTER Y 	TokenNameCOMMENT_LINE	U+24CE: CIRCLED LATIN CAPITAL LETTER Y 
+	TokenNamePLUS	
"Ｙ"	TokenNameStringLiteral	Ｙ
// U+FF39: FULLWIDTH LATIN CAPITAL LETTER Y 	TokenNameCOMMENT_LINE	U+FF39: FULLWIDTH LATIN CAPITAL LETTER Y 
,	TokenNameCOMMA	
"Y"	TokenNameStringLiteral	Y
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ý"	TokenNameStringLiteral	ý
// U+00FD: LATIN SMALL LETTER Y WITH ACUTE 	TokenNameCOMMENT_LINE	U+00FD: LATIN SMALL LETTER Y WITH ACUTE 
+	TokenNamePLUS	
"ÿ"	TokenNameStringLiteral	ÿ
// U+00FF: LATIN SMALL LETTER Y WITH DIAERESIS 	TokenNameCOMMENT_LINE	U+00FF: LATIN SMALL LETTER Y WITH DIAERESIS 
+	TokenNamePLUS	
"ŷ"	TokenNameStringLiteral	ŷ
// U+0177: LATIN SMALL LETTER Y WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+0177: LATIN SMALL LETTER Y WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ƴ"	TokenNameStringLiteral	ƴ
// U+01B4: LATIN SMALL LETTER Y WITH HOOK 	TokenNameCOMMENT_LINE	U+01B4: LATIN SMALL LETTER Y WITH HOOK 
+	TokenNamePLUS	
"ȳ"	TokenNameStringLiteral	ȳ
// U+0233: LATIN SMALL LETTER Y WITH MACRON 	TokenNameCOMMENT_LINE	U+0233: LATIN SMALL LETTER Y WITH MACRON 
+	TokenNamePLUS	
"ɏ"	TokenNameStringLiteral	ɏ
// U+024F: LATIN SMALL LETTER Y WITH STROKE 	TokenNameCOMMENT_LINE	U+024F: LATIN SMALL LETTER Y WITH STROKE 
+	TokenNamePLUS	
"ʎ"	TokenNameStringLiteral	ʎ
// U+028E: LATIN SMALL LETTER TURNED Y 	TokenNameCOMMENT_LINE	U+028E: LATIN SMALL LETTER TURNED Y 
+	TokenNamePLUS	
"ẏ"	TokenNameStringLiteral	ẏ
// U+1E8F: LATIN SMALL LETTER Y WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+1E8F: LATIN SMALL LETTER Y WITH DOT ABOVE 
+	TokenNamePLUS	
"ẙ"	TokenNameStringLiteral	ẙ
// U+1E99: LATIN SMALL LETTER Y WITH RING ABOVE 	TokenNameCOMMENT_LINE	U+1E99: LATIN SMALL LETTER Y WITH RING ABOVE 
+	TokenNamePLUS	
"ỳ"	TokenNameStringLiteral	ỳ
// U+1EF3: LATIN SMALL LETTER Y WITH GRAVE 	TokenNameCOMMENT_LINE	U+1EF3: LATIN SMALL LETTER Y WITH GRAVE 
+	TokenNamePLUS	
"ỵ"	TokenNameStringLiteral	ỵ
// U+1EF5: LATIN SMALL LETTER Y WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1EF5: LATIN SMALL LETTER Y WITH DOT BELOW 
+	TokenNamePLUS	
"ỷ"	TokenNameStringLiteral	ỷ
// U+1EF7: LATIN SMALL LETTER Y WITH HOOK ABOVE 	TokenNameCOMMENT_LINE	U+1EF7: LATIN SMALL LETTER Y WITH HOOK ABOVE 
+	TokenNamePLUS	
"ỹ"	TokenNameStringLiteral	ỹ
// U+1EF9: LATIN SMALL LETTER Y WITH TILDE 	TokenNameCOMMENT_LINE	U+1EF9: LATIN SMALL LETTER Y WITH TILDE 
+	TokenNamePLUS	
"ỿ"	TokenNameStringLiteral	ỿ
// U+1EFF: LATIN SMALL LETTER Y WITH LOOP 	TokenNameCOMMENT_LINE	U+1EFF: LATIN SMALL LETTER Y WITH LOOP 
+	TokenNamePLUS	
"ⓨ"	TokenNameStringLiteral	ⓨ
// U+24E8: CIRCLED LATIN SMALL LETTER Y 	TokenNameCOMMENT_LINE	U+24E8: CIRCLED LATIN SMALL LETTER Y 
+	TokenNamePLUS	
"ｙ"	TokenNameStringLiteral	ｙ
// U+FF59: FULLWIDTH LATIN SMALL LETTER Y 	TokenNameCOMMENT_LINE	U+FF59: FULLWIDTH LATIN SMALL LETTER Y 
,	TokenNameCOMMA	
"y"	TokenNameStringLiteral	y
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒴"	TokenNameStringLiteral	⒴
// U+24B4: PARENTHESIZED LATIN SMALL LETTER Y 	TokenNameCOMMENT_LINE	U+24B4: PARENTHESIZED LATIN SMALL LETTER Y 
,	TokenNameCOMMA	
"(y)"	TokenNameStringLiteral	(y)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"Ź"	TokenNameStringLiteral	Ź
// U+0179: LATIN CAPITAL LETTER Z WITH ACUTE 	TokenNameCOMMENT_LINE	U+0179: LATIN CAPITAL LETTER Z WITH ACUTE 
+	TokenNamePLUS	
"Ż"	TokenNameStringLiteral	Ż
// U+017B: LATIN CAPITAL LETTER Z WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+017B: LATIN CAPITAL LETTER Z WITH DOT ABOVE 
+	TokenNamePLUS	
"Ž"	TokenNameStringLiteral	Ž
// U+017D: LATIN CAPITAL LETTER Z WITH CARON 	TokenNameCOMMENT_LINE	U+017D: LATIN CAPITAL LETTER Z WITH CARON 
+	TokenNamePLUS	
"Ƶ"	TokenNameStringLiteral	Ƶ
// U+01B5: LATIN CAPITAL LETTER Z WITH STROKE 	TokenNameCOMMENT_LINE	U+01B5: LATIN CAPITAL LETTER Z WITH STROKE 
+	TokenNamePLUS	
"Ȝ"	TokenNameStringLiteral	Ȝ
// U+021C: LATIN CAPITAL LETTER YOGH 	TokenNameCOMMENT_LINE	U+021C: LATIN CAPITAL LETTER YOGH 
+	TokenNamePLUS	
"Ȥ"	TokenNameStringLiteral	Ȥ
// U+0224: LATIN CAPITAL LETTER Z WITH HOOK 	TokenNameCOMMENT_LINE	U+0224: LATIN CAPITAL LETTER Z WITH HOOK 
+	TokenNamePLUS	
"ᴢ"	TokenNameStringLiteral	ᴢ
// U+1D22: LATIN LETTER SMALL CAPITAL Z 	TokenNameCOMMENT_LINE	U+1D22: LATIN LETTER SMALL CAPITAL Z 
+	TokenNamePLUS	
"Ẑ"	TokenNameStringLiteral	Ẑ
// U+1E90: LATIN CAPITAL LETTER Z WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+1E90: LATIN CAPITAL LETTER Z WITH CIRCUMFLEX 
+	TokenNamePLUS	
"Ẓ"	TokenNameStringLiteral	Ẓ
// U+1E92: LATIN CAPITAL LETTER Z WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E92: LATIN CAPITAL LETTER Z WITH DOT BELOW 
+	TokenNamePLUS	
"Ẕ"	TokenNameStringLiteral	Ẕ
// U+1E94: LATIN CAPITAL LETTER Z WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E94: LATIN CAPITAL LETTER Z WITH LINE BELOW 
+	TokenNamePLUS	
"Ⓩ"	TokenNameStringLiteral	Ⓩ
// U+24CF: CIRCLED LATIN CAPITAL LETTER Z 	TokenNameCOMMENT_LINE	U+24CF: CIRCLED LATIN CAPITAL LETTER Z 
+	TokenNamePLUS	
"Ⱬ"	TokenNameStringLiteral	Ⱬ
// U+2C6B: LATIN CAPITAL LETTER Z WITH DESCENDER 	TokenNameCOMMENT_LINE	U+2C6B: LATIN CAPITAL LETTER Z WITH DESCENDER 
+	TokenNamePLUS	
"Ꝣ"	TokenNameStringLiteral	Ꝣ
// U+A762: LATIN CAPITAL LETTER VISIGOTHIC Z 	TokenNameCOMMENT_LINE	U+A762: LATIN CAPITAL LETTER VISIGOTHIC Z 
+	TokenNamePLUS	
"Ｚ"	TokenNameStringLiteral	Ｚ
// U+FF3A: FULLWIDTH LATIN CAPITAL LETTER Z 	TokenNameCOMMENT_LINE	U+FF3A: FULLWIDTH LATIN CAPITAL LETTER Z 
,	TokenNameCOMMA	
"Z"	TokenNameStringLiteral	Z
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"ź"	TokenNameStringLiteral	ź
// U+017A: LATIN SMALL LETTER Z WITH ACUTE 	TokenNameCOMMENT_LINE	U+017A: LATIN SMALL LETTER Z WITH ACUTE 
+	TokenNamePLUS	
"ż"	TokenNameStringLiteral	ż
// U+017C: LATIN SMALL LETTER Z WITH DOT ABOVE 	TokenNameCOMMENT_LINE	U+017C: LATIN SMALL LETTER Z WITH DOT ABOVE 
+	TokenNamePLUS	
"ž"	TokenNameStringLiteral	ž
// U+017E: LATIN SMALL LETTER Z WITH CARON 	TokenNameCOMMENT_LINE	U+017E: LATIN SMALL LETTER Z WITH CARON 
+	TokenNamePLUS	
"ƶ"	TokenNameStringLiteral	ƶ
// U+01B6: LATIN SMALL LETTER Z WITH STROKE 	TokenNameCOMMENT_LINE	U+01B6: LATIN SMALL LETTER Z WITH STROKE 
+	TokenNamePLUS	
"ȝ"	TokenNameStringLiteral	ȝ
// U+021D: LATIN SMALL LETTER YOGH 	TokenNameCOMMENT_LINE	U+021D: LATIN SMALL LETTER YOGH 
+	TokenNamePLUS	
"ȥ"	TokenNameStringLiteral	ȥ
// U+0225: LATIN SMALL LETTER Z WITH HOOK 	TokenNameCOMMENT_LINE	U+0225: LATIN SMALL LETTER Z WITH HOOK 
+	TokenNamePLUS	
"ɀ"	TokenNameStringLiteral	ɀ
// U+0240: LATIN SMALL LETTER Z WITH SWASH TAIL 	TokenNameCOMMENT_LINE	U+0240: LATIN SMALL LETTER Z WITH SWASH TAIL 
+	TokenNamePLUS	
"ʐ"	TokenNameStringLiteral	ʐ
// U+0290: LATIN SMALL LETTER Z WITH RETROFLEX HOOK 	TokenNameCOMMENT_LINE	U+0290: LATIN SMALL LETTER Z WITH RETROFLEX HOOK 
+	TokenNamePLUS	
"ʑ"	TokenNameStringLiteral	ʑ
// U+0291: LATIN SMALL LETTER Z WITH CURL 	TokenNameCOMMENT_LINE	U+0291: LATIN SMALL LETTER Z WITH CURL 
+	TokenNamePLUS	
"ᵶ"	TokenNameStringLiteral	ᵶ
// U+1D76: LATIN SMALL LETTER Z WITH MIDDLE TILDE 	TokenNameCOMMENT_LINE	U+1D76: LATIN SMALL LETTER Z WITH MIDDLE TILDE 
+	TokenNamePLUS	
"ᶎ"	TokenNameStringLiteral	ᶎ
// U+1D8E: LATIN SMALL LETTER Z WITH PALATAL HOOK 	TokenNameCOMMENT_LINE	U+1D8E: LATIN SMALL LETTER Z WITH PALATAL HOOK 
+	TokenNamePLUS	
"ẑ"	TokenNameStringLiteral	ẑ
// U+1E91: LATIN SMALL LETTER Z WITH CIRCUMFLEX 	TokenNameCOMMENT_LINE	U+1E91: LATIN SMALL LETTER Z WITH CIRCUMFLEX 
+	TokenNamePLUS	
"ẓ"	TokenNameStringLiteral	ẓ
// U+1E93: LATIN SMALL LETTER Z WITH DOT BELOW 	TokenNameCOMMENT_LINE	U+1E93: LATIN SMALL LETTER Z WITH DOT BELOW 
+	TokenNamePLUS	
"ẕ"	TokenNameStringLiteral	ẕ
// U+1E95: LATIN SMALL LETTER Z WITH LINE BELOW 	TokenNameCOMMENT_LINE	U+1E95: LATIN SMALL LETTER Z WITH LINE BELOW 
+	TokenNamePLUS	
"ⓩ"	TokenNameStringLiteral	ⓩ
// U+24E9: CIRCLED LATIN SMALL LETTER Z 	TokenNameCOMMENT_LINE	U+24E9: CIRCLED LATIN SMALL LETTER Z 
+	TokenNamePLUS	
"ⱬ"	TokenNameStringLiteral	ⱬ
// U+2C6C: LATIN SMALL LETTER Z WITH DESCENDER 	TokenNameCOMMENT_LINE	U+2C6C: LATIN SMALL LETTER Z WITH DESCENDER 
+	TokenNamePLUS	
"ꝣ"	TokenNameStringLiteral	ꝣ
// U+A763: LATIN SMALL LETTER VISIGOTHIC Z 	TokenNameCOMMENT_LINE	U+A763: LATIN SMALL LETTER VISIGOTHIC Z 
+	TokenNamePLUS	
"ｚ"	TokenNameStringLiteral	ｚ
// U+FF5A: FULLWIDTH LATIN SMALL LETTER Z 	TokenNameCOMMENT_LINE	U+FF5A: FULLWIDTH LATIN SMALL LETTER Z 
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒵"	TokenNameStringLiteral	⒵
// U+24B5: PARENTHESIZED LATIN SMALL LETTER Z 	TokenNameCOMMENT_LINE	U+24B5: PARENTHESIZED LATIN SMALL LETTER Z 
,	TokenNameCOMMA	
"(z)"	TokenNameStringLiteral	(z)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁰"	TokenNameStringLiteral	⁰
// U+2070: SUPERSCRIPT ZERO 	TokenNameCOMMENT_LINE	U+2070: SUPERSCRIPT ZERO 
+	TokenNamePLUS	
"₀"	TokenNameStringLiteral	₀
// U+2080: SUBSCRIPT ZERO 	TokenNameCOMMENT_LINE	U+2080: SUBSCRIPT ZERO 
+	TokenNamePLUS	
"⓪"	TokenNameStringLiteral	⓪
// U+24EA: CIRCLED DIGIT ZERO 	TokenNameCOMMENT_LINE	U+24EA: CIRCLED DIGIT ZERO 
+	TokenNamePLUS	
"⓿"	TokenNameStringLiteral	⓿
// U+24FF: NEGATIVE CIRCLED DIGIT ZERO 	TokenNameCOMMENT_LINE	U+24FF: NEGATIVE CIRCLED DIGIT ZERO 
+	TokenNamePLUS	
"０"	TokenNameStringLiteral	０
// U+FF10: FULLWIDTH DIGIT ZERO 	TokenNameCOMMENT_LINE	U+FF10: FULLWIDTH DIGIT ZERO 
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"¹"	TokenNameStringLiteral	¹
// U+00B9: SUPERSCRIPT ONE 	TokenNameCOMMENT_LINE	U+00B9: SUPERSCRIPT ONE 
+	TokenNamePLUS	
"₁"	TokenNameStringLiteral	₁
// U+2081: SUBSCRIPT ONE 	TokenNameCOMMENT_LINE	U+2081: SUBSCRIPT ONE 
+	TokenNamePLUS	
"①"	TokenNameStringLiteral	①
// U+2460: CIRCLED DIGIT ONE 	TokenNameCOMMENT_LINE	U+2460: CIRCLED DIGIT ONE 
+	TokenNamePLUS	
"⓵"	TokenNameStringLiteral	⓵
// U+24F5: DOUBLE CIRCLED DIGIT ONE 	TokenNameCOMMENT_LINE	U+24F5: DOUBLE CIRCLED DIGIT ONE 
+	TokenNamePLUS	
"❶"	TokenNameStringLiteral	❶
// U+2776: DINGBAT NEGATIVE CIRCLED DIGIT ONE 	TokenNameCOMMENT_LINE	U+2776: DINGBAT NEGATIVE CIRCLED DIGIT ONE 
+	TokenNamePLUS	
"➀"	TokenNameStringLiteral	➀
// U+2780: DINGBAT CIRCLED SANS-SERIF DIGIT ONE 	TokenNameCOMMENT_LINE	U+2780: DINGBAT CIRCLED SANS-SERIF DIGIT ONE 
+	TokenNamePLUS	
"➊"	TokenNameStringLiteral	➊
// U+278A: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT ONE 	TokenNameCOMMENT_LINE	U+278A: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT ONE 
+	TokenNamePLUS	
"１"	TokenNameStringLiteral	１
// U+FF11: FULLWIDTH DIGIT ONE 	TokenNameCOMMENT_LINE	U+FF11: FULLWIDTH DIGIT ONE 
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒈"	TokenNameStringLiteral	⒈
// U+2488: DIGIT ONE FULL STOP 	TokenNameCOMMENT_LINE	U+2488: DIGIT ONE FULL STOP 
,	TokenNameCOMMA	
"1."	TokenNameStringLiteral	1.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑴"	TokenNameStringLiteral	⑴
// U+2474: PARENTHESIZED DIGIT ONE 	TokenNameCOMMENT_LINE	U+2474: PARENTHESIZED DIGIT ONE 
,	TokenNameCOMMA	
"(1)"	TokenNameStringLiteral	(1)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"²"	TokenNameStringLiteral	²
// U+00B2: SUPERSCRIPT TWO 	TokenNameCOMMENT_LINE	U+00B2: SUPERSCRIPT TWO 
+	TokenNamePLUS	
"₂"	TokenNameStringLiteral	₂
// U+2082: SUBSCRIPT TWO 	TokenNameCOMMENT_LINE	U+2082: SUBSCRIPT TWO 
+	TokenNamePLUS	
"②"	TokenNameStringLiteral	②
// U+2461: CIRCLED DIGIT TWO 	TokenNameCOMMENT_LINE	U+2461: CIRCLED DIGIT TWO 
+	TokenNamePLUS	
"⓶"	TokenNameStringLiteral	⓶
// U+24F6: DOUBLE CIRCLED DIGIT TWO 	TokenNameCOMMENT_LINE	U+24F6: DOUBLE CIRCLED DIGIT TWO 
+	TokenNamePLUS	
"❷"	TokenNameStringLiteral	❷
// U+2777: DINGBAT NEGATIVE CIRCLED DIGIT TWO 	TokenNameCOMMENT_LINE	U+2777: DINGBAT NEGATIVE CIRCLED DIGIT TWO 
+	TokenNamePLUS	
"➁"	TokenNameStringLiteral	➁
// U+2781: DINGBAT CIRCLED SANS-SERIF DIGIT TWO 	TokenNameCOMMENT_LINE	U+2781: DINGBAT CIRCLED SANS-SERIF DIGIT TWO 
+	TokenNamePLUS	
"➋"	TokenNameStringLiteral	➋
// U+278B: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT TWO 	TokenNameCOMMENT_LINE	U+278B: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT TWO 
+	TokenNamePLUS	
"２"	TokenNameStringLiteral	２
// U+FF12: FULLWIDTH DIGIT TWO 	TokenNameCOMMENT_LINE	U+FF12: FULLWIDTH DIGIT TWO 
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒉"	TokenNameStringLiteral	⒉
// U+2489: DIGIT TWO FULL STOP 	TokenNameCOMMENT_LINE	U+2489: DIGIT TWO FULL STOP 
,	TokenNameCOMMA	
"2."	TokenNameStringLiteral	2.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑵"	TokenNameStringLiteral	⑵
// U+2475: PARENTHESIZED DIGIT TWO 	TokenNameCOMMENT_LINE	U+2475: PARENTHESIZED DIGIT TWO 
,	TokenNameCOMMA	
"(2)"	TokenNameStringLiteral	(2)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"³"	TokenNameStringLiteral	³
// U+00B3: SUPERSCRIPT THREE 	TokenNameCOMMENT_LINE	U+00B3: SUPERSCRIPT THREE 
+	TokenNamePLUS	
"₃"	TokenNameStringLiteral	₃
// U+2083: SUBSCRIPT THREE 	TokenNameCOMMENT_LINE	U+2083: SUBSCRIPT THREE 
+	TokenNamePLUS	
"③"	TokenNameStringLiteral	③
// U+2462: CIRCLED DIGIT THREE 	TokenNameCOMMENT_LINE	U+2462: CIRCLED DIGIT THREE 
+	TokenNamePLUS	
"⓷"	TokenNameStringLiteral	⓷
// U+24F7: DOUBLE CIRCLED DIGIT THREE 	TokenNameCOMMENT_LINE	U+24F7: DOUBLE CIRCLED DIGIT THREE 
+	TokenNamePLUS	
"❸"	TokenNameStringLiteral	❸
// U+2778: DINGBAT NEGATIVE CIRCLED DIGIT THREE 	TokenNameCOMMENT_LINE	U+2778: DINGBAT NEGATIVE CIRCLED DIGIT THREE 
+	TokenNamePLUS	
"➂"	TokenNameStringLiteral	➂
// U+2782: DINGBAT CIRCLED SANS-SERIF DIGIT THREE 	TokenNameCOMMENT_LINE	U+2782: DINGBAT CIRCLED SANS-SERIF DIGIT THREE 
+	TokenNamePLUS	
"➌"	TokenNameStringLiteral	➌
// U+278C: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT THREE 	TokenNameCOMMENT_LINE	U+278C: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT THREE 
+	TokenNamePLUS	
"３"	TokenNameStringLiteral	３
// U+FF13: FULLWIDTH DIGIT THREE 	TokenNameCOMMENT_LINE	U+FF13: FULLWIDTH DIGIT THREE 
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒊"	TokenNameStringLiteral	⒊
// U+248A: DIGIT THREE FULL STOP 	TokenNameCOMMENT_LINE	U+248A: DIGIT THREE FULL STOP 
,	TokenNameCOMMA	
"3."	TokenNameStringLiteral	3.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑶"	TokenNameStringLiteral	⑶
// U+2476: PARENTHESIZED DIGIT THREE 	TokenNameCOMMENT_LINE	U+2476: PARENTHESIZED DIGIT THREE 
,	TokenNameCOMMA	
"(3)"	TokenNameStringLiteral	(3)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁴"	TokenNameStringLiteral	⁴
// U+2074: SUPERSCRIPT FOUR 	TokenNameCOMMENT_LINE	U+2074: SUPERSCRIPT FOUR 
+	TokenNamePLUS	
"₄"	TokenNameStringLiteral	₄
// U+2084: SUBSCRIPT FOUR 	TokenNameCOMMENT_LINE	U+2084: SUBSCRIPT FOUR 
+	TokenNamePLUS	
"④"	TokenNameStringLiteral	④
// U+2463: CIRCLED DIGIT FOUR 	TokenNameCOMMENT_LINE	U+2463: CIRCLED DIGIT FOUR 
+	TokenNamePLUS	
"⓸"	TokenNameStringLiteral	⓸
// U+24F8: DOUBLE CIRCLED DIGIT FOUR 	TokenNameCOMMENT_LINE	U+24F8: DOUBLE CIRCLED DIGIT FOUR 
+	TokenNamePLUS	
"❹"	TokenNameStringLiteral	❹
// U+2779: DINGBAT NEGATIVE CIRCLED DIGIT FOUR 	TokenNameCOMMENT_LINE	U+2779: DINGBAT NEGATIVE CIRCLED DIGIT FOUR 
+	TokenNamePLUS	
"➃"	TokenNameStringLiteral	➃
// U+2783: DINGBAT CIRCLED SANS-SERIF DIGIT FOUR 	TokenNameCOMMENT_LINE	U+2783: DINGBAT CIRCLED SANS-SERIF DIGIT FOUR 
+	TokenNamePLUS	
"➍"	TokenNameStringLiteral	➍
// U+278D: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT FOUR 	TokenNameCOMMENT_LINE	U+278D: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT FOUR 
+	TokenNamePLUS	
"４"	TokenNameStringLiteral	４
// U+FF14: FULLWIDTH DIGIT FOUR 	TokenNameCOMMENT_LINE	U+FF14: FULLWIDTH DIGIT FOUR 
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒋"	TokenNameStringLiteral	⒋
// U+248B: DIGIT FOUR FULL STOP 	TokenNameCOMMENT_LINE	U+248B: DIGIT FOUR FULL STOP 
,	TokenNameCOMMA	
"4."	TokenNameStringLiteral	4.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑷"	TokenNameStringLiteral	⑷
// U+2477: PARENTHESIZED DIGIT FOUR 	TokenNameCOMMENT_LINE	U+2477: PARENTHESIZED DIGIT FOUR 
,	TokenNameCOMMA	
"(4)"	TokenNameStringLiteral	(4)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁵"	TokenNameStringLiteral	⁵
// U+2075: SUPERSCRIPT FIVE 	TokenNameCOMMENT_LINE	U+2075: SUPERSCRIPT FIVE 
+	TokenNamePLUS	
"₅"	TokenNameStringLiteral	₅
// U+2085: SUBSCRIPT FIVE 	TokenNameCOMMENT_LINE	U+2085: SUBSCRIPT FIVE 
+	TokenNamePLUS	
"⑤"	TokenNameStringLiteral	⑤
// U+2464: CIRCLED DIGIT FIVE 	TokenNameCOMMENT_LINE	U+2464: CIRCLED DIGIT FIVE 
+	TokenNamePLUS	
"⓹"	TokenNameStringLiteral	⓹
// U+24F9: DOUBLE CIRCLED DIGIT FIVE 	TokenNameCOMMENT_LINE	U+24F9: DOUBLE CIRCLED DIGIT FIVE 
+	TokenNamePLUS	
"❺"	TokenNameStringLiteral	❺
// U+277A: DINGBAT NEGATIVE CIRCLED DIGIT FIVE 	TokenNameCOMMENT_LINE	U+277A: DINGBAT NEGATIVE CIRCLED DIGIT FIVE 
+	TokenNamePLUS	
"➄"	TokenNameStringLiteral	➄
// U+2784: DINGBAT CIRCLED SANS-SERIF DIGIT FIVE 	TokenNameCOMMENT_LINE	U+2784: DINGBAT CIRCLED SANS-SERIF DIGIT FIVE 
+	TokenNamePLUS	
"➎"	TokenNameStringLiteral	➎
// U+278E: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT FIVE 	TokenNameCOMMENT_LINE	U+278E: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT FIVE 
+	TokenNamePLUS	
"５"	TokenNameStringLiteral	５
// U+FF15: FULLWIDTH DIGIT FIVE 	TokenNameCOMMENT_LINE	U+FF15: FULLWIDTH DIGIT FIVE 
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒌"	TokenNameStringLiteral	⒌
// U+248C: DIGIT FIVE FULL STOP 	TokenNameCOMMENT_LINE	U+248C: DIGIT FIVE FULL STOP 
,	TokenNameCOMMA	
"5."	TokenNameStringLiteral	5.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑸"	TokenNameStringLiteral	⑸
// U+2478: PARENTHESIZED DIGIT FIVE 	TokenNameCOMMENT_LINE	U+2478: PARENTHESIZED DIGIT FIVE 
,	TokenNameCOMMA	
"(5)"	TokenNameStringLiteral	(5)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁶"	TokenNameStringLiteral	⁶
// U+2076: SUPERSCRIPT SIX 	TokenNameCOMMENT_LINE	U+2076: SUPERSCRIPT SIX 
+	TokenNamePLUS	
"₆"	TokenNameStringLiteral	₆
// U+2086: SUBSCRIPT SIX 	TokenNameCOMMENT_LINE	U+2086: SUBSCRIPT SIX 
+	TokenNamePLUS	
"⑥"	TokenNameStringLiteral	⑥
// U+2465: CIRCLED DIGIT SIX 	TokenNameCOMMENT_LINE	U+2465: CIRCLED DIGIT SIX 
+	TokenNamePLUS	
"⓺"	TokenNameStringLiteral	⓺
// U+24FA: DOUBLE CIRCLED DIGIT SIX 	TokenNameCOMMENT_LINE	U+24FA: DOUBLE CIRCLED DIGIT SIX 
+	TokenNamePLUS	
"❻"	TokenNameStringLiteral	❻
// U+277B: DINGBAT NEGATIVE CIRCLED DIGIT SIX 	TokenNameCOMMENT_LINE	U+277B: DINGBAT NEGATIVE CIRCLED DIGIT SIX 
+	TokenNamePLUS	
"➅"	TokenNameStringLiteral	➅
// U+2785: DINGBAT CIRCLED SANS-SERIF DIGIT SIX 	TokenNameCOMMENT_LINE	U+2785: DINGBAT CIRCLED SANS-SERIF DIGIT SIX 
+	TokenNamePLUS	
"➏"	TokenNameStringLiteral	➏
// U+278F: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT SIX 	TokenNameCOMMENT_LINE	U+278F: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT SIX 
+	TokenNamePLUS	
"６"	TokenNameStringLiteral	６
// U+FF16: FULLWIDTH DIGIT SIX 	TokenNameCOMMENT_LINE	U+FF16: FULLWIDTH DIGIT SIX 
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒍"	TokenNameStringLiteral	⒍
// U+248D: DIGIT SIX FULL STOP 	TokenNameCOMMENT_LINE	U+248D: DIGIT SIX FULL STOP 
,	TokenNameCOMMA	
"6."	TokenNameStringLiteral	6.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑹"	TokenNameStringLiteral	⑹
// U+2479: PARENTHESIZED DIGIT SIX 	TokenNameCOMMENT_LINE	U+2479: PARENTHESIZED DIGIT SIX 
,	TokenNameCOMMA	
"(6)"	TokenNameStringLiteral	(6)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁷"	TokenNameStringLiteral	⁷
// U+2077: SUPERSCRIPT SEVEN 	TokenNameCOMMENT_LINE	U+2077: SUPERSCRIPT SEVEN 
+	TokenNamePLUS	
"₇"	TokenNameStringLiteral	₇
// U+2087: SUBSCRIPT SEVEN 	TokenNameCOMMENT_LINE	U+2087: SUBSCRIPT SEVEN 
+	TokenNamePLUS	
"⑦"	TokenNameStringLiteral	⑦
// U+2466: CIRCLED DIGIT SEVEN 	TokenNameCOMMENT_LINE	U+2466: CIRCLED DIGIT SEVEN 
+	TokenNamePLUS	
"⓻"	TokenNameStringLiteral	⓻
// U+24FB: DOUBLE CIRCLED DIGIT SEVEN 	TokenNameCOMMENT_LINE	U+24FB: DOUBLE CIRCLED DIGIT SEVEN 
+	TokenNamePLUS	
"❼"	TokenNameStringLiteral	❼
// U+277C: DINGBAT NEGATIVE CIRCLED DIGIT SEVEN 	TokenNameCOMMENT_LINE	U+277C: DINGBAT NEGATIVE CIRCLED DIGIT SEVEN 
+	TokenNamePLUS	
"➆"	TokenNameStringLiteral	➆
// U+2786: DINGBAT CIRCLED SANS-SERIF DIGIT SEVEN 	TokenNameCOMMENT_LINE	U+2786: DINGBAT CIRCLED SANS-SERIF DIGIT SEVEN 
+	TokenNamePLUS	
"➐"	TokenNameStringLiteral	➐
// U+2790: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT SEVEN 	TokenNameCOMMENT_LINE	U+2790: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT SEVEN 
+	TokenNamePLUS	
"７"	TokenNameStringLiteral	７
// U+FF17: FULLWIDTH DIGIT SEVEN 	TokenNameCOMMENT_LINE	U+FF17: FULLWIDTH DIGIT SEVEN 
,	TokenNameCOMMA	
"7"	TokenNameStringLiteral	7
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒎"	TokenNameStringLiteral	⒎
// U+248E: DIGIT SEVEN FULL STOP 	TokenNameCOMMENT_LINE	U+248E: DIGIT SEVEN FULL STOP 
,	TokenNameCOMMA	
"7."	TokenNameStringLiteral	7.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑺"	TokenNameStringLiteral	⑺
// U+247A: PARENTHESIZED DIGIT SEVEN 	TokenNameCOMMENT_LINE	U+247A: PARENTHESIZED DIGIT SEVEN 
,	TokenNameCOMMA	
"(7)"	TokenNameStringLiteral	(7)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁸"	TokenNameStringLiteral	⁸
// U+2078: SUPERSCRIPT EIGHT 	TokenNameCOMMENT_LINE	U+2078: SUPERSCRIPT EIGHT 
+	TokenNamePLUS	
"₈"	TokenNameStringLiteral	₈
// U+2088: SUBSCRIPT EIGHT 	TokenNameCOMMENT_LINE	U+2088: SUBSCRIPT EIGHT 
+	TokenNamePLUS	
"⑧"	TokenNameStringLiteral	⑧
// U+2467: CIRCLED DIGIT EIGHT 	TokenNameCOMMENT_LINE	U+2467: CIRCLED DIGIT EIGHT 
+	TokenNamePLUS	
"⓼"	TokenNameStringLiteral	⓼
// U+24FC: DOUBLE CIRCLED DIGIT EIGHT 	TokenNameCOMMENT_LINE	U+24FC: DOUBLE CIRCLED DIGIT EIGHT 
+	TokenNamePLUS	
"❽"	TokenNameStringLiteral	❽
// U+277D: DINGBAT NEGATIVE CIRCLED DIGIT EIGHT 	TokenNameCOMMENT_LINE	U+277D: DINGBAT NEGATIVE CIRCLED DIGIT EIGHT 
+	TokenNamePLUS	
"➇"	TokenNameStringLiteral	➇
// U+2787: DINGBAT CIRCLED SANS-SERIF DIGIT EIGHT 	TokenNameCOMMENT_LINE	U+2787: DINGBAT CIRCLED SANS-SERIF DIGIT EIGHT 
+	TokenNamePLUS	
"➑"	TokenNameStringLiteral	➑
// U+2791: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT EIGHT 	TokenNameCOMMENT_LINE	U+2791: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT EIGHT 
+	TokenNamePLUS	
"８"	TokenNameStringLiteral	８
// U+FF18: FULLWIDTH DIGIT EIGHT 	TokenNameCOMMENT_LINE	U+FF18: FULLWIDTH DIGIT EIGHT 
,	TokenNameCOMMA	
"8"	TokenNameStringLiteral	8
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒏"	TokenNameStringLiteral	⒏
// U+248F: DIGIT EIGHT FULL STOP 	TokenNameCOMMENT_LINE	U+248F: DIGIT EIGHT FULL STOP 
,	TokenNameCOMMA	
"8."	TokenNameStringLiteral	8.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑻"	TokenNameStringLiteral	⑻
// U+247B: PARENTHESIZED DIGIT EIGHT 	TokenNameCOMMENT_LINE	U+247B: PARENTHESIZED DIGIT EIGHT 
,	TokenNameCOMMA	
"(8)"	TokenNameStringLiteral	(8)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁹"	TokenNameStringLiteral	⁹
// U+2079: SUPERSCRIPT NINE 	TokenNameCOMMENT_LINE	U+2079: SUPERSCRIPT NINE 
+	TokenNamePLUS	
"₉"	TokenNameStringLiteral	₉
// U+2089: SUBSCRIPT NINE 	TokenNameCOMMENT_LINE	U+2089: SUBSCRIPT NINE 
+	TokenNamePLUS	
"⑨"	TokenNameStringLiteral	⑨
// U+2468: CIRCLED DIGIT NINE 	TokenNameCOMMENT_LINE	U+2468: CIRCLED DIGIT NINE 
+	TokenNamePLUS	
"⓽"	TokenNameStringLiteral	⓽
// U+24FD: DOUBLE CIRCLED DIGIT NINE 	TokenNameCOMMENT_LINE	U+24FD: DOUBLE CIRCLED DIGIT NINE 
+	TokenNamePLUS	
"❾"	TokenNameStringLiteral	❾
// U+277E: DINGBAT NEGATIVE CIRCLED DIGIT NINE 	TokenNameCOMMENT_LINE	U+277E: DINGBAT NEGATIVE CIRCLED DIGIT NINE 
+	TokenNamePLUS	
"➈"	TokenNameStringLiteral	➈
// U+2788: DINGBAT CIRCLED SANS-SERIF DIGIT NINE 	TokenNameCOMMENT_LINE	U+2788: DINGBAT CIRCLED SANS-SERIF DIGIT NINE 
+	TokenNamePLUS	
"➒"	TokenNameStringLiteral	➒
// U+2792: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT NINE 	TokenNameCOMMENT_LINE	U+2792: DINGBAT NEGATIVE CIRCLED SANS-SERIF DIGIT NINE 
+	TokenNamePLUS	
"９"	TokenNameStringLiteral	９
// U+FF19: FULLWIDTH DIGIT NINE 	TokenNameCOMMENT_LINE	U+FF19: FULLWIDTH DIGIT NINE 
,	TokenNameCOMMA	
"9"	TokenNameStringLiteral	9
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒐"	TokenNameStringLiteral	⒐
// U+2490: DIGIT NINE FULL STOP 	TokenNameCOMMENT_LINE	U+2490: DIGIT NINE FULL STOP 
,	TokenNameCOMMA	
"9."	TokenNameStringLiteral	9.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑼"	TokenNameStringLiteral	⑼
// U+247C: PARENTHESIZED DIGIT NINE 	TokenNameCOMMENT_LINE	U+247C: PARENTHESIZED DIGIT NINE 
,	TokenNameCOMMA	
"(9)"	TokenNameStringLiteral	(9)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑩"	TokenNameStringLiteral	⑩
// U+2469: CIRCLED NUMBER TEN 	TokenNameCOMMENT_LINE	U+2469: CIRCLED NUMBER TEN 
+	TokenNamePLUS	
"⓾"	TokenNameStringLiteral	⓾
// U+24FE: DOUBLE CIRCLED NUMBER TEN 	TokenNameCOMMENT_LINE	U+24FE: DOUBLE CIRCLED NUMBER TEN 
+	TokenNamePLUS	
"❿"	TokenNameStringLiteral	❿
// U+277F: DINGBAT NEGATIVE CIRCLED NUMBER TEN 	TokenNameCOMMENT_LINE	U+277F: DINGBAT NEGATIVE CIRCLED NUMBER TEN 
+	TokenNamePLUS	
"➉"	TokenNameStringLiteral	➉
// U+2789: DINGBAT CIRCLED SANS-SERIF NUMBER TEN 	TokenNameCOMMENT_LINE	U+2789: DINGBAT CIRCLED SANS-SERIF NUMBER TEN 
+	TokenNamePLUS	
"➓"	TokenNameStringLiteral	➓
// U+2793: DINGBAT NEGATIVE CIRCLED SANS-SERIF NUMBER TEN 	TokenNameCOMMENT_LINE	U+2793: DINGBAT NEGATIVE CIRCLED SANS-SERIF NUMBER TEN 
,	TokenNameCOMMA	
"10"	TokenNameStringLiteral	10
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒑"	TokenNameStringLiteral	⒑
// U+2491: NUMBER TEN FULL STOP 	TokenNameCOMMENT_LINE	U+2491: NUMBER TEN FULL STOP 
,	TokenNameCOMMA	
"10."	TokenNameStringLiteral	10.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑽"	TokenNameStringLiteral	⑽
// U+247D: PARENTHESIZED NUMBER TEN 	TokenNameCOMMENT_LINE	U+247D: PARENTHESIZED NUMBER TEN 
,	TokenNameCOMMA	
"(10)"	TokenNameStringLiteral	(10)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑪"	TokenNameStringLiteral	⑪
// U+246A: CIRCLED NUMBER ELEVEN 	TokenNameCOMMENT_LINE	U+246A: CIRCLED NUMBER ELEVEN 
+	TokenNamePLUS	
"⓫"	TokenNameStringLiteral	⓫
// U+24EB: NEGATIVE CIRCLED NUMBER ELEVEN 	TokenNameCOMMENT_LINE	U+24EB: NEGATIVE CIRCLED NUMBER ELEVEN 
,	TokenNameCOMMA	
"11"	TokenNameStringLiteral	11
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒒"	TokenNameStringLiteral	⒒
// U+2492: NUMBER ELEVEN FULL STOP 	TokenNameCOMMENT_LINE	U+2492: NUMBER ELEVEN FULL STOP 
,	TokenNameCOMMA	
"11."	TokenNameStringLiteral	11.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑾"	TokenNameStringLiteral	⑾
// U+247E: PARENTHESIZED NUMBER ELEVEN 	TokenNameCOMMENT_LINE	U+247E: PARENTHESIZED NUMBER ELEVEN 
,	TokenNameCOMMA	
"(11)"	TokenNameStringLiteral	(11)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑫"	TokenNameStringLiteral	⑫
// U+246B: CIRCLED NUMBER TWELVE 	TokenNameCOMMENT_LINE	U+246B: CIRCLED NUMBER TWELVE 
+	TokenNamePLUS	
"⓬"	TokenNameStringLiteral	⓬
// U+24EC: NEGATIVE CIRCLED NUMBER TWELVE 	TokenNameCOMMENT_LINE	U+24EC: NEGATIVE CIRCLED NUMBER TWELVE 
,	TokenNameCOMMA	
"12"	TokenNameStringLiteral	12
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒓"	TokenNameStringLiteral	⒓
// U+2493: NUMBER TWELVE FULL STOP 	TokenNameCOMMENT_LINE	U+2493: NUMBER TWELVE FULL STOP 
,	TokenNameCOMMA	
"12."	TokenNameStringLiteral	12.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑿"	TokenNameStringLiteral	⑿
// U+247F: PARENTHESIZED NUMBER TWELVE 	TokenNameCOMMENT_LINE	U+247F: PARENTHESIZED NUMBER TWELVE 
,	TokenNameCOMMA	
"(12)"	TokenNameStringLiteral	(12)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑬"	TokenNameStringLiteral	⑬
// U+246C: CIRCLED NUMBER THIRTEEN 	TokenNameCOMMENT_LINE	U+246C: CIRCLED NUMBER THIRTEEN 
+	TokenNamePLUS	
"⓭"	TokenNameStringLiteral	⓭
// U+24ED: NEGATIVE CIRCLED NUMBER THIRTEEN 	TokenNameCOMMENT_LINE	U+24ED: NEGATIVE CIRCLED NUMBER THIRTEEN 
,	TokenNameCOMMA	
"13"	TokenNameStringLiteral	13
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒔"	TokenNameStringLiteral	⒔
// U+2494: NUMBER THIRTEEN FULL STOP 	TokenNameCOMMENT_LINE	U+2494: NUMBER THIRTEEN FULL STOP 
,	TokenNameCOMMA	
"13."	TokenNameStringLiteral	13.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒀"	TokenNameStringLiteral	⒀
// U+2480: PARENTHESIZED NUMBER THIRTEEN 	TokenNameCOMMENT_LINE	U+2480: PARENTHESIZED NUMBER THIRTEEN 
,	TokenNameCOMMA	
"(13)"	TokenNameStringLiteral	(13)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑭"	TokenNameStringLiteral	⑭
// U+246D: CIRCLED NUMBER FOURTEEN 	TokenNameCOMMENT_LINE	U+246D: CIRCLED NUMBER FOURTEEN 
+	TokenNamePLUS	
"⓮"	TokenNameStringLiteral	⓮
// U+24EE: NEGATIVE CIRCLED NUMBER FOURTEEN 	TokenNameCOMMENT_LINE	U+24EE: NEGATIVE CIRCLED NUMBER FOURTEEN 
,	TokenNameCOMMA	
"14"	TokenNameStringLiteral	14
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒕"	TokenNameStringLiteral	⒕
// U+2495: NUMBER FOURTEEN FULL STOP 	TokenNameCOMMENT_LINE	U+2495: NUMBER FOURTEEN FULL STOP 
,	TokenNameCOMMA	
"14."	TokenNameStringLiteral	14.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒁"	TokenNameStringLiteral	⒁
// U+2481: PARENTHESIZED NUMBER FOURTEEN 	TokenNameCOMMENT_LINE	U+2481: PARENTHESIZED NUMBER FOURTEEN 
,	TokenNameCOMMA	
"(14)"	TokenNameStringLiteral	(14)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑮"	TokenNameStringLiteral	⑮
// U+246E: CIRCLED NUMBER FIFTEEN 	TokenNameCOMMENT_LINE	U+246E: CIRCLED NUMBER FIFTEEN 
+	TokenNamePLUS	
"⓯"	TokenNameStringLiteral	⓯
// U+24EF: NEGATIVE CIRCLED NUMBER FIFTEEN 	TokenNameCOMMENT_LINE	U+24EF: NEGATIVE CIRCLED NUMBER FIFTEEN 
,	TokenNameCOMMA	
"15"	TokenNameStringLiteral	15
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒖"	TokenNameStringLiteral	⒖
// U+2496: NUMBER FIFTEEN FULL STOP 	TokenNameCOMMENT_LINE	U+2496: NUMBER FIFTEEN FULL STOP 
,	TokenNameCOMMA	
"15."	TokenNameStringLiteral	15.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒂"	TokenNameStringLiteral	⒂
// U+2482: PARENTHESIZED NUMBER FIFTEEN 	TokenNameCOMMENT_LINE	U+2482: PARENTHESIZED NUMBER FIFTEEN 
,	TokenNameCOMMA	
"(15)"	TokenNameStringLiteral	(15)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑯"	TokenNameStringLiteral	⑯
// U+246F: CIRCLED NUMBER SIXTEEN 	TokenNameCOMMENT_LINE	U+246F: CIRCLED NUMBER SIXTEEN 
+	TokenNamePLUS	
"⓰"	TokenNameStringLiteral	⓰
// U+24F0: NEGATIVE CIRCLED NUMBER SIXTEEN 	TokenNameCOMMENT_LINE	U+24F0: NEGATIVE CIRCLED NUMBER SIXTEEN 
,	TokenNameCOMMA	
"16"	TokenNameStringLiteral	16
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒗"	TokenNameStringLiteral	⒗
// U+2497: NUMBER SIXTEEN FULL STOP 	TokenNameCOMMENT_LINE	U+2497: NUMBER SIXTEEN FULL STOP 
,	TokenNameCOMMA	
"16."	TokenNameStringLiteral	16.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒃"	TokenNameStringLiteral	⒃
// U+2483: PARENTHESIZED NUMBER SIXTEEN 	TokenNameCOMMENT_LINE	U+2483: PARENTHESIZED NUMBER SIXTEEN 
,	TokenNameCOMMA	
"(16)"	TokenNameStringLiteral	(16)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑰"	TokenNameStringLiteral	⑰
// U+2470: CIRCLED NUMBER SEVENTEEN 	TokenNameCOMMENT_LINE	U+2470: CIRCLED NUMBER SEVENTEEN 
+	TokenNamePLUS	
"⓱"	TokenNameStringLiteral	⓱
// U+24F1: NEGATIVE CIRCLED NUMBER SEVENTEEN 	TokenNameCOMMENT_LINE	U+24F1: NEGATIVE CIRCLED NUMBER SEVENTEEN 
,	TokenNameCOMMA	
"17"	TokenNameStringLiteral	17
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒘"	TokenNameStringLiteral	⒘
// U+2498: NUMBER SEVENTEEN FULL STOP 	TokenNameCOMMENT_LINE	U+2498: NUMBER SEVENTEEN FULL STOP 
,	TokenNameCOMMA	
"17."	TokenNameStringLiteral	17.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒄"	TokenNameStringLiteral	⒄
// U+2484: PARENTHESIZED NUMBER SEVENTEEN 	TokenNameCOMMENT_LINE	U+2484: PARENTHESIZED NUMBER SEVENTEEN 
,	TokenNameCOMMA	
"(17)"	TokenNameStringLiteral	(17)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑱"	TokenNameStringLiteral	⑱
// U+2471: CIRCLED NUMBER EIGHTEEN 	TokenNameCOMMENT_LINE	U+2471: CIRCLED NUMBER EIGHTEEN 
+	TokenNamePLUS	
"⓲"	TokenNameStringLiteral	⓲
// U+24F2: NEGATIVE CIRCLED NUMBER EIGHTEEN 	TokenNameCOMMENT_LINE	U+24F2: NEGATIVE CIRCLED NUMBER EIGHTEEN 
,	TokenNameCOMMA	
"18"	TokenNameStringLiteral	18
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒙"	TokenNameStringLiteral	⒙
// U+2499: NUMBER EIGHTEEN FULL STOP 	TokenNameCOMMENT_LINE	U+2499: NUMBER EIGHTEEN FULL STOP 
,	TokenNameCOMMA	
"18."	TokenNameStringLiteral	18.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒅"	TokenNameStringLiteral	⒅
// U+2485: PARENTHESIZED NUMBER EIGHTEEN 	TokenNameCOMMENT_LINE	U+2485: PARENTHESIZED NUMBER EIGHTEEN 
,	TokenNameCOMMA	
"(18)"	TokenNameStringLiteral	(18)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑲"	TokenNameStringLiteral	⑲
// U+2472: CIRCLED NUMBER NINETEEN 	TokenNameCOMMENT_LINE	U+2472: CIRCLED NUMBER NINETEEN 
+	TokenNamePLUS	
"⓳"	TokenNameStringLiteral	⓳
// U+24F3: NEGATIVE CIRCLED NUMBER NINETEEN 	TokenNameCOMMENT_LINE	U+24F3: NEGATIVE CIRCLED NUMBER NINETEEN 
,	TokenNameCOMMA	
"19"	TokenNameStringLiteral	19
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒚"	TokenNameStringLiteral	⒚
// U+249A: NUMBER NINETEEN FULL STOP 	TokenNameCOMMENT_LINE	U+249A: NUMBER NINETEEN FULL STOP 
,	TokenNameCOMMA	
"19."	TokenNameStringLiteral	19.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒆"	TokenNameStringLiteral	⒆
// U+2486: PARENTHESIZED NUMBER NINETEEN 	TokenNameCOMMENT_LINE	U+2486: PARENTHESIZED NUMBER NINETEEN 
,	TokenNameCOMMA	
"(19)"	TokenNameStringLiteral	(19)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⑳"	TokenNameStringLiteral	⑳
// U+2473: CIRCLED NUMBER TWENTY 	TokenNameCOMMENT_LINE	U+2473: CIRCLED NUMBER TWENTY 
+	TokenNamePLUS	
"⓴"	TokenNameStringLiteral	⓴
// U+24F4: NEGATIVE CIRCLED NUMBER TWENTY 	TokenNameCOMMENT_LINE	U+24F4: NEGATIVE CIRCLED NUMBER TWENTY 
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒛"	TokenNameStringLiteral	⒛
// U+249B: NUMBER TWENTY FULL STOP 	TokenNameCOMMENT_LINE	U+249B: NUMBER TWENTY FULL STOP 
,	TokenNameCOMMA	
"20."	TokenNameStringLiteral	20.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⒇"	TokenNameStringLiteral	⒇
// U+2487: PARENTHESIZED NUMBER TWENTY 	TokenNameCOMMENT_LINE	U+2487: PARENTHESIZED NUMBER TWENTY 
,	TokenNameCOMMA	
"(20)"	TokenNameStringLiteral	(20)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"«"	TokenNameStringLiteral	«
// U+00AB: LEFT-POINTING DOUBLE ANGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	U+00AB: LEFT-POINTING DOUBLE ANGLE QUOTATION MARK 
+	TokenNamePLUS	
"»"	TokenNameStringLiteral	»
// U+00BB: RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	U+00BB: RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK 
+	TokenNamePLUS	
"“"	TokenNameStringLiteral	“
// U+201C: LEFT DOUBLE QUOTATION MARK 	TokenNameCOMMENT_LINE	U+201C: LEFT DOUBLE QUOTATION MARK 
+	TokenNamePLUS	
"”"	TokenNameStringLiteral	”
// U+201D: RIGHT DOUBLE QUOTATION MARK 	TokenNameCOMMENT_LINE	U+201D: RIGHT DOUBLE QUOTATION MARK 
+	TokenNamePLUS	
"„"	TokenNameStringLiteral	„
// U+201E: DOUBLE LOW-9 QUOTATION MARK 	TokenNameCOMMENT_LINE	U+201E: DOUBLE LOW-9 QUOTATION MARK 
+	TokenNamePLUS	
"″"	TokenNameStringLiteral	″
// U+2033: DOUBLE PRIME 	TokenNameCOMMENT_LINE	U+2033: DOUBLE PRIME 
+	TokenNamePLUS	
"‶"	TokenNameStringLiteral	‶
// U+2036: REVERSED DOUBLE PRIME 	TokenNameCOMMENT_LINE	U+2036: REVERSED DOUBLE PRIME 
+	TokenNamePLUS	
"❝"	TokenNameStringLiteral	❝
// U+275D: HEAVY DOUBLE TURNED COMMA QUOTATION MARK ORNAMENT 	TokenNameCOMMENT_LINE	U+275D: HEAVY DOUBLE TURNED COMMA QUOTATION MARK ORNAMENT 
+	TokenNamePLUS	
"❞"	TokenNameStringLiteral	❞
// U+275E: HEAVY DOUBLE COMMA QUOTATION MARK ORNAMENT 	TokenNameCOMMENT_LINE	U+275E: HEAVY DOUBLE COMMA QUOTATION MARK ORNAMENT 
+	TokenNamePLUS	
"❮"	TokenNameStringLiteral	❮
// U+276E: HEAVY LEFT-POINTING ANGLE QUOTATION MARK ORNAMENT 	TokenNameCOMMENT_LINE	U+276E: HEAVY LEFT-POINTING ANGLE QUOTATION MARK ORNAMENT 
+	TokenNamePLUS	
"❯"	TokenNameStringLiteral	❯
// U+276F: HEAVY RIGHT-POINTING ANGLE QUOTATION MARK ORNAMENT 	TokenNameCOMMENT_LINE	U+276F: HEAVY RIGHT-POINTING ANGLE QUOTATION MARK ORNAMENT 
+	TokenNamePLUS	
"＂"	TokenNameStringLiteral	＂
// U+FF02: FULLWIDTH QUOTATION MARK 	TokenNameCOMMENT_LINE	U+FF02: FULLWIDTH QUOTATION MARK 
,	TokenNameCOMMA	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"‘"	TokenNameStringLiteral	‘
// U+2018: LEFT SINGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	U+2018: LEFT SINGLE QUOTATION MARK 
+	TokenNamePLUS	
"’"	TokenNameStringLiteral	’
// U+2019: RIGHT SINGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	U+2019: RIGHT SINGLE QUOTATION MARK 
+	TokenNamePLUS	
"‚"	TokenNameStringLiteral	‚
// U+201A: SINGLE LOW-9 QUOTATION MARK 	TokenNameCOMMENT_LINE	U+201A: SINGLE LOW-9 QUOTATION MARK 
+	TokenNamePLUS	
"‛"	TokenNameStringLiteral	‛
// U+201B: SINGLE HIGH-REVERSED-9 QUOTATION MARK 	TokenNameCOMMENT_LINE	U+201B: SINGLE HIGH-REVERSED-9 QUOTATION MARK 
+	TokenNamePLUS	
"′"	TokenNameStringLiteral	′
// U+2032: PRIME 	TokenNameCOMMENT_LINE	U+2032: PRIME 
+	TokenNamePLUS	
"‵"	TokenNameStringLiteral	‵
// U+2035: REVERSED PRIME 	TokenNameCOMMENT_LINE	U+2035: REVERSED PRIME 
+	TokenNamePLUS	
"‹"	TokenNameStringLiteral	‹
// U+2039: SINGLE LEFT-POINTING ANGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	U+2039: SINGLE LEFT-POINTING ANGLE QUOTATION MARK 
+	TokenNamePLUS	
"›"	TokenNameStringLiteral	›
// U+203A: SINGLE RIGHT-POINTING ANGLE QUOTATION MARK 	TokenNameCOMMENT_LINE	U+203A: SINGLE RIGHT-POINTING ANGLE QUOTATION MARK 
+	TokenNamePLUS	
"❛"	TokenNameStringLiteral	❛
// U+275B: HEAVY SINGLE TURNED COMMA QUOTATION MARK ORNAMENT 	TokenNameCOMMENT_LINE	U+275B: HEAVY SINGLE TURNED COMMA QUOTATION MARK ORNAMENT 
+	TokenNamePLUS	
"❜"	TokenNameStringLiteral	❜
// U+275C: HEAVY SINGLE COMMA QUOTATION MARK ORNAMENT 	TokenNameCOMMENT_LINE	U+275C: HEAVY SINGLE COMMA QUOTATION MARK ORNAMENT 
+	TokenNamePLUS	
"＇"	TokenNameStringLiteral	＇
// U+FF07: FULLWIDTH APOSTROPHE 	TokenNameCOMMENT_LINE	U+FF07: FULLWIDTH APOSTROPHE 
,	TokenNameCOMMA	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"‐"	TokenNameStringLiteral	‐
// U+2010: HYPHEN 	TokenNameCOMMENT_LINE	U+2010: HYPHEN 
+	TokenNamePLUS	
"‑"	TokenNameStringLiteral	‑
// U+2011: NON-BREAKING HYPHEN 	TokenNameCOMMENT_LINE	U+2011: NON-BREAKING HYPHEN 
+	TokenNamePLUS	
"‒"	TokenNameStringLiteral	‒
// U+2012: FIGURE DASH 	TokenNameCOMMENT_LINE	U+2012: FIGURE DASH 
+	TokenNamePLUS	
"–"	TokenNameStringLiteral	–
// U+2013: EN DASH 	TokenNameCOMMENT_LINE	U+2013: EN DASH 
+	TokenNamePLUS	
"—"	TokenNameStringLiteral	—
// U+2014: EM DASH 	TokenNameCOMMENT_LINE	U+2014: EM DASH 
+	TokenNamePLUS	
"⁻"	TokenNameStringLiteral	⁻
// U+207B: SUPERSCRIPT MINUS 	TokenNameCOMMENT_LINE	U+207B: SUPERSCRIPT MINUS 
+	TokenNamePLUS	
"₋"	TokenNameStringLiteral	₋
// U+208B: SUBSCRIPT MINUS 	TokenNameCOMMENT_LINE	U+208B: SUBSCRIPT MINUS 
+	TokenNamePLUS	
"－"	TokenNameStringLiteral	－
// U+FF0D: FULLWIDTH HYPHEN-MINUS 	TokenNameCOMMENT_LINE	U+FF0D: FULLWIDTH HYPHEN-MINUS 
,	TokenNameCOMMA	
"-"	TokenNameStringLiteral	-
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁅"	TokenNameStringLiteral	⁅
// U+2045: LEFT SQUARE BRACKET WITH QUILL 	TokenNameCOMMENT_LINE	U+2045: LEFT SQUARE BRACKET WITH QUILL 
+	TokenNamePLUS	
"❲"	TokenNameStringLiteral	❲
// U+2772: LIGHT LEFT TORTOISE SHELL BRACKET ORNAMENT 	TokenNameCOMMENT_LINE	U+2772: LIGHT LEFT TORTOISE SHELL BRACKET ORNAMENT 
+	TokenNamePLUS	
"［"	TokenNameStringLiteral	［
// U+FF3B: FULLWIDTH LEFT SQUARE BRACKET 	TokenNameCOMMENT_LINE	U+FF3B: FULLWIDTH LEFT SQUARE BRACKET 
,	TokenNameCOMMA	
"["	TokenNameStringLiteral	[
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁆"	TokenNameStringLiteral	⁆
// U+2046: RIGHT SQUARE BRACKET WITH QUILL 	TokenNameCOMMENT_LINE	U+2046: RIGHT SQUARE BRACKET WITH QUILL 
+	TokenNamePLUS	
"❳"	TokenNameStringLiteral	❳
// U+2773: LIGHT RIGHT TORTOISE SHELL BRACKET ORNAMENT 	TokenNameCOMMENT_LINE	U+2773: LIGHT RIGHT TORTOISE SHELL BRACKET ORNAMENT 
+	TokenNamePLUS	
"］"	TokenNameStringLiteral	］
// U+FF3D: FULLWIDTH RIGHT SQUARE BRACKET 	TokenNameCOMMENT_LINE	U+FF3D: FULLWIDTH RIGHT SQUARE BRACKET 
,	TokenNameCOMMA	
"]"	TokenNameStringLiteral	]
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁽"	TokenNameStringLiteral	⁽
// U+207D: SUPERSCRIPT LEFT PARENTHESIS 	TokenNameCOMMENT_LINE	U+207D: SUPERSCRIPT LEFT PARENTHESIS 
+	TokenNamePLUS	
"₍"	TokenNameStringLiteral	₍
// U+208D: SUBSCRIPT LEFT PARENTHESIS 	TokenNameCOMMENT_LINE	U+208D: SUBSCRIPT LEFT PARENTHESIS 
+	TokenNamePLUS	
"❨"	TokenNameStringLiteral	❨
// U+2768: MEDIUM LEFT PARENTHESIS ORNAMENT 	TokenNameCOMMENT_LINE	U+2768: MEDIUM LEFT PARENTHESIS ORNAMENT 
+	TokenNamePLUS	
"❪"	TokenNameStringLiteral	❪
// U+276A: MEDIUM FLATTENED LEFT PARENTHESIS ORNAMENT 	TokenNameCOMMENT_LINE	U+276A: MEDIUM FLATTENED LEFT PARENTHESIS ORNAMENT 
+	TokenNamePLUS	
"（"	TokenNameStringLiteral	（
// U+FF08: FULLWIDTH LEFT PARENTHESIS 	TokenNameCOMMENT_LINE	U+FF08: FULLWIDTH LEFT PARENTHESIS 
,	TokenNameCOMMA	
"("	TokenNameStringLiteral	(
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⸨"	TokenNameStringLiteral	⸨
// U+2E28: LEFT DOUBLE PARENTHESIS 	TokenNameCOMMENT_LINE	U+2E28: LEFT DOUBLE PARENTHESIS 
,	TokenNameCOMMA	
"(("	TokenNameStringLiteral	((
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁾"	TokenNameStringLiteral	⁾
// U+207E: SUPERSCRIPT RIGHT PARENTHESIS 	TokenNameCOMMENT_LINE	U+207E: SUPERSCRIPT RIGHT PARENTHESIS 
+	TokenNamePLUS	
"₎"	TokenNameStringLiteral	₎
// U+208E: SUBSCRIPT RIGHT PARENTHESIS 	TokenNameCOMMENT_LINE	U+208E: SUBSCRIPT RIGHT PARENTHESIS 
+	TokenNamePLUS	
"❩"	TokenNameStringLiteral	❩
// U+2769: MEDIUM RIGHT PARENTHESIS ORNAMENT 	TokenNameCOMMENT_LINE	U+2769: MEDIUM RIGHT PARENTHESIS ORNAMENT 
+	TokenNamePLUS	
"❫"	TokenNameStringLiteral	❫
// U+276B: MEDIUM FLATTENED RIGHT PARENTHESIS ORNAMENT 	TokenNameCOMMENT_LINE	U+276B: MEDIUM FLATTENED RIGHT PARENTHESIS ORNAMENT 
+	TokenNamePLUS	
"）"	TokenNameStringLiteral	）
// U+FF09: FULLWIDTH RIGHT PARENTHESIS 	TokenNameCOMMENT_LINE	U+FF09: FULLWIDTH RIGHT PARENTHESIS 
,	TokenNameCOMMA	
")"	TokenNameStringLiteral	)
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⸩"	TokenNameStringLiteral	⸩
// U+2E29: RIGHT DOUBLE PARENTHESIS 	TokenNameCOMMENT_LINE	U+2E29: RIGHT DOUBLE PARENTHESIS 
,	TokenNameCOMMA	
"))"	TokenNameStringLiteral	))
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"❬"	TokenNameStringLiteral	❬
// U+276C: MEDIUM LEFT-POINTING ANGLE BRACKET ORNAMENT 	TokenNameCOMMENT_LINE	U+276C: MEDIUM LEFT-POINTING ANGLE BRACKET ORNAMENT 
+	TokenNamePLUS	
"❰"	TokenNameStringLiteral	❰
// U+2770: HEAVY LEFT-POINTING ANGLE BRACKET ORNAMENT 	TokenNameCOMMENT_LINE	U+2770: HEAVY LEFT-POINTING ANGLE BRACKET ORNAMENT 
+	TokenNamePLUS	
"＜"	TokenNameStringLiteral	＜
// U+FF1C: FULLWIDTH LESS-THAN SIGN 	TokenNameCOMMENT_LINE	U+FF1C: FULLWIDTH LESS-THAN SIGN 
,	TokenNameCOMMA	
"<"	TokenNameStringLiteral	<
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"❭"	TokenNameStringLiteral	❭
// U+276D: MEDIUM RIGHT-POINTING ANGLE BRACKET ORNAMENT 	TokenNameCOMMENT_LINE	U+276D: MEDIUM RIGHT-POINTING ANGLE BRACKET ORNAMENT 
+	TokenNamePLUS	
"❱"	TokenNameStringLiteral	❱
// U+2771: HEAVY RIGHT-POINTING ANGLE BRACKET ORNAMENT 	TokenNameCOMMENT_LINE	U+2771: HEAVY RIGHT-POINTING ANGLE BRACKET ORNAMENT 
+	TokenNamePLUS	
"＞"	TokenNameStringLiteral	＞
// U+FF1E: FULLWIDTH GREATER-THAN SIGN 	TokenNameCOMMENT_LINE	U+FF1E: FULLWIDTH GREATER-THAN SIGN 
,	TokenNameCOMMA	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"❴"	TokenNameStringLiteral	❴
// U+2774: MEDIUM LEFT CURLY BRACKET ORNAMENT 	TokenNameCOMMENT_LINE	U+2774: MEDIUM LEFT CURLY BRACKET ORNAMENT 
+	TokenNamePLUS	
"｛"	TokenNameStringLiteral	｛
// U+FF5B: FULLWIDTH LEFT CURLY BRACKET 	TokenNameCOMMENT_LINE	U+FF5B: FULLWIDTH LEFT CURLY BRACKET 
,	TokenNameCOMMA	
"{"	TokenNameStringLiteral	{
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"❵"	TokenNameStringLiteral	❵
// U+2775: MEDIUM RIGHT CURLY BRACKET ORNAMENT 	TokenNameCOMMENT_LINE	U+2775: MEDIUM RIGHT CURLY BRACKET ORNAMENT 
+	TokenNamePLUS	
"｝"	TokenNameStringLiteral	｝
// U+FF5D: FULLWIDTH RIGHT CURLY BRACKET 	TokenNameCOMMENT_LINE	U+FF5D: FULLWIDTH RIGHT CURLY BRACKET 
,	TokenNameCOMMA	
"}"	TokenNameStringLiteral	}
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁺"	TokenNameStringLiteral	⁺
// U+207A: SUPERSCRIPT PLUS SIGN 	TokenNameCOMMENT_LINE	U+207A: SUPERSCRIPT PLUS SIGN 
+	TokenNamePLUS	
"₊"	TokenNameStringLiteral	₊
// U+208A: SUBSCRIPT PLUS SIGN 	TokenNameCOMMENT_LINE	U+208A: SUBSCRIPT PLUS SIGN 
+	TokenNamePLUS	
"＋"	TokenNameStringLiteral	＋
// U+FF0B: FULLWIDTH PLUS SIGN 	TokenNameCOMMENT_LINE	U+FF0B: FULLWIDTH PLUS SIGN 
,	TokenNameCOMMA	
"+"	TokenNameStringLiteral	+
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁼"	TokenNameStringLiteral	⁼
// U+207C: SUPERSCRIPT EQUALS SIGN 	TokenNameCOMMENT_LINE	U+207C: SUPERSCRIPT EQUALS SIGN 
+	TokenNamePLUS	
"₌"	TokenNameStringLiteral	₌
// U+208C: SUBSCRIPT EQUALS SIGN 	TokenNameCOMMENT_LINE	U+208C: SUBSCRIPT EQUALS SIGN 
+	TokenNamePLUS	
"＝"	TokenNameStringLiteral	＝
// U+FF1D: FULLWIDTH EQUALS SIGN 	TokenNameCOMMENT_LINE	U+FF1D: FULLWIDTH EQUALS SIGN 
,	TokenNameCOMMA	
"="	TokenNameStringLiteral	=
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"！"	TokenNameStringLiteral	！
// U+FF01: FULLWIDTH EXCLAMATION MARK 	TokenNameCOMMENT_LINE	U+FF01: FULLWIDTH EXCLAMATION MARK 
,	TokenNameCOMMA	
"!"	TokenNameStringLiteral	!
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"‼"	TokenNameStringLiteral	‼
// U+203C: DOUBLE EXCLAMATION MARK 	TokenNameCOMMENT_LINE	U+203C: DOUBLE EXCLAMATION MARK 
,	TokenNameCOMMA	
"!!"	TokenNameStringLiteral	!!
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁉"	TokenNameStringLiteral	⁉
// U+2049: EXCLAMATION QUESTION MARK 	TokenNameCOMMENT_LINE	U+2049: EXCLAMATION QUESTION MARK 
,	TokenNameCOMMA	
"!?"	TokenNameStringLiteral	!?
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"＃"	TokenNameStringLiteral	＃
// U+FF03: FULLWIDTH NUMBER SIGN 	TokenNameCOMMENT_LINE	U+FF03: FULLWIDTH NUMBER SIGN 
,	TokenNameCOMMA	
"#"	TokenNameStringLiteral	#
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"＄"	TokenNameStringLiteral	＄
// U+FF04: FULLWIDTH DOLLAR SIGN 	TokenNameCOMMENT_LINE	U+FF04: FULLWIDTH DOLLAR SIGN 
,	TokenNameCOMMA	
"$"	TokenNameStringLiteral	$
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁒"	TokenNameStringLiteral	⁒
// U+2052: COMMERCIAL MINUS SIGN 	TokenNameCOMMENT_LINE	U+2052: COMMERCIAL MINUS SIGN 
+	TokenNamePLUS	
"％"	TokenNameStringLiteral	％
// U+FF05: FULLWIDTH PERCENT SIGN 	TokenNameCOMMENT_LINE	U+FF05: FULLWIDTH PERCENT SIGN 
,	TokenNameCOMMA	
"%"	TokenNameStringLiteral	%
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"＆"	TokenNameStringLiteral	＆
// U+FF06: FULLWIDTH AMPERSAND 	TokenNameCOMMENT_LINE	U+FF06: FULLWIDTH AMPERSAND 
,	TokenNameCOMMA	
"&"	TokenNameStringLiteral	&
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁎"	TokenNameStringLiteral	⁎
// U+204E: LOW ASTERISK 	TokenNameCOMMENT_LINE	U+204E: LOW ASTERISK 
+	TokenNamePLUS	
"＊"	TokenNameStringLiteral	＊
// U+FF0A: FULLWIDTH ASTERISK 	TokenNameCOMMENT_LINE	U+FF0A: FULLWIDTH ASTERISK 
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"，"	TokenNameStringLiteral	，
// U+FF0C: FULLWIDTH COMMA 	TokenNameCOMMENT_LINE	U+FF0C: FULLWIDTH COMMA 
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"．"	TokenNameStringLiteral	．
// U+FF0E: FULLWIDTH FULL STOP 	TokenNameCOMMENT_LINE	U+FF0E: FULLWIDTH FULL STOP 
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁄"	TokenNameStringLiteral	⁄
// U+2044: FRACTION SLASH 	TokenNameCOMMENT_LINE	U+2044: FRACTION SLASH 
+	TokenNamePLUS	
"／"	TokenNameStringLiteral	／
// U+FF0F: FULLWIDTH SOLIDUS 	TokenNameCOMMENT_LINE	U+FF0F: FULLWIDTH SOLIDUS 
,	TokenNameCOMMA	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"："	TokenNameStringLiteral	：
// U+FF1A: FULLWIDTH COLON 	TokenNameCOMMENT_LINE	U+FF1A: FULLWIDTH COLON 
,	TokenNameCOMMA	
":"	TokenNameStringLiteral	:
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁏"	TokenNameStringLiteral	⁏
// U+204F: REVERSED SEMICOLON 	TokenNameCOMMENT_LINE	U+204F: REVERSED SEMICOLON 
+	TokenNamePLUS	
"；"	TokenNameStringLiteral	；
// U+FF1B: FULLWIDTH SEMICOLON 	TokenNameCOMMENT_LINE	U+FF1B: FULLWIDTH SEMICOLON 
,	TokenNameCOMMA	
";"	TokenNameStringLiteral	;
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"？"	TokenNameStringLiteral	？
// U+FF1F: FULLWIDTH QUESTION MARK 	TokenNameCOMMENT_LINE	U+FF1F: FULLWIDTH QUESTION MARK 
,	TokenNameCOMMA	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁇"	TokenNameStringLiteral	⁇
// U+2047: DOUBLE QUESTION MARK 	TokenNameCOMMENT_LINE	U+2047: DOUBLE QUESTION MARK 
,	TokenNameCOMMA	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁈"	TokenNameStringLiteral	⁈
// U+2048: QUESTION EXCLAMATION MARK 	TokenNameCOMMENT_LINE	U+2048: QUESTION EXCLAMATION MARK 
,	TokenNameCOMMA	
"?!"	TokenNameStringLiteral	?!
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"＠"	TokenNameStringLiteral	＠
// U+FF20: FULLWIDTH COMMERCIAL AT 	TokenNameCOMMENT_LINE	U+FF20: FULLWIDTH COMMERCIAL AT 
,	TokenNameCOMMA	
"@"	TokenNameStringLiteral	@
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"＼"	TokenNameStringLiteral	＼
// U+FF3C: FULLWIDTH REVERSE SOLIDUS 	TokenNameCOMMENT_LINE	U+FF3C: FULLWIDTH REVERSE SOLIDUS 
,	TokenNameCOMMA	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"‸"	TokenNameStringLiteral	‸
// U+2038: CARET 	TokenNameCOMMENT_LINE	U+2038: CARET 
+	TokenNamePLUS	
"＾"	TokenNameStringLiteral	＾
// U+FF3E: FULLWIDTH CIRCUMFLEX ACCENT 	TokenNameCOMMENT_LINE	U+FF3E: FULLWIDTH CIRCUMFLEX ACCENT 
,	TokenNameCOMMA	
"^"	TokenNameStringLiteral	^
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"＿"	TokenNameStringLiteral	＿
// U+FF3F: FULLWIDTH LOW LINE 	TokenNameCOMMENT_LINE	U+FF3F: FULLWIDTH LOW LINE 
,	TokenNameCOMMA	
"_"	TokenNameStringLiteral	_
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
"⁓"	TokenNameStringLiteral	⁓
// U+2053: SWUNG DASH 	TokenNameCOMMENT_LINE	U+2053: SWUNG DASH 
+	TokenNamePLUS	
"～"	TokenNameStringLiteral	～
// U+FF5E: FULLWIDTH TILDE 	TokenNameCOMMENT_LINE	U+FF5E: FULLWIDTH TILDE 
,	TokenNameCOMMA	
"~"	TokenNameStringLiteral	~
,	TokenNameCOMMA	
// Folded result 	TokenNameCOMMENT_LINE	Folded result 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Construct input text and expected output tokens 	TokenNameCOMMENT_LINE	Construct input text and expected output tokens 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expectedOutputTokens	TokenNameIdentifier	 expected Output Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
inputText	TokenNameIdentifier	 input Text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
foldings	TokenNameIdentifier	 foldings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputText	TokenNameIdentifier	 input Text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Space between tokens 	TokenNameCOMMENT_LINE	Space between tokens 
}	TokenNameRBRACE	
inputText	TokenNameIdentifier	 input Text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
foldings	TokenNameIdentifier	 foldings
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Construct the expected output token: the ASCII string to fold to, 	TokenNameCOMMENT_LINE	Construct the expected output token: the ASCII string to fold to, 
// duplicated as many times as the number of characters in the input text. 	TokenNameCOMMENT_LINE	duplicated as many times as the number of characters in the input text. 
StringBuilder	TokenNameIdentifier	 String Builder
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numChars	TokenNameIdentifier	 num Chars
=	TokenNameEQUAL	
foldings	TokenNameIdentifier	 foldings
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
<	TokenNameLESS	
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
foldings	TokenNameIdentifier	 foldings
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expectedOutputTokens	TokenNameIdentifier	 expected Output Tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
inputText	TokenNameIdentifier	 input Text
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expectedIter	TokenNameIdentifier	 expected Iter
=	TokenNameEQUAL	
expectedOutputTokens	TokenNameIdentifier	 expected Output Tokens
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
expectedIter	TokenNameIdentifier	 expected Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
expectedIter	TokenNameIdentifier	 expected Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
assertTermEquals	TokenNameIdentifier	 assert Term Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
