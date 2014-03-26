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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
QueryParser	TokenNameIdentifier	 Query Parser
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
/** * An abstract {@link Query} that matches documents * containing a subset of terms provided by a {@link * FilteredTermEnum} enumeration. * * <p>This query cannot be used directly; you must subclass * it and define {@link #getEnum} to provide a {@link * FilteredTermEnum} that iterates through the terms to be * matched. * * <p><b>NOTE</b>: if {@link #setRewriteMethod} is either * {@link #CONSTANT_SCORE_BOOLEAN_QUERY_REWRITE} or {@link * #SCORING_BOOLEAN_QUERY_REWRITE}, you may encounter a * {@link BooleanQuery.TooManyClauses} exception during * searching, which happens when the number of terms to be * searched exceeds {@link * BooleanQuery#getMaxClauseCount()}. Setting {@link * #setRewriteMethod} to {@link #CONSTANT_SCORE_FILTER_REWRITE} * prevents this. * * <p>The recommended rewrite method is {@link * #CONSTANT_SCORE_AUTO_REWRITE_DEFAULT}: it doesn't spend CPU * computing unhelpful scores, and it tries to pick the most * performant rewrite method given the query. If you * need scoring (like {@link FuzzyQuery}, use * {@link TopTermsScoringBooleanQueryRewrite} which uses * a priority queue to only collect competitive terms * and not hit this limitation. * * Note that {@link QueryParser} produces * MultiTermQueries using {@link * #CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} by default. */	TokenNameCOMMENT_JAVADOC	 An abstract {@link Query} that matches documents containing a subset of terms provided by a {@link FilteredTermEnum} enumeration. * <p>This query cannot be used directly; you must subclass it and define {@link #getEnum} to provide a {@link FilteredTermEnum} that iterates through the terms to be matched. * <p><b>NOTE</b>: if {@link #setRewriteMethod} is either {@link #CONSTANT_SCORE_BOOLEAN_QUERY_REWRITE} or {@link #SCORING_BOOLEAN_QUERY_REWRITE}, you may encounter a {@link BooleanQuery.TooManyClauses} exception during searching, which happens when the number of terms to be searched exceeds {@link BooleanQuery#getMaxClauseCount()}. Setting {@link #setRewriteMethod} to {@link #CONSTANT_SCORE_FILTER_REWRITE} prevents this. * <p>The recommended rewrite method is {@link #CONSTANT_SCORE_AUTO_REWRITE_DEFAULT}: it doesn't spend CPU computing unhelpful scores, and it tries to pick the most performant rewrite method given the query. If you need scoring (like {@link FuzzyQuery}, use {@link TopTermsScoringBooleanQueryRewrite} which uses a priority queue to only collect competitive terms and not hit this limitation. * Note that {@link QueryParser} produces MultiTermQueries using {@link #CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} by default. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
{	TokenNameLBRACE	
protected	TokenNameprotected	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
rewriteMethod	TokenNameIdentifier	 rewrite Method
=	TokenNameEQUAL	
CONSTANT_SCORE_AUTO_REWRITE_DEFAULT	TokenNameIdentifier	 CONSTANT  SCORE  AUTO  REWRITE  DEFAULT
;	TokenNameSEMICOLON	
transient	TokenNametransient	
int	TokenNameint	
numberOfTerms	TokenNameIdentifier	 number Of Terms
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Abstract class that defines how the query is rewritten. */	TokenNameCOMMENT_JAVADOC	 Abstract class that defines how the query is rewritten. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** * Returns the {@link MultiTermQuery}s {@link FilteredTermEnum} * @see MultiTermQuery#getEnum(IndexReader) */	TokenNameCOMMENT_JAVADOC	 Returns the {@link MultiTermQuery}s {@link FilteredTermEnum} @see MultiTermQuery#getEnum(IndexReader) 
protected	TokenNameprotected	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
getTermsEnum	TokenNameIdentifier	 get Terms Enum
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
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getEnum	TokenNameIdentifier	 get Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// allow RewriteMethod subclasses to pull a FilteredTermEnum from the MTQ 	TokenNameCOMMENT_LINE	allow RewriteMethod subclasses to pull a FilteredTermEnum from the MTQ 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A rewrite method that first creates a private Filter, * by visiting each term in sequence and marking all docs * for that term. Matching documents are assigned a * constant score equal to the query's boost. * * <p> This method is faster than the BooleanQuery * rewrite methods when the number of matched terms or * matched documents is non-trivial. Also, it will never * hit an errant {@link BooleanQuery.TooManyClauses} * exception. * * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 A rewrite method that first creates a private Filter, by visiting each term in sequence and marking all docs for that term. Matching documents are assigned a constant score equal to the query's boost. * <p> This method is faster than the BooleanQuery rewrite methods when the number of matched terms or matched documents is non-trivial. Also, it will never hit an errant {@link BooleanQuery.TooManyClauses} exception. * @see #setRewriteMethod 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
CONSTANT_SCORE_FILTER_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  FILTER  REWRITE
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
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
new	TokenNamenew	
MultiTermQueryWrapperFilter	TokenNameIdentifier	 Multi Term Query Wrapper Filter
<	TokenNameLESS	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
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
CONSTANT_SCORE_FILTER_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  FILTER  REWRITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** A rewrite method that first translates each term into * {@link BooleanClause.Occur#SHOULD} clause in a * BooleanQuery, and keeps the scores as computed by the * query. Note that typically such scores are * meaningless to the user, and require non-trivial CPU * to compute, so it's almost always better to use {@link * #CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} instead. * * <p><b>NOTE</b>: This rewrite method will hit {@link * BooleanQuery.TooManyClauses} if the number of terms * exceeds {@link BooleanQuery#getMaxClauseCount}. * * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 A rewrite method that first translates each term into {@link BooleanClause.Occur#SHOULD} clause in a BooleanQuery, and keeps the scores as computed by the query. Note that typically such scores are meaningless to the user, and require non-trivial CPU to compute, so it's almost always better to use {@link #CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} instead. * <p><b>NOTE</b>: This rewrite method will hit {@link BooleanQuery.TooManyClauses} if the number of terms exceeds {@link BooleanQuery#getMaxClauseCount}. * @see #setRewriteMethod 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
SCORING_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 SCORING  BOOLEAN  QUERY  REWRITE
=	TokenNameEQUAL	
ScoringRewrite	TokenNameIdentifier	 Scoring Rewrite
.	TokenNameDOT	
SCORING_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 SCORING  BOOLEAN  QUERY  REWRITE
;	TokenNameSEMICOLON	
/** Like {@link #SCORING_BOOLEAN_QUERY_REWRITE} except * scores are not computed. Instead, each matching * document receives a constant score equal to the * query's boost. * * <p><b>NOTE</b>: This rewrite method will hit {@link * BooleanQuery.TooManyClauses} if the number of terms * exceeds {@link BooleanQuery#getMaxClauseCount}. * * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 Like {@link #SCORING_BOOLEAN_QUERY_REWRITE} except scores are not computed. Instead, each matching document receives a constant score equal to the query's boost. * <p><b>NOTE</b>: This rewrite method will hit {@link BooleanQuery.TooManyClauses} if the number of terms exceeds {@link BooleanQuery#getMaxClauseCount}. * @see #setRewriteMethod 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
CONSTANT_SCORE_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  BOOLEAN  QUERY  REWRITE
=	TokenNameEQUAL	
ScoringRewrite	TokenNameIdentifier	 Scoring Rewrite
.	TokenNameDOT	
CONSTANT_SCORE_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  BOOLEAN  QUERY  REWRITE
;	TokenNameSEMICOLON	
/** * A rewrite method that first translates each term into * {@link BooleanClause.Occur#SHOULD} clause in a BooleanQuery, and keeps the * scores as computed by the query. * * <p> * This rewrite method only uses the top scoring terms so it will not overflow * the boolean max clause count. It is the default rewrite method for * {@link FuzzyQuery}. * * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 A rewrite method that first translates each term into {@link BooleanClause.Occur#SHOULD} clause in a BooleanQuery, and keeps the scores as computed by the query. * <p> This rewrite method only uses the top scoring terms so it will not overflow the boolean max clause count. It is the default rewrite method for {@link FuzzyQuery}. * @see #setRewriteMethod 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
TopTermsScoringBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Scoring Boolean Query Rewrite
extends	TokenNameextends	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
<	TokenNameLESS	
BooleanQuery	TokenNameIdentifier	 Boolean Query
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Create a TopTermsScoringBooleanQueryRewrite for * at most <code>size</code> terms. * <p> * NOTE: if {@link BooleanQuery#getMaxClauseCount} is smaller than * <code>size</code>, then it will be used instead. */	TokenNameCOMMENT_JAVADOC	 Create a TopTermsScoringBooleanQueryRewrite for at most <code>size</code> terms. <p> NOTE: if {@link BooleanQuery#getMaxClauseCount} is smaller than <code>size</code>, then it will be used instead. 
public	TokenNamepublic	
TopTermsScoringBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Scoring Boolean Query Rewrite
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BooleanQuery	TokenNameIdentifier	 Boolean Query
.	TokenNameDOT	
getMaxClauseCount	TokenNameIdentifier	 get Max Clause Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
/** * A rewrite method that first translates each term into * {@link BooleanClause.Occur#SHOULD} clause in a BooleanQuery, but the scores * are only computed as the boost. * <p> * This rewrite method only uses the top scoring terms so it will not overflow * the boolean max clause count. * * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 A rewrite method that first translates each term into {@link BooleanClause.Occur#SHOULD} clause in a BooleanQuery, but the scores are only computed as the boost. <p> This rewrite method only uses the top scoring terms so it will not overflow the boolean max clause count. * @see #setRewriteMethod 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
TopTermsBoostOnlyBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Boost Only Boolean Query Rewrite
extends	TokenNameextends	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
<	TokenNameLESS	
BooleanQuery	TokenNameIdentifier	 Boolean Query
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Create a TopTermsBoostOnlyBooleanQueryRewrite for * at most <code>size</code> terms. * <p> * NOTE: if {@link BooleanQuery#getMaxClauseCount} is smaller than * <code>size</code>, then it will be used instead. */	TokenNameCOMMENT_JAVADOC	 Create a TopTermsBoostOnlyBooleanQueryRewrite for at most <code>size</code> terms. <p> NOTE: if {@link BooleanQuery#getMaxClauseCount} is smaller than <code>size</code>, then it will be used instead. 
public	TokenNamepublic	
TopTermsBoostOnlyBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Boost Only Boolean Query Rewrite
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BooleanQuery	TokenNameIdentifier	 Boolean Query
.	TokenNameDOT	
getMaxClauseCount	TokenNameIdentifier	 get Max Clause Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
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
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A rewrite method that tries to pick the best * constant-score rewrite method based on term and * document counts from the query. If both the number of * terms and documents is small enough, then {@link * #CONSTANT_SCORE_BOOLEAN_QUERY_REWRITE} is used. * Otherwise, {@link #CONSTANT_SCORE_FILTER_REWRITE} is * used. */	TokenNameCOMMENT_JAVADOC	 A rewrite method that tries to pick the best constant-score rewrite method based on term and document counts from the query. If both the number of terms and documents is small enough, then {@link #CONSTANT_SCORE_BOOLEAN_QUERY_REWRITE} is used. Otherwise, {@link #CONSTANT_SCORE_FILTER_REWRITE} is used. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ConstantScoreAutoRewrite	TokenNameIdentifier	 Constant Score Auto Rewrite
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ConstantScoreAutoRewrite	TokenNameIdentifier	 Constant Score Auto Rewrite
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Read-only default instance of {@link * ConstantScoreAutoRewrite}, with {@link * ConstantScoreAutoRewrite#setTermCountCutoff} set to * {@link * ConstantScoreAutoRewrite#DEFAULT_TERM_COUNT_CUTOFF} * and {@link * ConstantScoreAutoRewrite#setDocCountPercent} set to * {@link * ConstantScoreAutoRewrite#DEFAULT_DOC_COUNT_PERCENT}. * Note that you cannot alter the configuration of this * instance; you'll need to create a private instance * instead. */	TokenNameCOMMENT_JAVADOC	 Read-only default instance of {@link ConstantScoreAutoRewrite}, with {@link ConstantScoreAutoRewrite#setTermCountCutoff} set to {@link ConstantScoreAutoRewrite#DEFAULT_TERM_COUNT_CUTOFF} and {@link ConstantScoreAutoRewrite#setDocCountPercent} set to {@link ConstantScoreAutoRewrite#DEFAULT_DOC_COUNT_PERCENT}. Note that you cannot alter the configuration of this instance; you'll need to create a private instance instead. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
CONSTANT_SCORE_AUTO_REWRITE_DEFAULT	TokenNameIdentifier	 CONSTANT  SCORE  AUTO  REWRITE  DEFAULT
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreAutoRewrite	TokenNameIdentifier	 Constant Score Auto Rewrite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setTermCountCutoff	TokenNameIdentifier	 set Term Count Cutoff
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Please create a private instance"	TokenNameStringLiteral	Please create a private instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setDocCountPercent	TokenNameIdentifier	 set Doc Count Percent
(	TokenNameLPAREN	
double	TokenNamedouble	
percent	TokenNameIdentifier	 percent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Please create a private instance"	TokenNameStringLiteral	Please create a private instance
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
CONSTANT_SCORE_AUTO_REWRITE_DEFAULT	TokenNameIdentifier	 CONSTANT  SCORE  AUTO  REWRITE  DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Constructs a query matching terms that cannot be represented with a single * Term. */	TokenNameCOMMENT_JAVADOC	 Constructs a query matching terms that cannot be represented with a single Term. 
public	TokenNamepublic	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Construct the enumeration to be used, expanding the pattern term. */	TokenNameCOMMENT_JAVADOC	 Construct the enumeration to be used, expanding the pattern term. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
getEnum	TokenNameIdentifier	 get Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Expert: Return the number of unique terms visited during execution of the query. * If there are many of them, you may consider using another query type * or reduce your total term count in index. * <p>This method is not thread safe, be sure to only call it when no query is running! * If you re-use the same query instance for another * search, be sure to first reset the term counter * with {@link #clearTotalNumberOfTerms}. * <p>On single-segment indexes / no MultiReaders, you get the correct number of * unique terms for the whole index. Use this number to compare different queries. * For multi-segment indexes this number can also be achieved in * non-constant-score mode. In constant-score mode you get the total number of * terms seeked for all segments / sub-readers. * @see #clearTotalNumberOfTerms * @deprecated Don't use this method, as its not thread safe and useless. */	TokenNameCOMMENT_JAVADOC	 Expert: Return the number of unique terms visited during execution of the query. If there are many of them, you may consider using another query type or reduce your total term count in index. <p>This method is not thread safe, be sure to only call it when no query is running! If you re-use the same query instance for another search, be sure to first reset the term counter with {@link #clearTotalNumberOfTerms}. <p>On single-segment indexes / no MultiReaders, you get the correct number of unique terms for the whole index. Use this number to compare different queries. For multi-segment indexes this number can also be achieved in non-constant-score mode. In constant-score mode you get the total number of terms seeked for all segments / sub-readers. @see #clearTotalNumberOfTerms @deprecated Don't use this method, as its not thread safe and useless. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
getTotalNumberOfTerms	TokenNameIdentifier	 get Total Number Of Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numberOfTerms	TokenNameIdentifier	 number Of Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: Resets the counting of unique terms. * Do this before executing the query/filter. * @see #getTotalNumberOfTerms * @deprecated Don't use this method, as its not thread safe and useless. */	TokenNameCOMMENT_JAVADOC	 Expert: Resets the counting of unique terms. Do this before executing the query/filter. @see #getTotalNumberOfTerms @deprecated Don't use this method, as its not thread safe and useless. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
clearTotalNumberOfTerms	TokenNameIdentifier	 clear Total Number Of Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberOfTerms	TokenNameIdentifier	 number Of Terms
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated Don't use this method, as its not thread safe and useless. */	TokenNameCOMMENT_JAVADOC	 @deprecated Don't use this method, as its not thread safe and useless. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
incTotalNumberOfTerms	TokenNameIdentifier	 inc Total Number Of Terms
(	TokenNameLPAREN	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberOfTerms	TokenNameIdentifier	 number Of Terms
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To rewrite to a simpler form, instead return a simpler * enum from {@link #getEnum(IndexReader)}. For example, * to rewrite to a single term, return a {@link SingleTermEnum} */	TokenNameCOMMENT_JAVADOC	 To rewrite to a simpler form, instead return a simpler enum from {@link #getEnum(IndexReader)}. For example, to rewrite to a single term, return a {@link SingleTermEnum} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
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
rewriteMethod	TokenNameIdentifier	 rewrite Method
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 @see #setRewriteMethod 
public	TokenNamepublic	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
getRewriteMethod	TokenNameIdentifier	 get Rewrite Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rewriteMethod	TokenNameIdentifier	 rewrite Method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the rewrite method to be used when executing the * query. You can use one of the four core methods, or * implement your own subclass of {@link RewriteMethod}. */	TokenNameCOMMENT_JAVADOC	 Sets the rewrite method to be used when executing the query. You can use one of the four core methods, or implement your own subclass of {@link RewriteMethod}. 
public	TokenNamepublic	
void	TokenNamevoid	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rewriteMethod	TokenNameIdentifier	 rewrite Method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
rewriteMethod	TokenNameIdentifier	 rewrite Method
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
rewriteMethod	TokenNameIdentifier	 rewrite Method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
rewriteMethod	TokenNameIdentifier	 rewrite Method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
