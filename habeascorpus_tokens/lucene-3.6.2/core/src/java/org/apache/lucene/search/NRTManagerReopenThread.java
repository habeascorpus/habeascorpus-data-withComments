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
/** * Utility class that runs a reopen thread to periodically * reopen the NRT searchers in the provided {@link * NRTManager}. * * <p> Typical usage looks like this: * * <pre> * ... open your own writer ... * * NRTManager manager = new NRTManager(writer); * * // Refreshes searcher every 5 seconds when nobody is waiting, and up to 100 msec delay * // when somebody is waiting: * NRTManagerReopenThread reopenThread = new NRTManagerReopenThread(manager, 5.0, 0.1); * reopenThread.setName("NRT Reopen Thread"); * reopenThread.setPriority(Math.min(Thread.currentThread().getPriority()+2, Thread.MAX_PRIORITY)); * reopenThread.setDaemon(true); * reopenThread.start(); * </pre> * * Then, for each incoming query, do this: * * <pre> * // For each incoming query: * IndexSearcher searcher = manager.get(); * try { * // Use searcher to search... * } finally { * manager.release(searcher); * } * </pre> * * You should make changes using the <code>NRTManager</code>; if you later need to obtain * a searcher reflecting those changes: * * <pre> * // ... or updateDocument, deleteDocuments, etc: * long gen = manager.addDocument(...); * * // Returned searcher is guaranteed to reflect the just added document * IndexSearcher searcher = manager.get(gen); * try { * // Use searcher to search... * } finally { * manager.release(searcher); * } * </pre> * * * When you are done be sure to close both the manager and the reopen thrad: * <pre> * reopenThread.close(); * manager.close(); * </pre> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Utility class that runs a reopen thread to periodically reopen the NRT searchers in the provided {@link NRTManager}. * <p> Typical usage looks like this: * <pre> ... open your own writer ... * NRTManager manager = new NRTManager(writer); * // Refreshes searcher every 5 seconds when nobody is waiting, and up to 100 msec delay // when somebody is waiting: NRTManagerReopenThread reopenThread = new NRTManagerReopenThread(manager, 5.0, 0.1); reopenThread.setName("NRT Reopen Thread"); reopenThread.setPriority(Math.min(Thread.currentThread().getPriority()+2, Thread.MAX_PRIORITY)); reopenThread.setDaemon(true); reopenThread.start(); </pre> * Then, for each incoming query, do this: * <pre> // For each incoming query: IndexSearcher searcher = manager.get(); try { // Use searcher to search... } finally { manager.release(searcher); } </pre> * You should make changes using the <code>NRTManager</code>; if you later need to obtain a searcher reflecting those changes: * <pre> // ... or updateDocument, deleteDocuments, etc: long gen = manager.addDocument(...); * // Returned searcher is guaranteed to reflect the just added document IndexSearcher searcher = manager.get(gen); try { // Use searcher to search... } finally { manager.release(searcher); } </pre> * When you are done be sure to close both the manager and the reopen thrad: <pre> reopenThread.close(); manager.close(); </pre> * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
NRTManagerReopenThread	TokenNameIdentifier	 NRT Manager Reopen Thread
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
implements	TokenNameimplements	
NRTManager	TokenNameIdentifier	 NRT Manager
.	TokenNameDOT	
WaitingListener	TokenNameIdentifier	 Waiting Listener
,	TokenNameCOMMA	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
NRTManager	TokenNameIdentifier	 NRT Manager
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
targetMaxStaleNS	TokenNameIdentifier	 target Max Stale NS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
targetMinStaleNS	TokenNameIdentifier	 target Min Stale NS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
finish	TokenNameIdentifier	 finish
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
waitingGen	TokenNameIdentifier	 waiting Gen
;	TokenNameSEMICOLON	
/** * Create NRTManagerReopenThread, to periodically reopen the NRT searcher. * * @param targetMaxStaleSec Maximum time until a new * reader must be opened; this sets the upper bound * on how slowly reopens may occur * * @param targetMinStaleSec Mininum time until a new * reader can be opened; this sets the lower bound * on how quickly reopens may occur, when a caller * is waiting for a specific indexing change to * become visible. */	TokenNameCOMMENT_JAVADOC	 Create NRTManagerReopenThread, to periodically reopen the NRT searcher. * @param targetMaxStaleSec Maximum time until a new reader must be opened; this sets the upper bound on how slowly reopens may occur * @param targetMinStaleSec Mininum time until a new reader can be opened; this sets the lower bound on how quickly reopens may occur, when a caller is waiting for a specific indexing change to become visible. 
public	TokenNamepublic	
NRTManagerReopenThread	TokenNameIdentifier	 NRT Manager Reopen Thread
(	TokenNameLPAREN	
NRTManager	TokenNameIdentifier	 NRT Manager
manager	TokenNameIdentifier	 manager
,	TokenNameCOMMA	
double	TokenNamedouble	
targetMaxStaleSec	TokenNameIdentifier	 target Max Stale Sec
,	TokenNameCOMMA	
double	TokenNamedouble	
targetMinStaleSec	TokenNameIdentifier	 target Min Stale Sec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
targetMaxStaleSec	TokenNameIdentifier	 target Max Stale Sec
<	TokenNameLESS	
targetMinStaleSec	TokenNameIdentifier	 target Min Stale Sec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"targetMaxScaleSec (= "	TokenNameStringLiteral	targetMaxScaleSec (= 
+	TokenNamePLUS	
targetMaxStaleSec	TokenNameIdentifier	 target Max Stale Sec
+	TokenNamePLUS	
") < targetMinStaleSec (="	TokenNameStringLiteral	) < targetMinStaleSec (=
+	TokenNamePLUS	
targetMinStaleSec	TokenNameIdentifier	 target Min Stale Sec
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
manager	TokenNameIdentifier	 manager
=	TokenNameEQUAL	
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
targetMaxStaleNS	TokenNameIdentifier	 target Max Stale NS
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1000000000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
targetMaxStaleSec	TokenNameIdentifier	 target Max Stale Sec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
targetMinStaleNS	TokenNameIdentifier	 target Min Stale NS
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1000000000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
targetMinStaleSec	TokenNameIdentifier	 target Min Stale Sec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
addWaitingListener	TokenNameIdentifier	 add Waiting Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("NRT: set finish"); 	TokenNameCOMMENT_LINE	System.out.println("NRT: set finish"); 
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
removeWaitingListener	TokenNameIdentifier	 remove Waiting Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
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
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
waiting	TokenNameIdentifier	 waiting
(	TokenNameLPAREN	
long	TokenNamelong	
targetGen	TokenNameIdentifier	 target Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
waitingGen	TokenNameIdentifier	 waiting Gen
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
waitingGen	TokenNameIdentifier	 waiting Gen
,	TokenNameCOMMA	
targetGen	TokenNameIdentifier	 target Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(Thread.currentThread().getName() + ": force wakeup waitingGen=" + waitingGen + " applyDeletes=" + applyDeletes); 	TokenNameCOMMENT_LINE	System.out.println(Thread.currentThread().getName() + ": force wakeup waitingGen=" + waitingGen + " applyDeletes=" + applyDeletes); 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: maybe use private thread ticktock timer, in 	TokenNameCOMMENT_LINE	TODO: maybe use private thread ticktock timer, in 
// case clock shift messes up nanoTime? 	TokenNameCOMMENT_LINE	case clock shift messes up nanoTime? 
long	TokenNamelong	
lastReopenStartNS	TokenNameIdentifier	 last Reopen Start NS
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("reopen: start"); 	TokenNameCOMMENT_LINE	System.out.println("reopen: start"); 
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
hasWaiting	TokenNameIdentifier	 has Waiting
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: try to guestimate how long reopen might 	TokenNameCOMMENT_LINE	TODO: try to guestimate how long reopen might 
// take based on past data? 	TokenNameCOMMENT_LINE	take based on past data? 
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
finish	TokenNameIdentifier	 finish
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("reopen: cycle"); 	TokenNameCOMMENT_LINE	System.out.println("reopen: cycle"); 
// True if we have someone waiting for reopen'd searcher: 	TokenNameCOMMENT_LINE	True if we have someone waiting for reopen'd searcher: 
hasWaiting	TokenNameIdentifier	 has Waiting
=	TokenNameEQUAL	
waitingGen	TokenNameIdentifier	 waiting Gen
>	TokenNameGREATER	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
getCurrentSearchingGen	TokenNameIdentifier	 get Current Searching Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
nextReopenStartNS	TokenNameIdentifier	 next Reopen Start NS
=	TokenNameEQUAL	
lastReopenStartNS	TokenNameIdentifier	 last Reopen Start NS
+	TokenNamePLUS	
(	TokenNameLPAREN	
hasWaiting	TokenNameIdentifier	 has Waiting
?	TokenNameQUESTION	
targetMinStaleNS	TokenNameIdentifier	 target Min Stale NS
:	TokenNameCOLON	
targetMaxStaleNS	TokenNameIdentifier	 target Max Stale NS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
sleepNS	TokenNameIdentifier	 sleep NS
=	TokenNameEQUAL	
nextReopenStartNS	TokenNameIdentifier	 next Reopen Start NS
-	TokenNameMINUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sleepNS	TokenNameIdentifier	 sleep NS
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("reopen: sleep " + (sleepNS/1000000.0) + " ms (hasWaiting=" + hasWaiting + ")"); 	TokenNameCOMMENT_LINE	System.out.println("reopen: sleep " + (sleepNS/1000000.0) + " ms (hasWaiting=" + hasWaiting + ")"); 
try	TokenNametry	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
sleepNS	TokenNameIdentifier	 sleep NS
/	TokenNameDIVIDE	
1000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
sleepNS	TokenNameIdentifier	 sleep NS
%	TokenNameREMAINDER	
1000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("NRT: set finish on interrupt"); 	TokenNameCOMMENT_LINE	System.out.println("NRT: set finish on interrupt"); 
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
finish	TokenNameIdentifier	 finish
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("reopen: finish"); 	TokenNameCOMMENT_LINE	System.out.println("reopen: finish"); 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("reopen: start hasWaiting=" + hasWaiting); 	TokenNameCOMMENT_LINE	System.out.println("reopen: start hasWaiting=" + hasWaiting); 
}	TokenNameRBRACE	
lastReopenStartNS	TokenNameIdentifier	 last Reopen Start NS
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
//final long t0 = System.nanoTime(); 	TokenNameCOMMENT_LINE	final long t0 = System.nanoTime(); 
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
maybeRefresh	TokenNameIdentifier	 maybe Refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("reopen took " + ((System.nanoTime()-t0)/1000000.0) + " msec"); 	TokenNameCOMMENT_LINE	System.out.println("reopen took " + ((System.nanoTime()-t0)/1000000.0) + " msec"); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(Thread.currentThread().getName() + ": IOE"); 	TokenNameCOMMENT_LINE	System.out.println(Thread.currentThread().getName() + ": IOE"); 
//ioe.printStackTrace(); 	TokenNameCOMMENT_LINE	ioe.printStackTrace(); 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("REOPEN EXC"); 	TokenNameCOMMENT_LINE	System.out.println("REOPEN EXC"); 
//t.printStackTrace(System.out); 	TokenNameCOMMENT_LINE	t.printStackTrace(System.out); 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
