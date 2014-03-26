/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicReference	TokenNameIdentifier	 Atomic Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Preconditions	TokenNameIdentifier	 Preconditions
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
/** * The SlabAllocator is a bump-the-pointer allocator that allocates * large (2MB by default) regions and then doles them out to threads that request * slices into the array. * <p/> * The purpose of this class is to combat heap fragmentation in long lived * objects: by ensuring that all allocations with similar lifetimes * only to large regions of contiguous memory, we ensure that large blocks * get freed up at the same time. * <p/> * Otherwise, variable length byte arrays allocated end up * interleaved throughout the heap, and the old generation gets progressively * more fragmented until a stop-the-world compacting collection occurs. */	TokenNameCOMMENT_JAVADOC	 The SlabAllocator is a bump-the-pointer allocator that allocates large (2MB by default) regions and then doles them out to threads that request slices into the array. <p/> The purpose of this class is to combat heap fragmentation in long lived objects: by ensuring that all allocations with similar lifetimes only to large regions of contiguous memory, we ensure that large blocks get freed up at the same time. <p/> Otherwise, variable length byte arrays allocated end up interleaved throughout the heap, and the old generation gets progressively more fragmented until a stop-the-world compacting collection occurs. 
public	TokenNamepublic	
class	TokenNameclass	
SlabAllocator	TokenNameIdentifier	 Slab Allocator
extends	TokenNameextends	
Allocator	TokenNameIdentifier	 Allocator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SlabAllocator	TokenNameIdentifier	 Slab Allocator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
REGION_SIZE	TokenNameIdentifier	 REGION  SIZE
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
MAX_CLONED_SIZE	TokenNameIdentifier	 MAX  CLONED  SIZE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// bigger than this don't go in the region 	TokenNameCOMMENT_LINE	bigger than this don't go in the region 
private	TokenNameprivate	
final	TokenNamefinal	
AtomicReference	TokenNameIdentifier	 Atomic Reference
<	TokenNameLESS	
Region	TokenNameIdentifier	 Region
>	TokenNameGREATER	
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicReference	TokenNameIdentifier	 Atomic Reference
<	TokenNameLESS	
Region	TokenNameIdentifier	 Region
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
regionCount	TokenNameIdentifier	 region Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
size	TokenNameIdentifier	 size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
;	TokenNameSEMICOLON	
// satisfy large allocations directly from JVM since they don't cause fragmentation 	TokenNameCOMMENT_LINE	satisfy large allocations directly from JVM since they don't cause fragmentation 
// as badly, and fill up our regions quickly 	TokenNameCOMMENT_LINE	as badly, and fill up our regions quickly 
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
MAX_CLONED_SIZE	TokenNameIdentifier	 MAX  CLONED  SIZE
)	TokenNameRPAREN	
return	TokenNamereturn	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Region	TokenNameIdentifier	 Region
region	TokenNameIdentifier	 region
=	TokenNameEQUAL	
getRegion	TokenNameIdentifier	 get Region
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Try to allocate from this region 	TokenNameCOMMENT_LINE	Try to allocate from this region 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
cloned	TokenNameIdentifier	 cloned
=	TokenNameEQUAL	
region	TokenNameIdentifier	 region
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cloned	TokenNameIdentifier	 cloned
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
cloned	TokenNameIdentifier	 cloned
;	TokenNameSEMICOLON	
// not enough space! 	TokenNameCOMMENT_LINE	not enough space! 
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
region	TokenNameIdentifier	 region
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the current region, or, if there is no current region, allocate a new one */	TokenNameCOMMENT_JAVADOC	 Get the current region, or, if there is no current region, allocate a new one 
private	TokenNameprivate	
Region	TokenNameIdentifier	 Region
getRegion	TokenNameIdentifier	 get Region
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Try to get the region 	TokenNameCOMMENT_LINE	Try to get the region 
Region	TokenNameIdentifier	 Region
region	TokenNameIdentifier	 region
=	TokenNameEQUAL	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
region	TokenNameIdentifier	 region
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
region	TokenNameIdentifier	 region
;	TokenNameSEMICOLON	
// No current region, so we want to allocate one. We race 	TokenNameCOMMENT_LINE	No current region, so we want to allocate one. We race 
// against other allocators to CAS in an uninitialized region 	TokenNameCOMMENT_LINE	against other allocators to CAS in an uninitialized region 
// (which is cheap to allocate) 	TokenNameCOMMENT_LINE	(which is cheap to allocate) 
region	TokenNameIdentifier	 region
=	TokenNameEQUAL	
new	TokenNamenew	
Region	TokenNameIdentifier	 Region
(	TokenNameLPAREN	
REGION_SIZE	TokenNameIdentifier	 REGION  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
region	TokenNameIdentifier	 region
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we won race - now we need to actually do the expensive allocation step 	TokenNameCOMMENT_LINE	we won race - now we need to actually do the expensive allocation step 
region	TokenNameIdentifier	 region
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
regionCount	TokenNameIdentifier	 region Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"{} regions now allocated in {}"	TokenNameStringLiteral	{} regions now allocated in {}
,	TokenNameCOMMA	
regionCount	TokenNameIdentifier	 region Count
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
region	TokenNameIdentifier	 region
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// someone else won race - that's fine, we'll try to grab theirs 	TokenNameCOMMENT_LINE	someone else won race - that's fine, we'll try to grab theirs 
// in the next iteration of the loop. 	TokenNameCOMMENT_LINE	in the next iteration of the loop. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A region of memory out of which allocations are sliced. * * This serves two purposes: * - to provide a step between initialization and allocation, so that racing to CAS a * new region in is harmless * - encapsulates the allocation offset */	TokenNameCOMMENT_JAVADOC	 A region of memory out of which allocations are sliced. * This serves two purposes: - to provide a step between initialization and allocation, so that racing to CAS a new region in is harmless - encapsulates the allocation offset 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Region	TokenNameIdentifier	 Region
{	TokenNameLBRACE	
/** * Actual underlying data */	TokenNameCOMMENT_JAVADOC	 Actual underlying data 
private	TokenNameprivate	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNINITIALIZED	TokenNameIdentifier	 UNINITIALIZED
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Offset for the next allocation, or the sentinel value -1 * which implies that the region is still uninitialized. */	TokenNameCOMMENT_JAVADOC	 Offset for the next allocation, or the sentinel value -1 which implies that the region is still uninitialized. 
private	TokenNameprivate	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
nextFreeOffset	TokenNameIdentifier	 next Free Offset
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
UNINITIALIZED	TokenNameIdentifier	 UNINITIALIZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Total number of allocations satisfied from this buffer */	TokenNameCOMMENT_JAVADOC	 Total number of allocations satisfied from this buffer 
private	TokenNameprivate	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
allocCount	TokenNameIdentifier	 alloc Count
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Size of region in bytes */	TokenNameCOMMENT_JAVADOC	 Size of region in bytes 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
/** * Create an uninitialized region. Note that memory is not allocated yet, so * this is cheap. * * @param size in bytes */	TokenNameCOMMENT_JAVADOC	 Create an uninitialized region. Note that memory is not allocated yet, so this is cheap. * @param size in bytes 
private	TokenNameprivate	
Region	TokenNameIdentifier	 Region
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Actually claim the memory for this region. This should only be called from * the thread that constructed the region. It is thread-safe against other * threads calling alloc(), who will block until the allocation is complete. */	TokenNameCOMMENT_JAVADOC	 Actually claim the memory for this region. This should only be called from the thread that constructed the region. It is thread-safe against other threads calling alloc(), who will block until the allocation is complete. 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
nextFreeOffset	TokenNameIdentifier	 next Free Offset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
UNINITIALIZED	TokenNameIdentifier	 UNINITIALIZED
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Mark that it's ready for use 	TokenNameCOMMENT_LINE	Mark that it's ready for use 
boolean	TokenNameboolean	
initted	TokenNameIdentifier	 initted
=	TokenNameEQUAL	
nextFreeOffset	TokenNameIdentifier	 next Free Offset
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
UNINITIALIZED	TokenNameIdentifier	 UNINITIALIZED
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We should always succeed the above CAS since only one thread calls init()! 	TokenNameCOMMENT_LINE	We should always succeed the above CAS since only one thread calls init()! 
Preconditions	TokenNameIdentifier	 Preconditions
.	TokenNameDOT	
checkState	TokenNameIdentifier	 check State
(	TokenNameLPAREN	
initted	TokenNameIdentifier	 initted
,	TokenNameCOMMA	
"Multiple threads tried to init same region"	TokenNameStringLiteral	Multiple threads tried to init same region
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try to allocate <code>size</code> bytes from the region. * * @return the successful allocation, or null to indicate not-enough-space */	TokenNameCOMMENT_JAVADOC	 Try to allocate <code>size</code> bytes from the region. * @return the successful allocation, or null to indicate not-enough-space 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oldOffset	TokenNameIdentifier	 old Offset
=	TokenNameEQUAL	
nextFreeOffset	TokenNameIdentifier	 next Free Offset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldOffset	TokenNameIdentifier	 old Offset
==	TokenNameEQUAL_EQUAL	
UNINITIALIZED	TokenNameIdentifier	 UNINITIALIZED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The region doesn't have its data allocated yet. 	TokenNameCOMMENT_LINE	The region doesn't have its data allocated yet. 
// Since we found this in currentRegion, we know that whoever 	TokenNameCOMMENT_LINE	Since we found this in currentRegion, we know that whoever 
// CAS-ed it there is allocating it right now. So spin-loop 	TokenNameCOMMENT_LINE	CAS-ed it there is allocating it right now. So spin-loop 
// shouldn't spin long! 	TokenNameCOMMENT_LINE	shouldn't spin long! 
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
yield	TokenNameIdentifier	 yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldOffset	TokenNameIdentifier	 old Offset
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// capacity == remaining 	TokenNameCOMMENT_LINE	capacity == remaining 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Try to atomically claim this region 	TokenNameCOMMENT_LINE	Try to atomically claim this region 
if	TokenNameif	
(	TokenNameLPAREN	
nextFreeOffset	TokenNameIdentifier	 next Free Offset
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
oldOffset	TokenNameIdentifier	 old Offset
,	TokenNameCOMMA	
oldOffset	TokenNameIdentifier	 old Offset
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we got the alloc 	TokenNameCOMMENT_LINE	we got the alloc 
allocCount	TokenNameIdentifier	 alloc Count
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
oldOffset	TokenNameIdentifier	 old Offset
)	TokenNameRPAREN	
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
oldOffset	TokenNameIdentifier	 old Offset
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we raced and lost alloc, try again 	TokenNameCOMMENT_LINE	we raced and lost alloc, try again 
}	TokenNameRBRACE	
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
"Region@"	TokenNameStringLiteral	Region@
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
identityHashCode	TokenNameIdentifier	 identity Hash Code
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" allocs="	TokenNameStringLiteral	 allocs=
+	TokenNamePLUS	
allocCount	TokenNameIdentifier	 alloc Count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"waste="	TokenNameStringLiteral	waste=
+	TokenNamePLUS	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
nextFreeOffset	TokenNameIdentifier	 next Free Offset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
