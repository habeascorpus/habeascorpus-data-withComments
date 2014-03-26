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
/** * Entity nodes hold the reference data for an XML Entity -- either * parsed or unparsed. The nodeName (inherited from Node) will contain * the name (if any) of the Entity. Its data will be contained in the * Entity's children, in exactly the structure which an * EntityReference to this name will present within the document's * body. * <P> * Note that this object models the actual entity, _not_ the entity * declaration or the entity reference. * <P> * An XML processor may choose to completely expand entities before * the structure model is passed to the DOM; in this case, there will * be no EntityReferences in the DOM tree. * <P> * Quoting the 10/01 DOM Proposal, * <BLOCKQUOTE> * "The DOM Level 1 does not support editing Entity nodes; if a user * wants to make changes to the contents of an Entity, every related * EntityReference node has to be replaced in the structure model by * a clone of the Entity's contents, and then the desired changes * must be made to each of those clones instead. All the * descendants of an Entity node are readonly." * </BLOCKQUOTE> * I'm interpreting this as: It is the parser's responsibilty to call * the non-DOM operation setReadOnly(true,true) after it constructs * the Entity. Since the DOM explicitly decided not to deal with this, * _any_ answer will involve a non-DOM operation, and this is the * simplest solution. * * @xerces.internal * * @version $Id: DeferredEntityImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 Entity nodes hold the reference data for an XML Entity -- either parsed or unparsed. The nodeName (inherited from Node) will contain the name (if any) of the Entity. Its data will be contained in the Entity's children, in exactly the structure which an EntityReference to this name will present within the document's body. <P> Note that this object models the actual entity, _not_ the entity declaration or the entity reference. <P> An XML processor may choose to completely expand entities before the structure model is passed to the DOM; in this case, there will be no EntityReferences in the DOM tree. <P> Quoting the 10/01 DOM Proposal, <BLOCKQUOTE> "The DOM Level 1 does not support editing Entity nodes; if a user wants to make changes to the contents of an Entity, every related EntityReference node has to be replaced in the structure model by a clone of the Entity's contents, and then the desired changes must be made to each of those clones instead. All the descendants of an Entity node are readonly." </BLOCKQUOTE> I'm interpreting this as: It is the parser's responsibilty to call the non-DOM operation setReadOnly(true,true) after it constructs the Entity. Since the DOM explicitly decided not to deal with this, _any_ answer will involve a non-DOM operation, and this is the simplest solution. * @xerces.internal * @version $Id: DeferredEntityImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
DeferredEntityImpl	TokenNameIdentifier	 Deferred Entity Impl
extends	TokenNameextends	
EntityImpl	TokenNameIdentifier	 Entity Impl
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
4760180431078941638L	TokenNameLongLiteral	
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
DeferredEntityImpl	TokenNameIdentifier	 Deferred Entity Impl
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
// get the entity data 	TokenNameCOMMENT_LINE	get the entity data 
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
systemId	TokenNameIdentifier	 system Id
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
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
extraDataIndex	TokenNameIdentifier	 extra Data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notationName	TokenNameIdentifier	 notation Name
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
extraDataIndex	TokenNameIdentifier	 extra Data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// encoding and version DOM L3 	TokenNameCOMMENT_LINE	encoding and version DOM L3 
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
extraDataIndex	TokenNameIdentifier	 extra Data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeURI	TokenNameIdentifier	 get Node URI
(	TokenNameLPAREN	
extraDataIndex	TokenNameIdentifier	 extra Data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// baseURI, actualEncoding DOM L3 	TokenNameCOMMENT_LINE	baseURI, actualEncoding DOM L3 
int	TokenNameint	
extraIndex2	TokenNameIdentifier	 extra Index2
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
extraDataIndex	TokenNameIdentifier	 extra Data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
extraIndex2	TokenNameIdentifier	 extra Index2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inputEncoding	TokenNameIdentifier	 input Encoding
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
extraIndex2	TokenNameIdentifier	 extra Index2
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
// class DeferredEntityImpl 	TokenNameCOMMENT_LINE	class DeferredEntityImpl 
