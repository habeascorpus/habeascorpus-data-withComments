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
/** * @deprecated * Abstract Schemas operations may throw a <code>DOMSystemException</code> as * described in their descriptions. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated Abstract Schemas operations may throw a <code>DOMSystemException</code> as described in their descriptions. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
class	TokenNameclass	
DOMASException	TokenNameIdentifier	 DOMAS Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
DOMASException	TokenNameIdentifier	 DOMAS Exception
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
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
// ASExceptionCode 	TokenNameCOMMENT_LINE	ASExceptionCode 
/** * If an element declaration already exists with the same name within an * <code>AS_CHOICE</code> operator. */	TokenNameCOMMENT_JAVADOC	 If an element declaration already exists with the same name within an <code>AS_CHOICE</code> operator. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DUPLICATE_NAME_ERR	TokenNameIdentifier	 DUPLICATE  NAME  ERR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * If the type of the <code>ASObject</code> is neither an * <code>ASContentModel</code> nor an <code>ASElementDeclaration</code>. */	TokenNameCOMMENT_JAVADOC	 If the type of the <code>ASObject</code> is neither an <code>ASContentModel</code> nor an <code>ASElementDeclaration</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE_ERR	TokenNameIdentifier	 TYPE  ERR
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * If the <code>DocumentEditAS</code> related to the node does not have * any active <code>ASModel</code> and <code>wfValidityCheckLevel</code> * is set to <code>PARTIAL</code> or <code>STRICT_VALIDITY_CHECK</code>. */	TokenNameCOMMENT_JAVADOC	 If the <code>DocumentEditAS</code> related to the node does not have any active <code>ASModel</code> and <code>wfValidityCheckLevel</code> is set to <code>PARTIAL</code> or <code>STRICT_VALIDITY_CHECK</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NO_AS_AVAILABLE	TokenNameIdentifier	 NO  AS  AVAILABLE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * When <code>mimeTypeCheck</code> is <code>true</code> and the input * source has an incorrect MIME Type. See the attribute * <code>mimeTypeCheck</code>. */	TokenNameCOMMENT_JAVADOC	 When <code>mimeTypeCheck</code> is <code>true</code> and the input source has an incorrect MIME Type. See the attribute <code>mimeTypeCheck</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WRONG_MIME_TYPE_ERR	TokenNameIdentifier	 WRONG  MIME  TYPE  ERR
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
