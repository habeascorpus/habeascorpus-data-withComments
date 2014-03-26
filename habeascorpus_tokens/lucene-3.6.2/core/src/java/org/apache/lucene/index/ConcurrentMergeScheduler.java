package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CollectionUtil	TokenNameIdentifier	 Collection Util
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
/** A {@link MergeScheduler} that runs each merge using a * separate thread. * * <p>Specify the max number of threads that may run at * once with {@link #setMaxThreadCount}.</p> * * <p>Separately specify the maximum number of simultaneous * merges with {@link #setMaxMergeCount}. If the number of * merges exceeds the max number of threads then the * largest merges are paused until one of the smaller * merges completes.</p> * * <p>If more than {@link #getMaxMergeCount} merges are * requested then this class will forcefully throttle the * incoming threads by pausing until one more more merges * complete.</p> */	TokenNameCOMMENT_JAVADOC	 A {@link MergeScheduler} that runs each merge using a separate thread. * <p>Specify the max number of threads that may run at once with {@link #setMaxThreadCount}.</p> * <p>Separately specify the maximum number of simultaneous merges with {@link #setMaxMergeCount}. If the number of merges exceeds the max number of threads then the largest merges are paused until one of the smaller merges completes.</p> * <p>If more than {@link #getMaxMergeCount} merges are requested then this class will forcefully throttle the incoming threads by pausing until one more more merges complete.</p> 
public	TokenNamepublic	
class	TokenNameclass	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
extends	TokenNameextends	
MergeScheduler	TokenNameIdentifier	 Merge Scheduler
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
mergeThreadPriority	TokenNameIdentifier	 merge Thread Priority
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MergeThread	TokenNameIdentifier	 Merge Thread
>	TokenNameGREATER	
mergeThreads	TokenNameIdentifier	 merge Threads
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MergeThread	TokenNameIdentifier	 Merge Thread
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Max number of merge threads allowed to be running at 	TokenNameCOMMENT_LINE	Max number of merge threads allowed to be running at 
// once. When there are more merges then this, we 	TokenNameCOMMENT_LINE	once. When there are more merges then this, we 
// forcefully pause the larger ones, letting the smaller 	TokenNameCOMMENT_LINE	forcefully pause the larger ones, letting the smaller 
// ones run, up until maxMergeCount merges at which point 	TokenNameCOMMENT_LINE	ones run, up until maxMergeCount merges at which point 
// we forcefully pause incoming threads (that presumably 	TokenNameCOMMENT_LINE	we forcefully pause incoming threads (that presumably 
// are the ones causing so much merging). We dynamically 	TokenNameCOMMENT_LINE	are the ones causing so much merging). We dynamically 
// default this from 1 to 3, depending on how many cores 	TokenNameCOMMENT_LINE	default this from 1 to 3, depending on how many cores 
// you have: 	TokenNameCOMMENT_LINE	you have: 
private	TokenNameprivate	
int	TokenNameint	
maxThreadCount	TokenNameIdentifier	 max Thread Count
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
availableProcessors	TokenNameIdentifier	 available Processors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Max number of merges we accept before forcefully 	TokenNameCOMMENT_LINE	Max number of merges we accept before forcefully 
// throttling the incoming threads 	TokenNameCOMMENT_LINE	throttling the incoming threads 
private	TokenNameprivate	
int	TokenNameint	
maxMergeCount	TokenNameIdentifier	 max Merge Count
=	TokenNameEQUAL	
maxThreadCount	TokenNameIdentifier	 max Thread Count
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
closed	TokenNameIdentifier	 closed
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
mergeThreadCount	TokenNameIdentifier	 merge Thread Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
allInstances	TokenNameIdentifier	 all Instances
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only for testing 	TokenNameCOMMENT_LINE	Only for testing 
addMyself	TokenNameIdentifier	 add Myself
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sets the max # simultaneous merge threads that should * be running at once. This must be <= {@link * #setMaxMergeCount}. */	TokenNameCOMMENT_JAVADOC	 Sets the max # simultaneous merge threads that should be running at once. This must be <= {@link #setMaxMergeCount}. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxThreadCount	TokenNameIdentifier	 set Max Thread Count
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"count should be at least 1"	TokenNameStringLiteral	count should be at least 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
maxMergeCount	TokenNameIdentifier	 max Merge Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"count should be <= maxMergeCount (= "	TokenNameStringLiteral	count should be <= maxMergeCount (= 
+	TokenNamePLUS	
maxMergeCount	TokenNameIdentifier	 max Merge Count
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxThreadCount	TokenNameIdentifier	 max Thread Count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setMaxThreadCount(int) */	TokenNameCOMMENT_JAVADOC	 @see #setMaxThreadCount(int) 
public	TokenNamepublic	
int	TokenNameint	
getMaxThreadCount	TokenNameIdentifier	 get Max Thread Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxThreadCount	TokenNameIdentifier	 max Thread Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the max # simultaneous merges that are allowed. * If a merge is necessary yet we already have this many * threads running, the incoming thread (that is calling * add/updateDocument) will block until a merge thread * has completed. Note that we will only run the * smallest {@link #setMaxThreadCount} merges at a time. */	TokenNameCOMMENT_JAVADOC	 Sets the max # simultaneous merges that are allowed. If a merge is necessary yet we already have this many threads running, the incoming thread (that is calling add/updateDocument) will block until a merge thread has completed. Note that we will only run the smallest {@link #setMaxThreadCount} merges at a time. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxMergeCount	TokenNameIdentifier	 set Max Merge Count
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"count should be at least 1"	TokenNameStringLiteral	count should be at least 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
maxThreadCount	TokenNameIdentifier	 max Thread Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"count should be >= maxThreadCount (= "	TokenNameStringLiteral	count should be >= maxThreadCount (= 
+	TokenNamePLUS	
maxThreadCount	TokenNameIdentifier	 max Thread Count
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxMergeCount	TokenNameIdentifier	 max Merge Count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** See {@link #setMaxMergeCount}. */	TokenNameCOMMENT_JAVADOC	 See {@link #setMaxMergeCount}. 
public	TokenNamepublic	
int	TokenNameint	
getMaxMergeCount	TokenNameIdentifier	 get Max Merge Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxMergeCount	TokenNameIdentifier	 max Merge Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the priority that merge threads run at. By * default the priority is 1 plus the priority of (ie, * slightly higher priority than) the first thread that * calls merge. */	TokenNameCOMMENT_JAVADOC	 Return the priority that merge threads run at. By default the priority is 1 plus the priority of (ie, slightly higher priority than) the first thread that calls merge. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
getMergeThreadPriority	TokenNameIdentifier	 get Merge Thread Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initMergeThreadPriority	TokenNameIdentifier	 init Merge Thread Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mergeThreadPriority	TokenNameIdentifier	 merge Thread Priority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the base priority that merge threads run at. * Note that CMS may increase priority of some merge * threads beyond this base priority. It's best not to * set this any higher than * Thread.MAX_PRIORITY-maxThreadCount, so that CMS has * room to set relative priority among threads. */	TokenNameCOMMENT_JAVADOC	 Set the base priority that merge threads run at. Note that CMS may increase priority of some merge threads beyond this base priority. It's best not to set this any higher than Thread.MAX_PRIORITY-maxThreadCount, so that CMS has room to set relative priority among threads. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setMergeThreadPriority	TokenNameIdentifier	 set Merge Thread Priority
(	TokenNameLPAREN	
int	TokenNameint	
pri	TokenNameIdentifier	 pri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pri	TokenNameIdentifier	 pri
>	TokenNameGREATER	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MAX_PRIORITY	TokenNameIdentifier	 MAX  PRIORITY
||	TokenNameOR_OR	
pri	TokenNameIdentifier	 pri
<	TokenNameLESS	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MIN_PRIORITY	TokenNameIdentifier	 MIN  PRIORITY
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"priority must be in range "	TokenNameStringLiteral	priority must be in range 
+	TokenNamePLUS	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MIN_PRIORITY	TokenNameIdentifier	 MIN  PRIORITY
+	TokenNamePLUS	
" .. "	TokenNameStringLiteral	 .. 
+	TokenNamePLUS	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MAX_PRIORITY	TokenNameIdentifier	 MAX  PRIORITY
+	TokenNamePLUS	
" inclusive"	TokenNameStringLiteral	 inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeThreadPriority	TokenNameIdentifier	 merge Thread Priority
=	TokenNameEQUAL	
pri	TokenNameIdentifier	 pri
;	TokenNameSEMICOLON	
updateMergeThreads	TokenNameIdentifier	 update Merge Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Larger merges come first 	TokenNameCOMMENT_LINE	Larger merges come first 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
MergeThread	TokenNameIdentifier	 Merge Thread
>	TokenNameGREATER	
compareByMergeDocCount	TokenNameIdentifier	 compare By Merge Doc Count
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
MergeThread	TokenNameIdentifier	 Merge Thread
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
MergeThread	TokenNameIdentifier	 Merge Thread
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
MergeThread	TokenNameIdentifier	 Merge Thread
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
m1	TokenNameIdentifier	 m1
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getCurrentMerge	TokenNameIdentifier	 get Current Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
m2	TokenNameIdentifier	 m2
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getCurrentMerge	TokenNameIdentifier	 get Current Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
m1	TokenNameIdentifier	 m1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
totalDocCount	TokenNameIdentifier	 total Doc Count
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
m2	TokenNameIdentifier	 m2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
totalDocCount	TokenNameIdentifier	 total Doc Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c2	TokenNameIdentifier	 c2
-	TokenNameMINUS	
c1	TokenNameIdentifier	 c1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Called whenever the running merges have changed, to pause & unpause * threads. This method sorts the merge threads by their merge size in * descending order and then pauses/unpauses threads from first to last -- * that way, smaller merges are guaranteed to run before larger ones. */	TokenNameCOMMENT_JAVADOC	 Called whenever the running merges have changed, to pause & unpause threads. This method sorts the merge threads by their merge size in descending order and then pauses/unpauses threads from first to last -- that way, smaller merges are guaranteed to run before larger ones. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
updateMergeThreads	TokenNameIdentifier	 update Merge Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only look at threads that are alive & not in the 	TokenNameCOMMENT_LINE	Only look at threads that are alive & not in the 
// process of stopping (ie have an active merge): 	TokenNameCOMMENT_LINE	process of stopping (ie have an active merge): 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MergeThread	TokenNameIdentifier	 Merge Thread
>	TokenNameGREATER	
activeMerges	TokenNameIdentifier	 active Merges
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MergeThread	TokenNameIdentifier	 Merge Thread
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
threadIdx	TokenNameIdentifier	 thread Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
threadIdx	TokenNameIdentifier	 thread Idx
<	TokenNameLESS	
mergeThreads	TokenNameIdentifier	 merge Threads
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
MergeThread	TokenNameIdentifier	 Merge Thread
mergeThread	TokenNameIdentifier	 merge Thread
=	TokenNameEQUAL	
mergeThreads	TokenNameIdentifier	 merge Threads
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
threadIdx	TokenNameIdentifier	 thread Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mergeThread	TokenNameIdentifier	 merge Thread
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Prune any dead threads 	TokenNameCOMMENT_LINE	Prune any dead threads 
mergeThreads	TokenNameIdentifier	 merge Threads
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
threadIdx	TokenNameIdentifier	 thread Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mergeThread	TokenNameIdentifier	 merge Thread
.	TokenNameDOT	
getCurrentMerge	TokenNameIdentifier	 get Current Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
activeMerges	TokenNameIdentifier	 active Merges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mergeThread	TokenNameIdentifier	 merge Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
threadIdx	TokenNameIdentifier	 thread Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Sort the merge threads in descending order. 	TokenNameCOMMENT_LINE	Sort the merge threads in descending order. 
CollectionUtil	TokenNameIdentifier	 Collection Util
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
activeMerges	TokenNameIdentifier	 active Merges
,	TokenNameCOMMA	
compareByMergeDocCount	TokenNameIdentifier	 compare By Merge Doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pri	TokenNameIdentifier	 pri
=	TokenNameEQUAL	
mergeThreadPriority	TokenNameIdentifier	 merge Thread Priority
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
activeMergeCount	TokenNameIdentifier	 active Merge Count
=	TokenNameEQUAL	
activeMerges	TokenNameIdentifier	 active Merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
threadIdx	TokenNameIdentifier	 thread Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
threadIdx	TokenNameIdentifier	 thread Idx
<	TokenNameLESS	
activeMergeCount	TokenNameIdentifier	 active Merge Count
;	TokenNameSEMICOLON	
threadIdx	TokenNameIdentifier	 thread Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
MergeThread	TokenNameIdentifier	 Merge Thread
mergeThread	TokenNameIdentifier	 merge Thread
=	TokenNameEQUAL	
activeMerges	TokenNameIdentifier	 active Merges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
threadIdx	TokenNameIdentifier	 thread Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
mergeThread	TokenNameIdentifier	 merge Thread
.	TokenNameDOT	
getCurrentMerge	TokenNameIdentifier	 get Current Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// pause the thread if maxThreadCount is smaller than the number of merge threads. 	TokenNameCOMMENT_LINE	pause the thread if maxThreadCount is smaller than the number of merge threads. 
final	TokenNamefinal	
boolean	TokenNameboolean	
doPause	TokenNameIdentifier	 do Pause
=	TokenNameEQUAL	
threadIdx	TokenNameIdentifier	 thread Idx
<	TokenNameLESS	
activeMergeCount	TokenNameIdentifier	 active Merge Count
-	TokenNameMINUS	
maxThreadCount	TokenNameIdentifier	 max Thread Count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doPause	TokenNameIdentifier	 do Pause
!=	TokenNameNOT_EQUAL	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
getPause	TokenNameIdentifier	 get Pause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doPause	TokenNameIdentifier	 do Pause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"pause thread "	TokenNameStringLiteral	pause thread 
+	TokenNamePLUS	
mergeThread	TokenNameIdentifier	 merge Thread
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"unpause thread "	TokenNameStringLiteral	unpause thread 
+	TokenNamePLUS	
mergeThread	TokenNameIdentifier	 merge Thread
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doPause	TokenNameIdentifier	 do Pause
!=	TokenNameNOT_EQUAL	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
getPause	TokenNameIdentifier	 get Pause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
setPause	TokenNameIdentifier	 set Pause
(	TokenNameLPAREN	
doPause	TokenNameIdentifier	 do Pause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
doPause	TokenNameIdentifier	 do Pause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"set priority of merge thread "	TokenNameStringLiteral	set priority of merge thread 
+	TokenNamePLUS	
mergeThread	TokenNameIdentifier	 merge Thread
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
pri	TokenNameIdentifier	 pri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mergeThread	TokenNameIdentifier	 merge Thread
.	TokenNameDOT	
setThreadPriority	TokenNameIdentifier	 set Thread Priority
(	TokenNameLPAREN	
pri	TokenNameIdentifier	 pri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pri	TokenNameIdentifier	 pri
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MAX_PRIORITY	TokenNameIdentifier	 MAX  PRIORITY
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
pri	TokenNameIdentifier	 pri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if verbosing is enabled. This method is usually used in * conjunction with {@link #message(String)}, like that: * * <pre> * if (verbose()) { * message(&quot;your message&quot;); * } * </pre> */	TokenNameCOMMENT_JAVADOC	 Returns true if verbosing is enabled. This method is usually used in conjunction with {@link #message(String)}, like that: * <pre> if (verbose()) { message(&quot;your message&quot;); } </pre> 
protected	TokenNameprotected	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
writer	TokenNameIdentifier	 writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Outputs the given message - this method assumes {@link #verbose()} was * called and returned true. */	TokenNameCOMMENT_JAVADOC	 Outputs the given message - this method assumes {@link #verbose()} was called and returned true. 
protected	TokenNameprotected	
void	TokenNamevoid	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"CMS: "	TokenNameStringLiteral	CMS: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
initMergeThreadPriority	TokenNameIdentifier	 init Merge Thread Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mergeThreadPriority	TokenNameIdentifier	 merge Thread Priority
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Default to slightly higher priority than our 	TokenNameCOMMENT_LINE	Default to slightly higher priority than our 
// calling thread 	TokenNameCOMMENT_LINE	calling thread 
mergeThreadPriority	TokenNameIdentifier	 merge Thread Priority
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mergeThreadPriority	TokenNameIdentifier	 merge Thread Priority
>	TokenNameGREATER	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MAX_PRIORITY	TokenNameIdentifier	 MAX  PRIORITY
)	TokenNameRPAREN	
mergeThreadPriority	TokenNameIdentifier	 merge Thread Priority
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MAX_PRIORITY	TokenNameIdentifier	 MAX  PRIORITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Wait for any running merge threads to finish */	TokenNameCOMMENT_JAVADOC	 Wait for any running merge threads to finish 
public	TokenNamepublic	
void	TokenNamevoid	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MergeThread	TokenNameIdentifier	 Merge Thread
toSync	TokenNameIdentifier	 to Sync
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MergeThread	TokenNameIdentifier	 Merge Thread
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
mergeThreads	TokenNameIdentifier	 merge Threads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toSync	TokenNameIdentifier	 to Sync
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toSync	TokenNameIdentifier	 to Sync
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
toSync	TokenNameIdentifier	 to Sync
.	TokenNameDOT	
join	TokenNameIdentifier	 join
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
throw	TokenNamethrow	
new	TokenNamenew	
ThreadInterruptedException	TokenNameIdentifier	 Thread Interrupted Exception
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the number of merge threads that are alive. Note that this number * is &le; {@link #mergeThreads} size. */	TokenNameCOMMENT_JAVADOC	 Returns the number of merge threads that are alive. Note that this number is &le; {@link #mergeThreads} size. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
int	TokenNameint	
mergeThreadCount	TokenNameIdentifier	 merge Thread Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MergeThread	TokenNameIdentifier	 Merge Thread
mt	TokenNameIdentifier	 mt
:	TokenNameCOLON	
mergeThreads	TokenNameIdentifier	 merge Threads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
getCurrentMerge	TokenNameIdentifier	 get Current Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
holdsLock	TokenNameIdentifier	 holds Lock
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
initMergeThreadPriority	TokenNameIdentifier	 init Merge Thread Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// First, quickly run through the newly proposed merges 	TokenNameCOMMENT_LINE	First, quickly run through the newly proposed merges 
// and add any orthogonal merges (ie a merge not 	TokenNameCOMMENT_LINE	and add any orthogonal merges (ie a merge not 
// involving segments already pending to be merged) to 	TokenNameCOMMENT_LINE	involving segments already pending to be merged) to 
// the queue. If we are way behind on merging, many of 	TokenNameCOMMENT_LINE	the queue. If we are way behind on merging, many of 
// these newly proposed merges will likely already be 	TokenNameCOMMENT_LINE	these newly proposed merges will likely already be 
// registered. 	TokenNameCOMMENT_LINE	registered. 
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"now merge"	TokenNameStringLiteral	now merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" index: "	TokenNameStringLiteral	 index: 
+	TokenNamePLUS	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Iterate, pulling from the IndexWriter's queue of 	TokenNameCOMMENT_LINE	Iterate, pulling from the IndexWriter's queue of 
// pending merges, until it's empty: 	TokenNameCOMMENT_LINE	pending merges, until it's empty: 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
startStallTime	TokenNameIdentifier	 start Stall Time
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
mergeThreadCount	TokenNameIdentifier	 merge Thread Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxMergeCount	TokenNameIdentifier	 max Merge Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startStallTime	TokenNameIdentifier	 start Stall Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" too many merges; stalling..."	TokenNameStringLiteral	 too many merges; stalling...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
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
throw	TokenNamethrow	
new	TokenNamenew	
ThreadInterruptedException	TokenNameIdentifier	 Thread Interrupted Exception
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startStallTime	TokenNameIdentifier	 start Stall Time
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" stalled for "	TokenNameStringLiteral	 stalled for 
+	TokenNamePLUS	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startStallTime	TokenNameIdentifier	 start Stall Time
)	TokenNameRPAREN	
+	TokenNamePLUS	
" msec"	TokenNameStringLiteral	 msec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TODO: we could be careful about which merges to do in 	TokenNameCOMMENT_LINE	TODO: we could be careful about which merges to do in 
// the BG (eg maybe the "biggest" ones) vs FG, which 	TokenNameCOMMENT_LINE	the BG (eg maybe the "biggest" ones) vs FG, which 
// merges to do first (the easiest ones?), etc. 	TokenNameCOMMENT_LINE	merges to do first (the easiest ones?), etc. 
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getNextMerge	TokenNameIdentifier	 get Next Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" no more merges pending; now return"	TokenNameStringLiteral	 no more merges pending; now return
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We do this w/ the primary thread to keep 	TokenNameCOMMENT_LINE	We do this w/ the primary thread to keep 
// deterministic assignment of segment names 	TokenNameCOMMENT_LINE	deterministic assignment of segment names 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
mergeInit	TokenNameIdentifier	 merge Init
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" consider merge "	TokenNameStringLiteral	 consider merge 
+	TokenNamePLUS	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// OK to spawn a new merge thread to handle this 	TokenNameCOMMENT_LINE	OK to spawn a new merge thread to handle this 
// merge: 	TokenNameCOMMENT_LINE	merge: 
final	TokenNamefinal	
MergeThread	TokenNameIdentifier	 Merge Thread
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
getMergeThread	TokenNameIdentifier	 get Merge Thread
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeThreads	TokenNameIdentifier	 merge Threads
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
merger	TokenNameIdentifier	 merger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" launch new thread ["	TokenNameStringLiteral	 launch new thread [
+	TokenNamePLUS	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must call this after starting the thread else 	TokenNameCOMMENT_LINE	Must call this after starting the thread else 
// the new thread is removed from mergeThreads 	TokenNameCOMMENT_LINE	the new thread is removed from mergeThreads 
// (since it's not alive yet): 	TokenNameCOMMENT_LINE	(since it's not alive yet): 
updateMergeThreads	TokenNameIdentifier	 update Merge Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
mergeFinish	TokenNameIdentifier	 merge Finish
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Does the actual merge, by calling {@link IndexWriter#merge} */	TokenNameCOMMENT_JAVADOC	 Does the actual merge, by calling {@link IndexWriter#merge} 
protected	TokenNameprotected	
void	TokenNamevoid	
doMerge	TokenNameIdentifier	 do Merge
(	TokenNameLPAREN	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create and return a new MergeThread */	TokenNameCOMMENT_JAVADOC	 Create and return a new MergeThread 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
MergeThread	TokenNameIdentifier	 Merge Thread
getMergeThread	TokenNameIdentifier	 get Merge Thread
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
MergeThread	TokenNameIdentifier	 Merge Thread
thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
new	TokenNamenew	
MergeThread	TokenNameIdentifier	 Merge Thread
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
setThreadPriority	TokenNameIdentifier	 set Thread Priority
(	TokenNameLPAREN	
mergeThreadPriority	TokenNameIdentifier	 merge Thread Priority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"Lucene Merge Thread #"	TokenNameStringLiteral	Lucene Merge Thread #
+	TokenNamePLUS	
mergeThreadCount	TokenNameIdentifier	 merge Thread Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
thread	TokenNameIdentifier	 thread
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
class	TokenNameclass	
MergeThread	TokenNameIdentifier	 Merge Thread
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
IndexWriter	TokenNameIdentifier	 Index Writer
tWriter	TokenNameIdentifier	 t Writer
;	TokenNameSEMICOLON	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
startMerge	TokenNameIdentifier	 start Merge
;	TokenNameSEMICOLON	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
runningMerge	TokenNameIdentifier	 running Merge
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MergeThread	TokenNameIdentifier	 Merge Thread
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
startMerge	TokenNameIdentifier	 start Merge
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tWriter	TokenNameIdentifier	 t Writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startMerge	TokenNameIdentifier	 start Merge
=	TokenNameEQUAL	
startMerge	TokenNameIdentifier	 start Merge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setRunningMerge	TokenNameIdentifier	 set Running Merge
(	TokenNameLPAREN	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runningMerge	TokenNameIdentifier	 running Merge
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
getRunningMerge	TokenNameIdentifier	 get Running Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runningMerge	TokenNameIdentifier	 running Merge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
getCurrentMerge	TokenNameIdentifier	 get Current Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
runningMerge	TokenNameIdentifier	 running Merge
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runningMerge	TokenNameIdentifier	 running Merge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
startMerge	TokenNameIdentifier	 start Merge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThreadPriority	TokenNameIdentifier	 set Thread Priority
(	TokenNameLPAREN	
int	TokenNameint	
pri	TokenNameIdentifier	 pri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
pri	TokenNameIdentifier	 pri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Strangely, Sun's JDK 1.5 on Linux sometimes 	TokenNameCOMMENT_LINE	Strangely, Sun's JDK 1.5 on Linux sometimes 
// throws NPE out of here... 	TokenNameCOMMENT_LINE	throws NPE out of here... 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore this because we will still run fine with 	TokenNameCOMMENT_LINE	Ignore this because we will still run fine with 
// normal thread priority 	TokenNameCOMMENT_LINE	normal thread priority 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time through the while loop we do the merge 	TokenNameCOMMENT_LINE	First time through the while loop we do the merge 
// that we were started with: 	TokenNameCOMMENT_LINE	that we were started with: 
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
startMerge	TokenNameIdentifier	 start Merge
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" merge thread: start"	TokenNameStringLiteral	 merge thread: start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setRunningMerge	TokenNameIdentifier	 set Running Merge
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doMerge	TokenNameIdentifier	 do Merge
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Subsequent times through the loop we do any new 	TokenNameCOMMENT_LINE	Subsequent times through the loop we do any new 
// merge that writer says is necessary: 	TokenNameCOMMENT_LINE	merge that writer says is necessary: 
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
tWriter	TokenNameIdentifier	 t Writer
.	TokenNameDOT	
getNextMerge	TokenNameIdentifier	 get Next Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tWriter	TokenNameIdentifier	 t Writer
.	TokenNameDOT	
mergeInit	TokenNameIdentifier	 merge Init
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateMergeThreads	TokenNameIdentifier	 update Merge Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" merge thread: do another merge "	TokenNameStringLiteral	 merge thread: do another merge 
+	TokenNamePLUS	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" merge thread: done"	TokenNameStringLiteral	 merge thread: done
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore the exception if it was due to abort: 	TokenNameCOMMENT_LINE	Ignore the exception if it was due to abort: 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
instanceof	TokenNameinstanceof	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
suppressExceptions	TokenNameIdentifier	 suppress Exceptions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// suppressExceptions is normally only set during 	TokenNameCOMMENT_LINE	suppressExceptions is normally only set during 
// testing. 	TokenNameCOMMENT_LINE	testing. 
anyExceptions	TokenNameIdentifier	 any Exceptions
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
handleMergeException	TokenNameIdentifier	 handle Merge Exception
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updateMergeThreads	TokenNameIdentifier	 update Merge Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Called when an exception is hit in a background merge * thread */	TokenNameCOMMENT_JAVADOC	 Called when an exception is hit in a background merge thread 
protected	TokenNameprotected	
void	TokenNamevoid	
handleMergeException	TokenNameIdentifier	 handle Merge Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// When an exception is hit during merge, IndexWriter 	TokenNameCOMMENT_LINE	When an exception is hit during merge, IndexWriter 
// removes any partial files and then allows another 	TokenNameCOMMENT_LINE	removes any partial files and then allows another 
// merge to run. If whatever caused the error is not 	TokenNameCOMMENT_LINE	merge to run. If whatever caused the error is not 
// transient then the exception will keep happening, 	TokenNameCOMMENT_LINE	transient then the exception will keep happening, 
// so, we sleep here to avoid saturating CPU in such 	TokenNameCOMMENT_LINE	so, we sleep here to avoid saturating CPU in such 
// cases: 	TokenNameCOMMENT_LINE	cases: 
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
250	TokenNameIntegerLiteral	
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
throw	TokenNamethrow	
new	TokenNamenew	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
MergeException	TokenNameIdentifier	 Merge Exception
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
boolean	TokenNameboolean	
anyExceptions	TokenNameIdentifier	 any Exceptions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Used for testing */	TokenNameCOMMENT_JAVADOC	 Used for testing 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
anyUnhandledExceptions	TokenNameIdentifier	 any Unhandled Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
allInstances	TokenNameIdentifier	 all Instances
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"setTestMode() was not called; often this is because your test case's setUp method fails to call super.setUp in LuceneTestCase"	TokenNameStringLiteral	setTestMode() was not called; often this is because your test case's setUp method fails to call super.setUp in LuceneTestCase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
allInstances	TokenNameIdentifier	 all Instances
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
allInstances	TokenNameIdentifier	 all Instances
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure all outstanding threads are done so we see 	TokenNameCOMMENT_LINE	Make sure all outstanding threads are done so we see 
// any exceptions they may produce: 	TokenNameCOMMENT_LINE	any exceptions they may produce: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
allInstances	TokenNameIdentifier	 all Instances
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
anyExceptions	TokenNameIdentifier	 any Exceptions
;	TokenNameSEMICOLON	
anyExceptions	TokenNameIdentifier	 any Exceptions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
clearUnhandledExceptions	TokenNameIdentifier	 clear Unhandled Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
allInstances	TokenNameIdentifier	 all Instances
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anyExceptions	TokenNameIdentifier	 any Exceptions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Used for testing */	TokenNameCOMMENT_JAVADOC	 Used for testing 
private	TokenNameprivate	
void	TokenNamevoid	
addMyself	TokenNameIdentifier	 add Myself
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
allInstances	TokenNameIdentifier	 all Instances
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
allInstances	TokenNameIdentifier	 all Instances
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
allInstances	TokenNameIdentifier	 all Instances
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
&&	TokenNameAND_AND	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
mergeThreadCount	TokenNameIdentifier	 merge Thread Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// Keep this one for now: it still has threads or 	TokenNameCOMMENT_LINE	Keep this one for now: it still has threads or 
// may spawn new threads 	TokenNameCOMMENT_LINE	may spawn new threads 
allInstances	TokenNameIdentifier	 all Instances
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
allInstances	TokenNameIdentifier	 all Instances
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
allInstances	TokenNameIdentifier	 all Instances
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
allInstances	TokenNameIdentifier	 all Instances
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
suppressExceptions	TokenNameIdentifier	 suppress Exceptions
;	TokenNameSEMICOLON	
/** Used for testing */	TokenNameCOMMENT_JAVADOC	 Used for testing 
void	TokenNamevoid	
setSuppressExceptions	TokenNameIdentifier	 set Suppress Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suppressExceptions	TokenNameIdentifier	 suppress Exceptions
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Used for testing */	TokenNameCOMMENT_JAVADOC	 Used for testing 
void	TokenNamevoid	
clearSuppressExceptions	TokenNameIdentifier	 clear Suppress Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suppressExceptions	TokenNameIdentifier	 suppress Exceptions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Used for testing */	TokenNameCOMMENT_JAVADOC	 Used for testing 
private	TokenNameprivate	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
>	TokenNameGREATER	
allInstances	TokenNameIdentifier	 all Instances
;	TokenNameSEMICOLON	
/** @deprecated this test mode code will be removed in a future release */	TokenNameCOMMENT_JAVADOC	 @deprecated this test mode code will be removed in a future release 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setTestMode	TokenNameIdentifier	 set Test Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allInstances	TokenNameIdentifier	 all Instances
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
