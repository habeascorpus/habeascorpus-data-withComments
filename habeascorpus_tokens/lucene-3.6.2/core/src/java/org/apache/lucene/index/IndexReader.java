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
Collection	TokenNameIdentifier	 Collection
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
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
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
Set	TokenNameIdentifier	 Set
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelector	TokenNameIdentifier	 Field Selector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
SearcherManager	TokenNameIdentifier	 Searcher Manager
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
Similarity	TokenNameIdentifier	 Similarity
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
*	TokenNameMULTIPLY	
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
VirtualMethod	TokenNameIdentifier	 Virtual Method
;	TokenNameSEMICOLON	
/** IndexReader is an abstract class, providing an interface for accessing an index. Search of an index is done entirely through this abstract interface, so that any subclass which implements it is searchable. <p> Concrete subclasses of IndexReader are usually constructed with a call to one of the static <code>open()</code> methods, e.g. {@link #open(Directory, boolean)}. <p> For efficiency, in this API documents are often referred to via <i>document numbers</i>, non-negative integers which each name a unique document in the index. These document numbers are ephemeral--they may change as documents are added to and deleted from an index. Clients should thus not rely on a given document having the same number between sessions. <p> An IndexReader can be opened on a directory for which an IndexWriter is opened already, but it cannot be used to delete documents from the index then. <p> <b>NOTE</b>: for backwards API compatibility, several methods are not listed as abstract, but have no useful implementations in this base class and instead always throw UnsupportedOperationException. Subclasses are strongly encouraged to override these methods, but in many cases may not need to. </p> <p> <b>NOTE</b>: as of 2.4, it's possible to open a read-only IndexReader using the static open methods that accept the boolean readOnly parameter. Such a reader has better concurrency as it's not necessary to synchronize on the isDeleted method. You must specify false if you want to make changes with the resulting IndexReader. </p> <a name="thread-safety"></a><p><b>NOTE</b>: {@link IndexReader} instances are completely thread safe, meaning multiple threads can call any of its methods, concurrently. If your application requires external synchronization, you should <b>not</b> synchronize on the <code>IndexReader</code> instance; use your own (non-Lucene) objects instead. */	TokenNameCOMMENT_JAVADOC	 IndexReader is an abstract class, providing an interface for accessing an index. Search of an index is done entirely through this abstract interface, so that any subclass which implements it is searchable. <p> Concrete subclasses of IndexReader are usually constructed with a call to one of the static <code>open()</code> methods, e.g. {@link #open(Directory, boolean)}. <p> For efficiency, in this API documents are often referred to via <i>document numbers</i>, non-negative integers which each name a unique document in the index. These document numbers are ephemeral--they may change as documents are added to and deleted from an index. Clients should thus not rely on a given document having the same number between sessions. <p> An IndexReader can be opened on a directory for which an IndexWriter is opened already, but it cannot be used to delete documents from the index then. <p> <b>NOTE</b>: for backwards API compatibility, several methods are not listed as abstract, but have no useful implementations in this base class and instead always throw UnsupportedOperationException. Subclasses are strongly encouraged to override these methods, but in many cases may not need to. </p> <p> <b>NOTE</b>: as of 2.4, it's possible to open a read-only IndexReader using the static open methods that accept the boolean readOnly parameter. Such a reader has better concurrency as it's not necessary to synchronize on the isDeleted method. You must specify false if you want to make changes with the resulting IndexReader. </p> <a name="thread-safety"></a><p><b>NOTE</b>: {@link IndexReader} instances are completely thread safe, meaning multiple threads can call any of its methods, concurrently. If your application requires external synchronization, you should <b>not</b> synchronize on the <code>IndexReader</code> instance; use your own (non-Lucene) objects instead. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
IndexReader	TokenNameIdentifier	 Index Reader
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
/** * A custom listener that's invoked when the IndexReader * is closed. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A custom listener that's invoked when the IndexReader is closed. * @lucene.experimental 
public	TokenNamepublic	
static	TokenNamestatic	
interface	TokenNameinterface	
ReaderClosedListener	TokenNameIdentifier	 Reader Closed Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onClose	TokenNameIdentifier	 on Close
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ReaderClosedListener	TokenNameIdentifier	 Reader Closed Listener
>	TokenNameGREATER	
readerClosedListeners	TokenNameIdentifier	 reader Closed Listeners
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
ReaderClosedListener	TokenNameIdentifier	 Reader Closed Listener
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Expert: adds a {@link ReaderClosedListener}. The * provided listener will be invoked when this reader is closed. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Expert: adds a {@link ReaderClosedListener}. The provided listener will be invoked when this reader is closed. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addReaderClosedListener	TokenNameIdentifier	 add Reader Closed Listener
(	TokenNameLPAREN	
ReaderClosedListener	TokenNameIdentifier	 Reader Closed Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readerClosedListeners	TokenNameIdentifier	 reader Closed Listeners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: remove a previously added {@link ReaderClosedListener}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Expert: remove a previously added {@link ReaderClosedListener}. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
removeReaderClosedListener	TokenNameIdentifier	 remove Reader Closed Listener
(	TokenNameLPAREN	
ReaderClosedListener	TokenNameIdentifier	 Reader Closed Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readerClosedListeners	TokenNameIdentifier	 reader Closed Listeners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
notifyReaderClosedListeners	TokenNameIdentifier	 notify Reader Closed Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
readerClosedListeners	TokenNameIdentifier	 reader Closed Listeners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ReaderClosedListener	TokenNameIdentifier	 Reader Closed Listener
listener	TokenNameIdentifier	 listener
:	TokenNameCOLON	
readerClosedListeners	TokenNameIdentifier	 reader Closed Listeners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
onClose	TokenNameIdentifier	 on Close
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasChanges	TokenNameIdentifier	 has Changes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
refCount	TokenNameIdentifier	 ref Count
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Expert: returns the current refCount for this reader */	TokenNameCOMMENT_JAVADOC	 Expert: returns the current refCount for this reader 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getRefCount	TokenNameIdentifier	 get Ref Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
refCount	TokenNameIdentifier	 ref Count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: increments the refCount of this IndexReader * instance. RefCounts are used to determine when a * reader can be closed safely, i.e. as soon as there are * no more references. Be sure to always call a * corresponding {@link #decRef}, in a finally clause; * otherwise the reader may never be closed. Note that * {@link #close} simply calls decRef(), which means that * the IndexReader will not really be closed until {@link * #decRef} has been called for all outstanding * references. * * @see #decRef * @see #tryIncRef */	TokenNameCOMMENT_JAVADOC	 Expert: increments the refCount of this IndexReader instance. RefCounts are used to determine when a reader can be closed safely, i.e. as soon as there are no more references. Be sure to always call a corresponding {@link #decRef}, in a finally clause; otherwise the reader may never be closed. Note that {@link #close} simply calls decRef(), which means that the IndexReader will not really be closed until {@link #decRef} has been called for all outstanding references. * @see #decRef @see #tryIncRef 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
refCount	TokenNameIdentifier	 ref Count
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: increments the refCount of this IndexReader * instance only if the IndexReader has not been closed yet * and returns <code>true</code> iff the refCount was * successfully incremented, otherwise <code>false</code>. * If this method returns <code>false</code> the reader is either * already closed or is currently been closed. Either way this * reader instance shouldn't be used by an application unless * <code>true</code> is returned. * <p> * RefCounts are used to determine when a * reader can be closed safely, i.e. as soon as there are * no more references. Be sure to always call a * corresponding {@link #decRef}, in a finally clause; * otherwise the reader may never be closed. Note that * {@link #close} simply calls decRef(), which means that * the IndexReader will not really be closed until {@link * #decRef} has been called for all outstanding * references. * * @see #decRef * @see #incRef */	TokenNameCOMMENT_JAVADOC	 Expert: increments the refCount of this IndexReader instance only if the IndexReader has not been closed yet and returns <code>true</code> iff the refCount was successfully incremented, otherwise <code>false</code>. If this method returns <code>false</code> the reader is either already closed or is currently been closed. Either way this reader instance shouldn't be used by an application unless <code>true</code> is returned. <p> RefCounts are used to determine when a reader can be closed safely, i.e. as soon as there are no more references. Be sure to always call a corresponding {@link #decRef}, in a finally clause; otherwise the reader may never be closed. Note that {@link #close} simply calls decRef(), which means that the IndexReader will not really be closed until {@link #decRef} has been called for all outstanding references. * @see #decRef @see #incRef 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
tryIncRef	TokenNameIdentifier	 try Inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
refCount	TokenNameIdentifier	 ref Count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refCount	TokenNameIdentifier	 ref Count
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasChanges	TokenNameIdentifier	 has Changes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
=	TokenNameEQUAL	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: decreases the refCount of this IndexReader * instance. If the refCount drops to 0, then pending * changes (if any) are committed to the index and this * reader is closed. If an exception is hit, the refCount * is unchanged. * * @throws IOException in case an IOException occurs in commit() or doClose() * * @see #incRef */	TokenNameCOMMENT_JAVADOC	 Expert: decreases the refCount of this IndexReader instance. If the refCount drops to 0, then pending changes (if any) are committed to the index and this reader is closed. If an exception is hit, the refCount is unchanged. * @throws IOException in case an IOException occurs in commit() or doClose() * @see #incRef 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
refCount	TokenNameIdentifier	 ref Count
.	TokenNameDOT	
decrementAndGet	TokenNameIdentifier	 decrement And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doClose	TokenNameIdentifier	 do Close
(	TokenNameLPAREN	
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
// Put reference back on failure 	TokenNameCOMMENT_LINE	Put reference back on failure 
refCount	TokenNameIdentifier	 ref Count
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
notifyReaderClosedListeners	TokenNameIdentifier	 notify Reader Closed Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"too many decRef calls: refCount is "	TokenNameStringLiteral	too many decRef calls: refCount is 
+	TokenNamePLUS	
rc	TokenNameIdentifier	 rc
+	TokenNamePLUS	
" after decrement"	TokenNameStringLiteral	 after decrement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refCount	TokenNameIdentifier	 ref Count
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @throws AlreadyClosedException if this IndexReader is closed */	TokenNameCOMMENT_JAVADOC	 @throws AlreadyClosedException if this IndexReader is closed 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refCount	TokenNameIdentifier	 ref Count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"this IndexReader is closed"	TokenNameStringLiteral	this IndexReader is closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns a IndexReader reading the index in the given * Directory, with readOnly=true. * @param directory the index directory * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns a IndexReader reading the index in the given Directory, with readOnly=true. @param directory the index directory @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an IndexReader reading the index in the given * Directory. You should pass readOnly=true, since it * gives much better concurrent performance, unless you * intend to do write operations (delete documents or * change norms) with the reader. * @param directory the index directory * @param readOnly true if no changes (deletions, norms) will be made with this IndexReader * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #open(Directory)} instead */	TokenNameCOMMENT_JAVADOC	 Returns an IndexReader reading the index in the given Directory. You should pass readOnly=true, since it gives much better concurrent performance, unless you intend to do write operations (delete documents or change norms) with the reader. @param directory the index directory @param readOnly true if no changes (deletions, norms) will be made with this IndexReader @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. Use {@link #open(Directory)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Open a near real time IndexReader from the {@link org.apache.lucene.index.IndexWriter}. * * @param writer The IndexWriter to open from * @param applyAllDeletes If true, all buffered deletes will * be applied (made visible) in the returned reader. If * false, the deletes are not applied but remain buffered * (in IndexWriter) so that they will be applied in the * future. Applying deletes can be costly, so if your app * can tolerate deleted documents being returned you might * gain some performance by passing false. * @return The new IndexReader * @throws CorruptIndexException * @throws IOException if there is a low-level IO error * * @see #openIfChanged(IndexReader,IndexWriter,boolean) * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Open a near real time IndexReader from the {@link org.apache.lucene.index.IndexWriter}. * @param writer The IndexWriter to open from @param applyAllDeletes If true, all buffered deletes will be applied (made visible) in the returned reader. If false, the deletes are not applied but remain buffered (in IndexWriter) so that they will be applied in the future. Applying deletes can be costly, so if your app can tolerate deleted documents being returned you might gain some performance by passing false. @return The new IndexReader @throws CorruptIndexException @throws IOException if there is a low-level IO error * @see #openIfChanged(IndexReader,IndexWriter,boolean) * @lucene.experimental 
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: returns an IndexReader reading the index in the given * {@link IndexCommit}. * @param commit the commit point to open * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Expert: returns an IndexReader reading the index in the given {@link IndexCommit}. @param commit the commit point to open @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: returns an IndexReader reading the index in the given * {@link IndexCommit}. You should pass readOnly=true, since it * gives much better concurrent performance, unless you * intend to do write operations (delete documents or * change norms) with the reader. * @param commit the commit point to open * @param readOnly true if no changes (deletions, norms) will be made with this IndexReader * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #open(IndexCommit)} instead */	TokenNameCOMMENT_JAVADOC	 Expert: returns an IndexReader reading the index in the given {@link IndexCommit}. You should pass readOnly=true, since it gives much better concurrent performance, unless you intend to do write operations (delete documents or change norms) with the reader. @param commit the commit point to open @param readOnly true if no changes (deletions, norms) will be made with this IndexReader @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. Use {@link #open(IndexCommit)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: returns an IndexReader reading the index in * the given Directory, with a custom {@link * IndexDeletionPolicy}. You should pass readOnly=true, * since it gives much better concurrent performance, * unless you intend to do write operations (delete * documents or change norms) with the reader. * @param directory the index directory * @param deletionPolicy a custom deletion policy (only used * if you use this reader to perform deletes or to set * norms); see {@link IndexWriter} for details. * @param readOnly true if no changes (deletions, norms) will be made with this IndexReader * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #open(Directory)} instead */	TokenNameCOMMENT_JAVADOC	 Expert: returns an IndexReader reading the index in the given Directory, with a custom {@link IndexDeletionPolicy}. You should pass readOnly=true, since it gives much better concurrent performance, unless you intend to do write operations (delete documents or change norms) with the reader. @param directory the index directory @param deletionPolicy a custom deletion policy (only used if you use this reader to perform deletes or to set norms); see {@link IndexWriter} for details. @param readOnly true if no changes (deletions, norms) will be made with this IndexReader @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. Use {@link #open(Directory)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: returns an IndexReader reading the index in * the given Directory, with a custom {@link * IndexDeletionPolicy}. You should pass readOnly=true, * since it gives much better concurrent performance, * unless you intend to do write operations (delete * documents or change norms) with the reader. * @param directory the index directory * @param deletionPolicy a custom deletion policy (only used * if you use this reader to perform deletes or to set * norms); see {@link IndexWriter} for details. * @param readOnly true if no changes (deletions, norms) will be made with this IndexReader * @param termInfosIndexDivisor Subsamples which indexed * terms are loaded into RAM. This has the same effect as {@link * IndexWriter#setTermIndexInterval} except that setting * must be done at indexing time while this setting can be * set per reader. When set to N, then one in every * N*termIndexInterval terms in the index is loaded into * memory. By setting this to a value > 1 you can reduce * memory usage, at the expense of higher latency when * loading a TermInfo. The default value is 1. Set this * to -1 to skip loading the terms index entirely. * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #open(Directory,int)} instead */	TokenNameCOMMENT_JAVADOC	 Expert: returns an IndexReader reading the index in the given Directory, with a custom {@link IndexDeletionPolicy}. You should pass readOnly=true, since it gives much better concurrent performance, unless you intend to do write operations (delete documents or change norms) with the reader. @param directory the index directory @param deletionPolicy a custom deletion policy (only used if you use this reader to perform deletes or to set norms); see {@link IndexWriter} for details. @param readOnly true if no changes (deletions, norms) will be made with this IndexReader @param termInfosIndexDivisor Subsamples which indexed terms are loaded into RAM. This has the same effect as {@link IndexWriter#setTermIndexInterval} except that setting must be done at indexing time while this setting can be set per reader. When set to N, then one in every N*termIndexInterval terms in the index is loaded into memory. By setting this to a value > 1 you can reduce memory usage, at the expense of higher latency when loading a TermInfo. The default value is 1. Set this to -1 to skip loading the terms index entirely. @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. Use {@link #open(Directory,int)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: returns an IndexReader reading the index in * the given Directory, using a specific commit and with * a custom {@link IndexDeletionPolicy}. You should pass * readOnly=true, since it gives much better concurrent * performance, unless you intend to do write operations * (delete documents or change norms) with the reader. * @param commit the specific {@link IndexCommit} to open; * see {@link IndexReader#listCommits} to list all commits * in a directory * @param deletionPolicy a custom deletion policy (only used * if you use this reader to perform deletes or to set * norms); see {@link IndexWriter} for details. * @param readOnly true if no changes (deletions, norms) will be made with this IndexReader * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #open(IndexCommit)} instead */	TokenNameCOMMENT_JAVADOC	 Expert: returns an IndexReader reading the index in the given Directory, using a specific commit and with a custom {@link IndexDeletionPolicy}. You should pass readOnly=true, since it gives much better concurrent performance, unless you intend to do write operations (delete documents or change norms) with the reader. @param commit the specific {@link IndexCommit} to open; see {@link IndexReader#listCommits} to list all commits in a directory @param deletionPolicy a custom deletion policy (only used if you use this reader to perform deletes or to set norms); see {@link IndexWriter} for details. @param readOnly true if no changes (deletions, norms) will be made with this IndexReader @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. Use {@link #open(IndexCommit)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: returns an IndexReader reading the index in * the given Directory, using a specific commit and with * a custom {@link IndexDeletionPolicy}. You should pass * readOnly=true, since it gives much better concurrent * performance, unless you intend to do write operations * (delete documents or change norms) with the reader. * @param commit the specific {@link IndexCommit} to open; * see {@link IndexReader#listCommits} to list all commits * in a directory * @param deletionPolicy a custom deletion policy (only used * if you use this reader to perform deletes or to set * norms); see {@link IndexWriter} for details. * @param readOnly true if no changes (deletions, norms) will be made with this IndexReader * @param termInfosIndexDivisor Subsamples which indexed * terms are loaded into RAM. This has the same effect as {@link * IndexWriter#setTermIndexInterval} except that setting * must be done at indexing time while this setting can be * set per reader. When set to N, then one in every * N*termIndexInterval terms in the index is loaded into * memory. By setting this to a value > 1 you can reduce * memory usage, at the expense of higher latency when * loading a TermInfo. The default value is 1. Set this * to -1 to skip loading the terms index entirely. This is only useful in * advanced situations when you will only .next() through all terms; * attempts to seek will hit an exception. * * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #open(IndexCommit,int)} instead */	TokenNameCOMMENT_JAVADOC	 Expert: returns an IndexReader reading the index in the given Directory, using a specific commit and with a custom {@link IndexDeletionPolicy}. You should pass readOnly=true, since it gives much better concurrent performance, unless you intend to do write operations (delete documents or change norms) with the reader. @param commit the specific {@link IndexCommit} to open; see {@link IndexReader#listCommits} to list all commits in a directory @param deletionPolicy a custom deletion policy (only used if you use this reader to perform deletes or to set norms); see {@link IndexWriter} for details. @param readOnly true if no changes (deletions, norms) will be made with this IndexReader @param termInfosIndexDivisor Subsamples which indexed terms are loaded into RAM. This has the same effect as {@link IndexWriter#setTermIndexInterval} except that setting must be done at indexing time while this setting can be set per reader. When set to N, then one in every N*termIndexInterval terms in the index is loaded into memory. By setting this to a value > 1 you can reduce memory usage, at the expense of higher latency when loading a TermInfo. The default value is 1. Set this to -1 to skip loading the terms index entirely. This is only useful in advanced situations when you will only .next() through all terms; attempts to seek will hit an exception. * @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. Use {@link #open(IndexCommit,int)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: Returns a IndexReader reading the index in the given * Director and given termInfosIndexDivisor * @param directory the index directory * @param termInfosIndexDivisor Subsamples which indexed * terms are loaded into RAM. This has the same effect as {@link * IndexWriterConfig#setTermIndexInterval} except that setting * must be done at indexing time while this setting can be * set per reader. When set to N, then one in every * N*termIndexInterval terms in the index is loaded into * memory. By setting this to a value > 1 you can reduce * memory usage, at the expense of higher latency when * loading a TermInfo. The default value is 1. Set this * to -1 to skip loading the terms index entirely. * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Expert: Returns a IndexReader reading the index in the given Director and given termInfosIndexDivisor @param directory the index directory @param termInfosIndexDivisor Subsamples which indexed terms are loaded into RAM. This has the same effect as {@link IndexWriterConfig#setTermIndexInterval} except that setting must be done at indexing time while this setting can be set per reader. When set to N, then one in every N*termIndexInterval terms in the index is loaded into memory. By setting this to a value > 1 you can reduce memory usage, at the expense of higher latency when loading a TermInfo. The default value is 1. Set this to -1 to skip loading the terms index entirely. @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: returns an IndexReader reading the index in the given * {@link IndexCommit} and termInfosIndexDivisor. * @param commit the commit point to open * @param termInfosIndexDivisor Subsamples which indexed * terms are loaded into RAM. This has the same effect as {@link * IndexWriterConfig#setTermIndexInterval} except that setting * must be done at indexing time while this setting can be * set per reader. When set to N, then one in every * N*termIndexInterval terms in the index is loaded into * memory. By setting this to a value > 1 you can reduce * memory usage, at the expense of higher latency when * loading a TermInfo. The default value is 1. Set this * to -1 to skip loading the terms index entirely. * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Expert: returns an IndexReader reading the index in the given {@link IndexCommit} and termInfosIndexDivisor. @param commit the commit point to open @param termInfosIndexDivisor Subsamples which indexed terms are loaded into RAM. This has the same effect as {@link IndexWriterConfig#setTermIndexInterval} except that setting must be done at indexing time while this setting can be set per reader. When set to N, then one in every N*termIndexInterval terms in the index is loaded into memory. By setting this to a value > 1 you can reduce memory usage, at the expense of higher latency when loading a TermInfo. The default value is 1. Set this to -1 to skip loading the terms index entirely. @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the index has changed since the provided reader was * opened, open and return a new reader; else, return * null. The new reader, if not null, will be the same * type of reader as the previous one, ie an NRT reader * will open a new NRT reader, a MultiReader will open a * new MultiReader, etc. * * <p>This method is typically far less costly than opening a * fully new <code>IndexReader</code> as it shares * resources (for example sub-readers) with the provided * <code>IndexReader</code>, when possible. * * <p>The provided reader is not closed (you are responsible * for doing so); if a new reader is returned you also * must eventually close it. Be sure to never close a * reader while other threads are still using it; see * {@link SearcherManager} to simplify managing this. * * <p>If a new reader is returned, it's safe to make changes * (deletions, norms) with it. All shared mutable state * with the old reader uses "copy on write" semantics to * ensure the changes are not seen by other readers. * * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @return null if there are no changes; else, a new * IndexReader instance which you must eventually close */	TokenNameCOMMENT_JAVADOC	 If the index has changed since the provided reader was opened, open and return a new reader; else, return null. The new reader, if not null, will be the same type of reader as the previous one, ie an NRT reader will open a new NRT reader, a MultiReader will open a new MultiReader, etc. * <p>This method is typically far less costly than opening a fully new <code>IndexReader</code> as it shares resources (for example sub-readers) with the provided <code>IndexReader</code>, when possible. * <p>The provided reader is not closed (you are responsible for doing so); if a new reader is returned you also must eventually close it. Be sure to never close a reader while other threads are still using it; see {@link SearcherManager} to simplify managing this. * <p>If a new reader is returned, it's safe to make changes (deletions, norms) with it. All shared mutable state with the old reader uses "copy on write" semantics to ensure the changes are not seen by other readers. * @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @return null if there are no changes; else, a new IndexReader instance which you must eventually close 
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
hasNewReopenAPI1	TokenNameIdentifier	 has New Reopen AP I1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
newReader	TokenNameIdentifier	 new Reader
!=	TokenNameNOT_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
reopen	TokenNameIdentifier	 reopen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If the index has changed since the provided reader was * opened, open and return a new reader, with the * specified <code>readOnly</code>; else, return * null. * * @see #openIfChanged(IndexReader) * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #openIfChanged(IndexReader)} instead */	TokenNameCOMMENT_JAVADOC	 If the index has changed since the provided reader was opened, open and return a new reader, with the specified <code>readOnly</code>; else, return null. * @see #openIfChanged(IndexReader) @deprecated Write support will be removed in Lucene 4.0. Use {@link #openIfChanged(IndexReader)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
oldReader	TokenNameIdentifier	 old Reader
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
hasNewReopenAPI2	TokenNameIdentifier	 has New Reopen AP I2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
newReader	TokenNameIdentifier	 new Reader
!=	TokenNameNOT_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
reopen	TokenNameIdentifier	 reopen
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If the IndexCommit differs from what the * provided reader is searching, or the provided reader is * not already read-only, open and return a new * <code>readOnly=true</code> reader; else, return null. * * @see #openIfChanged(IndexReader) */	TokenNameCOMMENT_JAVADOC	 If the IndexCommit differs from what the provided reader is searching, or the provided reader is not already read-only, open and return a new <code>readOnly=true</code> reader; else, return null. * @see #openIfChanged(IndexReader) 
// TODO: should you be able to specify readOnly? 	TokenNameCOMMENT_LINE	TODO: should you be able to specify readOnly? 
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
oldReader	TokenNameIdentifier	 old Reader
,	TokenNameCOMMA	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
hasNewReopenAPI3	TokenNameIdentifier	 has New Reopen AP I3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
newReader	TokenNameIdentifier	 new Reader
!=	TokenNameNOT_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
reopen	TokenNameIdentifier	 reopen
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Expert: If there changes (committed or not) in the * {@link IndexWriter} versus what the provided reader is * searching, then open and return a new read-only * IndexReader searching both committed and uncommitted * changes from the writer; else, return null (though, the * current implementation never returns null). * * <p>This provides "near real-time" searching, in that * changes made during an {@link IndexWriter} session can be * quickly made available for searching without closing * the writer nor calling {@link IndexWriter#commit}. * * <p>It's <i>near</i> real-time because there is no hard * guarantee on how quickly you can get a new reader after * making changes with IndexWriter. You'll have to * experiment in your situation to determine if it's * fast enough. As this is a new and experimental * feature, please report back on your findings so we can * learn, improve and iterate.</p> * * <p>The very first time this method is called, this * writer instance will make every effort to pool the * readers that it opens for doing merges, applying * deletes, etc. This means additional resources (RAM, * file descriptors, CPU time) will be consumed.</p> * * <p>For lower latency on reopening a reader, you should * call {@link IndexWriterConfig#setMergedSegmentWarmer} to * pre-warm a newly merged segment before it's committed * to the index. This is important for minimizing * index-to-search delay after a large merge. </p> * * <p>If an addIndexes* call is running in another thread, * then this reader will only search those segments from * the foreign index that have been successfully copied * over, so far.</p> * * <p><b>NOTE</b>: Once the writer is closed, any * outstanding readers may continue to be used. However, * if you attempt to reopen any of those readers, you'll * hit an {@link AlreadyClosedException}.</p> * * @return IndexReader that covers entire index plus all * changes made so far by this IndexWriter instance, or * null if there are no new changes * * @param writer The IndexWriter to open from * * @param applyAllDeletes If true, all buffered deletes will * be applied (made visible) in the returned reader. If * false, the deletes are not applied but remain buffered * (in IndexWriter) so that they will be applied in the * future. Applying deletes can be costly, so if your app * can tolerate deleted documents being returned you might * gain some performance by passing false. * * @throws IOException * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Expert: If there changes (committed or not) in the {@link IndexWriter} versus what the provided reader is searching, then open and return a new read-only IndexReader searching both committed and uncommitted changes from the writer; else, return null (though, the current implementation never returns null). * <p>This provides "near real-time" searching, in that changes made during an {@link IndexWriter} session can be quickly made available for searching without closing the writer nor calling {@link IndexWriter#commit}. * <p>It's <i>near</i> real-time because there is no hard guarantee on how quickly you can get a new reader after making changes with IndexWriter. You'll have to experiment in your situation to determine if it's fast enough. As this is a new and experimental feature, please report back on your findings so we can learn, improve and iterate.</p> * <p>The very first time this method is called, this writer instance will make every effort to pool the readers that it opens for doing merges, applying deletes, etc. This means additional resources (RAM, file descriptors, CPU time) will be consumed.</p> * <p>For lower latency on reopening a reader, you should call {@link IndexWriterConfig#setMergedSegmentWarmer} to pre-warm a newly merged segment before it's committed to the index. This is important for minimizing index-to-search delay after a large merge. </p> * <p>If an addIndexes* call is running in another thread, then this reader will only search those segments from the foreign index that have been successfully copied over, so far.</p> * <p><b>NOTE</b>: Once the writer is closed, any outstanding readers may continue to be used. However, if you attempt to reopen any of those readers, you'll hit an {@link AlreadyClosedException}.</p> * @return IndexReader that covers entire index plus all changes made so far by this IndexWriter instance, or null if there are no new changes * @param writer The IndexWriter to open from * @param applyAllDeletes If true, all buffered deletes will be applied (made visible) in the returned reader. If false, the deletes are not applied but remain buffered (in IndexWriter) so that they will be applied in the future. Applying deletes can be costly, so if your app can tolerate deleted documents being returned you might gain some performance by passing false. * @throws IOException * @lucene.experimental 
public	TokenNamepublic	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
oldReader	TokenNameIdentifier	 old Reader
,	TokenNameCOMMA	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
hasNewReopenAPI4	TokenNameIdentifier	 has New Reopen AP I4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
newReader	TokenNameIdentifier	 new Reader
!=	TokenNameNOT_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
reopen	TokenNameIdentifier	 reopen
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Refreshes an IndexReader if the index has changed since this instance * was (re)opened. * <p> * Opening an IndexReader is an expensive operation. This method can be used * to refresh an existing IndexReader to reduce these costs. This method * tries to only load segments that have changed or were created after the * IndexReader was (re)opened. * <p> * If the index has not changed since this instance was (re)opened, then this * call is a NOOP and returns this instance. Otherwise, a new instance is * returned. The old instance is <b>not</b> closed and remains usable.<br> * <p> * If the reader is reopened, even though they share * resources internally, it's safe to make changes * (deletions, norms) with the new reader. All shared * mutable state obeys "copy on write" semantics to ensure * the changes are not seen by other readers. * <p> * You can determine whether a reader was actually reopened by comparing the * old instance with the instance returned by this method: * <pre> * IndexReader reader = ... * ... * IndexReader newReader = r.reopen(); * if (newReader != reader) { * ... // reader was reopened * reader.close(); * } * reader = newReader; * ... * </pre> * * Be sure to synchronize that code so that other threads, * if present, can never use reader after it has been * closed and before it's switched to newReader. * * <p><b>NOTE</b>: If this reader is a near real-time * reader (obtained from {@link IndexWriter#getReader()}, * reopen() will simply call writer.getReader() again for * you, though this may change in the future. * * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Use {@link #openIfChanged(IndexReader)} instead */	TokenNameCOMMENT_JAVADOC	 Refreshes an IndexReader if the index has changed since this instance was (re)opened. <p> Opening an IndexReader is an expensive operation. This method can be used to refresh an existing IndexReader to reduce these costs. This method tries to only load segments that have changed or were created after the IndexReader was (re)opened. <p> If the index has not changed since this instance was (re)opened, then this call is a NOOP and returns this instance. Otherwise, a new instance is returned. The old instance is <b>not</b> closed and remains usable.<br> <p> If the reader is reopened, even though they share resources internally, it's safe to make changes (deletions, norms) with the new reader. All shared mutable state obeys "copy on write" semantics to ensure the changes are not seen by other readers. <p> You can determine whether a reader was actually reopened by comparing the old instance with the instance returned by this method: <pre> IndexReader reader = ... ... IndexReader newReader = r.reopen(); if (newReader != reader) { ... // reader was reopened reader.close(); } reader = newReader; ... </pre> * Be sure to synchronize that code so that other threads, if present, can never use reader after it has been closed and before it's switched to newReader. * <p><b>NOTE</b>: If this reader is a near real-time reader (obtained from {@link IndexWriter#getReader()}, reopen() will simply call writer.getReader() again for you, though this may change in the future. * @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Use {@link #openIfChanged(IndexReader)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
reopen	TokenNameIdentifier	 reopen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Just like {@link #reopen()}, except you can change the * readOnly of the original reader. If the index is * unchanged but readOnly is different then a new reader * will be returned. * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #openIfChanged(IndexReader)} instead */	TokenNameCOMMENT_JAVADOC	 Just like {@link #reopen()}, except you can change the readOnly of the original reader. If the index is unchanged but readOnly is different then a new reader will be returned. @deprecated Write support will be removed in Lucene 4.0. Use {@link #openIfChanged(IndexReader)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
reopen	TokenNameIdentifier	 reopen
(	TokenNameLPAREN	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Expert: reopen this reader on a specific commit point. * This always returns a readOnly reader. If the * specified commit point matches what this reader is * already on, and this reader is already readOnly, then * this same instance is returned; if it is not already * readOnly, a readOnly clone is returned. * @deprecated Use {@link #openIfChanged(IndexReader,IndexCommit)} instead */	TokenNameCOMMENT_JAVADOC	 Expert: reopen this reader on a specific commit point. This always returns a readOnly reader. If the specified commit point matches what this reader is already on, and this reader is already readOnly, then this same instance is returned; if it is not already readOnly, a readOnly clone is returned. @deprecated Use {@link #openIfChanged(IndexReader,IndexCommit)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
reopen	TokenNameIdentifier	 reopen
(	TokenNameLPAREN	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Expert: returns a readonly reader, covering all * committed as well as un-committed changes to the index. * This provides "near real-time" searching, in that * changes made during an IndexWriter session can be * quickly made available for searching without closing * the writer nor calling {@link #commit}. * * <p>Note that this is functionally equivalent to calling * {#flush} (an internal IndexWriter operation) and then using {@link IndexReader#open} to * open a new reader. But the turnaround time of this * method should be faster since it avoids the potentially * costly {@link #commit}.</p> * * <p>You must close the {@link IndexReader} returned by * this method once you are done using it.</p> * * <p>It's <i>near</i> real-time because there is no hard * guarantee on how quickly you can get a new reader after * making changes with IndexWriter. You'll have to * experiment in your situation to determine if it's * fast enough. As this is a new and experimental * feature, please report back on your findings so we can * learn, improve and iterate.</p> * * <p>The resulting reader supports {@link * IndexReader#reopen}, but that call will simply forward * back to this method (though this may change in the * future).</p> * * <p>The very first time this method is called, this * writer instance will make every effort to pool the * readers that it opens for doing merges, applying * deletes, etc. This means additional resources (RAM, * file descriptors, CPU time) will be consumed.</p> * * <p>For lower latency on reopening a reader, you should * call {@link IndexWriterConfig#setMergedSegmentWarmer} to * pre-warm a newly merged segment before it's committed * to the index. This is important for minimizing * index-to-search delay after a large merge. </p> * * <p>If an addIndexes* call is running in another thread, * then this reader will only search those segments from * the foreign index that have been successfully copied * over, so far</p>. * * <p><b>NOTE</b>: Once the writer is closed, any * outstanding readers may continue to be used. However, * if you attempt to reopen any of those readers, you'll * hit an {@link AlreadyClosedException}.</p> * * @return IndexReader that covers entire index plus all * changes made so far by this IndexWriter instance * * @param writer The IndexWriter to open from * @param applyAllDeletes If true, all buffered deletes will * be applied (made visible) in the returned reader. If * false, the deletes are not applied but remain buffered * (in IndexWriter) so that they will be applied in the * future. Applying deletes can be costly, so if your app * can tolerate deleted documents being returned you might * gain some performance by passing false. * * @throws IOException * * @lucene.experimental * @deprecated Use {@link #openIfChanged(IndexReader,IndexWriter,boolean)} instead */	TokenNameCOMMENT_JAVADOC	 Expert: returns a readonly reader, covering all committed as well as un-committed changes to the index. This provides "near real-time" searching, in that changes made during an IndexWriter session can be quickly made available for searching without closing the writer nor calling {@link #commit}. * <p>Note that this is functionally equivalent to calling {#flush} (an internal IndexWriter operation) and then using {@link IndexReader#open} to open a new reader. But the turnaround time of this method should be faster since it avoids the potentially costly {@link #commit}.</p> * <p>You must close the {@link IndexReader} returned by this method once you are done using it.</p> * <p>It's <i>near</i> real-time because there is no hard guarantee on how quickly you can get a new reader after making changes with IndexWriter. You'll have to experiment in your situation to determine if it's fast enough. As this is a new and experimental feature, please report back on your findings so we can learn, improve and iterate.</p> * <p>The resulting reader supports {@link IndexReader#reopen}, but that call will simply forward back to this method (though this may change in the future).</p> * <p>The very first time this method is called, this writer instance will make every effort to pool the readers that it opens for doing merges, applying deletes, etc. This means additional resources (RAM, file descriptors, CPU time) will be consumed.</p> * <p>For lower latency on reopening a reader, you should call {@link IndexWriterConfig#setMergedSegmentWarmer} to pre-warm a newly merged segment before it's committed to the index. This is important for minimizing index-to-search delay after a large merge. </p> * <p>If an addIndexes* call is running in another thread, then this reader will only search those segments from the foreign index that have been successfully copied over, so far</p>. * <p><b>NOTE</b>: Once the writer is closed, any outstanding readers may continue to be used. However, if you attempt to reopen any of those readers, you'll hit an {@link AlreadyClosedException}.</p> * @return IndexReader that covers entire index plus all changes made so far by this IndexWriter instance * @param writer The IndexWriter to open from @param applyAllDeletes If true, all buffered deletes will be applied (made visible) in the returned reader. If false, the deletes are not applied but remain buffered (in IndexWriter) so that they will be applied in the future. Applying deletes can be costly, so if your app can tolerate deleted documents being returned you might gain some performance by passing false. * @throws IOException * @lucene.experimental @deprecated Use {@link #openIfChanged(IndexReader,IndexWriter,boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
reopen	TokenNameIdentifier	 reopen
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If the index has changed since it was opened, open and return a new reader; * else, return {@code null}. * * @see #openIfChanged(IndexReader) */	TokenNameCOMMENT_JAVADOC	 If the index has changed since it was opened, open and return a new reader; else, return {@code null}. * @see #openIfChanged(IndexReader) 
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support reopen()."	TokenNameStringLiteral	This reader does not support reopen().
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the index has changed since it was opened, open and return a new reader; * else, return {@code null}. * * @see #openIfChanged(IndexReader, boolean) * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #doOpenIfChanged()} instead */	TokenNameCOMMENT_JAVADOC	 If the index has changed since it was opened, open and return a new reader; else, return {@code null}. * @see #openIfChanged(IndexReader, boolean) @deprecated Write support will be removed in Lucene 4.0. Use {@link #doOpenIfChanged()} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support reopen()."	TokenNameStringLiteral	This reader does not support reopen().
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the index has changed since it was opened, open and return a new reader; * else, return {@code null}. * * @see #openIfChanged(IndexReader, IndexCommit) */	TokenNameCOMMENT_JAVADOC	 If the index has changed since it was opened, open and return a new reader; else, return {@code null}. * @see #openIfChanged(IndexReader, IndexCommit) 
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support reopen(IndexCommit)."	TokenNameStringLiteral	This reader does not support reopen(IndexCommit).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the index has changed since it was opened, open and return a new reader; * else, return {@code null}. * * @see #openIfChanged(IndexReader, IndexWriter, boolean) */	TokenNameCOMMENT_JAVADOC	 If the index has changed since it was opened, open and return a new reader; else, return {@code null}. * @see #openIfChanged(IndexReader, IndexWriter, boolean) 
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Efficiently clones the IndexReader (sharing most * internal state). * <p> * On cloning a reader with pending changes (deletions, * norms), the original reader transfers its write lock to * the cloned reader. This means only the cloned reader * may make further changes to the index, and commit the * changes to the index on close, but the old reader still * reflects all changes made up until it was cloned. * <p> * Like {@link #openIfChanged(IndexReader)}, it's safe to make changes to * either the original or the cloned reader: all shared * mutable state obeys "copy on write" semantics to ensure * the changes are not seen by other readers. * <p> */	TokenNameCOMMENT_JAVADOC	 Efficiently clones the IndexReader (sharing most internal state). <p> On cloning a reader with pending changes (deletions, norms), the original reader transfers its write lock to the cloned reader. This means only the cloned reader may make further changes to the index, and commit the changes to the index on close, but the old reader still reflects all changes made up until it was cloned. <p> Like {@link #openIfChanged(IndexReader)}, it's safe to make changes to either the original or the cloned reader: all shared mutable state obeys "copy on write" semantics to ensure the changes are not seen by other readers. <p> 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not implement clone()"	TokenNameStringLiteral	This reader does not implement clone()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clones the IndexReader and optionally changes readOnly. A readOnly * reader cannot open a writeable reader. * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #clone()} instead. */	TokenNameCOMMENT_JAVADOC	 Clones the IndexReader and optionally changes readOnly. A readOnly reader cannot open a writeable reader. @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. Use {@link #clone()} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
IndexReader	TokenNameIdentifier	 Index Reader
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not implement clone()"	TokenNameStringLiteral	This reader does not implement clone()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the directory associated with this index. The Default * implementation returns the directory specified by subclasses when * delegating to the IndexReader(Directory) constructor, or throws an * UnsupportedOperationException if one was not specified. * @throws UnsupportedOperationException if no directory */	TokenNameCOMMENT_JAVADOC	 Returns the directory associated with this index. The Default implementation returns the directory specified by subclasses when delegating to the IndexReader(Directory) constructor, or throws an UnsupportedOperationException if one was not specified. @throws UnsupportedOperationException if no directory 
public	TokenNamepublic	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support this method."	TokenNameStringLiteral	This reader does not support this method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the time the index in the named directory was last modified. * Do not use this to check whether the reader is still up-to-date, use * {@link #isCurrent()} instead. * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated If you need to track commit time of * an index, you can store it in the commit data (see * {@link IndexWriter#commit(Map)} */	TokenNameCOMMENT_JAVADOC	 Returns the time the index in the named directory was last modified. Do not use this to check whether the reader is still up-to-date, use {@link #isCurrent()} instead. @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated If you need to track commit time of an index, you can store it in the commit data (see {@link IndexWriter#commit(Map)} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory2	TokenNameIdentifier	 directory2
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FindSegmentsFile	TokenNameIdentifier	 Find Segments File
(	TokenNameLPAREN	
directory2	TokenNameIdentifier	 directory2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
doBody	TokenNameIdentifier	 do Body
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
segmentFileName	TokenNameIdentifier	 segment File Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
directory2	TokenNameIdentifier	 directory2
.	TokenNameDOT	
fileModified	TokenNameIdentifier	 file Modified
(	TokenNameLPAREN	
segmentFileName	TokenNameIdentifier	 segment File Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads version number from segments files. The version number is * initialized with a timestamp and then increased by one for each change of * the index. * * @param directory where the index resides. * @return version number. * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Use {@link #getVersion} on an opened IndexReader. */	TokenNameCOMMENT_JAVADOC	 Reads version number from segments files. The version number is initialized with a timestamp and then increased by one for each change of the index. * @param directory where the index resides. @return version number. @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Use {@link #getVersion} on an opened IndexReader. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
getCurrentVersion	TokenNameIdentifier	 get Current Version
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
readCurrentVersion	TokenNameIdentifier	 read Current Version
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads commitUserData, previously passed to {@link * IndexWriter#commit(Map)}, from current index * segments file. This will return null if {@link * IndexWriter#commit(Map)} has never been called for * this index. * * @param directory where the index resides. * @return commit userData. * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * * @deprecated Call {@link * #getIndexCommit} on an open IndexReader, and then call * {@link IndexCommit#getUserData}. */	TokenNameCOMMENT_JAVADOC	 Reads commitUserData, previously passed to {@link IndexWriter#commit(Map)}, from current index segments file. This will return null if {@link IndexWriter#commit(Map)} has never been called for this index. * @param directory where the index resides. @return commit userData. @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error * @deprecated Call {@link #getIndexCommit} on an open IndexReader, and then call {@link IndexCommit#getUserData}. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getCommitUserData	TokenNameIdentifier	 get Commit User Data
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Version number when this IndexReader was opened. Not * implemented in the IndexReader base class. * * <p>If this reader is based on a Directory (ie, was * created by calling {@link #open}, or {@link #openIfChanged} on * a reader based on a Directory), then this method * returns the version recorded in the commit that the * reader opened. This version is advanced every time * {@link IndexWriter#commit} is called.</p> * * @throws UnsupportedOperationException unless overridden in subclass */	TokenNameCOMMENT_JAVADOC	 Version number when this IndexReader was opened. Not implemented in the IndexReader base class. * <p>If this reader is based on a Directory (ie, was created by calling {@link #open}, or {@link #openIfChanged} on a reader based on a Directory), then this method returns the version recorded in the commit that the reader opened. This version is advanced every time {@link IndexWriter#commit} is called.</p> * @throws UnsupportedOperationException unless overridden in subclass 
public	TokenNamepublic	
long	TokenNamelong	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support this method."	TokenNameStringLiteral	This reader does not support this method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the String userData optionally passed to * IndexWriter#commit. This will return null if {@link * IndexWriter#commit(Map)} has never been called for * this index. * * @deprecated Call {@link #getIndexCommit} and then call * {@link IndexCommit#getUserData}. */	TokenNameCOMMENT_JAVADOC	 Retrieve the String userData optionally passed to IndexWriter#commit. This will return null if {@link IndexWriter#commit(Map)} has never been called for this index. * @deprecated Call {@link #getIndexCommit} and then call {@link IndexCommit#getUserData}. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getCommitUserData	TokenNameIdentifier	 get Commit User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support this method."	TokenNameStringLiteral	This reader does not support this method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check whether any new changes have occurred to the * index since this reader was opened. * * <p>If this reader is based on a Directory (ie, was * created by calling {@link #open}, or {@link #openIfChanged} on * a reader based on a Directory), then this method checks * if any further commits (see {@link IndexWriter#commit} * have occurred in that directory).</p> * * <p>If instead this reader is a near real-time reader * (ie, obtained by a call to {@link * IndexWriter#getReader}, or by calling {@link #openIfChanged} * on a near real-time reader), then this method checks if * either a new commmit has occurred, or any new * uncommitted changes have taken place via the writer. * Note that even if the writer has only performed * merging, this method will still return false.</p> * * <p>In any event, if this returns false, you should call * {@link #openIfChanged} to get a new reader that sees the * changes.</p> * * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @throws UnsupportedOperationException unless overridden in subclass */	TokenNameCOMMENT_JAVADOC	 Check whether any new changes have occurred to the index since this reader was opened. * <p>If this reader is based on a Directory (ie, was created by calling {@link #open}, or {@link #openIfChanged} on a reader based on a Directory), then this method checks if any further commits (see {@link IndexWriter#commit} have occurred in that directory).</p> * <p>If instead this reader is a near real-time reader (ie, obtained by a call to {@link IndexWriter#getReader}, or by calling {@link #openIfChanged} on a near real-time reader), then this method checks if either a new commmit has occurred, or any new uncommitted changes have taken place via the writer. Note that even if the writer has only performed merging, this method will still return false.</p> * <p>In any event, if this returns false, you should call {@link #openIfChanged} to get a new reader that sees the changes.</p> * @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @throws UnsupportedOperationException unless overridden in subclass 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCurrent	TokenNameIdentifier	 is Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support this method."	TokenNameStringLiteral	This reader does not support this method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated Check segment count using {@link * #getSequentialSubReaders} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Check segment count using {@link #getSequentialSubReaders} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
boolean	TokenNameboolean	
isOptimized	TokenNameIdentifier	 is Optimized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support this method."	TokenNameStringLiteral	This reader does not support this method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an array of term frequency vectors for the specified document. * The array contains a vector for each vectorized field in the document. * Each vector contains terms and frequencies for all terms in a given vectorized field. * If no such fields existed, the method returns null. The term vectors that are * returned may either be of type {@link TermFreqVector} * or of type {@link TermPositionVector} if * positions or offsets have been stored. * * @param docNumber document for which term frequency vectors are returned * @return array of term frequency vectors. May be null if no term vectors have been * stored for the specified document. * @throws IOException if index cannot be accessed * @see org.apache.lucene.document.Field.TermVector */	TokenNameCOMMENT_JAVADOC	 Return an array of term frequency vectors for the specified document. The array contains a vector for each vectorized field in the document. Each vector contains terms and frequencies for all terms in a given vectorized field. If no such fields existed, the method returns null. The term vectors that are returned may either be of type {@link TermFreqVector} or of type {@link TermPositionVector} if positions or offsets have been stored. * @param docNumber document for which term frequency vectors are returned @return array of term frequency vectors. May be null if no term vectors have been stored for the specified document. @throws IOException if index cannot be accessed @see org.apache.lucene.document.Field.TermVector 
abstract	TokenNameabstract	
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Return a term frequency vector for the specified document and field. The * returned vector contains terms and frequencies for the terms in * the specified field of this document, if the field had the storeTermVector * flag set. If termvectors had been stored with positions or offsets, a * {@link TermPositionVector} is returned. * * @param docNumber document for which the term frequency vector is returned * @param field field for which the term frequency vector is returned. * @return term frequency vector May be null if field does not exist in the specified * document or term vector was not stored. * @throws IOException if index cannot be accessed * @see org.apache.lucene.document.Field.TermVector */	TokenNameCOMMENT_JAVADOC	 Return a term frequency vector for the specified document and field. The returned vector contains terms and frequencies for the terms in the specified field of this document, if the field had the storeTermVector flag set. If termvectors had been stored with positions or offsets, a {@link TermPositionVector} is returned. * @param docNumber document for which the term frequency vector is returned @param field field for which the term frequency vector is returned. @return term frequency vector May be null if field does not exist in the specified document or term vector was not stored. @throws IOException if index cannot be accessed @see org.apache.lucene.document.Field.TermVector 
abstract	TokenNameabstract	
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Load the Term Vector into a user-defined data structure instead of relying on the parallel arrays of * the {@link TermFreqVector}. * @param docNumber The number of the document to load the vector for * @param field The name of the field to load * @param mapper The {@link TermVectorMapper} to process the vector. Must not be null * @throws IOException if term vectors cannot be accessed or if they do not exist on the field and doc. specified. * */	TokenNameCOMMENT_JAVADOC	 Load the Term Vector into a user-defined data structure instead of relying on the parallel arrays of the {@link TermFreqVector}. @param docNumber The number of the document to load the vector for @param field The name of the field to load @param mapper The {@link TermVectorMapper} to process the vector. Must not be null @throws IOException if term vectors cannot be accessed or if they do not exist on the field and doc. specified. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Map all the term vectors for all fields in a Document * @param docNumber The number of the document to load the vector for * @param mapper The {@link TermVectorMapper} to process the vector. Must not be null * @throws IOException if term vectors cannot be accessed or if they do not exist on the field and doc. specified. */	TokenNameCOMMENT_JAVADOC	 Map all the term vectors for all fields in a Document @param docNumber The number of the document to load the vector for @param mapper The {@link TermVectorMapper} to process the vector. Must not be null @throws IOException if term vectors cannot be accessed or if they do not exist on the field and doc. specified. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns <code>true</code> if an index exists at the specified directory. * @param directory the directory to check for an index * @return <code>true</code> if an index exists; <code>false</code> otherwise * @throws IOException if there is a problem with accessing the index */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if an index exists at the specified directory. @param directory the directory to check for an index @return <code>true</code> if an index exists; <code>false</code> otherwise @throws IOException if there is a problem with accessing the index 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
indexExists	TokenNameIdentifier	 index Exists
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the number of documents in this index. */	TokenNameCOMMENT_JAVADOC	 Returns the number of documents in this index. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns one greater than the largest possible document number. * This may be used to, e.g., determine how big to allocate an array which * will have an element for every document number in an index. */	TokenNameCOMMENT_JAVADOC	 Returns one greater than the largest possible document number. This may be used to, e.g., determine how big to allocate an array which will have an element for every document number in an index. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the number of deleted documents. */	TokenNameCOMMENT_JAVADOC	 Returns the number of deleted documents. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
numDeletedDocs	TokenNameIdentifier	 num Deleted Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the stored fields of the <code>n</code><sup>th</sup> * <code>Document</code> in this index. * <p> * <b>NOTE:</b> for performance reasons, this method does not check if the * requested document is deleted, and therefore asking for a deleted document * may yield unspecified results. Usually this is not required, however you * can call {@link #isDeleted(int)} with the requested document ID to verify * the document is not deleted. * * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns the stored fields of the <code>n</code><sup>th</sup> <code>Document</code> in this index. <p> <b>NOTE:</b> for performance reasons, this method does not check if the requested document is deleted, and therefore asking for a deleted document may yield unspecified results. Usually this is not required, however you can call {@link #isDeleted(int)} with the requested document ID to verify the document is not deleted. * @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
final	TokenNamefinal	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
n	TokenNameIdentifier	 n
>=	TokenNameGREATER_EQUAL	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"docID must be >= 0 and < maxDoc="	TokenNameStringLiteral	docID must be >= 0 and < maxDoc=
+	TokenNamePLUS	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" (got docID="	TokenNameStringLiteral	 (got docID=
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the {@link org.apache.lucene.document.Document} at the <code>n</code> * <sup>th</sup> position. The {@link FieldSelector} may be used to determine * what {@link org.apache.lucene.document.Field}s to load and how they should * be loaded. <b>NOTE:</b> If this Reader (more specifically, the underlying * <code>FieldsReader</code>) is closed before the lazy * {@link org.apache.lucene.document.Field} is loaded an exception may be * thrown. If you want the value of a lazy * {@link org.apache.lucene.document.Field} to be available after closing you * must explicitly load it or fetch the Document again with a new loader. * <p> * <b>NOTE:</b> for performance reasons, this method does not check if the * requested document is deleted, and therefore asking for a deleted document * may yield unspecified results. Usually this is not required, however you * can call {@link #isDeleted(int)} with the requested document ID to verify * the document is not deleted. * * @param n Get the document at the <code>n</code><sup>th</sup> position * @param fieldSelector The {@link FieldSelector} to use to determine what * Fields should be loaded on the Document. May be null, in which case * all Fields will be loaded. * @return The stored fields of the * {@link org.apache.lucene.document.Document} at the nth position * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @see org.apache.lucene.document.Fieldable * @see org.apache.lucene.document.FieldSelector * @see org.apache.lucene.document.SetBasedFieldSelector * @see org.apache.lucene.document.LoadFirstFieldSelector */	TokenNameCOMMENT_JAVADOC	 Get the {@link org.apache.lucene.document.Document} at the <code>n</code> <sup>th</sup> position. The {@link FieldSelector} may be used to determine what {@link org.apache.lucene.document.Field}s to load and how they should be loaded. <b>NOTE:</b> If this Reader (more specifically, the underlying <code>FieldsReader</code>) is closed before the lazy {@link org.apache.lucene.document.Field} is loaded an exception may be thrown. If you want the value of a lazy {@link org.apache.lucene.document.Field} to be available after closing you must explicitly load it or fetch the Document again with a new loader. <p> <b>NOTE:</b> for performance reasons, this method does not check if the requested document is deleted, and therefore asking for a deleted document may yield unspecified results. Usually this is not required, however you can call {@link #isDeleted(int)} with the requested document ID to verify the document is not deleted. * @param n Get the document at the <code>n</code><sup>th</sup> position @param fieldSelector The {@link FieldSelector} to use to determine what Fields should be loaded on the Document. May be null, in which case all Fields will be loaded. @return The stored fields of the {@link org.apache.lucene.document.Document} at the nth position @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @see org.apache.lucene.document.Fieldable @see org.apache.lucene.document.FieldSelector @see org.apache.lucene.document.SetBasedFieldSelector @see org.apache.lucene.document.LoadFirstFieldSelector 
// TODO (1.5): When we convert to JDK 1.5 make this Set<String> 	TokenNameCOMMENT_LINE	TODO (1.5): When we convert to JDK 1.5 make this Set<String> 
public	TokenNamepublic	
abstract	TokenNameabstract	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
FieldSelector	TokenNameIdentifier	 Field Selector
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns true if document <i>n</i> has been deleted */	TokenNameCOMMENT_JAVADOC	 Returns true if document <i>n</i> has been deleted 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns true if any documents have been deleted */	TokenNameCOMMENT_JAVADOC	 Returns true if any documents have been deleted 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns true if there are norms stored for this field. */	TokenNameCOMMENT_JAVADOC	 Returns true if there are norms stored for this field. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// backward compatible implementation. 	TokenNameCOMMENT_LINE	backward compatible implementation. 
// SegmentReader has an efficient implementation. 	TokenNameCOMMENT_LINE	SegmentReader has an efficient implementation. 
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the byte-encoded normalization factor for the named field of * every document. This is used by the search code to score documents. * Returns null if norms were not indexed for this field. * * @see org.apache.lucene.document.Field#setBoost(float) */	TokenNameCOMMENT_JAVADOC	 Returns the byte-encoded normalization factor for the named field of every document. This is used by the search code to score documents. Returns null if norms were not indexed for this field. * @see org.apache.lucene.document.Field#setBoost(float) 
public	TokenNamepublic	
abstract	TokenNameabstract	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Reads the byte-encoded normalization factor for the named field of every * document. This is used by the search code to score documents. * * @see org.apache.lucene.document.Field#setBoost(float) */	TokenNameCOMMENT_JAVADOC	 Reads the byte-encoded normalization factor for the named field of every document. This is used by the search code to score documents. * @see org.apache.lucene.document.Field#setBoost(float) 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Expert: Resets the normalization factor for the named field of the named * document. The norm represents the product of the field's {@link * org.apache.lucene.document.Fieldable#setBoost(float) boost} and its {@link Similarity#lengthNorm(String, * int) length normalization}. Thus, to preserve the length normalization * values when resetting this, one should base the new value upon the old. * * <b>NOTE:</b> If this field does not index norms, then * this method throws {@link IllegalStateException}. * * @see #norms(String) * @see Similarity#decodeNormValue(byte) * @throws StaleReaderException if the index has changed * since this reader was opened * @throws CorruptIndexException if the index is corrupt * @throws LockObtainFailedException if another writer * has this index open (<code>write.lock</code> could not * be obtained) * @throws IOException if there is a low-level IO error * @throws IllegalStateException if the field does not index norms * @deprecated Write support will be removed in Lucene 4.0. * There will be no replacement for this method. */	TokenNameCOMMENT_JAVADOC	 Expert: Resets the normalization factor for the named field of the named document. The norm represents the product of the field's {@link org.apache.lucene.document.Fieldable#setBoost(float) boost} and its {@link Similarity#lengthNorm(String, int) length normalization}. Thus, to preserve the length normalization values when resetting this, one should base the new value upon the old. * <b>NOTE:</b> If this field does not index norms, then this method throws {@link IllegalStateException}. * @see #norms(String) @see Similarity#decodeNormValue(byte) @throws StaleReaderException if the index has changed since this reader was opened @throws CorruptIndexException if the index is corrupt @throws LockObtainFailedException if another writer has this index open (<code>write.lock</code> could not be obtained) @throws IOException if there is a low-level IO error @throws IllegalStateException if the field does not index norms @deprecated Write support will be removed in Lucene 4.0. There will be no replacement for this method. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
StaleReaderException	TokenNameIdentifier	 Stale Reader Exception
,	TokenNameCOMMA	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acquireWriteLock	TokenNameIdentifier	 acquire Write Lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasChanges	TokenNameIdentifier	 has Changes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
doSetNorm	TokenNameIdentifier	 do Set Norm
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implements setNorm in subclass. * @deprecated Write support will be removed in Lucene 4.0. * There will be no replacement for this method. */	TokenNameCOMMENT_JAVADOC	 Implements setNorm in subclass. @deprecated Write support will be removed in Lucene 4.0. There will be no replacement for this method. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
doSetNorm	TokenNameIdentifier	 do Set Norm
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Expert: Resets the normalization factor for the named field of the named * document. * * @see #norms(String) * @see Similarity#decodeNormValue(byte) * * @throws StaleReaderException if the index has changed * since this reader was opened * @throws CorruptIndexException if the index is corrupt * @throws LockObtainFailedException if another writer * has this index open (<code>write.lock</code> could not * be obtained) * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * There will be no replacement for this method. */	TokenNameCOMMENT_JAVADOC	 Expert: Resets the normalization factor for the named field of the named document. * @see #norms(String) @see Similarity#decodeNormValue(byte) * @throws StaleReaderException if the index has changed since this reader was opened @throws CorruptIndexException if the index is corrupt @throws LockObtainFailedException if another writer has this index open (<code>write.lock</code> could not be obtained) @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. There will be no replacement for this method. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
StaleReaderException	TokenNameIdentifier	 Stale Reader Exception
,	TokenNameCOMMA	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
encodeNormValue	TokenNameIdentifier	 encode Norm Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an enumeration of all the terms in the index. The * enumeration is ordered by Term.compareTo(). Each term is greater * than all that precede it in the enumeration. Note that after * calling terms(), {@link TermEnum#next()} must be called * on the resulting enumeration before calling other methods such as * {@link TermEnum#term()}. * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of all the terms in the index. The enumeration is ordered by Term.compareTo(). Each term is greater than all that precede it in the enumeration. Note that after calling terms(), {@link TermEnum#next()} must be called on the resulting enumeration before calling other methods such as {@link TermEnum#term()}. @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
abstract	TokenNameabstract	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns an enumeration of all terms starting at a given term. If * the given term does not exist, the enumeration is positioned at the * first term greater than the supplied term. The enumeration is * ordered by Term.compareTo(). Each term is greater than all that * precede it in the enumeration. * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of all terms starting at a given term. If the given term does not exist, the enumeration is positioned at the first term greater than the supplied term. The enumeration is ordered by Term.compareTo(). Each term is greater than all that precede it in the enumeration. @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
abstract	TokenNameabstract	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns the number of documents containing the term <code>t</code>. * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns the number of documents containing the term <code>t</code>. @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns an enumeration of all the documents which contain * <code>term</code>. For each document, the document number, the frequency of * the term in that document is also provided, for use in * search scoring. If term is null, then all non-deleted * docs are returned with freq=1. * Thus, this method implements the mapping: * <p><ul> * Term &nbsp;&nbsp; =&gt; &nbsp;&nbsp; &lt;docNum, freq&gt;<sup>*</sup> * </ul> * <p>The enumeration is ordered by document number. Each document number * is greater than all that precede it in the enumeration. * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of all the documents which contain <code>term</code>. For each document, the document number, the frequency of the term in that document is also provided, for use in search scoring. If term is null, then all non-deleted docs are returned with freq=1. Thus, this method implements the mapping: <p><ul> Term &nbsp;&nbsp; =&gt; &nbsp;&nbsp; &lt;docNum, freq&gt;<sup>*</sup> </ul> <p>The enumeration is ordered by document number. Each document number is greater than all that precede it in the enumeration. @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termDocs	TokenNameIdentifier	 term Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an unpositioned {@link TermDocs} enumerator. * <p> * Note: the TermDocs returned is unpositioned. Before using it, ensure * that you first position it with {@link TermDocs#seek(Term)} or * {@link TermDocs#seek(TermEnum)}. * * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns an unpositioned {@link TermDocs} enumerator. <p> Note: the TermDocs returned is unpositioned. Before using it, ensure that you first position it with {@link TermDocs#seek(Term)} or {@link TermDocs#seek(TermEnum)}. * @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
abstract	TokenNameabstract	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns an enumeration of all the documents which contain * <code>term</code>. For each document, in addition to the document number * and frequency of the term in that document, a list of all of the ordinal * positions of the term in the document is available. Thus, this method * implements the mapping: * * <p><ul> * Term &nbsp;&nbsp; =&gt; &nbsp;&nbsp; &lt;docNum, freq, * &lt;pos<sub>1</sub>, pos<sub>2</sub>, ... * pos<sub>freq-1</sub>&gt; * &gt;<sup>*</sup> * </ul> * <p> This positional information facilitates phrase and proximity searching. * <p>The enumeration is ordered by document number. Each document number is * greater than all that precede it in the enumeration. * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of all the documents which contain <code>term</code>. For each document, in addition to the document number and frequency of the term in that document, a list of all of the ordinal positions of the term in the document is available. Thus, this method implements the mapping: * <p><ul> Term &nbsp;&nbsp; =&gt; &nbsp;&nbsp; &lt;docNum, freq, &lt;pos<sub>1</sub>, pos<sub>2</sub>, ... pos<sub>freq-1</sub>&gt; &gt;<sup>*</sup> </ul> <p> This positional information facilitates phrase and proximity searching. <p>The enumeration is ordered by document number. Each document number is greater than all that precede it in the enumeration. @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
final	TokenNamefinal	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
=	TokenNameEQUAL	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termPositions	TokenNameIdentifier	 term Positions
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termPositions	TokenNameIdentifier	 term Positions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an unpositioned {@link TermPositions} enumerator. * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Returns an unpositioned {@link TermPositions} enumerator. @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
abstract	TokenNameabstract	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Deletes the document numbered <code>docNum</code>. Once a document is * deleted it will not appear in TermDocs or TermPostitions enumerations. * Attempts to read its field with the {@link #document} * method will result in an error. The presence of this document may still be * reflected in the {@link #docFreq} statistic, though * this will be corrected eventually as the index is further modified. * * @throws StaleReaderException if the index has changed * since this reader was opened * @throws CorruptIndexException if the index is corrupt * @throws LockObtainFailedException if another writer * has this index open (<code>write.lock</code> could not * be obtained) * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * Use {@link IndexWriter#deleteDocuments(Term)} instead */	TokenNameCOMMENT_JAVADOC	 Deletes the document numbered <code>docNum</code>. Once a document is deleted it will not appear in TermDocs or TermPostitions enumerations. Attempts to read its field with the {@link #document} method will result in an error. The presence of this document may still be reflected in the {@link #docFreq} statistic, though this will be corrected eventually as the index is further modified. * @throws StaleReaderException if the index has changed since this reader was opened @throws CorruptIndexException if the index is corrupt @throws LockObtainFailedException if another writer has this index open (<code>write.lock</code> could not be obtained) @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. Use {@link IndexWriter#deleteDocuments(Term)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
throws	TokenNamethrows	
StaleReaderException	TokenNameIdentifier	 Stale Reader Exception
,	TokenNameCOMMA	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acquireWriteLock	TokenNameIdentifier	 acquire Write Lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasChanges	TokenNameIdentifier	 has Changes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
doDelete	TokenNameIdentifier	 do Delete
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implements deletion of the document numbered <code>docNum</code>. * Applications should call {@link #deleteDocument(int)} or {@link #deleteDocuments(Term)}. * @deprecated Write support will be removed in Lucene 4.0. * Use {@link IndexWriter#deleteDocuments(Term)} instead */	TokenNameCOMMENT_JAVADOC	 Implements deletion of the document numbered <code>docNum</code>. Applications should call {@link #deleteDocument(int)} or {@link #deleteDocuments(Term)}. @deprecated Write support will be removed in Lucene 4.0. Use {@link IndexWriter#deleteDocuments(Term)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
doDelete	TokenNameIdentifier	 do Delete
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Deletes all documents that have a given <code>term</code> indexed. * This is useful if one uses a document field to hold a unique ID string for * the document. Then to delete such a document, one merely constructs a * term with the appropriate field and the unique ID string as its text and * passes it to this method. * See {@link #deleteDocument(int)} for information about when this deletion will * become effective. * * @return the number of documents deleted * @throws StaleReaderException if the index has changed * since this reader was opened * @throws CorruptIndexException if the index is corrupt * @throws LockObtainFailedException if another writer * has this index open (<code>write.lock</code> could not * be obtained) * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * Use {@link IndexWriter#deleteDocuments(Term)} instead */	TokenNameCOMMENT_JAVADOC	 Deletes all documents that have a given <code>term</code> indexed. This is useful if one uses a document field to hold a unique ID string for the document. Then to delete such a document, one merely constructs a term with the appropriate field and the unique ID string as its text and passes it to this method. See {@link #deleteDocument(int)} for information about when this deletion will become effective. * @return the number of documents deleted @throws StaleReaderException if the index has changed since this reader was opened @throws CorruptIndexException if the index is corrupt @throws LockObtainFailedException if another writer has this index open (<code>write.lock</code> could not be obtained) @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. Use {@link IndexWriter#deleteDocuments(Term)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
StaleReaderException	TokenNameIdentifier	 Stale Reader Exception
,	TokenNameCOMMA	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermDocs	TokenNameIdentifier	 Term Docs
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Undeletes all documents currently marked as deleted in * this index. * * <p>NOTE: this method can only recover documents marked * for deletion but not yet removed from the index; when * and how Lucene removes deleted documents is an * implementation detail, subject to change from release * to release. However, you can use {@link * #numDeletedDocs} on the current IndexReader instance to * see how many documents will be un-deleted. * * @throws StaleReaderException if the index has changed * since this reader was opened * @throws LockObtainFailedException if another writer * has this index open (<code>write.lock</code> could not * be obtained) * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. * There will be no replacement for this method. */	TokenNameCOMMENT_JAVADOC	 Undeletes all documents currently marked as deleted in this index. * <p>NOTE: this method can only recover documents marked for deletion but not yet removed from the index; when and how Lucene removes deleted documents is an implementation detail, subject to change from release to release. However, you can use {@link #numDeletedDocs} on the current IndexReader instance to see how many documents will be un-deleted. * @throws StaleReaderException if the index has changed since this reader was opened @throws LockObtainFailedException if another writer has this index open (<code>write.lock</code> could not be obtained) @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. There will be no replacement for this method. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
undeleteAll	TokenNameIdentifier	 undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
StaleReaderException	TokenNameIdentifier	 Stale Reader Exception
,	TokenNameCOMMA	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acquireWriteLock	TokenNameIdentifier	 acquire Write Lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasChanges	TokenNameIdentifier	 has Changes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
doUndeleteAll	TokenNameIdentifier	 do Undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implements actual undeleteAll() in subclass. * @deprecated Write support will be removed in Lucene 4.0. * There will be no replacement for this method. */	TokenNameCOMMENT_JAVADOC	 Implements actual undeleteAll() in subclass. @deprecated Write support will be removed in Lucene 4.0. There will be no replacement for this method. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
doUndeleteAll	TokenNameIdentifier	 do Undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Does nothing by default. Subclasses that require a write lock for * index modifications must implement this method. * @deprecated Write support will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Does nothing by default. Subclasses that require a write lock for index modifications must implement this method. @deprecated Write support will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
acquireWriteLock	TokenNameIdentifier	 acquire Write Lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* NOOP */	TokenNameCOMMENT_BLOCK	 NOOP 
}	TokenNameRBRACE	
/** * * @throws IOException * @deprecated Write support will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 * @throws IOException @deprecated Write support will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param commitUserData Opaque Map (String -> String) * that's recorded into the segments file in the index, * and retrievable by {@link * IndexCommit#getUserData}. * @throws IOException * @deprecated Write support will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 @param commitUserData Opaque Map (String -> String) that's recorded into the segments file in the index, and retrievable by {@link IndexCommit#getUserData}. @throws IOException @deprecated Write support will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Commit changes resulting from delete, undeleteAll, or * setNorm operations * * If an exception is hit, then either no changes or all * changes will have been committed to the index * (transactional semantics). * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Commit changes resulting from delete, undeleteAll, or setNorm operations * If an exception is hit, then either no changes or all changes will have been committed to the index (transactional semantics). @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Commit changes resulting from delete, undeleteAll, or * setNorm operations * * If an exception is hit, then either no changes or all * changes will have been committed to the index * (transactional semantics). * @throws IOException if there is a low-level IO error * @deprecated Write support will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Commit changes resulting from delete, undeleteAll, or setNorm operations * If an exception is hit, then either no changes or all changes will have been committed to the index (transactional semantics). @throws IOException if there is a low-level IO error @deprecated Write support will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Don't call ensureOpen since we commit() on close 	TokenNameCOMMENT_LINE	Don't call ensureOpen since we commit() on close 
doCommit	TokenNameIdentifier	 do Commit
(	TokenNameLPAREN	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasChanges	TokenNameIdentifier	 has Changes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implements commit. * @deprecated Write support will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Implements commit. @deprecated Write support will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
doCommit	TokenNameIdentifier	 do Commit
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Closes files associated with this index. * Also saves any new deletions to disk. * No other methods should be called after this has been called. * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Closes files associated with this index. Also saves any new deletions to disk. No other methods should be called after this has been called. @throws IOException if there is a low-level IO error 
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
!	TokenNameNOT	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Implements close. */	TokenNameCOMMENT_JAVADOC	 Implements close. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
doClose	TokenNameIdentifier	 do Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Get the {@link FieldInfos} describing all fields in * this reader. NOTE: do not make any changes to the * returned FieldInfos! * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Get the {@link FieldInfos} describing all fields in this reader. NOTE: do not make any changes to the returned FieldInfos! * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
FieldInfos	TokenNameIdentifier	 Field Infos
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Expert: return the IndexCommit that this reader has * opened. This method is only implemented by those * readers that correspond to a Directory with its own * segments_N file. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Expert: return the IndexCommit that this reader has opened. This method is only implemented by those readers that correspond to a Directory with its own segments_N file. * @lucene.experimental 
public	TokenNamepublic	
IndexCommit	TokenNameIdentifier	 Index Commit
getIndexCommit	TokenNameIdentifier	 get Index Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support this method."	TokenNameStringLiteral	This reader does not support this method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns all commit points that exist in the Directory. * Normally, because the default is {@link * KeepOnlyLastCommitDeletionPolicy}, there would be only * one commit point. But if you're using a custom {@link * IndexDeletionPolicy} then there could be many commits. * Once you have a given commit, you can open a reader on * it by calling {@link IndexReader#open(IndexCommit,boolean)} * There must be at least one commit in * the Directory, else this method throws {@link * IndexNotFoundException}. Note that if a commit is in * progress while this method is running, that commit * may or may not be returned. * * @return a sorted list of {@link IndexCommit}s, from oldest * to latest. */	TokenNameCOMMENT_JAVADOC	 Returns all commit points that exist in the Directory. Normally, because the default is {@link KeepOnlyLastCommitDeletionPolicy}, there would be only one commit point. But if you're using a custom {@link IndexDeletionPolicy} then there could be many commits. Once you have a given commit, you can open a reader on it by calling {@link IndexReader#open(IndexCommit,boolean)} There must be at least one commit in the Directory, else this method throws {@link IndexNotFoundException}. Note that if a commit is in progress while this method is running, that commit may or may not be returned. * @return a sorted list of {@link IndexCommit}s, from oldest to latest. 
public	TokenNamepublic	
static	TokenNamestatic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
listCommits	TokenNameIdentifier	 list Commits
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
listCommits	TokenNameIdentifier	 list Commits
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: returns the sequential sub readers that this * reader is logically composed of. For example, * IndexSearcher uses this API to drive searching by one * sub reader at a time. If this reader is not composed * of sequential child readers, it should return null. * If this method returns an empty array, that means this * reader is a null reader (for example a MultiReader * that has no sub readers). * <p> * NOTE: You should not try using sub-readers returned by * this method to make any changes (setNorm, deleteDocument, * etc.). While this might succeed for one composite reader * (like MultiReader), it will most likely lead to index * corruption for other readers (like DirectoryReader obtained * through {@link #open}. Use the parent reader directly. */	TokenNameCOMMENT_JAVADOC	 Expert: returns the sequential sub readers that this reader is logically composed of. For example, IndexSearcher uses this API to drive searching by one sub reader at a time. If this reader is not composed of sequential child readers, it should return null. If this method returns an empty array, that means this reader is a null reader (for example a MultiReader that has no sub readers). <p> NOTE: You should not try using sub-readers returned by this method to make any changes (setNorm, deleteDocument, etc.). While this might succeed for one composite reader (like MultiReader), it will most likely lead to index corruption for other readers (like DirectoryReader obtained through {@link #open}. Use the parent reader directly. 
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert */	TokenNameCOMMENT_JAVADOC	 Expert 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getCoreCacheKey	TokenNameIdentifier	 get Core Cache Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't can ensureOpen since FC calls this (to evict) 	TokenNameCOMMENT_LINE	Don't can ensureOpen since FC calls this (to evict) 
// on close 	TokenNameCOMMENT_LINE	on close 
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert. Warning: this returns null if the reader has * no deletions */	TokenNameCOMMENT_JAVADOC	 Expert. Warning: this returns null if the reader has no deletions 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getDeletesCacheKey	TokenNameIdentifier	 get Deletes Cache Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the number of unique terms (across all fields) * in this reader. * * This method returns long, even though internally * Lucene cannot handle more than 2^31 unique terms, for * a possible future when this limitation is removed. * * @throws UnsupportedOperationException if this count * cannot be easily determined (eg Multi*Readers). * Instead, you should call {@link * #getSequentialSubReaders} and ask each sub reader for * its unique term count. */	TokenNameCOMMENT_JAVADOC	 Returns the number of unique terms (across all fields) in this reader. * This method returns long, even though internally Lucene cannot handle more than 2^31 unique terms, for a possible future when this limitation is removed. * @throws UnsupportedOperationException if this count cannot be easily determined (eg Multi*Readers). Instead, you should call {@link #getSequentialSubReaders} and ask each sub reader for its unique term count. 
public	TokenNamepublic	
long	TokenNamelong	
getUniqueTermCount	TokenNameIdentifier	 get Unique Term Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"this reader does not implement getUniqueTermCount()"	TokenNameStringLiteral	this reader does not implement getUniqueTermCount()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Back compat for reopen() 	TokenNameCOMMENT_LINE	Back compat for reopen() 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
reopenMethod1	TokenNameIdentifier	 reopen Method1
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"reopen"	TokenNameStringLiteral	reopen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
doOpenIfChangedMethod1	TokenNameIdentifier	 do Open If Changed Method1
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"doOpenIfChanged"	TokenNameStringLiteral	doOpenIfChanged
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasNewReopenAPI1	TokenNameIdentifier	 has New Reopen AP I1
=	TokenNameEQUAL	
VirtualMethod	TokenNameIdentifier	 Virtual Method
.	TokenNameDOT	
compareImplementationDistance	TokenNameIdentifier	 compare Implementation Distance
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
doOpenIfChangedMethod1	TokenNameIdentifier	 do Open If Changed Method1
,	TokenNameCOMMA	
reopenMethod1	TokenNameIdentifier	 reopen Method1
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// its ok for both to be overridden 	TokenNameCOMMENT_LINE	its ok for both to be overridden 
// Back compat for reopen(boolean openReadOnly) 	TokenNameCOMMENT_LINE	Back compat for reopen(boolean openReadOnly) 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
reopenMethod2	TokenNameIdentifier	 reopen Method2
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"reopen"	TokenNameStringLiteral	reopen
,	TokenNameCOMMA	
boolean	TokenNameboolean	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
doOpenIfChangedMethod2	TokenNameIdentifier	 do Open If Changed Method2
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"doOpenIfChanged"	TokenNameStringLiteral	doOpenIfChanged
,	TokenNameCOMMA	
boolean	TokenNameboolean	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasNewReopenAPI2	TokenNameIdentifier	 has New Reopen AP I2
=	TokenNameEQUAL	
VirtualMethod	TokenNameIdentifier	 Virtual Method
.	TokenNameDOT	
compareImplementationDistance	TokenNameIdentifier	 compare Implementation Distance
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
doOpenIfChangedMethod2	TokenNameIdentifier	 do Open If Changed Method2
,	TokenNameCOMMA	
reopenMethod2	TokenNameIdentifier	 reopen Method2
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// its ok for both to be overridden 	TokenNameCOMMENT_LINE	its ok for both to be overridden 
// Back compat for reopen(IndexCommit commit) 	TokenNameCOMMENT_LINE	Back compat for reopen(IndexCommit commit) 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
reopenMethod3	TokenNameIdentifier	 reopen Method3
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"reopen"	TokenNameStringLiteral	reopen
,	TokenNameCOMMA	
IndexCommit	TokenNameIdentifier	 Index Commit
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
doOpenIfChangedMethod3	TokenNameIdentifier	 do Open If Changed Method3
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"doOpenIfChanged"	TokenNameStringLiteral	doOpenIfChanged
,	TokenNameCOMMA	
IndexCommit	TokenNameIdentifier	 Index Commit
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasNewReopenAPI3	TokenNameIdentifier	 has New Reopen AP I3
=	TokenNameEQUAL	
VirtualMethod	TokenNameIdentifier	 Virtual Method
.	TokenNameDOT	
compareImplementationDistance	TokenNameIdentifier	 compare Implementation Distance
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
doOpenIfChangedMethod3	TokenNameIdentifier	 do Open If Changed Method3
,	TokenNameCOMMA	
reopenMethod3	TokenNameIdentifier	 reopen Method3
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// its ok for both to be overridden 	TokenNameCOMMENT_LINE	its ok for both to be overridden 
// Back compat for reopen(IndexWriter writer, boolean applyDeletes) 	TokenNameCOMMENT_LINE	Back compat for reopen(IndexWriter writer, boolean applyDeletes) 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
reopenMethod4	TokenNameIdentifier	 reopen Method4
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"reopen"	TokenNameStringLiteral	reopen
,	TokenNameCOMMA	
IndexWriter	TokenNameIdentifier	 Index Writer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
boolean	TokenNameboolean	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
doOpenIfChangedMethod4	TokenNameIdentifier	 do Open If Changed Method4
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"doOpenIfChanged"	TokenNameStringLiteral	doOpenIfChanged
,	TokenNameCOMMA	
IndexWriter	TokenNameIdentifier	 Index Writer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
boolean	TokenNameboolean	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasNewReopenAPI4	TokenNameIdentifier	 has New Reopen AP I4
=	TokenNameEQUAL	
VirtualMethod	TokenNameIdentifier	 Virtual Method
.	TokenNameDOT	
compareImplementationDistance	TokenNameIdentifier	 compare Implementation Distance
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
doOpenIfChangedMethod4	TokenNameIdentifier	 do Open If Changed Method4
,	TokenNameCOMMA	
reopenMethod4	TokenNameIdentifier	 reopen Method4
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// its ok for both to be overridden 	TokenNameCOMMENT_LINE	its ok for both to be overridden 
/** For IndexReader implementations that use * TermInfosReader to read terms, this returns the * current indexDivisor as specified when the reader was * opened. */	TokenNameCOMMENT_JAVADOC	 For IndexReader implementations that use TermInfosReader to read terms, this returns the current indexDivisor as specified when the reader was opened. 
public	TokenNamepublic	
int	TokenNameint	
getTermInfosIndexDivisor	TokenNameIdentifier	 get Term Infos Index Divisor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This reader does not support this method."	TokenNameStringLiteral	This reader does not support this method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
