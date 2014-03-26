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
final	TokenNamefinal	
class	TokenNameclass	
HitQueue	TokenNameIdentifier	 Hit Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
prePopulate	TokenNameIdentifier	 pre Populate
;	TokenNameSEMICOLON	
/** * Creates a new instance with <code>size</code> elements. If * <code>prePopulate</code> is set to true, the queue will pre-populate itself * with sentinel objects and set its {@link #size()} to <code>size</code>. In * that case, you should not rely on {@link #size()} to get the number of * actual elements that were added to the queue, but keep track yourself.<br> * <b>NOTE:</b> in case <code>prePopulate</code> is true, you should pop * elements from the queue using the following code example: * * <pre> * PriorityQueue pq = new HitQueue(10, true); // pre-populate. * ScoreDoc top = pq.top(); * * // Add/Update one element. * top.score = 1.0f; * top.doc = 0; * top = (ScoreDoc) pq.updateTop(); * int totalHits = 1; * * // Now pop only the elements that were *truly* inserted. * // First, pop all the sentinel elements (there are pq.size() - totalHits). * for (int i = pq.size() - totalHits; i &gt; 0; i--) pq.pop(); * * // Now pop the truly added elements. * ScoreDoc[] results = new ScoreDoc[totalHits]; * for (int i = totalHits - 1; i &gt;= 0; i--) { * results[i] = (ScoreDoc) pq.pop(); * } * </pre> * * <p><b>NOTE</b>: This class pre-allocate a full array of * length <code>size</code>. * * @param size * the requested size of this queue. * @param prePopulate * specifies whether to pre-populate the queue with sentinel values. * @see #getSentinelObject() */	TokenNameCOMMENT_JAVADOC	 Creates a new instance with <code>size</code> elements. If <code>prePopulate</code> is set to true, the queue will pre-populate itself with sentinel objects and set its {@link #size()} to <code>size</code>. In that case, you should not rely on {@link #size()} to get the number of actual elements that were added to the queue, but keep track yourself.<br> <b>NOTE:</b> in case <code>prePopulate</code> is true, you should pop elements from the queue using the following code example: * <pre> PriorityQueue pq = new HitQueue(10, true); // pre-populate. ScoreDoc top = pq.top(); * // Add/Update one element. top.score = 1.0f; top.doc = 0; top = (ScoreDoc) pq.updateTop(); int totalHits = 1; * // Now pop only the elements that were *truly* inserted. // First, pop all the sentinel elements (there are pq.size() - totalHits). for (int i = pq.size() - totalHits; i &gt; 0; i--) pq.pop(); * // Now pop the truly added elements. ScoreDoc[] results = new ScoreDoc[totalHits]; for (int i = totalHits - 1; i &gt;= 0; i--) { results[i] = (ScoreDoc) pq.pop(); } </pre> * <p><b>NOTE</b>: This class pre-allocate a full array of length <code>size</code>. * @param size the requested size of this queue. @param prePopulate specifies whether to pre-populate the queue with sentinel values. @see #getSentinelObject() 
HitQueue	TokenNameIdentifier	 Hit Queue
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
prePopulate	TokenNameIdentifier	 pre Populate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prePopulate	TokenNameIdentifier	 pre Populate
=	TokenNameEQUAL	
prePopulate	TokenNameIdentifier	 pre Populate
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Returns null if prePopulate is false. 	TokenNameCOMMENT_LINE	Returns null if prePopulate is false. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
ScoreDoc	TokenNameIdentifier	 Score Doc
getSentinelObject	TokenNameIdentifier	 get Sentinel Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Always set the doc Id to MAX_VALUE so that it won't be favored by 	TokenNameCOMMENT_LINE	Always set the doc Id to MAX_VALUE so that it won't be favored by 
// lessThan. This generally should not happen since if score is not NEG_INF, 	TokenNameCOMMENT_LINE	lessThan. This generally should not happen since if score is not NEG_INF, 
// TopScoreDocCollector will always add the object to the queue. 	TokenNameCOMMENT_LINE	TopScoreDocCollector will always add the object to the queue. 
return	TokenNamereturn	
!	TokenNameNOT	
prePopulate	TokenNameIdentifier	 pre Populate
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
hitA	TokenNameIdentifier	 hit A
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
hitB	TokenNameIdentifier	 hit B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hitA	TokenNameIdentifier	 hit A
.	TokenNameDOT	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
hitB	TokenNameIdentifier	 hit B
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
return	TokenNamereturn	
hitA	TokenNameIdentifier	 hit A
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
>	TokenNameGREATER	
hitB	TokenNameIdentifier	 hit B
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
hitA	TokenNameIdentifier	 hit A
.	TokenNameDOT	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
hitB	TokenNameIdentifier	 hit B
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
