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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
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
/** * A unit test helper class to help with RemoteCachingWrapperFilter testing and * assert that it is working correctly. */	TokenNameCOMMENT_JAVADOC	 A unit test helper class to help with RemoteCachingWrapperFilter testing and assert that it is working correctly. 
public	TokenNamepublic	
class	TokenNameclass	
RemoteCachingWrapperFilterHelper	TokenNameIdentifier	 Remote Caching Wrapper Filter Helper
extends	TokenNameextends	
RemoteCachingWrapperFilter	TokenNameIdentifier	 Remote Caching Wrapper Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RemoteCachingWrapperFilterHelper	TokenNameIdentifier	 Remote Caching Wrapper Filter Helper
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
=	TokenNameEQUAL	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
(	TokenNameLPAREN	
boolean	TokenNameboolean	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
=	TokenNameEQUAL	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Filter should not be null"	TokenNameStringLiteral	Filter should not be null
,	TokenNameCOMMA	
cachedFilter	TokenNameIdentifier	 cached Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
"First time filter should be the same "	TokenNameStringLiteral	First time filter should be the same 
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
cachedFilter	TokenNameIdentifier	 cached Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"We should have a cached version of the filter"	TokenNameStringLiteral	We should have a cached version of the filter
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
cachedFilter	TokenNameIdentifier	 cached Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
instanceof	TokenNameinstanceof	
CachingWrapperFilterHelper	TokenNameIdentifier	 Caching Wrapper Filter Helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CachingWrapperFilterHelper	TokenNameIdentifier	 Caching Wrapper Filter Helper
)	TokenNameRPAREN	
cachedFilter	TokenNameIdentifier	 cached Filter
)	TokenNameRPAREN	
.	TokenNameDOT	
setShouldHaveCache	TokenNameIdentifier	 set Should Have Cache
(	TokenNameLPAREN	
shouldHaveCache	TokenNameIdentifier	 should Have Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
