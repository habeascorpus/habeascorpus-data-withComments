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
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * @deprecated * This interface extends the <code>Document</code> interface with additional * methods for both document and AS editing. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated This interface extends the <code>Document</code> interface with additional methods for both document and AS editing. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
DocumentAS	TokenNameIdentifier	 Document AS
{	TokenNameLBRACE	
/** * The active external ASModel. Note that the active external * <code>ASModel</code> is responsible for consulting the internal * ASModel, so if an attribute is declared in the internal * <code>ASModel</code> and the corresponding <code>ownerElements</code> * points to a <code>ASElementDeclaration</code>s defined in the active * external ASModel, changing the active external ASModel will cause the * <code>ownerElements</code> to be recomputed. If the * <code>ownerElements</code> is not defined in the newly active * external ASModel, the <code>ownerElements</code> will be an empty * node list. */	TokenNameCOMMENT_JAVADOC	 The active external ASModel. Note that the active external <code>ASModel</code> is responsible for consulting the internal ASModel, so if an attribute is declared in the internal <code>ASModel</code> and the corresponding <code>ownerElements</code> points to a <code>ASElementDeclaration</code>s defined in the active external ASModel, changing the active external ASModel will cause the <code>ownerElements</code> to be recomputed. If the <code>ownerElements</code> is not defined in the newly active external ASModel, the <code>ownerElements</code> will be an empty node list. 
public	TokenNamepublic	
ASModel	TokenNameIdentifier	 AS Model
getActiveASModel	TokenNameIdentifier	 get Active AS Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The active external ASModel. Note that the active external * <code>ASModel</code> is responsible for consulting the internal * ASModel, so if an attribute is declared in the internal * <code>ASModel</code> and the corresponding <code>ownerElements</code> * points to a <code>ASElementDeclaration</code>s defined in the active * external ASModel, changing the active external ASModel will cause the * <code>ownerElements</code> to be recomputed. If the * <code>ownerElements</code> is not defined in the newly active * external ASModel, the <code>ownerElements</code> will be an empty * node list. */	TokenNameCOMMENT_JAVADOC	 The active external ASModel. Note that the active external <code>ASModel</code> is responsible for consulting the internal ASModel, so if an attribute is declared in the internal <code>ASModel</code> and the corresponding <code>ownerElements</code> points to a <code>ASElementDeclaration</code>s defined in the active external ASModel, changing the active external ASModel will cause the <code>ownerElements</code> to be recomputed. If the <code>ownerElements</code> is not defined in the newly active external ASModel, the <code>ownerElements</code> will be an empty node list. 
public	TokenNamepublic	
void	TokenNamevoid	
setActiveASModel	TokenNameIdentifier	 set Active AS Model
(	TokenNameLPAREN	
ASModel	TokenNameIdentifier	 AS Model
activeASModel	TokenNameIdentifier	 active AS Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A list of <code>ASObject</code>s of type <code>AS_MODEL</code>s * associated with a document. The <code>addAS</code> method associates * a <code>ASModel</code> with a document. */	TokenNameCOMMENT_JAVADOC	 A list of <code>ASObject</code>s of type <code>AS_MODEL</code>s associated with a document. The <code>addAS</code> method associates a <code>ASModel</code> with a document. 
public	TokenNamepublic	
ASObjectList	TokenNameIdentifier	 AS Object List
getBoundASModels	TokenNameIdentifier	 get Bound AS Models
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A list of <code>ASObject</code>s of type <code>AS_MODEL</code>s * associated with a document. The <code>addAS</code> method associates * a <code>ASModel</code> with a document. */	TokenNameCOMMENT_JAVADOC	 A list of <code>ASObject</code>s of type <code>AS_MODEL</code>s associated with a document. The <code>addAS</code> method associates a <code>ASModel</code> with a document. 
public	TokenNamepublic	
void	TokenNamevoid	
setBoundASModels	TokenNameIdentifier	 set Bound AS Models
(	TokenNameLPAREN	
ASObjectList	TokenNameIdentifier	 AS Object List
boundASModels	TokenNameIdentifier	 bound AS Models
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieve the internal <code>ASModel</code> of a document. * @return <code>ASModel</code>. */	TokenNameCOMMENT_JAVADOC	 Retrieve the internal <code>ASModel</code> of a document. @return <code>ASModel</code>. 
public	TokenNamepublic	
ASModel	TokenNameIdentifier	 AS Model
getInternalAS	TokenNameIdentifier	 get Internal AS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the internal subset <code>ASModel</code> of a document. This could * be null as a mechanism for "removal". * @param as <code>ASModel</code> to be the internal subset of the * document. */	TokenNameCOMMENT_JAVADOC	 Sets the internal subset <code>ASModel</code> of a document. This could be null as a mechanism for "removal". @param as <code>ASModel</code> to be the internal subset of the document. 
public	TokenNamepublic	
void	TokenNamevoid	
setInternalAS	TokenNameIdentifier	 set Internal AS
(	TokenNameLPAREN	
ASModel	TokenNameIdentifier	 AS Model
as	TokenNameIdentifier	 as
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Associate a <code>ASModel</code> with a document. Can be invoked * multiple times to result in a list of <code>ASModel</code>s. Note * that only one internal <code>ASModel</code> is associated with the * document, however, and that only one of the possible list of * <code>ASModel</code>s is active at any one time. * @param as <code>ASModel</code> to be associated with the document. */	TokenNameCOMMENT_JAVADOC	 Associate a <code>ASModel</code> with a document. Can be invoked multiple times to result in a list of <code>ASModel</code>s. Note that only one internal <code>ASModel</code> is associated with the document, however, and that only one of the possible list of <code>ASModel</code>s is active at any one time. @param as <code>ASModel</code> to be associated with the document. 
public	TokenNamepublic	
void	TokenNamevoid	
addAS	TokenNameIdentifier	 add AS
(	TokenNameLPAREN	
ASModel	TokenNameIdentifier	 AS Model
as	TokenNameIdentifier	 as
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes a <code>ASModel</code> associated with a document. Can be * invoked multiple times to remove a number of these in the list of * <code>ASModel</code>s. * @param as The <code>ASModel</code> to be removed. */	TokenNameCOMMENT_JAVADOC	 Removes a <code>ASModel</code> associated with a document. Can be invoked multiple times to remove a number of these in the list of <code>ASModel</code>s. @param as The <code>ASModel</code> to be removed. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAS	TokenNameIdentifier	 remove AS
(	TokenNameLPAREN	
ASModel	TokenNameIdentifier	 AS Model
as	TokenNameIdentifier	 as
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the AS editing object describing this elementThis method needs to * be changed and others added. * @return ASElementDeclaration object if the implementation supports " * <code>AS-EDIT</code>" feature. Otherwise <code>null</code>. * @exception DOMException * NOT_FOUND_ERR: Raised if no <code>ASModel</code> is present. */	TokenNameCOMMENT_JAVADOC	 Gets the AS editing object describing this elementThis method needs to be changed and others added. @return ASElementDeclaration object if the implementation supports " <code>AS-EDIT</code>" feature. Otherwise <code>null</code>. @exception DOMException NOT_FOUND_ERR: Raised if no <code>ASModel</code> is present. 
public	TokenNamepublic	
ASElementDeclaration	TokenNameIdentifier	 AS Element Declaration
getElementDeclaration	TokenNameIdentifier	 get Element Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Validates the document against the <code>ASModel</code>. * @exception DOMASException * */	TokenNameCOMMENT_JAVADOC	 Validates the document against the <code>ASModel</code>. @exception DOMASException 
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMASException	TokenNameIdentifier	 DOMAS Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
