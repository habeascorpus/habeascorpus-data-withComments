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
/** * @deprecated * An attribute declaration in the context of a <code>ASObject</code>.The * constant 'REQUIRED' is missing from this interface. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated An attribute declaration in the context of a <code>ASObject</code>.The constant 'REQUIRED' is missing from this interface. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
ASAttributeDeclaration	TokenNameIdentifier	 AS Attribute Declaration
extends	TokenNameextends	
ASObject	TokenNameIdentifier	 AS Object
{	TokenNameLBRACE	
// VALUE_TYPES 	TokenNameCOMMENT_LINE	VALUE_TYPES 
/** * Describes that the attribute does not have any value constraint. */	TokenNameCOMMENT_JAVADOC	 Describes that the attribute does not have any value constraint. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VALUE_NONE	TokenNameIdentifier	 VALUE  NONE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that the there is a default value constraint. */	TokenNameCOMMENT_JAVADOC	 Indicates that the there is a default value constraint. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VALUE_DEFAULT	TokenNameIdentifier	 VALUE  DEFAULT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that there is a fixed value constraint for this attribute. */	TokenNameCOMMENT_JAVADOC	 Indicates that there is a fixed value constraint for this attribute. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VALUE_FIXED	TokenNameIdentifier	 VALUE  FIXED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Datatype of the attribute. */	TokenNameCOMMENT_JAVADOC	 Datatype of the attribute. 
public	TokenNamepublic	
ASDataType	TokenNameIdentifier	 AS Data Type
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Datatype of the attribute. */	TokenNameCOMMENT_JAVADOC	 Datatype of the attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setDataType	TokenNameIdentifier	 set Data Type
(	TokenNameLPAREN	
ASDataType	TokenNameIdentifier	 AS Data Type
dataType	TokenNameIdentifier	 data Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default or fixed value. */	TokenNameCOMMENT_JAVADOC	 Default or fixed value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDataValue	TokenNameIdentifier	 get Data Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default or fixed value. */	TokenNameCOMMENT_JAVADOC	 Default or fixed value. 
public	TokenNamepublic	
void	TokenNamevoid	
setDataValue	TokenNameIdentifier	 set Data Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dataValue	TokenNameIdentifier	 data Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Valid attribute values, separated by commas, in a string. */	TokenNameCOMMENT_JAVADOC	 Valid attribute values, separated by commas, in a string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEnumAttr	TokenNameIdentifier	 get Enum Attr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Valid attribute values, separated by commas, in a string. */	TokenNameCOMMENT_JAVADOC	 Valid attribute values, separated by commas, in a string. 
public	TokenNamepublic	
void	TokenNamevoid	
setEnumAttr	TokenNameIdentifier	 set Enum Attr
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
enumAttr	TokenNameIdentifier	 enum Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Owner elements <code>ASObject</code> of attribute, meaning that an * attribute declaration can be shared by multiple elements. */	TokenNameCOMMENT_JAVADOC	 Owner elements <code>ASObject</code> of attribute, meaning that an attribute declaration can be shared by multiple elements. 
public	TokenNamepublic	
ASObjectList	TokenNameIdentifier	 AS Object List
getOwnerElements	TokenNameIdentifier	 get Owner Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Owner elements <code>ASObject</code> of attribute, meaning that an * attribute declaration can be shared by multiple elements. */	TokenNameCOMMENT_JAVADOC	 Owner elements <code>ASObject</code> of attribute, meaning that an attribute declaration can be shared by multiple elements. 
public	TokenNamepublic	
void	TokenNamevoid	
setOwnerElements	TokenNameIdentifier	 set Owner Elements
(	TokenNameLPAREN	
ASObjectList	TokenNameIdentifier	 AS Object List
ownerElements	TokenNameIdentifier	 owner Elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constraint type if any for this attribute. */	TokenNameCOMMENT_JAVADOC	 Constraint type if any for this attribute. 
public	TokenNamepublic	
short	TokenNameshort	
getDefaultType	TokenNameIdentifier	 get Default Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constraint type if any for this attribute. */	TokenNameCOMMENT_JAVADOC	 Constraint type if any for this attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultType	TokenNameIdentifier	 set Default Type
(	TokenNameLPAREN	
short	TokenNameshort	
defaultType	TokenNameIdentifier	 default Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
