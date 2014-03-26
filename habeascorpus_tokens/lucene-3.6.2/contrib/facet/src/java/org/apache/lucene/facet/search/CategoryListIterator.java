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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An interface for iterating over a "category list", i.e., the list of * categories per document. * <p> * <b>NOTE:</b> * <ul> * <li>This class operates as a key to a Map. Appropriate implementation of * <code>hashCode()</code> and <code>equals()</code> must be provided. * <li>{@link #init()} must be called before you consume any categories, or call * {@link #skipTo(int)}. * <li>{@link #skipTo(int)} must be called before any calls to * {@link #nextCategory()}. * <li>{@link #nextCategory()} returns values &lt; {@link Integer#MAX_VALUE}, so * you can use it as a stop condition. * </ul> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An interface for iterating over a "category list", i.e., the list of categories per document. <p> <b>NOTE:</b> <ul> <li>This class operates as a key to a Map. Appropriate implementation of <code>hashCode()</code> and <code>equals()</code> must be provided. <li>{@link #init()} must be called before you consume any categories, or call {@link #skipTo(int)}. <li>{@link #skipTo(int)} must be called before any calls to {@link #nextCategory()}. <li>{@link #nextCategory()} returns values &lt; {@link Integer#MAX_VALUE}, so you can use it as a stop condition. </ul> * @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
{	TokenNameLBRACE	
/** * Initializes the iterator. This method must be called before any calls to * {@link #skipTo(int)}, and its return value indicates whether there are * any relevant documents for this iterator. If it returns false, any call * to {@link #skipTo(int)} will return false as well.<br> * <b>NOTE:</b> calling this method twice may result in skipping over * documents for some implementations. Also, calling it again after all * documents were consumed may yield unexpected behavior. */	TokenNameCOMMENT_JAVADOC	 Initializes the iterator. This method must be called before any calls to {@link #skipTo(int)}, and its return value indicates whether there are any relevant documents for this iterator. If it returns false, any call to {@link #skipTo(int)} will return false as well.<br> <b>NOTE:</b> calling this method twice may result in skipping over documents for some implementations. Also, calling it again after all documents were consumed may yield unexpected behavior. 
public	TokenNamepublic	
boolean	TokenNameboolean	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Skips forward to document docId. Returns true iff this document exists * and has any categories. This method must be called before calling * {@link #nextCategory()} for a particular document.<br> * <b>NOTE:</b> Users should call this method with increasing docIds, and * implementations can assume that this is the case. */	TokenNameCOMMENT_JAVADOC	 Skips forward to document docId. Returns true iff this document exists and has any categories. This method must be called before calling {@link #nextCategory()} for a particular document.<br> <b>NOTE:</b> Users should call this method with increasing docIds, and implementations can assume that this is the case. 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns the next category for the current document that is set through * {@link #skipTo(int)}, or a number higher than {@link Integer#MAX_VALUE}. * No assumptions can be made on the order of the categories. */	TokenNameCOMMENT_JAVADOC	 Returns the next category for the current document that is set through {@link #skipTo(int)}, or a number higher than {@link Integer#MAX_VALUE}. No assumptions can be made on the order of the categories. 
public	TokenNamepublic	
long	TokenNamelong	
nextCategory	TokenNameIdentifier	 next Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
