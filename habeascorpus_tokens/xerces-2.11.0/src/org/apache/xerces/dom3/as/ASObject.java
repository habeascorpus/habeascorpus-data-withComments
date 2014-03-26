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
/** * @deprecated * The <code>ASObject</code> interface is analogous to a <code>Node</code> in * , e.g., an element declaration. * <p>Opaque. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated The <code>ASObject</code> interface is analogous to a <code>Node</code> in , e.g., an element declaration. <p>Opaque. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
ASObject	TokenNameIdentifier	 AS Object
{	TokenNameLBRACE	
// ASObjectType 	TokenNameCOMMENT_LINE	ASObjectType 
/** * The node is an <code>ASElementDeclaration</code>. */	TokenNameCOMMENT_JAVADOC	 The node is an <code>ASElementDeclaration</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_ELEMENT_DECLARATION	TokenNameIdentifier	 AS  ELEMENT  DECLARATION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is an <code>ASAttributeDeclaration</code>. */	TokenNameCOMMENT_JAVADOC	 The node is an <code>ASAttributeDeclaration</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_ATTRIBUTE_DECLARATION	TokenNameIdentifier	 AS  ATTRIBUTE  DECLARATION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>ASNotationDeclaration</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>ASNotationDeclaration</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_NOTATION_DECLARATION	TokenNameIdentifier	 AS  NOTATION  DECLARATION
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is an <code>ASEntityDeclaration</code>. */	TokenNameCOMMENT_JAVADOC	 The node is an <code>ASEntityDeclaration</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_ENTITY_DECLARATION	TokenNameIdentifier	 AS  ENTITY  DECLARATION
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>ASContentModel</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>ASContentModel</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_CONTENTMODEL	TokenNameIdentifier	 AS  CONTENTMODEL
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>ASModel</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>ASModel</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_MODEL	TokenNameIdentifier	 AS  MODEL
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A code representing the underlying object as defined above. */	TokenNameCOMMENT_JAVADOC	 A code representing the underlying object as defined above. 
public	TokenNamepublic	
short	TokenNameshort	
getAsNodeType	TokenNameIdentifier	 get As Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>ASModel</code> object associated with this * <code>ASObject</code>. For a node of type <code>AS_MODEL</code>, this * is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 The <code>ASModel</code> object associated with this <code>ASObject</code>. For a node of type <code>AS_MODEL</code>, this is <code>null</code>. 
public	TokenNamepublic	
ASModel	TokenNameIdentifier	 AS Model
getOwnerASModel	TokenNameIdentifier	 get Owner AS Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>ASModel</code> object associated with this * <code>ASObject</code>. For a node of type <code>AS_MODEL</code>, this * is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 The <code>ASModel</code> object associated with this <code>ASObject</code>. For a node of type <code>AS_MODEL</code>, this is <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setOwnerASModel	TokenNameIdentifier	 set Owner AS Model
(	TokenNameLPAREN	
ASModel	TokenNameIdentifier	 AS Model
ownerASModel	TokenNameIdentifier	 owner AS Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>name</code> of this <code>ASObject</code> depending on the * <code>ASObject</code> type. */	TokenNameCOMMENT_JAVADOC	 The <code>name</code> of this <code>ASObject</code> depending on the <code>ASObject</code> type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>name</code> of this <code>ASObject</code> depending on the * <code>ASObject</code> type. */	TokenNameCOMMENT_JAVADOC	 The <code>name</code> of this <code>ASObject</code> depending on the <code>ASObject</code> type. 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeName	TokenNameIdentifier	 set Node Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The namespace prefix of this node, or <code>null</code> if it is * unspecified. */	TokenNameCOMMENT_JAVADOC	 The namespace prefix of this node, or <code>null</code> if it is unspecified. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The namespace prefix of this node, or <code>null</code> if it is * unspecified. */	TokenNameCOMMENT_JAVADOC	 The namespace prefix of this node, or <code>null</code> if it is unspecified. 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the local part of the qualified name of this * <code>ASObject</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the local part of the qualified name of this <code>ASObject</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the local part of the qualified name of this * <code>ASObject</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the local part of the qualified name of this <code>ASObject</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalName	TokenNameIdentifier	 set Local Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The namespace URI of this node, or <code>null</code> if it is * unspecified. defines how a namespace URI is attached to schema * components. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of this node, or <code>null</code> if it is unspecified. defines how a namespace URI is attached to schema components. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The namespace URI of this node, or <code>null</code> if it is * unspecified. defines how a namespace URI is attached to schema * components. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of this node, or <code>null</code> if it is unspecified. defines how a namespace URI is attached to schema components. 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespaceURI	TokenNameIdentifier	 set Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a copy of this <code>ASObject</code>. See text for * <code>cloneNode</code> off of <code>Node</code> but substitute AS * functionality. * @param deep Setting the <code>deep</code> flag on, causes the whole * subtree to be duplicated. Setting it to <code>false</code> only * duplicates its immediate child nodes. * @return Cloned <code>ASObject</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a copy of this <code>ASObject</code>. See text for <code>cloneNode</code> off of <code>Node</code> but substitute AS functionality. @param deep Setting the <code>deep</code> flag on, causes the whole subtree to be duplicated. Setting it to <code>false</code> only duplicates its immediate child nodes. @return Cloned <code>ASObject</code>. 
public	TokenNamepublic	
ASObject	TokenNameIdentifier	 AS Object
cloneASObject	TokenNameIdentifier	 clone AS Object
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
