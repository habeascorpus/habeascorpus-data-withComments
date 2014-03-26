/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ExecutionException	TokenNameIdentifier	 Execution Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
CacheServiceMBean	TokenNameIdentifier	 Cache Service M Bean
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
getRowCacheSavePeriodInSeconds	TokenNameIdentifier	 get Row Cache Save Period In Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setRowCacheSavePeriodInSeconds	TokenNameIdentifier	 set Row Cache Save Period In Seconds
(	TokenNameLPAREN	
int	TokenNameint	
rcspis	TokenNameIdentifier	 rcspis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getKeyCacheSavePeriodInSeconds	TokenNameIdentifier	 get Key Cache Save Period In Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setKeyCacheSavePeriodInSeconds	TokenNameIdentifier	 set Key Cache Save Period In Seconds
(	TokenNameLPAREN	
int	TokenNameint	
kcspis	TokenNameIdentifier	 kcspis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * invalidate the key cache; for use after invalidating row cache */	TokenNameCOMMENT_JAVADOC	 invalidate the key cache; for use after invalidating row cache 
public	TokenNamepublic	
void	TokenNamevoid	
invalidateKeyCache	TokenNameIdentifier	 invalidate Key Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * invalidate the row cache; for use after bulk loading via BinaryMemtable */	TokenNameCOMMENT_JAVADOC	 invalidate the row cache; for use after bulk loading via BinaryMemtable 
public	TokenNamepublic	
void	TokenNamevoid	
invalidateRowCache	TokenNameIdentifier	 invalidate Row Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setRowCacheCapacityInMB	TokenNameIdentifier	 set Row Cache Capacity In MB
(	TokenNameLPAREN	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setKeyCacheCapacityInMB	TokenNameIdentifier	 set Key Cache Capacity In MB
(	TokenNameLPAREN	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * sets each cache's maximum capacity to "reduce_cache_capacity_to" of its current size */	TokenNameCOMMENT_JAVADOC	 sets each cache's maximum capacity to "reduce_cache_capacity_to" of its current size 
public	TokenNamepublic	
void	TokenNamevoid	
reduceCacheSizes	TokenNameIdentifier	 reduce Cache Sizes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * save row and key caches * * @throws ExecutionException when attempting to retrieve the result of a task that aborted by throwing an exception * @throws InterruptedException when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity. */	TokenNameCOMMENT_JAVADOC	 save row and key caches * @throws ExecutionException when attempting to retrieve the result of a task that aborted by throwing an exception @throws InterruptedException when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity. 
public	TokenNamepublic	
void	TokenNamevoid	
saveCaches	TokenNameIdentifier	 save Caches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ExecutionException	TokenNameIdentifier	 Execution Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// remaining methods are provided for backwards compatibility; modern clients should use CacheMetrics instead 	TokenNameCOMMENT_LINE	remaining methods are provided for backwards compatibility; modern clients should use CacheMetrics instead 
// 	TokenNameCOMMENT_LINE	 
/** * @see org.apache.cassandra.metrics.CacheMetrics#hits */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#hits 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getKeyCacheHits	TokenNameIdentifier	 get Key Cache Hits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#hits */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#hits 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getRowCacheHits	TokenNameIdentifier	 get Row Cache Hits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#requests */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#requests 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getKeyCacheRequests	TokenNameIdentifier	 get Key Cache Requests
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#requests */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#requests 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getRowCacheRequests	TokenNameIdentifier	 get Row Cache Requests
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#hitRate */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#hitRate 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getKeyCacheRecentHitRate	TokenNameIdentifier	 get Key Cache Recent Hit Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#hitRate */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#hitRate 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getRowCacheRecentHitRate	TokenNameIdentifier	 get Row Cache Recent Hit Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#capacity */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#capacity 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getRowCacheCapacityInMB	TokenNameIdentifier	 get Row Cache Capacity In MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#capacity */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#capacity 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getRowCacheCapacityInBytes	TokenNameIdentifier	 get Row Cache Capacity In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#capacity */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#capacity 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getKeyCacheCapacityInMB	TokenNameIdentifier	 get Key Cache Capacity In MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#capacity */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#capacity 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getKeyCacheCapacityInBytes	TokenNameIdentifier	 get Key Cache Capacity In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#size */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#size 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getRowCacheSize	TokenNameIdentifier	 get Row Cache Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#entries */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#entries 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getRowCacheEntries	TokenNameIdentifier	 get Row Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#size */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#size 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getKeyCacheSize	TokenNameIdentifier	 get Key Cache Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.CacheMetrics#entries */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.CacheMetrics#entries 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getKeyCacheEntries	TokenNameIdentifier	 get Key Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
