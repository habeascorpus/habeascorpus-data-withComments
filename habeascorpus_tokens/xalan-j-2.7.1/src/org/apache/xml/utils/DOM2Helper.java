/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOM2Helper.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOM2Helper.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
/** * @deprecated Since the introduction of the DTM, this class will be removed. * This class provides a DOM level 2 "helper", which provides services currently * not provided be the DOM standard. */	TokenNameCOMMENT_JAVADOC	 @deprecated Since the introduction of the DTM, this class will be removed. This class provides a DOM level 2 "helper", which provides services currently not provided be the DOM standard. 
public	TokenNamepublic	
class	TokenNameclass	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
extends	TokenNameextends	
DOMHelper	TokenNameIdentifier	 DOM Helper
{	TokenNameLBRACE	
/** * Construct an instance. */	TokenNameCOMMENT_JAVADOC	 Construct an instance. 
public	TokenNamepublic	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Check node to see if it was created by a DOM implementation * that this helper is intended to support. This is currently * disabled, and assumes all nodes are acceptable rather than checking * that they implement org.apache.xerces.dom.NodeImpl. * * @param node The node to be tested. * * @throws TransformerException if the node is not one which this * DOM2Helper can support. If we return without throwing the exception, * the node is compatable. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Check node to see if it was created by a DOM implementation that this helper is intended to support. This is currently disabled, and assumes all nodes are acceptable rather than checking that they implement org.apache.xerces.dom.NodeImpl. * @param node The node to be tested. * @throws TransformerException if the node is not one which this DOM2Helper can support. If we return without throwing the exception, the node is compatable. @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
checkNode	TokenNameIdentifier	 check Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// if(!(node instanceof org.apache.xerces.dom.NodeImpl)) 	TokenNameCOMMENT_LINE	if(!(node instanceof org.apache.xerces.dom.NodeImpl)) 
// throw new TransformerException(XSLMessages.createXPATHMessage(XPATHErrorResources.ER_XERCES_CANNOT_HANDLE_NODES, new Object[]{((Object)node).getClass()})); //"DOM2Helper can not handle nodes of type" 	TokenNameCOMMENT_LINE	throw new TransformerException(XSLMessages.createXPATHMessage(XPATHErrorResources.ER_XERCES_CANNOT_HANDLE_NODES, new Object[]{((Object)node).getClass()})); //"DOM2Helper can not handle nodes of type" 
//+((Object)node).getClass()); 	TokenNameCOMMENT_LINE	+((Object)node).getClass()); 
}	TokenNameRBRACE	
/** * Returns true if the DOM implementation handled by this helper * supports the SAX ContentHandler interface. * * @return true (since Xerces does). */	TokenNameCOMMENT_JAVADOC	 Returns true if the DOM implementation handled by this helper supports the SAX ContentHandler interface. * @return true (since Xerces does). 
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsSAX	TokenNameIdentifier	 supports SAX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Field m_doc: Document Node for the document this helper is currently * accessing or building * @see #setDocument * @see #getDocument * */	TokenNameCOMMENT_JAVADOC	 Field m_doc: Document Node for the document this helper is currently accessing or building @see #setDocument @see #getDocument 
private	TokenNameprivate	
Document	TokenNameIdentifier	 Document
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
/** * Specify which document this helper is currently operating on. * * @param doc The DOM Document node for this document. * @see #getDocument */	TokenNameCOMMENT_JAVADOC	 Specify which document this helper is currently operating on. * @param doc The DOM Document node for this document. @see #getDocument 
public	TokenNamepublic	
void	TokenNamevoid	
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_doc	TokenNameIdentifier	 m doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Query which document this helper is currently operating on. * * @return The DOM Document node for this document. * @see #setDocument */	TokenNameCOMMENT_JAVADOC	 Query which document this helper is currently operating on. * @return The DOM Document node for this document. @see #setDocument 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse an XML document. * * <p>Right now the Xerces DOMParser class is used. This needs * fixing, either via jaxp, or via some other, standard method.</p> * * <p>The application can use this method to instruct the SAX parser * to begin parsing an XML document from any valid input * source (a character stream, a byte stream, or a URI).</p> * * <p>Applications may not invoke this method while a parse is in * progress (they should create a new Parser instead for each * additional XML document). Once a parse is complete, an * application may reuse the same Parser object, possibly with a * different input source.</p> * * @param source The input source for the top-level of the * XML document. * * @throws TransformerException if any checked exception is thrown. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Parse an XML document. * <p>Right now the Xerces DOMParser class is used. This needs fixing, either via jaxp, or via some other, standard method.</p> * <p>The application can use this method to instruct the SAX parser to begin parsing an XML document from any valid input source (a character stream, a byte stream, or a URI).</p> * <p>Applications may not invoke this method while a parse is in progress (they should create a new Parser instead for each additional XML document). Once a parse is complete, an application may reuse the same Parser object, possibly with a different input source.</p> * @param source The input source for the top-level of the XML document. * @throws TransformerException if any checked exception is thrown. @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// I guess I should use JAXP factory here... when it's legal. 	TokenNameCOMMENT_LINE	I guess I should use JAXP factory here... when it's legal. 
// org.apache.xerces.parsers.DOMParser parser 	TokenNameCOMMENT_LINE	org.apache.xerces.parsers.DOMParser parser 
// = new org.apache.xerces.parsers.DOMParser(); 	TokenNameCOMMENT_LINE	= new org.apache.xerces.parsers.DOMParser(); 
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
builderFactory	TokenNameIdentifier	 builder Factory
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builderFactory	TokenNameIdentifier	 builder Factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builderFactory	TokenNameIdentifier	 builder Factory
.	TokenNameDOT	
setValidating	TokenNameIdentifier	 set Validating
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
builderFactory	TokenNameIdentifier	 builder Factory
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* // domParser.setFeature("http://apache.org/xml/features/dom/create-entity-ref-nodes", getShouldExpandEntityRefs()? false : true); if(m_useDOM2getNamespaceURI) { parser.setFeature("http://apache.org/xml/features/dom/defer-node-expansion", true); parser.setFeature("http://xml.org/sax/features/namespaces", true); } else { parser.setFeature("http://apache.org/xml/features/dom/defer-node-expansion", false); } parser.setFeature("http://apache.org/xml/features/allow-java-encodings", true); */	TokenNameCOMMENT_BLOCK	 // domParser.setFeature("http://apache.org/xml/features/dom/create-entity-ref-nodes", getShouldExpandEntityRefs()? false : true); if(m_useDOM2getNamespaceURI) { parser.setFeature("http://apache.org/xml/features/dom/defer-node-expansion", true); parser.setFeature("http://xml.org/sax/features/namespaces", true); } else { parser.setFeature("http://apache.org/xml/features/dom/defer-node-expansion", false); } parser.setFeature("http://apache.org/xml/features/allow-java-encodings", true); 
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if(null != m_entityResolver) 	TokenNameCOMMENT_LINE	if(null != m_entityResolver) 
// { 	TokenNameCOMMENT_LINE	{ 
// System.out.println("Setting the entity resolver."); 	TokenNameCOMMENT_LINE	System.out.println("Setting the entity resolver."); 
// parser.setEntityResolver(m_entityResolver); 	TokenNameCOMMENT_LINE	parser.setEntityResolver(m_entityResolver); 
// } 	TokenNameCOMMENT_LINE	} 
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
pce	TokenNameIdentifier	 pce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
pce	TokenNameIdentifier	 pce
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setDocument(((org.apache.xerces.parsers.DOMParser)parser).getDocument()); 	TokenNameCOMMENT_LINE	setDocument(((org.apache.xerces.parsers.DOMParser)parser).getDocument()); 
}	TokenNameRBRACE	
/** * Given an XML ID, return the element. This requires assistance from the * DOM and parser, and is meaningful only in the context of a DTD * or schema which declares attributes as being of type ID. This * information may or may not be available in all parsers, may or * may not be available for specific documents, and may or may not * be available when validation is not turned on. * * @param id The ID to search for, as a String. * @param doc The document to search within, as a DOM Document node. * @return DOM Element node with an attribute of type ID whose value * uniquely matches the requested id string, or null if there isn't * such an element or if the DOM can't answer the question for other * reasons. */	TokenNameCOMMENT_JAVADOC	 Given an XML ID, return the element. This requires assistance from the DOM and parser, and is meaningful only in the context of a DTD or schema which declares attributes as being of type ID. This information may or may not be available in all parsers, may or may not be available for specific documents, and may or may not be available when validation is not turned on. * @param id The ID to search for, as a String. @param doc The document to search within, as a DOM Document node. @return DOM Element node with an attribute of type ID whose value uniquely matches the requested id string, or null if there isn't such an element or if the DOM can't answer the question for other reasons. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getElementByID	TokenNameIdentifier	 get Element By ID
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Figure out whether node2 should be considered as being later * in the document than node1, in Document Order as defined * by the XPath model. This may not agree with the ordering defined * by other XML applications. * <p> * There are some cases where ordering isn't defined, and neither are * the results of this function -- though we'll generally return true. * <p> * TODO: Make sure this does the right thing with attribute nodes!!! * * @param node1 DOM Node to perform position comparison on. * @param node2 DOM Node to perform position comparison on . * * @return false if node2 comes before node1, otherwise return true. * You can think of this as * <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>. */	TokenNameCOMMENT_JAVADOC	 Figure out whether node2 should be considered as being later in the document than node1, in Document Order as defined by the XPath model. This may not agree with the ordering defined by other XML applications. <p> There are some cases where ordering isn't defined, and neither are the results of this function -- though we'll generally return true. <p> TODO: Make sure this does the right thing with attribute nodes!!! * @param node1 DOM Node to perform position comparison on. @param node2 DOM Node to perform position comparison on . * @return false if node2 comes before node1, otherwise return true. You can think of this as <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node1	TokenNameIdentifier	 node1
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
node2	TokenNameIdentifier	 node2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume first that the nodes are DTM nodes, since discovering node 	TokenNameCOMMENT_LINE	Assume first that the nodes are DTM nodes, since discovering node 
// order is massivly faster for the DTM. 	TokenNameCOMMENT_LINE	order is massivly faster for the DTM. 
if	TokenNameif	
(	TokenNameLPAREN	
node1	TokenNameIdentifier	 node1
instanceof	TokenNameinstanceof	
DOMOrder	TokenNameIdentifier	 DOM Order
&&	TokenNameAND_AND	
node2	TokenNameIdentifier	 node2
instanceof	TokenNameinstanceof	
DOMOrder	TokenNameIdentifier	 DOM Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index1	TokenNameIdentifier	 index1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMOrder	TokenNameIdentifier	 DOM Order
)	TokenNameRPAREN	
node1	TokenNameIdentifier	 node1
)	TokenNameRPAREN	
.	TokenNameDOT	
getUid	TokenNameIdentifier	 get Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index2	TokenNameIdentifier	 index2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMOrder	TokenNameIdentifier	 DOM Order
)	TokenNameRPAREN	
node2	TokenNameIdentifier	 node2
)	TokenNameRPAREN	
.	TokenNameDOT	
getUid	TokenNameIdentifier	 get Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index1	TokenNameIdentifier	 index1
<=	TokenNameLESS_EQUAL	
index2	TokenNameIdentifier	 index2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// isNodeAfter will return true if node is after countedNode 	TokenNameCOMMENT_LINE	isNodeAfter will return true if node is after countedNode 
// in document order. The base isNodeAfter is sloooow (relatively). 	TokenNameCOMMENT_LINE	in document order. The base isNodeAfter is sloooow (relatively). 
return	TokenNamereturn	
DOMHelper	TokenNameIdentifier	 DOM Helper
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
node1	TokenNameIdentifier	 node1
,	TokenNameCOMMA	
node2	TokenNameIdentifier	 node2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the XPath-model parent of a node. This version takes advantage * of the DOM Level 2 Attr.ownerElement() method; the base version we * would otherwise inherit is prepared to fall back on exhaustively * walking the document to find an Attr's parent. * * @param node Node to be examined * * @return the DOM parent of the input node, if there is one, or the * ownerElement if the input node is an Attr, or null if the node is * a Document, a DocumentFragment, or an orphan. */	TokenNameCOMMENT_JAVADOC	 Get the XPath-model parent of a node. This version takes advantage of the DOM Level 2 Attr.ownerElement() method; the base version we would otherwise inherit is prepared to fall back on exhaustively walking the document to find an Attr's parent. * @param node Node to be examined * @return the DOM parent of the input node, if there is one, or the ownerElement if the input node is an Attr, or null if the node is a Document, a DocumentFragment, or an orphan. 
public	TokenNamepublic	
static	TokenNamestatic	
Node	TokenNameIdentifier	 Node
getParentOfNode	TokenNameIdentifier	 get Parent Of Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local name of the given node, as defined by the * XML Namespaces specification. This is prepared to handle documents * built using DOM Level 1 methods by falling back upon explicitly * parsing the node name. * * @param n Node to be examined * * @return String containing the local name, or null if the node * was not assigned a Namespace. */	TokenNameCOMMENT_JAVADOC	 Returns the local name of the given node, as defined by the XML Namespaces specification. This is prepared to handle documents built using DOM Level 1 methods by falling back upon explicitly parsing the node name. * @param n Node to be examined * @return String containing the local name, or null if the node was not assigned a Namespace. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalNameOfNode	TokenNameIdentifier	 get Local Name Of Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
getLocalNameOfNode	TokenNameIdentifier	 get Local Name Of Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Namespace Name (Namespace URI) for the given node. * In a Level 2 DOM, you can ask the node itself. Note, however, that * doing so conflicts with our decision in getLocalNameOfNode not * to trust the that the DOM was indeed created using the Level 2 * methods. If Level 1 methods were used, these two functions will * disagree with each other. * <p> * TODO: Reconcile with getLocalNameOfNode. * * @param n Node to be examined * * @return String containing the Namespace URI bound to this DOM node * at the time the Node was created. */	TokenNameCOMMENT_JAVADOC	 Returns the Namespace Name (Namespace URI) for the given node. In a Level 2 DOM, you can ask the node itself. Note, however, that doing so conflicts with our decision in getLocalNameOfNode not to trust the that the DOM was indeed created using the Level 2 methods. If Level 1 methods were used, these two functions will disagree with each other. <p> TODO: Reconcile with getLocalNameOfNode. * @param n Node to be examined * @return String containing the Namespace URI bound to this DOM node at the time the Node was created. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceOfNode	TokenNameIdentifier	 get Namespace Of Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Field m_useDOM2getNamespaceURI is a compile-time flag which * gates some of the parser options used to build a DOM -- but * that code is commented out at this time and nobody else * references it, so I've commented this out as well. */	TokenNameCOMMENT_JAVADOC	 Field m_useDOM2getNamespaceURI is a compile-time flag which gates some of the parser options used to build a DOM -- but that code is commented out at this time and nobody else references it, so I've commented this out as well. 
//private boolean m_useDOM2getNamespaceURI = false; 	TokenNameCOMMENT_LINE	private boolean m_useDOM2getNamespaceURI = false; 
}	TokenNameRBRACE	
