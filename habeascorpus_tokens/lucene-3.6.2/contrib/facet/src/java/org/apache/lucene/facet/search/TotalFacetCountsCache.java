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
File	TokenNameIdentifier	 File
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentLinkedQueue	TokenNameIdentifier	 Concurrent Linked Queue
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
CategoryListParams	TokenNameIdentifier	 Category List Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
CategoryListCache	TokenNameIdentifier	 Category List Cache
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Manage an LRU cache for {@link TotalFacetCounts} per index, taxonomy, and * facet indexing params. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Manage an LRU cache for {@link TotalFacetCounts} per index, taxonomy, and facet indexing params. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TotalFacetCountsCache	TokenNameIdentifier	 Total Facet Counts Cache
{	TokenNameLBRACE	
/** * Default size of in memory cache for computed total facet counts. * Set to 2 for the case when an application reopened a reader and * the original one is still in use (Otherwise there will be * switching again and again between the two.) */	TokenNameCOMMENT_JAVADOC	 Default size of in memory cache for computed total facet counts. Set to 2 for the case when an application reopened a reader and the original one is still in use (Otherwise there will be switching again and again between the two.) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_CACHE_SIZE	TokenNameIdentifier	 DEFAULT  CACHE  SIZE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
TotalFacetCountsCache	TokenNameIdentifier	 Total Facet Counts Cache
singleton	TokenNameIdentifier	 singleton
=	TokenNameEQUAL	
new	TokenNamenew	
TotalFacetCountsCache	TokenNameIdentifier	 Total Facet Counts Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the single instance of this cache */	TokenNameCOMMENT_JAVADOC	 Get the single instance of this cache 
public	TokenNamepublic	
static	TokenNamestatic	
TotalFacetCountsCache	TokenNameIdentifier	 Total Facet Counts Cache
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
singleton	TokenNameIdentifier	 singleton
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * In-memory cache of TFCs. * <ul> * <li>It's size is kept within limits through {@link #trimCache()}. * <li>An LRU eviction policy is applied, by maintaining active keys in {@link #lruKeys}. * <li>After each addition to the cache, trimCache is called, to remove entries least recently used. * </ul> * @see #markRecentlyUsed(TFCKey) */	TokenNameCOMMENT_JAVADOC	 In-memory cache of TFCs. <ul> <li>It's size is kept within limits through {@link #trimCache()}. <li>An LRU eviction policy is applied, by maintaining active keys in {@link #lruKeys}. <li>After each addition to the cache, trimCache is called, to remove entries least recently used. </ul> @see #markRecentlyUsed(TFCKey) 
private	TokenNameprivate	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
TFCKey	TokenNameIdentifier	 TFC Key
,	TokenNameCOMMA	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
TFCKey	TokenNameIdentifier	 TFC Key
,	TokenNameCOMMA	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A queue of active keys for applying LRU policy on eviction from the {@link #cache}. * @see #markRecentlyUsed(TFCKey) */	TokenNameCOMMENT_JAVADOC	 A queue of active keys for applying LRU policy on eviction from the {@link #cache}. @see #markRecentlyUsed(TFCKey) 
private	TokenNameprivate	
ConcurrentLinkedQueue	TokenNameIdentifier	 Concurrent Linked Queue
<	TokenNameLESS	
TFCKey	TokenNameIdentifier	 TFC Key
>	TokenNameGREATER	
lruKeys	TokenNameIdentifier	 lru Keys
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentLinkedQueue	TokenNameIdentifier	 Concurrent Linked Queue
<	TokenNameLESS	
TFCKey	TokenNameIdentifier	 TFC Key
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxCacheSize	TokenNameIdentifier	 max Cache Size
=	TokenNameEQUAL	
DEFAULT_CACHE_SIZE	TokenNameIdentifier	 DEFAULT  CACHE  SIZE
;	TokenNameSEMICOLON	
/** private constructor for singleton pattern */	TokenNameCOMMENT_JAVADOC	 private constructor for singleton pattern 
private	TokenNameprivate	
TotalFacetCountsCache	TokenNameIdentifier	 Total Facet Counts Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get the total facet counts for a reader/taxonomy pair and facet indexing parameters. * If not in cache, computed here and added to the cache for later use. * @param indexReader the documents index * @param taxonomy the taxonomy index * @param facetIndexingParams facet indexing parameters * @param clCache category list cache for faster computation, can be null * @return the total facet counts. */	TokenNameCOMMENT_JAVADOC	 Get the total facet counts for a reader/taxonomy pair and facet indexing parameters. If not in cache, computed here and added to the cache for later use. @param indexReader the documents index @param taxonomy the taxonomy index @param facetIndexingParams facet indexing parameters @param clCache category list cache for faster computation, can be null @return the total facet counts. 
public	TokenNamepublic	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
getTotalCounts	TokenNameIdentifier	 get Total Counts
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomy	TokenNameIdentifier	 taxonomy
,	TokenNameCOMMA	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
,	TokenNameCOMMA	
CategoryListCache	TokenNameIdentifier	 Category List Cache
clCache	TokenNameIdentifier	 cl Cache
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// create the key 	TokenNameCOMMENT_LINE	create the key 
TFCKey	TokenNameIdentifier	 TFC Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
TFCKey	TokenNameIdentifier	 TFC Key
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomy	TokenNameIdentifier	 taxonomy
,	TokenNameCOMMA	
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// it is important that this call is not synchronized, so that available TFC 	TokenNameCOMMENT_LINE	it is important that this call is not synchronized, so that available TFC 
// would not wait for one that needs to be computed. 	TokenNameCOMMENT_LINE	would not wait for one that needs to be computed. 
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
tfc	TokenNameIdentifier	 tfc
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tfc	TokenNameIdentifier	 tfc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
markRecentlyUsed	TokenNameIdentifier	 mark Recently Used
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tfc	TokenNameIdentifier	 tfc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
computeAndCache	TokenNameIdentifier	 compute And Cache
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
clCache	TokenNameIdentifier	 cl Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Mark key as it as recently used. * <p> * <b>Implementation notes: Synchronization considerations and the interaction between lruKeys and cache:</b> * <ol> * <li>A concurrent {@link LinkedHashMap} would have made this class much simpler. * But unfortunately, Java does not provide one. * Instead, we combine two concurrent objects: * <ul> * <li>{@link ConcurrentHashMap} for the cached TFCs. * <li>{@link ConcurrentLinkedQueue} for active keys * </ul> * <li>Both {@link #lruKeys} and {@link #cache} are concurrently safe. * <li>Checks for a cached item through getTotalCounts() are not synchronized. * Therefore, the case that a needed TFC is in the cache is very fast: * it does not wait for the computation of other TFCs. * <li>computeAndCache() is synchronized, and, has a (double) check of the required * TFC, to avoid computing the same TFC twice. * <li>A race condition in this method (markRecentlyUsed) might result in two copies * of the same 'key' in lruKeys, but this is handled by the loop in trimCache(), * where an attempt to remove the same key twice is a no-op. * </ol> */	TokenNameCOMMENT_JAVADOC	 Mark key as it as recently used. <p> <b>Implementation notes: Synchronization considerations and the interaction between lruKeys and cache:</b> <ol> <li>A concurrent {@link LinkedHashMap} would have made this class much simpler. But unfortunately, Java does not provide one. Instead, we combine two concurrent objects: <ul> <li>{@link ConcurrentHashMap} for the cached TFCs. <li>{@link ConcurrentLinkedQueue} for active keys </ul> <li>Both {@link #lruKeys} and {@link #cache} are concurrently safe. <li>Checks for a cached item through getTotalCounts() are not synchronized. Therefore, the case that a needed TFC is in the cache is very fast: it does not wait for the computation of other TFCs. <li>computeAndCache() is synchronized, and, has a (double) check of the required TFC, to avoid computing the same TFC twice. <li>A race condition in this method (markRecentlyUsed) might result in two copies of the same 'key' in lruKeys, but this is handled by the loop in trimCache(), where an attempt to remove the same key twice is a no-op. </ol> 
private	TokenNameprivate	
void	TokenNamevoid	
markRecentlyUsed	TokenNameIdentifier	 mark Recently Used
(	TokenNameLPAREN	
TFCKey	TokenNameIdentifier	 TFC Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lruKeys	TokenNameIdentifier	 lru Keys
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lruKeys	TokenNameIdentifier	 lru Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
trimCache	TokenNameIdentifier	 trim Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// loop until cache is of desired size. 	TokenNameCOMMENT_LINE	loop until cache is of desired size. 
while	TokenNamewhile	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxCacheSize	TokenNameIdentifier	 max Cache Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TFCKey	TokenNameIdentifier	 TFC Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
lruKeys	TokenNameIdentifier	 lru Keys
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//defensive 	TokenNameCOMMENT_LINE	defensive 
// it is defensive since lruKeys presumably covers the cache keys 	TokenNameCOMMENT_LINE	it is defensive since lruKeys presumably covers the cache keys 
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// remove this element. Note that an attempt to remove with the same key again is a no-op, 	TokenNameCOMMENT_LINE	remove this element. Note that an attempt to remove with the same key again is a no-op, 
// which gracefully handles the possible race in markRecentlyUsed(). 	TokenNameCOMMENT_LINE	which gracefully handles the possible race in markRecentlyUsed(). 
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * compute TFC and cache it, after verifying it was not just added - for this * matter this method is synchronized, which is not too bad, because there is * lots of work done in the computations. */	TokenNameCOMMENT_JAVADOC	 compute TFC and cache it, after verifying it was not just added - for this matter this method is synchronized, which is not too bad, because there is lots of work done in the computations. 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
computeAndCache	TokenNameIdentifier	 compute And Cache
(	TokenNameLPAREN	
TFCKey	TokenNameIdentifier	 TFC Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
CategoryListCache	TokenNameIdentifier	 Category List Cache
clCache	TokenNameIdentifier	 cl Cache
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
tfc	TokenNameIdentifier	 tfc
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tfc	TokenNameIdentifier	 tfc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tfc	TokenNameIdentifier	 tfc
=	TokenNameEQUAL	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
.	TokenNameDOT	
compute	TokenNameIdentifier	 compute
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
,	TokenNameCOMMA	
clCache	TokenNameIdentifier	 cl Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lruKeys	TokenNameIdentifier	 lru Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
tfc	TokenNameIdentifier	 tfc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trimCache	TokenNameIdentifier	 trim Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tfc	TokenNameIdentifier	 tfc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load {@link TotalFacetCounts} matching input parameters from the provided outputFile * and add them into the cache for the provided indexReader, taxonomy, and facetIndexingParams. * If a {@link TotalFacetCounts} for these parameters already exists in the cache, it will be * replaced by the loaded one. * @param inputFile file from which to read the data * @param indexReader the documents index * @param taxonomy the taxonomy index * @param facetIndexingParams the facet indexing parameters * @throws IOException on error * @see #store(File, IndexReader, TaxonomyReader, FacetIndexingParams, CategoryListCache) */	TokenNameCOMMENT_JAVADOC	 Load {@link TotalFacetCounts} matching input parameters from the provided outputFile and add them into the cache for the provided indexReader, taxonomy, and facetIndexingParams. If a {@link TotalFacetCounts} for these parameters already exists in the cache, it will be replaced by the loaded one. @param inputFile file from which to read the data @param indexReader the documents index @param taxonomy the taxonomy index @param facetIndexingParams the facet indexing parameters @throws IOException on error @see #store(File, IndexReader, TaxonomyReader, FacetIndexingParams, CategoryListCache) 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
inputFile	TokenNameIdentifier	 input File
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomy	TokenNameIdentifier	 taxonomy
,	TokenNameCOMMA	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inputFile	TokenNameIdentifier	 input File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
inputFile	TokenNameIdentifier	 input File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
inputFile	TokenNameIdentifier	 input File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Exepecting an existing readable file: "	TokenNameStringLiteral	Exepecting an existing readable file: 
+	TokenNamePLUS	
inputFile	TokenNameIdentifier	 input File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TFCKey	TokenNameIdentifier	 TFC Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
TFCKey	TokenNameIdentifier	 TFC Key
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomy	TokenNameIdentifier	 taxonomy
,	TokenNameCOMMA	
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
tfc	TokenNameIdentifier	 tfc
=	TokenNameEQUAL	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
.	TokenNameDOT	
loadFromFile	TokenNameIdentifier	 load From File
(	TokenNameLPAREN	
inputFile	TokenNameIdentifier	 input File
,	TokenNameCOMMA	
taxonomy	TokenNameIdentifier	 taxonomy
,	TokenNameCOMMA	
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
tfc	TokenNameIdentifier	 tfc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trimCache	TokenNameIdentifier	 trim Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
markRecentlyUsed	TokenNameIdentifier	 mark Recently Used
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Store the {@link TotalFacetCounts} matching input parameters into the provided outputFile, * making them available for a later call to {@link #load(File, IndexReader, TaxonomyReader, FacetIndexingParams)}. * If these {@link TotalFacetCounts} are available in the cache, they are used. But if they are * not in the cache, this call will first compute them (which will also add them to the cache). * @param outputFile file to store in. * @param indexReader the documents index * @param taxonomy the taxonomy index * @param facetIndexingParams the facet indexing parameters * @param clCache category list cache for faster computation, can be null * @throws IOException on error * @see #load(File, IndexReader, TaxonomyReader, FacetIndexingParams) * @see #getTotalCounts(IndexReader, TaxonomyReader, FacetIndexingParams, CategoryListCache) */	TokenNameCOMMENT_JAVADOC	 Store the {@link TotalFacetCounts} matching input parameters into the provided outputFile, making them available for a later call to {@link #load(File, IndexReader, TaxonomyReader, FacetIndexingParams)}. If these {@link TotalFacetCounts} are available in the cache, they are used. But if they are not in the cache, this call will first compute them (which will also add them to the cache). @param outputFile file to store in. @param indexReader the documents index @param taxonomy the taxonomy index @param facetIndexingParams the facet indexing parameters @param clCache category list cache for faster computation, can be null @throws IOException on error @see #load(File, IndexReader, TaxonomyReader, FacetIndexingParams) @see #getTotalCounts(IndexReader, TaxonomyReader, FacetIndexingParams, CategoryListCache) 
public	TokenNamepublic	
void	TokenNamevoid	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
outputFile	TokenNameIdentifier	 output File
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomy	TokenNameIdentifier	 taxonomy
,	TokenNameCOMMA	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
,	TokenNameCOMMA	
CategoryListCache	TokenNameIdentifier	 Category List Cache
clCache	TokenNameIdentifier	 cl Cache
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
parentFile	TokenNameIdentifier	 parent File
=	TokenNameEQUAL	
outputFile	TokenNameIdentifier	 output File
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
outputFile	TokenNameIdentifier	 output File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
outputFile	TokenNameIdentifier	 output File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
outputFile	TokenNameIdentifier	 output File
.	TokenNameDOT	
canWrite	TokenNameIdentifier	 can Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
outputFile	TokenNameIdentifier	 output File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
parentFile	TokenNameIdentifier	 parent File
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
parentFile	TokenNameIdentifier	 parent File
.	TokenNameDOT	
canWrite	TokenNameIdentifier	 can Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Exepecting a writable file: "	TokenNameStringLiteral	Exepecting a writable file: 
+	TokenNamePLUS	
outputFile	TokenNameIdentifier	 output File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
tfc	TokenNameIdentifier	 tfc
=	TokenNameEQUAL	
getTotalCounts	TokenNameIdentifier	 get Total Counts
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
taxonomy	TokenNameIdentifier	 taxonomy
,	TokenNameCOMMA	
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
,	TokenNameCOMMA	
clCache	TokenNameIdentifier	 cl Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
.	TokenNameDOT	
storeToFile	TokenNameIdentifier	 store To File
(	TokenNameLPAREN	
outputFile	TokenNameIdentifier	 output File
,	TokenNameCOMMA	
tfc	TokenNameIdentifier	 tfc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TFCKey	TokenNameIdentifier	 TFC Key
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomy	TokenNameIdentifier	 taxonomy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
clps	TokenNameIdentifier	 clps
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
nDels	TokenNameIdentifier	 n Dels
;	TokenNameSEMICOLON	
// needed when a reader used for faceted search was just used for deletion. 	TokenNameCOMMENT_LINE	needed when a reader used for faceted search was just used for deletion. 
final	TokenNamefinal	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TFCKey	TokenNameIdentifier	 TFC Key
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomy	TokenNameIdentifier	 taxonomy
,	TokenNameCOMMA	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
=	TokenNameEQUAL	
taxonomy	TokenNameIdentifier	 taxonomy
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
=	TokenNameEQUAL	
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clps	TokenNameIdentifier	 clps
=	TokenNameEQUAL	
facetIndexingParams	TokenNameIdentifier	 facet Indexing Params
.	TokenNameDOT	
getAllCategoryListParams	TokenNameIdentifier	 get All Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nDels	TokenNameIdentifier	 n Dels
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
numDeletedDocs	TokenNameIdentifier	 num Deleted Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
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
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TFCKey	TokenNameIdentifier	 TFC Key
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TFCKey	TokenNameIdentifier	 TFC Key
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
||	TokenNameOR_OR	
taxonomy	TokenNameIdentifier	 taxonomy
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
||	TokenNameOR_OR	
nDels	TokenNameIdentifier	 n Dels
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
nDels	TokenNameIdentifier	 n Dels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
it1	TokenNameIdentifier	 it1
=	TokenNameEQUAL	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
it2	TokenNameIdentifier	 it2
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it1	TokenNameIdentifier	 it1
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
it1	TokenNameIdentifier	 it1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
it1	TokenNameIdentifier	 it1
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Clear the cache. */	TokenNameCOMMENT_JAVADOC	 Clear the cache. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lruKeys	TokenNameIdentifier	 lru Keys
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the maximal cache size */	TokenNameCOMMENT_JAVADOC	 @return the maximal cache size 
public	TokenNamepublic	
int	TokenNameint	
getCacheSize	TokenNameIdentifier	 get Cache Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxCacheSize	TokenNameIdentifier	 max Cache Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the number of TotalFacetCounts arrays that will remain in memory cache. * <p> * If new size is smaller than current size, the cache is appropriately trimmed. * <p> * Minimal size is 1, so passing zero or negative size would result in size of 1. * @param size new size to set */	TokenNameCOMMENT_JAVADOC	 Set the number of TotalFacetCounts arrays that will remain in memory cache. <p> If new size is smaller than current size, the cache is appropriately trimmed. <p> Minimal size is 1, so passing zero or negative size would result in size of 1. @param size new size to set 
public	TokenNamepublic	
void	TokenNamevoid	
setCacheSize	TokenNameIdentifier	 set Cache Size
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
origSize	TokenNameIdentifier	 orig Size
=	TokenNameEQUAL	
maxCacheSize	TokenNameIdentifier	 max Cache Size
;	TokenNameSEMICOLON	
maxCacheSize	TokenNameIdentifier	 max Cache Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxCacheSize	TokenNameIdentifier	 max Cache Size
<	TokenNameLESS	
origSize	TokenNameIdentifier	 orig Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// need to trim only if the cache was reduced 	TokenNameCOMMENT_LINE	need to trim only if the cache was reduced 
trimCache	TokenNameIdentifier	 trim Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
