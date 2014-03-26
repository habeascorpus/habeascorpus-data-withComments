/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOM2DTMdefaultNamespaceDeclarationNode.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOM2DTMdefaultNamespaceDeclarationNode.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
dom2dtm	TokenNameIdentifier	 dom2dtm
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMException	TokenNameIdentifier	 DTM Exception
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
TypeInfo	TokenNameIdentifier	 Type Info
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** This is a kluge to let us shove a declaration for xml: into the * DOM2DTM model. Basically, it creates a proxy node in DOM space to * carry the additional information. This is _NOT_ a full DOM * implementation, and shouldn't be one since it sits alongside the * DOM rather than becoming part of the DOM model. * * (This used to be an internal class within DOM2DTM. Moved out because * I need to perform an instanceof operation on it to support a temporary * workaround in DTMManagerDefault.) * * %REVIEW% What if the DOM2DTM was built around a DocumentFragment and * there isn't a single root element? I think this fails that case... * * %REVIEW% An alternative solution would be to create the node _only_ * in DTM space, but given how DOM2DTM is currently written I think * this is simplest. * */	TokenNameCOMMENT_JAVADOC	 This is a kluge to let us shove a declaration for xml: into the DOM2DTM model. Basically, it creates a proxy node in DOM space to carry the additional information. This is _NOT_ a full DOM implementation, and shouldn't be one since it sits alongside the DOM rather than becoming part of the DOM model. * (This used to be an internal class within DOM2DTM. Moved out because I need to perform an instanceof operation on it to support a temporary workaround in DTMManagerDefault.) * %REVIEW% What if the DOM2DTM was built around a DocumentFragment and there isn't a single root element? I think this fails that case... * %REVIEW% An alternative solution would be to create the node _only_ in DTM space, but given how DOM2DTM is currently written I think this is simplest. 
public	TokenNamepublic	
class	TokenNameclass	
DOM2DTMdefaultNamespaceDeclarationNode	TokenNameIdentifier	 DO M2 DT Mdefault Namespace Declaration Node
implements	TokenNameimplements	
Attr	TokenNameIdentifier	 Attr
,	TokenNameCOMMA	
TypeInfo	TokenNameIdentifier	 Type Info
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
=	TokenNameEQUAL	
"Unsupported operation on pseudonode"	TokenNameStringLiteral	Unsupported operation on pseudonode
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
pseudoparent	TokenNameIdentifier	 pseudoparent
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
nodename	TokenNameIdentifier	 nodename
;	TokenNameSEMICOLON	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
;	TokenNameSEMICOLON	
DOM2DTMdefaultNamespaceDeclarationNode	TokenNameIdentifier	 DO M2 DT Mdefault Namespace Declaration Node
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
pseudoparent	TokenNameIdentifier	 pseudoparent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pseudoparent	TokenNameIdentifier	 pseudoparent
=	TokenNameEQUAL	
pseudoparent	TokenNameIdentifier	 pseudoparent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
handle	TokenNameIdentifier	 handle
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nodename	TokenNameIdentifier	 nodename
=	TokenNameEQUAL	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodename	TokenNameIdentifier	 nodename
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodename	TokenNameIdentifier	 nodename
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pseudoparent	TokenNameIdentifier	 pseudoparent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getSpecified	TokenNameIdentifier	 get Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pseudoparent	TokenNameIdentifier	 pseudoparent
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Non-DOM method, part of the temporary kluge * %REVIEW% This would be a pruning problem, but since it will always be * added to the root element and we prune on elements, we shouldn't have * to worry. */	TokenNameCOMMENT_JAVADOC	 Non-DOM method, part of the temporary kluge %REVIEW% This would be a pruning problem, but since it will always be added to the root element and we prune on elements, we shouldn't have to worry. 
public	TokenNamepublic	
int	TokenNameint	
getHandleOfNode	TokenNameIdentifier	 get Handle Of Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
handle	TokenNameIdentifier	 handle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//RAMESH: PENDING=> Add proper implementation for the below DOM L3 additions 	TokenNameCOMMENT_LINE	RAMESH: PENDING=> Add proper implementation for the below DOM L3 additions 
/** * @see org.w3c.dom.TypeInfo#getTypeName() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.TypeInfo#getTypeName() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.TypeInfo#getTypeNamespace() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.TypeInfo#getTypeNamespace() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeNamespace	TokenNameIdentifier	 get Type Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see or.gw3c.dom.TypeInfo#isDerivedFrom(String,String,int) */	TokenNameCOMMENT_JAVADOC	 @see or.gw3c.dom.TypeInfo#isDerivedFrom(String,String,int) 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDerivedFrom	TokenNameIdentifier	 is Derived From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
int	TokenNameint	
derivationMethod	TokenNameIdentifier	 derivation Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TypeInfo	TokenNameIdentifier	 Type Info
getSchemaTypeInfo	TokenNameIdentifier	 get Schema Type Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isId	TokenNameIdentifier	 is Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Associate an object to a key on this node. The object can later be * retrieved from this node by calling <code>getUserData</code> with the * same key. * @param key The key to associate the object to. * @param data The object to associate to the given key, or * <code>null</code> to remove any existing association to that key. * @param handler The handler to associate to that key, or * <code>null</code>. * @return Returns the <code>DOMObject</code> previously associated to * the given key on this node, or <code>null</code> if there was none. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Associate an object to a key on this node. The object can later be retrieved from this node by calling <code>getUserData</code> with the same key. @param key The key to associate the object to. @param data The object to associate to the given key, or <code>null</code> to remove any existing association to that key. @param handler The handler to associate to that key, or <code>null</code>. @return Returns the <code>DOMObject</code> previously associated to the given key on this node, or <code>null</code> if there was none. @since DOM Level 3 
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
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserData	TokenNameIdentifier	 set User Data
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the object associated to a key on a this node. The object * must first have been set to this node by calling * <code>setUserData</code> with the same key. * @param key The key the object is associated to. * @return Returns the <code>DOMObject</code> associated to the given key * on this node, or <code>null</code> if there was none. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Retrieves the object associated to a key on a this node. The object must first have been set to this node by calling <code>setUserData</code> with the same key. @param key The key the object is associated to. @return Returns the <code>DOMObject</code> associated to the given key on this node, or <code>null</code> if there was none. @since DOM Level 3 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method returns a specialized object which implements the * specialized APIs of the specified feature and version. The * specialized object may also be obtained by using binding-specific * casting methods but is not necessarily expected to, as discussed in Mixed DOM implementations. * @param feature The name of the feature requested (case-insensitive). * @param version This is the version number of the feature to test. If * the version is <code>null</code> or the empty string, supporting * any version of the feature will cause the method to return an * object that supports at least one version of the feature. * @return Returns an object which implements the specialized APIs of * the specified feature and version, if any, or <code>null</code> if * there is no object which implements interfaces associated with that * feature. If the <code>DOMObject</code> returned by this method * implements the <code>Node</code> interface, it must delegate to the * primary core <code>Node</code> and not return results inconsistent * with the primary core <code>Node</code> such as attributes, * childNodes, etc. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 This method returns a specialized object which implements the specialized APIs of the specified feature and version. The specialized object may also be obtained by using binding-specific casting methods but is not necessarily expected to, as discussed in Mixed DOM implementations. @param feature The name of the feature requested (case-insensitive). @param version This is the version number of the feature to test. If the version is <code>null</code> or the empty string, supporting any version of the feature will cause the method to return an object that supports at least one version of the feature. @return Returns an object which implements the specialized APIs of the specified feature and version, if any, or <code>null</code> if there is no object which implements interfaces associated with that feature. If the <code>DOMObject</code> returned by this method implements the <code>Node</code> interface, it must delegate to the primary core <code>Node</code> and not return results inconsistent with the primary core <code>Node</code> such as attributes, childNodes, etc. @since DOM Level 3 
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
// we don't have any alternate node, either this node does the job 	TokenNameCOMMENT_LINE	we don't have any alternate node, either this node does the job 
// or we don't have anything that does 	TokenNameCOMMENT_LINE	or we don't have anything that does 
return	TokenNamereturn	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether two nodes are equal. * <br>This method tests for equality of nodes, not sameness (i.e., * whether the two nodes are references to the same object) which can be * tested with <code>Node.isSameNode</code>. All nodes that are the same * will also be equal, though the reverse may not be true. * <br>Two nodes are equal if and only if the following conditions are * satisfied: The two nodes are of the same type.The following string * attributes are equal: <code>nodeName</code>, <code>localName</code>, * <code>namespaceURI</code>, <code>prefix</code>, <code>nodeValue</code> * , <code>baseURI</code>. This is: they are both <code>null</code>, or * they have the same length and are character for character identical. * The <code>attributes</code> <code>NamedNodeMaps</code> are equal. * This is: they are both <code>null</code>, or they have the same * length and for each node that exists in one map there is a node that * exists in the other map and is equal, although not necessarily at the * same index.The <code>childNodes</code> <code>NodeLists</code> are * equal. This is: they are both <code>null</code>, or they have the * same length and contain equal nodes at the same index. This is true * for <code>Attr</code> nodes as for any other type of node. Note that * normalization can affect equality; to avoid this, nodes should be * normalized before being compared. * <br>For two <code>DocumentType</code> nodes to be equal, the following * conditions must also be satisfied: The following string attributes * are equal: <code>publicId</code>, <code>systemId</code>, * <code>internalSubset</code>.The <code>entities</code> * <code>NamedNodeMaps</code> are equal.The <code>notations</code> * <code>NamedNodeMaps</code> are equal. * <br>On the other hand, the following do not affect equality: the * <code>ownerDocument</code> attribute, the <code>specified</code> * attribute for <code>Attr</code> nodes, the * <code>isWhitespaceInElementContent</code> attribute for * <code>Text</code> nodes, as well as any user data or event listeners * registered on the nodes. * @param arg The node to compare equality with. * @param deep If <code>true</code>, recursively compare the subtrees; if * <code>false</code>, compare only the nodes themselves (and its * attributes, if it is an <code>Element</code>). * @return If the nodes, and possibly subtrees are equal, * <code>true</code> otherwise <code>false</code>. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Tests whether two nodes are equal. <br>This method tests for equality of nodes, not sameness (i.e., whether the two nodes are references to the same object) which can be tested with <code>Node.isSameNode</code>. All nodes that are the same will also be equal, though the reverse may not be true. <br>Two nodes are equal if and only if the following conditions are satisfied: The two nodes are of the same type.The following string attributes are equal: <code>nodeName</code>, <code>localName</code>, <code>namespaceURI</code>, <code>prefix</code>, <code>nodeValue</code> , <code>baseURI</code>. This is: they are both <code>null</code>, or they have the same length and are character for character identical. The <code>attributes</code> <code>NamedNodeMaps</code> are equal. This is: they are both <code>null</code>, or they have the same length and for each node that exists in one map there is a node that exists in the other map and is equal, although not necessarily at the same index.The <code>childNodes</code> <code>NodeLists</code> are equal. This is: they are both <code>null</code>, or they have the same length and contain equal nodes at the same index. This is true for <code>Attr</code> nodes as for any other type of node. Note that normalization can affect equality; to avoid this, nodes should be normalized before being compared. <br>For two <code>DocumentType</code> nodes to be equal, the following conditions must also be satisfied: The following string attributes are equal: <code>publicId</code>, <code>systemId</code>, <code>internalSubset</code>.The <code>entities</code> <code>NamedNodeMaps</code> are equal.The <code>notations</code> <code>NamedNodeMaps</code> are equal. <br>On the other hand, the following do not affect equality: the <code>ownerDocument</code> attribute, the <code>specified</code> attribute for <code>Attr</code> nodes, the <code>isWhitespaceInElementContent</code> attribute for <code>Text</code> nodes, as well as any user data or event listeners registered on the nodes. @param arg The node to compare equality with. @param deep If <code>true</code>, recursively compare the subtrees; if <code>false</code>, compare only the nodes themselves (and its attributes, if it is an <code>Element</code>). @return If the nodes, and possibly subtrees are equal, <code>true</code> otherwise <code>false</code>. @since DOM Level 3 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// in theory nodeName can't be null but better be careful 	TokenNameCOMMENT_LINE	in theory nodeName can't be null but better be careful 
// who knows what other implementations may be doing?... 	TokenNameCOMMENT_LINE	who knows what other implementations may be doing?... 
if	TokenNameif	
(	TokenNameLPAREN	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* if (getBaseURI() == null) { if (((NodeImpl) arg).getBaseURI() != null) { return false; } } else if (!getBaseURI().equals(((NodeImpl) arg).getBaseURI())) { return false; } */	TokenNameCOMMENT_BLOCK	 if (getBaseURI() == null) { if (((NodeImpl) arg).getBaseURI() != null) { return false; } } else if (!getBaseURI().equals(((NodeImpl) arg).getBaseURI())) { return false; } 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Level 3 - Experimental: * Look up the namespace URI associated to the given prefix, starting from this node. * Use lookupNamespaceURI(null) to lookup the default namespace * * @param namespaceURI * @return th URI for the namespace * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 - Experimental: Look up the namespace URI associated to the given prefix, starting from this node. Use lookupNamespaceURI(null) to lookup the default namespace * @param namespaceURI @return th URI for the namespace @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
this	TokenNamethis	
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
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: is it possible that prefix is empty string? 	TokenNameCOMMENT_LINE	REVISIT: is it possible that prefix is empty string? 
if	TokenNameif	
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// looking for default namespace 	TokenNameCOMMENT_LINE	looking for default namespace 
return	TokenNamereturn	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// non default namespace 	TokenNameCOMMENT_LINE	non default namespace 
return	TokenNamereturn	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrPrefix	TokenNameIdentifier	 attr Prefix
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// at this point we are dealing with DOM Level 2 nodes only 	TokenNameCOMMENT_LINE	at this point we are dealing with DOM Level 2 nodes only 
if	TokenNameif	
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default namespace 	TokenNameCOMMENT_LINE	default namespace 
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
attrPrefix	TokenNameIdentifier	 attr Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attrPrefix	TokenNameIdentifier	 attr Prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// non default namespace 	TokenNameCOMMENT_LINE	non default namespace 
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.lookupNamespaceURI(specifiedPrefix); } */	TokenNameCOMMENT_BLOCK	 NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.lookupNamespaceURI(specifiedPrefix); } 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* case Node.DOCUMENT_NODE : { return((NodeImpl)((Document)this).getDocumentElement()).lookupNamespaceURI(specifiedPrefix) ; } */	TokenNameCOMMENT_BLOCK	 case Node.DOCUMENT_NODE : { return((NodeImpl)((Document)this).getDocumentElement()).lookupNamespaceURI(specifiedPrefix) ; } 
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
// type is unknown 	TokenNameCOMMENT_LINE	type is unknown 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
specifiedPrefix	TokenNameIdentifier	 specified Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
/* NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.lookupNamespaceURI(specifiedPrefix); } */	TokenNameCOMMENT_BLOCK	 NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.lookupNamespaceURI(specifiedPrefix); } 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * DOM Level 3: Experimental * This method checks if the specified <code>namespaceURI</code> is the * default namespace or not. * @param namespaceURI The namespace URI to look for. * @return <code>true</code> if the specified <code>namespaceURI</code> * is the default namespace, <code>false</code> otherwise. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 DOM Level 3: Experimental This method checks if the specified <code>namespaceURI</code> is the default namespace or not. @param namespaceURI The namespace URI to look for. @return <code>true</code> if the specified <code>namespaceURI</code> is the default namespace, <code>false</code> otherwise. @since DOM Level 3 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDefaultNamespace	TokenNameIdentifier	 is Default Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* // REVISIT: remove casts when DOM L3 becomes REC. short type = this.getNodeType(); switch (type) { case Node.ELEMENT_NODE: { String namespace = this.getNamespaceURI(); String prefix = this.getPrefix(); // REVISIT: is it possible that prefix is empty string? if (prefix == null || prefix.length() == 0) { if (namespaceURI == null) { return (namespace == namespaceURI); } return namespaceURI.equals(namespace); } if (this.hasAttributes()) { ElementImpl elem = (ElementImpl)this; NodeImpl attr = (NodeImpl)elem.getAttributeNodeNS("http://www.w3.org/2000/xmlns/", "xmlns"); if (attr != null) { String value = attr.getNodeValue(); if (namespaceURI == null) { return (namespace == value); } return namespaceURI.equals(value); } } NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.isDefaultNamespace(namespaceURI); } return false; } case Node.DOCUMENT_NODE:{ return((NodeImpl)((Document)this).getDocumentElement()).isDefaultNamespace(namespaceURI); } case Node.ENTITY_NODE : case Node.NOTATION_NODE: case Node.DOCUMENT_FRAGMENT_NODE: case Node.DOCUMENT_TYPE_NODE: // type is unknown return false; case Node.ATTRIBUTE_NODE:{ if (this.ownerNode.getNodeType() == Node.ELEMENT_NODE) { return ownerNode.isDefaultNamespace(namespaceURI); } return false; } default:{ NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.isDefaultNamespace(namespaceURI); } return false; } } */	TokenNameCOMMENT_BLOCK	 // REVISIT: remove casts when DOM L3 becomes REC. short type = this.getNodeType(); switch (type) { case Node.ELEMENT_NODE: { String namespace = this.getNamespaceURI(); String prefix = this.getPrefix(); // REVISIT: is it possible that prefix is empty string? if (prefix == null || prefix.length() == 0) { if (namespaceURI == null) { return (namespace == namespaceURI); } return namespaceURI.equals(namespace); } if (this.hasAttributes()) { ElementImpl elem = (ElementImpl)this; NodeImpl attr = (NodeImpl)elem.getAttributeNodeNS("http://www.w3.org/2000/xmlns/", "xmlns"); if (attr != null) { String value = attr.getNodeValue(); if (namespaceURI == null) { return (namespace == value); } return namespaceURI.equals(value); } } NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.isDefaultNamespace(namespaceURI); } return false; } case Node.DOCUMENT_NODE:{ return((NodeImpl)((Document)this).getDocumentElement()).isDefaultNamespace(namespaceURI); } case Node.ENTITY_NODE : case Node.NOTATION_NODE: case Node.DOCUMENT_FRAGMENT_NODE: case Node.DOCUMENT_TYPE_NODE: // type is unknown return false; case Node.ATTRIBUTE_NODE:{ if (this.ownerNode.getNodeType() == Node.ELEMENT_NODE) { return ownerNode.isDefaultNamespace(namespaceURI); } return false; } default:{ NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.isDefaultNamespace(namespaceURI); } return false; } } 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * DOM Level 3 - Experimental: * Look up the prefix associated to the given namespace URI, starting from this node. * * @param namespaceURI * @return the prefix for the namespace */	TokenNameCOMMENT_JAVADOC	 * DOM Level 3 - Experimental: Look up the prefix associated to the given namespace URI, starting from this node. * @param namespaceURI @return the prefix for the namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: When Namespaces 1.1 comes out this may not be true 	TokenNameCOMMENT_LINE	REVISIT: When Namespaces 1.1 comes out this may not be true 
// Prefix can't be bound to null namespace 	TokenNameCOMMENT_LINE	Prefix can't be bound to null namespace 
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
this	TokenNamethis	
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
/* case Node.ELEMENT_NODE: { String namespace = this.getNamespaceURI(); // to flip out children return lookupNamespacePrefix(namespaceURI, (ElementImpl)this); } case Node.DOCUMENT_NODE:{ return((NodeImpl)((Document)this).getDocumentElement()).lookupPrefix(namespaceURI); } */	TokenNameCOMMENT_BLOCK	 case Node.ELEMENT_NODE: { String namespace = this.getNamespaceURI(); // to flip out children return lookupNamespacePrefix(namespaceURI, (ElementImpl)this); } case Node.DOCUMENT_NODE:{ return((NodeImpl)((Document)this).getDocumentElement()).lookupPrefix(namespaceURI); } 
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
// type is unknown 	TokenNameCOMMENT_LINE	type is unknown 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
/* NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.lookupPrefix(namespaceURI); } */	TokenNameCOMMENT_BLOCK	 NodeImpl ancestor = (NodeImpl)getElementAncestor(this); if (ancestor != null) { return ancestor.lookupPrefix(namespaceURI); } 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns whether this node is the same node as the given one. * <br>This method provides a way to determine whether two * <code>Node</code> references returned by the implementation reference * the same object. When two <code>Node</code> references are references * to the same object, even if through a proxy, the references may be * used completely interchangably, such that all attributes have the * same values and calling the same DOM method on either reference * always has exactly the same effect. * @param other The node to test against. * @return Returns <code>true</code> if the nodes are the same, * <code>false</code> otherwise. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Returns whether this node is the same node as the given one. <br>This method provides a way to determine whether two <code>Node</code> references returned by the implementation reference the same object. When two <code>Node</code> references are references to the same object, even if through a proxy, the references may be used completely interchangably, such that all attributes have the same values and calling the same DOM method on either reference always has exactly the same effect. @param other The node to test against. @return Returns <code>true</code> if the nodes are the same, <code>false</code> otherwise. @since DOM Level 3 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we do not use any wrapper so the answer is obvious 	TokenNameCOMMENT_LINE	we do not use any wrapper so the answer is obvious 
return	TokenNamereturn	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This attribute returns the text content of this node and its * descendants. When it is defined to be null, setting it has no effect. * When set, any possible children this node may have are removed and * replaced by a single <code>Text</code> node containing the string * this attribute is set to. On getting, no serialization is performed, * the returned string does not contain any markup. No whitespace * normalization is performed, the returned string does not contain the * element content whitespaces . Similarly, on setting, no parsing is * performed either, the input string is taken as pure textual content. * <br>The string returned is made of the text content of this node * depending on its type, as defined below: * <table border='1'> * <tr> * <th>Node type</th> * <th>Content</th> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'> * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE, * DOCUMENT_FRAGMENT_NODE</td> * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code> * attribute value of every child node, excluding COMMENT_NODE and * PROCESSING_INSTRUCTION_NODE nodes</td> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE, * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td> * <td valign='top' rowspan='1' colspan='1'> * <code>nodeValue</code></td> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td> * <td valign='top' rowspan='1' colspan='1'> * null</td> * </tr> * </table> * @exception DOMException * NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. * @exception DOMException * DOMSTRING_SIZE_ERR: Raised when it would return more characters than * fit in a <code>DOMString</code> variable on the implementation * platform. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. When set, any possible children this node may have are removed and replaced by a single <code>Text</code> node containing the string this attribute is set to. On getting, no serialization is performed, the returned string does not contain any markup. No whitespace normalization is performed, the returned string does not contain the element content whitespaces . Similarly, on setting, no parsing is performed either, the input string is taken as pure textual content. <br>The string returned is made of the text content of this node depending on its type, as defined below: <table border='1'> <tr> <th>Node type</th> <th>Content</th> </tr> <tr> <td valign='top' rowspan='1' colspan='1'> ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE, DOCUMENT_FRAGMENT_NODE</td> <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code> attribute value of every child node, excluding COMMENT_NODE and PROCESSING_INSTRUCTION_NODE nodes</td> </tr> <tr> <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE, CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td> <td valign='top' rowspan='1' colspan='1'> <code>nodeValue</code></td> </tr> <tr> <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td> <td valign='top' rowspan='1' colspan='1'> null</td> </tr> </table> @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. @exception DOMException DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a <code>DOMString</code> variable on the implementation platform. @since DOM Level 3 
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
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
textContent	TokenNameIdentifier	 text Content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This attribute returns the text content of this node and its * descendants. When it is defined to be null, setting it has no effect. * When set, any possible children this node may have are removed and * replaced by a single <code>Text</code> node containing the string * this attribute is set to. On getting, no serialization is performed, * the returned string does not contain any markup. No whitespace * normalization is performed, the returned string does not contain the * element content whitespaces . Similarly, on setting, no parsing is * performed either, the input string is taken as pure textual content. * <br>The string returned is made of the text content of this node * depending on its type, as defined below: * <table border='1'> * <tr> * <th>Node type</th> * <th>Content</th> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'> * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE, * DOCUMENT_FRAGMENT_NODE</td> * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code> * attribute value of every child node, excluding COMMENT_NODE and * PROCESSING_INSTRUCTION_NODE nodes</td> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE, * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td> * <td valign='top' rowspan='1' colspan='1'> * <code>nodeValue</code></td> * </tr> * <tr> * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td> * <td valign='top' rowspan='1' colspan='1'> * null</td> * </tr> * </table> * @exception DOMException * NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. * @exception DOMException * DOMSTRING_SIZE_ERR: Raised when it would return more characters than * fit in a <code>DOMString</code> variable on the implementation * platform. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. When set, any possible children this node may have are removed and replaced by a single <code>Text</code> node containing the string this attribute is set to. On getting, no serialization is performed, the returned string does not contain any markup. No whitespace normalization is performed, the returned string does not contain the element content whitespaces . Similarly, on setting, no parsing is performed either, the input string is taken as pure textual content. <br>The string returned is made of the text content of this node depending on its type, as defined below: <table border='1'> <tr> <th>Node type</th> <th>Content</th> </tr> <tr> <td valign='top' rowspan='1' colspan='1'> ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE, DOCUMENT_FRAGMENT_NODE</td> <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code> attribute value of every child node, excluding COMMENT_NODE and PROCESSING_INSTRUCTION_NODE nodes</td> </tr> <tr> <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE, CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td> <td valign='top' rowspan='1' colspan='1'> <code>nodeValue</code></td> </tr> <tr> <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td> <td valign='top' rowspan='1' colspan='1'> null</td> </tr> </table> @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. @exception DOMException DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a <code>DOMString</code> variable on the implementation platform. @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// overriden in some subclasses 	TokenNameCOMMENT_LINE	overriden in some subclasses 
}	TokenNameRBRACE	
/** * Compares a node with this node with regard to their position in the * document. * @param other The node to compare against this node. * @return Returns how the given node is positioned relatively to this * node. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Compares a node with this node with regard to their position in the document. @param other The node to compare against this node. @return Returns how the given node is positioned relatively to this node. @since DOM Level 3 
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
/** * The absolute base URI of this node or <code>null</code> if undefined. * This value is computed according to . However, when the * <code>Document</code> supports the feature "HTML" , the base URI is * computed using first the value of the href attribute of the HTML BASE * element if any, and the value of the <code>documentURI</code> * attribute from the <code>Document</code> interface otherwise. * <br> When the node is an <code>Element</code>, a <code>Document</code> * or a a <code>ProcessingInstruction</code>, this attribute represents * the properties [base URI] defined in . When the node is a * <code>Notation</code>, an <code>Entity</code>, or an * <code>EntityReference</code>, this attribute represents the * properties [declaration base URI] in the . How will this be affected * by resolution of relative namespace URIs issue?It's not.Should this * only be on Document, Element, ProcessingInstruction, Entity, and * Notation nodes, according to the infoset? If not, what is it equal to * on other nodes? Null? An empty string? I think it should be the * parent's.No.Should this be read-only and computed or and actual * read-write attribute?Read-only and computed (F2F 19 Jun 2000 and * teleconference 30 May 2001).If the base HTML element is not yet * attached to a document, does the insert change the Document.baseURI? * Yes. (F2F 26 Sep 2001) * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The absolute base URI of this node or <code>null</code> if undefined. This value is computed according to . However, when the <code>Document</code> supports the feature "HTML" , the base URI is computed using first the value of the href attribute of the HTML BASE element if any, and the value of the <code>documentURI</code> attribute from the <code>Document</code> interface otherwise. <br> When the node is an <code>Element</code>, a <code>Document</code> or a a <code>ProcessingInstruction</code>, this attribute represents the properties [base URI] defined in . When the node is a <code>Notation</code>, an <code>Entity</code>, or an <code>EntityReference</code>, this attribute represents the properties [declaration base URI] in the . How will this be affected by resolution of relative namespace URIs issue?It's not.Should this only be on Document, Element, ProcessingInstruction, Entity, and Notation nodes, according to the infoset? If not, what is it equal to on other nodes? Null? An empty string? I think it should be the parent's.No.Should this be read-only and computed or and actual read-write attribute?Read-only and computed (F2F 19 Jun 2000 and teleconference 30 May 2001).If the base HTML element is not yet attached to a document, does the insert change the Document.baseURI? Yes. (F2F 26 Sep 2001) @since DOM Level 3 
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
}	TokenNameRBRACE	
