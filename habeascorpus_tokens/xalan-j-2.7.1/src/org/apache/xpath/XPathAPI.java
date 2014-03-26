/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPathAPI.java 524807 2007-04-02 15:51:43Z zongaro $ */	TokenNameCOMMENT_BLOCK	 $Id: XPathAPI.java 524807 2007-04-02 15:51:43Z zongaro $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolverDefault	TokenNameIdentifier	 Prefix Resolver Default
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
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * The methods in this class are convenience methods into the * low-level XPath API. * These functions tend to be a little slow, since a number of objects must be * created for each evaluation. A faster way is to precompile the * XPaths using the low-level API, and then just use the XPaths * over and over. * * NOTE: In particular, each call to this method will create a new * XPathContext, a new DTMManager... and thus a new DTM. That's very * safe, since it guarantees that you're always processing against a * fully up-to-date view of your document. But it's also portentially * very expensive, since you're rebuilding the DTM every time. You should * consider using an instance of CachedXPathAPI rather than these static * methods. * * @see <a href="http://www.w3.org/TR/xpath">XPath Specification</a> * */	TokenNameCOMMENT_JAVADOC	 The methods in this class are convenience methods into the low-level XPath API. These functions tend to be a little slow, since a number of objects must be created for each evaluation. A faster way is to precompile the XPaths using the low-level API, and then just use the XPaths over and over. * NOTE: In particular, each call to this method will create a new XPathContext, a new DTMManager... and thus a new DTM. That's very safe, since it guarantees that you're always processing against a fully up-to-date view of your document. But it's also portentially very expensive, since you're rebuilding the DTM every time. You should consider using an instance of CachedXPathAPI rather than these static methods. * @see <a href="http://www.w3.org/TR/xpath">XPath Specification</a> 
public	TokenNamepublic	
class	TokenNameclass	
XPathAPI	TokenNameIdentifier	 X Path API
{	TokenNameLBRACE	
/** * Use an XPath string to select a single node. XPath namespace * prefixes are resolved from the context node, which may not * be what you want (see the next method). * * @param contextNode The node to start searching from. * @param str A valid XPath string. * @return The first node found that matches the XPath, or null. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Use an XPath string to select a single node. XPath namespace prefixes are resolved from the context node, which may not be what you want (see the next method). * @param contextNode The node to start searching from. @param str A valid XPath string. @return The first node found that matches the XPath, or null. * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
Node	TokenNameIdentifier	 Node
selectSingleNode	TokenNameIdentifier	 select Single Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
selectSingleNode	TokenNameIdentifier	 select Single Node
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use an XPath string to select a single node. * XPath namespace prefixes are resolved from the namespaceNode. * * @param contextNode The node to start searching from. * @param str A valid XPath string. * @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces. * @return The first node found that matches the XPath, or null. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Use an XPath string to select a single node. XPath namespace prefixes are resolved from the namespaceNode. * @param contextNode The node to start searching from. @param str A valid XPath string. @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces. @return The first node found that matches the XPath, or null. * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
Node	TokenNameIdentifier	 Node
selectSingleNode	TokenNameIdentifier	 select Single Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
namespaceNode	TokenNameIdentifier	 namespace Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Have the XObject return its result as a NodeSetDTM. 	TokenNameCOMMENT_LINE	Have the XObject return its result as a NodeSetDTM. 
NodeIterator	TokenNameIdentifier	 Node Iterator
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
selectNodeIterator	TokenNameIdentifier	 select Node Iterator
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
namespaceNode	TokenNameIdentifier	 namespace Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Return the first node, or null 	TokenNameCOMMENT_LINE	Return the first node, or null 
return	TokenNamereturn	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use an XPath string to select a nodelist. * XPath namespace prefixes are resolved from the contextNode. * * @param contextNode The node to start searching from. * @param str A valid XPath string. * @return A NodeIterator, should never be null. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Use an XPath string to select a nodelist. XPath namespace prefixes are resolved from the contextNode. * @param contextNode The node to start searching from. @param str A valid XPath string. @return A NodeIterator, should never be null. * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
NodeIterator	TokenNameIdentifier	 Node Iterator
selectNodeIterator	TokenNameIdentifier	 select Node Iterator
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
selectNodeIterator	TokenNameIdentifier	 select Node Iterator
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use an XPath string to select a nodelist. * XPath namespace prefixes are resolved from the namespaceNode. * * @param contextNode The node to start searching from. * @param str A valid XPath string. * @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces. * @return A NodeIterator, should never be null. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Use an XPath string to select a nodelist. XPath namespace prefixes are resolved from the namespaceNode. * @param contextNode The node to start searching from. @param str A valid XPath string. @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces. @return A NodeIterator, should never be null. * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
NodeIterator	TokenNameIdentifier	 Node Iterator
selectNodeIterator	TokenNameIdentifier	 select Node Iterator
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
namespaceNode	TokenNameIdentifier	 namespace Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Execute the XPath, and have it return the result 	TokenNameCOMMENT_LINE	Execute the XPath, and have it return the result 
XObject	TokenNameIdentifier	 X Object
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
namespaceNode	TokenNameIdentifier	 namespace Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Have the XObject return its result as a NodeSetDTM. 	TokenNameCOMMENT_LINE	Have the XObject return its result as a NodeSetDTM. 
return	TokenNamereturn	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
nodeset	TokenNameIdentifier	 nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use an XPath string to select a nodelist. * XPath namespace prefixes are resolved from the contextNode. * * @param contextNode The node to start searching from. * @param str A valid XPath string. * @return A NodeIterator, should never be null. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Use an XPath string to select a nodelist. XPath namespace prefixes are resolved from the contextNode. * @param contextNode The node to start searching from. @param str A valid XPath string. @return A NodeIterator, should never be null. * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
selectNodeList	TokenNameIdentifier	 select Node List
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
selectNodeList	TokenNameIdentifier	 select Node List
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use an XPath string to select a nodelist. * XPath namespace prefixes are resolved from the namespaceNode. * * @param contextNode The node to start searching from. * @param str A valid XPath string. * @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces. * @return A NodeIterator, should never be null. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Use an XPath string to select a nodelist. XPath namespace prefixes are resolved from the namespaceNode. * @param contextNode The node to start searching from. @param str A valid XPath string. @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces. @return A NodeIterator, should never be null. * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
selectNodeList	TokenNameIdentifier	 select Node List
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
namespaceNode	TokenNameIdentifier	 namespace Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Execute the XPath, and have it return the result 	TokenNameCOMMENT_LINE	Execute the XPath, and have it return the result 
XObject	TokenNameIdentifier	 X Object
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
namespaceNode	TokenNameIdentifier	 namespace Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Return a NodeList. 	TokenNameCOMMENT_LINE	Return a NodeList. 
return	TokenNamereturn	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
nodelist	TokenNameIdentifier	 nodelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate XPath string to an XObject. Using this method, * XPath namespace prefixes will be resolved from the namespaceNode. * @param contextNode The node to start searching from. * @param str A valid XPath string. * @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null. * @see org.apache.xpath.objects.XObject * @see org.apache.xpath.objects.XNull * @see org.apache.xpath.objects.XBoolean * @see org.apache.xpath.objects.XNumber * @see org.apache.xpath.objects.XString * @see org.apache.xpath.objects.XRTreeFrag * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Evaluate XPath string to an XObject. Using this method, XPath namespace prefixes will be resolved from the namespaceNode. @param contextNode The node to start searching from. @param str A valid XPath string. @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null. @see org.apache.xpath.objects.XObject @see org.apache.xpath.objects.XNull @see org.apache.xpath.objects.XBoolean @see org.apache.xpath.objects.XNumber @see org.apache.xpath.objects.XString @see org.apache.xpath.objects.XRTreeFrag * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
XObject	TokenNameIdentifier	 X Object
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate XPath string to an XObject. * XPath namespace prefixes are resolved from the namespaceNode. * The implementation of this is a little slow, since it creates * a number of objects each time it is called. This could be optimized * to keep the same objects around, but then thread-safety issues would arise. * * @param contextNode The node to start searching from. * @param str A valid XPath string. * @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces. * @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null. * @see org.apache.xpath.objects.XObject * @see org.apache.xpath.objects.XNull * @see org.apache.xpath.objects.XBoolean * @see org.apache.xpath.objects.XNumber * @see org.apache.xpath.objects.XString * @see org.apache.xpath.objects.XRTreeFrag * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Evaluate XPath string to an XObject. XPath namespace prefixes are resolved from the namespaceNode. The implementation of this is a little slow, since it creates a number of objects each time it is called. This could be optimized to keep the same objects around, but then thread-safety issues would arise. * @param contextNode The node to start searching from. @param str A valid XPath string. @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces. @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null. @see org.apache.xpath.objects.XObject @see org.apache.xpath.objects.XNull @see org.apache.xpath.objects.XBoolean @see org.apache.xpath.objects.XNumber @see org.apache.xpath.objects.XString @see org.apache.xpath.objects.XRTreeFrag * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
XObject	TokenNameIdentifier	 X Object
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
namespaceNode	TokenNameIdentifier	 namespace Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Since we don't have a XML Parser involved here, install some default support 	TokenNameCOMMENT_LINE	Since we don't have a XML Parser involved here, install some default support 
// for things like namespaces, etc. 	TokenNameCOMMENT_LINE	for things like namespaces, etc. 
// (Changed from: XPathContext xpathSupport = new XPathContext(); 	TokenNameCOMMENT_LINE	(Changed from: XPathContext xpathSupport = new XPathContext(); 
// because XPathContext is weak in a number of areas... perhaps 	TokenNameCOMMENT_LINE	because XPathContext is weak in a number of areas... perhaps 
// XPathContext should be done away with.) 	TokenNameCOMMENT_LINE	XPathContext should be done away with.) 
// Create an XPathContext that doesn't support pushing and popping of 	TokenNameCOMMENT_LINE	Create an XPathContext that doesn't support pushing and popping of 
// variable resolution scopes. Sufficient for simple XPath 1.0 expressions. 	TokenNameCOMMENT_LINE	variable resolution scopes. Sufficient for simple XPath 1.0 expressions. 
XPathContext	TokenNameIdentifier	 X Path Context
xpathSupport	TokenNameIdentifier	 xpath Support
=	TokenNameEQUAL	
new	TokenNamenew	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create an object to resolve namespace prefixes. 	TokenNameCOMMENT_LINE	Create an object to resolve namespace prefixes. 
// XPath namespaces are resolved from the input context node's document element 	TokenNameCOMMENT_LINE	XPath namespaces are resolved from the input context node's document element 
// if it is a root node, or else the current context node (for lack of a better 	TokenNameCOMMENT_LINE	if it is a root node, or else the current context node (for lack of a better 
// resolution space, given the simplicity of this sample code). 	TokenNameCOMMENT_LINE	resolution space, given the simplicity of this sample code). 
PrefixResolverDefault	TokenNameIdentifier	 Prefix Resolver Default
prefixResolver	TokenNameIdentifier	 prefix Resolver
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixResolverDefault	TokenNameIdentifier	 Prefix Resolver Default
(	TokenNameLPAREN	
(	TokenNameLPAREN	
namespaceNode	TokenNameIdentifier	 namespace Node
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
namespaceNode	TokenNameIdentifier	 namespace Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
namespaceNode	TokenNameIdentifier	 namespace Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create the XPath object. 	TokenNameCOMMENT_LINE	Create the XPath object. 
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Execute the XPath, and have it return the result 	TokenNameCOMMENT_LINE	Execute the XPath, and have it return the result 
// return xpath.execute(xpathSupport, contextNode, prefixResolver); 	TokenNameCOMMENT_LINE	return xpath.execute(xpathSupport, contextNode, prefixResolver); 
int	TokenNameint	
ctxtNode	TokenNameIdentifier	 ctxt Node
=	TokenNameEQUAL	
xpathSupport	TokenNameIdentifier	 xpath Support
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xpathSupport	TokenNameIdentifier	 xpath Support
,	TokenNameCOMMA	
ctxtNode	TokenNameIdentifier	 ctxt Node
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate XPath string to an XObject. * XPath namespace prefixes are resolved from the namespaceNode. * The implementation of this is a little slow, since it creates * a number of objects each time it is called. This could be optimized * to keep the same objects around, but then thread-safety issues would arise. * * @param contextNode The node to start searching from. * @param str A valid XPath string. * @param prefixResolver Will be called if the parser encounters namespace * prefixes, to resolve the prefixes to URLs. * @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null. * @see org.apache.xpath.objects.XObject * @see org.apache.xpath.objects.XNull * @see org.apache.xpath.objects.XBoolean * @see org.apache.xpath.objects.XNumber * @see org.apache.xpath.objects.XString * @see org.apache.xpath.objects.XRTreeFrag * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Evaluate XPath string to an XObject. XPath namespace prefixes are resolved from the namespaceNode. The implementation of this is a little slow, since it creates a number of objects each time it is called. This could be optimized to keep the same objects around, but then thread-safety issues would arise. * @param contextNode The node to start searching from. @param str A valid XPath string. @param prefixResolver Will be called if the parser encounters namespace prefixes, to resolve the prefixes to URLs. @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null. @see org.apache.xpath.objects.XObject @see org.apache.xpath.objects.XNull @see org.apache.xpath.objects.XBoolean @see org.apache.xpath.objects.XNumber @see org.apache.xpath.objects.XString @see org.apache.xpath.objects.XRTreeFrag * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
XObject	TokenNameIdentifier	 X Object
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Since we don't have a XML Parser involved here, install some default support 	TokenNameCOMMENT_LINE	Since we don't have a XML Parser involved here, install some default support 
// for things like namespaces, etc. 	TokenNameCOMMENT_LINE	for things like namespaces, etc. 
// (Changed from: XPathContext xpathSupport = new XPathContext(); 	TokenNameCOMMENT_LINE	(Changed from: XPathContext xpathSupport = new XPathContext(); 
// because XPathContext is weak in a number of areas... perhaps 	TokenNameCOMMENT_LINE	because XPathContext is weak in a number of areas... perhaps 
// XPathContext should be done away with.) 	TokenNameCOMMENT_LINE	XPathContext should be done away with.) 
// Create the XPath object. 	TokenNameCOMMENT_LINE	Create the XPath object. 
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create an XPathContext that doesn't support pushing and popping of 	TokenNameCOMMENT_LINE	Create an XPathContext that doesn't support pushing and popping of 
// variable resolution scopes. Sufficient for simple XPath 1.0 expressions. 	TokenNameCOMMENT_LINE	variable resolution scopes. Sufficient for simple XPath 1.0 expressions. 
XPathContext	TokenNameIdentifier	 X Path Context
xpathSupport	TokenNameIdentifier	 xpath Support
=	TokenNameEQUAL	
new	TokenNamenew	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Execute the XPath, and have it return the result 	TokenNameCOMMENT_LINE	Execute the XPath, and have it return the result 
int	TokenNameint	
ctxtNode	TokenNameIdentifier	 ctxt Node
=	TokenNameEQUAL	
xpathSupport	TokenNameIdentifier	 xpath Support
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xpathSupport	TokenNameIdentifier	 xpath Support
,	TokenNameCOMMA	
ctxtNode	TokenNameIdentifier	 ctxt Node
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
