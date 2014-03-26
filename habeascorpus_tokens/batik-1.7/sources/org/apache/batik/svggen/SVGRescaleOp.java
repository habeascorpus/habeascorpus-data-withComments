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
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
BufferedImageOp	TokenNameIdentifier	 Buffered Image Op
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
RescaleOp	TokenNameIdentifier	 Rescale Op
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
/** * Utility class that converts a RescaleOp object into * an SVG filter descriptor. The SVG filter corresponding * to a RescaleOp is an feComponentTransfer, with a type * set to 'linear', the slopes equal to the RescapeOp * scaleFactors and the intercept equal to the RescapeOp * offsets. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGRescaleOp.java 476924 2006-11-19 21:13:26Z dvholten $ * @see org.apache.batik.svggen.SVGBufferedImageOp */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a RescaleOp object into an SVG filter descriptor. The SVG filter corresponding to a RescaleOp is an feComponentTransfer, with a type set to 'linear', the slopes equal to the RescapeOp scaleFactors and the intercept equal to the RescapeOp offsets. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGRescaleOp.java 476924 2006-11-19 21:13:26Z dvholten $ @see org.apache.batik.svggen.SVGBufferedImageOp 
public	TokenNamepublic	
class	TokenNameclass	
SVGRescaleOp	TokenNameIdentifier	 SVG Rescale Op
extends	TokenNameextends	
AbstractSVGFilterConverter	TokenNameIdentifier	 Abstract SVG Filter Converter
{	TokenNameLBRACE	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGRescaleOp	TokenNameIdentifier	 SVG Rescale Op
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
/** * Converts a Java 2D API BufferedImageOp into * a set of attribute/value pairs and related definitions * * @param filter BufferedImageOp filter to be converted * @param filterRect Rectangle, in device space, that defines the area * to which filtering applies. May be null, meaning that the * area is undefined. * @return descriptor of the attributes required to represent * the input filter * @see org.apache.batik.svggen.SVGFilterDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts a Java 2D API BufferedImageOp into a set of attribute/value pairs and related definitions * @param filter BufferedImageOp filter to be converted @param filterRect Rectangle, in device space, that defines the area to which filtering applies. May be null, meaning that the area is undefined. @return descriptor of the attributes required to represent the input filter @see org.apache.batik.svggen.SVGFilterDescriptor 
public	TokenNamepublic	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
BufferedImageOp	TokenNameIdentifier	 Buffered Image Op
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
filterRect	TokenNameIdentifier	 filter Rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
instanceof	TokenNameinstanceof	
RescaleOp	TokenNameIdentifier	 Rescale Op
)	TokenNameRPAREN	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RescaleOp	TokenNameIdentifier	 Rescale Op
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param rescaleOp the RescaleOp to be converted * @return a description of the SVG filter corresponding to * rescaleOp. The definition of the feComponentTransfer * filter in put in feComponentTransferDefSet */	TokenNameCOMMENT_JAVADOC	 @param rescaleOp the RescaleOp to be converted @return a description of the SVG filter corresponding to rescaleOp. The definition of the feComponentTransfer filter in put in feComponentTransferDefSet 
public	TokenNamepublic	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
RescaleOp	TokenNameIdentifier	 Rescale Op
rescaleOp	TokenNameIdentifier	 rescale Op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reuse definition if rescaleOp has already been converted 	TokenNameCOMMENT_LINE	Reuse definition if rescaleOp has already been converted 
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
filterDesc	TokenNameIdentifier	 filter Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
)	TokenNameRPAREN	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
rescaleOp	TokenNameIdentifier	 rescale Op
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
filterDesc	TokenNameIdentifier	 filter Desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// First time filter is converted: create its corresponding 	TokenNameCOMMENT_LINE	First time filter is converted: create its corresponding 
// SVG filter 	TokenNameCOMMENT_LINE	SVG filter 
// 	TokenNameCOMMENT_LINE	 
Element	TokenNameIdentifier	 Element
filterDef	TokenNameIdentifier	 filter Def
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FILTER_TAG	TokenNameIdentifier	 SVG  FILTER  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feComponentTransferDef	TokenNameIdentifier	 fe Component Transfer Def
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_COMPONENT_TRANSFER_TAG	TokenNameIdentifier	 SVG  FE  COMPONENT  TRANSFER  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Append transfer function for each component, setting 	TokenNameCOMMENT_LINE	Append transfer function for each component, setting 
// the attributes corresponding to the scale and offset. 	TokenNameCOMMENT_LINE	the attributes corresponding to the scale and offset. 
// Because we are using a RescaleOp as a BufferedImageOp, 	TokenNameCOMMENT_LINE	Because we are using a RescaleOp as a BufferedImageOp, 
// the scaleFactors must be either: 	TokenNameCOMMENT_LINE	the scaleFactors must be either: 
// + 1, in which case the same scale is applied to the 	TokenNameCOMMENT_LINE	+ 1, in which case the same scale is applied to the 
// Red, Green and Blue components, 	TokenNameCOMMENT_LINE	Red, Green and Blue components, 
// + 3, in which case the scale factors apply to the 	TokenNameCOMMENT_LINE	+ 3, in which case the scale factors apply to the 
// Red, Green and Blue components 	TokenNameCOMMENT_LINE	Red, Green and Blue components 
// + 4, in which case the scale factors apply to the 	TokenNameCOMMENT_LINE	+ 4, in which case the scale factors apply to the 
// Red, Green, Blue and Alpha components 	TokenNameCOMMENT_LINE	Red, Green, Blue and Alpha components 
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
rescaleOp	TokenNameIdentifier	 rescale Op
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scaleFactors	TokenNameIdentifier	 scale Factors
=	TokenNameEQUAL	
rescaleOp	TokenNameIdentifier	 rescale Op
.	TokenNameDOT	
getScaleFactors	TokenNameIdentifier	 get Scale Factors
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
scaleFactors	TokenNameIdentifier	 scale Factors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_SCALE_FACTORS_AND_OFFSETS_MISMATCH	TokenNameIdentifier	 ERR  SCALE  FACTORS  AND  OFFSETS  MISMATCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_ILLEGAL_BUFFERED_IMAGE_RESCALE_OP	TokenNameIdentifier	 ERR  ILLEGAL  BUFFERED  IMAGE  RESCALE  OP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feFuncR	TokenNameIdentifier	 fe Func R
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_FUNC_R_TAG	TokenNameIdentifier	 SVG  FE  FUNC  R  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feFuncG	TokenNameIdentifier	 fe Func G
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_FUNC_G_TAG	TokenNameIdentifier	 SVG  FE  FUNC  G  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feFuncB	TokenNameIdentifier	 fe Func B
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_FUNC_B_TAG	TokenNameIdentifier	 SVG  FE  FUNC  B  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feFuncA	TokenNameIdentifier	 fe Func A
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVG_LINEAR_VALUE	TokenNameIdentifier	 SVG  LINEAR  VALUE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
scaleFactors	TokenNameIdentifier	 scale Factors
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
intercept	TokenNameIdentifier	 intercept
=	TokenNameEQUAL	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncR	TokenNameIdentifier	 fe Func R
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncG	TokenNameIdentifier	 fe Func G
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncB	TokenNameIdentifier	 fe Func B
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncR	TokenNameIdentifier	 fe Func R
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SLOPE_ATTRIBUTE	TokenNameIdentifier	 SVG  SLOPE  ATTRIBUTE
,	TokenNameCOMMA	
slope	TokenNameIdentifier	 slope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncG	TokenNameIdentifier	 fe Func G
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SLOPE_ATTRIBUTE	TokenNameIdentifier	 SVG  SLOPE  ATTRIBUTE
,	TokenNameCOMMA	
slope	TokenNameIdentifier	 slope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncB	TokenNameIdentifier	 fe Func B
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SLOPE_ATTRIBUTE	TokenNameIdentifier	 SVG  SLOPE  ATTRIBUTE
,	TokenNameCOMMA	
slope	TokenNameIdentifier	 slope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncR	TokenNameIdentifier	 fe Func R
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_INTERCEPT_ATTRIBUTE	TokenNameIdentifier	 SVG  INTERCEPT  ATTRIBUTE
,	TokenNameCOMMA	
intercept	TokenNameIdentifier	 intercept
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncG	TokenNameIdentifier	 fe Func G
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_INTERCEPT_ATTRIBUTE	TokenNameIdentifier	 SVG  INTERCEPT  ATTRIBUTE
,	TokenNameCOMMA	
intercept	TokenNameIdentifier	 intercept
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncB	TokenNameIdentifier	 fe Func B
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_INTERCEPT_ATTRIBUTE	TokenNameIdentifier	 SVG  INTERCEPT  ATTRIBUTE
,	TokenNameCOMMA	
intercept	TokenNameIdentifier	 intercept
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
feFuncR	TokenNameIdentifier	 fe Func R
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncG	TokenNameIdentifier	 fe Func G
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncB	TokenNameIdentifier	 fe Func B
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncR	TokenNameIdentifier	 fe Func R
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SLOPE_ATTRIBUTE	TokenNameIdentifier	 SVG  SLOPE  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
scaleFactors	TokenNameIdentifier	 scale Factors
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncG	TokenNameIdentifier	 fe Func G
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SLOPE_ATTRIBUTE	TokenNameIdentifier	 SVG  SLOPE  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
scaleFactors	TokenNameIdentifier	 scale Factors
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncB	TokenNameIdentifier	 fe Func B
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SLOPE_ATTRIBUTE	TokenNameIdentifier	 SVG  SLOPE  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
scaleFactors	TokenNameIdentifier	 scale Factors
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncR	TokenNameIdentifier	 fe Func R
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_INTERCEPT_ATTRIBUTE	TokenNameIdentifier	 SVG  INTERCEPT  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncG	TokenNameIdentifier	 fe Func G
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_INTERCEPT_ATTRIBUTE	TokenNameIdentifier	 SVG  INTERCEPT  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncB	TokenNameIdentifier	 fe Func B
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_INTERCEPT_ATTRIBUTE	TokenNameIdentifier	 SVG  INTERCEPT  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
feFuncA	TokenNameIdentifier	 fe Func A
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_FUNC_A_TAG	TokenNameIdentifier	 SVG  FE  FUNC  A  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncA	TokenNameIdentifier	 fe Func A
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncA	TokenNameIdentifier	 fe Func A
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SLOPE_ATTRIBUTE	TokenNameIdentifier	 SVG  SLOPE  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
scaleFactors	TokenNameIdentifier	 scale Factors
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncA	TokenNameIdentifier	 fe Func A
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_INTERCEPT_ATTRIBUTE	TokenNameIdentifier	 SVG  INTERCEPT  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
feComponentTransferDef	TokenNameIdentifier	 fe Component Transfer Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feFuncR	TokenNameIdentifier	 fe Func R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feComponentTransferDef	TokenNameIdentifier	 fe Component Transfer Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feFuncG	TokenNameIdentifier	 fe Func G
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feComponentTransferDef	TokenNameIdentifier	 fe Component Transfer Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feFuncB	TokenNameIdentifier	 fe Func B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
feFuncA	TokenNameIdentifier	 fe Func A
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
feComponentTransferDef	TokenNameIdentifier	 fe Component Transfer Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feFuncA	TokenNameIdentifier	 fe Func A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterDef	TokenNameIdentifier	 filter Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feComponentTransferDef	TokenNameIdentifier	 fe Component Transfer Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterDef	TokenNameIdentifier	 filter Def
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
ID_PREFIX_FE_COMPONENT_TRANSFER	TokenNameIdentifier	 ID  PREFIX  FE  COMPONENT  TRANSFER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Create a filter descriptor 	TokenNameCOMMENT_LINE	Create a filter descriptor 
// 	TokenNameCOMMENT_LINE	 
// Process filter attribute 	TokenNameCOMMENT_LINE	Process filter attribute 
// StringBuffer filterAttrBuf = new StringBuffer(URL_PREFIX); 	TokenNameCOMMENT_LINE	StringBuffer filterAttrBuf = new StringBuffer(URL_PREFIX); 
// filterAttrBuf.append(SIGN_POUND); 	TokenNameCOMMENT_LINE	filterAttrBuf.append(SIGN_POUND); 
// filterAttrBuf.append(filterDef.getAttributeNS(null, SVG_ID_ATTRIBUTE)); 	TokenNameCOMMENT_LINE	filterAttrBuf.append(filterDef.getAttributeNS(null, SVG_ID_ATTRIBUTE)); 
// filterAttrBuf.append(URL_SUFFIX); 	TokenNameCOMMENT_LINE	filterAttrBuf.append(URL_SUFFIX); 
String	TokenNameIdentifier	 String
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
=	TokenNameEQUAL	
URL_PREFIX	TokenNameIdentifier	 URL  PREFIX
+	TokenNamePLUS	
SIGN_POUND	TokenNameIdentifier	 SIGN  POUND
+	TokenNamePLUS	
filterDef	TokenNameIdentifier	 filter Def
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
+	TokenNamePLUS	
URL_SUFFIX	TokenNameIdentifier	 URL  SUFFIX
;	TokenNameSEMICOLON	
filterDesc	TokenNameIdentifier	 filter Desc
=	TokenNameEQUAL	
new	TokenNamenew	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
(	TokenNameLPAREN	
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
,	TokenNameCOMMA	
filterDef	TokenNameIdentifier	 filter Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
filterDef	TokenNameIdentifier	 filter Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
rescaleOp	TokenNameIdentifier	 rescale Op
,	TokenNameCOMMA	
filterDesc	TokenNameIdentifier	 filter Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
filterDesc	TokenNameIdentifier	 filter Desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
