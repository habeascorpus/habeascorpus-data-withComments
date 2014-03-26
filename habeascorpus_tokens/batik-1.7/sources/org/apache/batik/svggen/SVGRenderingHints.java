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
RenderingHints	TokenNameIdentifier	 Rendering Hints
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
/** * Utility class that converts a RenderingHints object into * a set of SVG properties. Here is how individual hints * are converted. * + RENDERING -> sets all other hints to * initial value. * + FRACTIONAL_METRICS -> sets initial values for * text-rendering and shape-rendering. * + ALPHA_INTERPOLATION -> Not mapped * + ANTIALIASING -> shape-rendering and text-rendering * + COLOR_RENDERING -> color-rendering * + DITHERING -> not mapped * + INTERPOLATION -> image-rendering * + TEXT_ANTIALIASING -> text-rendering * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGRenderingHints.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a RenderingHints object into a set of SVG properties. Here is how individual hints are converted. + RENDERING -> sets all other hints to initial value. + FRACTIONAL_METRICS -> sets initial values for text-rendering and shape-rendering. + ALPHA_INTERPOLATION -> Not mapped + ANTIALIASING -> shape-rendering and text-rendering + COLOR_RENDERING -> color-rendering + DITHERING -> not mapped + INTERPOLATION -> image-rendering + TEXT_ANTIALIASING -> text-rendering * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGRenderingHints.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGRenderingHints	TokenNameIdentifier	 SVG Rendering Hints
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
/** * @param generatorContext used by converter to handle precision * or to create elements. */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used by converter to handle precision or to create elements. 
public	TokenNamepublic	
SVGRenderingHints	TokenNameIdentifier	 SVG Rendering Hints
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
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param hints RenderingHints object which should be converted * to a set of SVG attributes. * @return map Map of attribute values that describe the hints */	TokenNameCOMMENT_JAVADOC	 @param hints RenderingHints object which should be converted to a set of SVG attributes. @return map Map of attribute values that describe the hints 
public	TokenNamepublic	
static	TokenNamestatic	
SVGHintsDescriptor	TokenNameIdentifier	 SVG Hints Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no hints should mean default 	TokenNameCOMMENT_LINE	no hints should mean default 
String	TokenNameIdentifier	 String
colorInterpolation	TokenNameIdentifier	 color Interpolation
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
colorRendering	TokenNameIdentifier	 color Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
imageRendering	TokenNameIdentifier	 image Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// RENDERING 	TokenNameCOMMENT_LINE	RENDERING 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
rendering	TokenNameIdentifier	 rendering
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_RENDERING	TokenNameIdentifier	 KEY  RENDERING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rendering	TokenNameIdentifier	 rendering
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_RENDER_DEFAULT	TokenNameIdentifier	 VALUE  RENDER  DEFAULT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
colorInterpolation	TokenNameIdentifier	 color Interpolation
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
colorRendering	TokenNameIdentifier	 color Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
imageRendering	TokenNameIdentifier	 image Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rendering	TokenNameIdentifier	 rendering
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_RENDER_SPEED	TokenNameIdentifier	 VALUE  RENDER  SPEED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
colorInterpolation	TokenNameIdentifier	 color Interpolation
=	TokenNameEQUAL	
SVG_SRGB_VALUE	TokenNameIdentifier	 SVG  SRGB  VALUE
;	TokenNameSEMICOLON	
colorRendering	TokenNameIdentifier	 color Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_SPEED_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  SPEED  VALUE
;	TokenNameSEMICOLON	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_SPEED_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  SPEED  VALUE
;	TokenNameSEMICOLON	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_GEOMETRIC_PRECISION_VALUE	TokenNameIdentifier	 SVG  GEOMETRIC  PRECISION  VALUE
;	TokenNameSEMICOLON	
imageRendering	TokenNameIdentifier	 image Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_SPEED_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  SPEED  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rendering	TokenNameIdentifier	 rendering
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_RENDER_QUALITY	TokenNameIdentifier	 VALUE  RENDER  QUALITY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
colorInterpolation	TokenNameIdentifier	 color Interpolation
=	TokenNameEQUAL	
SVG_LINEAR_RGB_VALUE	TokenNameIdentifier	 SVG  LINEAR  RGB  VALUE
;	TokenNameSEMICOLON	
colorRendering	TokenNameIdentifier	 color Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_QUALITY_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  QUALITY  VALUE
;	TokenNameSEMICOLON	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_QUALITY_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  QUALITY  VALUE
;	TokenNameSEMICOLON	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_GEOMETRIC_PRECISION_VALUE	TokenNameIdentifier	 SVG  GEOMETRIC  PRECISION  VALUE
;	TokenNameSEMICOLON	
imageRendering	TokenNameIdentifier	 image Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_QUALITY_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  QUALITY  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Fractional Metrics 	TokenNameCOMMENT_LINE	Fractional Metrics 
// 	TokenNameCOMMENT_LINE	 
Object	TokenNameIdentifier	 Object
fractionalMetrics	TokenNameIdentifier	 fractional Metrics
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_FRACTIONALMETRICS	TokenNameIdentifier	 KEY  FRACTIONALMETRICS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fractionalMetrics	TokenNameIdentifier	 fractional Metrics
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_FRACTIONALMETRICS_ON	TokenNameIdentifier	 VALUE  FRACTIONALMETRICS  ON
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_QUALITY_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  QUALITY  VALUE
;	TokenNameSEMICOLON	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_GEOMETRIC_PRECISION_VALUE	TokenNameIdentifier	 SVG  GEOMETRIC  PRECISION  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fractionalMetrics	TokenNameIdentifier	 fractional Metrics
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_FRACTIONALMETRICS_OFF	TokenNameIdentifier	 VALUE  FRACTIONALMETRICS  OFF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_SPEED_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  SPEED  VALUE
;	TokenNameSEMICOLON	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_SPEED_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  SPEED  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fractionalMetrics	TokenNameIdentifier	 fractional Metrics
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_FRACTIONALMETRICS_DEFAULT	TokenNameIdentifier	 VALUE  FRACTIONALMETRICS  DEFAULT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Antialiasing 	TokenNameCOMMENT_LINE	Antialiasing 
// 	TokenNameCOMMENT_LINE	 
Object	TokenNameIdentifier	 Object
antialiasing	TokenNameIdentifier	 antialiasing
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_ANTIALIASING	TokenNameIdentifier	 KEY  ANTIALIASING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
antialiasing	TokenNameIdentifier	 antialiasing
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_ANTIALIAS_ON	TokenNameIdentifier	 VALUE  ANTIALIAS  ON
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_LEGIBILITY_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  LEGIBILITY  VALUE
;	TokenNameSEMICOLON	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
antialiasing	TokenNameIdentifier	 antialiasing
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_ANTIALIAS_OFF	TokenNameIdentifier	 VALUE  ANTIALIAS  OFF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_GEOMETRIC_PRECISION_VALUE	TokenNameIdentifier	 SVG  GEOMETRIC  PRECISION  VALUE
;	TokenNameSEMICOLON	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_CRISP_EDGES_VALUE	TokenNameIdentifier	 SVG  CRISP  EDGES  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
antialiasing	TokenNameIdentifier	 antialiasing
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_ANTIALIAS_DEFAULT	TokenNameIdentifier	 VALUE  ANTIALIAS  DEFAULT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Text Antialiasing 	TokenNameCOMMENT_LINE	Text Antialiasing 
// 	TokenNameCOMMENT_LINE	 
Object	TokenNameIdentifier	 Object
textAntialiasing	TokenNameIdentifier	 text Antialiasing
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_TEXT_ANTIALIASING	TokenNameIdentifier	 KEY  TEXT  ANTIALIASING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
textAntialiasing	TokenNameIdentifier	 text Antialiasing
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_TEXT_ANTIALIAS_ON	TokenNameIdentifier	 VALUE  TEXT  ANTIALIAS  ON
)	TokenNameRPAREN	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_GEOMETRIC_PRECISION_VALUE	TokenNameIdentifier	 SVG  GEOMETRIC  PRECISION  VALUE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
textAntialiasing	TokenNameIdentifier	 text Antialiasing
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_TEXT_ANTIALIAS_OFF	TokenNameIdentifier	 VALUE  TEXT  ANTIALIAS  OFF
)	TokenNameRPAREN	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_SPEED_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  SPEED  VALUE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
textAntialiasing	TokenNameIdentifier	 text Antialiasing
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_TEXT_ANTIALIAS_DEFAULT	TokenNameIdentifier	 VALUE  TEXT  ANTIALIAS  DEFAULT
)	TokenNameRPAREN	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Color Rendering 	TokenNameCOMMENT_LINE	Color Rendering 
// 	TokenNameCOMMENT_LINE	 
Object	TokenNameIdentifier	 Object
colorRenderingHint	TokenNameIdentifier	 color Rendering Hint
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_COLOR_RENDERING	TokenNameIdentifier	 KEY  COLOR  RENDERING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colorRenderingHint	TokenNameIdentifier	 color Rendering Hint
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_COLOR_RENDER_DEFAULT	TokenNameIdentifier	 VALUE  COLOR  RENDER  DEFAULT
)	TokenNameRPAREN	
colorRendering	TokenNameIdentifier	 color Rendering
=	TokenNameEQUAL	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
colorRenderingHint	TokenNameIdentifier	 color Rendering Hint
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_COLOR_RENDER_QUALITY	TokenNameIdentifier	 VALUE  COLOR  RENDER  QUALITY
)	TokenNameRPAREN	
colorRendering	TokenNameIdentifier	 color Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_QUALITY_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  QUALITY  VALUE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
colorRenderingHint	TokenNameIdentifier	 color Rendering Hint
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_COLOR_RENDER_SPEED	TokenNameIdentifier	 VALUE  COLOR  RENDER  SPEED
)	TokenNameRPAREN	
colorRendering	TokenNameIdentifier	 color Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_SPEED_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  SPEED  VALUE
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Interpolation 	TokenNameCOMMENT_LINE	Interpolation 
// 	TokenNameCOMMENT_LINE	 
Object	TokenNameIdentifier	 Object
interpolation	TokenNameIdentifier	 interpolation
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_INTERPOLATION	TokenNameIdentifier	 KEY  INTERPOLATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
interpolation	TokenNameIdentifier	 interpolation
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_INTERPOLATION_NEAREST_NEIGHBOR	TokenNameIdentifier	 VALUE  INTERPOLATION  NEAREST  NEIGHBOR
)	TokenNameRPAREN	
imageRendering	TokenNameIdentifier	 image Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_SPEED_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  SPEED  VALUE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
interpolation	TokenNameIdentifier	 interpolation
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_INTERPOLATION_BICUBIC	TokenNameIdentifier	 VALUE  INTERPOLATION  BICUBIC
||	TokenNameOR_OR	
interpolation	TokenNameIdentifier	 interpolation
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_INTERPOLATION_BILINEAR	TokenNameIdentifier	 VALUE  INTERPOLATION  BILINEAR
)	TokenNameRPAREN	
imageRendering	TokenNameIdentifier	 image Rendering
=	TokenNameEQUAL	
SVG_OPTIMIZE_QUALITY_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  QUALITY  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if(hints != null) 	TokenNameCOMMENT_LINE	if(hints != null) 
return	TokenNamereturn	
new	TokenNamenew	
SVGHintsDescriptor	TokenNameIdentifier	 SVG Hints Descriptor
(	TokenNameLPAREN	
colorInterpolation	TokenNameIdentifier	 color Interpolation
,	TokenNameCOMMA	
colorRendering	TokenNameIdentifier	 color Rendering
,	TokenNameCOMMA	
textRendering	TokenNameIdentifier	 text Rendering
,	TokenNameCOMMA	
shapeRendering	TokenNameIdentifier	 shape Rendering
,	TokenNameCOMMA	
imageRendering	TokenNameIdentifier	 image Rendering
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
