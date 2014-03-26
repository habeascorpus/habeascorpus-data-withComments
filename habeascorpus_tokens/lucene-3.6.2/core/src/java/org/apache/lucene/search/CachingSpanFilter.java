package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Copyright 2005 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2005 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Wraps another SpanFilter's result and caches it. The purpose is to allow * filters to simply filter, and then wrap with this class to add caching. */	TokenNameCOMMENT_JAVADOC	 Wraps another SpanFilter's result and caches it. The purpose is to allow filters to simply filter, and then wrap with this class to add caching. 
public	TokenNamepublic	
class	TokenNameclass	
CachingSpanFilter	TokenNameIdentifier	 Caching Span Filter
extends	TokenNameextends	
SpanFilter	TokenNameIdentifier	 Span Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
SpanFilter	TokenNameIdentifier	 Span Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
/** * A transient Filter cache (package private because of test) */	TokenNameCOMMENT_JAVADOC	 A transient Filter cache (package private because of test) 
private	TokenNameprivate	
final	TokenNamefinal	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
.	TokenNameDOT	
FilterCache	TokenNameIdentifier	 Filter Cache
<	TokenNameLESS	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
/** * New deletions always result in a cache miss, by default * ({@link CachingWrapperFilter.DeletesMode#RECACHE}. * @param filter Filter to cache results of */	TokenNameCOMMENT_JAVADOC	 New deletions always result in a cache miss, by default ({@link CachingWrapperFilter.DeletesMode#RECACHE}. @param filter Filter to cache results of 
public	TokenNamepublic	
CachingSpanFilter	TokenNameIdentifier	 Caching Span Filter
(	TokenNameLPAREN	
SpanFilter	TokenNameIdentifier	 Span Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
.	TokenNameDOT	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
RECACHE	TokenNameIdentifier	 RECACHE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param filter Filter to cache results of * @param deletesMode See {@link CachingWrapperFilter.DeletesMode} */	TokenNameCOMMENT_JAVADOC	 @param filter Filter to cache results of @param deletesMode See {@link CachingWrapperFilter.DeletesMode} 
public	TokenNamepublic	
CachingSpanFilter	TokenNameIdentifier	 Caching Span Filter
(	TokenNameLPAREN	
SpanFilter	TokenNameIdentifier	 Span Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
.	TokenNameDOT	
DeletesMode	TokenNameIdentifier	 Deletes Mode
deletesMode	TokenNameIdentifier	 deletes Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deletesMode	TokenNameIdentifier	 deletes Mode
==	TokenNameEQUAL_EQUAL	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
.	TokenNameDOT	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
DYNAMIC	TokenNameIdentifier	 DYNAMIC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"DeletesMode.DYNAMIC is not supported"	TokenNameStringLiteral	DeletesMode.DYNAMIC is not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
.	TokenNameDOT	
FilterCache	TokenNameIdentifier	 Filter Cache
<	TokenNameLESS	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
>	TokenNameGREATER	
(	TokenNameLPAREN	
deletesMode	TokenNameIdentifier	 deletes Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
mergeDeletes	TokenNameIdentifier	 merge Deletes
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
final	TokenNamefinal	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"DeletesMode.DYNAMIC is not supported"	TokenNameStringLiteral	DeletesMode.DYNAMIC is not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getCachedResult	TokenNameIdentifier	 get Cached Result
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for testing 	TokenNameCOMMENT_LINE	for testing 
int	TokenNameint	
hitCount	TokenNameIdentifier	 hit Count
,	TokenNameCOMMA	
missCount	TokenNameIdentifier	 miss Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
getCachedResult	TokenNameIdentifier	 get Cached Result
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
coreKey	TokenNameIdentifier	 core Key
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getCoreCacheKey	TokenNameIdentifier	 get Core Cache Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
delCoreKey	TokenNameIdentifier	 del Core Key
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getDeletesCacheKey	TokenNameIdentifier	 get Deletes Cache Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
coreKey	TokenNameIdentifier	 core Key
;	TokenNameSEMICOLON	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
coreKey	TokenNameIdentifier	 core Key
,	TokenNameCOMMA	
delCoreKey	TokenNameIdentifier	 del Core Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hitCount	TokenNameIdentifier	 hit Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
missCount	TokenNameIdentifier	 miss Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
bitSpans	TokenNameIdentifier	 bit Spans
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
coreKey	TokenNameIdentifier	 core Key
,	TokenNameCOMMA	
delCoreKey	TokenNameIdentifier	 del Core Key
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
bitSpans	TokenNameIdentifier	 bit Spans
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getCachedResult	TokenNameIdentifier	 get Cached Result
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
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
return	TokenNamereturn	
"CachingSpanFilter("	TokenNameStringLiteral	CachingSpanFilter(
+	TokenNamePLUS	
filter	TokenNameIdentifier	 filter
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
CachingSpanFilter	TokenNameIdentifier	 Caching Span Filter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CachingSpanFilter	TokenNameIdentifier	 Caching Span Filter
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x1117BF25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
