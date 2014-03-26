/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMNamedNodeMap.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMNamedNodeMap.java 468653 2006-10-28 07:07:05Z minchau $ 
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
DTM	TokenNameIdentifier	 DTM
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
/** * DTMNamedNodeMap is a quickie (as opposed to quick) implementation of the DOM's * NamedNodeMap interface, intended to support DTMProxy's getAttributes() * call. * <p> * ***** Note: this does _not_ current attempt to cache any of the data; * if you ask for attribute 27 and then 28, you'll have to rescan the first * 27. It should probably at least keep track of the last one retrieved, * and possibly buffer the whole array. * <p> * ***** Also note that there's no fastpath for the by-name query; we search * linearly until we find it or fail to find it. Again, that could be * optimized at some cost in object creation/storage. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 DTMNamedNodeMap is a quickie (as opposed to quick) implementation of the DOM's NamedNodeMap interface, intended to support DTMProxy's getAttributes() call. <p> ***** Note: this does _not_ current attempt to cache any of the data; if you ask for attribute 27 and then 28, you'll have to rescan the first 27. It should probably at least keep track of the last one retrieved, and possibly buffer the whole array. <p> ***** Also note that there's no fastpath for the by-name query; we search linearly until we find it or fail to find it. Again, that could be optimized at some cost in object creation/storage. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
DTMNamedNodeMap	TokenNameIdentifier	 DTM Named Node Map
implements	TokenNameimplements	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
{	TokenNameLBRACE	
/** The DTM for this node. */	TokenNameCOMMENT_JAVADOC	 The DTM for this node. 
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
/** The DTM element handle. */	TokenNameCOMMENT_JAVADOC	 The DTM element handle. 
int	TokenNameint	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
/** The number of nodes in this map. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in this map. 
short	TokenNameshort	
m_count	TokenNameIdentifier	 m count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Create a getAttributes NamedNodeMap for a given DTM element node * * @param dtm The DTM Reference, must be non-null. * @param element The DTM element handle. */	TokenNameCOMMENT_JAVADOC	 Create a getAttributes NamedNodeMap for a given DTM element node * @param dtm The DTM Reference, must be non-null. @param element The DTM element handle. 
public	TokenNamepublic	
DTMNamedNodeMap	TokenNameIdentifier	 DTM Named Node Map
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
int	TokenNameint	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of Attributes on this Element * * @return The number of nodes in this map. */	TokenNameCOMMENT_JAVADOC	 Return the number of Attributes on this Element * @return The number of nodes in this map. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_count	TokenNameIdentifier	 m count
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_count	TokenNameIdentifier	 m count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
m_count	TokenNameIdentifier	 m count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves a node specified by name. * @param name The <code>nodeName</code> of a node to retrieve. * @return A <code>Node</code> (of any type) with the specified * <code>nodeName</code>, or <code>null</code> if it does not identify * any node in this map. */	TokenNameCOMMENT_JAVADOC	 Retrieves a node specified by name. @param name The <code>nodeName</code> of a node to retrieve. @return A <code>Node</code> (of any type) with the specified <code>nodeName</code>, or <code>null</code> if it does not identify any node in this map. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <code>index</code>th item in the map. If <code>index</code> * is greater than or equal to the number of nodes in this map, this * returns <code>null</code>. * @param i The index of the requested item. * @return The node at the <code>index</code>th position in the map, or * <code>null</code> if that is not a valid index. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the map. If <code>index</code> is greater than or equal to the number of nodes in this map, this returns <code>null</code>. @param i The index of the requested item. @return The node at the <code>index</code>th position in the map, or <code>null</code> if that is not a valid index. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
++	TokenNamePLUS_PLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a node using its <code>nodeName</code> attribute. If a node with * that name is already present in this map, it is replaced by the new * one. * <br>As the <code>nodeName</code> attribute is used to derive the name * which the node must be stored under, multiple nodes of certain types * (those that have a "special" string value) cannot be stored as the * names would clash. This is seen as preferable to allowing nodes to be * aliased. * @param newNode node to store in this map. The node will later be * accessible using the value of its <code>nodeName</code> attribute. * * @return If the new <code>Node</code> replaces an existing node the * replaced <code>Node</code> is returned, otherwise <code>null</code> * is returned. * @exception DOMException * WRONG_DOCUMENT_ERR: Raised if <code>arg</code> was created from a * different document than the one that created this map. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. * <br>INUSE_ATTRIBUTE_ERR: Raised if <code>arg</code> is an * <code>Attr</code> that is already an attribute of another * <code>Element</code> object. The DOM user must explicitly clone * <code>Attr</code> nodes to re-use them in other elements. */	TokenNameCOMMENT_JAVADOC	 Adds a node using its <code>nodeName</code> attribute. If a node with that name is already present in this map, it is replaced by the new one. <br>As the <code>nodeName</code> attribute is used to derive the name which the node must be stored under, multiple nodes of certain types (those that have a "special" string value) cannot be stored as the names would clash. This is seen as preferable to allowing nodes to be aliased. @param newNode node to store in this map. The node will later be accessible using the value of its <code>nodeName</code> attribute. * @return If the new <code>Node</code> replaces an existing node the replaced <code>Node</code> is returned, otherwise <code>null</code> is returned. @exception DOMException WRONG_DOCUMENT_ERR: Raised if <code>arg</code> was created from a different document than the one that created this map. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. <br>INUSE_ATTRIBUTE_ERR: Raised if <code>arg</code> is an <code>Attr</code> that is already an attribute of another <code>Element</code> object. The DOM user must explicitly clone <code>Attr</code> nodes to re-use them in other elements. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
setNamedItem	TokenNameIdentifier	 set Named Item
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
DTMException	TokenNameIdentifier	 DTM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes a node specified by name. When this map contains the attributes * attached to an element, if the removed attribute is known to have a * default value, an attribute immediately appears containing the * default value as well as the corresponding namespace URI, local name, * and prefix when applicable. * @param name The <code>nodeName</code> of the node to remove. * * @return The node removed from this map if a node with such a name * exists. * @exception DOMException * NOT_FOUND_ERR: Raised if there is no node named <code>name</code> in * this map. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. */	TokenNameCOMMENT_JAVADOC	 Removes a node specified by name. When this map contains the attributes attached to an element, if the removed attribute is known to have a default value, an attribute immediately appears containing the default value as well as the corresponding namespace URI, local name, and prefix when applicable. @param name The <code>nodeName</code> of the node to remove. * @return The node removed from this map if a node with such a name exists. @exception DOMException NOT_FOUND_ERR: Raised if there is no node named <code>name</code> in this map. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
removeNamedItem	TokenNameIdentifier	 remove Named Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
DTMException	TokenNameIdentifier	 DTM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves a node specified by local name and namespace URI. HTML-only * DOM implementations do not need to implement this method. * @param namespaceURI The namespace URI of the node to retrieve. * @param localName The local name of the node to retrieve. * * @return A <code>Node</code> (of any type) with the specified local * name and namespace URI, or <code>null</code> if they do not * identify any node in this map. * @since DOM Level 2 */	TokenNameCOMMENT_JAVADOC	 Retrieves a node specified by local name and namespace URI. HTML-only DOM implementations do not need to implement this method. @param namespaceURI The namespace URI of the node to retrieve. @param localName The local name of the node to retrieve. * @return A <code>Node</code> (of any type) with the specified local name and namespace URI, or <code>null</code> if they do not identify any node in this map. @since DOM Level 2 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNamedItemNS	TokenNameIdentifier	 get Named Item NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
retNode	TokenNameIdentifier	 ret Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
nsURI	TokenNameIdentifier	 ns URI
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nsURI	TokenNameIdentifier	 ns URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nsURI	TokenNameIdentifier	 ns URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retNode	TokenNameIdentifier	 ret Node
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
retNode	TokenNameIdentifier	 ret Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a node using its <code>namespaceURI</code> and * <code>localName</code>. If a node with that namespace URI and that * local name is already present in this map, it is replaced by the new * one. * <br>HTML-only DOM implementations do not need to implement this method. * @param arg A node to store in this map. The node will later be * accessible using the value of its <code>namespaceURI</code> and * <code>localName</code> attributes. * * @return If the new <code>Node</code> replaces an existing node the * replaced <code>Node</code> is returned, otherwise <code>null</code> * is returned. * @exception DOMException * WRONG_DOCUMENT_ERR: Raised if <code>arg</code> was created from a * different document than the one that created this map. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. * <br>INUSE_ATTRIBUTE_ERR: Raised if <code>arg</code> is an * <code>Attr</code> that is already an attribute of another * <code>Element</code> object. The DOM user must explicitly clone * <code>Attr</code> nodes to re-use them in other elements. * @since DOM Level 2 */	TokenNameCOMMENT_JAVADOC	 Adds a node using its <code>namespaceURI</code> and <code>localName</code>. If a node with that namespace URI and that local name is already present in this map, it is replaced by the new one. <br>HTML-only DOM implementations do not need to implement this method. @param arg A node to store in this map. The node will later be accessible using the value of its <code>namespaceURI</code> and <code>localName</code> attributes. * @return If the new <code>Node</code> replaces an existing node the replaced <code>Node</code> is returned, otherwise <code>null</code> is returned. @exception DOMException WRONG_DOCUMENT_ERR: Raised if <code>arg</code> was created from a different document than the one that created this map. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. <br>INUSE_ATTRIBUTE_ERR: Raised if <code>arg</code> is an <code>Attr</code> that is already an attribute of another <code>Element</code> object. The DOM user must explicitly clone <code>Attr</code> nodes to re-use them in other elements. @since DOM Level 2 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
setNamedItemNS	TokenNameIdentifier	 set Named Item NS
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
DTMException	TokenNameIdentifier	 DTM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes a node specified by local name and namespace URI. A removed * attribute may be known to have a default value when this map contains * the attributes attached to an element, as returned by the attributes * attribute of the <code>Node</code> interface. If so, an attribute * immediately appears containing the default value as well as the * corresponding namespace URI, local name, and prefix when applicable. * <br>HTML-only DOM implementations do not need to implement this method. * * @param namespaceURI The namespace URI of the node to remove. * @param localName The local name of the node to remove. * * @return The node removed from this map if a node with such a local * name and namespace URI exists. * @exception DOMException * NOT_FOUND_ERR: Raised if there is no node with the specified * <code>namespaceURI</code> and <code>localName</code> in this map. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. * @since DOM Level 2 */	TokenNameCOMMENT_JAVADOC	 Removes a node specified by local name and namespace URI. A removed attribute may be known to have a default value when this map contains the attributes attached to an element, as returned by the attributes attribute of the <code>Node</code> interface. If so, an attribute immediately appears containing the default value as well as the corresponding namespace URI, local name, and prefix when applicable. <br>HTML-only DOM implementations do not need to implement this method. * @param namespaceURI The namespace URI of the node to remove. @param localName The local name of the node to remove. * @return The node removed from this map if a node with such a local name and namespace URI exists. @exception DOMException NOT_FOUND_ERR: Raised if there is no node with the specified <code>namespaceURI</code> and <code>localName</code> in this map. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this map is readonly. @since DOM Level 2 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
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
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
DTMException	TokenNameIdentifier	 DTM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Simple implementation of DOMException. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Simple implementation of DOMException. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
DTMException	TokenNameIdentifier	 DTM Exception
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8290238117162437678L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructs a DOM/DTM exception. * * @param code * @param message */	TokenNameCOMMENT_JAVADOC	 Constructs a DOM/DTM exception. * @param code @param message 
public	TokenNamepublic	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
short	TokenNameshort	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor DTMException * * * @param code */	TokenNameCOMMENT_JAVADOC	 Constructor DTMException * @param code 
public	TokenNamepublic	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
short	TokenNameshort	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
