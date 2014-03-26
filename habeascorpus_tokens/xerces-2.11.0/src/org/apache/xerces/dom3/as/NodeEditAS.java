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
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * @deprecated * This interface extends a <code>Node</code> from with additional methods * for guided document editing. The expectation is that an instance of the * <code>DOMImplementationAS</code> interface can be obtained by using * binding-specific casting methods on an instance of the * <code>DOMImplementation</code> interface when the DOM implementation * supports the feature "<code>AS-DOC</code>". * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated This interface extends a <code>Node</code> from with additional methods for guided document editing. The expectation is that an instance of the <code>DOMImplementationAS</code> interface can be obtained by using binding-specific casting methods on an instance of the <code>DOMImplementation</code> interface when the DOM implementation supports the feature "<code>AS-DOC</code>". <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
NodeEditAS	TokenNameIdentifier	 Node Edit AS
{	TokenNameLBRACE	
// ASCheckType 	TokenNameCOMMENT_LINE	ASCheckType 
/** * Check for well-formedness of this node. */	TokenNameCOMMENT_JAVADOC	 Check for well-formedness of this node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WF_CHECK	TokenNameIdentifier	 WF  CHECK
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Check for namespace well-formedness includes <code>WF_CHECK</code>. */	TokenNameCOMMENT_JAVADOC	 Check for namespace well-formedness includes <code>WF_CHECK</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NS_WF_CHECK	TokenNameIdentifier	 NS  WF  CHECK
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Checks for whether this node is partially valid. It includes * <code>NS_WF_CHECK</code>. */	TokenNameCOMMENT_JAVADOC	 Checks for whether this node is partially valid. It includes <code>NS_WF_CHECK</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PARTIAL_VALIDITY_CHECK	TokenNameIdentifier	 PARTIAL  VALIDITY  CHECK
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Checks for strict validity of the node with respect to active AS which * by definition includes <code>NS_WF_CHECK</code>. */	TokenNameCOMMENT_JAVADOC	 Checks for strict validity of the node with respect to active AS which by definition includes <code>NS_WF_CHECK</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
STRICT_VALIDITY_CHECK	TokenNameIdentifier	 STRICT  VALIDITY  CHECK
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Determines whether the <code>insertBefore</code> operation from the * <code>Node</code> interface would make this document invalid with * respect to the currently active AS. Describe "valid" when referring * to partially completed documents. * @param newChild <code>Node</code> to be inserted. * @param refChild Reference <code>Node</code>. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines whether the <code>insertBefore</code> operation from the <code>Node</code> interface would make this document invalid with respect to the currently active AS. Describe "valid" when referring to partially completed documents. @param newChild <code>Node</code> to be inserted. @param refChild Reference <code>Node</code>. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canInsertBefore	TokenNameIdentifier	 can Insert Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
refChild	TokenNameIdentifier	 ref Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Has the same arguments as <code>RemoveChild</code>. * @param oldChild <code>Node</code> to be removed. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Has the same arguments as <code>RemoveChild</code>. @param oldChild <code>Node</code> to be removed. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canRemoveChild	TokenNameIdentifier	 can Remove Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Has the same arguments as <code>ReplaceChild</code>. * @param newChild New <code>Node</code>. * @param oldChild <code>Node</code> to be replaced. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Has the same arguments as <code>ReplaceChild</code>. @param newChild New <code>Node</code>. @param oldChild <code>Node</code> to be replaced. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canReplaceChild	TokenNameIdentifier	 can Replace Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Has the same arguments as <code>AppendChild</code>. * @param newChild <code>Node</code> to be appended. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Has the same arguments as <code>AppendChild</code>. @param newChild <code>Node</code> to be appended. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canAppendChild	TokenNameIdentifier	 can Append Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if the Node is valid relative to currently active AS. It * doesn't normalize before checking if the document is valid. To do so, * one would need to explicitly call a normalize method. * @param deep Setting the <code>deep</code> flag on causes the * <code>isNodeValid</code> method to check for the whole subtree of * the current node for validity. Setting it to <code>false</code> * only checks the current node and its immediate child nodes. The * <code>validate</code> method on the <code>DocumentAS</code> * interface, however, checks to determine whether the entire document * is valid. * @param wFValidityCheckLevel Flag to tell at what level validity and * well-formedness checking is done. * @return <code>true</code> if the node is valid/well-formed in the * current context and check level defined by * <code>wfValidityCheckLevel</code>, <code>false</code> if not. * @exception DOMASException * <code>NO_AS_AVAILABLE</code>: Raised if the * <code>DocumentEditAS</code> related to this node does not have any * active <code>ASModel</code> and <code>wfValidityCheckLevel</code> * is set to <code>PARTIAL</code> or <code>STRICT_VALIDITY_CHECK</code> * . */	TokenNameCOMMENT_JAVADOC	 Determines if the Node is valid relative to currently active AS. It doesn't normalize before checking if the document is valid. To do so, one would need to explicitly call a normalize method. @param deep Setting the <code>deep</code> flag on causes the <code>isNodeValid</code> method to check for the whole subtree of the current node for validity. Setting it to <code>false</code> only checks the current node and its immediate child nodes. The <code>validate</code> method on the <code>DocumentAS</code> interface, however, checks to determine whether the entire document is valid. @param wFValidityCheckLevel Flag to tell at what level validity and well-formedness checking is done. @return <code>true</code> if the node is valid/well-formed in the current context and check level defined by <code>wfValidityCheckLevel</code>, <code>false</code> if not. @exception DOMASException <code>NO_AS_AVAILABLE</code>: Raised if the <code>DocumentEditAS</code> related to this node does not have any active <code>ASModel</code> and <code>wfValidityCheckLevel</code> is set to <code>PARTIAL</code> or <code>STRICT_VALIDITY_CHECK</code> . 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNodeValid	TokenNameIdentifier	 is Node Valid
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
,	TokenNameCOMMA	
short	TokenNameshort	
wFValidityCheckLevel	TokenNameIdentifier	 w F Validity Check Level
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMASException	TokenNameIdentifier	 DOMAS Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
