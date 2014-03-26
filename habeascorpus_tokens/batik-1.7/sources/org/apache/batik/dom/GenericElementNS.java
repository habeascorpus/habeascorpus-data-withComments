/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class implements the {@link org.w3c.dom.Element} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GenericElementNS.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.Element} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GenericElementNS.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
extends	TokenNameextends	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
{	TokenNameLBRACE	
/** * The node name. */	TokenNameCOMMENT_JAVADOC	 The node name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
/** * Is this element immutable? */	TokenNameCOMMENT_JAVADOC	 Is this element immutable? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
/** * Creates a new Element object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Element object. 
protected	TokenNameprotected	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new Element object. * @param nsURI The element namespace URI. * @param name The element qualified name. * @param owner The owner document. * @exception DOMException * INVALID_CHARACTER_ERR: Raised if the specified qualified name * contains an illegal character. * <br> NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is * malformed, if the <code>qualifiedName</code> has a prefix and the * <code>namespaceURI</code> is <code>null</code> or an empty string, * or if the <code>qualifiedName</code> has a prefix that is "xml" and * the <code>namespaceURI</code> is different from * "http://www.w3.org/XML/1998/namespace" . */	TokenNameCOMMENT_JAVADOC	 Creates a new Element object. @param nsURI The element namespace URI. @param name The element qualified name. @param owner The owner document. @exception DOMException INVALID_CHARACTER_ERR: Raised if the specified qualified name contains an illegal character. <br> NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is malformed, if the <code>qualifiedName</code> has a prefix and the <code>namespaceURI</code> is <code>null</code> or an empty string, or if the <code>qualifiedName</code> has a prefix that is "xml" and the <code>namespaceURI</code> is different from "http://www.w3.org/XML/1998/namespace" . 
public	TokenNamepublic	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name of this node. */	TokenNameCOMMENT_JAVADOC	 Sets the name of this node. 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeName	TokenNameIdentifier	 set Node Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeName()}. * @return {@link #nodeName} */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeName()}. @return {@link #nodeName} 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ExtendedNode /////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	ExtendedNode /////////////////////////////////////////////////// 
/** * Tests whether this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Tests whether this node is readonly. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets this node readonly attribute. */	TokenNameCOMMENT_JAVADOC	 Sets this node readonly attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setReadonly	TokenNameIdentifier	 set Readonly
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readonly	TokenNameIdentifier	 readonly
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Exports this node to the given document. */	TokenNameCOMMENT_JAVADOC	 Exports this node to the given document. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
export	TokenNameIdentifier	 export
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
export	TokenNameIdentifier	 export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ge	TokenNameIdentifier	 ge
.	TokenNameDOT	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deeply exports this node to the given document. */	TokenNameCOMMENT_JAVADOC	 Deeply exports this node to the given document. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ge	TokenNameIdentifier	 ge
.	TokenNameDOT	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy the fields of the current node into the given node. * @param n a node of the type of this. */	TokenNameCOMMENT_JAVADOC	 Copy the fields of the current node into the given node. @param n a node of the type of this. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ge	TokenNameIdentifier	 ge
.	TokenNameDOT	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deeply copy the fields of the current node into the given node. * @param n a node of the type of this. */	TokenNameCOMMENT_JAVADOC	 Deeply copy the fields of the current node into the given node. @param n a node of the type of this. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
deepCopyInto	TokenNameIdentifier	 deep Copy Into
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
deepCopyInto	TokenNameIdentifier	 deep Copy Into
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ge	TokenNameIdentifier	 ge
.	TokenNameDOT	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GenericElementNS	TokenNameIdentifier	 Generic Element NS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
