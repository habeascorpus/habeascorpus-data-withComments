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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
DocumentType	TokenNameIdentifier	 Document Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Event	TokenNameIdentifier	 Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
EventListener	TokenNameIdentifier	 Event Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
EventTarget	TokenNameIdentifier	 Event Target
;	TokenNameSEMICOLON	
/** * NodeImpl provides the basic structure of a DOM tree. It is never used * directly, but instead is subclassed to add type and data * information, and additional methods, appropriate to each node of * the tree. Only its subclasses should be instantiated -- and those, * with the exception of Document itself, only through a specific * Document's factory methods. * <P> * The Node interface provides shared behaviors such as siblings and * children, both for consistancy and so that the most common tree * operations may be performed without constantly having to downcast * to specific node types. When there is no obvious mapping for one of * these queries, it will respond with null. * Note that the default behavior is that children are forbidden. To * permit them, the subclass ParentNode overrides several methods. * <P> * NodeImpl also implements NodeList, so it can return itself in * response to the getChildNodes() query. This eliminiates the need * for a separate ChildNodeList object. Note that this is an * IMPLEMENTATION DETAIL; applications should _never_ assume that * this identity exists. * <P> * All nodes in a single document must originate * in that document. (Note that this is much tighter than "must be * same implementation") Nodes are all aware of their ownerDocument, * and attempts to mismatch will throw WRONG_DOCUMENT_ERR. * <P> * However, to save memory not all nodes always have a direct reference * to their ownerDocument. When a node is owned by another node it relies * on its owner to store its ownerDocument. Parent nodes always store it * though, so there is never more than one level of indirection. * And when a node doesn't have an owner, ownerNode refers to its * ownerDocument. * <p> * This class doesn't directly support mutation events, however, it still * implements the EventTarget interface and forward all related calls to the * document so that the document class do so. * * @xerces.internal * * @author Arnaud Le Hors, IBM * @author Joe Kesselman, IBM * @version $Id: NodeImpl.java 814769 2009-09-14 18:25:54Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 NodeImpl provides the basic structure of a DOM tree. It is never used directly, but instead is subclassed to add type and data information, and additional methods, appropriate to each node of the tree. Only its subclasses should be instantiated -- and those, with the exception of Document itself, only through a specific Document's factory methods. <P> The Node interface provides shared behaviors such as siblings and children, both for consistancy and so that the most common tree operations may be performed without constantly having to downcast to specific node types. When there is no obvious mapping for one of these queries, it will respond with null. Note that the default behavior is that children are forbidden. To permit them, the subclass ParentNode overrides several methods. <P> NodeImpl also implements NodeList, so it can return itself in response to the getChildNodes() query. This eliminiates the need for a separate ChildNodeList object. Note that this is an IMPLEMENTATION DETAIL; applications should _never_ assume that this identity exists. <P> All nodes in a single document must originate in that document. (Note that this is much tighter than "must be same implementation") Nodes are all aware of their ownerDocument, and attempts to mismatch will throw WRONG_DOCUMENT_ERR. <P> However, to save memory not all nodes always have a direct reference to their ownerDocument. When a node is owned by another node it relies on its owner to store its ownerDocument. Parent nodes always store it though, so there is never more than one level of indirection. And when a node doesn't have an owner, ownerNode refers to its ownerDocument. <p> This class doesn't directly support mutation events, however, it still implements the EventTarget interface and forward all related calls to the document so that the document class do so. * @xerces.internal * @author Arnaud Le Hors, IBM @author Joe Kesselman, IBM @version $Id: NodeImpl.java 814769 2009-09-14 18:25:54Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
NodeImpl	TokenNameIdentifier	 Node Impl
implements	TokenNameimplements	
Node	TokenNameIdentifier	 Node
,	TokenNameCOMMA	
NodeList	TokenNameIdentifier	 Node List
,	TokenNameCOMMA	
EventTarget	TokenNameIdentifier	 Event Target
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// TreePosition Constants. 	TokenNameCOMMENT_LINE	TreePosition Constants. 
// Taken from DOM L3 Node interface. 	TokenNameCOMMENT_LINE	Taken from DOM L3 Node interface. 
/** * The node precedes the reference node. */	TokenNameCOMMENT_JAVADOC	 The node precedes the reference node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TREE_POSITION_PRECEDING	TokenNameIdentifier	 TREE  POSITION  PRECEDING
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node follows the reference node. */	TokenNameCOMMENT_JAVADOC	 The node follows the reference node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TREE_POSITION_FOLLOWING	TokenNameIdentifier	 TREE  POSITION  FOLLOWING
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is an ancestor of the reference node. */	TokenNameCOMMENT_JAVADOC	 The node is an ancestor of the reference node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TREE_POSITION_ANCESTOR	TokenNameIdentifier	 TREE  POSITION  ANCESTOR
=	TokenNameEQUAL	
0x04	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a descendant of the reference node. */	TokenNameCOMMENT_JAVADOC	 The node is a descendant of the reference node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TREE_POSITION_DESCENDANT	TokenNameIdentifier	 TREE  POSITION  DESCENDANT
=	TokenNameEQUAL	
0x08	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The two nodes have an equivalent position. This is the case of two * attributes that have the same <code>ownerElement</code>, and two * nodes that are the same. */	TokenNameCOMMENT_JAVADOC	 The two nodes have an equivalent position. This is the case of two attributes that have the same <code>ownerElement</code>, and two nodes that are the same. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TREE_POSITION_EQUIVALENT	TokenNameIdentifier	 TREE  POSITION  EQUIVALENT
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The two nodes are the same. Two nodes that are the same have an * equivalent position, though the reverse may not be true. */	TokenNameCOMMENT_JAVADOC	 The two nodes are the same. Two nodes that are the same have an equivalent position, though the reverse may not be true. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TREE_POSITION_SAME_NODE	TokenNameIdentifier	 TREE  POSITION  SAME  NODE
=	TokenNameEQUAL	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The two nodes are disconnected, they do not have any common ancestor. * This is the case of two nodes that are not in the same document. */	TokenNameCOMMENT_JAVADOC	 The two nodes are disconnected, they do not have any common ancestor. This is the case of two nodes that are not in the same document. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TREE_POSITION_DISCONNECTED	TokenNameIdentifier	 TREE  POSITION  DISCONNECTED
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// DocumentPosition 	TokenNameCOMMENT_LINE	DocumentPosition 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOCUMENT_POSITION_DISCONNECTED	TokenNameIdentifier	 DOCUMENT  POSITION  DISCONNECTED
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
=	TokenNameEQUAL	
0x04	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOCUMENT_POSITION_CONTAINS	TokenNameIdentifier	 DOCUMENT  POSITION  CONTAINS
=	TokenNameEQUAL	
0x08	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOCUMENT_POSITION_IS_CONTAINED	TokenNameIdentifier	 DOCUMENT  POSITION  IS  CONTAINED
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
=	TokenNameEQUAL	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6316591992167219696L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// public 	TokenNameCOMMENT_LINE	public 
/** Element definition node type. */	TokenNameCOMMENT_JAVADOC	 Element definition node type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ELEMENT_DEFINITION_NODE	TokenNameIdentifier	 ELEMENT  DEFINITION  NODE
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// links 	TokenNameCOMMENT_LINE	links 
protected	TokenNameprotected	
NodeImpl	TokenNameIdentifier	 Node Impl
ownerNode	TokenNameIdentifier	 owner Node
;	TokenNameSEMICOLON	
// typically the parent but not always! 	TokenNameCOMMENT_LINE	typically the parent but not always! 
// data 	TokenNameCOMMENT_LINE	data 
protected	TokenNameprotected	
short	TokenNameshort	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
READONLY	TokenNameIdentifier	 READONLY
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
SYNCDATA	TokenNameIdentifier	 SYNCDATA
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
SYNCCHILDREN	TokenNameIdentifier	 SYNCCHILDREN
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
OWNED	TokenNameIdentifier	 OWNED
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
FIRSTCHILD	TokenNameIdentifier	 FIRSTCHILD
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
SPECIFIED	TokenNameIdentifier	 SPECIFIED
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
IGNORABLEWS	TokenNameIdentifier	 IGNORABLEWS
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
HASSTRING	TokenNameIdentifier	 HASSTRING
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
NORMALIZED	TokenNameIdentifier	 NORMALIZED
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
ID	TokenNameIdentifier	 ID
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * No public constructor; only subclasses of Node should be * instantiated, and those normally via a Document's factory methods * <p> * Every Node knows what Document it belongs to. */	TokenNameCOMMENT_JAVADOC	 No public constructor; only subclasses of Node should be instantiated, and those normally via a Document's factory methods <p> Every Node knows what Document it belongs to. 
protected	TokenNameprotected	
NodeImpl	TokenNameIdentifier	 Node Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// as long as we do not have any owner, ownerNode is our ownerDocument 	TokenNameCOMMENT_LINE	as long as we do not have any owner, ownerNode is our ownerDocument 
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(CoreDocumentImpl) 	TokenNameCOMMENT_LINE	<init>(CoreDocumentImpl) 
/** Constructor for serialization. */	TokenNameCOMMENT_JAVADOC	 Constructor for serialization. 
public	TokenNamepublic	
NodeImpl	TokenNameIdentifier	 Node Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
/** * A short integer indicating what type of node this is. The named * constants for this value are defined in the org.w3c.dom.Node interface. */	TokenNameCOMMENT_JAVADOC	 A short integer indicating what type of node this is. The named constants for this value are defined in the org.w3c.dom.Node interface. 
public	TokenNamepublic	
abstract	TokenNameabstract	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * the name of this node. */	TokenNameCOMMENT_JAVADOC	 the name of this node. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the node value. * @throws DOMException(DOMSTRING_SIZE_ERR) */	TokenNameCOMMENT_JAVADOC	 Returns the node value. @throws DOMException(DOMSTRING_SIZE_ERR) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// overridden in some subclasses 	TokenNameCOMMENT_LINE	overridden in some subclasses 
}	TokenNameRBRACE	
/** * Sets the node value. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) */	TokenNameCOMMENT_JAVADOC	 Sets the node value. @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
// Default behavior is to do nothing, overridden in some subclasses 	TokenNameCOMMENT_LINE	Default behavior is to do nothing, overridden in some subclasses 
}	TokenNameRBRACE	
/** * Adds a child node to the end of the list of children for this node. * Convenience shorthand for insertBefore(newChild,null). * @see #insertBefore(Node, Node) * <P> * By default we do not accept any children, ParentNode overrides this. * @see ParentNode * * @return newChild, in its new state (relocated, or emptied in the case of * DocumentNode.) * * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a * type that shouldn't be a child of this node. * * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a * different owner document than we do. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is * read-only. */	TokenNameCOMMENT_JAVADOC	 Adds a child node to the end of the list of children for this node. Convenience shorthand for insertBefore(newChild,null). @see #insertBefore(Node, Node) <P> By default we do not accept any children, ParentNode overrides this. @see ParentNode * @return newChild, in its new state (relocated, or emptied in the case of DocumentNode.) * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a type that shouldn't be a child of this node. * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a different owner document than we do. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is read-only. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a duplicate of a given node. You can consider this a * generic "copy constructor" for nodes. The newly returned object should * be completely independent of the source object's subtree, so changes * in one after the clone has been made will not affect the other. * <P> * Note: since we never have any children deep is meaningless here, * ParentNode overrides this behavior. * @see ParentNode * * <p> * Example: Cloning a Text node will copy both the node and the text it * contains. * <p> * Example: Cloning something that has children -- Element or Attr, for * example -- will _not_ clone those children unless a "deep clone" * has been requested. A shallow clone of an Attr node will yield an * empty Attr of the same name. * <p> * NOTE: Clones will always be read/write, even if the node being cloned * is read-only, to permit applications using only the DOM API to obtain * editable copies of locked portions of the tree. */	TokenNameCOMMENT_JAVADOC	 Returns a duplicate of a given node. You can consider this a generic "copy constructor" for nodes. The newly returned object should be completely independent of the source object's subtree, so changes in one after the clone has been made will not affect the other. <P> Note: since we never have any children deep is meaningless here, ParentNode overrides this behavior. @see ParentNode * <p> Example: Cloning a Text node will copy both the node and the text it contains. <p> Example: Cloning something that has children -- Element or Attr, for example -- will _not_ clone those children unless a "deep clone" has been requested. A shallow clone of an Attr node will yield an empty Attr of the same name. <p> NOTE: Clones will always be read/write, even if the node being cloned is read-only, to permit applications using only the DOM API to obtain editable copies of locked portions of the tree. 
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
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
newnode	TokenNameIdentifier	 newnode
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
newnode	TokenNameIdentifier	 newnode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
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
// if we get here we have an error in our program we may as well 	TokenNameCOMMENT_LINE	if we get here we have an error in our program we may as well 
// be vocal about it, so that people can take appropriate action. 	TokenNameCOMMENT_LINE	be vocal about it, so that people can take appropriate action. 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"**Internal Error**"	TokenNameStringLiteral	**Internal Error**
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Need to break the association w/ original kids 	TokenNameCOMMENT_LINE	Need to break the association w/ original kids 
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// By default we make all clones readwrite, 	TokenNameCOMMENT_LINE	By default we make all clones readwrite, 
// this is overriden in readonly subclasses 	TokenNameCOMMENT_LINE	this is overriden in readonly subclasses 
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
callUserDataHandlers	TokenNameIdentifier	 call User Data Handlers
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
newnode	TokenNameIdentifier	 newnode
,	TokenNameCOMMA	
UserDataHandler	TokenNameIdentifier	 User Data Handler
.	TokenNameDOT	
NODE_CLONED	TokenNameIdentifier	 NODE  CLONED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// if we have an owner simply forward the request 	TokenNameCOMMENT_LINE	if we have an owner simply forward the request 
// otherwise ownerNode is our ownerDocument 	TokenNameCOMMENT_LINE	otherwise ownerNode is our ownerDocument 
if	TokenNameif	
(	TokenNameLPAREN	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerNode	TokenNameIdentifier	 owner Node
.	TokenNameDOT	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
ownerNode	TokenNameIdentifier	 owner Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * same as above but returns internal type and this one is not overridden * by CoreDocumentImpl to return null */	TokenNameCOMMENT_JAVADOC	 same as above but returns internal type and this one is not overridden by CoreDocumentImpl to return null 
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we have an owner simply forward the request 	TokenNameCOMMENT_LINE	if we have an owner simply forward the request 
// otherwise ownerNode is our ownerDocument 	TokenNameCOMMENT_LINE	otherwise ownerNode is our ownerDocument 
if	TokenNameif	
(	TokenNameLPAREN	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerNode	TokenNameIdentifier	 owner Node
.	TokenNameDOT	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
)	TokenNameRPAREN	
ownerNode	TokenNameIdentifier	 owner Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * NON-DOM * set the ownerDocument of this node */	TokenNameCOMMENT_JAVADOC	 NON-DOM set the ownerDocument of this node 
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
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if we have an owner we rely on it to have it right 	TokenNameCOMMENT_LINE	if we have an owner we rely on it to have it right 
// otherwise ownerNode is our ownerDocument 	TokenNameCOMMENT_LINE	otherwise ownerNode is our ownerDocument 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the node number */	TokenNameCOMMENT_JAVADOC	 Returns the node number 
protected	TokenNameprotected	
int	TokenNameint	
getNodeNumber	TokenNameIdentifier	 get Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeNumber	TokenNameIdentifier	 node Number
;	TokenNameSEMICOLON	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
cd	TokenNameIdentifier	 cd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
)	TokenNameRPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeNumber	TokenNameIdentifier	 node Number
=	TokenNameEQUAL	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
getNodeNumber	TokenNameIdentifier	 get Node Number
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nodeNumber	TokenNameIdentifier	 node Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtain the DOM-tree parent of this node, or null if it is not * currently active in the DOM tree (perhaps because it has just been * created or removed). Note that Document, DocumentFragment, and * Attribute will never have parents. */	TokenNameCOMMENT_JAVADOC	 Obtain the DOM-tree parent of this node, or null if it is not currently active in the DOM tree (perhaps because it has just been created or removed). Note that Document, DocumentFragment, and Attribute will never have parents. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// overriden by ChildNode 	TokenNameCOMMENT_LINE	overriden by ChildNode 
}	TokenNameRBRACE	
/* * same as above but returns internal type */	TokenNameCOMMENT_BLOCK	 same as above but returns internal type 
NodeImpl	TokenNameIdentifier	 Node Impl
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The next child of this node's parent, or null if none */	TokenNameCOMMENT_JAVADOC	 The next child of this node's parent, or null if none 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// default behavior, overriden in ChildNode 	TokenNameCOMMENT_LINE	default behavior, overriden in ChildNode 
}	TokenNameRBRACE	
/** The previous child of this node's parent, or null if none */	TokenNameCOMMENT_JAVADOC	 The previous child of this node's parent, or null if none 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// default behavior, overriden in ChildNode 	TokenNameCOMMENT_LINE	default behavior, overriden in ChildNode 
}	TokenNameRBRACE	
ChildNode	TokenNameIdentifier	 Child Node
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// default behavior, overriden in ChildNode 	TokenNameCOMMENT_LINE	default behavior, overriden in ChildNode 
}	TokenNameRBRACE	
/** * Return the collection of attributes associated with this node, * or null if none. At this writing, Element is the only type of node * which will ever have attributes. * * @see ElementImpl */	TokenNameCOMMENT_JAVADOC	 Return the collection of attributes associated with this node, or null if none. At this writing, Element is the only type of node which will ever have attributes. * @see ElementImpl 
public	TokenNamepublic	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// overridden in ElementImpl 	TokenNameCOMMENT_LINE	overridden in ElementImpl 
}	TokenNameRBRACE	
/** * Returns whether this node (if it is an element) has any attributes. * @return <code>true</code> if this node has any attributes, * <code>false</code> otherwise. * @since DOM Level 2 * @see ElementImpl */	TokenNameCOMMENT_JAVADOC	 Returns whether this node (if it is an element) has any attributes. @return <code>true</code> if this node has any attributes, <code>false</code> otherwise. @since DOM Level 2 @see ElementImpl 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// overridden in ElementImpl 	TokenNameCOMMENT_LINE	overridden in ElementImpl 
}	TokenNameRBRACE	
/** * Test whether this node has any children. Convenience shorthand * for (Node.getFirstChild()!=null) * <P> * By default we do not have any children, ParentNode overrides this. * @see ParentNode */	TokenNameCOMMENT_JAVADOC	 Test whether this node has any children. Convenience shorthand for (Node.getFirstChild()!=null) <P> By default we do not have any children, ParentNode overrides this. @see ParentNode 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtain a NodeList enumerating all children of this node. If there * are none, an (initially) empty NodeList is returned. * <p> * NodeLists are "live"; as children are added/removed the NodeList * will immediately reflect those changes. Also, the NodeList refers * to the actual nodes, so changes to those nodes made via the DOM tree * will be reflected in the NodeList and vice versa. * <p> * In this implementation, Nodes implement the NodeList interface and * provide their own getChildNodes() support. Other DOMs may solve this * differently. */	TokenNameCOMMENT_JAVADOC	 Obtain a NodeList enumerating all children of this node. If there are none, an (initially) empty NodeList is returned. <p> NodeLists are "live"; as children are added/removed the NodeList will immediately reflect those changes. Also, the NodeList refers to the actual nodes, so changes to those nodes made via the DOM tree will be reflected in the NodeList and vice versa. <p> In this implementation, Nodes implement the NodeList interface and provide their own getChildNodes() support. Other DOMs may solve this differently. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The first child of this Node, or null if none. * <P> * By default we do not have any children, ParentNode overrides this. * @see ParentNode */	TokenNameCOMMENT_JAVADOC	 The first child of this Node, or null if none. <P> By default we do not have any children, ParentNode overrides this. @see ParentNode 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The first child of this Node, or null if none. * <P> * By default we do not have any children, ParentNode overrides this. * @see ParentNode */	TokenNameCOMMENT_JAVADOC	 The first child of this Node, or null if none. <P> By default we do not have any children, ParentNode overrides this. @see ParentNode 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Move one or more node(s) to our list of children. Note that this * implicitly removes them from their previous parent. * <P> * By default we do not accept any children, ParentNode overrides this. * @see ParentNode * * @param newChild The Node to be moved to our subtree. As a * convenience feature, inserting a DocumentNode will instead insert * all its children. * * @param refChild Current child which newChild should be placed * immediately before. If refChild is null, the insertion occurs * after all existing Nodes, like appendChild(). * * @return newChild, in its new state (relocated, or emptied in the case of * DocumentNode.) * * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a * type that shouldn't be a child of this node, or if newChild is an * ancestor of this node. * * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a * different owner document than we do. * * @throws DOMException(NOT_FOUND_ERR) if refChild is not a child of * this node. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is * read-only. */	TokenNameCOMMENT_JAVADOC	 Move one or more node(s) to our list of children. Note that this implicitly removes them from their previous parent. <P> By default we do not accept any children, ParentNode overrides this. @see ParentNode * @param newChild The Node to be moved to our subtree. As a convenience feature, inserting a DocumentNode will instead insert all its children. * @param refChild Current child which newChild should be placed immediately before. If refChild is null, the insertion occurs after all existing Nodes, like appendChild(). * @return newChild, in its new state (relocated, or emptied in the case of DocumentNode.) * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a type that shouldn't be a child of this node, or if newChild is an ancestor of this node. * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a different owner document than we do. * @throws DOMException(NOT_FOUND_ERR) if refChild is not a child of this node. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is read-only. 
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
/** * Remove a child from this Node. The removed child's subtree * remains intact so it may be re-inserted elsewhere. * <P> * By default we do not have any children, ParentNode overrides this. * @see ParentNode * * @return oldChild, in its new state (removed). * * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of * this node. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is * read-only. */	TokenNameCOMMENT_JAVADOC	 Remove a child from this Node. The removed child's subtree remains intact so it may be re-inserted elsewhere. <P> By default we do not have any children, ParentNode overrides this. @see ParentNode * @return oldChild, in its new state (removed). * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of this node. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is read-only. 
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
/** * Make newChild occupy the location that oldChild used to * have. Note that newChild will first be removed from its previous * parent, if any. Equivalent to inserting newChild before oldChild, * then removing oldChild. * <P> * By default we do not have any children, ParentNode overrides this. * @see ParentNode * * @return oldChild, in its new state (removed). * * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a * type that shouldn't be a child of this node, or if newChild is * one of our ancestors. * * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a * different owner document than we do. * * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of * this node. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is * read-only. */	TokenNameCOMMENT_JAVADOC	 Make newChild occupy the location that oldChild used to have. Note that newChild will first be removed from its previous parent, if any. Equivalent to inserting newChild before oldChild, then removing oldChild. <P> By default we do not have any children, ParentNode overrides this. @see ParentNode * @return oldChild, in its new state (removed). * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a type that shouldn't be a child of this node, or if newChild is one of our ancestors. * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a different owner document than we do. * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of this node. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is read-only. 
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
// 	TokenNameCOMMENT_LINE	 
// NodeList methods 	TokenNameCOMMENT_LINE	NodeList methods 
// 	TokenNameCOMMENT_LINE	 
/** * NodeList method: Count the immediate children of this node * <P> * By default we do not have any children, ParentNode overrides this. * @see ParentNode * * @return int */	TokenNameCOMMENT_JAVADOC	 NodeList method: Count the immediate children of this node <P> By default we do not have any children, ParentNode overrides this. @see ParentNode * @return int 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NodeList method: Return the Nth immediate child of this node, or * null if the index is out of bounds. * <P> * By default we do not have any children, ParentNode overrides this. * @see ParentNode * * @return org.w3c.dom.Node * @param index int */	TokenNameCOMMENT_JAVADOC	 NodeList method: Return the Nth immediate child of this node, or null if the index is out of bounds. <P> By default we do not have any children, ParentNode overrides this. @see ParentNode * @return org.w3c.dom.Node @param index int 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// DOM2: methods, getters, setters 	TokenNameCOMMENT_LINE	DOM2: methods, getters, setters 
// 	TokenNameCOMMENT_LINE	 
/** * Puts all <code>Text</code> nodes in the full depth of the sub-tree * underneath this <code>Node</code>, including attribute nodes, into a * "normal" form where only markup (e.g., tags, comments, processing * instructions, CDATA sections, and entity references) separates * <code>Text</code> nodes, i.e., there are no adjacent <code>Text</code> * nodes. This can be used to ensure that the DOM view of a document is * the same as if it were saved and re-loaded, and is useful when * operations (such as XPointer lookups) that depend on a particular * document tree structure are to be used.In cases where the document * contains <code>CDATASections</code>, the normalize operation alone may * not be sufficient, since XPointers do not differentiate between * <code>Text</code> nodes and <code>CDATASection</code> nodes. * <p> * Note that this implementation simply calls normalize() on this Node's * children. It is up to implementors or Node to override normalize() * to take action. */	TokenNameCOMMENT_JAVADOC	 Puts all <code>Text</code> nodes in the full depth of the sub-tree underneath this <code>Node</code>, including attribute nodes, into a "normal" form where only markup (e.g., tags, comments, processing instructions, CDATA sections, and entity references) separates <code>Text</code> nodes, i.e., there are no adjacent <code>Text</code> nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded, and is useful when operations (such as XPointer lookups) that depend on a particular document tree structure are to be used.In cases where the document contains <code>CDATASections</code>, the normalize operation alone may not be sufficient, since XPointers do not differentiate between <code>Text</code> nodes and <code>CDATASection</code> nodes. <p> Note that this implementation simply calls normalize() on this Node's children. It is up to implementors or Node to override normalize() to take action. 
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* by default we do not have any children, ParentNode overrides this behavior */	TokenNameCOMMENT_BLOCK	 by default we do not have any children, ParentNode overrides this behavior 
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * Tests whether the DOM implementation implements a specific feature and * that feature is supported by this node. * @param feature The package name of the feature to test. This is the same * name as what can be passed to the method hasFeature on * DOMImplementation. * @param version This is the version number of the package name to * test. In Level 2, version 1, this is the string "2.0". If the version is * not specified, supporting any version of the feature will cause the * method to return true. * @return boolean Returns true if this node defines a subtree within which * the specified feature is supported, false otherwise. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> Tests whether the DOM implementation implements a specific feature and that feature is supported by this node. @param feature The package name of the feature to test. This is the same name as what can be passed to the method hasFeature on DOMImplementation. @param version This is the version number of the package name to test. In Level 2, version 1, this is the string "2.0". If the version is not specified, supporting any version of the feature will cause the method to return true. @return boolean Returns true if this node defines a subtree within which the specified feature is supported, false otherwise. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * The namespace URI of this node, or null if it is unspecified. When this * node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE, this is * always null and setting it has no effect. <p> * * This is not a computed value that is the result of a namespace lookup * based on an examination of the namespace declarations in scope. It is * merely the namespace URI given at creation time.<p> * * For nodes created with a DOM Level 1 method, such as createElement * from the Document interface, this is null. * @since WD-DOM-Level-2-19990923 * @see AttrNSImpl * @see ElementNSImpl */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * The namespace URI of this node, or null if it is unspecified. When this node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE, this is always null and setting it has no effect. <p> * This is not a computed value that is the result of a namespace lookup based on an examination of the namespace declarations in scope. It is merely the namespace URI given at creation time.<p> * For nodes created with a DOM Level 1 method, such as createElement from the Document interface, this is null. @since WD-DOM-Level-2-19990923 @see AttrNSImpl @see ElementNSImpl 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * The namespace prefix of this node, or null if it is unspecified. When * this node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE this * is always null and setting it has no effect.<p> * * For nodes created with a DOM Level 1 method, such as createElement * from the Document interface, this is null. <p> * * @since WD-DOM-Level-2-19990923 * @see AttrNSImpl * @see ElementNSImpl */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * The namespace prefix of this node, or null if it is unspecified. When this node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE this is always null and setting it has no effect.<p> * For nodes created with a DOM Level 1 method, such as createElement from the Document interface, this is null. <p> * @since WD-DOM-Level-2-19990923 @see AttrNSImpl @see ElementNSImpl 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * The namespace prefix of this node, or null if it is unspecified. When * this node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE * this is always null and setting it has no effect.<p> * * For nodes created with a DOM Level 1 method, such as createElement from * the Document interface, this is null.<p> * * Note that setting this attribute changes the nodeName attribute, which * holds the qualified name, as well as the tagName and name attributes of * the Element and Attr interfaces, when applicable.<p> * * @throws INVALID_CHARACTER_ERR Raised if the specified * prefix contains an invalid character. * * @since WD-DOM-Level-2-19990923 * @see AttrNSImpl * @see ElementNSImpl */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * The namespace prefix of this node, or null if it is unspecified. When this node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE this is always null and setting it has no effect.<p> * For nodes created with a DOM Level 1 method, such as createElement from the Document interface, this is null.<p> * Note that setting this attribute changes the nodeName attribute, which holds the qualified name, as well as the tagName and name attributes of the Element and Attr interfaces, when applicable.<p> * @throws INVALID_CHARACTER_ERR Raised if the specified prefix contains an invalid character. * @since WD-DOM-Level-2-19990923 @see AttrNSImpl @see ElementNSImpl 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NAMESPACE_ERR	TokenNameIdentifier	 NAMESPACE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NAMESPACE_ERR"	TokenNameStringLiteral	NAMESPACE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * Returns the local part of the qualified name of this node. * For nodes created with a DOM Level 1 method, such as createElement * from the Document interface, and for nodes of any type other than * ELEMENT_NODE and ATTRIBUTE_NODE this is the same as the nodeName * attribute. * @since WD-DOM-Level-2-19990923 * @see AttrNSImpl * @see ElementNSImpl */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Returns the local part of the qualified name of this node. For nodes created with a DOM Level 1 method, such as createElement from the Document interface, and for nodes of any type other than ELEMENT_NODE and ATTRIBUTE_NODE this is the same as the nodeName attribute. @since WD-DOM-Level-2-19990923 @see AttrNSImpl @see ElementNSImpl 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// EventTarget support 	TokenNameCOMMENT_LINE	EventTarget support 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
addEventListener	TokenNameIdentifier	 add Event Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// simply forward to Document 	TokenNameCOMMENT_LINE	simply forward to Document 
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addEventListener	TokenNameIdentifier	 add Event Listener
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeEventListener	TokenNameIdentifier	 remove Event Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// simply forward to Document 	TokenNameCOMMENT_LINE	simply forward to Document 
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeEventListener	TokenNameIdentifier	 remove Event Listener
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// simply forward to Document 	TokenNameCOMMENT_LINE	simply forward to Document 
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public DOM Level 3 methods 	TokenNameCOMMENT_LINE	Public DOM Level 3 methods 
// 	TokenNameCOMMENT_LINE	 
/** * The absolute base URI of this node or <code>null</code> if undefined. * This value is computed according to . However, when the * <code>Document</code> supports the feature "HTML" , the base URI is * computed using first the value of the href attribute of the HTML BASE * element if any, and the value of the <code>documentURI</code> * attribute from the <code>Document</code> interface otherwise. * <br> When the node is an <code>Element</code>, a <code>Document</code> * or a a <code>ProcessingInstruction</code>, this attribute represents * the properties [base URI] defined in . When the node is a * <code>Notation</code>, an <code>Entity</code>, or an * <code>EntityReference</code>, this attribute represents the * properties [declaration base URI] in the . How will this be affected * by resolution of relative namespace URIs issue?It's not.Should this * only be on Document, Element, ProcessingInstruction, Entity, and * Notation nodes, according to the infoset? If not, what is it equal to * on other nodes? Null? An empty string? I think it should be the * parent's.No.Should this be read-only and computed or and actual * read-write attribute?Read-only and computed (F2F 19 Jun 2000 and * teleconference 30 May 2001).If the base HTML element is not yet * attached to a document, does the insert change the Document.baseURI? * Yes. (F2F 26 Sep 2001) * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The absolute base URI of this node or <code>null</code> if undefined. This value is computed according to . However, when the <code>Document</code> supports the feature "HTML" , the base URI is computed using first the value of the href attribute of the HTML BASE element if any, and the value of the <code>documentURI</code> attribute from the <code>Document</code> interface otherwise. <br> When the node is an <code>Element</code>, a <code>Document</code> or a a <code>ProcessingInstruction</code>, this attribute represents the properties [base URI] defined in . When the node is a <code>Notation</code>, an <code>Entity</code>, or an <code>EntityReference</code>, this attribute represents the properties [declaration base URI] in the . How will this be affected by resolution of relative namespace URIs issue?It's not.Should this only be on Document, Element, ProcessingInstruction, Entity, and Notation nodes, according to the infoset? If not, what is it equal to on other nodes? Null? An empty string? I think it should be the parent's.No.Should this be read-only and computed or and actual read-write attribute?Read-only and computed (F2F 19 Jun 2000 and teleconference 30 May 2001).If the base HTML element is not yet attached to a document, does the insert change the Document.baseURI? Yes. (F2F 26 Sep 2001) @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares a node with this node with regard to their position in the * tree and according to the document order. This order can be extended * by module that define additional types of nodes. * @param other The node to compare against this node. * @return Returns how the given node is positioned relatively to this * node. * @since DOM Level 3 * @deprecated */	TokenNameCOMMENT_JAVADOC	 Compares a node with this node with regard to their position in the tree and according to the document order. This order can be extended by module that define additional types of nodes. @param other The node to compare against this node. @return Returns how the given node is positioned relatively to this node. @since DOM Level 3 @deprecated 
public	TokenNamepublic	
short	TokenNameshort	
compareTreePosition	TokenNameIdentifier	 compare Tree Position
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Questions of clarification for this method - to be answered by the 	TokenNameCOMMENT_LINE	Questions of clarification for this method - to be answered by the 
// DOM WG. Current assumptions listed - LM 	TokenNameCOMMENT_LINE	DOM WG. Current assumptions listed - LM 
// 	TokenNameCOMMENT_LINE	 
// 1. How do ENTITY nodes compare? 	TokenNameCOMMENT_LINE	1. How do ENTITY nodes compare? 
// Current assumption: TREE_POSITION_DISCONNECTED, as ENTITY nodes 	TokenNameCOMMENT_LINE	Current assumption: TREE_POSITION_DISCONNECTED, as ENTITY nodes 
// aren't really 'in the tree' 	TokenNameCOMMENT_LINE	aren't really 'in the tree' 
// 	TokenNameCOMMENT_LINE	 
// 2. How do NOTATION nodes compare? 	TokenNameCOMMENT_LINE	2. How do NOTATION nodes compare? 
// Current assumption: TREE_POSITION_DISCONNECTED, as NOTATION nodes 	TokenNameCOMMENT_LINE	Current assumption: TREE_POSITION_DISCONNECTED, as NOTATION nodes 
// aren't really 'in the tree' 	TokenNameCOMMENT_LINE	aren't really 'in the tree' 
// 	TokenNameCOMMENT_LINE	 
// 3. Are TREE_POSITION_ANCESTOR and TREE_POSITION_DESCENDANT 	TokenNameCOMMENT_LINE	3. Are TREE_POSITION_ANCESTOR and TREE_POSITION_DESCENDANT 
// only relevant for nodes that are "part of the document tree"? 	TokenNameCOMMENT_LINE	only relevant for nodes that are "part of the document tree"? 
// <outer> 	TokenNameCOMMENT_LINE	<outer> 
// <inner myattr="true"/> 	TokenNameCOMMENT_LINE	<inner myattr="true"/> 
// </outer> 	TokenNameCOMMENT_LINE	</outer> 
// Is the element node "outer" considered an ancestor of "myattr"? 	TokenNameCOMMENT_LINE	Is the element node "outer" considered an ancestor of "myattr"? 
// Current assumption: No. 	TokenNameCOMMENT_LINE	Current assumption: No. 
// 	TokenNameCOMMENT_LINE	 
// 4. How do children of ATTRIBUTE nodes compare (with eachother, or 	TokenNameCOMMENT_LINE	4. How do children of ATTRIBUTE nodes compare (with eachother, or 
// with children of other attribute nodes with the same element) 	TokenNameCOMMENT_LINE	with children of other attribute nodes with the same element) 
// Current assumption: Children of ATTRIBUTE nodes are treated as if 	TokenNameCOMMENT_LINE	Current assumption: Children of ATTRIBUTE nodes are treated as if 
// they they are the attribute node itself, unless the 2 nodes 	TokenNameCOMMENT_LINE	they they are the attribute node itself, unless the 2 nodes 
// are both children of the same attribute. 	TokenNameCOMMENT_LINE	are both children of the same attribute. 
// 	TokenNameCOMMENT_LINE	 
// 5. How does an ENTITY_REFERENCE node compare with it's children? 	TokenNameCOMMENT_LINE	5. How does an ENTITY_REFERENCE node compare with it's children? 
// Given the DOM, it should precede its children as an ancestor. 	TokenNameCOMMENT_LINE	Given the DOM, it should precede its children as an ancestor. 
// Given "document order", does it represent the same position? 	TokenNameCOMMENT_LINE	Given "document order", does it represent the same position? 
// Current assumption: An ENTITY_REFERENCE node is an ancestor of its 	TokenNameCOMMENT_LINE	Current assumption: An ENTITY_REFERENCE node is an ancestor of its 
// children. 	TokenNameCOMMENT_LINE	children. 
// 	TokenNameCOMMENT_LINE	 
// 6. How do children of a DocumentFragment compare? 	TokenNameCOMMENT_LINE	6. How do children of a DocumentFragment compare? 
// Current assumption: If both nodes are part of the same document 	TokenNameCOMMENT_LINE	Current assumption: If both nodes are part of the same document 
// fragment, there are compared as if they were part of a document. 	TokenNameCOMMENT_LINE	fragment, there are compared as if they were part of a document. 
// If the nodes are the same... 	TokenNameCOMMENT_LINE	If the nodes are the same... 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
TREE_POSITION_SAME_NODE	TokenNameIdentifier	 TREE  POSITION  SAME  NODE
|	TokenNameOR	
TREE_POSITION_EQUIVALENT	TokenNameIdentifier	 TREE  POSITION  EQUIVALENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If either node is of type ENTITY or NOTATION, compare as disconnected 	TokenNameCOMMENT_LINE	If either node is of type ENTITY or NOTATION, compare as disconnected 
short	TokenNameshort	
thisType	TokenNameIdentifier	 this Type
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
otherType	TokenNameIdentifier	 other Type
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If either node is of type ENTITY or NOTATION, compare as disconnected 	TokenNameCOMMENT_LINE	If either node is of type ENTITY or NOTATION, compare as disconnected 
if	TokenNameif	
(	TokenNameLPAREN	
thisType	TokenNameIdentifier	 this Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
||	TokenNameOR_OR	
thisType	TokenNameIdentifier	 this Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
||	TokenNameOR_OR	
otherType	TokenNameIdentifier	 other Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
||	TokenNameOR_OR	
otherType	TokenNameIdentifier	 other Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TREE_POSITION_DISCONNECTED	TokenNameIdentifier	 TREE  POSITION  DISCONNECTED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Find the ancestor of each node, and the distance each node is from 	TokenNameCOMMENT_LINE	Find the ancestor of each node, and the distance each node is from 
// its ancestor. 	TokenNameCOMMENT_LINE	its ancestor. 
// During this traversal, look for ancestor/descendent relationships 	TokenNameCOMMENT_LINE	During this traversal, look for ancestor/descendent relationships 
// between the 2 nodes in question. 	TokenNameCOMMENT_LINE	between the 2 nodes in question. 
// We do this now, so that we get this info correct for attribute nodes 	TokenNameCOMMENT_LINE	We do this now, so that we get this info correct for attribute nodes 
// and their children. 	TokenNameCOMMENT_LINE	and their children. 
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
thisAncestor	TokenNameIdentifier	 this Ancestor
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
otherAncestor	TokenNameIdentifier	 other Ancestor
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
int	TokenNameint	
thisDepth	TokenNameIdentifier	 this Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherDepth	TokenNameIdentifier	 other Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisDepth	TokenNameIdentifier	 this Depth
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
// The other node is an ancestor of this one. 	TokenNameCOMMENT_LINE	The other node is an ancestor of this one. 
return	TokenNamereturn	
(	TokenNameLPAREN	
TREE_POSITION_ANCESTOR	TokenNameIdentifier	 TREE  POSITION  ANCESTOR
|	TokenNameOR	
TREE_POSITION_PRECEDING	TokenNameIdentifier	 TREE  POSITION  PRECEDING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thisAncestor	TokenNameIdentifier	 this Ancestor
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
otherDepth	TokenNameIdentifier	 other Depth
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
// The other node is a descendent of the reference node. 	TokenNameCOMMENT_LINE	The other node is a descendent of the reference node. 
return	TokenNamereturn	
(	TokenNameLPAREN	
TREE_POSITION_DESCENDANT	TokenNameIdentifier	 TREE  POSITION  DESCENDANT
|	TokenNameOR	
TREE_POSITION_FOLLOWING	TokenNameIdentifier	 TREE  POSITION  FOLLOWING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherAncestor	TokenNameIdentifier	 other Ancestor
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
int	TokenNameint	
thisAncestorType	TokenNameIdentifier	 this Ancestor Type
=	TokenNameEQUAL	
thisAncestor	TokenNameIdentifier	 this Ancestor
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
=	TokenNameEQUAL	
otherAncestor	TokenNameIdentifier	 other Ancestor
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the ancestor is an attribute, get owning element. 	TokenNameCOMMENT_LINE	if the ancestor is an attribute, get owning element. 
// we are now interested in the owner to determine position. 	TokenNameCOMMENT_LINE	we are now interested in the owner to determine position. 
if	TokenNameif	
(	TokenNameLPAREN	
thisAncestorType	TokenNameIdentifier	 this Ancestor Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
thisAncestor	TokenNameIdentifier	 this Ancestor
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
otherAncestor	TokenNameIdentifier	 other Ancestor
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Before proceeding, we should check if both ancestor nodes turned 	TokenNameCOMMENT_LINE	Before proceeding, we should check if both ancestor nodes turned 
// out to be attributes for the same element 	TokenNameCOMMENT_LINE	out to be attributes for the same element 
if	TokenNameif	
(	TokenNameLPAREN	
thisAncestorType	TokenNameIdentifier	 this Ancestor Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
&&	TokenNameAND_AND	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
&&	TokenNameAND_AND	
thisNode	TokenNameIdentifier	 this Node
==	TokenNameEQUAL_EQUAL	
otherNode	TokenNameIdentifier	 other Node
)	TokenNameRPAREN	
return	TokenNamereturn	
TREE_POSITION_EQUIVALENT	TokenNameIdentifier	 TREE  POSITION  EQUIVALENT
;	TokenNameSEMICOLON	
// Now, find the ancestor of the owning element, if the original 	TokenNameCOMMENT_LINE	Now, find the ancestor of the owning element, if the original 
// ancestor was an attribute 	TokenNameCOMMENT_LINE	ancestor was an attribute 
// Note: the following 2 loops are quite close to the ones above. 	TokenNameCOMMENT_LINE	Note: the following 2 loops are quite close to the ones above. 
// May want to common them up. LM. 	TokenNameCOMMENT_LINE	May want to common them up. LM. 
if	TokenNameif	
(	TokenNameLPAREN	
thisAncestorType	TokenNameIdentifier	 this Ancestor Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisDepth	TokenNameIdentifier	 this Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
thisNode	TokenNameIdentifier	 this Node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisDepth	TokenNameIdentifier	 this Depth
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
otherNode	TokenNameIdentifier	 other Node
)	TokenNameRPAREN	
// The other node is an ancestor of the owning element 	TokenNameCOMMENT_LINE	The other node is an ancestor of the owning element 
{	TokenNameLBRACE	
return	TokenNamereturn	
TREE_POSITION_PRECEDING	TokenNameIdentifier	 TREE  POSITION  PRECEDING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
thisAncestor	TokenNameIdentifier	 this Ancestor
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now, find the ancestor of the owning element, if the original 	TokenNameCOMMENT_LINE	Now, find the ancestor of the owning element, if the original 
// ancestor was an attribute 	TokenNameCOMMENT_LINE	ancestor was an attribute 
if	TokenNameif	
(	TokenNameLPAREN	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
otherDepth	TokenNameIdentifier	 other Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
otherNode	TokenNameIdentifier	 other Node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
otherDepth	TokenNameIdentifier	 other Depth
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
thisNode	TokenNameIdentifier	 this Node
)	TokenNameRPAREN	
// The other node is a descendent of the reference 	TokenNameCOMMENT_LINE	The other node is a descendent of the reference 
// node's element 	TokenNameCOMMENT_LINE	node's element 
return	TokenNamereturn	
TREE_POSITION_FOLLOWING	TokenNameIdentifier	 TREE  POSITION  FOLLOWING
;	TokenNameSEMICOLON	
otherAncestor	TokenNameIdentifier	 other Ancestor
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// thisAncestor and otherAncestor must be the same at this point, 	TokenNameCOMMENT_LINE	thisAncestor and otherAncestor must be the same at this point, 
// otherwise, we are not in the same tree or document fragment 	TokenNameCOMMENT_LINE	otherwise, we are not in the same tree or document fragment 
if	TokenNameif	
(	TokenNameLPAREN	
thisAncestor	TokenNameIdentifier	 this Ancestor
!=	TokenNameNOT_EQUAL	
otherAncestor	TokenNameIdentifier	 other Ancestor
)	TokenNameRPAREN	
return	TokenNamereturn	
TREE_POSITION_DISCONNECTED	TokenNameIdentifier	 TREE  POSITION  DISCONNECTED
;	TokenNameSEMICOLON	
// Go up the parent chain of the deeper node, until we find a node 	TokenNameCOMMENT_LINE	Go up the parent chain of the deeper node, until we find a node 
// with the same depth as the shallower node 	TokenNameCOMMENT_LINE	with the same depth as the shallower node 
if	TokenNameif	
(	TokenNameLPAREN	
thisDepth	TokenNameIdentifier	 this Depth
>	TokenNameGREATER	
otherDepth	TokenNameIdentifier	 other Depth
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
thisDepth	TokenNameIdentifier	 this Depth
-	TokenNameMINUS	
otherDepth	TokenNameIdentifier	 other Depth
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
thisNode	TokenNameIdentifier	 this Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the node we have reached is in fact "otherNode". This can 	TokenNameCOMMENT_LINE	Check if the node we have reached is in fact "otherNode". This can 
// happen in the case of attributes. In this case, otherNode 	TokenNameCOMMENT_LINE	happen in the case of attributes. In this case, otherNode 
// "precedes" this. 	TokenNameCOMMENT_LINE	"precedes" this. 
if	TokenNameif	
(	TokenNameLPAREN	
thisNode	TokenNameIdentifier	 this Node
==	TokenNameEQUAL_EQUAL	
otherNode	TokenNameIdentifier	 other Node
)	TokenNameRPAREN	
return	TokenNamereturn	
TREE_POSITION_PRECEDING	TokenNameIdentifier	 TREE  POSITION  PRECEDING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
otherDepth	TokenNameIdentifier	 other Depth
-	TokenNameMINUS	
thisDepth	TokenNameIdentifier	 this Depth
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
otherNode	TokenNameIdentifier	 other Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the node we have reached is in fact "thisNode". This can 	TokenNameCOMMENT_LINE	Check if the node we have reached is in fact "thisNode". This can 
// happen in the case of attributes. In this case, otherNode 	TokenNameCOMMENT_LINE	happen in the case of attributes. In this case, otherNode 
// "follows" this. 	TokenNameCOMMENT_LINE	"follows" this. 
if	TokenNameif	
(	TokenNameLPAREN	
otherNode	TokenNameIdentifier	 other Node
==	TokenNameEQUAL_EQUAL	
thisNode	TokenNameIdentifier	 this Node
)	TokenNameRPAREN	
return	TokenNamereturn	
TREE_POSITION_FOLLOWING	TokenNameIdentifier	 TREE  POSITION  FOLLOWING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We now have nodes at the same depth in the tree. Find a common 	TokenNameCOMMENT_LINE	We now have nodes at the same depth in the tree. Find a common 
// ancestor. 	TokenNameCOMMENT_LINE	ancestor. 
Node	TokenNameIdentifier	 Node
thisNodeP	TokenNameIdentifier	 this Node P
,	TokenNameCOMMA	
otherNodeP	TokenNameIdentifier	 other Node P
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
thisNodeP	TokenNameIdentifier	 this Node P
=	TokenNameEQUAL	
thisNode	TokenNameIdentifier	 this Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
otherNodeP	TokenNameIdentifier	 other Node P
=	TokenNameEQUAL	
otherNode	TokenNameIdentifier	 other Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thisNodeP	TokenNameIdentifier	 this Node P
!=	TokenNameNOT_EQUAL	
otherNodeP	TokenNameIdentifier	 other Node P
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
thisNodeP	TokenNameIdentifier	 this Node P
;	TokenNameSEMICOLON	
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
otherNodeP	TokenNameIdentifier	 other Node P
;	TokenNameSEMICOLON	
thisNodeP	TokenNameIdentifier	 this Node P
=	TokenNameEQUAL	
thisNodeP	TokenNameIdentifier	 this Node P
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherNodeP	TokenNameIdentifier	 other Node P
=	TokenNameEQUAL	
otherNodeP	TokenNameIdentifier	 other Node P
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// At this point, thisNode and otherNode are direct children of 	TokenNameCOMMENT_LINE	At this point, thisNode and otherNode are direct children of 
// the common ancestor. 	TokenNameCOMMENT_LINE	the common ancestor. 
// See whether thisNode or otherNode is the leftmost 	TokenNameCOMMENT_LINE	See whether thisNode or otherNode is the leftmost 
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
thisNodeP	TokenNameIdentifier	 this Node P
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
otherNode	TokenNameIdentifier	 other Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TREE_POSITION_PRECEDING	TokenNameIdentifier	 TREE  POSITION  PRECEDING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
thisNode	TokenNameIdentifier	 this Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TREE_POSITION_FOLLOWING	TokenNameIdentifier	 TREE  POSITION  FOLLOWING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// REVISIT: shouldn't get here. Should probably throw an 	TokenNameCOMMENT_LINE	REVISIT: shouldn't get here. Should probably throw an 
// exception 	TokenNameCOMMENT_LINE	exception 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares a node with this node with regard to their position in the * document. * @param other The node to compare against this node. * @return Returns how the given node is positioned relatively to this * node. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Compares a node with this node with regard to their position in the document. @param other The node to compare against this node. @return Returns how the given node is positioned relatively to this node. @since DOM Level 3 
public	TokenNamepublic	
short	TokenNameshort	
compareDocumentPosition	TokenNameIdentifier	 compare Document Position
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
// If the nodes are the same, no flags should be set 	TokenNameCOMMENT_LINE	If the nodes are the same, no flags should be set 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// check if other is from a different implementation 	TokenNameCOMMENT_LINE	check if other is from a different implementation 
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// other comes from a different implementation 	TokenNameCOMMENT_LINE	other comes from a different implementation 
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NOT_SUPPORTED_ERR"	TokenNameStringLiteral	NOT_SUPPORTED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Document	TokenNameIdentifier	 Document
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
,	TokenNameCOMMA	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
;	TokenNameSEMICOLON	
// get the respective Document owners. 	TokenNameCOMMENT_LINE	get the respective Document owners. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
else	TokenNameelse	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
else	TokenNameelse	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If from different documents, we know they are disconnected. 	TokenNameCOMMENT_LINE	If from different documents, we know they are disconnected. 
// and have an implementation dependent order 	TokenNameCOMMENT_LINE	and have an implementation dependent order 
if	TokenNameif	
(	TokenNameLPAREN	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
!=	TokenNameNOT_EQUAL	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
&&	TokenNameAND_AND	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
otherDocNum	TokenNameIdentifier	 other Doc Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
)	TokenNameRPAREN	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeNumber	TokenNameIdentifier	 get Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
thisDocNum	TokenNameIdentifier	 this Doc Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
)	TokenNameRPAREN	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeNumber	TokenNameIdentifier	 get Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
otherDocNum	TokenNameIdentifier	 other Doc Num
>	TokenNameGREATER	
thisDocNum	TokenNameIdentifier	 this Doc Num
)	TokenNameRPAREN	
return	TokenNamereturn	
DOCUMENT_POSITION_DISCONNECTED	TokenNameIdentifier	 DOCUMENT  POSITION  DISCONNECTED
|	TokenNameOR	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
DOCUMENT_POSITION_DISCONNECTED	TokenNameIdentifier	 DOCUMENT  POSITION  DISCONNECTED
|	TokenNameOR	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Find the ancestor of each node, and the distance each node is from 	TokenNameCOMMENT_LINE	Find the ancestor of each node, and the distance each node is from 
// its ancestor. 	TokenNameCOMMENT_LINE	its ancestor. 
// During this traversal, look for ancestor/descendent relationships 	TokenNameCOMMENT_LINE	During this traversal, look for ancestor/descendent relationships 
// between the 2 nodes in question. 	TokenNameCOMMENT_LINE	between the 2 nodes in question. 
// We do this now, so that we get this info correct for attribute nodes 	TokenNameCOMMENT_LINE	We do this now, so that we get this info correct for attribute nodes 
// and their children. 	TokenNameCOMMENT_LINE	and their children. 
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
thisAncestor	TokenNameIdentifier	 this Ancestor
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
otherAncestor	TokenNameIdentifier	 other Ancestor
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
int	TokenNameint	
thisDepth	TokenNameIdentifier	 this Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherDepth	TokenNameIdentifier	 other Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisDepth	TokenNameIdentifier	 this Depth
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
// The other node is an ancestor of this one. 	TokenNameCOMMENT_LINE	The other node is an ancestor of this one. 
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_CONTAINS	TokenNameIdentifier	 DOCUMENT  POSITION  CONTAINS
|	TokenNameOR	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thisAncestor	TokenNameIdentifier	 this Ancestor
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
otherDepth	TokenNameIdentifier	 other Depth
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
// The other node is a descendent of the reference node. 	TokenNameCOMMENT_LINE	The other node is a descendent of the reference node. 
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_IS_CONTAINED	TokenNameIdentifier	 DOCUMENT  POSITION  IS  CONTAINED
|	TokenNameOR	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherAncestor	TokenNameIdentifier	 other Ancestor
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
thisAncestorType	TokenNameIdentifier	 this Ancestor Type
=	TokenNameEQUAL	
thisAncestor	TokenNameIdentifier	 this Ancestor
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
=	TokenNameEQUAL	
otherAncestor	TokenNameIdentifier	 other Ancestor
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
// Special casing for ENTITY, NOTATION, DOCTYPE and ATTRIBUTES 	TokenNameCOMMENT_LINE	Special casing for ENTITY, NOTATION, DOCTYPE and ATTRIBUTES 
// LM: should rewrite this. 	TokenNameCOMMENT_LINE	LM: should rewrite this. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisAncestorType	TokenNameIdentifier	 this Ancestor Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
DocumentType	TokenNameIdentifier	 Document Type
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
.	TokenNameDOT	
getDoctype	TokenNameIdentifier	 get Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
==	TokenNameEQUAL_EQUAL	
otherAncestor	TokenNameIdentifier	 other Ancestor
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_CONTAINS	TokenNameIdentifier	 DOCUMENT  POSITION  CONTAINS
|	TokenNameOR	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thisAncestorType	TokenNameIdentifier	 this Ancestor Type
!=	TokenNameNOT_EQUAL	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
)	TokenNameRPAREN	
// the nodes are of different types 	TokenNameCOMMENT_LINE	the nodes are of different types 
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
thisAncestorType	TokenNameIdentifier	 this Ancestor Type
>	TokenNameGREATER	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
:	TokenNameCOLON	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// the nodes are of the same type. Find order. 	TokenNameCOMMENT_LINE	the nodes are of the same type. Find order. 
if	TokenNameif	
(	TokenNameLPAREN	
thisAncestorType	TokenNameIdentifier	 this Ancestor Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
)	TokenNameRPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getNotations	TokenNameIdentifier	 get Notations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
precedes	TokenNameIdentifier	 precedes
(	TokenNameLPAREN	
otherAncestor	TokenNameIdentifier	 other Ancestor
,	TokenNameCOMMA	
thisAncestor	TokenNameIdentifier	 this Ancestor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
)	TokenNameRPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getEntities	TokenNameIdentifier	 get Entities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
precedes	TokenNameIdentifier	 precedes
(	TokenNameLPAREN	
otherAncestor	TokenNameIdentifier	 other Ancestor
,	TokenNameCOMMA	
thisAncestor	TokenNameIdentifier	 this Ancestor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
thisAncestor	TokenNameIdentifier	 this Ancestor
=	TokenNameEQUAL	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherNode	TokenNameIdentifier	 other Node
==	TokenNameEQUAL_EQUAL	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
|	TokenNameOR	
DOCUMENT_POSITION_CONTAINS	TokenNameIdentifier	 DOCUMENT  POSITION  CONTAINS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
==	TokenNameEQUAL_EQUAL	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
thisAncestor	TokenNameIdentifier	 this Ancestor
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
otherAncestor	TokenNameIdentifier	 other Ancestor
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
otherNode	TokenNameIdentifier	 other Node
==	TokenNameEQUAL_EQUAL	
thisNode	TokenNameIdentifier	 this Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
)	TokenNameRPAREN	
thisNode	TokenNameIdentifier	 this Node
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
precedes	TokenNameIdentifier	 precedes
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now, find the ancestor of the element 	TokenNameCOMMENT_LINE	Now, find the ancestor of the element 
thisDepth	TokenNameIdentifier	 this Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
thisNode	TokenNameIdentifier	 this Node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisDepth	TokenNameIdentifier	 this Depth
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
otherNode	TokenNameIdentifier	 other Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The other node is an ancestor of the owning element 	TokenNameCOMMENT_LINE	The other node is an ancestor of the owning element 
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_CONTAINS	TokenNameIdentifier	 DOCUMENT  POSITION  CONTAINS
|	TokenNameOR	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
thisAncestor	TokenNameIdentifier	 this Ancestor
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
otherAncestorType	TokenNameIdentifier	 other Ancestor Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
DocumentType	TokenNameIdentifier	 Document Type
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
.	TokenNameDOT	
getDoctype	TokenNameIdentifier	 get Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_IS_CONTAINED	TokenNameIdentifier	 DOCUMENT  POSITION  IS  CONTAINED
|	TokenNameOR	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
otherAncestor	TokenNameIdentifier	 other Ancestor
=	TokenNameEQUAL	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thisNode	TokenNameIdentifier	 this Node
==	TokenNameEQUAL_EQUAL	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
|	TokenNameOR	
DOCUMENT_POSITION_IS_CONTAINED	TokenNameIdentifier	 DOCUMENT  POSITION  IS  CONTAINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
thisOwnerDoc	TokenNameIdentifier	 this Owner Doc
==	TokenNameEQUAL_EQUAL	
otherOwnerDoc	TokenNameIdentifier	 other Owner Doc
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
otherDepth	TokenNameIdentifier	 other Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
otherAncestor	TokenNameIdentifier	 other Ancestor
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
otherNode	TokenNameIdentifier	 other Node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
otherDepth	TokenNameIdentifier	 other Depth
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
thisNode	TokenNameIdentifier	 this Node
)	TokenNameRPAREN	
// The other node is a descendent of the reference 	TokenNameCOMMENT_LINE	The other node is a descendent of the reference 
// node's element 	TokenNameCOMMENT_LINE	node's element 
return	TokenNamereturn	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
|	TokenNameOR	
DOCUMENT_POSITION_IS_CONTAINED	TokenNameIdentifier	 DOCUMENT  POSITION  IS  CONTAINED
;	TokenNameSEMICOLON	
otherAncestor	TokenNameIdentifier	 other Ancestor
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// thisAncestor and otherAncestor must be the same at this point, 	TokenNameCOMMENT_LINE	thisAncestor and otherAncestor must be the same at this point, 
// otherwise, the original nodes are disconnected 	TokenNameCOMMENT_LINE	otherwise, the original nodes are disconnected 
if	TokenNameif	
(	TokenNameLPAREN	
thisAncestor	TokenNameIdentifier	 this Ancestor
!=	TokenNameNOT_EQUAL	
otherAncestor	TokenNameIdentifier	 other Ancestor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
thisAncestorNum	TokenNameIdentifier	 this Ancestor Num
,	TokenNameCOMMA	
otherAncestorNum	TokenNameIdentifier	 other Ancestor Num
;	TokenNameSEMICOLON	
thisAncestorNum	TokenNameIdentifier	 this Ancestor Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
thisAncestor	TokenNameIdentifier	 this Ancestor
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeNumber	TokenNameIdentifier	 get Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherAncestorNum	TokenNameIdentifier	 other Ancestor Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
otherAncestor	TokenNameIdentifier	 other Ancestor
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeNumber	TokenNameIdentifier	 get Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thisAncestorNum	TokenNameIdentifier	 this Ancestor Num
>	TokenNameGREATER	
otherAncestorNum	TokenNameIdentifier	 other Ancestor Num
)	TokenNameRPAREN	
return	TokenNamereturn	
DOCUMENT_POSITION_DISCONNECTED	TokenNameIdentifier	 DOCUMENT  POSITION  DISCONNECTED
|	TokenNameOR	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
DOCUMENT_POSITION_DISCONNECTED	TokenNameIdentifier	 DOCUMENT  POSITION  DISCONNECTED
|	TokenNameOR	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
|	TokenNameOR	
DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC	TokenNameIdentifier	 DOCUMENT  POSITION  IMPLEMENTATION  SPECIFIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go up the parent chain of the deeper node, until we find a node 	TokenNameCOMMENT_LINE	Go up the parent chain of the deeper node, until we find a node 
// with the same depth as the shallower node 	TokenNameCOMMENT_LINE	with the same depth as the shallower node 
if	TokenNameif	
(	TokenNameLPAREN	
thisDepth	TokenNameIdentifier	 this Depth
>	TokenNameGREATER	
otherDepth	TokenNameIdentifier	 other Depth
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
thisDepth	TokenNameIdentifier	 this Depth
-	TokenNameMINUS	
otherDepth	TokenNameIdentifier	 other Depth
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
thisNode	TokenNameIdentifier	 this Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the node we have reached is in fact "otherNode". This can 	TokenNameCOMMENT_LINE	Check if the node we have reached is in fact "otherNode". This can 
// happen in the case of attributes. In this case, otherNode 	TokenNameCOMMENT_LINE	happen in the case of attributes. In this case, otherNode 
// "precedes" this. 	TokenNameCOMMENT_LINE	"precedes" this. 
if	TokenNameif	
(	TokenNameLPAREN	
thisNode	TokenNameIdentifier	 this Node
==	TokenNameEQUAL_EQUAL	
otherNode	TokenNameIdentifier	 other Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
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
otherDepth	TokenNameIdentifier	 other Depth
-	TokenNameMINUS	
thisDepth	TokenNameIdentifier	 this Depth
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
otherNode	TokenNameIdentifier	 other Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the node we have reached is in fact "thisNode". This can 	TokenNameCOMMENT_LINE	Check if the node we have reached is in fact "thisNode". This can 
// happen in the case of attributes. In this case, otherNode 	TokenNameCOMMENT_LINE	happen in the case of attributes. In this case, otherNode 
// "follows" this. 	TokenNameCOMMENT_LINE	"follows" this. 
if	TokenNameif	
(	TokenNameLPAREN	
otherNode	TokenNameIdentifier	 other Node
==	TokenNameEQUAL_EQUAL	
thisNode	TokenNameIdentifier	 this Node
)	TokenNameRPAREN	
return	TokenNamereturn	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We now have nodes at the same depth in the tree. Find a common 	TokenNameCOMMENT_LINE	We now have nodes at the same depth in the tree. Find a common 
// ancestor. 	TokenNameCOMMENT_LINE	ancestor. 
Node	TokenNameIdentifier	 Node
thisNodeP	TokenNameIdentifier	 this Node P
,	TokenNameCOMMA	
otherNodeP	TokenNameIdentifier	 other Node P
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
thisNodeP	TokenNameIdentifier	 this Node P
=	TokenNameEQUAL	
thisNode	TokenNameIdentifier	 this Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
otherNodeP	TokenNameIdentifier	 other Node P
=	TokenNameEQUAL	
otherNode	TokenNameIdentifier	 other Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thisNodeP	TokenNameIdentifier	 this Node P
!=	TokenNameNOT_EQUAL	
otherNodeP	TokenNameIdentifier	 other Node P
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisNode	TokenNameIdentifier	 this Node
=	TokenNameEQUAL	
thisNodeP	TokenNameIdentifier	 this Node P
;	TokenNameSEMICOLON	
otherNode	TokenNameIdentifier	 other Node
=	TokenNameEQUAL	
otherNodeP	TokenNameIdentifier	 other Node P
;	TokenNameSEMICOLON	
thisNodeP	TokenNameIdentifier	 this Node P
=	TokenNameEQUAL	
thisNodeP	TokenNameIdentifier	 this Node P
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherNodeP	TokenNameIdentifier	 other Node P
=	TokenNameEQUAL	
otherNodeP	TokenNameIdentifier	 other Node P
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// At this point, thisNode and otherNode are direct children of 	TokenNameCOMMENT_LINE	At this point, thisNode and otherNode are direct children of 
// the common ancestor. 	TokenNameCOMMENT_LINE	the common ancestor. 
// See whether thisNode or otherNode is the leftmost 	TokenNameCOMMENT_LINE	See whether thisNode or otherNode is the leftmost 
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
thisNodeP	TokenNameIdentifier	 this Node P
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
otherNode	TokenNameIdentifier	 other Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DOCUMENT_POSITION_PRECEDING	TokenNameIdentifier	 DOCUMENT  POSITION  PRECEDING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
thisNode	TokenNameIdentifier	 this Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DOCUMENT_POSITION_FOLLOWING	TokenNameIdentifier	 DOCUMENT  POSITION  FOLLOWING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// REVISIT: shouldn't get here. Should probably throw an 	TokenNameCOMMENT_LINE	REVISIT: shouldn't get here. Should probably throw an 
// exception 	TokenNameCOMMENT_LINE	exception 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This attribute returns the text content of this node and its * descendants. When it is defined to be null, setting it has no effect. * When set, any possible children this node may have are removed and * replaced by a single <code>Text</code> node containing the string * this attribute is set to. On getting, no serialization is performed, * the returned string does not contain any markup. No whitespace * normalization is performed, the returned string does not contain the * element content whitespaces . Similarly, on setting, no parsing is * performed either, the input string is taken as pure textual content. * <br>The string returned is made of the text content of this node * depending on its type, as defined below: * <table border='1'> * <tr> * <th>Node type</th> * <th>Content</th> * </tr> /** * This attribute returns the text content of this node and its * descendants. When it is defined to be null, setting it has no effect. * When set, any possible children this node may have are removed and * replaced by a single <code>Text</code> node containing the string * this attribute is set to. On getting, no serialization is performed, * the returned string does not contain any markup. No whitespace * normalization is performed, the returned string does not contain the * element content whitespaces . Similarly, on setting, no parsing is * performed either, the input string is taken as pure textual content. * <br>The string returned is made of the text content of this node * depending on its type, as defined below: * <table border='1'> * <tr> * <th>Node type</th> * <th>Content</th> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'> * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE, * DOCUMENT_FRAGMENT_NODE</td> * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code> * attribute value of every child node, excluding COMMENT_NODE and * PROCESSING_INSTRUCTION_NODE nodes</td> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE, * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td> * <td valign='top' rowspan='1' colspan='1'> * <code>nodeValue</code></td> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td> * <td valign='top' rowspan='1' colspan='1'> * null</td> * </tr> * </table> * @exception DOMException * NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. * @exception DOMException * DOMSTRING_SIZE_ERR: Raised when it would return more characters than * fit in a <code>DOMString</code> variable on the implementation * platform. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. When set, any possible children this node may have are removed and replaced by a single <code>Text</code> node containing the string this attribute is set to. On getting, no serialization is performed, the returned string does not contain any markup. No whitespace normalization is performed, the returned string does not contain the element content whitespaces . Similarly, on setting, no parsing is performed either, the input string is taken as pure textual content. <br>The string returned is made of the text content of this node depending on its type, as defined below: <table border='1'> <tr> <th>Node type</th> <th>Content</th> </tr> /** This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. When set, any possible children this node may have are removed and replaced by a single <code>Text</code> node containing the string this attribute is set to. On getting, no serialization is performed, the returned string does not contain any markup. No whitespace normalization is performed, the returned string does not contain the element content whitespaces . Similarly, on setting, no parsing is performed either, the input string is taken as pure textual content. <br>The string returned is made of the text content of this node depending on its type, as defined below: <table border='1'> <tr> <th>Node type</th> <th>Content</th> </tr> <tr> <td valign='top' rowspan='1' colspan='1'> ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE, DOCUMENT_FRAGMENT_NODE</td> <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code> attribute value of every child node, excluding COMMENT_NODE and PROCESSING_INSTRUCTION_NODE nodes</td> </tr> <tr> <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE, CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td> <td valign='top' rowspan='1' colspan='1'> <code>nodeValue</code></td> </tr> <tr> <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td> <td valign='top' rowspan='1' colspan='1'> null</td> </tr> </table> @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. @exception DOMException DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a <code>DOMString</code> variable on the implementation platform. @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// overriden in some subclasses 	TokenNameCOMMENT_LINE	overriden in some subclasses 
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
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This attribute returns the text content of this node and its * descendants. When it is defined to be null, setting it has no effect. * When set, any possible children this node may have are removed and * replaced by a single <code>Text</code> node containing the string * this attribute is set to. On getting, no serialization is performed, * the returned string does not contain any markup. No whitespace * normalization is performed, the returned string does not contain the * element content whitespaces . Similarly, on setting, no parsing is * performed either, the input string is taken as pure textual content. * <br>The string returned is made of the text content of this node * depending on its type, as defined below: * <table border='1'> * <tr> * <th>Node type</th> * <th>Content</th> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'> * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE, * DOCUMENT_FRAGMENT_NODE</td> * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code> * attribute value of every child node, excluding COMMENT_NODE and * PROCESSING_INSTRUCTION_NODE nodes</td> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE, * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td> * <td valign='top' rowspan='1' colspan='1'> * <code>nodeValue</code></td> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td> * <td valign='top' rowspan='1' colspan='1'> * null</td> * </tr> * </table> * @exception DOMException * NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. * @exception DOMException * DOMSTRING_SIZE_ERR: Raised when it would return more characters than * fit in a <code>DOMString</code> variable on the implementation * platform. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. When set, any possible children this node may have are removed and replaced by a single <code>Text</code> node containing the string this attribute is set to. On getting, no serialization is performed, the returned string does not contain any markup. No whitespace normalization is performed, the returned string does not contain the element content whitespaces . Similarly, on setting, no parsing is performed either, the input string is taken as pure textual content. <br>The string returned is made of the text content of this node depending on its type, as defined below: <table border='1'> <tr> <th>Node type</th> <th>Content</th> </tr> <tr> <td valign='top' rowspan='1' colspan='1'> ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE, DOCUMENT_FRAGMENT_NODE</td> <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code> attribute value of every child node, excluding COMMENT_NODE and PROCESSING_INSTRUCTION_NODE nodes</td> </tr> <tr> <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE, CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td> <td valign='top' rowspan='1' colspan='1'> <code>nodeValue</code></td> </tr> <tr> <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td> <td valign='top' rowspan='1' colspan='1'> null</td> </tr> </table> @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. @exception DOMException DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a <code>DOMString</code> variable on the implementation platform. @since DOM Level 3 
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
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
textContent	TokenNameIdentifier	 text Content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this node is the same node as the given one. * <br>This method provides a way to determine whether two * <code>Node</code> references returned by the implementation reference * the same object. When two <code>Node</code> references are references * to the same object, even if through a proxy, the references may be * used completely interchangably, such that all attributes have the * same values and calling the same DOM method on either reference * always has exactly the same effect. * @param other The node to test against. * @return Returns <code>true</code> if the nodes are the same, * <code>false</code> otherwise. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Returns whether this node is the same node as the given one. <br>This method provides a way to determine whether two <code>Node</code> references returned by the implementation reference the same object. When two <code>Node</code> references are references to the same object, even if through a proxy, the references may be used completely interchangably, such that all attributes have the same values and calling the same DOM method on either reference always has exactly the same effect. @param other The node to test against. @return Returns <code>true</code> if the nodes are the same, <code>false</code> otherwise. @since DOM Level 3 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we do not use any wrapper so the answer is obvious 	TokenNameCOMMENT_LINE	we do not use any wrapper so the answer is obvious 
return	TokenNamereturn	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Level 3: Experimental * This method checks if the specified <code>namespaceURI</code> is the * default namespace or not. * @param namespaceURI The namespace URI to look for. * @return <code>true</code> if the specified <code>namespaceURI</code> * is the default namespace, <code>false</code> otherwise. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 DOM Level 3: Experimental This method checks if the specified <code>namespaceURI</code> is the default namespace or not. @param namespaceURI The namespace URI to look for. @return <code>true</code> if the specified <code>namespaceURI</code> is the default namespace, <code>false</code> otherwise. @since DOM Level 3 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDefaultNamespace	TokenNameIdentifier	 is Default Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: remove casts when DOM L3 becomes REC. 	TokenNameCOMMENT_LINE	REVISIT: remove casts when DOM L3 becomes REC. 
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: is it possible that prefix is empty string? 	TokenNameCOMMENT_LINE	REVISIT: is it possible that prefix is empty string? 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElementImpl	TokenNameIdentifier	 Element Impl
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
NodeImpl	TokenNameIdentifier	 Node Impl
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
,	TokenNameCOMMA	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
getElementAncestor	TokenNameIdentifier	 get Element Ancestor
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ancestor	TokenNameIdentifier	 ancestor
.	TokenNameDOT	
isDefaultNamespace	TokenNameIdentifier	 is Default Namespace
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDefaultNamespace	TokenNameIdentifier	 is Default Namespace
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
// type is unknown 	TokenNameCOMMENT_LINE	type is unknown 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
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
return	TokenNamereturn	
ownerNode	TokenNameIdentifier	 owner Node
.	TokenNameDOT	
isDefaultNamespace	TokenNameIdentifier	 is Default Namespace
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
getElementAncestor	TokenNameIdentifier	 get Element Ancestor
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ancestor	TokenNameIdentifier	 ancestor
.	TokenNameDOT	
isDefaultNamespace	TokenNameIdentifier	 is Default Namespace
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * DOM Level 3 - Experimental: * Look up the prefix associated to the given namespace URI, starting from this node. * * @param namespaceURI * @return the prefix for the namespace */	TokenNameCOMMENT_JAVADOC	 * DOM Level 3 - Experimental: Look up the prefix associated to the given namespace URI, starting from this node. * @param namespaceURI @return the prefix for the namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: When Namespaces 1.1 comes out this may not be true 	TokenNameCOMMENT_LINE	REVISIT: When Namespaces 1.1 comes out this may not be true 
// Prefix can't be bound to null namespace 	TokenNameCOMMENT_LINE	Prefix can't be bound to null namespace 
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to flip out children 	TokenNameCOMMENT_LINE	to flip out children 
return	TokenNamereturn	
lookupNamespacePrefix	TokenNameIdentifier	 lookup Namespace Prefix
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
// type is unknown 	TokenNameCOMMENT_LINE	type is unknown 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
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
return	TokenNamereturn	
ownerNode	TokenNameIdentifier	 owner Node
.	TokenNameDOT	
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
getElementAncestor	TokenNameIdentifier	 get Element Ancestor
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ancestor	TokenNameIdentifier	 ancestor
.	TokenNameDOT	
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * DOM Level 3 - Experimental: * Look up the namespace URI associated to the given prefix, starting from this node. * Use lookupNamespaceURI(null) to lookup the default namespace * * @param specifiedPrefix * @return the URI for the namespace * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 - Experimental: Look up the namespace URI associated to the given prefix, starting from this node. Use lookupNamespaceURI(null) to lookup the default namespace * @param specifiedPrefix @return the URI for the namespace @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: is it possible that prefix is empty string? 	TokenNameCOMMENT_LINE	REVISIT: is it possible that prefix is empty string? 
if	TokenNameif	
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// looking for default namespace 	TokenNameCOMMENT_LINE	looking for default namespace 
return	TokenNamereturn	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// non default namespace 	TokenNameCOMMENT_LINE	non default namespace 
return	TokenNamereturn	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrPrefix	TokenNameIdentifier	 attr Prefix
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// at this point we are dealing with DOM Level 2 nodes only 	TokenNameCOMMENT_LINE	at this point we are dealing with DOM Level 2 nodes only 
if	TokenNameif	
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default namespace 	TokenNameCOMMENT_LINE	default namespace 
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
attrPrefix	TokenNameIdentifier	 attr Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attrPrefix	TokenNameIdentifier	 attr Prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// non default namespace 	TokenNameCOMMENT_LINE	non default namespace 
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
getElementAncestor	TokenNameIdentifier	 get Element Ancestor
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ancestor	TokenNameIdentifier	 ancestor
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
// type is unknown 	TokenNameCOMMENT_LINE	type is unknown 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
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
return	TokenNamereturn	
ownerNode	TokenNameIdentifier	 owner Node
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
getElementAncestor	TokenNameIdentifier	 get Element Ancestor
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ancestor	TokenNameIdentifier	 ancestor
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
getElementAncestor	TokenNameIdentifier	 get Element Ancestor
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
lookupNamespacePrefix	TokenNameIdentifier	 lookup Namespace Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
ElementImpl	TokenNameIdentifier	 Element Impl
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: if no prefix is available is it null or empty string, or 	TokenNameCOMMENT_LINE	REVISIT: if no prefix is available is it null or empty string, or 
// could be both? 	TokenNameCOMMENT_LINE	could be both? 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
foundNamespace	TokenNameIdentifier	 found Namespace
=	TokenNameEQUAL	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
foundNamespace	TokenNameIdentifier	 found Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
foundNamespace	TokenNameIdentifier	 found Namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrPrefix	TokenNameIdentifier	 attr Prefix
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DOM Level 2 nodes 	TokenNameCOMMENT_LINE	DOM Level 2 nodes 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
attrPrefix	TokenNameIdentifier	 attr Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attrPrefix	TokenNameIdentifier	 attr Prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
localname	TokenNameIdentifier	 localname
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
foundNamespace	TokenNameIdentifier	 found Namespace
=	TokenNameEQUAL	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
localname	TokenNameIdentifier	 localname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
foundNamespace	TokenNameIdentifier	 found Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
foundNamespace	TokenNameIdentifier	 found Namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localname	TokenNameIdentifier	 localname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
getElementAncestor	TokenNameIdentifier	 get Element Ancestor
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ancestor	TokenNameIdentifier	 ancestor
.	TokenNameDOT	
lookupNamespacePrefix	TokenNameIdentifier	 lookup Namespace Prefix
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether two nodes are equal. * <br>This method tests for equality of nodes, not sameness (i.e., * whether the two nodes are references to the same object) which can be * tested with <code>Node.isSameNode</code>. All nodes that are the same * will also be equal, though the reverse may not be true. * <br>Two nodes are equal if and only if the following conditions are * satisfied: The two nodes are of the same type.The following string * attributes are equal: <code>nodeName</code>, <code>localName</code>, * <code>namespaceURI</code>, <code>prefix</code>, <code>nodeValue</code> * , <code>baseURI</code>. This is: they are both <code>null</code>, or * they have the same length and are character for character identical. * The <code>attributes</code> <code>NamedNodeMaps</code> are equal. * This is: they are both <code>null</code>, or they have the same * length and for each node that exists in one map there is a node that * exists in the other map and is equal, although not necessarily at the * same index.The <code>childNodes</code> <code>NodeLists</code> are * equal. This is: they are both <code>null</code>, or they have the * same length and contain equal nodes at the same index. This is true * for <code>Attr</code> nodes as for any other type of node. Note that * normalization can affect equality; to avoid this, nodes should be * normalized before being compared. * <br>For two <code>DocumentType</code> nodes to be equal, the following * conditions must also be satisfied: The following string attributes * are equal: <code>publicId</code>, <code>systemId</code>, * <code>internalSubset</code>.The <code>entities</code> * <code>NamedNodeMaps</code> are equal.The <code>notations</code> * <code>NamedNodeMaps</code> are equal. * <br>On the other hand, the following do not affect equality: the * <code>ownerDocument</code> attribute, the <code>specified</code> * attribute for <code>Attr</code> nodes, the * <code>isWhitespaceInElementContent</code> attribute for * <code>Text</code> nodes, as well as any user data or event listeners * registered on the nodes. * @param arg The node to compare equality with. * @return If the nodes, and possibly subtrees are equal, * <code>true</code> otherwise <code>false</code>. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Tests whether two nodes are equal. <br>This method tests for equality of nodes, not sameness (i.e., whether the two nodes are references to the same object) which can be tested with <code>Node.isSameNode</code>. All nodes that are the same will also be equal, though the reverse may not be true. <br>Two nodes are equal if and only if the following conditions are satisfied: The two nodes are of the same type.The following string attributes are equal: <code>nodeName</code>, <code>localName</code>, <code>namespaceURI</code>, <code>prefix</code>, <code>nodeValue</code> , <code>baseURI</code>. This is: they are both <code>null</code>, or they have the same length and are character for character identical. The <code>attributes</code> <code>NamedNodeMaps</code> are equal. This is: they are both <code>null</code>, or they have the same length and for each node that exists in one map there is a node that exists in the other map and is equal, although not necessarily at the same index.The <code>childNodes</code> <code>NodeLists</code> are equal. This is: they are both <code>null</code>, or they have the same length and contain equal nodes at the same index. This is true for <code>Attr</code> nodes as for any other type of node. Note that normalization can affect equality; to avoid this, nodes should be normalized before being compared. <br>For two <code>DocumentType</code> nodes to be equal, the following conditions must also be satisfied: The following string attributes are equal: <code>publicId</code>, <code>systemId</code>, <code>internalSubset</code>.The <code>entities</code> <code>NamedNodeMaps</code> are equal.The <code>notations</code> <code>NamedNodeMaps</code> are equal. <br>On the other hand, the following do not affect equality: the <code>ownerDocument</code> attribute, the <code>specified</code> attribute for <code>Attr</code> nodes, the <code>isWhitespaceInElementContent</code> attribute for <code>Text</code> nodes, as well as any user data or event listeners registered on the nodes. @param arg The node to compare equality with. @return If the nodes, and possibly subtrees are equal, <code>true</code> otherwise <code>false</code>. @since DOM Level 3 
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
arg	TokenNameIdentifier	 arg
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// in theory nodeName can't be null but better be careful 	TokenNameCOMMENT_LINE	in theory nodeName can't be null but better be careful 
// who knows what other implementations may be doing?... 	TokenNameCOMMENT_LINE	who knows what other implementations may be doing?... 
if	TokenNameif	
(	TokenNameLPAREN	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
/** * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 @since DOM Level 3 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we don't have any alternate node, either this node does the job 	TokenNameCOMMENT_LINE	we don't have any alternate node, either this node does the job 
// or we don't have anything that does 	TokenNameCOMMENT_LINE	or we don't have anything that does 
return	TokenNamereturn	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Associate an object to a key on this node. The object can later be * retrieved from this node by calling <code>getUserData</code> with the * same key. * @param key The key to associate the object to. * @param data The object to associate to the given key, or * <code>null</code> to remove any existing association to that key. * @param handler The handler to associate to that key, or * <code>null</code>. * @return Returns the <code>DOMObject</code> previously associated to * the given key on this node, or <code>null</code> if there was none. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Associate an object to a key on this node. The object can later be retrieved from this node by calling <code>getUserData</code> with the same key. @param key The key to associate the object to. @param data The object to associate to the given key, or <code>null</code> to remove any existing association to that key. @param handler The handler to associate to that key, or <code>null</code>. @return Returns the <code>DOMObject</code> previously associated to the given key on this node, or <code>null</code> if there was none. @since DOM Level 3 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
setUserData	TokenNameIdentifier	 set User Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
UserDataHandler	TokenNameIdentifier	 User Data Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserData	TokenNameIdentifier	 set User Data
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the object associated to a key on a this node. The object * must first have been set to this node by calling * <code>setUserData</code> with the same key. * @param key The key the object is associated to. * @return Returns the <code>DOMObject</code> associated to the given key * on this node, or <code>null</code> if there was none. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Retrieves the object associated to a key on a this node. The object must first have been set to this node by calling <code>setUserData</code> with the same key. @param key The key the object is associated to. @return Returns the <code>DOMObject</code> associated to the given key on this node, or <code>null</code> if there was none. @since DOM Level 3 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
getUserDataRecord	TokenNameIdentifier	 get User Data Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUserDataRecord	TokenNameIdentifier	 get User Data Record
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * NON-DOM: PR-DOM-Level-1-19980818 mentions readonly nodes in conjunction * with Entities, but provides no API to support this. * <P> * Most DOM users should not touch this method. Its anticpated use * is during construction of EntityRefernces, where it will be used to * lock the contents replicated from Entity so they can't be casually * altered. It _could_ be published as a DOM extension, if desired. * <P> * Note: since we never have any children deep is meaningless here, * ParentNode overrides this behavior. * @see ParentNode * * @param readOnly True or false as desired. * @param deep If true, children are also toggled. Note that this will * not change the state of an EntityReference or its children, * which are always read-only. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: PR-DOM-Level-1-19980818 mentions readonly nodes in conjunction with Entities, but provides no API to support this. <P> Most DOM users should not touch this method. Its anticpated use is during construction of EntityRefernces, where it will be used to lock the contents replicated from Entity so they can't be casually altered. It _could_ be published as a DOM extension, if desired. <P> Note: since we never have any children deep is meaningless here, ParentNode overrides this behavior. @see ParentNode * @param readOnly True or false as desired. @param deep If true, children are also toggled. Note that this will not change the state of an EntityReference or its children, which are always read-only. 
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
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setReadOnly(boolean,boolean) 	TokenNameCOMMENT_LINE	setReadOnly(boolean,boolean) 
/** * NON-DOM: Returns true if this node is read-only. This is a * shallow check. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Returns true if this node is read-only. This is a shallow check. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getReadOnly	TokenNameIdentifier	 get Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getReadOnly():boolean 	TokenNameCOMMENT_LINE	getReadOnly():boolean 
/** * NON-DOM: As an alternative to subclassing the DOM, this implementation * has been extended with the ability to attach an object to each node. * (If you need multiple objects, you can attach a collection such as a * vector or hashtable, then attach your application information to that.) * <p><b>Important Note:</b> You are responsible for removing references * to your data on nodes that are no longer used. Failure to do so will * prevent the nodes, your data is attached to, to be garbage collected * until the whole document is. * * @param data the object to store or null to remove any existing reference */	TokenNameCOMMENT_JAVADOC	 NON-DOM: As an alternative to subclassing the DOM, this implementation has been extended with the ability to attach an object to each node. (If you need multiple objects, you can attach a collection such as a vector or hashtable, then attach your application information to that.) <p><b>Important Note:</b> You are responsible for removing references to your data on nodes that are no longer used. Failure to do so will prevent the nodes, your data is attached to, to be garbage collected until the whole document is. * @param data the object to store or null to remove any existing reference 
public	TokenNamepublic	
void	TokenNamevoid	
setUserData	TokenNameIdentifier	 set User Data
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserData	TokenNameIdentifier	 set User Data
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM: * Returns the user data associated to this node. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Returns the user data associated to this node. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** * Denotes that this node has changed. */	TokenNameCOMMENT_JAVADOC	 Denotes that this node has changed. 
protected	TokenNameprotected	
void	TokenNamevoid	
changed	TokenNameIdentifier	 changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we do not actually store this information on every node, we only 	TokenNameCOMMENT_LINE	we do not actually store this information on every node, we only 
// have a global indicator on the Document. Doing otherwise cost us too 	TokenNameCOMMENT_LINE	have a global indicator on the Document. Doing otherwise cost us too 
// much for little gain. 	TokenNameCOMMENT_LINE	much for little gain. 
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
changed	TokenNameIdentifier	 changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of changes to this node. */	TokenNameCOMMENT_JAVADOC	 Returns the number of changes to this node. 
protected	TokenNameprotected	
int	TokenNameint	
changes	TokenNameIdentifier	 changes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we do not actually store this information on every node, we only 	TokenNameCOMMENT_LINE	we do not actually store this information on every node, we only 
// have a global indicator on the Document. Doing otherwise cost us too 	TokenNameCOMMENT_LINE	have a global indicator on the Document. Doing otherwise cost us too 
// much for little gain. 	TokenNameCOMMENT_LINE	much for little gain. 
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
changes	TokenNameIdentifier	 changes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override this method in subclass to hook in efficient * internal data structure. */	TokenNameCOMMENT_JAVADOC	 Override this method in subclass to hook in efficient internal data structure. 
protected	TokenNameprotected	
void	TokenNamevoid	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// By default just change the flag to avoid calling this method again 	TokenNameCOMMENT_LINE	By default just change the flag to avoid calling this method again 
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For non-child nodes, the node which "points" to this node. * For example, the owning element for an attribute */	TokenNameCOMMENT_JAVADOC	 For non-child nodes, the node which "points" to this node. For example, the owning element for an attribute 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
getContainer	TokenNameIdentifier	 get Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Flags setters and getters */	TokenNameCOMMENT_BLOCK	 Flags setters and getters 
final	TokenNamefinal	
boolean	TokenNameboolean	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
READONLY	TokenNameIdentifier	 READONLY
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
READONLY	TokenNameIdentifier	 READONLY
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
READONLY	TokenNameIdentifier	 READONLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
SYNCDATA	TokenNameIdentifier	 SYNCDATA
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
SYNCDATA	TokenNameIdentifier	 SYNCDATA
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
SYNCDATA	TokenNameIdentifier	 SYNCDATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
SYNCCHILDREN	TokenNameIdentifier	 SYNCCHILDREN
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
SYNCCHILDREN	TokenNameIdentifier	 SYNCCHILDREN
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
SYNCCHILDREN	TokenNameIdentifier	 SYNCCHILDREN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
OWNED	TokenNameIdentifier	 OWNED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
OWNED	TokenNameIdentifier	 OWNED
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
OWNED	TokenNameIdentifier	 OWNED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
FIRSTCHILD	TokenNameIdentifier	 FIRSTCHILD
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
FIRSTCHILD	TokenNameIdentifier	 FIRSTCHILD
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
FIRSTCHILD	TokenNameIdentifier	 FIRSTCHILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
SPECIFIED	TokenNameIdentifier	 SPECIFIED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
SPECIFIED	TokenNameIdentifier	 SPECIFIED
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
SPECIFIED	TokenNameIdentifier	 SPECIFIED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inconsistent name to avoid clash with public method on TextImpl 	TokenNameCOMMENT_LINE	inconsistent name to avoid clash with public method on TextImpl 
final	TokenNamefinal	
boolean	TokenNameboolean	
internalIsIgnorableWhitespace	TokenNameIdentifier	 internal Is Ignorable Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
IGNORABLEWS	TokenNameIdentifier	 IGNORABLEWS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
isIgnorableWhitespace	TokenNameIdentifier	 is Ignorable Whitespace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
IGNORABLEWS	TokenNameIdentifier	 IGNORABLEWS
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
IGNORABLEWS	TokenNameIdentifier	 IGNORABLEWS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
HASSTRING	TokenNameIdentifier	 HASSTRING
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
HASSTRING	TokenNameIdentifier	 HASSTRING
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
HASSTRING	TokenNameIdentifier	 HASSTRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
NORMALIZED	TokenNameIdentifier	 NORMALIZED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See if flag should propagate to parent. 	TokenNameCOMMENT_LINE	See if flag should propagate to parent. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
&&	TokenNameAND_AND	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ownerNode	TokenNameIdentifier	 owner Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerNode	TokenNameIdentifier	 owner Node
.	TokenNameDOT	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
NORMALIZED	TokenNameIdentifier	 NORMALIZED
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
NORMALIZED	TokenNameIdentifier	 NORMALIZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
ID	TokenNameIdentifier	 ID
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
ID	TokenNameIdentifier	 ID
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
~	TokenNameTWIDDLE	
ID	TokenNameIdentifier	 ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** NON-DOM method for debugging convenience. */	TokenNameCOMMENT_JAVADOC	 NON-DOM method for debugging convenience. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// synchronize data 	TokenNameCOMMENT_LINE	synchronize data 
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
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
}	TokenNameRBRACE	
// class NodeImpl 	TokenNameCOMMENT_LINE	class NodeImpl 
