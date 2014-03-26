/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TreeWalker.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TreeWalker.java 468655 2006-10-28 07:12:06Z minchau $ 
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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Comment	TokenNameIdentifier	 Comment
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LocatorImpl	TokenNameIdentifier	 Locator Impl
;	TokenNameSEMICOLON	
/** * This class does a pre-order walk of the DOM tree, calling a ContentHandler * interface as it goes. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class does a pre-order walk of the DOM tree, calling a ContentHandler interface as it goes. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
TreeWalker	TokenNameIdentifier	 Tree Walker
{	TokenNameLBRACE	
/** Local reference to a ContentHandler */	TokenNameCOMMENT_JAVADOC	 Local reference to a ContentHandler 
private	TokenNameprivate	
ContentHandler	TokenNameIdentifier	 Content Handler
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// ARGHH!! JAXP Uses Xerces without setting the namespace processing to ON! 	TokenNameCOMMENT_LINE	ARGHH!! JAXP Uses Xerces without setting the namespace processing to ON! 
// DOM2Helper m_dh = new DOM2Helper(); 	TokenNameCOMMENT_LINE	DOM2Helper m_dh = new DOM2Helper(); 
/** DomHelper for this TreeWalker */	TokenNameCOMMENT_JAVADOC	 DomHelper for this TreeWalker 
protected	TokenNameprotected	
DOMHelper	TokenNameIdentifier	 DOM Helper
m_dh	TokenNameIdentifier	 m dh
;	TokenNameSEMICOLON	
/** Locator object for this TreeWalker */	TokenNameCOMMENT_JAVADOC	 Locator object for this TreeWalker 
private	TokenNameprivate	
LocatorImpl	TokenNameIdentifier	 Locator Impl
m_locator	TokenNameIdentifier	 m locator
=	TokenNameEQUAL	
new	TokenNamenew	
LocatorImpl	TokenNameIdentifier	 Locator Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the ContentHandler used for the tree walk. * * @return the ContentHandler used for the tree walk */	TokenNameCOMMENT_JAVADOC	 Get the ContentHandler used for the tree walk. * @return the ContentHandler used for the tree walk 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
getContentHandler	TokenNameIdentifier	 get Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_contentHandler	TokenNameIdentifier	 m content Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the ContentHandler used for the tree walk. * * @return the ContentHandler used for the tree walk */	TokenNameCOMMENT_JAVADOC	 Get the ContentHandler used for the tree walk. * @return the ContentHandler used for the tree walk 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor. * @param contentHandler The implemention of the * @param systemId System identifier for the document. * contentHandler operation (toXMLString, digest, ...) */	TokenNameCOMMENT_JAVADOC	 Constructor. @param contentHandler The implemention of the @param systemId System identifier for the document. contentHandler operation (toXMLString, digest, ...) 
public	TokenNamepublic	
TreeWalker	TokenNameIdentifier	 Tree Walker
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
DOMHelper	TokenNameIdentifier	 DOM Helper
dh	TokenNameIdentifier	 dh
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
contentHandler	TokenNameIdentifier	 content Handler
;	TokenNameSEMICOLON	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
m_locator	TokenNameIdentifier	 m locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Bug see Bugzilla 26741 	TokenNameCOMMENT_LINE	Bug see Bugzilla 26741 
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"dummy.xsl"	TokenNameStringLiteral	dummy.xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// user.dir not accessible from applet 	TokenNameCOMMENT_LINE	user.dir not accessible from applet 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_dh	TokenNameIdentifier	 m dh
=	TokenNameEQUAL	
dh	TokenNameIdentifier	 dh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor. * @param contentHandler The implemention of the * contentHandler operation (toXMLString, digest, ...) */	TokenNameCOMMENT_JAVADOC	 Constructor. @param contentHandler The implemention of the contentHandler operation (toXMLString, digest, ...) 
public	TokenNamepublic	
TreeWalker	TokenNameIdentifier	 Tree Walker
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
DOMHelper	TokenNameIdentifier	 DOM Helper
dh	TokenNameIdentifier	 dh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
contentHandler	TokenNameIdentifier	 content Handler
;	TokenNameSEMICOLON	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
m_locator	TokenNameIdentifier	 m locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Bug see Bugzilla 26741 	TokenNameCOMMENT_LINE	Bug see Bugzilla 26741 
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"dummy.xsl"	TokenNameStringLiteral	dummy.xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// user.dir not accessible from applet 	TokenNameCOMMENT_LINE	user.dir not accessible from applet 
}	TokenNameRBRACE	
m_dh	TokenNameIdentifier	 m dh
=	TokenNameEQUAL	
dh	TokenNameIdentifier	 dh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor. * @param contentHandler The implemention of the * contentHandler operation (toXMLString, digest, ...) */	TokenNameCOMMENT_JAVADOC	 Constructor. @param contentHandler The implemention of the contentHandler operation (toXMLString, digest, ...) 
public	TokenNamepublic	
TreeWalker	TokenNameIdentifier	 Tree Walker
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
contentHandler	TokenNameIdentifier	 content Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
contentHandler	TokenNameIdentifier	 content Handler
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
m_locator	TokenNameIdentifier	 m locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Bug see Bugzilla 26741 	TokenNameCOMMENT_LINE	Bug see Bugzilla 26741 
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"dummy.xsl"	TokenNameStringLiteral	dummy.xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// user.dir not accessible from applet 	TokenNameCOMMENT_LINE	user.dir not accessible from applet 
}	TokenNameRBRACE	
m_dh	TokenNameIdentifier	 m dh
=	TokenNameEQUAL	
new	TokenNamenew	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Perform a pre-order traversal non-recursive style. * * Note that TreeWalker assumes that the subtree is intended to represent * a complete (though not necessarily well-formed) document and, during a * traversal, startDocument and endDocument will always be issued to the * SAX listener. * * @param pos Node in the tree where to start traversal * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Perform a pre-order traversal non-recursive style. * Note that TreeWalker assumes that the subtree is intended to represent a complete (though not necessarily well-formed) document and, during a traversal, startDocument and endDocument will always be issued to the SAX listener. * @param pos Node in the tree where to start traversal * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
traverseFragment	TokenNameIdentifier	 traverse Fragment
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Perform a pre-order traversal non-recursive style. * * In contrast to the traverse() method this method will not issue * startDocument() and endDocument() events to the SAX listener. * * @param pos Node in the tree where to start traversal * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Perform a pre-order traversal non-recursive style. * In contrast to the traverse() method this method will not issue startDocument() and endDocument() events to the SAX listener. * @param pos Node in the tree where to start traversal * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
traverseFragment	TokenNameIdentifier	 traverse Fragment
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startNode	TokenNameIdentifier	 start Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endNode	TokenNameIdentifier	 end Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
endNode	TokenNameIdentifier	 end Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Perform a pre-order traversal non-recursive style. * Note that TreeWalker assumes that the subtree is intended to represent * a complete (though not necessarily well-formed) document and, during a * traversal, startDocument and endDocument will always be issued to the * SAX listener. * * @param pos Node in the tree where to start traversal * @param top Node in the tree where to end traversal * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Perform a pre-order traversal non-recursive style. Note that TreeWalker assumes that the subtree is intended to represent a complete (though not necessarily well-formed) document and, during a traversal, startDocument and endDocument will always be issued to the SAX listener. * @param pos Node in the tree where to start traversal @param top Node in the tree where to end traversal * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startNode	TokenNameIdentifier	 start Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endNode	TokenNameIdentifier	 end Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Flag indicating whether following text to be processed is raw text */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether following text to be processed is raw text 
boolean	TokenNameboolean	
nextIsRaw	TokenNameIdentifier	 next Is Raw
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Optimized dispatch of characters. */	TokenNameCOMMENT_JAVADOC	 Optimized dispatch of characters. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
dispatachChars	TokenNameIdentifier	 dispatach Chars
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
dom2dtm	TokenNameIdentifier	 dom2dtm
.	TokenNameDOT	
DOM2DTM	TokenNameIdentifier	 DO M2 DTM
.	TokenNameDOT	
CharacterNodeHandler	TokenNameIdentifier	 Character Node Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
dom2dtm	TokenNameIdentifier	 dom2dtm
.	TokenNameDOT	
DOM2DTM	TokenNameIdentifier	 DO M2 DTM
.	TokenNameDOT	
CharacterNodeHandler	TokenNameIdentifier	 Character Node Handler
)	TokenNameRPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Start processing given node * * * @param node Node to process * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Start processing given node * @param node Node to process * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
startNode	TokenNameIdentifier	 start Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
NodeConsumer	TokenNameIdentifier	 Node Consumer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeConsumer	TokenNameIdentifier	 Node Consumer
)	TokenNameRPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
setOriginatingNode	TokenNameIdentifier	 set Originating Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
Locator	TokenNameIdentifier	 Locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locator	TokenNameIdentifier	 Locator
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setColumnNumber	TokenNameIdentifier	 set Column Number
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setLineNumber	TokenNameIdentifier	 set Line Number
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setColumnNumber	TokenNameIdentifier	 set Column Number
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_locator	TokenNameIdentifier	 m locator
.	TokenNameDOT	
setLineNumber	TokenNameIdentifier	 set Line Number
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Comment	TokenNameIdentifier	 Comment
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lh	TokenNameIdentifier	 lh
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lh	TokenNameIdentifier	 lh
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
// ??; 	TokenNameCOMMENT_LINE	??; 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
atts	TokenNameIdentifier	 atts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("TreeWalker#startNode: "+node.getNodeName()); 	TokenNameCOMMENT_LINE	System.out.println("TreeWalker#startNode: "+node.getNodeName()); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nAttrs	TokenNameIdentifier	 n Attrs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("TreeWalker#startNode: attr["+i+"] = "+attrName+", "+attr.getNodeValue()); 	TokenNameCOMMENT_LINE	System.out.println("TreeWalker#startNode: attr["+i+"] = "+attrName+", "+attr.getNodeValue()); 
if	TokenNameif	
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
||	TokenNameOR_OR	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("TreeWalker#startNode: attr["+i+"] = "+attrName+", "+attr.getNodeValue()); 	TokenNameCOMMENT_LINE	System.out.println("TreeWalker#startNode: attr["+i+"] = "+attrName+", "+attr.getNodeValue()); 
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// Use "" instead of null, as Xerces likes "" for the 	TokenNameCOMMENT_LINE	Use "" instead of null, as Xerces likes "" for the 
// name of the default namespace. Fix attributed 	TokenNameCOMMENT_LINE	name of the default namespace. Fix attributed 
// to "Steven Murray" <smurray@ebt.com>. 	TokenNameCOMMENT_LINE	to "Steven Murray" <smurray@ebt.com>. 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("m_dh.getNamespaceOfNode(node): "+m_dh.getNamespaceOfNode(node)); 	TokenNameCOMMENT_LINE	System.out.println("m_dh.getNamespaceOfNode(node): "+m_dh.getNamespaceOfNode(node)); 
// System.out.println("m_dh.getLocalNameOfNode(node): "+m_dh.getLocalNameOfNode(node)); 	TokenNameCOMMENT_LINE	System.out.println("m_dh.getLocalNameOfNode(node): "+m_dh.getLocalNameOfNode(node)); 
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
m_dh	TokenNameIdentifier	 m dh
.	TokenNameDOT	
getNamespaceOfNode	TokenNameIdentifier	 get Namespace Of Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
m_dh	TokenNameIdentifier	 m dh
.	TokenNameDOT	
getLocalNameOfNode	TokenNameIdentifier	 get Local Name Of Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
AttList	TokenNameIdentifier	 Att List
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
,	TokenNameCOMMA	
m_dh	TokenNameIdentifier	 m dh
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// String data = pi.getData(); 	TokenNameCOMMENT_LINE	String data = pi.getData(); 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xslt-next-is-raw"	TokenNameStringLiteral	xslt-next-is-raw
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextIsRaw	TokenNameIdentifier	 next Is Raw
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isLexH	TokenNameIdentifier	 is Lex H
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lh	TokenNameIdentifier	 lh
=	TokenNameEQUAL	
isLexH	TokenNameIdentifier	 is Lex H
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isLexH	TokenNameIdentifier	 is Lex H
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lh	TokenNameIdentifier	 lh
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dispatachChars	TokenNameIdentifier	 dispatach Chars
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isLexH	TokenNameIdentifier	 is Lex H
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lh	TokenNameIdentifier	 lh
.	TokenNameDOT	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
//String data = ((Text) node).getData(); 	TokenNameCOMMENT_LINE	String data = ((Text) node).getData(); 
if	TokenNameif	
(	TokenNameLPAREN	
nextIsRaw	TokenNameIdentifier	 next Is Raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextIsRaw	TokenNameIdentifier	 next Is Raw
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_DISABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  DISABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dispatachChars	TokenNameIdentifier	 dispatach Chars
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_ENABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  ENABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dispatachChars	TokenNameIdentifier	 dispatach Chars
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
EntityReference	TokenNameIdentifier	 Entity Reference
eref	TokenNameIdentifier	 eref
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EntityReference	TokenNameIdentifier	 Entity Reference
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
eref	TokenNameIdentifier	 eref
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// warning("Can not output entity to a pure SAX ContentHandler"); 	TokenNameCOMMENT_LINE	warning("Can not output entity to a pure SAX ContentHandler"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * End processing of given node * * * @param node Node we just finished processing * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 End processing of given node * @param node Node we just finished processing * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
endNode	TokenNameIdentifier	 end Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
m_dh	TokenNameIdentifier	 m dh
.	TokenNameDOT	
getNamespaceOfNode	TokenNameIdentifier	 get Namespace Of Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
m_dh	TokenNameIdentifier	 m dh
.	TokenNameDOT	
getLocalNameOfNode	TokenNameIdentifier	 get Local Name Of Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
atts	TokenNameIdentifier	 atts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nAttrs	TokenNameIdentifier	 n Attrs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
||	TokenNameOR_OR	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// Use "" instead of null, as Xerces likes "" for the 	TokenNameCOMMENT_LINE	Use "" instead of null, as Xerces likes "" for the 
// name of the default namespace. Fix attributed 	TokenNameCOMMENT_LINE	name of the default namespace. Fix attributed 
// to "Steven Murray" <smurray@ebt.com>. 	TokenNameCOMMENT_LINE	to "Steven Murray" <smurray@ebt.com>. 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
attrName	TokenNameIdentifier	 attr Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
EntityReference	TokenNameIdentifier	 Entity Reference
eref	TokenNameIdentifier	 eref
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EntityReference	TokenNameIdentifier	 Entity Reference
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lh	TokenNameIdentifier	 lh
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lh	TokenNameIdentifier	 lh
.	TokenNameDOT	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
eref	TokenNameIdentifier	 eref
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//TreeWalker 	TokenNameCOMMENT_LINE	TreeWalker 
