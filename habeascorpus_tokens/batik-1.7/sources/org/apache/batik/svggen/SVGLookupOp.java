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
ByteLookupTable	TokenNameIdentifier	 Byte Lookup Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
LookupOp	TokenNameIdentifier	 Lookup Op
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
LookupTable	TokenNameIdentifier	 Lookup Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
/** * Utility class that converts a LookupOp object into * an SVG filter descriptor. The SVG filter corresponding * to a LookupOp is an feComponentTransfer, with a type * set to 'table', the tableValues set to the content * of the lookup table. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGLookupOp.java 501495 2007-01-30 18:00:36Z dvholten $ * @see org.apache.batik.svggen.SVGBufferedImageOp */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a LookupOp object into an SVG filter descriptor. The SVG filter corresponding to a LookupOp is an feComponentTransfer, with a type set to 'table', the tableValues set to the content of the lookup table. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGLookupOp.java 501495 2007-01-30 18:00:36Z dvholten $ @see org.apache.batik.svggen.SVGBufferedImageOp 
public	TokenNamepublic	
class	TokenNameclass	
SVGLookupOp	TokenNameIdentifier	 SVG Lookup Op
extends	TokenNameextends	
AbstractSVGFilterConverter	TokenNameIdentifier	 Abstract SVG Filter Converter
{	TokenNameLBRACE	
/** * Gamma for linear to sRGB convertion */	TokenNameCOMMENT_JAVADOC	 Gamma for linear to sRGB convertion 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
GAMMA	TokenNameIdentifier	 GAMMA
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
2.4	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * Lookup table for linear to sRGB value * forward and backward mapping */	TokenNameCOMMENT_JAVADOC	 Lookup table for linear to sRGB value forward and backward mapping 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
linearToSRGBLut	TokenNameIdentifier	 linear To SRGB Lut
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sRGBToLinear	TokenNameIdentifier	 s RGB To Linear
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// linear to sRGB 	TokenNameCOMMENT_LINE	linear to sRGB 
float	TokenNamefloat	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<=	TokenNameLESS_EQUAL	
0.0031308	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
*=	TokenNameMULTIPLY_EQUAL	
12.92f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
1.055f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
GAMMA	TokenNameIdentifier	 GAMMA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
0.055f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
linearToSRGBLut	TokenNameIdentifier	 linear To SRGB Lut
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sRGB to linear 	TokenNameCOMMENT_LINE	sRGB to linear 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<=	TokenNameLESS_EQUAL	
0.04045	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
/=	TokenNameDIVIDE_EQUAL	
12.92f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
0.055f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1.055f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
GAMMA	TokenNameIdentifier	 GAMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sRGBToLinear	TokenNameIdentifier	 s RGB To Linear
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGLookupOp	TokenNameIdentifier	 SVG Lookup Op
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
LookupOp	TokenNameIdentifier	 Lookup Op
)	TokenNameRPAREN	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LookupOp	TokenNameIdentifier	 Lookup Op
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param lookupOp the LookupOp to be converted * @return a description of the SVG filter corresponding to * lookupOp. The definition of the feComponentTransfer * filter in put in feComponentTransferDefSet */	TokenNameCOMMENT_JAVADOC	 @param lookupOp the LookupOp to be converted @return a description of the SVG filter corresponding to lookupOp. The definition of the feComponentTransfer filter in put in feComponentTransferDefSet 
public	TokenNamepublic	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
LookupOp	TokenNameIdentifier	 Lookup Op
lookupOp	TokenNameIdentifier	 lookup Op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reuse definition if lookupOp has already been converted 	TokenNameCOMMENT_LINE	Reuse definition if lookupOp has already been converted 
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
lookupOp	TokenNameIdentifier	 lookup Op
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
// Because we are using a LookupOp as a BufferedImageOp, 	TokenNameCOMMENT_LINE	Because we are using a LookupOp as a BufferedImageOp, 
// the number of lookup table must be: 	TokenNameCOMMENT_LINE	the number of lookup table must be: 
// + 1, in which case the same lookup is applied to the 	TokenNameCOMMENT_LINE	+ 1, in which case the same lookup is applied to the 
// Red, Green and Blue components, 	TokenNameCOMMENT_LINE	Red, Green and Blue components, 
// + 3, in which case the lookup tables apply to the 	TokenNameCOMMENT_LINE	+ 3, in which case the lookup tables apply to the 
// Red, Green and Blue components 	TokenNameCOMMENT_LINE	Red, Green and Blue components 
// + 4, in which case the lookup tables apply to the 	TokenNameCOMMENT_LINE	+ 4, in which case the lookup tables apply to the 
// Red, Green, Blue and Alpha components 	TokenNameCOMMENT_LINE	Red, Green, Blue and Alpha components 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookupTables	TokenNameIdentifier	 lookup Tables
=	TokenNameEQUAL	
convertLookupTables	TokenNameIdentifier	 convert Lookup Tables
(	TokenNameLPAREN	
lookupOp	TokenNameIdentifier	 lookup Op
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
SVG_TABLE_VALUE	TokenNameIdentifier	 SVG  TABLE  VALUE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookupTables	TokenNameIdentifier	 lookup Tables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
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
SVG_TABLE_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  TABLE  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
lookupTables	TokenNameIdentifier	 lookup Tables
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncG	TokenNameIdentifier	 fe Func G
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TABLE_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  TABLE  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
lookupTables	TokenNameIdentifier	 lookup Tables
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncB	TokenNameIdentifier	 fe Func B
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TABLE_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  TABLE  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
lookupTables	TokenNameIdentifier	 lookup Tables
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lookupTables	TokenNameIdentifier	 lookup Tables
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
SVG_TABLE_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  TABLE  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
lookupTables	TokenNameIdentifier	 lookup Tables
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncG	TokenNameIdentifier	 fe Func G
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TABLE_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  TABLE  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
lookupTables	TokenNameIdentifier	 lookup Tables
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFuncB	TokenNameIdentifier	 fe Func B
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TABLE_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  TABLE  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
lookupTables	TokenNameIdentifier	 lookup Tables
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookupTables	TokenNameIdentifier	 lookup Tables
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
SVG_TABLE_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  TABLE  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
lookupTables	TokenNameIdentifier	 lookup Tables
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
lookupOp	TokenNameIdentifier	 lookup Op
,	TokenNameCOMMA	
filterDesc	TokenNameIdentifier	 filter Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
filterDesc	TokenNameIdentifier	 filter Desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the filter's LookupTable into an array of corresponding SVG * table strings */	TokenNameCOMMENT_JAVADOC	 Converts the filter's LookupTable into an array of corresponding SVG table strings 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
convertLookupTables	TokenNameIdentifier	 convert Lookup Tables
(	TokenNameLPAREN	
LookupOp	TokenNameIdentifier	 Lookup Op
lookupOp	TokenNameIdentifier	 lookup Op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LookupTable	TokenNameIdentifier	 Lookup Table
lookupTable	TokenNameIdentifier	 lookup Table
=	TokenNameEQUAL	
lookupOp	TokenNameIdentifier	 lookup Op
.	TokenNameDOT	
getTable	TokenNameIdentifier	 get Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nComponents	TokenNameIdentifier	 n Components
=	TokenNameEQUAL	
lookupTable	TokenNameIdentifier	 lookup Table
.	TokenNameDOT	
getNumComponents	TokenNameIdentifier	 get Num Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nComponents	TokenNameIdentifier	 n Components
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nComponents	TokenNameIdentifier	 n Components
!=	TokenNameNOT_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nComponents	TokenNameIdentifier	 n Components
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_ILLEGAL_BUFFERED_IMAGE_LOOKUP_OP	TokenNameIdentifier	 ERR  ILLEGAL  BUFFERED  IMAGE  LOOKUP  OP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookupTableBuf	TokenNameIdentifier	 lookup Table Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
[	TokenNameLBRACKET	
nComponents	TokenNameIdentifier	 n Components
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nComponents	TokenNameIdentifier	 n Components
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
lookupTableBuf	TokenNameIdentifier	 lookup Table Buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
lookupTable	TokenNameIdentifier	 lookup Table
instanceof	TokenNameinstanceof	
ByteLookupTable	TokenNameIdentifier	 Byte Lookup Table
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nComponents	TokenNameIdentifier	 n Components
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nComponents	TokenNameIdentifier	 n Components
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
lookupTable	TokenNameIdentifier	 lookup Table
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Offsets are used for constrained sources. Therefore, 	TokenNameCOMMENT_LINE	Offsets are used for constrained sources. Therefore, 
// the lookup values should never be used under offset. 	TokenNameCOMMENT_LINE	the lookup values should never be used under offset. 
// There is no SVG equivalent for this behavior. 	TokenNameCOMMENT_LINE	There is no SVG equivalent for this behavior. 
// These values are mapped to identity. 	TokenNameCOMMENT_LINE	These values are mapped to identity. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fill in string buffers 	TokenNameCOMMENT_LINE	Fill in string buffers 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nComponents	TokenNameIdentifier	 n Components
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// lookupTableBuf[j].append(Integer.toString(i)); 	TokenNameCOMMENT_LINE	lookupTableBuf[j].append(Integer.toString(i)); 
lookupTableBuf	TokenNameIdentifier	 lookup Table Buf
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fill in source array 	TokenNameCOMMENT_LINE	Fill in source array 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get destination values 	TokenNameCOMMENT_LINE	Get destination values 
lookupTable	TokenNameIdentifier	 lookup Table
.	TokenNameDOT	
lookupPixel	TokenNameIdentifier	 lookup Pixel
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill in string buffers 	TokenNameCOMMENT_LINE	Fill in string buffers 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nComponents	TokenNameIdentifier	 n Components
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lookupTableBuf	TokenNameIdentifier	 lookup Table Buf
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
nComponents	TokenNameIdentifier	 n Components
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
nComponents	TokenNameIdentifier	 n Components
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
lookupTable	TokenNameIdentifier	 lookup Table
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Offsets are used for constrained sources. Therefore, 	TokenNameCOMMENT_LINE	Offsets are used for constrained sources. Therefore, 
// the lookup values should never be used under offset. 	TokenNameCOMMENT_LINE	the lookup values should never be used under offset. 
// There is no SVG equivalent for this behavior. 	TokenNameCOMMENT_LINE	There is no SVG equivalent for this behavior. 
// These values are mapped to identity. 	TokenNameCOMMENT_LINE	These values are mapped to identity. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fill in string buffers 	TokenNameCOMMENT_LINE	Fill in string buffers 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nComponents	TokenNameIdentifier	 n Components
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// lookupTableBuf[j].append(Integer.toString(i)); 	TokenNameCOMMENT_LINE	lookupTableBuf[j].append(Integer.toString(i)); 
lookupTableBuf	TokenNameIdentifier	 lookup Table Buf
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fill in source array 	TokenNameCOMMENT_LINE	Fill in source array 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xff	TokenNameIntegerLiteral	
&	TokenNameAND	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get destination values 	TokenNameCOMMENT_LINE	Get destination values 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ByteLookupTable	TokenNameIdentifier	 Byte Lookup Table
)	TokenNameRPAREN	
lookupTable	TokenNameIdentifier	 lookup Table
)	TokenNameRPAREN	
.	TokenNameDOT	
lookupPixel	TokenNameIdentifier	 lookup Pixel
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fill in string buffers 	TokenNameCOMMENT_LINE	Fill in string buffers 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nComponents	TokenNameIdentifier	 n Components
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lookupTableBuf	TokenNameIdentifier	 lookup Table Buf
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0xff	TokenNameIntegerLiteral	
&	TokenNameAND	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookupTables	TokenNameIdentifier	 lookup Tables
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
nComponents	TokenNameIdentifier	 n Components
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nComponents	TokenNameIdentifier	 n Components
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
lookupTables	TokenNameIdentifier	 lookup Tables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookupTableBuf	TokenNameIdentifier	 lookup Table Buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*for(int i=0; i<lookupTables.length; i++){ System.out.println(lookupTables[i]); }*/	TokenNameCOMMENT_BLOCK	for(int i=0; i<lookupTables.length; i++){ System.out.println(lookupTables[i]); }
return	TokenNamereturn	
lookupTables	TokenNameIdentifier	 lookup Tables
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
