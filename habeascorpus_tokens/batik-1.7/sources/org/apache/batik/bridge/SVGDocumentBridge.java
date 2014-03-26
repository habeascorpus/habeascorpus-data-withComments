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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
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
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSEngineEvent	TokenNameIdentifier	 CSS Engine Event
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
AnimatedLiveAttributeValue	TokenNameIdentifier	 Animated Live Attribute Value
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
SVGContext	TokenNameIdentifier	 SVG Context
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
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
GraphicsNode	TokenNameIdentifier	 Graphics Node
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
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
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
Element	TokenNameIdentifier	 Element
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
/** * Bridge class for an SVGDocument node. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGDocumentBridge.java 582434 2007-10-06 02:11:51Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for an SVGDocument node. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGDocumentBridge.java 582434 2007-10-06 02:11:51Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGDocumentBridge	TokenNameIdentifier	 SVG Document Bridge
implements	TokenNameimplements	
DocumentBridge	TokenNameIdentifier	 Document Bridge
,	TokenNameCOMMA	
BridgeUpdateHandler	TokenNameIdentifier	 Bridge Update Handler
,	TokenNameCOMMA	
SVGContext	TokenNameIdentifier	 SVG Context
{	TokenNameLBRACE	
/** * The document node this bridge is associated with. */	TokenNameCOMMENT_JAVADOC	 The document node this bridge is associated with. 
protected	TokenNameprotected	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * The graphics node constructed by this bridge. */	TokenNameCOMMENT_JAVADOC	 The graphics node constructed by this bridge. 
protected	TokenNameprotected	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
/** * The bridge context. */	TokenNameCOMMENT_JAVADOC	 The bridge context. 
protected	TokenNameprotected	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
/** * Constructs a new bridge the SVG document. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge the SVG document. 
public	TokenNamepublic	
SVGDocumentBridge	TokenNameIdentifier	 SVG Document Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Bridge //////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	Bridge //////////////////////////////////////////////////////////////// 
/** * Returns the namespace URI of the element this <tt>Bridge</tt> is * dedicated to. Returns <code>null</code>, as a Document node has no * namespace URI. */	TokenNameCOMMENT_JAVADOC	 Returns the namespace URI of the element this <tt>Bridge</tt> is dedicated to. Returns <code>null</code>, as a Document node has no namespace URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local name of the element this <tt>Bridge</tt> is dedicated * to. Returns <code>null</code>, as a Document node has no local name. */	TokenNameCOMMENT_JAVADOC	 Returns the local name of the element this <tt>Bridge</tt> is dedicated to. Returns <code>null</code>, as a Document node has no local name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
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
SVGDocumentBridge	TokenNameIdentifier	 SVG Document Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DocumentBridge //////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	DocumentBridge //////////////////////////////////////////////////////// 
/** * Creates a <tt>GraphicsNode</tt> according to the specified parameters. * This is called before children have been added to the * returned GraphicsNode (obviously since you construct and return it). * * @param ctx the bridge context to use * @param doc the document node that describes the graphics node to build * @return a graphics node that represents the specified document node */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>GraphicsNode</tt> according to the specified parameters. This is called before children have been added to the returned GraphicsNode (obviously since you construct and return it). * @param ctx the bridge context to use @param doc the document node that describes the graphics node to build @return a graphics node that represents the specified document node 
public	TokenNamepublic	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
createGraphicsNode	TokenNameIdentifier	 create Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
new	TokenNamenew	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
setSVGContext	TokenNameIdentifier	 set SVG Context
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds using the specified BridgeContext and element, the * specified graphics node. This is called after all the children * of the node have been constructed and added, so it is safe to * do work that depends on being able to see your children nodes * in this method. * * @param ctx the bridge context to use * @param doc the document node that describes the graphics node to build * @param node the graphics node to build */	TokenNameCOMMENT_JAVADOC	 Builds using the specified BridgeContext and element, the specified graphics node. This is called after all the children of the node have been constructed and added, so it is safe to do work that depends on being able to see your children nodes in this method. * @param ctx the bridge context to use @param doc the document node that describes the graphics node to build @param node the graphics node to build 
public	TokenNamepublic	
void	TokenNamevoid	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
isDynamic	TokenNameIdentifier	 is Dynamic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
bind	TokenNameIdentifier	 bind
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// BridgeUpdateHandler /////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	BridgeUpdateHandler /////////////////////////////////////////////////// 
/** * Invoked when an MutationEvent of type 'DOMAttrModified' is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an MutationEvent of type 'DOMAttrModified' is fired. 
public	TokenNamepublic	
void	TokenNamevoid	
handleDOMAttrModifiedEvent	TokenNameIdentifier	 handle DOM Attr Modified Event
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
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
Element	TokenNameIdentifier	 Element
childElt	TokenNameIdentifier	 child Elt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
// There can only be one document element. 	TokenNameCOMMENT_LINE	There can only be one document element. 
node	TokenNameIdentifier	 node
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Invoked when an MutationEvent of type 'DOMNodeRemoved' is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an MutationEvent of type 'DOMNodeRemoved' is fired. 
public	TokenNamepublic	
void	TokenNamevoid	
handleDOMNodeRemovedEvent	TokenNameIdentifier	 handle DOM Node Removed Event
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when an MutationEvent of type 'DOMCharacterDataModified' * is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an MutationEvent of type 'DOMCharacterDataModified' is fired. 
public	TokenNamepublic	
void	TokenNamevoid	
handleDOMCharacterDataModified	TokenNameIdentifier	 handle DOM Character Data Modified
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when an CSSEngineEvent is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an CSSEngineEvent is fired. 
public	TokenNamepublic	
void	TokenNamevoid	
handleCSSEngineEvent	TokenNameIdentifier	 handle CSS Engine Event
(	TokenNameLPAREN	
CSSEngineEvent	TokenNameIdentifier	 CSS Engine Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when the animated value of an animated attribute has changed. */	TokenNameCOMMENT_JAVADOC	 Invoked when the animated value of an animated attribute has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
handleAnimatedAttributeChanged	TokenNameIdentifier	 handle Animated Attribute Changed
(	TokenNameLPAREN	
AnimatedLiveAttributeValue	TokenNameIdentifier	 Animated Live Attribute Value
alav	TokenNameIdentifier	 alav
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when an 'other' animation value has changed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an 'other' animation value has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
handleOtherAnimationChanged	TokenNameIdentifier	 handle Other Animation Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Disposes this BridgeUpdateHandler and releases all resources. */	TokenNameCOMMENT_JAVADOC	 Disposes this BridgeUpdateHandler and releases all resources. 
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
.	TokenNameDOT	
setSVGContext	TokenNameIdentifier	 set SVG Context
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
unbind	TokenNameIdentifier	 unbind
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// SVGContext ////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVGContext ////////////////////////////////////////////////////////// 
/** * Returns the size of a px CSS unit in millimeters. */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. 
public	TokenNamepublic	
float	TokenNamefloat	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the size of a px CSS unit in millimeters. * This will be removed after next release. * @see #getPixelUnitToMillimeter() */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. This will be removed after next release. @see #getPixelUnitToMillimeter() 
public	TokenNamepublic	
float	TokenNamefloat	
getPixelToMM	TokenNameIdentifier	 get Pixel To MM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBBox	TokenNameIdentifier	 get B Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getScreenTransform	TokenNameIdentifier	 get Screen Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScreenTransform	TokenNameIdentifier	 set Screen Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getCTM	TokenNameIdentifier	 get CTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getGlobalTransform	TokenNameIdentifier	 get Global Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getViewportWidth	TokenNameIdentifier	 get Viewport Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getViewportHeight	TokenNameIdentifier	 get Viewport Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getFontSize	TokenNameIdentifier	 get Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
