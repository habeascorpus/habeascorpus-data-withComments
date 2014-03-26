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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
DocumentType	TokenNameIdentifier	 Document Type
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
UserDataHandler	TokenNameIdentifier	 User Data Handler
;	TokenNameSEMICOLON	
/** * This class represents a Document Type <em>declaraction</em> in * the document itself, <em>not</em> a Document Type Definition (DTD). * An XML document may (or may not) have such a reference. * <P> * DocumentType is an Extended DOM feature, used in XML documents but * not in HTML. * <P> * Note that Entities and Notations are no longer children of the * DocumentType, but are parentless nodes hung only in their * appropriate NamedNodeMaps. * <P> * This area is UNDERSPECIFIED IN REC-DOM-Level-1-19981001 * Most notably, absolutely no provision was made for storing * and using Element and Attribute information. Nor was the linkage * between Entities and Entity References nailed down solidly. * * @xerces.internal * * @author Arnaud Le Hors, IBM * @author Joe Kesselman, IBM * @author Andy Clark, IBM * @version $Id: DocumentTypeImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 This class represents a Document Type <em>declaraction</em> in the document itself, <em>not</em> a Document Type Definition (DTD). An XML document may (or may not) have such a reference. <P> DocumentType is an Extended DOM feature, used in XML documents but not in HTML. <P> Note that Entities and Notations are no longer children of the DocumentType, but are parentless nodes hung only in their appropriate NamedNodeMaps. <P> This area is UNDERSPECIFIED IN REC-DOM-Level-1-19981001 Most notably, absolutely no provision was made for storing and using Element and Attribute information. Nor was the linkage between Entities and Entity References nailed down solidly. * @xerces.internal * @author Arnaud Le Hors, IBM @author Joe Kesselman, IBM @author Andy Clark, IBM @version $Id: DocumentTypeImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
extends	TokenNameextends	
ParentNode	TokenNameIdentifier	 Parent Node
implements	TokenNameimplements	
DocumentType	TokenNameIdentifier	 Document Type
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
7751299192316526485L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Document type name. */	TokenNameCOMMENT_JAVADOC	 Document type name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** Entities. */	TokenNameCOMMENT_JAVADOC	 Entities. 
protected	TokenNameprotected	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
entities	TokenNameIdentifier	 entities
;	TokenNameSEMICOLON	
/** Notations. */	TokenNameCOMMENT_JAVADOC	 Notations. 
protected	TokenNameprotected	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
notations	TokenNameIdentifier	 notations
;	TokenNameSEMICOLON	
// NON-DOM 	TokenNameCOMMENT_LINE	NON-DOM 
/** Elements. */	TokenNameCOMMENT_JAVADOC	 Elements. 
protected	TokenNameprotected	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
elements	TokenNameIdentifier	 elements
;	TokenNameSEMICOLON	
// DOM2: support public ID. 	TokenNameCOMMENT_LINE	DOM2: support public ID. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
publicID	TokenNameIdentifier	 public ID
;	TokenNameSEMICOLON	
// DOM2: support system ID. 	TokenNameCOMMENT_LINE	DOM2: support system ID. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
;	TokenNameSEMICOLON	
// DOM2: support internal subset. 	TokenNameCOMMENT_LINE	DOM2: support internal subset. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
internalSubset	TokenNameIdentifier	 internal Subset
;	TokenNameSEMICOLON	
/** The following are required for compareDocumentPosition */	TokenNameCOMMENT_JAVADOC	 The following are required for compareDocumentPosition 
// Doctype number. Doc types which have no owner may be assigned 	TokenNameCOMMENT_LINE	Doctype number. Doc types which have no owner may be assigned 
// a number, on demand, for ordering purposes for compareDocumentPosition 	TokenNameCOMMENT_LINE	a number, on demand, for ordering purposes for compareDocumentPosition 
private	TokenNameprivate	
int	TokenNameint	
doctypeNumber	TokenNameIdentifier	 doctype Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
userData	TokenNameIdentifier	 user Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Factory method for creating a document type node. */	TokenNameCOMMENT_JAVADOC	 Factory method for creating a document type node. 
public	TokenNamepublic	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
// DOM 	TokenNameCOMMENT_LINE	DOM 
entities	TokenNameIdentifier	 entities
=	TokenNameEQUAL	
new	TokenNamenew	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notations	TokenNameIdentifier	 notations
=	TokenNameEQUAL	
new	TokenNamenew	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NON-DOM 	TokenNameCOMMENT_LINE	NON-DOM 
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
new	TokenNamenew	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(CoreDocumentImpl,String) 	TokenNameCOMMENT_LINE	<init>(CoreDocumentImpl,String) 
/** Factory method for creating a document type node. */	TokenNameCOMMENT_JAVADOC	 Factory method for creating a document type node. 
public	TokenNamepublic	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicID	TokenNameIdentifier	 public ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
publicID	TokenNameIdentifier	 public ID
=	TokenNameEQUAL	
publicID	TokenNameIdentifier	 public ID
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
systemID	TokenNameIdentifier	 system ID
=	TokenNameEQUAL	
systemID	TokenNameIdentifier	 system ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(CoreDocumentImpl,String) 	TokenNameCOMMENT_LINE	<init>(CoreDocumentImpl,String) 
// 	TokenNameCOMMENT_LINE	 
// DOM2: methods. 	TokenNameCOMMENT_LINE	DOM2: methods. 
// 	TokenNameCOMMENT_LINE	 
/** * Introduced in DOM Level 2. <p> * * Return the public identifier of this Document type. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Return the public identifier of this Document type. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
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
publicID	TokenNameIdentifier	 public ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * Return the system identifier of this Document type. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Return the system identifier of this Document type. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
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
systemID	TokenNameIdentifier	 system ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM. <p> * * Set the internalSubset given as a string. */	TokenNameCOMMENT_JAVADOC	 NON-DOM. <p> * Set the internalSubset given as a string. 
public	TokenNamepublic	
void	TokenNamevoid	
setInternalSubset	TokenNameIdentifier	 set Internal Subset
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
internalSubset	TokenNameIdentifier	 internal Subset
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
internalSubset	TokenNameIdentifier	 internal Subset
=	TokenNameEQUAL	
internalSubset	TokenNameIdentifier	 internal Subset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Introduced in DOM Level 2. <p> * * Return the internalSubset given as a string. * @since WD-DOM-Level-2-19990923 */	TokenNameCOMMENT_JAVADOC	 Introduced in DOM Level 2. <p> * Return the internalSubset given as a string. @since WD-DOM-Level-2-19990923 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInternalSubset	TokenNameIdentifier	 get Internal Subset
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
internalSubset	TokenNameIdentifier	 internal Subset
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
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the document type name */	TokenNameCOMMENT_JAVADOC	 Returns the document type name 
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
/** Clones the node. */	TokenNameCOMMENT_JAVADOC	 Clones the node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
newnode	TokenNameIdentifier	 newnode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NamedNodeMaps must be cloned explicitly, to avoid sharing them. 	TokenNameCOMMENT_LINE	NamedNodeMaps must be cloned explicitly, to avoid sharing them. 
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
entities	TokenNameIdentifier	 entities
=	TokenNameEQUAL	
entities	TokenNameIdentifier	 entities
.	TokenNameDOT	
cloneMap	TokenNameIdentifier	 clone Map
(	TokenNameLPAREN	
newnode	TokenNameIdentifier	 newnode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
notations	TokenNameIdentifier	 notations
=	TokenNameEQUAL	
notations	TokenNameIdentifier	 notations
.	TokenNameDOT	
cloneMap	TokenNameIdentifier	 clone Map
(	TokenNameLPAREN	
newnode	TokenNameIdentifier	 newnode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
cloneMap	TokenNameIdentifier	 clone Map
(	TokenNameLPAREN	
newnode	TokenNameIdentifier	 newnode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newnode	TokenNameIdentifier	 newnode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// cloneNode(boolean):Node 	TokenNameCOMMENT_LINE	cloneNode(boolean):Node 
/* * Get Node text content * @since DOM Level 3 */	TokenNameCOMMENT_BLOCK	 Get Node text content @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Set Node text content * @since DOM Level 3 */	TokenNameCOMMENT_BLOCK	 Set Node text content @since DOM Level 3 
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
// no-op 	TokenNameCOMMENT_LINE	no-op 
}	TokenNameRBRACE	
/** * DOM Level 3 WD- Experimental. * Override inherited behavior from ParentNodeImpl to support deep equal. */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD- Experimental. Override inherited behavior from ParentNodeImpl to support deep equal. 
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
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
argDocType	TokenNameIdentifier	 arg Doc Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
)	TokenNameRPAREN	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
//test if the following string attributes are equal: publicId, 	TokenNameCOMMENT_LINE	test if the following string attributes are equal: publicId, 
//systemId, internalSubset. 	TokenNameCOMMENT_LINE	systemId, internalSubset. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
getInternalSubset	TokenNameIdentifier	 get Internal Subset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
getInternalSubset	TokenNameIdentifier	 get Internal Subset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
getInternalSubset	TokenNameIdentifier	 get Internal Subset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
getInternalSubset	TokenNameIdentifier	 get Internal Subset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getInternalSubset	TokenNameIdentifier	 get Internal Subset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getInternalSubset	TokenNameIdentifier	 get Internal Subset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
getInternalSubset	TokenNameIdentifier	 get Internal Subset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//test if NamedNodeMaps entities and notations are equal 	TokenNameCOMMENT_LINE	test if NamedNodeMaps entities and notations are equal 
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
argEntities	TokenNameIdentifier	 arg Entities
=	TokenNameEQUAL	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
entities	TokenNameIdentifier	 entities
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
entities	TokenNameIdentifier	 entities
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argEntities	TokenNameIdentifier	 arg Entities
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
entities	TokenNameIdentifier	 entities
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argEntities	TokenNameIdentifier	 arg Entities
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entities	TokenNameIdentifier	 entities
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argEntities	TokenNameIdentifier	 arg Entities
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entities	TokenNameIdentifier	 entities
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
argEntities	TokenNameIdentifier	 arg Entities
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
entities	TokenNameIdentifier	 entities
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
entNode1	TokenNameIdentifier	 ent Node1
=	TokenNameEQUAL	
entities	TokenNameIdentifier	 entities
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
entNode2	TokenNameIdentifier	 ent Node2
=	TokenNameEQUAL	
argEntities	TokenNameIdentifier	 arg Entities
.	TokenNameDOT	
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
entNode1	TokenNameIdentifier	 ent Node1
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
entNode1	TokenNameIdentifier	 ent Node1
)	TokenNameRPAREN	
.	TokenNameDOT	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
entNode2	TokenNameIdentifier	 ent Node2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
argNotations	TokenNameIdentifier	 arg Notations
=	TokenNameEQUAL	
argDocType	TokenNameIdentifier	 arg Doc Type
.	TokenNameDOT	
notations	TokenNameIdentifier	 notations
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
notations	TokenNameIdentifier	 notations
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argNotations	TokenNameIdentifier	 arg Notations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
notations	TokenNameIdentifier	 notations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argNotations	TokenNameIdentifier	 arg Notations
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
notations	TokenNameIdentifier	 notations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argNotations	TokenNameIdentifier	 arg Notations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
notations	TokenNameIdentifier	 notations
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
argNotations	TokenNameIdentifier	 arg Notations
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
notations	TokenNameIdentifier	 notations
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
noteNode1	TokenNameIdentifier	 note Node1
=	TokenNameEQUAL	
notations	TokenNameIdentifier	 notations
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
noteNode2	TokenNameIdentifier	 note Node2
=	TokenNameEQUAL	
argNotations	TokenNameIdentifier	 arg Notations
.	TokenNameDOT	
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
noteNode1	TokenNameIdentifier	 note Node1
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
noteNode1	TokenNameIdentifier	 note Node1
)	TokenNameRPAREN	
.	TokenNameDOT	
isEqualNode	TokenNameIdentifier	 is Equal Node
(	TokenNameLPAREN	
noteNode2	TokenNameIdentifier	 note Node2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//end isEqualNode 	TokenNameCOMMENT_LINE	end isEqualNode 
/** * NON-DOM * set the ownerDocument of this node and its children */	TokenNameCOMMENT_JAVADOC	 NON-DOM set the ownerDocument of this node and its children 
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
entities	TokenNameIdentifier	 entities
.	TokenNameDOT	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notations	TokenNameIdentifier	 notations
.	TokenNameDOT	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** NON-DOM Get the number associated with this doctype. */	TokenNameCOMMENT_JAVADOC	 NON-DOM Get the number associated with this doctype. 
protected	TokenNameprotected	
int	TokenNameint	
getNodeNumber	TokenNameIdentifier	 get Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the doctype has a document owner, get the node number 	TokenNameCOMMENT_LINE	If the doctype has a document owner, get the node number 
// relative to the owner doc 	TokenNameCOMMENT_LINE	relative to the owner doc 
if	TokenNameif	
(	TokenNameLPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getNodeNumber	TokenNameIdentifier	 get Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The doctype is disconnected and not associated with any document. 	TokenNameCOMMENT_LINE	The doctype is disconnected and not associated with any document. 
// Assign the doctype a number relative to the implementation. 	TokenNameCOMMENT_LINE	Assign the doctype a number relative to the implementation. 
if	TokenNameif	
(	TokenNameLPAREN	
doctypeNumber	TokenNameIdentifier	 doctype Number
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CoreDOMImplementationImpl	TokenNameIdentifier	 Core DOM Implementation Impl
cd	TokenNameIdentifier	 cd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CoreDOMImplementationImpl	TokenNameIdentifier	 Core DOM Implementation Impl
)	TokenNameRPAREN	
CoreDOMImplementationImpl	TokenNameIdentifier	 Core DOM Implementation Impl
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doctypeNumber	TokenNameIdentifier	 doctype Number
=	TokenNameEQUAL	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
assignDocTypeNumber	TokenNameIdentifier	 assign Doc Type Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doctypeNumber	TokenNameIdentifier	 doctype Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// DocumentType methods 	TokenNameCOMMENT_LINE	DocumentType methods 
// 	TokenNameCOMMENT_LINE	 
/** * Name of this document type. If we loaded from a DTD, this should * be the name immediately following the DOCTYPE keyword. */	TokenNameCOMMENT_JAVADOC	 Name of this document type. If we loaded from a DTD, this should be the name immediately following the DOCTYPE keyword. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
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
// getName():String 	TokenNameCOMMENT_LINE	getName():String 
/** * Access the collection of general Entities, both external and * internal, defined in the DTD. For example, in: * <p> * <pre> * &lt;!doctype example SYSTEM "ex.dtd" [ * &lt;!ENTITY foo "foo"&gt; * &lt;!ENTITY bar "bar"&gt; * &lt;!ENTITY % baz "baz"&gt; * ]&gt; * </pre> * <p> * The Entities map includes foo and bar, but not baz. It is promised that * only Nodes which are Entities will exist in this NamedNodeMap. * <p> * For HTML, this will always be null. * <p> * Note that "built in" entities such as &amp; and &lt; should be * converted to their actual characters before being placed in the DOM's * contained text, and should be converted back when the DOM is rendered * as XML or HTML, and hence DO NOT appear here. */	TokenNameCOMMENT_JAVADOC	 Access the collection of general Entities, both external and internal, defined in the DTD. For example, in: <p> <pre> &lt;!doctype example SYSTEM "ex.dtd" [ &lt;!ENTITY foo "foo"&gt; &lt;!ENTITY bar "bar"&gt; &lt;!ENTITY % baz "baz"&gt; ]&gt; </pre> <p> The Entities map includes foo and bar, but not baz. It is promised that only Nodes which are Entities will exist in this NamedNodeMap. <p> For HTML, this will always be null. <p> Note that "built in" entities such as &amp; and &lt; should be converted to their actual characters before being placed in the DOM's contained text, and should be converted back when the DOM is rendered as XML or HTML, and hence DO NOT appear here. 
public	TokenNamepublic	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
getEntities	TokenNameIdentifier	 get Entities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
return	TokenNamereturn	
entities	TokenNameIdentifier	 entities
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Access the collection of Notations defined in the DTD. A * notation declares, by name, the format of an XML unparsed entity * or is used to formally declare a Processing Instruction target. */	TokenNameCOMMENT_JAVADOC	 Access the collection of Notations defined in the DTD. A notation declares, by name, the format of an XML unparsed entity or is used to formally declare a Processing Instruction target. 
public	TokenNamepublic	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
getNotations	TokenNameIdentifier	 get Notations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
return	TokenNamereturn	
notations	TokenNameIdentifier	 notations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * NON-DOM: Subclassed to flip the entities' and notations' readonly switch * as well. * @see NodeImpl#setReadOnly */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Subclassed to flip the entities' and notations' readonly switch as well. @see NodeImpl#setReadOnly 
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
super	TokenNamesuper	
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set read-only property 	TokenNameCOMMENT_LINE	set read-only property 
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entities	TokenNameIdentifier	 entities
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notations	TokenNameIdentifier	 notations
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setReadOnly(boolean,boolean) 	TokenNameCOMMENT_LINE	setReadOnly(boolean,boolean) 
/** * NON-DOM: Access the collection of ElementDefinitions. * @see ElementDefinitionImpl */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Access the collection of ElementDefinitions. @see ElementDefinitionImpl 
public	TokenNamepublic	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
getElements	TokenNameIdentifier	 get Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
return	TokenNamereturn	
elements	TokenNameIdentifier	 elements
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
userData	TokenNameIdentifier	 user Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
userData	TokenNameIdentifier	 user Data
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userData	TokenNameIdentifier	 user Data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
userData	TokenNameIdentifier	 user Data
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UserDataRecord	TokenNameIdentifier	 User Data Record
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UserDataRecord	TokenNameIdentifier	 User Data Record
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
fData	TokenNameIdentifier	 f Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
userData	TokenNameIdentifier	 user Data
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
UserDataRecord	TokenNameIdentifier	 User Data Record
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UserDataRecord	TokenNameIdentifier	 User Data Record
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UserDataRecord	TokenNameIdentifier	 User Data Record
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
fData	TokenNameIdentifier	 f Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userData	TokenNameIdentifier	 user Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
userData	TokenNameIdentifier	 user Data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UserDataRecord	TokenNameIdentifier	 User Data Record
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UserDataRecord	TokenNameIdentifier	 User Data Record
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
fData	TokenNameIdentifier	 f Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
getUserDataRecord	TokenNameIdentifier	 get User Data Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userData	TokenNameIdentifier	 user Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DocumentTypeImpl 	TokenNameCOMMENT_LINE	class DocumentTypeImpl 
