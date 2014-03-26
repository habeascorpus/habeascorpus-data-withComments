package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
th	TokenNameIdentifier	 th
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
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
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
CharArraySet	TokenNameIdentifier	 Char Array Set
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
/** * Test case for ThaiAnalyzer, modified from TestFrenchAnalyzer * * @version 0.1 */	TokenNameCOMMENT_JAVADOC	 Test case for ThaiAnalyzer, modified from TestFrenchAnalyzer * @version 0.1 
public	TokenNamepublic	
class	TokenNameclass	
TestThaiAnalyzer	TokenNameIdentifier	 Test Thai Analyzer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assumeTrue	TokenNameIdentifier	 assume True
(	TokenNameLPAREN	
"JRE does not support Thai dictionary-based BreakIterator"	TokenNameStringLiteral	JRE does not support Thai dictionary-based BreakIterator
,	TokenNameCOMMA	
ThaiWordFilter	TokenNameIdentifier	 Thai Word Filter
.	TokenNameDOT	
DBBI_AVAILABLE	TokenNameIdentifier	 DBBI  AVAILABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * testcase for offsets */	TokenNameCOMMENT_BLOCK	 testcase for offsets 
public	TokenNamepublic	
void	TokenNamevoid	
testOffsets	TokenNameIdentifier	 test Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"การที่ได้ต้องแสดงว่างานดี"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การ"	TokenNameStringLiteral	การ
,	TokenNameCOMMA	
"ที่"	TokenNameStringLiteral	ที่
,	TokenNameCOMMA	
"ได้"	TokenNameStringLiteral	ได้
,	TokenNameCOMMA	
"ต้อง"	TokenNameStringLiteral	ต้อง
,	TokenNameCOMMA	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStopWords	TokenNameIdentifier	 test Stop Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"การที่ได้ต้องแสดงว่างานดี"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBackwardsStopWords	TokenNameIdentifier	 test Backwards Stop Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_35	TokenNameIdentifier	 LUCENE 35
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"การที่ได้ต้องแสดงว่างานดี"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การ"	TokenNameStringLiteral	การ
,	TokenNameCOMMA	
"ที่"	TokenNameStringLiteral	ที่
,	TokenNameCOMMA	
"ได้"	TokenNameStringLiteral	ได้
,	TokenNameCOMMA	
"ต้อง"	TokenNameStringLiteral	ต้อง
,	TokenNameCOMMA	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTokenType	TokenNameIdentifier	 test Token Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"การที่ได้ต้องแสดงว่างานดี ๑๒๓"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี ๑๒๓
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การ"	TokenNameStringLiteral	การ
,	TokenNameCOMMA	
"ที่"	TokenNameStringLiteral	ที่
,	TokenNameCOMMA	
"ได้"	TokenNameStringLiteral	ได้
,	TokenNameCOMMA	
"ต้อง"	TokenNameStringLiteral	ต้อง
,	TokenNameCOMMA	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
,	TokenNameCOMMA	
"๑๒๓"	TokenNameStringLiteral	๑๒๓
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<SOUTHEAST_ASIAN>"	TokenNameStringLiteral	<SOUTHEAST_ASIAN>
,	TokenNameCOMMA	
"<SOUTHEAST_ASIAN>"	TokenNameStringLiteral	<SOUTHEAST_ASIAN>
,	TokenNameCOMMA	
"<SOUTHEAST_ASIAN>"	TokenNameStringLiteral	<SOUTHEAST_ASIAN>
,	TokenNameCOMMA	
"<SOUTHEAST_ASIAN>"	TokenNameStringLiteral	<SOUTHEAST_ASIAN>
,	TokenNameCOMMA	
"<SOUTHEAST_ASIAN>"	TokenNameStringLiteral	<SOUTHEAST_ASIAN>
,	TokenNameCOMMA	
"<SOUTHEAST_ASIAN>"	TokenNameStringLiteral	<SOUTHEAST_ASIAN>
,	TokenNameCOMMA	
"<SOUTHEAST_ASIAN>"	TokenNameStringLiteral	<SOUTHEAST_ASIAN>
,	TokenNameCOMMA	
"<SOUTHEAST_ASIAN>"	TokenNameStringLiteral	<SOUTHEAST_ASIAN>
,	TokenNameCOMMA	
"<NUM>"	TokenNameStringLiteral	<NUM>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Thai numeric tokens were typed as <ALPHANUM> instead of <NUM>. * @deprecated testing backwards behavior */	TokenNameCOMMENT_JAVADOC	 Thai numeric tokens were typed as <ALPHANUM> instead of <NUM>. @deprecated testing backwards behavior 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testBuggyTokenType30	TokenNameIdentifier	 test Buggy Token Type30
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"การที่ได้ต้องแสดงว่างานดี ๑๒๓"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี ๑๒๓
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การ"	TokenNameStringLiteral	การ
,	TokenNameCOMMA	
"ที่"	TokenNameStringLiteral	ที่
,	TokenNameCOMMA	
"ได้"	TokenNameStringLiteral	ได้
,	TokenNameCOMMA	
"ต้อง"	TokenNameStringLiteral	ต้อง
,	TokenNameCOMMA	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
,	TokenNameCOMMA	
"๑๒๓"	TokenNameStringLiteral	๑๒๓
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
/** @deprecated testing backwards behavior */	TokenNameCOMMENT_JAVADOC	 @deprecated testing backwards behavior 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testAnalyzer30	TokenNameIdentifier	 test Analyzer30
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
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
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"การที่ได้ต้องแสดงว่างานดี"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การ"	TokenNameStringLiteral	การ
,	TokenNameCOMMA	
"ที่"	TokenNameStringLiteral	ที่
,	TokenNameCOMMA	
"ได้"	TokenNameStringLiteral	ได้
,	TokenNameCOMMA	
"ต้อง"	TokenNameStringLiteral	ต้อง
,	TokenNameCOMMA	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"บริษัทชื่อ XY&Z - คุยกับ xyz@demo.com"	TokenNameStringLiteral	บริษัทชื่อ XY&Z - คุยกับ xyz@demo.com
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"บริษัท"	TokenNameStringLiteral	บริษัท
,	TokenNameCOMMA	
"ชื่อ"	TokenNameStringLiteral	ชื่อ
,	TokenNameCOMMA	
"xy&z"	TokenNameStringLiteral	xy&z
,	TokenNameCOMMA	
"คุย"	TokenNameStringLiteral	คุย
,	TokenNameCOMMA	
"กับ"	TokenNameStringLiteral	กับ
,	TokenNameCOMMA	
"xyz@demo.com"	TokenNameStringLiteral	xyz@demo.com
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// English stop words 	TokenNameCOMMENT_LINE	English stop words 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"ประโยคว่า The quick brown fox jumped over the lazy dogs"	TokenNameStringLiteral	ประโยคว่า The quick brown fox jumped over the lazy dogs
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ประโยค"	TokenNameStringLiteral	ประโยค
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
"fox"	TokenNameStringLiteral	fox
,	TokenNameCOMMA	
"jumped"	TokenNameStringLiteral	jumped
,	TokenNameCOMMA	
"over"	TokenNameStringLiteral	over
,	TokenNameCOMMA	
"lazy"	TokenNameStringLiteral	lazy
,	TokenNameCOMMA	
"dogs"	TokenNameStringLiteral	dogs
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Test that position increments are adjusted correctly for stopwords. */	TokenNameCOMMENT_BLOCK	 Test that position increments are adjusted correctly for stopwords. 
// note this test uses stopfilter's stopset 	TokenNameCOMMENT_LINE	note this test uses stopfilter's stopset 
public	TokenNamepublic	
void	TokenNamevoid	
testPositionIncrements	TokenNameIdentifier	 test Position Increments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
.	TokenNameDOT	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"การที่ได้ต้อง the แสดงว่างานดี"	TokenNameStringLiteral	การที่ได้ต้อง the แสดงว่างานดี
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การ"	TokenNameStringLiteral	การ
,	TokenNameCOMMA	
"ที่"	TokenNameStringLiteral	ที่
,	TokenNameCOMMA	
"ได้"	TokenNameStringLiteral	ได้
,	TokenNameCOMMA	
"ต้อง"	TokenNameStringLiteral	ต้อง
,	TokenNameCOMMA	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// case that a stopword is adjacent to thai text, with no whitespace 	TokenNameCOMMENT_LINE	case that a stopword is adjacent to thai text, with no whitespace 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"การที่ได้ต้องthe แสดงว่างานดี"	TokenNameStringLiteral	การที่ได้ต้องthe แสดงว่างานดี
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การ"	TokenNameStringLiteral	การ
,	TokenNameCOMMA	
"ที่"	TokenNameStringLiteral	ที่
,	TokenNameCOMMA	
"ได้"	TokenNameStringLiteral	ได้
,	TokenNameCOMMA	
"ต้อง"	TokenNameStringLiteral	ต้อง
,	TokenNameCOMMA	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReusableTokenStream	TokenNameIdentifier	 test Reusable Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
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
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"การที่ได้ต้องแสดงว่างานดี"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การ"	TokenNameStringLiteral	การ
,	TokenNameCOMMA	
"ที่"	TokenNameStringLiteral	ที่
,	TokenNameCOMMA	
"ได้"	TokenNameStringLiteral	ได้
,	TokenNameCOMMA	
"ต้อง"	TokenNameStringLiteral	ต้อง
,	TokenNameCOMMA	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"บริษัทชื่อ XY&Z - คุยกับ xyz@demo.com"	TokenNameStringLiteral	บริษัทชื่อ XY&Z - คุยกับ xyz@demo.com
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"บริษัท"	TokenNameStringLiteral	บริษัท
,	TokenNameCOMMA	
"ชื่อ"	TokenNameStringLiteral	ชื่อ
,	TokenNameCOMMA	
"xy"	TokenNameStringLiteral	xy
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
,	TokenNameCOMMA	
"คุย"	TokenNameStringLiteral	คุย
,	TokenNameCOMMA	
"กับ"	TokenNameStringLiteral	กับ
,	TokenNameCOMMA	
"xyz"	TokenNameStringLiteral	xyz
,	TokenNameCOMMA	
"demo.com"	TokenNameStringLiteral	demo.com
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated, for version back compat */	TokenNameCOMMENT_JAVADOC	 @deprecated, for version back compat 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testReusableTokenStream30	TokenNameIdentifier	 test Reusable Token Stream30
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
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
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"การที่ได้ต้องแสดงว่างานดี"	TokenNameStringLiteral	การที่ได้ต้องแสดงว่างานดี
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"การ"	TokenNameStringLiteral	การ
,	TokenNameCOMMA	
"ที่"	TokenNameStringLiteral	ที่
,	TokenNameCOMMA	
"ได้"	TokenNameStringLiteral	ได้
,	TokenNameCOMMA	
"ต้อง"	TokenNameStringLiteral	ต้อง
,	TokenNameCOMMA	
"แสดง"	TokenNameStringLiteral	แสดง
,	TokenNameCOMMA	
"ว่า"	TokenNameStringLiteral	ว่า
,	TokenNameCOMMA	
"งาน"	TokenNameStringLiteral	งาน
,	TokenNameCOMMA	
"ดี"	TokenNameStringLiteral	ดี
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
"บริษัทชื่อ XY&Z - คุยกับ xyz@demo.com"	TokenNameStringLiteral	บริษัทชื่อ XY&Z - คุยกับ xyz@demo.com
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"บริษัท"	TokenNameStringLiteral	บริษัท
,	TokenNameCOMMA	
"ชื่อ"	TokenNameStringLiteral	ชื่อ
,	TokenNameCOMMA	
"xy&z"	TokenNameStringLiteral	xy&z
,	TokenNameCOMMA	
"คุย"	TokenNameStringLiteral	คุย
,	TokenNameCOMMA	
"กับ"	TokenNameStringLiteral	กับ
,	TokenNameCOMMA	
"xyz@demo.com"	TokenNameStringLiteral	xyz@demo.com
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
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
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
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
,	TokenNameCOMMA	
8192	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-3044 	TokenNameCOMMENT_LINE	LUCENE-3044 
public	TokenNamepublic	
void	TokenNamevoid	
testAttributeReuse	TokenNameIdentifier	 test Attribute Reuse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// just consume 	TokenNameCOMMENT_LINE	just consume 
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"ภาษาไทย"	TokenNameStringLiteral	ภาษาไทย
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ภาษา"	TokenNameStringLiteral	ภาษา
,	TokenNameCOMMA	
"ไทย"	TokenNameStringLiteral	ไทย
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this consumer adds flagsAtt, which this analyzer does not use. 	TokenNameCOMMENT_LINE	this consumer adds flagsAtt, which this analyzer does not use. 
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"ภาษาไทย"	TokenNameStringLiteral	ภาษาไทย
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ภาษา"	TokenNameStringLiteral	ภาษา
,	TokenNameCOMMA	
"ไทย"	TokenNameStringLiteral	ไทย
}	TokenNameRBRACE	
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
ThaiWordFilter	TokenNameIdentifier	 Thai Word Filter
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
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
