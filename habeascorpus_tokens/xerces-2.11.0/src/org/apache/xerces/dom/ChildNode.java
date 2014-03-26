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
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * ChildNode inherits from NodeImpl and adds the capability of being a child by * having references to its previous and next siblings. * * @xerces.internal * * @version $Id: ChildNode.java 447266 2006-09-18 05:57:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 ChildNode inherits from NodeImpl and adds the capability of being a child by having references to its previous and next siblings. * @xerces.internal * @version $Id: ChildNode.java 447266 2006-09-18 05:57:49Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ChildNode	TokenNameIdentifier	 Child Node
extends	TokenNameextends	
NodeImpl	TokenNameIdentifier	 Node Impl
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6112455738802414002L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Previous sibling. */	TokenNameCOMMENT_JAVADOC	 Previous sibling. 
protected	TokenNameprotected	
ChildNode	TokenNameIdentifier	 Child Node
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
/** Next sibling. */	TokenNameCOMMENT_JAVADOC	 Next sibling. 
protected	TokenNameprotected	
ChildNode	TokenNameIdentifier	 Child Node
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * No public constructor; only subclasses of Node should be * instantiated, and those normally via a Document's factory methods * <p> * Every Node knows what Document it belongs to. */	TokenNameCOMMENT_JAVADOC	 No public constructor; only subclasses of Node should be instantiated, and those normally via a Document's factory methods <p> Every Node knows what Document it belongs to. 
protected	TokenNameprotected	
ChildNode	TokenNameIdentifier	 Child Node
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
}	TokenNameRBRACE	
// <init>(CoreDocumentImpl) 	TokenNameCOMMENT_LINE	<init>(CoreDocumentImpl) 
/** Constructor for serialization. */	TokenNameCOMMENT_JAVADOC	 Constructor for serialization. 
public	TokenNamepublic	
ChildNode	TokenNameIdentifier	 Child Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns a duplicate of a given node. You can consider this a * generic "copy constructor" for nodes. The newly returned object should * be completely independent of the source object's subtree, so changes * in one after the clone has been made will not affect the other. * <P> * Note: since we never have any children deep is meaningless here, * ParentNode overrides this behavior. * @see ParentNode * * <p> * Example: Cloning a Text node will copy both the node and the text it * contains. * <p> * Example: Cloning something that has children -- Element or Attr, for * example -- will _not_ clone those children unless a "deep clone" * has been requested. A shallow clone of an Attr node will yield an * empty Attr of the same name. * <p> * NOTE: Clones will always be read/write, even if the node being cloned * is read-only, to permit applications using only the DOM API to obtain * editable copies of locked portions of the tree. */	TokenNameCOMMENT_JAVADOC	 Returns a duplicate of a given node. You can consider this a generic "copy constructor" for nodes. The newly returned object should be completely independent of the source object's subtree, so changes in one after the clone has been made will not affect the other. <P> Note: since we never have any children deep is meaningless here, ParentNode overrides this behavior. @see ParentNode * <p> Example: Cloning a Text node will copy both the node and the text it contains. <p> Example: Cloning something that has children -- Element or Attr, for example -- will _not_ clone those children unless a "deep clone" has been requested. A shallow clone of an Attr node will yield an empty Attr of the same name. <p> NOTE: Clones will always be read/write, even if the node being cloned is read-only, to permit applications using only the DOM API to obtain editable copies of locked portions of the tree. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChildNode	TokenNameIdentifier	 Child Node
newnode	TokenNameIdentifier	 newnode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Need to break the association w/ original kids 	TokenNameCOMMENT_LINE	Need to break the association w/ original kids 
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newnode	TokenNameIdentifier	 newnode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// cloneNode(boolean):Node 	TokenNameCOMMENT_LINE	cloneNode(boolean):Node 
/** * Returns the parent node of this node */	TokenNameCOMMENT_JAVADOC	 Returns the parent node of this node 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we have an owner, ownerNode is our parent, otherwise it's 	TokenNameCOMMENT_LINE	if we have an owner, ownerNode is our parent, otherwise it's 
// our ownerDocument and we don't have a parent 	TokenNameCOMMENT_LINE	our ownerDocument and we don't have a parent 
return	TokenNamereturn	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ownerNode	TokenNameIdentifier	 owner Node
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * same as above but returns internal type */	TokenNameCOMMENT_BLOCK	 same as above but returns internal type 
final	TokenNamefinal	
NodeImpl	TokenNameIdentifier	 Node Impl
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we have an owner, ownerNode is our parent, otherwise it's 	TokenNameCOMMENT_LINE	if we have an owner, ownerNode is our parent, otherwise it's 
// our ownerDocument and we don't have a parent 	TokenNameCOMMENT_LINE	our ownerDocument and we don't have a parent 
return	TokenNamereturn	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ownerNode	TokenNameIdentifier	 owner Node
:	TokenNameCOLON	
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
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The previous child of this node's parent, or null if none */	TokenNameCOMMENT_JAVADOC	 The previous child of this node's parent, or null if none 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we are the firstChild, previousSibling actually refers to our 	TokenNameCOMMENT_LINE	if we are the firstChild, previousSibling actually refers to our 
// parent's lastChild, but we hide that 	TokenNameCOMMENT_LINE	parent's lastChild, but we hide that 
return	TokenNamereturn	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * same as above but returns internal type */	TokenNameCOMMENT_BLOCK	 same as above but returns internal type 
final	TokenNamefinal	
ChildNode	TokenNameIdentifier	 Child Node
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we are the firstChild, previousSibling actually refers to our 	TokenNameCOMMENT_LINE	if we are the firstChild, previousSibling actually refers to our 
// parent's lastChild, but we hide that 	TokenNameCOMMENT_LINE	parent's lastChild, but we hide that 
return	TokenNamereturn	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
previousSibling	TokenNameIdentifier	 previous Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class ChildNode 	TokenNameCOMMENT_LINE	class ChildNode 
