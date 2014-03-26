/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTM.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTM.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
;	TokenNameSEMICOLON	
/** * <code>DTM</code> is an XML document model expressed as a table * rather than an object tree. It attempts to provide an interface to * a parse tree that has very little object creation. (DTM * implementations may also support incremental construction of the * model, but that's hidden from the DTM API.) * * <p>Nodes in the DTM are identified by integer "handles". A handle must * be unique within a process, and carries both node identification and * document identification. It must be possible to compare two handles * (and thus their nodes) for identity with "==".</p> * * <p>Namespace URLs, local-names, and expanded-names can all be * represented by and tested as integer ID values. An expanded name * represents (and may or may not directly contain) a combination of * the URL ID, and the local-name ID. Note that the namespace URL id * can be 0, which should have the meaning that the namespace is null. * For consistancy, zero should not be used for a local-name index. </p> * * <p>Text content of a node is represented by an index and length, * permitting efficient storage such as a shared FastStringBuffer.</p> * * <p>The model of the tree, as well as the general navigation model, * is that of XPath 1.0, for the moment. The model will eventually be * adapted to match the XPath 2.0 data model, XML Schema, and * InfoSet.</p> * * <p>DTM does _not_ directly support the W3C's Document Object * Model. However, it attempts to come close enough that an * implementation of DTM can be created that wraps a DOM and vice * versa.</p> * * <p><strong>Please Note:</strong> The DTM API is still * <strong>Subject To Change.</strong> This wouldn't affect most * users, but might require updating some extensions.</p> * * <p> The largest change being contemplated is a reconsideration of * the Node Handle representation. We are still not entirely sure * that an integer packed with two numeric subfields is really the * best solution. It has been suggested that we move up to a Long, to * permit more nodes per document without having to reduce the number * of slots in the DTMManager. There's even been a proposal that we * replace these integers with "cursor" objects containing the * internal node id and a pointer to the actual DTM object; this might * reduce the need to continuously consult the DTMManager to retrieve * the latter, and might provide a useful "hook" back into normal Java * heap management. But changing this datatype would have huge impact * on Xalan's internals -- especially given Java's lack of C-style * typedefs -- so we won't cut over unless we're convinced the new * solution really would be an improvement!</p> * */	TokenNameCOMMENT_JAVADOC	 <code>DTM</code> is an XML document model expressed as a table rather than an object tree. It attempts to provide an interface to a parse tree that has very little object creation. (DTM implementations may also support incremental construction of the model, but that's hidden from the DTM API.) * <p>Nodes in the DTM are identified by integer "handles". A handle must be unique within a process, and carries both node identification and document identification. It must be possible to compare two handles (and thus their nodes) for identity with "==".</p> * <p>Namespace URLs, local-names, and expanded-names can all be represented by and tested as integer ID values. An expanded name represents (and may or may not directly contain) a combination of the URL ID, and the local-name ID. Note that the namespace URL id can be 0, which should have the meaning that the namespace is null. For consistancy, zero should not be used for a local-name index. </p> * <p>Text content of a node is represented by an index and length, permitting efficient storage such as a shared FastStringBuffer.</p> * <p>The model of the tree, as well as the general navigation model, is that of XPath 1.0, for the moment. The model will eventually be adapted to match the XPath 2.0 data model, XML Schema, and InfoSet.</p> * <p>DTM does _not_ directly support the W3C's Document Object Model. However, it attempts to come close enough that an implementation of DTM can be created that wraps a DOM and vice versa.</p> * <p><strong>Please Note:</strong> The DTM API is still <strong>Subject To Change.</strong> This wouldn't affect most users, but might require updating some extensions.</p> * <p> The largest change being contemplated is a reconsideration of the Node Handle representation. We are still not entirely sure that an integer packed with two numeric subfields is really the best solution. It has been suggested that we move up to a Long, to permit more nodes per document without having to reduce the number of slots in the DTMManager. There's even been a proposal that we replace these integers with "cursor" objects containing the internal node id and a pointer to the actual DTM object; this might reduce the need to continuously consult the DTMManager to retrieve the latter, and might provide a useful "hook" back into normal Java heap management. But changing this datatype would have huge impact on Xalan's internals -- especially given Java's lack of C-style typedefs -- so we won't cut over unless we're convinced the new solution really would be an improvement!</p> 
public	TokenNamepublic	
interface	TokenNameinterface	
DTM	TokenNameIdentifier	 DTM
{	TokenNameLBRACE	
/** * Null node handles are represented by this value. */	TokenNameCOMMENT_JAVADOC	 Null node handles are represented by this value. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NULL	TokenNameIdentifier	 NULL
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// These nodeType mnemonics and values are deliberately the same as those 	TokenNameCOMMENT_LINE	These nodeType mnemonics and values are deliberately the same as those 
// used by the DOM, for convenient mapping 	TokenNameCOMMENT_LINE	used by the DOM, for convenient mapping 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% Should we actually define these as initialized to, 	TokenNameCOMMENT_LINE	%REVIEW% Should we actually define these as initialized to, 
// eg. org.w3c.dom.Document.ELEMENT_NODE? 	TokenNameCOMMENT_LINE	eg. org.w3c.dom.Document.ELEMENT_NODE? 
/** * The node is a <code>Root</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>Root</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ROOT_NODE	TokenNameIdentifier	 ROOT  NODE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is an <code>Element</code>. */	TokenNameCOMMENT_JAVADOC	 The node is an <code>Element</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is an <code>Attr</code>. */	TokenNameCOMMENT_JAVADOC	 The node is an <code>Attr</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>Text</code> node. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>Text</code> node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>CDATASection</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>CDATASection</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is an <code>EntityReference</code>. */	TokenNameCOMMENT_JAVADOC	 The node is an <code>EntityReference</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is an <code>Entity</code>. */	TokenNameCOMMENT_JAVADOC	 The node is an <code>Entity</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>ProcessingInstruction</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>ProcessingInstruction</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>Comment</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>Comment</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>Document</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>Document</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>DocumentType</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>DocumentType</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>DocumentFragment</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>DocumentFragment</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>Notation</code>. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>Notation</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The node is a <code>namespace node</code>. Note that this is not * currently a node type defined by the DOM API. */	TokenNameCOMMENT_JAVADOC	 The node is a <code>namespace node</code>. Note that this is not currently a node type defined by the DOM API. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The number of valid nodetypes. */	TokenNameCOMMENT_JAVADOC	 The number of valid nodetypes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NTYPES	TokenNameIdentifier	 NTYPES
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ========= DTM Implementation Control Functions. ============== 	TokenNameCOMMENT_LINE	========= DTM Implementation Control Functions. ============== 
// %TBD% RETIRED -- do via setFeature if needed. Remove from impls. 	TokenNameCOMMENT_LINE	%TBD% RETIRED -- do via setFeature if needed. Remove from impls. 
// public void setParseBlockSize(int blockSizeSuggestion); 	TokenNameCOMMENT_LINE	public void setParseBlockSize(int blockSizeSuggestion); 
/** * Set an implementation dependent feature. * <p> * %REVIEW% Do we really expect to set features on DTMs? * * @param featureId A feature URL. * @param state true if this feature should be on, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Set an implementation dependent feature. <p> %REVIEW% Do we really expect to set features on DTMs? * @param featureId A feature URL. @param state true if this feature should be on, false otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set a run time property for this DTM instance. * * @param property a <code>String</code> value * @param value an <code>Object</code> value */	TokenNameCOMMENT_JAVADOC	 Set a run time property for this DTM instance. * @param property a <code>String</code> value @param value an <code>Object</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ========= Document Navigation Functions ========= 	TokenNameCOMMENT_LINE	========= Document Navigation Functions ========= 
/** * This returns a stateless "traverser", that can navigate over an * XPath axis, though not in document order. * * @param axis One of Axes.ANCESTORORSELF, etc. * * @return A DTMAxisIterator, or null if the givin axis isn't supported. */	TokenNameCOMMENT_JAVADOC	 This returns a stateless "traverser", that can navigate over an XPath axis, though not in document order. * @param axis One of Axes.ANCESTORORSELF, etc. * @return A DTMAxisIterator, or null if the givin axis isn't supported. 
public	TokenNamepublic	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This is a shortcut to the iterators that implement * XPath axes. * Returns a bare-bones iterator that must be initialized * with a start node (using iterator.setStartNode()). * * @param axis One of Axes.ANCESTORORSELF, etc. * * @return A DTMAxisIterator, or null if the givin axis isn't supported. */	TokenNameCOMMENT_JAVADOC	 This is a shortcut to the iterators that implement XPath axes. Returns a bare-bones iterator that must be initialized with a start node (using iterator.setStartNode()). * @param axis One of Axes.ANCESTORORSELF, etc. * @return A DTMAxisIterator, or null if the givin axis isn't supported. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get an iterator that can navigate over an XPath Axis, predicated by * the extended type ID. * * @param axis * @param type An extended type ID. * * @return A DTMAxisIterator, or null if the givin axis isn't supported. */	TokenNameCOMMENT_JAVADOC	 Get an iterator that can navigate over an XPath Axis, predicated by the extended type ID. * @param axis @param type An extended type ID. * @return A DTMAxisIterator, or null if the givin axis isn't supported. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getTypedAxisIterator	TokenNameIdentifier	 get Typed Axis Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, test if it has child nodes. * <p> %REVIEW% This is obviously useful at the DOM layer, where it * would permit testing this without having to create a proxy * node. It's less useful in the DTM API, where * (dtm.getFirstChild(nodeHandle)!=DTM.NULL) is just as fast and * almost as self-evident. But it's a convenience, and eases porting * of DOM code to DTM. </p> * * @param nodeHandle int Handle of the node. * @return int true if the given node has child nodes. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, test if it has child nodes. <p> %REVIEW% This is obviously useful at the DOM layer, where it would permit testing this without having to create a proxy node. It's less useful in the DTM API, where (dtm.getFirstChild(nodeHandle)!=DTM.NULL) is just as fast and almost as self-evident. But it's a convenience, and eases porting of DOM code to DTM. </p> * @param nodeHandle int Handle of the node. @return int true if the given node has child nodes. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, get the handle of the node's first child. * * @param nodeHandle int Handle of the node. * @return int DTM node-number of first child, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, get the handle of the node's first child. * @param nodeHandle int Handle of the node. @return int DTM node-number of first child, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, get the handle of the node's last child. * * @param nodeHandle int Handle of the node. * @return int Node-number of last child, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, get the handle of the node's last child. * @param nodeHandle int Handle of the node. @return int Node-number of last child, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieves an attribute node by local name and namespace URI * * %TBD% Note that we currently have no way to support * the DOM's old getAttribute() call, which accesses only the qname. * * @param elementHandle Handle of the node upon which to look up this attribute. * @param namespaceURI The namespace URI of the attribute to * retrieve, or null. * @param name The local name of the attribute to * retrieve. * @return The attribute node handle with the specified name ( * <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such * attribute. */	TokenNameCOMMENT_JAVADOC	 Retrieves an attribute node by local name and namespace URI * %TBD% Note that we currently have no way to support the DOM's old getAttribute() call, which accesses only the qname. * @param elementHandle Handle of the node upon which to look up this attribute. @param namespaceURI The namespace URI of the attribute to retrieve, or null. @param name The local name of the attribute to retrieve. @return The attribute node handle with the specified name ( <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such attribute. 
public	TokenNamepublic	
int	TokenNameint	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
int	TokenNameint	
elementHandle	TokenNameIdentifier	 element Handle
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, get the index of the node's first attribute. * * @param nodeHandle int Handle of the node. * @return Handle of first attribute, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, get the index of the node's first attribute. * @param nodeHandle int Handle of the node. @return Handle of first attribute, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, get the index of the node's first namespace node. * * @param nodeHandle handle to node, which should probably be an element * node, but need not be. * * @param inScope true if all namespaces in scope should be * returned, false if only the node's own * namespace declarations should be returned. * @return handle of first namespace, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, get the index of the node's first namespace node. * @param nodeHandle handle to node, which should probably be an element node, but need not be. * @param inScope true if all namespaces in scope should be returned, false if only the node's own namespace declarations should be returned. @return handle of first namespace, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, advance to its next sibling. * @param nodeHandle int Handle of the node. * @return int Node-number of next sibling, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to its next sibling. @param nodeHandle int Handle of the node. @return int Node-number of next sibling, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, find its preceeding sibling. * WARNING: DTM implementations may be asymmetric; in some, * this operation has been resolved by search, and is relatively expensive. * * @param nodeHandle the id of the node. * @return int Node-number of the previous sib, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find its preceeding sibling. WARNING: DTM implementations may be asymmetric; in some, this operation has been resolved by search, and is relatively expensive. * @param nodeHandle the id of the node. @return int Node-number of the previous sib, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, advance to the next attribute. If an * element, we advance to its first attribute; if an attr, we advance to * the next attr of the same element. * * @param nodeHandle int Handle of the node. * @return int DTM node-number of the resolved attr, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, advance to the next attribute. If an element, we advance to its first attribute; if an attr, we advance to the next attr of the same element. * @param nodeHandle int Handle of the node. @return int DTM node-number of the resolved attr, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a namespace handle, advance to the next namespace in the same scope * (local or local-plus-inherited, as selected by getFirstNamespaceNode) * * @param baseHandle handle to original node from where the first child * was relative to (needed to return nodes in document order). * @param namespaceHandle handle to node which must be of type * NAMESPACE_NODE. * NEEDSDOC @param inScope * @return handle of next namespace, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a namespace handle, advance to the next namespace in the same scope (local or local-plus-inherited, as selected by getFirstNamespaceNode) * @param baseHandle handle to original node from where the first child was relative to (needed to return nodes in document order). @param namespaceHandle handle to node which must be of type NAMESPACE_NODE. NEEDSDOC @param inScope @return handle of next namespace, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
int	TokenNameint	
baseHandle	TokenNameIdentifier	 base Handle
,	TokenNameCOMMA	
int	TokenNameint	
namespaceHandle	TokenNameIdentifier	 namespace Handle
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, find its parent node. * * @param nodeHandle the id of the node. * @return int Node handle of parent, * or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find its parent node. * @param nodeHandle the id of the node. @return int Node handle of parent, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
int	TokenNameint	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a DTM which contains only a single document, * find the Node Handle of the Document node. Note * that if the DTM is configured so it can contain multiple * documents, this call will return the Document currently * under construction -- but may return null if it's between * documents. Generally, you should use getOwnerDocument(nodeHandle) * or getDocumentRoot(nodeHandle) instead. * * @return int Node handle of document, or DTM.NULL if a shared DTM * can not tell us which Document is currently active. */	TokenNameCOMMENT_JAVADOC	 Given a DTM which contains only a single document, find the Node Handle of the Document node. Note that if the DTM is configured so it can contain multiple documents, this call will return the Document currently under construction -- but may return null if it's between documents. Generally, you should use getOwnerDocument(nodeHandle) or getDocumentRoot(nodeHandle) instead. * @return int Node handle of document, or DTM.NULL if a shared DTM can not tell us which Document is currently active. 
public	TokenNamepublic	
int	TokenNameint	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, find the owning document node. This version mimics * the behavior of the DOM call by the same name. * * @param nodeHandle the id of the node. * @return int Node handle of owning document, or DTM.NULL if the node was * a Document. * @see #getDocumentRoot(int nodeHandle) */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find the owning document node. This version mimics the behavior of the DOM call by the same name. * @param nodeHandle the id of the node. @return int Node handle of owning document, or DTM.NULL if the node was a Document. @see #getDocumentRoot(int nodeHandle) 
public	TokenNamepublic	
int	TokenNameint	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, find the owning document node. * * @param nodeHandle the id of the node. * @return int Node handle of owning document, or the node itself if it was * a Document. (Note difference from DOM, where getOwnerDocument returns * null for the Document node.) * @see #getOwnerDocument(int nodeHandle) */	TokenNameCOMMENT_JAVADOC	 Given a node handle, find the owning document node. * @param nodeHandle the id of the node. @return int Node handle of owning document, or the node itself if it was a Document. (Note difference from DOM, where getOwnerDocument returns null for the Document node.) @see #getOwnerDocument(int nodeHandle) 
public	TokenNamepublic	
int	TokenNameint	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the string-value of a node as a String object * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * * @param nodeHandle The node ID. * * @return A string object that represents the string-value of the given node. */	TokenNameCOMMENT_JAVADOC	 Get the string-value of a node as a String object (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). * @param nodeHandle The node ID. * @return A string object that represents the string-value of the given node. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get number of character array chunks in * the string-value of a node. * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * Note that a single text node may have multiple text chunks. * * @param nodeHandle The node ID. * * @return number of character array chunks in * the string-value of a node. */	TokenNameCOMMENT_JAVADOC	 Get number of character array chunks in the string-value of a node. (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Note that a single text node may have multiple text chunks. * @param nodeHandle The node ID. * @return number of character array chunks in the string-value of a node. 
public	TokenNamepublic	
int	TokenNameint	
getStringValueChunkCount	TokenNameIdentifier	 get String Value Chunk Count
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a character array chunk in the string-value of a node. * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * Note that a single text node may have multiple text chunks. * * @param nodeHandle The node ID. * @param chunkIndex Which chunk to get. * @param startAndLen A two-integer array which, upon return, WILL * BE FILLED with values representing the chunk's start position * within the returned character buffer and the length of the chunk. * @return The character array buffer within which the chunk occurs, * setting startAndLen's contents as a side-effect. */	TokenNameCOMMENT_JAVADOC	 Get a character array chunk in the string-value of a node. (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Note that a single text node may have multiple text chunks. * @param nodeHandle The node ID. @param chunkIndex Which chunk to get. @param startAndLen A two-integer array which, upon return, WILL BE FILLED with values representing the chunk's start position within the returned character buffer and the length of the chunk. @return The character array buffer within which the chunk occurs, setting startAndLen's contents as a side-effect. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getStringValueChunk	TokenNameIdentifier	 get String Value Chunk
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
int	TokenNameint	
chunkIndex	TokenNameIdentifier	 chunk Index
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
startAndLen	TokenNameIdentifier	 start And Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return an ID that represents the node's expanded name. * * @param nodeHandle The handle to the node in question. * * @return the expanded-name id of the node. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return an ID that represents the node's expanded name. * @param nodeHandle The handle to the node in question. * @return the expanded-name id of the node. 
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given an expanded name, return an ID. If the expanded-name does not * exist in the internal tables, the entry will be created, and the ID will * be returned. Any additional nodes that are created that have this * expanded name will use this ID. * * NEEDSDOC @param namespace * NEEDSDOC @param localName * NEEDSDOC @param type * * @return the expanded-name id of the node. */	TokenNameCOMMENT_JAVADOC	 Given an expanded name, return an ID. If the expanded-name does not exist in the internal tables, the entry will be created, and the ID will be returned. Any additional nodes that are created that have this expanded name will use this ID. * NEEDSDOC @param namespace NEEDSDOC @param localName NEEDSDOC @param type * @return the expanded-name id of the node. 
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given an expanded-name ID, return the local name part. * * @param ExpandedNameID an ID that represents an expanded-name. * @return String Local name of this node. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the local name part. * @param ExpandedNameID an ID that represents an expanded-name. @return String Local name of this node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalNameFromExpandedNameID	TokenNameIdentifier	 get Local Name From Expanded Name ID
(	TokenNameLPAREN	
int	TokenNameint	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given an expanded-name ID, return the namespace URI part. * * @param ExpandedNameID an ID that represents an expanded-name. * @return String URI value of this node's namespace, or null if no * namespace was resolved. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the namespace URI part. * @param ExpandedNameID an ID that represents an expanded-name. @return String URI value of this node's namespace, or null if no namespace was resolved. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceFromExpandedNameID	TokenNameIdentifier	 get Namespace From Expanded Name ID
(	TokenNameLPAREN	
int	TokenNameint	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return its DOM-style node name. This will * include names such as #text or #document. * * @param nodeHandle the id of the node. * @return String Name of this node, which may be an empty string. * %REVIEW% Document when empty string is possible... */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style node name. This will include names such as #text or #document. * @param nodeHandle the id of the node. @return String Name of this node, which may be an empty string. %REVIEW% Document when empty string is possible... 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return the XPath node name. This should be * the name as described by the XPath data model, NOT the DOM-style * name. * * @param nodeHandle the id of the node. * @return String Name of this node. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return the XPath node name. This should be the name as described by the XPath data model, NOT the DOM-style name. * @param nodeHandle the id of the node. @return String Name of this node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return its DOM-style localname. * (As defined in Namespaces, this is the portion of the name after the * prefix, if present, or the whole node name if no prefix exists) * * @param nodeHandle the id of the node. * @return String Local name of this node. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style localname. (As defined in Namespaces, this is the portion of the name after the prefix, if present, or the whole node name if no prefix exists) * @param nodeHandle the id of the node. @return String Local name of this node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a namespace handle, return the prefix that the namespace decl is * mapping. * Given a node handle, return the prefix used to map to the namespace. * (As defined in Namespaces, this is the portion of the name before any * colon character). * * <p> %REVIEW% Are you sure you want "" for no prefix? </p> * * @param nodeHandle the id of the node. * @return String prefix of this node's name, or "" if no explicit * namespace prefix was given. */	TokenNameCOMMENT_JAVADOC	 Given a namespace handle, return the prefix that the namespace decl is mapping. Given a node handle, return the prefix used to map to the namespace. (As defined in Namespaces, this is the portion of the name before any colon character). * <p> %REVIEW% Are you sure you want "" for no prefix? </p> * @param nodeHandle the id of the node. @return String prefix of this node's name, or "" if no explicit namespace prefix was given. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return its DOM-style namespace URI * (As defined in Namespaces, this is the declared URI which this node's * prefix -- or default in lieu thereof -- was mapped to.) * @param nodeHandle the id of the node. * @return String URI value of this node's namespace, or null if no * namespace was resolved. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style namespace URI (As defined in Namespaces, this is the declared URI which this node's prefix -- or default in lieu thereof -- was mapped to.) @param nodeHandle the id of the node. @return String URI value of this node's namespace, or null if no namespace was resolved. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return its node value. This is mostly * as defined by the DOM, but may ignore some conveniences. * <p> * @param nodeHandle The node id. * @return String Value of this node, or null if not * meaningful for this node type. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its node value. This is mostly as defined by the DOM, but may ignore some conveniences. <p> @param nodeHandle The node id. @return String Value of this node, or null if not meaningful for this node type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a node handle, return its DOM-style node type. * * <p>%REVIEW% Generally, returning short is false economy. Return int?</p> * * @param nodeHandle The node id. * @return int Node type, as per the DOM's Node._NODE constants. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its DOM-style node type. * <p>%REVIEW% Generally, returning short is false economy. Return int?</p> * @param nodeHandle The node id. @return int Node type, as per the DOM's Node._NODE constants. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the depth level of this node in the tree (equals 1 for * a parentless node). * * @param nodeHandle The node id. * @return the number of ancestors, plus one * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the depth level of this node in the tree (equals 1 for a parentless node). * @param nodeHandle The node id. @return the number of ancestors, plus one @xsl.usage internal 
public	TokenNamepublic	
short	TokenNameshort	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ============== Document query functions ============== 	TokenNameCOMMENT_LINE	============== Document query functions ============== 
/** * Tests whether DTM DOM implementation implements a specific feature and * that feature is supported by this node. * @param feature The name of the feature to test. * @param version This is the version number of the feature to test. * If the version is not * specified, supporting any version of the feature will cause the * method to return <code>true</code>. * @return Returns <code>true</code> if the specified feature is * supported on this node, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests whether DTM DOM implementation implements a specific feature and that feature is supported by this node. @param feature The name of the feature to test. @param version This is the version number of the feature to test. If the version is not specified, supporting any version of the feature will cause the method to return <code>true</code>. @return Returns <code>true</code> if the specified feature is supported on this node, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the base URI of the document entity. If it is not known * (because the document was parsed from a socket connection or from * standard input, for example), the value of this property is unknown. * * @return the document base URI String object or null if unknown. */	TokenNameCOMMENT_JAVADOC	 Return the base URI of the document entity. If it is not known (because the document was parsed from a socket connection or from standard input, for example), the value of this property is unknown. * @return the document base URI String object or null if unknown. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentBaseURI	TokenNameIdentifier	 get Document Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the base URI of the document entity. * * @param baseURI the document base URI String object or null if unknown. */	TokenNameCOMMENT_JAVADOC	 Set the base URI of the document entity. * @param baseURI the document base URI String object or null if unknown. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentBaseURI	TokenNameIdentifier	 set Document Base URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the system identifier of the document entity. If * it is not known, the value of this property is null. * * @param nodeHandle The node id, which can be any valid node handle. * @return the system identifier String object or null if unknown. */	TokenNameCOMMENT_JAVADOC	 Return the system identifier of the document entity. If it is not known, the value of this property is null. * @param nodeHandle The node id, which can be any valid node handle. @return the system identifier String object or null if unknown. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentSystemIdentifier	TokenNameIdentifier	 get Document System Identifier
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the name of the character encoding scheme * in which the document entity is expressed. * * @param nodeHandle The node id, which can be any valid node handle. * @return the document encoding String object. */	TokenNameCOMMENT_JAVADOC	 Return the name of the character encoding scheme in which the document entity is expressed. * @param nodeHandle The node id, which can be any valid node handle. @return the document encoding String object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentEncoding	TokenNameIdentifier	 get Document Encoding
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return an indication of the standalone status of the document, * either "yes" or "no". This property is derived from the optional * standalone document declaration in the XML declaration at the * beginning of the document entity, and has no value if there is no * standalone document declaration. * * @param nodeHandle The node id, which can be any valid node handle. * @return the document standalone String object, either "yes", "no", or null. */	TokenNameCOMMENT_JAVADOC	 Return an indication of the standalone status of the document, either "yes" or "no". This property is derived from the optional standalone document declaration in the XML declaration at the beginning of the document entity, and has no value if there is no standalone document declaration. * @param nodeHandle The node id, which can be any valid node handle. @return the document standalone String object, either "yes", "no", or null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentStandalone	TokenNameIdentifier	 get Document Standalone
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return a string representing the XML version of the document. This * property is derived from the XML declaration optionally present at the * beginning of the document entity, and has no value if there is no XML * declaration. * * @param documentHandle the document handle * @return the document version String object */	TokenNameCOMMENT_JAVADOC	 Return a string representing the XML version of the document. This property is derived from the XML declaration optionally present at the beginning of the document entity, and has no value if there is no XML declaration. * @param documentHandle the document handle @return the document version String object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentVersion	TokenNameIdentifier	 get Document Version
(	TokenNameLPAREN	
int	TokenNameint	
documentHandle	TokenNameIdentifier	 document Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return an indication of * whether the processor has read the complete DTD. Its value is a * boolean. If it is false, then certain properties (indicated in their * descriptions below) may be unknown. If it is true, those properties * are never unknown. * * @return <code>true</code> if all declarations were processed; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Return an indication of whether the processor has read the complete DTD. Its value is a boolean. If it is false, then certain properties (indicated in their descriptions below) may be unknown. If it is true, those properties are never unknown. * @return <code>true</code> if all declarations were processed; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getDocumentAllDeclarationsProcessed	TokenNameIdentifier	 get Document All Declarations Processed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A document type declaration information item has the following properties: * * 1. [system identifier] The system identifier of the external subset, if * it exists. Otherwise this property has no value. * * @return the system identifier String object, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 A document type declaration information item has the following properties: * 1. [system identifier] The system identifier of the external subset, if it exists. Otherwise this property has no value. * @return the system identifier String object, or null if there is none. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentTypeDeclarationSystemIdentifier	TokenNameIdentifier	 get Document Type Declaration System Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the public identifier of the external subset, * normalized as described in 4.2.2 External Entities [XML]. If there is * no external subset or if it has no public identifier, this property * has no value. * * @return the public identifier String object, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 Return the public identifier of the external subset, normalized as described in 4.2.2 External Entities [XML]. If there is no external subset or if it has no public identifier, this property has no value. * @return the public identifier String object, or null if there is none. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentTypeDeclarationPublicIdentifier	TokenNameIdentifier	 get Document Type Declaration Public Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the <code>Element</code> whose <code>ID</code> is given by * <code>elementId</code>. If no such element exists, returns * <code>DTM.NULL</code>. Behavior is not defined if more than one element * has this <code>ID</code>. Attributes (including those * with the name "ID") are not of type ID unless so defined by DTD/Schema * information available to the DTM implementation. * Implementations that do not know whether attributes are of type ID or * not are expected to return <code>DTM.NULL</code>. * * <p>%REVIEW% Presumably IDs are still scoped to a single document, * and this operation searches only within a single document, right? * Wouldn't want collisions between DTMs in the same process.</p> * * @param elementId The unique <code>id</code> value for an element. * @return The handle of the matching element. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>Element</code> whose <code>ID</code> is given by <code>elementId</code>. If no such element exists, returns <code>DTM.NULL</code>. Behavior is not defined if more than one element has this <code>ID</code>. Attributes (including those with the name "ID") are not of type ID unless so defined by DTD/Schema information available to the DTM implementation. Implementations that do not know whether attributes are of type ID or not are expected to return <code>DTM.NULL</code>. * <p>%REVIEW% Presumably IDs are still scoped to a single document, and this operation searches only within a single document, right? Wouldn't want collisions between DTMs in the same process.</p> * @param elementId The unique <code>id</code> value for an element. @return The handle of the matching element. 
public	TokenNamepublic	
int	TokenNameint	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementId	TokenNameIdentifier	 element Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The getUnparsedEntityURI function returns the URI of the unparsed * entity with the specified name in the same document as the context * node (see [3.3 Unparsed Entities]). It returns the empty string if * there is no such entity. * <p> * XML processors may choose to use the System Identifier (if one * is provided) to resolve the entity, rather than the URI in the * Public Identifier. The details are dependent on the processor, and * we would have to support some form of plug-in resolver to handle * this properly. Currently, we simply return the System Identifier if * present, and hope that it a usable URI or that our caller can * map it to one. * %REVIEW% Resolve Public Identifiers... or consider changing function name. * <p> * If we find a relative URI * reference, XML expects it to be resolved in terms of the base URI * of the document. The DOM doesn't do that for us, and it isn't * entirely clear whether that should be done here; currently that's * pushed up to a higher level of our application. (Note that DOM Level * 1 didn't store the document's base URI.) * %REVIEW% Consider resolving Relative URIs. * <p> * (The DOM's statement that "An XML processor may choose to * completely expand entities before the structure model is passed * to the DOM" refers only to parsed entities, not unparsed, and hence * doesn't affect this function.) * * @param name A string containing the Entity Name of the unparsed * entity. * * @return String containing the URI of the Unparsed Entity, or an * empty string if no such entity exists. */	TokenNameCOMMENT_JAVADOC	 The getUnparsedEntityURI function returns the URI of the unparsed entity with the specified name in the same document as the context node (see [3.3 Unparsed Entities]). It returns the empty string if there is no such entity. <p> XML processors may choose to use the System Identifier (if one is provided) to resolve the entity, rather than the URI in the Public Identifier. The details are dependent on the processor, and we would have to support some form of plug-in resolver to handle this properly. Currently, we simply return the System Identifier if present, and hope that it a usable URI or that our caller can map it to one. %REVIEW% Resolve Public Identifiers... or consider changing function name. <p> If we find a relative URI reference, XML expects it to be resolved in terms of the base URI of the document. The DOM doesn't do that for us, and it isn't entirely clear whether that should be done here; currently that's pushed up to a higher level of our application. (Note that DOM Level 1 didn't store the document's base URI.) %REVIEW% Consider resolving Relative URIs. <p> (The DOM's statement that "An XML processor may choose to completely expand entities before the structure model is passed to the DOM" refers only to parsed entities, not unparsed, and hence doesn't affect this function.) * @param name A string containing the Entity Name of the unparsed entity. * @return String containing the URI of the Unparsed Entity, or an empty string if no such entity exists. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUnparsedEntityURI	TokenNameIdentifier	 get Unparsed Entity URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ============== Boolean methods ================ 	TokenNameCOMMENT_LINE	============== Boolean methods ================ 
/** * Return true if the xsl:strip-space or xsl:preserve-space was processed * during construction of the document contained in this DTM. * * NEEDSDOC ($objectName$) @return */	TokenNameCOMMENT_JAVADOC	 Return true if the xsl:strip-space or xsl:preserve-space was processed during construction of the document contained in this DTM. * NEEDSDOC ($objectName$) @return 
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsPreStripping	TokenNameIdentifier	 supports Pre Stripping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Figure out whether nodeHandle2 should be considered as being later * in the document than nodeHandle1, in Document Order as defined * by the XPath model. This may not agree with the ordering defined * by other XML applications. * <p> * There are some cases where ordering isn't defined, and neither are * the results of this function -- though we'll generally return true. * <p> * %REVIEW% Make sure this does the right thing with attribute nodes!!! * <p> * %REVIEW% Consider renaming for clarity. Perhaps isDocumentOrder(a,b)? * * @param firstNodeHandle DOM Node to perform position comparison on. * @param secondNodeHandle DOM Node to perform position comparison on. * * @return false if secondNode comes before firstNode, otherwise return true. * You can think of this as * <code>(firstNode.documentOrderPosition &lt;= secondNode.documentOrderPosition)</code>. */	TokenNameCOMMENT_JAVADOC	 Figure out whether nodeHandle2 should be considered as being later in the document than nodeHandle1, in Document Order as defined by the XPath model. This may not agree with the ordering defined by other XML applications. <p> There are some cases where ordering isn't defined, and neither are the results of this function -- though we'll generally return true. <p> %REVIEW% Make sure this does the right thing with attribute nodes!!! <p> %REVIEW% Consider renaming for clarity. Perhaps isDocumentOrder(a,b)? * @param firstNodeHandle DOM Node to perform position comparison on. @param secondNodeHandle DOM Node to perform position comparison on. * @return false if secondNode comes before firstNode, otherwise return true. You can think of this as <code>(firstNode.documentOrderPosition &lt;= secondNode.documentOrderPosition)</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
int	TokenNameint	
firstNodeHandle	TokenNameIdentifier	 first Node Handle
,	TokenNameCOMMA	
int	TokenNameint	
secondNodeHandle	TokenNameIdentifier	 second Node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 2. [element content whitespace] A boolean indicating whether a * text node represents white space appearing within element content * (see [XML], 2.10 "White Space Handling"). Note that validating * XML processors are required by XML 1.0 to provide this * information... but that DOM Level 2 did not support it, since it * depends on knowledge of the DTD which DOM2 could not guarantee * would be available. * <p> * If there is no declaration for the containing element, an XML * processor must assume that the whitespace could be meaningful and * return false. If no declaration has been read, but the [all * declarations processed] property of the document information item * is false (so there may be an unread declaration), then the value * of this property is indeterminate for white space characters and * should probably be reported as false. It is always false for text * nodes that contain anything other than (or in addition to) white * space. * <p> * Note too that it always returns false for non-Text nodes. * <p> * %REVIEW% Joe wants to rename this isWhitespaceInElementContent() for clarity * * @param nodeHandle the node ID. * @return <code>true</code> if the node definitely represents whitespace in * element content; <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 2. [element content whitespace] A boolean indicating whether a text node represents white space appearing within element content (see [XML], 2.10 "White Space Handling"). Note that validating XML processors are required by XML 1.0 to provide this information... but that DOM Level 2 did not support it, since it depends on knowledge of the DTD which DOM2 could not guarantee would be available. <p> If there is no declaration for the containing element, an XML processor must assume that the whitespace could be meaningful and return false. If no declaration has been read, but the [all declarations processed] property of the document information item is false (so there may be an unread declaration), then the value of this property is indeterminate for white space characters and should probably be reported as false. It is always false for text nodes that contain anything other than (or in addition to) white space. <p> Note too that it always returns false for non-Text nodes. <p> %REVIEW% Joe wants to rename this isWhitespaceInElementContent() for clarity * @param nodeHandle the node ID. @return <code>true</code> if the node definitely represents whitespace in element content; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCharacterElementContentWhitespace	TokenNameIdentifier	 is Character Element Content Whitespace
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 10. [all declarations processed] This property is not strictly speaking * part of the infoset of the document. Rather it is an indication of * whether the processor has read the complete DTD. Its value is a * boolean. If it is false, then certain properties (indicated in their * descriptions below) may be unknown. If it is true, those properties * are never unknown. * * @param documentHandle A node handle that must identify a document. * @return <code>true</code> if all declarations were processed; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 10. [all declarations processed] This property is not strictly speaking part of the infoset of the document. Rather it is an indication of whether the processor has read the complete DTD. Its value is a boolean. If it is false, then certain properties (indicated in their descriptions below) may be unknown. If it is true, those properties are never unknown. * @param documentHandle A node handle that must identify a document. @return <code>true</code> if all declarations were processed; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocumentAllDeclarationsProcessed	TokenNameIdentifier	 is Document All Declarations Processed
(	TokenNameLPAREN	
int	TokenNameint	
documentHandle	TokenNameIdentifier	 document Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 5. [specified] A flag indicating whether this attribute was actually * specified in the start-tag of its element, or was defaulted from the * DTD (or schema). * * @param attributeHandle The attribute handle * @return <code>true</code> if the attribute was specified; * <code>false</code> if it was defaulted or the handle doesn't * refer to an attribute node. */	TokenNameCOMMENT_JAVADOC	 5. [specified] A flag indicating whether this attribute was actually specified in the start-tag of its element, or was defaulted from the DTD (or schema). * @param attributeHandle The attribute handle @return <code>true</code> if the attribute was specified; <code>false</code> if it was defaulted or the handle doesn't refer to an attribute node. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttributeSpecified	TokenNameIdentifier	 is Attribute Specified
(	TokenNameLPAREN	
int	TokenNameint	
attributeHandle	TokenNameIdentifier	 attribute Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ========== Direct SAX Dispatch, for optimization purposes ======== 	TokenNameCOMMENT_LINE	========== Direct SAX Dispatch, for optimization purposes ======== 
/** * Directly call the * characters method on the passed ContentHandler for the * string-value of the given node (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). Multiple calls to the * ContentHandler's characters methods may well occur for a single call to * this method. * * @param nodeHandle The node ID. * @param ch A non-null reference to a ContentHandler. * @param normalize true if the content should be normalized according to * the rules for the XPath * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a> * function. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly call the characters method on the passed ContentHandler for the string-value of the given node (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Multiple calls to the ContentHandler's characters methods may well occur for a single call to this method. * @param nodeHandle The node ID. @param ch A non-null reference to a ContentHandler. @param normalize true if the content should be normalized according to the rules for the XPath <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a> function. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
boolean	TokenNameboolean	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Directly create SAX parser events representing the XML content of * a DTM subtree. This is a "serialize" operation. * * @param nodeHandle The node ID. * @param ch A non-null reference to a ContentHandler. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Directly create SAX parser events representing the XML content of a DTM subtree. This is a "serialize" operation. * @param nodeHandle The node ID. @param ch A non-null reference to a ContentHandler. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
dispatchToEvents	TokenNameIdentifier	 dispatch To Events
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Return an DOM node for the given node. * * @param nodeHandle The node ID. * * @return A node representation of the DTM node. */	TokenNameCOMMENT_JAVADOC	 Return an DOM node for the given node. * @param nodeHandle The node ID. * @return A node representation of the DTM node. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ==== Construction methods (may not be supported by some implementations!) ===== 	TokenNameCOMMENT_LINE	==== Construction methods (may not be supported by some implementations!) ===== 
// %REVIEW% What response occurs if not supported? 	TokenNameCOMMENT_LINE	%REVIEW% What response occurs if not supported? 
/** * @return true iff we're building this model incrementally (eg * we're partnered with a CoroutineParser) and thus require that the * transformation and the parse run simultaneously. Guidance to the * DTMManager. */	TokenNameCOMMENT_JAVADOC	 @return true iff we're building this model incrementally (eg we're partnered with a CoroutineParser) and thus require that the transformation and the parse run simultaneously. Guidance to the DTMManager. 
public	TokenNamepublic	
boolean	TokenNameboolean	
needsTwoThreads	TokenNameIdentifier	 needs Two Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %REVIEW% Do these appends make any sense, should we support a 	TokenNameCOMMENT_LINE	%REVIEW% Do these appends make any sense, should we support a 
// wider set of methods (like the "append" methods in the 	TokenNameCOMMENT_LINE	wider set of methods (like the "append" methods in the 
// current DTMDocumentImpl draft), or should we just support SAX 	TokenNameCOMMENT_LINE	current DTMDocumentImpl draft), or should we just support SAX 
// listener interfaces? Should it be a separate interface to 	TokenNameCOMMENT_LINE	listener interfaces? Should it be a separate interface to 
// make that distinction explicit? 	TokenNameCOMMENT_LINE	make that distinction explicit? 
/** * Return this DTM's content handler, if it has one. * * @return null if this model doesn't respond to SAX events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's content handler, if it has one. * @return null if this model doesn't respond to SAX events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
getContentHandler	TokenNameIdentifier	 get Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return this DTM's lexical handler, if it has one. * * %REVIEW% Should this return null if constrution already done/begun? * * @return null if this model doesn't respond to lexical SAX events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's lexical handler, if it has one. * %REVIEW% Should this return null if constrution already done/begun? * @return null if this model doesn't respond to lexical SAX events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
getLexicalHandler	TokenNameIdentifier	 get Lexical Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return this DTM's EntityResolver, if it has one. * * @return null if this model doesn't respond to SAX entity ref events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's EntityResolver, if it has one. * @return null if this model doesn't respond to SAX entity ref events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
EntityResolver	TokenNameIdentifier	 Entity Resolver
getEntityResolver	TokenNameIdentifier	 get Entity Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return this DTM's DTDHandler, if it has one. * * @return null if this model doesn't respond to SAX dtd events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's DTDHandler, if it has one. * @return null if this model doesn't respond to SAX dtd events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
DTDHandler	TokenNameIdentifier	 DTD Handler
getDTDHandler	TokenNameIdentifier	 get DTD Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return this DTM's ErrorHandler, if it has one. * * @return null if this model doesn't respond to SAX error events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's ErrorHandler, if it has one. * @return null if this model doesn't respond to SAX error events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return this DTM's DeclHandler, if it has one. * * @return null if this model doesn't respond to SAX Decl events. */	TokenNameCOMMENT_JAVADOC	 Return this DTM's DeclHandler, if it has one. * @return null if this model doesn't respond to SAX Decl events. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
DeclHandler	TokenNameIdentifier	 Decl Handler
getDeclHandler	TokenNameIdentifier	 get Decl Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Append a child to "the end of the document". Please note that * the node is always cloned in a base DTM, since our basic behavior * is immutable so nodes can't be removed from their previous * location. * * <p> %REVIEW% DTM maintains an insertion cursor which * performs a depth-first tree walk as nodes come in, and this operation * is really equivalent to: * insertionCursor.appendChild(document.importNode(newChild))) * where the insert point is the last element that was appended (or * the last one popped back to by an end-element operation).</p> * * @param newChild Must be a valid new node handle. * @param clone true if the child should be cloned into the document. * @param cloneDepth if the clone argument is true, specifies that the * clone should include all it's children. */	TokenNameCOMMENT_JAVADOC	 Append a child to "the end of the document". Please note that the node is always cloned in a base DTM, since our basic behavior is immutable so nodes can't be removed from their previous location. * <p> %REVIEW% DTM maintains an insertion cursor which performs a depth-first tree walk as nodes come in, and this operation is really equivalent to: insertionCursor.appendChild(document.importNode(newChild))) where the insert point is the last element that was appended (or the last one popped back to by an end-element operation).</p> * @param newChild Must be a valid new node handle. @param clone true if the child should be cloned into the document. @param cloneDepth if the clone argument is true, specifies that the clone should include all it's children. 
public	TokenNamepublic	
void	TokenNamevoid	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
int	TokenNameint	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
boolean	TokenNameboolean	
clone	TokenNameIdentifier	 clone
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cloneDepth	TokenNameIdentifier	 clone Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Append a text node child that will be constructed from a string, * to the end of the document. Behavior is otherwise like appendChild(). * * @param str Non-null reference to a string. */	TokenNameCOMMENT_JAVADOC	 Append a text node child that will be constructed from a string, to the end of the document. Behavior is otherwise like appendChild(). * @param str Non-null reference to a string. 
public	TokenNamepublic	
void	TokenNamevoid	
appendTextChild	TokenNameIdentifier	 append Text Child
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the location of a node in the source document. * * @param node an <code>int</code> value * @return a <code>SourceLocator</code> value or null if no location * is available */	TokenNameCOMMENT_JAVADOC	 Get the location of a node in the source document. * @param node an <code>int</code> value @return a <code>SourceLocator</code> value or null if no location is available 
public	TokenNamepublic	
SourceLocator	TokenNameIdentifier	 Source Locator
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * As the DTM is registered with the DTMManager, this method * will be called. This will give the DTM implementation a * chance to initialize any subsystems that are required to * build the DTM */	TokenNameCOMMENT_JAVADOC	 As the DTM is registered with the DTMManager, this method will be called. This will give the DTM implementation a chance to initialize any subsystems that are required to build the DTM 
public	TokenNamepublic	
void	TokenNamevoid	
documentRegistration	TokenNameIdentifier	 document Registration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * As documents are released from the DTMManager, the DTM implementation * will be notified of the event. This will allow the DTM implementation * to shutdown any subsystem activity that may of been assoiated with * the active DTM Implementation. */	TokenNameCOMMENT_JAVADOC	 As documents are released from the DTMManager, the DTM implementation will be notified of the event. This will allow the DTM implementation to shutdown any subsystem activity that may of been assoiated with the active DTM Implementation. 
public	TokenNamepublic	
void	TokenNamevoid	
documentRelease	TokenNameIdentifier	 document Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Migrate a DTM built with an old DTMManager to a new DTMManager. * After the migration, the new DTMManager will treat the DTM as * one that is built by itself. * This is used to support DTM sharing between multiple transformations. * @param manager the DTMManager */	TokenNameCOMMENT_JAVADOC	 Migrate a DTM built with an old DTMManager to a new DTMManager. After the migration, the new DTMManager will treat the DTM as one that is built by itself. This is used to support DTM sharing between multiple transformations. @param manager the DTMManager 
public	TokenNamepublic	
void	TokenNamevoid	
migrateTo	TokenNameIdentifier	 migrate To
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
