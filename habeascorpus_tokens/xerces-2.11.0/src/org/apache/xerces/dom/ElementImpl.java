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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
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
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ElementTraversal	TokenNameIdentifier	 Element Traversal
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
Text	TokenNameIdentifier	 Text
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
/** * Elements represent most of the "markup" and structure of the * document. They contain both the data for the element itself * (element name and attributes), and any contained nodes, including * document text (as children). * <P> * Elements may have Attributes associated with them; the API for this is * defined in Node, but the function is implemented here. In general, XML * applications should retrive Attributes as Nodes, since they may contain * entity references and hence be a fairly complex sub-tree. HTML users will * be dealing with simple string values, and convenience methods are provided * to work in terms of Strings. * <P> * ElementImpl does not support Namespaces. ElementNSImpl, which inherits from * it, does. * * @xerces.internal * * @see ElementNSImpl * * @author Arnaud Le Hors, IBM * @author Joe Kesselman, IBM * @author Andy Clark, IBM * @author Ralf Pfeiffer, IBM * @author Michael Glavassevich, IBM * @version $Id: ElementImpl.java 938635 2010-04-27 20:23:42Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 Elements represent most of the "markup" and structure of the document. They contain both the data for the element itself (element name and attributes), and any contained nodes, including document text (as children). <P> Elements may have Attributes associated with them; the API for this is defined in Node, but the function is implemented here. In general, XML applications should retrive Attributes as Nodes, since they may contain entity references and hence be a fairly complex sub-tree. HTML users will be dealing with simple string values, and convenience methods are provided to work in terms of Strings. <P> ElementImpl does not support Namespaces. ElementNSImpl, which inherits from it, does. * @xerces.internal * @see ElementNSImpl * @author Arnaud Le Hors, IBM @author Joe Kesselman, IBM @author Andy Clark, IBM @author Ralf Pfeiffer, IBM @author Michael Glavassevich, IBM @version $Id: ElementImpl.java 938635 2010-04-27 20:23:42Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
ElementImpl	TokenNameIdentifier	 Element Impl
extends	TokenNameextends	
ParentNode	TokenNameIdentifier	 Parent Node
implements	TokenNameimplements	
Element	TokenNameIdentifier	 Element
,	TokenNameCOMMA	
ElementTraversal	TokenNameIdentifier	 Element Traversal
,	TokenNameCOMMA	
TypeInfo	TokenNameIdentifier	 Type Info
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
3717253516652722278L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Element name. */	TokenNameCOMMENT_JAVADOC	 Element name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** Attributes. */	TokenNameCOMMENT_JAVADOC	 Attributes. 
protected	TokenNameprotected	
AttributeMap	TokenNameIdentifier	 Attribute Map
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Factory constructor. */	TokenNameCOMMENT_JAVADOC	 Factory constructor. 
public	TokenNamepublic	
ElementImpl	TokenNameIdentifier	 Element Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDoc	TokenNameIdentifier	 owner Doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDoc	TokenNameIdentifier	 owner Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// synchronizeData will initialize attributes 	TokenNameCOMMENT_LINE	synchronizeData will initialize attributes 
}	TokenNameRBRACE	
// for ElementNSImpl 	TokenNameCOMMENT_LINE	for ElementNSImpl 
protected	TokenNameprotected	
ElementImpl	TokenNameIdentifier	 Element Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Support for DOM Level 3 renameNode method. 	TokenNameCOMMENT_LINE	Support for DOM Level 3 renameNode method. 
// Note: This only deals with part of the pb. CoreDocumentImpl 	TokenNameCOMMENT_LINE	Note: This only deals with part of the pb. CoreDocumentImpl 
// does all the work. 	TokenNameCOMMENT_LINE	does all the work. 
void	TokenNamevoid	
rename	TokenNameIdentifier	 rename
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
colon1	TokenNameIdentifier	 colon1
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colon1	TokenNameIdentifier	 colon1
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
.	TokenNameDOT	
isXMLName	TokenNameIdentifier	 is XML Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
reconcileDefaultAttributes	TokenNameIdentifier	 reconcile Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
/** * A short integer indicating what type of node this is. The named * constants for this value are defined in the org.w3c.dom.Node interface. */	TokenNameCOMMENT_JAVADOC	 A short integer indicating what type of node this is. The named constants for this value are defined in the org.w3c.dom.Node interface. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the element name */	TokenNameCOMMENT_JAVADOC	 Returns the element name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
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
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve all the Attributes as a set. Note that this API is inherited * from Node rather than specified on Element; in fact only Elements will * ever have Attributes, but they want to allow folks to "blindly" operate * on the tree as a set of Nodes. */	TokenNameCOMMENT_JAVADOC	 Retrieve all the Attributes as a set. Note that this API is inherited from Node rather than specified on Element; in fact only Elements will ever have Attributes, but they want to allow folks to "blindly" operate on the tree as a set of Nodes. 
public	TokenNamepublic	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
getAttributes	TokenNameIdentifier	 get Attributes
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
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeMap	TokenNameIdentifier	 Attribute Map
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttributes():NamedNodeMap 	TokenNameCOMMENT_LINE	getAttributes():NamedNodeMap 
/** * Return a duplicate copy of this Element. Note that its children * will not be copied unless the "deep" flag is true, but Attributes * are <i>always</i> replicated. * * @see org.w3c.dom.Node#cloneNode(boolean) */	TokenNameCOMMENT_JAVADOC	 Return a duplicate copy of this Element. Note that its children will not be copied unless the "deep" flag is true, but Attributes are <i>always</i> replicated. * @see org.w3c.dom.Node#cloneNode(boolean) 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElementImpl	TokenNameIdentifier	 Element Impl
newnode	TokenNameIdentifier	 newnode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Replicate NamedNodeMap rather than sharing it. 	TokenNameCOMMENT_LINE	Replicate NamedNodeMap rather than sharing it. 
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributeMap	TokenNameIdentifier	 Attribute Map
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
cloneMap	TokenNameIdentifier	 clone Map
(	TokenNameLPAREN	
newnode	TokenNameIdentifier	 newnode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newnode	TokenNameIdentifier	 newnode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// cloneNode(boolean):Node 	TokenNameCOMMENT_LINE	cloneNode(boolean):Node 
/** * DOM Level 3 WD - Experimental. * Retrieve baseURI */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD - Experimental. Retrieve baseURI 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseURI	TokenNameIdentifier	 get Base URI
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
// Absolute base URI is computed according to 	TokenNameCOMMENT_LINE	Absolute base URI is computed according to 
// XML Base (http://www.w3.org/TR/xmlbase/#granularity) 	TokenNameCOMMENT_LINE	XML Base (http://www.w3.org/TR/xmlbase/#granularity) 
// 1. The base URI specified by an xml:base attribute on the element, 	TokenNameCOMMENT_LINE	1. The base URI specified by an xml:base attribute on the element, 
// if one exists 	TokenNameCOMMENT_LINE	if one exists 
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Attr	TokenNameIdentifier	 Attr
attrNode	TokenNameIdentifier	 attr Node
=	TokenNameEQUAL	
getXMLBaseAttribute	TokenNameIdentifier	 get XML Base Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrNode	TokenNameIdentifier	 attr Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
attrNode	TokenNameIdentifier	 attr Node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// attribute value is always empty string 	TokenNameCOMMENT_LINE	attribute value is always empty string 
try	TokenNametry	
{	TokenNameLBRACE	
URI	TokenNameIdentifier	 URI
_uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
new	TokenNamenew	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the URI is already absolute return it; otherwise it's relative and we need to resolve it. 	TokenNameCOMMENT_LINE	If the URI is already absolute return it; otherwise it's relative and we need to resolve it. 
if	TokenNameif	
(	TokenNameLPAREN	
_uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
isAbsoluteURI	TokenNameIdentifier	 is Absolute URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make any parentURI into a URI object to use with the URI(URI, String) constructor 	TokenNameCOMMENT_LINE	Make any parentURI into a URI object to use with the URI(URI, String) constructor 
String	TokenNameIdentifier	 String
parentBaseURI	TokenNameIdentifier	 parent Base URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentBaseURI	TokenNameIdentifier	 parent Base URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
URI	TokenNameIdentifier	 URI
_parentBaseURI	TokenNameIdentifier	 parent Base URI
=	TokenNameEQUAL	
new	TokenNamenew	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
parentBaseURI	TokenNameIdentifier	 parent Base URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
absolutize	TokenNameIdentifier	 absolutize
(	TokenNameLPAREN	
_parentBaseURI	TokenNameIdentifier	 parent Base URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
.	TokenNameDOT	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This should never happen: parent should have checked the URI and returned null if invalid. 	TokenNameCOMMENT_LINE	This should never happen: parent should have checked the URI and returned null if invalid. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// REVISIT: what should happen in this case? 	TokenNameCOMMENT_LINE	REVISIT: what should happen in this case? 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
.	TokenNameDOT	
MalformedURIException	TokenNameIdentifier	 Malformed URI Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 2.the base URI of the element's parent element within the 	TokenNameCOMMENT_LINE	2.the base URI of the element's parent element within the 
// document or external entity, if one exists 	TokenNameCOMMENT_LINE	document or external entity, if one exists 
// 3. the base URI of the document entity or external entity 	TokenNameCOMMENT_LINE	3. the base URI of the document entity or external entity 
// containing the element 	TokenNameCOMMENT_LINE	containing the element 
// ownerNode serves as a parent or as document 	TokenNameCOMMENT_LINE	ownerNode serves as a parent or as document 
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
ownerNode	TokenNameIdentifier	 owner Node
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//getBaseURI 	TokenNameCOMMENT_LINE	getBaseURI 
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
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
"xml:base"	TokenNameStringLiteral	xml:base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getXMLBaseAttribute():Attr 	TokenNameCOMMENT_LINE	getXMLBaseAttribute():Attr 
/** * NON-DOM * set the ownerDocument of this node, its children, and its attributes */	TokenNameCOMMENT_JAVADOC	 NON-DOM set the ownerDocument of this node, its children, and its attributes 
protected	TokenNameprotected	
void	TokenNamevoid	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Element methods 	TokenNameCOMMENT_LINE	Element methods 
// 	TokenNameCOMMENT_LINE	 
/** * Look up a single Attribute by name. Returns the Attribute's * string value, or an empty string (NOT null!) to indicate that the * name did not map to a currently defined attribute. * <p> * Note: Attributes may contain complex node trees. This method * returns the "flattened" string obtained from Attribute.getValue(). * If you need the structure information, see getAttributeNode(). */	TokenNameCOMMENT_JAVADOC	 Look up a single Attribute by name. Returns the Attribute's string value, or an empty string (NOT null!) to indicate that the name did not map to a currently defined attribute. <p> Note: Attributes may contain complex node trees. This method returns the "flattened" string obtained from Attribute.getValue(). If you need the structure information, see getAttributeNode(). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttribute(String):String 	TokenNameCOMMENT_LINE	getAttribute(String):String 
/** * Look up a single Attribute by name. Returns the Attribute Node, * so its complete child tree is available. This could be important in * XML, where the string rendering may not be sufficient information. * <p> * If no matching attribute is available, returns null. */	TokenNameCOMMENT_JAVADOC	 Look up a single Attribute by name. Returns the Attribute Node, so its complete child tree is available. This could be important in XML, where the string rendering may not be sufficient information. <p> If no matching attribute is available, returns null. 
public	TokenNamepublic	
Attr	TokenNameIdentifier	 Attr
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttributeNode(String):Attr 	TokenNameCOMMENT_LINE	getAttributeNode(String):Attr 
/** * Returns a NodeList of all descendent nodes (children, * grandchildren, and so on) which are Elements and which have the * specified tag name. * <p> * Note: NodeList is a "live" view of the DOM. Its contents will * change as the DOM changes, and alterations made to the NodeList * will be reflected in the DOM. * * @param tagname The type of element to gather. To obtain a list of * all elements no matter what their names, use the wild-card tag * name "*". * * @see DeepNodeListImpl */	TokenNameCOMMENT_JAVADOC	 Returns a NodeList of all descendent nodes (children, grandchildren, and so on) which are Elements and which have the specified tag name. <p> Note: NodeList is a "live" view of the DOM. Its contents will change as the DOM changes, and alterations made to the NodeList will be reflected in the DOM. * @param tagname The type of element to gather. To obtain a list of all elements no matter what their names, use the wild-card tag name "*". * @see DeepNodeListImpl 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getElementsByTagName	TokenNameIdentifier	 get Elements By Tag Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagname	TokenNameIdentifier	 tagname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DeepNodeListImpl	TokenNameIdentifier	 Deep Node List Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
tagname	TokenNameIdentifier	 tagname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name of the Element. Note that Element.nodeName() is * defined to also return the tag name. * <p> * This is case-preserving in XML. HTML should uppercasify it on the * way in. */	TokenNameCOMMENT_JAVADOC	 Returns the name of the Element. Note that Element.nodeName() is defined to also return the tag name. <p> This is case-preserving in XML. HTML should uppercasify it on the way in. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTagName	TokenNameIdentifier	 get Tag Name
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
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * In "normal form" (as read from a source file), there will never be two * Text children in succession. But DOM users may create successive Text * nodes in the course of manipulating the document. Normalize walks the * sub-tree and merges adjacent Texts, as if the DOM had been written out * and read back in again. This simplifies implementation of higher-level * functions that may want to assume that the document is in standard form. * <p> * To normalize a Document, normalize its top-level Element child. * <p> * As of PR-DOM-Level-1-19980818, CDATA -- despite being a subclass of * Text -- is considered "markup" and will _not_ be merged either with * normal Text or with other CDATASections. */	TokenNameCOMMENT_JAVADOC	 In "normal form" (as read from a source file), there will never be two Text children in succession. But DOM users may create successive Text nodes in the course of manipulating the document. Normalize walks the sub-tree and merges adjacent Texts, as if the DOM had been written out and read back in again. This simplifies implementation of higher-level functions that may want to assume that the document is in standard form. <p> To normalize a Document, normalize its top-level Element child. <p> As of PR-DOM-Level-1-19980818, CDATA -- despite being a subclass of Text -- is considered "markup" and will _not_ be merged either with normal Text or with other CDATASections. 
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No need to normalize if already normalized. 	TokenNameCOMMENT_LINE	No need to normalize if already normalized. 
if	TokenNameif	
(	TokenNameLPAREN	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ChildNode	TokenNameIdentifier	 Child Node
kid	TokenNameIdentifier	 kid
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
// If kid is a text node, we need to check for one of two 	TokenNameCOMMENT_LINE	If kid is a text node, we need to check for one of two 
// conditions: 	TokenNameCOMMENT_LINE	conditions: 
// 1) There is an adjacent text node 	TokenNameCOMMENT_LINE	1) There is an adjacent text node 
// 2) There is no adjacent text node, but kid is 	TokenNameCOMMENT_LINE	2) There is no adjacent text node, but kid is 
// an empty text node. 	TokenNameCOMMENT_LINE	an empty text node. 
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If an adjacent text node, merge it with kid 	TokenNameCOMMENT_LINE	If an adjacent text node, merge it with kid 
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
)	TokenNameRPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
.	TokenNameDOT	
appendData	TokenNameIdentifier	 append Data
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
;	TokenNameSEMICOLON	
// Don't advance; there might be another. 	TokenNameCOMMENT_LINE	Don't advance; there might be another. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// If kid is empty, remove it 	TokenNameCOMMENT_LINE	If kid is empty, remove it 
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Otherwise it might be an Element, which is handled recursively 	TokenNameCOMMENT_LINE	Otherwise it might be an Element, which is handled recursively 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
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
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// We must also normalize all of the attributes 	TokenNameCOMMENT_LINE	We must also normalize all of the attributes 
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// changed() will have occurred when the removeChild() was done, 	TokenNameCOMMENT_LINE	changed() will have occurred when the removeChild() was done, 
// so does not have to be reissued. 	TokenNameCOMMENT_LINE	so does not have to be reissued. 
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize() 	TokenNameCOMMENT_LINE	normalize() 
/** * Remove the named attribute from this Element. If the removed * Attribute has a default value, it is immediately replaced thereby. * <P> * The default logic is actually implemented in NamedNodeMapImpl. * PR-DOM-Level-1-19980818 doesn't fully address the DTD, so some * of this behavior is likely to change in future versions. ????? * <P> * Note that this call "succeeds" even if no attribute by this name * existed -- unlike removeAttributeNode, which will throw a not-found * exception in that case. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is * readonly. */	TokenNameCOMMENT_JAVADOC	 Remove the named attribute from this Element. If the removed Attribute has a default value, it is immediately replaced thereby. <P> The default logic is actually implemented in NamedNodeMapImpl. PR-DOM-Level-1-19980818 doesn't fully address the DTD, so some of this behavior is likely to change in future versions. ????? <P> Note that this call "succeeds" even if no attribute by this name existed -- unlike removeAttributeNode, which will throw a not-found exception in that case. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
&&	TokenNameAND_AND	
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
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
safeRemoveNamedItem	TokenNameIdentifier	 safe Remove Named Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removeAttribute(String) 	TokenNameCOMMENT_LINE	removeAttribute(String) 
/** * Remove the specified attribute/value pair. If the removed * Attribute has a default value, it is immediately replaced. * <p> * NOTE: Specifically removes THIS NODE -- not the node with this * name, nor the node with these contents. If the specific Attribute * object passed in is not stored in this Element, we throw a * DOMException. If you really want to remove an attribute by name, * use removeAttribute(). * * @return the Attribute object that was removed. * @throws DOMException(NOT_FOUND_ERR) if oldattr is not an attribute of * this Element. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is * readonly. */	TokenNameCOMMENT_JAVADOC	 Remove the specified attribute/value pair. If the removed Attribute has a default value, it is immediately replaced. <p> NOTE: Specifically removes THIS NODE -- not the node with this name, nor the node with these contents. If the specific Attribute object passed in is not stored in this Element, we throw a DOMException. If you really want to remove an attribute by name, use removeAttribute(). * @return the Attribute object that was removed. @throws DOMException(NOT_FOUND_ERR) if oldattr is not an attribute of this Element. @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is readonly. 
public	TokenNamepublic	
Attr	TokenNameIdentifier	 Attr
removeAttributeNode	TokenNameIdentifier	 remove Attribute Node
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
oldAttr	TokenNameIdentifier	 old Attr
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
&&	TokenNameAND_AND	
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
attributes	TokenNameIdentifier	 attributes
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
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
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
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
oldAttr	TokenNameIdentifier	 old Attr
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removeAttributeNode(Attr):Attr 	TokenNameCOMMENT_LINE	removeAttributeNode(Attr):Attr 
/** * Add a new name/value pair, or replace the value of the existing * attribute having that name. * * Note: this method supports only the simplest kind of Attribute, * one whose value is a string contained in a single Text node. * If you want to assert a more complex value (which XML permits, * though HTML doesn't), see setAttributeNode(). * * The attribute is created with specified=true, meaning it's an * explicit value rather than inherited from the DTD as a default. * Again, setAttributeNode can be used to achieve other results. * * @throws DOMException(INVALID_NAME_ERR) if the name is not acceptable. * (Attribute factory will do that test for us.) * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is * readonly. */	TokenNameCOMMENT_JAVADOC	 Add a new name/value pair, or replace the value of the existing attribute having that name. * Note: this method supports only the simplest kind of Attribute, one whose value is a string contained in a single Text node. If you want to assert a more complex value (which XML permits, though HTML doesn't), see setAttributeNode(). * The attribute is created with specified=true, meaning it's an explicit value rather than inherited from the DTD as a default. Again, setAttributeNode can be used to achieve other results. * @throws DOMException(INVALID_NAME_ERR) if the name is not acceptable. (Attribute factory will do that test for us.) * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
&&	TokenNameAND_AND	
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
Attr	TokenNameIdentifier	 Attr
newAttr	TokenNameIdentifier	 new Attr
=	TokenNameEQUAL	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newAttr	TokenNameIdentifier	 new Attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newAttr	TokenNameIdentifier	 new Attr
=	TokenNameEQUAL	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createAttribute	TokenNameIdentifier	 create Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeMap	TokenNameIdentifier	 Attribute Map
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newAttr	TokenNameIdentifier	 new Attr
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setNamedItem	TokenNameIdentifier	 set Named Item
(	TokenNameLPAREN	
newAttr	TokenNameIdentifier	 new Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newAttr	TokenNameIdentifier	 new Attr
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setAttribute(String,String) 	TokenNameCOMMENT_LINE	setAttribute(String,String) 
/** * Add a new attribute/value pair, or replace the value of the * existing attribute with that name. * <P> * This method allows you to add an Attribute that has already been * constructed, and hence avoids the limitations of the simple * setAttribute() call. It can handle attribute values that have * arbitrarily complex tree structure -- in particular, those which * had entity references mixed into their text. * * @throws DOMException(INUSE_ATTRIBUTE_ERR) if the Attribute object * has already been assigned to another Element. */	TokenNameCOMMENT_JAVADOC	 Add a new attribute/value pair, or replace the value of the existing attribute with that name. <P> This method allows you to add an Attribute that has already been constructed, and hence avoids the limitations of the simple setAttribute() call. It can handle attribute values that have arbitrarily complex tree structure -- in particular, those which had entity references mixed into their text. * @throws DOMException(INUSE_ATTRIBUTE_ERR) if the Attribute object has already been assigned to another Element. 
public	TokenNamepublic	
Attr	TokenNameIdentifier	 Attr
setAttributeNode	TokenNameIdentifier	 set Attribute Node
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
newAttr	TokenNameIdentifier	 new Attr
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
newAttr	TokenNameIdentifier	 new Attr
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
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
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
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
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeMap	TokenNameIdentifier	 Attribute Map
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This will throw INUSE if necessary 	TokenNameCOMMENT_LINE	This will throw INUSE if necessary 
return	TokenNamereturn	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setNamedItem	TokenNameIdentifier	 set Named Item
(	TokenNameLPAREN	
newAttr	TokenNameIdentifier	 new Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setAttributeNode(Attr):Attr 	TokenNameCOMMENT_LINE	setAttributeNode(Attr):Attr 
// 	TokenNameCOMMENT_LINE	 
// DOM2: Namespace methods 	TokenNameCOMMENT_LINE	DOM2: Namespace methods 
// 	TokenNameCOMMENT_LINE	 
/** * Introduced in DOM Level 2. <p> * * Retrieves an attribute value by local name and namespace URI. * * @param namespaceURI * The namespace URI of the attribute to * retrieve. * @param localName The local name of the attribute to retrieve. * @return String The Attr value as a string, or empty string * if that attribute * does not have a specified or default value. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Retrieves an attribute value by local name and namespace URI. * @param namespaceURI The namespace URI of the attribute to retrieve. @param localName The local name of the attribute to retrieve. @return String The Attr value as a string, or empty string if that attribute does not have a specified or default value. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
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
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getNamedItemNS	TokenNameIdentifier	 get Named Item NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttributeNS(String,String):String 	TokenNameCOMMENT_LINE	getAttributeNS(String,String):String 
/** * Introduced in DOM Level 2. <p> * * Adds a new attribute. * If the given namespaceURI is null or an empty string and the * qualifiedName has a prefix that is "xml", the new attribute is bound to * the predefined namespace "http://www.w3.org/XML/1998/namespace" * [Namespaces]. If an attribute with the same local name and namespace * URI is already present on the element, its prefix is changed to be the * prefix part of the qualifiedName, and its value is changed to be the * value parameter. This value is a simple string, it is not parsed as it * is being set. So any markup (such as syntax to be recognized as an * entity reference) is treated as literal text, and needs to be * appropriately escaped by the implementation when it is written out. In * order to assign an attribute value that contains entity references, the * user must create an Attr node plus any Text and EntityReference nodes, * build the appropriate subtree, and use setAttributeNodeNS or * setAttributeNode to assign it as the value of an attribute. * * @param namespaceURI The namespace URI of the attribute to create * or alter. * @param qualifiedName The qualified name of the attribute to create or * alter. * @param value The value to set in string form. * @throws INVALID_CHARACTER_ERR: Raised if the specified * name contains an invalid character. * * @throws NO_MODIFICATION_ALLOWED_ERR: Raised if this * node is readonly. * * @throws NAMESPACE_ERR: Raised if the qualifiedName * has a prefix that is "xml" and the namespaceURI * is neither null nor an empty string nor * "http://www.w3.org/XML/1998/namespace", or if * the qualifiedName has a prefix that is "xmlns" * but the namespaceURI is neither null nor an * empty string, or if if the qualifiedName has a * prefix different from "xml" and "xmlns" and the * namespaceURI is null or an empty string. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Adds a new attribute. If the given namespaceURI is null or an empty string and the qualifiedName has a prefix that is "xml", the new attribute is bound to the predefined namespace "http://www.w3.org/XML/1998/namespace" [Namespaces]. If an attribute with the same local name and namespace URI is already present on the element, its prefix is changed to be the prefix part of the qualifiedName, and its value is changed to be the value parameter. This value is a simple string, it is not parsed as it is being set. So any markup (such as syntax to be recognized as an entity reference) is treated as literal text, and needs to be appropriately escaped by the implementation when it is written out. In order to assign an attribute value that contains entity references, the user must create an Attr node plus any Text and EntityReference nodes, build the appropriate subtree, and use setAttributeNodeNS or setAttributeNode to assign it as the value of an attribute. * @param namespaceURI The namespace URI of the attribute to create or alter. @param qualifiedName The qualified name of the attribute to create or alter. @param value The value to set in string form. @throws INVALID_CHARACTER_ERR: Raised if the specified name contains an invalid character. * @throws NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. * @throws NAMESPACE_ERR: Raised if the qualifiedName has a prefix that is "xml" and the namespaceURI is neither null nor an empty string nor "http://www.w3.org/XML/1998/namespace", or if the qualifiedName has a prefix that is "xmlns" but the namespaceURI is neither null nor an empty string, or if if the qualifiedName has a prefix different from "xml" and "xmlns" and the namespaceURI is null or an empty string. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
void	TokenNamevoid	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
&&	TokenNameAND_AND	
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
qualifiedName	TokenNameIdentifier	 qualified Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qualifiedName	TokenNameIdentifier	 qualified Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qualifiedName	TokenNameIdentifier	 qualified Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qualifiedName	TokenNameIdentifier	 qualified Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Attr	TokenNameIdentifier	 Attr
newAttr	TokenNameIdentifier	 new Attr
=	TokenNameEQUAL	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newAttr	TokenNameIdentifier	 new Attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: this is not efficient, we are creating twice the same 	TokenNameCOMMENT_LINE	REVISIT: this is not efficient, we are creating twice the same 
// strings for prefix and localName. 	TokenNameCOMMENT_LINE	strings for prefix and localName. 
newAttr	TokenNameIdentifier	 new Attr
=	TokenNameEQUAL	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createAttributeNS	TokenNameIdentifier	 create Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeMap	TokenNameIdentifier	 Attribute Map
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newAttr	TokenNameIdentifier	 new Attr
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setNamedItemNS	TokenNameIdentifier	 set Named Item NS
(	TokenNameLPAREN	
newAttr	TokenNameIdentifier	 new Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newAttr	TokenNameIdentifier	 new Attr
instanceof	TokenNameinstanceof	
AttrNSImpl	TokenNameIdentifier	 Attr NS Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// change prefix and value 	TokenNameCOMMENT_LINE	change prefix and value 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrNSImpl	TokenNameIdentifier	 Attr NS Impl
)	TokenNameRPAREN	
newAttr	TokenNameIdentifier	 new Attr
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This case may happen if user calls: 	TokenNameCOMMENT_LINE	This case may happen if user calls: 
// elem.setAttribute("name", "value"); 	TokenNameCOMMENT_LINE	elem.setAttribute("name", "value"); 
// elem.setAttributeNS(null, "name", "value"); 	TokenNameCOMMENT_LINE	elem.setAttributeNS(null, "name", "value"); 
// This case is not defined by the DOM spec, we choose 	TokenNameCOMMENT_LINE	This case is not defined by the DOM spec, we choose 
// to create a new attribute in this case and remove an old one from the tree 	TokenNameCOMMENT_LINE	to create a new attribute in this case and remove an old one from the tree 
// note this might cause events to be propagated or user data to be lost 	TokenNameCOMMENT_LINE	note this might cause events to be propagated or user data to be lost 
newAttr	TokenNameIdentifier	 new Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
)	TokenNameRPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createAttributeNS	TokenNameIdentifier	 create Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setNamedItemNS	TokenNameIdentifier	 set Named Item NS
(	TokenNameLPAREN	
newAttr	TokenNameIdentifier	 new Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newAttr	TokenNameIdentifier	 new Attr
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setAttributeNS(String,String,String) 	TokenNameCOMMENT_LINE	setAttributeNS(String,String,String) 
/** * Introduced in DOM Level 2. <p> * * Removes an attribute by local name and namespace URI. If the removed * attribute has a default value it is immediately replaced. * The replacing attribute has the same namespace URI and local name, * as well as the original prefix.<p> * * @param namespaceURI The namespace URI of the attribute to remove. * * @param localName The local name of the attribute to remove. * @throws NO_MODIFICATION_ALLOWED_ERR: Raised if this * node is readonly. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Removes an attribute by local name and namespace URI. If the removed attribute has a default value it is immediately replaced. The replacing attribute has the same namespace URI and local name, as well as the original prefix.<p> * @param namespaceURI The namespace URI of the attribute to remove. * @param localName The local name of the attribute to remove. @throws NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
void	TokenNamevoid	
removeAttributeNS	TokenNameIdentifier	 remove Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
&&	TokenNameAND_AND	
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
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
safeRemoveNamedItemNS	TokenNameIdentifier	 safe Remove Named Item NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removeAttributeNS(String,String) 	TokenNameCOMMENT_LINE	removeAttributeNS(String,String) 
/** * Retrieves an Attr node by local name and namespace URI. * * @param namespaceURI The namespace URI of the attribute to * retrieve. * @param localName The local name of the attribute to retrieve. * @return Attr The Attr node with the specified attribute * local name and namespace * URI or null if there is no such attribute. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Retrieves an Attr node by local name and namespace URI. * @param namespaceURI The namespace URI of the attribute to retrieve. @param localName The local name of the attribute to retrieve. @return Attr The Attr node with the specified attribute local name and namespace URI or null if there is no such attribute. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
Attr	TokenNameIdentifier	 Attr
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
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
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getNamedItemNS	TokenNameIdentifier	 get Named Item NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttributeNodeNS(String,String):Attr 	TokenNameCOMMENT_LINE	getAttributeNodeNS(String,String):Attr 
/** * Introduced in DOM Level 2. <p> * * Adds a new attribute. If an attribute with that local name and * namespace URI is already present in the element, it is replaced * by the new one. * * @param newAttr The Attr node to add to the attribute list. When * the Node has no namespaceURI, this method behaves * like setAttributeNode. * @return Attr If the newAttr attribute replaces an existing attribute * with the same local name and namespace URI, the * * previously existing Attr node is returned, otherwise * null is returned. * @throws WRONG_DOCUMENT_ERR: Raised if newAttr * was created from a different document than the one that * created the element. * * @throws NO_MODIFICATION_ALLOWED_ERR: Raised if * this node is readonly. * * @throws INUSE_ATTRIBUTE_ERR: Raised if newAttr is * already an attribute of another Element object. The * DOM user must explicitly clone Attr nodes to re-use * them in other elements. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Adds a new attribute. If an attribute with that local name and namespace URI is already present in the element, it is replaced by the new one. * @param newAttr The Attr node to add to the attribute list. When the Node has no namespaceURI, this method behaves like setAttributeNode. @return Attr If the newAttr attribute replaces an existing attribute with the same local name and namespace URI, the * previously existing Attr node is returned, otherwise null is returned. @throws WRONG_DOCUMENT_ERR: Raised if newAttr was created from a different document than the one that created the element. * @throws NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. * @throws INUSE_ATTRIBUTE_ERR: Raised if newAttr is already an attribute of another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
Attr	TokenNameIdentifier	 Attr
setAttributeNodeNS	TokenNameIdentifier	 set Attribute Node NS
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
newAttr	TokenNameIdentifier	 new Attr
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
newAttr	TokenNameIdentifier	 new Attr
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
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
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
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
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeMap	TokenNameIdentifier	 Attribute Map
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This will throw INUSE if necessary 	TokenNameCOMMENT_LINE	This will throw INUSE if necessary 
return	TokenNamereturn	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setNamedItemNS	TokenNameIdentifier	 set Named Item NS
(	TokenNameLPAREN	
newAttr	TokenNameIdentifier	 new Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setAttributeNodeNS(Attr):Attr 	TokenNameCOMMENT_LINE	setAttributeNodeNS(Attr):Attr 
/** * NON-DOM: sets attribute node for this element */	TokenNameCOMMENT_JAVADOC	 NON-DOM: sets attribute node for this element 
protected	TokenNameprotected	
int	TokenNameint	
setXercesAttributeNode	TokenNameIdentifier	 set Xerces Attribute Node
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
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
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeMap	TokenNameIdentifier	 Attribute Map
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM: get inded of an attribute */	TokenNameCOMMENT_JAVADOC	 NON-DOM: get inded of an attribute 
protected	TokenNameprotected	
int	TokenNameint	
getXercesAttribute	TokenNameIdentifier	 get Xerces Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
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
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getNamedItemIndex	TokenNameIdentifier	 get Named Item Index
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttributes	TokenNameIdentifier	 has Attributes
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
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttributeNS	TokenNameIdentifier	 has Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * Returns a NodeList of all the Elements with a given local name and * namespace URI in the order in which they would be encountered in a * preorder traversal of the Document tree, starting from this node. * * @param namespaceURI The namespace URI of the elements to match * on. The special value "*" matches all * namespaces. When it is null or an empty * string, this method behaves like * getElementsByTagName. * @param localName The local name of the elements to match on. * The special value "*" matches all local names. * @return NodeList A new NodeList object containing all the matched * Elements. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Returns a NodeList of all the Elements with a given local name and namespace URI in the order in which they would be encountered in a preorder traversal of the Document tree, starting from this node. * @param namespaceURI The namespace URI of the elements to match on. The special value "*" matches all namespaces. When it is null or an empty string, this method behaves like getElementsByTagName. @param localName The local name of the elements to match on. The special value "*" matches all local names. @return NodeList A new NodeList object containing all the matched Elements. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DeepNodeListImpl	TokenNameIdentifier	 Deep Node List Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Level 3 WD- Experimental. * Override inherited behavior from NodeImpl and ParentNode to check on * attributes */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD- Experimental. Override inherited behavior from NodeImpl and ParentNode to check on attributes 
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
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
hasAttrs	TokenNameIdentifier	 has Attrs
=	TokenNameEQUAL	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasAttrs	TokenNameIdentifier	 has Attrs
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAttrs	TokenNameIdentifier	 has Attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
map1	TokenNameIdentifier	 map1
=	TokenNameEQUAL	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
map2	TokenNameIdentifier	 map2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
map1	TokenNameIdentifier	 map1
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
!=	TokenNameNOT_EQUAL	
map2	TokenNameIdentifier	 map2
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n1	TokenNameIdentifier	 n1
=	TokenNameEQUAL	
map1	TokenNameIdentifier	 map1
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DOM Level 1 Node 	TokenNameCOMMENT_LINE	DOM Level 1 Node 
Node	TokenNameIdentifier	 Node
n2	TokenNameIdentifier	 n2
=	TokenNameEQUAL	
map2	TokenNameIdentifier	 map2
.	TokenNameDOT	
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n2	TokenNameIdentifier	 n2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
n1	TokenNameIdentifier	 n1
)	TokenNameRPAREN	
.	TokenNameDOT	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n2	TokenNameIdentifier	 n2
=	TokenNameEQUAL	
map2	TokenNameIdentifier	 map2
.	TokenNameDOT	
getNamedItemNS	TokenNameIdentifier	 get Named Item NS
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n2	TokenNameIdentifier	 n2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
n1	TokenNameIdentifier	 n1
)	TokenNameRPAREN	
.	TokenNameDOT	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Level 3: register the given attribute node as an ID attribute */	TokenNameCOMMENT_JAVADOC	 DOM Level 3: register the given attribute node as an ID attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setIdAttributeNode	TokenNameIdentifier	 set Id Attribute Node
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
boolean	TokenNameboolean	
makeId	TokenNameIdentifier	 make Id
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
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
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
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
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
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
.	TokenNameDOT	
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
makeId	TokenNameIdentifier	 make Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
makeId	TokenNameIdentifier	 make Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
removeIdentifier	TokenNameIdentifier	 remove Identifier
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
putIdentifier	TokenNameIdentifier	 put Identifier
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * DOM Level 3: register the given attribute node as an ID attribute */	TokenNameCOMMENT_JAVADOC	 DOM Level 3: register the given attribute node as an ID attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setIdAttribute	TokenNameIdentifier	 set Id Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
makeId	TokenNameIdentifier	 make Id
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
Attr	TokenNameIdentifier	 Attr
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
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
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
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
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
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
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
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
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
.	TokenNameDOT	
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
makeId	TokenNameIdentifier	 make Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
makeId	TokenNameIdentifier	 make Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
removeIdentifier	TokenNameIdentifier	 remove Identifier
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
putIdentifier	TokenNameIdentifier	 put Identifier
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * DOM Level 3: register the given attribute node as an ID attribute */	TokenNameCOMMENT_JAVADOC	 DOM Level 3: register the given attribute node as an ID attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setIdAttributeNS	TokenNameIdentifier	 set Id Attribute NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
makeId	TokenNameIdentifier	 make Id
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
Attr	TokenNameIdentifier	 Attr
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
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
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
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
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
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
"NOT_FOUND_ERR"	TokenNameStringLiteral	NOT_FOUND_ERR
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
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
.	TokenNameDOT	
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
makeId	TokenNameIdentifier	 make Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
makeId	TokenNameIdentifier	 make Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
removeIdentifier	TokenNameIdentifier	 remove Identifier
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
putIdentifier	TokenNameIdentifier	 put Identifier
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
/** * Introduced in DOM Level 3. <p> * Checks if a type is derived from another by restriction. See: * http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom * * @param typeNamespaceArg * The namspace of the ancestor type declaration * @param typeNameArg * The name of the ancestor type declaration * @param derivationMethod * The derivation method * * @return boolean True if the type is derived by restriciton for the * reference type */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 3. <p> Checks if a type is derived from another by restriction. See: http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom * @param typeNamespaceArg The namspace of the ancestor type declaration @param typeNameArg The name of the ancestor type declaration @param derivationMethod The derivation method * @return boolean True if the type is derived by restriciton for the reference type 
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
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method getSchemaTypeInfo. * @return TypeInfo */	TokenNameCOMMENT_JAVADOC	 Method getSchemaTypeInfo. @return TypeInfo 
public	TokenNamepublic	
TypeInfo	TokenNameIdentifier	 Type Info
getSchemaTypeInfo	TokenNameIdentifier	 get Schema Type Info
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
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * NON-DOM: Subclassed to flip the attributes' readonly switch as well. * @see NodeImpl#setReadOnly */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Subclassed to flip the attributes' readonly switch as well. @see NodeImpl#setReadOnly 
public	TokenNamepublic	
void	TokenNamevoid	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** Synchronizes the data (name and value) for fast nodes. */	TokenNameCOMMENT_JAVADOC	 Synchronizes the data (name and value) for fast nodes. 
protected	TokenNameprotected	
void	TokenNamevoid	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no need to sync in the future 	TokenNameCOMMENT_LINE	no need to sync in the future 
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we don't want to generate any event for this so turn them off 	TokenNameCOMMENT_LINE	we don't want to generate any event for this so turn them off 
boolean	TokenNameboolean	
orig	TokenNameIdentifier	 orig
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getMutationEvents	TokenNameIdentifier	 get Mutation Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
setMutationEvents	TokenNameIdentifier	 set Mutation Events
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// attributes 	TokenNameCOMMENT_LINE	attributes 
setupDefaultAttributes	TokenNameIdentifier	 setup Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set mutation events flag back to its original value 	TokenNameCOMMENT_LINE	set mutation events flag back to its original value 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
setMutationEvents	TokenNameIdentifier	 set Mutation Events
(	TokenNameLPAREN	
orig	TokenNameIdentifier	 orig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeData() 	TokenNameCOMMENT_LINE	synchronizeData() 
// support for DOM Level 3 renameNode method 	TokenNameCOMMENT_LINE	support for DOM Level 3 renameNode method 
// @param el The element from which to take the attributes 	TokenNameCOMMENT_LINE	@param el The element from which to take the attributes 
void	TokenNamevoid	
moveSpecifiedAttributes	TokenNameIdentifier	 move Specified Attributes
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
el	TokenNameIdentifier	 el
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
el	TokenNameIdentifier	 el
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeMap	TokenNameIdentifier	 Attribute Map
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
moveSpecifiedAttributes	TokenNameIdentifier	 move Specified Attributes
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Setup the default attributes. */	TokenNameCOMMENT_JAVADOC	 Setup the default attributes. 
protected	TokenNameprotected	
void	TokenNamevoid	
setupDefaultAttributes	TokenNameIdentifier	 setup Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
defaults	TokenNameIdentifier	 defaults
=	TokenNameEQUAL	
getDefaultAttributes	TokenNameIdentifier	 get Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeMap	TokenNameIdentifier	 Attribute Map
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
defaults	TokenNameIdentifier	 defaults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Reconcile default attributes. */	TokenNameCOMMENT_JAVADOC	 Reconcile default attributes. 
protected	TokenNameprotected	
void	TokenNamevoid	
reconcileDefaultAttributes	TokenNameIdentifier	 reconcile Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
defaults	TokenNameIdentifier	 defaults
=	TokenNameEQUAL	
getDefaultAttributes	TokenNameIdentifier	 get Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
reconcileDefaults	TokenNameIdentifier	 reconcile Defaults
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Get the default attributes. */	TokenNameCOMMENT_JAVADOC	 Get the default attributes. 
protected	TokenNameprotected	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
getDefaultAttributes	TokenNameIdentifier	 get Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
doctype	TokenNameIdentifier	 doctype
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getDoctype	TokenNameIdentifier	 get Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ElementDefinitionImpl	TokenNameIdentifier	 Element Definition Impl
eldef	TokenNameIdentifier	 eldef
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementDefinitionImpl	TokenNameIdentifier	 Element Definition Impl
)	TokenNameRPAREN	
doctype	TokenNameIdentifier	 doctype
.	TokenNameDOT	
getElements	TokenNameIdentifier	 get Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eldef	TokenNameIdentifier	 eldef
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
)	TokenNameRPAREN	
eldef	TokenNameIdentifier	 eldef
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getDefaultAttributes() 	TokenNameCOMMENT_LINE	getDefaultAttributes() 
// 	TokenNameCOMMENT_LINE	 
// ElementTraversal methods 	TokenNameCOMMENT_LINE	ElementTraversal methods 
// 	TokenNameCOMMENT_LINE	 
/** * @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-childElementCount"> * Element Traversal Specification</a> */	TokenNameCOMMENT_JAVADOC	 @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-childElementCount"> Element Traversal Specification</a> 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getChildElementCount	TokenNameIdentifier	 get Child Element Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getFirstElementChild	TokenNameIdentifier	 get First Element Child
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
++	TokenNamePLUS_PLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
getNextElementSibling	TokenNameIdentifier	 get Next Element Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getChildElementCount():int 	TokenNameCOMMENT_LINE	getChildElementCount():int 
/** * @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-firstElementChild"> * Element Traversal Specification</a> */	TokenNameCOMMENT_JAVADOC	 @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-firstElementChild"> Element Traversal Specification</a> 
public	TokenNamepublic	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
getFirstElementChild	TokenNameIdentifier	 get First Element Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getFirstElementChild	TokenNameIdentifier	 get First Element Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstElementChild():Element 	TokenNameCOMMENT_LINE	getFirstElementChild():Element 
/** * @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-lastElementChild"> * Element Traversal Specification</a> */	TokenNameCOMMENT_JAVADOC	 @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-lastElementChild"> Element Traversal Specification</a> 
public	TokenNamepublic	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
getLastElementChild	TokenNameIdentifier	 get Last Element Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getLastElementChild	TokenNameIdentifier	 get Last Element Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastElementChild():Element 	TokenNameCOMMENT_LINE	getLastElementChild():Element 
/** * @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-nextElementSibling"> * Element Traversal Specification</a> */	TokenNameCOMMENT_JAVADOC	 @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-nextElementSibling"> Element Traversal Specification</a> 
public	TokenNamepublic	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
getNextElementSibling	TokenNameIdentifier	 get Next Element Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getNextLogicalSibling	TokenNameIdentifier	 get Next Logical Sibling
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getFirstElementChild	TokenNameIdentifier	 get First Element Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getNextLogicalSibling	TokenNameIdentifier	 get Next Logical Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextElementSibling():Element 	TokenNameCOMMENT_LINE	getNextElementSibling():Element 
/** * @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-previousElementSibling"> * Element Traversal Specification</a> */	TokenNameCOMMENT_JAVADOC	 @see <a href="http://www.w3.org/TR/2008/REC-ElementTraversal-20081222/#attribute-previousElementSibling"> Element Traversal Specification</a> 
public	TokenNamepublic	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
getPreviousElementSibling	TokenNameIdentifier	 get Previous Element Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getPreviousLogicalSibling	TokenNameIdentifier	 get Previous Logical Sibling
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getLastElementChild	TokenNameIdentifier	 get Last Element Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getPreviousLogicalSibling	TokenNameIdentifier	 get Previous Logical Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getPreviousElementSibling():Element 	TokenNameCOMMENT_LINE	getPreviousElementSibling():Element 
// Returns the first element node found from a 	TokenNameCOMMENT_LINE	Returns the first element node found from a 
// non-recursive in order traversal of the given node. 	TokenNameCOMMENT_LINE	non-recursive in order traversal of the given node. 
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
getFirstElementChild	TokenNameIdentifier	 get First Element Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
top	TokenNameIdentifier	 top
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFirstElementChild(Node):Element 	TokenNameCOMMENT_LINE	getFirstElementChild(Node):Element 
// Returns the first element node found from a 	TokenNameCOMMENT_LINE	Returns the first element node found from a 
// non-recursive reverse order traversal of the given node. 	TokenNameCOMMENT_LINE	non-recursive reverse order traversal of the given node. 
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
getLastElementChild	TokenNameIdentifier	 get Last Element Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
top	TokenNameIdentifier	 top
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLastElementChild(Node):Element 	TokenNameCOMMENT_LINE	getLastElementChild(Node):Element 
// Returns the next logical sibling with respect to the given node. 	TokenNameCOMMENT_LINE	Returns the next logical sibling with respect to the given node. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
getNextLogicalSibling	TokenNameIdentifier	 get Next Logical Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If "n" has no following sibling and its parent is an entity reference node we 	TokenNameCOMMENT_LINE	If "n" has no following sibling and its parent is an entity reference node we 
// need to continue the search through the following siblings of the entity 	TokenNameCOMMENT_LINE	need to continue the search through the following siblings of the entity 
// reference as these are logically siblings of the given node. 	TokenNameCOMMENT_LINE	reference as these are logically siblings of the given node. 
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNextLogicalSibling(Node):Node 	TokenNameCOMMENT_LINE	getNextLogicalSibling(Node):Node 
// Returns the previous logical sibling with respect to the given node. 	TokenNameCOMMENT_LINE	Returns the previous logical sibling with respect to the given node. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
getPreviousLogicalSibling	TokenNameIdentifier	 get Previous Logical Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If "n" has no previous sibling and its parent is an entity reference node we 	TokenNameCOMMENT_LINE	If "n" has no previous sibling and its parent is an entity reference node we 
// need to continue the search through the previous siblings of the entity 	TokenNameCOMMENT_LINE	need to continue the search through the previous siblings of the entity 
// reference as these are logically siblings of the given node. 	TokenNameCOMMENT_LINE	reference as these are logically siblings of the given node. 
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getPreviousLogicalSibling(Node):Node 	TokenNameCOMMENT_LINE	getPreviousLogicalSibling(Node):Node 
}	TokenNameRBRACE	
// class ElementImpl 	TokenNameCOMMENT_LINE	class ElementImpl 
