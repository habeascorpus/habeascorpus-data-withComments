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
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Paint	TokenNameIdentifier	 Paint
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
Point2D	TokenNameIdentifier	 Point2 D
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
SVGContext	TokenNameIdentifier	 SVG Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
LinearGradientPaint	TokenNameIdentifier	 Linear Gradient Paint
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
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
/** * Bridge class for the &lt;linearGradient> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGLinearGradientElementBridge.java 594740 2007-11-14 02:55:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;linearGradient> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGLinearGradientElementBridge.java 594740 2007-11-14 02:55:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGLinearGradientElementBridge	TokenNameIdentifier	 SVG Linear Gradient Element Bridge
extends	TokenNameextends	
AbstractSVGGradientElementBridge	TokenNameIdentifier	 Abstract SVG Gradient Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new SVGLinearGradientElementBridge. */	TokenNameCOMMENT_JAVADOC	 Constructs a new SVGLinearGradientElementBridge. 
public	TokenNamepublic	
SVGLinearGradientElementBridge	TokenNameIdentifier	 SVG Linear Gradient Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'linearGradient'. */	TokenNameCOMMENT_JAVADOC	 Returns 'linearGradient'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_LINEAR_GRADIENT_TAG	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a linear gradient according to the specified parameters. * * @param paintElement the element that defines a Paint * @param paintedElement the element referencing the paint * @param paintedNode the graphics node on which the Paint will be applied * @param spreadMethod the spread method * @param colorSpace the color space (sRGB | LinearRGB) * @param transform the gradient transform * @param colors the colors of the gradient * @param offsets the offsets * @param ctx the bridge context to use */	TokenNameCOMMENT_JAVADOC	 Builds a linear gradient according to the specified parameters. * @param paintElement the element that defines a Paint @param paintedElement the element referencing the paint @param paintedNode the graphics node on which the Paint will be applied @param spreadMethod the spread method @param colorSpace the color space (sRGB | LinearRGB) @param transform the gradient transform @param colors the colors of the gradient @param offsets the offsets @param ctx the bridge context to use 
protected	TokenNameprotected	
Paint	TokenNameIdentifier	 Paint
buildGradient	TokenNameIdentifier	 build Gradient
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
paintedElement	TokenNameIdentifier	 painted Element
,	TokenNameCOMMA	
GraphicsNode	TokenNameIdentifier	 Graphics Node
paintedNode	TokenNameIdentifier	 painted Node
,	TokenNameCOMMA	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
spreadMethod	TokenNameIdentifier	 spread Method
,	TokenNameCOMMA	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
colorSpace	TokenNameIdentifier	 color Space
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
transform	TokenNameIdentifier	 transform
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 'x1' attribute - default is 0% 	TokenNameCOMMENT_LINE	'x1' attribute - default is 0% 
String	TokenNameIdentifier	 String
x1Str	TokenNameIdentifier	 x1 Str
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X1_ATTRIBUTE	TokenNameIdentifier	 SVG  X1  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x1Str	TokenNameIdentifier	 x1 Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x1Str	TokenNameIdentifier	 x1 Str
=	TokenNameEQUAL	
SVG_LINEAR_GRADIENT_X1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  X1  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'y1' attribute - default is 0% 	TokenNameCOMMENT_LINE	'y1' attribute - default is 0% 
String	TokenNameIdentifier	 String
y1Str	TokenNameIdentifier	 y1 Str
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y1_ATTRIBUTE	TokenNameIdentifier	 SVG  Y1  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y1Str	TokenNameIdentifier	 y1 Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
y1Str	TokenNameIdentifier	 y1 Str
=	TokenNameEQUAL	
SVG_LINEAR_GRADIENT_Y1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  Y1  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'x2' attribute - default is 100% 	TokenNameCOMMENT_LINE	'x2' attribute - default is 100% 
String	TokenNameIdentifier	 String
x2Str	TokenNameIdentifier	 x2 Str
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X2_ATTRIBUTE	TokenNameIdentifier	 SVG  X2  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x2Str	TokenNameIdentifier	 x2 Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x2Str	TokenNameIdentifier	 x2 Str
=	TokenNameEQUAL	
SVG_LINEAR_GRADIENT_X2_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  X2  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'y2' attribute - default is 0% 	TokenNameCOMMENT_LINE	'y2' attribute - default is 0% 
String	TokenNameIdentifier	 String
y2Str	TokenNameIdentifier	 y2 Str
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y2_ATTRIBUTE	TokenNameIdentifier	 SVG  Y2  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y2Str	TokenNameIdentifier	 y2 Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
y2Str	TokenNameIdentifier	 y2 Str
=	TokenNameEQUAL	
SVG_LINEAR_GRADIENT_Y2_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  Y2  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'gradientUnits' attribute - default is objectBoundingBox 	TokenNameCOMMENT_LINE	'gradientUnits' attribute - default is objectBoundingBox 
short	TokenNameshort	
coordSystemType	TokenNameIdentifier	 coord System Type
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_GRADIENT_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  GRADIENT  UNITS  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
coordSystemType	TokenNameIdentifier	 coord System Type
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
OBJECT_BOUNDING_BOX	TokenNameIdentifier	 OBJECT  BOUNDING  BOX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
coordSystemType	TokenNameIdentifier	 coord System Type
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
parseCoordinateSystem	TokenNameIdentifier	 parse Coordinate System
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
SVG_GRADIENT_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  GRADIENT  UNITS  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The last paragraph of section 7.11 in SVG 1.1 states that objects 	TokenNameCOMMENT_LINE	The last paragraph of section 7.11 in SVG 1.1 states that objects 
// with zero width or height bounding boxes that use gradients with 	TokenNameCOMMENT_LINE	with zero width or height bounding boxes that use gradients with 
// gradientUnits="objectBoundingBox" must not use the gradient. 	TokenNameCOMMENT_LINE	gradientUnits="objectBoundingBox" must not use the gradient. 
SVGContext	TokenNameIdentifier	 SVG Context
bridge	TokenNameIdentifier	 bridge
=	TokenNameEQUAL	
BridgeContext	TokenNameIdentifier	 Bridge Context
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
paintedElement	TokenNameIdentifier	 painted Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
coordSystemType	TokenNameIdentifier	 coord System Type
==	TokenNameEQUAL_EQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
OBJECT_BOUNDING_BOX	TokenNameIdentifier	 OBJECT  BOUNDING  BOX
&&	TokenNameAND_AND	
bridge	TokenNameIdentifier	 bridge
instanceof	TokenNameinstanceof	
AbstractGraphicsNodeBridge	TokenNameIdentifier	 Abstract Graphics Node Bridge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XXX Make this work for non-AbstractGraphicsNodeBridges, like 	TokenNameCOMMENT_LINE	XXX Make this work for non-AbstractGraphicsNodeBridges, like 
// the various text child bridges. 	TokenNameCOMMENT_LINE	the various text child bridges. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bbox	TokenNameIdentifier	 bbox
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNodeBridge	TokenNameIdentifier	 Abstract Graphics Node Bridge
)	TokenNameRPAREN	
bridge	TokenNameIdentifier	 bridge
)	TokenNameRPAREN	
.	TokenNameDOT	
getBBox	TokenNameIdentifier	 get B Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bbox	TokenNameIdentifier	 bbox
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
bbox	TokenNameIdentifier	 bbox
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
bbox	TokenNameIdentifier	 bbox
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// additional transform to move to objectBoundingBox coordinate system 	TokenNameCOMMENT_LINE	additional transform to move to objectBoundingBox coordinate system 
if	TokenNameif	
(	TokenNameLPAREN	
coordSystemType	TokenNameIdentifier	 coord System Type
==	TokenNameEQUAL_EQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
OBJECT_BOUNDING_BOX	TokenNameIdentifier	 OBJECT  BOUNDING  BOX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
toObjectBBox	TokenNameIdentifier	 to Object B Box
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
,	TokenNameCOMMA	
paintedNode	TokenNameIdentifier	 painted Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UnitProcessor	TokenNameIdentifier	 Unit Processor
.	TokenNameDOT	
Context	TokenNameIdentifier	 Context
uctx	TokenNameIdentifier	 uctx
=	TokenNameEQUAL	
UnitProcessor	TokenNameIdentifier	 Unit Processor
.	TokenNameDOT	
createContext	TokenNameIdentifier	 create Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
paintElement	TokenNameIdentifier	 paint Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertPoint	TokenNameIdentifier	 convert Point
(	TokenNameLPAREN	
x1Str	TokenNameIdentifier	 x1 Str
,	TokenNameCOMMA	
SVG_X1_ATTRIBUTE	TokenNameIdentifier	 SVG  X1  ATTRIBUTE
,	TokenNameCOMMA	
y1Str	TokenNameIdentifier	 y1 Str
,	TokenNameCOMMA	
SVG_Y1_ATTRIBUTE	TokenNameIdentifier	 SVG  Y1  ATTRIBUTE
,	TokenNameCOMMA	
coordSystemType	TokenNameIdentifier	 coord System Type
,	TokenNameCOMMA	
uctx	TokenNameIdentifier	 uctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertPoint	TokenNameIdentifier	 convert Point
(	TokenNameLPAREN	
x2Str	TokenNameIdentifier	 x2 Str
,	TokenNameCOMMA	
SVG_X2_ATTRIBUTE	TokenNameIdentifier	 SVG  X2  ATTRIBUTE
,	TokenNameCOMMA	
y2Str	TokenNameIdentifier	 y2 Str
,	TokenNameCOMMA	
SVG_Y2_ATTRIBUTE	TokenNameIdentifier	 SVG  Y2  ATTRIBUTE
,	TokenNameCOMMA	
coordSystemType	TokenNameIdentifier	 coord System Type
,	TokenNameCOMMA	
uctx	TokenNameIdentifier	 uctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If x1 = x2 and y1 = y2, then the area to be painted will be painted 	TokenNameCOMMENT_LINE	If x1 = x2 and y1 = y2, then the area to be painted will be painted 
// as a single color using the color and opacity of the last gradient 	TokenNameCOMMENT_LINE	as a single color using the color and opacity of the last gradient 
// stop. 	TokenNameCOMMENT_LINE	stop. 
if	TokenNameif	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
colors	TokenNameIdentifier	 colors
[	TokenNameLBRACKET	
colors	TokenNameIdentifier	 colors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LinearGradientPaint	TokenNameIdentifier	 Linear Gradient Paint
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
spreadMethod	TokenNameIdentifier	 spread Method
,	TokenNameCOMMA	
colorSpace	TokenNameIdentifier	 color Space
,	TokenNameCOMMA	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
