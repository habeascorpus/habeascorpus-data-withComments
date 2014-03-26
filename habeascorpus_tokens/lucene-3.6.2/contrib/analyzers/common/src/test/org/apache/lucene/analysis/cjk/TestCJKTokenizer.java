package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cjk	TokenNameIdentifier	 cjk
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
Analyzer	TokenNameIdentifier	 Analyzer
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
/** @deprecated Remove when CJKTokenizer is removed (5.0) */	TokenNameCOMMENT_JAVADOC	 @deprecated Remove when CJKTokenizer is removed (5.0) 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
TestCJKTokenizer	TokenNameIdentifier	 Test CJK Tokenizer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
class	TokenNameclass	
TestToken	TokenNameIdentifier	 Test Token
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
termText	TokenNameIdentifier	 term Text
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TestToken	TokenNameIdentifier	 Test Token
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
termText	TokenNameIdentifier	 term Text
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestToken	TokenNameIdentifier	 Test Token
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
TestToken	TokenNameIdentifier	 Test Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
termText	TokenNameIdentifier	 term Text
=	TokenNameEQUAL	
termText	TokenNameIdentifier	 term Text
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
TOKEN_TYPE_NAMES	TokenNameIdentifier	 TOKEN  TYPE  NAMES
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
final	TokenNamefinal	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
CJKAnalyzer	TokenNameIdentifier	 CJK Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_tokens	TokenNameIdentifier	 out tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
termText	TokenNameIdentifier	 term Text
;	TokenNameSEMICOLON	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_tokens	TokenNameIdentifier	 out tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_tokens	TokenNameIdentifier	 out tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_tokens	TokenNameIdentifier	 out tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
checkCJKTokenReusable	TokenNameIdentifier	 check CJK Token Reusable
(	TokenNameLPAREN	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
final	TokenNamefinal	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
CJKAnalyzer	TokenNameIdentifier	 CJK Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
out_tokens	TokenNameIdentifier	 out tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_tokens	TokenNameIdentifier	 out tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
termText	TokenNameIdentifier	 term Text
;	TokenNameSEMICOLON	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_tokens	TokenNameIdentifier	 out tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_tokens	TokenNameIdentifier	 out tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
out_tokens	TokenNameIdentifier	 out tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJa1	TokenNameIdentifier	 test Ja1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"??????????"	TokenNameStringLiteral	??????????
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJa2	TokenNameIdentifier	 test Ja2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"? ??? ????? ?"	TokenNameStringLiteral	? ??? ????? ?
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testC	TokenNameIdentifier	 test C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"abc defgh ijklmn opqrstu vwxy z"	TokenNameStringLiteral	abc defgh ijklmn opqrstu vwxy z
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"defgh"	TokenNameStringLiteral	defgh
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"ijklmn"	TokenNameStringLiteral	ijklmn
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"opqrstu"	TokenNameStringLiteral	opqrstu
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"vwxy"	TokenNameStringLiteral	vwxy
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"z"	TokenNameStringLiteral	z
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMix	TokenNameIdentifier	 test Mix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"?????abc?????"	TokenNameStringLiteral	?????abc?????
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMix2	TokenNameIdentifier	 test Mix2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"?????ab?c???? ?"	TokenNameStringLiteral	?????ab?c???? ?
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSingleChar	TokenNameIdentifier	 test Single Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Full-width text is normalized to half-width */	TokenNameCOMMENT_BLOCK	 Full-width text is normalized to half-width 
public	TokenNamepublic	
void	TokenNamevoid	
testFullWidth	TokenNameIdentifier	 test Full Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"Ｔｅｓｔ １２３４"	TokenNameStringLiteral	Ｔｅｓｔ １２３４
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"1234"	TokenNameStringLiteral	1234
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Non-english text (not just CJK) is treated the same as CJK: C1C2 C2C3 */	TokenNameCOMMENT_BLOCK	 Non-english text (not just CJK) is treated the same as CJK: C1C2 C2C3 
public	TokenNamepublic	
void	TokenNamevoid	
testNonIdeographic	TokenNameIdentifier	 test Non Ideographic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"? روبرت موير"	TokenNameStringLiteral	? روبرت موير
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"رو"	TokenNameStringLiteral	رو
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"وب"	TokenNameStringLiteral	وب
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"بر"	TokenNameStringLiteral	بر
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"رت"	TokenNameStringLiteral	رت
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"مو"	TokenNameStringLiteral	مو
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"وي"	TokenNameStringLiteral	وي
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"ير"	TokenNameStringLiteral	ير
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Non-english text with nonletters (non-spacing marks,etc) is treated as C1C2 C2C3, * except for words are split around non-letters. */	TokenNameCOMMENT_BLOCK	 Non-english text with nonletters (non-spacing marks,etc) is treated as C1C2 C2C3, except for words are split around non-letters. 
public	TokenNamepublic	
void	TokenNamevoid	
testNonIdeographicNonLetter	TokenNameIdentifier	 test Non Ideographic Non Letter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"? رُوبرت موير"	TokenNameStringLiteral	? رُوبرت موير
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"ر"	TokenNameStringLiteral	ر
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"وب"	TokenNameStringLiteral	وب
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"بر"	TokenNameStringLiteral	بر
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"رت"	TokenNameStringLiteral	رت
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"مو"	TokenNameStringLiteral	مو
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"وي"	TokenNameStringLiteral	وي
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"ير"	TokenNameStringLiteral	ير
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTokenStream	TokenNameIdentifier	 test Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
CJKAnalyzer	TokenNameIdentifier	 CJK Analyzer
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
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
"??"	TokenNameStringLiteral	??
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
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
CJKAnalyzer	TokenNameIdentifier	 CJK Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"?????abc?????"	TokenNameStringLiteral	?????abc?????
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens	TokenNameIdentifier	 out tokens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKTokenReusable	TokenNameIdentifier	 check CJK Token Reusable
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens	TokenNameIdentifier	 out tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"?????ab?c???? ?"	TokenNameStringLiteral	?????ab?c???? ?
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out_tokens2	TokenNameIdentifier	 out tokens2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkCJKTokenReusable	TokenNameIdentifier	 check CJK Token Reusable
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
out_tokens2	TokenNameIdentifier	 out tokens2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * LUCENE-2207: wrong offset calculated by end() */	TokenNameCOMMENT_JAVADOC	 LUCENE-2207: wrong offset calculated by end() 
public	TokenNamepublic	
void	TokenNamevoid	
testFinalOffset	TokenNameIdentifier	 test Final Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
"あい"	TokenNameStringLiteral	あい
,	TokenNameCOMMA	
new	TokenNamenew	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"あい"	TokenNameStringLiteral	あい
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
"あい "	TokenNameStringLiteral	あい 
,	TokenNameCOMMA	
new	TokenNamenew	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"あい"	TokenNameStringLiteral	あい
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
new	TokenNamenew	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
"test "	TokenNameStringLiteral	test 
,	TokenNameCOMMA	
new	TokenNamenew	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
"あいtest"	TokenNameStringLiteral	あいtest
,	TokenNameCOMMA	
new	TokenNamenew	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"あい"	TokenNameStringLiteral	あい
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCJKToken	TokenNameIdentifier	 check CJK Token
(	TokenNameLPAREN	
"testあい "	TokenNameStringLiteral	testあい 
,	TokenNameCOMMA	
new	TokenNamenew	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
SINGLE_TOKEN_TYPE	TokenNameIdentifier	 SINGLE  TOKEN  TYPE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
"あい"	TokenNameStringLiteral	あい
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
.	TokenNameDOT	
DOUBLE_TOKEN_TYPE	TokenNameIdentifier	 DOUBLE  TOKEN  TYPE
)	TokenNameRPAREN	
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
CJKAnalyzer	TokenNameIdentifier	 CJK Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
