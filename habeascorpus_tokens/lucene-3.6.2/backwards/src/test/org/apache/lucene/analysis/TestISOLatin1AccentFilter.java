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
public	TokenNamepublic	
class	TokenNameclass	
TestISOLatin1AccentFilter	TokenNameIdentifier	 Test ISO Latin1 Accent Filter
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testU	TokenNameIdentifier	 test U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"Des mot clés À LA CHAÎNE À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ĳ Ð Ñ Ò Ó Ô Õ Ö Ø Œ Þ Ù Ú Û Ü Ý Ÿ à á â ã ä å æ ç è é ê ë ì í î ï ĳ ð ñ ò ó ô õ ö ø œ ß þ ù ú û ü ý ÿ ﬁ ﬂ"	TokenNameStringLiteral	Des mot clés À LA CHAÎNE À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ĳ Ð Ñ Ò Ó Ô Õ Ö Ø Œ Þ Ù Ú Û Ü Ý Ÿ à á â ã ä å æ ç è é ê ë ì í î ï ĳ ð ñ ò ó ô õ ö ø œ ß þ ù ú û ü ý ÿ ﬁ ﬂ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ISOLatin1AccentFilter	TokenNameIdentifier	 ISO Latin1 Accent Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ISOLatin1AccentFilter	TokenNameIdentifier	 ISO Latin1 Accent Filter
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
