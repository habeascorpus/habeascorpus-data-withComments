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
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
;	TokenNameSEMICOLON	
/** @lucene.internal Only public to be accessible by spans package. */	TokenNameCOMMENT_JAVADOC	 @lucene.internal Only public to be accessible by spans package. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ScoringRewrite	TokenNameIdentifier	 Scoring Rewrite
<	TokenNameLESS	
Q	TokenNameIdentifier	 Q
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
extends	TokenNameextends	
TermCollectingRewrite	TokenNameIdentifier	 Term Collecting Rewrite
<	TokenNameLESS	
Q	TokenNameIdentifier	 Q
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** A rewrite method that first translates each term into * {@link BooleanClause.Occur#SHOULD} clause in a * BooleanQuery, and keeps the scores as computed by the * query. Note that typically such scores are * meaningless to the user, and require non-trivial CPU * to compute, so it's almost always better to use {@link * MultiTermQuery#CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} instead. * * <p><b>NOTE</b>: This rewrite method will hit {@link * BooleanQuery.TooManyClauses} if the number of terms * exceeds {@link BooleanQuery#getMaxClauseCount}. * * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 A rewrite method that first translates each term into {@link BooleanClause.Occur#SHOULD} clause in a BooleanQuery, and keeps the scores as computed by the query. Note that typically such scores are meaningless to the user, and require non-trivial CPU to compute, so it's almost always better to use {@link MultiTermQuery#CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} instead. * <p><b>NOTE</b>: This rewrite method will hit {@link BooleanQuery.TooManyClauses} if the number of terms exceeds {@link BooleanQuery#getMaxClauseCount}. * @see #setRewriteMethod 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
ScoringRewrite	TokenNameIdentifier	 Scoring Rewrite
<	TokenNameLESS	
BooleanQuery	TokenNameIdentifier	 Boolean Query
>	TokenNameGREATER	
SCORING_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 SCORING  BOOLEAN  QUERY  REWRITE
=	TokenNameEQUAL	
new	TokenNamenew	
ScoringRewrite	TokenNameIdentifier	 Scoring Rewrite
<	TokenNameLESS	
BooleanQuery	TokenNameIdentifier	 Boolean Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
BooleanQuery	TokenNameIdentifier	 Boolean Query
getTopLevelQuery	TokenNameIdentifier	 get Top Level Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
topLevel	TokenNameIdentifier	 top Level
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
TermQuery	TokenNameIdentifier	 Term Query
tq	TokenNameIdentifier	 tq
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tq	TokenNameIdentifier	 tq
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topLevel	TokenNameIdentifier	 top Level
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make sure we are still a singleton even after deserializing 	TokenNameCOMMENT_LINE	Make sure we are still a singleton even after deserializing 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SCORING_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 SCORING  BOOLEAN  QUERY  REWRITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Like {@link #SCORING_BOOLEAN_QUERY_REWRITE} except * scores are not computed. Instead, each matching * document receives a constant score equal to the * query's boost. * * <p><b>NOTE</b>: This rewrite method will hit {@link * BooleanQuery.TooManyClauses} if the number of terms * exceeds {@link BooleanQuery#getMaxClauseCount}. * * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 Like {@link #SCORING_BOOLEAN_QUERY_REWRITE} except scores are not computed. Instead, each matching document receives a constant score equal to the query's boost. * <p><b>NOTE</b>: This rewrite method will hit {@link BooleanQuery.TooManyClauses} if the number of terms exceeds {@link BooleanQuery#getMaxClauseCount}. * @see #setRewriteMethod 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
CONSTANT_SCORE_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  BOOLEAN  QUERY  REWRITE
=	TokenNameEQUAL	
new	TokenNamenew	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
SCORING_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 SCORING  BOOLEAN  QUERY  REWRITE
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: if empty boolean query return NullQuery? 	TokenNameCOMMENT_LINE	TODO: if empty boolean query return NullQuery? 
if	TokenNameif	
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
bq	TokenNameIdentifier	 bq
;	TokenNameSEMICOLON	
// strip the scores off 	TokenNameCOMMENT_LINE	strip the scores off 
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make sure we are still a singleton even after deserializing 	TokenNameCOMMENT_LINE	Make sure we are still a singleton even after deserializing 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CONSTANT_SCORE_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  BOOLEAN  QUERY  REWRITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Q	TokenNameIdentifier	 Q
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
final	TokenNamefinal	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Q	TokenNameIdentifier	 Q
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getTopLevelQuery	TokenNameIdentifier	 get Top Level Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// "trick" to be able to make it final 	TokenNameCOMMENT_LINE	"trick" to be able to make it final 
collectTerms	TokenNameIdentifier	 collect Terms
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
new	TokenNamenew	
TermCollector	TokenNameIdentifier	 Term Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
incTotalNumberOfTerms	TokenNameIdentifier	 inc Total Number Of Terms
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
