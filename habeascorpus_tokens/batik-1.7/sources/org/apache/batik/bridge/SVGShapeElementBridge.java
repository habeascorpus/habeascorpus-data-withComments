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
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
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
ShapeNode	TokenNameIdentifier	 Shape Node
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
ShapePainter	TokenNameIdentifier	 Shape Painter
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
/** * The base bridge class for shapes. Subclasses bridge <tt>ShapeNode</tt>. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGShapeElementBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 The base bridge class for shapes. Subclasses bridge <tt>ShapeNode</tt>. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGShapeElementBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SVGShapeElementBridge	TokenNameIdentifier	 SVG Shape Element Bridge
extends	TokenNameextends	
AbstractGraphicsNodeBridge	TokenNameIdentifier	 Abstract Graphics Node Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for SVG shapes. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for SVG shapes. 
protected	TokenNameprotected	
SVGShapeElementBridge	TokenNameIdentifier	 SVG Shape Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a graphics node using the specified BridgeContext and * for the specified element. * * @param ctx the bridge context to use * @param e the element that describes the graphics node to build * @return a graphics node that represents the specified element */	TokenNameCOMMENT_JAVADOC	 Creates a graphics node using the specified BridgeContext and for the specified element. * @param ctx the bridge context to use @param e the element that describes the graphics node to build @return a graphics node that represents the specified element 
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
ShapeNode	TokenNameIdentifier	 Shape Node
shapeNode	TokenNameIdentifier	 shape Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ShapeNode	TokenNameIdentifier	 Shape Node
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
shapeNode	TokenNameIdentifier	 shape Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
associateSVGContext	TokenNameIdentifier	 associate SVG Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// delegates to subclasses the shape construction 	TokenNameCOMMENT_LINE	delegates to subclasses the shape construction 
buildShape	TokenNameIdentifier	 build Shape
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'shape-rendering' and 'color-rendering' 	TokenNameCOMMENT_LINE	'shape-rendering' and 'color-rendering' 
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
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
convertShapeRendering	TokenNameIdentifier	 convert Shape Rendering
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
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
setRenderingHints	TokenNameIdentifier	 set Rendering Hints
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
shapeNode	TokenNameIdentifier	 shape Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>ShapeNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>ShapeNode</tt>. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
instantiateGraphicsNode	TokenNameIdentifier	 instantiate Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ShapeNode	TokenNameIdentifier	 Shape Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds using the specified BridgeContext and element, the * specified graphics node. * * @param ctx the bridge context to use * @param e the element that describes the graphics node to build * @param node the graphics node to build */	TokenNameCOMMENT_JAVADOC	 Builds using the specified BridgeContext and element, the specified graphics node. * @param ctx the bridge context to use @param e the element that describes the graphics node to build @param node the graphics node to build 
public	TokenNamepublic	
void	TokenNamevoid	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ShapeNode	TokenNameIdentifier	 Shape Node
shapeNode	TokenNameIdentifier	 shape Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ShapeNode	TokenNameIdentifier	 Shape Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
setShapePainter	TokenNameIdentifier	 set Shape Painter
(	TokenNameLPAREN	
createShapePainter	TokenNameIdentifier	 create Shape Painter
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
buildGraphicsNode	TokenNameIdentifier	 build Graphics Node
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the shape painter associated to the specified element. * This implementation creates a shape painter considering the * various fill and stroke properties. * * @param ctx the bridge context to use * @param e the element that describes the shape painter to use * @param shapeNode the shape node that is interested in its shape painter */	TokenNameCOMMENT_JAVADOC	 Creates the shape painter associated to the specified element. This implementation creates a shape painter considering the various fill and stroke properties. * @param ctx the bridge context to use @param e the element that describes the shape painter to use @param shapeNode the shape node that is interested in its shape painter 
protected	TokenNameprotected	
ShapePainter	TokenNameIdentifier	 Shape Painter
createShapePainter	TokenNameIdentifier	 create Shape Painter
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ShapeNode	TokenNameIdentifier	 Shape Node
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 'fill' 	TokenNameCOMMENT_LINE	'fill' 
// 'fill-opacity' 	TokenNameCOMMENT_LINE	'fill-opacity' 
// 'stroke' 	TokenNameCOMMENT_LINE	'stroke' 
// 'stroke-opacity', 	TokenNameCOMMENT_LINE	'stroke-opacity', 
// 'stroke-width' 	TokenNameCOMMENT_LINE	'stroke-width' 
// 'stroke-linecap' 	TokenNameCOMMENT_LINE	'stroke-linecap' 
// 'stroke-linejoin' 	TokenNameCOMMENT_LINE	'stroke-linejoin' 
// 'stroke-miterlimit' 	TokenNameCOMMENT_LINE	'stroke-miterlimit' 
// 'stroke-dasharray' 	TokenNameCOMMENT_LINE	'stroke-dasharray' 
// 'stroke-dashoffset' 	TokenNameCOMMENT_LINE	'stroke-dashoffset' 
return	TokenNamereturn	
PaintServer	TokenNameIdentifier	 Paint Server
.	TokenNameDOT	
convertFillAndStroke	TokenNameIdentifier	 convert Fill And Stroke
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the specified ShapeNode's shape defined by the * specified Element and using the specified bridge context. * * @param ctx the bridge context to use * @param e the element that describes the shape node to build * @param node the shape node to initialize */	TokenNameCOMMENT_JAVADOC	 Initializes the specified ShapeNode's shape defined by the specified Element and using the specified bridge context. * @param ctx the bridge context to use @param e the element that describes the shape node to build @param node the shape node to initialize 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
buildShape	TokenNameIdentifier	 build Shape
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ShapeNode	TokenNameIdentifier	 Shape Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns false as shapes are not a container. */	TokenNameCOMMENT_JAVADOC	 Returns false as shapes are not a container. 
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
/** * Invoked when the geometry of an graphical element has changed. */	TokenNameCOMMENT_JAVADOC	 Invoked when the geometry of an graphical element has changed. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleGeometryChanged	TokenNameIdentifier	 handle Geometry Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleGeometryChanged	TokenNameIdentifier	 handle Geometry Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ShapeNode	TokenNameIdentifier	 Shape Node
shapeNode	TokenNameIdentifier	 shape Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ShapeNode	TokenNameIdentifier	 Shape Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
setShapePainter	TokenNameIdentifier	 set Shape Painter
(	TokenNameLPAREN	
createShapePainter	TokenNameIdentifier	 create Shape Painter
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This flag bit indicates if a new shape painter has already been created. * Avoid creating one ShapePainter per CSS property change */	TokenNameCOMMENT_JAVADOC	 This flag bit indicates if a new shape painter has already been created. Avoid creating one ShapePainter per CSS property change 
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasNewShapePainter	TokenNameIdentifier	 has New Shape Painter
;	TokenNameSEMICOLON	
/** * Invoked when CSS properties have changed on an element. * * @param evt the CSSEngine event that describes the update */	TokenNameCOMMENT_JAVADOC	 Invoked when CSS properties have changed on an element. * @param evt the CSSEngine event that describes the update 
public	TokenNamepublic	
void	TokenNamevoid	
handleCSSEngineEvent	TokenNameIdentifier	 handle CSS Engine Event
(	TokenNameLPAREN	
CSSEngineEvent	TokenNameIdentifier	 CSS Engine Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasNewShapePainter	TokenNameIdentifier	 has New Shape Painter
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
handleCSSEngineEvent	TokenNameIdentifier	 handle CSS Engine Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked for each CSS property that has changed. */	TokenNameCOMMENT_JAVADOC	 Invoked for each CSS property that has changed. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleCSSPropertyChanged	TokenNameIdentifier	 handle CSS Property Changed
(	TokenNameLPAREN	
int	TokenNameint	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
FILL_INDEX	TokenNameIdentifier	 FILL  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
FILL_OPACITY_INDEX	TokenNameIdentifier	 FILL  OPACITY  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STROKE_INDEX	TokenNameIdentifier	 STROKE  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STROKE_OPACITY_INDEX	TokenNameIdentifier	 STROKE  OPACITY  INDEX
:	TokenNameCOLON	
// Opportunity to just 'update' the existing shape painters... 	TokenNameCOMMENT_LINE	Opportunity to just 'update' the existing shape painters... 
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STROKE_WIDTH_INDEX	TokenNameIdentifier	 STROKE  WIDTH  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STROKE_LINECAP_INDEX	TokenNameIdentifier	 STROKE  LINECAP  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STROKE_LINEJOIN_INDEX	TokenNameIdentifier	 STROKE  LINEJOIN  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STROKE_MITERLIMIT_INDEX	TokenNameIdentifier	 STROKE  MITERLIMIT  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STROKE_DASHARRAY_INDEX	TokenNameIdentifier	 STROKE  DASHARRAY  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STROKE_DASHOFFSET_INDEX	TokenNameIdentifier	 STROKE  DASHOFFSET  INDEX
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasNewShapePainter	TokenNameIdentifier	 has New Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasNewShapePainter	TokenNameIdentifier	 has New Shape Painter
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
ShapeNode	TokenNameIdentifier	 Shape Node
shapeNode	TokenNameIdentifier	 shape Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ShapeNode	TokenNameIdentifier	 Shape Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
setShapePainter	TokenNameIdentifier	 set Shape Painter
(	TokenNameLPAREN	
createShapePainter	TokenNameIdentifier	 create Shape Painter
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
SHAPE_RENDERING_INDEX	TokenNameIdentifier	 SHAPE  RENDERING  INDEX
:	TokenNameCOLON	
{	TokenNameLBRACE	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
convertShapeRendering	TokenNameIdentifier	 convert Shape Rendering
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
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setRenderingHints	TokenNameIdentifier	 set Rendering Hints
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
COLOR_RENDERING_INDEX	TokenNameIdentifier	 COLOR  RENDERING  INDEX
:	TokenNameCOLON	
{	TokenNameLBRACE	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setRenderingHints	TokenNameIdentifier	 set Rendering Hints
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
handleCSSPropertyChanged	TokenNameIdentifier	 handle CSS Property Changed
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
