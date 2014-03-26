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
Color	TokenNameIdentifier	 Color
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
TexturePaint	TokenNameIdentifier	 Texture Paint
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
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
GraphicContext	TokenNameIdentifier	 Graphic Context
;	TokenNameSEMICOLON	
/** * Utility class that converts a Paint object into an * SVG element. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGPaint.java 475477 2006-11-15 22:44:28Z cam $ * @see org.apache.batik.svggen.SVGLinearGradient * @see org.apache.batik.svggen.SVGTexturePaint */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Paint object into an SVG element. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGPaint.java 475477 2006-11-15 22:44:28Z cam $ @see org.apache.batik.svggen.SVGLinearGradient @see org.apache.batik.svggen.SVGTexturePaint 
public	TokenNamepublic	
class	TokenNameclass	
SVGPaint	TokenNameIdentifier	 SVG Paint
implements	TokenNameimplements	
SVGConverter	TokenNameIdentifier	 SVG Converter
{	TokenNameLBRACE	
/** * All GradientPaint convertions are handed to svgLinearGradient */	TokenNameCOMMENT_JAVADOC	 All GradientPaint convertions are handed to svgLinearGradient 
private	TokenNameprivate	
SVGLinearGradient	TokenNameIdentifier	 SVG Linear Gradient
svgLinearGradient	TokenNameIdentifier	 svg Linear Gradient
;	TokenNameSEMICOLON	
/** * All TexturePaint convertions are handed to svgTextureGradient */	TokenNameCOMMENT_JAVADOC	 All TexturePaint convertions are handed to svgTextureGradient 
private	TokenNameprivate	
SVGTexturePaint	TokenNameIdentifier	 SVG Texture Paint
svgTexturePaint	TokenNameIdentifier	 svg Texture Paint
;	TokenNameSEMICOLON	
/** * All Color convertions are handed to svgColor */	TokenNameCOMMENT_JAVADOC	 All Color convertions are handed to svgColor 
private	TokenNameprivate	
SVGColor	TokenNameIdentifier	 SVG Color
svgColor	TokenNameIdentifier	 svg Color
;	TokenNameSEMICOLON	
/** * All custom Paint convetions are handed to svgCustomPaint */	TokenNameCOMMENT_JAVADOC	 All custom Paint convetions are handed to svgCustomPaint 
private	TokenNameprivate	
SVGCustomPaint	TokenNameIdentifier	 SVG Custom Paint
svgCustomPaint	TokenNameIdentifier	 svg Custom Paint
;	TokenNameSEMICOLON	
/** * Used to generate DOM elements */	TokenNameCOMMENT_JAVADOC	 Used to generate DOM elements 
private	TokenNameprivate	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
;	TokenNameSEMICOLON	
/** * @param generatorContext the context. */	TokenNameCOMMENT_JAVADOC	 @param generatorContext the context. 
public	TokenNamepublic	
SVGPaint	TokenNameIdentifier	 SVG Paint
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
svgLinearGradient	TokenNameIdentifier	 svg Linear Gradient
=	TokenNameEQUAL	
new	TokenNamenew	
SVGLinearGradient	TokenNameIdentifier	 SVG Linear Gradient
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
svgTexturePaint	TokenNameIdentifier	 svg Texture Paint
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTexturePaint	TokenNameIdentifier	 SVG Texture Paint
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
svgCustomPaint	TokenNameIdentifier	 svg Custom Paint
=	TokenNameEQUAL	
new	TokenNamenew	
SVGCustomPaint	TokenNameIdentifier	 SVG Custom Paint
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
svgColor	TokenNameIdentifier	 svg Color
=	TokenNameEQUAL	
new	TokenNamenew	
SVGColor	TokenNameIdentifier	 SVG Color
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
generatorContext	TokenNameIdentifier	 generator Context
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Set of Elements defining the Paints this * converter has processed since it was created */	TokenNameCOMMENT_JAVADOC	 @return Set of Elements defining the Paints this converter has processed since it was created 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
paintDefs	TokenNameIdentifier	 paint Defs
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
svgLinearGradient	TokenNameIdentifier	 svg Linear Gradient
.	TokenNameDOT	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintDefs	TokenNameIdentifier	 paint Defs
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
svgTexturePaint	TokenNameIdentifier	 svg Texture Paint
.	TokenNameDOT	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintDefs	TokenNameIdentifier	 paint Defs
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
svgCustomPaint	TokenNameIdentifier	 svg Custom Paint
.	TokenNameDOT	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintDefs	TokenNameIdentifier	 paint Defs
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
svgColor	TokenNameIdentifier	 svg Color
.	TokenNameDOT	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paintDefs	TokenNameIdentifier	 paint Defs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGTexturePaint	TokenNameIdentifier	 SVG Texture Paint
getTexturePaintConverter	TokenNameIdentifier	 get Texture Paint Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgTexturePaint	TokenNameIdentifier	 svg Texture Paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGLinearGradient	TokenNameIdentifier	 SVG Linear Gradient
getGradientPaintConverter	TokenNameIdentifier	 get Gradient Paint Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgLinearGradient	TokenNameIdentifier	 svg Linear Gradient
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGCustomPaint	TokenNameIdentifier	 SVG Custom Paint
getCustomPaintConverter	TokenNameIdentifier	 get Custom Paint Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgCustomPaint	TokenNameIdentifier	 svg Custom Paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGColor	TokenNameIdentifier	 SVG Color
getColorConverter	TokenNameIdentifier	 get Color Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgColor	TokenNameIdentifier	 svg Color
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
getPaint	TokenNameIdentifier	 get Paint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param paint Paint to be converted to SVG * @return a descriptor of the corresponding SVG paint */	TokenNameCOMMENT_JAVADOC	 @param paint Paint to be converted to SVG @return a descriptor of the corresponding SVG paint 
public	TokenNamepublic	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we first try the extension handler because we may 	TokenNameCOMMENT_LINE	we first try the extension handler because we may 
// want to override the way a Paint is managed! 	TokenNameCOMMENT_LINE	want to override the way a Paint is managed! 
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
paintDesc	TokenNameIdentifier	 paint Desc
=	TokenNameEQUAL	
svgCustomPaint	TokenNameIdentifier	 svg Custom Paint
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paintDesc	TokenNameIdentifier	 paint Desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
instanceof	TokenNameinstanceof	
Color	TokenNameIdentifier	 Color
)	TokenNameRPAREN	
paintDesc	TokenNameIdentifier	 paint Desc
=	TokenNameEQUAL	
SVGColor	TokenNameIdentifier	 SVG Color
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
)	TokenNameRPAREN	
paint	TokenNameIdentifier	 paint
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
instanceof	TokenNameinstanceof	
GradientPaint	TokenNameIdentifier	 Gradient Paint
)	TokenNameRPAREN	
paintDesc	TokenNameIdentifier	 paint Desc
=	TokenNameEQUAL	
svgLinearGradient	TokenNameIdentifier	 svg Linear Gradient
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GradientPaint	TokenNameIdentifier	 Gradient Paint
)	TokenNameRPAREN	
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
instanceof	TokenNameinstanceof	
TexturePaint	TokenNameIdentifier	 Texture Paint
)	TokenNameRPAREN	
paintDesc	TokenNameIdentifier	 paint Desc
=	TokenNameEQUAL	
svgTexturePaint	TokenNameIdentifier	 svg Texture Paint
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TexturePaint	TokenNameIdentifier	 Texture Paint
)	TokenNameRPAREN	
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
paintDesc	TokenNameIdentifier	 paint Desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
