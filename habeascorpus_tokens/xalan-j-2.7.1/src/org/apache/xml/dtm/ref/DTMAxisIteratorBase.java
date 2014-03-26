/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMAxisIteratorBase.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMAxisIteratorBase.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
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
/** * This class serves as a default base for implementations of mutable * DTMAxisIterators. */	TokenNameCOMMENT_JAVADOC	 This class serves as a default base for implementations of mutable DTMAxisIterators. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
implements	TokenNameimplements	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
{	TokenNameLBRACE	
/** The position of the last node within the iteration, as defined by XPath. * Note that this is _not_ the node's handle within the DTM. Also, don't * confuse it with the current (most recently returned) position. */	TokenNameCOMMENT_JAVADOC	 The position of the last node within the iteration, as defined by XPath. Note that this is _not_ the node's handle within the DTM. Also, don't confuse it with the current (most recently returned) position. 
protected	TokenNameprotected	
int	TokenNameint	
_last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The position of the current node within the iteration, as defined by XPath. * Note that this is _not_ the node's handle within the DTM! */	TokenNameCOMMENT_JAVADOC	 The position of the current node within the iteration, as defined by XPath. Note that this is _not_ the node's handle within the DTM! 
protected	TokenNameprotected	
int	TokenNameint	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The position of the marked node within the iteration; * a saved itaration state that we may want to come back to. * Note that only one mark is maintained; there is no stack. */	TokenNameCOMMENT_JAVADOC	 The position of the marked node within the iteration; a saved itaration state that we may want to come back to. Note that only one mark is maintained; there is no stack. 
protected	TokenNameprotected	
int	TokenNameint	
_markedNode	TokenNameIdentifier	 marked Node
;	TokenNameSEMICOLON	
/** The handle to the start, or root, of the iteration. * Set this to END to construct an empty iterator. */	TokenNameCOMMENT_JAVADOC	 The handle to the start, or root, of the iteration. Set this to END to construct an empty iterator. 
protected	TokenNameprotected	
int	TokenNameint	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
/** True if the start node should be considered part of the iteration. * False will cause it to be skipped. */	TokenNameCOMMENT_JAVADOC	 True if the start node should be considered part of the iteration. False will cause it to be skipped. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
_includeSelf	TokenNameIdentifier	 include Self
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** True if this iteration can be restarted. False otherwise (eg, if * we are iterating over a stream that can not be re-scanned, or if * the iterator was produced by cloning another iterator.) */	TokenNameCOMMENT_JAVADOC	 True if this iteration can be restarted. False otherwise (eg, if we are iterating over a stream that can not be re-scanned, or if the iterator was produced by cloning another iterator.) 
protected	TokenNameprotected	
boolean	TokenNameboolean	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Get start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @return The root node of the iteration. */	TokenNameCOMMENT_JAVADOC	 Get start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @return The root node of the iteration. 
public	TokenNamepublic	
int	TokenNameint	
getStartNode	TokenNameIdentifier	 get Start Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return A DTMAxisIterator which has been reset to the start node, * which may or may not be the same as this iterator. * */	TokenNameCOMMENT_JAVADOC	 @return A DTMAxisIterator which has been reset to the start node, which may or may not be the same as this iterator. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
_isRestartable	TokenNameIdentifier	 is Restartable
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the flag to include the start node in the iteration. * * * @return This default method returns just returns this DTMAxisIterator, * after setting the flag. * (Returning "this" permits C++-style chaining of * method calls into a single expression.) */	TokenNameCOMMENT_JAVADOC	 Set the flag to include the start node in the iteration. * @return This default method returns just returns this DTMAxisIterator, after setting the flag. (Returning "this" permits C++-style chaining of method calls into a single expression.) 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
includeSelf	TokenNameIdentifier	 include Self
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_includeSelf	TokenNameIdentifier	 include Self
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the position of the last node within the iteration, as * defined by XPath. In a forward iterator, I believe this equals the number of nodes which this * iterator will yield. In a reverse iterator, I believe it should return * 1 (since the "last" is the first produced.) * * This may be an expensive operation when called the first time, since * it may have to iterate through a large part of the document to produce * its answer. * * @return The number of nodes in this iterator (forward) or 1 (reverse). */	TokenNameCOMMENT_JAVADOC	 Returns the position of the last node within the iteration, as defined by XPath. In a forward iterator, I believe this equals the number of nodes which this iterator will yield. In a reverse iterator, I believe it should return 1 (since the "last" is the first produced.) * This may be an expensive operation when called the first time, since it may have to iterate through a large part of the document to produce its answer. * @return The number of nodes in this iterator (forward) or 1 (reverse). 
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// Not previously established 	TokenNameCOMMENT_LINE	Not previously established 
{	TokenNameLBRACE	
// Note that we're doing both setMark() -- which saves _currentChild 	TokenNameCOMMENT_LINE	Note that we're doing both setMark() -- which saves _currentChild 
// -- and explicitly saving our position counter (number of nodes 	TokenNameCOMMENT_LINE	-- and explicitly saving our position counter (number of nodes 
// yielded so far). 	TokenNameCOMMENT_LINE	yielded so far). 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% Should position also be saved by setMark()? 	TokenNameCOMMENT_LINE	%REVIEW% Should position also be saved by setMark()? 
// (It wasn't in the XSLTC version, but I don't understand why not.) 	TokenNameCOMMENT_LINE	(It wasn't in the XSLTC version, but I don't understand why not.) 
final	TokenNamefinal	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
// Save state 	TokenNameCOMMENT_LINE	Save state 
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Count the nodes found by this iterator 	TokenNameCOMMENT_LINE	Count the nodes found by this iterator 
do	TokenNamedo	
{	TokenNameLBRACE	
_last	TokenNameIdentifier	 last
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Restore saved state 	TokenNameCOMMENT_LINE	Restore saved state 
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The position of the current node within the set, as defined by * XPath. Note that this is one-based, not zero-based. */	TokenNameCOMMENT_JAVADOC	 @return The position of the current node within the set, as defined by XPath. Note that this is one-based, not zero-based. 
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if this iterator has a reversed axis, else false */	TokenNameCOMMENT_JAVADOC	 @return true if this iterator has a reversed axis, else false 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a deep copy of this iterator. Cloned iterators may not be * restartable. The iterator being cloned may or may not become * non-restartable as a side effect of this operation. * * @return a deep copy of this iterator. */	TokenNameCOMMENT_JAVADOC	 Returns a deep copy of this iterator. Cloned iterators may not be restartable. The iterator being cloned may or may not become non-restartable as a side effect of this operation. * @return a deep copy of this iterator. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// return clone.reset(); 	TokenNameCOMMENT_LINE	return clone.reset(); 
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Do any final cleanup that is required before returning the node that was * passed in, and then return it. The intended use is * <br /> * <code>return returnNode(node);</code> * * %REVIEW% If we're calling it purely for side effects, should we really * be bothering with a return value? Something like * <br /> * <code> accept(node); return node; </code> * <br /> * would probably optimize just about as well and avoid questions * about whether what's returned could ever be different from what's * passed in. * * @param node Node handle which iteration is about to yield. * * @return The node handle passed in. */	TokenNameCOMMENT_JAVADOC	 Do any final cleanup that is required before returning the node that was passed in, and then return it. The intended use is <br /> <code>return returnNode(node);</code> * %REVIEW% If we're calling it purely for side effects, should we really be bothering with a return value? Something like <br /> <code> accept(node); return node; </code> <br /> would probably optimize just about as well and avoid questions about whether what's returned could ever be different from what's passed in. * @param node Node handle which iteration is about to yield. * @return The node handle passed in. 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the position to zero. NOTE that this does not change the iteration * state, only the position number associated with that state. * * %REVIEW% Document when this would be used? * * @return This instance. */	TokenNameCOMMENT_JAVADOC	 Reset the position to zero. NOTE that this does not change the iteration state, only the position number associated with that state. * %REVIEW% Document when this would be used? * @return This instance. 
protected	TokenNameprotected	
final	TokenNamefinal	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if all the nodes in the iteration well be returned in document * order. * * @return true as a default. */	TokenNameCOMMENT_JAVADOC	 Returns true if all the nodes in the iteration well be returned in document order. * @return true as a default. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the axis being iterated, if it is known. * * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple * types. */	TokenNameCOMMENT_JAVADOC	 Returns the axis being iterated, if it is known. * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple types. 
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
isRestartable	TokenNameIdentifier	 is Restartable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node at the given position. * * @param position The position * @return The node at the given position. */	TokenNameCOMMENT_JAVADOC	 Return the node at the given position. * @param position The position @return The node at the given position. 
public	TokenNamepublic	
int	TokenNameint	
getNodeByPosition	TokenNameIdentifier	 get Node By Position
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
