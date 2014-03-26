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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
NRTManager	TokenNameIdentifier	 NRT Manager
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
IndexSearcher	TokenNameIdentifier	 Index Searcher
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IOUtils	TokenNameIdentifier	 IO Utils
;	TokenNameSEMICOLON	
/** * Keeps track of current plus old IndexSearchers, closing * the old ones once they have timed out. * * Use it like this: * * <pre> * SearcherLifetimeManager mgr = new SearcherLifetimeManager(); * </pre> * * Per search-request, if it's a "new" search request, then * obtain the latest searcher you have (for example, by * using {@link SearcherManager} or {@link NRTManager}), and * then record this searcher: * * <pre> * // Record the current searcher, and save the returend * // token into user's search results (eg as a hidden * // HTML form field): * long token = mgr.record(searcher); * </pre> * * When a follow-up search arrives, for example the user * clicks next page, drills down/up, etc., take the token * that you saved from the previous search and: * * <pre> * // If possible, obtain the same searcher as the last * // search: * IndexSearcher searcher = mgr.acquire(token); * if (searcher != null) { * // Searcher is still here * try { * // do searching... * } finally { * mgr.release(searcher); * // Do not use searcher after this! * searcher = null; * } * } else { * // Searcher was pruned -- notify user session timed * // out, or, pull fresh searcher again * } * </pre> * * Finally, in a separate thread, ideally the same thread * that's periodically reopening your searchers, you should * periodically prune old searchers: * * <pre> * mgr.prune(new PruneByAge(600.0)); * </pre> * * <p><b>NOTE</b>: keeping many searchers around means * you'll use more resources (open files, RAM) than a single * searcher. However, as long as you are using {@link * IndexReader#openIfChanged}, the searchers will usually * share almost all segments and the added resource usage is * contained. When a large merge has completed, and * you reopen, because that is a large change, the new * searcher will use higher additional RAM than other * searchers; but large merges don't complete very often and * it's unlikely you'll hit two of them in your expiration * window. Still you should budget plenty of heap in the * JVM to have a good safety margin. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Keeps track of current plus old IndexSearchers, closing the old ones once they have timed out. * Use it like this: * <pre> SearcherLifetimeManager mgr = new SearcherLifetimeManager(); </pre> * Per search-request, if it's a "new" search request, then obtain the latest searcher you have (for example, by using {@link SearcherManager} or {@link NRTManager}), and then record this searcher: * <pre> // Record the current searcher, and save the returend // token into user's search results (eg as a hidden // HTML form field): long token = mgr.record(searcher); </pre> * When a follow-up search arrives, for example the user clicks next page, drills down/up, etc., take the token that you saved from the previous search and: * <pre> // If possible, obtain the same searcher as the last // search: IndexSearcher searcher = mgr.acquire(token); if (searcher != null) { // Searcher is still here try { // do searching... } finally { mgr.release(searcher); // Do not use searcher after this! searcher = null; } } else { // Searcher was pruned -- notify user session timed // out, or, pull fresh searcher again } </pre> * Finally, in a separate thread, ideally the same thread that's periodically reopening your searchers, you should periodically prune old searchers: * <pre> mgr.prune(new PruneByAge(600.0)); </pre> * <p><b>NOTE</b>: keeping many searchers around means you'll use more resources (open files, RAM) than a single searcher. However, as long as you are using {@link IndexReader#openIfChanged}, the searchers will usually share almost all segments and the added resource usage is contained. When a large merge has completed, and you reopen, because that is a large change, the new searcher will use higher additional RAM than other searchers; but large merges don't complete very often and it's unlikely you'll hit two of them in your expiration window. Still you should budget plenty of heap in the JVM to have a good safety margin. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SearcherLifetimeManager	TokenNameIdentifier	 Searcher Lifetime Manager
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
NANOS_PER_SEC	TokenNameIdentifier	 NANOS  PER  SEC
=	TokenNameEQUAL	
1000000000.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
>	TokenNameGREATER	
,	TokenNameCOMMA	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
recordTimeSec	TokenNameIdentifier	 record Time Sec
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use nanoTime not currentTimeMillis since it [in 	TokenNameCOMMENT_LINE	Use nanoTime not currentTimeMillis since it [in 
// theory] reduces risk from clock shift 	TokenNameCOMMENT_LINE	theory] reduces risk from clock shift 
recordTimeSec	TokenNameIdentifier	 record Time Sec
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
NANOS_PER_SEC	TokenNameIdentifier	 NANOS  PER  SEC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Newer searchers are sort before older ones: 	TokenNameCOMMENT_LINE	Newer searchers are sort before older ones: 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Be defensive: cannot subtract since it could 	TokenNameCOMMENT_LINE	Be defensive: cannot subtract since it could 
// technically overflow long, though, we'd never hit 	TokenNameCOMMENT_LINE	technically overflow long, though, we'd never hit 
// that in practice: 	TokenNameCOMMENT_LINE	that in practice: 
if	TokenNameif	
(	TokenNameLPAREN	
recordTimeSec	TokenNameIdentifier	 record Time Sec
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
recordTimeSec	TokenNameIdentifier	 record Time Sec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
recordTimeSec	TokenNameIdentifier	 record Time Sec
<	TokenNameLESS	
recordTimeSec	TokenNameIdentifier	 record Time Sec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
closed	TokenNameIdentifier	 closed
;	TokenNameSEMICOLON	
// TODO: we could get by w/ just a "set"; need to have 	TokenNameCOMMENT_LINE	TODO: we could get by w/ just a "set"; need to have 
// Tracker hash by its version and have compareTo(Long) 	TokenNameCOMMENT_LINE	Tracker hash by its version and have compareTo(Long) 
// compare to its version 	TokenNameCOMMENT_LINE	compare to its version 
private	TokenNameprivate	
final	TokenNamefinal	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
>	TokenNameGREATER	
searchers	TokenNameIdentifier	 searchers
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"this SearcherLifetimeManager instance is closed"	TokenNameStringLiteral	this SearcherLifetimeManager instance is closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Records that you are now using this IndexSearcher. * Always call this when you've obtained a possibly new * {@link IndexSearcher}, for example from one of the * <code>get</code> methods in {@link NRTManager} or {@link * SearcherManager}. It's fine if you already passed the * same searcher to this method before. * * <p>This returns the long token that you can later pass * to {@link #acquire} to retrieve the same IndexSearcher. * You should record this long token in the search results * sent to your user, such that if the user performs a * follow-on action (clicks next page, drills down, etc.) * the token is returned. */	TokenNameCOMMENT_JAVADOC	 Records that you are now using this IndexSearcher. Always call this when you've obtained a possibly new {@link IndexSearcher}, for example from one of the <code>get</code> methods in {@link NRTManager} or {@link SearcherManager}. It's fine if you already passed the same searcher to this method before. * <p>This returns the long token that you can later pass to {@link #acquire} to retrieve the same IndexSearcher. You should record this long token in the search results sent to your user, such that if the user performs a follow-on action (clicks next page, drills down, etc.) the token is returned. 
public	TokenNamepublic	
long	TokenNamelong	
record	TokenNameIdentifier	 record
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: we don't have to use IR.getVersion to track; 	TokenNameCOMMENT_LINE	TODO: we don't have to use IR.getVersion to track; 
// could be risky (if it's buggy); we could get better 	TokenNameCOMMENT_LINE	could be risky (if it's buggy); we could get better 
// bug isolation if we assign our own private ID: 	TokenNameCOMMENT_LINE	bug isolation if we assign our own private ID: 
final	TokenNamefinal	
long	TokenNamelong	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
tracker	TokenNameIdentifier	 tracker
=	TokenNameEQUAL	
searchers	TokenNameIdentifier	 searchers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("RECORD version=" + version + " ms=" + System.currentTimeMillis()); 	TokenNameCOMMENT_LINE	System.out.println("RECORD version=" + version + " ms=" + System.currentTimeMillis()); 
tracker	TokenNameIdentifier	 tracker
=	TokenNameEQUAL	
new	TokenNamenew	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
searchers	TokenNameIdentifier	 searchers
.	TokenNameDOT	
putIfAbsent	TokenNameIdentifier	 put If Absent
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
tracker	TokenNameIdentifier	 tracker
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Another thread beat us -- must decRef to undo 	TokenNameCOMMENT_LINE	Another thread beat us -- must decRef to undo 
// incRef done by SearcherTracker ctor: 	TokenNameCOMMENT_LINE	incRef done by SearcherTracker ctor: 
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
searcher	TokenNameIdentifier	 searcher
!=	TokenNameNOT_EQUAL	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"the provided searcher has the same underlying reader version yet the searcher instance differs from before (new="	TokenNameStringLiteral	the provided searcher has the same underlying reader version yet the searcher instance differs from before (new=
+	TokenNamePLUS	
searcher	TokenNameIdentifier	 searcher
+	TokenNamePLUS	
" vs old="	TokenNameStringLiteral	 vs old=
+	TokenNamePLUS	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve a previously recorded {@link IndexSearcher}, if it * has not yet been closed * * <p><b>NOTE</b>: this may return null when the * requested searcher has already timed out. When this * happens you should notify your user that their session * timed out and that they'll have to restart their * search. * * <p>If this returns a non-null result, you must match * later call {@link #release} on this searcher, best * from a finally clause. */	TokenNameCOMMENT_JAVADOC	 Retrieve a previously recorded {@link IndexSearcher}, if it has not yet been closed * <p><b>NOTE</b>: this may return null when the requested searcher has already timed out. When this happens you should notify your user that their session timed out and that they'll have to restart their search. * <p>If this returns a non-null result, you must match later call {@link #release} on this searcher, best from a finally clause. 
public	TokenNamepublic	
IndexSearcher	TokenNameIdentifier	 Index Searcher
acquire	TokenNameIdentifier	 acquire
(	TokenNameLPAREN	
long	TokenNamelong	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
tracker	TokenNameIdentifier	 tracker
=	TokenNameEQUAL	
searchers	TokenNameIdentifier	 searchers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tryIncRef	TokenNameIdentifier	 try Inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Release a searcher previously obtained from {@link * #acquire}. * * <p><b>NOTE</b>: it's fine to call this after close. */	TokenNameCOMMENT_JAVADOC	 Release a searcher previously obtained from {@link #acquire}. * <p><b>NOTE</b>: it's fine to call this after close. 
public	TokenNamepublic	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** See {@link #prune}. */	TokenNameCOMMENT_JAVADOC	 See {@link #prune}. 
public	TokenNamepublic	
interface	TokenNameinterface	
Pruner	TokenNameIdentifier	 Pruner
{	TokenNameLBRACE	
/** Return true if this searcher should be removed. * @param ageSec how much time has passed since this * searcher was the current (live) searcher * @param searcher Searcher **/	TokenNameCOMMENT_JAVADOC	 Return true if this searcher should be removed. @param ageSec how much time has passed since this searcher was the current (live) searcher @param searcher Searcher *
public	TokenNamepublic	
boolean	TokenNameboolean	
doPrune	TokenNameIdentifier	 do Prune
(	TokenNameLPAREN	
double	TokenNamedouble	
ageSec	TokenNameIdentifier	 age Sec
,	TokenNameCOMMA	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Simple pruner that drops any searcher older by * more than the specified seconds, than the newest * searcher. */	TokenNameCOMMENT_JAVADOC	 Simple pruner that drops any searcher older by more than the specified seconds, than the newest searcher. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
PruneByAge	TokenNameIdentifier	 Prune By Age
implements	TokenNameimplements	
Pruner	TokenNameIdentifier	 Pruner
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
maxAgeSec	TokenNameIdentifier	 max Age Sec
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PruneByAge	TokenNameIdentifier	 Prune By Age
(	TokenNameLPAREN	
double	TokenNamedouble	
maxAgeSec	TokenNameIdentifier	 max Age Sec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxAgeSec	TokenNameIdentifier	 max Age Sec
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxAgeSec must be > 0 (got "	TokenNameStringLiteral	maxAgeSec must be > 0 (got 
+	TokenNamePLUS	
maxAgeSec	TokenNameIdentifier	 max Age Sec
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxAgeSec	TokenNameIdentifier	 max Age Sec
=	TokenNameEQUAL	
maxAgeSec	TokenNameIdentifier	 max Age Sec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
doPrune	TokenNameIdentifier	 do Prune
(	TokenNameLPAREN	
double	TokenNamedouble	
ageSec	TokenNameIdentifier	 age Sec
,	TokenNameCOMMA	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ageSec	TokenNameIdentifier	 age Sec
>	TokenNameGREATER	
maxAgeSec	TokenNameIdentifier	 max Age Sec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Calls provided {@link Pruner} to prune entries. The * entries are passed to the Pruner in sorted (newest to * oldest IndexSearcher) order. * * <p><b>NOTE</b>: you must peridiocally call this, ideally * from the same background thread that opens new * searchers. */	TokenNameCOMMENT_JAVADOC	 Calls provided {@link Pruner} to prune entries. The entries are passed to the Pruner in sorted (newest to oldest IndexSearcher) order. * <p><b>NOTE</b>: you must peridiocally call this, ideally from the same background thread that opens new searchers. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
prune	TokenNameIdentifier	 prune
(	TokenNameLPAREN	
Pruner	TokenNameIdentifier	 Pruner
pruner	TokenNameIdentifier	 pruner
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Cannot just pass searchers.values() to ArrayList ctor 	TokenNameCOMMENT_LINE	Cannot just pass searchers.values() to ArrayList ctor 
// (not thread-safe since the values can change while 	TokenNameCOMMENT_LINE	(not thread-safe since the values can change while 
// ArrayList is init'ing itself); must instead iterate 	TokenNameCOMMENT_LINE	ArrayList is init'ing itself); must instead iterate 
// ourselves: 	TokenNameCOMMENT_LINE	ourselves: 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
>	TokenNameGREATER	
trackers	TokenNameIdentifier	 trackers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
tracker	TokenNameIdentifier	 tracker
:	TokenNameCOLON	
searchers	TokenNameIdentifier	 searchers
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trackers	TokenNameIdentifier	 trackers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
trackers	TokenNameIdentifier	 trackers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lastRecordTimeSec	TokenNameIdentifier	 last Record Time Sec
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
NANOS_PER_SEC	TokenNameIdentifier	 NANOS  PER  SEC
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
tracker	TokenNameIdentifier	 tracker
:	TokenNameCOLON	
trackers	TokenNameIdentifier	 trackers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
ageSec	TokenNameIdentifier	 age Sec
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastRecordTimeSec	TokenNameIdentifier	 last Record Time Sec
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ageSec	TokenNameIdentifier	 age Sec
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ageSec	TokenNameIdentifier	 age Sec
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
lastRecordTimeSec	TokenNameIdentifier	 last Record Time Sec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// First tracker is always age 0.0 sec, since it's 	TokenNameCOMMENT_LINE	First tracker is always age 0.0 sec, since it's 
// still "live"; second tracker's age (= seconds since 	TokenNameCOMMENT_LINE	still "live"; second tracker's age (= seconds since 
// it was "live") is now minus first tracker's 	TokenNameCOMMENT_LINE	it was "live") is now minus first tracker's 
// recordTime, etc: 	TokenNameCOMMENT_LINE	recordTime, etc: 
if	TokenNameif	
(	TokenNameLPAREN	
pruner	TokenNameIdentifier	 pruner
.	TokenNameDOT	
doPrune	TokenNameIdentifier	 do Prune
(	TokenNameLPAREN	
ageSec	TokenNameIdentifier	 age Sec
,	TokenNameCOMMA	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("PRUNE version=" + tracker.version + " age=" + ageSec + " ms=" + System.currentTimeMillis()); 	TokenNameCOMMENT_LINE	System.out.println("PRUNE version=" + tracker.version + " age=" + ageSec + " ms=" + System.currentTimeMillis()); 
searchers	TokenNameIdentifier	 searchers
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastRecordTimeSec	TokenNameIdentifier	 last Record Time Sec
=	TokenNameEQUAL	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
recordTimeSec	TokenNameIdentifier	 record Time Sec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Close this to future searching; any searches still in * process in other threads won't be affected, and they * should still call {@link #release} after they are * done. * * <p><b>NOTE: you must ensure no other threads are * calling {@link #record} while you call close(); * otherwise it's possible not all searcher references * will be freed. */	TokenNameCOMMENT_JAVADOC	 Close this to future searching; any searches still in process in other threads won't be affected, and they should still call {@link #release} after they are done. * <p><b>NOTE: you must ensure no other threads are calling {@link #record} while you call close(); otherwise it's possible not all searcher references will be freed. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
>	TokenNameGREATER	
toClose	TokenNameIdentifier	 to Close
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
>	TokenNameGREATER	
(	TokenNameLPAREN	
searchers	TokenNameIdentifier	 searchers
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove up front in case exc below, so we don't 	TokenNameCOMMENT_LINE	Remove up front in case exc below, so we don't 
// over-decRef on double-close: 	TokenNameCOMMENT_LINE	over-decRef on double-close: 
for	TokenNamefor	
(	TokenNameLPAREN	
SearcherTracker	TokenNameIdentifier	 Searcher Tracker
tracker	TokenNameIdentifier	 tracker
:	TokenNameCOLON	
toClose	TokenNameIdentifier	 to Close
)	TokenNameRPAREN	
{	TokenNameLBRACE	
searchers	TokenNameIdentifier	 searchers
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
toClose	TokenNameIdentifier	 to Close
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make some effort to catch mis-use: 	TokenNameCOMMENT_LINE	Make some effort to catch mis-use: 
if	TokenNameif	
(	TokenNameLPAREN	
searchers	TokenNameIdentifier	 searchers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"another thread called record while this SearcherLifetimeManager instance was being closed; not all searchers were closed"	TokenNameStringLiteral	another thread called record while this SearcherLifetimeManager instance was being closed; not all searchers were closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
