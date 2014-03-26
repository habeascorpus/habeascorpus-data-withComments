/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOMBuilder.java 472634 2006-11-08 20:43:55Z jycli $ */	TokenNameCOMMENT_BLOCK	 $Id: DOMBuilder.java 472634 2006-11-08 20:43:55Z jycli $ 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
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
DocumentFragment	TokenNameIdentifier	 Document Fragment
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
CDATASection	TokenNameIdentifier	 CDATA Section
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
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
/** * This class takes SAX events (in addition to some extra events * that SAX doesn't handle yet) and adds the result to a document * or document fragment. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class takes SAX events (in addition to some extra events that SAX doesn't handle yet) and adds the result to a document or document fragment. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
DOMBuilder	TokenNameIdentifier	 DOM Builder
implements	TokenNameimplements	
ContentHandler	TokenNameIdentifier	 Content Handler
,	TokenNameCOMMA	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
{	TokenNameLBRACE	
/** Root document */	TokenNameCOMMENT_JAVADOC	 Root document 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
/** Current node */	TokenNameCOMMENT_JAVADOC	 Current node 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The root node */	TokenNameCOMMENT_JAVADOC	 The root node 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
m_root	TokenNameIdentifier	 m root
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The next sibling node */	TokenNameCOMMENT_JAVADOC	 The next sibling node 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
m_nextSibling	TokenNameIdentifier	 m next Sibling
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** First node of document fragment or null if not a DocumentFragment */	TokenNameCOMMENT_JAVADOC	 First node of document fragment or null if not a DocumentFragment 
public	TokenNamepublic	
DocumentFragment	TokenNameIdentifier	 Document Fragment
m_docFrag	TokenNameIdentifier	 m doc Frag
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Vector of element nodes */	TokenNameCOMMENT_JAVADOC	 Vector of element nodes 
protected	TokenNameprotected	
Stack	TokenNameIdentifier	 Stack
m_elemStack	TokenNameIdentifier	 m elem Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Namespace support */	TokenNameCOMMENT_JAVADOC	 Namespace support 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * DOMBuilder instance constructor... it will add the DOM nodes * to the document fragment. * * @param doc Root document * @param node Current node */	TokenNameCOMMENT_JAVADOC	 DOMBuilder instance constructor... it will add the DOM nodes to the document fragment. * @param doc Root document @param node Current node 
public	TokenNamepublic	
DOMBuilder	TokenNameIdentifier	 DOM Builder
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_doc	TokenNameIdentifier	 m doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
m_root	TokenNameIdentifier	 m root
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
m_elemStack	TokenNameIdentifier	 m elem Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOMBuilder instance constructor... it will add the DOM nodes * to the document fragment. * * @param doc Root document * @param docFrag Document fragment */	TokenNameCOMMENT_JAVADOC	 DOMBuilder instance constructor... it will add the DOM nodes to the document fragment. * @param doc Root document @param docFrag Document fragment 
public	TokenNamepublic	
DOMBuilder	TokenNameIdentifier	 DOM Builder
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
DocumentFragment	TokenNameIdentifier	 Document Fragment
docFrag	TokenNameIdentifier	 doc Frag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_doc	TokenNameIdentifier	 m doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
m_docFrag	TokenNameIdentifier	 m doc Frag
=	TokenNameEQUAL	
docFrag	TokenNameIdentifier	 doc Frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOMBuilder instance constructor... it will add the DOM nodes * to the document. * * @param doc Root document */	TokenNameCOMMENT_JAVADOC	 DOMBuilder instance constructor... it will add the DOM nodes to the document. * @param doc Root document 
public	TokenNamepublic	
DOMBuilder	TokenNameIdentifier	 DOM Builder
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
/** * Get the root document or DocumentFragment of the DOM being created. * * @return The root document or document fragment if not null */	TokenNameCOMMENT_JAVADOC	 Get the root document or DocumentFragment of the DOM being created. * @return The root document or document fragment if not null 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRootDocument	TokenNameIdentifier	 get Root Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_docFrag	TokenNameIdentifier	 m doc Frag
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
m_docFrag	TokenNameIdentifier	 m doc Frag
:	TokenNameCOLON	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the root node of the DOM tree. */	TokenNameCOMMENT_JAVADOC	 Get the root node of the DOM tree. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRootNode	TokenNameIdentifier	 get Root Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_root	TokenNameIdentifier	 m root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the node currently being processed. * * @return the current node being processed */	TokenNameCOMMENT_JAVADOC	 Get the node currently being processed. * @return the current node being processed 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentNode	TokenNameIdentifier	 m current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the next sibling node, which is where the result nodes * should be inserted before. * * @param nextSibling the next sibling node. */	TokenNameCOMMENT_JAVADOC	 Set the next sibling node, which is where the result nodes should be inserted before. * @param nextSibling the next sibling node. 
public	TokenNamepublic	
void	TokenNamevoid	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nextSibling	TokenNameIdentifier	 m next Sibling
=	TokenNameEQUAL	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the next sibling node. * * @return the next sibling node. */	TokenNameCOMMENT_JAVADOC	 Return the next sibling node. * @return the next sibling node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_nextSibling	TokenNameIdentifier	 m next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return null since there is no Writer for this class. * * @return null */	TokenNameCOMMENT_JAVADOC	 Return null since there is no Writer for this class. * @return null 
public	TokenNamepublic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a node to the current container. * * @param newNode New node to append */	TokenNameCOMMENT_JAVADOC	 Append a node to the current container. * @param newNode New node to append 
protected	TokenNameprotected	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
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
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
m_currentNode	TokenNameIdentifier	 m current Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
m_root	TokenNameIdentifier	 m root
&&	TokenNameAND_AND	
m_nextSibling	TokenNameIdentifier	 m next Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
m_nextSibling	TokenNameIdentifier	 m next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println(newNode.getNodeName()); 	TokenNameCOMMENT_LINE	System.out.println(newNode.getNodeName()); 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_docFrag	TokenNameIdentifier	 m doc Frag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_nextSibling	TokenNameIdentifier	 m next Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_docFrag	TokenNameIdentifier	 m doc Frag
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
m_nextSibling	TokenNameIdentifier	 m next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_docFrag	TokenNameIdentifier	 m doc Frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_CANT_OUTPUT_TEXT_BEFORE_DOC	TokenNameIdentifier	 ER  CANT  OUTPUT  TEXT  BEFORE  DOC
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Warning: can't output text before document element! Ignoring..."); 	TokenNameCOMMENT_LINE	"Warning: can't output text before document element! Ignoring..."); 
}	TokenNameRBRACE	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_CANT_HAVE_MORE_THAN_ONE_ROOT	TokenNameIdentifier	 ER  CANT  HAVE  MORE  THAN  ONE  ROOT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can't have more than one root on a DOM!"); 	TokenNameCOMMENT_LINE	"Can't have more than one root on a DOM!"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_nextSibling	TokenNameIdentifier	 m next Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
m_nextSibling	TokenNameIdentifier	 m next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive an object for locating the origin of SAX document events. * * <p>SAX parsers are strongly encouraged (though not absolutely * required) to supply a locator: if it does so, it must supply * the locator to the application by invoking this method before * invoking any of the other methods in the ContentHandler * interface.</p> * * <p>The locator allows the application to determine the end * position of any document-related event, even if the parser is * not reporting an error. Typically, the application will * use this information for reporting its own errors (such as * character content that does not match an application's * business rules). The information returned by the locator * is probably not sufficient for use with a search engine.</p> * * <p>Note that the locator will return correct information only * during the invocation of the events in this interface. The * application should not attempt to use it at any other time.</p> * * @param locator An object that can return the location of * any SAX document event. * @see org.xml.sax.Locator */	TokenNameCOMMENT_JAVADOC	 Receive an object for locating the origin of SAX document events. * <p>SAX parsers are strongly encouraged (though not absolutely required) to supply a locator: if it does so, it must supply the locator to the application by invoking this method before invoking any of the other methods in the ContentHandler interface.</p> * <p>The locator allows the application to determine the end position of any document-related event, even if the parser is not reporting an error. Typically, the application will use this information for reporting its own errors (such as character content that does not match an application's business rules). The information returned by the locator is probably not sufficient for use with a search engine.</p> * <p>Note that the locator will return correct information only during the invocation of the events in this interface. The application should not attempt to use it at any other time.</p> * @param locator An object that can return the location of any SAX document event. @see org.xml.sax.Locator 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No action for the moment. 	TokenNameCOMMENT_LINE	No action for the moment. 
}	TokenNameRBRACE	
/** * Receive notification of the beginning of a document. * * <p>The SAX parser will invoke this method only once, before any * other methods in this interface or in DTDHandler (except for * setDocumentLocator).</p> */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of a document. * <p>The SAX parser will invoke this method only once, before any other methods in this interface or in DTDHandler (except for setDocumentLocator).</p> 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
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
// No action for the moment. 	TokenNameCOMMENT_LINE	No action for the moment. 
}	TokenNameRBRACE	
/** * Receive notification of the end of a document. * * <p>The SAX parser will invoke this method only once, and it will * be the last method invoked during the parse. The parser shall * not invoke this method until it has either abandoned parsing * (because of an unrecoverable error) or reached the end of * input.</p> */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of a document. * <p>The SAX parser will invoke this method only once, and it will be the last method invoked during the parse. The parser shall not invoke this method until it has either abandoned parsing (because of an unrecoverable error) or reached the end of input.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
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
// No action for the moment. 	TokenNameCOMMENT_LINE	No action for the moment. 
}	TokenNameRBRACE	
/** * Receive notification of the beginning of an element. * * <p>The Parser will invoke this method at the beginning of every * element in the XML document; there will be a corresponding * endElement() event for every startElement() event (even when the * element is empty). All of the element's content will be * reported, in order, before the corresponding endElement() * event.</p> * * <p>If the element name has a namespace prefix, the prefix will * still be attached. Note that the attribute list provided will * contain only attributes with explicit values (specified or * defaulted): #IMPLIED attributes will be omitted.</p> * * * @param ns The namespace of the node * @param localName The local part of the qualified name * @param name The element name. * @param atts The attributes attached to the element, if any. * @see #endElement * @see org.xml.sax.Attributes */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of an element. * <p>The Parser will invoke this method at the beginning of every element in the XML document; there will be a corresponding endElement() event for every startElement() event (even when the element is empty). All of the element's content will be reported, in order, before the corresponding endElement() event.</p> * <p>If the element name has a namespace prefix, the prefix will still be attached. Note that the attribute list provided will contain only attributes with explicit values (specified or defaulted): #IMPLIED attributes will be omitted.</p> * @param ns The namespace of the node @param localName The local part of the qualified name @param name The element name. @param atts The attributes attached to the element, if any. @see #endElement @see org.xml.sax.Attributes 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
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
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
// Note that the namespace-aware call must be used to correctly 	TokenNameCOMMENT_LINE	Note that the namespace-aware call must be used to correctly 
// construct a Level 2 DOM, even for non-namespaced nodes. 	TokenNameCOMMENT_LINE	construct a Level 2 DOM, even for non-namespaced nodes. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
nAtts	TokenNameIdentifier	 n Atts
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
nAtts	TokenNameIdentifier	 n Atts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nAtts	TokenNameIdentifier	 n Atts
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("type " + atts.getType(i) + " name " + atts.getLocalName(i) ); 	TokenNameCOMMENT_LINE	System.out.println("type " + atts.getType(i) + " name " + atts.getLocalName(i) ); 
// First handle a possible ID attribute 	TokenNameCOMMENT_LINE	First handle a possible ID attribute 
if	TokenNameif	
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"ID"	TokenNameStringLiteral	ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setIDAttribute	TokenNameIdentifier	 set ID Attribute
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrNS	TokenNameIdentifier	 attr NS
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
attrNS	TokenNameIdentifier	 attr NS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
attrNS	TokenNameIdentifier	 attr NS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// DOM represents no-namespace as null 	TokenNameCOMMENT_LINE	DOM represents no-namespace as null 
// System.out.println("attrNS: "+attrNS+", localName: "+atts.getQName(i) 	TokenNameCOMMENT_LINE	System.out.println("attrNS: "+attrNS+", localName: "+atts.getQName(i) 
// +", qname: "+atts.getQName(i)+", value: "+atts.getValue(i)); 	TokenNameCOMMENT_LINE	+", qname: "+atts.getQName(i)+", value: "+atts.getValue(i)); 
// Crimson won't let us set an xmlns: attribute on the DOM. 	TokenNameCOMMENT_LINE	Crimson won't let us set an xmlns: attribute on the DOM. 
String	TokenNameIdentifier	 String
attrQName	TokenNameIdentifier	 attr Q Name
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// In SAX, xmlns[:] attributes have an empty namespace, while in DOM they 	TokenNameCOMMENT_LINE	In SAX, xmlns[:] attributes have an empty namespace, while in DOM they 
// should have the xmlns namespace 	TokenNameCOMMENT_LINE	should have the xmlns namespace 
if	TokenNameif	
(	TokenNameLPAREN	
attrQName	TokenNameIdentifier	 attr Q Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
||	TokenNameOR_OR	
attrQName	TokenNameIdentifier	 attr Q Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrNS	TokenNameIdentifier	 attr NS
=	TokenNameEQUAL	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ALWAYS use the DOM Level 2 call! 	TokenNameCOMMENT_LINE	ALWAYS use the DOM Level 2 call! 
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
attrNS	TokenNameIdentifier	 attr NS
,	TokenNameCOMMA	
attrQName	TokenNameIdentifier	 attr Q Name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Adding namespace nodes to the DOM tree; */	TokenNameCOMMENT_BLOCK	 Adding namespace nodes to the DOM tree; 
int	TokenNameint	
nDecls	TokenNameIdentifier	 n Decls
=	TokenNameEQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
declURL	TokenNameIdentifier	 decl URL
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
nDecls	TokenNameIdentifier	 n Decls
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
declURL	TokenNameIdentifier	 decl URL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
declURL	TokenNameIdentifier	 decl URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// append(elem); 	TokenNameCOMMENT_LINE	append(elem); 
m_elemStack	TokenNameIdentifier	 m elem Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
// append(elem); 	TokenNameCOMMENT_LINE	append(elem); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Exception	TokenNameIdentifier	 Exception
de	TokenNameIdentifier	 de
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// de.printStackTrace(); 	TokenNameCOMMENT_LINE	de.printStackTrace(); 
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * <p>The SAX parser will invoke this method at the end of every * element in the XML document; there will be a corresponding * startElement() event for every endElement() event (even when the * element is empty).</p> * * <p>If the element name has a namespace prefix, the prefix will * still be attached to the name.</p> * * * @param ns the namespace of the element * @param localName The local part of the qualified name of the element * @param name The element name */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * <p>The SAX parser will invoke this method at the end of every element in the XML document; there will be a corresponding startElement() event for every endElement() event (even when the element is empty).</p> * <p>If the element name has a namespace prefix, the prefix will still be attached to the name.</p> * @param ns the namespace of the element @param localName The local part of the qualified name of the element @param name The element name 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
m_elemStack	TokenNameIdentifier	 m elem Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
m_elemStack	TokenNameIdentifier	 m elem Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
m_elemStack	TokenNameIdentifier	 m elem Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an ID string to node association in the ID table. * * @param id The ID string. * @param elem The associated ID. */	TokenNameCOMMENT_JAVADOC	 Set an ID string to node association in the ID table. * @param id The ID string. @param elem The associated ID. 
public	TokenNamepublic	
void	TokenNamevoid	
setIDAttribute	TokenNameIdentifier	 set ID Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do nothing. This method is meant to be overiden. 	TokenNameCOMMENT_LINE	Do nothing. This method is meant to be overiden. 
}	TokenNameRBRACE	
/** * Receive notification of character data. * * <p>The Parser will call this method to report each chunk of * character data. SAX parsers may return all contiguous character * data in a single chunk, or they may split it into several * chunks; however, all of the characters in any single event * must come from the same external entity, so that the Locator * provides useful information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * <p>Note that some parsers will report whitespace using the * ignorableWhitespace() method rather than this one (validating * parsers must do so).</p> * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @see #ignorableWhitespace * @see org.xml.sax.Locator */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data. * <p>The Parser will call this method to report each chunk of character data. SAX parsers may return all contiguous character data in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * <p>Note that some parsers will report whitespace using the ignorableWhitespace() method rather than this one (validating parsers must do so).</p> * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @see #ignorableWhitespace @see org.xml.sax.Locator 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
isOutsideDocElem	TokenNameIdentifier	 is Outside Doc Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// avoid DOM006 Hierarchy request error 	TokenNameCOMMENT_LINE	avoid DOM006 Hierarchy request error 
if	TokenNameif	
(	TokenNameLPAREN	
m_inCData	TokenNameIdentifier	 m in C Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cdata	TokenNameIdentifier	 cdata
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
childNode	TokenNameIdentifier	 child Node
;	TokenNameSEMICOLON	
childNode	TokenNameIdentifier	 child Node
=	TokenNameEQUAL	
m_currentNode	TokenNameIdentifier	 m current Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
m_currentNode	TokenNameIdentifier	 m current Node
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
childNode	TokenNameIdentifier	 child Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
)	TokenNameRPAREN	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
.	TokenNameDOT	
appendData	TokenNameIdentifier	 append Data
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Text	TokenNameIdentifier	 Text
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If available, when the disable-output-escaping attribute is used, * output raw text without escaping. A PI will be inserted in front * of the node with the name "lotusxsl-next-is-raw" and a value of * "formatter-to-dom". * * @param ch Array containing the characters * @param start Index to start of characters in the array * @param length Number of characters in the array */	TokenNameCOMMENT_JAVADOC	 If available, when the disable-output-escaping attribute is used, output raw text without escaping. A PI will be inserted in front of the node with the name "lotusxsl-next-is-raw" and a value of "formatter-to-dom". * @param ch Array containing the characters @param start Index to start of characters in the array @param length Number of characters in the array 
public	TokenNamepublic	
void	TokenNamevoid	
charactersRaw	TokenNameIdentifier	 characters Raw
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
isOutsideDocElem	TokenNameIdentifier	 is Outside Doc Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// avoid DOM006 Hierarchy request error 	TokenNameCOMMENT_LINE	avoid DOM006 Hierarchy request error 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createProcessingInstruction	TokenNameIdentifier	 create Processing Instruction
(	TokenNameLPAREN	
"xslt-next-is-raw"	TokenNameStringLiteral	xslt-next-is-raw
,	TokenNameCOMMA	
"formatter-to-dom"	TokenNameStringLiteral	formatter-to-dom
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the beginning of an entity. * * The start and end of the document entity are not reported. * The start and end of the external DTD subset are reported * using the pseudo-name "[dtd]". All other events must be * properly nested within start/end entity events. * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @see #endEntity * @see org.xml.sax.ext.DeclHandler#internalEntityDecl * @see org.xml.sax.ext.DeclHandler#externalEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report the beginning of an entity. * The start and end of the document entity are not reported. The start and end of the external DTD subset are reported using the pseudo-name "[dtd]". All other events must be properly nested within start/end entity events. * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @see #endEntity @see org.xml.sax.ext.DeclHandler#internalEntityDecl @see org.xml.sax.ext.DeclHandler#externalEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
// Almost certainly the wrong behavior... 	TokenNameCOMMENT_LINE	Almost certainly the wrong behavior... 
// entityReference(name); 	TokenNameCOMMENT_LINE	entityReference(name); 
}	TokenNameRBRACE	
/** * Report the end of an entity. * * @param name The name of the entity that is ending. * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the end of an entity. * @param name The name of the entity that is ending. @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
}	TokenNameRBRACE	
/** * Receive notivication of a entityReference. * * @param name name of the entity reference */	TokenNameCOMMENT_JAVADOC	 Receive notivication of a entityReference. * @param name name of the entity reference 
public	TokenNamepublic	
void	TokenNamevoid	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createEntityReference	TokenNameIdentifier	 create Entity Reference
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of ignorable whitespace in element content. * * <p>Validating Parsers must use this method to report each chunk * of ignorable whitespace (see the W3C XML 1.0 recommendation, * section 2.10): non-validating parsers may also use this method * if they are capable of parsing and using content models.</p> * * <p>SAX parsers may return all contiguous whitespace in a single * chunk, or they may split it into several chunks; however, all of * the characters in any single event must come from the same * external entity, so that the Locator provides useful * information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @see #characters */	TokenNameCOMMENT_JAVADOC	 Receive notification of ignorable whitespace in element content. * <p>Validating Parsers must use this method to report each chunk of ignorable whitespace (see the W3C XML 1.0 recommendation, section 2.10): non-validating parsers may also use this method if they are capable of parsing and using content models.</p> * <p>SAX parsers may return all contiguous whitespace in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @see #characters 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
isOutsideDocElem	TokenNameIdentifier	 is Outside Doc Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// avoid DOM006 Hierarchy request error 	TokenNameCOMMENT_LINE	avoid DOM006 Hierarchy request error 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the current node is outside the document element. * * @return true if the current node is outside the document element. */	TokenNameCOMMENT_JAVADOC	 Tell if the current node is outside the document element. * @return true if the current node is outside the document element. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isOutsideDocElem	TokenNameIdentifier	 is Outside Doc Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_docFrag	TokenNameIdentifier	 m doc Frag
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_elemStack	TokenNameIdentifier	 m elem Stack
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_currentNode	TokenNameIdentifier	 m current Node
||	TokenNameOR_OR	
m_currentNode	TokenNameIdentifier	 m current Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a processing instruction. * * <p>The Parser will invoke this method once for each processing * instruction found: note that processing instructions may occur * before or after the main document element.</p> * * <p>A SAX parser should never report an XML declaration (XML 1.0, * section 2.8) or a text declaration (XML 1.0, section 4.3.1) * using this method.</p> * * @param target The processing instruction target. * @param data The processing instruction data, or null if * none was supplied. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a processing instruction. * <p>The Parser will invoke this method once for each processing instruction found: note that processing instructions may occur before or after the main document element.</p> * <p>A SAX parser should never report an XML declaration (XML 1.0, section 2.8) or a text declaration (XML 1.0, section 4.3.1) using this method.</p> * @param target The processing instruction target. @param data The processing instruction data, or null if none was supplied. 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
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
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createProcessingInstruction	TokenNameIdentifier	 create Processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report an XML comment anywhere in the document. * * This callback will be used for comments inside or outside the * document element, including comments in the external DTD * subset (if read). * * @param ch An array holding the characters in the comment. * @param start The starting position in the array. * @param length The number of characters to use from the array. */	TokenNameCOMMENT_JAVADOC	 Report an XML comment anywhere in the document. * This callback will be used for comments inside or outside the document element, including comments in the external DTD subset (if read). * @param ch An array holding the characters in the comment. @param start The starting position in the array. @param length The number of characters to use from the array. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createComment	TokenNameIdentifier	 create Comment
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Flag indicating that we are processing a CData section */	TokenNameCOMMENT_JAVADOC	 Flag indicating that we are processing a CData section 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_inCData	TokenNameIdentifier	 m in C Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Report the start of a CDATA section. * * @see #endCDATA */	TokenNameCOMMENT_JAVADOC	 Report the start of a CDATA section. * @see #endCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
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
m_inCData	TokenNameIdentifier	 m in C Data
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_doc	TokenNameIdentifier	 m doc
.	TokenNameDOT	
createCDATASection	TokenNameIdentifier	 create CDATA Section
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of a CDATA section. * * @see #startCDATA */	TokenNameCOMMENT_JAVADOC	 Report the end of a CDATA section. * @see #startCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
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
m_inCData	TokenNameIdentifier	 m in C Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of cdata. * * <p>The Parser will call this method to report each chunk of * character data. SAX parsers may return all contiguous character * data in a single chunk, or they may split it into several * chunks; however, all of the characters in any single event * must come from the same external entity, so that the Locator * provides useful information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * <p>Note that some parsers will report whitespace using the * ignorableWhitespace() method rather than this one (validating * parsers must do so).</p> * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @see #ignorableWhitespace * @see org.xml.sax.Locator */	TokenNameCOMMENT_JAVADOC	 Receive notification of cdata. * <p>The Parser will call this method to report each chunk of character data. SAX parsers may return all contiguous character data in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * <p>Note that some parsers will report whitespace using the ignorableWhitespace() method rather than this one (validating parsers must do so).</p> * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @see #ignorableWhitespace @see org.xml.sax.Locator 
public	TokenNamepublic	
void	TokenNamevoid	
cdata	TokenNameIdentifier	 cdata
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
isOutsideDocElem	TokenNameIdentifier	 is Outside Doc Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// avoid DOM006 Hierarchy request error 	TokenNameCOMMENT_LINE	avoid DOM006 Hierarchy request error 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CDATASection	TokenNameIdentifier	 CDATA Section
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CDATASection	TokenNameIdentifier	 CDATA Section
)	TokenNameRPAREN	
m_currentNode	TokenNameIdentifier	 m current Node
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
appendData	TokenNameIdentifier	 append Data
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the start of DTD declarations, if any. * * Any declarations are assumed to be in the internal subset * unless otherwise indicated. * * @param name The document type name. * @param publicId The declared public identifier for the * external DTD subset, or null if none was declared. * @param systemId The declared system identifier for the * external DTD subset, or null if none was declared. * @see #endDTD * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the start of DTD declarations, if any. * Any declarations are assumed to be in the internal subset unless otherwise indicated. * @param name The document type name. @param publicId The declared public identifier for the external DTD subset, or null if none was declared. @param systemId The declared system identifier for the external DTD subset, or null if none was declared. @see #endDTD @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
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
// Do nothing for now. 	TokenNameCOMMENT_LINE	Do nothing for now. 
}	TokenNameRBRACE	
/** * Report the end of DTD declarations. * * @see #startDTD */	TokenNameCOMMENT_JAVADOC	 Report the end of DTD declarations. * @see #startDTD 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
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
// Do nothing for now. 	TokenNameCOMMENT_LINE	Do nothing for now. 
}	TokenNameRBRACE	
/** * Begin the scope of a prefix-URI Namespace mapping. * * <p>The information from this event is not necessary for * normal Namespace processing: the SAX XML reader will * automatically replace prefixes for element and attribute * names when the http://xml.org/sax/features/namespaces * feature is true (the default).</p> * * <p>There are cases, however, when applications need to * use prefixes in character data or in attribute values, * where they cannot safely be expanded automatically; the * start/endPrefixMapping event supplies the information * to the application to expand prefixes in those contexts * itself, if necessary.</p> * * <p>Note that start/endPrefixMapping events are not * guaranteed to be properly nested relative to each-other: * all startPrefixMapping events will occur before the * corresponding startElement event, and all endPrefixMapping * events will occur after the corresponding endElement event, * but their order is not guaranteed.</p> * * @param prefix The Namespace prefix being declared. * @param uri The Namespace URI the prefix is mapped to. * @see #endPrefixMapping * @see #startElement */	TokenNameCOMMENT_JAVADOC	 Begin the scope of a prefix-URI Namespace mapping. * <p>The information from this event is not necessary for normal Namespace processing: the SAX XML reader will automatically replace prefixes for element and attribute names when the http://xml.org/sax/features/namespaces feature is true (the default).</p> * <p>There are cases, however, when applications need to use prefixes in character data or in attribute values, where they cannot safely be expanded automatically; the start/endPrefixMapping event supplies the information to the application to expand prefixes in those contexts itself, if necessary.</p> * <p>Note that start/endPrefixMapping events are not guaranteed to be properly nested relative to each-other: all startPrefixMapping events will occur before the corresponding startElement event, and all endPrefixMapping events will occur after the corresponding endElement event, but their order is not guaranteed.</p> * @param prefix The Namespace prefix being declared. @param uri The Namespace URI the prefix is mapped to. @see #endPrefixMapping @see #startElement 
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
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
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
prefix	TokenNameIdentifier	 prefix
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
"xmlns"	TokenNameStringLiteral	xmlns
;	TokenNameSEMICOLON	
else	TokenNameelse	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * End the scope of a prefix-URI mapping. * * <p>See startPrefixMapping for details. This event will * always occur after the corresponding endElement event, * but the order of endPrefixMapping events is not otherwise * guaranteed.</p> * * @param prefix The prefix that was being mapping. * @see #startPrefixMapping * @see #endElement */	TokenNameCOMMENT_JAVADOC	 End the scope of a prefix-URI mapping. * <p>See startPrefixMapping for details. This event will always occur after the corresponding endElement event, but the order of endPrefixMapping events is not otherwise guaranteed.</p> * @param prefix The prefix that was being mapping. @see #startPrefixMapping @see #endElement 
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
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
}	TokenNameRBRACE	
/** * Receive notification of a skipped entity. * * <p>The Parser will invoke this method once for each entity * skipped. Non-validating processors may skip entities if they * have not seen the declarations (because, for example, the * entity was declared in an external DTD subset). All processors * may skip external entities, depending on the values of the * http://xml.org/sax/features/external-general-entities and the * http://xml.org/sax/features/external-parameter-entities * properties.</p> * * @param name The name of the skipped entity. If it is a * parameter entity, the name will begin with '%'. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a skipped entity. * <p>The Parser will invoke this method once for each entity skipped. Non-validating processors may skip entities if they have not seen the declarations (because, for example, the entity was declared in an external DTD subset). All processors may skip external entities, depending on the values of the http://xml.org/sax/features/external-general-entities and the http://xml.org/sax/features/external-parameter-entities properties.</p> * @param name The name of the skipped entity. If it is a parameter entity, the name will begin with '%'. 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
