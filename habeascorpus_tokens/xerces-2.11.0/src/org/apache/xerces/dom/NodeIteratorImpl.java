/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
/** DefaultNodeIterator implements a NodeIterator, which iterates a * DOM tree in the expected depth first way. * * <p>The whatToShow and filter functionality is implemented as expected. * * <p>This class also has method removeNode to enable iterator "fix-up" * on DOM remove. It is expected that the DOM implementation call removeNode * right before the actual DOM transformation. If not called by the DOM, * the client could call it before doing the removal. * * @xerces.internal * * @version $Id: NodeIteratorImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 DefaultNodeIterator implements a NodeIterator, which iterates a DOM tree in the expected depth first way. * <p>The whatToShow and filter functionality is implemented as expected. * <p>This class also has method removeNode to enable iterator "fix-up" on DOM remove. It is expected that the DOM implementation call removeNode right before the actual DOM transformation. If not called by the DOM, the client could call it before doing the removal. * @xerces.internal * @version $Id: NodeIteratorImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
NodeIteratorImpl	TokenNameIdentifier	 Node Iterator Impl
implements	TokenNameimplements	
NodeIterator	TokenNameIdentifier	 Node Iterator
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The DocumentImpl which created this iterator, so it can be detached. */	TokenNameCOMMENT_JAVADOC	 The DocumentImpl which created this iterator, so it can be detached. 
private	TokenNameprivate	
DocumentImpl	TokenNameIdentifier	 Document Impl
fDocument	TokenNameIdentifier	 f Document
;	TokenNameSEMICOLON	
/** The root. */	TokenNameCOMMENT_JAVADOC	 The root. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
fRoot	TokenNameIdentifier	 f Root
;	TokenNameSEMICOLON	
/** The whatToShow mask. */	TokenNameCOMMENT_JAVADOC	 The whatToShow mask. 
private	TokenNameprivate	
int	TokenNameint	
fWhatToShow	TokenNameIdentifier	 f What To Show
=	TokenNameEQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
;	TokenNameSEMICOLON	
/** The NodeFilter reference. */	TokenNameCOMMENT_JAVADOC	 The NodeFilter reference. 
private	TokenNameprivate	
NodeFilter	TokenNameIdentifier	 Node Filter
fNodeFilter	TokenNameIdentifier	 f Node Filter
;	TokenNameSEMICOLON	
/** If detach is called, the fDetach flag is true, otherwise flase. */	TokenNameCOMMENT_JAVADOC	 If detach is called, the fDetach flag is true, otherwise flase. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fDetach	TokenNameIdentifier	 f Detach
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Iterator state - current node and direction. 	TokenNameCOMMENT_LINE	Iterator state - current node and direction. 
// 	TokenNameCOMMENT_LINE	 
// Note: The current node and direction are sufficient to implement 	TokenNameCOMMENT_LINE	Note: The current node and direction are sufficient to implement 
// the desired behaviour of the current pointer being _between_ 	TokenNameCOMMENT_LINE	the desired behaviour of the current pointer being _between_ 
// two nodes. The fCurrentNode is actually the last node returned, 	TokenNameCOMMENT_LINE	two nodes. The fCurrentNode is actually the last node returned, 
// and the 	TokenNameCOMMENT_LINE	and the 
// direction is whether the pointer is in front or behind this node. 	TokenNameCOMMENT_LINE	direction is whether the pointer is in front or behind this node. 
// (usually akin to whether the node was returned via nextNode()) 	TokenNameCOMMENT_LINE	(usually akin to whether the node was returned via nextNode()) 
// (eg fForward = true) or previousNode() (eg fForward = false). 	TokenNameCOMMENT_LINE	(eg fForward = true) or previousNode() (eg fForward = false). 
// Note also, if removing a Node, the fCurrentNode 	TokenNameCOMMENT_LINE	Note also, if removing a Node, the fCurrentNode 
// can be placed on a Node which would not pass filters. 	TokenNameCOMMENT_LINE	can be placed on a Node which would not pass filters. 
/** The last Node returned. */	TokenNameCOMMENT_JAVADOC	 The last Node returned. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
/** The direction of the iterator on the fCurrentNode. * <pre> * nextNode() == fForward = true; * previousNode() == fForward = false; * </pre> */	TokenNameCOMMENT_JAVADOC	 The direction of the iterator on the fCurrentNode. <pre> nextNode() == fForward = true; previousNode() == fForward = false; </pre> 
private	TokenNameprivate	
boolean	TokenNameboolean	
fForward	TokenNameIdentifier	 f Forward
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** When TRUE, the children of entites references are returned in the iterator. */	TokenNameCOMMENT_JAVADOC	 When TRUE, the children of entites references are returned in the iterator. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructor 	TokenNameCOMMENT_LINE	Constructor 
// 	TokenNameCOMMENT_LINE	 
/** Public constructor */	TokenNameCOMMENT_JAVADOC	 Public constructor 
public	TokenNamepublic	
NodeIteratorImpl	TokenNameIdentifier	 Node Iterator Impl
(	TokenNameLPAREN	
DocumentImpl	TokenNameIdentifier	 Document Impl
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
NodeFilter	TokenNameIdentifier	 Node Filter
nodeFilter	TokenNameIdentifier	 node Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocument	TokenNameIdentifier	 f Document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
fRoot	TokenNameIdentifier	 f Root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fWhatToShow	TokenNameIdentifier	 f What To Show
=	TokenNameEQUAL	
whatToShow	TokenNameIdentifier	 what To Show
;	TokenNameSEMICOLON	
fNodeFilter	TokenNameIdentifier	 f Node Filter
=	TokenNameEQUAL	
nodeFilter	TokenNameIdentifier	 node Filter
;	TokenNameSEMICOLON	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
=	TokenNameEQUAL	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fRoot	TokenNameIdentifier	 f Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Implementation Note: Note that the iterator looks at whatToShow 	TokenNameCOMMENT_LINE	Implementation Note: Note that the iterator looks at whatToShow 
// and filter values at each call, and therefore one _could_ add 	TokenNameCOMMENT_LINE	and filter values at each call, and therefore one _could_ add 
// setters for these values and alter them while iterating! 	TokenNameCOMMENT_LINE	setters for these values and alter them while iterating! 
/** Return the whatToShow value */	TokenNameCOMMENT_JAVADOC	 Return the whatToShow value 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fWhatToShow	TokenNameIdentifier	 f What To Show
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the filter */	TokenNameCOMMENT_JAVADOC	 Return the filter 
public	TokenNamepublic	
NodeFilter	TokenNameIdentifier	 Node Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNodeFilter	TokenNameIdentifier	 f Node Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return whether children entity references are included in the iterator. */	TokenNameCOMMENT_JAVADOC	 Return whether children entity references are included in the iterator. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the next Node in the Iterator. The node is the next node in * depth-first order which also passes the filter, and whatToShow. * If there is no next node which passes these criteria, then return null. */	TokenNameCOMMENT_JAVADOC	 Return the next Node in the Iterator. The node is the next node in depth-first order which also passes the filter, and whatToShow. If there is no next node which passes these criteria, then return null. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if root is null there is no next node. 	TokenNameCOMMENT_LINE	if root is null there is no next node. 
if	TokenNameif	
(	TokenNameLPAREN	
fRoot	TokenNameIdentifier	 f Root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
accepted	TokenNameIdentifier	 accepted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// the next node has not been accepted. 	TokenNameCOMMENT_LINE	the next node has not been accepted. 
accepted_loop	TokenNameIdentifier	 accepted loop
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
accepted	TokenNameIdentifier	 accepted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if last direction is not forward, repeat node. 	TokenNameCOMMENT_LINE	if last direction is not forward, repeat node. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fForward	TokenNameIdentifier	 f Forward
&&	TokenNameAND_AND	
nextNode	TokenNameIdentifier	 next Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("nextNode():!fForward:"+fCurrentNode.getNodeName()); 	TokenNameCOMMENT_LINE	System.out.println("nextNode():!fForward:"+fCurrentNode.getNodeName()); 
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// else get the next node via depth-first 	TokenNameCOMMENT_LINE	else get the next node via depth-first 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
&&	TokenNameAND_AND	
nextNode	TokenNameIdentifier	 next Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nextNode	TokenNameIdentifier	 next Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fForward	TokenNameIdentifier	 f Forward
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//REVIST: should direction be set forward before null check? 	TokenNameCOMMENT_LINE	REVIST: should direction be set forward before null check? 
// nothing in the list. return null. 	TokenNameCOMMENT_LINE	nothing in the list. return null. 
if	TokenNameif	
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// does node pass the filters and whatToShow? 	TokenNameCOMMENT_LINE	does node pass the filters and whatToShow? 
accepted	TokenNameIdentifier	 accepted
=	TokenNameEQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
accepted	TokenNameIdentifier	 accepted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if so, then the node is the current node. 	TokenNameCOMMENT_LINE	if so, then the node is the current node. 
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
continue	TokenNamecontinue	
accepted_loop	TokenNameIdentifier	 accepted loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// while (!accepted) { 	TokenNameCOMMENT_LINE	while (!accepted) { 
// no nodes, or no accepted nodes. 	TokenNameCOMMENT_LINE	no nodes, or no accepted nodes. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the previous Node in the Iterator. The node is the next node in * _backwards_ depth-first order which also passes the filter, and whatToShow. */	TokenNameCOMMENT_JAVADOC	 Return the previous Node in the Iterator. The node is the next node in _backwards_ depth-first order which also passes the filter, and whatToShow. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the root is null, or the current node is null, return null. 	TokenNameCOMMENT_LINE	if the root is null, or the current node is null, return null. 
if	TokenNameif	
(	TokenNameLPAREN	
fRoot	TokenNameIdentifier	 f Root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
fCurrentNode	TokenNameIdentifier	 f Current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
previousNode	TokenNameIdentifier	 previous Node
=	TokenNameEQUAL	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
accepted	TokenNameIdentifier	 accepted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
accepted_loop	TokenNameIdentifier	 accepted loop
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
accepted	TokenNameIdentifier	 accepted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fForward	TokenNameIdentifier	 f Forward
&&	TokenNameAND_AND	
previousNode	TokenNameIdentifier	 previous Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//repeat last node. 	TokenNameCOMMENT_LINE	repeat last node. 
previousNode	TokenNameIdentifier	 previous Node
=	TokenNameEQUAL	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// get previous node in backwards depth first order. 	TokenNameCOMMENT_LINE	get previous node in backwards depth first order. 
previousNode	TokenNameIdentifier	 previous Node
=	TokenNameEQUAL	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
previousNode	TokenNameIdentifier	 previous Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we are going backwards 	TokenNameCOMMENT_LINE	we are going backwards 
fForward	TokenNameIdentifier	 f Forward
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// if the new previous node is null, we're at head or past the root, 	TokenNameCOMMENT_LINE	if the new previous node is null, we're at head or past the root, 
// so return null. 	TokenNameCOMMENT_LINE	so return null. 
if	TokenNameif	
(	TokenNameLPAREN	
previousNode	TokenNameIdentifier	 previous Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// check if node passes filters and whatToShow. 	TokenNameCOMMENT_LINE	check if node passes filters and whatToShow. 
accepted	TokenNameIdentifier	 accepted
=	TokenNameEQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
previousNode	TokenNameIdentifier	 previous Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
accepted	TokenNameIdentifier	 accepted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if accepted, update the current node, and return it. 	TokenNameCOMMENT_LINE	if accepted, update the current node, and return it. 
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
previousNode	TokenNameIdentifier	 previous Node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
continue	TokenNamecontinue	
accepted_loop	TokenNameIdentifier	 accepted loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// there are no nodes? 	TokenNameCOMMENT_LINE	there are no nodes? 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The node is accepted if it passes the whatToShow and the filter. */	TokenNameCOMMENT_JAVADOC	 The node is accepted if it passes the whatToShow and the filter. 
boolean	TokenNameboolean	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeFilter	TokenNameIdentifier	 f Node Filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fWhatToShow	TokenNameIdentifier	 f What To Show
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fWhatToShow	TokenNameIdentifier	 f What To Show
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fNodeFilter	TokenNameIdentifier	 f Node Filter
.	TokenNameDOT	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return node, if matches or any parent if matches. */	TokenNameCOMMENT_JAVADOC	 Return node, if matches or any parent if matches. 
Node	TokenNameIdentifier	 Node
matchNodeOrParent	TokenNameIdentifier	 match Node Or Parent
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Additions and removals in the underlying data structure may occur 	TokenNameCOMMENT_LINE	Additions and removals in the underlying data structure may occur 
// before any iterations, and in this case the reference_node is null. 	TokenNameCOMMENT_LINE	before any iterations, and in this case the reference_node is null. 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// check if the removed node is an _ancestor_ of the 	TokenNameCOMMENT_LINE	check if the removed node is an _ancestor_ of the 
// reference node 	TokenNameCOMMENT_LINE	reference node 
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
fRoot	TokenNameIdentifier	 f Root
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The method nextNode(Node, boolean) returns the next node * from the actual DOM tree. * * The boolean visitChildren determines whether to visit the children. * The result is the nextNode. */	TokenNameCOMMENT_JAVADOC	 The method nextNode(Node, boolean) returns the next node from the actual DOM tree. * The boolean visitChildren determines whether to visit the children. The result is the nextNode. 
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
visitChildren	TokenNameIdentifier	 visit Children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
fRoot	TokenNameIdentifier	 f Root
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// only check children if we visit children. 	TokenNameCOMMENT_LINE	only check children if we visit children. 
if	TokenNameif	
(	TokenNameLPAREN	
visitChildren	TokenNameIdentifier	 visit Children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if hasChildren, return 1st child. 	TokenNameCOMMENT_LINE	if hasChildren, return 1st child. 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fRoot	TokenNameIdentifier	 f Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if Root has no kids 	TokenNameCOMMENT_LINE	if Root has no kids 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if hasSibling, return sibling 	TokenNameCOMMENT_LINE	if hasSibling, return sibling 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// return parent's 1st sibling. 	TokenNameCOMMENT_LINE	return parent's 1st sibling. 
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
fRoot	TokenNameIdentifier	 f Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// while (parent != null && parent != fRoot) { 	TokenNameCOMMENT_LINE	while (parent != null && parent != fRoot) { 
// end of list, return null 	TokenNameCOMMENT_LINE	end of list, return null 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The method previousNode(Node) returns the previous node * from the actual DOM tree. */	TokenNameCOMMENT_JAVADOC	 The method previousNode(Node) returns the previous node from the actual DOM tree. 
Node	TokenNameIdentifier	 Node
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// if we're at the root, return null. 	TokenNameCOMMENT_LINE	if we're at the root, return null. 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fRoot	TokenNameIdentifier	 f Root
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// get sibling 	TokenNameCOMMENT_LINE	get sibling 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if 1st sibling, return parent 	TokenNameCOMMENT_LINE	if 1st sibling, return parent 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if sibling has children, keep getting last child of child. 	TokenNameCOMMENT_LINE	if sibling has children, keep getting last child of child. 
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
&&	TokenNameAND_AND	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Fix-up the iterator on a remove. Called by DOM or otherwise, * before an actual DOM remove. */	TokenNameCOMMENT_JAVADOC	 Fix-up the iterator on a remove. Called by DOM or otherwise, before an actual DOM remove. 
public	TokenNamepublic	
void	TokenNamevoid	
removeNode	TokenNameIdentifier	 remove Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Implementation note: Fix-up means setting the current node properly 	TokenNameCOMMENT_LINE	Implementation note: Fix-up means setting the current node properly 
// after a remove. 	TokenNameCOMMENT_LINE	after a remove. 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
deleted	TokenNameIdentifier	 deleted
=	TokenNameEQUAL	
matchNodeOrParent	TokenNameIdentifier	 match Node Or Parent
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deleted	TokenNameIdentifier	 deleted
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fForward	TokenNameIdentifier	 f Forward
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
deleted	TokenNameIdentifier	 deleted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// if (!fForward) 	TokenNameCOMMENT_LINE	if (!fForward) 
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
deleted	TokenNameIdentifier	 deleted
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// normal case: there _are_ nodes following this in the iterator. 	TokenNameCOMMENT_LINE	normal case: there _are_ nodes following this in the iterator. 
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the last node in the iterator is to be removed, 	TokenNameCOMMENT_LINE	the last node in the iterator is to be removed, 
// so we set the current node to be the previous one. 	TokenNameCOMMENT_LINE	so we set the current node to be the previous one. 
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
deleted	TokenNameIdentifier	 deleted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fForward	TokenNameIdentifier	 f Forward
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDetach	TokenNameIdentifier	 f Detach
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
removeNodeIterator	TokenNameIdentifier	 remove Node Iterator
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
