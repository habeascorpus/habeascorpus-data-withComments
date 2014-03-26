/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AttrImpl	TokenNameIdentifier	 Attr Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DocumentImpl	TokenNameIdentifier	 Document Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
ElementImpl	TokenNameIdentifier	 Element Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
NamedNodeMap	TokenNameIdentifier	 Named Node Map
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
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSException	TokenNameIdentifier	 LS Exception
;	TokenNameSEMICOLON	
/** * Some useful utility methods. * This class was modified in Xerces2 with a view to abstracting as * much as possible away from the representation of the underlying * parsed structure (i.e., the DOM). This was done so that, if Xerces * ever adopts an in-memory representation more efficient than the DOM * (such as a DTM), we should easily be able to convert our schema * parsing to utilize it. * * @version $Id: DOMUtil.java 929493 2010-03-31 12:15:17Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Some useful utility methods. This class was modified in Xerces2 with a view to abstracting as much as possible away from the representation of the underlying parsed structure (i.e., the DOM). This was done so that, if Xerces ever adopts an in-memory representation more efficient than the DOM (such as a DTM), we should easily be able to convert our schema parsing to utilize it. * @version $Id: DOMUtil.java 929493 2010-03-31 12:15:17Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMUtil	TokenNameIdentifier	 DOM Util
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** This class cannot be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class cannot be instantiated. 
protected	TokenNameprotected	
DOMUtil	TokenNameIdentifier	 DOM Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public static methods 	TokenNameCOMMENT_LINE	Public static methods 
// 	TokenNameCOMMENT_LINE	 
/** * Copies the source tree into the specified place in a destination * tree. The source node and its children are appended as children * of the destination node. * <p> * <em>Note:</em> This is an iterative implementation. */	TokenNameCOMMENT_JAVADOC	 Copies the source tree into the specified place in a destination tree. The source node and its children are appended as children of the destination node. <p> <em>Note:</em> This is an iterative implementation. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
// get node factory 	TokenNameCOMMENT_LINE	get node factory 
Document	TokenNameIdentifier	 Document
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
domimpl	TokenNameIdentifier	 domimpl
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
instanceof	TokenNameinstanceof	
DocumentImpl	TokenNameIdentifier	 Document Impl
;	TokenNameSEMICOLON	
// placement variables 	TokenNameCOMMENT_LINE	placement variables 
Node	TokenNameIdentifier	 Node
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
// traverse source tree 	TokenNameCOMMENT_LINE	traverse source tree 
while	TokenNamewhile	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// copy this node 	TokenNameCOMMENT_LINE	copy this node 
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createCDATASection	TokenNameIdentifier	 create CDATA Section
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createComment	TokenNameIdentifier	 create Comment
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
attrCount	TokenNameIdentifier	 attr Count
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrCount	TokenNameIdentifier	 attr Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
domimpl	TokenNameIdentifier	 domimpl
&&	TokenNameAND_AND	
!	TokenNameNOT	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getSpecified	TokenNameIdentifier	 get Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setSpecified	TokenNameIdentifier	 set Specified
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createEntityReference	TokenNameIdentifier	 create Entity Reference
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createProcessingInstruction	TokenNameIdentifier	 create Processing Instruction
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't copy node type, "	TokenNameStringLiteral	can't copy node type, 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// iterate over children 	TokenNameCOMMENT_LINE	iterate over children 
if	TokenNameif	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
;	TokenNameSEMICOLON	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// advance 	TokenNameCOMMENT_LINE	advance 
else	TokenNameelse	
{	TokenNameLBRACE	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// copyInto(Node,Node) 	TokenNameCOMMENT_LINE	copyInto(Node,Node) 
/** Finds and returns the first child element node. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the first child element node. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstChildElement(Node):Element 	TokenNameCOMMENT_LINE	getFirstChildElement(Node):Element 
/** Finds and returns the first visible child element node. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the first visible child element node. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstVisibleChildElement	TokenNameIdentifier	 get First Visible Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isHidden	TokenNameIdentifier	 is Hidden
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstChildElement(Node):Element 	TokenNameCOMMENT_LINE	getFirstChildElement(Node):Element 
/** Finds and returns the first visible child element node. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the first visible child element node. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstVisibleChildElement	TokenNameIdentifier	 get First Visible Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
hiddenNodes	TokenNameIdentifier	 hidden Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isHidden	TokenNameIdentifier	 is Hidden
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
hiddenNodes	TokenNameIdentifier	 hidden Nodes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstChildElement(Node):Element 	TokenNameCOMMENT_LINE	getFirstChildElement(Node):Element 
/** Finds and returns the last child element node. * Overload previous method for non-Xerces node impl. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the last child element node. Overload previous method for non-Xerces node impl. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getLastChildElement	TokenNameIdentifier	 get Last Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChildElement(Node):Element 	TokenNameCOMMENT_LINE	getLastChildElement(Node):Element 
/** Finds and returns the last visible child element node. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the last visible child element node. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getLastVisibleChildElement	TokenNameIdentifier	 get Last Visible Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isHidden	TokenNameIdentifier	 is Hidden
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChildElement(Node):Element 	TokenNameCOMMENT_LINE	getLastChildElement(Node):Element 
/** Finds and returns the last visible child element node. * Overload previous method for non-Xerces node impl */	TokenNameCOMMENT_JAVADOC	 Finds and returns the last visible child element node. Overload previous method for non-Xerces node impl 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getLastVisibleChildElement	TokenNameIdentifier	 get Last Visible Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
hiddenNodes	TokenNameIdentifier	 hidden Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isHidden	TokenNameIdentifier	 is Hidden
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
hiddenNodes	TokenNameIdentifier	 hidden Nodes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChildElement(Node):Element 	TokenNameCOMMENT_LINE	getLastChildElement(Node):Element 
/** Finds and returns the next sibling element node. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the next sibling element node. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextSiblingElement(Node):Element 	TokenNameCOMMENT_LINE	getNextSiblingElement(Node):Element 
// get next visible (un-hidden) node. 	TokenNameCOMMENT_LINE	get next visible (un-hidden) node. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getNextVisibleSiblingElement	TokenNameIdentifier	 get Next Visible Sibling Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isHidden	TokenNameIdentifier	 is Hidden
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextSiblingdElement(Node):Element 	TokenNameCOMMENT_LINE	getNextSiblingdElement(Node):Element 
// get next visible (un-hidden) node, overload previous method for non Xerces node impl 	TokenNameCOMMENT_LINE	get next visible (un-hidden) node, overload previous method for non Xerces node impl 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getNextVisibleSiblingElement	TokenNameIdentifier	 get Next Visible Sibling Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
hiddenNodes	TokenNameIdentifier	 hidden Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isHidden	TokenNameIdentifier	 is Hidden
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
hiddenNodes	TokenNameIdentifier	 hidden Nodes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextSiblingdElement(Node):Element 	TokenNameCOMMENT_LINE	getNextSiblingdElement(Node):Element 
// set this Node as being hidden 	TokenNameCOMMENT_LINE	set this Node as being hidden 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setHidden	TokenNameIdentifier	 set Hidden
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setHidden(node):void 	TokenNameCOMMENT_LINE	setHidden(node):void 
// set this Node as being hidden, overloaded method 	TokenNameCOMMENT_LINE	set this Node as being hidden, overloaded method 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setHidden	TokenNameIdentifier	 set Hidden
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
hiddenNodes	TokenNameIdentifier	 hidden Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
hiddenNodes	TokenNameIdentifier	 hidden Nodes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setHidden(node):void 	TokenNameCOMMENT_LINE	setHidden(node):void 
// set this Node as being visible 	TokenNameCOMMENT_LINE	set this Node as being visible 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setVisible(node):void 	TokenNameCOMMENT_LINE	setVisible(node):void 
// set this Node as being visible, overloaded method 	TokenNameCOMMENT_LINE	set this Node as being visible, overloaded method 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
hiddenNodes	TokenNameIdentifier	 hidden Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
hiddenNodes	TokenNameIdentifier	 hidden Nodes
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setVisible(node):void 	TokenNameCOMMENT_LINE	setVisible(node):void 
// is this node hidden? 	TokenNameCOMMENT_LINE	is this node hidden? 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isHidden	TokenNameIdentifier	 is Hidden
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getReadOnly	TokenNameIdentifier	 get Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getReadOnly	TokenNameIdentifier	 get Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isHidden(Node):boolean 	TokenNameCOMMENT_LINE	isHidden(Node):boolean 
// is this node hidden? overloaded method 	TokenNameCOMMENT_LINE	is this node hidden? overloaded method 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isHidden	TokenNameIdentifier	 is Hidden
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
hiddenNodes	TokenNameIdentifier	 hidden Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getReadOnly	TokenNameIdentifier	 get Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
hiddenNodes	TokenNameIdentifier	 hidden Nodes
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// isHidden(Node):boolean 	TokenNameCOMMENT_LINE	isHidden(Node):boolean 
/** Finds and returns the first child node with the given name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the first child node with the given name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstChildElement(Node,String):Element 	TokenNameCOMMENT_LINE	getFirstChildElement(Node,String):Element 
/** Finds and returns the last child node with the given name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the last child node with the given name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getLastChildElement	TokenNameIdentifier	 get Last Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChildElement(Node,String):Element 	TokenNameCOMMENT_LINE	getLastChildElement(Node,String):Element 
/** Finds and returns the next sibling node with the given name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the next sibling node with the given name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextSiblingdElement(Node,String):Element 	TokenNameCOMMENT_LINE	getNextSiblingdElement(Node,String):Element 
/** Finds and returns the first child node with the given qualified name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the first child node with the given qualified name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstChildElementNS	TokenNameIdentifier	 get First Child Element NS
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
childURI	TokenNameIdentifier	 child URI
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childURI	TokenNameIdentifier	 child URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
childURI	TokenNameIdentifier	 child URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstChildElementNS(Node,String,String):Element 	TokenNameCOMMENT_LINE	getFirstChildElementNS(Node,String,String):Element 
/** Finds and returns the last child node with the given qualified name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the last child node with the given qualified name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getLastChildElementNS	TokenNameIdentifier	 get Last Child Element NS
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
childURI	TokenNameIdentifier	 child URI
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childURI	TokenNameIdentifier	 child URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
childURI	TokenNameIdentifier	 child URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChildElementNS(Node,String,String):Element 	TokenNameCOMMENT_LINE	getLastChildElementNS(Node,String,String):Element 
/** Finds and returns the next sibling node with the given qualified name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the next sibling node with the given qualified name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getNextSiblingElementNS	TokenNameIdentifier	 get Next Sibling Element NS
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
siblingURI	TokenNameIdentifier	 sibling URI
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
siblingURI	TokenNameIdentifier	 sibling URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
siblingURI	TokenNameIdentifier	 sibling URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextSiblingdElementNS(Node,String,String):Element 	TokenNameCOMMENT_LINE	getNextSiblingdElementNS(Node,String,String):Element 
/** Finds and returns the first child node with the given name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the first child node with the given name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
elemNames	TokenNameIdentifier	 elem Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstChildElement(Node,String[]):Element 	TokenNameCOMMENT_LINE	getFirstChildElement(Node,String[]):Element 
/** Finds and returns the last child node with the given name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the last child node with the given name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getLastChildElement	TokenNameIdentifier	 get Last Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
elemNames	TokenNameIdentifier	 elem Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChildElement(Node,String[]):Element 	TokenNameCOMMENT_LINE	getLastChildElement(Node,String[]):Element 
/** Finds and returns the next sibling node with the given name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the next sibling node with the given name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
elemNames	TokenNameIdentifier	 elem Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextSiblingdElement(Node,String[]):Element 	TokenNameCOMMENT_LINE	getNextSiblingdElement(Node,String[]):Element 
/** Finds and returns the first child node with the given qualified name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the first child node with the given qualified name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstChildElementNS	TokenNameIdentifier	 get First Child Element NS
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elemNames	TokenNameIdentifier	 elem Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
elemNames	TokenNameIdentifier	 elem Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstChildElementNS(Node,String[][]):Element 	TokenNameCOMMENT_LINE	getFirstChildElementNS(Node,String[][]):Element 
/** Finds and returns the last child node with the given qualified name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the last child node with the given qualified name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getLastChildElementNS	TokenNameIdentifier	 get Last Child Element NS
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elemNames	TokenNameIdentifier	 elem Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
elemNames	TokenNameIdentifier	 elem Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChildElementNS(Node,String[][]):Element 	TokenNameCOMMENT_LINE	getLastChildElementNS(Node,String[][]):Element 
/** Finds and returns the next sibling node with the given qualified name. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the next sibling node with the given qualified name. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getNextSiblingElementNS	TokenNameIdentifier	 get Next Sibling Element NS
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elemNames	TokenNameIdentifier	 elem Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
elemNames	TokenNameIdentifier	 elem Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextSiblingdElementNS(Node,String[][]):Element 	TokenNameCOMMENT_LINE	getNextSiblingdElementNS(Node,String[][]):Element 
/** * Finds and returns the first child node with the given name and * attribute name, value pair. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the first child node with the given name and attribute name, value pair. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstChildElement(Node,String,String,String):Element 	TokenNameCOMMENT_LINE	getFirstChildElement(Node,String,String,String):Element 
/** * Finds and returns the last child node with the given name and * attribute name, value pair. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the last child node with the given name and attribute name, value pair. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getLastChildElement	TokenNameIdentifier	 get Last Child Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastChildElement(Node,String,String,String):Element 	TokenNameCOMMENT_LINE	getLastChildElement(Node,String,String,String):Element 
/** * Finds and returns the next sibling node with the given name and * attribute name, value pair. Since only elements have attributes, * the node returned will be of type Node.ELEMENT_NODE. */	TokenNameCOMMENT_JAVADOC	 Finds and returns the next sibling node with the given name and attribute name, value pair. Since only elements have attributes, the node returned will be of type Node.ELEMENT_NODE. 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getNextSiblingElement	TokenNameIdentifier	 get Next Sibling Element
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for node 	TokenNameCOMMENT_LINE	search for node 
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextSiblingElement(Node,String,String,String):Element 	TokenNameCOMMENT_LINE	getNextSiblingElement(Node,String,String,String):Element 
/** * Returns the concatenated child text of the specified node. * This method only looks at the immediate children of type * <code>Node.TEXT_NODE</code> or the children of any child * node that is of type <code>Node.CDATA_SECTION_NODE</code> * for the concatenation. * * @param node The node to look at. */	TokenNameCOMMENT_JAVADOC	 Returns the concatenated child text of the specified node. This method only looks at the immediate children of type <code>Node.TEXT_NODE</code> or the children of any child node that is of type <code>Node.CDATA_SECTION_NODE</code> for the concatenation. * @param node The node to look at. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getChildText	TokenNameIdentifier	 get Child Text
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is there anything to do? 	TokenNameCOMMENT_LINE	is there anything to do? 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// concatenate children text 	TokenNameCOMMENT_LINE	concatenate children text 
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getChildText	TokenNameIdentifier	 get Child Text
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return text value 	TokenNameCOMMENT_LINE	return text value 
return	TokenNamereturn	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getChildText(Node):String 	TokenNameCOMMENT_LINE	getChildText(Node):String 
// return the name of this element 	TokenNameCOMMENT_LINE	return the name of this element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLocalName(Element): String 	TokenNameCOMMENT_LINE	getLocalName(Element): String 
/** returns local name of this element if not null, otherwise returns the name of the node */	TokenNameCOMMENT_JAVADOC	 returns local name of this element if not null, otherwise returns the name of the node 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLocalName(Element): String 	TokenNameCOMMENT_LINE	getLocalName(Element): String 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getParent(Element):Element 	TokenNameCOMMENT_LINE	getParent(Element):Element 
// get the Document of which this Node is a part 	TokenNameCOMMENT_LINE	get the Document of which this Node is a part 
public	TokenNamepublic	
static	TokenNamestatic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getDocument(Node):Document 	TokenNameCOMMENT_LINE	getDocument(Node):Document 
// return this Document's root node 	TokenNameCOMMENT_LINE	return this Document's root node 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getRoot(Document(: Element 	TokenNameCOMMENT_LINE	getRoot(Document(: Element 
// some methods for handling attributes: 	TokenNameCOMMENT_LINE	some methods for handling attributes: 
// return the right attribute node 	TokenNameCOMMENT_LINE	return the right attribute node 
public	TokenNamepublic	
static	TokenNamestatic	
Attr	TokenNameIdentifier	 Attr
getAttr	TokenNameIdentifier	 get Attr
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttr(Element, String):Attr 	TokenNameCOMMENT_LINE	getAttr(Element, String):Attr 
// return the right attribute node 	TokenNameCOMMENT_LINE	return the right attribute node 
public	TokenNamepublic	
static	TokenNamestatic	
Attr	TokenNameIdentifier	 Attr
getAttrNS	TokenNameIdentifier	 get Attr NS
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nsUri	TokenNameIdentifier	 ns Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
nsUri	TokenNameIdentifier	 ns Uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttrNS(Element, String):Attr 	TokenNameCOMMENT_LINE	getAttrNS(Element, String):Attr 
// get all the attributes for an Element 	TokenNameCOMMENT_LINE	get all the attributes for an Element 
public	TokenNamepublic	
static	TokenNamestatic	
Attr	TokenNameIdentifier	 Attr
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAttrs	TokenNameIdentifier	 get Attrs
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Attr	TokenNameIdentifier	 Attr
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrArray	TokenNameIdentifier	 attr Array
=	TokenNameEQUAL	
new	TokenNamenew	
Attr	TokenNameIdentifier	 Attr
[	TokenNameLBRACKET	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
attrArray	TokenNameIdentifier	 attr Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
attrArray	TokenNameIdentifier	 attr Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttrs(Element): Attr[] 	TokenNameCOMMENT_LINE	getAttrs(Element): Attr[] 
// get attribute's value 	TokenNameCOMMENT_LINE	get attribute's value 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getValue(Attr):String 	TokenNameCOMMENT_LINE	getValue(Attr):String 
// It is noteworthy that, because of the way the DOM specs 	TokenNameCOMMENT_LINE	It is noteworthy that, because of the way the DOM specs 
// work, the next two methods return the empty string (not 	TokenNameCOMMENT_LINE	work, the next two methods return the empty string (not 
// null!) when the attribute with the specified name does not 	TokenNameCOMMENT_LINE	null!) when the attribute with the specified name does not 
// exist on an element. Beware! 	TokenNameCOMMENT_LINE	exist on an element. Beware! 
// return the value of the attribute of the given element 	TokenNameCOMMENT_LINE	return the value of the attribute of the given element 
// with the given name 	TokenNameCOMMENT_LINE	with the given name 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAttrValue	TokenNameIdentifier	 get Attr Value
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttr(Element, String):Attr 	TokenNameCOMMENT_LINE	getAttr(Element, String):Attr 
// return the value of the attribute of the given element 	TokenNameCOMMENT_LINE	return the value of the attribute of the given element 
// with the given name 	TokenNameCOMMENT_LINE	with the given name 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAttrValueNS	TokenNameIdentifier	 get Attr Value NS
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nsUri	TokenNameIdentifier	 ns Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
nsUri	TokenNameIdentifier	 ns Uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttrValueNS(Element, String):Attr 	TokenNameCOMMENT_LINE	getAttrValueNS(Element, String):Attr 
// return the prefix 	TokenNameCOMMENT_LINE	return the prefix 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return the namespace URI 	TokenNameCOMMENT_LINE	return the namespace URI 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return annotation 	TokenNameCOMMENT_LINE	return annotation 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAnnotation	TokenNameIdentifier	 get Annotation
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getAnnotation	TokenNameIdentifier	 get Annotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return synthetic annotation 	TokenNameCOMMENT_LINE	return synthetic annotation 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getSyntheticAnnotation	TokenNameIdentifier	 get Synthetic Annotation
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getSyntheticAnnotation	TokenNameIdentifier	 get Synthetic Annotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a DOMException. On J2SE 1.4 and above the cause for the exception will be set. */	TokenNameCOMMENT_JAVADOC	 Creates a DOMException. On J2SE 1.4 and above the cause for the exception will be set. 
public	TokenNamepublic	
static	TokenNamestatic	
DOMException	TokenNameIdentifier	 DOM Exception
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
short	TokenNameshort	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMException	TokenNameIdentifier	 DOM Exception
de	TokenNameIdentifier	 de
=	TokenNameEQUAL	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
cause	TokenNameIdentifier	 cause
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ThrowableMethods	TokenNameIdentifier	 Throwable Methods
.	TokenNameDOT	
fgThrowableMethodsAvailable	TokenNameIdentifier	 fg Throwable Methods Available
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ThrowableMethods	TokenNameIdentifier	 Throwable Methods
.	TokenNameDOT	
fgThrowableInitCauseMethod	TokenNameIdentifier	 fg Throwable Init Cause Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cause	TokenNameIdentifier	 cause
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Something went wrong. There's not much we can do about it. 	TokenNameCOMMENT_LINE	Something went wrong. There's not much we can do about it. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
de	TokenNameIdentifier	 de
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an LSException. On J2SE 1.4 and above the cause for the exception will be set. */	TokenNameCOMMENT_JAVADOC	 Creates an LSException. On J2SE 1.4 and above the cause for the exception will be set. 
public	TokenNamepublic	
static	TokenNamestatic	
LSException	TokenNameIdentifier	 LS Exception
createLSException	TokenNameIdentifier	 create LS Exception
(	TokenNameLPAREN	
short	TokenNameshort	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LSException	TokenNameIdentifier	 LS Exception
lse	TokenNameIdentifier	 lse
=	TokenNameEQUAL	
new	TokenNamenew	
LSException	TokenNameIdentifier	 LS Exception
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
cause	TokenNameIdentifier	 cause
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ThrowableMethods	TokenNameIdentifier	 Throwable Methods
.	TokenNameDOT	
fgThrowableMethodsAvailable	TokenNameIdentifier	 fg Throwable Methods Available
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ThrowableMethods	TokenNameIdentifier	 Throwable Methods
.	TokenNameDOT	
fgThrowableInitCauseMethod	TokenNameIdentifier	 fg Throwable Init Cause Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
lse	TokenNameIdentifier	 lse
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cause	TokenNameIdentifier	 cause
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Something went wrong. There's not much we can do about it. 	TokenNameCOMMENT_LINE	Something went wrong. There's not much we can do about it. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
lse	TokenNameIdentifier	 lse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Holder of methods from java.lang.Throwable. */	TokenNameCOMMENT_JAVADOC	 Holder of methods from java.lang.Throwable. 
static	TokenNamestatic	
class	TokenNameclass	
ThrowableMethods	TokenNameIdentifier	 Throwable Methods
{	TokenNameLBRACE	
// Method: java.lang.Throwable.initCause(java.lang.Throwable) 	TokenNameCOMMENT_LINE	Method: java.lang.Throwable.initCause(java.lang.Throwable) 
private	TokenNameprivate	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
fgThrowableInitCauseMethod	TokenNameIdentifier	 fg Throwable Init Cause Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Flag indicating whether or not Throwable methods available. 	TokenNameCOMMENT_LINE	Flag indicating whether or not Throwable methods available. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
fgThrowableMethodsAvailable	TokenNameIdentifier	 fg Throwable Methods Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ThrowableMethods	TokenNameIdentifier	 Throwable Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Attempt to get methods for java.lang.Throwable on class initialization. 	TokenNameCOMMENT_LINE	Attempt to get methods for java.lang.Throwable on class initialization. 
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fgThrowableInitCauseMethod	TokenNameIdentifier	 fg Throwable Init Cause Method
=	TokenNameEQUAL	
Throwable	TokenNameIdentifier	 Throwable
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"initCause"	TokenNameStringLiteral	initCause
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgThrowableMethodsAvailable	TokenNameIdentifier	 fg Throwable Methods Available
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ClassNotFoundException, NoSuchMethodException or SecurityException 	TokenNameCOMMENT_LINE	ClassNotFoundException, NoSuchMethodException or SecurityException 
// Whatever the case, we cannot use java.lang.Throwable.initCause(java.lang.Throwable). 	TokenNameCOMMENT_LINE	Whatever the case, we cannot use java.lang.Throwable.initCause(java.lang.Throwable). 
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fgThrowableInitCauseMethod	TokenNameIdentifier	 fg Throwable Init Cause Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fgThrowableMethodsAvailable	TokenNameIdentifier	 fg Throwable Methods Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DOMUtil 	TokenNameCOMMENT_LINE	class DOMUtil 
