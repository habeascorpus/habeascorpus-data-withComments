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
Image	TokenNameIdentifier	 Image
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
RenderedImage	TokenNameIdentifier	 Rendered Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
RenderableImage	TokenNameIdentifier	 Renderable Image
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
/** * Implements the <tt>GenericImageHandler</tt> interface and only * uses &lt;image&gt; elements. This class delegates to the * <tt>ImageHandler</tt> interface for handling the xlink:href * attribute on the elements it creates. * * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: SimpleImageHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Implements the <tt>GenericImageHandler</tt> interface and only uses &lt;image&gt; elements. This class delegates to the <tt>ImageHandler</tt> interface for handling the xlink:href attribute on the elements it creates. * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: SimpleImageHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SimpleImageHandler	TokenNameIdentifier	 Simple Image Handler
implements	TokenNameimplements	
GenericImageHandler	TokenNameIdentifier	 Generic Image Handler
,	TokenNameCOMMA	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
// duplicate the string here to remove dependencies on 	TokenNameCOMMENT_LINE	duplicate the string here to remove dependencies on 
// org.apache.batik.dom.util.XLinkSupport 	TokenNameCOMMENT_LINE	org.apache.batik.dom.util.XLinkSupport 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
=	TokenNameEQUAL	
"http://www.w3.org/1999/xlink"	TokenNameStringLiteral	http://www.w3.org/1999/xlink
;	TokenNameSEMICOLON	
/** * <tt>ImageHandler</tt> which handles xlink:href attribute setting */	TokenNameCOMMENT_JAVADOC	 <tt>ImageHandler</tt> which handles xlink:href attribute setting 
protected	TokenNameprotected	
ImageHandler	TokenNameIdentifier	 Image Handler
imageHandler	TokenNameIdentifier	 image Handler
;	TokenNameSEMICOLON	
/** * @param imageHandler ImageHandler handling the xlink:href on the * &lt;image&gt; elements this GenericImageHandler implementation * creates. */	TokenNameCOMMENT_JAVADOC	 @param imageHandler ImageHandler handling the xlink:href on the &lt;image&gt; elements this GenericImageHandler implementation creates. 
public	TokenNamepublic	
SimpleImageHandler	TokenNameIdentifier	 Simple Image Handler
(	TokenNameLPAREN	
ImageHandler	TokenNameIdentifier	 Image Handler
imageHandler	TokenNameIdentifier	 image Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
imageHandler	TokenNameIdentifier	 image Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
imageHandler	TokenNameIdentifier	 image Handler
=	TokenNameEQUAL	
imageHandler	TokenNameIdentifier	 image Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This <tt>GenericImageHandler</tt> implementation does not * need to interact with the DOMTreeManager. */	TokenNameCOMMENT_JAVADOC	 This <tt>GenericImageHandler</tt> implementation does not need to interact with the DOMTreeManager. 
public	TokenNamepublic	
void	TokenNamevoid	
setDOMTreeManager	TokenNameIdentifier	 set DOM Tree Manager
(	TokenNameLPAREN	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
domTreeManager	TokenNameIdentifier	 dom Tree Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an Element which can refer to an image. * Note that no assumptions should be made by the caller about the * corresponding SVG tag. */	TokenNameCOMMENT_JAVADOC	 Creates an Element which can refer to an image. Note that no assumptions should be made by the caller about the corresponding SVG tag. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create a DOM Element in SVG namespace to refer to an image 	TokenNameCOMMENT_LINE	Create a DOM Element in SVG namespace to refer to an image 
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
getDOMFactory	TokenNameIdentifier	 get DOM Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_IMAGE_TAG	TokenNameIdentifier	 SVG  IMAGE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
imageElement	TokenNameIdentifier	 image Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The handler sets the xlink:href tag and returns a transform */	TokenNameCOMMENT_JAVADOC	 The handler sets the xlink:href tag and returns a transform 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
Image	TokenNameIdentifier	 Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
imageWidth	TokenNameIdentifier	 image Width
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
imageHeight	TokenNameIdentifier	 image Height
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
imageWidth	TokenNameIdentifier	 image Width
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
imageHeight	TokenNameIdentifier	 image Height
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
width	TokenNameIdentifier	 width
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
height	TokenNameIdentifier	 height
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Forget about it 	TokenNameCOMMENT_LINE	Forget about it 
handleEmptyImage	TokenNameIdentifier	 handle Empty Image
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
imageHandler	TokenNameIdentifier	 image Handler
.	TokenNameDOT	
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setImageAttributes	TokenNameIdentifier	 set Image Attributes
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The handler sets the xlink:href tag and returns a transform */	TokenNameCOMMENT_JAVADOC	 The handler sets the xlink:href tag and returns a transform 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
imageWidth	TokenNameIdentifier	 image Width
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
imageHeight	TokenNameIdentifier	 image Height
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
imageWidth	TokenNameIdentifier	 image Width
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
imageHeight	TokenNameIdentifier	 image Height
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
width	TokenNameIdentifier	 width
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
height	TokenNameIdentifier	 height
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Forget about it 	TokenNameCOMMENT_LINE	Forget about it 
handleEmptyImage	TokenNameIdentifier	 handle Empty Image
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
imageHandler	TokenNameIdentifier	 image Handler
.	TokenNameDOT	
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setImageAttributes	TokenNameIdentifier	 set Image Attributes
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The handler sets the xlink:href tag and returns a transform */	TokenNameCOMMENT_JAVADOC	 The handler sets the xlink:href tag and returns a transform 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
RenderableImage	TokenNameIdentifier	 Renderable Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
double	TokenNamedouble	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
imageWidth	TokenNameIdentifier	 image Width
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
imageHeight	TokenNameIdentifier	 image Height
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
imageWidth	TokenNameIdentifier	 image Width
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
imageHeight	TokenNameIdentifier	 image Height
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
width	TokenNameIdentifier	 width
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
height	TokenNameIdentifier	 height
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Forget about it 	TokenNameCOMMENT_LINE	Forget about it 
handleEmptyImage	TokenNameIdentifier	 handle Empty Image
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
imageHandler	TokenNameIdentifier	 image Handler
.	TokenNameDOT	
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setImageAttributes	TokenNameIdentifier	 set Image Attributes
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the x/y/width/height attributes on the &lt;image&gt; * element. */	TokenNameCOMMENT_JAVADOC	 Sets the x/y/width/height attributes on the &lt;image&gt; element. 
protected	TokenNameprotected	
void	TokenNamevoid	
setImageAttributes	TokenNameIdentifier	 set Image Attributes
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
double	TokenNamedouble	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ASPECT  RATIO  ATTRIBUTE
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
handleEmptyImage	TokenNameIdentifier	 handle Empty Image
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
XLINK_HREF_QNAME	TokenNameIdentifier	 XLINK  HREF  QNAME
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
