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
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
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
SVGOMCircleElement	TokenNameIdentifier	 SVGOM Circle Element
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
/** * Bridge class for the &lt;circle> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGCircleElementBridge.java 527382 2007-04-11 04:31:58Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;circle> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGCircleElementBridge.java 527382 2007-04-11 04:31:58Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGCircleElementBridge	TokenNameIdentifier	 SVG Circle Element Bridge
extends	TokenNameextends	
SVGShapeElementBridge	TokenNameIdentifier	 SVG Shape Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;circle> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;circle> element. 
public	TokenNamepublic	
SVGCircleElementBridge	TokenNameIdentifier	 SVG Circle Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'circle'. */	TokenNameCOMMENT_JAVADOC	 Returns 'circle'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_CIRCLE_TAG	TokenNameIdentifier	 SVG  CIRCLE  TAG
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
SVGCircleElementBridge	TokenNameIdentifier	 SVG Circle Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a circle according to the specified parameters. * * @param ctx the bridge context to use * @param e the element that describes a rect element * @param shapeNode the shape node to initialize */	TokenNameCOMMENT_JAVADOC	 Constructs a circle according to the specified parameters. * @param ctx the bridge context to use @param e the element that describes a rect element @param shapeNode the shape node to initialize 
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
SVGOMCircleElement	TokenNameIdentifier	 SVGOM Circle Element
ce	TokenNameIdentifier	 ce
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMCircleElement	TokenNameIdentifier	 SVGOM Circle Element
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
// 'cx' attribute - default is 0 	TokenNameCOMMENT_LINE	'cx' attribute - default is 0 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
ce	TokenNameIdentifier	 ce
.	TokenNameDOT	
getCx	TokenNameIdentifier	 get Cx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
_cx	TokenNameIdentifier	 cx
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'cy' attribute - default is 0 	TokenNameCOMMENT_LINE	'cy' attribute - default is 0 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
ce	TokenNameIdentifier	 ce
.	TokenNameDOT	
getCy	TokenNameIdentifier	 get Cy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
_cy	TokenNameIdentifier	 cy
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'r' attribute - required 	TokenNameCOMMENT_LINE	'r' attribute - required 
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
_r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
ce	TokenNameIdentifier	 ce
.	TokenNameDOT	
getR	TokenNameIdentifier	 get R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
_r	TokenNameIdentifier	 r
.	TokenNameDOT	
getCheckedValue	TokenNameIdentifier	 get Checked Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
cx	TokenNameIdentifier	 cx
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
cy	TokenNameIdentifier	 cy
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
float	TokenNamefloat	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
setShape	TokenNameIdentifier	 set Shape
(	TokenNameLPAREN	
new	TokenNamenew	
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
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
SVG_CX_ATTRIBUTE	TokenNameIdentifier	 SVG  CX  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_CY_ATTRIBUTE	TokenNameIdentifier	 SVG  CY  ATTRIBUTE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_R_ATTRIBUTE	TokenNameIdentifier	 SVG  R  ATTRIBUTE
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
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r2d	TokenNameIdentifier	 r2d
=	TokenNameEQUAL	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
