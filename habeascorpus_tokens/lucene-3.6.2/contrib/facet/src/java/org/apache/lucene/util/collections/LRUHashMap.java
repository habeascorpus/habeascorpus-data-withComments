package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
collections	TokenNameIdentifier	 collections
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * LRUHashMap is an extension of Java's HashMap, which has a bounded size(); * When it reaches that size, each time a new element is added, the least * recently used (LRU) entry is removed. * <p> * Java makes it very easy to implement LRUHashMap - all its functionality is * already available from {@link java.util.LinkedHashMap}, and we just need to * configure that properly. * <p> * Note that like HashMap, LRUHashMap is unsynchronized, and the user MUST * synchronize the access to it if used from several threads. Moreover, while * with HashMap this is only a concern if one of the threads is modifies the * map, with LURHashMap every read is a modification (because the LRU order * needs to be remembered) so proper synchronization is always necessary. * <p> * With the usual synchronization mechanisms available to the user, this * unfortunately means that LRUHashMap will probably perform sub-optimally under * heavy contention: while one thread uses the hash table (reads or writes), any * other thread will be blocked from using it - or even just starting to use it * (e.g., calculating the hash function). A more efficient approach would be not * to use LinkedHashMap at all, but rather to use a non-locking (as much as * possible) thread-safe solution, something along the lines of * java.util.concurrent.ConcurrentHashMap (though that particular class does not * support the additional LRU semantics, which will need to be added separately * using a concurrent linked list or additional storage of timestamps (in an * array or inside the entry objects), or whatever). * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 LRUHashMap is an extension of Java's HashMap, which has a bounded size(); When it reaches that size, each time a new element is added, the least recently used (LRU) entry is removed. <p> Java makes it very easy to implement LRUHashMap - all its functionality is already available from {@link java.util.LinkedHashMap}, and we just need to configure that properly. <p> Note that like HashMap, LRUHashMap is unsynchronized, and the user MUST synchronize the access to it if used from several threads. Moreover, while with HashMap this is only a concern if one of the threads is modifies the map, with LURHashMap every read is a modification (because the LRU order needs to be remembered) so proper synchronization is always necessary. <p> With the usual synchronization mechanisms available to the user, this unfortunately means that LRUHashMap will probably perform sub-optimally under heavy contention: while one thread uses the hash table (reads or writes), any other thread will be blocked from using it - or even just starting to use it (e.g., calculating the hash function). A more efficient approach would be not to use LinkedHashMap at all, but rather to use a non-locking (as much as possible) thread-safe solution, something along the lines of java.util.concurrent.ConcurrentHashMap (though that particular class does not support the additional LRU semantics, which will need to be added separately using a concurrent linked list or additional storage of timestamps (in an array or inside the entry objects), or whatever). * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
LRUHashMap	TokenNameIdentifier	 LRU Hash Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
extends	TokenNameextends	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
/** * Create a new hash map with a bounded size and with least recently * used entries removed. * @param maxSize * the maximum size (in number of entries) to which the map can grow * before the least recently used entries start being removed.<BR> * Setting maxSize to a very large value, like * {@link Integer#MAX_VALUE} is allowed, but is less efficient than * using {@link java.util.HashMap} because our class needs * to keep track of the use order (via an additional doubly-linked * list) which is not used when the map's size is always below the * maximum size. */	TokenNameCOMMENT_JAVADOC	 Create a new hash map with a bounded size and with least recently used entries removed. @param maxSize the maximum size (in number of entries) to which the map can grow before the least recently used entries start being removed.<BR> Setting maxSize to a very large value, like {@link Integer#MAX_VALUE} is allowed, but is less efficient than using {@link java.util.HashMap} because our class needs to keep track of the use order (via an additional doubly-linked list) which is not used when the map's size is always below the maximum size. 
public	TokenNamepublic	
LRUHashMap	TokenNameIdentifier	 LRU Hash Map
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.75f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the max size */	TokenNameCOMMENT_JAVADOC	 Return the max size 
public	TokenNamepublic	
int	TokenNameint	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * setMaxSize() allows changing the map's maximal number of elements * which was defined at construction time. * <P> * Note that if the map is already larger than maxSize, the current * implementation does not shrink it (by removing the oldest elements); * Rather, the map remains in its current size as new elements are * added, and will only start shrinking (until settling again on the * give maxSize) if existing elements are explicitly deleted. */	TokenNameCOMMENT_JAVADOC	 setMaxSize() allows changing the map's maximal number of elements which was defined at construction time. <P> Note that if the map is already larger than maxSize, the current implementation does not shrink it (by removing the oldest elements); Rather, the map remains in its current size as new elements are added, and will only start shrinking (until settling again on the give maxSize) if existing elements are explicitly deleted. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxSize	TokenNameIdentifier	 set Max Size
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We override LinkedHashMap's removeEldestEntry() method. This method 	TokenNameCOMMENT_LINE	We override LinkedHashMap's removeEldestEntry() method. This method 
// is called every time a new entry is added, and if we return true 	TokenNameCOMMENT_LINE	is called every time a new entry is added, and if we return true 
// here, the eldest element will be deleted automatically. In our case, 	TokenNameCOMMENT_LINE	here, the eldest element will be deleted automatically. In our case, 
// we return true if the size of the map grew beyond our limit - ignoring 	TokenNameCOMMENT_LINE	we return true if the size of the map grew beyond our limit - ignoring 
// what is that eldest element that we'll be deleting. 	TokenNameCOMMENT_LINE	what is that eldest element that we'll be deleting. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
removeEldestEntry	TokenNameIdentifier	 remove Eldest Entry
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
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
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
