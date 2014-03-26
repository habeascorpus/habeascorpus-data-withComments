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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
AbstractNode	TokenNameIdentifier	 Abstract Node
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XLinkSupport	TokenNameIdentifier	 X Link Support
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ParsedURL	TokenNameIdentifier	 Parsed URL
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
/** * Bridge class for vending gradients. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: AbstractSVGGradientElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for vending gradients. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: AbstractSVGGradientElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGGradientElementBridge	TokenNameIdentifier	 Abstract SVG Gradient Element Bridge
extends	TokenNameextends	
AnimatableGenericSVGBridge	TokenNameIdentifier	 Animatable Generic SVG Bridge
implements	TokenNameimplements	
PaintBridge	TokenNameIdentifier	 Paint Bridge
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
/** * Constructs a new AbstractSVGGradientElementBridge. */	TokenNameCOMMENT_JAVADOC	 Constructs a new AbstractSVGGradientElementBridge. 
protected	TokenNameprotected	
AbstractSVGGradientElementBridge	TokenNameIdentifier	 Abstract SVG Gradient Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a <tt>Paint</tt> according to the specified parameters. * * @param ctx the bridge context to use * @param paintElement the element that defines a Paint * @param paintedElement the element referencing the paint * @param paintedNode the graphics node on which the Paint will be applied * @param opacity the opacity of the Paint to create */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>Paint</tt> according to the specified parameters. * @param ctx the bridge context to use @param paintElement the element that defines a Paint @param paintedElement the element referencing the paint @param paintedNode the graphics node on which the Paint will be applied @param opacity the opacity of the Paint to create 
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
createPaint	TokenNameIdentifier	 create Paint
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
paintedElement	TokenNameIdentifier	 painted Element
,	TokenNameCOMMA	
GraphicsNode	TokenNameIdentifier	 Graphics Node
paintedNode	TokenNameIdentifier	 painted Node
,	TokenNameCOMMA	
float	TokenNamefloat	
opacity	TokenNameIdentifier	 opacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
// stop elements 	TokenNameCOMMENT_LINE	stop elements 
List	TokenNameIdentifier	 List
stops	TokenNameIdentifier	 stops
=	TokenNameEQUAL	
extractStop	TokenNameIdentifier	 extract Stop
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
opacity	TokenNameIdentifier	 opacity
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if no stops are defined, painting is the same as 'none' 	TokenNameCOMMENT_LINE	if no stops are defined, painting is the same as 'none' 
if	TokenNameif	
(	TokenNameLPAREN	
stops	TokenNameIdentifier	 stops
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
stopLength	TokenNameIdentifier	 stop Length
=	TokenNameEQUAL	
stops	TokenNameIdentifier	 stops
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if one stops is defined, painting is the same as a single color 	TokenNameCOMMENT_LINE	if one stops is defined, painting is the same as a single color 
if	TokenNameif	
(	TokenNameLPAREN	
stopLength	TokenNameIdentifier	 stop Length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Stop	TokenNameIdentifier	 Stop
)	TokenNameRPAREN	
stops	TokenNameIdentifier	 stops
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
color	TokenNameIdentifier	 color
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
stopLength	TokenNameIdentifier	 stop Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
stopLength	TokenNameIdentifier	 stop Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
stops	TokenNameIdentifier	 stops
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stop	TokenNameIdentifier	 Stop
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stop	TokenNameIdentifier	 Stop
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
colors	TokenNameIdentifier	 colors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
.	TokenNameDOT	
color	TokenNameIdentifier	 color
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'spreadMethod' attribute - default is pad 	TokenNameCOMMENT_LINE	'spreadMethod' attribute - default is pad 
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
spreadMethod	TokenNameIdentifier	 spread Method
=	TokenNameEQUAL	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
NO_CYCLE	TokenNameIdentifier	 NO  CYCLE
;	TokenNameSEMICOLON	
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
SVG_SPREAD_METHOD_ATTRIBUTE	TokenNameIdentifier	 SVG  SPREAD  METHOD  ATTRIBUTE
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
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spreadMethod	TokenNameIdentifier	 spread Method
=	TokenNameEQUAL	
convertSpreadMethod	TokenNameIdentifier	 convert Spread Method
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'color-interpolation' CSS property 	TokenNameCOMMENT_LINE	'color-interpolation' CSS property 
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
colorSpace	TokenNameIdentifier	 color Space
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
convertColorInterpolation	TokenNameIdentifier	 convert Color Interpolation
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'gradientTransform' attribute - default is an Identity matrix 	TokenNameCOMMENT_LINE	'gradientTransform' attribute - default is an Identity matrix 
AffineTransform	TokenNameIdentifier	 Affine Transform
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
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
SVG_GRADIENT_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  GRADIENT  TRANSFORM  ATTRIBUTE
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
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertTransform	TokenNameIdentifier	 convert Transform
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
SVG_GRADIENT_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  GRADIENT  TRANSFORM  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
buildGradient	TokenNameIdentifier	 build Gradient
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
paintedElement	TokenNameIdentifier	 painted Element
,	TokenNameCOMMA	
paintedNode	TokenNameIdentifier	 painted Node
,	TokenNameCOMMA	
spreadMethod	TokenNameIdentifier	 spread Method
,	TokenNameCOMMA	
colorSpace	TokenNameIdentifier	 color Space
,	TokenNameCOMMA	
transform	TokenNameIdentifier	 transform
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a concrete gradient according to the specified parameters. * * @param paintElement the element that defines a Paint * @param paintedElement the element referencing the paint * @param paintedNode the graphics node on which the Paint will be applied * @param spreadMethod the spread method * @param colorSpace the color space (sRGB | LinearRGB) * @param transform the gradient transform * @param colors the colors of the gradient * @param offsets the offsets * @param ctx the bridge context to use */	TokenNameCOMMENT_JAVADOC	 Builds a concrete gradient according to the specified parameters. * @param paintElement the element that defines a Paint @param paintedElement the element referencing the paint @param paintedNode the graphics node on which the Paint will be applied @param spreadMethod the spread method @param colorSpace the color space (sRGB | LinearRGB) @param transform the gradient transform @param colors the colors of the gradient @param offsets the offsets @param ctx the bridge context to use 
protected	TokenNameprotected	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
// convenient methods 	TokenNameCOMMENT_LINE	convenient methods 
/** * Converts the spreadMethod attribute. * * @param paintElement the paint Element with a spreadMethod * @param s the spread method * @param ctx the BridgeContext to use for error information */	TokenNameCOMMENT_JAVADOC	 Converts the spreadMethod attribute. * @param paintElement the paint Element with a spreadMethod @param s the spread method @param ctx the BridgeContext to use for error information 
protected	TokenNameprotected	
static	TokenNamestatic	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
convertSpreadMethod	TokenNameIdentifier	 convert Spread Method
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_REPEAT_VALUE	TokenNameIdentifier	 SVG  REPEAT  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
REPEAT	TokenNameIdentifier	 REPEAT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_REFLECT_VALUE	TokenNameIdentifier	 SVG  REFLECT  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
REFLECT	TokenNameIdentifier	 REFLECT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_PAD_VALUE	TokenNameIdentifier	 SVG  PAD  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
NO_CYCLE	TokenNameIdentifier	 NO  CYCLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_SPREAD_METHOD_ATTRIBUTE	TokenNameIdentifier	 SVG  SPREAD  METHOD  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the stops elements of the specified gradient * element. Stops can be children of the gradients or defined on * one of its 'ancestor' (linked with the xlink:href attribute). * * @param paintElement the gradient element * @param opacity the opacity * @param ctx the bridge context to use */	TokenNameCOMMENT_JAVADOC	 Returns the stops elements of the specified gradient element. Stops can be children of the gradients or defined on one of its 'ancestor' (linked with the xlink:href attribute). * @param paintElement the gradient element @param opacity the opacity @param ctx the bridge context to use 
protected	TokenNameprotected	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
extractStop	TokenNameIdentifier	 extract Stop
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
float	TokenNamefloat	
opacity	TokenNameIdentifier	 opacity
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
refs	TokenNameIdentifier	 refs
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
stops	TokenNameIdentifier	 stops
=	TokenNameEQUAL	
extractLocalStop	TokenNameIdentifier	 extract Local Stop
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
opacity	TokenNameIdentifier	 opacity
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stops	TokenNameIdentifier	 stops
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stops	TokenNameIdentifier	 stops
;	TokenNameSEMICOLON	
// stop elements found, exit 	TokenNameCOMMENT_LINE	stop elements found, exit 
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
getXLinkHref	TokenNameIdentifier	 get X Link Href
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// no xlink:href found, exit 	TokenNameCOMMENT_LINE	no xlink:href found, exit 
}	TokenNameRBRACE	
// check if there is circular dependencies 	TokenNameCOMMENT_LINE	check if there is circular dependencies 
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
paintElement	TokenNameIdentifier	 paint Element
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
refs	TokenNameIdentifier	 refs
,	TokenNameCOMMA	
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
ERR_XLINK_HREF_CIRCULAR_DEPENDENCIES	TokenNameIdentifier	 ERR  XLINK  HREF  CIRCULAR  DEPENDENCIES
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
refs	TokenNameIdentifier	 refs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintElement	TokenNameIdentifier	 paint Element
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getReferencedElement	TokenNameIdentifier	 get Referenced Element
(	TokenNameLPAREN	
paintElement	TokenNameIdentifier	 paint Element
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a list of <tt>Stop</tt> elements, children of the * specified paintElement can have or null if any. * * @param gradientElement the paint element * @param opacity the opacity * @param ctx the bridge context */	TokenNameCOMMENT_JAVADOC	 Returns a list of <tt>Stop</tt> elements, children of the specified paintElement can have or null if any. * @param gradientElement the paint element @param opacity the opacity @param ctx the bridge context 
protected	TokenNameprotected	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
extractLocalStop	TokenNameIdentifier	 extract Local Stop
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
gradientElement	TokenNameIdentifier	 gradient Element
,	TokenNameCOMMA	
float	TokenNamefloat	
opacity	TokenNameIdentifier	 opacity
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LinkedList	TokenNameIdentifier	 Linked List
stops	TokenNameIdentifier	 stops
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Stop	TokenNameIdentifier	 Stop
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
gradientElement	TokenNameIdentifier	 gradient Element
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
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
Bridge	TokenNameIdentifier	 Bridge
bridge	TokenNameIdentifier	 bridge
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBridge	TokenNameIdentifier	 get Bridge
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
instanceof	TokenNameinstanceof	
SVGStopElementBridge	TokenNameIdentifier	 SVG Stop Element Bridge
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Stop	TokenNameIdentifier	 Stop
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGStopElementBridge	TokenNameIdentifier	 SVG Stop Element Bridge
)	TokenNameRPAREN	
bridge	TokenNameIdentifier	 bridge
)	TokenNameRPAREN	
.	TokenNameDOT	
createStop	TokenNameIdentifier	 create Stop
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
gradientElement	TokenNameIdentifier	 gradient Element
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
opacity	TokenNameIdentifier	 opacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stops	TokenNameIdentifier	 stops
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stops	TokenNameIdentifier	 stops
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stop	TokenNameIdentifier	 stop
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
stops	TokenNameIdentifier	 stops
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
stops	TokenNameIdentifier	 stops
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified list of URLs contains the specified url. * * @param urls the list of URLs * @param key the url to search for */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified list of URLs contains the specified url. * @param urls the list of URLs @param key the url to search for 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
urls	TokenNameIdentifier	 urls
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents a gradient &lt;stop> element. */	TokenNameCOMMENT_JAVADOC	 This class represents a gradient &lt;stop> element. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Stop	TokenNameIdentifier	 Stop
{	TokenNameLBRACE	
/** The stop color. */	TokenNameCOMMENT_JAVADOC	 The stop color. 
public	TokenNamepublic	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
;	TokenNameSEMICOLON	
/** The stop offset. */	TokenNameCOMMENT_JAVADOC	 The stop offset. 
public	TokenNamepublic	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
/** * Constructs a new stop definition. * * @param color the stop color * @param offset the stop offset */	TokenNameCOMMENT_JAVADOC	 Constructs a new stop definition. * @param color the stop color @param offset the stop offset 
public	TokenNamepublic	
Stop	TokenNameIdentifier	 Stop
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
,	TokenNameCOMMA	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
color	TokenNameIdentifier	 color
=	TokenNameEQUAL	
color	TokenNameIdentifier	 color
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Bridge class for the gradient &lt;stop> element. */	TokenNameCOMMENT_JAVADOC	 Bridge class for the gradient &lt;stop> element. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SVGStopElementBridge	TokenNameIdentifier	 SVG Stop Element Bridge
extends	TokenNameextends	
AnimatableGenericSVGBridge	TokenNameIdentifier	 Animatable Generic SVG Bridge
implements	TokenNameimplements	
Bridge	TokenNameIdentifier	 Bridge
{	TokenNameLBRACE	
/** * Returns 'stop'. */	TokenNameCOMMENT_JAVADOC	 Returns 'stop'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_STOP_TAG	TokenNameIdentifier	 SVG  STOP  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>Stop</tt> according to the specified parameters. * * @param ctx the bridge context to use * @param gradientElement the gradient element * @param stopElement the stop element * @param opacity an additional opacity of the stop color */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>Stop</tt> according to the specified parameters. * @param ctx the bridge context to use @param gradientElement the gradient element @param stopElement the stop element @param opacity an additional opacity of the stop color 
public	TokenNamepublic	
Stop	TokenNameIdentifier	 Stop
createStop	TokenNameIdentifier	 create Stop
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
gradientElement	TokenNameIdentifier	 gradient Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
stopElement	TokenNameIdentifier	 stop Element
,	TokenNameCOMMA	
float	TokenNamefloat	
opacity	TokenNameIdentifier	 opacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
stopElement	TokenNameIdentifier	 stop Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  OFFSET  ATTRIBUTE
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
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
stopElement	TokenNameIdentifier	 stop Element
,	TokenNameCOMMA	
ERR_ATTRIBUTE_MISSING	TokenNameIdentifier	 ERR  ATTRIBUTE  MISSING
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  OFFSET  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertRatio	TokenNameIdentifier	 convert Ratio
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
stopElement	TokenNameIdentifier	 stop Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  OFFSET  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
convertStopColor	TokenNameIdentifier	 convert Stop Color
(	TokenNameLPAREN	
stopElement	TokenNameIdentifier	 stop Element
,	TokenNameCOMMA	
opacity	TokenNameIdentifier	 opacity
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Stop	TokenNameIdentifier	 Stop
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
