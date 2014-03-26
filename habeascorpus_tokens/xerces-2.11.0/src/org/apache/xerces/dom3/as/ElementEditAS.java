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
Attr	TokenNameIdentifier	 Attr
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
/** * @deprecated * This interface extends the <code>Element</code> interface with additional * methods for guided document editing. An object implementing this * interface must also implement NodeEditAS interface. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated This interface extends the <code>Element</code> interface with additional methods for guided document editing. An object implementing this interface must also implement NodeEditAS interface. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
ElementEditAS	TokenNameIdentifier	 Element Edit AS
extends	TokenNameextends	
NodeEditAS	TokenNameIdentifier	 Node Edit AS
{	TokenNameLBRACE	
/** * The list of qualified element names defined in the abstract schema. */	TokenNameCOMMENT_JAVADOC	 The list of qualified element names defined in the abstract schema. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getDefinedElementTypes	TokenNameIdentifier	 get Defined Element Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines element content type. * @return Constant for one of EMPTY_CONTENTTYPE, ANY_CONTENTTYPE, * MIXED_CONTENTTYPE, ELEMENTS_CONTENTTYPE. */	TokenNameCOMMENT_JAVADOC	 Determines element content type. @return Constant for one of EMPTY_CONTENTTYPE, ANY_CONTENTTYPE, MIXED_CONTENTTYPE, ELEMENTS_CONTENTTYPE. 
public	TokenNamepublic	
short	TokenNameshort	
contentType	TokenNameIdentifier	 content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if the value for specified attribute can be set. * @param attrname Name of attribute. * @param attrval Value to be assigned to the attribute. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines if the value for specified attribute can be set. @param attrname Name of attribute. @param attrval Value to be assigned to the attribute. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canSetAttribute	TokenNameIdentifier	 can Set Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attrname	TokenNameIdentifier	 attrname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrval	TokenNameIdentifier	 attrval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if an attribute node can be added with respect to the * validity check level.This is an attribute node, there is no need for * canSetAttributreNodeNS! * @param attrNode <code>Node</code> in which the attribute can possibly * be set. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines if an attribute node can be added with respect to the validity check level.This is an attribute node, there is no need for canSetAttributreNodeNS! @param attrNode <code>Node</code> in which the attribute can possibly be set. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canSetAttributeNode	TokenNameIdentifier	 can Set Attribute Node
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
attrNode	TokenNameIdentifier	 attr Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if the attribute with given namespace and qualified name can * be created if not already present in the attribute list of the * element. If the attribute with same qualified name and namespaceURI * is already present in the elements attribute list it tests for the * value of the attribute and its prefix to the new value. See DOM core * <code>setAttributeNS</code>. * @param name Qualified name of attribute. * @param attrval Value to be assigned to the attribute. * @param namespaceURI <code>namespaceURI</code> of namespace. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines if the attribute with given namespace and qualified name can be created if not already present in the attribute list of the element. If the attribute with same qualified name and namespaceURI is already present in the elements attribute list it tests for the value of the attribute and its prefix to the new value. See DOM core <code>setAttributeNS</code>. @param name Qualified name of attribute. @param attrval Value to be assigned to the attribute. @param namespaceURI <code>namespaceURI</code> of namespace. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canSetAttributeNS	TokenNameIdentifier	 can Set Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrval	TokenNameIdentifier	 attrval
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Verifies if an attribute by the given name can be removed. * @param attrname Name of attribute. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Verifies if an attribute by the given name can be removed. @param attrname Name of attribute. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canRemoveAttribute	TokenNameIdentifier	 can Remove Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attrname	TokenNameIdentifier	 attrname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Verifies if an attribute by the given local name and namespace can be * removed. * @param attrname Local name of the attribute to be removed. * @param namespaceURI The namespace URI of the attribute to remove. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Verifies if an attribute by the given local name and namespace can be removed. @param attrname Local name of the attribute to be removed. @param namespaceURI The namespace URI of the attribute to remove. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canRemoveAttributeNS	TokenNameIdentifier	 can Remove Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attrname	TokenNameIdentifier	 attrname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if an attribute node can be removed. * @param attrNode The <code>Attr</code> node to remove from the * attribute list. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines if an attribute node can be removed. @param attrNode The <code>Attr</code> node to remove from the attribute list. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canRemoveAttributeNode	TokenNameIdentifier	 can Remove Attribute Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
attrNode	TokenNameIdentifier	 attr Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an <code>NodeList</code> containing the possible * <code>Element</code> names that can appear as children of this type * of element. * @return List of possible children element types of this element. */	TokenNameCOMMENT_JAVADOC	 Returns an <code>NodeList</code> containing the possible <code>Element</code> names that can appear as children of this type of element. @return List of possible children element types of this element. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getChildElements	TokenNameIdentifier	 get Child Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an <code>NodeList</code> containing the possible * <code>Element</code> names that can appear as a parent of this type * of element. * @return List of possible parent element types of this element. */	TokenNameCOMMENT_JAVADOC	 Returns an <code>NodeList</code> containing the possible <code>Element</code> names that can appear as a parent of this type of element. @return List of possible parent element types of this element. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getParentElements	TokenNameIdentifier	 get Parent Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an <code>NodeList</code> containing all the possible * <code>Attr</code>s that can appear with this type of element. * @return List of possible attributes of this element. */	TokenNameCOMMENT_JAVADOC	 Returns an <code>NodeList</code> containing all the possible <code>Attr</code>s that can appear with this type of element. @return List of possible attributes of this element. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getAttributeList	TokenNameIdentifier	 get Attribute List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if this element is defined in the currently active AS. * @param elemTypeName Name of element. * @return A boolean that is <code>true</code> if the element is defined, * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Determines if this element is defined in the currently active AS. @param elemTypeName Name of element. @return A boolean that is <code>true</code> if the element is defined, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isElementDefined	TokenNameIdentifier	 is Element Defined
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemTypeName	TokenNameIdentifier	 elem Type Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if this element in this namespace is defined in the * currently active AS. * @param elemTypeName Name of element. * @param namespaceURI <code>namespaceURI</code> of namespace. * @param name Qualified name of namespace. This is for sub-elements. * @return A boolean that is <code>true</code> if the element is defined, * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Determines if this element in this namespace is defined in the currently active AS. @param elemTypeName Name of element. @param namespaceURI <code>namespaceURI</code> of namespace. @param name Qualified name of namespace. This is for sub-elements. @return A boolean that is <code>true</code> if the element is defined, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isElementDefinedNS	TokenNameIdentifier	 is Element Defined NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemTypeName	TokenNameIdentifier	 elem Type Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
