/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GradientPaint	TokenNameIdentifier	 Gradient Paint
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
Point2D	TokenNameIdentifier	 Point2 D
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
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
GraphicContext	TokenNameIdentifier	 Graphic Context
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
/** * Utility class that converts a Java GradientPaint into an * SVG linear gradient element * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGLinearGradient.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Java GradientPaint into an SVG linear gradient element * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGLinearGradient.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGLinearGradient	TokenNameIdentifier	 SVG Linear Gradient
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGLinearGradient	TokenNameIdentifier	 SVG Linear Gradient
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts part or all of the input GraphicContext into * a set of attribute/value pairs and related definitions * * @param gc GraphicContext to be converted * @return descriptor of the attributes required to represent * some or all of the GraphicContext state, along * with the related definitions * @see org.apache.batik.svggen.SVGDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts part or all of the input GraphicContext into a set of attribute/value pairs and related definitions * @param gc GraphicContext to be converted @return descriptor of the attributes required to represent some or all of the GraphicContext state, along with the related definitions @see org.apache.batik.svggen.SVGDescriptor 
public	TokenNamepublic	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getPaint	TokenNameIdentifier	 get Paint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GradientPaint	TokenNameIdentifier	 Gradient Paint
)	TokenNameRPAREN	
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param gradient the GradientPaint to be converted * @return a description of the SVG paint and opacity corresponding * to the gradient Paint. The definiton of the * linearGradient is put in the linearGradientDefsMap */	TokenNameCOMMENT_JAVADOC	 @param gradient the GradientPaint to be converted @return a description of the SVG paint and opacity corresponding to the gradient Paint. The definiton of the linearGradient is put in the linearGradientDefsMap 
public	TokenNamepublic	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GradientPaint	TokenNameIdentifier	 Gradient Paint
gradient	TokenNameIdentifier	 gradient
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reuse definition if gradient has already been converted 	TokenNameCOMMENT_LINE	Reuse definition if gradient has already been converted 
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
gradientDesc	TokenNameIdentifier	 gradient Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
)	TokenNameRPAREN	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
gradient	TokenNameIdentifier	 gradient
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
domFactory	TokenNameIdentifier	 dom Factory
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gradientDesc	TokenNameIdentifier	 gradient Desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
gradientDef	TokenNameIdentifier	 gradient Def
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_LINEAR_GRADIENT_TAG	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_GRADIENT_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  GRADIENT  UNITS  ATTRIBUTE
,	TokenNameCOMMA	
SVG_USER_SPACE_ON_USE_VALUE	TokenNameIdentifier	 SVG  USER  SPACE  ON  USE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Process gradient vector 	TokenNameCOMMENT_LINE	Process gradient vector 
// 	TokenNameCOMMENT_LINE	 
Point2D	TokenNameIdentifier	 Point2 D
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
gradient	TokenNameIdentifier	 gradient
.	TokenNameDOT	
getPoint1	TokenNameIdentifier	 get Point1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
gradient	TokenNameIdentifier	 gradient
.	TokenNameDOT	
getPoint2	TokenNameIdentifier	 get Point2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X1_ATTRIBUTE	TokenNameIdentifier	 SVG  X1  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y1_ATTRIBUTE	TokenNameIdentifier	 SVG  Y1  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X2_ATTRIBUTE	TokenNameIdentifier	 SVG  X2  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y2_ATTRIBUTE	TokenNameIdentifier	 SVG  Y2  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Spread method 	TokenNameCOMMENT_LINE	Spread method 
// 	TokenNameCOMMENT_LINE	 
String	TokenNameIdentifier	 String
spreadMethod	TokenNameIdentifier	 spread Method
=	TokenNameEQUAL	
SVG_PAD_VALUE	TokenNameIdentifier	 SVG  PAD  VALUE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gradient	TokenNameIdentifier	 gradient
.	TokenNameDOT	
isCyclic	TokenNameIdentifier	 is Cyclic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
spreadMethod	TokenNameIdentifier	 spread Method
=	TokenNameEQUAL	
SVG_REFLECT_VALUE	TokenNameIdentifier	 SVG  REFLECT  VALUE
;	TokenNameSEMICOLON	
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SPREAD_METHOD_ATTRIBUTE	TokenNameIdentifier	 SVG  SPREAD  METHOD  ATTRIBUTE
,	TokenNameCOMMA	
spreadMethod	TokenNameIdentifier	 spread Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// First gradient stop 	TokenNameCOMMENT_LINE	First gradient stop 
// 	TokenNameCOMMENT_LINE	 
Element	TokenNameIdentifier	 Element
gradientStop	TokenNameIdentifier	 gradient Stop
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_STOP_TAG	TokenNameIdentifier	 SVG  STOP  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientStop	TokenNameIdentifier	 gradient Stop
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  OFFSET  ATTRIBUTE
,	TokenNameCOMMA	
SVG_ZERO_PERCENT_VALUE	TokenNameIdentifier	 SVG  ZERO  PERCENT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
colorDesc	TokenNameIdentifier	 color Desc
=	TokenNameEQUAL	
SVGColor	TokenNameIdentifier	 SVG Color
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gradient	TokenNameIdentifier	 gradient
.	TokenNameDOT	
getColor1	TokenNameIdentifier	 get Color1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientStop	TokenNameIdentifier	 gradient Stop
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_STOP_COLOR_ATTRIBUTE	TokenNameIdentifier	 SVG  STOP  COLOR  ATTRIBUTE
,	TokenNameCOMMA	
colorDesc	TokenNameIdentifier	 color Desc
.	TokenNameDOT	
getPaintValue	TokenNameIdentifier	 get Paint Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientStop	TokenNameIdentifier	 gradient Stop
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_STOP_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  STOP  OPACITY  ATTRIBUTE
,	TokenNameCOMMA	
colorDesc	TokenNameIdentifier	 color Desc
.	TokenNameDOT	
getOpacityValue	TokenNameIdentifier	 get Opacity Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
gradientStop	TokenNameIdentifier	 gradient Stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Second gradient stop 	TokenNameCOMMENT_LINE	Second gradient stop 
// 	TokenNameCOMMENT_LINE	 
gradientStop	TokenNameIdentifier	 gradient Stop
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_STOP_TAG	TokenNameIdentifier	 SVG  STOP  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientStop	TokenNameIdentifier	 gradient Stop
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  OFFSET  ATTRIBUTE
,	TokenNameCOMMA	
SVG_HUNDRED_PERCENT_VALUE	TokenNameIdentifier	 SVG  HUNDRED  PERCENT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorDesc	TokenNameIdentifier	 color Desc
=	TokenNameEQUAL	
SVGColor	TokenNameIdentifier	 SVG Color
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gradient	TokenNameIdentifier	 gradient
.	TokenNameDOT	
getColor2	TokenNameIdentifier	 get Color2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientStop	TokenNameIdentifier	 gradient Stop
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_STOP_COLOR_ATTRIBUTE	TokenNameIdentifier	 SVG  STOP  COLOR  ATTRIBUTE
,	TokenNameCOMMA	
colorDesc	TokenNameIdentifier	 color Desc
.	TokenNameDOT	
getPaintValue	TokenNameIdentifier	 get Paint Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientStop	TokenNameIdentifier	 gradient Stop
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_STOP_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  STOP  OPACITY  ATTRIBUTE
,	TokenNameCOMMA	
colorDesc	TokenNameIdentifier	 color Desc
.	TokenNameDOT	
getOpacityValue	TokenNameIdentifier	 get Opacity Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
gradientStop	TokenNameIdentifier	 gradient Stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Gradient ID 	TokenNameCOMMENT_LINE	Gradient ID 
// 	TokenNameCOMMENT_LINE	 
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
.	TokenNameDOT	
generateID	TokenNameIdentifier	 generate ID
(	TokenNameLPAREN	
ID_PREFIX_LINEAR_GRADIENT	TokenNameIdentifier	 ID  PREFIX  LINEAR  GRADIENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Build Paint descriptor 	TokenNameCOMMENT_LINE	Build Paint descriptor 
// 	TokenNameCOMMENT_LINE	 
StringBuffer	TokenNameIdentifier	 String Buffer
paintAttrBuf	TokenNameIdentifier	 paint Attr Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
URL_PREFIX	TokenNameIdentifier	 URL  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintAttrBuf	TokenNameIdentifier	 paint Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SIGN_POUND	TokenNameIdentifier	 SIGN  POUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintAttrBuf	TokenNameIdentifier	 paint Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gradientDef	TokenNameIdentifier	 gradient Def
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintAttrBuf	TokenNameIdentifier	 paint Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
URL_SUFFIX	TokenNameIdentifier	 URL  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gradientDesc	TokenNameIdentifier	 gradient Desc
=	TokenNameEQUAL	
new	TokenNamenew	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
(	TokenNameLPAREN	
paintAttrBuf	TokenNameIdentifier	 paint Attr Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SVG_OPAQUE_VALUE	TokenNameIdentifier	 SVG  OPAQUE  VALUE
,	TokenNameCOMMA	
gradientDef	TokenNameIdentifier	 gradient Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Update maps so that gradient can be reused if needed 	TokenNameCOMMENT_LINE	Update maps so that gradient can be reused if needed 
// 	TokenNameCOMMENT_LINE	 
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
gradient	TokenNameIdentifier	 gradient
,	TokenNameCOMMA	
gradientDesc	TokenNameIdentifier	 gradient Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gradientDef	TokenNameIdentifier	 gradient Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
gradientDesc	TokenNameIdentifier	 gradient Desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
