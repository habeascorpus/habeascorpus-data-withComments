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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ExecutorService	TokenNameIdentifier	 Executor Service
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
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
IndexWriter	TokenNameIdentifier	 Index Writer
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
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
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
/** * Factory class used by {@link SearcherManager} and {@link NRTManager} to * create new IndexSearchers. The default implementation just creates * an IndexSearcher with no custom behavior: * * <pre class="prettyprint"> * public IndexSearcher newSearcher(IndexReader r) throws IOException { * return new IndexSearcher(r); * } * </pre> * * You can pass your own factory instead if you want custom behavior, such as: * <ul> * <li>Setting a custom scoring model: {@link IndexSearcher#setSimilarity(Similarity)} * <li>Parallel per-segment search: {@link IndexSearcher#IndexSearcher(IndexReader, ExecutorService)} * <li>Return custom subclasses of IndexSearcher (for example that implement distributed scoring) * <li>Run queries to warm your IndexSearcher before it is used. Note: when using near-realtime search * you may want to also {@link IndexWriterConfig#setMergedSegmentWarmer(IndexWriter.IndexReaderWarmer)} to warm * newly merged segments in the background, outside of the reopen path. * </ul> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Factory class used by {@link SearcherManager} and {@link NRTManager} to create new IndexSearchers. The default implementation just creates an IndexSearcher with no custom behavior: * <pre class="prettyprint"> public IndexSearcher newSearcher(IndexReader r) throws IOException { return new IndexSearcher(r); } </pre> * You can pass your own factory instead if you want custom behavior, such as: <ul> <li>Setting a custom scoring model: {@link IndexSearcher#setSimilarity(Similarity)} <li>Parallel per-segment search: {@link IndexSearcher#IndexSearcher(IndexReader, ExecutorService)} <li>Return custom subclasses of IndexSearcher (for example that implement distributed scoring) <li>Run queries to warm your IndexSearcher before it is used. Note: when using near-realtime search you may want to also {@link IndexWriterConfig#setMergedSegmentWarmer(IndexWriter.IndexReaderWarmer)} to warm newly merged segments in the background, outside of the reopen path. </ul> @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SearcherFactory	TokenNameIdentifier	 Searcher Factory
{	TokenNameLBRACE	
/** * Returns a new IndexSearcher over the given reader. */	TokenNameCOMMENT_JAVADOC	 Returns a new IndexSearcher over the given reader. 
public	TokenNamepublic	
IndexSearcher	TokenNameIdentifier	 Index Searcher
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
