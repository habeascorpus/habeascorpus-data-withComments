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
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Simple concurrent LRU cache, using a "double barrel" * approach where two ConcurrentHashMaps record entries. * * <p>At any given time, one hash is primary and the other * is secondary. {@link #get} first checks primary, and if * that's a miss, checks secondary. If secondary has the * entry, it's promoted to primary (<b>NOTE</b>: the key is * cloned at this point). Once primary is full, the * secondary is cleared and the two are swapped.</p> * * <p>This is not as space efficient as other possible * concurrent approaches (see LUCENE-2075): to achieve * perfect LRU(N) it requires 2*N storage. But, this * approach is relatively simple and seems in practice to * not grow unbounded in size when under hideously high * load.</p> * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Simple concurrent LRU cache, using a "double barrel" approach where two ConcurrentHashMaps record entries. * <p>At any given time, one hash is primary and the other is secondary. {@link #get} first checks primary, and if that's a miss, checks secondary. If secondary has the entry, it's promoted to primary (<b>NOTE</b>: the key is cloned at this point). Once primary is full, the secondary is cleared and the two are swapped.</p> * <p>This is not as space efficient as other possible concurrent approaches (see LUCENE-2075): to achieve perfect LRU(N) it requires 2*N storage. But, this approach is relatively simple and seems in practice to not grow unbounded in size when under hideously high load.</p> * @lucene.internal 
final	TokenNamefinal	
public	TokenNamepublic	
class	TokenNameclass	
DoubleBarrelLRUCache	TokenNameIdentifier	 Double Barrel LRU Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
extends	TokenNameextends	
DoubleBarrelLRUCache	TokenNameIdentifier	 Double Barrel LRU Cache
.	TokenNameDOT	
CloneableKey	TokenNameIdentifier	 Cloneable Key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** Object providing clone(); the key class must subclass this. */	TokenNameCOMMENT_JAVADOC	 Object providing clone(); the key class must subclass this. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
CloneableKey	TokenNameIdentifier	 Cloneable Key
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
abstract	TokenNameabstract	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
cache1	TokenNameIdentifier	 cache1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
cache2	TokenNameIdentifier	 cache2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
countdown	TokenNameIdentifier	 countdown
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
swapped	TokenNameIdentifier	 swapped
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DoubleBarrelLRUCache	TokenNameIdentifier	 Double Barrel LRU Cache
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
countdown	TokenNameIdentifier	 countdown
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache1	TokenNameIdentifier	 cache1
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache2	TokenNameIdentifier	 cache2
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
primary	TokenNameIdentifier	 primary
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
secondary	TokenNameIdentifier	 secondary
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
swapped	TokenNameIdentifier	 swapped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
primary	TokenNameIdentifier	 primary
=	TokenNameEQUAL	
cache2	TokenNameIdentifier	 cache2
;	TokenNameSEMICOLON	
secondary	TokenNameIdentifier	 secondary
=	TokenNameEQUAL	
cache1	TokenNameIdentifier	 cache1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
primary	TokenNameIdentifier	 primary
=	TokenNameEQUAL	
cache1	TokenNameIdentifier	 cache1
;	TokenNameSEMICOLON	
secondary	TokenNameIdentifier	 secondary
=	TokenNameEQUAL	
cache2	TokenNameIdentifier	 cache2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Try primary first 	TokenNameCOMMENT_LINE	Try primary first 
V	TokenNameIdentifier	 V
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
primary	TokenNameIdentifier	 primary
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not found -- try secondary 	TokenNameCOMMENT_LINE	Not found -- try secondary 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
secondary	TokenNameIdentifier	 secondary
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Promote to primary 	TokenNameCOMMENT_LINE	Promote to primary 
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
primary	TokenNameIdentifier	 primary
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
secondary	TokenNameIdentifier	 secondary
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
swapped	TokenNameIdentifier	 swapped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
primary	TokenNameIdentifier	 primary
=	TokenNameEQUAL	
cache2	TokenNameIdentifier	 cache2
;	TokenNameSEMICOLON	
secondary	TokenNameIdentifier	 secondary
=	TokenNameEQUAL	
cache1	TokenNameIdentifier	 cache1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
primary	TokenNameIdentifier	 primary
=	TokenNameEQUAL	
cache1	TokenNameIdentifier	 cache1
;	TokenNameSEMICOLON	
secondary	TokenNameIdentifier	 secondary
=	TokenNameEQUAL	
cache2	TokenNameIdentifier	 cache2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
primary	TokenNameIdentifier	 primary
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
countdown	TokenNameIdentifier	 countdown
.	TokenNameDOT	
decrementAndGet	TokenNameIdentifier	 decrement And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Time to swap 	TokenNameCOMMENT_LINE	Time to swap 
// NOTE: there is saturation risk here, that the 	TokenNameCOMMENT_LINE	NOTE: there is saturation risk here, that the 
// thread that's doing the clear() takes too long to 	TokenNameCOMMENT_LINE	thread that's doing the clear() takes too long to 
// do so, while other threads continue to add to 	TokenNameCOMMENT_LINE	do so, while other threads continue to add to 
// primary, but in practice this seems not to be an 	TokenNameCOMMENT_LINE	primary, but in practice this seems not to be an 
// issue (see LUCENE-2075 for benchmark & details) 	TokenNameCOMMENT_LINE	issue (see LUCENE-2075 for benchmark & details) 
// First, clear secondary 	TokenNameCOMMENT_LINE	First, clear secondary 
secondary	TokenNameIdentifier	 secondary
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Second, swap 	TokenNameCOMMENT_LINE	Second, swap 
swapped	TokenNameIdentifier	 swapped
=	TokenNameEQUAL	
!	TokenNameNOT	
swapped	TokenNameIdentifier	 swapped
;	TokenNameSEMICOLON	
// Third, reset countdown 	TokenNameCOMMENT_LINE	Third, reset countdown 
countdown	TokenNameIdentifier	 countdown
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
