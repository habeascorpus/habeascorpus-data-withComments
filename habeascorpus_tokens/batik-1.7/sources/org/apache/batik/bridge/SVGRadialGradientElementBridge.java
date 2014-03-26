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
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
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
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
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
/** * Bridge class for the &lt;radialGradient> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGRadialGradientElementBridge.java 594776 2007-11-14 05:34:02Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;radialGradient> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGRadialGradientElementBridge.java 594776 2007-11-14 05:34:02Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGRadialGradientElementBridge	TokenNameIdentifier	 SVG Radial Gradient Element Bridge
extends	TokenNameextends	
AbstractSVGGradientElementBridge	TokenNameIdentifier	 Abstract SVG Gradient Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new SVGRadialGradientElementBridge. */	TokenNameCOMMENT_JAVADOC	 Constructs a new SVGRadialGradientElementBridge. 
public	TokenNamepublic	
SVGRadialGradientElementBridge	TokenNameIdentifier	 SVG Radial Gradient Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'radialGradient'. */	TokenNameCOMMENT_JAVADOC	 Returns 'radialGradient'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_RADIAL_GRADIENT_TAG	TokenNameIdentifier	 SVG  RADIAL  GRADIENT  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a radial gradient according to the specified parameters. * * @param paintElement the element that defines a Paint * @param paintedElement the element referencing the paint * @param paintedNode the graphics node on which the Paint will be applied * @param spreadMethod the spread method * @param colorSpace the color space (sRGB | LinearRGB) * @param transform the gradient transform * @param colors the colors of the gradient * @param offsets the offsets * @param ctx the bridge context to use */	TokenNameCOMMENT_JAVADOC	 Builds a radial gradient according to the specified parameters. * @param paintElement the element that defines a Paint @param paintedElement the element referencing the paint @param paintedNode the graphics node on which the Paint will be applied @param spreadMethod the spread method @param colorSpace the color space (sRGB | LinearRGB) @param transform the gradient transform @param colors the colors of the gradient @param offsets the offsets @param ctx the bridge context to use 
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
// 'cx' attribute - default is 50% 	TokenNameCOMMENT_LINE	'cx' attribute - default is 50% 
String	TokenNameIdentifier	 String
cxStr	TokenNameIdentifier	 cx Str
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CX_ATTRIBUTE	TokenNameIdentifier	 SVG  CX  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cxStr	TokenNameIdentifier	 cx Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cxStr	TokenNameIdentifier	 cx Str
=	TokenNameEQUAL	
SVG_RADIAL_GRADIENT_CX_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RADIAL  GRADIENT  CX  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'cy' attribute - default is 50% 	TokenNameCOMMENT_LINE	'cy' attribute - default is 50% 
String	TokenNameIdentifier	 String
cyStr	TokenNameIdentifier	 cy Str
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CY_ATTRIBUTE	TokenNameIdentifier	 SVG  CY  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cyStr	TokenNameIdentifier	 cy Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cyStr	TokenNameIdentifier	 cy Str
=	TokenNameEQUAL	
SVG_RADIAL_GRADIENT_CY_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RADIAL  GRADIENT  CY  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'r' attribute - default is 50% 	TokenNameCOMMENT_LINE	'r' attribute - default is 50% 
String	TokenNameIdentifier	 String
rStr	TokenNameIdentifier	 r Str
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_R_ATTRIBUTE	TokenNameIdentifier	 SVG  R  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rStr	TokenNameIdentifier	 r Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rStr	TokenNameIdentifier	 r Str
=	TokenNameEQUAL	
SVG_RADIAL_GRADIENT_R_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RADIAL  GRADIENT  R  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'fx' attribute - default is same as cx 	TokenNameCOMMENT_LINE	'fx' attribute - default is same as cx 
String	TokenNameIdentifier	 String
fxStr	TokenNameIdentifier	 fx Str
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FX_ATTRIBUTE	TokenNameIdentifier	 SVG  FX  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fxStr	TokenNameIdentifier	 fx Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fxStr	TokenNameIdentifier	 fx Str
=	TokenNameEQUAL	
cxStr	TokenNameIdentifier	 cx Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'fy' attribute - default is same as cy 	TokenNameCOMMENT_LINE	'fy' attribute - default is same as cy 
String	TokenNameIdentifier	 String
fyStr	TokenNameIdentifier	 fy Str
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
getChainableAttributeNS	TokenNameIdentifier	 get Chainable Attribute NS
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FY_ATTRIBUTE	TokenNameIdentifier	 SVG  FY  ATTRIBUTE
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fyStr	TokenNameIdentifier	 fy Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fyStr	TokenNameIdentifier	 fy Str
=	TokenNameEQUAL	
cyStr	TokenNameIdentifier	 cy Str
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
float	TokenNamefloat	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertLength	TokenNameIdentifier	 convert Length
(	TokenNameLPAREN	
rStr	TokenNameIdentifier	 r Str
,	TokenNameCOMMA	
SVG_R_ATTRIBUTE	TokenNameIdentifier	 SVG  R  ATTRIBUTE
,	TokenNameCOMMA	
coordSystemType	TokenNameIdentifier	 coord System Type
,	TokenNameCOMMA	
uctx	TokenNameIdentifier	 uctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A value of zero will cause the area to be painted as a single color 	TokenNameCOMMENT_LINE	A value of zero will cause the area to be painted as a single color 
// using the color and opacity of the last gradient stop. 	TokenNameCOMMENT_LINE	using the color and opacity of the last gradient stop. 
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
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
Point2D	TokenNameIdentifier	 Point2 D
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertPoint	TokenNameIdentifier	 convert Point
(	TokenNameLPAREN	
cxStr	TokenNameIdentifier	 cx Str
,	TokenNameCOMMA	
SVG_CX_ATTRIBUTE	TokenNameIdentifier	 SVG  CX  ATTRIBUTE
,	TokenNameCOMMA	
cyStr	TokenNameIdentifier	 cy Str
,	TokenNameCOMMA	
SVG_CY_ATTRIBUTE	TokenNameIdentifier	 SVG  CY  ATTRIBUTE
,	TokenNameCOMMA	
coordSystemType	TokenNameIdentifier	 coord System Type
,	TokenNameCOMMA	
uctx	TokenNameIdentifier	 uctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertPoint	TokenNameIdentifier	 convert Point
(	TokenNameLPAREN	
fxStr	TokenNameIdentifier	 fx Str
,	TokenNameCOMMA	
SVG_FX_ATTRIBUTE	TokenNameIdentifier	 SVG  FX  ATTRIBUTE
,	TokenNameCOMMA	
fyStr	TokenNameIdentifier	 fy Str
,	TokenNameCOMMA	
SVG_FY_ATTRIBUTE	TokenNameIdentifier	 SVG  FY  ATTRIBUTE
,	TokenNameCOMMA	
coordSystemType	TokenNameIdentifier	 coord System Type
,	TokenNameCOMMA	
uctx	TokenNameIdentifier	 uctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// <!> FIXME: colorSpace ignored for radial gradient at this time 	TokenNameCOMMENT_LINE	<!> FIXME: colorSpace ignored for radial gradient at this time 
return	TokenNamereturn	
new	TokenNamenew	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
spreadMethod	TokenNameIdentifier	 spread Method
,	TokenNameCOMMA	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
.	TokenNameDOT	
SRGB	TokenNameIdentifier	 SRGB
,	TokenNameCOMMA	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
