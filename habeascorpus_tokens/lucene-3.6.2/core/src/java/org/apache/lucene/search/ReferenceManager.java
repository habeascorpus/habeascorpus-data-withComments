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
Closeable	TokenNameIdentifier	 Closeable
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Semaphore	TokenNameIdentifier	 Semaphore
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
;	TokenNameSEMICOLON	
/** * Utility class to safely share instances of a certain type across multiple * threads, while periodically refreshing them. This class ensures each * reference is closed only once all threads have finished using it. It is * recommended to consult the documentation of {@link ReferenceManager} * implementations for their {@link #maybeRefresh()} semantics. * * @param <G> * the concrete type that will be {@link #acquire() acquired} and * {@link #release(Object) released}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Utility class to safely share instances of a certain type across multiple threads, while periodically refreshing them. This class ensures each reference is closed only once all threads have finished using it. It is recommended to consult the documentation of {@link ReferenceManager} implementations for their {@link #maybeRefresh()} semantics. * @param <G> the concrete type that will be {@link #acquire() acquired} and {@link #release(Object) released}. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ReferenceManager	TokenNameIdentifier	 Reference Manager
<	TokenNameLESS	
G	TokenNameIdentifier	 G
>	TokenNameGREATER	
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REFERENCE_MANAGER_IS_CLOSED_MSG	TokenNameIdentifier	 REFERENCE  MANAGER  IS  CLOSED  MSG
=	TokenNameEQUAL	
"this ReferenceManager is closed"	TokenNameStringLiteral	this ReferenceManager is closed
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
volatile	TokenNamevolatile	
G	TokenNameIdentifier	 G
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Semaphore	TokenNameIdentifier	 Semaphore
reopenLock	TokenNameIdentifier	 reopen Lock
=	TokenNameEQUAL	
new	TokenNamenew	
Semaphore	TokenNameIdentifier	 Semaphore
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
REFERENCE_MANAGER_IS_CLOSED_MSG	TokenNameIdentifier	 REFERENCE  MANAGER  IS  CLOSED  MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
swapReference	TokenNameIdentifier	 swap Reference
(	TokenNameLPAREN	
G	TokenNameIdentifier	 G
newReference	TokenNameIdentifier	 new Reference
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
G	TokenNameIdentifier	 G
oldReference	TokenNameIdentifier	 old Reference
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
newReference	TokenNameIdentifier	 new Reference
;	TokenNameSEMICOLON	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
oldReference	TokenNameIdentifier	 old Reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Decrement reference counting on the given reference. */	TokenNameCOMMENT_JAVADOC	 Decrement reference counting on the given reference. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
G	TokenNameIdentifier	 G
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Refresh the given reference if needed. Returns {@code null} if no refresh * was needed, otherwise a new refreshed reference. */	TokenNameCOMMENT_JAVADOC	 Refresh the given reference if needed. Returns {@code null} if no refresh was needed, otherwise a new refreshed reference. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
G	TokenNameIdentifier	 G
refreshIfNeeded	TokenNameIdentifier	 refresh If Needed
(	TokenNameLPAREN	
G	TokenNameIdentifier	 G
referenceToRefresh	TokenNameIdentifier	 reference To Refresh
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Try to increment reference counting on the given reference. Return true if * the operation was successful. */	TokenNameCOMMENT_JAVADOC	 Try to increment reference counting on the given reference. Return true if the operation was successful. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
tryIncRef	TokenNameIdentifier	 try Inc Ref
(	TokenNameLPAREN	
G	TokenNameIdentifier	 G
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Obtain the current reference. You must match every call to acquire with one * call to {@link #release}; it's best to do so in a finally clause, and set * the reference to {@code null} to prevent accidental usage after it has been * released. */	TokenNameCOMMENT_JAVADOC	 Obtain the current reference. You must match every call to acquire with one call to {@link #release}; it's best to do so in a finally clause, and set the reference to {@code null} to prevent accidental usage after it has been released. 
public	TokenNamepublic	
final	TokenNamefinal	
G	TokenNameIdentifier	 G
acquire	TokenNameIdentifier	 acquire
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
G	TokenNameIdentifier	 G
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
REFERENCE_MANAGER_IS_CLOSED_MSG	TokenNameIdentifier	 REFERENCE  MANAGER  IS  CLOSED  MSG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
tryIncRef	TokenNameIdentifier	 try Inc Ref
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close this ReferenceManager to future {@link #acquire() acquiring}. Any * references that were previously {@link #acquire() acquired} won't be * affected, and they should still be {@link #release released} when they are * not needed anymore. */	TokenNameCOMMENT_JAVADOC	 Close this ReferenceManager to future {@link #acquire() acquiring}. Any references that were previously {@link #acquire() acquired} won't be affected, and they should still be {@link #release released} when they are not needed anymore. 
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make sure we can call this more than once 	TokenNameCOMMENT_LINE	make sure we can call this more than once 
// closeable javadoc says: 	TokenNameCOMMENT_LINE	closeable javadoc says: 
// if this is already closed then invoking this method has no effect. 	TokenNameCOMMENT_LINE	if this is already closed then invoking this method has no effect. 
swapReference	TokenNameIdentifier	 swap Reference
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
afterClose	TokenNameIdentifier	 after Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Called after close(), so subclass can free any resources. */	TokenNameCOMMENT_JAVADOC	 Called after close(), so subclass can free any resources. 
protected	TokenNameprotected	
void	TokenNamevoid	
afterClose	TokenNameIdentifier	 after Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * You must call this, periodically, if you want that {@link #acquire()} will * return refreshed instances. * * <p> * <b>Threads</b>: it's fine for more than one thread to call this at once. * Only the first thread will attempt the refresh; subsequent threads will see * that another thread is already handling refresh and will return * immediately. Note that this means if another thread is already refreshing * then subsequent threads will return right away without waiting for the * refresh to complete. * * <p> * If this method returns true it means the calling thread either refreshed * or that there were no changes to refresh. If it returns false it means another * thread is currently refreshing. */	TokenNameCOMMENT_JAVADOC	 You must call this, periodically, if you want that {@link #acquire()} will return refreshed instances. * <p> <b>Threads</b>: it's fine for more than one thread to call this at once. Only the first thread will attempt the refresh; subsequent threads will see that another thread is already handling refresh and will return immediately. Note that this means if another thread is already refreshing then subsequent threads will return right away without waiting for the refresh to complete. * <p> If this method returns true it means the calling thread either refreshed or that there were no changes to refresh. If it returns false it means another thread is currently refreshing. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
maybeRefresh	TokenNameIdentifier	 maybe Refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ensure only 1 thread does reopen at once; other threads just return immediately: 	TokenNameCOMMENT_LINE	Ensure only 1 thread does reopen at once; other threads just return immediately: 
final	TokenNamefinal	
boolean	TokenNameboolean	
doTryRefresh	TokenNameIdentifier	 do Try Refresh
=	TokenNameEQUAL	
reopenLock	TokenNameIdentifier	 reopen Lock
.	TokenNameDOT	
tryAcquire	TokenNameIdentifier	 try Acquire
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doTryRefresh	TokenNameIdentifier	 do Try Refresh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
G	TokenNameIdentifier	 G
reference	TokenNameIdentifier	 reference
=	TokenNameEQUAL	
acquire	TokenNameIdentifier	 acquire
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
G	TokenNameIdentifier	 G
newReference	TokenNameIdentifier	 new Reference
=	TokenNameEQUAL	
refreshIfNeeded	TokenNameIdentifier	 refresh If Needed
(	TokenNameLPAREN	
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReference	TokenNameIdentifier	 new Reference
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
newReference	TokenNameIdentifier	 new Reference
!=	TokenNameNOT_EQUAL	
reference	TokenNameIdentifier	 reference
:	TokenNameCOLON	
"refreshIfNeeded should return null if refresh wasn't needed"	TokenNameStringLiteral	refreshIfNeeded should return null if refresh wasn't needed
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
swapReference	TokenNameIdentifier	 swap Reference
(	TokenNameLPAREN	
newReference	TokenNameIdentifier	 new Reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
newReference	TokenNameIdentifier	 new Reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
afterRefresh	TokenNameIdentifier	 after Refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
reopenLock	TokenNameIdentifier	 reopen Lock
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
doTryRefresh	TokenNameIdentifier	 do Try Refresh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Called after swapReference has installed a new * instance. */	TokenNameCOMMENT_JAVADOC	 Called after swapReference has installed a new instance. 
protected	TokenNameprotected	
void	TokenNamevoid	
afterRefresh	TokenNameIdentifier	 after Refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Release the refernce previously obtained via {@link #acquire()}. * <p> * <b>NOTE:</b> it's safe to call this after {@link #close()}. */	TokenNameCOMMENT_JAVADOC	 Release the refernce previously obtained via {@link #acquire()}. <p> <b>NOTE:</b> it's safe to call this after {@link #close()}. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
G	TokenNameIdentifier	 G
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
reference	TokenNameIdentifier	 reference
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
