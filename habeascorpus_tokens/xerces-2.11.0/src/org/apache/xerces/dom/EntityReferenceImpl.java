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
DocumentType	TokenNameIdentifier	 Document Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
EntityReference	TokenNameIdentifier	 Entity Reference
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
/** * EntityReference models the XML &entityname; syntax, when used for * entities defined by the DOM. Entities hardcoded into XML, such as * character entities, should instead have been translated into text * by the code which generated the DOM tree. * <P> * An XML processor has the alternative of fully expanding Entities * into the normal document tree. If it does so, no EntityReference nodes * will appear. * <P> * Similarly, non-validating XML processors are not required to read * or process entity declarations made in the external subset or * declared in external parameter entities. Hence, some applications * may not make the replacement value available for Parsed Entities * of these types. * <P> * EntityReference behaves as a read-only node, and the children of * the EntityReference (which reflect those of the Entity, and should * also be read-only) give its replacement value, if any. They are * supposed to automagically stay in synch if the DocumentType is * updated with new values for the Entity. * <P> * The defined behavior makes efficient storage difficult for the DOM * implementor. We can't just look aside to the Entity's definition * in the DocumentType since those nodes have the wrong parent (unless * we can come up with a clever "imaginary parent" mechanism). We * must at least appear to clone those children... which raises the * issue of keeping the reference synchronized with its parent. * This leads me back to the "cached image of centrally defined data" * solution, much as I dislike it. * <P> * For now I have decided, since REC-DOM-Level-1-19980818 doesn't * cover this in much detail, that synchronization doesn't have to be * considered while the user is deep in the tree. That is, if you're * looking within one of the EntityReferennce's children and the Entity * changes, you won't be informed; instead, you will continue to access * the same object -- which may or may not still be part of the tree. * This is the same behavior that obtains elsewhere in the DOM if the * subtree you're looking at is deleted from its parent, so it's * acceptable here. (If it really bothers folks, we could set things * up so deleted subtrees are walked and marked invalid, but that's * not part of the DOM's defined behavior.) * <P> * As a result, only the EntityReference itself has to be aware of * changes in the Entity. And it can take advantage of the same * structure-change-monitoring code I implemented to support * DeepNodeList. * * @xerces.internal * * @author Arnaud Le Hors, IBM * @author Joe Kesselman, IBM * @author Andy Clark, IBM * @author Ralf Pfeiffer, IBM * @version $Id: EntityReferenceImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 EntityReference models the XML &entityname; syntax, when used for entities defined by the DOM. Entities hardcoded into XML, such as character entities, should instead have been translated into text by the code which generated the DOM tree. <P> An XML processor has the alternative of fully expanding Entities into the normal document tree. If it does so, no EntityReference nodes will appear. <P> Similarly, non-validating XML processors are not required to read or process entity declarations made in the external subset or declared in external parameter entities. Hence, some applications may not make the replacement value available for Parsed Entities of these types. <P> EntityReference behaves as a read-only node, and the children of the EntityReference (which reflect those of the Entity, and should also be read-only) give its replacement value, if any. They are supposed to automagically stay in synch if the DocumentType is updated with new values for the Entity. <P> The defined behavior makes efficient storage difficult for the DOM implementor. We can't just look aside to the Entity's definition in the DocumentType since those nodes have the wrong parent (unless we can come up with a clever "imaginary parent" mechanism). We must at least appear to clone those children... which raises the issue of keeping the reference synchronized with its parent. This leads me back to the "cached image of centrally defined data" solution, much as I dislike it. <P> For now I have decided, since REC-DOM-Level-1-19980818 doesn't cover this in much detail, that synchronization doesn't have to be considered while the user is deep in the tree. That is, if you're looking within one of the EntityReferennce's children and the Entity changes, you won't be informed; instead, you will continue to access the same object -- which may or may not still be part of the tree. This is the same behavior that obtains elsewhere in the DOM if the subtree you're looking at is deleted from its parent, so it's acceptable here. (If it really bothers folks, we could set things up so deleted subtrees are walked and marked invalid, but that's not part of the DOM's defined behavior.) <P> As a result, only the EntityReference itself has to be aware of changes in the Entity. And it can take advantage of the same structure-change-monitoring code I implemented to support DeepNodeList. * @xerces.internal * @author Arnaud Le Hors, IBM @author Joe Kesselman, IBM @author Andy Clark, IBM @author Ralf Pfeiffer, IBM @version $Id: EntityReferenceImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
EntityReferenceImpl	TokenNameIdentifier	 Entity Reference Impl
extends	TokenNameextends	
ParentNode	TokenNameIdentifier	 Parent Node
implements	TokenNameimplements	
EntityReference	TokenNameIdentifier	 Entity Reference
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
7381452955687102062L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Name of Entity referenced */	TokenNameCOMMENT_JAVADOC	 Name of Entity referenced 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** Base URI*/	TokenNameCOMMENT_JAVADOC	 Base URI
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
;	TokenNameSEMICOLON	
/** Entity changes. */	TokenNameCOMMENT_JAVADOC	 Entity changes. 
//protected int entityChanges = -1; 	TokenNameCOMMENT_LINE	protected int entityChanges = -1; 
/** Enable synchronize. */	TokenNameCOMMENT_JAVADOC	 Enable synchronize. 
//protected boolean fEnableSynchronize = false; 	TokenNameCOMMENT_LINE	protected boolean fEnableSynchronize = false; 
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Factory constructor. */	TokenNameCOMMENT_JAVADOC	 Factory constructor. 
public	TokenNamepublic	
EntityReferenceImpl	TokenNameIdentifier	 Entity Reference Impl
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
isReadOnly	TokenNameIdentifier	 is Read Only
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
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name of the entity referenced */	TokenNameCOMMENT_JAVADOC	 Returns the name of the entity referenced 
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
/** Clone node. */	TokenNameCOMMENT_JAVADOC	 Clone node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EntityReferenceImpl	TokenNameIdentifier	 Entity Reference Impl
er	TokenNameIdentifier	 er
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EntityReferenceImpl	TokenNameIdentifier	 Entity Reference Impl
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
er	TokenNameIdentifier	 er
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
er	TokenNameIdentifier	 er
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the absolute base URI of this node or null if the implementation * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a * null is returned. * * @return The absolute base URI of this node or null. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Returns the absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. Note: If the URI is malformed, a null is returned. * @return The absolute base URI of this node or null. @since DOM Level 3 
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
if	TokenNameif	
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentType	TokenNameIdentifier	 Document Type
doctype	TokenNameIdentifier	 doctype
;	TokenNameSEMICOLON	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
entities	TokenNameIdentifier	 entities
;	TokenNameSEMICOLON	
EntityImpl	TokenNameIdentifier	 Entity Impl
entDef	TokenNameIdentifier	 ent Def
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
=	TokenNameEQUAL	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDoctype	TokenNameIdentifier	 get Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
entities	TokenNameIdentifier	 entities
=	TokenNameEQUAL	
doctype	TokenNameIdentifier	 doctype
.	TokenNameDOT	
getEntities	TokenNameIdentifier	 get Entities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entDef	TokenNameIdentifier	 ent Def
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EntityImpl	TokenNameIdentifier	 Entity Impl
)	TokenNameRPAREN	
entities	TokenNameIdentifier	 entities
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
entDef	TokenNameIdentifier	 ent Def
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entDef	TokenNameIdentifier	 ent Def
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
baseURI	TokenNameIdentifier	 base URI
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
return	TokenNamereturn	
new	TokenNamenew	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
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
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: what should happen in this case? 	TokenNameCOMMENT_LINE	REVISIT: what should happen in this case? 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
baseURI	TokenNameIdentifier	 base URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** NON-DOM: set base uri*/	TokenNameCOMMENT_JAVADOC	 NON-DOM: set base uri
public	TokenNamepublic	
void	TokenNamevoid	
setBaseURI	TokenNameIdentifier	 set Base URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
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
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM: compute string representation of the entity reference. * This method is used to retrieve a string value for an attribute node that has child nodes. * @return String representing a value of this entity ref. or * null if any node other than EntityReference, Text is encountered * during computation */	TokenNameCOMMENT_JAVADOC	 NON-DOM: compute string representation of the entity reference. This method is used to retrieve a string value for an attribute node that has child nodes. @return String representing a value of this entity ref. or null if any node other than EntityReference, Text is encountered during computation 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getEntityRefValue	TokenNameIdentifier	 get Entity Ref Value
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
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EntityReferenceImpl	TokenNameIdentifier	 Entity Reference Impl
)	TokenNameRPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
.	TokenNameDOT	
getEntityRefValue	TokenNameIdentifier	 get Entity Ref Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// invalid to have other types of nodes in attr value 	TokenNameCOMMENT_LINE	invalid to have other types of nodes in attr value 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ChildNode	TokenNameIdentifier	 Child Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EntityReferenceImpl	TokenNameIdentifier	 Entity Reference Impl
)	TokenNameRPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
.	TokenNameDOT	
getEntityRefValue	TokenNameIdentifier	 get Entity Ref Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// invalid to have other types of nodes in attr value 	TokenNameCOMMENT_LINE	invalid to have other types of nodes in attr value 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * EntityReference's children are a reflection of those defined in the * named Entity. This method creates them if they haven't been created yet. * This doesn't support editing the Entity though, since this only called * once for all. */	TokenNameCOMMENT_JAVADOC	 EntityReference's children are a reflection of those defined in the named Entity. This method creates them if they haven't been created yet. This doesn't support editing the Entity though, since this only called once for all. 
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
DocumentType	TokenNameIdentifier	 Document Type
doctype	TokenNameIdentifier	 doctype
;	TokenNameSEMICOLON	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
entities	TokenNameIdentifier	 entities
;	TokenNameSEMICOLON	
EntityImpl	TokenNameIdentifier	 Entity Impl
entDef	TokenNameIdentifier	 ent Def
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
=	TokenNameEQUAL	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDoctype	TokenNameIdentifier	 get Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
entities	TokenNameIdentifier	 entities
=	TokenNameEQUAL	
doctype	TokenNameIdentifier	 doctype
.	TokenNameDOT	
getEntities	TokenNameIdentifier	 get Entities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entDef	TokenNameIdentifier	 ent Def
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EntityImpl	TokenNameIdentifier	 Entity Impl
)	TokenNameRPAREN	
entities	TokenNameIdentifier	 entities
.	TokenNameDOT	
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No Entity by this name, stop here. 	TokenNameCOMMENT_LINE	No Entity by this name, stop here. 
if	TokenNameif	
(	TokenNameLPAREN	
entDef	TokenNameIdentifier	 ent Def
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// If entity's definition exists, clone its kids 	TokenNameCOMMENT_LINE	If entity's definition exists, clone its kids 
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
defkid	TokenNameIdentifier	 defkid
=	TokenNameEQUAL	
entDef	TokenNameIdentifier	 ent Def
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defkid	TokenNameIdentifier	 defkid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
defkid	TokenNameIdentifier	 defkid
=	TokenNameEQUAL	
defkid	TokenNameIdentifier	 defkid
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
newkid	TokenNameIdentifier	 newkid
=	TokenNameEQUAL	
defkid	TokenNameIdentifier	 defkid
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newkid	TokenNameIdentifier	 newkid
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * NON-DOM: sets the node and its children value. * <P> * Note: make sure that entity reference and its kids could be set readonly. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: sets the node and its children value. <P> Note: make sure that entity reference and its kids could be set readonly. 
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
// Recursively set kids 	TokenNameCOMMENT_LINE	Recursively set kids 
for	TokenNamefor	
(	TokenNameLPAREN	
ChildNode	TokenNameIdentifier	 Child Node
mykid	TokenNameIdentifier	 mykid
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
mykid	TokenNameIdentifier	 mykid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mykid	TokenNameIdentifier	 mykid
=	TokenNameEQUAL	
mykid	TokenNameIdentifier	 mykid
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mykid	TokenNameIdentifier	 mykid
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
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setReadOnly(boolean,boolean) 	TokenNameCOMMENT_LINE	setReadOnly(boolean,boolean) 
/** * Enable the synchronize method which may do cloning. This method is enabled * when the parser is done with an EntityReference. /*** // revisit: enable editing of Entity public void enableSynchronize(boolean enableSynchronize) { fEnableSynchronize= enableSynchronize; } /***/	TokenNameCOMMENT_JAVADOC	 Enable the synchronize method which may do cloning. This method is enabled when the parser is done with an EntityReference. /*** // revisit: enable editing of Entity public void enableSynchronize(boolean enableSynchronize) { fEnableSynchronize= enableSynchronize; } /**
/** * EntityReference's children are a reflection of those defined in the * named Entity. This method updates them if the Entity is changed. * <P> * It is unclear what the least-cost resynch mechanism is. * If we expect the kids to be shallow, and/or expect changes * to the Entity contents to be rare, wiping them all out * and recloning is simplest. * <P> * If we expect them to be deep, * it might be better to first decide which kids (if any) * persist, and keep the ones (if any) that are unchanged * rather than doing all the work of cloning them again. * But that latter gets into having to convolve the two child lists, * insert new information in the right order (and possibly reorder * the existing kids), and a few other complexities that I really * don't want to deal with in this implementation. * <P> * Note that if we decide that we need to update the EntityReference's * contents, we have to turn off the readOnly flag temporarily to do so. * When we get around to adding multitasking support, this whole method * should probably be an atomic operation. * * @see DocumentTypeImpl * @see EntityImpl */	TokenNameCOMMENT_JAVADOC	 EntityReference's children are a reflection of those defined in the named Entity. This method updates them if the Entity is changed. <P> It is unclear what the least-cost resynch mechanism is. If we expect the kids to be shallow, and/or expect changes to the Entity contents to be rare, wiping them all out and recloning is simplest. <P> If we expect them to be deep, it might be better to first decide which kids (if any) persist, and keep the ones (if any) that are unchanged rather than doing all the work of cloning them again. But that latter gets into having to convolve the two child lists, insert new information in the right order (and possibly reorder the existing kids), and a few other complexities that I really don't want to deal with in this implementation. <P> Note that if we decide that we need to update the EntityReference's contents, we have to turn off the readOnly flag temporarily to do so. When we get around to adding multitasking support, this whole method should probably be an atomic operation. * @see DocumentTypeImpl @see EntityImpl 
// The Xerces parser invokes callbacks for startEnityReference 	TokenNameCOMMENT_LINE	The Xerces parser invokes callbacks for startEnityReference 
// the parsed value of the entity EACH TIME, so it is actually 	TokenNameCOMMENT_LINE	the parsed value of the entity EACH TIME, so it is actually 
// easier to create the nodes through the callbacks rather than 	TokenNameCOMMENT_LINE	easier to create the nodes through the callbacks rather than 
// clone the Entity. 	TokenNameCOMMENT_LINE	clone the Entity. 
/*** // revisit: enable editing of Entity private void synchronize() { if (!fEnableSynchronize) { return; } DocumentType doctype; NamedNodeMap entities; EntityImpl entDef; if (null != (doctype = getOwnerDocument().getDoctype()) && null != (entities = doctype.getEntities())) { entDef = (EntityImpl)entities.getNamedItem(getNodeName()); // No Entity by this name. If we had a change count, reset it. if(null==entDef) entityChanges=-1; // If no kids availalble, wipe any pre-existing children. // (See discussion above.) // Note that we have to use the superclass to avoid recursion // through Synchronize. readOnly=false; if(null==entDef || !entDef.hasChildNodes()) for(Node kid=super.getFirstChild(); kid!=null; kid=super.getFirstChild()) removeChild(kid); // If entity's definition changed, clone its kids // (See discussion above.) if(null!=entDef && entDef.changes!=entityChanges) { for(Node defkid=entDef.getFirstChild(); defkid!=null; defkid=defkid.getNextSibling()) { NodeImpl newkid=(NodeImpl) defkid.cloneNode(true); newkid.setReadOnly(true,true); insertBefore(newkid,null); } entityChanges=entDef.changes; } readOnly=true; } } /***/	TokenNameCOMMENT_JAVADOC	* // revisit: enable editing of Entity private void synchronize() { if (!fEnableSynchronize) { return; } DocumentType doctype; NamedNodeMap entities; EntityImpl entDef; if (null != (doctype = getOwnerDocument().getDoctype()) && null != (entities = doctype.getEntities())) { entDef = (EntityImpl)entities.getNamedItem(getNodeName()); // No Entity by this name. If we had a change count, reset it. if(null==entDef) entityChanges=-1; // If no kids availalble, wipe any pre-existing children. // (See discussion above.) // Note that we have to use the superclass to avoid recursion // through Synchronize. readOnly=false; if(null==entDef || !entDef.hasChildNodes()) for(Node kid=super.getFirstChild(); kid!=null; kid=super.getFirstChild()) removeChild(kid); // If entity's definition changed, clone its kids // (See discussion above.) if(null!=entDef && entDef.changes!=entityChanges) { for(Node defkid=entDef.getFirstChild(); defkid!=null; defkid=defkid.getNextSibling()) { NodeImpl newkid=(NodeImpl) defkid.cloneNode(true); newkid.setReadOnly(true,true); insertBefore(newkid,null); } entityChanges=entDef.changes; } readOnly=true; } } /**
}	TokenNameRBRACE	
// class EntityReferenceImpl 	TokenNameCOMMENT_LINE	class EntityReferenceImpl 
