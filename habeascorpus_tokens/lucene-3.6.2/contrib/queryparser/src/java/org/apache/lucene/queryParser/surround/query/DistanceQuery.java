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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
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
SpanQuery	TokenNameIdentifier	 Span Query
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DistanceQuery	TokenNameIdentifier	 Distance Query
extends	TokenNameextends	
ComposedQuery	TokenNameIdentifier	 Composed Query
implements	TokenNameimplements	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
{	TokenNameLBRACE	
public	TokenNamepublic	
DistanceQuery	TokenNameIdentifier	 Distance Query
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SrndQuery	TokenNameIdentifier	 Srnd Query
>	TokenNameGREATER	
queries	TokenNameIdentifier	 queries
,	TokenNameCOMMA	
boolean	TokenNameboolean	
infix	TokenNameIdentifier	 infix
,	TokenNameCOMMA	
int	TokenNameint	
opDistance	TokenNameIdentifier	 op Distance
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
opName	TokenNameIdentifier	 op Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ordered	TokenNameIdentifier	 ordered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
,	TokenNameCOMMA	
infix	TokenNameIdentifier	 infix
,	TokenNameCOMMA	
opName	TokenNameIdentifier	 op Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
opDistance	TokenNameIdentifier	 op Distance
=	TokenNameEQUAL	
opDistance	TokenNameIdentifier	 op Distance
;	TokenNameSEMICOLON	
/* the distance indicated in the operator */	TokenNameCOMMENT_BLOCK	 the distance indicated in the operator 
this	TokenNamethis	
.	TokenNameDOT	
ordered	TokenNameIdentifier	 ordered
=	TokenNameEQUAL	
ordered	TokenNameIdentifier	 ordered
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
opDistance	TokenNameIdentifier	 op Distance
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getOpDistance	TokenNameIdentifier	 get Op Distance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opDistance	TokenNameIdentifier	 op Distance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
ordered	TokenNameIdentifier	 ordered
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
subQueriesOrdered	TokenNameIdentifier	 sub Queries Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ordered	TokenNameIdentifier	 ordered
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
distanceSubQueryNotAllowed	TokenNameIdentifier	 distance Sub Query Not Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
sqi	TokenNameIdentifier	 sqi
=	TokenNameEQUAL	
getSubQueriesIterator	TokenNameIdentifier	 get Sub Queries Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
Object	TokenNameIdentifier	 Object
leq	TokenNameIdentifier	 leq
=	TokenNameEQUAL	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
leq	TokenNameIdentifier	 leq
instanceof	TokenNameinstanceof	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
dsq	TokenNameIdentifier	 dsq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
)	TokenNameRPAREN	
leq	TokenNameIdentifier	 leq
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
dsq	TokenNameIdentifier	 dsq
.	TokenNameDOT	
distanceSubQueryNotAllowed	TokenNameIdentifier	 distance Sub Query Not Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Operator "	TokenNameStringLiteral	Operator 
+	TokenNamePLUS	
getOperatorName	TokenNameIdentifier	 get Operator Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not allow subquery "	TokenNameStringLiteral	 does not allow subquery 
+	TokenNamePLUS	
leq	TokenNameIdentifier	 leq
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/* subqueries acceptable */	TokenNameCOMMENT_BLOCK	 subqueries acceptable 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addSpanQueries	TokenNameIdentifier	 add Span Queries
(	TokenNameLPAREN	
SpanNearClauseFactory	TokenNameIdentifier	 Span Near Clause Factory
sncf	TokenNameIdentifier	 sncf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
snq	TokenNameIdentifier	 snq
=	TokenNameEQUAL	
getSpanNearQuery	TokenNameIdentifier	 get Span Near Query
(	TokenNameLPAREN	
sncf	TokenNameIdentifier	 sncf
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sncf	TokenNameIdentifier	 sncf
.	TokenNameDOT	
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sncf	TokenNameIdentifier	 sncf
.	TokenNameDOT	
getBasicQueryFactory	TokenNameIdentifier	 get Basic Query Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sncf	TokenNameIdentifier	 sncf
.	TokenNameDOT	
addSpanNearQuery	TokenNameIdentifier	 add Span Near Query
(	TokenNameLPAREN	
snq	TokenNameIdentifier	 snq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
makeLuceneQueryFieldNoBoost	TokenNameIdentifier	 make Lucene Query Field No Boost
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
final	TokenNamefinal	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Query	TokenNameIdentifier	 Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fn	TokenNameIdentifier	 fn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
fieldName	TokenNameIdentifier	 field Name
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
fn	TokenNameIdentifier	 fn
+	TokenNamePLUS	
"?)"	TokenNameStringLiteral	?)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getSpanNearQuery	TokenNameIdentifier	 get Span Near Query
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getSpanNearQuery	TokenNameIdentifier	 get Span Near Query
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
,	TokenNameCOMMA	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
spanNearClauses	TokenNameIdentifier	 span Near Clauses
=	TokenNameEQUAL	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
getNrSubQueries	TokenNameIdentifier	 get Nr Sub Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
sqi	TokenNameIdentifier	 sqi
=	TokenNameEQUAL	
getSubQueriesIterator	TokenNameIdentifier	 get Sub Queries Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
qi	TokenNameIdentifier	 qi
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
SpanNearClauseFactory	TokenNameIdentifier	 Span Near Clause Factory
sncf	TokenNameIdentifier	 sncf
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearClauseFactory	TokenNameIdentifier	 Span Near Clause Factory
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
)	TokenNameRPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addSpanQueries	TokenNameIdentifier	 add Span Queries
(	TokenNameLPAREN	
sncf	TokenNameIdentifier	 sncf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sncf	TokenNameIdentifier	 sncf
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* distance operator requires all sub queries */	TokenNameCOMMENT_BLOCK	 distance operator requires all sub queries 
while	TokenNamewhile	
(	TokenNameLPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* produce evt. error messages but ignore results */	TokenNameCOMMENT_BLOCK	 produce evt. error messages but ignore results 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DistanceSubQuery	TokenNameIdentifier	 Distance Sub Query
)	TokenNameRPAREN	
sqi	TokenNameIdentifier	 sqi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addSpanQueries	TokenNameIdentifier	 add Span Queries
(	TokenNameLPAREN	
sncf	TokenNameIdentifier	 sncf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sncf	TokenNameIdentifier	 sncf
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
SrndQuery	TokenNameIdentifier	 Srnd Query
.	TokenNameDOT	
theEmptyLcnQuery	TokenNameIdentifier	 the Empty Lcn Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
spanNearClauses	TokenNameIdentifier	 span Near Clauses
[	TokenNameLBRACKET	
qi	TokenNameIdentifier	 qi
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sncf	TokenNameIdentifier	 sncf
.	TokenNameDOT	
makeSpanNearClause	TokenNameIdentifier	 make Span Near Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qi	TokenNameIdentifier	 qi
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
spanNearClauses	TokenNameIdentifier	 span Near Clauses
,	TokenNameCOMMA	
getOpDistance	TokenNameIdentifier	 get Op Distance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
subQueriesOrdered	TokenNameIdentifier	 sub Queries Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
