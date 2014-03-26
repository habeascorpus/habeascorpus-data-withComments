/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeSet.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeSet.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
ContextNodeList	TokenNameIdentifier	 Context Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeFilter	TokenNameIdentifier	 Node Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * <p>The NodeSet class can act as either a NodeVector, * NodeList, or NodeIterator. However, in order for it to * act as a NodeVector or NodeList, it's required that * setShouldCacheNodes(true) be called before the first * nextNode() is called, in order that nodes can be added * as they are fetched. Derived classes that implement iterators * must override runTo(int index), in order that they may * run the iteration to the given index. </p> * * <p>Note that we directly implement the DOM's NodeIterator * interface. We do not emulate all the behavior of the * standard NodeIterator. In particular, we do not guarantee * to present a "live view" of the document ... but in XSLT, * the source document should never be mutated, so this should * never be an issue.</p> * * <p>Thought: Should NodeSet really implement NodeList and NodeIterator, * or should there be specific subclasses of it which do so? The * advantage of doing it all here is that all NodeSets will respond * to the same calls; the disadvantage is that some of them may return * less-than-enlightening results when you do so.</p> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 <p>The NodeSet class can act as either a NodeVector, NodeList, or NodeIterator. However, in order for it to act as a NodeVector or NodeList, it's required that setShouldCacheNodes(true) be called before the first nextNode() is called, in order that nodes can be added as they are fetched. Derived classes that implement iterators must override runTo(int index), in order that they may run the iteration to the given index. </p> * <p>Note that we directly implement the DOM's NodeIterator interface. We do not emulate all the behavior of the standard NodeIterator. In particular, we do not guarantee to present a "live view" of the document ... but in XSLT, the source document should never be mutated, so this should never be an issue.</p> * <p>Thought: Should NodeSet really implement NodeList and NodeIterator, or should there be specific subclasses of it which do so? The advantage of doing it all here is that all NodeSets will respond to the same calls; the disadvantage is that some of them may return less-than-enlightening results when you do so.</p> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
NodeSet	TokenNameIdentifier	 Node Set
implements	TokenNameimplements	
NodeList	TokenNameIdentifier	 Node List
,	TokenNameCOMMA	
NodeIterator	TokenNameIdentifier	 Node Iterator
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
ContextNodeList	TokenNameIdentifier	 Context Node List
{	TokenNameLBRACE	
/** * Create an empty nodelist. */	TokenNameCOMMENT_JAVADOC	 Create an empty nodelist. 
public	TokenNamepublic	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an empty, using the given block size. * * @param blocksize Size of blocks to allocate */	TokenNameCOMMENT_JAVADOC	 Create an empty, using the given block size. * @param blocksize Size of blocks to allocate 
public	TokenNamepublic	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
blocksize	TokenNameIdentifier	 blocksize
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a NodeSet, and copy the members of the * given nodelist into it. * * @param nodelist List of Nodes to be made members of the new set. */	TokenNameCOMMENT_JAVADOC	 Create a NodeSet, and copy the members of the given nodelist into it. * @param nodelist List of Nodes to be made members of the new set. 
public	TokenNamepublic	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a NodeSet, and copy the members of the * given NodeSet into it. * * @param nodelist Set of Nodes to be made members of the new set. */	TokenNameCOMMENT_JAVADOC	 Create a NodeSet, and copy the members of the given NodeSet into it. * @param nodelist Set of Nodes to be made members of the new set. 
public	TokenNamepublic	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
NodeSet	TokenNameIdentifier	 Node Set
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeIterator	TokenNameIdentifier	 Node Iterator
)	TokenNameRPAREN	
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a NodeSet, and copy the members of the * given NodeIterator into it. * * @param ni Iterator which yields Nodes to be made members of the new set. */	TokenNameCOMMENT_JAVADOC	 Create a NodeSet, and copy the members of the given NodeIterator into it. * @param ni Iterator which yields Nodes to be made members of the new set. 
public	TokenNamepublic	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
NodeIterator	TokenNameIdentifier	 Node Iterator
ni	TokenNameIdentifier	 ni
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a NodeSet which contains the given Node. * * @param node Single node to be added to the new set. */	TokenNameCOMMENT_JAVADOC	 Create a NodeSet which contains the given Node. * @param node Single node to be added to the new set. 
public	TokenNamepublic	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The root node of the Iterator, as specified when it was created. * For non-Iterator NodeSets, this will be null. */	TokenNameCOMMENT_JAVADOC	 @return The root node of the Iterator, as specified when it was created. For non-Iterator NodeSets, this will be null. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cloned Iterator, and reset its state to the beginning of the * iteration. * * @return a new NodeSet of the same type, having the same state... * except that the reset() operation has been called. * * @throws CloneNotSupportedException if this subclass of NodeSet * does not support the clone() operation. */	TokenNameCOMMENT_JAVADOC	 Get a cloned Iterator, and reset its state to the beginning of the iteration. * @return a new NodeSet of the same type, having the same state... except that the reset() operation has been called. * @throws CloneNotSupportedException if this subclass of NodeSet does not support the clone() operation. 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
NodeSet	TokenNameIdentifier	 Node Set
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSet	TokenNameIdentifier	 Node Set
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the iterator. May have no effect on non-iterator Nodesets. */	TokenNameCOMMENT_JAVADOC	 Reset the iterator. May have no effect on non-iterator Nodesets. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This attribute determines which node types are presented via the * iterator. The available set of constants is defined in the * <code>NodeFilter</code> interface. For NodeSets, the mask has been * hardcoded to show all nodes except EntityReference nodes, which have * no equivalent in the XPath data model. * * @return integer used as a bit-array, containing flags defined in * the DOM's NodeFilter class. The value will be * <code>SHOW_ALL & ~SHOW_ENTITY_REFERENCE</code>, meaning that * only entity references are suppressed. */	TokenNameCOMMENT_JAVADOC	 This attribute determines which node types are presented via the iterator. The available set of constants is defined in the <code>NodeFilter</code> interface. For NodeSets, the mask has been hardcoded to show all nodes except EntityReference nodes, which have no equivalent in the XPath data model. * @return integer used as a bit-array, containing flags defined in the DOM's NodeFilter class. The value will be <code>SHOW_ALL & ~SHOW_ENTITY_REFERENCE</code>, meaning that only entity references are suppressed. 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
&	TokenNameAND	
~	TokenNameTWIDDLE	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
SHOW_ENTITY_REFERENCE	TokenNameIdentifier	 SHOW  ENTITY  REFERENCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The filter object used to screen nodes. Filters are applied to * further reduce (and restructure) the NodeIterator's view of the * document. In our case, we will be using hardcoded filters built * into our iterators... but getFilter() is part of the DOM's * NodeIterator interface, so we have to support it. * * @return null, which is slightly misleading. True, there is no * user-written filter object, but in fact we are doing some very * sophisticated custom filtering. A DOM purist might suggest * returning a placeholder object just to indicate that this is * not going to return all nodes selected by whatToShow. */	TokenNameCOMMENT_JAVADOC	 The filter object used to screen nodes. Filters are applied to further reduce (and restructure) the NodeIterator's view of the document. In our case, we will be using hardcoded filters built into our iterators... but getFilter() is part of the DOM's NodeIterator interface, so we have to support it. * @return null, which is slightly misleading. True, there is no user-written filter object, but in fact we are doing some very sophisticated custom filtering. A DOM purist might suggest returning a placeholder object just to indicate that this is not going to return all nodes selected by whatToShow. 
public	TokenNamepublic	
NodeFilter	TokenNameIdentifier	 Node Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value of this flag determines whether the children of entity * reference nodes are visible to the iterator. If false, they will be * skipped over. * <br> To produce a view of the document that has entity references * expanded and does not expose the entity reference node itself, use the * whatToShow flags to hide the entity reference node and set * expandEntityReferences to true when creating the iterator. To produce * a view of the document that has entity reference nodes but no entity * expansion, use the whatToShow flags to show the entity reference node * and set expandEntityReferences to false. * * @return true for all iterators based on NodeSet, meaning that the * contents of EntityRefrence nodes may be returned (though whatToShow * says that the EntityReferences themselves are not shown.) */	TokenNameCOMMENT_JAVADOC	 The value of this flag determines whether the children of entity reference nodes are visible to the iterator. If false, they will be skipped over. <br> To produce a view of the document that has entity references expanded and does not expose the entity reference node itself, use the whatToShow flags to hide the entity reference node and set expandEntityReferences to true when creating the iterator. To produce a view of the document that has entity reference nodes but no entity expansion, use the whatToShow flags to show the entity reference node and set expandEntityReferences to false. * @return true for all iterators based on NodeSet, meaning that the contents of EntityRefrence nodes may be returned (though whatToShow says that the EntityReferences themselves are not shown.) 
public	TokenNamepublic	
boolean	TokenNameboolean	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next node in the set and advances the position of the * iterator in the set. After a NodeIterator is created, the first call * to nextNode() returns the first node in the set. * @return The next <code>Node</code> in the set being iterated over, or * <code>null</code> if there are no more members in that set. * @throws DOMException * INVALID_STATE_ERR: Raised if this method is called after the * <code>detach</code> method was invoked. */	TokenNameCOMMENT_JAVADOC	 Returns the next node in the set and advances the position of the iterator in the set. After a NodeIterator is created, the first call to nextNode() returns the first node in the set. @return The next <code>Node</code> in the set being iterated over, or <code>null</code> if there are no more members in that set. @throws DOMException INVALID_STATE_ERR: Raised if this method is called after the <code>detach</code> method was invoked. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the previous node in the set and moves the position of the * iterator backwards in the set. * @return The previous <code>Node</code> in the set being iterated over, * or<code>null</code> if there are no more members in that set. * @throws DOMException * INVALID_STATE_ERR: Raised if this method is called after the * <code>detach</code> method was invoked. * @throws RuntimeException thrown if this NodeSet is not of * a cached type, and hence doesn't know what the previous node was. */	TokenNameCOMMENT_JAVADOC	 Returns the previous node in the set and moves the position of the iterator backwards in the set. @return The previous <code>Node</code> in the set being iterated over, or<code>null</code> if there are no more members in that set. @throws DOMException INVALID_STATE_ERR: Raised if this method is called after the <code>detach</code> method was invoked. @throws RuntimeException thrown if this NodeSet is not of a cached type, and hence doesn't know what the previous node was. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESET  CANNOT  ITERATE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet can not iterate to a previous node!"); 	TokenNameCOMMENT_LINE	"This NodeSet can not iterate to a previous node!"); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_next	TokenNameIdentifier	 m next
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Detaches the iterator from the set which it iterated over, releasing * any computational resources and placing the iterator in the INVALID * state. After<code>detach</code> has been invoked, calls to * <code>nextNode</code> or<code>previousNode</code> will raise the * exception INVALID_STATE_ERR. * <p> * This operation is a no-op in NodeSet, and will not cause * INVALID_STATE_ERR to be raised by later operations. * </p> */	TokenNameCOMMENT_JAVADOC	 Detaches the iterator from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. After<code>detach</code> has been invoked, calls to <code>nextNode</code> or<code>previousNode</code> will raise the exception INVALID_STATE_ERR. <p> This operation is a no-op in NodeSet, and will not cause INVALID_STATE_ERR to be raised by later operations. </p> 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Tells if this NodeSet is "fresh", in other words, if * the first nextNode() that is called will return the * first node in the set. * * @return true if nextNode() would return the first node in the set, * false if it would return a later one. */	TokenNameCOMMENT_JAVADOC	 Tells if this NodeSet is "fresh", in other words, if the first nextNode() that is called will return the first node in the set. * @return true if nextNode() would return the first node in the set, false if it would return a later one. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFresh	TokenNameIdentifier	 is Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If an index is requested, NodeSet will call this method * to run the iterator to the index. By default this sets * m_next to the index. If the index argument is -1, this * signals that the iterator should be run to the end. * * @param index Position to advance (or retreat) to, with * 0 requesting the reset ("fresh") position and -1 (or indeed * any out-of-bounds value) requesting the final position. * @throws RuntimeException thrown if this NodeSet is not * one of the types which supports indexing/counting. */	TokenNameCOMMENT_JAVADOC	 If an index is requested, NodeSet will call this method to run the iterator to the index. By default this sets m_next to the index. If the index argument is -1, this signals that the iterator should be run to the end. * @param index Position to advance (or retreat) to, with 0 requesting the reset ("fresh") position and -1 (or indeed any out-of-bounds value) requesting the final position. @throws RuntimeException thrown if this NodeSet is not one of the types which supports indexing/counting. 
public	TokenNamepublic	
void	TokenNamevoid	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESET  CANNOT  INDEX
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet can not do indexing or counting functions!"); 	TokenNameCOMMENT_LINE	"This NodeSet can not do indexing or counting functions!"); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <code>index</code>th item in the collection. If * <code>index</code> is greater than or equal to the number of nodes in * the list, this returns <code>null</code>. * * TODO: What happens if index is out of range? * * @param index Index into the collection. * @return The node at the <code>index</code>th position in the * <code>NodeList</code>, or <code>null</code> if that is not a valid * index. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the collection. If <code>index</code> is greater than or equal to the number of nodes in the list, this returns <code>null</code>. * TODO: What happens if index is out of range? * @param index Index into the collection. @return The node at the <code>index</code>th position in the <code>NodeList</code>, or <code>null</code> if that is not a valid index. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of nodes in the list. The range of valid child node indices is * 0 to <code>length-1</code> inclusive. Note that this operation requires * finding all the matching nodes, which may defeat attempts to defer * that work. * * @return integer indicating how many nodes are represented by this list. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in the list. The range of valid child node indices is 0 to <code>length-1</code> inclusive. Note that this operation requires finding all the matching nodes, which may defeat attempts to defer that work. * @return integer indicating how many nodes are represented by this list. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a node to the NodeSet. Not all types of NodeSets support this * operation * * @param n Node to be added * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Add a node to the NodeSet. Not all types of NodeSets support this operation * @param n Node to be added @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
this	TokenNamethis	
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert a node at a given position. * * @param n Node to be added * @param pos Offset at which the node is to be inserted, * with 0 being the first position. * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Insert a node at a given position. * @param n Node to be added @param pos Offset at which the node is to be inserted, with 0 being the first position. @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
insertNode	TokenNameIdentifier	 insert Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove a node. * * @param n Node to be added * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Remove a node. * @param n Node to be added @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
removeNode	TokenNameIdentifier	 remove Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
this	TokenNamethis	
.	TokenNameDOT	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy NodeList members into this nodelist, adding in * document order. If a node is null, don't add it. * * @param nodelist List of nodes which should now be referenced by * this NodeSet. * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Copy NodeList members into this nodelist, adding in document order. If a node is null, don't add it. * @param nodelist List of nodes which should now be referenced by this NodeSet. @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
// defensive to fix a bug that Sanjiva reported. 	TokenNameCOMMENT_LINE	defensive to fix a bug that Sanjiva reported. 
{	TokenNameLBRACE	
int	TokenNameint	
nChildren	TokenNameIdentifier	 n Children
=	TokenNameEQUAL	
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
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
nChildren	TokenNameIdentifier	 n Children
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// checkDups(); 	TokenNameCOMMENT_LINE	checkDups(); 
}	TokenNameRBRACE	
/** * <p>Copy NodeList members into this nodelist, adding in * document order. Only genuine node references will be copied; * nulls appearing in the source NodeSet will * not be added to this one. </p> * * <p> In case you're wondering why this function is needed: NodeSet * implements both NodeIterator and NodeList. If this method isn't * provided, Java can't decide which of those to use when addNodes() * is invoked. Providing the more-explicit match avoids that * ambiguity.)</p> * * @param ns NodeSet whose members should be merged into this NodeSet. * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 <p>Copy NodeList members into this nodelist, adding in document order. Only genuine node references will be copied; nulls appearing in the source NodeSet will not be added to this one. </p> * <p> In case you're wondering why this function is needed: NodeSet implements both NodeIterator and NodeList. If this method isn't provided, Java can't decide which of those to use when addNodes() is invoked. Providing the more-explicit match avoids that ambiguity.)</p> * @param ns NodeSet whose members should be merged into this NodeSet. @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
NodeSet	TokenNameIdentifier	 Node Set
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeIterator	TokenNameIdentifier	 Node Iterator
)	TokenNameRPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy NodeList members into this nodelist, adding in * document order. Null references are not added. * * @param iterator NodeIterator which yields the nodes to be added. * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Copy NodeList members into this nodelist, adding in document order. Null references are not added. * @param iterator NodeIterator which yields the nodes to be added. @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
NodeIterator	TokenNameIdentifier	 Node Iterator
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
// defensive to fix a bug that Sanjiva reported. 	TokenNameCOMMENT_LINE	defensive to fix a bug that Sanjiva reported. 
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// checkDups(); 	TokenNameCOMMENT_LINE	checkDups(); 
}	TokenNameRBRACE	
/** * Copy NodeList members into this nodelist, adding in * document order. If a node is null, don't add it. * * @param nodelist List of nodes to be added * @param support The XPath runtime context. * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Copy NodeList members into this nodelist, adding in document order. If a node is null, don't add it. * @param nodelist List of nodes to be added @param support The XPath runtime context. @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addNodesInDocOrder	TokenNameIdentifier	 add Nodes In Doc Order
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodelist	TokenNameIdentifier	 nodelist
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
int	TokenNameint	
nChildren	TokenNameIdentifier	 n Children
=	TokenNameEQUAL	
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
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
nChildren	TokenNameIdentifier	 n Children
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy NodeList members into this nodelist, adding in * document order. If a node is null, don't add it. * * @param iterator NodeIterator which yields the nodes to be added. * @param support The XPath runtime context. * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Copy NodeList members into this nodelist, adding in document order. If a node is null, don't add it. * @param iterator NodeIterator which yields the nodes to be added. @param support The XPath runtime context. @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addNodesInDocOrder	TokenNameIdentifier	 add Nodes In Doc Order
(	TokenNameLPAREN	
NodeIterator	TokenNameIdentifier	 Node Iterator
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add the node list to this node set in document order. * * @param start index. * @param end index. * @param testIndex index. * @param nodelist The nodelist to add. * @param support The XPath runtime context. * * @return false always. * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Add the node list to this node set in document order. * @param start index. @param end index. @param testIndex index. @param nodelist The nodelist to add. @param support The XPath runtime context. * @return false always. @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
private	TokenNameprivate	
boolean	TokenNameboolean	
addNodesInDocOrder	TokenNameIdentifier	 add Nodes In Doc Order
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
testIndex	TokenNameIdentifier	 test Index
,	TokenNameCOMMA	
NodeList	TokenNameIdentifier	 Node List
nodelist	TokenNameIdentifier	 nodelist
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
boolean	TokenNameboolean	
foundit	TokenNameIdentifier	 foundit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
testIndex	TokenNameIdentifier	 test Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Duplicate, suppress insert 	TokenNameCOMMENT_LINE	Duplicate, suppress insert 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testIndex	TokenNameIdentifier	 test Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testIndex	TokenNameIdentifier	 test Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
foundPrev	TokenNameIdentifier	 found Prev
=	TokenNameEQUAL	
addNodesInDocOrder	TokenNameIdentifier	 add Nodes In Doc Order
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
testIndex	TokenNameIdentifier	 test Index
,	TokenNameCOMMA	
nodelist	TokenNameIdentifier	 nodelist
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundPrev	TokenNameIdentifier	 found Prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addNodesInDocOrder	TokenNameIdentifier	 add Nodes In Doc Order
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
testIndex	TokenNameIdentifier	 test Index
,	TokenNameCOMMA	
nodelist	TokenNameIdentifier	 nodelist
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
foundit	TokenNameIdentifier	 foundit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the node into a vector of nodes where it should occur in * document order. * @param node The node to be added. * @param test true if we should test for doc order * @param support The XPath runtime context. * @return insertIndex. * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Add the node into a vector of nodes where it should occur in document order. @param node The node to be added. @param test true if we should test for doc order @param support The XPath runtime context. @return insertIndex. @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
int	TokenNameint	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//XSLMessages.createXPATHMessage(XPATHErrorResources.ER_NODESET_NOT_MUTABLE, null)); //"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	XSLMessages.createXPATHMessage(XPATHErrorResources.ER_NODESET_NOT_MUTABLE, null)); //"This NodeSet is not mutable!"); 
int	TokenNameint	
insertIndex	TokenNameIdentifier	 insert Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This needs to do a binary search, but a binary search 	TokenNameCOMMENT_LINE	This needs to do a binary search, but a binary search 
// is somewhat tough because the sequence test involves 	TokenNameCOMMENT_LINE	is somewhat tough because the sequence test involves 
// two nodes. 	TokenNameCOMMENT_LINE	two nodes. 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
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
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Duplicate, suppress insert 	TokenNameCOMMENT_LINE	Duplicate, suppress insert 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertIndex	TokenNameIdentifier	 insert Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
insertIndex	TokenNameIdentifier	 insert Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
insertIndex	TokenNameIdentifier	 insert Index
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundit	TokenNameIdentifier	 foundit
=	TokenNameEQUAL	
false	TokenNamefalse	
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
insertIndex	TokenNameIdentifier	 insert Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundit	TokenNameIdentifier	 foundit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundit	TokenNameIdentifier	 foundit
)	TokenNameRPAREN	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// checkDups(); 	TokenNameCOMMENT_LINE	checkDups(); 
return	TokenNamereturn	
insertIndex	TokenNameIdentifier	 insert Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end addNodeInDocOrder(Vector v, Object obj) 	TokenNameCOMMENT_LINE	end addNodeInDocOrder(Vector v, Object obj) 
/** * Add the node into a vector of nodes where it should occur in * document order. * @param node The node to be added. * @param support The XPath runtime context. * * @return The index where it was inserted. * @throws RuntimeException thrown if this NodeSet is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Add the node into a vector of nodes where it should occur in document order. @param node The node to be added. @param support The XPath runtime context. * @return The index where it was inserted. @throws RuntimeException thrown if this NodeSet is not of a mutable type. 
public	TokenNamepublic	
int	TokenNameint	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
return	TokenNamereturn	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end addNodeInDocOrder(Vector v, Object obj) 	TokenNameCOMMENT_LINE	end addNodeInDocOrder(Vector v, Object obj) 
/** If this node is being used as an iterator, the next index that nextNode() * will return. */	TokenNameCOMMENT_JAVADOC	 If this node is being used as an iterator, the next index that nextNode() will return. 
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Get the current position, which is one less than * the next nextNode() call will retrieve. i.e. if * you call getCurrentPos() and the return is 0, the next * fetch will take place at index 1. * * @return The the current position index. */	TokenNameCOMMENT_JAVADOC	 Get the current position, which is one less than the next nextNode() call will retrieve. i.e. if you call getCurrentPos() and the return is 0, the next fetch will take place at index 1. * @return The the current position index. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current position in the node set. * @param i Must be a valid index. * @throws RuntimeException thrown if this NodeSet is not of * a cached type, and thus doesn't permit indexed access. */	TokenNameCOMMENT_JAVADOC	 Set the current position in the node set. @param i Must be a valid index. @throws RuntimeException thrown if this NodeSet is not of a cached type, and thus doesn't permit indexed access. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESET  CANNOT  INDEX
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet can not do indexing or counting functions!"); 	TokenNameCOMMENT_LINE	"This NodeSet can not do indexing or counting functions!"); 
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the last fetched node. Needed to support the UnionPathIterator. * * @return the last fetched node. * @throws RuntimeException thrown if this NodeSet is not of * a cached type, and thus doesn't permit indexed access. */	TokenNameCOMMENT_JAVADOC	 Return the last fetched node. Needed to support the UnionPathIterator. * @return the last fetched node. @throws RuntimeException thrown if this NodeSet is not of a cached type, and thus doesn't permit indexed access. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESET  CANNOT  INDEX
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet can not do indexing or counting functions!"); 	TokenNameCOMMENT_LINE	"This NodeSet can not do indexing or counting functions!"); 
int	TokenNameint	
saved	TokenNameIdentifier	 saved
=	TokenNameEQUAL	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
?	TokenNameQUESTION	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
saved	TokenNameIdentifier	 saved
;	TokenNameSEMICOLON	
// HACK: I think this is a bit of a hack. -sb 	TokenNameCOMMENT_LINE	HACK: I think this is a bit of a hack. -sb 
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** True if this list can be mutated. */	TokenNameCOMMENT_JAVADOC	 True if this list can be mutated. 
transient	TokenNametransient	
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_mutable	TokenNameIdentifier	 m mutable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** True if this list is cached. * @serial */	TokenNameCOMMENT_JAVADOC	 True if this list is cached. @serial 
transient	TokenNametransient	
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Get whether or not this is a cached node set. * * * @return True if this list is cached. */	TokenNameCOMMENT_JAVADOC	 Get whether or not this is a cached node set. * @return True if this list is cached. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getShouldCacheNodes	TokenNameIdentifier	 get Should Cache Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If setShouldCacheNodes(true) is called, then nodes will * be cached. They are not cached by default. This switch must * be set before the first call to nextNode is made, to ensure * that all nodes are cached. * * @param b true if this node set should be cached. * @throws RuntimeException thrown if an attempt is made to * request caching after we've already begun stepping through the * nodes in this set. */	TokenNameCOMMENT_JAVADOC	 If setShouldCacheNodes(true) is called, then nodes will be cached. They are not cached by default. This switch must be set before the first call to nextNode is made, to ensure that all nodes are cached. * @param b true if this node set should be cached. @throws RuntimeException thrown if an attempt is made to request caching after we've already begun stepping through the nodes in this set. 
public	TokenNamepublic	
void	TokenNamevoid	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFresh	TokenNameIdentifier	 is Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANNOT_CALL_SETSHOULDCACHENODE	TokenNameIdentifier	 ER  CANNOT  CALL  SETSHOULDCACHENODE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not call setShouldCacheNodes after nextNode has been called!"); 	TokenNameCOMMENT_LINE	"Can not call setShouldCacheNodes after nextNode has been called!"); 
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
m_mutable	TokenNameIdentifier	 m mutable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transient	TokenNametransient	
private	TokenNameprivate	
int	TokenNameint	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_last	TokenNameIdentifier	 m last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLast	TokenNameIdentifier	 set Last
(	TokenNameLPAREN	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Size of blocks to allocate. * @serial */	TokenNameCOMMENT_JAVADOC	 Size of blocks to allocate. @serial 
private	TokenNameprivate	
int	TokenNameint	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
/** Array of nodes this points to. * @serial */	TokenNameCOMMENT_JAVADOC	 Array of nodes this points to. @serial 
Node	TokenNameIdentifier	 Node
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Number of nodes in this NodeVector. * @serial */	TokenNameCOMMENT_JAVADOC	 Number of nodes in this NodeVector. @serial 
protected	TokenNameprotected	
int	TokenNameint	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Size of the array this points to. * @serial */	TokenNameCOMMENT_JAVADOC	 Size of the array this points to. @serial 
private	TokenNameprivate	
int	TokenNameint	
m_mapSize	TokenNameIdentifier	 m map Size
;	TokenNameSEMICOLON	
// lazy initialization 	TokenNameCOMMENT_LINE	lazy initialization 
/** * Get a cloned LocPathIterator. * * @return A clone of this * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned LocPathIterator. * @return A clone of this * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
NodeSet	TokenNameIdentifier	 Node Set
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSet	TokenNameIdentifier	 Node Set
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
==	TokenNameEQUAL_EQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return Number of nodes in this NodeVector */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return Number of nodes in this NodeVector 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a Node onto the vector. * * @param value Node to add to the vector */	TokenNameCOMMENT_JAVADOC	 Append a Node onto the vector. * @param value Node to add to the vector 
public	TokenNamepublic	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a Node onto the vector. * * @param value Node to add to the vector */	TokenNameCOMMENT_JAVADOC	 Append a Node onto the vector. * @param value Node to add to the vector 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ff	TokenNameIdentifier	 ff
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ff	TokenNameIdentifier	 ff
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ff	TokenNameIdentifier	 ff
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
ff	TokenNameIdentifier	 ff
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
ff	TokenNameIdentifier	 ff
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
ff	TokenNameIdentifier	 ff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a node from the tail of the vector and return the result. * * @return the node at the tail of the vector */	TokenNameCOMMENT_JAVADOC	 Pop a node from the tail of the vector and return the result. * @return the node at the tail of the vector 
public	TokenNamepublic	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a node from the tail of the vector and return the * top of the stack after the pop. * * @return The top of the stack after it's been popped */	TokenNameCOMMENT_JAVADOC	 Pop a node from the tail of the vector and return the top of the stack after the pop. * @return The top of the stack after it's been popped 
public	TokenNamepublic	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
popAndTop	TokenNameIdentifier	 pop And Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a node from the tail of the vector. */	TokenNameCOMMENT_JAVADOC	 Pop a node from the tail of the vector. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popQuick	TokenNameIdentifier	 pop Quick
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node at the top of the stack without popping the stack. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @return Node at the top of the stack or null if stack is empty. */	TokenNameCOMMENT_JAVADOC	 Return the node at the top of the stack without popping the stack. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @return Node at the top of the stack or null if stack is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
peepOrNull	TokenNameIdentifier	 peep Or Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push a pair of nodes into the stack. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @param v1 First node to add to vector * @param v2 Second node to add to vector */	TokenNameCOMMENT_JAVADOC	 Push a pair of nodes into the stack. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @param v1 First node to add to vector @param v2 Second node to add to vector 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushPair	TokenNameIdentifier	 push Pair
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a pair of nodes from the tail of the stack. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. */	TokenNameCOMMENT_JAVADOC	 Pop a pair of nodes from the tail of the stack. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popPair	TokenNameIdentifier	 pop Pair
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the tail of the stack to the given node. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @param n Node to set at the tail of vector */	TokenNameCOMMENT_JAVADOC	 Set the tail of the stack to the given node. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @param n Node to set at the tail of vector 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setTail	TokenNameIdentifier	 set Tail
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the given node one position from the tail. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @param n Node to set */	TokenNameCOMMENT_JAVADOC	 Set the given node one position from the tail. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @param n Node to set 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setTailSub1	TokenNameIdentifier	 set Tail Sub1
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node at the tail of the vector without popping * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @return Node at the tail of the vector */	TokenNameCOMMENT_JAVADOC	 Return the node at the tail of the vector without popping Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @return Node at the tail of the vector 
public	TokenNamepublic	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
peepTail	TokenNameIdentifier	 peep Tail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node one position from the tail without popping. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @return Node one away from the tail */	TokenNameCOMMENT_JAVADOC	 Return the node one position from the tail without popping. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @return Node one away from the tail 
public	TokenNamepublic	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
peepTailSub1	TokenNameIdentifier	 peep Tail Sub1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. * * @param value Node to insert * @param at Position where to insert */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. * @param value Node to insert @param at Position where to insert 
public	TokenNamepublic	
void	TokenNamevoid	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
at	TokenNameIdentifier	 at
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append the nodes to the list. * * @param nodes NodeVector to append to this list */	TokenNameCOMMENT_JAVADOC	 Append the nodes to the list. * @param nodes NodeVector to append to this list 
public	TokenNamepublic	
void	TokenNamevoid	
appendNodes	TokenNameIdentifier	 append Nodes
(	TokenNameLPAREN	
NodeSet	TokenNameIdentifier	 Node Set
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nNodes	TokenNameIdentifier	 n Nodes
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
nNodes	TokenNameIdentifier	 n Nodes
+	TokenNamePLUS	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
nNodes	TokenNameIdentifier	 n Nodes
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
nNodes	TokenNameIdentifier	 n Nodes
+	TokenNamePLUS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
nNodes	TokenNameIdentifier	 n Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
,	TokenNameCOMMA	
nNodes	TokenNameIdentifier	 n Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
nNodes	TokenNameIdentifier	 n Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the first occurrence of the argument from this vector. * If the object is found in this vector, each component in the vector * with an index greater or equal to the object's index is shifted * downward to have an index one smaller than the value it had * previously. * * @param s Node to remove from the list * * @return True if the node was successfully removed */	TokenNameCOMMENT_JAVADOC	 Removes the first occurrence of the argument from this vector. If the object is found in this vector, each component in the vector with an index greater or equal to the object's index is shifted downward to have an index one smaller than the value it had previously. * @param s Node to remove from the list * @return True if the node was successfully removed 
public	TokenNamepublic	
boolean	TokenNameboolean	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deletes the component at the specified index. Each component in * this vector with an index greater or equal to the specified * index is shifted downward to have an index one smaller than * the value it had previously. * * @param i Index of node to remove */	TokenNameCOMMENT_JAVADOC	 Deletes the component at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted downward to have an index one smaller than the value it had previously. * @param i Index of node to remove 
public	TokenNamepublic	
void	TokenNamevoid	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" >= "	TokenNameStringLiteral	 >= 
+	TokenNamePLUS	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the component at the specified index of this vector to be the * specified object. The previous component at that position is discarded. * * The index must be a value greater than or equal to 0 and less * than the current size of the vector. * * @param node Node to set * @param index Index of where to set the node */	TokenNameCOMMENT_JAVADOC	 Sets the component at the specified index of this vector to be the specified object. The previous component at that position is discarded. * The index must be a value greater than or equal to 0 and less than the current size of the vector. * @param node Node to set @param index Index of where to set the node 
public	TokenNamepublic	
void	TokenNamevoid	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSet is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSet is not mutable!"); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the nth element. * * @param i Index of node to get * * @return Node at specified index */	TokenNameCOMMENT_JAVADOC	 Get the nth element. * @param i Index of node to get * @return Node at specified index 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the table contains the given node. * * @param s Node to look for * * @return True if the given node was found. */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given node. * @param s Node to look for * @return True if the given node was found. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem Node to look for * @param index Index of where to start the search * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem Node to look for @param index Index of where to start the search @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem Node to look for * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem Node to look for @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
