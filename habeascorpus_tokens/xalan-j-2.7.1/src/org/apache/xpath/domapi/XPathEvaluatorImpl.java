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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
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
XPathEvaluator	TokenNameIdentifier	 X Path Evaluator
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
XPathNSResolver	TokenNameIdentifier	 X Path NS Resolver
;	TokenNameSEMICOLON	
/** * * The class provides an implementation of XPathEvaluator according * to the DOM L3 XPath Specification, Working Group Note 26 February 2004. * * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p> * * </p>The evaluation of XPath expressions is provided by * <code>XPathEvaluator</code>, which will provide evaluation of XPath 1.0 * expressions with no specialized extension functions or variables. It is * expected that the <code>XPathEvaluator</code> interface will be * implemented on the same object which implements the <code>Document</code> * interface in an implementation which supports the XPath DOM module. * <code>XPathEvaluator</code> implementations may be available from other * sources that may provide support for special extension functions or * variables which are not defined in this specification.</p> * * @see org.w3c.dom.xpath.XPathEvaluator * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 * The class provides an implementation of XPathEvaluator according to the DOM L3 XPath Specification, Working Group Note 26 February 2004. * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p> * </p>The evaluation of XPath expressions is provided by <code>XPathEvaluator</code>, which will provide evaluation of XPath 1.0 expressions with no specialized extension functions or variables. It is expected that the <code>XPathEvaluator</code> interface will be implemented on the same object which implements the <code>Document</code> interface in an implementation which supports the XPath DOM module. <code>XPathEvaluator</code> implementations may be available from other sources that may provide support for special extension functions or variables which are not defined in this specification.</p> * @see org.w3c.dom.xpath.XPathEvaluator * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
XPathEvaluatorImpl	TokenNameIdentifier	 X Path Evaluator Impl
implements	TokenNameimplements	
XPathEvaluator	TokenNameIdentifier	 X Path Evaluator
{	TokenNameLBRACE	
/** * This prefix resolver is created whenever null is passed to the * evaluate method. Its purpose is to satisfy the DOM L3 XPath API * requirement that if a null prefix resolver is used, an exception * should only be thrown when an attempt is made to resolve a prefix. */	TokenNameCOMMENT_JAVADOC	 This prefix resolver is created whenever null is passed to the evaluate method. Its purpose is to satisfy the DOM L3 XPath API requirement that if a null prefix resolver is used, an exception should only be thrown when an attempt is made to resolve a prefix. 
private	TokenNameprivate	
class	TokenNameclass	
DummyPrefixResolver	TokenNameIdentifier	 Dummy Prefix Resolver
implements	TokenNameimplements	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
{	TokenNameLBRACE	
/** * Constructor for DummyPrefixResolver. */	TokenNameCOMMENT_JAVADOC	 Constructor for DummyPrefixResolver. 
DummyPrefixResolver	TokenNameIdentifier	 Dummy Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @exception DOMException * NAMESPACE_ERR: Always throws this exceptionn * * @see org.apache.xml.utils.PrefixResolver#getNamespaceForPrefix(String, Node) */	TokenNameCOMMENT_JAVADOC	 @exception DOMException NAMESPACE_ERR: Always throws this exceptionn * @see org.apache.xml.utils.PrefixResolver#getNamespaceForPrefix(String, Node) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
context	TokenNameIdentifier	 context
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
ER_NULL_RESOLVER	TokenNameIdentifier	 ER  NULL  RESOLVER
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
NAMESPACE_ERR	TokenNameIdentifier	 NAMESPACE  ERR
,	TokenNameCOMMA	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Unable to resolve prefix with null prefix resolver. 	TokenNameCOMMENT_LINE	Unable to resolve prefix with null prefix resolver. 
}	TokenNameRBRACE	
/** * @exception DOMException * NAMESPACE_ERR: Always throws this exceptionn * * @see org.apache.xml.utils.PrefixResolver#getNamespaceForPrefix(String) */	TokenNameCOMMENT_JAVADOC	 @exception DOMException NAMESPACE_ERR: Always throws this exceptionn * @see org.apache.xml.utils.PrefixResolver#getNamespaceForPrefix(String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xml.utils.PrefixResolver#handlesNullPrefixes() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xml.utils.PrefixResolver#handlesNullPrefixes() 
public	TokenNamepublic	
boolean	TokenNameboolean	
handlesNullPrefixes	TokenNameIdentifier	 handles Null Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xml.utils.PrefixResolver#getBaseIdentifier() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xml.utils.PrefixResolver#getBaseIdentifier() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseIdentifier	TokenNameIdentifier	 get Base Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The document to be searched to parallel the case where the XPathEvaluator * is obtained by casting a Document. */	TokenNameCOMMENT_JAVADOC	 The document to be searched to parallel the case where the XPathEvaluator is obtained by casting a Document. 
private	TokenNameprivate	
final	TokenNamefinal	
Document	TokenNameIdentifier	 Document
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
/** * Constructor for XPathEvaluatorImpl. * * @param doc The document to be searched, to parallel the case where'' * the XPathEvaluator is obtained by casting the document. */	TokenNameCOMMENT_JAVADOC	 Constructor for XPathEvaluatorImpl. * @param doc The document to be searched, to parallel the case where'' the XPathEvaluator is obtained by casting the document. 
public	TokenNamepublic	
XPathEvaluatorImpl	TokenNameIdentifier	 X Path Evaluator Impl
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
/** * Constructor in the case that the XPath expression can be evaluated * without needing an XML document at all. * */	TokenNameCOMMENT_JAVADOC	 Constructor in the case that the XPath expression can be evaluated without needing an XML document at all. 
public	TokenNamepublic	
XPathEvaluatorImpl	TokenNameIdentifier	 X Path Evaluator Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_doc	TokenNameIdentifier	 m doc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a parsed XPath expression with resolved namespaces. This is * useful when an expression will be reused in an application since it * makes it possible to compile the expression string into a more * efficient internal form and preresolve all namespace prefixes which * occur within the expression. * * @param expression The XPath expression string to be parsed. * @param resolver The <code>resolver</code> permits translation of * prefixes within the XPath expression into appropriate namespace URIs * . If this is specified as <code>null</code>, any namespace prefix * within the expression will result in <code>DOMException</code> * being thrown with the code <code>NAMESPACE_ERR</code>. * @return The compiled form of the XPath expression. * @exception XPathException * INVALID_EXPRESSION_ERR: Raised if the expression is not legal * according to the rules of the <code>XPathEvaluator</code>i * @exception DOMException * NAMESPACE_ERR: Raised if the expression contains namespace prefixes * which cannot be resolved by the specified * <code>XPathNSResolver</code>. * * @see org.w3c.dom.xpath.XPathEvaluator#createExpression(String, XPathNSResolver) */	TokenNameCOMMENT_JAVADOC	 Creates a parsed XPath expression with resolved namespaces. This is useful when an expression will be reused in an application since it makes it possible to compile the expression string into a more efficient internal form and preresolve all namespace prefixes which occur within the expression. * @param expression The XPath expression string to be parsed. @param resolver The <code>resolver</code> permits translation of prefixes within the XPath expression into appropriate namespace URIs . If this is specified as <code>null</code>, any namespace prefix within the expression will result in <code>DOMException</code> being thrown with the code <code>NAMESPACE_ERR</code>. @return The compiled form of the XPath expression. @exception XPathException INVALID_EXPRESSION_ERR: Raised if the expression is not legal according to the rules of the <code>XPathEvaluator</code>i @exception DOMException NAMESPACE_ERR: Raised if the expression contains namespace prefixes which cannot be resolved by the specified <code>XPathNSResolver</code>. * @see org.w3c.dom.xpath.XPathEvaluator#createExpression(String, XPathNSResolver) 
public	TokenNamepublic	
XPathExpression	TokenNameIdentifier	 X Path Expression
createExpression	TokenNameIdentifier	 create Expression
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
XPathNSResolver	TokenNameIdentifier	 X Path NS Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
,	TokenNameCOMMA	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// If the resolver is null, create a dummy prefix resolver 	TokenNameCOMMENT_LINE	If the resolver is null, create a dummy prefix resolver 
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
DummyPrefixResolver	TokenNameIdentifier	 Dummy Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
)	TokenNameRPAREN	
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XPathExpressionImpl	TokenNameIdentifier	 X Path Expression Impl
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
m_doc	TokenNameIdentifier	 m doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Need to pass back exception code DOMException.NAMESPACE_ERR also. 	TokenNameCOMMENT_LINE	Need to pass back exception code DOMException.NAMESPACE_ERR also. 
// Error found in DOM Level 3 XPath Test Suite. 	TokenNameCOMMENT_LINE	Error found in DOM Level 3 XPath Test Suite. 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
XPathStylesheetDOM3Exception	TokenNameIdentifier	 X Path Stylesheet DO M3 Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NAMESPACE_ERR	TokenNameIdentifier	 NAMESPACE  ERR
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
XPathException	TokenNameIdentifier	 X Path Exception
.	TokenNameDOT	
INVALID_EXPRESSION_ERR	TokenNameIdentifier	 INVALID  EXPRESSION  ERR
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adapts any DOM node to resolve namespaces so that an XPath expression * can be easily evaluated relative to the context of the node where it * appeared within the document. This adapter works like the DOM Level 3 * method <code>lookupNamespaceURI</code> on nodes in resolving the * namespaceURI from a given prefix using the current information available * in the node's hierarchy at the time lookupNamespaceURI is called, also * correctly resolving the implicit xml prefix. * * @param nodeResolver The node to be used as a context for namespace * resolution. * @return <code>XPathNSResolver</code> which resolves namespaces with * respect to the definitions in scope for a specified node. * * @see org.w3c.dom.xpath.XPathEvaluator#createNSResolver(Node) */	TokenNameCOMMENT_JAVADOC	 Adapts any DOM node to resolve namespaces so that an XPath expression can be easily evaluated relative to the context of the node where it appeared within the document. This adapter works like the DOM Level 3 method <code>lookupNamespaceURI</code> on nodes in resolving the namespaceURI from a given prefix using the current information available in the node's hierarchy at the time lookupNamespaceURI is called, also correctly resolving the implicit xml prefix. * @param nodeResolver The node to be used as a context for namespace resolution. @return <code>XPathNSResolver</code> which resolves namespaces with respect to the definitions in scope for a specified node. * @see org.w3c.dom.xpath.XPathEvaluator#createNSResolver(Node) 
public	TokenNamepublic	
XPathNSResolver	TokenNameIdentifier	 X Path NS Resolver
createNSResolver	TokenNameIdentifier	 create NS Resolver
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
nodeResolver	TokenNameIdentifier	 node Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XPathNSResolverImpl	TokenNameIdentifier	 X Path NS Resolver Impl
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nodeResolver	TokenNameIdentifier	 node Resolver
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
nodeResolver	TokenNameIdentifier	 node Resolver
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
nodeResolver	TokenNameIdentifier	 node Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluates an XPath expression string and returns a result of the * specified type if possible. * * @param expression The XPath expression string to be parsed and * evaluated. * @param contextNode The <code>context</code> is context node for the * evaluation of this XPath expression. If the XPathEvaluator was * obtained by casting the <code>Document</code> then this must be * owned by the same document and must be a <code>Document</code>, * <code>Element</code>, <code>Attribute</code>, <code>Text</code>, * <code>CDATASection</code>, <code>Comment</code>, * <code>ProcessingInstruction</code>, or <code>XPathNamespace</code> * node. If the context node is a <code>Text</code> or a * <code>CDATASection</code>, then the context is interpreted as the * whole logical text node as seen by XPath, unless the node is empty * in which case it may not serve as the XPath context. * @param resolver The <code>resolver</code> permits translation of * prefixes within the XPath expression into appropriate namespace URIs * . If this is specified as <code>null</code>, any namespace prefix * within the expression will result in <code>DOMException</code> * being thrown with the code <code>NAMESPACE_ERR</code>. * @param type If a specific <code>type</code> is specified, then the * result will be coerced to return the specified type relying on * XPath type conversions and fail if the desired coercion is not * possible. This must be one of the type codes of * <code>XPathResult</code>. * @param result The <code>result</code> specifies a specific result * object which may be reused and returned by this method. If this is * specified as <code>null</code>or the implementation does not reuse * the specified result, a new result object will be constructed and * returned.For XPath 1.0 results, this object will be of type * <code>XPathResult</code>. * @return The result of the evaluation of the XPath expression.For XPath * 1.0 results, this object will be of type <code>XPathResult</code>. * @exception XPathException * INVALID_EXPRESSION_ERR: Raised if the expression is not legal * according to the rules of the <code>XPathEvaluator</code>i * <br>TYPE_ERR: Raised if the result cannot be converted to return the * specified type. * @exception DOMException * NAMESPACE_ERR: Raised if the expression contains namespace prefixes * which cannot be resolved by the specified * <code>XPathNSResolver</code>. * <br>WRONG_DOCUMENT_ERR: The Node is from a document that is not * supported by this XPathEvaluator. * <br>NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath * context node. * * @see org.w3c.dom.xpath.XPathEvaluator#evaluate(String, Node, XPathNSResolver, short, XPathResult) */	TokenNameCOMMENT_JAVADOC	 Evaluates an XPath expression string and returns a result of the specified type if possible. * @param expression The XPath expression string to be parsed and evaluated. @param contextNode The <code>context</code> is context node for the evaluation of this XPath expression. If the XPathEvaluator was obtained by casting the <code>Document</code> then this must be owned by the same document and must be a <code>Document</code>, <code>Element</code>, <code>Attribute</code>, <code>Text</code>, <code>CDATASection</code>, <code>Comment</code>, <code>ProcessingInstruction</code>, or <code>XPathNamespace</code> node. If the context node is a <code>Text</code> or a <code>CDATASection</code>, then the context is interpreted as the whole logical text node as seen by XPath, unless the node is empty in which case it may not serve as the XPath context. @param resolver The <code>resolver</code> permits translation of prefixes within the XPath expression into appropriate namespace URIs . If this is specified as <code>null</code>, any namespace prefix within the expression will result in <code>DOMException</code> being thrown with the code <code>NAMESPACE_ERR</code>. @param type If a specific <code>type</code> is specified, then the result will be coerced to return the specified type relying on XPath type conversions and fail if the desired coercion is not possible. This must be one of the type codes of <code>XPathResult</code>. @param result The <code>result</code> specifies a specific result object which may be reused and returned by this method. If this is specified as <code>null</code>or the implementation does not reuse the specified result, a new result object will be constructed and returned.For XPath 1.0 results, this object will be of type <code>XPathResult</code>. @return The result of the evaluation of the XPath expression.For XPath 1.0 results, this object will be of type <code>XPathResult</code>. @exception XPathException INVALID_EXPRESSION_ERR: Raised if the expression is not legal according to the rules of the <code>XPathEvaluator</code>i <br>TYPE_ERR: Raised if the result cannot be converted to return the specified type. @exception DOMException NAMESPACE_ERR: Raised if the expression contains namespace prefixes which cannot be resolved by the specified <code>XPathNSResolver</code>. <br>WRONG_DOCUMENT_ERR: The Node is from a document that is not supported by this XPathEvaluator. <br>NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath context node. * @see org.w3c.dom.xpath.XPathEvaluator#evaluate(String, Node, XPathNSResolver, short, XPathResult) 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
XPathNSResolver	TokenNameIdentifier	 X Path NS Resolver
resolver	TokenNameIdentifier	 resolver
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
XPathExpression	TokenNameIdentifier	 X Path Expression
xpathExpression	TokenNameIdentifier	 xpath Expression
=	TokenNameEQUAL	
createExpression	TokenNameIdentifier	 create Expression
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xpathExpression	TokenNameIdentifier	 xpath Expression
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
