package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestQueryTermVector	TokenNameIdentifier	 Test Query Term Vector
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConstructor	TokenNameIdentifier	 test Constructor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
queryTerm	TokenNameIdentifier	 query Term
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"again"	TokenNameStringLiteral	again
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"go"	TokenNameStringLiteral	go
,	TokenNameCOMMA	
"go"	TokenNameStringLiteral	go
,	TokenNameCOMMA	
"go"	TokenNameStringLiteral	go
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
//Items are sorted lexicographically 	TokenNameCOMMENT_LINE	Items are sorted lexicographically 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gold	TokenNameIdentifier	 gold
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"again"	TokenNameStringLiteral	again
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"go"	TokenNameStringLiteral	go
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
goldFreqs	TokenNameIdentifier	 gold Freqs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
QueryTermVector	TokenNameIdentifier	 Query Term Vector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
QueryTermVector	TokenNameIdentifier	 Query Term Vector
(	TokenNameLPAREN	
queryTerm	TokenNameIdentifier	 query Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getTermFrequencies	TokenNameIdentifier	 get Term Frequencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkGold	TokenNameIdentifier	 check Gold
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
gold	TokenNameIdentifier	 gold
,	TokenNameCOMMA	
freq	TokenNameIdentifier	 freq
,	TokenNameCOMMA	
goldFreqs	TokenNameIdentifier	 gold Freqs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
QueryTermVector	TokenNameIdentifier	 Query Term Vector
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
QueryTermVector	TokenNameIdentifier	 Query Term Vector
(	TokenNameLPAREN	
"foo bar foo again foo bar go go go"	TokenNameStringLiteral	foo bar foo again foo bar go go go
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getTermFrequencies	TokenNameIdentifier	 get Term Frequencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkGold	TokenNameIdentifier	 check Gold
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
gold	TokenNameIdentifier	 gold
,	TokenNameCOMMA	
freq	TokenNameIdentifier	 freq
,	TokenNameCOMMA	
goldFreqs	TokenNameIdentifier	 gold Freqs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkGold	TokenNameIdentifier	 check Gold
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gold	TokenNameIdentifier	 gold
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freq	TokenNameIdentifier	 freq
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
goldFreqs	TokenNameIdentifier	 gold Freqs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
gold	TokenNameIdentifier	 gold
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
goldFreqs	TokenNameIdentifier	 gold Freqs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
