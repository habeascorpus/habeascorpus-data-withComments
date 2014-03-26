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
/** A PriorityQueue maintains a partial ordering of its elements such that the * least element can always be found in constant time. Put()'s and pop()'s * require log(size) time. * * <p><b>NOTE</b>: This class pre-allocates a full array of * length <code>maxSize+1</code>, in {@link #initialize}. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A PriorityQueue maintains a partial ordering of its elements such that the least element can always be found in constant time. Put()'s and pop()'s require log(size) time. * <p><b>NOTE</b>: This class pre-allocates a full array of length <code>maxSize+1</code>, in {@link #initialize}. * @lucene.internal 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
heap	TokenNameIdentifier	 heap
;	TokenNameSEMICOLON	
/** Determines the ordering of objects in this priority queue. Subclasses * must define this one method. * @return <code>true</code> iff parameter <tt>a</tt> is less than parameter <tt>b</tt>. */	TokenNameCOMMENT_JAVADOC	 Determines the ordering of objects in this priority queue. Subclasses must define this one method. @return <code>true</code> iff parameter <tt>a</tt> is less than parameter <tt>b</tt>. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method can be overridden by extending classes to return a sentinel * object which will be used by {@link #initialize(int)} to fill the queue, so * that the code which uses that queue can always assume it's full and only * change the top without attempting to insert any new object.<br> * * Those sentinel values should always compare worse than any non-sentinel * value (i.e., {@link #lessThan} should always favor the * non-sentinel values).<br> * * By default, this method returns false, which means the queue will not be * filled with sentinel values. Otherwise, the value returned will be used to * pre-populate the queue. Adds sentinel values to the queue.<br> * * If this method is extended to return a non-null value, then the following * usage pattern is recommended: * * <pre> * // extends getSentinelObject() to return a non-null value. * PriorityQueue<MyObject> pq = new MyQueue<MyObject>(numHits); * // save the 'top' element, which is guaranteed to not be null. * MyObject pqTop = pq.top(); * &lt;...&gt; * // now in order to add a new element, which is 'better' than top (after * // you've verified it is better), it is as simple as: * pqTop.change(). * pqTop = pq.updateTop(); * </pre> * * <b>NOTE:</b> if this method returns a non-null value, it will be called by * {@link #initialize(int)} {@link #size()} times, relying on a new object to * be returned and will not check if it's null again. Therefore you should * ensure any call to this method creates a new instance and behaves * consistently, e.g., it cannot return null if it previously returned * non-null. * * @return the sentinel object to use to pre-populate the queue, or null if * sentinel objects are not supported. */	TokenNameCOMMENT_JAVADOC	 This method can be overridden by extending classes to return a sentinel object which will be used by {@link #initialize(int)} to fill the queue, so that the code which uses that queue can always assume it's full and only change the top without attempting to insert any new object.<br> * Those sentinel values should always compare worse than any non-sentinel value (i.e., {@link #lessThan} should always favor the non-sentinel values).<br> * By default, this method returns false, which means the queue will not be filled with sentinel values. Otherwise, the value returned will be used to pre-populate the queue. Adds sentinel values to the queue.<br> * If this method is extended to return a non-null value, then the following usage pattern is recommended: * <pre> // extends getSentinelObject() to return a non-null value. PriorityQueue<MyObject> pq = new MyQueue<MyObject>(numHits); // save the 'top' element, which is guaranteed to not be null. MyObject pqTop = pq.top(); &lt;...&gt; // now in order to add a new element, which is 'better' than top (after // you've verified it is better), it is as simple as: pqTop.change(). pqTop = pq.updateTop(); </pre> * <b>NOTE:</b> if this method returns a non-null value, it will be called by {@link #initialize(int)} {@link #size()} times, relying on a new object to be returned and will not check if it's null again. Therefore you should ensure any call to this method creates a new instance and behaves consistently, e.g., it cannot return null if it previously returned non-null. * @return the sentinel object to use to pre-populate the queue, or null if sentinel objects are not supported. 
protected	TokenNameprotected	
T	TokenNameIdentifier	 T
getSentinelObject	TokenNameIdentifier	 get Sentinel Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Subclass constructors must call this. */	TokenNameCOMMENT_JAVADOC	 Subclass constructors must call this. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
heapSize	TokenNameIdentifier	 heap Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
// We allocate 1 extra to avoid if statement in top() 	TokenNameCOMMENT_LINE	We allocate 1 extra to avoid if statement in top() 
heapSize	TokenNameIdentifier	 heap Size
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxSize	TokenNameIdentifier	 max Size
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't wrap heapSize to -1, in this case, which 	TokenNameCOMMENT_LINE	Don't wrap heapSize to -1, in this case, which 
// causes a confusing NegativeArraySizeException. 	TokenNameCOMMENT_LINE	causes a confusing NegativeArraySizeException. 
// Note that very likely this will simply then hit 	TokenNameCOMMENT_LINE	Note that very likely this will simply then hit 
// an OOME, but at least that's more indicative to 	TokenNameCOMMENT_LINE	an OOME, but at least that's more indicative to 
// caller that this values is too big. We don't +1 	TokenNameCOMMENT_LINE	caller that this values is too big. We don't +1 
// in this case, but it's very unlikely in practice 	TokenNameCOMMENT_LINE	in this case, but it's very unlikely in practice 
// one will actually insert this many objects into 	TokenNameCOMMENT_LINE	one will actually insert this many objects into 
// the PQ: 	TokenNameCOMMENT_LINE	the PQ: 
heapSize	TokenNameIdentifier	 heap Size
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// NOTE: we add +1 because all access to heap is 	TokenNameCOMMENT_LINE	NOTE: we add +1 because all access to heap is 
// 1-based not 0-based. heap[0] is unused. 	TokenNameCOMMENT_LINE	1-based not 0-based. heap[0] is unused. 
heapSize	TokenNameIdentifier	 heap Size
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
heapSize	TokenNameIdentifier	 heap Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// T is unbounded type, so this unchecked cast works always 	TokenNameCOMMENT_LINE	T is unbounded type, so this unchecked cast works always 
this	TokenNamethis	
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
// If sentinel objects are supported, populate the queue with them 	TokenNameCOMMENT_LINE	If sentinel objects are supported, populate the queue with them 
T	TokenNameIdentifier	 T
sentinel	TokenNameIdentifier	 sentinel
=	TokenNameEQUAL	
getSentinelObject	TokenNameIdentifier	 get Sentinel Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sentinel	TokenNameIdentifier	 sentinel
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sentinel	TokenNameIdentifier	 sentinel
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
getSentinelObject	TokenNameIdentifier	 get Sentinel Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds an Object to a PriorityQueue in log(size) time. If one tries to add * more objects than maxSize from initialize an * {@link ArrayIndexOutOfBoundsException} is thrown. * * @return the new 'top' element in the queue. */	TokenNameCOMMENT_JAVADOC	 Adds an Object to a PriorityQueue in log(size) time. If one tries to add more objects than maxSize from initialize an {@link ArrayIndexOutOfBoundsException} is thrown. * @return the new 'top' element in the queue. 
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
element	TokenNameIdentifier	 element
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
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
upHeap	TokenNameIdentifier	 up Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an Object to a PriorityQueue in log(size) time. * It returns the object (if any) that was * dropped off the heap because it was full. This can be * the given parameter (in case it is smaller than the * full heap's minimum, and couldn't be added), or another * object that was previously the smallest value in the * heap and now has been replaced by a larger one, or null * if the queue wasn't yet full with maxSize elements. */	TokenNameCOMMENT_JAVADOC	 Adds an Object to a PriorityQueue in log(size) time. It returns the object (if any) that was dropped off the heap because it was full. This can be the given parameter (in case it is smaller than the full heap's minimum, and couldn't be added), or another object that was previously the smallest value in the heap and now has been replaced by a larger one, or null if the queue wasn't yet full with maxSize elements. 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the least element of the PriorityQueue in constant time. */	TokenNameCOMMENT_JAVADOC	 Returns the least element of the PriorityQueue in constant time. 
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We don't need to check size here: if maxSize is 0, 	TokenNameCOMMENT_LINE	We don't need to check size here: if maxSize is 0, 
// then heap is length 2 array with both entries null. 	TokenNameCOMMENT_LINE	then heap is length 2 array with both entries null. 
// If size is 0 then heap[1] is already null. 	TokenNameCOMMENT_LINE	If size is 0 then heap[1] is already null. 
return	TokenNamereturn	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Removes and returns the least element of the PriorityQueue in log(size) time. */	TokenNameCOMMENT_JAVADOC	 Removes and returns the least element of the PriorityQueue in log(size) time. 
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// save first value 	TokenNameCOMMENT_LINE	save first value 
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
// permit GC of objects 	TokenNameCOMMENT_LINE	permit GC of objects 
size	TokenNameIdentifier	 size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
downHeap	TokenNameIdentifier	 down Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// adjust heap 	TokenNameCOMMENT_LINE	adjust heap 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Should be called when the Object at top changes values. Still log(n) worst * case, but it's at least twice as fast to * * <pre> * pq.top().change(); * pq.updateTop(); * </pre> * * instead of * * <pre> * o = pq.pop(); * o.change(); * pq.push(o); * </pre> * * @return the new 'top' element. */	TokenNameCOMMENT_JAVADOC	 Should be called when the Object at top changes values. Still log(n) worst case, but it's at least twice as fast to * <pre> pq.top().change(); pq.updateTop(); </pre> * instead of * <pre> o = pq.pop(); o.change(); pq.push(o); </pre> * @return the new 'top' element. 
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
downHeap	TokenNameIdentifier	 down Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the number of elements currently stored in the PriorityQueue. */	TokenNameCOMMENT_JAVADOC	 Returns the number of elements currently stored in the PriorityQueue. 
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
/** Removes all entries from the PriorityQueue. */	TokenNameCOMMENT_JAVADOC	 Removes all entries from the PriorityQueue. 
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
T	TokenNameIdentifier	 T
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
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
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
T	TokenNameIdentifier	 T
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
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
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
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
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
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
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
}	TokenNameRBRACE	
/** This method returns the internal heap array as Object[]. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 This method returns the internal heap array as Object[]. @lucene.internal 
protected	TokenNameprotected	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHeapArray	TokenNameIdentifier	 get Heap Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
heap	TokenNameIdentifier	 heap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
