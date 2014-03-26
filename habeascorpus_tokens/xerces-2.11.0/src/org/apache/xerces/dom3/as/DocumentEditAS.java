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
/** * @deprecated * This interface extends the <code>NodeEditAS</code> interface with * additional methods for both document and AS editing. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated This interface extends the <code>NodeEditAS</code> interface with additional methods for both document and AS editing. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
DocumentEditAS	TokenNameIdentifier	 Document Edit AS
extends	TokenNameextends	
NodeEditAS	TokenNameIdentifier	 Node Edit AS
{	TokenNameLBRACE	
/** * An attribute specifying whether continuous checking for the validity of * the document is enforced or not. Setting this to <code>true</code> * will result in an exception being thrown, i.e., * <code>VALIDATION_ERR</code>, for documents that are invalid at the * time of the call. If the document is invalid, then this attribute * will remain <code>false</code>. This attribute is <code>false</code> * by default.Add VALIDATION_ERR code to the list of constants in * DOMASException. */	TokenNameCOMMENT_JAVADOC	 An attribute specifying whether continuous checking for the validity of the document is enforced or not. Setting this to <code>true</code> will result in an exception being thrown, i.e., <code>VALIDATION_ERR</code>, for documents that are invalid at the time of the call. If the document is invalid, then this attribute will remain <code>false</code>. This attribute is <code>false</code> by default.Add VALIDATION_ERR code to the list of constants in DOMASException. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getContinuousValidityChecking	TokenNameIdentifier	 get Continuous Validity Checking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An attribute specifying whether continuous checking for the validity of * the document is enforced or not. Setting this to <code>true</code> * will result in an exception being thrown, i.e., * <code>VALIDATION_ERR</code>, for documents that are invalid at the * time of the call. If the document is invalid, then this attribute * will remain <code>false</code>. This attribute is <code>false</code> * by default.Add VALIDATION_ERR code to the list of constants in * DOMASException. */	TokenNameCOMMENT_JAVADOC	 An attribute specifying whether continuous checking for the validity of the document is enforced or not. Setting this to <code>true</code> will result in an exception being thrown, i.e., <code>VALIDATION_ERR</code>, for documents that are invalid at the time of the call. If the document is invalid, then this attribute will remain <code>false</code>. This attribute is <code>false</code> by default.Add VALIDATION_ERR code to the list of constants in DOMASException. 
public	TokenNamepublic	
void	TokenNamevoid	
setContinuousValidityChecking	TokenNameIdentifier	 set Continuous Validity Checking
(	TokenNameLPAREN	
boolean	TokenNameboolean	
continuousValidityChecking	TokenNameIdentifier	 continuous Validity Checking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
