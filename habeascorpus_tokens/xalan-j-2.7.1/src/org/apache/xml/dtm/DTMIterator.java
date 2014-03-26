/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMIterator.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMIterator.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
/** * <code>DTMIterators</code> are used to step through a (possibly * filtered) set of nodes. Their API is modeled largely after the DOM * NodeIterator. * * <p>A DTMIterator is a somewhat unusual type of iterator, in that it * can serve both single node iteration and random access.</p> * * <p>The DTMIterator's traversal semantics, i.e. how it walks the tree, * are specified when it is created, possibly and probably by an XPath * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>.</p> * * <p>A DTMIterator is meant to be created once as a master static object, and * then cloned many times for runtime use. Or the master object itself may * be used for simpler use cases.</p> * * <p>At this time, we do not expect DTMIterator to emulate * NodeIterator's "maintain relative position" semantics under * document mutation. It's likely to respond more like the * TreeWalker's "current node" semantics. However, since the base DTM * is immutable, this issue currently makes no practical * difference.</p> * * <p>State: In progress!!</p> */	TokenNameCOMMENT_JAVADOC	 <code>DTMIterators</code> are used to step through a (possibly filtered) set of nodes. Their API is modeled largely after the DOM NodeIterator. * <p>A DTMIterator is a somewhat unusual type of iterator, in that it can serve both single node iteration and random access.</p> * <p>The DTMIterator's traversal semantics, i.e. how it walks the tree, are specified when it is created, possibly and probably by an XPath <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>.</p> * <p>A DTMIterator is meant to be created once as a master static object, and then cloned many times for runtime use. Or the master object itself may be used for simpler use cases.</p> * <p>At this time, we do not expect DTMIterator to emulate NodeIterator's "maintain relative position" semantics under document mutation. It's likely to respond more like the TreeWalker's "current node" semantics. However, since the base DTM is immutable, this issue currently makes no practical difference.</p> * <p>State: In progress!!</p> 
public	TokenNamepublic	
interface	TokenNameinterface	
DTMIterator	TokenNameIdentifier	 DTM Iterator
{	TokenNameLBRACE	
// Constants returned by acceptNode, borrowed from the DOM Traversal chapter 	TokenNameCOMMENT_LINE	Constants returned by acceptNode, borrowed from the DOM Traversal chapter 
// %REVIEW% Should we explicitly initialize them from, eg, 	TokenNameCOMMENT_LINE	%REVIEW% Should we explicitly initialize them from, eg, 
// org.w3c.dom.traversal.NodeFilter.FILTER_ACCEPT? 	TokenNameCOMMENT_LINE	org.w3c.dom.traversal.NodeFilter.FILTER_ACCEPT? 
/** * Accept the node. */	TokenNameCOMMENT_JAVADOC	 Accept the node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Reject the node. Same behavior as FILTER_SKIP. (In the DOM these * differ when applied to a TreeWalker but have the same result when * applied to a NodeIterator). */	TokenNameCOMMENT_JAVADOC	 Reject the node. Same behavior as FILTER_SKIP. (In the DOM these differ when applied to a TreeWalker but have the same result when applied to a NodeIterator). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FILTER_REJECT	TokenNameIdentifier	 FILTER  REJECT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Skip this single node. */	TokenNameCOMMENT_JAVADOC	 Skip this single node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Get an instance of a DTM that "owns" a node handle. Since a node * iterator may be passed without a DTMManager, this allows the * caller to easily get the DTM using just the iterator. * * @param nodeHandle the nodeHandle. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM that "owns" a node handle. Since a node iterator may be passed without a DTMManager, this allows the caller to easily get the DTM using just the iterator. * @param nodeHandle the nodeHandle. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get an instance of the DTMManager. Since a node * iterator may be passed without a DTMManager, this allows the * caller to easily get the DTMManager using just the iterator. * * @return a non-null DTMManager reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of the DTMManager. Since a node iterator may be passed without a DTMManager, this allows the caller to easily get the DTMManager using just the iterator. * @return a non-null DTMManager reference. 
public	TokenNamepublic	
DTMManager	TokenNameIdentifier	 DTM Manager
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The root node of the <code>DTMIterator</code>, as specified when it * was created. Note the root node is not the root node of the * document tree, but the context node from where the iteration * begins and ends. * * @return nodeHandle int Handle of the context node. */	TokenNameCOMMENT_JAVADOC	 The root node of the <code>DTMIterator</code>, as specified when it was created. Note the root node is not the root node of the document tree, but the context node from where the iteration begins and ends. * @return nodeHandle int Handle of the context node. 
public	TokenNamepublic	
int	TokenNameint	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reset the root node of the <code>DTMIterator</code>, overriding * the value specified when it was created. Note the root node is * not the root node of the document tree, but the context node from * where the iteration begins. * * @param nodeHandle int Handle of the context node. * @param environment The environment object. * The environment in which this iterator operates, which should provide: * <ul> * <li>a node (the context node... same value as "root" defined below) </li> * <li>a pair of non-zero positive integers (the context position and the context size) </li> * <li>a set of variable bindings </li> * <li>a function library </li> * <li>the set of namespace declarations in scope for the expression.</li> * <ul> * * <p>At this time the exact implementation of this environment is application * dependent. Probably a proper interface will be created fairly soon.</p> * */	TokenNameCOMMENT_JAVADOC	 Reset the root node of the <code>DTMIterator</code>, overriding the value specified when it was created. Note the root node is not the root node of the document tree, but the context node from where the iteration begins. * @param nodeHandle int Handle of the context node. @param environment The environment object. The environment in which this iterator operates, which should provide: <ul> <li>a node (the context node... same value as "root" defined below) </li> <li>a pair of non-zero positive integers (the context position and the context size) </li> <li>a set of variable bindings </li> <li>a function library </li> <li>the set of namespace declarations in scope for the expression.</li> <ul> * <p>At this time the exact implementation of this environment is application dependent. Probably a proper interface will be created fairly soon.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reset the iterator to the start. After resetting, the next node returned * will be the root node -- or, if that's filtered out, the first node * within the root's subtree which is _not_ skipped by the filters. */	TokenNameCOMMENT_JAVADOC	 Reset the iterator to the start. After resetting, the next node returned will be the root node -- or, if that's filtered out, the first node within the root's subtree which is _not_ skipped by the filters. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This attribute determines which node types are presented via the * iterator. The available set of constants is defined above. * Nodes not accepted by * <code>whatToShow</code> will be skipped, but their children may still * be considered. * * @return one of the SHOW_XXX constants, or several ORed together. */	TokenNameCOMMENT_JAVADOC	 This attribute determines which node types are presented via the iterator. The available set of constants is defined above. Nodes not accepted by <code>whatToShow</code> will be skipped, but their children may still be considered. * @return one of the SHOW_XXX constants, or several ORed together. 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <p>The value of this flag determines whether the children of entity * reference nodes are visible to the iterator. If false, they and * their descendants will be rejected. Note that this rejection takes * precedence over <code>whatToShow</code> and the filter. </p> * * <p> To produce a view of the document that has entity references * expanded and does not expose the entity reference node itself, use * the <code>whatToShow</code> flags to hide the entity reference node * and set <code>expandEntityReferences</code> to true when creating the * iterator. To produce a view of the document that has entity reference * nodes but no entity expansion, use the <code>whatToShow</code> flags * to show the entity reference node and set * <code>expandEntityReferences</code> to false.</p> * * <p>NOTE: In Xalan's use of DTM we will generally have fully expanded * entity references when the document tree was built, and thus this * flag will have no effect.</p> * * @return true if entity references will be expanded. */	TokenNameCOMMENT_JAVADOC	 <p>The value of this flag determines whether the children of entity reference nodes are visible to the iterator. If false, they and their descendants will be rejected. Note that this rejection takes precedence over <code>whatToShow</code> and the filter. </p> * <p> To produce a view of the document that has entity references expanded and does not expose the entity reference node itself, use the <code>whatToShow</code> flags to hide the entity reference node and set <code>expandEntityReferences</code> to true when creating the iterator. To produce a view of the document that has entity reference nodes but no entity expansion, use the <code>whatToShow</code> flags to show the entity reference node and set <code>expandEntityReferences</code> to false.</p> * <p>NOTE: In Xalan's use of DTM we will generally have fully expanded entity references when the document tree was built, and thus this flag will have no effect.</p> * @return true if entity references will be expanded. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the next node in the set and advances the position of the * iterator in the set. After a <code>DTMIterator</code> has setRoot called, * the first call to <code>nextNode()</code> returns that root or (if it * is rejected by the filters) the first node within its subtree which is * not filtered out. * @return The next node handle in the set being iterated over, or * <code>DTM.NULL</code> if there are no more members in that set. */	TokenNameCOMMENT_JAVADOC	 Returns the next node in the set and advances the position of the iterator in the set. After a <code>DTMIterator</code> has setRoot called, the first call to <code>nextNode()</code> returns that root or (if it is rejected by the filters) the first node within its subtree which is not filtered out. @return The next node handle in the set being iterated over, or <code>DTM.NULL</code> if there are no more members in that set. 
public	TokenNamepublic	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the previous node in the set and moves the position of the * <code>DTMIterator</code> backwards in the set. * @return The previous node handle in the set being iterated over, * or <code>DTM.NULL</code> if there are no more members in that set. */	TokenNameCOMMENT_JAVADOC	 Returns the previous node in the set and moves the position of the <code>DTMIterator</code> backwards in the set. @return The previous node handle in the set being iterated over, or <code>DTM.NULL</code> if there are no more members in that set. 
public	TokenNamepublic	
int	TokenNameint	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Detaches the <code>DTMIterator</code> from the set which it iterated * over, releasing any computational resources and placing the iterator * in the INVALID state. After <code>detach</code> has been invoked, * calls to <code>nextNode</code> or <code>previousNode</code> will * raise a runtime exception. */	TokenNameCOMMENT_JAVADOC	 Detaches the <code>DTMIterator</code> from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. After <code>detach</code> has been invoked, calls to <code>nextNode</code> or <code>previousNode</code> will raise a runtime exception. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Specify if it's OK for detach to release the iterator for reuse. * * @param allowRelease true if it is OK for detach to release this iterator * for pooling. */	TokenNameCOMMENT_JAVADOC	 Specify if it's OK for detach to release the iterator for reuse. * @param allowRelease true if it is OK for detach to release this iterator for pooling. 
public	TokenNamepublic	
void	TokenNamevoid	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowRelease	TokenNameIdentifier	 allow Release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current node in the iterator. Note that this differs from * the DOM's NodeIterator, where the current position lies between two * nodes (as part of the maintain-relative-position semantic). * * @return The current node handle, or -1. */	TokenNameCOMMENT_JAVADOC	 Get the current node in the iterator. Note that this differs from the DOM's NodeIterator, where the current position lies between two nodes (as part of the maintain-relative-position semantic). * @return The current node handle, or -1. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tells if this NodeSetDTM is "fresh", in other words, if * the first nextNode() that is called will return the * first node in the set. * * @return true if the iteration of this list has not yet begun. */	TokenNameCOMMENT_JAVADOC	 Tells if this NodeSetDTM is "fresh", in other words, if the first nextNode() that is called will return the first node in the set. * @return true if the iteration of this list has not yet begun. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFresh	TokenNameIdentifier	 is Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//========= Random Access ========== 	TokenNameCOMMENT_LINE	========= Random Access ========== 
/** * If setShouldCacheNodes(true) is called, then nodes will * be cached, enabling random access, and giving the ability to do * sorts and the like. They are not cached by default. * * %REVIEW% Shouldn't the other random-access methods throw an exception * if they're called on a DTMIterator with this flag set false? * * @param b true if the nodes should be cached. */	TokenNameCOMMENT_JAVADOC	 If setShouldCacheNodes(true) is called, then nodes will be cached, enabling random access, and giving the ability to do sorts and the like. They are not cached by default. * %REVIEW% Shouldn't the other random-access methods throw an exception if they're called on a DTMIterator with this flag set false? * @param b true if the nodes should be cached. 
public	TokenNamepublic	
void	TokenNamevoid	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tells if this iterator can have nodes added to it or set via * the <code>setItem(int node, int index)</code> method. * * @return True if the nodelist can be mutated. */	TokenNameCOMMENT_JAVADOC	 Tells if this iterator can have nodes added to it or set via the <code>setItem(int node, int index)</code> method. * @return True if the nodelist can be mutated. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isMutable	TokenNameIdentifier	 is Mutable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the current position within the cached list, which is one * less than the next nextNode() call will retrieve. i.e. if you * call getCurrentPos() and the return is 0, the next fetch will * take place at index 1. * * @return The position of the iteration. */	TokenNameCOMMENT_JAVADOC	 Get the current position within the cached list, which is one less than the next nextNode() call will retrieve. i.e. if you call getCurrentPos() and the return is 0, the next fetch will take place at index 1. * @return The position of the iteration. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If an index is requested, NodeSetDTM will call this method * to run the iterator to the index. By default this sets * m_next to the index. If the index argument is -1, this * signals that the iterator should be run to the end and * completely fill the cache. * * @param index The index to run to, or -1 if the iterator should be run * to the end. */	TokenNameCOMMENT_JAVADOC	 If an index is requested, NodeSetDTM will call this method to run the iterator to the index. By default this sets m_next to the index. If the index argument is -1, this signals that the iterator should be run to the end and completely fill the cache. * @param index The index to run to, or -1 if the iterator should be run to the end. 
public	TokenNamepublic	
void	TokenNamevoid	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the current position in the node set. * * @param i Must be a valid index. */	TokenNameCOMMENT_JAVADOC	 Set the current position in the node set. * @param i Must be a valid index. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the <code>node handle</code> of an item in the collection. If * <code>index</code> is greater than or equal to the number of nodes in * the list, this returns <code>null</code>. * * @param index of the item. * @return The node handle at the <code>index</code>th position in the * <code>DTMIterator</code>, or <code>-1</code> if that is not a valid * index. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>node handle</code> of an item in the collection. If <code>index</code> is greater than or equal to the number of nodes in the list, this returns <code>null</code>. * @param index of the item. @return The node handle at the <code>index</code>th position in the <code>DTMIterator</code>, or <code>-1</code> if that is not a valid index. 
public	TokenNamepublic	
int	TokenNameint	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the node at the specified index of this vector to be the * specified node. The previous component at that position is discarded. * * <p>The index must be a value greater than or equal to 0 and less * than the current size of the vector. * The iterator must be in cached mode.</p> * * <p>Meant to be used for sorted iterators.</p> * * @param node Node to set * @param index Index of where to set the node */	TokenNameCOMMENT_JAVADOC	 Sets the node at the specified index of this vector to be the specified node. The previous component at that position is discarded. * <p>The index must be a value greater than or equal to 0 and less than the current size of the vector. The iterator must be in cached mode.</p> * <p>Meant to be used for sorted iterators.</p> * @param node Node to set @param index Index of where to set the node 
public	TokenNamepublic	
void	TokenNamevoid	
setItem	TokenNameIdentifier	 set Item
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The number of nodes in the list. The range of valid child node indices * is 0 to <code>length-1</code> inclusive. Note that this requires running * the iterator to completion, and presumably filling the cache. * * @return The number of nodes in the list. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in the list. The range of valid child node indices is 0 to <code>length-1</code> inclusive. Note that this requires running the iterator to completion, and presumably filling the cache. * @return The number of nodes in the list. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//=========== Cloning operations. ============ 	TokenNameCOMMENT_LINE	=========== Cloning operations. ============ 
/** * Get a cloned Iterator that is reset to the start of the iteration. * * @return A clone of this iteration that has been reset. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned Iterator that is reset to the start of the iteration. * @return A clone of this iteration that has been reset. * @throws CloneNotSupportedException 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
;	TokenNameSEMICOLON	
/** * Get a clone of this iterator, but don't reset the iteration in the * process, so that it may be used from the current position. * * @return A clone of this object. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a clone of this iterator, but don't reset the iteration in the process, so that it may be used from the current position. * @return A clone of this object. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
;	TokenNameSEMICOLON	
/** * Returns true if all the nodes in the iteration well be returned in document * order. * * @return true if all the nodes in the iteration well be returned in document * order. */	TokenNameCOMMENT_JAVADOC	 Returns true if all the nodes in the iteration well be returned in document order. * @return true if all the nodes in the iteration well be returned in document order. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the axis being iterated, if it is known. * * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple * types. */	TokenNameCOMMENT_JAVADOC	 Returns the axis being iterated, if it is known. * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple types. 
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
