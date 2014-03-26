/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSNavigableDocumentListener	TokenNameIdentifier	 CSS Navigable Document Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DocumentType	TokenNameIdentifier	 Document Type
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
EventListener	TokenNameIdentifier	 Event Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGDocument	TokenNameIdentifier	 SVG Document
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGDocument} and provides support for * SVG 1.2 specifics. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVG12OMDocument.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGDocument} and provides support for SVG 1.2 specifics. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVG12OMDocument.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVG12OMDocument	TokenNameIdentifier	 SV G12 OM Document
extends	TokenNameextends	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
{	TokenNameLBRACE	
/** * Creates a new uninitialized document. */	TokenNameCOMMENT_JAVADOC	 Creates a new uninitialized document. 
protected	TokenNameprotected	
SVG12OMDocument	TokenNameIdentifier	 SV G12 OM Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVG12OMDocument. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVG12OMDocument. 
public	TokenNamepublic	
SVG12OMDocument	TokenNameIdentifier	 SV G12 OM Document
(	TokenNameLPAREN	
DocumentType	TokenNameIdentifier	 Document Type
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// AbstractDocument /////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	AbstractDocument /////////////////////////////////////////////// 
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVG12OMDocument	TokenNameIdentifier	 SV G12 OM Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSSNavigableDocument /////////////////////////////////////////// 	TokenNameCOMMENT_LINE	CSSNavigableDocument /////////////////////////////////////////// 
/** * Adds an event listener for mutations on the * CSSNavigableDocument tree. */	TokenNameCOMMENT_JAVADOC	 Adds an event listener for mutations on the CSSNavigableDocument tree. 
public	TokenNamepublic	
void	TokenNamevoid	
addCSSNavigableDocumentListener	TokenNameIdentifier	 add CSS Navigable Document Listener
(	TokenNameLPAREN	
CSSNavigableDocumentListener	TokenNameIdentifier	 CSS Navigable Document Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cssNavigableDocumentListeners	TokenNameIdentifier	 css Navigable Document Listeners
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DOMNodeInsertedListenerWrapper	TokenNameIdentifier	 DOM Node Inserted Listener Wrapper
nodeInserted	TokenNameIdentifier	 node Inserted
=	TokenNameEQUAL	
new	TokenNamenew	
DOMNodeInsertedListenerWrapper	TokenNameIdentifier	 DOM Node Inserted Listener Wrapper
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMNodeRemovedListenerWrapper	TokenNameIdentifier	 DOM Node Removed Listener Wrapper
nodeRemoved	TokenNameIdentifier	 node Removed
=	TokenNameEQUAL	
new	TokenNamenew	
DOMNodeRemovedListenerWrapper	TokenNameIdentifier	 DOM Node Removed Listener Wrapper
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMSubtreeModifiedListenerWrapper	TokenNameIdentifier	 DOM Subtree Modified Listener Wrapper
subtreeModified	TokenNameIdentifier	 subtree Modified
=	TokenNameEQUAL	
new	TokenNamenew	
DOMSubtreeModifiedListenerWrapper	TokenNameIdentifier	 DOM Subtree Modified Listener Wrapper
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMCharacterDataModifiedListenerWrapper	TokenNameIdentifier	 DOM Character Data Modified Listener Wrapper
cdataModified	TokenNameIdentifier	 cdata Modified
=	TokenNameEQUAL	
new	TokenNamenew	
DOMCharacterDataModifiedListenerWrapper	TokenNameIdentifier	 DOM Character Data Modified Listener Wrapper
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMAttrModifiedListenerWrapper	TokenNameIdentifier	 DOM Attr Modified Listener Wrapper
attrModified	TokenNameIdentifier	 attr Modified
=	TokenNameEQUAL	
new	TokenNamenew	
DOMAttrModifiedListenerWrapper	TokenNameIdentifier	 DOM Attr Modified Listener Wrapper
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cssNavigableDocumentListeners	TokenNameIdentifier	 css Navigable Document Listeners
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
new	TokenNamenew	
EventListener	TokenNameIdentifier	 Event Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
nodeInserted	TokenNameIdentifier	 node Inserted
,	TokenNameCOMMA	
nodeRemoved	TokenNameIdentifier	 node Removed
,	TokenNameCOMMA	
subtreeModified	TokenNameIdentifier	 subtree Modified
,	TokenNameCOMMA	
cdataModified	TokenNameIdentifier	 cdata Modified
,	TokenNameCOMMA	
attrModified	TokenNameIdentifier	 attr Modified
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XBLEventSupport	TokenNameIdentifier	 XBL Event Support
es	TokenNameIdentifier	 es
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XBLEventSupport	TokenNameIdentifier	 XBL Event Support
)	TokenNameRPAREN	
initializeEventSupport	TokenNameIdentifier	 initialize Event Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
addImplementationEventListenerNS	TokenNameIdentifier	 add Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMNodeInserted"	TokenNameStringLiteral	DOMNodeInserted
,	TokenNameCOMMA	
nodeInserted	TokenNameIdentifier	 node Inserted
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
addImplementationEventListenerNS	TokenNameIdentifier	 add Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMNodeRemoved"	TokenNameStringLiteral	DOMNodeRemoved
,	TokenNameCOMMA	
nodeRemoved	TokenNameIdentifier	 node Removed
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
addImplementationEventListenerNS	TokenNameIdentifier	 add Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMSubtreeModified"	TokenNameStringLiteral	DOMSubtreeModified
,	TokenNameCOMMA	
subtreeModified	TokenNameIdentifier	 subtree Modified
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
addImplementationEventListenerNS	TokenNameIdentifier	 add Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMCharacterDataModified"	TokenNameStringLiteral	DOMCharacterDataModified
,	TokenNameCOMMA	
cdataModified	TokenNameIdentifier	 cdata Modified
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
addImplementationEventListenerNS	TokenNameIdentifier	 add Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMAttrModified"	TokenNameStringLiteral	DOMAttrModified
,	TokenNameCOMMA	
attrModified	TokenNameIdentifier	 attr Modified
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes an event listener for mutations on the * CSSNavigableDocument tree. */	TokenNameCOMMENT_JAVADOC	 Removes an event listener for mutations on the CSSNavigableDocument tree. 
public	TokenNamepublic	
void	TokenNamevoid	
removeCSSNavigableDocumentListener	TokenNameIdentifier	 remove CSS Navigable Document Listener
(	TokenNameLPAREN	
CSSNavigableDocumentListener	TokenNameIdentifier	 CSS Navigable Document Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventListener	TokenNameIdentifier	 Event Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
cssNavigableDocumentListeners	TokenNameIdentifier	 css Navigable Document Listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XBLEventSupport	TokenNameIdentifier	 XBL Event Support
es	TokenNameIdentifier	 es
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XBLEventSupport	TokenNameIdentifier	 XBL Event Support
)	TokenNameRPAREN	
initializeEventSupport	TokenNameIdentifier	 initialize Event Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
removeImplementationEventListenerNS	TokenNameIdentifier	 remove Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMNodeInserted"	TokenNameStringLiteral	DOMNodeInserted
,	TokenNameCOMMA	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
removeImplementationEventListenerNS	TokenNameIdentifier	 remove Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMNodeRemoved"	TokenNameStringLiteral	DOMNodeRemoved
,	TokenNameCOMMA	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
removeImplementationEventListenerNS	TokenNameIdentifier	 remove Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMSubtreeModified"	TokenNameStringLiteral	DOMSubtreeModified
,	TokenNameCOMMA	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
removeImplementationEventListenerNS	TokenNameIdentifier	 remove Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMCharacterDataModified"	TokenNameStringLiteral	DOMCharacterDataModified
,	TokenNameCOMMA	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
.	TokenNameDOT	
removeImplementationEventListenerNS	TokenNameIdentifier	 remove Implementation Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMAttrModified"	TokenNameStringLiteral	DOMAttrModified
,	TokenNameCOMMA	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cssNavigableDocumentListeners	TokenNameIdentifier	 css Navigable Document Listeners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
