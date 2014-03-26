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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractNode	TokenNameIdentifier	 Abstract Node
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
/** * An XBL manager that performs no XBL processing. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: GenericXBLManager.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An XBL manager that performs no XBL processing. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: GenericXBLManager.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GenericXBLManager	TokenNameIdentifier	 Generic XBL Manager
implements	TokenNameimplements	
XBLManager	TokenNameIdentifier	 XBL Manager
{	TokenNameLBRACE	
/** * Whether XBL processing is currently taking place. */	TokenNameCOMMENT_JAVADOC	 Whether XBL processing is currently taking place. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isProcessing	TokenNameIdentifier	 is Processing
;	TokenNameSEMICOLON	
/** * Starts XBL processing on the document. */	TokenNameCOMMENT_JAVADOC	 Starts XBL processing on the document. 
public	TokenNamepublic	
void	TokenNamevoid	
startProcessing	TokenNameIdentifier	 start Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isProcessing	TokenNameIdentifier	 is Processing
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stops XBL processing on the document. */	TokenNameCOMMENT_JAVADOC	 Stops XBL processing on the document. 
public	TokenNamepublic	
void	TokenNamevoid	
stopProcessing	TokenNameIdentifier	 stop Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isProcessing	TokenNameIdentifier	 is Processing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether XBL processing is currently enabled. */	TokenNameCOMMENT_JAVADOC	 Returns whether XBL processing is currently enabled. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isProcessing	TokenNameIdentifier	 is Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isProcessing	TokenNameIdentifier	 is Processing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the parent of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the parent of a node in the fully flattened tree. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getXblParentNode	TokenNameIdentifier	 get Xbl Parent Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the list of child nodes of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the list of child nodes of a node in the fully flattened tree. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getXblChildNodes	TokenNameIdentifier	 get Xbl Child Nodes
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the list of child nodes of a node in the fully flattened tree * that are within the same shadow scope. */	TokenNameCOMMENT_JAVADOC	 Get the list of child nodes of a node in the fully flattened tree that are within the same shadow scope. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getXblScopedChildNodes	TokenNameIdentifier	 get Xbl Scoped Child Nodes
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first child node of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the first child node of a node in the fully flattened tree. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getXblFirstChild	TokenNameIdentifier	 get Xbl First Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the last child node of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the last child node of a node in the fully flattened tree. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getXblLastChild	TokenNameIdentifier	 get Xbl Last Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the node which directly precedes a node in the xblParentNode's * xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the node which directly precedes a node in the xblParentNode's xblChildNodes list. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getXblPreviousSibling	TokenNameIdentifier	 get Xbl Previous Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the node which directly follows a node in thexblParentNode's * xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the node which directly follows a node in thexblParentNode's xblChildNodes list. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getXblNextSibling	TokenNameIdentifier	 get Xbl Next Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first element child of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the first element child of a node in the fully flattened tree. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getXblFirstElementChild	TokenNameIdentifier	 get Xbl First Element Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the last element child of a node in the fully flattened tree. */	TokenNameCOMMENT_JAVADOC	 Get the last element child of a node in the fully flattened tree. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getXblLastElementChild	TokenNameIdentifier	 get Xbl Last Element Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first element that precedes the a node in the * xblParentNode's xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the first element that precedes the a node in the xblParentNode's xblChildNodes list. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getXblPreviousElementSibling	TokenNameIdentifier	 get Xbl Previous Element Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first element that follows a node in the * xblParentNode's xblChildNodes list. */	TokenNameCOMMENT_JAVADOC	 Get the first element that follows a node in the xblParentNode's xblChildNodes list. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getXblNextElementSibling	TokenNameIdentifier	 get Xbl Next Element Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the bound element whose shadow tree a node resides in. */	TokenNameCOMMENT_JAVADOC	 Get the bound element whose shadow tree a node resides in. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getXblBoundElement	TokenNameIdentifier	 get Xbl Bound Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the shadow tree of a node. */	TokenNameCOMMENT_JAVADOC	 Get the shadow tree of a node. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getXblShadowTree	TokenNameIdentifier	 get Xbl Shadow Tree
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the xbl:definition elements currently binding an element. */	TokenNameCOMMENT_JAVADOC	 Get the xbl:definition elements currently binding an element. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getXblDefinitions	TokenNameIdentifier	 get Xbl Definitions
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
AbstractNode	TokenNameIdentifier	 Abstract Node
.	TokenNameDOT	
EMPTY_NODE_LIST	TokenNameIdentifier	 EMPTY  NODE  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
