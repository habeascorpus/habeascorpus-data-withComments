package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* Derived from org.apache.lucene.util.PriorityQueue of March 2005 */	TokenNameCOMMENT_BLOCK	 Derived from org.apache.lucene.util.PriorityQueue of March 2005 
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
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
Scorer	TokenNameIdentifier	 Scorer
;	TokenNameSEMICOLON	
/** A ScorerDocQueue maintains a partial ordering of its Scorers such that the least Scorer can always be found in constant time. Put()'s and pop()'s require log(size) time. The ordering is by Scorer.doc(). * * @lucene.internal * @deprecated */	TokenNameCOMMENT_JAVADOC	 A ScorerDocQueue maintains a partial ordering of its Scorers such that the least Scorer can always be found in constant time. Put()'s and pop()'s require log(size) time. The ordering is by Scorer.doc(). * @lucene.internal @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
ScorerDocQueue	TokenNameIdentifier	 Scorer Doc Queue
{	TokenNameLBRACE	
// later: SpansQueue for spans with doc and term positions 	TokenNameCOMMENT_LINE	later: SpansQueue for spans with doc and term positions 
private	TokenNameprivate	
final	TokenNamefinal	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
heap	TokenNameIdentifier	 heap
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
adjust	TokenNameIdentifier	 adjust
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
topHSD	TokenNameIdentifier	 top HSD
;	TokenNameSEMICOLON	
// same as heap[1], only for speed 	TokenNameCOMMENT_LINE	same as heap[1], only for speed 
/** Create a ScorerDocQueue with a maximum size. */	TokenNameCOMMENT_JAVADOC	 Create a ScorerDocQueue with a maximum size. 
public	TokenNamepublic	
ScorerDocQueue	TokenNameIdentifier	 Scorer Doc Queue
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assert maxSize >= 0; 	TokenNameCOMMENT_LINE	assert maxSize >= 0; 
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
heapSize	TokenNameIdentifier	 heap Size
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
new	TokenNamenew	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
[	TokenNameLBRACKET	
heapSize	TokenNameIdentifier	 heap Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
topHSD	TokenNameIdentifier	 top HSD
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// initially null 	TokenNameCOMMENT_LINE	initially null 
}	TokenNameRBRACE	
/** * Adds a Scorer to a ScorerDocQueue in log(size) time. * If one tries to add more Scorers than maxSize * a RuntimeException (ArrayIndexOutOfBound) is thrown. */	TokenNameCOMMENT_JAVADOC	 Adds a Scorer to a ScorerDocQueue in log(size) time. If one tries to add more Scorers than maxSize a RuntimeException (ArrayIndexOutOfBound) is thrown. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upHeap	TokenNameIdentifier	 up Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a Scorer to the ScorerDocQueue in log(size) time if either * the ScorerDocQueue is not full, or not lessThan(scorer, top()). * @param scorer * @return true if scorer is added, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Adds a Scorer to the ScorerDocQueue in log(size) time if either the ScorerDocQueue is not full, or not lessThan(scorer, top()). @param scorer @return true if scorer is added, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
docNr	TokenNameIdentifier	 doc Nr
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
docNr	TokenNameIdentifier	 doc Nr
<	TokenNameLESS	
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// heap[1] is top() 	TokenNameCOMMENT_LINE	heap[1] is top() 
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
,	TokenNameCOMMA	
docNr	TokenNameIdentifier	 doc Nr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
downHeap	TokenNameIdentifier	 down Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the least Scorer of the ScorerDocQueue in constant time. * Should not be used when the queue is empty. */	TokenNameCOMMENT_JAVADOC	 Returns the least Scorer of the ScorerDocQueue in constant time. Should not be used when the queue is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
Scorer	TokenNameIdentifier	 Scorer
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assert size > 0; 	TokenNameCOMMENT_LINE	assert size > 0; 
return	TokenNamereturn	
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns document number of the least Scorer of the ScorerDocQueue * in constant time. * Should not be used when the queue is empty. */	TokenNameCOMMENT_JAVADOC	 Returns document number of the least Scorer of the ScorerDocQueue in constant time. Should not be used when the queue is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
topDoc	TokenNameIdentifier	 top Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assert size > 0; 	TokenNameCOMMENT_LINE	assert size > 0; 
return	TokenNamereturn	
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
float	TokenNamefloat	
topScore	TokenNameIdentifier	 top Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// assert size > 0; 	TokenNameCOMMENT_LINE	assert size > 0; 
return	TokenNamereturn	
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
topNextAndAdjustElsePop	TokenNameIdentifier	 top Next And Adjust Else Pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
checkAdjustElsePop	TokenNameIdentifier	 check Adjust Else Pop
(	TokenNameLPAREN	
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
topSkipToAndAdjustElsePop	TokenNameIdentifier	 top Skip To And Adjust Else Pop
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
checkAdjustElsePop	TokenNameIdentifier	 check Adjust Else Pop
(	TokenNameLPAREN	
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
checkAdjustElsePop	TokenNameIdentifier	 check Adjust Else Pop
(	TokenNameLPAREN	
boolean	TokenNameboolean	
cond	TokenNameIdentifier	 cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cond	TokenNameIdentifier	 cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// see also adjustTop 	TokenNameCOMMENT_LINE	see also adjustTop 
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// see also popNoResult 	TokenNameCOMMENT_LINE	see also popNoResult 
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// move last to first 	TokenNameCOMMENT_LINE	move last to first 
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
downHeap	TokenNameIdentifier	 down Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cond	TokenNameIdentifier	 cond
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Removes and returns the least scorer of the ScorerDocQueue in log(size) * time. * Should not be used when the queue is empty. */	TokenNameCOMMENT_JAVADOC	 Removes and returns the least scorer of the ScorerDocQueue in log(size) time. Should not be used when the queue is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
Scorer	TokenNameIdentifier	 Scorer
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assert size > 0; 	TokenNameCOMMENT_LINE	assert size > 0; 
Scorer	TokenNameIdentifier	 Scorer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
popNoResult	TokenNameIdentifier	 pop No Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Removes the least scorer of the ScorerDocQueue in log(size) time. * Should not be used when the queue is empty. */	TokenNameCOMMENT_JAVADOC	 Removes the least scorer of the ScorerDocQueue in log(size) time. Should not be used when the queue is empty. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
popNoResult	TokenNameIdentifier	 pop No Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// move last to first 	TokenNameCOMMENT_LINE	move last to first 
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
downHeap	TokenNameIdentifier	 down Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// adjust heap 	TokenNameCOMMENT_LINE	adjust heap 
}	TokenNameRBRACE	
/** Should be called when the scorer at top changes doc() value. * Still log(n) worst case, but it's at least twice as fast to <pre> * { pq.top().change(); pq.adjustTop(); } * </pre> instead of <pre> * { o = pq.pop(); o.change(); pq.push(o); } * </pre> */	TokenNameCOMMENT_JAVADOC	 Should be called when the scorer at top changes doc() value. Still log(n) worst case, but it's at least twice as fast to <pre> { pq.top().change(); pq.adjustTop(); } </pre> instead of <pre> { o = pq.pop(); o.change(); pq.push(o); } </pre> 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
adjustTop	TokenNameIdentifier	 adjust Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assert size > 0; 	TokenNameCOMMENT_LINE	assert size > 0; 
topHSD	TokenNameIdentifier	 top HSD
.	TokenNameDOT	
adjust	TokenNameIdentifier	 adjust
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
downHeap	TokenNameIdentifier	 down Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the number of scorers currently stored in the ScorerDocQueue. */	TokenNameCOMMENT_JAVADOC	 Returns the number of scorers currently stored in the ScorerDocQueue. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Removes all entries from the ScorerDocQueue. */	TokenNameCOMMENT_JAVADOC	 Removes all entries from the ScorerDocQueue. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
upHeap	TokenNameIdentifier	 up Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// save bottom node 	TokenNameCOMMENT_LINE	save bottom node 
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// shift parents down 	TokenNameCOMMENT_LINE	shift parents down 
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
// install saved node 	TokenNameCOMMENT_LINE	install saved node 
topHSD	TokenNameIdentifier	 top HSD
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
downHeap	TokenNameIdentifier	 down Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
HeapedScorerDoc	TokenNameIdentifier	 Heaped Scorer Doc
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// save top node 	TokenNameCOMMENT_LINE	save top node 
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// find smaller child 	TokenNameCOMMENT_LINE	find smaller child 
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// shift up child 	TokenNameCOMMENT_LINE	shift up child 
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
// install saved node 	TokenNameCOMMENT_LINE	install saved node 
topHSD	TokenNameIdentifier	 top HSD
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
