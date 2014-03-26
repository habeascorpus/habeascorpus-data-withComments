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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PriorityQueue	TokenNameIdentifier	 Priority Queue
;	TokenNameSEMICOLON	
/** * A base class for all collectors that return a {@link TopDocs} output. This * collector allows easy extension by providing a single constructor which * accepts a {@link PriorityQueue} as well as protected members for that * priority queue and a counter of the number of total hits.<br> * Extending classes can override any of the methods to provide their own * implementation, as well as avoid the use of the priority queue entirely by * passing null to {@link #TopDocsCollector(PriorityQueue)}. In that case * however, you might want to consider overriding all methods, in order to avoid * a NullPointerException. */	TokenNameCOMMENT_JAVADOC	 A base class for all collectors that return a {@link TopDocs} output. This collector allows easy extension by providing a single constructor which accepts a {@link PriorityQueue} as well as protected members for that priority queue and a counter of the number of total hits.<br> Extending classes can override any of the methods to provide their own implementation, as well as avoid the use of the priority queue entirely by passing null to {@link #TopDocsCollector(PriorityQueue)}. In that case however, you might want to consider overriding all methods, in order to avoid a NullPointerException. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
// This is used in case topDocs() is called with illegal parameters, or there 	TokenNameCOMMENT_LINE	This is used in case topDocs() is called with illegal parameters, or there 
// simply aren't (enough) results. 	TokenNameCOMMENT_LINE	simply aren't (enough) results. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
EMPTY_TOPDOCS	TokenNameIdentifier	 EMPTY  TOPDOCS
=	TokenNameEQUAL	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The priority queue which holds the top documents. Note that different * implementations of PriorityQueue give different meaning to 'top documents'. * HitQueue for example aggregates the top scoring documents, while other PQ * implementations may hold documents sorted by other criteria. */	TokenNameCOMMENT_JAVADOC	 The priority queue which holds the top documents. Note that different implementations of PriorityQueue give different meaning to 'top documents'. HitQueue for example aggregates the top scoring documents, while other PQ implementations may hold documents sorted by other criteria. 
protected	TokenNameprotected	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
pq	TokenNameIdentifier	 pq
;	TokenNameSEMICOLON	
/** The total number of documents that the collector encountered. */	TokenNameCOMMENT_JAVADOC	 The total number of documents that the collector encountered. 
protected	TokenNameprotected	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
(	TokenNameLPAREN	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
pq	TokenNameIdentifier	 pq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pq	TokenNameIdentifier	 pq
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Populates the results array with the ScoreDoc instances. This can be * overridden in case a different ScoreDoc type should be returned. */	TokenNameCOMMENT_JAVADOC	 Populates the results array with the ScoreDoc instances. This can be overridden in case a different ScoreDoc type should be returned. 
protected	TokenNameprotected	
void	TokenNamevoid	
populateResults	TokenNameIdentifier	 populate Results
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
int	TokenNameint	
howMany	TokenNameIdentifier	 how Many
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
howMany	TokenNameIdentifier	 how Many
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
{	TokenNameLBRACE	
results	TokenNameIdentifier	 results
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a {@link TopDocs} instance containing the given results. If * <code>results</code> is null it means there are no results to return, * either because there were 0 calls to collect() or because the arguments to * topDocs were invalid. */	TokenNameCOMMENT_JAVADOC	 Returns a {@link TopDocs} instance containing the given results. If <code>results</code> is null it means there are no results to return, either because there were 0 calls to collect() or because the arguments to topDocs were invalid. 
protected	TokenNameprotected	
TopDocs	TokenNameIdentifier	 Top Docs
newTopDocs	TokenNameIdentifier	 new Top Docs
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
results	TokenNameIdentifier	 results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
EMPTY_TOPDOCS	TokenNameIdentifier	 EMPTY  TOPDOCS
:	TokenNameCOLON	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The total number of documents that matched this query. */	TokenNameCOMMENT_JAVADOC	 The total number of documents that matched this query. 
public	TokenNamepublic	
int	TokenNameint	
getTotalHits	TokenNameIdentifier	 get Total Hits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The number of valid PQ entries */	TokenNameCOMMENT_JAVADOC	 The number of valid PQ entries 
protected	TokenNameprotected	
int	TokenNameint	
topDocsSize	TokenNameIdentifier	 top Docs Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In case pq was populated with sentinel values, there might be less 	TokenNameCOMMENT_LINE	In case pq was populated with sentinel values, there might be less 
// results than pq.size(). Therefore return all results until either 	TokenNameCOMMENT_LINE	results than pq.size(). Therefore return all results until either 
// pq.size() or totalHits. 	TokenNameCOMMENT_LINE	pq.size() or totalHits. 
return	TokenNamereturn	
totalHits	TokenNameIdentifier	 total Hits
<	TokenNameLESS	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
totalHits	TokenNameIdentifier	 total Hits
:	TokenNameCOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the top docs that were collected by this collector. */	TokenNameCOMMENT_JAVADOC	 Returns the top docs that were collected by this collector. 
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In case pq was populated with sentinel values, there might be less 	TokenNameCOMMENT_LINE	In case pq was populated with sentinel values, there might be less 
// results than pq.size(). Therefore return all results until either 	TokenNameCOMMENT_LINE	results than pq.size(). Therefore return all results until either 
// pq.size() or totalHits. 	TokenNameCOMMENT_LINE	pq.size() or totalHits. 
return	TokenNamereturn	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
topDocsSize	TokenNameIdentifier	 top Docs Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the documents in the rage [start .. pq.size()) that were collected * by this collector. Note that if start >= pq.size(), an empty TopDocs is * returned.<br> * This method is convenient to call if the application always asks for the * last results, starting from the last 'page'.<br> * <b>NOTE:</b> you cannot call this method more than once for each search * execution. If you need to call it more than once, passing each time a * different <code>start</code>, you should call {@link #topDocs()} and work * with the returned {@link TopDocs} object, which will contain all the * results this search execution collected. */	TokenNameCOMMENT_JAVADOC	 Returns the documents in the rage [start .. pq.size()) that were collected by this collector. Note that if start >= pq.size(), an empty TopDocs is returned.<br> This method is convenient to call if the application always asks for the last results, starting from the last 'page'.<br> <b>NOTE:</b> you cannot call this method more than once for each search execution. If you need to call it more than once, passing each time a different <code>start</code>, you should call {@link #topDocs()} and work with the returned {@link TopDocs} object, which will contain all the results this search execution collected. 
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In case pq was populated with sentinel values, there might be less 	TokenNameCOMMENT_LINE	In case pq was populated with sentinel values, there might be less 
// results than pq.size(). Therefore return all results until either 	TokenNameCOMMENT_LINE	results than pq.size(). Therefore return all results until either 
// pq.size() or totalHits. 	TokenNameCOMMENT_LINE	pq.size() or totalHits. 
return	TokenNamereturn	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
topDocsSize	TokenNameIdentifier	 top Docs Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the documents in the rage [start .. start+howMany) that were * collected by this collector. Note that if start >= pq.size(), an empty * TopDocs is returned, and if pq.size() - start &lt; howMany, then only the * available documents in [start .. pq.size()) are returned.<br> * This method is useful to call in case pagination of search results is * allowed by the search application, as well as it attempts to optimize the * memory used by allocating only as much as requested by howMany.<br> * <b>NOTE:</b> you cannot call this method more than once for each search * execution. If you need to call it more than once, passing each time a * different range, you should call {@link #topDocs()} and work with the * returned {@link TopDocs} object, which will contain all the results this * search execution collected. */	TokenNameCOMMENT_JAVADOC	 Returns the documents in the rage [start .. start+howMany) that were collected by this collector. Note that if start >= pq.size(), an empty TopDocs is returned, and if pq.size() - start &lt; howMany, then only the available documents in [start .. pq.size()) are returned.<br> This method is useful to call in case pagination of search results is allowed by the search application, as well as it attempts to optimize the memory used by allocating only as much as requested by howMany.<br> <b>NOTE:</b> you cannot call this method more than once for each search execution. If you need to call it more than once, passing each time a different range, you should call {@link #topDocs()} and work with the returned {@link TopDocs} object, which will contain all the results this search execution collected. 
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
howMany	TokenNameIdentifier	 how Many
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In case pq was populated with sentinel values, there might be less 	TokenNameCOMMENT_LINE	In case pq was populated with sentinel values, there might be less 
// results than pq.size(). Therefore return all results until either 	TokenNameCOMMENT_LINE	results than pq.size(). Therefore return all results until either 
// pq.size() or totalHits. 	TokenNameCOMMENT_LINE	pq.size() or totalHits. 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
topDocsSize	TokenNameIdentifier	 top Docs Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Don't bother to throw an exception, just return an empty TopDocs in case 	TokenNameCOMMENT_LINE	Don't bother to throw an exception, just return an empty TopDocs in case 
// the parameters are invalid or out of range. 	TokenNameCOMMENT_LINE	the parameters are invalid or out of range. 
// TODO: shouldn't we throw IAE if apps give bad params here so they dont 	TokenNameCOMMENT_LINE	TODO: shouldn't we throw IAE if apps give bad params here so they dont 
// have sneaky silent bugs? 	TokenNameCOMMENT_LINE	have sneaky silent bugs? 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
start	TokenNameIdentifier	 start
>=	TokenNameGREATER_EQUAL	
size	TokenNameIdentifier	 size
||	TokenNameOR_OR	
howMany	TokenNameIdentifier	 how Many
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newTopDocs	TokenNameIdentifier	 new Top Docs
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We know that start < pqsize, so just fix howMany. 	TokenNameCOMMENT_LINE	We know that start < pqsize, so just fix howMany. 
howMany	TokenNameIdentifier	 how Many
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
howMany	TokenNameIdentifier	 how Many
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
howMany	TokenNameIdentifier	 how Many
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// pq's pop() returns the 'least' element in the queue, therefore need 	TokenNameCOMMENT_LINE	pq's pop() returns the 'least' element in the queue, therefore need 
// to discard the first ones, until we reach the requested range. 	TokenNameCOMMENT_LINE	to discard the first ones, until we reach the requested range. 
// Note that this loop will usually not be executed, since the common usage 	TokenNameCOMMENT_LINE	Note that this loop will usually not be executed, since the common usage 
// should be that the caller asks for the last howMany results. However it's 	TokenNameCOMMENT_LINE	should be that the caller asks for the last howMany results. However it's 
// needed here for completeness. 	TokenNameCOMMENT_LINE	needed here for completeness. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
howMany	TokenNameIdentifier	 how Many
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get the requested results from pq. 	TokenNameCOMMENT_LINE	Get the requested results from pq. 
populateResults	TokenNameIdentifier	 populate Results
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
howMany	TokenNameIdentifier	 how Many
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newTopDocs	TokenNameIdentifier	 new Top Docs
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
