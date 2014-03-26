/* * Copyright (c) 2001 World Wide Web Consortium, * (Massachusetts Institute of Technology, Institut National de * Recherche en Informatique et en Automatique, Keio University). All * Rights Reserved. This program is distributed under the W3C's Software * Intellectual Property License. This program is distributed in the * hope that it will be useful, but WITHOUT ANY WARRANTY; without even * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR * PURPOSE. * See W3C License http://www.w3.org/Consortium/Legal/ for more details. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2001 World Wide Web Consortium, (Massachusetts Institute of Technology, Institut National de Recherche en Informatique et en Automatique, Keio University). All Rights Reserved. This program is distributed under the W3C's Software Intellectual Property License. This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See W3C License http://www.w3.org/Consortium/Legal/ for more details. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
.	TokenNameDOT	
as	TokenNameIdentifier	 as
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
/** * @deprecated * Objects implementing the <code>ASNamedObjectMap</code> interface are used * to represent collections of abstract schema nodes that can be accessed by * name. Note that <code>ASNamedObjectMap</code> does not inherit from * <code>ASObjectList</code>; <code>ASNamedObjectMaps</code> are not * maintained in any particular order. Objects contained in an object * implementing <code>ASNamedObjectMap</code> may also be accessed by an * ordinal index, but this is simply to allow convenient enumeration of the * contents of a <code>ASNamedObjectMap</code>, and does not imply that the * DOM specifies an order to these <code>ASObjects</code>. * <p><code>ASNamedObjectMap</code> object in the DOM are live. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated Objects implementing the <code>ASNamedObjectMap</code> interface are used to represent collections of abstract schema nodes that can be accessed by name. Note that <code>ASNamedObjectMap</code> does not inherit from <code>ASObjectList</code>; <code>ASNamedObjectMaps</code> are not maintained in any particular order. Objects contained in an object implementing <code>ASNamedObjectMap</code> may also be accessed by an ordinal index, but this is simply to allow convenient enumeration of the contents of a <code>ASNamedObjectMap</code>, and does not imply that the DOM specifies an order to these <code>ASObjects</code>. <p><code>ASNamedObjectMap</code> object in the DOM are live. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
ASNamedObjectMap	TokenNameIdentifier	 AS Named Object Map
{	TokenNameLBRACE	
/** * The number of <code>ASObjects</code> in the <code>ASObjectList</code>. * The range of valid child node indices is 0 to <code>length-1</code> * inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of <code>ASObjects</code> in the <code>ASObjectList</code>. The range of valid child node indices is 0 to <code>length-1</code> inclusive. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieves an <code>ASObject</code> specified by name. * @param name The <code>nodeName</code> of an <code>ASObject</code> to * retrieve. * @return An <code>ASObject</code> with specified node name and * <code>null</code> if the map does not contain an element with the * given name. */	TokenNameCOMMENT_JAVADOC	 Retrieves an <code>ASObject</code> specified by name. @param name The <code>nodeName</code> of an <code>ASObject</code> to retrieve. @return An <code>ASObject</code> with specified node name and <code>null</code> if the map does not contain an element with the given name. 
public	TokenNamepublic	
ASObject	TokenNameIdentifier	 AS Object
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieves an <code>ASObject</code> specified by local name and * namespace URI. * @param namespaceURI The namespace URI of the <code>ASObject</code> to * retrieve. * @param localName The local name of the <code>ASObject</code> to * retrieve. * @return A <code>ASObject</code> (of any type) with the specified local * name and namespace URI, or <code>null</code> if they do not * identify any <code>ASObject</code> in this map. */	TokenNameCOMMENT_JAVADOC	 Retrieves an <code>ASObject</code> specified by local name and namespace URI. @param namespaceURI The namespace URI of the <code>ASObject</code> to retrieve. @param localName The local name of the <code>ASObject</code> to retrieve. @return A <code>ASObject</code> (of any type) with the specified local name and namespace URI, or <code>null</code> if they do not identify any <code>ASObject</code> in this map. 
public	TokenNamepublic	
ASObject	TokenNameIdentifier	 AS Object
getNamedItemNS	TokenNameIdentifier	 get Named Item NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the <code>index</code>th item in the map. The index starts at * <code>0</code>. If <code>index</code> is greater than or equal to the * number of nodes in the list, this returns <code>null</code>. * @param index The position in the map from which the item is to be * retrieved. * @return The <code>ASObject</code> at the <code>index</code>th position * in the <code>ASNamedObjectMap</code>, or <code>null</code> if that * is not a valid index. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the map. The index starts at <code>0</code>. If <code>index</code> is greater than or equal to the number of nodes in the list, this returns <code>null</code>. @param index The position in the map from which the item is to be retrieved. @return The <code>ASObject</code> at the <code>index</code>th position in the <code>ASNamedObjectMap</code>, or <code>null</code> if that is not a valid index. 
public	TokenNamepublic	
ASObject	TokenNameIdentifier	 AS Object
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes an <code>ASObject</code> specified by a <code>nodeName</code>. * @param name The <code>nodeName</code> of the <code>ASObject</code> to * be removed. * @return The <code>ASObject</code> removed from this map if an * <code>ASObject</code> with such a name exists. * @exception DOMException * NOT_FOUND_ERR: Raised if there is no node named <code>name</code> in * this map. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. */	TokenNameCOMMENT_JAVADOC	 Removes an <code>ASObject</code> specified by a <code>nodeName</code>. @param name The <code>nodeName</code> of the <code>ASObject</code> to be removed. @return The <code>ASObject</code> removed from this map if an <code>ASObject</code> with such a name exists. @exception DOMException NOT_FOUND_ERR: Raised if there is no node named <code>name</code> in this map. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. 
public	TokenNamepublic	
ASObject	TokenNameIdentifier	 AS Object
removeNamedItem	TokenNameIdentifier	 remove Named Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Removes an <code>ASObject</code> specified by a namespace URI and a * local name. * @param namespaceURI The namespace URI of the <code>ASObject</code> to * be removed. * @param localName The local name of the <code>ASObject</code> to remove. * @return The <code>ASObject</code> removed from this map if an * <code>ASObject</code> with such a local name and namespace URI * exists. * @exception DOMException * NOT_FOUND_ERR: Raised if there is no node with the specified * <code>namespaceURI</code> and <code>localName</code> in this map. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. */	TokenNameCOMMENT_JAVADOC	 Removes an <code>ASObject</code> specified by a namespace URI and a local name. @param namespaceURI The namespace URI of the <code>ASObject</code> to be removed. @param localName The local name of the <code>ASObject</code> to remove. @return The <code>ASObject</code> removed from this map if an <code>ASObject</code> with such a local name and namespace URI exists. @exception DOMException NOT_FOUND_ERR: Raised if there is no node with the specified <code>namespaceURI</code> and <code>localName</code> in this map. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. 
public	TokenNamepublic	
ASObject	TokenNameIdentifier	 AS Object
removeNamedItemNS	TokenNameIdentifier	 remove Named Item NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Adds an <code>ASObject</code> using its <code>nodeName</code> * attribute. If an <code>ASObject</code> with that name is already * present in this map, it is replaced by the new one. * @param newASObject The <code>ASObject</code> to be inserted in the map * with its <code>nodeName</code> as the key. * @return If the new node replaces an existing one, the replaced node is * returned, otherwise <code>null</code>. * @exception DOMException * WRONG_DOCUMENT_ERR: Raised if <code>arg</code> was created from a * different <code>ASModel</code> than the one that created this map. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. * <br>HIERARCHY_REQUEST_ERR: Raised if an attempt is made to add a node * doesn't belong in this <code>ASNamedObjectMap</code>. */	TokenNameCOMMENT_JAVADOC	 Adds an <code>ASObject</code> using its <code>nodeName</code> attribute. If an <code>ASObject</code> with that name is already present in this map, it is replaced by the new one. @param newASObject The <code>ASObject</code> to be inserted in the map with its <code>nodeName</code> as the key. @return If the new node replaces an existing one, the replaced node is returned, otherwise <code>null</code>. @exception DOMException WRONG_DOCUMENT_ERR: Raised if <code>arg</code> was created from a different <code>ASModel</code> than the one that created this map. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. <br>HIERARCHY_REQUEST_ERR: Raised if an attempt is made to add a node doesn't belong in this <code>ASNamedObjectMap</code>. 
public	TokenNamepublic	
ASObject	TokenNameIdentifier	 AS Object
setNamedItem	TokenNameIdentifier	 set Named Item
(	TokenNameLPAREN	
ASObject	TokenNameIdentifier	 AS Object
newASObject	TokenNameIdentifier	 new AS Object
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Adds an <code>ASObject</code> using its <code>namespaceURI</code> and * <code>localName</code>. If an <code>ASObject</code> with the same * <code>namespaceURI</code> and <code>localName</code> is already * present in this map, it is replaced by the new one. * @param newASObject The <code>ASObject</code> to be inserted in the * map.The <code>ASObject</code> will later be accessible using the * value of its <code>namespaceURI</code> and <code>localName</code> * attributes. * @return If the new node replaces an existing one, the replaced node is * returned, otherwise <code>null</code>. * @exception DOMException * <code>WRONG_DOCUMENT_ERR</code>: Raised if <code>arg</code> was * created from a different <code>ASModel</code> than the one that * created this map. * <br><code>NO_MODIFICATION_ALLOWED_ERR</code>: Raised if this map is * readonly. * <br><code>HIERARCHY_REQUEST_ERR</code>: Raised if an attempt is made * to add a node doesn't belong in this <code>ASNamedObjectMap</code>. */	TokenNameCOMMENT_JAVADOC	 Adds an <code>ASObject</code> using its <code>namespaceURI</code> and <code>localName</code>. If an <code>ASObject</code> with the same <code>namespaceURI</code> and <code>localName</code> is already present in this map, it is replaced by the new one. @param newASObject The <code>ASObject</code> to be inserted in the map.The <code>ASObject</code> will later be accessible using the value of its <code>namespaceURI</code> and <code>localName</code> attributes. @return If the new node replaces an existing one, the replaced node is returned, otherwise <code>null</code>. @exception DOMException <code>WRONG_DOCUMENT_ERR</code>: Raised if <code>arg</code> was created from a different <code>ASModel</code> than the one that created this map. <br><code>NO_MODIFICATION_ALLOWED_ERR</code>: Raised if this map is readonly. <br><code>HIERARCHY_REQUEST_ERR</code>: Raised if an attempt is made to add a node doesn't belong in this <code>ASNamedObjectMap</code>. 
public	TokenNamepublic	
ASObject	TokenNameIdentifier	 AS Object
setNamedItemNS	TokenNameIdentifier	 set Named Item NS
(	TokenNameLPAREN	
ASObject	TokenNameIdentifier	 AS Object
newASObject	TokenNameIdentifier	 new AS Object
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
