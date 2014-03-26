package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * TestExplanations subclass focusing on span queries */	TokenNameCOMMENT_JAVADOC	 TestExplanations subclass focusing on span queries 
public	TokenNamepublic	
class	TokenNameclass	
TestSpanExplanations	TokenNameIdentifier	 Test Span Explanations
extends	TokenNameextends	
TestExplanations	TokenNameIdentifier	 Test Explanations
{	TokenNameLBRACE	
/* simple SpanTermQueries */	TokenNameCOMMENT_BLOCK	 simple SpanTermQueries 
public	TokenNamepublic	
void	TokenNamevoid	
testST1	TokenNameIdentifier	 test S T1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testST2	TokenNameIdentifier	 test S T2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testST4	TokenNameIdentifier	 test S T4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testST5	TokenNameIdentifier	 test S T5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* some SpanFirstQueries */	TokenNameCOMMENT_BLOCK	 some SpanFirstQueries 
public	TokenNamepublic	
void	TokenNamevoid	
testSF1	TokenNameIdentifier	 test S F1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
sf	TokenNameIdentifier	 sf
(	TokenNameLPAREN	
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSF2	TokenNameIdentifier	 test S F2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
sf	TokenNameIdentifier	 sf
(	TokenNameLPAREN	
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSF4	TokenNameIdentifier	 test S F4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
sf	TokenNameIdentifier	 sf
(	TokenNameLPAREN	
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSF5	TokenNameIdentifier	 test S F5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
sf	TokenNameIdentifier	 sf
(	TokenNameLPAREN	
(	TokenNameLPAREN	
"yy"	TokenNameStringLiteral	yy
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSF6	TokenNameIdentifier	 test S F6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
sf	TokenNameIdentifier	 sf
(	TokenNameLPAREN	
(	TokenNameLPAREN	
"yy"	TokenNameStringLiteral	yy
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* some SpanOrQueries */	TokenNameCOMMENT_BLOCK	 some SpanOrQueries 
public	TokenNamepublic	
void	TokenNamevoid	
testSO1	TokenNameIdentifier	 test S O1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
sor	TokenNameIdentifier	 sor
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"QQ"	TokenNameStringLiteral	QQ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSO2	TokenNameIdentifier	 test S O2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
sor	TokenNameIdentifier	 sor
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"w3"	TokenNameStringLiteral	w3
,	TokenNameCOMMA	
"zz"	TokenNameStringLiteral	zz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSO3	TokenNameIdentifier	 test S O3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
sor	TokenNameIdentifier	 sor
(	TokenNameLPAREN	
"w5"	TokenNameStringLiteral	w5
,	TokenNameCOMMA	
"QQ"	TokenNameStringLiteral	QQ
,	TokenNameCOMMA	
"yy"	TokenNameStringLiteral	yy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSO4	TokenNameIdentifier	 test S O4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
sor	TokenNameIdentifier	 sor
(	TokenNameLPAREN	
"w5"	TokenNameStringLiteral	w5
,	TokenNameCOMMA	
"QQ"	TokenNameStringLiteral	QQ
,	TokenNameCOMMA	
"yy"	TokenNameStringLiteral	yy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* some SpanNearQueries */	TokenNameCOMMENT_BLOCK	 some SpanNearQueries 
public	TokenNamepublic	
void	TokenNamevoid	
testSNear1	TokenNameIdentifier	 test S Near1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"QQ"	TokenNameStringLiteral	QQ
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear2	TokenNameIdentifier	 test S Near2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear3	TokenNameIdentifier	 test S Near3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear4	TokenNameIdentifier	 test S Near4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear5	TokenNameIdentifier	 test S Near5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear6	TokenNameIdentifier	 test S Near6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"w2"	TokenNameStringLiteral	w2
,	TokenNameCOMMA	
"QQ"	TokenNameStringLiteral	QQ
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear7	TokenNameIdentifier	 test S Near7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
"w2"	TokenNameStringLiteral	w2
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear8	TokenNameIdentifier	 test S Near8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
"w2"	TokenNameStringLiteral	w2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear9	TokenNameIdentifier	 test S Near9
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
"w2"	TokenNameStringLiteral	w2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear10	TokenNameIdentifier	 test S Near10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"w2"	TokenNameStringLiteral	w2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNear11	TokenNameIdentifier	 test S Near11
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"w2"	TokenNameStringLiteral	w2
,	TokenNameCOMMA	
"w3"	TokenNameStringLiteral	w3
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* some SpanNotQueries */	TokenNameCOMMENT_BLOCK	 some SpanNotQueries 
public	TokenNamepublic	
void	TokenNamevoid	
testSNot1	TokenNameIdentifier	 test S Not1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snot	TokenNameIdentifier	 snot
(	TokenNameLPAREN	
sf	TokenNameIdentifier	 sf
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"QQ"	TokenNameStringLiteral	QQ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNot2	TokenNameIdentifier	 test S Not2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snot	TokenNameIdentifier	 snot
(	TokenNameLPAREN	
sf	TokenNameIdentifier	 sf
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"QQ"	TokenNameStringLiteral	QQ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNot4	TokenNameIdentifier	 test S Not4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snot	TokenNameIdentifier	 snot
(	TokenNameLPAREN	
sf	TokenNameIdentifier	 sf
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNot5	TokenNameIdentifier	 test S Not5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snot	TokenNameIdentifier	 snot
(	TokenNameLPAREN	
sf	TokenNameIdentifier	 sf
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNot7	TokenNameIdentifier	 test S Not7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"w3"	TokenNameStringLiteral	w3
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snot	TokenNameIdentifier	 snot
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSNot10	TokenNameIdentifier	 test S Not10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
snot	TokenNameIdentifier	 snot
(	TokenNameLPAREN	
snear	TokenNameIdentifier	 snear
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
"w3"	TokenNameStringLiteral	w3
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
