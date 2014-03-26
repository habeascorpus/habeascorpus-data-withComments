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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
;	TokenNameSEMICOLON	
/** * This class performs the task of converting the state of the * Java 2D API graphic context into a set of graphic attributes. * It also manages a set of SVG definitions referenced by the * SVG attributes. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGGraphicContextConverter.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class performs the task of converting the state of the Java 2D API graphic context into a set of graphic attributes. It also manages a set of SVG definitions referenced by the SVG attributes. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGGraphicContextConverter.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGGraphicContextConverter	TokenNameIdentifier	 SVG Graphic Context Converter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GRAPHIC_CONTEXT_CONVERTER_COUNT	TokenNameIdentifier	 GRAPHIC  CONTEXT  CONVERTER  COUNT
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGTransform	TokenNameIdentifier	 SVG Transform
transformConverter	TokenNameIdentifier	 transform Converter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGPaint	TokenNameIdentifier	 SVG Paint
paintConverter	TokenNameIdentifier	 paint Converter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGBasicStroke	TokenNameIdentifier	 SVG Basic Stroke
strokeConverter	TokenNameIdentifier	 stroke Converter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGComposite	TokenNameIdentifier	 SVG Composite
compositeConverter	TokenNameIdentifier	 composite Converter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGClip	TokenNameIdentifier	 SVG Clip
clipConverter	TokenNameIdentifier	 clip Converter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGRenderingHints	TokenNameIdentifier	 SVG Rendering Hints
hintsConverter	TokenNameIdentifier	 hints Converter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGFont	TokenNameIdentifier	 SVG Font
fontConverter	TokenNameIdentifier	 font Converter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SVGConverter	TokenNameIdentifier	 SVG Converter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
converters	TokenNameIdentifier	 converters
=	TokenNameEQUAL	
new	TokenNamenew	
SVGConverter	TokenNameIdentifier	 SVG Converter
[	TokenNameLBRACKET	
GRAPHIC_CONTEXT_CONVERTER_COUNT	TokenNameIdentifier	 GRAPHIC  CONTEXT  CONVERTER  COUNT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
getTransformConverter	TokenNameIdentifier	 get Transform Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transformConverter	TokenNameIdentifier	 transform Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGPaint	TokenNameIdentifier	 SVG Paint
getPaintConverter	TokenNameIdentifier	 get Paint Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
paintConverter	TokenNameIdentifier	 paint Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGBasicStroke	TokenNameIdentifier	 SVG Basic Stroke
getStrokeConverter	TokenNameIdentifier	 get Stroke Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strokeConverter	TokenNameIdentifier	 stroke Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGComposite	TokenNameIdentifier	 SVG Composite
getCompositeConverter	TokenNameIdentifier	 get Composite Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compositeConverter	TokenNameIdentifier	 composite Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGClip	TokenNameIdentifier	 SVG Clip
getClipConverter	TokenNameIdentifier	 get Clip Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clipConverter	TokenNameIdentifier	 clip Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGRenderingHints	TokenNameIdentifier	 SVG Rendering Hints
getHintsConverter	TokenNameIdentifier	 get Hints Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hintsConverter	TokenNameIdentifier	 hints Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGFont	TokenNameIdentifier	 SVG Font
getFontConverter	TokenNameIdentifier	 get Font Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fontConverter	TokenNameIdentifier	 font Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param generatorContext the context that will be used to create * elements, handle extension and images. */	TokenNameCOMMENT_JAVADOC	 @param generatorContext the context that will be used to create elements, handle extension and images. 
public	TokenNamepublic	
SVGGraphicContextConverter	TokenNameIdentifier	 SVG Graphic Context Converter
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_CONTEXT_NULL	TokenNameIdentifier	 ERR  CONTEXT  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformConverter	TokenNameIdentifier	 transform Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransform	TokenNameIdentifier	 SVG Transform
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintConverter	TokenNameIdentifier	 paint Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGPaint	TokenNameIdentifier	 SVG Paint
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strokeConverter	TokenNameIdentifier	 stroke Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGBasicStroke	TokenNameIdentifier	 SVG Basic Stroke
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeConverter	TokenNameIdentifier	 composite Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clipConverter	TokenNameIdentifier	 clip Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGClip	TokenNameIdentifier	 SVG Clip
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hintsConverter	TokenNameIdentifier	 hints Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGRenderingHints	TokenNameIdentifier	 SVG Rendering Hints
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontConverter	TokenNameIdentifier	 font Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGFont	TokenNameIdentifier	 SVG Font
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
converters	TokenNameIdentifier	 converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
paintConverter	TokenNameIdentifier	 paint Converter
;	TokenNameSEMICOLON	
converters	TokenNameIdentifier	 converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
strokeConverter	TokenNameIdentifier	 stroke Converter
;	TokenNameSEMICOLON	
converters	TokenNameIdentifier	 converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
compositeConverter	TokenNameIdentifier	 composite Converter
;	TokenNameSEMICOLON	
converters	TokenNameIdentifier	 converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
clipConverter	TokenNameIdentifier	 clip Converter
;	TokenNameSEMICOLON	
converters	TokenNameIdentifier	 converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hintsConverter	TokenNameIdentifier	 hints Converter
;	TokenNameSEMICOLON	
converters	TokenNameIdentifier	 converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fontConverter	TokenNameIdentifier	 font Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return a String containing the transform attribute value * equivalent of the input transform stack. */	TokenNameCOMMENT_JAVADOC	 @return a String containing the transform attribute value equivalent of the input transform stack. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformStack	TokenNameIdentifier	 transform Stack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transformConverter	TokenNameIdentifier	 transform Converter
.	TokenNameDOT	
toSVGTransform	TokenNameIdentifier	 to SVG Transform
(	TokenNameLPAREN	
transformStack	TokenNameIdentifier	 transform Stack
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return an object that describes the set of SVG attributes that * represent the equivalent of the input GraphicContext state. */	TokenNameCOMMENT_JAVADOC	 @return an object that describes the set of SVG attributes that represent the equivalent of the input GraphicContext state. 
public	TokenNamepublic	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no need for synchronized map => use HashMap 	TokenNameCOMMENT_LINE	no need for synchronized map => use HashMap 
Map	TokenNameIdentifier	 Map
groupAttrMap	TokenNameIdentifier	 group Attr Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
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
i	TokenNameIdentifier	 i
<	TokenNameLESS	
converters	TokenNameIdentifier	 converters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
converters	TokenNameIdentifier	 converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getAttributeMap	TokenNameIdentifier	 get Attribute Map
(	TokenNameLPAREN	
groupAttrMap	TokenNameIdentifier	 group Attr Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// the ctor will to the splitting (group/element) job 	TokenNameCOMMENT_LINE	the ctor will to the splitting (group/element) job 
return	TokenNamereturn	
new	TokenNamenew	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
(	TokenNameLPAREN	
groupAttrMap	TokenNameIdentifier	 group Attr Map
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getTransformStack	TokenNameIdentifier	 get Transform Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return a set of element containing definitions for the attribute * values generated by this converter since its creation. */	TokenNameCOMMENT_JAVADOC	 @return a set of element containing definitions for the attribute values generated by this converter since its creation. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
defSet	TokenNameIdentifier	 def Set
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
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
i	TokenNameIdentifier	 i
<	TokenNameLESS	
converters	TokenNameIdentifier	 converters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
converters	TokenNameIdentifier	 converters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defSet	TokenNameIdentifier	 def Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
