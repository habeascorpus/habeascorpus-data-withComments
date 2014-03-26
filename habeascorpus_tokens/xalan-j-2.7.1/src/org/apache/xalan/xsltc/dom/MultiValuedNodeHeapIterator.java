/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: UnionIterator.java 337874 2004-02-16 23:06:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: UnionIterator.java 337874 2004-02-16 23:06:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
DOM	TokenNameIdentifier	 DOM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
BasisLibrary	TokenNameIdentifier	 Basis Library
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
;	TokenNameSEMICOLON	
/** * <p><code>MultiValuedNodeHeapIterator</code> takes a set of multi-valued * heap nodes and produces a merged NodeSet in document order with duplicates * removed.</p> * <p>Each multi-valued heap node (which might be a * {@link org.apache.xml.dtm.DTMAxisIterator}, but that's not necessary) * generates DTM node handles in document order. The class * maintains the multi-valued heap nodes in a heap, not surprisingly, sorted by * the next DTM node handle available form the heap node.</p> * <p>After a DTM node is pulled from the heap node that's at the top of the * heap, the heap node is advanced to the next DTM node handle it makes * available, and the heap nature of the heap is restored to ensure the next * DTM node handle pulled is next in document order overall. * * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 <p><code>MultiValuedNodeHeapIterator</code> takes a set of multi-valued heap nodes and produces a merged NodeSet in document order with duplicates removed.</p> <p>Each multi-valued heap node (which might be a {@link org.apache.xml.dtm.DTMAxisIterator}, but that's not necessary) generates DTM node handles in document order. The class maintains the multi-valued heap nodes in a heap, not surprisingly, sorted by the next DTM node handle available form the heap node.</p> <p>After a DTM node is pulled from the heap node that's at the top of the heap, the heap node is advanced to the next DTM node handle it makes available, and the heap nature of the heap is restored to ensure the next DTM node handle pulled is next in document order overall. * @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MultiValuedNodeHeapIterator	TokenNameIdentifier	 Multi Valued Node Heap Iterator
extends	TokenNameextends	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
{	TokenNameLBRACE	
/** wrapper for NodeIterators to support iterator comparison on the value of their next() method */	TokenNameCOMMENT_JAVADOC	 wrapper for NodeIterators to support iterator comparison on the value of their next() method 
/** * An abstract representation of a set of nodes that will be retrieved in * document order. */	TokenNameCOMMENT_JAVADOC	 An abstract representation of a set of nodes that will be retrieved in document order. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
HeapNode	TokenNameIdentifier	 Heap Node
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
protected	TokenNameprotected	
int	TokenNameint	
_node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
_markedNode	TokenNameIdentifier	 marked Node
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
_isStartSet	TokenNameIdentifier	 is Start Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Advance to the next node represented by this {@link HeapNode} * * @return the next DTM node. */	TokenNameCOMMENT_JAVADOC	 Advance to the next node represented by this {@link HeapNode} * @return the next DTM node. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
step	TokenNameIdentifier	 step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a deep copy of this {@link HeapNode}. The clone is not * reset from the current position of the original. * * @return the cloned heap node */	TokenNameCOMMENT_JAVADOC	 Creates a deep copy of this {@link HeapNode}. The clone is not reset from the current position of the original. * @return the cloned heap node 
public	TokenNamepublic	
HeapNode	TokenNameIdentifier	 Heap Node
cloneHeapNode	TokenNameIdentifier	 clone Heap Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HeapNode	TokenNameIdentifier	 Heap Node
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HeapNode	TokenNameIdentifier	 Heap Node
)	TokenNameRPAREN	
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
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
runTimeError	TokenNameIdentifier	 run Time Error
(	TokenNameLPAREN	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
ITERATOR_CLONE_ERR	TokenNameIdentifier	 ITERATOR  CLONE  ERR
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_markedNode	TokenNameIdentifier	 marked Node
=	TokenNameEQUAL	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remembers the current node for the next call to {@link #gotoMark()}. */	TokenNameCOMMENT_JAVADOC	 Remembers the current node for the next call to {@link #gotoMark()}. 
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_markedNode	TokenNameIdentifier	 marked Node
=	TokenNameEQUAL	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Restores the current node remembered by {@link #setMark()}. */	TokenNameCOMMENT_JAVADOC	 Restores the current node remembered by {@link #setMark()}. 
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_markedNode	TokenNameIdentifier	 marked Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs a comparison of the two heap nodes * * @param heapNode the heap node against which to compare * @return <code>true</code> if and only if the current node for this * heap node is before the current node of the argument heap * node in document order. */	TokenNameCOMMENT_JAVADOC	 Performs a comparison of the two heap nodes * @param heapNode the heap node against which to compare @return <code>true</code> if and only if the current node for this heap node is before the current node of the argument heap node in document order. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isLessThan	TokenNameIdentifier	 is Less Than
(	TokenNameLPAREN	
HeapNode	TokenNameIdentifier	 Heap Node
heapNode	TokenNameIdentifier	 heap Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets context with respect to which this heap node is evaluated. * * @param node The new context node * @return a {@link HeapNode} which may or may not be the same as * this <code>HeapNode</code>. */	TokenNameCOMMENT_JAVADOC	 Sets context with respect to which this heap node is evaluated. * @param node The new context node @return a {@link HeapNode} which may or may not be the same as this <code>HeapNode</code>. 
public	TokenNamepublic	
abstract	TokenNameabstract	
HeapNode	TokenNameIdentifier	 Heap Node
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reset the heap node back to its beginning. * * @return a {@link HeapNode} which may or may not be the same as * this <code>HeapNode</code>. */	TokenNameCOMMENT_JAVADOC	 Reset the heap node back to its beginning. * @return a {@link HeapNode} which may or may not be the same as this <code>HeapNode</code>. 
public	TokenNamepublic	
abstract	TokenNameabstract	
HeapNode	TokenNameIdentifier	 Heap Node
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end of HeapNode 	TokenNameCOMMENT_LINE	end of HeapNode 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
InitSize	TokenNameIdentifier	 Init Size
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_heapSize	TokenNameIdentifier	 heap Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
InitSize	TokenNameIdentifier	 Init Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HeapNode	TokenNameIdentifier	 Heap Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
new	TokenNamenew	
HeapNode	TokenNameIdentifier	 Heap Node
[	TokenNameLBRACKET	
InitSize	TokenNameIdentifier	 Init Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_free	TokenNameIdentifier	 free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Last node returned by this MultiValuedNodeHeapIterator to the caller of 	TokenNameCOMMENT_LINE	Last node returned by this MultiValuedNodeHeapIterator to the caller of 
// next; used to prune duplicates 	TokenNameCOMMENT_LINE	next; used to prune duplicates 
private	TokenNameprivate	
int	TokenNameint	
_returnedLast	TokenNameIdentifier	 returned Last
;	TokenNameSEMICOLON	
// cached returned last for use in gotoMark 	TokenNameCOMMENT_LINE	cached returned last for use in gotoMark 
private	TokenNameprivate	
int	TokenNameint	
_cachedReturnedLast	TokenNameIdentifier	 cached Returned Last
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
// cached heap size for use in gotoMark 	TokenNameCOMMENT_LINE	cached heap size for use in gotoMark 
private	TokenNameprivate	
int	TokenNameint	
_cachedHeapSize	TokenNameIdentifier	 cached Heap Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
HeapNode	TokenNameIdentifier	 Heap Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
heapCopy	TokenNameIdentifier	 heap Copy
=	TokenNameEQUAL	
new	TokenNamenew	
HeapNode	TokenNameIdentifier	 Heap Node
[	TokenNameLBRACKET	
_heap	TokenNameIdentifier	 heap
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
MultiValuedNodeHeapIterator	TokenNameIdentifier	 Multi Valued Node Heap Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MultiValuedNodeHeapIterator	TokenNameIdentifier	 Multi Valued Node Heap Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
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
_free	TokenNameIdentifier	 free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heapCopy	TokenNameIdentifier	 heap Copy
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
cloneHeapNode	TokenNameIdentifier	 clone Heap Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
heapCopy	TokenNameIdentifier	 heap Copy
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
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
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
runTimeError	TokenNameIdentifier	 run Time Error
(	TokenNameLPAREN	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
ITERATOR_CLONE_ERR	TokenNameIdentifier	 ITERATOR  CLONE  ERR
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
addHeapNode	TokenNameIdentifier	 add Heap Node
(	TokenNameLPAREN	
HeapNode	TokenNameIdentifier	 Heap Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_free	TokenNameIdentifier	 free
==	TokenNameEQUAL_EQUAL	
_size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HeapNode	TokenNameIdentifier	 Heap Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
HeapNode	TokenNameIdentifier	 Heap Node
[	TokenNameLBRACKET	
_size	TokenNameIdentifier	 size
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
_heap	TokenNameIdentifier	 heap
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
_free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_heapSize	TokenNameIdentifier	 heap Size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
_free	TokenNameIdentifier	 free
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
_heapSize	TokenNameIdentifier	 heap Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
smallest	TokenNameIdentifier	 smallest
=	TokenNameEQUAL	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smallest	TokenNameIdentifier	 smallest
==	TokenNameEQUAL_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// iterator _heap[0] is done 	TokenNameCOMMENT_LINE	iterator _heap[0] is done 
if	TokenNameif	
(	TokenNameLPAREN	
_heapSize	TokenNameIdentifier	 heap Size
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Swap first and last (iterator must be restartable) 	TokenNameCOMMENT_LINE	Swap first and last (iterator must be restartable) 
final	TokenNamefinal	
HeapNode	TokenNameIdentifier	 Heap Node
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
_heapSize	TokenNameIdentifier	 heap Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
_heapSize	TokenNameIdentifier	 heap Size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
smallest	TokenNameIdentifier	 smallest
==	TokenNameEQUAL_EQUAL	
_returnedLast	TokenNameIdentifier	 returned Last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// duplicate 	TokenNameCOMMENT_LINE	duplicate 
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
step	TokenNameIdentifier	 step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// value consumed 	TokenNameCOMMENT_LINE	value consumed 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
step	TokenNameIdentifier	 step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// value consumed 	TokenNameCOMMENT_LINE	value consumed 
heapify	TokenNameIdentifier	 heapify
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
_returnedLast	TokenNameIdentifier	 returned Last
=	TokenNameEQUAL	
smallest	TokenNameIdentifier	 smallest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fallthrough if not returned above 	TokenNameCOMMENT_LINE	fallthrough if not returned above 
heapify	TokenNameIdentifier	 heapify
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
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
_free	TokenNameIdentifier	 free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
_isStartSet	TokenNameIdentifier	 is Start Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
step	TokenNameIdentifier	 step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to get the first node 	TokenNameCOMMENT_LINE	to get the first node 
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
_isStartSet	TokenNameIdentifier	 is Start Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// build heap 	TokenNameCOMMENT_LINE	build heap 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_heapSize	TokenNameIdentifier	 heap Size
=	TokenNameEQUAL	
_free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heapify	TokenNameIdentifier	 heapify
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_returnedLast	TokenNameIdentifier	 returned Last
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
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
<	TokenNameLESS	
_free	TokenNameIdentifier	 free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_heapSize	TokenNameIdentifier	 heap Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_free	TokenNameIdentifier	 free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Build a heap in document order. put the smallest node on the top. * "smallest node" means the node before other nodes in document order */	TokenNameCOMMENT_BLOCK	 Build a heap in document order. put the smallest node on the top. "smallest node" means the node before other nodes in document order 
private	TokenNameprivate	
void	TokenNamevoid	
heapify	TokenNameIdentifier	 heapify
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
smallest	TokenNameIdentifier	 smallest
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
smallest	TokenNameIdentifier	 smallest
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
<	TokenNameLESS	
_heapSize	TokenNameIdentifier	 heap Size
&&	TokenNameAND_AND	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
]	TokenNameRBRACKET	
.	TokenNameDOT	
isLessThan	TokenNameIdentifier	 is Less Than
(	TokenNameLPAREN	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<	TokenNameLESS	
_heapSize	TokenNameIdentifier	 heap Size
&&	TokenNameAND_AND	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
]	TokenNameRBRACKET	
.	TokenNameDOT	
isLessThan	TokenNameIdentifier	 is Less Than
(	TokenNameLPAREN	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
smallest	TokenNameIdentifier	 smallest
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
smallest	TokenNameIdentifier	 smallest
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
smallest	TokenNameIdentifier	 smallest
!=	TokenNameNOT_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
HeapNode	TokenNameIdentifier	 Heap Node
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
smallest	TokenNameIdentifier	 smallest
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
smallest	TokenNameIdentifier	 smallest
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
smallest	TokenNameIdentifier	 smallest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
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
<	TokenNameLESS	
_free	TokenNameIdentifier	 free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_cachedReturnedLast	TokenNameIdentifier	 cached Returned Last
=	TokenNameEQUAL	
_returnedLast	TokenNameIdentifier	 returned Last
;	TokenNameSEMICOLON	
_cachedHeapSize	TokenNameIdentifier	 cached Heap Size
=	TokenNameEQUAL	
_heapSize	TokenNameIdentifier	 heap Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
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
<	TokenNameLESS	
_free	TokenNameIdentifier	 free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// rebuild heap after call last() function. fix for bug 20913 	TokenNameCOMMENT_LINE	rebuild heap after call last() function. fix for bug 20913 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_heapSize	TokenNameIdentifier	 heap Size
=	TokenNameEQUAL	
_cachedHeapSize	TokenNameIdentifier	 cached Heap Size
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heapify	TokenNameIdentifier	 heapify
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_returnedLast	TokenNameIdentifier	 returned Last
=	TokenNameEQUAL	
_cachedReturnedLast	TokenNameIdentifier	 cached Returned Last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
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
<	TokenNameLESS	
_free	TokenNameIdentifier	 free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
step	TokenNameIdentifier	 step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// build heap 	TokenNameCOMMENT_LINE	build heap 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_heapSize	TokenNameIdentifier	 heap Size
=	TokenNameEQUAL	
_free	TokenNameIdentifier	 free
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heapify	TokenNameIdentifier	 heapify
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_returnedLast	TokenNameIdentifier	 returned Last
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
