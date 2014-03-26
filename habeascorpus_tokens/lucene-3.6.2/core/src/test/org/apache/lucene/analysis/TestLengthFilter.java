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
public	TokenNamepublic	
class	TokenNameclass	
TestLengthFilter	TokenNameIdentifier	 Test Length Filter
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterNoPosIncr	TokenNameIdentifier	 test Filter No Pos Incr
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
"short toolong evenmuchlongertext a ab toolong foo"	TokenNameStringLiteral	short toolong evenmuchlongertext a ab toolong foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LengthFilter	TokenNameIdentifier	 Length Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
LengthFilter	TokenNameIdentifier	 Length Filter
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"short"	TokenNameStringLiteral	short
,	TokenNameCOMMA	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
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
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterWithPosIncr	TokenNameIdentifier	 test Filter With Pos Incr
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
"short toolong evenmuchlongertext a ab toolong foo"	TokenNameStringLiteral	short toolong evenmuchlongertext a ab toolong foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LengthFilter	TokenNameIdentifier	 Length Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
LengthFilter	TokenNameIdentifier	 Length Filter
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"short"	TokenNameStringLiteral	short
,	TokenNameCOMMA	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
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
LengthFilter	TokenNameIdentifier	 Length Filter
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
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
