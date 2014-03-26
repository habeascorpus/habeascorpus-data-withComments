package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
surround	TokenNameIdentifier	 surround
.	TokenNameDOT	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* SpanNearClauseFactory: Operations: - create for a field name and an indexreader. - add a weighted Term this should add a corresponding SpanTermQuery, or increase the weight of an existing one. - add a weighted subquery SpanNearQuery - create a clause for SpanNearQuery from the things added above. For this, create an array of SpanQuery's from the added ones. The clause normally is a SpanOrQuery over the added subquery SpanNearQuery the SpanTermQuery's for the added Term's */	TokenNameCOMMENT_BLOCK	 SpanNearClauseFactory: Operations: - create for a field name and an indexreader. - add a weighted Term this should add a corresponding SpanTermQuery, or increase the weight of an existing one. - add a weighted subquery SpanNearQuery - create a clause for SpanNearQuery from the things added above. For this, create an array of SpanQuery's from the added ones. The clause normally is a SpanOrQuery over the added subquery SpanNearQuery the SpanTermQuery's for the added Term's 
/* When it is necessary to suppress double subqueries as much as possible: hashCode() and equals() on unweighted SpanQuery are needed (possibly via getTerms(), the terms are individually hashable). Idem SpanNearQuery: hash on the subqueries and the slop. Evt. merge SpanNearQuery's by adding the weights of the corresponding subqueries. */	TokenNameCOMMENT_BLOCK	 When it is necessary to suppress double subqueries as much as possible: hashCode() and equals() on unweighted SpanQuery are needed (possibly via getTerms(), the terms are individually hashable). Idem SpanNearQuery: hash on the subqueries and the slop. Evt. merge SpanNearQuery's by adding the weights of the corresponding subqueries. 
/* To be determined: Are SpanQuery weights handled correctly during search by Lucene? Should the resulting SpanOrQuery be sorted? Could other SpanQueries be added for use in this factory: - SpanOrQuery: in principle yes, but it only has access to it's terms via getTerms(); are the corresponding weights available? - SpanFirstQuery: treat similar to subquery SpanNearQuery. (ok?) - SpanNotQuery: treat similar to subquery SpanNearQuery. (ok?) */	TokenNameCOMMENT_BLOCK	 To be determined: Are SpanQuery weights handled correctly during search by Lucene? Should the resulting SpanOrQuery be sorted? Could other SpanQueries be added for use in this factory: - SpanOrQuery: in principle yes, but it only has access to it's terms via getTerms(); are the corresponding weights available? - SpanFirstQuery: treat similar to subquery SpanNearQuery. (ok?) - SpanNotQuery: treat similar to subquery SpanNearQuery. (ok?) 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermEnum	TokenNameIdentifier	 Term Enum
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
Query	TokenNameIdentifier	 Query
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
SpanNearQuery	TokenNameIdentifier	 Span Near Query
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
SpanOrQuery	TokenNameIdentifier	 Span Or Query
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SpanNearClauseFactory	TokenNameIdentifier	 Span Near Clause Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
SpanNearClauseFactory	TokenNameIdentifier	 Span Near Clause Factory
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weightBySpanQuery	TokenNameIdentifier	 weight By Span Query
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
SpanQuery	TokenNameIdentifier	 Span Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
qf	TokenNameIdentifier	 qf
=	TokenNameEQUAL	
qf	TokenNameIdentifier	 qf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
SpanQuery	TokenNameIdentifier	 Span Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
weightBySpanQuery	TokenNameIdentifier	 weight By Span Query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
qf	TokenNameIdentifier	 qf
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
getBasicQueryFactory	TokenNameIdentifier	 get Basic Query Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
qf	TokenNameIdentifier	 qf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TermEnum	TokenNameIdentifier	 Term Enum
getTermEnum	TokenNameIdentifier	 get Term Enum
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
termText	TokenNameIdentifier	 term Text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
termText	TokenNameIdentifier	 term Text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
weightBySpanQuery	TokenNameIdentifier	 weight By Span Query
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
weightBySpanQuery	TokenNameIdentifier	 weight By Span Query
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
addSpanQueryWeighted	TokenNameIdentifier	 add Span Query Weighted
(	TokenNameLPAREN	
SpanQuery	TokenNameIdentifier	 Span Query
sq	TokenNameIdentifier	 sq
,	TokenNameCOMMA	
float	TokenNamefloat	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Float	TokenNameIdentifier	 Float
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
weightBySpanQuery	TokenNameIdentifier	 weight By Span Query
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
sq	TokenNameIdentifier	 sq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
weightBySpanQuery	TokenNameIdentifier	 weight By Span Query
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
sq	TokenNameIdentifier	 sq
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addTermWeighted	TokenNameIdentifier	 add Term Weighted
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
float	TokenNamefloat	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
stq	TokenNameIdentifier	 stq
=	TokenNameEQUAL	
qf	TokenNameIdentifier	 qf
.	TokenNameDOT	
newSpanTermQuery	TokenNameIdentifier	 new Span Term Query
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* CHECKME: wrap in Hashable...? */	TokenNameCOMMENT_BLOCK	 CHECKME: wrap in Hashable...? 
addSpanQueryWeighted	TokenNameIdentifier	 add Span Query Weighted
(	TokenNameLPAREN	
stq	TokenNameIdentifier	 stq
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addSpanNearQuery	TokenNameIdentifier	 add Span Near Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
==	TokenNameEQUAL_EQUAL	
SrndQuery	TokenNameIdentifier	 Srnd Query
.	TokenNameDOT	
theEmptyLcnQuery	TokenNameIdentifier	 the Empty Lcn Query
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
instanceof	TokenNameinstanceof	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
"Expected SpanNearQuery: "	TokenNameStringLiteral	Expected SpanNearQuery: 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* CHECKME: wrap in Hashable...? */	TokenNameCOMMENT_BLOCK	 CHECKME: wrap in Hashable...? 
addSpanQueryWeighted	TokenNameIdentifier	 add Span Query Weighted
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
)	TokenNameRPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SpanQuery	TokenNameIdentifier	 Span Query
makeSpanNearClause	TokenNameIdentifier	 make Span Near Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
spanQueries	TokenNameIdentifier	 span Queries
=	TokenNameEQUAL	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
SpanQuery	TokenNameIdentifier	 Span Query
>	TokenNameGREATER	
sqi	TokenNameIdentifier	 sqi
=	TokenNameEQUAL	
weightBySpanQuery	TokenNameIdentifier	 weight By Span Query
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
sq	TokenNameIdentifier	 sq
=	TokenNameEQUAL	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sq	TokenNameIdentifier	 sq
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
weightBySpanQuery	TokenNameIdentifier	 weight By Span Query
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
sq	TokenNameIdentifier	 sq
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spanQueries	TokenNameIdentifier	 span Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sq	TokenNameIdentifier	 sq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spanQueries	TokenNameIdentifier	 span Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
spanQueries	TokenNameIdentifier	 span Queries
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
(	TokenNameLPAREN	
spanQueries	TokenNameIdentifier	 span Queries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
