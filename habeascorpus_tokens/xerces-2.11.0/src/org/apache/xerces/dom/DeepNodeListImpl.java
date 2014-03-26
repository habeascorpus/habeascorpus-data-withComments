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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
/** * This class implements the DOM's NodeList behavior for * Element.getElementsByTagName() * <P> * The DOM describes NodeList as follows: * <P> * 1) It may represent EITHER nodes scattered through a subtree (when * returned by Element.getElementsByTagName), or just the immediate * children (when returned by Node.getChildNodes). The latter is easy, * but the former (which this class addresses) is more challenging. * <P> * 2) Its behavior is "live" -- that is, it always reflects the * current state of the document tree. To put it another way, the * NodeLists obtained before and after a series of insertions and * deletions are effectively identical (as far as the user is * concerned, the former has been dynamically updated as the changes * have been made). * <P> * 3) Its API accesses individual nodes via an integer index, with the * listed nodes numbered sequentially in the order that they were * found during a preorder depth-first left-to-right search of the tree. * (Of course in the case of getChildNodes, depth is not involved.) As * nodes are inserted or deleted in the tree, and hence the NodeList, * the numbering of nodes that follow them in the NodeList will * change. * <P> * It is rather painful to support the latter two in the * getElementsByTagName case. The current solution is for Nodes to * maintain a change count (eventually that may be a Digest instead), * which the NodeList tracks and uses to invalidate itself. * <P> * Unfortunately, this does _not_ respond efficiently in the case that * the dynamic behavior was supposed to address: scanning a tree while * it is being extended. That requires knowing which subtrees have * changed, which can become an arbitrarily complex problem. * <P> * We save some work by filling the ArrayList only as we access the * item()s... but I suspect the same users who demanded index-based * access will also start by doing a getLength() to control their loop, * blowing this optimization out of the water. * <P> * NOTE: Level 2 of the DOM will probably _not_ use NodeList for its * extended search mechanisms, partly for the reasons just discussed. * * @xerces.internal * * @version $Id: DeepNodeListImpl.java 778245 2009-05-24 22:27:32Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 This class implements the DOM's NodeList behavior for Element.getElementsByTagName() <P> The DOM describes NodeList as follows: <P> 1) It may represent EITHER nodes scattered through a subtree (when returned by Element.getElementsByTagName), or just the immediate children (when returned by Node.getChildNodes). The latter is easy, but the former (which this class addresses) is more challenging. <P> 2) Its behavior is "live" -- that is, it always reflects the current state of the document tree. To put it another way, the NodeLists obtained before and after a series of insertions and deletions are effectively identical (as far as the user is concerned, the former has been dynamically updated as the changes have been made). <P> 3) Its API accesses individual nodes via an integer index, with the listed nodes numbered sequentially in the order that they were found during a preorder depth-first left-to-right search of the tree. (Of course in the case of getChildNodes, depth is not involved.) As nodes are inserted or deleted in the tree, and hence the NodeList, the numbering of nodes that follow them in the NodeList will change. <P> It is rather painful to support the latter two in the getElementsByTagName case. The current solution is for Nodes to maintain a change count (eventually that may be a Digest instead), which the NodeList tracks and uses to invalidate itself. <P> Unfortunately, this does _not_ respond efficiently in the case that the dynamic behavior was supposed to address: scanning a tree while it is being extended. That requires knowing which subtrees have changed, which can become an arbitrarily complex problem. <P> We save some work by filling the ArrayList only as we access the item()s... but I suspect the same users who demanded index-based access will also start by doing a getLength() to control their loop, blowing this optimization out of the water. <P> NOTE: Level 2 of the DOM will probably _not_ use NodeList for its extended search mechanisms, partly for the reasons just discussed. * @xerces.internal * @version $Id: DeepNodeListImpl.java 778245 2009-05-24 22:27:32Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
DeepNodeListImpl	TokenNameIdentifier	 Deep Node List Impl
implements	TokenNameimplements	
NodeList	TokenNameIdentifier	 Node List
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
NodeImpl	TokenNameIdentifier	 Node Impl
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
// Where the search started 	TokenNameCOMMENT_LINE	Where the search started 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
;	TokenNameSEMICOLON	
// Or "*" to mean all-tags-acceptable 	TokenNameCOMMENT_LINE	Or "*" to mean all-tags-acceptable 
protected	TokenNameprotected	
int	TokenNameint	
changes	TokenNameIdentifier	 changes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
nsName	TokenNameIdentifier	 ns Name
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
enableNS	TokenNameIdentifier	 enable NS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
DeepNodeListImpl	TokenNameIdentifier	 Deep Node List Impl
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
rootNode	TokenNameIdentifier	 root Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tagName	TokenNameIdentifier	 tag Name
=	TokenNameEQUAL	
tagName	TokenNameIdentifier	 tag Name
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructor for Namespace support. */	TokenNameCOMMENT_JAVADOC	 Constructor for Namespace support. 
public	TokenNamepublic	
DeepNodeListImpl	TokenNameIdentifier	 Deep Node List Impl
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
rootNode	TokenNameIdentifier	 root Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nsName	TokenNameIdentifier	 ns Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
,	TokenNameCOMMA	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nsName	TokenNameIdentifier	 ns Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nsName	TokenNameIdentifier	 ns Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nsName	TokenNameIdentifier	 ns Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
nsName	TokenNameIdentifier	 ns Name
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
enableNS	TokenNameIdentifier	 enable NS
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// NodeList methods 	TokenNameCOMMENT_LINE	NodeList methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the length of the node list. */	TokenNameCOMMENT_JAVADOC	 Returns the length of the node list. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Preload all matching elements. (Stops when we run out of subtree!) 	TokenNameCOMMENT_LINE	Preload all matching elements. (Stops when we run out of subtree!) 
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the node at the specified index. */	TokenNameCOMMENT_JAVADOC	 Returns the node at the specified index. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
thisNode	TokenNameIdentifier	 this Node
;	TokenNameSEMICOLON	
// Tree changed. Do it all from scratch! 	TokenNameCOMMENT_LINE	Tree changed. Do it all from scratch! 
if	TokenNameif	
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
.	TokenNameDOT	
changes	TokenNameIdentifier	 changes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
changes	TokenNameIdentifier	 changes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changes	TokenNameIdentifier	 changes
=	TokenNameEQUAL	
rootNode	TokenNameIdentifier	 root Node
.	TokenNameDOT	
changes	TokenNameIdentifier	 changes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// In the cache 	TokenNameCOMMENT_LINE	In the cache 
final	TokenNamefinal	
int	TokenNameint	
currentSize	TokenNameIdentifier	 current Size
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
currentSize	TokenNameIdentifier	 current Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Not yet seen 	TokenNameCOMMENT_LINE	Not yet seen 
else	TokenNameelse	
{	TokenNameLBRACE	
// Pick up where we left off (Which may be the beginning) 	TokenNameCOMMENT_LINE	Pick up where we left off (Which may be the beginning) 
if	TokenNameif	
(	TokenNameLPAREN	
currentSize	TokenNameIdentifier	 current Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentSize	TokenNameIdentifier	 current Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add nodes up to the one we're looking for 	TokenNameCOMMENT_LINE	Add nodes up to the one we're looking for 
while	TokenNamewhile	
(	TokenNameLPAREN	
thisNode	TokenNameIdentifier	 this Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
nextMatchingElementAfter	TokenNameIdentifier	 next Matching Element After
(	TokenNameLPAREN	
thisNode	TokenNameIdentifier	 this Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thisNode	TokenNameIdentifier	 this Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
thisNode	TokenNameIdentifier	 this Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Either what we want, or null (not avail.) 	TokenNameCOMMENT_LINE	Either what we want, or null (not avail.) 
return	TokenNamereturn	
thisNode	TokenNameIdentifier	 this Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// item(int):Node 	TokenNameCOMMENT_LINE	item(int):Node 
// 	TokenNameCOMMENT_LINE	 
// Protected methods (might be overridden by an extending DOM) 	TokenNameCOMMENT_LINE	Protected methods (might be overridden by an extending DOM) 
// 	TokenNameCOMMENT_LINE	 
/** * Iterative tree-walker. When you have a Parent link, there's often no * need to resort to recursion. NOTE THAT only Element nodes are matched * since we're specifically supporting getElementsByTagName(). */	TokenNameCOMMENT_JAVADOC	 Iterative tree-walker. When you have a Parent link, there's often no need to resort to recursion. NOTE THAT only Element nodes are matched since we're specifically supporting getElementsByTagName(). 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
nextMatchingElementAfter	TokenNameIdentifier	 next Matching Element After
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Look down to first child. 	TokenNameCOMMENT_LINE	Look down to first child. 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Look right to sibling (but not from root!) 	TokenNameCOMMENT_LINE	Look right to sibling (but not from root!) 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
rootNode	TokenNameIdentifier	 root Node
&&	TokenNameAND_AND	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Look up and right (but not past root!) 	TokenNameCOMMENT_LINE	Look up and right (but not past root!) 
else	TokenNameelse	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
// Stop when we return to starting point 	TokenNameCOMMENT_LINE	Stop when we return to starting point 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Have we found an Element with the right tagName? 	TokenNameCOMMENT_LINE	Have we found an Element with the right tagName? 
// ("*" matches anything.) 	TokenNameCOMMENT_LINE	("*" matches anything.) 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
rootNode	TokenNameIdentifier	 root Node
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
enableNS	TokenNameIdentifier	 enable NS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// DOM2: Namespace logic. 	TokenNameCOMMENT_LINE	DOM2: Namespace logic. 
if	TokenNameif	
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nsName	TokenNameIdentifier	 ns Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nsName	TokenNameIdentifier	 ns Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ElementImpl	TokenNameIdentifier	 Element Impl
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nsName	TokenNameIdentifier	 ns Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
nsName	TokenNameIdentifier	 ns Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nsName	TokenNameIdentifier	 ns Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ElementImpl	TokenNameIdentifier	 Element Impl
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nsName	TokenNameIdentifier	 ns Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nsName	TokenNameIdentifier	 ns Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nsName	TokenNameIdentifier	 ns Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
nsName	TokenNameIdentifier	 ns Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nsName	TokenNameIdentifier	 ns Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Otherwise continue walking the tree 	TokenNameCOMMENT_LINE	Otherwise continue walking the tree 
}	TokenNameRBRACE	
// Fell out of tree-walk; no more instances found 	TokenNameCOMMENT_LINE	Fell out of tree-walk; no more instances found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// nextMatchingElementAfter(int):Node 	TokenNameCOMMENT_LINE	nextMatchingElementAfter(int):Node 
}	TokenNameRBRACE	
// class DeepNodeListImpl 	TokenNameCOMMENT_LINE	class DeepNodeListImpl 
