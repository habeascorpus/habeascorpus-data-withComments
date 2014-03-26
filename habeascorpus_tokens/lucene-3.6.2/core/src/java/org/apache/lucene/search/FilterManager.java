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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
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
ThreadInterruptedException	TokenNameIdentifier	 Thread Interrupted Exception
;	TokenNameSEMICOLON	
/** * Filter caching singleton. It can be used to save filters locally for reuse. * This class makes it possible to cache Filters even when using RMI, as it * keeps the cache on the searcher side of the RMI connection. * * Also could be used as a persistent storage for any filter as long as the * filter provides a proper hashCode(), as that is used as the key in the cache. * * The cache is periodically cleaned up from a separate thread to ensure the * cache doesn't exceed the maximum size. * * @deprecated used by remote package which is deprecated as well. You should * use {@link CachingWrapperFilter} if you wish to cache * {@link Filter}s. */	TokenNameCOMMENT_JAVADOC	 Filter caching singleton. It can be used to save filters locally for reuse. This class makes it possible to cache Filters even when using RMI, as it keeps the cache on the searcher side of the RMI connection. * Also could be used as a persistent storage for any filter as long as the filter provides a proper hashCode(), as that is used as the key in the cache. * The cache is periodically cleaned up from a separate thread to ensure the cache doesn't exceed the maximum size. * @deprecated used by remote package which is deprecated as well. You should use {@link CachingWrapperFilter} if you wish to cache {@link Filter}s. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
FilterManager	TokenNameIdentifier	 Filter Manager
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
FilterManager	TokenNameIdentifier	 Filter Manager
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
/** The default maximum number of Filters in the cache */	TokenNameCOMMENT_JAVADOC	 The default maximum number of Filters in the cache 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_CACHE_CLEAN_SIZE	TokenNameIdentifier	 DEFAULT  CACHE  CLEAN  SIZE
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The default frequency of cache cleanup */	TokenNameCOMMENT_JAVADOC	 The default frequency of cache cleanup 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
DEFAULT_CACHE_SLEEP_TIME	TokenNameIdentifier	 DEFAULT  CACHE  SLEEP  TIME
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The cache itself */	TokenNameCOMMENT_JAVADOC	 The cache itself 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
FilterItem	TokenNameIdentifier	 Filter Item
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
/** Maximum allowed cache size */	TokenNameCOMMENT_JAVADOC	 Maximum allowed cache size 
protected	TokenNameprotected	
int	TokenNameint	
cacheCleanSize	TokenNameIdentifier	 cache Clean Size
;	TokenNameSEMICOLON	
/** Cache cleaning frequency */	TokenNameCOMMENT_JAVADOC	 Cache cleaning frequency 
protected	TokenNameprotected	
long	TokenNamelong	
cleanSleepTime	TokenNameIdentifier	 clean Sleep Time
;	TokenNameSEMICOLON	
/** Cache cleaner that runs in a separate thread */	TokenNameCOMMENT_JAVADOC	 Cache cleaner that runs in a separate thread 
protected	TokenNameprotected	
FilterCleaner	TokenNameIdentifier	 Filter Cleaner
filterCleaner	TokenNameIdentifier	 filter Cleaner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
static	TokenNamestatic	
FilterManager	TokenNameIdentifier	 Filter Manager
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
manager	TokenNameIdentifier	 manager
=	TokenNameEQUAL	
new	TokenNamenew	
FilterManager	TokenNameIdentifier	 Filter Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets up the FilterManager singleton. */	TokenNameCOMMENT_JAVADOC	 Sets up the FilterManager singleton. 
protected	TokenNameprotected	
FilterManager	TokenNameIdentifier	 Filter Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
FilterItem	TokenNameIdentifier	 Filter Item
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cacheCleanSize	TokenNameIdentifier	 cache Clean Size
=	TokenNameEQUAL	
DEFAULT_CACHE_CLEAN_SIZE	TokenNameIdentifier	 DEFAULT  CACHE  CLEAN  SIZE
;	TokenNameSEMICOLON	
// Let the cache get to 100 items 	TokenNameCOMMENT_LINE	Let the cache get to 100 items 
cleanSleepTime	TokenNameIdentifier	 clean Sleep Time
=	TokenNameEQUAL	
DEFAULT_CACHE_SLEEP_TIME	TokenNameIdentifier	 DEFAULT  CACHE  SLEEP  TIME
;	TokenNameSEMICOLON	
// 10 minutes between cleanings 	TokenNameCOMMENT_LINE	10 minutes between cleanings 
filterCleaner	TokenNameIdentifier	 filter Cleaner
=	TokenNameEQUAL	
new	TokenNamenew	
FilterCleaner	TokenNameIdentifier	 Filter Cleaner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
fcThread	TokenNameIdentifier	 fc Thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
filterCleaner	TokenNameIdentifier	 filter Cleaner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set to be a Daemon so it doesn't have to be stopped 	TokenNameCOMMENT_LINE	set to be a Daemon so it doesn't have to be stopped 
fcThread	TokenNameIdentifier	 fc Thread
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fcThread	TokenNameIdentifier	 fc Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the max size that cache should reach before it is cleaned up * @param cacheCleanSize maximum allowed cache size */	TokenNameCOMMENT_JAVADOC	 Sets the max size that cache should reach before it is cleaned up @param cacheCleanSize maximum allowed cache size 
public	TokenNamepublic	
void	TokenNamevoid	
setCacheSize	TokenNameIdentifier	 set Cache Size
(	TokenNameLPAREN	
int	TokenNameint	
cacheCleanSize	TokenNameIdentifier	 cache Clean Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cacheCleanSize	TokenNameIdentifier	 cache Clean Size
=	TokenNameEQUAL	
cacheCleanSize	TokenNameIdentifier	 cache Clean Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the cache cleaning frequency in milliseconds. * @param cleanSleepTime cleaning frequency in milliseconds */	TokenNameCOMMENT_JAVADOC	 Sets the cache cleaning frequency in milliseconds. @param cleanSleepTime cleaning frequency in milliseconds 
public	TokenNamepublic	
void	TokenNamevoid	
setCleanThreadSleepTime	TokenNameIdentifier	 set Clean Thread Sleep Time
(	TokenNameLPAREN	
long	TokenNamelong	
cleanSleepTime	TokenNameIdentifier	 clean Sleep Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cleanSleepTime	TokenNameIdentifier	 clean Sleep Time
=	TokenNameEQUAL	
cleanSleepTime	TokenNameIdentifier	 clean Sleep Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the cached version of the filter. Allows the caller to pass up * a small filter but this will keep a persistent version around and allow * the caching filter to do its job. * * @param filter The input filter * @return The cached version of the filter */	TokenNameCOMMENT_JAVADOC	 Returns the cached version of the filter. Allows the caller to pass up a small filter but this will keep a persistent version around and allow the caching filter to do its job. * @param filter The input filter @return The cached version of the filter 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterItem	TokenNameIdentifier	 Filter Item
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
FilterItem	TokenNameIdentifier	 Filter Item
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Holds the filter and the last time the filter was used, to make LRU-based * cache cleaning possible. * TODO: Clean this up when we switch to Java 1.5 */	TokenNameCOMMENT_JAVADOC	 Holds the filter and the last time the filter was used, to make LRU-based cache cleaning possible. TODO: Clean this up when we switch to Java 1.5 
protected	TokenNameprotected	
class	TokenNameclass	
FilterItem	TokenNameIdentifier	 Filter Item
{	TokenNameLBRACE	
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilterItem	TokenNameIdentifier	 Filter Item
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
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Keeps the cache from getting too big. * If we were using Java 1.5, we could use LinkedHashMap and we would not need this thread * to clean out the cache. * * The SortedSet sortedFilterItems is used only to sort the items from the cache, * so when it's time to clean up we have the TreeSet sort the FilterItems by * timestamp. * * Removes 1.5 * the numbers of items to make the cache smaller. * For example: * If cache clean size is 10, and the cache is at 15, we would remove (15 - 10) * 1.5 = 7.5 round up to 8. * This way we clean the cache a bit more, and avoid having the cache cleaner having to do it frequently. */	TokenNameCOMMENT_JAVADOC	 Keeps the cache from getting too big. If we were using Java 1.5, we could use LinkedHashMap and we would not need this thread to clean out the cache. * The SortedSet sortedFilterItems is used only to sort the items from the cache, so when it's time to clean up we have the TreeSet sort the FilterItems by timestamp. * Removes 1.5 the numbers of items to make the cache smaller. For example: If cache clean size is 10, and the cache is at 15, we would remove (15 - 10) 1.5 = 7.5 round up to 8. This way we clean the cache a bit more, and avoid having the cache cleaner having to do it frequently. 
protected	TokenNameprotected	
class	TokenNameclass	
FilterCleaner	TokenNameIdentifier	 Filter Cleaner
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
running	TokenNameIdentifier	 running
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
FilterItem	TokenNameIdentifier	 Filter Item
>>	TokenNameRIGHT_SHIFT	
sortedFilterItems	TokenNameIdentifier	 sorted Filter Items
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilterCleaner	TokenNameIdentifier	 Filter Cleaner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortedFilterItems	TokenNameIdentifier	 sorted Filter Items
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
FilterItem	TokenNameIdentifier	 Filter Item
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
FilterItem	TokenNameIdentifier	 Filter Item
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
FilterItem	TokenNameIdentifier	 Filter Item
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
FilterItem	TokenNameIdentifier	 Filter Item
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterItem	TokenNameIdentifier	 Filter Item
fia	TokenNameIdentifier	 fia
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterItem	TokenNameIdentifier	 Filter Item
fib	TokenNameIdentifier	 fib
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fia	TokenNameIdentifier	 fia
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
==	TokenNameEQUAL_EQUAL	
fib	TokenNameIdentifier	 fib
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// smaller timestamp first 	TokenNameCOMMENT_LINE	smaller timestamp first 
if	TokenNameif	
(	TokenNameLPAREN	
fia	TokenNameIdentifier	 fia
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
<	TokenNameLESS	
fib	TokenNameIdentifier	 fib
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// larger timestamp last 	TokenNameCOMMENT_LINE	larger timestamp last 
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
running	TokenNameIdentifier	 running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// sort items from oldest to newest 	TokenNameCOMMENT_LINE	sort items from oldest to newest 
// we delete the oldest filters 	TokenNameCOMMENT_LINE	we delete the oldest filters 
if	TokenNameif	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
cacheCleanSize	TokenNameIdentifier	 cache Clean Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty the temporary set 	TokenNameCOMMENT_LINE	empty the temporary set 
sortedFilterItems	TokenNameIdentifier	 sorted Filter Items
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortedFilterItems	TokenNameIdentifier	 sorted Filter Items
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
FilterItem	TokenNameIdentifier	 Filter Item
>>	TokenNameRIGHT_SHIFT	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
sortedFilterItems	TokenNameIdentifier	 sorted Filter Items
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numToDelete	TokenNameIdentifier	 num To Delete
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
cacheCleanSize	TokenNameIdentifier	 cache Clean Size
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// loop over the set and delete all of the cache entries not used in a while 	TokenNameCOMMENT_LINE	loop over the set and delete all of the cache entries not used in a while 
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
<	TokenNameLESS	
numToDelete	TokenNameIdentifier	 num To Delete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
FilterItem	TokenNameIdentifier	 Filter Item
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// empty the set so we don't tie up the memory 	TokenNameCOMMENT_LINE	empty the set so we don't tie up the memory 
sortedFilterItems	TokenNameIdentifier	 sorted Filter Items
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// take a nap 	TokenNameCOMMENT_LINE	take a nap 
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
cleanSleepTime	TokenNameIdentifier	 clean Sleep Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ThreadInterruptedException	TokenNameIdentifier	 Thread Interrupted Exception
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
