/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ClonerToResultTree.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ClonerToResultTree.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
.	TokenNameDOT	
SerializerUtils	TokenNameIdentifier	 Serializer Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
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
/** * Class used to clone a node, possibly including its children to * a result tree. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Class used to clone a node, possibly including its children to a result tree. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ClonerToResultTree	TokenNameIdentifier	 Cloner To Result Tree
{	TokenNameLBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Clone an element with or without children. 	TokenNameCOMMENT_LINE	* Clone an element with or without children. 
// * TODO: Fix or figure out node clone failure! 	TokenNameCOMMENT_LINE	* TODO: Fix or figure out node clone failure! 
// * the error condition is severe enough to halt processing. 	TokenNameCOMMENT_LINE	* the error condition is severe enough to halt processing. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param node The node to clone 	TokenNameCOMMENT_LINE	* @param node The node to clone 
// * @param shouldCloneAttributes Flag indicating whether to 	TokenNameCOMMENT_LINE	* @param shouldCloneAttributes Flag indicating whether to 
// * clone children attributes 	TokenNameCOMMENT_LINE	* clone children attributes 
// * 	TokenNameCOMMENT_LINE	* 
// * @throws TransformerException 	TokenNameCOMMENT_LINE	* @throws TransformerException 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void cloneToResultTree(int node, boolean shouldCloneAttributes) 	TokenNameCOMMENT_LINE	public void cloneToResultTree(int node, boolean shouldCloneAttributes) 
// throws TransformerException 	TokenNameCOMMENT_LINE	throws TransformerException 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// try 	TokenNameCOMMENT_LINE	try 
// { 	TokenNameCOMMENT_LINE	{ 
// XPathContext xctxt = m_transformer.getXPathContext(); 	TokenNameCOMMENT_LINE	XPathContext xctxt = m_transformer.getXPathContext(); 
// DTM dtm = xctxt.getDTM(node); 	TokenNameCOMMENT_LINE	DTM dtm = xctxt.getDTM(node); 
// 	TokenNameCOMMENT_LINE	 
// int type = dtm.getNodeType(node); 	TokenNameCOMMENT_LINE	int type = dtm.getNodeType(node); 
// switch (type) 	TokenNameCOMMENT_LINE	switch (type) 
// { 	TokenNameCOMMENT_LINE	{ 
// case DTM.TEXT_NODE : 	TokenNameCOMMENT_LINE	case DTM.TEXT_NODE : 
// dtm.dispatchCharactersEvents(node, m_rth, false); 	TokenNameCOMMENT_LINE	dtm.dispatchCharactersEvents(node, m_rth, false); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case DTM.DOCUMENT_FRAGMENT_NODE : 	TokenNameCOMMENT_LINE	case DTM.DOCUMENT_FRAGMENT_NODE : 
// case DTM.DOCUMENT_NODE : 	TokenNameCOMMENT_LINE	case DTM.DOCUMENT_NODE : 
// 	TokenNameCOMMENT_LINE	 
// // Can't clone a document, but refrain from throwing an error 	TokenNameCOMMENT_LINE	// Can't clone a document, but refrain from throwing an error 
// // so that copy-of will work 	TokenNameCOMMENT_LINE	// so that copy-of will work 
// break; 	TokenNameCOMMENT_LINE	break; 
// case DTM.ELEMENT_NODE : 	TokenNameCOMMENT_LINE	case DTM.ELEMENT_NODE : 
// { 	TokenNameCOMMENT_LINE	{ 
// Attributes atts; 	TokenNameCOMMENT_LINE	Attributes atts; 
// 	TokenNameCOMMENT_LINE	 
// if (shouldCloneAttributes) 	TokenNameCOMMENT_LINE	if (shouldCloneAttributes) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_rth.addAttributes(node); 	TokenNameCOMMENT_LINE	m_rth.addAttributes(node); 
// m_rth.processNSDecls(node, type, dtm); 	TokenNameCOMMENT_LINE	m_rth.processNSDecls(node, type, dtm); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// String ns = dtm.getNamespaceURI(node); 	TokenNameCOMMENT_LINE	String ns = dtm.getNamespaceURI(node); 
// String localName = dtm.getLocalName(node); 	TokenNameCOMMENT_LINE	String localName = dtm.getLocalName(node); 
// 	TokenNameCOMMENT_LINE	 
// m_rth.startElement(ns, localName, dtm.getNodeNameX(node), null); 	TokenNameCOMMENT_LINE	m_rth.startElement(ns, localName, dtm.getNodeNameX(node), null); 
// } 	TokenNameCOMMENT_LINE	} 
// break; 	TokenNameCOMMENT_LINE	break; 
// case DTM.CDATA_SECTION_NODE : 	TokenNameCOMMENT_LINE	case DTM.CDATA_SECTION_NODE : 
// m_rth.startCDATA(); 	TokenNameCOMMENT_LINE	m_rth.startCDATA(); 
// dtm.dispatchCharactersEvents(node, m_rth, false); 	TokenNameCOMMENT_LINE	dtm.dispatchCharactersEvents(node, m_rth, false); 
// m_rth.endCDATA(); 	TokenNameCOMMENT_LINE	m_rth.endCDATA(); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case DTM.ATTRIBUTE_NODE : 	TokenNameCOMMENT_LINE	case DTM.ATTRIBUTE_NODE : 
// m_rth.addAttribute(node); 	TokenNameCOMMENT_LINE	m_rth.addAttribute(node); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case DTM.COMMENT_NODE : 	TokenNameCOMMENT_LINE	case DTM.COMMENT_NODE : 
// XMLString xstr = dtm.getStringValue (node); 	TokenNameCOMMENT_LINE	XMLString xstr = dtm.getStringValue (node); 
// xstr.dispatchAsComment(m_rth); 	TokenNameCOMMENT_LINE	xstr.dispatchAsComment(m_rth); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case DTM.ENTITY_REFERENCE_NODE : 	TokenNameCOMMENT_LINE	case DTM.ENTITY_REFERENCE_NODE : 
// m_rth.entityReference(dtm.getNodeNameX(node)); 	TokenNameCOMMENT_LINE	m_rth.entityReference(dtm.getNodeNameX(node)); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case DTM.PROCESSING_INSTRUCTION_NODE : 	TokenNameCOMMENT_LINE	case DTM.PROCESSING_INSTRUCTION_NODE : 
// { 	TokenNameCOMMENT_LINE	{ 
// // %REVIEW% Is the node name the same as the "target"? 	TokenNameCOMMENT_LINE	// %REVIEW% Is the node name the same as the "target"? 
// m_rth.processingInstruction(dtm.getNodeNameX(node), 	TokenNameCOMMENT_LINE	m_rth.processingInstruction(dtm.getNodeNameX(node), 
// dtm.getNodeValue(node)); 	TokenNameCOMMENT_LINE	dtm.getNodeValue(node)); 
// } 	TokenNameCOMMENT_LINE	} 
// break; 	TokenNameCOMMENT_LINE	break; 
// default : 	TokenNameCOMMENT_LINE	default : 
// //"Can not create item in result tree: "+node.getNodeName()); 	TokenNameCOMMENT_LINE	//"Can not create item in result tree: "+node.getNodeName()); 
// m_transformer.getMsgMgr().error(null, 	TokenNameCOMMENT_LINE	m_transformer.getMsgMgr().error(null, 
// XSLTErrorResources.ER_CANT_CREATE_ITEM, 	TokenNameCOMMENT_LINE	XSLTErrorResources.ER_CANT_CREATE_ITEM, 
// new Object[]{ dtm.getNodeName(node) }); 	TokenNameCOMMENT_LINE	new Object[]{ dtm.getNodeName(node) }); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// catch(org.xml.sax.SAXException se) 	TokenNameCOMMENT_LINE	catch(org.xml.sax.SAXException se) 
// { 	TokenNameCOMMENT_LINE	{ 
// throw new TransformerException(se); 	TokenNameCOMMENT_LINE	throw new TransformerException(se); 
// } 	TokenNameCOMMENT_LINE	} 
// } // end cloneToResultTree function 	TokenNameCOMMENT_LINE	} // end cloneToResultTree function 
/** * Clone an element with or without children. * TODO: Fix or figure out node clone failure! * the error condition is severe enough to halt processing. * * @param node The node to clone * @param shouldCloneAttributes Flag indicating whether to * clone children attributes * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Clone an element with or without children. TODO: Fix or figure out node clone failure! the error condition is severe enough to halt processing. * @param node The node to clone @param shouldCloneAttributes Flag indicating whether to clone children attributes * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
cloneToResultTree	TokenNameIdentifier	 clone To Result Tree
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rth	TokenNameIdentifier	 rth
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldCloneAttributes	TokenNameIdentifier	 should Clone Attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
rth	TokenNameIdentifier	 rth
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
// Can't clone a document, but refrain from throwing an error 	TokenNameCOMMENT_LINE	Can't clone a document, but refrain from throwing an error 
// so that copy-of will work 	TokenNameCOMMENT_LINE	so that copy-of will work 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
// Note: SAX apparently expects "no namespace" to be 	TokenNameCOMMENT_LINE	Note: SAX apparently expects "no namespace" to be 
// represented as "" rather than null. 	TokenNameCOMMENT_LINE	represented as "" rather than null. 
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// rth.startElement(ns, localName, dtm.getNodeNameX(node), null); 	TokenNameCOMMENT_LINE	rth.startElement(ns, localName, dtm.getNodeNameX(node), null); 
// don't call a real SAX startElement (as commented out above), 	TokenNameCOMMENT_LINE	don't call a real SAX startElement (as commented out above), 
// call a SAX-like startElement, to be able to add attributes after this call 	TokenNameCOMMENT_LINE	call a SAX-like startElement, to be able to add attributes after this call 
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If outputting attrs as separate events, they must 	TokenNameCOMMENT_LINE	If outputting attrs as separate events, they must 
// _follow_ the startElement event. (Think of the 	TokenNameCOMMENT_LINE	_follow_ the startElement event. (Think of the 
// xsl:attribute directive.) 	TokenNameCOMMENT_LINE	xsl:attribute directive.) 
if	TokenNameif	
(	TokenNameLPAREN	
shouldCloneAttributes	TokenNameIdentifier	 should Clone Attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SerializerUtils	TokenNameIdentifier	 Serializer Utils
.	TokenNameDOT	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
rth	TokenNameIdentifier	 rth
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SerializerUtils	TokenNameIdentifier	 Serializer Utils
.	TokenNameDOT	
processNSDecls	TokenNameIdentifier	 process NS Decls
(	TokenNameLPAREN	
rth	TokenNameIdentifier	 rth
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
nodeType	TokenNameIdentifier	 node Type
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
rth	TokenNameIdentifier	 rth
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
SerializerUtils	TokenNameIdentifier	 Serializer Utils
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
rth	TokenNameIdentifier	 rth
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
:	TokenNameCOLON	
// %REVIEW% Normally, these should have been handled with element. 	TokenNameCOMMENT_LINE	%REVIEW% Normally, these should have been handled with element. 
// It's possible that someone may write a stylesheet that tries to 	TokenNameCOMMENT_LINE	It's possible that someone may write a stylesheet that tries to 
// clone them explicitly. If so, we need the equivalent of 	TokenNameCOMMENT_LINE	clone them explicitly. If so, we need the equivalent of 
// rth.addAttribute(). 	TokenNameCOMMENT_LINE	rth.addAttribute(). 
SerializerUtils	TokenNameIdentifier	 Serializer Utils
.	TokenNameDOT	
processNSDecls	TokenNameIdentifier	 process NS Decls
(	TokenNameLPAREN	
rth	TokenNameIdentifier	 rth
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xstr	TokenNameIdentifier	 xstr
.	TokenNameDOT	
dispatchAsComment	TokenNameIdentifier	 dispatch As Comment
(	TokenNameLPAREN	
rth	TokenNameIdentifier	 rth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
// %REVIEW% Is the node name the same as the "target"? 	TokenNameCOMMENT_LINE	%REVIEW% Is the node name the same as the "target"? 
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
//"Can not create item in result tree: "+node.getNodeName()); 	TokenNameCOMMENT_LINE	"Can not create item in result tree: "+node.getNodeName()); 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
"Can't clone node: "	TokenNameStringLiteral	Can't clone node: 
+	TokenNamePLUS	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
// end cloneToResultTree function 	TokenNameCOMMENT_LINE	end cloneToResultTree function 
}	TokenNameRBRACE	
