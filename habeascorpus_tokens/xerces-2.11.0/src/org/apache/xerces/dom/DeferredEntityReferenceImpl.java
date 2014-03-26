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
/** * EntityReference models the XML &entityname; syntax, when used for * entities defined by the DOM. Entities hardcoded into XML, such as * character entities, should instead have been translated into text * by the code which generated the DOM tree. * <P> * An XML processor has the alternative of fully expanding Entities * into the normal document tree. If it does so, no EntityReference nodes * will appear. * <P> * Similarly, non-validating XML processors are not required to read * or process entity declarations made in the external subset or * declared in external parameter entities. Hence, some applications * may not make the replacement value available for Parsed Entities * of these types. * <P> * EntityReference behaves as a read-only node, and the children of * the EntityReference (which reflect those of the Entity, and should * also be read-only) give its replacement value, if any. They are * supposed to automagically stay in synch if the DocumentType is * updated with new values for the Entity. * <P> * The defined behavior makes efficient storage difficult for the DOM * implementor. We can't just look aside to the Entity's definition * in the DocumentType since those nodes have the wrong parent (unless * we can come up with a clever "imaginary parent" mechanism). We * must at least appear to clone those children... which raises the * issue of keeping the reference synchronized with its parent. * This leads me back to the "cached image of centrally defined data" * solution, much as I dislike it. * <P> * For now I have decided, since REC-DOM-Level-1-19980818 doesn't * cover this in much detail, that synchronization doesn't have to be * considered while the user is deep in the tree. That is, if you're * looking within one of the EntityReferennce's children and the Entity * changes, you won't be informed; instead, you will continue to access * the same object -- which may or may not still be part of the tree. * This is the same behavior that obtains elsewhere in the DOM if the * subtree you're looking at is deleted from its parent, so it's * acceptable here. (If it really bothers folks, we could set things * up so deleted subtrees are walked and marked invalid, but that's * not part of the DOM's defined behavior.) * <P> * As a result, only the EntityReference itself has to be aware of * changes in the Entity. And it can take advantage of the same * structure-change-monitoring code I implemented to support * DeepNodeList. * * @xerces.internal * * @version $Id: DeferredEntityReferenceImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 EntityReference models the XML &entityname; syntax, when used for entities defined by the DOM. Entities hardcoded into XML, such as character entities, should instead have been translated into text by the code which generated the DOM tree. <P> An XML processor has the alternative of fully expanding Entities into the normal document tree. If it does so, no EntityReference nodes will appear. <P> Similarly, non-validating XML processors are not required to read or process entity declarations made in the external subset or declared in external parameter entities. Hence, some applications may not make the replacement value available for Parsed Entities of these types. <P> EntityReference behaves as a read-only node, and the children of the EntityReference (which reflect those of the Entity, and should also be read-only) give its replacement value, if any. They are supposed to automagically stay in synch if the DocumentType is updated with new values for the Entity. <P> The defined behavior makes efficient storage difficult for the DOM implementor. We can't just look aside to the Entity's definition in the DocumentType since those nodes have the wrong parent (unless we can come up with a clever "imaginary parent" mechanism). We must at least appear to clone those children... which raises the issue of keeping the reference synchronized with its parent. This leads me back to the "cached image of centrally defined data" solution, much as I dislike it. <P> For now I have decided, since REC-DOM-Level-1-19980818 doesn't cover this in much detail, that synchronization doesn't have to be considered while the user is deep in the tree. That is, if you're looking within one of the EntityReferennce's children and the Entity changes, you won't be informed; instead, you will continue to access the same object -- which may or may not still be part of the tree. This is the same behavior that obtains elsewhere in the DOM if the subtree you're looking at is deleted from its parent, so it's acceptable here. (If it really bothers folks, we could set things up so deleted subtrees are walked and marked invalid, but that's not part of the DOM's defined behavior.) <P> As a result, only the EntityReference itself has to be aware of changes in the Entity. And it can take advantage of the same structure-change-monitoring code I implemented to support DeepNodeList. * @xerces.internal * @version $Id: DeferredEntityReferenceImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
DeferredEntityReferenceImpl	TokenNameIdentifier	 Deferred Entity Reference Impl
extends	TokenNameextends	
EntityReferenceImpl	TokenNameIdentifier	 Entity Reference Impl
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
390319091370032223L	TokenNameLongLiteral	
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
DeferredEntityReferenceImpl	TokenNameIdentifier	 Deferred Entity Reference Impl
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
/** * Synchronize the entity data. This is special because of the way * that the "fast" version stores the information. */	TokenNameCOMMENT_JAVADOC	 Synchronize the entity data. This is special because of the way that the "fast" version stores the information. 
protected	TokenNameprotected	
void	TokenNamevoid	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no need to sychronize again 	TokenNameCOMMENT_LINE	no need to sychronize again 
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the node data 	TokenNameCOMMENT_LINE	get the node data 
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
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeData() 	TokenNameCOMMENT_LINE	synchronizeData() 
/** Synchronize the children. */	TokenNameCOMMENT_JAVADOC	 Synchronize the children. 
protected	TokenNameprotected	
void	TokenNamevoid	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no need to synchronize again 	TokenNameCOMMENT_LINE	no need to synchronize again 
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get children 	TokenNameCOMMENT_LINE	get children 
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeChildren() 	TokenNameCOMMENT_LINE	synchronizeChildren() 
}	TokenNameRBRACE	
// class DeferredEntityReferenceImpl 	TokenNameCOMMENT_LINE	class DeferredEntityReferenceImpl 
