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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
Document	TokenNameIdentifier	 Document
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
UserDataHandler	TokenNameIdentifier	 User Data Handler
;	TokenNameSEMICOLON	
/** * ParentNode inherits from ChildNode and adds the capability of having child * nodes. Not every node in the DOM can have children, so only nodes that can * should inherit from this class and pay the price for it. * <P> * ParentNode, just like NodeImpl, also implements NodeList, so it can * return itself in response to the getChildNodes() query. This eliminiates * the need for a separate ChildNodeList object. Note that this is an * IMPLEMENTATION DETAIL; applications should _never_ assume that * this identity exists. On the other hand, subclasses may need to override * this, in case of conflicting names. This is the case for the classes * HTMLSelectElementImpl and HTMLFormElementImpl of the HTML DOM. * <P> * While we have a direct reference to the first child, the last child is * stored as the previous sibling of the first child. First child nodes are * marked as being so, and getNextSibling hides this fact. * <P>Note: Not all parent nodes actually need to also be a child. At some * point we used to have ParentNode inheriting from NodeImpl and another class * called ChildAndParentNode that inherited from ChildNode. But due to the lack * of multiple inheritance a lot of code had to be duplicated which led to a * maintenance nightmare. At the same time only a few nodes (Document, * DocumentFragment, Entity, and Attribute) cannot be a child so the gain in * memory wasn't really worth it. The only type for which this would be the * case is Attribute, but we deal with there in another special way, so this is * not applicable. * <p> * This class doesn't directly support mutation events, however, it notifies * the document when mutations are performed so that the document class do so. * * <p><b>WARNING</b>: Some of the code here is partially duplicated in * AttrImpl, be careful to keep these two classes in sync! * * @xerces.internal * * @author Arnaud Le Hors, IBM * @author Joe Kesselman, IBM * @author Andy Clark, IBM * @version $Id: ParentNode.java 724081 2008-12-07 05:46:26Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 ParentNode inherits from ChildNode and adds the capability of having child nodes. Not every node in the DOM can have children, so only nodes that can should inherit from this class and pay the price for it. <P> ParentNode, just like NodeImpl, also implements NodeList, so it can return itself in response to the getChildNodes() query. This eliminiates the need for a separate ChildNodeList object. Note that this is an IMPLEMENTATION DETAIL; applications should _never_ assume that this identity exists. On the other hand, subclasses may need to override this, in case of conflicting names. This is the case for the classes HTMLSelectElementImpl and HTMLFormElementImpl of the HTML DOM. <P> While we have a direct reference to the first child, the last child is stored as the previous sibling of the first child. First child nodes are marked as being so, and getNextSibling hides this fact. <P>Note: Not all parent nodes actually need to also be a child. At some point we used to have ParentNode inheriting from NodeImpl and another class called ChildAndParentNode that inherited from ChildNode. But due to the lack of multiple inheritance a lot of code had to be duplicated which led to a maintenance nightmare. At the same time only a few nodes (Document, DocumentFragment, Entity, and Attribute) cannot be a child so the gain in memory wasn't really worth it. The only type for which this would be the case is Attribute, but we deal with there in another special way, so this is not applicable. <p> This class doesn't directly support mutation events, however, it notifies the document when mutations are performed so that the document class do so. * <p><b>WARNING</b>: Some of the code here is partially duplicated in AttrImpl, be careful to keep these two classes in sync! * @xerces.internal * @author Arnaud Le Hors, IBM @author Joe Kesselman, IBM @author Andy Clark, IBM @version $Id: ParentNode.java 724081 2008-12-07 05:46:26Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ParentNode	TokenNameIdentifier	 Parent Node
extends	TokenNameextends	
ChildNode	TokenNameIdentifier	 Child Node
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2815829867152120872L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Owner document. */	TokenNameCOMMENT_JAVADOC	 Owner document. 
protected	TokenNameprotected	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
;	TokenNameSEMICOLON	
/** First child. */	TokenNameCOMMENT_JAVADOC	 First child. 
protected	TokenNameprotected	
ChildNode	TokenNameIdentifier	 Child Node
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// transients 	TokenNameCOMMENT_LINE	transients 
/** NodeList cache */	TokenNameCOMMENT_JAVADOC	 NodeList cache 
protected	TokenNameprotected	
transient	TokenNametransient	
NodeListCache	TokenNameIdentifier	 Node List Cache
fNodeListCache	TokenNameIdentifier	 f Node List Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * No public constructor; only subclasses of ParentNode should be * instantiated, and those normally via a Document's factory methods */	TokenNameCOMMENT_JAVADOC	 No public constructor; only subclasses of ParentNode should be instantiated, and those normally via a Document's factory methods 
protected	TokenNameprotected	
ParentNode	TokenNameIdentifier	 Parent Node
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructor for serialization. */	TokenNameCOMMENT_JAVADOC	 Constructor for serialization. 
public	TokenNamepublic	
ParentNode	TokenNameIdentifier	 Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// NodeList methods 	TokenNameCOMMENT_LINE	NodeList methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns a duplicate of a given node. You can consider this a * generic "copy constructor" for nodes. The newly returned object should * be completely independent of the source object's subtree, so changes * in one after the clone has been made will not affect the other. * <p> * Example: Cloning a Text node will copy both the node and the text it * contains. * <p> * Example: Cloning something that has children -- Element or Attr, for * example -- will _not_ clone those children unless a "deep clone" * has been requested. A shallow clone of an Attr node will yield an * empty Attr of the same name. * <p> * NOTE: Clones will always be read/write, even if the node being cloned * is read-only, to permit applications using only the DOM API to obtain * editable copies of locked portions of the tree. */	TokenNameCOMMENT_JAVADOC	 Returns a duplicate of a given node. You can consider this a generic "copy constructor" for nodes. The newly returned object should be completely independent of the source object's subtree, so changes in one after the clone has been made will not affect the other. <p> Example: Cloning a Text node will copy both the node and the text it contains. <p> Example: Cloning something that has children -- Element or Attr, for example -- will _not_ clone those children unless a "deep clone" has been requested. A shallow clone of an Attr node will yield an empty Attr of the same name. <p> NOTE: Clones will always be read/write, even if the node being cloned is read-only, to permit applications using only the DOM API to obtain editable copies of locked portions of the tree. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ParentNode	TokenNameIdentifier	 Parent Node
newnode	TokenNameIdentifier	 newnode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ParentNode	TokenNameIdentifier	 Parent Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set owner document 	TokenNameCOMMENT_LINE	set owner document 
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
;	TokenNameSEMICOLON	
// Need to break the association w/ original kids 	TokenNameCOMMENT_LINE	Need to break the association w/ original kids 
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// invalidate cache for children NodeList 	TokenNameCOMMENT_LINE	invalidate cache for children NodeList 
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Then, if deep, clone the kids too. 	TokenNameCOMMENT_LINE	Then, if deep, clone the kids too. 
if	TokenNameif	
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
newnode	TokenNameIdentifier	 newnode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// cloneNode(boolean):Node 	TokenNameCOMMENT_LINE	cloneNode(boolean):Node 
/** * Find the Document that this Node belongs to (the document in * whose context the Node was created). The Node may or may not * currently be part of that Document's actual contents. */	TokenNameCOMMENT_JAVADOC	 Find the Document that this Node belongs to (the document in whose context the Node was created). The Node may or may not currently be part of that Document's actual contents. 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * same as above but returns internal type and this one is not overridden * by CoreDocumentImpl to return null */	TokenNameCOMMENT_JAVADOC	 same as above but returns internal type and this one is not overridden by CoreDocumentImpl to return null 
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM * set the ownerDocument of this node and its children */	TokenNameCOMMENT_JAVADOC	 NON-DOM set the ownerDocument of this node and its children 
protected	TokenNameprotected	
void	TokenNamevoid	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test whether this node has any children. Convenience shorthand * for (Node.getFirstChild()!=null) */	TokenNameCOMMENT_JAVADOC	 Test whether this node has any children. Convenience shorthand for (Node.getFirstChild()!=null) 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
firstChild	TokenNameIdentifier	 first Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtain a NodeList enumerating all children of this node. If there * are none, an (initially) empty NodeList is returned. * <p> * NodeLists are "live"; as children are added/removed the NodeList * will immediately reflect those changes. Also, the NodeList refers * to the actual nodes, so changes to those nodes made via the DOM tree * will be reflected in the NodeList and vice versa. * <p> * In this implementation, Nodes implement the NodeList interface and * provide their own getChildNodes() support. Other DOMs may solve this * differently. */	TokenNameCOMMENT_JAVADOC	 Obtain a NodeList enumerating all children of this node. If there are none, an (initially) empty NodeList is returned. <p> NodeLists are "live"; as children are added/removed the NodeList will immediately reflect those changes. Also, the NodeList refers to the actual nodes, so changes to those nodes made via the DOM tree will be reflected in the NodeList and vice versa. <p> In this implementation, Nodes implement the NodeList interface and provide their own getChildNodes() support. Other DOMs may solve this differently. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getChildNodes():NodeList 	TokenNameCOMMENT_LINE	getChildNodes():NodeList 
/** The first child of this Node, or null if none. */	TokenNameCOMMENT_JAVADOC	 The first child of this Node, or null if none. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstChild():Node 	TokenNameCOMMENT_LINE	getFirstChild():Node 
/** The last child of this Node, or null if none. */	TokenNameCOMMENT_JAVADOC	 The last child of this Node, or null if none. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChild():Node 	TokenNameCOMMENT_LINE	getLastChild():Node 
final	TokenNamefinal	
ChildNode	TokenNameIdentifier	 Child Node
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// last child is stored as the previous sibling of first child 	TokenNameCOMMENT_LINE	last child is stored as the previous sibling of first child 
return	TokenNamereturn	
firstChild	TokenNameIdentifier	 first Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// store lastChild as previous sibling of first child 	TokenNameCOMMENT_LINE	store lastChild as previous sibling of first child 
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Move one or more node(s) to our list of children. Note that this * implicitly removes them from their previous parent. * * @param newChild The Node to be moved to our subtree. As a * convenience feature, inserting a DocumentNode will instead insert * all its children. * * @param refChild Current child which newChild should be placed * immediately before. If refChild is null, the insertion occurs * after all existing Nodes, like appendChild(). * * @return newChild, in its new state (relocated, or emptied in the case of * DocumentNode.) * * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a * type that shouldn't be a child of this node, or if newChild is an * ancestor of this node. * * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a * different owner document than we do. * * @throws DOMException(NOT_FOUND_ERR) if refChild is not a child of * this node. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is * read-only. */	TokenNameCOMMENT_JAVADOC	 Move one or more node(s) to our list of children. Note that this implicitly removes them from their previous parent. * @param newChild The Node to be moved to our subtree. As a convenience feature, inserting a DocumentNode will instead insert all its children. * @param refChild Current child which newChild should be placed immediately before. If refChild is null, the insertion occurs after all existing Nodes, like appendChild(). * @return newChild, in its new state (relocated, or emptied in the case of DocumentNode.) * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a type that shouldn't be a child of this node, or if newChild is an ancestor of this node. * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a different owner document than we do. * @throws DOMException(NOT_FOUND_ERR) if refChild is not a child of this node. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is read-only. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
refChild	TokenNameIdentifier	 ref Child
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
// Tail-call; optimizer should be able to do good things with. 	TokenNameCOMMENT_LINE	Tail-call; optimizer should be able to do good things with. 
return	TokenNamereturn	
internalInsertBefore	TokenNameIdentifier	 internal Insert Before
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
refChild	TokenNameIdentifier	 ref Child
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insertBefore(Node,Node):Node 	TokenNameCOMMENT_LINE	insertBefore(Node,Node):Node 
/** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able * to control which mutation events are spawned. This version of the * insertBefore operation allows us to do so. It is not intended * for use by application programs. */	TokenNameCOMMENT_JAVADOC	 NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able to control which mutation events are spawned. This version of the insertBefore operation allows us to do so. It is not intended for use by application programs. 
Node	TokenNameIdentifier	 Node
internalInsertBefore	TokenNameIdentifier	 internal Insert Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
refChild	TokenNameIdentifier	 ref Child
,	TokenNameCOMMA	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
errorChecking	TokenNameIdentifier	 error Checking
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// SLOW BUT SAFE: We could insert the whole subtree without 	TokenNameCOMMENT_LINE	SLOW BUT SAFE: We could insert the whole subtree without 
// juggling so many next/previous pointers. (Wipe out the 	TokenNameCOMMENT_LINE	juggling so many next/previous pointers. (Wipe out the 
// parent's child-list, patch the parent pointers, set the 	TokenNameCOMMENT_LINE	parent's child-list, patch the parent pointers, set the 
// ends of the list.) But we know some subclasses have special- 	TokenNameCOMMENT_LINE	ends of the list.) But we know some subclasses have special- 
// case behavior they add to insertBefore(), so we don't risk it. 	TokenNameCOMMENT_LINE	case behavior they add to insertBefore(), so we don't risk it. 
// This approch also takes fewer bytecodes. 	TokenNameCOMMENT_LINE	This approch also takes fewer bytecodes. 
// NOTE: If one of the children is not a legal child of this 	TokenNameCOMMENT_LINE	NOTE: If one of the children is not a legal child of this 
// node, throw HIERARCHY_REQUEST_ERR before _any_ of the children 	TokenNameCOMMENT_LINE	node, throw HIERARCHY_REQUEST_ERR before _any_ of the children 
// have been transferred. (Alternative behaviors would be to 	TokenNameCOMMENT_LINE	have been transferred. (Alternative behaviors would be to 
// reparent up to the first failure point or reparent all those 	TokenNameCOMMENT_LINE	reparent up to the first failure point or reparent all those 
// which are acceptable to the target node, neither of which is 	TokenNameCOMMENT_LINE	which are acceptable to the target node, neither of which is 
// as robust. PR-DOM-0818 isn't entirely clear on which it 	TokenNameCOMMENT_LINE	as robust. PR-DOM-0818 isn't entirely clear on which it 
// recommends????? 	TokenNameCOMMENT_LINE	recommends????? 
// No need to check kids for right-document; if they weren't, 	TokenNameCOMMENT_LINE	No need to check kids for right-document; if they weren't, 
// they wouldn't be kids of that DocFrag. 	TokenNameCOMMENT_LINE	they wouldn't be kids of that DocFrag. 
if	TokenNameif	
(	TokenNameLPAREN	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Prescan 	TokenNameCOMMENT_LINE	Prescan 
kid	TokenNameIdentifier	 kid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
isKidOK	TokenNameIdentifier	 is Kid OK
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"HIERARCHY_REQUEST_ERR"	TokenNameStringLiteral	HIERARCHY_REQUEST_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
refChild	TokenNameIdentifier	 ref Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
==	TokenNameEQUAL_EQUAL	
refChild	TokenNameIdentifier	 ref Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// stupid case that must be handled as a no-op triggering events... 	TokenNameCOMMENT_LINE	stupid case that must be handled as a no-op triggering events... 
refChild	TokenNameIdentifier	 ref Child
=	TokenNameEQUAL	
refChild	TokenNameIdentifier	 ref Child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
refChild	TokenNameIdentifier	 ref Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
&&	TokenNameAND_AND	
newChild	TokenNameIdentifier	 new Child
!=	TokenNameNOT_EQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
isKidOK	TokenNameIdentifier	 is Kid OK
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"HIERARCHY_REQUEST_ERR"	TokenNameStringLiteral	HIERARCHY_REQUEST_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// refChild must be a child of this node (or null) 	TokenNameCOMMENT_LINE	refChild must be a child of this node (or null) 
if	TokenNameif	
(	TokenNameLPAREN	
refChild	TokenNameIdentifier	 ref Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
refChild	TokenNameIdentifier	 ref Child
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Prevent cycles in the tree 	TokenNameCOMMENT_LINE	Prevent cycles in the tree 
// newChild cannot be ancestor of this Node, 	TokenNameCOMMENT_LINE	newChild cannot be ancestor of this Node, 
// and actually cannot be this 	TokenNameCOMMENT_LINE	and actually cannot be this 
boolean	TokenNameboolean	
treeSafe	TokenNameIdentifier	 tree Safe
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
treeSafe	TokenNameIdentifier	 tree Safe
&&	TokenNameAND_AND	
a	TokenNameIdentifier	 a
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
treeSafe	TokenNameIdentifier	 tree Safe
=	TokenNameEQUAL	
newChild	TokenNameIdentifier	 new Child
!=	TokenNameNOT_EQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
treeSafe	TokenNameIdentifier	 tree Safe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"HIERARCHY_REQUEST_ERR"	TokenNameStringLiteral	HIERARCHY_REQUEST_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
insertingNode	TokenNameIdentifier	 inserting Node
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Convert to internal type, to avoid repeated casting 	TokenNameCOMMENT_LINE	Convert to internal type, to avoid repeated casting 
ChildNode	TokenNameIdentifier	 Child Node
newInternal	TokenNameIdentifier	 new Internal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
oldparent	TokenNameIdentifier	 oldparent
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldparent	TokenNameIdentifier	 oldparent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldparent	TokenNameIdentifier	 oldparent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
newInternal	TokenNameIdentifier	 new Internal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Convert to internal type, to avoid repeated casting 	TokenNameCOMMENT_LINE	Convert to internal type, to avoid repeated casting 
ChildNode	TokenNameIdentifier	 Child Node
refInternal	TokenNameIdentifier	 ref Internal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
refChild	TokenNameIdentifier	 ref Child
;	TokenNameSEMICOLON	
// Attach up 	TokenNameCOMMENT_LINE	Attach up 
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Attach before and after 	TokenNameCOMMENT_LINE	Attach before and after 
// Note: firstChild.previousSibling == lastChild!! 	TokenNameCOMMENT_LINE	Note: firstChild.previousSibling == lastChild!! 
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this our first and only child 	TokenNameCOMMENT_LINE	this our first and only child 
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refInternal	TokenNameIdentifier	 ref Internal
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this is an append 	TokenNameCOMMENT_LINE	this is an append 
ChildNode	TokenNameIdentifier	 Child Node
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
lastChild	TokenNameIdentifier	 last Child
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this is an insert 	TokenNameCOMMENT_LINE	this is an insert 
if	TokenNameif	
(	TokenNameLPAREN	
refChild	TokenNameIdentifier	 ref Child
==	TokenNameEQUAL_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// at the head of the list 	TokenNameCOMMENT_LINE	at the head of the list 
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// somewhere in the middle 	TokenNameCOMMENT_LINE	somewhere in the middle 
ChildNode	TokenNameIdentifier	 Child Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
refInternal	TokenNameIdentifier	 ref Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
refInternal	TokenNameIdentifier	 ref Internal
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
refInternal	TokenNameIdentifier	 ref Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
newInternal	TokenNameIdentifier	 new Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
changed	TokenNameIdentifier	 changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update cached length if we have any 	TokenNameCOMMENT_LINE	update cached length if we have any 
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fLength	TokenNameIdentifier	 f Length
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fLength	TokenNameIdentifier	 f Length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we happen to insert just before the cached node, update 	TokenNameCOMMENT_LINE	if we happen to insert just before the cached node, update 
// the cache to the new node to match the cached index 	TokenNameCOMMENT_LINE	the cache to the new node to match the cached index 
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChild	TokenNameIdentifier	 f Child
==	TokenNameEQUAL_EQUAL	
refInternal	TokenNameIdentifier	 ref Internal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChild	TokenNameIdentifier	 f Child
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// otherwise just invalidate the cache 	TokenNameCOMMENT_LINE	otherwise just invalidate the cache 
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
insertedNode	TokenNameIdentifier	 inserted Node
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
newInternal	TokenNameIdentifier	 new Internal
,	TokenNameCOMMA	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkNormalizationAfterInsert	TokenNameIdentifier	 check Normalization After Insert
(	TokenNameLPAREN	
newInternal	TokenNameIdentifier	 new Internal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// internalInsertBefore(Node,Node,boolean):Node 	TokenNameCOMMENT_LINE	internalInsertBefore(Node,Node,boolean):Node 
/** * Remove a child from this Node. The removed child's subtree * remains intact so it may be re-inserted elsewhere. * * @return oldChild, in its new state (removed). * * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of * this node. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is * read-only. */	TokenNameCOMMENT_JAVADOC	 Remove a child from this Node. The removed child's subtree remains intact so it may be re-inserted elsewhere. * @return oldChild, in its new state (removed). * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of this node. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is read-only. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
// Tail-call, should be optimizable 	TokenNameCOMMENT_LINE	Tail-call, should be optimizable 
return	TokenNamereturn	
internalRemoveChild	TokenNameIdentifier	 internal Remove Child
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removeChild(Node) :Node 	TokenNameCOMMENT_LINE	removeChild(Node) :Node 
/** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able * to control which mutation events are spawned. This version of the * removeChild operation allows us to do so. It is not intended * for use by application programs. */	TokenNameCOMMENT_JAVADOC	 NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able to control which mutation events are spawned. This version of the removeChild operation allows us to do so. It is not intended for use by application programs. 
Node	TokenNameIdentifier	 Node
internalRemoveChild	TokenNameIdentifier	 internal Remove Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
oldChild	TokenNameIdentifier	 old Child
,	TokenNameCOMMA	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
oldChild	TokenNameIdentifier	 old Child
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ChildNode	TokenNameIdentifier	 Child Node
oldInternal	TokenNameIdentifier	 old Internal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
oldChild	TokenNameIdentifier	 old Child
;	TokenNameSEMICOLON	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
removingNode	TokenNameIdentifier	 removing Node
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
oldInternal	TokenNameIdentifier	 old Internal
,	TokenNameCOMMA	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update cached length if we have any 	TokenNameCOMMENT_LINE	update cached length if we have any 
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fLength	TokenNameIdentifier	 f Length
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fLength	TokenNameIdentifier	 f Length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the removed node is the cached node 	TokenNameCOMMENT_LINE	if the removed node is the cached node 
// move the cache to its (soon former) previous sibling 	TokenNameCOMMENT_LINE	move the cache to its (soon former) previous sibling 
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChild	TokenNameIdentifier	 f Child
==	TokenNameEQUAL_EQUAL	
oldInternal	TokenNameIdentifier	 old Internal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChild	TokenNameIdentifier	 f Child
=	TokenNameEQUAL	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// otherwise just invalidate the cache 	TokenNameCOMMENT_LINE	otherwise just invalidate the cache 
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Patch linked list around oldChild 	TokenNameCOMMENT_LINE	Patch linked list around oldChild 
// Note: lastChild == firstChild.previousSibling 	TokenNameCOMMENT_LINE	Note: lastChild == firstChild.previousSibling 
if	TokenNameif	
(	TokenNameLPAREN	
oldInternal	TokenNameIdentifier	 old Internal
==	TokenNameEQUAL_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// removing first child 	TokenNameCOMMENT_LINE	removing first child 
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ChildNode	TokenNameIdentifier	 Child Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// removing last child 	TokenNameCOMMENT_LINE	removing last child 
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// removing some other child in the middle 	TokenNameCOMMENT_LINE	removing some other child in the middle 
next	TokenNameIdentifier	 next
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Save previous sibling for normalization checking. 	TokenNameCOMMENT_LINE	Save previous sibling for normalization checking. 
ChildNode	TokenNameIdentifier	 Child Node
oldPreviousSibling	TokenNameIdentifier	 old Previous Sibling
=	TokenNameEQUAL	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove oldInternal's references to tree 	TokenNameCOMMENT_LINE	Remove oldInternal's references to tree 
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
;	TokenNameSEMICOLON	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
changed	TokenNameIdentifier	 changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
removedNode	TokenNameIdentifier	 removed Node
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkNormalizationAfterRemove	TokenNameIdentifier	 check Normalization After Remove
(	TokenNameLPAREN	
oldPreviousSibling	TokenNameIdentifier	 old Previous Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldInternal	TokenNameIdentifier	 old Internal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// internalRemoveChild(Node,boolean):Node 	TokenNameCOMMENT_LINE	internalRemoveChild(Node,boolean):Node 
/** * Make newChild occupy the location that oldChild used to * have. Note that newChild will first be removed from its previous * parent, if any. Equivalent to inserting newChild before oldChild, * then removing oldChild. * * @return oldChild, in its new state (removed). * * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a * type that shouldn't be a child of this node, or if newChild is * one of our ancestors. * * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a * different owner document than we do. * * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of * this node. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is * read-only. */	TokenNameCOMMENT_JAVADOC	 Make newChild occupy the location that oldChild used to have. Note that newChild will first be removed from its previous parent, if any. Equivalent to inserting newChild before oldChild, then removing oldChild. * @return oldChild, in its new state (removed). * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a type that shouldn't be a child of this node, or if newChild is one of our ancestors. * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a different owner document than we do. * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of this node. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is read-only. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
// If Mutation Events are being generated, this operation might 	TokenNameCOMMENT_LINE	If Mutation Events are being generated, this operation might 
// throw aggregate events twice when modifying an Attr -- once 	TokenNameCOMMENT_LINE	throw aggregate events twice when modifying an Attr -- once 
// on insertion and once on removal. DOM Level 2 does not specify 	TokenNameCOMMENT_LINE	on insertion and once on removal. DOM Level 2 does not specify 
// this as either desirable or undesirable, but hints that 	TokenNameCOMMENT_LINE	this as either desirable or undesirable, but hints that 
// aggregations should be issued only once per user request. 	TokenNameCOMMENT_LINE	aggregations should be issued only once per user request. 
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
replacingNode	TokenNameIdentifier	 replacing Node
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
internalInsertBefore	TokenNameIdentifier	 internal Insert Before
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
oldChild	TokenNameIdentifier	 old Child
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
!=	TokenNameNOT_EQUAL	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internalRemoveChild	TokenNameIdentifier	 internal Remove Child
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
replacedNode	TokenNameIdentifier	 replaced Node
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldChild	TokenNameIdentifier	 old Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Get Node text content * @since DOM Level 3 */	TokenNameCOMMENT_BLOCK	 Get Node text content @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasTextContent	TokenNameIdentifier	 has Text Content
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// internal method taking a StringBuffer in parameter 	TokenNameCOMMENT_LINE	internal method taking a StringBuffer in parameter 
void	TokenNamevoid	
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasTextContent	TokenNameIdentifier	 has Text Content
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// internal method returning whether to take the given node's text content 	TokenNameCOMMENT_LINE	internal method returning whether to take the given node's text content 
final	TokenNamefinal	
boolean	TokenNameboolean	
hasTextContent	TokenNameIdentifier	 has Text Content
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
&&	TokenNameAND_AND	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TextImpl	TokenNameIdentifier	 Text Impl
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
isIgnorableWhitespace	TokenNameIdentifier	 is Ignorable Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Set Node text content * @since DOM Level 3 */	TokenNameCOMMENT_BLOCK	 Set Node text content @since DOM Level 3 
public	TokenNamepublic	
void	TokenNamevoid	
setTextContent	TokenNameIdentifier	 set Text Content
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
textContent	TokenNameIdentifier	 text Content
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
// get rid of any existing children 	TokenNameCOMMENT_LINE	get rid of any existing children 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create a Text node to hold the given content 	TokenNameCOMMENT_LINE	create a Text node to hold the given content 
if	TokenNameif	
(	TokenNameLPAREN	
textContent	TokenNameIdentifier	 text Content
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
textContent	TokenNameIdentifier	 text Content
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
textContent	TokenNameIdentifier	 text Content
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// NodeList methods 	TokenNameCOMMENT_LINE	NodeList methods 
// 	TokenNameCOMMENT_LINE	 
/** * Count the immediate children of this node. Use to implement * NodeList.getLength(). * @return int */	TokenNameCOMMENT_JAVADOC	 Count the immediate children of this node. Use to implement NodeList.getLength(). @return int 
private	TokenNameprivate	
int	TokenNameint	
nodeListGetLength	TokenNameIdentifier	 node List Get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get rid of trivial cases 	TokenNameCOMMENT_LINE	get rid of trivial cases 
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
==	TokenNameEQUAL_EQUAL	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// otherwise request a cache object 	TokenNameCOMMENT_LINE	otherwise request a cache object 
fNodeListCache	TokenNameIdentifier	 f Node List Cache
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeListCache	TokenNameIdentifier	 get Node List Cache
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fLength	TokenNameIdentifier	 f Length
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is the cached length invalid ? 	TokenNameCOMMENT_LINE	is the cached length invalid ? 
int	TokenNameint	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
// start from the cached node if we have one 	TokenNameCOMMENT_LINE	start from the cached node if we have one 
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChild	TokenNameIdentifier	 f Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChild	TokenNameIdentifier	 f Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// nodeListGetLength():int 	TokenNameCOMMENT_LINE	nodeListGetLength():int 
/** * NodeList method: Count the immediate children of this node * @return int */	TokenNameCOMMENT_JAVADOC	 NodeList method: Count the immediate children of this node @return int 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeListGetLength	TokenNameIdentifier	 node List Get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the Nth immediate child of this node, or null if the index is * out of bounds. Use to implement NodeList.item(). * @param index int */	TokenNameCOMMENT_JAVADOC	 Return the Nth immediate child of this node, or null if the index is out of bounds. Use to implement NodeList.item(). @param index int 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
nodeListItem	TokenNameIdentifier	 node List Item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get rid of trivial case 	TokenNameCOMMENT_LINE	get rid of trivial case 
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
==	TokenNameEQUAL_EQUAL	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
firstChild	TokenNameIdentifier	 first Child
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// otherwise request a cache object 	TokenNameCOMMENT_LINE	otherwise request a cache object 
fNodeListCache	TokenNameIdentifier	 f Node List Cache
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeListCache	TokenNameIdentifier	 get Node List Cache
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChild	TokenNameIdentifier	 f Child
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
firstAccess	TokenNameIdentifier	 first Access
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// short way 	TokenNameCOMMENT_LINE	short way 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstAccess	TokenNameIdentifier	 first Access
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
index	TokenNameIdentifier	 index
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
index	TokenNameIdentifier	 index
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// long way 	TokenNameCOMMENT_LINE	long way 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
index	TokenNameIdentifier	 index
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// release cache if reaching last child or first child 	TokenNameCOMMENT_LINE	release cache if reaching last child or first child 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
firstAccess	TokenNameIdentifier	 first Access
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
firstChild	TokenNameIdentifier	 first Child
||	TokenNameOR_OR	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChild	TokenNameIdentifier	 f Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
freeNodeListCache	TokenNameIdentifier	 free Node List Cache
(	TokenNameLPAREN	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we can keep using the cache until it is actually reused 	TokenNameCOMMENT_LINE	we can keep using the cache until it is actually reused 
// fNodeListCache will be nulled by the pool (document) if that 	TokenNameCOMMENT_LINE	fNodeListCache will be nulled by the pool (document) if that 
// happens. 	TokenNameCOMMENT_LINE	happens. 
// fNodeListCache = null; 	TokenNameCOMMENT_LINE	fNodeListCache = null; 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// otherwise update it 	TokenNameCOMMENT_LINE	otherwise update it 
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChildIndex	TokenNameIdentifier	 f Child Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
fNodeListCache	TokenNameIdentifier	 f Node List Cache
.	TokenNameDOT	
fChild	TokenNameIdentifier	 f Child
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// nodeListItem(int):Node 	TokenNameCOMMENT_LINE	nodeListItem(int):Node 
/** * NodeList method: Return the Nth immediate child of this node, or * null if the index is out of bounds. * @return org.w3c.dom.Node * @param index int */	TokenNameCOMMENT_JAVADOC	 NodeList method: Return the Nth immediate child of this node, or null if the index is out of bounds. @return org.w3c.dom.Node @param index int 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeListItem	TokenNameIdentifier	 node List Item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// item(int):Node 	TokenNameCOMMENT_LINE	item(int):Node 
/** * Create a NodeList to access children that is use by subclass elements * that have methods named getLength() or item(int). ChildAndParentNode * optimizes getChildNodes() by implementing NodeList itself. However if * a subclass Element implements methods with the same name as the NodeList * methods, they will override the actually methods in this class. * <p> * To use this method, the subclass should implement getChildNodes() and * have it call this method. The resulting NodeList instance maybe * shared and cached in a transient field, but the cached value must be * cleared if the node is cloned. */	TokenNameCOMMENT_JAVADOC	 Create a NodeList to access children that is use by subclass elements that have methods named getLength() or item(int). ChildAndParentNode optimizes getChildNodes() by implementing NodeList itself. However if a subclass Element implements methods with the same name as the NodeList methods, they will override the actually methods in this class. <p> To use this method, the subclass should implement getChildNodes() and have it call this method. The resulting NodeList instance maybe shared and cached in a transient field, but the cached value must be cleared if the node is cloned. 
protected	TokenNameprotected	
final	TokenNamefinal	
NodeList	TokenNameIdentifier	 Node List
getChildNodesUnoptimized	TokenNameIdentifier	 get Child Nodes Unoptimized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NodeList	TokenNameIdentifier	 Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** * @see NodeList.getLength() */	TokenNameCOMMENT_JAVADOC	 @see NodeList.getLength() 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeListGetLength	TokenNameIdentifier	 node List Get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLength():int 	TokenNameCOMMENT_LINE	getLength():int 
/** * @see NodeList.item(int) */	TokenNameCOMMENT_JAVADOC	 @see NodeList.item(int) 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeListItem	TokenNameIdentifier	 node List Item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// item(int):Node 	TokenNameCOMMENT_LINE	item(int):Node 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getChildNodesUnoptimized():NodeList 	TokenNameCOMMENT_LINE	getChildNodesUnoptimized():NodeList 
// 	TokenNameCOMMENT_LINE	 
// DOM2: methods, getters, setters 	TokenNameCOMMENT_LINE	DOM2: methods, getters, setters 
// 	TokenNameCOMMENT_LINE	 
/** * Override default behavior to call normalize() on this Node's * children. It is up to implementors or Node to override normalize() * to take action. */	TokenNameCOMMENT_JAVADOC	 Override default behavior to call normalize() on this Node's children. It is up to implementors or Node to override normalize() to take action. 
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No need to normalize if already normalized. 	TokenNameCOMMENT_LINE	No need to normalize if already normalized. 
if	TokenNameif	
(	TokenNameLPAREN	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ChildNode	TokenNameIdentifier	 Child Node
kid	TokenNameIdentifier	 kid
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Level 3 WD- Experimental. * Override inherited behavior from NodeImpl to support deep equal. */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD- Experimental. Override inherited behavior from NodeImpl to support deep equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// there are many ways to do this test, and there isn't any way 	TokenNameCOMMENT_LINE	there are many ways to do this test, and there isn't any way 
// better than another. Performance may vary greatly depending on 	TokenNameCOMMENT_LINE	better than another. Performance may vary greatly depending on 
// the implementations involved. This one should work fine for us. 	TokenNameCOMMENT_LINE	the implementations involved. This one should work fine for us. 
Node	TokenNameIdentifier	 Node
child1	TokenNameIdentifier	 child1
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
child2	TokenNameIdentifier	 child2
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child1	TokenNameIdentifier	 child1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
child2	TokenNameIdentifier	 child2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
child1	TokenNameIdentifier	 child1
.	TokenNameDOT	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
child2	TokenNameIdentifier	 child2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child1	TokenNameIdentifier	 child1
=	TokenNameEQUAL	
child1	TokenNameIdentifier	 child1
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child2	TokenNameIdentifier	 child2
=	TokenNameEQUAL	
child2	TokenNameIdentifier	 child2
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child1	TokenNameIdentifier	 child1
!=	TokenNameNOT_EQUAL	
child2	TokenNameIdentifier	 child2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Override default behavior so that if deep is true, children are also * toggled. * @see Node * <P> * Note: this will not change the state of an EntityReference or its * children, which are always read-only. */	TokenNameCOMMENT_JAVADOC	 Override default behavior so that if deep is true, children are also toggled. @see Node <P> Note: this will not change the state of an EntityReference or its children, which are always read-only. 
public	TokenNamepublic	
void	TokenNamevoid	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Recursively set kids 	TokenNameCOMMENT_LINE	Recursively set kids 
for	TokenNamefor	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
mykid	TokenNameIdentifier	 mykid
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
mykid	TokenNameIdentifier	 mykid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mykid	TokenNameIdentifier	 mykid
=	TokenNameEQUAL	
mykid	TokenNameIdentifier	 mykid
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mykid	TokenNameIdentifier	 mykid
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mykid	TokenNameIdentifier	 mykid
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setReadOnly(boolean,boolean) 	TokenNameCOMMENT_LINE	setReadOnly(boolean,boolean) 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** * Override this method in subclass to hook in efficient * internal data structure. */	TokenNameCOMMENT_JAVADOC	 Override this method in subclass to hook in efficient internal data structure. 
protected	TokenNameprotected	
void	TokenNamevoid	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// By default just change the flag to avoid calling this method again 	TokenNameCOMMENT_LINE	By default just change the flag to avoid calling this method again 
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks the normalized state of this node after inserting a child. * If the inserted child causes this node to be unnormalized, then this * node is flagged accordingly. * The conditions for changing the normalized state are: * <ul> * <li>The inserted child is a text node and one of its adjacent siblings * is also a text node. * <li>The inserted child is is itself unnormalized. * </ul> * * @param insertedChild the child node that was inserted into this node * * @throws NullPointerException if the inserted child is <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Checks the normalized state of this node after inserting a child. If the inserted child causes this node to be unnormalized, then this node is flagged accordingly. The conditions for changing the normalized state are: <ul> <li>The inserted child is a text node and one of its adjacent siblings is also a text node. <li>The inserted child is is itself unnormalized. </ul> * @param insertedChild the child node that was inserted into this node * @throws NullPointerException if the inserted child is <code>null</code> 
void	TokenNamevoid	
checkNormalizationAfterInsert	TokenNameIdentifier	 check Normalization After Insert
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
insertedChild	TokenNameIdentifier	 inserted Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See if insertion caused this node to be unnormalized. 	TokenNameCOMMENT_LINE	See if insertion caused this node to be unnormalized. 
if	TokenNameif	
(	TokenNameLPAREN	
insertedChild	TokenNameIdentifier	 inserted Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChildNode	TokenNameIdentifier	 Child Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
insertedChild	TokenNameIdentifier	 inserted Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
insertedChild	TokenNameIdentifier	 inserted Child
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
// If an adjacent sibling of the new child is a text node, 	TokenNameCOMMENT_LINE	If an adjacent sibling of the new child is a text node, 
// flag this node as unnormalized. 	TokenNameCOMMENT_LINE	flag this node as unnormalized. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// If the new child is not normalized, 	TokenNameCOMMENT_LINE	If the new child is not normalized, 
// then this node is inherently not normalized. 	TokenNameCOMMENT_LINE	then this node is inherently not normalized. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
insertedChild	TokenNameIdentifier	 inserted Child
.	TokenNameDOT	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// checkNormalizationAfterInsert(ChildNode) 	TokenNameCOMMENT_LINE	checkNormalizationAfterInsert(ChildNode) 
/** * Checks the normalized of this node after removing a child. * If the removed child causes this node to be unnormalized, then this * node is flagged accordingly. * The conditions for changing the normalized state are: * <ul> * <li>The removed child had two adjacent siblings that were text nodes. * </ul> * * @param previousSibling the previous sibling of the removed child, or * <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Checks the normalized of this node after removing a child. If the removed child causes this node to be unnormalized, then this node is flagged accordingly. The conditions for changing the normalized state are: <ul> <li>The removed child had two adjacent siblings that were text nodes. </ul> * @param previousSibling the previous sibling of the removed child, or <code>null</code> 
void	TokenNamevoid	
checkNormalizationAfterRemove	TokenNameIdentifier	 check Normalization After Remove
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
previousSibling	TokenNameIdentifier	 previous Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See if removal caused this node to be unnormalized. 	TokenNameCOMMENT_LINE	See if removal caused this node to be unnormalized. 
// If the adjacent siblings of the removed child were both text nodes, 	TokenNameCOMMENT_LINE	If the adjacent siblings of the removed child were both text nodes, 
// flag this node as unnormalized. 	TokenNameCOMMENT_LINE	flag this node as unnormalized. 
if	TokenNameif	
(	TokenNameLPAREN	
previousSibling	TokenNameIdentifier	 previous Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
previousSibling	TokenNameIdentifier	 previous Sibling
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChildNode	TokenNameIdentifier	 Child Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
previousSibling	TokenNameIdentifier	 previous Sibling
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// checkNormalizationAfterRemove(Node) 	TokenNameCOMMENT_LINE	checkNormalizationAfterRemove(Node) 
// 	TokenNameCOMMENT_LINE	 
// Serialization methods 	TokenNameCOMMENT_LINE	Serialization methods 
// 	TokenNameCOMMENT_LINE	 
/** Serialize object. */	TokenNameCOMMENT_JAVADOC	 Serialize object. 
private	TokenNameprivate	
void	TokenNamevoid	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// synchronize chilren 	TokenNameCOMMENT_LINE	synchronize chilren 
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// write object 	TokenNameCOMMENT_LINE	write object 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
defaultWriteObject	TokenNameIdentifier	 default Write Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// writeObject(ObjectOutputStream) 	TokenNameCOMMENT_LINE	writeObject(ObjectOutputStream) 
/** Deserialize object. */	TokenNameCOMMENT_JAVADOC	 Deserialize object. 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
ois	TokenNameIdentifier	 ois
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// perform default deseralization 	TokenNameCOMMENT_LINE	perform default deseralization 
ois	TokenNameIdentifier	 ois
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hardset synchildren - so we don't try to sync - it does not make any 	TokenNameCOMMENT_LINE	hardset synchildren - so we don't try to sync - it does not make any 
// sense to try to synchildren when we just deserialize object. 	TokenNameCOMMENT_LINE	sense to try to synchildren when we just deserialize object. 
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// readObject(ObjectInputStream) 	TokenNameCOMMENT_LINE	readObject(ObjectInputStream) 
/* * a class to store some user data along with its handler */	TokenNameCOMMENT_BLOCK	 a class to store some user data along with its handler 
class	TokenNameclass	
UserDataRecord	TokenNameIdentifier	 User Data Record
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3258126977134310455L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
fData	TokenNameIdentifier	 f Data
;	TokenNameSEMICOLON	
UserDataHandler	TokenNameIdentifier	 User Data Handler
fHandler	TokenNameIdentifier	 f Handler
;	TokenNameSEMICOLON	
UserDataRecord	TokenNameIdentifier	 User Data Record
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
UserDataHandler	TokenNameIdentifier	 User Data Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fData	TokenNameIdentifier	 f Data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
fHandler	TokenNameIdentifier	 f Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class ParentNode 	TokenNameCOMMENT_LINE	class ParentNode 
