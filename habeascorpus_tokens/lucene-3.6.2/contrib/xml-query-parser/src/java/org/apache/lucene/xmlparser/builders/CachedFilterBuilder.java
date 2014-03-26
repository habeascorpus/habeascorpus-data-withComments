/* * Created on 25-Jan-2006 */	TokenNameCOMMENT_BLOCK	 Created on 25-Jan-2006 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
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
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
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
Filter	TokenNameIdentifier	 Filter
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
Query	TokenNameIdentifier	 Query
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
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
DOMUtils	TokenNameIdentifier	 DOM Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
FilterBuilder	TokenNameIdentifier	 Filter Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
FilterBuilderFactory	TokenNameIdentifier	 Filter Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
ParserException	TokenNameIdentifier	 Parser Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
QueryBuilder	TokenNameIdentifier	 Query Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
QueryBuilderFactory	TokenNameIdentifier	 Query Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Filters are cached in an LRU Cache keyed on the contained query or filter object. Using this will * speed up overall performance for repeated uses of the same expensive query/filter. The sorts of * queries/filters likely to benefit from caching need not necessarily be complex - e.g. simple * TermQuerys with a large DF (document frequency) can be expensive on large indexes. * A good example of this might be a term query on a field with only 2 possible values - * "true" or "false". In a large index, querying or filtering on this field requires reading * millions of document ids from disk which can more usefully be cached as a filter bitset. * * For Queries/Filters to be cached and reused the object must implement hashcode and * equals methods correctly so that duplicate queries/filters can be detected in the cache. * * The CoreParser.maxNumCachedFilters property can be used to control the size of the LRU * Cache established during the construction of CoreParser instances. * */	TokenNameCOMMENT_JAVADOC	 Filters are cached in an LRU Cache keyed on the contained query or filter object. Using this will speed up overall performance for repeated uses of the same expensive query/filter. The sorts of queries/filters likely to benefit from caching need not necessarily be complex - e.g. simple TermQuerys with a large DF (document frequency) can be expensive on large indexes. A good example of this might be a term query on a field with only 2 possible values - "true" or "false". In a large index, querying or filtering on this field requires reading millions of document ids from disk which can more usefully be cached as a filter bitset. * For Queries/Filters to be cached and reused the object must implement hashcode and equals methods correctly so that duplicate queries/filters can be detected in the cache. * The CoreParser.maxNumCachedFilters property can be used to control the size of the LRU Cache established during the construction of CoreParser instances. 
public	TokenNamepublic	
class	TokenNameclass	
CachedFilterBuilder	TokenNameIdentifier	 Cached Filter Builder
implements	TokenNameimplements	
FilterBuilder	TokenNameIdentifier	 Filter Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
QueryBuilderFactory	TokenNameIdentifier	 Query Builder Factory
queryFactory	TokenNameIdentifier	 query Factory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FilterBuilderFactory	TokenNameIdentifier	 Filter Builder Factory
filterFactory	TokenNameIdentifier	 filter Factory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LRUCache	TokenNameIdentifier	 LRU Cache
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
>	TokenNameGREATER	
filterCache	TokenNameIdentifier	 filter Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
cacheSize	TokenNameIdentifier	 cache Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CachedFilterBuilder	TokenNameIdentifier	 Cached Filter Builder
(	TokenNameLPAREN	
QueryBuilderFactory	TokenNameIdentifier	 Query Builder Factory
queryFactory	TokenNameIdentifier	 query Factory
,	TokenNameCOMMA	
FilterBuilderFactory	TokenNameIdentifier	 Filter Builder Factory
filterFactory	TokenNameIdentifier	 filter Factory
,	TokenNameCOMMA	
int	TokenNameint	
cacheSize	TokenNameIdentifier	 cache Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queryFactory	TokenNameIdentifier	 query Factory
=	TokenNameEQUAL	
queryFactory	TokenNameIdentifier	 query Factory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filterFactory	TokenNameIdentifier	 filter Factory
=	TokenNameEQUAL	
filterFactory	TokenNameIdentifier	 filter Factory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cacheSize	TokenNameIdentifier	 cache Size
=	TokenNameEQUAL	
cacheSize	TokenNameIdentifier	 cache Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Filter	TokenNameIdentifier	 Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
childElement	TokenNameIdentifier	 child Element
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getFirstChildOrFail	TokenNameIdentifier	 get First Child Or Fail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filterCache	TokenNameIdentifier	 filter Cache
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filterCache	TokenNameIdentifier	 filter Cache
=	TokenNameEQUAL	
new	TokenNamenew	
LRUCache	TokenNameIdentifier	 LRU Cache
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
>	TokenNameGREATER	
(	TokenNameLPAREN	
cacheSize	TokenNameIdentifier	 cache Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test to see if child Element is a query or filter that needs to be 	TokenNameCOMMENT_LINE	Test to see if child Element is a query or filter that needs to be 
// cached 	TokenNameCOMMENT_LINE	cached 
QueryBuilder	TokenNameIdentifier	 Query Builder
qb	TokenNameIdentifier	 qb
=	TokenNameEQUAL	
queryFactory	TokenNameIdentifier	 query Factory
.	TokenNameDOT	
getQueryBuilder	TokenNameIdentifier	 get Query Builder
(	TokenNameLPAREN	
childElement	TokenNameIdentifier	 child Element
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
cacheKey	TokenNameIdentifier	 cache Key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Filter	TokenNameIdentifier	 Filter
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qb	TokenNameIdentifier	 qb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
qb	TokenNameIdentifier	 qb
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
childElement	TokenNameIdentifier	 child Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cacheKey	TokenNameIdentifier	 cache Key
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
filterFactory	TokenNameIdentifier	 filter Factory
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
childElement	TokenNameIdentifier	 child Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cacheKey	TokenNameIdentifier	 cache Key
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Filter	TokenNameIdentifier	 Filter
cachedFilter	TokenNameIdentifier	 cached Filter
=	TokenNameEQUAL	
filterCache	TokenNameIdentifier	 filter Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cacheKey	TokenNameIdentifier	 cache Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cachedFilter	TokenNameIdentifier	 cached Filter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cachedFilter	TokenNameIdentifier	 cached Filter
;	TokenNameSEMICOLON	
// cache hit 	TokenNameCOMMENT_LINE	cache hit 
}	TokenNameRBRACE	
//cache miss 	TokenNameCOMMENT_LINE	cache miss 
if	TokenNameif	
(	TokenNameLPAREN	
qb	TokenNameIdentifier	 qb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cachedFilter	TokenNameIdentifier	 cached Filter
=	TokenNameEQUAL	
new	TokenNamenew	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cachedFilter	TokenNameIdentifier	 cached Filter
=	TokenNameEQUAL	
new	TokenNamenew	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
filterCache	TokenNameIdentifier	 filter Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
cacheKey	TokenNameIdentifier	 cache Key
,	TokenNameCOMMA	
cachedFilter	TokenNameIdentifier	 cached Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cachedFilter	TokenNameIdentifier	 cached Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
LRUCache	TokenNameIdentifier	 LRU Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
extends	TokenNameextends	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
LRUCache	TokenNameIdentifier	 LRU Cache
(	TokenNameLPAREN	
int	TokenNameint	
maxsize	TokenNameIdentifier	 maxsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
maxsize	TokenNameIdentifier	 maxsize
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.75f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxsize	TokenNameIdentifier	 maxsize
=	TokenNameEQUAL	
maxsize	TokenNameIdentifier	 maxsize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
maxsize	TokenNameIdentifier	 maxsize
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
removeEldestEntry	TokenNameIdentifier	 remove Eldest Entry
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
eldest	TokenNameIdentifier	 eldest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxsize	TokenNameIdentifier	 maxsize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
