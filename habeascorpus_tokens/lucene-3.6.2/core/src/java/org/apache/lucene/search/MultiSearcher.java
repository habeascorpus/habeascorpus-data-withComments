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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
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
Term	TokenNameIdentifier	 Term
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ReaderUtil	TokenNameIdentifier	 Reader Util
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
DummyConcurrentLock	TokenNameIdentifier	 Dummy Concurrent Lock
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
Callable	TokenNameIdentifier	 Callable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
locks	TokenNameIdentifier	 locks
.	TokenNameDOT	
Lock	TokenNameIdentifier	 Lock
;	TokenNameSEMICOLON	
/** Implements search over a set of <code>Searchables</code>. * * <p>Applications usually need only call the inherited {@link #search(Query,int)} * or {@link #search(Query,Filter,int)} methods. * * @deprecated If you are using MultiSearcher over * IndexSearchers, please use MultiReader instead; this class * does not properly handle certain kinds of queries (see <a * href="https://issues.apache.org/jira/browse/LUCENE-2756">LUCENE-2756</a>). */	TokenNameCOMMENT_JAVADOC	 Implements search over a set of <code>Searchables</code>. * <p>Applications usually need only call the inherited {@link #search(Query,int)} or {@link #search(Query,Filter,int)} methods. * @deprecated If you are using MultiSearcher over IndexSearchers, please use MultiReader instead; this class does not properly handle certain kinds of queries (see <a href="https://issues.apache.org/jira/browse/LUCENE-2756">LUCENE-2756</a>). 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
MultiSearcher	TokenNameIdentifier	 Multi Searcher
extends	TokenNameextends	
Searcher	TokenNameIdentifier	 Searcher
{	TokenNameLBRACE	
/** * Document Frequency cache acting as a Dummy-Searcher. This class is no * full-fledged Searcher, but only supports the methods necessary to * initialize Weights. */	TokenNameCOMMENT_JAVADOC	 Document Frequency cache acting as a Dummy-Searcher. This class is no full-fledged Searcher, but only supports the methods necessary to initialize Weights. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CachedDfSource	TokenNameIdentifier	 Cached Df Source
extends	TokenNameextends	
Searcher	TokenNameIdentifier	 Searcher
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
dfMap	TokenNameIdentifier	 df Map
;	TokenNameSEMICOLON	
// Map from Terms to corresponding doc freqs 	TokenNameCOMMENT_LINE	Map from Terms to corresponding doc freqs 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
// document count 	TokenNameCOMMENT_LINE	document count 
public	TokenNamepublic	
CachedDfSource	TokenNameIdentifier	 Cached Df Source
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
dfMap	TokenNameIdentifier	 df Map
,	TokenNameCOMMA	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dfMap	TokenNameIdentifier	 df Map
=	TokenNameEQUAL	
dfMap	TokenNameIdentifier	 df Map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
setSimilarity	TokenNameIdentifier	 set Similarity
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
dfMap	TokenNameIdentifier	 df Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"df for term "	TokenNameStringLiteral	df for term 
+	TokenNamePLUS	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" not available"	TokenNameStringLiteral	 not available
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docFreqs	TokenNameIdentifier	 doc Freqs
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this is a bit of a hack. We know that a query which 	TokenNameCOMMENT_LINE	this is a bit of a hack. We know that a query which 
// creates a Weight based on this Dummy-Searcher is 	TokenNameCOMMENT_LINE	creates a Weight based on this Dummy-Searcher is 
// always already rewritten (see preparedWeight()). 	TokenNameCOMMENT_LINE	always already rewritten (see preparedWeight()). 
// Therefore we just return the unmodified query here 	TokenNameCOMMENT_LINE	Therefore we just return the unmodified query here 
return	TokenNamereturn	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
FieldSelector	TokenNameIdentifier	 Field Selector
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Searchable	TokenNameIdentifier	 Searchable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
searchables	TokenNameIdentifier	 searchables
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Creates a searcher which searches <i>searchers</i>. */	TokenNameCOMMENT_JAVADOC	 Creates a searcher which searches <i>searchers</i>. 
public	TokenNamepublic	
MultiSearcher	TokenNameIdentifier	 Multi Searcher
(	TokenNameLPAREN	
Searchable	TokenNameIdentifier	 Searchable
...	TokenNameELLIPSIS	
searchables	TokenNameIdentifier	 searchables
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
searchables	TokenNameIdentifier	 searchables
=	TokenNameEQUAL	
searchables	TokenNameIdentifier	 searchables
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// build starts array 	TokenNameCOMMENT_LINE	build starts array 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
maxDoc	TokenNameIdentifier	 max Doc
+=	TokenNamePLUS_EQUAL	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compute maxDocs 	TokenNameCOMMENT_LINE	compute maxDocs 
}	TokenNameRBRACE	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the array of {@link Searchable}s this searches. */	TokenNameCOMMENT_JAVADOC	 Return the array of {@link Searchable}s this searches. 
public	TokenNamepublic	
Searchable	TokenNameIdentifier	 Searchable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSearchables	TokenNameIdentifier	 get Searchables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
searchables	TokenNameIdentifier	 searchables
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getStarts	TokenNameIdentifier	 get Starts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadoc 	TokenNameCOMMENT_LINE	inherit javadoc 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
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
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
docFreq	TokenNameIdentifier	 doc Freq
+=	TokenNamePLUS_EQUAL	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadoc 	TokenNameCOMMENT_LINE	inherit javadoc 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
subSearcher	TokenNameIdentifier	 sub Searcher
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find searcher index 	TokenNameCOMMENT_LINE	find searcher index 
return	TokenNamereturn	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to searcher 	TokenNameCOMMENT_LINE	dispatch to searcher 
}	TokenNameRBRACE	
// inherit javadoc 	TokenNameCOMMENT_LINE	inherit javadoc 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
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
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
subSearcher	TokenNameIdentifier	 sub Searcher
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find searcher index 	TokenNameCOMMENT_LINE	find searcher index 
return	TokenNamereturn	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to searcher 	TokenNameCOMMENT_LINE	dispatch to searcher 
}	TokenNameRBRACE	
/** Returns index of the searcher for document <code>n</code> in the array * used to construct this searcher. */	TokenNameCOMMENT_JAVADOC	 Returns index of the searcher for document <code>n</code> in the array used to construct this searcher. 
public	TokenNamepublic	
int	TokenNameint	
subSearcher	TokenNameIdentifier	 sub Searcher
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find searcher for doc n: 	TokenNameCOMMENT_LINE	find searcher for doc n: 
return	TokenNamereturn	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
subIndex	TokenNameIdentifier	 sub Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the document number of document <code>n</code> within its * sub-index. */	TokenNameCOMMENT_JAVADOC	 Returns the document number of document <code>n</code> within its sub-index. 
public	TokenNamepublic	
int	TokenNameint	
subDoc	TokenNameIdentifier	 sub Doc
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
subSearcher	TokenNameIdentifier	 sub Searcher
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
nDocs	TokenNameIdentifier	 n Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
nDocs	TokenNameIdentifier	 n Docs
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
HitQueue	TokenNameIdentifier	 Hit Queue
hq	TokenNameIdentifier	 hq
=	TokenNameEQUAL	
new	TokenNamenew	
HitQueue	TokenNameIdentifier	 Hit Queue
(	TokenNameLPAREN	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
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
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search each searcher 	TokenNameCOMMENT_LINE	search each searcher 
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
new	TokenNamenew	
MultiSearcherCallableNoSort	TokenNameIdentifier	 Multi Searcher Callable No Sort
(	TokenNameLPAREN	
DummyConcurrentLock	TokenNameIdentifier	 Dummy Concurrent Lock
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
,	TokenNameCOMMA	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
hq	TokenNameIdentifier	 hq
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
)	TokenNameRPAREN	
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalHits	TokenNameIdentifier	 total Hits
+=	TokenNamePLUS_EQUAL	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
// update totalHits 	TokenNameCOMMENT_LINE	update totalHits 
}	TokenNameRBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
// put docs in array 	TokenNameCOMMENT_LINE	put docs in array 
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
:	TokenNameCOLON	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldDocSortedHitQueue	TokenNameIdentifier	 Field Doc Sorted Hit Queue
hq	TokenNameIdentifier	 hq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldDocSortedHitQueue	TokenNameIdentifier	 Field Doc Sorted Hit Queue
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
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
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search each searcher 	TokenNameCOMMENT_LINE	search each searcher 
final	TokenNamefinal	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
new	TokenNamenew	
MultiSearcherCallableWithSort	TokenNameIdentifier	 Multi Searcher Callable With Sort
(	TokenNameLPAREN	
DummyConcurrentLock	TokenNameIdentifier	 Dummy Concurrent Lock
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
,	TokenNameCOMMA	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
hq	TokenNameIdentifier	 hq
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
)	TokenNameRPAREN	
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalHits	TokenNameIdentifier	 total Hits
+=	TokenNamePLUS_EQUAL	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
// update totalHits 	TokenNameCOMMENT_LINE	update totalHits 
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxScore	TokenNameIdentifier	 max Score
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
getMaxScore	TokenNameIdentifier	 get Max Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
// put docs in array 	TokenNameCOMMENT_LINE	put docs in array 
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadoc 	TokenNameCOMMENT_LINE	inherit javadoc 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
final	TokenNamefinal	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Collector	TokenNameIdentifier	 Collector
hc	TokenNameIdentifier	 hc
=	TokenNameEQUAL	
new	TokenNamenew	
Collector	TokenNameIdentifier	 Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
hc	TokenNameIdentifier	 hc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
queries	TokenNameIdentifier	 queries
=	TokenNameEQUAL	
new	TokenNamenew	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
searchables	TokenNameIdentifier	 searchables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queries	TokenNameIdentifier	 queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
queries	TokenNameIdentifier	 queries
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
combine	TokenNameIdentifier	 combine
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
subSearcher	TokenNameIdentifier	 sub Searcher
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find searcher index 	TokenNameCOMMENT_LINE	find searcher index 
return	TokenNamereturn	
searchables	TokenNameIdentifier	 searchables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to searcher 	TokenNameCOMMENT_LINE	dispatch to searcher 
}	TokenNameRBRACE	
/** * Create weight in multiple index scenario. * * Distributed query processing is done in the following steps: * 1. rewrite query * 2. extract necessary terms * 3. collect dfs for these terms from the Searchables * 4. create query weight using aggregate dfs. * 5. distribute that weight to Searchables * 6. merge results * * Steps 1-4 are done here, 5+6 in the search() methods * * @return rewritten queries */	TokenNameCOMMENT_JAVADOC	 Create weight in multiple index scenario. * Distributed query processing is done in the following steps: 1. rewrite query 2. extract necessary terms 3. collect dfs for these terms from the Searchables 4. create query weight using aggregate dfs. 5. distribute that weight to Searchables 6. merge results * Steps 1-4 are done here, 5+6 in the search() methods * @return rewritten queries 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Weight	TokenNameIdentifier	 Weight
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// step 1 	TokenNameCOMMENT_LINE	step 1 
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
rewrittenQuery	TokenNameIdentifier	 rewritten Query
=	TokenNameEQUAL	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// step 2 	TokenNameCOMMENT_LINE	step 2 
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rewrittenQuery	TokenNameIdentifier	 rewritten Query
.	TokenNameDOT	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// step3 	TokenNameCOMMENT_LINE	step3 
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
dfMap	TokenNameIdentifier	 df Map
=	TokenNameEQUAL	
createDocFrequencyMap	TokenNameIdentifier	 create Doc Frequency Map
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// step4 	TokenNameCOMMENT_LINE	step4 
final	TokenNamefinal	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CachedDfSource	TokenNameIdentifier	 Cached Df Source
cacheSim	TokenNameIdentifier	 cache Sim
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDfSource	TokenNameIdentifier	 Cached Df Source
(	TokenNameLPAREN	
dfMap	TokenNameIdentifier	 df Map
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cacheSim	TokenNameIdentifier	 cache Sim
.	TokenNameDOT	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
rewrittenQuery	TokenNameIdentifier	 rewritten Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Collects the document frequency for the given terms form all searchables * @param terms term set used to collect the document frequency form all * searchables * @return a map with a term as the key and the terms aggregated document * frequency as a value * @throws IOException if a searchable throws an {@link IOException} */	TokenNameCOMMENT_JAVADOC	 Collects the document frequency for the given terms form all searchables @param terms term set used to collect the document frequency form all searchables @return a map with a term as the key and the terms aggregated document frequency as a value @throws IOException if a searchable throws an {@link IOException} 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
createDocFrequencyMap	TokenNameIdentifier	 create Doc Frequency Map
(	TokenNameLPAREN	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
allTermsArray	TokenNameIdentifier	 all Terms Array
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aggregatedDfs	TokenNameIdentifier	 aggregated Dfs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
allTermsArray	TokenNameIdentifier	 all Terms Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Searchable	TokenNameIdentifier	 Searchable
searchable	TokenNameIdentifier	 searchable
:	TokenNameCOLON	
searchables	TokenNameIdentifier	 searchables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dfs	TokenNameIdentifier	 dfs
=	TokenNameEQUAL	
searchable	TokenNameIdentifier	 searchable
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
(	TokenNameLPAREN	
allTermsArray	TokenNameIdentifier	 all Terms Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
aggregatedDfs	TokenNameIdentifier	 aggregated Dfs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aggregatedDfs	TokenNameIdentifier	 aggregated Dfs
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
dfs	TokenNameIdentifier	 dfs
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
dfMap	TokenNameIdentifier	 df Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
allTermsArray	TokenNameIdentifier	 all Terms Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dfMap	TokenNameIdentifier	 df Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
allTermsArray	TokenNameIdentifier	 all Terms Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
aggregatedDfs	TokenNameIdentifier	 aggregated Dfs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dfMap	TokenNameIdentifier	 df Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A thread subclass for searching a single searchable */	TokenNameCOMMENT_JAVADOC	 A thread subclass for searching a single searchable 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
MultiSearcherCallableNoSort	TokenNameIdentifier	 Multi Searcher Callable No Sort
implements	TokenNameimplements	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
TopDocs	TokenNameIdentifier	 Top Docs
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Lock	TokenNameIdentifier	 Lock
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Searchable	TokenNameIdentifier	 Searchable
searchable	TokenNameIdentifier	 searchable
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
nDocs	TokenNameIdentifier	 n Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
HitQueue	TokenNameIdentifier	 Hit Queue
hq	TokenNameIdentifier	 hq
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiSearcherCallableNoSort	TokenNameIdentifier	 Multi Searcher Callable No Sort
(	TokenNameLPAREN	
Lock	TokenNameIdentifier	 Lock
lock	TokenNameIdentifier	 lock
,	TokenNameCOMMA	
Searchable	TokenNameIdentifier	 Searchable
searchable	TokenNameIdentifier	 searchable
,	TokenNameCOMMA	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
HitQueue	TokenNameIdentifier	 Hit Queue
hq	TokenNameIdentifier	 hq
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lock	TokenNameIdentifier	 lock
=	TokenNameEQUAL	
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
searchable	TokenNameIdentifier	 searchable
=	TokenNameEQUAL	
searchable	TokenNameIdentifier	 searchable
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nDocs	TokenNameIdentifier	 n Docs
=	TokenNameEQUAL	
nDocs	TokenNameIdentifier	 n Docs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hq	TokenNameIdentifier	 hq
=	TokenNameEQUAL	
hq	TokenNameIdentifier	 hq
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
starts	TokenNameIdentifier	 starts
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searchable	TokenNameIdentifier	 searchable
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
nDocs	TokenNameIdentifier	 n Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// merge scoreDocs into hq 	TokenNameCOMMENT_LINE	merge scoreDocs into hq 
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
scoreDoc	TokenNameIdentifier	 score Doc
=	TokenNameEQUAL	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
scoreDoc	TokenNameIdentifier	 score Doc
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// convert doc 	TokenNameCOMMENT_LINE	convert doc 
//it would be so nice if we had a thread-safe insert 	TokenNameCOMMENT_LINE	it would be so nice if we had a thread-safe insert 
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
lock	TokenNameIdentifier	 lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scoreDoc	TokenNameIdentifier	 score Doc
==	TokenNameEQUAL_EQUAL	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
scoreDoc	TokenNameIdentifier	 score Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
unlock	TokenNameIdentifier	 unlock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
docs	TokenNameIdentifier	 docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A thread subclass for searching a single searchable */	TokenNameCOMMENT_JAVADOC	 A thread subclass for searching a single searchable 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
MultiSearcherCallableWithSort	TokenNameIdentifier	 Multi Searcher Callable With Sort
implements	TokenNameimplements	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Lock	TokenNameIdentifier	 Lock
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Searchable	TokenNameIdentifier	 Searchable
searchable	TokenNameIdentifier	 searchable
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
nDocs	TokenNameIdentifier	 n Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FieldDocSortedHitQueue	TokenNameIdentifier	 Field Doc Sorted Hit Queue
hq	TokenNameIdentifier	 hq
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiSearcherCallableWithSort	TokenNameIdentifier	 Multi Searcher Callable With Sort
(	TokenNameLPAREN	
Lock	TokenNameIdentifier	 Lock
lock	TokenNameIdentifier	 lock
,	TokenNameCOMMA	
Searchable	TokenNameIdentifier	 Searchable
searchable	TokenNameIdentifier	 searchable
,	TokenNameCOMMA	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
FieldDocSortedHitQueue	TokenNameIdentifier	 Field Doc Sorted Hit Queue
hq	TokenNameIdentifier	 hq
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lock	TokenNameIdentifier	 lock
=	TokenNameEQUAL	
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
searchable	TokenNameIdentifier	 searchable
=	TokenNameEQUAL	
searchable	TokenNameIdentifier	 searchable
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nDocs	TokenNameIdentifier	 n Docs
=	TokenNameEQUAL	
nDocs	TokenNameIdentifier	 n Docs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hq	TokenNameIdentifier	 hq
=	TokenNameEQUAL	
hq	TokenNameIdentifier	 hq
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
starts	TokenNameIdentifier	 starts
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
=	TokenNameEQUAL	
sort	TokenNameIdentifier	 sort
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searchable	TokenNameIdentifier	 searchable
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If one of the Sort fields is FIELD_DOC, need to fix its values, so that 	TokenNameCOMMENT_LINE	If one of the Sort fields is FIELD_DOC, need to fix its values, so that 
// it will break ties by doc Id properly. Otherwise, it will compare to 	TokenNameCOMMENT_LINE	it will break ties by doc Id properly. Otherwise, it will compare to 
// 'relative' doc Ids, that belong to two different searchables. 	TokenNameCOMMENT_LINE	'relative' doc Ids, that belong to two different searchables. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
DOC	TokenNameIdentifier	 DOC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// iterate over the score docs and change their fields value 	TokenNameCOMMENT_LINE	iterate over the score docs and change their fields value 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j2	TokenNameIdentifier	 j2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j2	TokenNameIdentifier	 j2
<	TokenNameLESS	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j2	TokenNameIdentifier	 j2
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldDoc	TokenNameIdentifier	 Field Doc
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldDoc	TokenNameIdentifier	 Field Doc
)	TokenNameRPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
j2	TokenNameIdentifier	 j2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fd	TokenNameIdentifier	 fd
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fd	TokenNameIdentifier	 fd
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
lock	TokenNameIdentifier	 lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
setFields	TokenNameIdentifier	 set Fields
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
unlock	TokenNameIdentifier	 unlock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// merge scoreDocs into hq 	TokenNameCOMMENT_LINE	merge scoreDocs into hq 
final	TokenNamefinal	
FieldDoc	TokenNameIdentifier	 Field Doc
fieldDoc	TokenNameIdentifier	 field Doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldDoc	TokenNameIdentifier	 Field Doc
)	TokenNameRPAREN	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fieldDoc	TokenNameIdentifier	 field Doc
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// convert doc 	TokenNameCOMMENT_LINE	convert doc 
//it would be so nice if we had a thread-safe insert 	TokenNameCOMMENT_LINE	it would be so nice if we had a thread-safe insert 
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
lock	TokenNameIdentifier	 lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldDoc	TokenNameIdentifier	 field Doc
==	TokenNameEQUAL_EQUAL	
hq	TokenNameIdentifier	 hq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
fieldDoc	TokenNameIdentifier	 field Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
unlock	TokenNameIdentifier	 unlock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
docs	TokenNameIdentifier	 docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
