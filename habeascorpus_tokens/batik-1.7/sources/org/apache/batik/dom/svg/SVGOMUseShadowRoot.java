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
svg	TokenNameIdentifier	 svg
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
CSSNavigableNode	TokenNameIdentifier	 CSS Navigable Node
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
AbstractDocument	TokenNameIdentifier	 Abstract Document
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
AbstractDocumentFragment	TokenNameIdentifier	 Abstract Document Fragment
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
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
/** * This class implements {@link org.w3c.dom.DocumentFragment} interface. * It is used to implement the SVG use element behavioUr. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMUseShadowRoot.java 569999 2007-08-27 05:00:38Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link org.w3c.dom.DocumentFragment} interface. It is used to implement the SVG use element behavioUr. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMUseShadowRoot.java 569999 2007-08-27 05:00:38Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMUseShadowRoot	TokenNameIdentifier	 SVGOM Use Shadow Root
extends	TokenNameextends	
AbstractDocumentFragment	TokenNameIdentifier	 Abstract Document Fragment
implements	TokenNameimplements	
CSSNavigableNode	TokenNameIdentifier	 CSS Navigable Node
,	TokenNameCOMMA	
IdContainer	TokenNameIdentifier	 Id Container
{	TokenNameLBRACE	
/** * The parent CSS element. */	TokenNameCOMMENT_JAVADOC	 The parent CSS element. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
cssParentElement	TokenNameIdentifier	 css Parent Element
;	TokenNameSEMICOLON	
/** * Indicates if the imported css element is from * this document. */	TokenNameCOMMENT_JAVADOC	 Indicates if the imported css element is from this document. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isLocal	TokenNameIdentifier	 is Local
;	TokenNameSEMICOLON	
/** * Creates a new DocumentFragment object. */	TokenNameCOMMENT_JAVADOC	 Creates a new DocumentFragment object. 
protected	TokenNameprotected	
SVGOMUseShadowRoot	TokenNameIdentifier	 SVGOM Use Shadow Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new DocumentFragment object. */	TokenNameCOMMENT_JAVADOC	 Creates a new DocumentFragment object. 
public	TokenNamepublic	
SVGOMUseShadowRoot	TokenNameIdentifier	 SVGOM Use Shadow Root
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isLocal	TokenNameIdentifier	 is Local
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
cssParentElement	TokenNameIdentifier	 css Parent Element
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isLocal	TokenNameIdentifier	 is Local
=	TokenNameEQUAL	
isLocal	TokenNameIdentifier	 is Local
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Tests whether this node is readonly. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets this node readonly attribute. */	TokenNameCOMMENT_JAVADOC	 Sets this node readonly attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setReadonly	TokenNameIdentifier	 set Readonly
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// IdContainer /////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	IdContainer /////////////////////////////////////////////////////////// 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getChildElementById	TokenNameIdentifier	 get Child Element By Id
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSSNavigableNode ////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	CSSNavigableNode ////////////////////////////////////////////////////// 
/** * Returns the CSS parent node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS parent node of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSParentNode	TokenNameIdentifier	 get CSS Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cssParentElement	TokenNameIdentifier	 css Parent Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS previous sibling node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS previous sibling node of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSPreviousSibling	TokenNameIdentifier	 get CSS Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS next sibling node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS next sibling node of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSNextSibling	TokenNameIdentifier	 get CSS Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS first child node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS first child node of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSFirstChild	TokenNameIdentifier	 get CSS First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS last child of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS last child of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSLastChild	TokenNameIdentifier	 get CSS Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this node is the root of a (conceptual) hidden tree * that selectors will not work across. */	TokenNameCOMMENT_JAVADOC	 Returns whether this node is the root of a (conceptual) hidden tree that selectors will not work across. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isHiddenFromSelectors	TokenNameIdentifier	 is Hidden From Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.dom.events.NodeEventTarget#getParentNodeEventTarget()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.dom.events.NodeEventTarget#getParentNodeEventTarget()}. 
public	TokenNamepublic	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
getParentNodeEventTarget	TokenNameIdentifier	 get Parent Node Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
)	TokenNameRPAREN	
getCSSParentNode	TokenNameIdentifier	 get CSS Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMUseShadowRoot	TokenNameIdentifier	 SVGOM Use Shadow Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
