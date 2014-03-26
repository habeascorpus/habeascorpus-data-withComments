/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
SoftReference	TokenNameIdentifier	 Soft Reference
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * This class manages a cache of soft references to objects that may * take some time to load or create, such as images loaded from the * network. * * <p>Adding an object is two fold:</p> * <ul> * <li> * First you add the key, this lets the cache know that someone is * working on that key. * </li> * <li> * Then when the completed object is ready you put it into the cache. * </li> * </ul> * <p> * If someone requests a key after it has been added but before it has * been put they will be blocked until the put. * </p> * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: SoftReferenceCache.java 588550 2007-10-26 07:52:41Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class manages a cache of soft references to objects that may take some time to load or create, such as images loaded from the network. * <p>Adding an object is two fold:</p> <ul> <li> First you add the key, this lets the cache know that someone is working on that key. </li> <li> Then when the completed object is ready you put it into the cache. </li> </ul> <p> If someone requests a key after it has been added but before it has been put they will be blocked until the put. </p> * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: SoftReferenceCache.java 588550 2007-10-26 07:52:41Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SoftReferenceCache	TokenNameIdentifier	 Soft Reference Cache
{	TokenNameLBRACE	
/** * The map of cached objects. Must not change after creation, * so it's final. */	TokenNameCOMMENT_JAVADOC	 The map of cached objects. Must not change after creation, so it's final. 
protected	TokenNameprotected	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Let people create their own caches. */	TokenNameCOMMENT_JAVADOC	 Let people create their own caches. 
protected	TokenNameprotected	
SoftReferenceCache	TokenNameIdentifier	 Soft Reference Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Let people flush the cache (remove any cached data). Pending * requests will be treated as though clear() was called on the * key, this should cause them to go and re-read the data. */	TokenNameCOMMENT_JAVADOC	 Let people flush the cache (remove any cached data). Pending requests will be treated as though clear() was called on the key, this should cause them to go and re-read the data. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if <tt>request(key)</tt> will return with an Object * (not putting you on the hook for it). Note that it is possible * that this will return true but between this call and the call * to request the soft-reference will be cleared. So it * is still possible for request to return NULL, just much less * likely (you can always call 'clear' in that case). */	TokenNameCOMMENT_JAVADOC	 Check if <tt>request(key)</tt> will return with an Object (not putting you on the hook for it). Note that it is possible that this will return true but between this call and the call to request the soft-reference will be cleared. So it is still possible for request to return NULL, just much less likely (you can always call 'clear' in that case). 
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isPresentImpl	TokenNameIdentifier	 is Present Impl
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// It's been requested but hasn't been 'put' yet. 	TokenNameCOMMENT_LINE	It's been requested but hasn't been 'put' yet. 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// It's been put let's make sure the soft reference hasn't 	TokenNameCOMMENT_LINE	It's been put let's make sure the soft reference hasn't 
// been cleared. 	TokenNameCOMMENT_LINE	been cleared. 
SoftReference	TokenNameIdentifier	 Soft Reference
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SoftReference	TokenNameIdentifier	 Soft Reference
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Soft reference was cleared, so remove our record of key. 	TokenNameCOMMENT_LINE	Soft reference was cleared, so remove our record of key. 
clearImpl	TokenNameIdentifier	 clear Impl
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if <tt>request(key)</tt> will return immediately with the * Object. Note that it is possible that this will return * true but between this call and the call to request the * soft-reference will be cleared. */	TokenNameCOMMENT_JAVADOC	 Check if <tt>request(key)</tt> will return immediately with the Object. Note that it is possible that this will return true but between this call and the call to request the soft-reference will be cleared. 
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isDoneImpl	TokenNameIdentifier	 is Done Impl
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
SoftReference	TokenNameIdentifier	 Soft Reference
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SoftReference	TokenNameIdentifier	 Soft Reference
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Soft reference was cleared 	TokenNameCOMMENT_LINE	Soft reference was cleared 
clearImpl	TokenNameIdentifier	 clear Impl
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If this returns null then you are now 'on the hook'. * to put the Object associated with key into the * cache. */	TokenNameCOMMENT_JAVADOC	 If this returns null then you are now 'on the hook'. to put the Object associated with key into the cache. 
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
requestImpl	TokenNameIdentifier	 request Impl
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// When something is cleared or put we will be notified. 	TokenNameCOMMENT_LINE	When something is cleared or put we will be notified. 
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// check if key was cleared, if so it will most likely 	TokenNameCOMMENT_LINE	check if key was cleared, if so it will most likely 
// never be 'put'. 	TokenNameCOMMENT_LINE	never be 'put'. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Let's see if it was put... 	TokenNameCOMMENT_LINE	Let's see if it was put... 
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SoftReference	TokenNameIdentifier	 Soft Reference
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SoftReference	TokenNameIdentifier	 Soft Reference
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// So now the caller get's the hot potato. 	TokenNameCOMMENT_LINE	So now the caller get's the hot potato. 
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clear the entry for key. * This is the easiest way to 'get off the hook'. * if you didn't intend to get on it. */	TokenNameCOMMENT_JAVADOC	 Clear the entry for key. This is the easiest way to 'get off the hook'. if you didn't intend to get on it. 
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
clearImpl	TokenNameIdentifier	 clear Impl
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Associate object with key. 'object' is only referenced through * a soft reference so don't rely on the cache to keep it * around. If the map no longer contains our url it was * probably cleared or flushed since we were put on the hook * for it, so in that case we will do nothing. */	TokenNameCOMMENT_JAVADOC	 Associate object with key. 'object' is only referenced through a soft reference so don't rely on the cache to keep it around. If the map no longer contains our url it was probably cleared or flushed since we were put on the hook for it, so in that case we will do nothing. 
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
putImpl	TokenNameIdentifier	 put Impl
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SoftReference	TokenNameIdentifier	 Soft Reference
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
new	TokenNamenew	
SoftRefKey	TokenNameIdentifier	 Soft Ref Key
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
SoftRefKey	TokenNameIdentifier	 Soft Ref Key
extends	TokenNameextends	
CleanerThread	TokenNameIdentifier	 Cleaner Thread
.	TokenNameDOT	
SoftReferenceCleared	TokenNameIdentifier	 Soft Reference Cleared
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SoftRefKey	TokenNameIdentifier	 Soft Ref Key
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cleared	TokenNameIdentifier	 cleared
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SoftReferenceCache	TokenNameIdentifier	 Soft Reference Cache
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
SoftReferenceCache	TokenNameIdentifier	 Soft Reference Cache
.	TokenNameDOT	
this	TokenNamethis	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Can't really happen. 	TokenNameCOMMENT_LINE	Can't really happen. 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Notify other threads that they may have 	TokenNameCOMMENT_LINE	Notify other threads that they may have 
// to provide this resource now. 	TokenNameCOMMENT_LINE	to provide this resource now. 
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Must not have been ours put it back... 	TokenNameCOMMENT_LINE	Must not have been ours put it back... 
// Can happen if a clear is done. 	TokenNameCOMMENT_LINE	Can happen if a clear is done. 
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
