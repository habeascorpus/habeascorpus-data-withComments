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
Dimension	TokenNameIdentifier	 Dimension
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
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
/** * This abstract implementation of the ImageHandler interface * is intended to be the base class for ImageHandlers that generate * image files for all the images they handle. This class stores * images in an configurable directory. The xlink:href value the * class generates is made of a configurable url root and the name * of the file created by this handler. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: AbstractImageHandlerEncoder.java 579230 2007-09-25 12:52:48Z cam $ * @see org.apache.batik.svggen.SVGGraphics2D * @see org.apache.batik.svggen.ImageHandlerJPEGEncoder * @see org.apache.batik.svggen.ImageHandlerPNGEncoder */	TokenNameCOMMENT_JAVADOC	 This abstract implementation of the ImageHandler interface is intended to be the base class for ImageHandlers that generate image files for all the images they handle. This class stores images in an configurable directory. The xlink:href value the class generates is made of a configurable url root and the name of the file created by this handler. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: AbstractImageHandlerEncoder.java 579230 2007-09-25 12:52:48Z cam $ @see org.apache.batik.svggen.SVGGraphics2D @see org.apache.batik.svggen.ImageHandlerJPEGEncoder @see org.apache.batik.svggen.ImageHandlerPNGEncoder 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractImageHandlerEncoder	TokenNameIdentifier	 Abstract Image Handler Encoder
extends	TokenNameextends	
DefaultImageHandler	TokenNameIdentifier	 Default Image Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
AffineTransform	TokenNameIdentifier	 Affine Transform
IDENTITY	TokenNameIdentifier	 IDENTITY
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Directory where all images are placed */	TokenNameCOMMENT_JAVADOC	 Directory where all images are placed 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
imageDir	TokenNameIdentifier	 image Dir
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Value for the url root corresponding to the directory */	TokenNameCOMMENT_JAVADOC	 Value for the url root corresponding to the directory 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
urlRoot	TokenNameIdentifier	 url Root
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// for createGraphics method. 	TokenNameCOMMENT_LINE	for createGraphics method. 
private	TokenNameprivate	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
createGraphics	TokenNameIdentifier	 create Graphics
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
initDone	TokenNameIdentifier	 init Done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramc	TokenNameIdentifier	 paramc
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramo	TokenNameIdentifier	 paramo
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * This method creates a <code>Graphics2D</code> from a * <code>BufferedImage</code>. If Batik extensions to AWT are * in the CLASSPATH it uses them, otherwise, it uses the regular * AWT method. */	TokenNameCOMMENT_JAVADOC	 This method creates a <code>Graphics2D</code> from a <code>BufferedImage</code>. If Batik extensions to AWT are in the CLASSPATH it uses them, otherwise, it uses the regular AWT method. 
private	TokenNameprivate	
static	TokenNamestatic	
Graphics2D	TokenNameIdentifier	 Graphics2 D
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initDone	TokenNameIdentifier	 init Done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"org.apache.batik.ext.awt.image.GraphicsUtil"	TokenNameStringLiteral	org.apache.batik.ext.awt.image.GraphicsUtil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createGraphics	TokenNameIdentifier	 create Graphics
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"createGraphics"	TokenNameStringLiteral	createGraphics
,	TokenNameCOMMA	
paramc	TokenNameIdentifier	 paramc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paramo	TokenNameIdentifier	 paramo
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ThreadDeath	TokenNameIdentifier	 Thread Death
td	TokenNameIdentifier	 td
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
td	TokenNameIdentifier	 td
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// happen only if Batik extensions are not there 	TokenNameCOMMENT_LINE	happen only if Batik extensions are not there 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
initDone	TokenNameIdentifier	 init Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
createGraphics	TokenNameIdentifier	 create Graphics
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
paramo	TokenNameIdentifier	 paramo
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
)	TokenNameRPAREN	
createGraphics	TokenNameIdentifier	 create Graphics
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
paramo	TokenNameIdentifier	 paramo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happened 	TokenNameCOMMENT_LINE	should not happened 
}	TokenNameRBRACE	
return	TokenNamereturn	
g2d	TokenNameIdentifier	 g2d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param imageDir directory where this handler should generate images. * If null, an SVGGraphics2DRuntimeException is thrown. * @param urlRoot root for the urls that point to images created by this * image handler. If null, then the url corresponding to imageDir * is used. */	TokenNameCOMMENT_JAVADOC	 @param imageDir directory where this handler should generate images. If null, an SVGGraphics2DRuntimeException is thrown. @param urlRoot root for the urls that point to images created by this image handler. If null, then the url corresponding to imageDir is used. 
public	TokenNamepublic	
AbstractImageHandlerEncoder	TokenNameIdentifier	 Abstract Image Handler Encoder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
imageDir	TokenNameIdentifier	 image Dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlRoot	TokenNameIdentifier	 url Root
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
imageDir	TokenNameIdentifier	 image Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_IMAGE_DIR_NULL	TokenNameIdentifier	 ERR  IMAGE  DIR  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
imageDirFile	TokenNameIdentifier	 image Dir File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
imageDir	TokenNameIdentifier	 image Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
imageDirFile	TokenNameIdentifier	 image Dir File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_IMAGE_DIR_DOES_NOT_EXIST	TokenNameIdentifier	 ERR  IMAGE  DIR  DOES  NOT  EXIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
imageDir	TokenNameIdentifier	 image Dir
=	TokenNameEQUAL	
imageDir	TokenNameIdentifier	 image Dir
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
urlRoot	TokenNameIdentifier	 url Root
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
urlRoot	TokenNameIdentifier	 url Root
=	TokenNameEQUAL	
urlRoot	TokenNameIdentifier	 url Root
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
urlRoot	TokenNameIdentifier	 url Root
=	TokenNameEQUAL	
imageDirFile	TokenNameIdentifier	 image Dir File
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
(	TokenNameLPAREN	
ERR_CANNOT_USE_IMAGE_DIR	TokenNameIdentifier	 ERR  CANNOT  USE  IMAGE  DIR
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This template method should set the xlink:href attribute on the input * Element parameter */	TokenNameCOMMENT_JAVADOC	 This template method should set the xlink:href attribute on the input Element parameter 
protected	TokenNameprotected	
void	TokenNamevoid	
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
Image	TokenNameIdentifier	 Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
{	TokenNameLBRACE	
// Create an buffered image where the image will be drawn 	TokenNameCOMMENT_LINE	Create an buffered image where the image will be drawn 
Dimension	TokenNameIdentifier	 Dimension
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
buildBufferedImage	TokenNameIdentifier	 build Buffered Image
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
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
// Save image into file 	TokenNameCOMMENT_LINE	Save image into file 
saveBufferedImageToFile	TokenNameIdentifier	 save Buffered Image To File
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This template method should set the xlink:href attribute on the input * Element parameter */	TokenNameCOMMENT_JAVADOC	 This template method should set the xlink:href attribute on the input Element parameter 
protected	TokenNameprotected	
void	TokenNamevoid	
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
{	TokenNameLBRACE	
// Create an buffered image where the image will be drawn 	TokenNameCOMMENT_LINE	Create an buffered image where the image will be drawn 
Dimension	TokenNameIdentifier	 Dimension
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
buildBufferedImage	TokenNameIdentifier	 build Buffered Image
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
drawRenderedImage	TokenNameIdentifier	 draw Rendered Image
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
IDENTITY	TokenNameIdentifier	 IDENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Save image into file 	TokenNameCOMMENT_LINE	Save image into file 
saveBufferedImageToFile	TokenNameIdentifier	 save Buffered Image To File
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This template method should set the xlink:href attribute on the input * Element parameter */	TokenNameCOMMENT_JAVADOC	 This template method should set the xlink:href attribute on the input Element parameter 
protected	TokenNameprotected	
void	TokenNamevoid	
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
RenderableImage	TokenNameIdentifier	 Renderable Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
{	TokenNameLBRACE	
// Create an buffered image where the image will be drawn 	TokenNameCOMMENT_LINE	Create an buffered image where the image will be drawn 
Dimension	TokenNameIdentifier	 Dimension
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
buildBufferedImage	TokenNameIdentifier	 build Buffered Image
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
drawRenderableImage	TokenNameIdentifier	 draw Renderable Image
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
IDENTITY	TokenNameIdentifier	 IDENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Save image into file 	TokenNameCOMMENT_LINE	Save image into file 
saveBufferedImageToFile	TokenNameIdentifier	 save Buffered Image To File
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
saveBufferedImageToFile	TokenNameIdentifier	 save Buffered Image To File
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
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
ERR_CONTEXT_NULL	TokenNameIdentifier	 ERR  CONTEXT  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a new file in image directory 	TokenNameCOMMENT_LINE	Create a new file in image directory 
File	TokenNameIdentifier	 File
imageFile	TokenNameIdentifier	 image File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// While the files we are generating exist, try to create another 	TokenNameCOMMENT_LINE	While the files we are generating exist, try to create another 
// id that is unique. 	TokenNameCOMMENT_LINE	id that is unique. 
while	TokenNamewhile	
(	TokenNameLPAREN	
imageFile	TokenNameIdentifier	 image File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileId	TokenNameIdentifier	 file Id
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
.	TokenNameDOT	
generateID	TokenNameIdentifier	 generate ID
(	TokenNameLPAREN	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageFile	TokenNameIdentifier	 image File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
imageDir	TokenNameIdentifier	 image Dir
,	TokenNameCOMMA	
fileId	TokenNameIdentifier	 file Id
+	TokenNamePLUS	
getSuffix	TokenNameIdentifier	 get Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
imageFile	TokenNameIdentifier	 image File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
imageFile	TokenNameIdentifier	 image File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Encode image here 	TokenNameCOMMENT_LINE	Encode image here 
encodeImage	TokenNameIdentifier	 encode Image
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
imageFile	TokenNameIdentifier	 image File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Update HREF 	TokenNameCOMMENT_LINE	Update HREF 
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
XLINK_HREF_QNAME	TokenNameIdentifier	 XLINK  HREF  QNAME
,	TokenNameCOMMA	
urlRoot	TokenNameIdentifier	 url Root
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
imageFile	TokenNameIdentifier	 image File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the suffix used by this encoder. E.g., ".jpg" for * ImageHandlerJPEGEncoder */	TokenNameCOMMENT_JAVADOC	 @return the suffix used by this encoder. E.g., ".jpg" for ImageHandlerJPEGEncoder 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getSuffix	TokenNameIdentifier	 get Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the prefix used by this encoder. E.g., "jpegImage" for * ImageHandlerJPEGEncoder */	TokenNameCOMMENT_JAVADOC	 @return the prefix used by this encoder. E.g., "jpegImage" for ImageHandlerJPEGEncoder 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Derived classes should implement this method and encode the input * BufferedImage as needed */	TokenNameCOMMENT_JAVADOC	 Derived classes should implement this method and encode the input BufferedImage as needed 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
encodeImage	TokenNameIdentifier	 encode Image
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
imageFile	TokenNameIdentifier	 image File
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
;	TokenNameSEMICOLON	
/** * This method creates a BufferedImage of the right size and type * for the derived class. */	TokenNameCOMMENT_JAVADOC	 This method creates a BufferedImage of the right size and type for the derived class. 
public	TokenNamepublic	
abstract	TokenNameabstract	
BufferedImage	TokenNameIdentifier	 Buffered Image
buildBufferedImage	TokenNameIdentifier	 build Buffered Image
(	TokenNameLPAREN	
Dimension	TokenNameIdentifier	 Dimension
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
