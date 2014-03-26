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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelector	TokenNameIdentifier	 Field Selector
;	TokenNameSEMICOLON	
/** * An abstract base class for search implementations. Implements the main search * methods. * * <p> * Note that you can only access hits from a Searcher as long as it is not yet * closed, otherwise an IOException will be thrown. * * @deprecated In 4.0 this abstract class is removed/absorbed * into IndexSearcher */	TokenNameCOMMENT_JAVADOC	 An abstract base class for search implementations. Implements the main search methods. * <p> Note that you can only access hits from a Searcher as long as it is not yet closed, otherwise an IOException will be thrown. * @deprecated In 4.0 this abstract class is removed/absorbed into IndexSearcher 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Searcher	TokenNameIdentifier	 Searcher
implements	TokenNameimplements	
Searchable	TokenNameIdentifier	 Searchable
{	TokenNameLBRACE	
/** Search implementation with arbitrary sorting. Finds * the top <code>n</code> hits for <code>query</code>, applying * <code>filter</code> if non-null, and sorting the hits by the criteria in * <code>sort</code>. * * <p>NOTE: this does not compute scores by default; use * {@link IndexSearcher#setDefaultFieldSortScoring} to * enable scoring. * * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Search implementation with arbitrary sorting. Finds the top <code>n</code> hits for <code>query</code>, applying <code>filter</code> if non-null, and sorting the hits by the criteria in <code>sort</code>. * <p>NOTE: this does not compute scores by default; use {@link IndexSearcher#setDefaultFieldSortScoring} to enable scoring. * @throws BooleanQuery.TooManyClauses 
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Search implementation with arbitrary sorting and no filter. * @param query The query to search for * @param n Return only the top n results * @param sort The {@link org.apache.lucene.search.Sort} object * @return The top docs, sorted according to the supplied {@link org.apache.lucene.search.Sort} instance * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Search implementation with arbitrary sorting and no filter. @param query The query to search for @param n Return only the top n results @param sort The {@link org.apache.lucene.search.Sort} object @return The top docs, sorted according to the supplied {@link org.apache.lucene.search.Sort} instance @throws IOException 
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Lower-level search API. * * <p>{@link Collector#collect(int)} is called for every matching document. * * <p>Applications should only use this if they need <i>all</i> of the * matching documents. The high-level search API ({@link * Searcher#search(Query, int)}) is usually more efficient, as it skips * non-high-scoring hits. * <p>Note: The <code>score</code> passed to this method is a raw score. * In other words, the score will not necessarily be a float whose value is * between 0 and 1. * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Lower-level search API. * <p>{@link Collector#collect(int)} is called for every matching document. * <p>Applications should only use this if they need <i>all</i> of the matching documents. The high-level search API ({@link Searcher#search(Query, int)}) is usually more efficient, as it skips non-high-scoring hits. <p>Note: The <code>score</code> passed to this method is a raw score. In other words, the score will not necessarily be a float whose value is between 0 and 1. @throws BooleanQuery.TooManyClauses 
public	TokenNamepublic	
void	TokenNamevoid	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Lower-level search API. * * <p>{@link Collector#collect(int)} is called for every matching * document. * <br>Collector-based access to remote indexes is discouraged. * * <p>Applications should only use this if they need <i>all</i> of the * matching documents. The high-level search API ({@link * Searcher#search(Query, Filter, int)}) is usually more efficient, as it skips * non-high-scoring hits. * * @param query to match documents * @param filter if non-null, used to permit documents to be collected. * @param results to receive hits * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Lower-level search API. * <p>{@link Collector#collect(int)} is called for every matching document. <br>Collector-based access to remote indexes is discouraged. * <p>Applications should only use this if they need <i>all</i> of the matching documents. The high-level search API ({@link Searcher#search(Query, Filter, int)}) is usually more efficient, as it skips non-high-scoring hits. * @param query to match documents @param filter if non-null, used to permit documents to be collected. @param results to receive hits @throws BooleanQuery.TooManyClauses 
public	TokenNamepublic	
void	TokenNamevoid	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Finds the top <code>n</code> * hits for <code>query</code>, applying <code>filter</code> if non-null. * * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Finds the top <code>n</code> hits for <code>query</code>, applying <code>filter</code> if non-null. * @throws BooleanQuery.TooManyClauses 
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Finds the top <code>n</code> * hits for <code>query</code>. * * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Finds the top <code>n</code> hits for <code>query</code>. * @throws BooleanQuery.TooManyClauses 
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an Explanation that describes how <code>doc</code> scored against * <code>query</code>. * * <p>This is intended to be used in developing Similarity implementations, * and, for good performance, should not be displayed with every hit. * Computing an explanation is as expensive as executing the query over the * entire index. */	TokenNameCOMMENT_JAVADOC	 Returns an Explanation that describes how <code>doc</code> scored against <code>query</code>. * <p>This is intended to be used in developing Similarity implementations, and, for good performance, should not be displayed with every hit. Computing an explanation is as expensive as executing the query over the entire index. 
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The Similarity implementation used by this searcher. */	TokenNameCOMMENT_JAVADOC	 The Similarity implementation used by this searcher. 
private	TokenNameprivate	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Expert: Set the Similarity implementation used by this Searcher. * * @see Similarity#setDefault(Similarity) */	TokenNameCOMMENT_JAVADOC	 Expert: Set the Similarity implementation used by this Searcher. * @see Similarity#setDefault(Similarity) 
public	TokenNamepublic	
void	TokenNamevoid	
setSimilarity	TokenNameIdentifier	 set Similarity
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: Return the Similarity implementation used by this Searcher. * * <p>This defaults to the current value of {@link Similarity#getDefault()}. */	TokenNameCOMMENT_JAVADOC	 Expert: Return the Similarity implementation used by this Searcher. * <p>This defaults to the current value of {@link Similarity#getDefault()}. 
public	TokenNamepublic	
Similarity	TokenNameIdentifier	 Similarity
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a normalized weight for a top-level {@link Query}. * The query is rewritten by this method and {@link Query#createWeight} called, * afterwards the {@link Weight} is normalized. The returned {@code Weight} * can then directly be used to get a {@link Scorer}. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Creates a normalized weight for a top-level {@link Query}. The query is rewritten by this method and {@link Query#createWeight} called, afterwards the {@link Weight} is normalized. The returned {@code Weight} can then directly be used to get a {@link Scorer}. @lucene.internal 
public	TokenNamepublic	
Weight	TokenNameIdentifier	 Weight
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
.	TokenNameDOT	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this is a hack for backwards compatibility: 	TokenNameCOMMENT_LINE	this is a hack for backwards compatibility: 
float	TokenNamefloat	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
queryNorm	TokenNameIdentifier	 query Norm
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
weight	TokenNameIdentifier	 weight
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: Creates a normalized weight for a top-level {@link Query}. * The query is rewritten by this method and {@link Query#createWeight} called, * afterwards the {@link Weight} is normalized. The returned {@code Weight} * can then directly be used to get a {@link Scorer}. * @deprecated never ever use this method in {@link Weight} implementations. * Subclasses of Searcher should use {@link #createNormalizedWeight}, instead. */	TokenNameCOMMENT_JAVADOC	 Expert: Creates a normalized weight for a top-level {@link Query}. The query is rewritten by this method and {@link Query#createWeight} called, afterwards the {@link Weight} is normalized. The returned {@code Weight} can then directly be used to get a {@link Scorer}. @deprecated never ever use this method in {@link Weight} implementations. Subclasses of Searcher should use {@link #createNormalizedWeight}, instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadoc 	TokenNameCOMMENT_LINE	inherit javadoc 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docFreqs	TokenNameIdentifier	 doc Freqs
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
terms	TokenNameIdentifier	 terms
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
int	TokenNameint	
docid	TokenNameIdentifier	 docid
,	TokenNameCOMMA	
FieldSelector	TokenNameIdentifier	 Field Selector
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/* End patch for GCJ bug #15411. */	TokenNameCOMMENT_BLOCK	 End patch for GCJ bug #15411. 
}	TokenNameRBRACE	
