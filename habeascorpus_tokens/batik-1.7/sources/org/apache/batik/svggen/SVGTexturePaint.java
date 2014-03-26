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
Graphics2D	TokenNameIdentifier	 Graphics2 D
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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
BufferedImage	TokenNameIdentifier	 Buffered Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
RenderedImage	TokenNameIdentifier	 Rendered Image
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
/** * Utility class that converts a TexturePaint object into an * SVG pattern element * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGTexturePaint.java 476924 2006-11-19 21:13:26Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a TexturePaint object into an SVG pattern element * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGTexturePaint.java 476924 2006-11-19 21:13:26Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGTexturePaint	TokenNameIdentifier	 SVG Texture Paint
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGTexturePaint	TokenNameIdentifier	 SVG Texture Paint
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
(	TokenNameLPAREN	
TexturePaint	TokenNameIdentifier	 Texture Paint
)	TokenNameRPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getPaint	TokenNameIdentifier	 get Paint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param texture the TexturePaint to be converted * @return a descriptor whose paint value references * a pattern. The definition of the * pattern in put in the patternDefsMap */	TokenNameCOMMENT_JAVADOC	 @param texture the TexturePaint to be converted @return a descriptor whose paint value references a pattern. The definition of the pattern in put in the patternDefsMap 
public	TokenNamepublic	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
TexturePaint	TokenNameIdentifier	 Texture Paint
texture	TokenNameIdentifier	 texture
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reuse definition if pattern has already been converted 	TokenNameCOMMENT_LINE	Reuse definition if pattern has already been converted 
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
patternDesc	TokenNameIdentifier	 pattern Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
)	TokenNameRPAREN	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
texture	TokenNameIdentifier	 texture
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
patternDesc	TokenNameIdentifier	 pattern Desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
anchorRect	TokenNameIdentifier	 anchor Rect
=	TokenNameEQUAL	
texture	TokenNameIdentifier	 texture
.	TokenNameDOT	
getAnchorRect	TokenNameIdentifier	 get Anchor Rect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
patternDef	TokenNameIdentifier	 pattern Def
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_PATTERN_TAG	TokenNameIdentifier	 SVG  PATTERN  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternDef	TokenNameIdentifier	 pattern Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_PATTERN_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  PATTERN  UNITS  ATTRIBUTE
,	TokenNameCOMMA	
SVG_USER_SPACE_ON_USE_VALUE	TokenNameIdentifier	 SVG  USER  SPACE  ON  USE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// First, set the pattern anchor 	TokenNameCOMMENT_LINE	First, set the pattern anchor 
// 	TokenNameCOMMENT_LINE	 
patternDef	TokenNameIdentifier	 pattern Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternDef	TokenNameIdentifier	 pattern Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternDef	TokenNameIdentifier	 pattern Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternDef	TokenNameIdentifier	 pattern Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
,	TokenNameCOMMA	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Now, add an image element for the image. 	TokenNameCOMMENT_LINE	Now, add an image element for the image. 
// 	TokenNameCOMMENT_LINE	 
BufferedImage	TokenNameIdentifier	 Buffered Image
textureImage	TokenNameIdentifier	 texture Image
=	TokenNameEQUAL	
texture	TokenNameIdentifier	 texture
.	TokenNameDOT	
getImage	TokenNameIdentifier	 get Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Rescale the image to fit the anchor rectangle 	TokenNameCOMMENT_LINE	Rescale the image to fit the anchor rectangle 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Rescale only if necessary 	TokenNameCOMMENT_LINE	Rescale only if necessary 
if	TokenNameif	
(	TokenNameLPAREN	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Rescale only if anchor area is not a point or a line 	TokenNameCOMMENT_LINE	Rescale only if anchor area is not a point or a line 
if	TokenNameif	
(	TokenNameLPAREN	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
scaleX	TokenNameIdentifier	 scale X
=	TokenNameEQUAL	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
scaleY	TokenNameIdentifier	 scale Y
=	TokenNameEQUAL	
anchorRect	TokenNameIdentifier	 anchor Rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
newImage	TokenNameIdentifier	 new Image
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
scaleX	TokenNameIdentifier	 scale X
*	TokenNameMULTIPLY	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
scaleY	TokenNameIdentifier	 scale Y
*	TokenNameMULTIPLY	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_INT_ARGB	TokenNameIdentifier	 TYPE  INT  ARGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
newImage	TokenNameIdentifier	 new Image
.	TokenNameDOT	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
scaleY	TokenNameIdentifier	 scale Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
textureImage	TokenNameIdentifier	 texture Image
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textureImage	TokenNameIdentifier	 texture Image
=	TokenNameEQUAL	
newImage	TokenNameIdentifier	 new Image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// generatorContext.imageHandler. 	TokenNameCOMMENT_LINE	generatorContext.imageHandler. 
// handleImage((RenderedImage)textureImage, imageElement, 	TokenNameCOMMENT_LINE	handleImage((RenderedImage)textureImage, imageElement, 
// generatorContext); 	TokenNameCOMMENT_LINE	generatorContext); 
Element	TokenNameIdentifier	 Element
patternContent	TokenNameIdentifier	 pattern Content
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
genericImageHandler	TokenNameIdentifier	 generic Image Handler
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
genericImageHandler	TokenNameIdentifier	 generic Image Handler
.	TokenNameDOT	
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
)	TokenNameRPAREN	
textureImage	TokenNameIdentifier	 texture Image
,	TokenNameCOMMA	
patternContent	TokenNameIdentifier	 pattern Content
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
textureImage	TokenNameIdentifier	 texture Image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternDef	TokenNameIdentifier	 pattern Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
patternContent	TokenNameIdentifier	 pattern Content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternDef	TokenNameIdentifier	 pattern Def
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
ID_PREFIX_PATTERN	TokenNameIdentifier	 ID  PREFIX  PATTERN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// StringBuffer patternAttrBuf = new StringBuffer(URL_PREFIX); 	TokenNameCOMMENT_LINE	StringBuffer patternAttrBuf = new StringBuffer(URL_PREFIX); 
// patternAttrBuf.append(SIGN_POUND); 	TokenNameCOMMENT_LINE	patternAttrBuf.append(SIGN_POUND); 
// patternAttrBuf.append(patternDef.getAttributeNS(null, SVG_ID_ATTRIBUTE)); 	TokenNameCOMMENT_LINE	patternAttrBuf.append(patternDef.getAttributeNS(null, SVG_ID_ATTRIBUTE)); 
// patternAttrBuf.append(URL_SUFFIX); 	TokenNameCOMMENT_LINE	patternAttrBuf.append(URL_SUFFIX); 
String	TokenNameIdentifier	 String
patternAttrBuf	TokenNameIdentifier	 pattern Attr Buf
=	TokenNameEQUAL	
URL_PREFIX	TokenNameIdentifier	 URL  PREFIX
+	TokenNamePLUS	
SIGN_POUND	TokenNameIdentifier	 SIGN  POUND
+	TokenNamePLUS	
patternDef	TokenNameIdentifier	 pattern Def
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
patternDesc	TokenNameIdentifier	 pattern Desc
=	TokenNameEQUAL	
new	TokenNamenew	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
(	TokenNameLPAREN	
patternAttrBuf	TokenNameIdentifier	 pattern Attr Buf
,	TokenNameCOMMA	
SVG_OPAQUE_VALUE	TokenNameIdentifier	 SVG  OPAQUE  VALUE
,	TokenNameCOMMA	
patternDef	TokenNameIdentifier	 pattern Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
texture	TokenNameIdentifier	 texture
,	TokenNameCOMMA	
patternDesc	TokenNameIdentifier	 pattern Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
patternDef	TokenNameIdentifier	 pattern Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
patternDesc	TokenNameIdentifier	 pattern Desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
