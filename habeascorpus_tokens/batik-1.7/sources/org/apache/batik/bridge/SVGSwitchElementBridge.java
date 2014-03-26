/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
GraphicsNode	TokenNameIdentifier	 Graphics Node
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGTests	TokenNameIdentifier	 SVG Tests
;	TokenNameSEMICOLON	
/** * Bridge class for the &lt;switch> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGSwitchElementBridge.java 491178 2006-12-30 06:18:34Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;switch> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGSwitchElementBridge.java 491178 2006-12-30 06:18:34Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGSwitchElementBridge	TokenNameIdentifier	 SVG Switch Element Bridge
extends	TokenNameextends	
SVGGElementBridge	TokenNameIdentifier	 SVGG Element Bridge
{	TokenNameLBRACE	
/** * The child element that was chosen for rendering according to the * test attributes. */	TokenNameCOMMENT_JAVADOC	 The child element that was chosen for rendering according to the test attributes. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
selectedChild	TokenNameIdentifier	 selected Child
;	TokenNameSEMICOLON	
/** * Constructs a new bridge for the &lt;switch> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;switch> element. 
public	TokenNamepublic	
SVGSwitchElementBridge	TokenNameIdentifier	 SVG Switch Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'switch'. */	TokenNameCOMMENT_JAVADOC	 Returns 'switch'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_SWITCH_TAG	TokenNameIdentifier	 SVG  SWITCH  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new instance of this bridge. */	TokenNameCOMMENT_JAVADOC	 Returns a new instance of this bridge. 
public	TokenNamepublic	
Bridge	TokenNameIdentifier	 Bridge
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGSwitchElementBridge	TokenNameIdentifier	 SVG Switch Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>GraphicsNode</tt> according to the specified parameters. * * @param ctx the bridge context to use * @param e the element that describes the graphics node to build * @return a graphics node that represents the specified element */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>GraphicsNode</tt> according to the specified parameters. * @param ctx the bridge context to use @param e the element that describes the graphics node to build @return a graphics node that represents the specified element 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
createGraphicsNode	TokenNameIdentifier	 create Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
refNode	TokenNameIdentifier	 ref Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
GVTBuilder	TokenNameIdentifier	 GVT Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getGVTBuilder	TokenNameIdentifier	 get GVT Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectedChild	TokenNameIdentifier	 selected Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
instanceof	TokenNameinstanceof	
SVGTests	TokenNameIdentifier	 SVG Tests
&&	TokenNameAND_AND	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
matchUserAgent	TokenNameIdentifier	 match User Agent
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectedChild	TokenNameIdentifier	 selected Child
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
refNode	TokenNameIdentifier	 ref Node
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
createGraphicsNode	TokenNameIdentifier	 create Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true as the &lt;switch> element is not a container. */	TokenNameCOMMENT_JAVADOC	 Returns true as the &lt;switch> element is not a container. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isComposite	TokenNameIdentifier	 is Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// BridgeUpdateHandler implementation ////////////////////////////////// 	TokenNameCOMMENT_LINE	BridgeUpdateHandler implementation ////////////////////////////////// 
/** * Disposes this BridgeUpdateHandler and releases all resources. */	TokenNameCOMMENT_JAVADOC	 Disposes this BridgeUpdateHandler and releases all resources. 
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectedChild	TokenNameIdentifier	 selected Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Responds to the insertion of a child element by re-evaluating the * test attributes. */	TokenNameCOMMENT_JAVADOC	 Responds to the insertion of a child element by re-evaluating the test attributes. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleElementAdded	TokenNameIdentifier	 handle Element Added
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
gn	TokenNameIdentifier	 gn
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
childElt	TokenNameIdentifier	 child Elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
childElt	TokenNameIdentifier	 child Elt
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
childElt	TokenNameIdentifier	 child Elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
childElt	TokenNameIdentifier	 child Elt
instanceof	TokenNameinstanceof	
SVGTests	TokenNameIdentifier	 SVG Tests
&&	TokenNameAND_AND	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
matchUserAgent	TokenNameIdentifier	 match User Agent
(	TokenNameLPAREN	
childElt	TokenNameIdentifier	 child Elt
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selectedChild	TokenNameIdentifier	 selected Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
disposeTree	TokenNameIdentifier	 dispose Tree
(	TokenNameLPAREN	
selectedChild	TokenNameIdentifier	 selected Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
selectedChild	TokenNameIdentifier	 selected Child
=	TokenNameEQUAL	
childElt	TokenNameIdentifier	 child Elt
;	TokenNameSEMICOLON	
GVTBuilder	TokenNameIdentifier	 GVT Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getGVTBuilder	TokenNameIdentifier	 get GVT Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
refNode	TokenNameIdentifier	 ref Node
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
childElt	TokenNameIdentifier	 child Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Responds to the removal of a child element by re-evaluating the * test attributes. */	TokenNameCOMMENT_JAVADOC	 Responds to the removal of a child element by re-evaluating the test attributes. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleChildElementRemoved	TokenNameIdentifier	 handle Child Element Removed
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
selectedChild	TokenNameIdentifier	 selected Child
==	TokenNameEQUAL_EQUAL	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
disposeTree	TokenNameIdentifier	 dispose Tree
(	TokenNameLPAREN	
selectedChild	TokenNameIdentifier	 selected Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectedChild	TokenNameIdentifier	 selected Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
refNode	TokenNameIdentifier	 ref Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
GVTBuilder	TokenNameIdentifier	 GVT Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getGVTBuilder	TokenNameIdentifier	 get GVT Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
instanceof	TokenNameinstanceof	
SVGTests	TokenNameIdentifier	 SVG Tests
&&	TokenNameAND_AND	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
matchUserAgent	TokenNameIdentifier	 match User Agent
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refNode	TokenNameIdentifier	 ref Node
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectedChild	TokenNameIdentifier	 selected Child
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
