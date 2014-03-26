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
Entity	TokenNameIdentifier	 Entity
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
/** * Entity nodes hold the reference data for an XML Entity -- either * parsed or unparsed. The nodeName (inherited from Node) will contain * the name (if any) of the Entity. Its data will be contained in the * Entity's children, in exactly the structure which an * EntityReference to this name will present within the document's * body. * <P> * Note that this object models the actual entity, _not_ the entity * declaration or the entity reference. * <P> * An XML processor may choose to completely expand entities before * the structure model is passed to the DOM; in this case, there will * be no EntityReferences in the DOM tree. * <P> * Quoting the 10/01 DOM Proposal, * <BLOCKQUOTE> * "The DOM Level 1 does not support editing Entity nodes; if a user * wants to make changes to the contents of an Entity, every related * EntityReference node has to be replaced in the structure model by * a clone of the Entity's contents, and then the desired changes * must be made to each of those clones instead. All the * descendants of an Entity node are readonly." * </BLOCKQUOTE> * I'm interpreting this as: It is the parser's responsibilty to call * the non-DOM operation setReadOnly(true,true) after it constructs * the Entity. Since the DOM explicitly decided not to deal with this, * _any_ answer will involve a non-DOM operation, and this is the * simplest solution. * * @xerces.internal * * @author Elena Litani, IBM * @version $Id: EntityImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 Entity nodes hold the reference data for an XML Entity -- either parsed or unparsed. The nodeName (inherited from Node) will contain the name (if any) of the Entity. Its data will be contained in the Entity's children, in exactly the structure which an EntityReference to this name will present within the document's body. <P> Note that this object models the actual entity, _not_ the entity declaration or the entity reference. <P> An XML processor may choose to completely expand entities before the structure model is passed to the DOM; in this case, there will be no EntityReferences in the DOM tree. <P> Quoting the 10/01 DOM Proposal, <BLOCKQUOTE> "The DOM Level 1 does not support editing Entity nodes; if a user wants to make changes to the contents of an Entity, every related EntityReference node has to be replaced in the structure model by a clone of the Entity's contents, and then the desired changes must be made to each of those clones instead. All the descendants of an Entity node are readonly." </BLOCKQUOTE> I'm interpreting this as: It is the parser's responsibilty to call the non-DOM operation setReadOnly(true,true) after it constructs the Entity. Since the DOM explicitly decided not to deal with this, _any_ answer will involve a non-DOM operation, and this is the simplest solution. * @xerces.internal * @author Elena Litani, IBM @version $Id: EntityImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
EntityImpl	TokenNameIdentifier	 Entity Impl
extends	TokenNameextends	
ParentNode	TokenNameIdentifier	 Parent Node
implements	TokenNameimplements	
Entity	TokenNameIdentifier	 Entity
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
3575760943444303423L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Entity name. */	TokenNameCOMMENT_JAVADOC	 Entity name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** Public identifier. */	TokenNameCOMMENT_JAVADOC	 Public identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
/** System identifier. */	TokenNameCOMMENT_JAVADOC	 System identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
/** Encoding */	TokenNameCOMMENT_JAVADOC	 Encoding 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
/** Input Encoding */	TokenNameCOMMENT_JAVADOC	 Input Encoding 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
inputEncoding	TokenNameIdentifier	 input Encoding
;	TokenNameSEMICOLON	
/** Version */	TokenNameCOMMENT_JAVADOC	 Version 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
/** Notation name. */	TokenNameCOMMENT_JAVADOC	 Notation name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
notationName	TokenNameIdentifier	 notation Name
;	TokenNameSEMICOLON	
/** base uri*/	TokenNameCOMMENT_JAVADOC	 base uri
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Factory constructor. */	TokenNameCOMMENT_JAVADOC	 Factory constructor. 
public	TokenNamepublic	
EntityImpl	TokenNameIdentifier	 Entity Impl
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
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the entity name */	TokenNameCOMMENT_JAVADOC	 Returns the entity name 
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
EntityImpl	TokenNameIdentifier	 Entity Impl
newentity	TokenNameIdentifier	 newentity
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EntityImpl	TokenNameIdentifier	 Entity Impl
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newentity	TokenNameIdentifier	 newentity
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newentity	TokenNameIdentifier	 newentity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Entity methods 	TokenNameCOMMENT_LINE	Entity methods 
// 	TokenNameCOMMENT_LINE	 
/** * The public identifier associated with the entity. If not specified, * this will be null. */	TokenNameCOMMENT_JAVADOC	 The public identifier associated with the entity. If not specified, this will be null. 
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
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getPublicId():String 	TokenNameCOMMENT_LINE	getPublicId():String 
/** * The system identifier associated with the entity. If not specified, * this will be null. */	TokenNameCOMMENT_JAVADOC	 The system identifier associated with the entity. If not specified, this will be null. 
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
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getSystemId():String 	TokenNameCOMMENT_LINE	getSystemId():String 
/** * DOM Level 3 WD - experimental * the version number of this entity, when it is an external parsed entity. */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD - experimental the version number of this entity, when it is an external parsed entity. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXmlVersion	TokenNameIdentifier	 get Xml Version
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
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getVersion():String 	TokenNameCOMMENT_LINE	getVersion():String 
/** * DOM Level 3 WD - experimental * the encoding of this entity, when it is an external parsed entity. */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD - experimental the encoding of this entity, when it is an external parsed entity. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXmlEncoding	TokenNameIdentifier	 get Xml Encoding
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
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getVersion():String 	TokenNameCOMMENT_LINE	getVersion():String 
/** * Unparsed entities -- which contain non-XML data -- have a * "notation name" which tells applications how to deal with them. * Parsed entities, which <em>are</em> in XML format, don't need this and * set it to null. */	TokenNameCOMMENT_JAVADOC	 Unparsed entities -- which contain non-XML data -- have a "notation name" which tells applications how to deal with them. Parsed entities, which <em>are</em> in XML format, don't need this and set it to null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNotationName	TokenNameIdentifier	 get Notation Name
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
notationName	TokenNameIdentifier	 notation Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getNotationName():String 	TokenNameCOMMENT_LINE	getNotationName():String 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * DOM Level 2: The public identifier associated with the entity. If not specified, * this will be null. */	TokenNameCOMMENT_JAVADOC	 DOM Level 2: The public identifier associated with the entity. If not specified, this will be null. 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
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
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setPublicId(String) 	TokenNameCOMMENT_LINE	setPublicId(String) 
/** * NON-DOM * encoding - An attribute specifying, as part of the text declaration, * the encoding of this entity, when it is an external parsed entity. * This is null otherwise * */	TokenNameCOMMENT_JAVADOC	 NON-DOM encoding - An attribute specifying, as part of the text declaration, the encoding of this entity, when it is an external parsed entity. This is null otherwise 
public	TokenNamepublic	
void	TokenNamevoid	
setXmlEncoding	TokenNameIdentifier	 set Xml Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
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
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setEncoding (String) 	TokenNameCOMMENT_LINE	setEncoding (String) 
/** * An attribute specifying the encoding used for this entity at the tiome * of parsing, when it is an external parsed entity. This is * <code>null</code> if it an entity from the internal subset or if it * is not known.. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 An attribute specifying the encoding used for this entity at the tiome of parsing, when it is an external parsed entity. This is <code>null</code> if it an entity from the internal subset or if it is not known.. @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInputEncoding	TokenNameIdentifier	 get Input Encoding
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
inputEncoding	TokenNameIdentifier	 input Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM, used to set the input encoding. */	TokenNameCOMMENT_JAVADOC	 NON-DOM, used to set the input encoding. 
public	TokenNamepublic	
void	TokenNamevoid	
setInputEncoding	TokenNameIdentifier	 set Input Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inputEncoding	TokenNameIdentifier	 input Encoding
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
inputEncoding	TokenNameIdentifier	 input Encoding
=	TokenNameEQUAL	
inputEncoding	TokenNameIdentifier	 input Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM * version - An attribute specifying, as part of the text declaration, * the version number of this entity, when it is an external parsed entity. * This is null otherwise */	TokenNameCOMMENT_JAVADOC	 NON-DOM version - An attribute specifying, as part of the text declaration, the version number of this entity, when it is an external parsed entity. This is null otherwise 
public	TokenNamepublic	
void	TokenNamevoid	
setXmlVersion	TokenNameIdentifier	 set Xml Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
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
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setVersion (String) 	TokenNameCOMMENT_LINE	setVersion (String) 
/** * DOM Level 2: The system identifier associated with the entity. If not * specified, this will be null. */	TokenNameCOMMENT_JAVADOC	 DOM Level 2: The system identifier associated with the entity. If not specified, this will be null. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
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
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setSystemId(String) 	TokenNameCOMMENT_LINE	setSystemId(String) 
/** * DOM Level 2: Unparsed entities -- which contain non-XML data -- have a * "notation name" which tells applications how to deal with them. * Parsed entities, which <em>are</em> in XML format, don't need this and * set it to null. */	TokenNameCOMMENT_JAVADOC	 DOM Level 2: Unparsed entities -- which contain non-XML data -- have a "notation name" which tells applications how to deal with them. Parsed entities, which <em>are</em> in XML format, don't need this and set it to null. 
public	TokenNamepublic	
void	TokenNamevoid	
setNotationName	TokenNameIdentifier	 set Notation Name
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
notationName	TokenNameIdentifier	 notation Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setNotationName(String) 	TokenNameCOMMENT_LINE	setNotationName(String) 
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
return	TokenNamereturn	
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
baseURI	TokenNameIdentifier	 base URI
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
)	TokenNameRPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
// class EntityImpl 	TokenNameCOMMENT_LINE	class EntityImpl 
