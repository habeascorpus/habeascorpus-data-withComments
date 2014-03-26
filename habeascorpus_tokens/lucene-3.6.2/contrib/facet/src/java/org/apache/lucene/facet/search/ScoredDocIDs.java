package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSet	TokenNameIdentifier	 Doc Id Set
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Document IDs with scores for each, driving facets accumulation. Document * scores are optionally used in the process of facets scoring. * * @see FacetsAccumulator#accumulate(ScoredDocIDs) * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Document IDs with scores for each, driving facets accumulation. Document scores are optionally used in the process of facets scoring. * @see FacetsAccumulator#accumulate(ScoredDocIDs) @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
{	TokenNameLBRACE	
/** Returns an iterator over the document IDs and their scores. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the document IDs and their scores. 
public	TokenNamepublic	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns the set of doc IDs. */	TokenNameCOMMENT_JAVADOC	 Returns the set of doc IDs. 
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIDs	TokenNameIdentifier	 get Doc I Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the number of scored documents. */	TokenNameCOMMENT_JAVADOC	 Returns the number of scored documents. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
