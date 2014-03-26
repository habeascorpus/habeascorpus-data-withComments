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
/** * This class implements the {@link org.w3c.dom.Attr} interface with * support for namespaces. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GenericAttrNS.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.Attr} interface with support for namespaces. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GenericAttrNS.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GenericAttrNS	TokenNameIdentifier	 Generic Attr NS
extends	TokenNameextends	
AbstractAttrNS	TokenNameIdentifier	 Abstract Attr NS
{	TokenNameLBRACE	
/** * Is this attribute immutable? */	TokenNameCOMMENT_JAVADOC	 Is this attribute immutable? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
/** * Creates a new Attr object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Attr object. 
protected	TokenNameprotected	
GenericAttrNS	TokenNameIdentifier	 Generic Attr NS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new Attr object. * @param nsURI The element namespace URI. * @param qname The attribute qualified name for validation purposes. * @param owner The owner document. * @exception DOMException * INVALID_CHARACTER_ERR: Raised if the specified qualified name * contains an illegal character. * <br> NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is * malformed, if the <code>qualifiedName</code> has a prefix and the * <code>namespaceURI</code> is <code>null</code> or an empty string, * if the <code>qualifiedName</code> has a prefix that is "xml" and the * <code>namespaceURI</code> is different from * "http://www.w3.org/XML/1998/namespace", if the * <code>qualifiedName</code> has a prefix that is "xmlns" and the * <code>namespaceURI</code> is different from * "http://www.w3.org/2000/xmlns/", or if the <code>qualifiedName</code> * is "xmlns" and the <code>namespaceURI</code> is different from * "http://www.w3.org/2000/xmlns/". */	TokenNameCOMMENT_JAVADOC	 Creates a new Attr object. @param nsURI The element namespace URI. @param qname The attribute qualified name for validation purposes. @param owner The owner document. @exception DOMException INVALID_CHARACTER_ERR: Raised if the specified qualified name contains an illegal character. <br> NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is malformed, if the <code>qualifiedName</code> has a prefix and the <code>namespaceURI</code> is <code>null</code> or an empty string, if the <code>qualifiedName</code> has a prefix that is "xml" and the <code>namespaceURI</code> is different from "http://www.w3.org/XML/1998/namespace", if the <code>qualifiedName</code> has a prefix that is "xmlns" and the <code>namespaceURI</code> is different from "http://www.w3.org/2000/xmlns/", or if the <code>qualifiedName</code> is "xmlns" and the <code>namespaceURI</code> is different from "http://www.w3.org/2000/xmlns/". 
public	TokenNamepublic	
GenericAttrNS	TokenNameIdentifier	 Generic Attr NS
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
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNodeName	TokenNameIdentifier	 set Node Name
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GenericAttrNS	TokenNameIdentifier	 Generic Attr NS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
