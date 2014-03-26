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
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSInput	TokenNameIdentifier	 LS Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSParser	TokenNameIdentifier	 LS Parser
;	TokenNameSEMICOLON	
/** * @deprecated * An Abstract Schema parser interface. * <p><code>DOMASBuilder</code> provides an API for parsing Abstract Schemas * and building the corresponding <code>ASModel</code> tree. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated An Abstract Schema parser interface. <p><code>DOMASBuilder</code> provides an API for parsing Abstract Schemas and building the corresponding <code>ASModel</code> tree. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
DOMASBuilder	TokenNameIdentifier	 DOMAS Builder
extends	TokenNameextends	
LSParser	TokenNameIdentifier	 LS Parser
{	TokenNameLBRACE	
/** * Associate an <code>ASModel</code> with a <code>LSParser</code>. This * <code>ASModel</code> will be used by the " * <code>validate-if-schema</code>" and " * <code>datatype-normalization</code>" options during the load of a new * <code>Document</code>. */	TokenNameCOMMENT_JAVADOC	 Associate an <code>ASModel</code> with a <code>LSParser</code>. This <code>ASModel</code> will be used by the " <code>validate-if-schema</code>" and " <code>datatype-normalization</code>" options during the load of a new <code>Document</code>. 
public	TokenNamepublic	
ASModel	TokenNameIdentifier	 AS Model
getAbstractSchema	TokenNameIdentifier	 get Abstract Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Associate an <code>ASModel</code> with a <code>LSParser</code>. This * <code>ASModel</code> will be used by the " * <code>validate-if-schema</code>" and " * <code>datatype-normalization</code>" options during the load of a new * <code>Document</code>. */	TokenNameCOMMENT_JAVADOC	 Associate an <code>ASModel</code> with a <code>LSParser</code>. This <code>ASModel</code> will be used by the " <code>validate-if-schema</code>" and " <code>datatype-normalization</code>" options during the load of a new <code>Document</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setAbstractSchema	TokenNameIdentifier	 set Abstract Schema
(	TokenNameLPAREN	
ASModel	TokenNameIdentifier	 AS Model
abstractSchema	TokenNameIdentifier	 abstract Schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parse a Abstract Schema from a location identified by an URI reference. * @param uri The location of the Abstract Schema to be read. * @return The newly created Abstract Schema. * @exception DOMASException * Exceptions raised by <code>parseASURI()</code> originate with the * installed ErrorHandler, and thus depend on the implementation of * the <code>DOMErrorHandler</code> interfaces. The default error * handlers will raise a <code>DOMASException</code> if any form of * Abstract Schema inconsistencies or warning occurs during the parse, * but application defined errorHandlers are not required to do so. * <br> WRONG_MIME_TYPE_ERR: Raised when <code>mimeTypeCheck</code> is * <code>true</code> and the input source has an incorrect MIME Type. * See the attribute <code>mimeTypeCheck</code>. * @exception DOMSystemException * Exceptions raised by <code>parseURI()</code> originate with the * installed ErrorHandler, and thus depend on the implementation of * the <code>DOMErrorHandler</code> interfaces. The default error * handlers will raise a DOMSystemException if any form I/O or other * system error occurs during the parse, but application defined error * handlers are not required to do so. */	TokenNameCOMMENT_JAVADOC	 Parse a Abstract Schema from a location identified by an URI reference. @param uri The location of the Abstract Schema to be read. @return The newly created Abstract Schema. @exception DOMASException Exceptions raised by <code>parseASURI()</code> originate with the installed ErrorHandler, and thus depend on the implementation of the <code>DOMErrorHandler</code> interfaces. The default error handlers will raise a <code>DOMASException</code> if any form of Abstract Schema inconsistencies or warning occurs during the parse, but application defined errorHandlers are not required to do so. <br> WRONG_MIME_TYPE_ERR: Raised when <code>mimeTypeCheck</code> is <code>true</code> and the input source has an incorrect MIME Type. See the attribute <code>mimeTypeCheck</code>. @exception DOMSystemException Exceptions raised by <code>parseURI()</code> originate with the installed ErrorHandler, and thus depend on the implementation of the <code>DOMErrorHandler</code> interfaces. The default error handlers will raise a DOMSystemException if any form I/O or other system error occurs during the parse, but application defined error handlers are not required to do so. 
public	TokenNamepublic	
ASModel	TokenNameIdentifier	 AS Model
parseASURI	TokenNameIdentifier	 parse ASURI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMASException	TokenNameIdentifier	 DOMAS Exception
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
/** * Parse a Abstract Schema from a location identified by an * <code>LSInput</code>. * @param is The <code>LSInput</code> from which the source * Abstract Schema is to be read. * @return The newly created <code>ASModel</code>. * @exception DOMASException * Exceptions raised by <code>parseASURI()</code> originate with the * installed ErrorHandler, and thus depend on the implementation of * the <code>DOMErrorHandler</code> interfaces. The default error * handlers will raise a <code>DOMASException</code> if any form of * Abstract Schema inconsistencies or warning occurs during the parse, * but application defined errorHandlers are not required to do so. * <br> Raise a WRONG_MIME_TYPE_ERR when <code>mimeTypeCheck</code> is * <code>true</code> and the inputsource has an incorrect MIME Type. * See attribute <code>mimeTypeCheck</code>. * @exception DOMSystemException * Exceptions raised by <code>parseURI()</code> originate with the * installed ErrorHandler, and thus depend on the implementation of * the <code>DOMErrorHandler</code> interfaces. The default error * handlers will raise a DOMSystemException if any form I/O or other * system error occurs during the parse, but application defined error * handlers are not required to do so. */	TokenNameCOMMENT_JAVADOC	 Parse a Abstract Schema from a location identified by an <code>LSInput</code>. @param is The <code>LSInput</code> from which the source Abstract Schema is to be read. @return The newly created <code>ASModel</code>. @exception DOMASException Exceptions raised by <code>parseASURI()</code> originate with the installed ErrorHandler, and thus depend on the implementation of the <code>DOMErrorHandler</code> interfaces. The default error handlers will raise a <code>DOMASException</code> if any form of Abstract Schema inconsistencies or warning occurs during the parse, but application defined errorHandlers are not required to do so. <br> Raise a WRONG_MIME_TYPE_ERR when <code>mimeTypeCheck</code> is <code>true</code> and the inputsource has an incorrect MIME Type. See attribute <code>mimeTypeCheck</code>. @exception DOMSystemException Exceptions raised by <code>parseURI()</code> originate with the installed ErrorHandler, and thus depend on the implementation of the <code>DOMErrorHandler</code> interfaces. The default error handlers will raise a DOMSystemException if any form I/O or other system error occurs during the parse, but application defined error handlers are not required to do so. 
public	TokenNamepublic	
ASModel	TokenNameIdentifier	 AS Model
parseASInputSource	TokenNameIdentifier	 parse AS Input Source
(	TokenNameLPAREN	
LSInput	TokenNameIdentifier	 LS Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMASException	TokenNameIdentifier	 DOMAS Exception
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
