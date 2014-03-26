package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
payloads	TokenNameIdentifier	 payloads
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Similarity	TokenNameIdentifier	 Similarity
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
TestExplanations	TokenNameIdentifier	 Test Explanations
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanQuery	TokenNameIdentifier	 Span Query
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
BytesRef	TokenNameIdentifier	 Bytes Ref
;	TokenNameSEMICOLON	
/** * TestExplanations subclass focusing on payload queries */	TokenNameCOMMENT_JAVADOC	 TestExplanations subclass focusing on payload queries 
public	TokenNamepublic	
class	TokenNameclass	
TestPayloadExplanations	TokenNameIdentifier	 Test Payload Explanations
extends	TokenNameextends	
TestExplanations	TokenNameIdentifier	 Test Explanations
{	TokenNameLBRACE	
private	TokenNameprivate	
PayloadFunction	TokenNameIdentifier	 Payload Function
functions	TokenNameIdentifier	 functions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
PayloadFunction	TokenNameIdentifier	 Payload Function
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
AveragePayloadFunction	TokenNameIdentifier	 Average Payload Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MinPayloadFunction	TokenNameIdentifier	 Min Payload Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MaxPayloadFunction	TokenNameIdentifier	 Max Payload Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
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
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
setSimilarity	TokenNameIdentifier	 set Similarity
(	TokenNameLPAREN	
new	TokenNamenew	
PayloadBoostSimilarity	TokenNameIdentifier	 Payload Boost Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// must be a static class so it can serialize 	TokenNameCOMMENT_LINE	must be a static class so it can serialize 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
PayloadBoostSimilarity	TokenNameIdentifier	 Payload Boost Similarity
extends	TokenNameextends	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
scorePayload	TokenNameIdentifier	 score Payload
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** macro for payloadtermquery */	TokenNameCOMMENT_JAVADOC	 macro for payloadtermquery 
private	TokenNameprivate	
SpanQuery	TokenNameIdentifier	 Span Query
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
PayloadFunction	TokenNameIdentifier	 Payload Function
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeSpanScore	TokenNameIdentifier	 include Span Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PayloadTermQuery	TokenNameIdentifier	 Payload Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
FIELD	TokenNameIdentifier	 FIELD
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
includeSpanScore	TokenNameIdentifier	 include Span Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* simple PayloadTermQueries */	TokenNameCOMMENT_BLOCK	 simple PayloadTermQueries 
public	TokenNamepublic	
void	TokenNamevoid	
testPT1	TokenNameIdentifier	 test P T1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
PayloadFunction	TokenNameIdentifier	 Payload Function
fn	TokenNameIdentifier	 fn
:	TokenNameCOLON	
functions	TokenNameIdentifier	 functions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
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
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPT2	TokenNameIdentifier	 test P T2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
PayloadFunction	TokenNameIdentifier	 Payload Function
fn	TokenNameIdentifier	 fn
:	TokenNameCOLON	
functions	TokenNameIdentifier	 functions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
false	TokenNamefalse	
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
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
"w1"	TokenNameStringLiteral	w1
,	TokenNameCOMMA	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
true	TokenNametrue	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPT4	TokenNameIdentifier	 test P T4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
PayloadFunction	TokenNameIdentifier	 Payload Function
fn	TokenNameIdentifier	 fn
:	TokenNameCOLON	
functions	TokenNameIdentifier	 functions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
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
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPT5	TokenNameIdentifier	 test P T5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
PayloadFunction	TokenNameIdentifier	 Payload Function
fn	TokenNameIdentifier	 fn
:	TokenNameCOLON	
functions	TokenNameIdentifier	 functions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
false	TokenNamefalse	
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
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
true	TokenNametrue	
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
}	TokenNameRBRACE	
// TODO: test the payloadnear query too! 	TokenNameCOMMENT_LINE	TODO: test the payloadnear query too! 
}	TokenNameRBRACE	
