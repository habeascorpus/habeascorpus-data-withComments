package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
miscellaneous	TokenNameIdentifier	 miscellaneous
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
Token	TokenNameIdentifier	 Token
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
public	TokenNamepublic	
class	TokenNameclass	
TestPrefixAwareTokenFilter	TokenNameIdentifier	 Test Prefix Aware Token Filter
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
PrefixAwareTokenFilter	TokenNameIdentifier	 Prefix Aware Token Filter
ts	TokenNameIdentifier	 ts
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixAwareTokenFilter	TokenNameIdentifier	 Prefix Aware Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
SingleTokenTokenStream	TokenNameIdentifier	 Single Token Token Stream
(	TokenNameLPAREN	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SingleTokenTokenStream	TokenNameIdentifier	 Single Token Token Stream
(	TokenNameLPAREN	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// prefix and suffix using 2x prefix 	TokenNameCOMMENT_LINE	prefix and suffix using 2x prefix 
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixAwareTokenFilter	TokenNameIdentifier	 Prefix Aware Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
SingleTokenTokenStream	TokenNameIdentifier	 Single Token Token Stream
(	TokenNameLPAREN	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"^"	TokenNameStringLiteral	^
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"hello world"	TokenNameStringLiteral	hello world
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixAwareTokenFilter	TokenNameIdentifier	 Prefix Aware Token Filter
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
new	TokenNamenew	
SingleTokenTokenStream	TokenNameIdentifier	 Single Token Token Stream
(	TokenNameLPAREN	
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
"$"	TokenNameStringLiteral	$
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
"^"	TokenNameStringLiteral	^
,	TokenNameCOMMA	
"hello"	TokenNameStringLiteral	hello
,	TokenNameCOMMA	
"world"	TokenNameStringLiteral	world
,	TokenNameCOMMA	
"$"	TokenNameStringLiteral	$
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
createToken	TokenNameIdentifier	 create Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
