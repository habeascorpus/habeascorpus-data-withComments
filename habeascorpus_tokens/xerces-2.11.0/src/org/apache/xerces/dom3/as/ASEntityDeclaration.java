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
/** * @deprecated * Models a general entity declaration in an abstract schema. The abstract * schema does not handle any parameter entity. It is assumed that the * parameter entities are expanded by the implementation as the abstract * schema is built. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated Models a general entity declaration in an abstract schema. The abstract schema does not handle any parameter entity. It is assumed that the parameter entities are expanded by the implementation as the abstract schema is built. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
ASEntityDeclaration	TokenNameIdentifier	 AS Entity Declaration
extends	TokenNameextends	
ASObject	TokenNameIdentifier	 AS Object
{	TokenNameLBRACE	
// EntityType 	TokenNameCOMMENT_LINE	EntityType 
/** * constant defining an internal entity. */	TokenNameCOMMENT_JAVADOC	 constant defining an internal entity. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
INTERNAL_ENTITY	TokenNameIdentifier	 INTERNAL  ENTITY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * constant defining an external entity. */	TokenNameCOMMENT_JAVADOC	 constant defining an external entity. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
EXTERNAL_ENTITY	TokenNameIdentifier	 EXTERNAL  ENTITY
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The type of the entity as defined above. */	TokenNameCOMMENT_JAVADOC	 The type of the entity as defined above. 
public	TokenNamepublic	
short	TokenNameshort	
getEntityType	TokenNameIdentifier	 get Entity Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The type of the entity as defined above. */	TokenNameCOMMENT_JAVADOC	 The type of the entity as defined above. 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityType	TokenNameIdentifier	 set Entity Type
(	TokenNameLPAREN	
short	TokenNameshort	
entityType	TokenNameIdentifier	 entity Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The replacement text for the internal entity. The entity references * within the replacement text are kept intact. For an entity of type * <code>EXTERNAL_ENTITY</code>, this is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 The replacement text for the internal entity. The entity references within the replacement text are kept intact. For an entity of type <code>EXTERNAL_ENTITY</code>, this is <code>null</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEntityValue	TokenNameIdentifier	 get Entity Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The replacement text for the internal entity. The entity references * within the replacement text are kept intact. For an entity of type * <code>EXTERNAL_ENTITY</code>, this is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 The replacement text for the internal entity. The entity references within the replacement text are kept intact. For an entity of type <code>EXTERNAL_ENTITY</code>, this is <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityValue	TokenNameIdentifier	 set Entity Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entityValue	TokenNameIdentifier	 entity Value
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
/** * The string representing the public identifier for this notation * declaration, if present; <code>null</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 The string representing the public identifier for this notation declaration, if present; <code>null</code> otherwise. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The string representing the public identifier for this notation * declaration, if present; <code>null</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 The string representing the public identifier for this notation declaration, if present; <code>null</code> otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
