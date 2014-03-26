/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMFilter.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMFilter.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
/** * Simple filter for doing node tests. Note the semantics of this are * somewhat different that the DOM's NodeFilter. */	TokenNameCOMMENT_JAVADOC	 Simple filter for doing node tests. Note the semantics of this are somewhat different that the DOM's NodeFilter. 
public	TokenNamepublic	
interface	TokenNameinterface	
DTMFilter	TokenNameIdentifier	 DTM Filter
{	TokenNameLBRACE	
// Constants for whatToShow. These are used to set the node type that will 	TokenNameCOMMENT_LINE	Constants for whatToShow. These are used to set the node type that will 
// be traversed. These values may be ORed together before being passed to 	TokenNameCOMMENT_LINE	be traversed. These values may be ORed together before being passed to 
// the DTMIterator. 	TokenNameCOMMENT_LINE	the DTMIterator. 
/** * Show all <code>Nodes</code>. */	TokenNameCOMMENT_JAVADOC	 Show all <code>Nodes</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
=	TokenNameEQUAL	
0xFFFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>Element</code> nodes. */	TokenNameCOMMENT_JAVADOC	 Show <code>Element</code> nodes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_ELEMENT	TokenNameIdentifier	 SHOW  ELEMENT
=	TokenNameEQUAL	
0x00000001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>Attr</code> nodes. This is meaningful only when creating an * iterator or tree-walker with an attribute node as its * <code>root</code>; in this case, it means that the attribute node * will appear in the first position of the iteration or traversal. * Since attributes are never children of other nodes, they do not * appear when traversing over the main document tree. */	TokenNameCOMMENT_JAVADOC	 Show <code>Attr</code> nodes. This is meaningful only when creating an iterator or tree-walker with an attribute node as its <code>root</code>; in this case, it means that the attribute node will appear in the first position of the iteration or traversal. Since attributes are never children of other nodes, they do not appear when traversing over the main document tree. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_ATTRIBUTE	TokenNameIdentifier	 SHOW  ATTRIBUTE
=	TokenNameEQUAL	
0x00000002	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>Text</code> nodes. */	TokenNameCOMMENT_JAVADOC	 Show <code>Text</code> nodes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_TEXT	TokenNameIdentifier	 SHOW  TEXT
=	TokenNameEQUAL	
0x00000004	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>CDATASection</code> nodes. */	TokenNameCOMMENT_JAVADOC	 Show <code>CDATASection</code> nodes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_CDATA_SECTION	TokenNameIdentifier	 SHOW  CDATA  SECTION
=	TokenNameEQUAL	
0x00000008	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>EntityReference</code> nodes. Note that if Entity References * have been fully expanded while the tree was being constructed, these * nodes will not appear and this mask has no effect. */	TokenNameCOMMENT_JAVADOC	 Show <code>EntityReference</code> nodes. Note that if Entity References have been fully expanded while the tree was being constructed, these nodes will not appear and this mask has no effect. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_ENTITY_REFERENCE	TokenNameIdentifier	 SHOW  ENTITY  REFERENCE
=	TokenNameEQUAL	
0x00000010	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>Entity</code> nodes. This is meaningful only when creating * an iterator or tree-walker with an<code> Entity</code> node as its * <code>root</code>; in this case, it means that the <code>Entity</code> * node will appear in the first position of the traversal. Since * entities are not part of the document tree, they do not appear when * traversing over the main document tree. */	TokenNameCOMMENT_JAVADOC	 Show <code>Entity</code> nodes. This is meaningful only when creating an iterator or tree-walker with an<code> Entity</code> node as its <code>root</code>; in this case, it means that the <code>Entity</code> node will appear in the first position of the traversal. Since entities are not part of the document tree, they do not appear when traversing over the main document tree. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_ENTITY	TokenNameIdentifier	 SHOW  ENTITY
=	TokenNameEQUAL	
0x00000020	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>ProcessingInstruction</code> nodes. */	TokenNameCOMMENT_JAVADOC	 Show <code>ProcessingInstruction</code> nodes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_PROCESSING_INSTRUCTION	TokenNameIdentifier	 SHOW  PROCESSING  INSTRUCTION
=	TokenNameEQUAL	
0x00000040	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>Comment</code> nodes. */	TokenNameCOMMENT_JAVADOC	 Show <code>Comment</code> nodes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_COMMENT	TokenNameIdentifier	 SHOW  COMMENT
=	TokenNameEQUAL	
0x00000080	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>Document</code> nodes. (Of course, as with Attributes * and such, this is meaningful only when the iteration root is the * Document itself, since Document has no parent.) */	TokenNameCOMMENT_JAVADOC	 Show <code>Document</code> nodes. (Of course, as with Attributes and such, this is meaningful only when the iteration root is the Document itself, since Document has no parent.) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_DOCUMENT	TokenNameIdentifier	 SHOW  DOCUMENT
=	TokenNameEQUAL	
0x00000100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>DocumentType</code> nodes. */	TokenNameCOMMENT_JAVADOC	 Show <code>DocumentType</code> nodes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_DOCUMENT_TYPE	TokenNameIdentifier	 SHOW  DOCUMENT  TYPE
=	TokenNameEQUAL	
0x00000200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>DocumentFragment</code> nodes. (Of course, as with * Attributes and such, this is meaningful only when the iteration * root is the Document itself, since DocumentFragment has no parent.) */	TokenNameCOMMENT_JAVADOC	 Show <code>DocumentFragment</code> nodes. (Of course, as with Attributes and such, this is meaningful only when the iteration root is the Document itself, since DocumentFragment has no parent.) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_DOCUMENT_FRAGMENT	TokenNameIdentifier	 SHOW  DOCUMENT  FRAGMENT
=	TokenNameEQUAL	
0x00000400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Show <code>Notation</code> nodes. This is meaningful only when creating * an iterator or tree-walker with a <code>Notation</code> node as its * <code>root</code>; in this case, it means that the * <code>Notation</code> node will appear in the first position of the * traversal. Since notations are not part of the document tree, they do * not appear when traversing over the main document tree. */	TokenNameCOMMENT_JAVADOC	 Show <code>Notation</code> nodes. This is meaningful only when creating an iterator or tree-walker with a <code>Notation</code> node as its <code>root</code>; in this case, it means that the <code>Notation</code> node will appear in the first position of the traversal. Since notations are not part of the document tree, they do not appear when traversing over the main document tree. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_NOTATION	TokenNameIdentifier	 SHOW  NOTATION
=	TokenNameEQUAL	
0x00000800	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This bit instructs the iterator to show namespace nodes, which * are modeled by DTM but not by the DOM. Make sure this does not * conflict with {@link org.w3c.dom.traversal.NodeFilter}. * <p> * %REVIEW% Might be safer to start from higher bits and work down, * to leave room for the DOM to expand its set of constants... Or, * possibly, to create a DTM-specific field for these additional bits. */	TokenNameCOMMENT_JAVADOC	 This bit instructs the iterator to show namespace nodes, which are modeled by DTM but not by the DOM. Make sure this does not conflict with {@link org.w3c.dom.traversal.NodeFilter}. <p> %REVIEW% Might be safer to start from higher bits and work down, to leave room for the DOM to expand its set of constants... Or, possibly, to create a DTM-specific field for these additional bits. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_NAMESPACE	TokenNameIdentifier	 SHOW  NAMESPACE
=	TokenNameEQUAL	
0x00001000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Special bit for filters implementing match patterns starting with * a function. Make sure this does not conflict with * {@link org.w3c.dom.traversal.NodeFilter}. * <p> * %REVIEW% Might be safer to start from higher bits and work down, * to leave room for the DOM to expand its set of constants... Or, * possibly, to create a DTM-specific field for these additional bits. */	TokenNameCOMMENT_JAVADOC	 Special bit for filters implementing match patterns starting with a function. Make sure this does not conflict with {@link org.w3c.dom.traversal.NodeFilter}. <p> %REVIEW% Might be safer to start from higher bits and work down, to leave room for the DOM to expand its set of constants... Or, possibly, to create a DTM-specific field for these additional bits. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_BYFUNCTION	TokenNameIdentifier	 SHOW  BYFUNCTION
=	TokenNameEQUAL	
0x00010000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Test whether a specified node is visible in the logical view of a * <code>DTMIterator</code>. Normally, this function * will be called by the implementation of <code>DTMIterator</code>; * it is not normally called directly from * user code. * * @param nodeHandle int Handle of the node. * @param whatToShow one of SHOW_XXX values. * @return one of FILTER_ACCEPT, FILTER_REJECT, or FILTER_SKIP. */	TokenNameCOMMENT_JAVADOC	 Test whether a specified node is visible in the logical view of a <code>DTMIterator</code>. Normally, this function will be called by the implementation of <code>DTMIterator</code>; it is not normally called directly from user code. * @param nodeHandle int Handle of the node. @param whatToShow one of SHOW_XXX values. @return one of FILTER_ACCEPT, FILTER_REJECT, or FILTER_SKIP. 
public	TokenNamepublic	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Test whether a specified node is visible in the logical view of a * <code>DTMIterator</code>. Normally, this function * will be called by the implementation of <code>DTMIterator</code>; * it is not normally called directly from * user code. * <p> * TODO: Should this be setNameMatch(expandedName) followed by accept()? * Or will we really be testing a different name at every invocation? * * <p>%REVIEW% Under what circumstances will this be used? The cases * I've considered are just as easy and just about as efficient if * the name test is performed in the DTMIterator... -- Joe</p> * * <p>%REVIEW% Should that 0xFFFF have a mnemonic assigned to it? * Also: This representation is assuming the expanded name is indeed * split into high/low 16-bit halfwords. If we ever change the * balance between namespace and localname bits (eg because we * decide there are many more localnames than namespaces, which is * fairly likely), this is going to break. It might be safer to * encapsulate the details with a makeExpandedName method and make * that responsible for setting up the wildcard version as well.</p> * * @param nodeHandle int Handle of the node. * @param whatToShow one of SHOW_XXX values. * @param expandedName a value defining the exanded name as defined in * the DTM interface. Wild cards will be defined * by 0xFFFF in the namespace and/or localname * portion of the expandedName. * @return one of FILTER_ACCEPT, FILTER_REJECT, or FILTER_SKIP. */	TokenNameCOMMENT_JAVADOC	 Test whether a specified node is visible in the logical view of a <code>DTMIterator</code>. Normally, this function will be called by the implementation of <code>DTMIterator</code>; it is not normally called directly from user code. <p> TODO: Should this be setNameMatch(expandedName) followed by accept()? Or will we really be testing a different name at every invocation? * <p>%REVIEW% Under what circumstances will this be used? The cases I've considered are just as easy and just about as efficient if the name test is performed in the DTMIterator... -- Joe</p> * <p>%REVIEW% Should that 0xFFFF have a mnemonic assigned to it? Also: This representation is assuming the expanded name is indeed split into high/low 16-bit halfwords. If we ever change the balance between namespace and localname bits (eg because we decide there are many more localnames than namespaces, which is fairly likely), this is going to break. It might be safer to encapsulate the details with a makeExpandedName method and make that responsible for setting up the wildcard version as well.</p> * @param nodeHandle int Handle of the node. @param whatToShow one of SHOW_XXX values. @param expandedName a value defining the exanded name as defined in the DTM interface. Wild cards will be defined by 0xFFFF in the namespace and/or localname portion of the expandedName. @return one of FILTER_ACCEPT, FILTER_REJECT, or FILTER_SKIP. 
public	TokenNamepublic	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
int	TokenNameint	
expandedName	TokenNameIdentifier	 expanded Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
