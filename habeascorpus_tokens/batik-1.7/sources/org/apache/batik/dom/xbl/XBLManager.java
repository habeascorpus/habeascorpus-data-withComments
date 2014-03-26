/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** * An interface for classes that can manage XBL functionality for a * document's nodes. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: XBLManager.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An interface for classes that can manage XBL functionality for a document's nodes. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: XBLManager.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XBLManager	TokenNameIdentifier	 XBL Manager
{	TokenNameLBRACE	
/** * Starts XBL processing on the document. */	TokenNameCOMMENT_JAVADOC	 Starts XBL processing on the document. 
void	TokenNamevoid	
startProcessing	TokenNameIdentifier	 start Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Stops XBL processing on the document. */	TokenNameCOMMENT_JAVADOC	 Stops XBL processing on the document. 
void	TokenNamevoid	
stopProcessing	TokenNameIdentifier	 stop Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether XBL processing is currently enabled. */	TokenNameCOMMENT_JAVADOC	 Returns whether XBL processing is currently enabled. 
boolean	TokenNameboolean	
isProcessing	TokenNameIdentifier	 is Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the parent of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the parent of a node in the fully flattened tree. 
Node	TokenNameIdentifier	 Node
getXblParentNode	TokenNameIdentifier	 get Xbl Parent Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the list of child nodes of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the list of child nodes of a node in the fully flattened tree. 
NodeList	TokenNameIdentifier	 Node List
getXblChildNodes	TokenNameIdentifier	 get Xbl Child Nodes
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the list of child nodes of a node in the fully flattened tree * that are within the same shadow scope. */	TokenNameCOMMENT_JAVADOC	 Get the list of child nodes of a node in the fully flattened tree that are within the same shadow scope. 
NodeList	TokenNameIdentifier	 Node List
getXblScopedChildNodes	TokenNameIdentifier	 get Xbl Scoped Child Nodes
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the first child node of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the first child node of a node in the fully flattened tree. 
Node	TokenNameIdentifier	 Node
getXblFirstChild	TokenNameIdentifier	 get Xbl First Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the last child node of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the last child node of a node in the fully flattened tree. 
Node	TokenNameIdentifier	 Node
getXblLastChild	TokenNameIdentifier	 get Xbl Last Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the node which directly precedes a node in the xblParentNode's * xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the node which directly precedes a node in the xblParentNode's xblChildNodes list. 
Node	TokenNameIdentifier	 Node
getXblPreviousSibling	TokenNameIdentifier	 get Xbl Previous Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the node which directly follows a node in thexblParentNode's * xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the node which directly follows a node in thexblParentNode's xblChildNodes list. 
Node	TokenNameIdentifier	 Node
getXblNextSibling	TokenNameIdentifier	 get Xbl Next Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the first element child of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the first element child of a node in the fully flattened tree. 
Element	TokenNameIdentifier	 Element
getXblFirstElementChild	TokenNameIdentifier	 get Xbl First Element Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the last element child of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the last element child of a node in the fully flattened tree. 
Element	TokenNameIdentifier	 Element
getXblLastElementChild	TokenNameIdentifier	 get Xbl Last Element Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the first element that precedes the a node in the * xblParentNode's xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the first element that precedes the a node in the xblParentNode's xblChildNodes list. 
Element	TokenNameIdentifier	 Element
getXblPreviousElementSibling	TokenNameIdentifier	 get Xbl Previous Element Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the first element that follows a node in the * xblParentNode's xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the first element that follows a node in the xblParentNode's xblChildNodes list. 
Element	TokenNameIdentifier	 Element
getXblNextElementSibling	TokenNameIdentifier	 get Xbl Next Element Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the bound element whose shadow tree a node resides in. */	TokenNameCOMMENT_JAVADOC	 Get the bound element whose shadow tree a node resides in. 
Element	TokenNameIdentifier	 Element
getXblBoundElement	TokenNameIdentifier	 get Xbl Bound Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the shadow tree of a node. */	TokenNameCOMMENT_JAVADOC	 Get the shadow tree of a node. 
Element	TokenNameIdentifier	 Element
getXblShadowTree	TokenNameIdentifier	 get Xbl Shadow Tree
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the xbl:definition elements currently binding an element. */	TokenNameCOMMENT_JAVADOC	 Get the xbl:definition elements currently binding an element. 
NodeList	TokenNameIdentifier	 Node List
getXblDefinitions	TokenNameIdentifier	 get Xbl Definitions
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
