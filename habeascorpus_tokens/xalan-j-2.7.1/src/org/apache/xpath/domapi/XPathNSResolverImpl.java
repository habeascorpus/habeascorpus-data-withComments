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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolverDefault	TokenNameIdentifier	 Prefix Resolver Default
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
XPathNSResolver	TokenNameIdentifier	 X Path NS Resolver
;	TokenNameSEMICOLON	
/** * * The class provides an implementation XPathNSResolver according * to the DOM L3 XPath Specification, Working Group Note 26 February 2004. * * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p> * * <p>The <code>XPathNSResolver</code> interface permit <code>prefix</code> * strings in the expression to be properly bound to * <code>namespaceURI</code> strings. <code>XPathEvaluator</code> can * construct an implementation of <code>XPathNSResolver</code> from a node, * or the interface may be implemented by any application.</p> * * @see org.w3c.dom.xpath.XPathNSResolver * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 * The class provides an implementation XPathNSResolver according to the DOM L3 XPath Specification, Working Group Note 26 February 2004. * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p> * <p>The <code>XPathNSResolver</code> interface permit <code>prefix</code> strings in the expression to be properly bound to <code>namespaceURI</code> strings. <code>XPathEvaluator</code> can construct an implementation of <code>XPathNSResolver</code> from a node, or the interface may be implemented by any application.</p> * @see org.w3c.dom.xpath.XPathNSResolver @xsl.usage internal 
class	TokenNameclass	
XPathNSResolverImpl	TokenNameIdentifier	 X Path NS Resolver Impl
extends	TokenNameextends	
PrefixResolverDefault	TokenNameIdentifier	 Prefix Resolver Default
implements	TokenNameimplements	
XPathNSResolver	TokenNameIdentifier	 X Path NS Resolver
{	TokenNameLBRACE	
/** * Constructor for XPathNSResolverImpl. * @param xpathExpressionContext */	TokenNameCOMMENT_JAVADOC	 Constructor for XPathNSResolverImpl. @param xpathExpressionContext 
public	TokenNamepublic	
XPathNSResolverImpl	TokenNameIdentifier	 X Path NS Resolver Impl
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
xpathExpressionContext	TokenNameIdentifier	 xpath Expression Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
xpathExpressionContext	TokenNameIdentifier	 xpath Expression Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.xpath.XPathNSResolver#lookupNamespaceURI(String) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.xpath.XPathNSResolver#lookupNamespaceURI(String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
