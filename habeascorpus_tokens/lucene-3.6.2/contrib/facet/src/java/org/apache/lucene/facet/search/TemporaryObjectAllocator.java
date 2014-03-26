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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentLinkedQueue	TokenNameIdentifier	 Concurrent Linked Queue
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An TemporaryObjectAllocator is an object which manages large, reusable, * temporary objects needed during multiple concurrent computations. The idea * is to remember some of the previously allocated temporary objects, and * reuse them if possible to avoid constant allocation and garbage-collection * of these objects. * <P> * This technique is useful for temporary counter arrays in faceted search * (see {@link FacetsAccumulator}), which can be reused across searches instead * of being allocated afresh on every search. * <P> * A TemporaryObjectAllocator is thread-safe. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An TemporaryObjectAllocator is an object which manages large, reusable, temporary objects needed during multiple concurrent computations. The idea is to remember some of the previously allocated temporary objects, and reuse them if possible to avoid constant allocation and garbage-collection of these objects. <P> This technique is useful for temporary counter arrays in faceted search (see {@link FacetsAccumulator}), which can be reused across searches instead of being allocated afresh on every search. <P> A TemporaryObjectAllocator is thread-safe. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TemporaryObjectAllocator	TokenNameIdentifier	 Temporary Object Allocator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
// In the "pool" we hold up to "maxObjects" old objects, and if the pool 	TokenNameCOMMENT_LINE	In the "pool" we hold up to "maxObjects" old objects, and if the pool 
// is not empty, we return one of its objects rather than allocating a new 	TokenNameCOMMENT_LINE	is not empty, we return one of its objects rather than allocating a new 
// one. 	TokenNameCOMMENT_LINE	one. 
ConcurrentLinkedQueue	TokenNameIdentifier	 Concurrent Linked Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
pool	TokenNameIdentifier	 pool
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentLinkedQueue	TokenNameIdentifier	 Concurrent Linked Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxObjects	TokenNameIdentifier	 max Objects
;	TokenNameSEMICOLON	
/** * Construct an allocator for objects of a certain type, keeping around a * pool of up to <CODE>maxObjects</CODE> old objects. * <P> * Note that the pool size only restricts the number of objects that hang * around when not needed, but <I>not</I> the maximum number of objects * that are allocated when actually is use: If a number of concurrent * threads ask for an allocation, all of them will get an object, even if * their number is greater than maxObjects. If an application wants to * limit the number of concurrent threads making allocations, it needs to * do so on its own - for example by blocking new threads until the * existing ones have finished. If more than maxObjects are freed, only * maxObjects of them will be kept in the pool - the rest will not and * will eventually be garbage-collected by Java. * <P> * In particular, when maxObjects=0, this object behaves as a trivial * allocator, always allocating a new array and never reusing an old one. */	TokenNameCOMMENT_JAVADOC	 Construct an allocator for objects of a certain type, keeping around a pool of up to <CODE>maxObjects</CODE> old objects. <P> Note that the pool size only restricts the number of objects that hang around when not needed, but <I>not</I> the maximum number of objects that are allocated when actually is use: If a number of concurrent threads ask for an allocation, all of them will get an object, even if their number is greater than maxObjects. If an application wants to limit the number of concurrent threads making allocations, it needs to do so on its own - for example by blocking new threads until the existing ones have finished. If more than maxObjects are freed, only maxObjects of them will be kept in the pool - the rest will not and will eventually be garbage-collected by Java. <P> In particular, when maxObjects=0, this object behaves as a trivial allocator, always allocating a new array and never reusing an old one. 
public	TokenNamepublic	
TemporaryObjectAllocator	TokenNameIdentifier	 Temporary Object Allocator
(	TokenNameLPAREN	
int	TokenNameint	
maxObjects	TokenNameIdentifier	 max Objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxObjects	TokenNameIdentifier	 max Objects
=	TokenNameEQUAL	
maxObjects	TokenNameIdentifier	 max Objects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subclasses must override this method to actually create a new object * of the desired type. * */	TokenNameCOMMENT_JAVADOC	 Subclasses must override this method to actually create a new object of the desired type. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Subclasses must override this method to clear an existing object of * the desired type, to prepare it for reuse. Note that objects will be * cleared just before reuse (on allocation), not when freed. */	TokenNameCOMMENT_JAVADOC	 Subclasses must override this method to clear an existing object of the desired type, to prepare it for reuse. Note that objects will be cleared just before reuse (on allocation), not when freed. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Allocate a new object. If there's a previously allocated object in our * pool, we return it immediately. Otherwise, a new object is allocated. * <P> * Don't forget to call {@link #free(Object)} when you're done with the object, * to return it to the pool. If you don't, memory is <I>not</I> leaked, * but the pool will remain empty and a new object will be allocated each * time (just like the maxArrays=0 case). */	TokenNameCOMMENT_JAVADOC	 Allocate a new object. If there's a previously allocated object in our pool, we return it immediately. Otherwise, a new object is allocated. <P> Don't forget to call {@link #free(Object)} when you're done with the object, to return it to the pool. If you don't, memory is <I>not</I> leaked, but the pool will remain empty and a new object will be allocated each time (just like the maxArrays=0 case). 
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
object	TokenNameIdentifier	 object
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
object	TokenNameIdentifier	 object
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a no-longer-needed object back to the pool. If we already have * enough objects in the pool (maxObjects as specified in the constructor), * the array will not be saved, and Java will eventually garbage collect * it. * <P> * In particular, when maxArrays=0, the given array is never saved and * free does nothing. */	TokenNameCOMMENT_JAVADOC	 Return a no-longer-needed object back to the pool. If we already have enough objects in the pool (maxObjects as specified in the constructor), the array will not be saved, and Java will eventually garbage collect it. <P> In particular, when maxArrays=0, the given array is never saved and free does nothing. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
maxObjects	TokenNameIdentifier	 max Objects
&&	TokenNameAND_AND	
object	TokenNameIdentifier	 object
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
