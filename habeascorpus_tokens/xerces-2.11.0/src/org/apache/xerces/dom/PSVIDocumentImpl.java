/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
NotSerializableException	TokenNameIdentifier	 Not Serializable Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
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
DOMConfiguration	TokenNameIdentifier	 DOM Configuration
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
DOMImplementation	TokenNameIdentifier	 DOM Implementation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DocumentType	TokenNameIdentifier	 Document Type
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
UserDataHandler	TokenNameIdentifier	 User Data Handler
;	TokenNameSEMICOLON	
/** * Our own document implementation, which knows how to create an element * with PSVI information. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: PSVIDocumentImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Our own document implementation, which knows how to create an element with PSVI information. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: PSVIDocumentImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
PSVIDocumentImpl	TokenNameIdentifier	 PSVI Document Impl
extends	TokenNameextends	
DocumentImpl	TokenNameIdentifier	 Document Impl
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8822220250676434522L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create a document. */	TokenNameCOMMENT_JAVADOC	 Create a document. 
public	TokenNamepublic	
PSVIDocumentImpl	TokenNameIdentifier	 PSVI Document Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For DOM2 support. * The createDocument factory method is in DOMImplementation. */	TokenNameCOMMENT_JAVADOC	 For DOM2 support. The createDocument factory method is in DOMImplementation. 
public	TokenNamepublic	
PSVIDocumentImpl	TokenNameIdentifier	 PSVI Document Impl
(	TokenNameLPAREN	
DocumentType	TokenNameIdentifier	 Document Type
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deep-clone a document, including fixing ownerDoc for the cloned * children. Note that this requires bypassing the WRONG_DOCUMENT_ERR * protection. I've chosen to implement it by calling importNode * which is DOM Level 2. * * @return org.w3c.dom.Node * @param deep boolean, iff true replicate children */	TokenNameCOMMENT_JAVADOC	 Deep-clone a document, including fixing ownerDoc for the cloned children. Note that this requires bypassing the WRONG_DOCUMENT_ERR protection. I've chosen to implement it by calling importNode which is DOM Level 2. * @return org.w3c.dom.Node @param deep boolean, iff true replicate children 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PSVIDocumentImpl	TokenNameIdentifier	 PSVI Document Impl
newdoc	TokenNameIdentifier	 newdoc
=	TokenNameEQUAL	
new	TokenNamenew	
PSVIDocumentImpl	TokenNameIdentifier	 PSVI Document Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
callUserDataHandlers	TokenNameIdentifier	 call User Data Handlers
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
newdoc	TokenNameIdentifier	 newdoc
,	TokenNameCOMMA	
UserDataHandler	TokenNameIdentifier	 User Data Handler
.	TokenNameDOT	
NODE_CLONED	TokenNameIdentifier	 NODE  CLONED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
newdoc	TokenNameIdentifier	 newdoc
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// experimental 	TokenNameCOMMENT_LINE	experimental 
newdoc	TokenNameIdentifier	 newdoc
.	TokenNameDOT	
mutationEvents	TokenNameIdentifier	 mutation Events
=	TokenNameEQUAL	
mutationEvents	TokenNameIdentifier	 mutation Events
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newdoc	TokenNameIdentifier	 newdoc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// cloneNode(boolean):Node 	TokenNameCOMMENT_LINE	cloneNode(boolean):Node 
/** * Retrieve information describing the abilities of this particular * DOM implementation. Intended to support applications that may be * using DOMs retrieved from several different sources, potentially * with different underlying representations. */	TokenNameCOMMENT_JAVADOC	 Retrieve information describing the abilities of this particular DOM implementation. Intended to support applications that may be using DOMs retrieved from several different sources, potentially with different underlying representations. 
public	TokenNamepublic	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Currently implemented as a singleton, since it's hardcoded 	TokenNameCOMMENT_LINE	Currently implemented as a singleton, since it's hardcoded 
// information anyway. 	TokenNameCOMMENT_LINE	information anyway. 
return	TokenNamereturn	
PSVIDOMImplementationImpl	TokenNameIdentifier	 PSVIDOM Implementation Impl
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an element with PSVI information */	TokenNameCOMMENT_JAVADOC	 Create an element with PSVI information 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PSVIElementNSImpl	TokenNameIdentifier	 PSVI Element NS Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an element with PSVI information */	TokenNameCOMMENT_JAVADOC	 Create an element with PSVI information 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PSVIElementNSImpl	TokenNameIdentifier	 PSVI Element NS Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an attribute with PSVI information */	TokenNameCOMMENT_JAVADOC	 Create an attribute with PSVI information 
public	TokenNamepublic	
Attr	TokenNameIdentifier	 Attr
createAttributeNS	TokenNameIdentifier	 create Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PSVIAttrNSImpl	TokenNameIdentifier	 PSVI Attr NS Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an attribute with PSVI information */	TokenNameCOMMENT_JAVADOC	 Create an attribute with PSVI information 
public	TokenNamepublic	
Attr	TokenNameIdentifier	 Attr
createAttributeNS	TokenNameIdentifier	 create Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PSVIAttrNSImpl	TokenNameIdentifier	 PSVI Attr NS Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * The configuration used when <code>Document.normalizeDocument</code> is * invoked. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 * The configuration used when <code>Document.normalizeDocument</code> is invoked. @since DOM Level 3 
public	TokenNamepublic	
DOMConfiguration	TokenNameIdentifier	 DOM Configuration
getDomConfig	TokenNameIdentifier	 get Dom Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
getDomConfig	TokenNameIdentifier	 get Dom Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fConfiguration	TokenNameIdentifier	 f Configuration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// REVISIT: Forbid serialization of PSVI DOM until 	TokenNameCOMMENT_LINE	REVISIT: Forbid serialization of PSVI DOM until 
// we support object serialization of grammars -- mrglavas 	TokenNameCOMMENT_LINE	we support object serialization of grammars -- mrglavas 
private	TokenNameprivate	
void	TokenNamevoid	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NotSerializableException	TokenNameIdentifier	 Not Serializable Exception
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NotSerializableException	TokenNameIdentifier	 Not Serializable Exception
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class PSVIDocumentImpl 	TokenNameCOMMENT_LINE	class PSVIDocumentImpl 
