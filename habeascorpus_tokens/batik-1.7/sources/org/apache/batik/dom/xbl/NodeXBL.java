/* * Copyright (c) 2005 World Wide Web Consortium, * * (Massachusetts Institute of Technology, European Research Consortium for * Informatics and Mathematics, Keio University). All Rights Reserved. This * work is distributed under the W3C(r) Software License [1] in the hope that * it will be useful, but WITHOUT ANY WARRANTY; without even the implied * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 * * Modifications: * * September 10, 2005 * Placed interface in org.apache.batik.dom.xbl for the time being. * Added javadocs. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2005 World Wide Web Consortium, * (Massachusetts Institute of Technology, European Research Consortium for Informatics and Mathematics, Keio University). All Rights Reserved. This work is distributed under the W3C(r) Software License [1] in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 * Modifications: * September 10, 2005 Placed interface in org.apache.batik.dom.xbl for the time being. Added javadocs. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xbl	TokenNameIdentifier	 xbl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * Interface implemented by all nodes that support XBL. * Eventually will move to org.w3c.dom.xbl (or some such package). * * @version $Id: NodeXBL.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Interface implemented by all nodes that support XBL. Eventually will move to org.w3c.dom.xbl (or some such package). * @version $Id: NodeXBL.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
NodeXBL	TokenNameIdentifier	 Node XBL
{	TokenNameLBRACE	
/** * Get the parent of this node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the parent of this node in the fully flattened tree. 
Node	TokenNameIdentifier	 Node
getXblParentNode	TokenNameIdentifier	 get Xbl Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the list of child nodes of this node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the list of child nodes of this node in the fully flattened tree. 
NodeList	TokenNameIdentifier	 Node List
getXblChildNodes	TokenNameIdentifier	 get Xbl Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the list of child nodes of this node in the fully flattened tree * that are within the same shadow scope. */	TokenNameCOMMENT_JAVADOC	 Get the list of child nodes of this node in the fully flattened tree that are within the same shadow scope. 
NodeList	TokenNameIdentifier	 Node List
getXblScopedChildNodes	TokenNameIdentifier	 get Xbl Scoped Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the first child node of this node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the first child node of this node in the fully flattened tree. 
Node	TokenNameIdentifier	 Node
getXblFirstChild	TokenNameIdentifier	 get Xbl First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the last child node of this node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the last child node of this node in the fully flattened tree. 
Node	TokenNameIdentifier	 Node
getXblLastChild	TokenNameIdentifier	 get Xbl Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the node which directly precedes the current node in the * xblParentNode's xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the node which directly precedes the current node in the xblParentNode's xblChildNodes list. 
Node	TokenNameIdentifier	 Node
getXblPreviousSibling	TokenNameIdentifier	 get Xbl Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the node which directly follows the current node in the * xblParentNode's xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the node which directly follows the current node in the xblParentNode's xblChildNodes list. 
Node	TokenNameIdentifier	 Node
getXblNextSibling	TokenNameIdentifier	 get Xbl Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the first element child of this node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the first element child of this node in the fully flattened tree. 
Element	TokenNameIdentifier	 Element
getXblFirstElementChild	TokenNameIdentifier	 get Xbl First Element Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the last element child of this node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the last element child of this node in the fully flattened tree. 
Element	TokenNameIdentifier	 Element
getXblLastElementChild	TokenNameIdentifier	 get Xbl Last Element Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the first element that precedes the current node in the * xblParentNode's xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the first element that precedes the current node in the xblParentNode's xblChildNodes list. 
Element	TokenNameIdentifier	 Element
getXblPreviousElementSibling	TokenNameIdentifier	 get Xbl Previous Element Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the first element that follows the current node in the * xblParentNode's xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the first element that follows the current node in the xblParentNode's xblChildNodes list. 
Element	TokenNameIdentifier	 Element
getXblNextElementSibling	TokenNameIdentifier	 get Xbl Next Element Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the bound element whose shadow tree this current node resides in. */	TokenNameCOMMENT_JAVADOC	 Get the bound element whose shadow tree this current node resides in. 
Element	TokenNameIdentifier	 Element
getXblBoundElement	TokenNameIdentifier	 get Xbl Bound Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the shadow tree of this node. */	TokenNameCOMMENT_JAVADOC	 Get the shadow tree of this node. 
Element	TokenNameIdentifier	 Element
getXblShadowTree	TokenNameIdentifier	 get Xbl Shadow Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the xbl:definition elements currently binding this element. */	TokenNameCOMMENT_JAVADOC	 Get the xbl:definition elements currently binding this element. 
NodeList	TokenNameIdentifier	 Node List
getXblDefinitions	TokenNameIdentifier	 get Xbl Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
