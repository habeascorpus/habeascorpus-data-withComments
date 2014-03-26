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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
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
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
IndexingChain	TokenNameIdentifier	 Indexing Chain
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
IndexWriter	TokenNameIdentifier	 Index Writer
.	TokenNameDOT	
IndexReaderWarmer	TokenNameIdentifier	 Index Reader Warmer
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
Similarity	TokenNameIdentifier	 Similarity
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
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * Holds all the configuration of {@link IndexWriter}. You * should instantiate this class, call the setters to set * your configuration, then pass it to {@link IndexWriter}. * Note that {@link IndexWriter} makes a private clone; if * you need to subsequently change settings use {@link * IndexWriter#getConfig}. * * <p> * All setter methods return {@link IndexWriterConfig} to allow chaining * settings conveniently, for example: * * <pre> * IndexWriterConfig conf = new IndexWriterConfig(analyzer); * conf.setter1().setter2(); * </pre> * * @since 3.1 */	TokenNameCOMMENT_JAVADOC	 Holds all the configuration of {@link IndexWriter}. You should instantiate this class, call the setters to set your configuration, then pass it to {@link IndexWriter}. Note that {@link IndexWriter} makes a private clone; if you need to subsequently change settings use {@link IndexWriter#getConfig}. * <p> All setter methods return {@link IndexWriterConfig} to allow chaining settings conveniently, for example: * <pre> IndexWriterConfig conf = new IndexWriterConfig(analyzer); conf.setter1().setter2(); </pre> * @since 3.1 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** * Specifies the open mode for {@link IndexWriter}: * <ul> * {@link #CREATE} - creates a new index or overwrites an existing one. * {@link #CREATE_OR_APPEND} - creates a new index if one does not exist, * otherwise it opens the index and documents will be appended. * {@link #APPEND} - opens an existing index. * </ul> */	TokenNameCOMMENT_JAVADOC	 Specifies the open mode for {@link IndexWriter}: <ul> {@link #CREATE} - creates a new index or overwrites an existing one. {@link #CREATE_OR_APPEND} - creates a new index if one does not exist, otherwise it opens the index and documents will be appended. {@link #APPEND} - opens an existing index. </ul> 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
OpenMode	TokenNameIdentifier	 Open Mode
{	TokenNameLBRACE	
CREATE	TokenNameIdentifier	 CREATE
,	TokenNameCOMMA	
APPEND	TokenNameIdentifier	 APPEND
,	TokenNameCOMMA	
CREATE_OR_APPEND	TokenNameIdentifier	 CREATE  OR  APPEND
}	TokenNameRBRACE	
/** Default value is 128. Change using {@link #setTermIndexInterval(int)}. */	TokenNameCOMMENT_JAVADOC	 Default value is 128. Change using {@link #setTermIndexInterval(int)}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_TERM_INDEX_INTERVAL	TokenNameIdentifier	 DEFAULT  TERM  INDEX  INTERVAL
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Denotes a flush trigger is disabled. */	TokenNameCOMMENT_JAVADOC	 Denotes a flush trigger is disabled. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Disabled by default (because IndexWriter flushes by RAM usage by default). */	TokenNameCOMMENT_JAVADOC	 Disabled by default (because IndexWriter flushes by RAM usage by default). 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DEFAULT_MAX_BUFFERED_DELETE_TERMS	TokenNameIdentifier	 DEFAULT  MAX  BUFFERED  DELETE  TERMS
=	TokenNameEQUAL	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
;	TokenNameSEMICOLON	
/** Disabled by default (because IndexWriter flushes by RAM usage by default). */	TokenNameCOMMENT_JAVADOC	 Disabled by default (because IndexWriter flushes by RAM usage by default). 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DEFAULT_MAX_BUFFERED_DOCS	TokenNameIdentifier	 DEFAULT  MAX  BUFFERED  DOCS
=	TokenNameEQUAL	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
;	TokenNameSEMICOLON	
/** * Default value is 16 MB (which means flush when buffered docs consume * approximately 16 MB RAM). */	TokenNameCOMMENT_JAVADOC	 Default value is 16 MB (which means flush when buffered docs consume approximately 16 MB RAM). 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
double	TokenNamedouble	
DEFAULT_RAM_BUFFER_SIZE_MB	TokenNameIdentifier	 DEFAULT  RAM  BUFFER  SIZE  MB
=	TokenNameEQUAL	
16.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * Default value for the write lock timeout (1,000 ms). * * @see #setDefaultWriteLockTimeout(long) */	TokenNameCOMMENT_JAVADOC	 Default value for the write lock timeout (1,000 ms). * @see #setDefaultWriteLockTimeout(long) 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
WRITE_LOCK_TIMEOUT	TokenNameIdentifier	 WRITE  LOCK  TIMEOUT
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The maximum number of simultaneous threads that may be * indexing documents at once in IndexWriter; if more * than this many threads arrive they will wait for * others to finish. */	TokenNameCOMMENT_JAVADOC	 The maximum number of simultaneous threads that may be indexing documents at once in IndexWriter; if more than this many threads arrive they will wait for others to finish. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DEFAULT_MAX_THREAD_STATES	TokenNameIdentifier	 DEFAULT  MAX  THREAD  STATES
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Default setting for {@link #setReaderPooling}. */	TokenNameCOMMENT_JAVADOC	 Default setting for {@link #setReaderPooling}. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
boolean	TokenNameboolean	
DEFAULT_READER_POOLING	TokenNameIdentifier	 DEFAULT  READER  POOLING
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default value is 1. Change using {@link #setReaderTermsIndexDivisor(int)}. */	TokenNameCOMMENT_JAVADOC	 Default value is 1. Change using {@link #setReaderTermsIndexDivisor(int)}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_READER_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  READER  TERMS  INDEX  DIVISOR
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
;	TokenNameSEMICOLON	
/** * Sets the default (for any instance) maximum time to wait for a write lock * (in milliseconds). */	TokenNameCOMMENT_JAVADOC	 Sets the default (for any instance) maximum time to wait for a write lock (in milliseconds). 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setDefaultWriteLockTimeout	TokenNameIdentifier	 set Default Write Lock Timeout
(	TokenNameLPAREN	
long	TokenNamelong	
writeLockTimeout	TokenNameIdentifier	 write Lock Timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WRITE_LOCK_TIMEOUT	TokenNameIdentifier	 WRITE  LOCK  TIMEOUT
=	TokenNameEQUAL	
writeLockTimeout	TokenNameIdentifier	 write Lock Timeout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the default write lock timeout for newly instantiated * IndexWriterConfigs. * * @see #setDefaultWriteLockTimeout(long) */	TokenNameCOMMENT_JAVADOC	 Returns the default write lock timeout for newly instantiated IndexWriterConfigs. * @see #setDefaultWriteLockTimeout(long) 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
getDefaultWriteLockTimeout	TokenNameIdentifier	 get Default Write Lock Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
WRITE_LOCK_TIMEOUT	TokenNameIdentifier	 WRITE  LOCK  TIMEOUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
delPolicy	TokenNameIdentifier	 del Policy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
OpenMode	TokenNameIdentifier	 Open Mode
openMode	TokenNameIdentifier	 open Mode
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
termIndexInterval	TokenNameIdentifier	 term Index Interval
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
MergeScheduler	TokenNameIdentifier	 Merge Scheduler
mergeScheduler	TokenNameIdentifier	 merge Scheduler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
long	TokenNamelong	
writeLockTimeout	TokenNameIdentifier	 write Lock Timeout
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
maxBufferedDeleteTerms	TokenNameIdentifier	 max Buffered Delete Terms
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
double	TokenNamedouble	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
IndexingChain	TokenNameIdentifier	 Indexing Chain
indexingChain	TokenNameIdentifier	 indexing Chain
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
IndexReaderWarmer	TokenNameIdentifier	 Index Reader Warmer
mergedSegmentWarmer	TokenNameIdentifier	 merged Segment Warmer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
MergePolicy	TokenNameIdentifier	 Merge Policy
mergePolicy	TokenNameIdentifier	 merge Policy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
maxThreadStates	TokenNameIdentifier	 max Thread States
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
readerPooling	TokenNameIdentifier	 reader Pooling
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
readerTermsIndexDivisor	TokenNameIdentifier	 reader Terms Index Divisor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
/** * Creates a new config that with defaults that match the specified * {@link Version} as well as the default {@link * Analyzer}. If matchVersion is >= {@link * Version#LUCENE_32}, {@link TieredMergePolicy} is used * for merging; else {@link LogByteSizeMergePolicy}. * Note that {@link TieredMergePolicy} is free to select * non-contiguous merges, which means docIDs may not * remain montonic over time. If this is a problem you * should switch to {@link LogByteSizeMergePolicy} or * {@link LogDocMergePolicy}. */	TokenNameCOMMENT_JAVADOC	 Creates a new config that with defaults that match the specified {@link Version} as well as the default {@link Analyzer}. If matchVersion is >= {@link Version#LUCENE_32}, {@link TieredMergePolicy} is used for merging; else {@link LogByteSizeMergePolicy}. Note that {@link TieredMergePolicy} is free to select non-contiguous merges, which means docIDs may not remain montonic over time. If this is a problem you should switch to {@link LogByteSizeMergePolicy} or {@link LogDocMergePolicy}. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
=	TokenNameEQUAL	
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
delPolicy	TokenNameIdentifier	 del Policy
=	TokenNameEQUAL	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commit	TokenNameIdentifier	 commit
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
openMode	TokenNameIdentifier	 open Mode
=	TokenNameEQUAL	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
CREATE_OR_APPEND	TokenNameIdentifier	 CREATE  OR  APPEND
;	TokenNameSEMICOLON	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termIndexInterval	TokenNameIdentifier	 term Index Interval
=	TokenNameEQUAL	
DEFAULT_TERM_INDEX_INTERVAL	TokenNameIdentifier	 DEFAULT  TERM  INDEX  INTERVAL
;	TokenNameSEMICOLON	
mergeScheduler	TokenNameIdentifier	 merge Scheduler
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeLockTimeout	TokenNameIdentifier	 write Lock Timeout
=	TokenNameEQUAL	
WRITE_LOCK_TIMEOUT	TokenNameIdentifier	 WRITE  LOCK  TIMEOUT
;	TokenNameSEMICOLON	
maxBufferedDeleteTerms	TokenNameIdentifier	 max Buffered Delete Terms
=	TokenNameEQUAL	
DEFAULT_MAX_BUFFERED_DELETE_TERMS	TokenNameIdentifier	 DEFAULT  MAX  BUFFERED  DELETE  TERMS
;	TokenNameSEMICOLON	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
=	TokenNameEQUAL	
DEFAULT_RAM_BUFFER_SIZE_MB	TokenNameIdentifier	 DEFAULT  RAM  BUFFER  SIZE  MB
;	TokenNameSEMICOLON	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
=	TokenNameEQUAL	
DEFAULT_MAX_BUFFERED_DOCS	TokenNameIdentifier	 DEFAULT  MAX  BUFFERED  DOCS
;	TokenNameSEMICOLON	
indexingChain	TokenNameIdentifier	 indexing Chain
=	TokenNameEQUAL	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
defaultIndexingChain	TokenNameIdentifier	 default Indexing Chain
;	TokenNameSEMICOLON	
mergedSegmentWarmer	TokenNameIdentifier	 merged Segment Warmer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_32	TokenNameIdentifier	 LUCENE 32
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergePolicy	TokenNameIdentifier	 merge Policy
=	TokenNameEQUAL	
new	TokenNamenew	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mergePolicy	TokenNameIdentifier	 merge Policy
=	TokenNameEQUAL	
new	TokenNamenew	
LogByteSizeMergePolicy	TokenNameIdentifier	 Log Byte Size Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxThreadStates	TokenNameIdentifier	 max Thread States
=	TokenNameEQUAL	
DEFAULT_MAX_THREAD_STATES	TokenNameIdentifier	 DEFAULT  MAX  THREAD  STATES
;	TokenNameSEMICOLON	
readerPooling	TokenNameIdentifier	 reader Pooling
=	TokenNameEQUAL	
DEFAULT_READER_POOLING	TokenNameIdentifier	 DEFAULT  READER  POOLING
;	TokenNameSEMICOLON	
readerTermsIndexDivisor	TokenNameIdentifier	 reader Terms Index Divisor
=	TokenNameEQUAL	
DEFAULT_READER_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  READER  TERMS  INDEX  DIVISOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Shallow clone is the only thing that's possible, since parameters like 	TokenNameCOMMENT_LINE	Shallow clone is the only thing that's possible, since parameters like 
// analyzer, index commit etc. do not implement Cloneable. 	TokenNameCOMMENT_LINE	analyzer, index commit etc. do not implement Cloneable. 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happen 	TokenNameCOMMENT_LINE	should not happen 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the default analyzer to use for indexing documents. */	TokenNameCOMMENT_JAVADOC	 Returns the default analyzer to use for indexing documents. 
public	TokenNamepublic	
Analyzer	TokenNameIdentifier	 Analyzer
getAnalyzer	TokenNameIdentifier	 get Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Specifies {@link OpenMode} of the index. * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 Specifies {@link OpenMode} of the index. * <p>Only takes effect when IndexWriter is first created. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
OpenMode	TokenNameIdentifier	 Open Mode
openMode	TokenNameIdentifier	 open Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
openMode	TokenNameIdentifier	 open Mode
=	TokenNameEQUAL	
openMode	TokenNameIdentifier	 open Mode
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the {@link OpenMode} set by {@link #setOpenMode(OpenMode)}. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link OpenMode} set by {@link #setOpenMode(OpenMode)}. 
public	TokenNamepublic	
OpenMode	TokenNameIdentifier	 Open Mode
getOpenMode	TokenNameIdentifier	 get Open Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
openMode	TokenNameIdentifier	 open Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: allows an optional {@link IndexDeletionPolicy} implementation to be * specified. You can use this to control when prior commits are deleted from * the index. The default policy is {@link KeepOnlyLastCommitDeletionPolicy} * which removes all prior commits as soon as a new commit is done (this * matches behavior before 2.2). Creating your own policy can allow you to * explicitly keep previous "point in time" commits alive in the index for * some time, to allow readers to refresh to the new commit without having the * old commit deleted out from under them. This is necessary on filesystems * like NFS that do not support "delete on last close" semantics, which * Lucene's "point in time" search normally relies on. * <p> * <b>NOTE:</b> the deletion policy cannot be null. If <code>null</code> is * passed, the deletion policy will be set to the default. * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 Expert: allows an optional {@link IndexDeletionPolicy} implementation to be specified. You can use this to control when prior commits are deleted from the index. The default policy is {@link KeepOnlyLastCommitDeletionPolicy} which removes all prior commits as soon as a new commit is done (this matches behavior before 2.2). Creating your own policy can allow you to explicitly keep previous "point in time" commits alive in the index for some time, to allow readers to refresh to the new commit without having the old commit deleted out from under them. This is necessary on filesystems like NFS that do not support "delete on last close" semantics, which Lucene's "point in time" search normally relies on. <p> <b>NOTE:</b> the deletion policy cannot be null. If <code>null</code> is passed, the deletion policy will be set to the default. * <p>Only takes effect when IndexWriter is first created. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setIndexDeletionPolicy	TokenNameIdentifier	 set Index Deletion Policy
(	TokenNameLPAREN	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
delPolicy	TokenNameIdentifier	 del Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delPolicy	TokenNameIdentifier	 del Policy
=	TokenNameEQUAL	
delPolicy	TokenNameIdentifier	 del Policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
delPolicy	TokenNameIdentifier	 del Policy
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link IndexDeletionPolicy} specified in * {@link #setIndexDeletionPolicy(IndexDeletionPolicy)} or the default * {@link KeepOnlyLastCommitDeletionPolicy}/ */	TokenNameCOMMENT_JAVADOC	 Returns the {@link IndexDeletionPolicy} specified in {@link #setIndexDeletionPolicy(IndexDeletionPolicy)} or the default {@link KeepOnlyLastCommitDeletionPolicy}/ 
public	TokenNamepublic	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
getIndexDeletionPolicy	TokenNameIdentifier	 get Index Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
delPolicy	TokenNameIdentifier	 del Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: allows to open a certain commit point. The default is null which * opens the latest commit point. * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 Expert: allows to open a certain commit point. The default is null which opens the latest commit point. * <p>Only takes effect when IndexWriter is first created. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setIndexCommit	TokenNameIdentifier	 set Index Commit
(	TokenNameLPAREN	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
=	TokenNameEQUAL	
commit	TokenNameIdentifier	 commit
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link IndexCommit} as specified in * {@link #setIndexCommit(IndexCommit)} or the default, <code>null</code> * which specifies to open the latest index commit point. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link IndexCommit} as specified in {@link #setIndexCommit(IndexCommit)} or the default, <code>null</code> which specifies to open the latest index commit point. 
public	TokenNamepublic	
IndexCommit	TokenNameIdentifier	 Index Commit
getIndexCommit	TokenNameIdentifier	 get Index Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
commit	TokenNameIdentifier	 commit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: set the {@link Similarity} implementation used by this IndexWriter. * <p> * <b>NOTE:</b> the similarity cannot be null. If <code>null</code> is passed, * the similarity will be set to the default. * * @see Similarity#setDefault(Similarity) * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 Expert: set the {@link Similarity} implementation used by this IndexWriter. <p> <b>NOTE:</b> the similarity cannot be null. If <code>null</code> is passed, the similarity will be set to the default. * @see Similarity#setDefault(Similarity) * <p>Only takes effect when IndexWriter is first created. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setSimilarity	TokenNameIdentifier	 set Similarity
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
similarity	TokenNameIdentifier	 similarity
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: returns the {@link Similarity} implementation used by this * IndexWriter. This defaults to the current value of * {@link Similarity#getDefault()}. */	TokenNameCOMMENT_JAVADOC	 Expert: returns the {@link Similarity} implementation used by this IndexWriter. This defaults to the current value of {@link Similarity#getDefault()}. 
public	TokenNamepublic	
Similarity	TokenNameIdentifier	 Similarity
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: set the interval between indexed terms. Large values cause less * memory to be used by IndexReader, but slow random-access to terms. Small * values cause more memory to be used by an IndexReader, and speed * random-access to terms. * <p> * This parameter determines the amount of computation required per query * term, regardless of the number of documents that contain that term. In * particular, it is the maximum number of other terms that must be scanned * before a term is located and its frequency and position information may be * processed. In a large index with user-entered query terms, query processing * time is likely to be dominated not by term lookup but rather by the * processing of frequency and positional data. In a small index or when many * uncommon query terms are generated (e.g., by wildcard queries) term lookup * may become a dominant cost. * <p> * In particular, <code>numUniqueTerms/interval</code> terms are read into * memory by an IndexReader, and, on average, <code>interval/2</code> terms * must be scanned for each random term access. * * @see #DEFAULT_TERM_INDEX_INTERVAL * * <p>Takes effect immediately, but only applies to newly * flushed/merged segments. */	TokenNameCOMMENT_JAVADOC	 Expert: set the interval between indexed terms. Large values cause less memory to be used by IndexReader, but slow random-access to terms. Small values cause more memory to be used by an IndexReader, and speed random-access to terms. <p> This parameter determines the amount of computation required per query term, regardless of the number of documents that contain that term. In particular, it is the maximum number of other terms that must be scanned before a term is located and its frequency and position information may be processed. In a large index with user-entered query terms, query processing time is likely to be dominated not by term lookup but rather by the processing of frequency and positional data. In a small index or when many uncommon query terms are generated (e.g., by wildcard queries) term lookup may become a dominant cost. <p> In particular, <code>numUniqueTerms/interval</code> terms are read into memory by an IndexReader, and, on average, <code>interval/2</code> terms must be scanned for each random term access. * @see #DEFAULT_TERM_INDEX_INTERVAL * <p>Takes effect immediately, but only applies to newly flushed/merged segments. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setTermIndexInterval	TokenNameIdentifier	 set Term Index Interval
(	TokenNameLPAREN	
int	TokenNameint	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
termIndexInterval	TokenNameIdentifier	 term Index Interval
=	TokenNameEQUAL	
interval	TokenNameIdentifier	 interval
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the interval between indexed terms. * * @see #setTermIndexInterval(int) */	TokenNameCOMMENT_JAVADOC	 Returns the interval between indexed terms. * @see #setTermIndexInterval(int) 
public	TokenNamepublic	
int	TokenNameint	
getTermIndexInterval	TokenNameIdentifier	 get Term Index Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termIndexInterval	TokenNameIdentifier	 term Index Interval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: sets the merge scheduler used by this writer. The default is * {@link ConcurrentMergeScheduler}. * <p> * <b>NOTE:</b> the merge scheduler cannot be null. If <code>null</code> is * passed, the merge scheduler will be set to the default. * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 Expert: sets the merge scheduler used by this writer. The default is {@link ConcurrentMergeScheduler}. <p> <b>NOTE:</b> the merge scheduler cannot be null. If <code>null</code> is passed, the merge scheduler will be set to the default. * <p>Only takes effect when IndexWriter is first created. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setMergeScheduler	TokenNameIdentifier	 set Merge Scheduler
(	TokenNameLPAREN	
MergeScheduler	TokenNameIdentifier	 Merge Scheduler
mergeScheduler	TokenNameIdentifier	 merge Scheduler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mergeScheduler	TokenNameIdentifier	 merge Scheduler
=	TokenNameEQUAL	
mergeScheduler	TokenNameIdentifier	 merge Scheduler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
mergeScheduler	TokenNameIdentifier	 merge Scheduler
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link MergeScheduler} that was set by * {@link #setMergeScheduler(MergeScheduler)} */	TokenNameCOMMENT_JAVADOC	 Returns the {@link MergeScheduler} that was set by {@link #setMergeScheduler(MergeScheduler)} 
public	TokenNamepublic	
MergeScheduler	TokenNameIdentifier	 Merge Scheduler
getMergeScheduler	TokenNameIdentifier	 get Merge Scheduler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mergeScheduler	TokenNameIdentifier	 merge Scheduler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the maximum time to wait for a write lock (in milliseconds) for this * instance. You can change the default value for all instances by calling * {@link #setDefaultWriteLockTimeout(long)}. * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 Sets the maximum time to wait for a write lock (in milliseconds) for this instance. You can change the default value for all instances by calling {@link #setDefaultWriteLockTimeout(long)}. * <p>Only takes effect when IndexWriter is first created. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setWriteLockTimeout	TokenNameIdentifier	 set Write Lock Timeout
(	TokenNameLPAREN	
long	TokenNamelong	
writeLockTimeout	TokenNameIdentifier	 write Lock Timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
writeLockTimeout	TokenNameIdentifier	 write Lock Timeout
=	TokenNameEQUAL	
writeLockTimeout	TokenNameIdentifier	 write Lock Timeout
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns allowed timeout when acquiring the write lock. * * @see #setWriteLockTimeout(long) */	TokenNameCOMMENT_JAVADOC	 Returns allowed timeout when acquiring the write lock. * @see #setWriteLockTimeout(long) 
public	TokenNamepublic	
long	TokenNamelong	
getWriteLockTimeout	TokenNameIdentifier	 get Write Lock Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
writeLockTimeout	TokenNameIdentifier	 write Lock Timeout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines the minimal number of delete terms required before the buffered * in-memory delete terms are applied and flushed. If there are documents * buffered in memory at the time, they are merged and a new segment is * created. * <p>Disabled by default (writer flushes by RAM usage). * * @throws IllegalArgumentException if maxBufferedDeleteTerms * is enabled but smaller than 1 * @see #setRAMBufferSizeMB * * <p>Takes effect immediately, but only the next time a * document is added, updated or deleted. */	TokenNameCOMMENT_JAVADOC	 Determines the minimal number of delete terms required before the buffered in-memory delete terms are applied and flushed. If there are documents buffered in memory at the time, they are merged and a new segment is created. <p>Disabled by default (writer flushes by RAM usage). * @throws IllegalArgumentException if maxBufferedDeleteTerms is enabled but smaller than 1 @see #setRAMBufferSizeMB * <p>Takes effect immediately, but only the next time a document is added, updated or deleted. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setMaxBufferedDeleteTerms	TokenNameIdentifier	 set Max Buffered Delete Terms
(	TokenNameLPAREN	
int	TokenNameint	
maxBufferedDeleteTerms	TokenNameIdentifier	 max Buffered Delete Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxBufferedDeleteTerms	TokenNameIdentifier	 max Buffered Delete Terms
!=	TokenNameNOT_EQUAL	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
&&	TokenNameAND_AND	
maxBufferedDeleteTerms	TokenNameIdentifier	 max Buffered Delete Terms
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxBufferedDeleteTerms must at least be 1 when enabled"	TokenNameStringLiteral	maxBufferedDeleteTerms must at least be 1 when enabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxBufferedDeleteTerms	TokenNameIdentifier	 max Buffered Delete Terms
=	TokenNameEQUAL	
maxBufferedDeleteTerms	TokenNameIdentifier	 max Buffered Delete Terms
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of buffered deleted terms that will trigger a flush if * enabled. * * @see #setMaxBufferedDeleteTerms(int) */	TokenNameCOMMENT_JAVADOC	 Returns the number of buffered deleted terms that will trigger a flush if enabled. * @see #setMaxBufferedDeleteTerms(int) 
public	TokenNamepublic	
int	TokenNameint	
getMaxBufferedDeleteTerms	TokenNameIdentifier	 get Max Buffered Delete Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxBufferedDeleteTerms	TokenNameIdentifier	 max Buffered Delete Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines the amount of RAM that may be used for buffering added documents * and deletions before they are flushed to the Directory. Generally for * faster indexing performance it's best to flush by RAM usage instead of * document count and use as large a RAM buffer as you can. * * <p> * When this is set, the writer will flush whenever buffered documents and * deletions use this much RAM. Pass in {@link #DISABLE_AUTO_FLUSH} to prevent * triggering a flush due to RAM usage. Note that if flushing by document * count is also enabled, then the flush will be triggered by whichever comes * first. * * <p> * <b>NOTE</b>: the account of RAM usage for pending deletions is only * approximate. Specifically, if you delete by Query, Lucene currently has no * way to measure the RAM usage of individual Queries so the accounting will * under-estimate and you should compensate by either calling commit() * periodically yourself, or by using {@link #setMaxBufferedDeleteTerms(int)} * to flush by count instead of RAM usage (each buffered delete Query counts * as one). * * <p> * <b>NOTE</b>: because IndexWriter uses <code>int</code>s when managing its * internal storage, the absolute maximum value for this setting is somewhat * less than 2048 MB. The precise limit depends on various factors, such as * how large your documents are, how many fields have norms, etc., so it's * best to set this value comfortably under 2048. * * <p> * The default value is {@link #DEFAULT_RAM_BUFFER_SIZE_MB}. * * <p>Takes effect immediately, but only the next time a * document is added, updated or deleted. * * @throws IllegalArgumentException * if ramBufferSize is enabled but non-positive, or it disables * ramBufferSize when maxBufferedDocs is already disabled */	TokenNameCOMMENT_JAVADOC	 Determines the amount of RAM that may be used for buffering added documents and deletions before they are flushed to the Directory. Generally for faster indexing performance it's best to flush by RAM usage instead of document count and use as large a RAM buffer as you can. * <p> When this is set, the writer will flush whenever buffered documents and deletions use this much RAM. Pass in {@link #DISABLE_AUTO_FLUSH} to prevent triggering a flush due to RAM usage. Note that if flushing by document count is also enabled, then the flush will be triggered by whichever comes first. * <p> <b>NOTE</b>: the account of RAM usage for pending deletions is only approximate. Specifically, if you delete by Query, Lucene currently has no way to measure the RAM usage of individual Queries so the accounting will under-estimate and you should compensate by either calling commit() periodically yourself, or by using {@link #setMaxBufferedDeleteTerms(int)} to flush by count instead of RAM usage (each buffered delete Query counts as one). * <p> <b>NOTE</b>: because IndexWriter uses <code>int</code>s when managing its internal storage, the absolute maximum value for this setting is somewhat less than 2048 MB. The precise limit depends on various factors, such as how large your documents are, how many fields have norms, etc., so it's best to set this value comfortably under 2048. * <p> The default value is {@link #DEFAULT_RAM_BUFFER_SIZE_MB}. * <p>Takes effect immediately, but only the next time a document is added, updated or deleted. * @throws IllegalArgumentException if ramBufferSize is enabled but non-positive, or it disables ramBufferSize when maxBufferedDocs is already disabled 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setRAMBufferSizeMB	TokenNameIdentifier	 set RAM Buffer Size MB
(	TokenNameLPAREN	
double	TokenNamedouble	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
>	TokenNameGREATER	
2048.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"ramBufferSize "	TokenNameStringLiteral	ramBufferSize 
+	TokenNamePLUS	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
+	TokenNamePLUS	
" is too large; should be comfortably less than 2048"	TokenNameStringLiteral	 is too large; should be comfortably less than 2048
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
!=	TokenNameNOT_EQUAL	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
&&	TokenNameAND_AND	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
<=	TokenNameLESS_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"ramBufferSize should be > 0.0 MB when enabled"	TokenNameStringLiteral	ramBufferSize should be > 0.0 MB when enabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
==	TokenNameEQUAL_EQUAL	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
&&	TokenNameAND_AND	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
==	TokenNameEQUAL_EQUAL	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"at least one of ramBufferSize and maxBufferedDocs must be enabled"	TokenNameStringLiteral	at least one of ramBufferSize and maxBufferedDocs must be enabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
=	TokenNameEQUAL	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value set by {@link #setRAMBufferSizeMB(double)} if enabled. */	TokenNameCOMMENT_JAVADOC	 Returns the value set by {@link #setRAMBufferSizeMB(double)} if enabled. 
public	TokenNamepublic	
double	TokenNamedouble	
getRAMBufferSizeMB	TokenNameIdentifier	 get RAM Buffer Size MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines the minimal number of documents required before the buffered * in-memory documents are flushed as a new Segment. Large values generally * give faster indexing. * * <p> * When this is set, the writer will flush every maxBufferedDocs added * documents. Pass in {@link #DISABLE_AUTO_FLUSH} to prevent triggering a * flush due to number of buffered documents. Note that if flushing by RAM * usage is also enabled, then the flush will be triggered by whichever comes * first. * * <p> * Disabled by default (writer flushes by RAM usage). * * <p>Takes effect immediately, but only the next time a * document is added, updated or deleted. * * @see #setRAMBufferSizeMB(double) * * @throws IllegalArgumentException * if maxBufferedDocs is enabled but smaller than 2, or it disables * maxBufferedDocs when ramBufferSize is already disabled */	TokenNameCOMMENT_JAVADOC	 Determines the minimal number of documents required before the buffered in-memory documents are flushed as a new Segment. Large values generally give faster indexing. * <p> When this is set, the writer will flush every maxBufferedDocs added documents. Pass in {@link #DISABLE_AUTO_FLUSH} to prevent triggering a flush due to number of buffered documents. Note that if flushing by RAM usage is also enabled, then the flush will be triggered by whichever comes first. * <p> Disabled by default (writer flushes by RAM usage). * <p>Takes effect immediately, but only the next time a document is added, updated or deleted. * @see #setRAMBufferSizeMB(double) * @throws IllegalArgumentException if maxBufferedDocs is enabled but smaller than 2, or it disables maxBufferedDocs when ramBufferSize is already disabled 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
int	TokenNameint	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
!=	TokenNameNOT_EQUAL	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
&&	TokenNameAND_AND	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxBufferedDocs must at least be 2 when enabled"	TokenNameStringLiteral	maxBufferedDocs must at least be 2 when enabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
==	TokenNameEQUAL_EQUAL	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
&&	TokenNameAND_AND	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
==	TokenNameEQUAL_EQUAL	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"at least one of ramBufferSize and maxBufferedDocs must be enabled"	TokenNameStringLiteral	at least one of ramBufferSize and maxBufferedDocs must be enabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
=	TokenNameEQUAL	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of buffered added documents that will trigger a flush if * enabled. * * @see #setMaxBufferedDocs(int) */	TokenNameCOMMENT_JAVADOC	 Returns the number of buffered added documents that will trigger a flush if enabled. * @see #setMaxBufferedDocs(int) 
public	TokenNamepublic	
int	TokenNameint	
getMaxBufferedDocs	TokenNameIdentifier	 get Max Buffered Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the merged segment warmer. See {@link IndexReaderWarmer}. * * <p>Takes effect on the next merge. */	TokenNameCOMMENT_JAVADOC	 Set the merged segment warmer. See {@link IndexReaderWarmer}. * <p>Takes effect on the next merge. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setMergedSegmentWarmer	TokenNameIdentifier	 set Merged Segment Warmer
(	TokenNameLPAREN	
IndexReaderWarmer	TokenNameIdentifier	 Index Reader Warmer
mergeSegmentWarmer	TokenNameIdentifier	 merge Segment Warmer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mergedSegmentWarmer	TokenNameIdentifier	 merged Segment Warmer
=	TokenNameEQUAL	
mergeSegmentWarmer	TokenNameIdentifier	 merge Segment Warmer
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current merged segment warmer. See {@link IndexReaderWarmer}. */	TokenNameCOMMENT_JAVADOC	 Returns the current merged segment warmer. See {@link IndexReaderWarmer}. 
public	TokenNamepublic	
IndexReaderWarmer	TokenNameIdentifier	 Index Reader Warmer
getMergedSegmentWarmer	TokenNameIdentifier	 get Merged Segment Warmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mergedSegmentWarmer	TokenNameIdentifier	 merged Segment Warmer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: {@link MergePolicy} is invoked whenever there are changes to the * segments in the index. Its role is to select which merges to do, if any, * and return a {@link MergePolicy.MergeSpecification} describing the merges. * It also selects merges to do for forceMerge. (The default is * {@link LogByteSizeMergePolicy}. * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 Expert: {@link MergePolicy} is invoked whenever there are changes to the segments in the index. Its role is to select which merges to do, if any, and return a {@link MergePolicy.MergeSpecification} describing the merges. It also selects merges to do for forceMerge. (The default is {@link LogByteSizeMergePolicy}. * <p>Only takes effect when IndexWriter is first created. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
MergePolicy	TokenNameIdentifier	 Merge Policy
mergePolicy	TokenNameIdentifier	 merge Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mergePolicy	TokenNameIdentifier	 merge Policy
=	TokenNameEQUAL	
mergePolicy	TokenNameIdentifier	 merge Policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
LogByteSizeMergePolicy	TokenNameIdentifier	 Log Byte Size Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
mergePolicy	TokenNameIdentifier	 merge Policy
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current MergePolicy in use by this writer. * * @see #setMergePolicy(MergePolicy) */	TokenNameCOMMENT_JAVADOC	 Returns the current MergePolicy in use by this writer. * @see #setMergePolicy(MergePolicy) 
public	TokenNamepublic	
MergePolicy	TokenNameIdentifier	 Merge Policy
getMergePolicy	TokenNameIdentifier	 get Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mergePolicy	TokenNameIdentifier	 merge Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the max number of simultaneous threads that may be indexing documents * at once in IndexWriter. Values &lt; 1 are invalid and if passed * <code>maxThreadStates</code> will be set to * {@link #DEFAULT_MAX_THREAD_STATES}. * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 Sets the max number of simultaneous threads that may be indexing documents at once in IndexWriter. Values &lt; 1 are invalid and if passed <code>maxThreadStates</code> will be set to {@link #DEFAULT_MAX_THREAD_STATES}. * <p>Only takes effect when IndexWriter is first created. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setMaxThreadStates	TokenNameIdentifier	 set Max Thread States
(	TokenNameLPAREN	
int	TokenNameint	
maxThreadStates	TokenNameIdentifier	 max Thread States
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxThreadStates	TokenNameIdentifier	 max Thread States
=	TokenNameEQUAL	
maxThreadStates	TokenNameIdentifier	 max Thread States
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
DEFAULT_MAX_THREAD_STATES	TokenNameIdentifier	 DEFAULT  MAX  THREAD  STATES
:	TokenNameCOLON	
maxThreadStates	TokenNameIdentifier	 max Thread States
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the max number of simultaneous threads that * may be indexing documents at once in IndexWriter. */	TokenNameCOMMENT_JAVADOC	 Returns the max number of simultaneous threads that may be indexing documents at once in IndexWriter. 
public	TokenNamepublic	
int	TokenNameint	
getMaxThreadStates	TokenNameIdentifier	 get Max Thread States
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxThreadStates	TokenNameIdentifier	 max Thread States
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** By default, IndexWriter does not pool the * SegmentReaders it must open for deletions and * merging, unless a near-real-time reader has been * obtained by calling {@link IndexWriter#getReader}. * This method lets you enable pooling without getting a * near-real-time reader. NOTE: if you set this to * false, IndexWriter will still pool readers once * {@link IndexWriter#getReader} is called. * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 By default, IndexWriter does not pool the SegmentReaders it must open for deletions and merging, unless a near-real-time reader has been obtained by calling {@link IndexWriter#getReader}. This method lets you enable pooling without getting a near-real-time reader. NOTE: if you set this to false, IndexWriter will still pool readers once {@link IndexWriter#getReader} is called. * <p>Only takes effect when IndexWriter is first created. 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setReaderPooling	TokenNameIdentifier	 set Reader Pooling
(	TokenNameLPAREN	
boolean	TokenNameboolean	
readerPooling	TokenNameIdentifier	 reader Pooling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
readerPooling	TokenNameIdentifier	 reader Pooling
=	TokenNameEQUAL	
readerPooling	TokenNameIdentifier	 reader Pooling
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if IndexWriter should pool readers even * if {@link IndexWriter#getReader} has not been called. */	TokenNameCOMMENT_JAVADOC	 Returns true if IndexWriter should pool readers even if {@link IndexWriter#getReader} has not been called. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getReaderPooling	TokenNameIdentifier	 get Reader Pooling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readerPooling	TokenNameIdentifier	 reader Pooling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: sets the {@link DocConsumer} chain to be used to process documents. * * <p>Only takes effect when IndexWriter is first created. */	TokenNameCOMMENT_JAVADOC	 Expert: sets the {@link DocConsumer} chain to be used to process documents. * <p>Only takes effect when IndexWriter is first created. 
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setIndexingChain	TokenNameIdentifier	 set Indexing Chain
(	TokenNameLPAREN	
IndexingChain	TokenNameIdentifier	 Indexing Chain
indexingChain	TokenNameIdentifier	 indexing Chain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexingChain	TokenNameIdentifier	 indexing Chain
=	TokenNameEQUAL	
indexingChain	TokenNameIdentifier	 indexing Chain
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
defaultIndexingChain	TokenNameIdentifier	 default Indexing Chain
:	TokenNameCOLON	
indexingChain	TokenNameIdentifier	 indexing Chain
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the indexing chain set on {@link #setIndexingChain(IndexingChain)}. */	TokenNameCOMMENT_JAVADOC	 Returns the indexing chain set on {@link #setIndexingChain(IndexingChain)}. 
IndexingChain	TokenNameIdentifier	 Indexing Chain
getIndexingChain	TokenNameIdentifier	 get Indexing Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexingChain	TokenNameIdentifier	 indexing Chain
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the termsIndexDivisor passed to any readers that * IndexWriter opens, for example when applying deletes * or creating a near-real-time reader in {@link * IndexWriter#getReader}. If you pass -1, the terms index * won't be loaded by the readers. This is only useful in * advanced situations when you will only .next() through * all terms; attempts to seek will hit an exception. * * <p>Takes effect immediately, but only applies to * readers opened after this call */	TokenNameCOMMENT_JAVADOC	 Sets the termsIndexDivisor passed to any readers that IndexWriter opens, for example when applying deletes or creating a near-real-time reader in {@link IndexWriter#getReader}. If you pass -1, the terms index won't be loaded by the readers. This is only useful in advanced situations when you will only .next() through all terms; attempts to seek will hit an exception. * <p>Takes effect immediately, but only applies to readers opened after this call 
public	TokenNamepublic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
setReaderTermsIndexDivisor	TokenNameIdentifier	 set Reader Terms Index Divisor
(	TokenNameLPAREN	
int	TokenNameint	
divisor	TokenNameIdentifier	 divisor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
divisor	TokenNameIdentifier	 divisor
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
divisor	TokenNameIdentifier	 divisor
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"divisor must be >= 1, or -1 (got "	TokenNameStringLiteral	divisor must be >= 1, or -1 (got 
+	TokenNamePLUS	
divisor	TokenNameIdentifier	 divisor
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
readerTermsIndexDivisor	TokenNameIdentifier	 reader Terms Index Divisor
=	TokenNameEQUAL	
divisor	TokenNameIdentifier	 divisor
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setReaderTermsIndexDivisor(int) */	TokenNameCOMMENT_JAVADOC	 @see #setReaderTermsIndexDivisor(int) 
public	TokenNamepublic	
int	TokenNameint	
getReaderTermsIndexDivisor	TokenNameIdentifier	 get Reader Terms Index Divisor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readerTermsIndexDivisor	TokenNameIdentifier	 reader Terms Index Divisor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"matchVersion="	TokenNameStringLiteral	matchVersion=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"analyzer="	TokenNameStringLiteral	analyzer=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"delPolicy="	TokenNameStringLiteral	delPolicy=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
delPolicy	TokenNameIdentifier	 del Policy
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"commit="	TokenNameStringLiteral	commit=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"openMode="	TokenNameStringLiteral	openMode=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
openMode	TokenNameIdentifier	 open Mode
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"similarity="	TokenNameStringLiteral	similarity=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"termIndexInterval="	TokenNameStringLiteral	termIndexInterval=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
termIndexInterval	TokenNameIdentifier	 term Index Interval
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"mergeScheduler="	TokenNameStringLiteral	mergeScheduler=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mergeScheduler	TokenNameIdentifier	 merge Scheduler
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"default WRITE_LOCK_TIMEOUT="	TokenNameStringLiteral	default WRITE_LOCK_TIMEOUT=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
WRITE_LOCK_TIMEOUT	TokenNameIdentifier	 WRITE  LOCK  TIMEOUT
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"writeLockTimeout="	TokenNameStringLiteral	writeLockTimeout=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
writeLockTimeout	TokenNameIdentifier	 write Lock Timeout
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"maxBufferedDeleteTerms="	TokenNameStringLiteral	maxBufferedDeleteTerms=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxBufferedDeleteTerms	TokenNameIdentifier	 max Buffered Delete Terms
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ramBufferSizeMB="	TokenNameStringLiteral	ramBufferSizeMB=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ramBufferSizeMB	TokenNameIdentifier	 ram Buffer Size MB
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"maxBufferedDocs="	TokenNameStringLiteral	maxBufferedDocs=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxBufferedDocs	TokenNameIdentifier	 max Buffered Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"mergedSegmentWarmer="	TokenNameStringLiteral	mergedSegmentWarmer=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mergedSegmentWarmer	TokenNameIdentifier	 merged Segment Warmer
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"mergePolicy="	TokenNameStringLiteral	mergePolicy=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mergePolicy	TokenNameIdentifier	 merge Policy
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"maxThreadStates="	TokenNameStringLiteral	maxThreadStates=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxThreadStates	TokenNameIdentifier	 max Thread States
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"readerPooling="	TokenNameStringLiteral	readerPooling=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
readerPooling	TokenNameIdentifier	 reader Pooling
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"readerTermsIndexDivisor="	TokenNameStringLiteral	readerTermsIndexDivisor=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
readerTermsIndexDivisor	TokenNameIdentifier	 reader Terms Index Divisor
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
