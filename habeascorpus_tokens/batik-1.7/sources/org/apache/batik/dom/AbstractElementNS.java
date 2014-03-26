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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLSupport	TokenNameIdentifier	 XML Support
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
/** * This class implements the {@link org.w3c.dom.Element} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractElementNS.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.Element} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractElementNS.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
extends	TokenNameextends	
AbstractElement	TokenNameIdentifier	 Abstract Element
{	TokenNameLBRACE	
/** * The namespace URI */	TokenNameCOMMENT_JAVADOC	 The namespace URI 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * Creates a new AbstractElementNS object. */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractElementNS object. 
protected	TokenNameprotected	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new AbstractElementNS object. * @param nsURI The element namespace URI. * @param qname The element qualified name for validation purposes. * @param owner The owner document. * @exception DOMException * INVALID_CHARACTER_ERR: Raised if the specified qualified name * contains an illegal character. * <br> NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is * malformed, if the <code>qualifiedName</code> has a prefix and the * <code>namespaceURI</code> is <code>null</code> or an empty string, * or if the <code>qualifiedName</code> has a prefix that is "xml" and * the <code>namespaceURI</code> is different from * "http://www.w3.org/XML/1998/namespace" . */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractElementNS object. @param nsURI The element namespace URI. @param qname The element qualified name for validation purposes. @param owner The owner document. @exception DOMException INVALID_CHARACTER_ERR: Raised if the specified qualified name contains an illegal character. <br> NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is malformed, if the <code>qualifiedName</code> has a prefix and the <code>namespaceURI</code> is <code>null</code> or an empty string, or if the <code>qualifiedName</code> has a prefix that is "xml" and the <code>namespaceURI</code> is different from "http://www.w3.org/XML/1998/namespace" . 
protected	TokenNameprotected	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nsURI	TokenNameIdentifier	 ns URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nsURI	TokenNameIdentifier	 ns URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nsURI	TokenNameIdentifier	 ns URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
nsURI	TokenNameIdentifier	 ns URI
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nsURI	TokenNameIdentifier	 ns URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
XMLSupport	TokenNameIdentifier	 XML Support
.	TokenNameDOT	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nsURI	TokenNameIdentifier	 ns URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NAMESPACE_ERR	TokenNameIdentifier	 NAMESPACE  ERR
,	TokenNameCOMMA	
"namespace.uri"	TokenNameStringLiteral	namespace.uri
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nsURI	TokenNameIdentifier	 ns URI
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNamespaceURI()}. * @return {@link #namespaceURI}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNamespaceURI()}. @return {@link #namespaceURI}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
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
super	TokenNamesuper	
.	TokenNameDOT	
export	TokenNameIdentifier	 export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ae	TokenNameIdentifier	 ae
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
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
super	TokenNamesuper	
.	TokenNameDOT	
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ae	TokenNameIdentifier	 ae
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
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
super	TokenNamesuper	
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ae	TokenNameIdentifier	 ae
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
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
super	TokenNamesuper	
.	TokenNameDOT	
deepCopyInto	TokenNameIdentifier	 deep Copy Into
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractElementNS	TokenNameIdentifier	 Abstract Element NS
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ae	TokenNameIdentifier	 ae
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
