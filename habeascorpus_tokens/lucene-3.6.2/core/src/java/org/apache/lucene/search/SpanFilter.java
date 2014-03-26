package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Copyright 2007 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2007 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Abstract base class providing a mechanism to restrict searches to a subset of an index and also maintains and returns position information. This is useful if you want to compare the positions from a SpanQuery with the positions of items in a filter. For instance, if you had a SpanFilter that marked all the occurrences of the word "foo" in documents, and then you entered a new SpanQuery containing bar, you could not only filter by the word foo, but you could then compare position information for post processing. */	TokenNameCOMMENT_JAVADOC	 Abstract base class providing a mechanism to restrict searches to a subset of an index and also maintains and returns position information. This is useful if you want to compare the positions from a SpanQuery with the positions of items in a filter. For instance, if you had a SpanFilter that marked all the occurrences of the word "foo" in documents, and then you entered a new SpanQuery containing bar, you could not only filter by the word foo, but you could then compare position information for post processing. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SpanFilter	TokenNameIdentifier	 Span Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** Returns a SpanFilterResult with true for documents which should be permitted in search results, and false for those that should not and Spans for where the true docs match. * @param reader The {@link org.apache.lucene.index.IndexReader} to load position and DocIdSet information from * @return A {@link SpanFilterResult} * @throws java.io.IOException if there was an issue accessing the necessary information * */	TokenNameCOMMENT_JAVADOC	 Returns a SpanFilterResult with true for documents which should be permitted in search results, and false for those that should not and Spans for where the true docs match. @param reader The {@link org.apache.lucene.index.IndexReader} to load position and DocIdSet information from @return A {@link SpanFilterResult} @throws java.io.IOException if there was an issue accessing the necessary information 
public	TokenNamepublic	
abstract	TokenNameabstract	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
bitSpans	TokenNameIdentifier	 bit Spans
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
