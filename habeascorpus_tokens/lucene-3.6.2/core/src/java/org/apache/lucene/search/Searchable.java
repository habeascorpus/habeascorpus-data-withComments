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
Closeable	TokenNameIdentifier	 Closeable
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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelector	TokenNameIdentifier	 Field Selector
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
/** * The interface for search implementations. * * <p> * Searchable is the abstract network protocol for searching. Implementations * provide search over a single index, over multiple indices, and over indices * on remote servers. * * <p> * Queries, filters and sort criteria are designed to be compact so that they * may be efficiently passed to a remote index, with only the top-scoring hits * being returned, rather than every matching hit. * * <b>NOTE:</b> this interface is kept public for convenience. Since it is not * expected to be implemented directly, it may be changed unexpectedly between * releases. * * @deprecated In 4.0 this interface is removed/absorbed * into IndexSearcher */	TokenNameCOMMENT_JAVADOC	 The interface for search implementations. * <p> Searchable is the abstract network protocol for searching. Implementations provide search over a single index, over multiple indices, and over indices on remote servers. * <p> Queries, filters and sort criteria are designed to be compact so that they may be efficiently passed to a remote index, with only the top-scoring hits being returned, rather than every matching hit. * <b>NOTE:</b> this interface is kept public for convenience. Since it is not expected to be implemented directly, it may be changed unexpectedly between releases. * @deprecated In 4.0 this interface is removed/absorbed into IndexSearcher 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
Searchable	TokenNameIdentifier	 Searchable
extends	TokenNameextends	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
/** * Lower-level search API. * * <p> * {@link Collector#collect(int)} is called for every document. <br> * Collector-based access to remote indexes is discouraged. * * <p> * Applications should only use this if they need <i>all</i> of the matching * documents. The high-level search API ({@link Searcher#search(Query,int)}) is * usually more efficient, as it skips non-high-scoring hits. * * @param weight * to match documents * @param filter * if non-null, used to permit documents to be collected. * @param collector * to receive hits * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Lower-level search API. * <p> {@link Collector#collect(int)} is called for every document. <br> Collector-based access to remote indexes is discouraged. * <p> Applications should only use this if they need <i>all</i> of the matching documents. The high-level search API ({@link Searcher#search(Query,int)}) is usually more efficient, as it skips non-high-scoring hits. * @param weight to match documents @param filter if non-null, used to permit documents to be collected. @param collector to receive hits @throws BooleanQuery.TooManyClauses 
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
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Frees resources associated with this Searcher. * Be careful not to call this method while you are still using objects * that reference this Searchable. */	TokenNameCOMMENT_JAVADOC	 Frees resources associated with this Searcher. Be careful not to call this method while you are still using objects that reference this Searchable. 
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Expert: Returns the number of documents containing <code>term</code>. * * @see org.apache.lucene.index.IndexReader#docFreq(Term) */	TokenNameCOMMENT_JAVADOC	 Expert: Returns the number of documents containing <code>term</code>. * @see org.apache.lucene.index.IndexReader#docFreq(Term) 
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Expert: For each term in the terms array, calculates the number of * documents containing <code>term</code>. Returns an array with these * document frequencies. Used to minimize number of remote calls. */	TokenNameCOMMENT_JAVADOC	 Expert: For each term in the terms array, calculates the number of documents containing <code>term</code>. Returns an array with these document frequencies. Used to minimize number of remote calls. 
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
;	TokenNameSEMICOLON	
/** Expert: Returns one greater than the largest possible document number. * * @see org.apache.lucene.index.IndexReader#maxDoc() */	TokenNameCOMMENT_JAVADOC	 Expert: Returns one greater than the largest possible document number. * @see org.apache.lucene.index.IndexReader#maxDoc() 
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Expert: Low-level search implementation. Finds the top <code>n</code> * hits for <code>query</code>, applying <code>filter</code> if non-null. * * <p>Applications should usually call {@link Searcher#search(Query,int)} or * {@link Searcher#search(Query,Filter,int)} instead. * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Expert: Low-level search implementation. Finds the top <code>n</code> hits for <code>query</code>, applying <code>filter</code> if non-null. * <p>Applications should usually call {@link Searcher#search(Query,int)} or {@link Searcher#search(Query,Filter,int)} instead. @throws BooleanQuery.TooManyClauses 
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
/** * Returns the stored fields of document <code>i</code>. * * @see org.apache.lucene.index.IndexReader#document(int) * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns the stored fields of document <code>i</code>. * @see org.apache.lucene.index.IndexReader#document(int) @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
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
/** * Get the {@link org.apache.lucene.document.Document} at the <code>n</code><sup>th</sup> position. The {@link org.apache.lucene.document.FieldSelector} * may be used to determine what {@link org.apache.lucene.document.Field}s to load and how they should be loaded. * * <b>NOTE:</b> If the underlying Reader (more specifically, the underlying <code>FieldsReader</code>) is closed before the lazy {@link org.apache.lucene.document.Field} is * loaded an exception may be thrown. If you want the value of a lazy {@link org.apache.lucene.document.Field} to be available after closing you must * explicitly load it or fetch the Document again with a new loader. * * * @param n Get the document at the <code>n</code><sup>th</sup> position * @param fieldSelector The {@link org.apache.lucene.document.FieldSelector} to use to determine what Fields should be loaded on the Document. May be null, in which case all Fields will be loaded. * @return The stored fields of the {@link org.apache.lucene.document.Document} at the nth position * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * * @see org.apache.lucene.index.IndexReader#document(int, FieldSelector) * @see org.apache.lucene.document.Fieldable * @see org.apache.lucene.document.FieldSelector * @see org.apache.lucene.document.SetBasedFieldSelector * @see org.apache.lucene.document.LoadFirstFieldSelector */	TokenNameCOMMENT_JAVADOC	 Get the {@link org.apache.lucene.document.Document} at the <code>n</code><sup>th</sup> position. The {@link org.apache.lucene.document.FieldSelector} may be used to determine what {@link org.apache.lucene.document.Field}s to load and how they should be loaded. * <b>NOTE:</b> If the underlying Reader (more specifically, the underlying <code>FieldsReader</code>) is closed before the lazy {@link org.apache.lucene.document.Field} is loaded an exception may be thrown. If you want the value of a lazy {@link org.apache.lucene.document.Field} to be available after closing you must explicitly load it or fetch the Document again with a new loader. * @param n Get the document at the <code>n</code><sup>th</sup> position @param fieldSelector The {@link org.apache.lucene.document.FieldSelector} to use to determine what Fields should be loaded on the Document. May be null, in which case all Fields will be loaded. @return The stored fields of the {@link org.apache.lucene.document.Document} at the nth position @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error * @see org.apache.lucene.index.IndexReader#document(int, FieldSelector) @see org.apache.lucene.document.Fieldable @see org.apache.lucene.document.FieldSelector @see org.apache.lucene.document.SetBasedFieldSelector @see org.apache.lucene.document.LoadFirstFieldSelector 
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
FieldSelector	TokenNameIdentifier	 Field Selector
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Expert: called to re-write queries into primitive queries. * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Expert: called to re-write queries into primitive queries. @throws BooleanQuery.TooManyClauses 
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Expert: low-level implementation method * Returns an Explanation that describes how <code>doc</code> scored against * <code>weight</code>. * * <p>This is intended to be used in developing Similarity implementations, * and, for good performance, should not be displayed with every hit. * Computing an explanation is as expensive as executing the query over the * entire index. * <p>Applications should call {@link Searcher#explain(Query, int)}. * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Expert: low-level implementation method Returns an Explanation that describes how <code>doc</code> scored against <code>weight</code>. * <p>This is intended to be used in developing Similarity implementations, and, for good performance, should not be displayed with every hit. Computing an explanation is as expensive as executing the query over the entire index. <p>Applications should call {@link Searcher#explain(Query, int)}. @throws BooleanQuery.TooManyClauses 
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
/** Expert: Low-level search implementation with arbitrary sorting. Finds * the top <code>n</code> hits for <code>query</code>, applying * <code>filter</code> if non-null, and sorting the hits by the criteria in * <code>sort</code>. * * <p>Applications should usually call {@link * Searcher#search(Query,Filter,int,Sort)} instead. * * @throws BooleanQuery.TooManyClauses */	TokenNameCOMMENT_JAVADOC	 Expert: Low-level search implementation with arbitrary sorting. Finds the top <code>n</code> hits for <code>query</code>, applying <code>filter</code> if non-null, and sorting the hits by the criteria in <code>sort</code>. * <p>Applications should usually call {@link Searcher#search(Query,Filter,int,Sort)} instead. * @throws BooleanQuery.TooManyClauses 
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
}	TokenNameRBRACE	
