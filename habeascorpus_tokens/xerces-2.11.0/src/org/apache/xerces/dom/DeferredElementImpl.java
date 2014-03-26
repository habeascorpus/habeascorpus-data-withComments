/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * WARNING: because java doesn't support multi-inheritance some code is * duplicated. If you're changing this file you probably want to change * DeferredElementNSImpl.java at the same time. */	TokenNameCOMMENT_BLOCK	 WARNING: because java doesn't support multi-inheritance some code is duplicated. If you're changing this file you probably want to change DeferredElementNSImpl.java at the same time. 
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
NamedNodeMap	TokenNameIdentifier	 Named Node Map
;	TokenNameSEMICOLON	
/** * Elements represent most of the "markup" and structure of the * document. They contain both the data for the element itself * (element name and attributes), and any contained nodes, including * document text (as children). * <P> * Elements may have Attributes associated with them; the API for this is * defined in Node, but the function is implemented here. In general, XML * applications should retrive Attributes as Nodes, since they may contain * entity references and hence be a fairly complex sub-tree. HTML users will * be dealing with simple string values, and convenience methods are provided * to work in terms of Strings. * <P> * DeferredElementImpl inherits from ElementImpl which does not support * Namespaces. DeferredElementNSImpl, which inherits from ElementNSImpl, does. * @see DeferredElementNSImpl * * @xerces.internal * * @version $Id: DeferredElementImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 Elements represent most of the "markup" and structure of the document. They contain both the data for the element itself (element name and attributes), and any contained nodes, including document text (as children). <P> Elements may have Attributes associated with them; the API for this is defined in Node, but the function is implemented here. In general, XML applications should retrive Attributes as Nodes, since they may contain entity references and hence be a fairly complex sub-tree. HTML users will be dealing with simple string values, and convenience methods are provided to work in terms of Strings. <P> DeferredElementImpl inherits from ElementImpl which does not support Namespaces. DeferredElementNSImpl, which inherits from ElementNSImpl, does. @see DeferredElementNSImpl * @xerces.internal * @version $Id: DeferredElementImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
DeferredElementImpl	TokenNameIdentifier	 Deferred Element Impl
extends	TokenNameextends	
ElementImpl	TokenNameIdentifier	 Element Impl
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
7670981133940934842L	TokenNameLongLiteral	
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
DeferredElementImpl	TokenNameIdentifier	 Deferred Element Impl
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
// attributes 	TokenNameCOMMENT_LINE	attributes 
setupDefaultAttributes	TokenNameIdentifier	 setup Default Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
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
index	TokenNameIdentifier	 index
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
do	TokenNamedo	
{	TokenNameLBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeObject	TokenNameIdentifier	 get Node Object
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
setNamedItem	TokenNameIdentifier	 set Named Item
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getPrevSibling	TokenNameIdentifier	 get Prev Sibling
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
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
