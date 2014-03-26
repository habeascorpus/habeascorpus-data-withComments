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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
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
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
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
/** * ElementNSImpl inherits from ElementImpl and adds namespace support. * <P> * The qualified name is the node name, and we store localName which is also * used in all queries. On the other hand we recompute the prefix when * necessary. * * @xerces.internal * * @author Elena litani, IBM * @author Neeraj Bajaj, Sun Microsystems * @version $Id: ElementNSImpl.java 924245 2010-03-17 11:58:14Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 ElementNSImpl inherits from ElementImpl and adds namespace support. <P> The qualified name is the node name, and we store localName which is also used in all queries. On the other hand we recompute the prefix when necessary. * @xerces.internal * @author Elena litani, IBM @author Neeraj Bajaj, Sun Microsystems @version $Id: ElementNSImpl.java 924245 2010-03-17 11:58:14Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ElementNSImpl	TokenNameIdentifier	 Element NS Impl
extends	TokenNameextends	
ElementImpl	TokenNameIdentifier	 Element Impl
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
9142310625494392642L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
xmlURI	TokenNameIdentifier	 xml URI
=	TokenNameEQUAL	
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral	http://www.w3.org/XML/1998/namespace
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** DOM2: Namespace URI. */	TokenNameCOMMENT_JAVADOC	 DOM2: Namespace URI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** DOM2: localName. */	TokenNameCOMMENT_JAVADOC	 DOM2: localName. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
/** DOM3: type information */	TokenNameCOMMENT_JAVADOC	 DOM3: type information 
// REVISIT: we are losing the type information in DOM during serialization 	TokenNameCOMMENT_LINE	REVISIT: we are losing the type information in DOM during serialization 
transient	TokenNametransient	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ElementNSImpl	TokenNameIdentifier	 Element NS Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM2: Constructor for Namespace implementation. */	TokenNameCOMMENT_JAVADOC	 DOM2: Constructor for Namespace implementation. 
protected	TokenNameprotected	
ElementNSImpl	TokenNameIdentifier	 Element NS Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
// DOM Level 3: namespace URI is never empty string. 	TokenNameCOMMENT_LINE	DOM Level 3: namespace URI is never empty string. 
this	TokenNamethis	
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//convert the empty string to 'null' 	TokenNameCOMMENT_LINE	convert the empty string to 'null' 
this	TokenNamethis	
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
colon1	TokenNameIdentifier	 colon1
,	TokenNameCOMMA	
colon2	TokenNameIdentifier	 colon2
;	TokenNameSEMICOLON	
//NAMESPACE_ERR: 	TokenNameCOMMENT_LINE	NAMESPACE_ERR: 
//1. if the qualified name is 'null' it is malformed. 	TokenNameCOMMENT_LINE	1. if the qualified name is 'null' it is malformed. 
//2. or if the qualifiedName is null and the namespaceURI is different from null, 	TokenNameCOMMENT_LINE	2. or if the qualifiedName is null and the namespaceURI is different from null, 
// We dont need to check for namespaceURI != null, if qualified name is null throw DOMException. 	TokenNameCOMMENT_LINE	We dont need to check for namespaceURI != null, if qualified name is null throw DOMException. 
if	TokenNameif	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NAMESPACE_ERR"	TokenNameStringLiteral	NAMESPACE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NAMESPACE_ERR	TokenNameIdentifier	 NAMESPACE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
colon1	TokenNameIdentifier	 colon1
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colon2	TokenNameIdentifier	 colon2
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
checkNamespaceWF	TokenNameIdentifier	 check Namespace WF
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
colon1	TokenNameIdentifier	 colon1
,	TokenNameCOMMA	
colon2	TokenNameIdentifier	 colon2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colon1	TokenNameIdentifier	 colon1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// there is no prefix 	TokenNameCOMMENT_LINE	there is no prefix 
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
checkQName	TokenNameIdentifier	 check Q Name
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NAMESPACE_ERR"	TokenNameStringLiteral	NAMESPACE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NAMESPACE_ERR	TokenNameIdentifier	 NAMESPACE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//there is a prefix 	TokenNameCOMMENT_LINE	there is a prefix 
else	TokenNameelse	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colon1	TokenNameIdentifier	 colon1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colon2	TokenNameIdentifier	 colon2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//NAMESPACE_ERR: 	TokenNameCOMMENT_LINE	NAMESPACE_ERR: 
//1. if the qualifiedName has a prefix and the namespaceURI is null, 	TokenNameCOMMENT_LINE	1. if the qualifiedName has a prefix and the namespaceURI is null, 
//2. or if the qualifiedName has a prefix that is "xml" and the namespaceURI 	TokenNameCOMMENT_LINE	2. or if the qualifiedName has a prefix that is "xml" and the namespaceURI 
//is different from " http://www.w3.org/XML/1998/namespace" 	TokenNameCOMMENT_LINE	is different from " http://www.w3.org/XML/1998/namespace" 
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XML_URI	TokenNameIdentifier	 XML  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NAMESPACE_ERR"	TokenNameStringLiteral	NAMESPACE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NAMESPACE_ERR	TokenNameIdentifier	 NAMESPACE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
checkQName	TokenNameIdentifier	 check Q Name
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
checkDOMNSErr	TokenNameIdentifier	 check DOMNS Err
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// when local name is known 	TokenNameCOMMENT_LINE	when local name is known 
protected	TokenNameprotected	
ElementNSImpl	TokenNameIdentifier	 Element NS Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
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
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for DeferredElementImpl 	TokenNameCOMMENT_LINE	for DeferredElementImpl 
protected	TokenNameprotected	
ElementNSImpl	TokenNameIdentifier	 Element NS Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Support for DOM Level 3 renameNode method. 	TokenNameCOMMENT_LINE	Support for DOM Level 3 renameNode method. 
// Note: This only deals with part of the pb. CoreDocumentImpl 	TokenNameCOMMENT_LINE	Note: This only deals with part of the pb. CoreDocumentImpl 
// does all the work. 	TokenNameCOMMENT_LINE	does all the work. 
void	TokenNamevoid	
rename	TokenNameIdentifier	 rename
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
qualifiedName	TokenNameIdentifier	 qualified Name
;	TokenNameSEMICOLON	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reconcileDefaultAttributes	TokenNameIdentifier	 reconcile Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
//DOM2: Namespace methods. 	TokenNameCOMMENT_LINE	DOM2: Namespace methods. 
// 	TokenNameCOMMENT_LINE	 
/** * Introduced in DOM Level 2. <p> * * The namespace URI of this node, or null if it is unspecified.<p> * * This is not a computed value that is the result of a namespace lookup based on * an examination of the namespace declarations in scope. It is merely the * namespace URI given at creation time.<p> * * For nodes created with a DOM Level 1 method, such as createElement * from the Document interface, this is null. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * The namespace URI of this node, or null if it is unspecified.<p> * This is not a computed value that is the result of a namespace lookup based on an examination of the namespace declarations in scope. It is merely the namespace URI given at creation time.<p> * For nodes created with a DOM Level 1 method, such as createElement from the Document interface, this is null. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * The namespace prefix of this node, or null if it is unspecified. <p> * * For nodes created with a DOM Level 1 method, such as createElement * from the Document interface, this is null. <p> * * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * The namespace prefix of this node, or null if it is unspecified. <p> * For nodes created with a DOM Level 1 method, such as createElement from the Document interface, this is null. <p> * @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * Note that setting this attribute changes the nodeName attribute, which holds the * qualified name, as well as the tagName and name attributes of the Element * and Attr interfaces, when applicable.<p> * * @param prefix The namespace prefix of this node, or null(empty string) if it is unspecified. * * @exception INVALID_CHARACTER_ERR * Raised if the specified * prefix contains an invalid character. * @exception DOMException * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Note that setting this attribute changes the nodeName attribute, which holds the qualified name, as well as the tagName and name attributes of the Element and Attr interfaces, when applicable.<p> * @param prefix The namespace prefix of this node, or null(empty string) if it is unspecified. * @exception INVALID_CHARACTER_ERR Raised if the specified prefix contains an invalid character. @exception DOMException @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
.	TokenNameDOT	
isXMLName	TokenNameIdentifier	 is XML Name
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
isXML11Version	TokenNameIdentifier	 is XM L11 Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_CHARACTER_ERR"	TokenNameStringLiteral	INVALID_CHARACTER_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_CHARACTER_ERR	TokenNameIdentifier	 INVALID  CHARACTER  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NAMESPACE_ERR"	TokenNameStringLiteral	NAMESPACE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NAMESPACE_ERR	TokenNameIdentifier	 NAMESPACE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
xmlURI	TokenNameIdentifier	 xml URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NAMESPACE_ERR"	TokenNameStringLiteral	NAMESPACE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NAMESPACE_ERR	TokenNameIdentifier	 NAMESPACE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// update node name with new qualifiedName 	TokenNameCOMMENT_LINE	update node name with new qualifiedName 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * Returns the local part of the qualified name of this node. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Returns the local part of the qualified name of this node. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM * Returns the xml:base attribute. */	TokenNameCOMMENT_JAVADOC	 NON-DOM Returns the xml:base attribute. 
protected	TokenNameprotected	
Attr	TokenNameIdentifier	 Attr
getXMLBaseAttribute	TokenNameIdentifier	 get XML Base Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getNamedItemNS	TokenNameIdentifier	 get Named Item NS
(	TokenNameLPAREN	
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral	http://www.w3.org/XML/1998/namespace
,	TokenNameCOMMA	
"base"	TokenNameStringLiteral	base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getXMLBaseAttribute():Attr 	TokenNameCOMMENT_LINE	getXMLBaseAttribute():Attr 
/** * @see org.w3c.dom.TypeInfo#getTypeName() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.TypeInfo#getTypeName() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
.	TokenNameDOT	
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
.	TokenNameDOT	
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * Checks if a type is derived from another by restriction. See: * http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom * * @param typeNamespaceArg * The namspace of the ancestor type declaration * @param typeNameArg * The name of the ancestor type declaration * @param derivationMethod * The derivation method * * @return boolean True if the type is derived by restriciton for the * reference type */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> Checks if a type is derived from another by restriction. See: http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom * @param typeNamespaceArg The namspace of the ancestor type declaration @param typeNameArg The name of the ancestor type declaration @param derivationMethod The derivation method * @return boolean True if the type is derived by restriciton for the reference type 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDerivedFrom	TokenNameIdentifier	 is Derived From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typeNamespaceArg	TokenNameIdentifier	 type Namespace Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
typeNameArg	TokenNameIdentifier	 type Name Arg
,	TokenNameCOMMA	
int	TokenNameint	
derivationMethod	TokenNameIdentifier	 derivation Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
.	TokenNameDOT	
isDOMDerivedFrom	TokenNameIdentifier	 is DOM Derived From
(	TokenNameLPAREN	
typeNamespaceArg	TokenNameIdentifier	 type Namespace Arg
,	TokenNameCOMMA	
typeNameArg	TokenNameIdentifier	 type Name Arg
,	TokenNameCOMMA	
derivationMethod	TokenNameIdentifier	 derivation Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
.	TokenNameDOT	
isDOMDerivedFrom	TokenNameIdentifier	 is DOM Derived From
(	TokenNameLPAREN	
typeNamespaceArg	TokenNameIdentifier	 type Namespace Arg
,	TokenNameCOMMA	
typeNameArg	TokenNameIdentifier	 type Name Arg
,	TokenNameCOMMA	
derivationMethod	TokenNameIdentifier	 derivation Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM: setting type used by the DOM parser * @see NodeImpl#setReadOnly */	TokenNameCOMMENT_JAVADOC	 NON-DOM: setting type used by the DOM parser @see NodeImpl#setReadOnly 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
