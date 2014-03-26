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
/** * Provides caching of {@link org.apache.lucene.search.Filter}s themselves on the remote end of an RMI connection. * The cache is keyed on Filter's hashCode(), so if it sees the same filter twice * it will reuse the original version. * <p/> * NOTE: This does NOT cache the Filter bits, but rather the Filter itself. * Thus, this works hand-in-hand with {@link org.apache.lucene.search.CachingWrapperFilter} to keep both * file Filter cache and the Filter bits on the remote end, close to the searcher. * <p/> * Usage: * <p/> * To cache a result you must do something like * RemoteCachingWrapperFilter f = new RemoteCachingWrapperFilter(new CachingWrapperFilter(myFilter)); * <p/> * * @deprecated This package (all of contrib/remote) will be * removed in 4.0. */	TokenNameCOMMENT_JAVADOC	 Provides caching of {@link org.apache.lucene.search.Filter}s themselves on the remote end of an RMI connection. The cache is keyed on Filter's hashCode(), so if it sees the same filter twice it will reuse the original version. <p/> NOTE: This does NOT cache the Filter bits, but rather the Filter itself. Thus, this works hand-in-hand with {@link org.apache.lucene.search.CachingWrapperFilter} to keep both file Filter cache and the Filter bits on the remote end, close to the searcher. <p/> Usage: <p/> To cache a result you must do something like RemoteCachingWrapperFilter f = new RemoteCachingWrapperFilter(new CachingWrapperFilter(myFilter)); <p/> * @deprecated This package (all of contrib/remote) will be removed in 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
RemoteCachingWrapperFilter	TokenNameIdentifier	 Remote Caching Wrapper Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
protected	TokenNameprotected	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RemoteCachingWrapperFilter	TokenNameIdentifier	 Remote Caching Wrapper Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Uses the {@link org.apache.lucene.search.FilterManager} to keep the cache for a filter on the * searcher side of a remote connection. * @param reader the index reader for the Filter * @return the DocIdSet */	TokenNameCOMMENT_JAVADOC	 Uses the {@link org.apache.lucene.search.FilterManager} to keep the cache for a filter on the searcher side of a remote connection. @param reader the index reader for the Filter @return the DocIdSet 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Filter	TokenNameIdentifier	 Filter
cachedFilter	TokenNameIdentifier	 cached Filter
=	TokenNameEQUAL	
FilterManager	TokenNameIdentifier	 Filter Manager
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cachedFilter	TokenNameIdentifier	 cached Filter
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
