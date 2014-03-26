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
/** * Expert: Calculate query weights and build query scorers. * <p> * The purpose of {@link Weight} is to ensure searching does not * modify a {@link Query}, so that a {@link Query} instance can be reused. <br> * {@link Searcher} dependent state of the query should reside in the * {@link Weight}. <br> * {@link IndexReader} dependent state should reside in the {@link Scorer}. * <p> * A <code>Weight</code> is used in the following way: * <ol> * <li>A <code>Weight</code> is constructed by a top-level query, given a * <code>Searcher</code> ({@link Query#createWeight(Searcher)}). * <li>The {@link #sumOfSquaredWeights()} method is called on the * <code>Weight</code> to compute the query normalization factor * {@link Similarity#queryNorm(float)} of the query clauses contained in the * query. * <li>The query normalization factor is passed to {@link #normalize(float)}. At * this point the weighting is complete. * <li>A <code>Scorer</code> is constructed by {@link #scorer(IndexReader,boolean,boolean)}. * </ol> * * @since 2.9 */	TokenNameCOMMENT_JAVADOC	 Expert: Calculate query weights and build query scorers. <p> The purpose of {@link Weight} is to ensure searching does not modify a {@link Query}, so that a {@link Query} instance can be reused. <br> {@link Searcher} dependent state of the query should reside in the {@link Weight}. <br> {@link IndexReader} dependent state should reside in the {@link Scorer}. <p> A <code>Weight</code> is used in the following way: <ol> <li>A <code>Weight</code> is constructed by a top-level query, given a <code>Searcher</code> ({@link Query#createWeight(Searcher)}). <li>The {@link #sumOfSquaredWeights()} method is called on the <code>Weight</code> to compute the query normalization factor {@link Similarity#queryNorm(float)} of the query clauses contained in the query. <li>The query normalization factor is passed to {@link #normalize(float)}. At this point the weighting is complete. <li>A <code>Scorer</code> is constructed by {@link #scorer(IndexReader,boolean,boolean)}. </ol> * @since 2.9 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Weight	TokenNameIdentifier	 Weight
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * An explanation of the score computation for the named document. * * @param reader sub-reader containing the give doc * @param doc * @return an Explanation for the score * @throws IOException */	TokenNameCOMMENT_JAVADOC	 An explanation of the score computation for the named document. * @param reader sub-reader containing the give doc @param doc @return an Explanation for the score @throws IOException 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** The query that this concerns. */	TokenNameCOMMENT_JAVADOC	 The query that this concerns. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The weight for this query. */	TokenNameCOMMENT_JAVADOC	 The weight for this query. 
public	TokenNamepublic	
abstract	TokenNameabstract	
float	TokenNamefloat	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Assigns the query normalization factor to this. */	TokenNameCOMMENT_JAVADOC	 Assigns the query normalization factor to this. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
float	TokenNamefloat	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a {@link Scorer} which scores documents in/out-of order according * to <code>scoreDocsInOrder</code>. * <p> * <b>NOTE:</b> even if <code>scoreDocsInOrder</code> is false, it is * recommended to check whether the returned <code>Scorer</code> indeed scores * documents out of order (i.e., call {@link #scoresDocsOutOfOrder()}), as * some <code>Scorer</code> implementations will always return documents * in-order.<br> * <b>NOTE:</b> null can be returned if no documents will be scored by this * query. * * @param reader * the {@link IndexReader} for which to return the {@link Scorer}. * @param scoreDocsInOrder * specifies whether in-order scoring of documents is required. Note * that if set to false (i.e., out-of-order scoring is required), * this method can return whatever scoring mode it supports, as every * in-order scorer is also an out-of-order one. However, an * out-of-order scorer may not support {@link Scorer#nextDoc()} * and/or {@link Scorer#advance(int)}, therefore it is recommended to * request an in-order scorer if use of these methods is required. * @param topScorer * if true, {@link Scorer#score(Collector)} will be called; if false, * {@link Scorer#nextDoc()} and/or {@link Scorer#advance(int)} will * be called. * @return a {@link Scorer} which scores documents in/out-of order. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Returns a {@link Scorer} which scores documents in/out-of order according to <code>scoreDocsInOrder</code>. <p> <b>NOTE:</b> even if <code>scoreDocsInOrder</code> is false, it is recommended to check whether the returned <code>Scorer</code> indeed scores documents out of order (i.e., call {@link #scoresDocsOutOfOrder()}), as some <code>Scorer</code> implementations will always return documents in-order.<br> <b>NOTE:</b> null can be returned if no documents will be scored by this query. * @param reader the {@link IndexReader} for which to return the {@link Scorer}. @param scoreDocsInOrder specifies whether in-order scoring of documents is required. Note that if set to false (i.e., out-of-order scoring is required), this method can return whatever scoring mode it supports, as every in-order scorer is also an out-of-order one. However, an out-of-order scorer may not support {@link Scorer#nextDoc()} and/or {@link Scorer#advance(int)}, therefore it is recommended to request an in-order scorer if use of these methods is required. @param topScorer if true, {@link Scorer#score(Collector)} will be called; if false, {@link Scorer#nextDoc()} and/or {@link Scorer#advance(int)} will be called. @return a {@link Scorer} which scores documents in/out-of order. @throws IOException 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** The sum of squared weights of contained query clauses. */	TokenNameCOMMENT_JAVADOC	 The sum of squared weights of contained query clauses. 
public	TokenNamepublic	
abstract	TokenNameabstract	
float	TokenNamefloat	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns true iff this implementation scores docs only out of order. This * method is used in conjunction with {@link Collector}'s * {@link Collector#acceptsDocsOutOfOrder() acceptsDocsOutOfOrder} and * {@link #scorer(org.apache.lucene.index.IndexReader, boolean, boolean)} to * create a matching {@link Scorer} instance for a given {@link Collector}, or * vice versa. * <p> * <b>NOTE:</b> the default implementation returns <code>false</code>, i.e. * the <code>Scorer</code> scores documents in-order. */	TokenNameCOMMENT_JAVADOC	 Returns true iff this implementation scores docs only out of order. This method is used in conjunction with {@link Collector}'s {@link Collector#acceptsDocsOutOfOrder() acceptsDocsOutOfOrder} and {@link #scorer(org.apache.lucene.index.IndexReader, boolean, boolean)} to create a matching {@link Scorer} instance for a given {@link Collector}, or vice versa. <p> <b>NOTE:</b> the default implementation returns <code>false</code>, i.e. the <code>Scorer</code> scores documents in-order. 
public	TokenNamepublic	
boolean	TokenNameboolean	
scoresDocsOutOfOrder	TokenNameIdentifier	 scores Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
