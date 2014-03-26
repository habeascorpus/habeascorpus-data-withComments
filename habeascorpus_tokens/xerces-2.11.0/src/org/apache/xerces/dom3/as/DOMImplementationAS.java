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
/** * @deprecated * This interface allows creation of an <code>ASModel</code>. The expectation * is that an instance of the <code>DOMImplementationAS</code> interface can * be obtained by using binding-specific casting methods on an instance of * the <code>DOMImplementation</code> interface when the DOM implementation * supports the feature "<code>AS-EDIT</code>". * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated This interface allows creation of an <code>ASModel</code>. The expectation is that an instance of the <code>DOMImplementationAS</code> interface can be obtained by using binding-specific casting methods on an instance of the <code>DOMImplementation</code> interface when the DOM implementation supports the feature "<code>AS-EDIT</code>". <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
DOMImplementationAS	TokenNameIdentifier	 DOM Implementation AS
{	TokenNameLBRACE	
/** * Creates an ASModel. * @param isNamespaceAware Allow creation of <code>ASModel</code> with * this attribute set to a specific value. * @return A <code>null</code> return indicates failure.what is a * failure? Could be a system error. */	TokenNameCOMMENT_JAVADOC	 Creates an ASModel. @param isNamespaceAware Allow creation of <code>ASModel</code> with this attribute set to a specific value. @return A <code>null</code> return indicates failure.what is a failure? Could be a system error. 
public	TokenNamepublic	
ASModel	TokenNameIdentifier	 AS Model
createAS	TokenNameIdentifier	 create AS
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isNamespaceAware	TokenNameIdentifier	 is Namespace Aware
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates an <code>DOMASBuilder</code>.Do we need the method since we * already have <code>DOMImplementationLS.createDOMParser</code>? * @return a DOMASBuilder */	TokenNameCOMMENT_JAVADOC	 Creates an <code>DOMASBuilder</code>.Do we need the method since we already have <code>DOMImplementationLS.createDOMParser</code>? @return a DOMASBuilder 
public	TokenNamepublic	
DOMASBuilder	TokenNameIdentifier	 DOMAS Builder
createDOMASBuilder	TokenNameIdentifier	 create DOMAS Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates an <code>DOMASWriter</code>. * @return a DOMASWriter */	TokenNameCOMMENT_JAVADOC	 Creates an <code>DOMASWriter</code>. @return a DOMASWriter 
public	TokenNamepublic	
DOMASWriter	TokenNameIdentifier	 DOMAS Writer
createDOMASWriter	TokenNameIdentifier	 create DOMAS Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
