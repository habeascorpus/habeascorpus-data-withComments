package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
WeakReference	TokenNameIdentifier	 Weak Reference
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
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
;	TokenNameSEMICOLON	
/** Java's builtin ThreadLocal has a serious flaw: * it can take an arbitrarily long amount of time to * dereference the things you had stored in it, even once the * ThreadLocal instance itself is no longer referenced. * This is because there is single, master map stored for * each thread, which all ThreadLocals share, and that * master map only periodically purges "stale" entries. * * While not technically a memory leak, because eventually * the memory will be reclaimed, it can take a long time * and you can easily hit OutOfMemoryError because from the * GC's standpoint the stale entries are not reclaimable. * * This class works around that, by only enrolling * WeakReference values into the ThreadLocal, and * separately holding a hard reference to each stored * value. When you call {@link #close}, these hard * references are cleared and then GC is freely able to * reclaim space by objects stored in it. * * We can not rely on {@link ThreadLocal#remove()} as it * only removes the value for the caller thread, whereas * {@link #close} takes care of all * threads. You should not call {@link #close} until all * threads are done using the instance. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Java's builtin ThreadLocal has a serious flaw: it can take an arbitrarily long amount of time to dereference the things you had stored in it, even once the ThreadLocal instance itself is no longer referenced. This is because there is single, master map stored for each thread, which all ThreadLocals share, and that master map only periodically purges "stale" entries. * While not technically a memory leak, because eventually the memory will be reclaimed, it can take a long time and you can easily hit OutOfMemoryError because from the GC's standpoint the stale entries are not reclaimable. * This class works around that, by only enrolling WeakReference values into the ThreadLocal, and separately holding a hard reference to each stored value. When you call {@link #close}, these hard references are cleared and then GC is freely able to reclaim space by objects stored in it. * We can not rely on {@link ThreadLocal#remove()} as it only removes the value for the caller thread, whereas {@link #close} takes care of all threads. You should not call {@link #close} until all threads are done using the instance. * @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
private	TokenNameprivate	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use a WeakHashMap so that if a Thread exits and is 	TokenNameCOMMENT_LINE	Use a WeakHashMap so that if a Thread exits and is 
// GC'able, its entry may be removed: 	TokenNameCOMMENT_LINE	GC'able, its entry may be removed: 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Thread	TokenNameIdentifier	 Thread
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
hardRefs	TokenNameIdentifier	 hard Refs
=	TokenNameEQUAL	
new	TokenNamenew	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
<	TokenNameLESS	
Thread	TokenNameIdentifier	 Thread
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Increase this to decrease frequency of purging in get: 	TokenNameCOMMENT_LINE	Increase this to decrease frequency of purging in get: 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
PURGE_MULTIPLIER	TokenNameIdentifier	 PURGE  MULTIPLIER
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// On each get or set we decrement this; when it hits 0 we 	TokenNameCOMMENT_LINE	On each get or set we decrement this; when it hits 0 we 
// purge. After purge, we set this to 	TokenNameCOMMENT_LINE	purge. After purge, we set this to 
// PURGE_MULTIPLIER * stillAliveCount. This keeps 	TokenNameCOMMENT_LINE	PURGE_MULTIPLIER * stillAliveCount. This keeps 
// amortized cost of purging linear. 	TokenNameCOMMENT_LINE	amortized cost of purging linear. 
private	TokenNameprivate	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
countUntilPurge	TokenNameIdentifier	 count Until Purge
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
PURGE_MULTIPLIER	TokenNameIdentifier	 PURGE  MULTIPLIER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
T	TokenNameIdentifier	 T
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
weakRef	TokenNameIdentifier	 weak Ref
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
weakRef	TokenNameIdentifier	 weak Ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
iv	TokenNameIdentifier	 iv
=	TokenNameEQUAL	
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iv	TokenNameIdentifier	 iv
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
iv	TokenNameIdentifier	 iv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
iv	TokenNameIdentifier	 iv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
maybePurge	TokenNameIdentifier	 maybe Purge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
weakRef	TokenNameIdentifier	 weak Ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
new	TokenNamenew	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
hardRefs	TokenNameIdentifier	 hard Refs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hardRefs	TokenNameIdentifier	 hard Refs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maybePurge	TokenNameIdentifier	 maybe Purge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
maybePurge	TokenNameIdentifier	 maybe Purge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countUntilPurge	TokenNameIdentifier	 count Until Purge
.	TokenNameDOT	
getAndDecrement	TokenNameIdentifier	 get And Decrement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
purge	TokenNameIdentifier	 purge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Purge dead threads 	TokenNameCOMMENT_LINE	Purge dead threads 
private	TokenNameprivate	
void	TokenNamevoid	
purge	TokenNameIdentifier	 purge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
hardRefs	TokenNameIdentifier	 hard Refs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
stillAliveCount	TokenNameIdentifier	 still Alive Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Thread	TokenNameIdentifier	 Thread
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
hardRefs	TokenNameIdentifier	 hard Refs
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stillAliveCount	TokenNameIdentifier	 still Alive Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
nextCount	TokenNameIdentifier	 next Count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
stillAliveCount	TokenNameIdentifier	 still Alive Count
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
PURGE_MULTIPLIER	TokenNameIdentifier	 PURGE  MULTIPLIER
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextCount	TokenNameIdentifier	 next Count
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// defensive: int overflow! 	TokenNameCOMMENT_LINE	defensive: int overflow! 
nextCount	TokenNameIdentifier	 next Count
=	TokenNameEQUAL	
1000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
countUntilPurge	TokenNameIdentifier	 count Until Purge
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
nextCount	TokenNameIdentifier	 next Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Clear the hard refs; then, the only remaining refs to 	TokenNameCOMMENT_LINE	Clear the hard refs; then, the only remaining refs to 
// all values we were storing are weak (unless somewhere 	TokenNameCOMMENT_LINE	all values we were storing are weak (unless somewhere 
// else is still using them) and so GC may reclaim them: 	TokenNameCOMMENT_LINE	else is still using them) and so GC may reclaim them: 
hardRefs	TokenNameIdentifier	 hard Refs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Take care of the current thread right now; others will be 	TokenNameCOMMENT_LINE	Take care of the current thread right now; others will be 
// taken care of via the WeakReferences. 	TokenNameCOMMENT_LINE	taken care of via the WeakReferences. 
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
