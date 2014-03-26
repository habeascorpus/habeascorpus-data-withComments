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
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
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
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
;	TokenNameSEMICOLON	
/** * Wraps another filter's result and caches it. The purpose is to allow * filters to simply filter, and then wrap with this class * to add caching. * * <p><b>NOTE</b>: if you wrap this filter as a query (eg, * using ConstantScoreQuery), you'll likely want to enforce * deletions (using either {@link DeletesMode#RECACHE} or * {@link DeletesMode#DYNAMIC}). */	TokenNameCOMMENT_JAVADOC	 Wraps another filter's result and caches it. The purpose is to allow filters to simply filter, and then wrap with this class to add caching. * <p><b>NOTE</b>: if you wrap this filter as a query (eg, using ConstantScoreQuery), you'll likely want to enforce deletions (using either {@link DeletesMode#RECACHE} or {@link DeletesMode#DYNAMIC}). 
public	TokenNamepublic	
class	TokenNameclass	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
/** * Expert: Specifies how new deletions against a reopened * reader should be handled. * * <p>The default is IGNORE, which means the cache entry * will be re-used for a given segment, even when that * segment has been reopened due to changes in deletions. * This is a big performance gain, especially with * near-real-timer readers, since you don't hit a cache * miss on every reopened reader for prior segments.</p> * * <p>However, in some cases this can cause invalid query * results, allowing deleted documents to be returned. * This only happens if the main query does not rule out * deleted documents on its own, such as a toplevel * ConstantScoreQuery. To fix this, use RECACHE to * re-create the cached filter (at a higher per-reopen * cost, but at faster subsequent search performance), or * use DYNAMIC to dynamically intersect deleted docs (fast * reopen time but some hit to search performance).</p> */	TokenNameCOMMENT_JAVADOC	 Expert: Specifies how new deletions against a reopened reader should be handled. * <p>The default is IGNORE, which means the cache entry will be re-used for a given segment, even when that segment has been reopened due to changes in deletions. This is a big performance gain, especially with near-real-timer readers, since you don't hit a cache miss on every reopened reader for prior segments.</p> * <p>However, in some cases this can cause invalid query results, allowing deleted documents to be returned. This only happens if the main query does not rule out deleted documents on its own, such as a toplevel ConstantScoreQuery. To fix this, use RECACHE to re-create the cached filter (at a higher per-reopen cost, but at faster subsequent search performance), or use DYNAMIC to dynamically intersect deleted docs (fast reopen time but some hit to search performance).</p> 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
DeletesMode	TokenNameIdentifier	 Deletes Mode
{	TokenNameLBRACE	
IGNORE	TokenNameIdentifier	 IGNORE
,	TokenNameCOMMA	
RECACHE	TokenNameIdentifier	 RECACHE
,	TokenNameCOMMA	
DYNAMIC	TokenNameIdentifier	 DYNAMIC
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
FilterCache	TokenNameIdentifier	 Filter Cache
<	TokenNameLESS	
DocIdSet	TokenNameIdentifier	 Doc Id Set
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
FilterCache	TokenNameIdentifier	 Filter Cache
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * A transient Filter cache (package private because of test) */	TokenNameCOMMENT_JAVADOC	 A transient Filter cache (package private because of test) 
// NOTE: not final so that we can dynamically re-init 	TokenNameCOMMENT_LINE	NOTE: not final so that we can dynamically re-init 
// after de-serialize 	TokenNameCOMMENT_LINE	after de-serialize 
transient	TokenNametransient	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
DeletesMode	TokenNameIdentifier	 Deletes Mode
deletesMode	TokenNameIdentifier	 deletes Mode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilterCache	TokenNameIdentifier	 Filter Cache
(	TokenNameLPAREN	
DeletesMode	TokenNameIdentifier	 Deletes Mode
deletesMode	TokenNameIdentifier	 deletes Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
deletesMode	TokenNameIdentifier	 deletes Mode
=	TokenNameEQUAL	
deletesMode	TokenNameIdentifier	 deletes Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
T	TokenNameIdentifier	 T
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
coreKey	TokenNameIdentifier	 core Key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
delCoreKey	TokenNameIdentifier	 del Core Key
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deletesMode	TokenNameIdentifier	 deletes Mode
==	TokenNameEQUAL_EQUAL	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
IGNORE	TokenNameIdentifier	 IGNORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// key on core 	TokenNameCOMMENT_LINE	key on core 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
coreKey	TokenNameIdentifier	 core Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
deletesMode	TokenNameIdentifier	 deletes Mode
==	TokenNameEQUAL_EQUAL	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
RECACHE	TokenNameIdentifier	 RECACHE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// key on deletes, if any, else core 	TokenNameCOMMENT_LINE	key on deletes, if any, else core 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
delCoreKey	TokenNameIdentifier	 del Core Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
deletesMode	TokenNameIdentifier	 deletes Mode
==	TokenNameEQUAL_EQUAL	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
DYNAMIC	TokenNameIdentifier	 DYNAMIC
;	TokenNameSEMICOLON	
// first try for exact match 	TokenNameCOMMENT_LINE	first try for exact match 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
delCoreKey	TokenNameIdentifier	 del Core Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// now for core match, but dynamically AND NOT 	TokenNameCOMMENT_LINE	now for core match, but dynamically AND NOT 
// deletions 	TokenNameCOMMENT_LINE	deletions 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
coreKey	TokenNameIdentifier	 core Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
mergeDeletes	TokenNameIdentifier	 merge Deletes
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
mergeDeletes	TokenNameIdentifier	 merge Deletes
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
coreKey	TokenNameIdentifier	 core Key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
delCoreKey	TokenNameIdentifier	 del Core Key
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deletesMode	TokenNameIdentifier	 deletes Mode
==	TokenNameEQUAL_EQUAL	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
IGNORE	TokenNameIdentifier	 IGNORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
coreKey	TokenNameIdentifier	 core Key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
deletesMode	TokenNameIdentifier	 deletes Mode
==	TokenNameEQUAL_EQUAL	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
RECACHE	TokenNameIdentifier	 RECACHE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
delCoreKey	TokenNameIdentifier	 del Core Key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
coreKey	TokenNameIdentifier	 core Key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
delCoreKey	TokenNameIdentifier	 del Core Key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * New deletes are ignored by default, which gives higher * cache hit rate on reopened readers. Most of the time * this is safe, because the filter will be AND'd with a * Query that fully enforces deletions. If instead you * need this filter to always enforce deletions, pass * either {@link DeletesMode#RECACHE} or {@link * DeletesMode#DYNAMIC}. * @param filter Filter to cache results of */	TokenNameCOMMENT_JAVADOC	 New deletes are ignored by default, which gives higher cache hit rate on reopened readers. Most of the time this is safe, because the filter will be AND'd with a Query that fully enforces deletions. If instead you need this filter to always enforce deletions, pass either {@link DeletesMode#RECACHE} or {@link DeletesMode#DYNAMIC}. @param filter Filter to cache results of 
public	TokenNamepublic	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
IGNORE	TokenNameIdentifier	 IGNORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: by default, the cached filter will be shared * across reopened segments that only had changes to their * deletions. * * @param filter Filter to cache results of * @param deletesMode See {@link DeletesMode} */	TokenNameCOMMENT_JAVADOC	 Expert: by default, the cached filter will be shared across reopened segments that only had changes to their deletions. * @param filter Filter to cache results of @param deletesMode See {@link DeletesMode} 
public	TokenNamepublic	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
DeletesMode	TokenNameIdentifier	 Deletes Mode
deletesMode	TokenNameIdentifier	 deletes Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
FilterCache	TokenNameIdentifier	 Filter Cache
<	TokenNameLESS	
DocIdSet	TokenNameIdentifier	 Doc Id Set
>	TokenNameGREATER	
(	TokenNameLPAREN	
deletesMode	TokenNameIdentifier	 deletes Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
mergeDeletes	TokenNameIdentifier	 merge Deletes
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
final	TokenNamefinal	
DocIdSet	TokenNameIdentifier	 Doc Id Set
docIdSet	TokenNameIdentifier	 doc Id Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FilteredDocIdSet	TokenNameIdentifier	 Filtered Doc Id Set
(	TokenNameLPAREN	
docIdSet	TokenNameIdentifier	 doc Id Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Provide the DocIdSet to be cached, using the DocIdSet provided * by the wrapped Filter. * <p>This implementation returns the given {@link DocIdSet}, if {@link DocIdSet#isCacheable} * returns <code>true</code>, else it copies the {@link DocIdSetIterator} into * an {@link FixedBitSet}. */	TokenNameCOMMENT_JAVADOC	 Provide the DocIdSet to be cached, using the DocIdSet provided by the wrapped Filter. <p>This implementation returns the given {@link DocIdSet}, if {@link DocIdSet#isCacheable} returns <code>true</code>, else it copies the {@link DocIdSetIterator} into an {@link FixedBitSet}. 
protected	TokenNameprotected	
DocIdSet	TokenNameIdentifier	 Doc Id Set
docIdSetToCache	TokenNameIdentifier	 doc Id Set To Cache
(	TokenNameLPAREN	
DocIdSet	TokenNameIdentifier	 Doc Id Set
docIdSet	TokenNameIdentifier	 doc Id Set
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docIdSet	TokenNameIdentifier	 doc Id Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this is better than returning null, as the nonnull result can be cached 	TokenNameCOMMENT_LINE	this is better than returning null, as the nonnull result can be cached 
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
docIdSet	TokenNameIdentifier	 doc Id Set
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docIdSet	TokenNameIdentifier	 doc Id Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
docIdSet	TokenNameIdentifier	 doc Id Set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// null is allowed to be returned by iterator(), 	TokenNameCOMMENT_LINE	null is allowed to be returned by iterator(), 
// in this case we wrap with the empty set, 	TokenNameCOMMENT_LINE	in this case we wrap with the empty set, 
// which is cacheable. 	TokenNameCOMMENT_LINE	which is cacheable. 
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// for testing 	TokenNameCOMMENT_LINE	for testing 
int	TokenNameint	
hitCount	TokenNameIdentifier	 hit Count
,	TokenNameCOMMA	
missCount	TokenNameIdentifier	 miss Count
;	TokenNameSEMICOLON	
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
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
coreKey	TokenNameIdentifier	 core Key
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getCoreCacheKey	TokenNameIdentifier	 get Core Cache Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
delCoreKey	TokenNameIdentifier	 del Core Key
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getDeletesCacheKey	TokenNameIdentifier	 get Deletes Cache Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
coreKey	TokenNameIdentifier	 core Key
;	TokenNameSEMICOLON	
DocIdSet	TokenNameIdentifier	 Doc Id Set
docIdSet	TokenNameIdentifier	 doc Id Set
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
coreKey	TokenNameIdentifier	 core Key
,	TokenNameCOMMA	
delCoreKey	TokenNameIdentifier	 del Core Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docIdSet	TokenNameIdentifier	 doc Id Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hitCount	TokenNameIdentifier	 hit Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docIdSet	TokenNameIdentifier	 doc Id Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
missCount	TokenNameIdentifier	 miss Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// cache miss 	TokenNameCOMMENT_LINE	cache miss 
docIdSet	TokenNameIdentifier	 doc Id Set
=	TokenNameEQUAL	
docIdSetToCache	TokenNameIdentifier	 doc Id Set To Cache
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docIdSet	TokenNameIdentifier	 doc Id Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
coreKey	TokenNameIdentifier	 core Key
,	TokenNameCOMMA	
delCoreKey	TokenNameIdentifier	 del Core Key
,	TokenNameCOMMA	
docIdSet	TokenNameIdentifier	 doc Id Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
docIdSet	TokenNameIdentifier	 doc Id Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CachingWrapperFilter("	TokenNameStringLiteral	CachingWrapperFilter(
+	TokenNamePLUS	
filter	TokenNameIdentifier	 filter
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x1117BF25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
