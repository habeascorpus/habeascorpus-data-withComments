package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Represents content from a specified source, such as TREC, Reuters etc. A * {@link ContentSource} is responsible for creating {@link DocData} objects for * its documents to be consumed by {@link DocMaker}. It also keeps track * of various statistics, such as how many documents were generated, size in * bytes etc. * <p> * For supported configuration parameters see {@link ContentItemsSource}. */	TokenNameCOMMENT_JAVADOC	 Represents content from a specified source, such as TREC, Reuters etc. A {@link ContentSource} is responsible for creating {@link DocData} objects for its documents to be consumed by {@link DocMaker}. It also keeps track of various statistics, such as how many documents were generated, size in bytes etc. <p> For supported configuration parameters see {@link ContentItemsSource}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ContentSource	TokenNameIdentifier	 Content Source
extends	TokenNameextends	
ContentItemsSource	TokenNameIdentifier	 Content Items Source
{	TokenNameLBRACE	
/** Returns the next {@link DocData} from the content source. * Implementations must account for multi-threading, as multiple threads * can call this method simultaneously. */	TokenNameCOMMENT_JAVADOC	 Returns the next {@link DocData} from the content source. Implementations must account for multi-threading, as multiple threads can call this method simultaneously. 
public	TokenNamepublic	
abstract	TokenNameabstract	
DocData	TokenNameIdentifier	 Doc Data
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
docData	TokenNameIdentifier	 doc Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
