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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
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
Element	TokenNameIdentifier	 Element
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
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
TypeInfo	TokenNameIdentifier	 Type Info
;	TokenNameSEMICOLON	
/** * Attribute represents an XML-style attribute of an * Element. Typically, the allowable values are controlled by its * declaration in the Document Type Definition (DTD) governing this * kind of document. * <P> * If the attribute has not been explicitly assigned a value, but has * been declared in the DTD, it will exist and have that default. Only * if neither the document nor the DTD specifies a value will the * Attribute really be considered absent and have no value; in that * case, querying the attribute will return null. * <P> * Attributes may have multiple children that contain their data. (XML * allows attributes to contain entity references, and tokenized * attribute types such as NMTOKENS may have a child for each token.) * For convenience, the Attribute object's getValue() method returns * the string version of the attribute's value. * <P> * Attributes are not children of the Elements they belong to, in the * usual sense, and have no valid Parent reference. However, the spec * says they _do_ belong to a specific Element, and an INUSE exception * is to be thrown if the user attempts to explicitly share them * between elements. * <P> * Note that Elements do not permit attributes to appear to be shared * (see the INUSE exception), so this object's mutability is * officially not an issue. * <p> * Note: The ownerNode attribute is used to store the Element the Attr * node is associated with. Attr nodes do not have parent nodes. * Besides, the getOwnerElement() method can be used to get the element node * this attribute is associated with. * <P> * AttrImpl does not support Namespaces. AttrNSImpl, which inherits from * it, does. * * <p>AttrImpl used to inherit from ParentNode. It now directly inherits from * NodeImpl and provide its own implementation of the ParentNode's behavior. * The reason is that we now try and avoid to always create a Text node to * hold the value of an attribute. The DOM spec requires it, so we still have * to do it in case getFirstChild() is called for instance. The reason * attribute values are stored as a list of nodes is so that they can carry * more than a simple string. They can also contain EntityReference nodes. * However, most of the times people only have a single string that they only * set and get through Element.set/getAttribute or Attr.set/getValue. In this * new version, the Attr node has a value pointer which can either be the * String directly or a pointer to the first ChildNode. A flag tells which one * it currently is. Note that while we try to stick with the direct String as * much as possible once we've switched to a node there is no going back. This * is because we have no way to know whether the application keeps referring to * the node we once returned. * <p> The gain in memory varies on the density of attributes in the document. * But in the tests I've run I've seen up to 12% of memory gain. And the good * thing is that it also leads to a slight gain in speed because we allocate * fewer objects! I mean, that's until we have to actually create the node... * <p> * To avoid too much duplicated code, I got rid of ParentNode and renamed * ChildAndParentNode, which I never really liked, to ParentNode for * simplicity, this doesn't make much of a difference in memory usage because * there are only very few objects that are only a Parent. This is only true * now because AttrImpl now inherits directly from NodeImpl and has its own * implementation of the ParentNode's node behavior. So there is still some * duplicated code there. * <p> * This class doesn't directly support mutation events, however, it notifies * the document when mutations are performed so that the document class do so. * * <p><b>WARNING</b>: Some of the code here is partially duplicated in * ParentNode, be careful to keep these two classes in sync! * * @xerces.internal * * @see AttrNSImpl * * @author Arnaud Le Hors, IBM * @author Joe Kesselman, IBM * @author Andy Clark, IBM * @version $Id: AttrImpl.java 924245 2010-03-17 11:58:14Z mrglavas $ * @since PR-DOM-Level-1-19980818. * */	TokenNameCOMMENT_JAVADOC	 Attribute represents an XML-style attribute of an Element. Typically, the allowable values are controlled by its declaration in the Document Type Definition (DTD) governing this kind of document. <P> If the attribute has not been explicitly assigned a value, but has been declared in the DTD, it will exist and have that default. Only if neither the document nor the DTD specifies a value will the Attribute really be considered absent and have no value; in that case, querying the attribute will return null. <P> Attributes may have multiple children that contain their data. (XML allows attributes to contain entity references, and tokenized attribute types such as NMTOKENS may have a child for each token.) For convenience, the Attribute object's getValue() method returns the string version of the attribute's value. <P> Attributes are not children of the Elements they belong to, in the usual sense, and have no valid Parent reference. However, the spec says they _do_ belong to a specific Element, and an INUSE exception is to be thrown if the user attempts to explicitly share them between elements. <P> Note that Elements do not permit attributes to appear to be shared (see the INUSE exception), so this object's mutability is officially not an issue. <p> Note: The ownerNode attribute is used to store the Element the Attr node is associated with. Attr nodes do not have parent nodes. Besides, the getOwnerElement() method can be used to get the element node this attribute is associated with. <P> AttrImpl does not support Namespaces. AttrNSImpl, which inherits from it, does. * <p>AttrImpl used to inherit from ParentNode. It now directly inherits from NodeImpl and provide its own implementation of the ParentNode's behavior. The reason is that we now try and avoid to always create a Text node to hold the value of an attribute. The DOM spec requires it, so we still have to do it in case getFirstChild() is called for instance. The reason attribute values are stored as a list of nodes is so that they can carry more than a simple string. They can also contain EntityReference nodes. However, most of the times people only have a single string that they only set and get through Element.set/getAttribute or Attr.set/getValue. In this new version, the Attr node has a value pointer which can either be the String directly or a pointer to the first ChildNode. A flag tells which one it currently is. Note that while we try to stick with the direct String as much as possible once we've switched to a node there is no going back. This is because we have no way to know whether the application keeps referring to the node we once returned. <p> The gain in memory varies on the density of attributes in the document. But in the tests I've run I've seen up to 12% of memory gain. And the good thing is that it also leads to a slight gain in speed because we allocate fewer objects! I mean, that's until we have to actually create the node... <p> To avoid too much duplicated code, I got rid of ParentNode and renamed ChildAndParentNode, which I never really liked, to ParentNode for simplicity, this doesn't make much of a difference in memory usage because there are only very few objects that are only a Parent. This is only true now because AttrImpl now inherits directly from NodeImpl and has its own implementation of the ParentNode's node behavior. So there is still some duplicated code there. <p> This class doesn't directly support mutation events, however, it notifies the document when mutations are performed so that the document class do so. * <p><b>WARNING</b>: Some of the code here is partially duplicated in ParentNode, be careful to keep these two classes in sync! * @xerces.internal * @see AttrNSImpl * @author Arnaud Le Hors, IBM @author Joe Kesselman, IBM @author Andy Clark, IBM @version $Id: AttrImpl.java 924245 2010-03-17 11:58:14Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
AttrImpl	TokenNameIdentifier	 Attr Impl
extends	TokenNameextends	
NodeImpl	TokenNameIdentifier	 Node Impl
implements	TokenNameimplements	
Attr	TokenNameIdentifier	 Attr
,	TokenNameCOMMA	
TypeInfo	TokenNameIdentifier	 Type Info
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
7277707688218972102L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** DTD namespace. **/	TokenNameCOMMENT_JAVADOC	 DTD namespace. *
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DTD_URI	TokenNameIdentifier	 DTD  URI
=	TokenNameEQUAL	
"http://www.w3.org/TR/REC-xml"	TokenNameStringLiteral	http://www.w3.org/TR/REC-xml
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** This can either be a String or the first child node. */	TokenNameCOMMENT_JAVADOC	 This can either be a String or the first child node. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Attribute name. */	TokenNameCOMMENT_JAVADOC	 Attribute name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** Type information */	TokenNameCOMMENT_JAVADOC	 Type information 
// REVISIT: we are losing the type information in DOM during serialization 	TokenNameCOMMENT_LINE	REVISIT: we are losing the type information in DOM during serialization 
transient	TokenNametransient	
Object	TokenNameIdentifier	 Object
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Attribute has no public constructor. Please use the factory * method in the Document class. */	TokenNameCOMMENT_JAVADOC	 Attribute has no public constructor. Please use the factory method in the Document class. 
protected	TokenNameprotected	
AttrImpl	TokenNameIdentifier	 Attr Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** False for default attributes. */	TokenNameCOMMENT_JAVADOC	 False for default attributes. 
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for AttrNSImpl 	TokenNameCOMMENT_LINE	for AttrNSImpl 
protected	TokenNameprotected	
AttrImpl	TokenNameIdentifier	 Attr Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Support for DOM Level 3 renameNode method. 	TokenNameCOMMENT_LINE	Support for DOM Level 3 renameNode method. 
// Note: This only deals with part of the pb. It is expected to be 	TokenNameCOMMENT_LINE	Note: This only deals with part of the pb. It is expected to be 
// called after the Attr has been detached for one thing. 	TokenNameCOMMENT_LINE	called after the Attr has been detached for one thing. 
// CoreDocumentImpl does all the work. 	TokenNameCOMMENT_LINE	CoreDocumentImpl does all the work. 
void	TokenNamevoid	
rename	TokenNameIdentifier	 rename
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create a real text node as child if we don't have one yet 	TokenNameCOMMENT_LINE	create a real text node as child if we don't have one yet 
protected	TokenNameprotected	
void	TokenNamevoid	
makeChildNode	TokenNameIdentifier	 make Child Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextImpl	TokenNameIdentifier	 Text Impl
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TextImpl	TokenNameIdentifier	 Text Impl
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
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
}	TokenNameRBRACE	
/** * NON-DOM: set the type of this attribute to be ID type. * * @param id */	TokenNameCOMMENT_JAVADOC	 NON-DOM: set the type of this attribute to be ID type. * @param id 
public	TokenNamepublic	
void	TokenNamevoid	
setIdAttribute	TokenNameIdentifier	 set Id Attribute
(	TokenNameLPAREN	
boolean	TokenNameboolean	
id	TokenNameIdentifier	 id
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
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** DOM Level 3: isId*/	TokenNameCOMMENT_JAVADOC	 DOM Level 3: isId
public	TokenNamepublic	
boolean	TokenNameboolean	
isId	TokenNameIdentifier	 is Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: should an attribute that is not in the tree return 	TokenNameCOMMENT_LINE	REVISIT: should an attribute that is not in the tree return 
// isID true? 	TokenNameCOMMENT_LINE	isID true? 
return	TokenNamereturn	
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
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
AttrImpl	TokenNameIdentifier	 Attr Impl
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// take care of case where there are kids 	TokenNameCOMMENT_LINE	take care of case where there are kids 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Need to break the association w/ original kids 	TokenNameCOMMENT_LINE	Need to break the association w/ original kids 
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Cloning an Attribute always clones its children, 	TokenNameCOMMENT_LINE	Cloning an Attribute always clones its children, 
// since they represent its value, no matter whether this 	TokenNameCOMMENT_LINE	since they represent its value, no matter whether this 
// is a deep clone or not 	TokenNameCOMMENT_LINE	is a deep clone or not 
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
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
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A short integer indicating what type of node this is. The named * constants for this value are defined in the org.w3c.dom.Node interface. */	TokenNameCOMMENT_JAVADOC	 A short integer indicating what type of node this is. The named constants for this value are defined in the org.w3c.dom.Node interface. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the attribute name */	TokenNameCOMMENT_JAVADOC	 Returns the attribute name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
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
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implicit in the rerouting of getNodeValue to getValue is the * need to redefine setNodeValue, for symmetry's sake. Note that * since we're explicitly providing a value, Specified should be set * true.... even if that value equals the default. */	TokenNameCOMMENT_JAVADOC	 Implicit in the rerouting of getNodeValue to getValue is the need to redefine setNodeValue, for symmetry's sake. Note that since we're explicitly providing a value, Specified should be set true.... even if that value equals the default. 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.TypeInfo#getTypeName() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.TypeInfo#getTypeName() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.TypeInfo#getTypeNamespace() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.TypeInfo#getTypeNamespace() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeNamespace	TokenNameIdentifier	 get Type Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DTD_URI	TokenNameIdentifier	 DTD  URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method getSchemaTypeInfo. * @return TypeInfo */	TokenNameCOMMENT_JAVADOC	 Method getSchemaTypeInfo. @return TypeInfo 
public	TokenNamepublic	
TypeInfo	TokenNameIdentifier	 Type Info
getSchemaTypeInfo	TokenNameIdentifier	 get Schema Type Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * In Attribute objects, NodeValue is considered a synonym for * Value. * * @see #getValue() */	TokenNameCOMMENT_JAVADOC	 In Attribute objects, NodeValue is considered a synonym for Value. * @see #getValue() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Attr methods 	TokenNameCOMMENT_LINE	Attr methods 
// 	TokenNameCOMMENT_LINE	 
/** * In Attributes, NodeName is considered a synonym for the * attribute's Name */	TokenNameCOMMENT_JAVADOC	 In Attributes, NodeName is considered a synonym for the attribute's Name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
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
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getName():String 	TokenNameCOMMENT_LINE	getName():String 
/** * The DOM doesn't clearly define what setValue(null) means. I've taken it * as "remove all children", which from outside should appear * similar to setting it to the empty string. */	TokenNameCOMMENT_JAVADOC	 The DOM doesn't clearly define what setValue(null) means. I've taken it as "remove all children", which from outside should appear similar to setting it to the empty string. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newvalue	TokenNameIdentifier	 newvalue
)	TokenNameRPAREN	
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
&&	TokenNameAND_AND	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
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
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Element	TokenNameIdentifier	 Element
ownerElement	TokenNameIdentifier	 owner Element
=	TokenNameEQUAL	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
oldvalue	TokenNameIdentifier	 oldvalue
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
TextImpl	TokenNameIdentifier	 Text Impl
textNode	TokenNameIdentifier	 text Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getMutationEvents	TokenNameIdentifier	 get Mutation Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Can no longer just discard the kids; they may have 	TokenNameCOMMENT_LINE	Can no longer just discard the kids; they may have 
// event listeners waiting for them to disconnect. 	TokenNameCOMMENT_LINE	event listeners waiting for them to disconnect. 
if	TokenNameif	
(	TokenNameLPAREN	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldvalue	TokenNameIdentifier	 oldvalue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// create an actual text node as our child so 	TokenNameCOMMENT_LINE	create an actual text node as our child so 
// that we can use it in the event 	TokenNameCOMMENT_LINE	that we can use it in the event 
textNode	TokenNameIdentifier	 text Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TextImpl	TokenNameIdentifier	 Text Impl
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
textNode	TokenNameIdentifier	 text Node
;	TokenNameSEMICOLON	
textNode	TokenNameIdentifier	 text Node
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textNode	TokenNameIdentifier	 text Node
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
textNode	TokenNameIdentifier	 text Node
;	TokenNameSEMICOLON	
textNode	TokenNameIdentifier	 text Node
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
textNode	TokenNameIdentifier	 text Node
.	TokenNameDOT	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
internalRemoveChild	TokenNameIdentifier	 internal Remove Child
(	TokenNameLPAREN	
textNode	TokenNameIdentifier	 text Node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
oldvalue	TokenNameIdentifier	 oldvalue
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internalRemoveChild	TokenNameIdentifier	 internal Remove Child
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldvalue	TokenNameIdentifier	 oldvalue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// simply discard children if any 	TokenNameCOMMENT_LINE	simply discard children if any 
oldvalue	TokenNameIdentifier	 oldvalue
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove ref from first child to last child 	TokenNameCOMMENT_LINE	remove ref from first child to last child 
ChildNode	TokenNameIdentifier	 Child Node
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// then remove ref to current value 	TokenNameCOMMENT_LINE	then remove ref to current value 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ownerElement	TokenNameIdentifier	 owner Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
removeIdentifier	TokenNameIdentifier	 remove Identifier
(	TokenNameLPAREN	
oldvalue	TokenNameIdentifier	 oldvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Create and add the new one, generating only non-aggregate events 	TokenNameCOMMENT_LINE	Create and add the new one, generating only non-aggregate events 
// (There are no listeners on the new Text, but there may be 	TokenNameCOMMENT_LINE	(There are no listeners on the new Text, but there may be 
// capture/bubble listeners on the Attr. 	TokenNameCOMMENT_LINE	capture/bubble listeners on the Attr. 
// Note that aggregate events are NOT dispatched here, 	TokenNameCOMMENT_LINE	Note that aggregate events are NOT dispatched here, 
// since we need to combine the remove and insert. 	TokenNameCOMMENT_LINE	since we need to combine the remove and insert. 
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getMutationEvents	TokenNameIdentifier	 get Mutation Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if there are any event handlers create a real node or 	TokenNameCOMMENT_LINE	if there are any event handlers create a real node or 
// reuse the one we synthesized for the remove notifications 	TokenNameCOMMENT_LINE	reuse the one we synthesized for the remove notifications 
// if it exists. 	TokenNameCOMMENT_LINE	if it exists. 
if	TokenNameif	
(	TokenNameLPAREN	
textNode	TokenNameIdentifier	 text Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textNode	TokenNameIdentifier	 text Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TextImpl	TokenNameIdentifier	 Text Impl
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
newvalue	TokenNameIdentifier	 newvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
textNode	TokenNameIdentifier	 text Node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
newvalue	TokenNameIdentifier	 newvalue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
internalInsertBefore	TokenNameIdentifier	 internal Insert Before
(	TokenNameLPAREN	
textNode	TokenNameIdentifier	 text Node
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
modifiedAttrValue	TokenNameIdentifier	 modified Attr Value
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
oldvalue	TokenNameIdentifier	 oldvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// directly store the string 	TokenNameCOMMENT_LINE	directly store the string 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
newvalue	TokenNameIdentifier	 newvalue
;	TokenNameSEMICOLON	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changed	TokenNameIdentifier	 changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ownerElement	TokenNameIdentifier	 owner Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
putIdentifier	TokenNameIdentifier	 put Identifier
(	TokenNameLPAREN	
newvalue	TokenNameIdentifier	 newvalue
,	TokenNameCOMMA	
ownerElement	TokenNameIdentifier	 owner Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setValue(String) 	TokenNameCOMMENT_LINE	setValue(String) 
/** * The "string value" of an Attribute is its text representation, * which in turn is a concatenation of the string values of its children. */	TokenNameCOMMENT_JAVADOC	 The "string value" of an Attribute is its text representation, which in turn is a concatenation of the string values of its children. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
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
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ChildNode	TokenNameIdentifier	 Child Node
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
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
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EntityReferenceImpl	TokenNameIdentifier	 Entity Reference Impl
)	TokenNameRPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
.	TokenNameDOT	
getEntityRefValue	TokenNameIdentifier	 get Entity Ref Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ChildNode	TokenNameIdentifier	 Child Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
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
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EntityReferenceImpl	TokenNameIdentifier	 Entity Reference Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getEntityRefValue	TokenNameIdentifier	 get Entity Ref Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getValue():String 	TokenNameCOMMENT_LINE	getValue():String 
/** * The "specified" flag is true if and only if this attribute's * value was explicitly specified in the original document. Note that * the implementation, not the user, is in charge of this * property. If the user asserts an Attribute value (even if it ends * up having the same value as the default), it is considered a * specified attribute. If you really want to revert to the default, * delete the attribute from the Element, and the Implementation will * re-assert the default (if any) in its place, with the appropriate * specified=false setting. */	TokenNameCOMMENT_JAVADOC	 The "specified" flag is true if and only if this attribute's value was explicitly specified in the original document. Note that the implementation, not the user, is in charge of this property. If the user asserts an Attribute value (even if it ends up having the same value as the default), it is considered a specified attribute. If you really want to revert to the default, delete the attribute from the Element, and the Implementation will re-assert the default (if any) in its place, with the appropriate specified=false setting. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getSpecified	TokenNameIdentifier	 get Specified
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
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getSpecified():boolean 	TokenNameCOMMENT_LINE	getSpecified():boolean 
// 	TokenNameCOMMENT_LINE	 
// Attr2 methods 	TokenNameCOMMENT_LINE	Attr2 methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the element node that this attribute is associated with, * or null if the attribute has not been added to an element. * * @see #getOwnerElement * * @deprecated Previous working draft of DOM Level 2. New method * is <tt>getOwnerElement()</tt>. */	TokenNameCOMMENT_JAVADOC	 Returns the element node that this attribute is associated with, or null if the attribute has not been added to an element. * @see #getOwnerElement * @deprecated Previous working draft of DOM Level 2. New method is <tt>getOwnerElement()</tt>. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we have an owner, ownerNode is our ownerElement, otherwise it's 	TokenNameCOMMENT_LINE	if we have an owner, ownerNode is our ownerElement, otherwise it's 
// our ownerDocument and we don't have an ownerElement 	TokenNameCOMMENT_LINE	our ownerDocument and we don't have an ownerElement 
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
(	TokenNameLPAREN	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ownerNode	TokenNameIdentifier	 owner Node
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the element node that this attribute is associated with, * or null if the attribute has not been added to an element. * * @since WD-DOM-Level-2-19990719 */	TokenNameCOMMENT_JAVADOC	 Returns the element node that this attribute is associated with, or null if the attribute has not been added to an element. * @since WD-DOM-Level-2-19990719 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we have an owner, ownerNode is our ownerElement, otherwise it's 	TokenNameCOMMENT_LINE	if we have an owner, ownerNode is our ownerElement, otherwise it's 
// our ownerDocument and we don't have an ownerElement 	TokenNameCOMMENT_LINE	our ownerDocument and we don't have an ownerElement 
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
(	TokenNameLPAREN	
isOwned	TokenNameIdentifier	 is Owned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ownerNode	TokenNameIdentifier	 owner Node
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No need to normalize if already normalized or 	TokenNameCOMMENT_LINE	No need to normalize if already normalized or 
// if value is kept as a String. 	TokenNameCOMMENT_LINE	if value is kept as a String. 
if	TokenNameif	
(	TokenNameLPAREN	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
kid	TokenNameIdentifier	 kid
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
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
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If kid is a text node, we need to check for one of two 	TokenNameCOMMENT_LINE	If kid is a text node, we need to check for one of two 
// conditions: 	TokenNameCOMMENT_LINE	conditions: 
// 1) There is an adjacent text node 	TokenNameCOMMENT_LINE	1) There is an adjacent text node 
// 2) There is no adjacent text node, but kid is 	TokenNameCOMMENT_LINE	2) There is no adjacent text node, but kid is 
// an empty text node. 	TokenNameCOMMENT_LINE	an empty text node. 
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
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
// If an adjacent text node, merge it with kid 	TokenNameCOMMENT_LINE	If an adjacent text node, merge it with kid 
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
)	TokenNameRPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
.	TokenNameDOT	
appendData	TokenNameIdentifier	 append Data
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
;	TokenNameSEMICOLON	
// Don't advance; there might be another. 	TokenNameCOMMENT_LINE	Don't advance; there might be another. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// If kid is empty, remove it 	TokenNameCOMMENT_LINE	If kid is empty, remove it 
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize() 	TokenNameCOMMENT_LINE	normalize() 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** NON-DOM, for use by parser */	TokenNameCOMMENT_JAVADOC	 NON-DOM, for use by parser 
public	TokenNamepublic	
void	TokenNamevoid	
setSpecified	TokenNameIdentifier	 set Specified
(	TokenNameLPAREN	
boolean	TokenNameboolean	
arg	TokenNameIdentifier	 arg
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
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setSpecified(boolean) 	TokenNameCOMMENT_LINE	setSpecified(boolean) 
/** * NON-DOM: used by the parser * @param type */	TokenNameCOMMENT_JAVADOC	 NON-DOM: used by the parser @param type 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** NON-DOM method for debugging convenience */	TokenNameCOMMENT_JAVADOC	 NON-DOM method for debugging convenience 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
;	TokenNameSEMICOLON	
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
value	TokenNameIdentifier	 value
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
// JKESS: KNOWN ISSUE HERE 	TokenNameCOMMENT_LINE	JKESS: KNOWN ISSUE HERE 
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
makeChildNode	TokenNameIdentifier	 make Child Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
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
makeChildNode	TokenNameIdentifier	 make Child Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"HIERARCHY_REQUEST_ERR"	TokenNameStringLiteral	HIERARCHY_REQUEST_ERR
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
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
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
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
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
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
"HIERARCHY_REQUEST_ERR"	TokenNameStringLiteral	HIERARCHY_REQUEST_ERR
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
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
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
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
"HIERARCHY_REQUEST_ERR"	TokenNameStringLiteral	HIERARCHY_REQUEST_ERR
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
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
makeChildNode	TokenNameIdentifier	 make Child Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure we have a node and not a string 	TokenNameCOMMENT_LINE	make sure we have a node and not a string 
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
ChildNode	TokenNameIdentifier	 Child Node
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this our first and only child 	TokenNameCOMMENT_LINE	this our first and only child 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
// firstchild = newInternal; 	TokenNameCOMMENT_LINE	firstchild = newInternal; 
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
newInternal	TokenNameIdentifier	 new Internal
;	TokenNameSEMICOLON	
// firstChild = newInternal; 	TokenNameCOMMENT_LINE	firstChild = newInternal; 
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
// internalInsertBefore(Node,Node,int):Node 	TokenNameCOMMENT_LINE	internalInsertBefore(Node,Node,int):Node 
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
if	TokenNameif	
(	TokenNameLPAREN	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we don't have any child per say so it can't be one of them! 	TokenNameCOMMENT_LINE	we don't have any child per say so it can't be one of them! 
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
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
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
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
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
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
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
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
// Patch linked list around oldChild 	TokenNameCOMMENT_LINE	Patch linked list around oldChild 
// Note: lastChild == firstChild.previousSibling 	TokenNameCOMMENT_LINE	Note: lastChild == firstChild.previousSibling 
if	TokenNameif	
(	TokenNameLPAREN	
oldInternal	TokenNameIdentifier	 old Internal
==	TokenNameEQUAL_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// oldInternal == firstChild 	TokenNameCOMMENT_LINE	oldInternal == firstChild 
// removing first child 	TokenNameCOMMENT_LINE	removing first child 
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
isFirstChild	TokenNameIdentifier	 is First Child
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// next line is: firstChild = oldInternal.nextSibling 	TokenNameCOMMENT_LINE	next line is: firstChild = oldInternal.nextSibling 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
oldInternal	TokenNameIdentifier	 old Internal
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
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
ChildNode	TokenNameIdentifier	 Child Node
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
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
// internalRemoveChild(Node,int):Node 	TokenNameCOMMENT_LINE	internalRemoveChild(Node,int):Node 
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
makeChildNode	TokenNameIdentifier	 make Child Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If Mutation Events are being generated, this operation might 	TokenNameCOMMENT_LINE	If Mutation Events are being generated, this operation might 
// throw aggregate events twice when modifying an Attr -- once 	TokenNameCOMMENT_LINE	throw aggregate events twice when modifying an Attr -- once 
// on insertion and once on removal. DOM Level 2 does not specify 	TokenNameCOMMENT_LINE	on insertion and once on removal. DOM Level 2 does not specify 
// this as either desirable or undesirable, but hints that 	TokenNameCOMMENT_LINE	this as either desirable or undesirable, but hints that 
// aggregations should be issued only once per user request. 	TokenNameCOMMENT_LINE	aggregations should be issued only once per user request. 
// notify document 	TokenNameCOMMENT_LINE	notify document 
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// 	TokenNameCOMMENT_LINE	 
// NodeList methods 	TokenNameCOMMENT_LINE	NodeList methods 
// 	TokenNameCOMMENT_LINE	 
/** * NodeList method: Count the immediate children of this node * @return int */	TokenNameCOMMENT_JAVADOC	 NodeList method: Count the immediate children of this node @return int 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ChildNode	TokenNameIdentifier	 Child Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLength():int 	TokenNameCOMMENT_LINE	getLength():int 
/** * NodeList method: Return the Nth immediate child of this node, or * null if the index is out of bounds. * @return org.w3c.dom.Node * @param index int */	TokenNameCOMMENT_JAVADOC	 NodeList method: Return the Nth immediate child of this node, or null if the index is out of bounds. @return org.w3c.dom.Node @param index int 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
makeChildNode	TokenNameIdentifier	 make Child Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
ChildNode	TokenNameIdentifier	 Child Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
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
index	TokenNameIdentifier	 index
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// item(int):Node 	TokenNameCOMMENT_LINE	item(int):Node 
// 	TokenNameCOMMENT_LINE	 
// DOM3 	TokenNameCOMMENT_LINE	DOM3 
// 	TokenNameCOMMENT_LINE	 
/** * DOM Level 3 WD- Experimental. * Override inherited behavior from ParentNode to support deep equal. * isEqualNode is always deep on Attr nodes. */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD- Experimental. Override inherited behavior from ParentNode to support deep equal. isEqualNode is always deep on Attr nodes. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 3. <p> * Checks if a type is derived from another by restriction. See: * http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom * * @param typeNamespaceArg * The namspace of the ancestor type declaration * @param typeNameArg * The name of the ancestor type declaration * @param derivationMethod * The derivation method * * @return boolean True if the type is derived by restriciton for the * reference type */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 3. <p> Checks if a type is derived from another by restriction. See: http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom * @param typeNamespaceArg The namspace of the ancestor type declaration @param typeNameArg The name of the ancestor type declaration @param derivationMethod The derivation method * @return boolean True if the type is derived by restriciton for the reference type 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDerivedFrom	TokenNameIdentifier	 is Derived From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typeNamespaceArg	TokenNameIdentifier	 type Namespace Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
typeNameArg	TokenNameIdentifier	 type Name Arg
,	TokenNameCOMMA	
int	TokenNameint	
derivationMethod	TokenNameIdentifier	 derivation Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
if	TokenNameif	
(	TokenNameLPAREN	
hasStringValue	TokenNameIdentifier	 has String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Recursively set kids 	TokenNameCOMMENT_LINE	Recursively set kids 
for	TokenNamefor	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
mykid	TokenNameIdentifier	 mykid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
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
// checkNormalizationAfterRemove(ChildNode) 	TokenNameCOMMENT_LINE	checkNormalizationAfterRemove(ChildNode) 
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
// hardset synchildren - so we don't try to sync - 	TokenNameCOMMENT_LINE	hardset synchildren - so we don't try to sync - 
// it does not make any sense to try to synchildren when we just 	TokenNameCOMMENT_LINE	it does not make any sense to try to synchildren when we just 
// deserialize object. 	TokenNameCOMMENT_LINE	deserialize object. 
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// readObject(ObjectInputStream) 	TokenNameCOMMENT_LINE	readObject(ObjectInputStream) 
}	TokenNameRBRACE	
// class AttrImpl 	TokenNameCOMMENT_LINE	class AttrImpl 
