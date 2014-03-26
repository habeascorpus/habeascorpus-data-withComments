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
Shape	TokenNameIdentifier	 Shape
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
RoundRectangle2D	TokenNameIdentifier	 Round Rectangle2 D
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
SVGOMRectElement	TokenNameIdentifier	 SVGOM Rect Element
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
/** * Bridge class for the &lt;rect> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGRectElementBridge.java 527382 2007-04-11 04:31:58Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;rect> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGRectElementBridge.java 527382 2007-04-11 04:31:58Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGRectElementBridge	TokenNameIdentifier	 SVG Rect Element Bridge
extends	TokenNameextends	
SVGShapeElementBridge	TokenNameIdentifier	 SVG Shape Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;rect> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;rect> element. 
public	TokenNamepublic	
SVGRectElementBridge	TokenNameIdentifier	 SVG Rect Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'rect'. */	TokenNameCOMMENT_JAVADOC	 Returns 'rect'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_RECT_TAG	TokenNameIdentifier	 SVG  RECT  TAG
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
SVGRectElementBridge	TokenNameIdentifier	 SVG Rect Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a rectangle according to the specified parameters. * * @param ctx the bridge context to use * @param e the element that describes a rect element * @param shapeNode the shape node to initialize */	TokenNameCOMMENT_JAVADOC	 Constructs a rectangle according to the specified parameters. * @param ctx the bridge context to use @param e the element that describes a rect element @param shapeNode the shape node to initialize 
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
SVGOMRectElement	TokenNameIdentifier	 SVGOM Rect Element
re	TokenNameIdentifier	 re
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMRectElement	TokenNameIdentifier	 SVGOM Rect Element
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
// 'x' attribute - default is 0 	TokenNameCOMMENT_LINE	'x' attribute - default is 0 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
_x	TokenNameIdentifier	 x
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'y' attribute - default is 0 	TokenNameCOMMENT_LINE	'y' attribute - default is 0 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
_y	TokenNameIdentifier	 y
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'width' attribute - required 	TokenNameCOMMENT_LINE	'width' attribute - required 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
_width	TokenNameIdentifier	 width
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'height' attribute - required 	TokenNameCOMMENT_LINE	'height' attribute - required 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
_height	TokenNameIdentifier	 height
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'rx' attribute - default is 0 	TokenNameCOMMENT_LINE	'rx' attribute - default is 0 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_rx	TokenNameIdentifier	 rx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
getRx	TokenNameIdentifier	 get Rx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
rx	TokenNameIdentifier	 rx
=	TokenNameEQUAL	
_rx	TokenNameIdentifier	 rx
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
>	TokenNameGREATER	
w	TokenNameIdentifier	 w
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rx	TokenNameIdentifier	 rx
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'ry' attribute - default is rx 	TokenNameCOMMENT_LINE	'ry' attribute - default is rx 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_ry	TokenNameIdentifier	 ry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
getRy	TokenNameIdentifier	 get Ry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
ry	TokenNameIdentifier	 ry
=	TokenNameEQUAL	
_ry	TokenNameIdentifier	 ry
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ry	TokenNameIdentifier	 ry
>	TokenNameGREATER	
h	TokenNameIdentifier	 h
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ry	TokenNameIdentifier	 ry
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ry	TokenNameIdentifier	 ry
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
new	TokenNamenew	
RoundRectangle2D	TokenNameIdentifier	 Round Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
rx	TokenNameIdentifier	 rx
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ry	TokenNameIdentifier	 ry
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
setShape	TokenNameIdentifier	 set Shape
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
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
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
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
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r2d	TokenNameIdentifier	 r2d
=	TokenNameEQUAL	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
createShapePainter	TokenNameIdentifier	 create Shape Painter
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
