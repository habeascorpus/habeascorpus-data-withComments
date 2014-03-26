/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id$ */	TokenNameCOMMENT_BLOCK	 $Id$ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
domapi	TokenNameIdentifier	 domapi
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHMessages	TokenNameIdentifier	 XPATH Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
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
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathException	TokenNameIdentifier	 X Path Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathExpression	TokenNameIdentifier	 X Path Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathNamespace	TokenNameIdentifier	 X Path Namespace
;	TokenNameSEMICOLON	
/** * * The class provides an implementation of XPathExpression according * to the DOM L3 XPath Specification, Working Group Note 26 February 2004. * * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p> * * <p>The <code>XPathExpression</code> interface represents a parsed and resolved * XPath expression.</p> * * @see org.w3c.dom.xpath.XPathExpression * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 * The class provides an implementation of XPathExpression according to the DOM L3 XPath Specification, Working Group Note 26 February 2004. * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p> * <p>The <code>XPathExpression</code> interface represents a parsed and resolved XPath expression.</p> * @see org.w3c.dom.xpath.XPathExpression * @xsl.usage internal 
class	TokenNameclass	
XPathExpressionImpl	TokenNameIdentifier	 X Path Expression Impl
implements	TokenNameimplements	
XPathExpression	TokenNameIdentifier	 X Path Expression
{	TokenNameLBRACE	
/** * The xpath object that this expression wraps */	TokenNameCOMMENT_JAVADOC	 The xpath object that this expression wraps 
final	TokenNamefinal	
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_xpath	TokenNameIdentifier	 m xpath
;	TokenNameSEMICOLON	
/** * The document to be searched to parallel the case where the XPathEvaluator * is obtained by casting a Document. */	TokenNameCOMMENT_JAVADOC	 The document to be searched to parallel the case where the XPathEvaluator is obtained by casting a Document. 
final	TokenNamefinal	
private	TokenNameprivate	
Document	TokenNameIdentifier	 Document
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
/** * Constructor for XPathExpressionImpl. * * @param xpath The wrapped XPath object. * @param doc The document to be searched, to parallel the case where'' * the XPathEvaluator is obtained by casting the document. */	TokenNameCOMMENT_JAVADOC	 Constructor for XPathExpressionImpl. * @param xpath The wrapped XPath object. @param doc The document to be searched, to parallel the case where'' the XPathEvaluator is obtained by casting the document. 
XPathExpressionImpl	TokenNameIdentifier	 X Path Expression Impl
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xpath	TokenNameIdentifier	 m xpath
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
m_doc	TokenNameIdentifier	 m doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * This method provides an implementation XPathResult.evaluate according * to the DOM L3 XPath Specification, Working Group Note 26 February 2004. * * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p> * * <p>Evaluates this XPath expression and returns a result.</p> * @param contextNode The <code>context</code> is context node for the * evaluation of this XPath expression.If the XPathEvaluator was * obtained by casting the <code>Document</code> then this must be * owned by the same document and must be a <code>Document</code>, * <code>Element</code>, <code>Attribute</code>, <code>Text</code>, * <code>CDATASection</code>, <code>Comment</code>, * <code>ProcessingInstruction</code>, or <code>XPathNamespace</code> * node.If the context node is a <code>Text</code> or a * <code>CDATASection</code>, then the context is interpreted as the * whole logical text node as seen by XPath, unless the node is empty * in which case it may not serve as the XPath context. * @param type If a specific <code>type</code> is specified, then the * result will be coerced to return the specified type relying on * XPath conversions and fail if the desired coercion is not possible. * This must be one of the type codes of <code>XPathResult</code>. * @param result The <code>result</code> specifies a specific result * object which may be reused and returned by this method. If this is * specified as <code>null</code>or the implementation does not reuse * the specified result, a new result object will be constructed and * returned.For XPath 1.0 results, this object will be of type * <code>XPathResult</code>. * @return The result of the evaluation of the XPath expression.For XPath * 1.0 results, this object will be of type <code>XPathResult</code>. * @exception XPathException * TYPE_ERR: Raised if the result cannot be converted to return the * specified type. * @exception DOMException * WRONG_DOCUMENT_ERR: The Node is from a document that is not supported * by the XPathEvaluator that created this * <code>XPathExpression</code>. * <br>NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath * context node. * * @see org.w3c.dom.xpath.XPathExpression#evaluate(Node, short, XPathResult) * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 * This method provides an implementation XPathResult.evaluate according to the DOM L3 XPath Specification, Working Group Note 26 February 2004. * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p> * <p>Evaluates this XPath expression and returns a result.</p> @param contextNode The <code>context</code> is context node for the evaluation of this XPath expression.If the XPathEvaluator was obtained by casting the <code>Document</code> then this must be owned by the same document and must be a <code>Document</code>, <code>Element</code>, <code>Attribute</code>, <code>Text</code>, <code>CDATASection</code>, <code>Comment</code>, <code>ProcessingInstruction</code>, or <code>XPathNamespace</code> node.If the context node is a <code>Text</code> or a <code>CDATASection</code>, then the context is interpreted as the whole logical text node as seen by XPath, unless the node is empty in which case it may not serve as the XPath context. @param type If a specific <code>type</code> is specified, then the result will be coerced to return the specified type relying on XPath conversions and fail if the desired coercion is not possible. This must be one of the type codes of <code>XPathResult</code>. @param result The <code>result</code> specifies a specific result object which may be reused and returned by this method. If this is specified as <code>null</code>or the implementation does not reuse the specified result, a new result object will be constructed and returned.For XPath 1.0 results, this object will be of type <code>XPathResult</code>. @return The result of the evaluation of the XPath expression.For XPath 1.0 results, this object will be of type <code>XPathResult</code>. @exception XPathException TYPE_ERR: Raised if the result cannot be converted to return the specified type. @exception DOMException WRONG_DOCUMENT_ERR: The Node is from a document that is not supported by the XPathEvaluator that created this <code>XPathExpression</code>. <br>NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath context node. * @see org.w3c.dom.xpath.XPathExpression#evaluate(Node, short, XPathResult) @xsl.usage internal 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
,	TokenNameCOMMA	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
// If the XPathEvaluator was determined by "casting" the document 	TokenNameCOMMENT_LINE	If the XPathEvaluator was determined by "casting" the document 
if	TokenNameif	
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check that the context node is owned by the same document 	TokenNameCOMMENT_LINE	Check that the context node is owned by the same document 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
!=	TokenNameNOT_EQUAL	
m_doc	TokenNameIdentifier	 m doc
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
contextNode	TokenNameIdentifier	 context Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XPATHMessages	TokenNameIdentifier	 XPATH Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_WRONG_DOCUMENT	TokenNameIdentifier	 ER  WRONG  DOCUMENT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check that the context node is an acceptable node type 	TokenNameCOMMENT_LINE	Check that the context node is an acceptable node type 
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
contextNode	TokenNameIdentifier	 context Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
Document	TokenNameIdentifier	 Document
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
Document	TokenNameIdentifier	 Document
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
Document	TokenNameIdentifier	 Document
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
Document	TokenNameIdentifier	 Document
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
Document	TokenNameIdentifier	 Document
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
Document	TokenNameIdentifier	 Document
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
Document	TokenNameIdentifier	 Document
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
XPathNamespace	TokenNameIdentifier	 X Path Namespace
.	TokenNameDOT	
XPATH_NAMESPACE_NODE	TokenNameIdentifier	 XPATH  NAMESPACE  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XPATHMessages	TokenNameIdentifier	 XPATH Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_WRONG_NODETYPE	TokenNameIdentifier	 ER  WRONG  NODETYPE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// If the type is not a supported type, throw an exception and be 	TokenNameCOMMENT_LINE	If the type is not a supported type, throw an exception and be 
// done with it! 	TokenNameCOMMENT_LINE	done with it! 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XPathResultImpl	TokenNameIdentifier	 X Path Result Impl
.	TokenNameDOT	
isValidType	TokenNameIdentifier	 is Valid Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XPATHMessages	TokenNameIdentifier	 XPATH Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_INVALID_XPATH_TYPE	TokenNameIdentifier	 ER  INVALID  XPATH  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
XPathException	TokenNameIdentifier	 X Path Exception
.	TokenNameDOT	
TYPE_ERR	TokenNameIdentifier	 TYPE  ERR
,	TokenNameCOMMA	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Invalid XPath type argument: {0} 	TokenNameCOMMENT_LINE	Invalid XPath type argument: {0} 
}	TokenNameRBRACE	
// Create an XPathContext that doesn't support pushing and popping of 	TokenNameCOMMENT_LINE	Create an XPathContext that doesn't support pushing and popping of 
// variable resolution scopes. Sufficient for simple XPath 1.0 	TokenNameCOMMENT_LINE	variable resolution scopes. Sufficient for simple XPath 1.0 
// expressions. 	TokenNameCOMMENT_LINE	expressions. 
// Cache xpath context? 	TokenNameCOMMENT_LINE	Cache xpath context? 
XPathContext	TokenNameIdentifier	 X Path Context
xpathSupport	TokenNameIdentifier	 xpath Support
=	TokenNameEQUAL	
new	TokenNamenew	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if m_document is not null, build the DTM from the document 	TokenNameCOMMENT_LINE	if m_document is not null, build the DTM from the document 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_doc	TokenNameIdentifier	 m doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xpathSupport	TokenNameIdentifier	 xpath Support
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XObject	TokenNameIdentifier	 X Object
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
m_xpath	TokenNameIdentifier	 m xpath
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xpathSupport	TokenNameIdentifier	 xpath Support
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// What should we do here? 	TokenNameCOMMENT_LINE	What should we do here? 
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
XPathException	TokenNameIdentifier	 X Path Exception
.	TokenNameDOT	
INVALID_EXPRESSION_ERR	TokenNameIdentifier	 INVALID  EXPRESSION  ERR
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create a new XPathResult object 	TokenNameCOMMENT_LINE	Create a new XPathResult object 
// Reuse result object passed in? 	TokenNameCOMMENT_LINE	Reuse result object passed in? 
// The constructor will check the compatibility of type and xobj and 	TokenNameCOMMENT_LINE	The constructor will check the compatibility of type and xobj and 
// throw an exception if they are not compatible. 	TokenNameCOMMENT_LINE	throw an exception if they are not compatible. 
return	TokenNamereturn	
new	TokenNamenew	
XPathResultImpl	TokenNameIdentifier	 X Path Result Impl
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
xobj	TokenNameIdentifier	 xobj
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
m_xpath	TokenNameIdentifier	 m xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
