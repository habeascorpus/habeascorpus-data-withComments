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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DocIdBitSet	TokenNameIdentifier	 Doc Id Bit Set
;	TokenNameSEMICOLON	
/** * Abstract base class for restricting which documents may * be returned during searching. */	TokenNameCOMMENT_JAVADOC	 Abstract base class for restricting which documents may be returned during searching. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Filter	TokenNameIdentifier	 Filter
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * Creates a {@link DocIdSet} enumerating the documents that should be * permitted in search results. <b>NOTE:</b> null can be * returned if no documents are accepted by this Filter. * <p> * Note: This method will be called once per segment in * the index during searching. The returned {@link DocIdSet} * must refer to document IDs for that segment, not for * the top-level reader. * * @param reader a {@link IndexReader} instance opened on the index currently * searched on. Note, it is likely that the provided reader does not * represent the whole underlying index i.e. if the index has more than * one segment the given reader only represents a single segment. * * @return a DocIdSet that provides the documents which should be permitted or * prohibited in search results. <b>NOTE:</b> null can be returned if * no documents will be accepted by this Filter. * * @see DocIdBitSet */	TokenNameCOMMENT_JAVADOC	 Creates a {@link DocIdSet} enumerating the documents that should be permitted in search results. <b>NOTE:</b> null can be returned if no documents are accepted by this Filter. <p> Note: This method will be called once per segment in the index during searching. The returned {@link DocIdSet} must refer to document IDs for that segment, not for the top-level reader. * @param reader a {@link IndexReader} instance opened on the index currently searched on. Note, it is likely that the provided reader does not represent the whole underlying index i.e. if the index has more than one segment the given reader only represents a single segment. * @return a DocIdSet that provides the documents which should be permitted or prohibited in search results. <b>NOTE:</b> null can be returned if no documents will be accepted by this Filter. * @see DocIdBitSet 
public	TokenNamepublic	
abstract	TokenNameabstract	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
