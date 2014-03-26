package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Copyright 2004 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2004 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
/** * A query that generates the union of documents produced by its subqueries, and that scores each document with the maximum * score for that document as produced by any subquery, plus a tie breaking increment for any additional matching subqueries. * This is useful when searching for a word in multiple fields with different boost factors (so that the fields cannot be * combined equivalently into a single search field). We want the primary score to be the one associated with the highest boost, * not the sum of the field scores (as BooleanQuery would give). * If the query is "albino elephant" this ensures that "albino" matching one field and "elephant" matching * another gets a higher score than "albino" matching both fields. * To get this result, use both BooleanQuery and DisjunctionMaxQuery: for each term a DisjunctionMaxQuery searches for it in * each field, while the set of these DisjunctionMaxQuery's is combined into a BooleanQuery. * The tie breaker capability allows results that include the same term in multiple fields to be judged better than results that * include this term in only the best of those multiple fields, without confusing this with the better case of two different terms * in the multiple fields. */	TokenNameCOMMENT_JAVADOC	 A query that generates the union of documents produced by its subqueries, and that scores each document with the maximum score for that document as produced by any subquery, plus a tie breaking increment for any additional matching subqueries. This is useful when searching for a word in multiple fields with different boost factors (so that the fields cannot be combined equivalently into a single search field). We want the primary score to be the one associated with the highest boost, not the sum of the field scores (as BooleanQuery would give). If the query is "albino elephant" this ensures that "albino" matching one field and "elephant" matching another gets a higher score than "albino" matching both fields. To get this result, use both BooleanQuery and DisjunctionMaxQuery: for each term a DisjunctionMaxQuery searches for it in each field, while the set of these DisjunctionMaxQuery's is combined into a BooleanQuery. The tie breaker capability allows results that include the same term in multiple fields to be judged better than results that include this term in only the best of those multiple fields, without confusing this with the better case of two different terms in the multiple fields. 
public	TokenNamepublic	
class	TokenNameclass	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
{	TokenNameLBRACE	
/* The subqueries */	TokenNameCOMMENT_BLOCK	 The subqueries 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
disjuncts	TokenNameIdentifier	 disjuncts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Multiple of the non-max disjunct scores added into our final score. Non-zero values support tie-breaking. */	TokenNameCOMMENT_BLOCK	 Multiple of the non-max disjunct scores added into our final score. Non-zero values support tie-breaking. 
private	TokenNameprivate	
float	TokenNamefloat	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** Creates a new empty DisjunctionMaxQuery. Use add() to add the subqueries. * @param tieBreakerMultiplier the score of each non-maximum disjunct for a document is multiplied by this weight * and added into the final score. If non-zero, the value should be small, on the order of 0.1, which says that * 10 occurrences of word in a lower-scored field that is also in a higher scored field is just as good as a unique * word in the lower scored field (i.e., one that is not in any higher scored field. */	TokenNameCOMMENT_JAVADOC	 Creates a new empty DisjunctionMaxQuery. Use add() to add the subqueries. @param tieBreakerMultiplier the score of each non-maximum disjunct for a document is multiplied by this weight and added into the final score. If non-zero, the value should be small, on the order of 0.1, which says that 10 occurrences of word in a lower-scored field that is also in a higher scored field is just as good as a unique word in the lower scored field (i.e., one that is not in any higher scored field. 
public	TokenNamepublic	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
float	TokenNamefloat	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
=	TokenNameEQUAL	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new DisjunctionMaxQuery * @param disjuncts a Collection<Query> of all the disjuncts to add * @param tieBreakerMultiplier the weight to give to each matching non-maximum disjunct */	TokenNameCOMMENT_JAVADOC	 Creates a new DisjunctionMaxQuery @param disjuncts a Collection<Query> of all the disjuncts to add @param tieBreakerMultiplier the weight to give to each matching non-maximum disjunct 
public	TokenNamepublic	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
disjuncts	TokenNameIdentifier	 disjuncts
,	TokenNameCOMMA	
float	TokenNamefloat	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
=	TokenNameEQUAL	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
disjuncts	TokenNameIdentifier	 disjuncts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a subquery to this disjunction * @param query the disjunct added */	TokenNameCOMMENT_JAVADOC	 Add a subquery to this disjunction @param query the disjunct added 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a collection of disjuncts to this disjunction * via Iterable<Query> */	TokenNameCOMMENT_JAVADOC	 Add a collection of disjuncts to this disjunction via Iterable<Query> 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
disjuncts	TokenNameIdentifier	 disjuncts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
disjuncts	TokenNameIdentifier	 disjuncts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** An Iterator<Query> over the disjuncts */	TokenNameCOMMENT_JAVADOC	 An Iterator<Query> over the disjuncts 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: the Weight for DisjunctionMaxQuery, used to * normalize, score and explain these queries. * * <p>NOTE: this API and implementation is subject to * change suddenly in the next release.</p> */	TokenNameCOMMENT_JAVADOC	 Expert: the Weight for DisjunctionMaxQuery, used to normalize, score and explain these queries. * <p>NOTE: this API and implementation is subject to change suddenly in the next release.</p> 
protected	TokenNameprotected	
class	TokenNameclass	
DisjunctionMaxWeight	TokenNameIdentifier	 Disjunction Max Weight
extends	TokenNameextends	
Weight	TokenNameIdentifier	 Weight
{	TokenNameLBRACE	
/** The Similarity implementation. */	TokenNameCOMMENT_JAVADOC	 The Similarity implementation. 
protected	TokenNameprotected	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
/** The Weights for our subqueries, in 1-1 correspondence with disjuncts */	TokenNameCOMMENT_JAVADOC	 The Weights for our subqueries, in 1-1 correspondence with disjuncts 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Weight	TokenNameIdentifier	 Weight
>	TokenNameGREATER	
weights	TokenNameIdentifier	 weights
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Weight	TokenNameIdentifier	 Weight
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The Weight's for our subqueries, in 1-1 correspondence with disjuncts 	TokenNameCOMMENT_LINE	The Weight's for our subqueries, in 1-1 correspondence with disjuncts 
/** Construct the Weight for this Query searched by searcher. Recursively construct subquery weights. */	TokenNameCOMMENT_JAVADOC	 Construct the Weight for this Query searched by searcher. Recursively construct subquery weights. 
public	TokenNamepublic	
DisjunctionMaxWeight	TokenNameIdentifier	 Disjunction Max Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
disjunctQuery	TokenNameIdentifier	 disjunct Query
:	TokenNameCOLON	
disjuncts	TokenNameIdentifier	 disjuncts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
weights	TokenNameIdentifier	 weights
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
disjunctQuery	TokenNameIdentifier	 disjunct Query
.	TokenNameDOT	
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return our associated DisjunctionMaxQuery */	TokenNameCOMMENT_JAVADOC	 Return our associated DisjunctionMaxQuery 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
.	TokenNameDOT	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return our boost */	TokenNameCOMMENT_JAVADOC	 Return our boost 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Compute the sub of squared weights of us applied to our subqueries. Used for normalization. */	TokenNameCOMMENT_JAVADOC	 Compute the sub of squared weights of us applied to our subqueries. Used for normalization. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
currentWeight	TokenNameIdentifier	 current Weight
:	TokenNameCOLON	
weights	TokenNameIdentifier	 weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
currentWeight	TokenNameIdentifier	 current Weight
.	TokenNameDOT	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
sub	TokenNameIdentifier	 sub
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
-	TokenNameMINUS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
*	TokenNameMULTIPLY	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
)	TokenNameRPAREN	
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
boost	TokenNameIdentifier	 boost
*	TokenNameMULTIPLY	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Apply the computed normalization factor to our subqueries */	TokenNameCOMMENT_JAVADOC	 Apply the computed normalization factor to our subqueries 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
float	TokenNamefloat	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
norm	TokenNameIdentifier	 norm
*=	TokenNameMULTIPLY_EQUAL	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Incorporate our boost 	TokenNameCOMMENT_LINE	Incorporate our boost 
for	TokenNamefor	
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
wt	TokenNameIdentifier	 wt
:	TokenNameCOLON	
weights	TokenNameIdentifier	 weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wt	TokenNameIdentifier	 wt
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Create the scorer used to score our associated DisjunctionMaxQuery */	TokenNameCOMMENT_JAVADOC	 Create the scorer used to score our associated DisjunctionMaxQuery 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
boolean	TokenNameboolean	
scoreDocsInOrder	TokenNameIdentifier	 score Docs In Order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
topScorer	TokenNameIdentifier	 top Scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scorers	TokenNameIdentifier	 scorers
=	TokenNameEQUAL	
new	TokenNamenew	
Scorer	TokenNameIdentifier	 Scorer
[	TokenNameLBRACKET	
weights	TokenNameIdentifier	 weights
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
w	TokenNameIdentifier	 w
:	TokenNameCOLON	
weights	TokenNameIdentifier	 weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
subScorer	TokenNameIdentifier	 sub Scorer
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subScorer	TokenNameIdentifier	 sub Scorer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
subScorer	TokenNameIdentifier	 sub Scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// all scorers did not have documents 	TokenNameCOMMENT_LINE	all scorers did not have documents 
DisjunctionMaxScorer	TokenNameIdentifier	 Disjunction Max Scorer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxScorer	TokenNameIdentifier	 Disjunction Max Scorer
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
scorers	TokenNameIdentifier	 scorers
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Explain the score we computed for doc */	TokenNameCOMMENT_JAVADOC	 Explain the score we computed for doc 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
weights	TokenNameIdentifier	 weights
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
==	TokenNameEQUAL_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
?	TokenNameQUESTION	
"max of:"	TokenNameStringLiteral	max of:
:	TokenNameCOLON	
"max plus "	TokenNameStringLiteral	max plus 
+	TokenNamePLUS	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
+	TokenNamePLUS	
" times others of:"	TokenNameStringLiteral	 times others of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
wt	TokenNameIdentifier	 wt
:	TokenNameCOLON	
weights	TokenNameIdentifier	 weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
wt	TokenNameIdentifier	 wt
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
+	TokenNamePLUS	
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
-	TokenNameMINUS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of DisjunctionMaxWeight inner class 	TokenNameCOMMENT_LINE	end of DisjunctionMaxWeight inner class 
/** Create the Weight used to score us */	TokenNameCOMMENT_JAVADOC	 Create the Weight used to score us 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Weight	TokenNameIdentifier	 Weight
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DisjunctionMaxWeight	TokenNameIdentifier	 Disjunction Max Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Optimize our representation and our subqueries representations * @param reader the IndexReader we query * @return an optimized copy of us (which may not be a copy if there is nothing to optimize) */	TokenNameCOMMENT_JAVADOC	 Optimize our representation and our subqueries representations @param reader the IndexReader we query @return an optimized copy of us (which may not be a copy if there is nothing to optimize) 
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
int	TokenNameint	
numDisjunctions	TokenNameIdentifier	 num Disjunctions
=	TokenNameEQUAL	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numDisjunctions	TokenNameIdentifier	 num Disjunctions
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
singleton	TokenNameIdentifier	 singleton
=	TokenNameEQUAL	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
singleton	TokenNameIdentifier	 singleton
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
singleton	TokenNameIdentifier	 singleton
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
null	TokenNamenull	
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
numDisjunctions	TokenNameIdentifier	 num Disjunctions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
=	TokenNameEQUAL	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rewrite	TokenNameIdentifier	 rewrite
!=	TokenNameNOT_EQUAL	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
rewrite	TokenNameIdentifier	 rewrite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a shallow copy of us -- used in rewriting if necessary * @return a copy of us (but reuse, don't copy, our subqueries) */	TokenNameCOMMENT_JAVADOC	 Create a shallow copy of us -- used in rewriting if necessary @return a copy of us (but reuse, don't copy, our subqueries) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
disjuncts	TokenNameIdentifier	 disjuncts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadoc 	TokenNameCOMMENT_LINE	inherit javadoc 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
:	TokenNameCOLON	
disjuncts	TokenNameIdentifier	 disjuncts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Prettyprint us. * @param field the field to which we are applied * @return a string that shows what we do, of the form "(disjunct1 | disjunct2 | ... | disjunctn)^boost" */	TokenNameCOMMENT_JAVADOC	 Prettyprint us. @param field the field to which we are applied @return a string that shows what we do, of the form "(disjunct1 | disjunct2 | ... | disjunctn)^boost" 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDisjunctions	TokenNameIdentifier	 num Disjunctions
=	TokenNameEQUAL	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
numDisjunctions	TokenNameIdentifier	 num Disjunctions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
subquery	TokenNameIdentifier	 subquery
=	TokenNameEQUAL	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subquery	TokenNameIdentifier	 subquery
instanceof	TokenNameinstanceof	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// wrap sub-bools in parens 	TokenNameCOMMENT_LINE	wrap sub-bools in parens 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subquery	TokenNameIdentifier	 subquery
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subquery	TokenNameIdentifier	 subquery
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
numDisjunctions	TokenNameIdentifier	 num Disjunctions
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" | "	TokenNameStringLiteral	 | 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
!=	TokenNameNOT_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"~"	TokenNameStringLiteral	~
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"^"	TokenNameStringLiteral	^
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return true iff we represent the same query as o * @param o another object * @return true iff o is a DisjunctionMaxQuery with the same boost and the same subqueries, in the same order, as us */	TokenNameCOMMENT_JAVADOC	 Return true iff we represent the same query as o @param o another object @return true iff o is a DisjunctionMaxQuery with the same boost and the same subqueries, in the same order, as us 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
disjuncts	TokenNameIdentifier	 disjuncts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Compute a hash code for hashing us * @return the hash code */	TokenNameCOMMENT_JAVADOC	 Compute a hash code for hashing us @return the hash code 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
tieBreakerMultiplier	TokenNameIdentifier	 tie Breaker Multiplier
)	TokenNameRPAREN	
+	TokenNamePLUS	
disjuncts	TokenNameIdentifier	 disjuncts
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
