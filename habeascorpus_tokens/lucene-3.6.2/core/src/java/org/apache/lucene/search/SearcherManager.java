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
IOException	TokenNameIdentifier	 IO Exception
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
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
/** * Utility class to safely share {@link IndexSearcher} instances across multiple * threads, while periodically reopening. This class ensures each searcher is * closed only once all threads have finished using it. * * <p> * Use {@link #acquire} to obtain the current searcher, and {@link #release} to * release it, like this: * * <pre class="prettyprint"> * IndexSearcher s = manager.acquire(); * try { * // Do searching, doc retrieval, etc. with s * } finally { * manager.release(s); * } * // Do not use s after this! * s = null; * </pre> * * <p> * In addition you should periodically call {@link #maybeRefresh}. While it's * possible to call this just before running each query, this is discouraged * since it penalizes the unlucky queries that do the reopen. It's better to use * a separate background thread, that periodically calls maybeReopen. Finally, * be sure to call {@link #close} once you are done. * * @see SearcherFactory * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Utility class to safely share {@link IndexSearcher} instances across multiple threads, while periodically reopening. This class ensures each searcher is closed only once all threads have finished using it. * <p> Use {@link #acquire} to obtain the current searcher, and {@link #release} to release it, like this: * <pre class="prettyprint"> IndexSearcher s = manager.acquire(); try { // Do searching, doc retrieval, etc. with s } finally { manager.release(s); } // Do not use s after this! s = null; </pre> * <p> In addition you should periodically call {@link #maybeRefresh}. While it's possible to call this just before running each query, this is discouraged since it penalizes the unlucky queries that do the reopen. It's better to use a separate background thread, that periodically calls maybeReopen. Finally, be sure to call {@link #close} once you are done. * @see SearcherFactory * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SearcherManager	TokenNameIdentifier	 Searcher Manager
extends	TokenNameextends	
ReferenceManager	TokenNameIdentifier	 Reference Manager
<	TokenNameLESS	
IndexSearcher	TokenNameIdentifier	 Index Searcher
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
SearcherFactory	TokenNameIdentifier	 Searcher Factory
searcherFactory	TokenNameIdentifier	 searcher Factory
;	TokenNameSEMICOLON	
/** * Creates and returns a new SearcherManager from the given {@link IndexWriter}. * @param writer the IndexWriter to open the IndexReader from. * @param applyAllDeletes If <code>true</code>, all buffered deletes will * be applied (made visible) in the {@link IndexSearcher} / {@link IndexReader}. * If <code>false</code>, the deletes may or may not be applied, but remain buffered * (in IndexWriter) so that they will be applied in the future. * Applying deletes can be costly, so if your app can tolerate deleted documents * being returned you might gain some performance by passing <code>false</code>. * See {@link IndexReader#openIfChanged(IndexReader, IndexWriter, boolean)}. * @param searcherFactory An optional {@link SearcherFactory}. Pass * <code>null</code> if you don't require the searcher to be warmed * before going live or other custom behavior. * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new SearcherManager from the given {@link IndexWriter}. @param writer the IndexWriter to open the IndexReader from. @param applyAllDeletes If <code>true</code>, all buffered deletes will be applied (made visible) in the {@link IndexSearcher} / {@link IndexReader}. If <code>false</code>, the deletes may or may not be applied, but remain buffered (in IndexWriter) so that they will be applied in the future. Applying deletes can be costly, so if your app can tolerate deleted documents being returned you might gain some performance by passing <code>false</code>. See {@link IndexReader#openIfChanged(IndexReader, IndexWriter, boolean)}. @param searcherFactory An optional {@link SearcherFactory}. Pass <code>null</code> if you don't require the searcher to be warmed before going live or other custom behavior. * @throws IOException 
public	TokenNamepublic	
SearcherManager	TokenNameIdentifier	 Searcher Manager
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
,	TokenNameCOMMA	
SearcherFactory	TokenNameIdentifier	 Searcher Factory
searcherFactory	TokenNameIdentifier	 searcher Factory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
searcherFactory	TokenNameIdentifier	 searcher Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
searcherFactory	TokenNameIdentifier	 searcher Factory
=	TokenNameEQUAL	
new	TokenNamenew	
SearcherFactory	TokenNameIdentifier	 Searcher Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
searcherFactory	TokenNameIdentifier	 searcher Factory
=	TokenNameEQUAL	
searcherFactory	TokenNameIdentifier	 searcher Factory
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
getSearcher	TokenNameIdentifier	 get Searcher
(	TokenNameLPAREN	
searcherFactory	TokenNameIdentifier	 searcher Factory
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new SearcherManager from the given {@link Directory}. * @param dir the directory to open the DirectoryReader on. * @param searcherFactory An optional {@link SearcherFactory}. Pass * <code>null</code> if you don't require the searcher to be warmed * before going live or other custom behavior. * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new SearcherManager from the given {@link Directory}. @param dir the directory to open the DirectoryReader on. @param searcherFactory An optional {@link SearcherFactory}. Pass <code>null</code> if you don't require the searcher to be warmed before going live or other custom behavior. * @throws IOException 
public	TokenNamepublic	
SearcherManager	TokenNameIdentifier	 Searcher Manager
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
SearcherFactory	TokenNameIdentifier	 Searcher Factory
searcherFactory	TokenNameIdentifier	 searcher Factory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
searcherFactory	TokenNameIdentifier	 searcher Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
searcherFactory	TokenNameIdentifier	 searcher Factory
=	TokenNameEQUAL	
new	TokenNamenew	
SearcherFactory	TokenNameIdentifier	 Searcher Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
searcherFactory	TokenNameIdentifier	 searcher Factory
=	TokenNameEQUAL	
searcherFactory	TokenNameIdentifier	 searcher Factory
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
getSearcher	TokenNameIdentifier	 get Searcher
(	TokenNameLPAREN	
searcherFactory	TokenNameIdentifier	 searcher Factory
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reference	TokenNameIdentifier	 reference
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
IndexSearcher	TokenNameIdentifier	 Index Searcher
refreshIfNeeded	TokenNameIdentifier	 refresh If Needed
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
referenceToRefresh	TokenNameIdentifier	 reference To Refresh
)	TokenNameRPAREN	
throws	TokenNamethrows	
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
referenceToRefresh	TokenNameIdentifier	 reference To Refresh
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSearcher	TokenNameIdentifier	 get Searcher
(	TokenNameLPAREN	
searcherFactory	TokenNameIdentifier	 searcher Factory
,	TokenNameCOMMA	
newReader	TokenNameIdentifier	 new Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
tryIncRef	TokenNameIdentifier	 try Inc Ref
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reference	TokenNameIdentifier	 reference
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tryIncRef	TokenNameIdentifier	 try Inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated see {@link #maybeRefresh()}. */	TokenNameCOMMENT_JAVADOC	 @deprecated see {@link #maybeRefresh()}. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
boolean	TokenNameboolean	
maybeReopen	TokenNameIdentifier	 maybe Reopen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
maybeRefresh	TokenNameIdentifier	 maybe Refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if no changes have occured since this searcher * ie. reader was opened, otherwise <code>false</code>. * @see IndexReader#isCurrent() */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if no changes have occured since this searcher ie. reader was opened, otherwise <code>false</code>. @see IndexReader#isCurrent() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSearcherCurrent	TokenNameIdentifier	 is Searcher Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
acquire	TokenNameIdentifier	 acquire
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCurrent	TokenNameIdentifier	 is Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// NOTE: decRefs incoming reader on throwing an exception 	TokenNameCOMMENT_LINE	NOTE: decRefs incoming reader on throwing an exception 
static	TokenNamestatic	
IndexSearcher	TokenNameIdentifier	 Index Searcher
getSearcher	TokenNameIdentifier	 get Searcher
(	TokenNameLPAREN	
SearcherFactory	TokenNameIdentifier	 Searcher Factory
searcherFactory	TokenNameIdentifier	 searcher Factory
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
searcherFactory	TokenNameIdentifier	 searcher Factory
.	TokenNameDOT	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"SearcherFactory must wrap exactly the provided reader (got "	TokenNameStringLiteral	SearcherFactory must wrap exactly the provided reader (got 
+	TokenNamePLUS	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" but expected "	TokenNameStringLiteral	 but expected 
+	TokenNamePLUS	
reader	TokenNameIdentifier	 reader
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
