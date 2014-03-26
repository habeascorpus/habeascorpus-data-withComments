/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * WARNING: because java doesn't support multi-inheritance some code is * duplicated. If you're changing this file you probably want to change * DeferredElementImpl.java at the same time. * * @version $Id: DeferredElementNSImpl.java 765972 2009-04-17 12:42:47Z mrglavas $ */	TokenNameCOMMENT_BLOCK	 WARNING: because java doesn't support multi-inheritance some code is duplicated. If you're changing this file you probably want to change DeferredElementImpl.java at the same time. * @version $Id: DeferredElementNSImpl.java 765972 2009-04-17 12:42:47Z mrglavas $ 
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
NamedNodeMap	TokenNameIdentifier	 Named Node Map
;	TokenNameSEMICOLON	
/** * DeferredElementNSImpl is to ElementNSImpl, what DeferredElementImpl is to * ElementImpl. * * @xerces.internal * * @see DeferredElementImpl */	TokenNameCOMMENT_JAVADOC	 DeferredElementNSImpl is to ElementNSImpl, what DeferredElementImpl is to ElementImpl. * @xerces.internal * @see DeferredElementImpl 
public	TokenNamepublic	
class	TokenNameclass	
DeferredElementNSImpl	TokenNameIdentifier	 Deferred Element NS Impl
extends	TokenNameextends	
ElementNSImpl	TokenNameIdentifier	 Element NS Impl
implements	TokenNameimplements	
DeferredNode	TokenNameIdentifier	 Deferred Node
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
5001885145370927385L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Node index. */	TokenNameCOMMENT_JAVADOC	 Node index. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fNodeIndex	TokenNameIdentifier	 f Node Index
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * This is the deferred constructor. Only the fNodeIndex is given here. All * other data, can be requested from the ownerDocument via the index. */	TokenNameCOMMENT_JAVADOC	 This is the deferred constructor. Only the fNodeIndex is given here. All other data, can be requested from the ownerDocument via the index. 
DeferredElementNSImpl	TokenNameIdentifier	 Deferred Element NS Impl
(	TokenNameLPAREN	
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
ownerDoc	TokenNameIdentifier	 owner Doc
,	TokenNameCOMMA	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDoc	TokenNameIdentifier	 owner Doc
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodeIndex	TokenNameIdentifier	 f Node Index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(DocumentImpl,int) 	TokenNameCOMMENT_LINE	<init>(DocumentImpl,int) 
// 	TokenNameCOMMENT_LINE	 
// DeferredNode methods 	TokenNameCOMMENT_LINE	DeferredNode methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the node index. */	TokenNameCOMMENT_JAVADOC	 Returns the node index. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getNodeIndex	TokenNameIdentifier	 get Node Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNodeIndex	TokenNameIdentifier	 f Node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** Synchronizes the data (name and value) for fast nodes. */	TokenNameCOMMENT_JAVADOC	 Synchronizes the data (name and value) for fast nodes. 
protected	TokenNameprotected	
final	TokenNamefinal	
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
// fluff data 	TokenNameCOMMENT_LINE	fluff data 
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ownerDocument	TokenNameIdentifier	 owner Document
;	TokenNameSEMICOLON	
// we don't want to generate any event for this so turn them off 	TokenNameCOMMENT_LINE	we don't want to generate any event for this so turn them off 
boolean	TokenNameboolean	
orig	TokenNameIdentifier	 orig
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
mutationEvents	TokenNameIdentifier	 mutation Events
;	TokenNameSEMICOLON	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
mutationEvents	TokenNameIdentifier	 mutation Events
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// extract local part from QName 	TokenNameCOMMENT_LINE	extract local part from QName 
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
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeURI	TokenNameIdentifier	 get Node URI
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getTypeInfo	TokenNameIdentifier	 get Type Info
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// attributes 	TokenNameCOMMENT_LINE	attributes 
setupDefaultAttributes	TokenNameIdentifier	 setup Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
seenSchemaDefault	TokenNameIdentifier	 seen Schema Default
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
AttrImpl	TokenNameIdentifier	 Attr Impl
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttrImpl	TokenNameIdentifier	 Attr Impl
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeObject	TokenNameIdentifier	 get Node Object
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Take special care of schema defaulted attributes. Calling the 	TokenNameCOMMENT_LINE	Take special care of schema defaulted attributes. Calling the 
// non-namespace aware setAttributeNode() method could overwrite 	TokenNameCOMMENT_LINE	non-namespace aware setAttributeNode() method could overwrite 
// another attribute with the same local name. 	TokenNameCOMMENT_LINE	another attribute with the same local name. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getSpecified	TokenNameIdentifier	 get Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
seenSchemaDefault	TokenNameIdentifier	 seen Schema Default
||	TokenNameOR_OR	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
&&	TokenNameAND_AND	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seenSchemaDefault	TokenNameIdentifier	 seen Schema Default
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
setNamedItemNS	TokenNameIdentifier	 set Named Item NS
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
setNamedItem	TokenNameIdentifier	 set Named Item
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attrIndex	TokenNameIdentifier	 attr Index
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set mutation events flag back to its original value 	TokenNameCOMMENT_LINE	set mutation events flag back to its original value 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
mutationEvents	TokenNameIdentifier	 mutation Events
=	TokenNameEQUAL	
orig	TokenNameIdentifier	 orig
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeData() 	TokenNameCOMMENT_LINE	synchronizeData() 
/** * Synchronizes the node's children with the internal structure. * Fluffing the children at once solves a lot of work to keep * the two structures in sync. The problem gets worse when * editing the tree -- this makes it a lot easier. */	TokenNameCOMMENT_JAVADOC	 Synchronizes the node's children with the internal structure. Fluffing the children at once solves a lot of work to keep the two structures in sync. The problem gets worse when editing the tree -- this makes it a lot easier. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeChildren() 	TokenNameCOMMENT_LINE	synchronizeChildren() 
}	TokenNameRBRACE	
// class DeferredElementImpl 	TokenNameCOMMENT_LINE	class DeferredElementImpl 
