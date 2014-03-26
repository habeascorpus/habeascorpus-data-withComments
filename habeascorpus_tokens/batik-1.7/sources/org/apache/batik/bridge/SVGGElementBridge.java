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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
MutationEvent	TokenNameIdentifier	 Mutation Event
;	TokenNameSEMICOLON	
/** * Bridge class for the &lt;g> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGGElementBridge.java 491178 2006-12-30 06:18:34Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;g> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGGElementBridge.java 491178 2006-12-30 06:18:34Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGGElementBridge	TokenNameIdentifier	 SVGG Element Bridge
extends	TokenNameextends	
AbstractGraphicsNodeBridge	TokenNameIdentifier	 Abstract Graphics Node Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;g> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;g> element. 
public	TokenNamepublic	
SVGGElementBridge	TokenNameIdentifier	 SVGG Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'g'. */	TokenNameCOMMENT_JAVADOC	 Returns 'g'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
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
SVGGElementBridge	TokenNameIdentifier	 SVGG Element Bridge
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
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
gn	TokenNameIdentifier	 gn
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
gn	TokenNameIdentifier	 gn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
associateSVGContext	TokenNameIdentifier	 associate SVG Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'color-rendering' 	TokenNameCOMMENT_LINE	'color-rendering' 
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
convertColorRendering	TokenNameIdentifier	 convert Color Rendering
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
setRenderingHints	TokenNameIdentifier	 set Rendering Hints
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'enable-background' 	TokenNameCOMMENT_LINE	'enable-background' 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
convertEnableBackground	TokenNameIdentifier	 convert Enable Background
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
setBackgroundEnable	TokenNameIdentifier	 set Background Enable
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>CompositeGraphicsNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>CompositeGraphicsNode</tt>. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
instantiateGraphicsNode	TokenNameIdentifier	 instantiate Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true as the &lt;g> element is a container. */	TokenNameCOMMENT_JAVADOC	 Returns true as the &lt;g> element is a container. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isComposite	TokenNameIdentifier	 is Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// BridgeUpdateHandler implementation ////////////////////////////////// 	TokenNameCOMMENT_LINE	BridgeUpdateHandler implementation ////////////////////////////////// 
/** * Invoked when an MutationEvent of type 'DOMNodeInserted' is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an MutationEvent of type 'DOMNodeInserted' is fired. 
public	TokenNamepublic	
void	TokenNamevoid	
handleDOMNodeInsertedEvent	TokenNameIdentifier	 handle DOM Node Inserted Event
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleElementAdded	TokenNameIdentifier	 handle Element Added
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleDOMNodeInsertedEvent	TokenNameIdentifier	 handle DOM Node Inserted Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Invoked when an MutationEvent of type 'DOMNodeInserted' is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an MutationEvent of type 'DOMNodeInserted' is fired. 
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
// build the graphics node 	TokenNameCOMMENT_LINE	build the graphics node 
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
childNode	TokenNameIdentifier	 child Node
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
childNode	TokenNameIdentifier	 child Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// the added element is not a graphic element 	TokenNameCOMMENT_LINE	the added element is not a graphic element 
}	TokenNameRBRACE	
// Find the index where the GraphicsNode should be added 	TokenNameCOMMENT_LINE	Find the index where the GraphicsNode should be added 
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
childElt	TokenNameIdentifier	 child Elt
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
pse	TokenNameIdentifier	 pse
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
ps	TokenNameIdentifier	 ps
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
psgn	TokenNameIdentifier	 psgn
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getGraphicsNode	TokenNameIdentifier	 get Graphics Node
(	TokenNameLPAREN	
pse	TokenNameIdentifier	 pse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
psgn	TokenNameIdentifier	 psgn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
psgn	TokenNameIdentifier	 psgn
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In some cases the GN linked is 	TokenNameCOMMENT_LINE	In some cases the GN linked is 
// a child (in particular for images). 	TokenNameCOMMENT_LINE	a child (in particular for images). 
psgn	TokenNameIdentifier	 psgn
=	TokenNameEQUAL	
psgn	TokenNameIdentifier	 psgn
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
psgn	TokenNameIdentifier	 psgn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
psgn	TokenNameIdentifier	 psgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insert after prevSibling, if 	TokenNameCOMMENT_LINE	insert after prevSibling, if 
// it was -1 this becomes 0 (first slot) 	TokenNameCOMMENT_LINE	it was -1 this becomes 0 (first slot) 
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
