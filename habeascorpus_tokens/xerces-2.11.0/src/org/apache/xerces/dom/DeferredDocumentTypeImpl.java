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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class represents a Document Type <em>declaraction</em> in * the document itself, <em>not</em> a Document Type Definition (DTD). * An XML document may (or may not) have such a reference. * <P> * DocumentType is an Extended DOM feature, used in XML documents but * not in HTML. * <P> * Note that Entities and Notations are no longer children of the * DocumentType, but are parentless nodes hung only in their * appropriate NamedNodeMaps. * <P> * This area is UNDERSPECIFIED IN REC-DOM-Level-1-19981001 * Most notably, absolutely no provision was made for storing * and using Element and Attribute information. Nor was the linkage * between Entities and Entity References nailed down solidly. * * @xerces.internal * * @version $Id: DeferredDocumentTypeImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 This class represents a Document Type <em>declaraction</em> in the document itself, <em>not</em> a Document Type Definition (DTD). An XML document may (or may not) have such a reference. <P> DocumentType is an Extended DOM feature, used in XML documents but not in HTML. <P> Note that Entities and Notations are no longer children of the DocumentType, but are parentless nodes hung only in their appropriate NamedNodeMaps. <P> This area is UNDERSPECIFIED IN REC-DOM-Level-1-19981001 Most notably, absolutely no provision was made for storing and using Element and Attribute information. Nor was the linkage between Entities and Entity References nailed down solidly. * @xerces.internal * @version $Id: DeferredDocumentTypeImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
DeferredDocumentTypeImpl	TokenNameIdentifier	 Deferred Document Type Impl
extends	TokenNameextends	
DocumentTypeImpl	TokenNameIdentifier	 Document Type Impl
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
2172579663227313509L	TokenNameLongLiteral	
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
/** * This is the deferred constructor. Only the fNodeIndex is given here. * All other data, can be requested from the ownerDocument via the index. */	TokenNameCOMMENT_JAVADOC	 This is the deferred constructor. Only the fNodeIndex is given here. All other data, can be requested from the ownerDocument via the index. 
DeferredDocumentTypeImpl	TokenNameIdentifier	 Deferred Document Type Impl
(	TokenNameLPAREN	
DeferredDocumentImpl	TokenNameIdentifier	 Deferred Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNodeIndex	TokenNameIdentifier	 f Node Index
=	TokenNameEQUAL	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(DeferredDocumentImpl,int) 	TokenNameCOMMENT_LINE	<init>(DeferredDocumentImpl,int) 
// 	TokenNameCOMMENT_LINE	 
// DeferredNode methods 	TokenNameCOMMENT_LINE	DeferredNode methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the node index. */	TokenNameCOMMENT_JAVADOC	 Returns the node index. 
public	TokenNamepublic	
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
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// public and system ids 	TokenNameCOMMENT_LINE	public and system ids 
publicID	TokenNameIdentifier	 public ID
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
systemID	TokenNameIdentifier	 system ID
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeURI	TokenNameIdentifier	 get Node URI
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extraDataIndex	TokenNameIdentifier	 extra Data Index
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
internalSubset	TokenNameIdentifier	 internal Subset
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
extraDataIndex	TokenNameIdentifier	 extra Data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeData() 	TokenNameCOMMENT_LINE	synchronizeData() 
/** Synchronizes the entities, notations, and elements. */	TokenNameCOMMENT_JAVADOC	 Synchronizes the entities, notations, and elements. 
protected	TokenNameprotected	
void	TokenNamevoid	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we don't want to generate any event for this so turn them off 	TokenNameCOMMENT_LINE	we don't want to generate any event for this so turn them off 
boolean	TokenNameboolean	
orig	TokenNameIdentifier	 orig
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMutationEvents	TokenNameIdentifier	 get Mutation Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMutationEvents	TokenNameIdentifier	 set Mutation Events
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no need to synchronize again 	TokenNameCOMMENT_LINE	no need to synchronize again 
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create new node maps 	TokenNameCOMMENT_LINE	create new node maps 
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
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
new	TokenNamenew	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fill node maps 	TokenNameCOMMENT_LINE	fill node maps 
DeferredNode	TokenNameIdentifier	 Deferred Node
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DeferredNode	TokenNameIdentifier	 Deferred Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeObject	TokenNameIdentifier	 get Node Object
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
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
// internal, external, and unparsed entities 	TokenNameCOMMENT_LINE	internal, external, and unparsed entities 
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
entities	TokenNameIdentifier	 entities
.	TokenNameDOT	
setNamedItem	TokenNameIdentifier	 set Named Item
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// notations 	TokenNameCOMMENT_LINE	notations 
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
notations	TokenNameIdentifier	 notations
.	TokenNameDOT	
setNamedItem	TokenNameIdentifier	 set Named Item
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// element definitions 	TokenNameCOMMENT_LINE	element definitions 
case	TokenNamecase	
NodeImpl	TokenNameIdentifier	 Node Impl
.	TokenNameDOT	
ELEMENT_DEFINITION_NODE	TokenNameIdentifier	 ELEMENT  DEFINITION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
setNamedItem	TokenNameIdentifier	 set Named Item
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// elements 	TokenNameCOMMENT_LINE	elements 
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DocumentImpl	TokenNameIdentifier	 Document Impl
)	TokenNameRPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
allowGrammarAccess	TokenNameIdentifier	 allow Grammar Access
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// NOTE: Should never get here! -Ac 	TokenNameCOMMENT_LINE	NOTE: Should never get here! -Ac 
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"DeferredDocumentTypeImpl"	TokenNameStringLiteral	DeferredDocumentTypeImpl
+	TokenNamePLUS	
"#synchronizeInfo: "	TokenNameStringLiteral	#synchronizeInfo: 
+	TokenNamePLUS	
"node.getNodeType() = "	TokenNameStringLiteral	node.getNodeType() = 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", class = "	TokenNameStringLiteral	, class = 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
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
}	TokenNameRBRACE	
// set mutation events flag back to its original value 	TokenNameCOMMENT_LINE	set mutation events flag back to its original value 
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMutationEvents	TokenNameIdentifier	 set Mutation Events
(	TokenNameLPAREN	
orig	TokenNameIdentifier	 orig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set entities and notations read_only per DOM spec 	TokenNameCOMMENT_LINE	set entities and notations read_only per DOM spec 
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeChildren() 	TokenNameCOMMENT_LINE	synchronizeChildren() 
}	TokenNameRBRACE	
// class DeferredDocumentTypeImpl 	TokenNameCOMMENT_LINE	class DeferredDocumentTypeImpl 
