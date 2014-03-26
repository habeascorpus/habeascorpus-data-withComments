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
ConvolveOp	TokenNameIdentifier	 Convolve Op
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Kernel	TokenNameIdentifier	 Kernel
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
/** * Utility class that converts a ConvolveOp object into * an SVG filter descriptor. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGConvolveOp.java 476924 2006-11-19 21:13:26Z dvholten $ * @see org.apache.batik.svggen.SVGBufferedImageOp */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a ConvolveOp object into an SVG filter descriptor. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGConvolveOp.java 476924 2006-11-19 21:13:26Z dvholten $ @see org.apache.batik.svggen.SVGBufferedImageOp 
public	TokenNamepublic	
class	TokenNameclass	
SVGConvolveOp	TokenNameIdentifier	 SVG Convolve Op
extends	TokenNameextends	
AbstractSVGFilterConverter	TokenNameIdentifier	 Abstract SVG Filter Converter
{	TokenNameLBRACE	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGConvolveOp	TokenNameIdentifier	 SVG Convolve Op
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
ConvolveOp	TokenNameIdentifier	 Convolve Op
)	TokenNameRPAREN	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ConvolveOp	TokenNameIdentifier	 Convolve Op
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param convolveOp the ConvolveOp to be converted * @return a description of the SVG filter corresponding to * convolveOp. The definition of the feConvolveMatrix * filter in put in feConvolveMatrixDefSet */	TokenNameCOMMENT_JAVADOC	 @param convolveOp the ConvolveOp to be converted @return a description of the SVG filter corresponding to convolveOp. The definition of the feConvolveMatrix filter in put in feConvolveMatrixDefSet 
public	TokenNamepublic	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
ConvolveOp	TokenNameIdentifier	 Convolve Op
convolveOp	TokenNameIdentifier	 convolve Op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reuse definition if convolveOp has already been converted 	TokenNameCOMMENT_LINE	Reuse definition if convolveOp has already been converted 
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
convolveOp	TokenNameIdentifier	 convolve Op
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
Kernel	TokenNameIdentifier	 Kernel
kernel	TokenNameIdentifier	 kernel
=	TokenNameEQUAL	
convolveOp	TokenNameIdentifier	 convolve Op
.	TokenNameDOT	
getKernel	TokenNameIdentifier	 get Kernel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
feConvolveMatrixDef	TokenNameIdentifier	 fe Convolve Matrix Def
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_CONVOLVE_MATRIX_TAG	TokenNameIdentifier	 SVG  FE  CONVOLVE  MATRIX  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Convert the kernel size 	TokenNameCOMMENT_LINE	Convert the kernel size 
feConvolveMatrixDef	TokenNameIdentifier	 fe Convolve Matrix Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ORDER_ATTRIBUTE	TokenNameIdentifier	 SVG  ORDER  ATTRIBUTE
,	TokenNameCOMMA	
kernel	TokenNameIdentifier	 kernel
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
SPACE	TokenNameIdentifier	 SPACE
+	TokenNamePLUS	
kernel	TokenNameIdentifier	 kernel
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Convert the kernel values 	TokenNameCOMMENT_LINE	Convert the kernel values 
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
kernel	TokenNameIdentifier	 kernel
.	TokenNameDOT	
getKernelData	TokenNameIdentifier	 get Kernel Data
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
kernelMatrixBuf	TokenNameIdentifier	 kernel Matrix Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
kernelMatrixBuf	TokenNameIdentifier	 kernel Matrix Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kernelMatrixBuf	TokenNameIdentifier	 kernel Matrix Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
feConvolveMatrixDef	TokenNameIdentifier	 fe Convolve Matrix Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_KERNEL_MATRIX_ATTRIBUTE	TokenNameIdentifier	 SVG  KERNEL  MATRIX  ATTRIBUTE
,	TokenNameCOMMA	
kernelMatrixBuf	TokenNameIdentifier	 kernel Matrix Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterDef	TokenNameIdentifier	 filter Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feConvolveMatrixDef	TokenNameIdentifier	 fe Convolve Matrix Def
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
ID_PREFIX_FE_CONVOLVE_MATRIX	TokenNameIdentifier	 ID  PREFIX  FE  CONVOLVE  MATRIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Convert the edge mode 	TokenNameCOMMENT_LINE	Convert the edge mode 
if	TokenNameif	
(	TokenNameLPAREN	
convolveOp	TokenNameIdentifier	 convolve Op
.	TokenNameDOT	
getEdgeCondition	TokenNameIdentifier	 get Edge Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ConvolveOp	TokenNameIdentifier	 Convolve Op
.	TokenNameDOT	
EDGE_NO_OP	TokenNameIdentifier	 EDGE  NO  OP
)	TokenNameRPAREN	
feConvolveMatrixDef	TokenNameIdentifier	 fe Convolve Matrix Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_EDGE_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  EDGE  MODE  ATTRIBUTE
,	TokenNameCOMMA	
SVG_DUPLICATE_VALUE	TokenNameIdentifier	 SVG  DUPLICATE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
feConvolveMatrixDef	TokenNameIdentifier	 fe Convolve Matrix Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_EDGE_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  EDGE  MODE  ATTRIBUTE
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Create a filter descriptor 	TokenNameCOMMENT_LINE	Create a filter descriptor 
// 	TokenNameCOMMENT_LINE	 
// Process filter attribute 	TokenNameCOMMENT_LINE	Process filter attribute 
StringBuffer	TokenNameIdentifier	 String Buffer
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
URL_PREFIX	TokenNameIdentifier	 URL  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SIGN_POUND	TokenNameIdentifier	 SIGN  POUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
filterDef	TokenNameIdentifier	 filter Def
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
URL_SUFFIX	TokenNameIdentifier	 URL  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterDesc	TokenNameIdentifier	 filter Desc
=	TokenNameEQUAL	
new	TokenNamenew	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
(	TokenNameLPAREN	
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
convolveOp	TokenNameIdentifier	 convolve Op
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
