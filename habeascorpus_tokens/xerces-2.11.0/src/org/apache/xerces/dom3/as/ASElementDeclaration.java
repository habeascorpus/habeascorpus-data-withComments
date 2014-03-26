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
/** * @deprecated * The element name along with the content specification in the context of an * <code>ASObject</code>. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated The element name along with the content specification in the context of an <code>ASObject</code>. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
ASElementDeclaration	TokenNameIdentifier	 AS Element Declaration
extends	TokenNameextends	
ASObject	TokenNameIdentifier	 AS Object
{	TokenNameLBRACE	
// CONTENT_MODEL_TYPES 	TokenNameCOMMENT_LINE	CONTENT_MODEL_TYPES 
/** * Represents an EMPTY content type for an Element declaration. */	TokenNameCOMMENT_JAVADOC	 Represents an EMPTY content type for an Element declaration. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
EMPTY_CONTENTTYPE	TokenNameIdentifier	 EMPTY  CONTENTTYPE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an ANY content type for an Element declaration. */	TokenNameCOMMENT_JAVADOC	 Represents an ANY content type for an Element declaration. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ANY_CONTENTTYPE	TokenNameIdentifier	 ANY  CONTENTTYPE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents a MIXED content type for an Element declaration. Note that * <code>isPCDataOnly</code> would also need to checked, in addition to * this, if an element's content model was simply text, as an example. */	TokenNameCOMMENT_JAVADOC	 Represents a MIXED content type for an Element declaration. Note that <code>isPCDataOnly</code> would also need to checked, in addition to this, if an element's content model was simply text, as an example. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
MIXED_CONTENTTYPE	TokenNameIdentifier	 MIXED  CONTENTTYPE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents an ELEMENTS only content type for an Element declaration. */	TokenNameCOMMENT_JAVADOC	 Represents an ELEMENTS only content type for an Element declaration. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ELEMENTS_CONTENTTYPE	TokenNameIdentifier	 ELEMENTS  CONTENTTYPE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A boolean defining whether the element order and number of the child * elements for mixed content type has to be respected or not. For * example XML Schema defined mixed content types the order is important * and needs to be respected whether for DTD based AS the order and * number of child elements are not important. */	TokenNameCOMMENT_JAVADOC	 A boolean defining whether the element order and number of the child elements for mixed content type has to be respected or not. For example XML Schema defined mixed content types the order is important and needs to be respected whether for DTD based AS the order and number of child elements are not important. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getStrictMixedContent	TokenNameIdentifier	 get Strict Mixed Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A boolean defining whether the element order and number of the child * elements for mixed content type has to be respected or not. For * example XML Schema defined mixed content types the order is important * and needs to be respected whether for DTD based AS the order and * number of child elements are not important. */	TokenNameCOMMENT_JAVADOC	 A boolean defining whether the element order and number of the child elements for mixed content type has to be respected or not. For example XML Schema defined mixed content types the order is important and needs to be respected whether for DTD based AS the order and number of child elements are not important. 
public	TokenNamepublic	
void	TokenNamevoid	
setStrictMixedContent	TokenNameIdentifier	 set Strict Mixed Content
(	TokenNameLPAREN	
boolean	TokenNameboolean	
strictMixedContent	TokenNameIdentifier	 strict Mixed Content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Datatype of the element. */	TokenNameCOMMENT_JAVADOC	 Datatype of the element. 
public	TokenNamepublic	
ASDataType	TokenNameIdentifier	 AS Data Type
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Datatype of the element. */	TokenNameCOMMENT_JAVADOC	 Datatype of the element. 
public	TokenNamepublic	
void	TokenNamevoid	
setElementType	TokenNameIdentifier	 set Element Type
(	TokenNameLPAREN	
ASDataType	TokenNameIdentifier	 AS Data Type
elementType	TokenNameIdentifier	 element Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Boolean defining whether the element type contains child elements and * PCDATA or PCDATA only for mixed element types. <code>true</code> if * the element is of type PCDATA only. Relevant only for mixed content * type elements. */	TokenNameCOMMENT_JAVADOC	 Boolean defining whether the element type contains child elements and PCDATA or PCDATA only for mixed element types. <code>true</code> if the element is of type PCDATA only. Relevant only for mixed content type elements. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIsPCDataOnly	TokenNameIdentifier	 get Is PC Data Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Boolean defining whether the element type contains child elements and * PCDATA or PCDATA only for mixed element types. <code>true</code> if * the element is of type PCDATA only. Relevant only for mixed content * type elements. */	TokenNameCOMMENT_JAVADOC	 Boolean defining whether the element type contains child elements and PCDATA or PCDATA only for mixed element types. <code>true</code> if the element is of type PCDATA only. Relevant only for mixed content type elements. 
public	TokenNamepublic	
void	TokenNamevoid	
setIsPCDataOnly	TokenNameIdentifier	 set Is PC Data Only
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isPCDataOnly	TokenNameIdentifier	 is PC Data Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The content type of the element. One of <code>EMPTY_CONTENTTYPE</code>, * <code>ANY_CONTENTTYPE</code>, <code>MIXED_CONTENTTYPE</code>, * <code>ELEMENTS_CONTENTTYPE</code>. */	TokenNameCOMMENT_JAVADOC	 The content type of the element. One of <code>EMPTY_CONTENTTYPE</code>, <code>ANY_CONTENTTYPE</code>, <code>MIXED_CONTENTTYPE</code>, <code>ELEMENTS_CONTENTTYPE</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The content type of the element. One of <code>EMPTY_CONTENTTYPE</code>, * <code>ANY_CONTENTTYPE</code>, <code>MIXED_CONTENTTYPE</code>, * <code>ELEMENTS_CONTENTTYPE</code>. */	TokenNameCOMMENT_JAVADOC	 The content type of the element. One of <code>EMPTY_CONTENTTYPE</code>, <code>ANY_CONTENTTYPE</code>, <code>MIXED_CONTENTTYPE</code>, <code>ELEMENTS_CONTENTTYPE</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setContentType	TokenNameIdentifier	 set Content Type
(	TokenNameLPAREN	
short	TokenNameshort	
contentType	TokenNameIdentifier	 content Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * the URI reference representing the system identifier for the notation * declaration, if present, <code>null</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 the URI reference representing the system identifier for the notation declaration, if present, <code>null</code> otherwise. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * the URI reference representing the system identifier for the notation * declaration, if present, <code>null</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 the URI reference representing the system identifier for the notation declaration, if present, <code>null</code> otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The content model of element. */	TokenNameCOMMENT_JAVADOC	 The content model of element. 
public	TokenNamepublic	
ASContentModel	TokenNameIdentifier	 AS Content Model
getAsCM	TokenNameIdentifier	 get As CM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The content model of element. */	TokenNameCOMMENT_JAVADOC	 The content model of element. 
public	TokenNamepublic	
void	TokenNamevoid	
setAsCM	TokenNameIdentifier	 set As CM
(	TokenNameLPAREN	
ASContentModel	TokenNameIdentifier	 AS Content Model
asCM	TokenNameIdentifier	 as CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The<code>ASNamedObjectMap</code> containing * <code>ASAttributeDeclarations</code> for all the attributes that can * appear on this type of element. */	TokenNameCOMMENT_JAVADOC	 The<code>ASNamedObjectMap</code> containing <code>ASAttributeDeclarations</code> for all the attributes that can appear on this type of element. 
public	TokenNamepublic	
ASNamedObjectMap	TokenNameIdentifier	 AS Named Object Map
getASAttributeDecls	TokenNameIdentifier	 get AS Attribute Decls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The<code>ASNamedObjectMap</code> containing * <code>ASAttributeDeclarations</code> for all the attributes that can * appear on this type of element. */	TokenNameCOMMENT_JAVADOC	 The<code>ASNamedObjectMap</code> containing <code>ASAttributeDeclarations</code> for all the attributes that can appear on this type of element. 
public	TokenNamepublic	
void	TokenNamevoid	
setASAttributeDecls	TokenNameIdentifier	 set AS Attribute Decls
(	TokenNameLPAREN	
ASNamedObjectMap	TokenNameIdentifier	 AS Named Object Map
ASAttributeDecls	TokenNameIdentifier	 AS Attribute Decls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds an <code>ASAttributeDeclaration</code> for the element being * declared. * @param attributeDecl The new attribute to add. If the attribute * declaration already exists for the element, the call does not have * any effect. */	TokenNameCOMMENT_JAVADOC	 Adds an <code>ASAttributeDeclaration</code> for the element being declared. @param attributeDecl The new attribute to add. If the attribute declaration already exists for the element, the call does not have any effect. 
public	TokenNamepublic	
void	TokenNamevoid	
addASAttributeDecl	TokenNameIdentifier	 add AS Attribute Decl
(	TokenNameLPAREN	
ASAttributeDeclaration	TokenNameIdentifier	 AS Attribute Declaration
attributeDecl	TokenNameIdentifier	 attribute Decl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes an <code>ASAttributeDeclaration</code> from the element being * declared. * @param attributeDecl The attribute declaraition to be removed. If the * attribute declaration does not exist for the element, the call does * not have any effect. * @return <code>null</code> if the attribute does not exist. Otherwise * returns the attribute being removed. */	TokenNameCOMMENT_JAVADOC	 Removes an <code>ASAttributeDeclaration</code> from the element being declared. @param attributeDecl The attribute declaraition to be removed. If the attribute declaration does not exist for the element, the call does not have any effect. @return <code>null</code> if the attribute does not exist. Otherwise returns the attribute being removed. 
public	TokenNamepublic	
ASAttributeDeclaration	TokenNameIdentifier	 AS Attribute Declaration
removeASAttributeDecl	TokenNameIdentifier	 remove AS Attribute Decl
(	TokenNameLPAREN	
ASAttributeDeclaration	TokenNameIdentifier	 AS Attribute Declaration
attributeDecl	TokenNameIdentifier	 attribute Decl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
