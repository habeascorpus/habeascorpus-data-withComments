/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id$ */	TokenNameCOMMENT_BLOCK	 $Id$ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
domapi	TokenNameIdentifier	 domapi
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
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathNamespace	TokenNameIdentifier	 X Path Namespace
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
UserDataHandler	TokenNameIdentifier	 User Data Handler
;	TokenNameSEMICOLON	
/** * * * The <code>XPathNamespace</code> interface is returned by * <code>XPathResult</code> interfaces to represent the XPath namespace node * type that DOM lacks. There is no public constructor for this node type. * Attempts to place it into a hierarchy or a NamedNodeMap result in a * <code>DOMException</code> with the code <code>HIERARCHY_REQUEST_ERR</code> * . This node is read only, so methods or setting of attributes that would * mutate the node result in a DOMException with the code * <code>NO_MODIFICATION_ALLOWED_ERR</code>. * <p>The core specification describes attributes of the <code>Node</code> * interface that are different for different node node types but does not * describe <code>XPATH_NAMESPACE_NODE</code>, so here is a description of * those attributes for this node type. All attributes of <code>Node</code> * not described in this section have a <code>null</code> or * <code>false</code> value. * <p><code>ownerDocument</code> matches the <code>ownerDocument</code> of the * <code>ownerElement</code> even if the element is later adopted. * <p><code>prefix</code> is the prefix of the namespace represented by the * node. * <p><code>nodeName</code> is the same as <code>prefix</code>. * <p><code>nodeType</code> is equal to <code>XPATH_NAMESPACE_NODE</code>. * <p><code>namespaceURI</code> is the namespace URI of the namespace * represented by the node. * <p><code>adoptNode</code>, <code>cloneNode</code>, and * <code>importNode</code> fail on this node type by raising a * <code>DOMException</code> with the code <code>NOT_SUPPORTED_ERR</code>.In * future versions of the XPath specification, the definition of a namespace * node may be changed incomatibly, in which case incompatible changes to * field values may be required to implement versions beyond XPath 1.0. * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>. * * This implementation wraps the DOM attribute node that contained the * namespace declaration. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 * The <code>XPathNamespace</code> interface is returned by <code>XPathResult</code> interfaces to represent the XPath namespace node type that DOM lacks. There is no public constructor for this node type. Attempts to place it into a hierarchy or a NamedNodeMap result in a <code>DOMException</code> with the code <code>HIERARCHY_REQUEST_ERR</code> . This node is read only, so methods or setting of attributes that would mutate the node result in a DOMException with the code <code>NO_MODIFICATION_ALLOWED_ERR</code>. <p>The core specification describes attributes of the <code>Node</code> interface that are different for different node node types but does not describe <code>XPATH_NAMESPACE_NODE</code>, so here is a description of those attributes for this node type. All attributes of <code>Node</code> not described in this section have a <code>null</code> or <code>false</code> value. <p><code>ownerDocument</code> matches the <code>ownerDocument</code> of the <code>ownerElement</code> even if the element is later adopted. <p><code>prefix</code> is the prefix of the namespace represented by the node. <p><code>nodeName</code> is the same as <code>prefix</code>. <p><code>nodeType</code> is equal to <code>XPATH_NAMESPACE_NODE</code>. <p><code>namespaceURI</code> is the namespace URI of the namespace represented by the node. <p><code>adoptNode</code>, <code>cloneNode</code>, and <code>importNode</code> fail on this node type by raising a <code>DOMException</code> with the code <code>NOT_SUPPORTED_ERR</code>.In future versions of the XPath specification, the definition of a namespace node may be changed incomatibly, in which case incompatible changes to field values may be required to implement versions beyond XPath 1.0. <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>. * This implementation wraps the DOM attribute node that contained the namespace declaration. @xsl.usage internal 
class	TokenNameclass	
XPathNamespaceImpl	TokenNameIdentifier	 X Path Namespace Impl
implements	TokenNameimplements	
XPathNamespace	TokenNameIdentifier	 X Path Namespace
{	TokenNameLBRACE	
// Node that XPathNamespaceImpl wraps 	TokenNameCOMMENT_LINE	Node that XPathNamespaceImpl wraps 
final	TokenNamefinal	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
m_attributeNode	TokenNameIdentifier	 m attribute Node
;	TokenNameSEMICOLON	
/** * Constructor for XPathNamespaceImpl. */	TokenNameCOMMENT_JAVADOC	 Constructor for XPathNamespaceImpl. 
XPathNamespaceImpl	TokenNameIdentifier	 X Path Namespace Impl
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attributeNode	TokenNameIdentifier	 m attribute Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xalan.dom3.xpath.XPathNamespace#getOwnerElement() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xalan.dom3.xpath.XPathNamespace#getOwnerElement() 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
m_attributeNode	TokenNameIdentifier	 m attribute Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getNodeName() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getNodeName() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#namespace"	TokenNameStringLiteral	#namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getNodeValue() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getNodeValue() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#setNodeValue(String) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#setNodeValue(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getNodeType() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getNodeType() 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XPathNamespace	TokenNameIdentifier	 X Path Namespace
.	TokenNameDOT	
XPATH_NAMESPACE_NODE	TokenNameIdentifier	 XPATH  NAMESPACE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getParentNode() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getParentNode() 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getChildNodes() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getChildNodes() 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getFirstChild() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getFirstChild() 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getLastChild() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getLastChild() 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getPreviousSibling() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getPreviousSibling() 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getNextSibling() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getNextSibling() 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getAttributes() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getAttributes() 
public	TokenNamepublic	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getOwnerDocument() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getOwnerDocument() 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#insertBefore(Node, Node) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#insertBefore(Node, Node) 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#replaceChild(Node, Node) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#replaceChild(Node, Node) 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#removeChild(Node) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#removeChild(Node) 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#appendChild(Node) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#appendChild(Node) 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#hasChildNodes() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#hasChildNodes() 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#cloneNode(boolean) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#cloneNode(boolean) 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#normalize() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#normalize() 
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#isSupported(String, String) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#isSupported(String, String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getNamespaceURI() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getNamespaceURI() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For namespace node, the namespaceURI is the namespace URI 	TokenNameCOMMENT_LINE	For namespace node, the namespaceURI is the namespace URI 
// of the namespace represented by the node. 	TokenNameCOMMENT_LINE	of the namespace represented by the node. 
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getPrefix() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getPrefix() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#setPrefix(String) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#setPrefix(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#getLocalName() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#getLocalName() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For namespace node, the local name is the same as the prefix 	TokenNameCOMMENT_LINE	For namespace node, the local name is the same as the prefix 
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.Node#hasAttributes() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.Node#hasAttributes() 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeNode	TokenNameIdentifier	 m attribute Node
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
compareDocumentPosition	TokenNameIdentifier	 compare Document Position
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
textContent	TokenNameIdentifier	 text Content
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
textContent	TokenNameIdentifier	 text Content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTextContent	TokenNameIdentifier	 set Text Content
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
textContent	TokenNameIdentifier	 text Content
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
textContent	TokenNameIdentifier	 text Content
=	TokenNameEQUAL	
textContent	TokenNameIdentifier	 text Content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
//PENDING 	TokenNameCOMMENT_LINE	PENDING 
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDefaultNamespace	TokenNameIdentifier	 is Default Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//PENDING 	TokenNameCOMMENT_LINE	PENDING 
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
setUserData	TokenNameIdentifier	 set User Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
UserDataHandler	TokenNameIdentifier	 User Data Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//PENDING 	TokenNameCOMMENT_LINE	PENDING 
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
