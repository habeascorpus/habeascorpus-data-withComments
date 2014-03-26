/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * WARNING: because java doesn't support multi-inheritance some code is * duplicated. If you're changing this file you probably want to change * DeferredAttrImpl.java at the same time. */	TokenNameCOMMENT_BLOCK	 WARNING: because java doesn't support multi-inheritance some code is duplicated. If you're changing this file you probably want to change DeferredAttrImpl.java at the same time. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
/** * DeferredAttrNSImpl is to AttrNSImpl, what DeferredAttrImpl is to * AttrImpl. * * @xerces.internal * * @author Andy Clark, IBM * @author Arnaud Le Hors, IBM * @version $Id: DeferredAttrNSImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @see DeferredAttrImpl */	TokenNameCOMMENT_JAVADOC	 DeferredAttrNSImpl is to AttrNSImpl, what DeferredAttrImpl is to AttrImpl. * @xerces.internal * @author Andy Clark, IBM @author Arnaud Le Hors, IBM @version $Id: DeferredAttrNSImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @see DeferredAttrImpl 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DeferredAttrNSImpl	TokenNameIdentifier	 Deferred Attr NS Impl
extends	TokenNameextends	
AttrNSImpl	TokenNameIdentifier	 Attr NS Impl
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
6074924934945957154L	TokenNameLongLiteral	
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
DeferredAttrNSImpl	TokenNameIdentifier	 Deferred Attr NS Impl
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
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// extract prefix and local part from QName 	TokenNameCOMMENT_LINE	extract prefix and local part from QName 
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
int	TokenNameint	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeExtra	TokenNameIdentifier	 get Node Extra
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
&	TokenNameAND	
SPECIFIED	TokenNameIdentifier	 SPECIFIED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isIdAttribute	TokenNameIdentifier	 is Id Attribute
(	TokenNameLPAREN	
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
&	TokenNameAND	
ID	TokenNameIdentifier	 ID
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getNodeURI	TokenNameIdentifier	 get Node URI
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extraNode	TokenNameIdentifier	 extra Node
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
fNodeIndex	TokenNameIdentifier	 f Node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getTypeInfo	TokenNameIdentifier	 get Type Info
(	TokenNameLPAREN	
extraNode	TokenNameIdentifier	 extra Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronizeData() 	TokenNameCOMMENT_LINE	synchronizeData() 
/** * Synchronizes the node's children with the internal structure. * Fluffing the children at once solves a lot of work to keep * the two structures in sync. The problem gets worse when * editing the tree -- this makes it a lot easier. */	TokenNameCOMMENT_JAVADOC	 Synchronizes the node's children with the internal structure. Fluffing the children at once solves a lot of work to keep the two structures in sync. The problem gets worse when editing the tree -- this makes it a lot easier. 
protected	TokenNameprotected	
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
// class DeferredAttrImpl 	TokenNameCOMMENT_LINE	class DeferredAttrImpl 
