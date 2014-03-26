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
Line2D	TokenNameIdentifier	 Line2 D
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
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
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
LiveAttributeException	TokenNameIdentifier	 Live Attribute Exception
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
SVGOMLineElement	TokenNameIdentifier	 SVGOM Line Element
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
/** * Bridge class for the &lt;line> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGLineElementBridge.java 527382 2007-04-11 04:31:58Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;line> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGLineElementBridge.java 527382 2007-04-11 04:31:58Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGLineElementBridge	TokenNameIdentifier	 SVG Line Element Bridge
extends	TokenNameextends	
SVGDecoratedShapeElementBridge	TokenNameIdentifier	 SVG Decorated Shape Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;line> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;line> element. 
public	TokenNamepublic	
SVGLineElementBridge	TokenNameIdentifier	 SVG Line Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'line'. */	TokenNameCOMMENT_JAVADOC	 Returns 'line'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_LINE_TAG	TokenNameIdentifier	 SVG  LINE  TAG
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
SVGLineElementBridge	TokenNameIdentifier	 SVG Line Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the shape painter associated to the specified element. * This implementation creates a shape painter considering the * various fill and stroke properties. * * @param ctx the bridge context to use * @param e the element that describes the shape painter to use * @param shapeNode the shape node that is interested in its shape painter */	TokenNameCOMMENT_JAVADOC	 Creates the shape painter associated to the specified element. This implementation creates a shape painter considering the various fill and stroke properties. * @param ctx the bridge context to use @param e the element that describes the shape painter to use @param shapeNode the shape node that is interested in its shape painter 
protected	TokenNameprotected	
ShapePainter	TokenNameIdentifier	 Shape Painter
createFillStrokePainter	TokenNameIdentifier	 create Fill Stroke Painter
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
// 'fill' - ignored 	TokenNameCOMMENT_LINE	'fill' - ignored 
// 'fill-opacity' - ignored 	TokenNameCOMMENT_LINE	'fill-opacity' - ignored 
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
convertStrokePainter	TokenNameIdentifier	 convert Stroke Painter
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a line according to the specified parameters. * * @param ctx the bridge context to use * @param e the element that describes a rect element * @param shapeNode the shape node to initialize */	TokenNameCOMMENT_JAVADOC	 Constructs a line according to the specified parameters. * @param ctx the bridge context to use @param e the element that describes a rect element @param shapeNode the shape node to initialize 
protected	TokenNameprotected	
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
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SVGOMLineElement	TokenNameIdentifier	 SVGOM Line Element
le	TokenNameIdentifier	 le
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMLineElement	TokenNameIdentifier	 SVGOM Line Element
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
// 'x1' attribute - default is 0 	TokenNameCOMMENT_LINE	'x1' attribute - default is 0 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getX1	TokenNameIdentifier	 get X1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
_x1	TokenNameIdentifier	 x1
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'y1' attribute - default is 0 	TokenNameCOMMENT_LINE	'y1' attribute - default is 0 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getY1	TokenNameIdentifier	 get Y1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
_y1	TokenNameIdentifier	 y1
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'x2' attribute - default is 0 	TokenNameCOMMENT_LINE	'x2' attribute - default is 0 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getX2	TokenNameIdentifier	 get X2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
_x2	TokenNameIdentifier	 x2
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'y2' attribute - default is 0 	TokenNameCOMMENT_LINE	'y2' attribute - default is 0 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
le	TokenNameIdentifier	 le
.	TokenNameDOT	
getY2	TokenNameIdentifier	 get Y2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
_y2	TokenNameIdentifier	 y2
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
setShape	TokenNameIdentifier	 set Shape
(	TokenNameLPAREN	
new	TokenNamenew	
Line2D	TokenNameIdentifier	 Line2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
LiveAttributeException	TokenNameIdentifier	 Live Attribute Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// BridgeUpdateHandler implementation ////////////////////////////////// 	TokenNameCOMMENT_LINE	BridgeUpdateHandler implementation ////////////////////////////////// 
/** * Invoked when the animated value of an animatable attribute has changed. */	TokenNameCOMMENT_JAVADOC	 Invoked when the animated value of an animatable attribute has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
handleAnimatedAttributeChanged	TokenNameIdentifier	 handle Animated Attribute Changed
(	TokenNameLPAREN	
AnimatedLiveAttributeValue	TokenNameIdentifier	 Animated Live Attribute Value
alav	TokenNameIdentifier	 alav
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
alav	TokenNameIdentifier	 alav
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
=	TokenNameEQUAL	
alav	TokenNameIdentifier	 alav
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_X1_ATTRIBUTE	TokenNameIdentifier	 SVG  X1  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_Y1_ATTRIBUTE	TokenNameIdentifier	 SVG  Y1  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_X2_ATTRIBUTE	TokenNameIdentifier	 SVG  X2  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_Y2_ATTRIBUTE	TokenNameIdentifier	 SVG  Y2  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildShape	TokenNameIdentifier	 build Shape
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ShapeNode	TokenNameIdentifier	 Shape Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handleGeometryChanged	TokenNameIdentifier	 handle Geometry Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleAnimatedAttributeChanged	TokenNameIdentifier	 handle Animated Attribute Changed
(	TokenNameLPAREN	
alav	TokenNameIdentifier	 alav
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
