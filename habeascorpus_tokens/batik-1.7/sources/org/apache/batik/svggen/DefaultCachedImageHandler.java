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
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This class is a default implementation of the GenericImageHandler * for handlers implementing a caching strategy. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: DefaultCachedImageHandler.java 478176 2006-11-22 14:50:50Z dvholten $ * @see org.apache.batik.svggen.SVGGraphics2D */	TokenNameCOMMENT_JAVADOC	 This class is a default implementation of the GenericImageHandler for handlers implementing a caching strategy. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: DefaultCachedImageHandler.java 478176 2006-11-22 14:50:50Z dvholten $ @see org.apache.batik.svggen.SVGGraphics2D 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DefaultCachedImageHandler	TokenNameIdentifier	 Default Cached Image Handler
implements	TokenNameimplements	
CachedImageHandler	TokenNameIdentifier	 Cached Image Handler
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
protected	TokenNameprotected	
ImageCacher	TokenNameIdentifier	 Image Cacher
imageCacher	TokenNameIdentifier	 image Cacher
;	TokenNameSEMICOLON	
/** * The image cache can be used by subclasses for efficient image storage */	TokenNameCOMMENT_JAVADOC	 The image cache can be used by subclasses for efficient image storage 
public	TokenNamepublic	
ImageCacher	TokenNameIdentifier	 Image Cacher
getImageCacher	TokenNameIdentifier	 get Image Cacher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
imageCacher	TokenNameIdentifier	 image Cacher
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setImageCacher	TokenNameIdentifier	 set Image Cacher
(	TokenNameLPAREN	
ImageCacher	TokenNameIdentifier	 Image Cacher
imageCacher	TokenNameIdentifier	 image Cacher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
imageCacher	TokenNameIdentifier	 image Cacher
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
// Save current DOMTreeManager if any 	TokenNameCOMMENT_LINE	Save current DOMTreeManager if any 
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
imageCacher	TokenNameIdentifier	 image Cacher
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
imageCacher	TokenNameIdentifier	 image Cacher
.	TokenNameDOT	
getDOMTreeManager	TokenNameIdentifier	 get DOM Tree Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
imageCacher	TokenNameIdentifier	 image Cacher
=	TokenNameEQUAL	
imageCacher	TokenNameIdentifier	 image Cacher
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
imageCacher	TokenNameIdentifier	 image Cacher
.	TokenNameDOT	
setDOMTreeManager	TokenNameIdentifier	 set DOM Tree Manager
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
imageCacher	TokenNameIdentifier	 image Cacher
.	TokenNameDOT	
setDOMTreeManager	TokenNameIdentifier	 set DOM Tree Manager
(	TokenNameLPAREN	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// happen only if Batik extensions are not their 	TokenNameCOMMENT_LINE	happen only if Batik extensions are not their 
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
/** * Creates an Element which can refer to an image. * Note that no assumptions should be made by the caller about the * corresponding SVG tag. By default, an &lt;image&gt; tag is * used, but the {@link CachedImageHandlerBase64Encoder}, for * example, overrides this method to use a different tag. */	TokenNameCOMMENT_JAVADOC	 Creates an Element which can refer to an image. Note that no assumptions should be made by the caller about the corresponding SVG tag. By default, an &lt;image&gt; tag is used, but the {@link CachedImageHandlerBase64Encoder}, for example, overrides this method to use a different tag. 
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
AffineTransform	TokenNameIdentifier	 Affine Transform
af	TokenNameIdentifier	 af
=	TokenNameEQUAL	
null	TokenNamenull	
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
// First set the href 	TokenNameCOMMENT_LINE	First set the href 
try	TokenNametry	
{	TokenNameLBRACE	
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
io	TokenNameIdentifier	 io
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we need a runtime exception because 	TokenNameCOMMENT_LINE	we need a runtime exception because 
// java.awt.Graphics2D method doesn't throw exceptions.. 	TokenNameCOMMENT_LINE	java.awt.Graphics2D method doesn't throw exceptions.. 
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
io	TokenNameIdentifier	 io
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Then create the transformation: 	TokenNameCOMMENT_LINE	Then create the transformation: 
// Because we cache image data, the stored image may 	TokenNameCOMMENT_LINE	Because we cache image data, the stored image may 
// need to be scaled. 	TokenNameCOMMENT_LINE	need to be scaled. 
af	TokenNameIdentifier	 af
=	TokenNameEQUAL	
handleTransform	TokenNameIdentifier	 handle Transform
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
imageWidth	TokenNameIdentifier	 image Width
,	TokenNameCOMMA	
imageHeight	TokenNameIdentifier	 image Height
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
af	TokenNameIdentifier	 af
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
AffineTransform	TokenNameIdentifier	 Affine Transform
af	TokenNameIdentifier	 af
=	TokenNameEQUAL	
null	TokenNamenull	
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
// First set the href 	TokenNameCOMMENT_LINE	First set the href 
try	TokenNametry	
{	TokenNameLBRACE	
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
io	TokenNameIdentifier	 io
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we need a runtime exception because 	TokenNameCOMMENT_LINE	we need a runtime exception because 
// java.awt.Graphics2D method doesn't throw exceptions.. 	TokenNameCOMMENT_LINE	java.awt.Graphics2D method doesn't throw exceptions.. 
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
io	TokenNameIdentifier	 io
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Then create the transformation: 	TokenNameCOMMENT_LINE	Then create the transformation: 
// Because we cache image data, the stored image may 	TokenNameCOMMENT_LINE	Because we cache image data, the stored image may 
// need to be scaled. 	TokenNameCOMMENT_LINE	need to be scaled. 
af	TokenNameIdentifier	 af
=	TokenNameEQUAL	
handleTransform	TokenNameIdentifier	 handle Transform
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
imageWidth	TokenNameIdentifier	 image Width
,	TokenNameCOMMA	
imageHeight	TokenNameIdentifier	 image Height
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
af	TokenNameIdentifier	 af
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
AffineTransform	TokenNameIdentifier	 Affine Transform
af	TokenNameIdentifier	 af
=	TokenNameEQUAL	
null	TokenNamenull	
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
// First set the href 	TokenNameCOMMENT_LINE	First set the href 
try	TokenNametry	
{	TokenNameLBRACE	
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
io	TokenNameIdentifier	 io
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we need a runtime exception because 	TokenNameCOMMENT_LINE	we need a runtime exception because 
// java.awt.Graphics2D method doesn't throw exceptions.. 	TokenNameCOMMENT_LINE	java.awt.Graphics2D method doesn't throw exceptions.. 
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
io	TokenNameIdentifier	 io
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Then create the transformation: 	TokenNameCOMMENT_LINE	Then create the transformation: 
// Because we cache image data, the stored image may 	TokenNameCOMMENT_LINE	Because we cache image data, the stored image may 
// need to be scaled. 	TokenNameCOMMENT_LINE	need to be scaled. 
af	TokenNameIdentifier	 af
=	TokenNameEQUAL	
handleTransform	TokenNameIdentifier	 handle Transform
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
imageWidth	TokenNameIdentifier	 image Width
,	TokenNameCOMMA	
imageHeight	TokenNameIdentifier	 image Height
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
af	TokenNameIdentifier	 af
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines the transformation needed to get the cached image to * scale & position properly. Sets x and y attributes on the element * accordingly. */	TokenNameCOMMENT_JAVADOC	 Determines the transformation needed to get the cached image to scale & position properly. Sets x and y attributes on the element accordingly. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
handleTransform	TokenNameIdentifier	 handle Transform
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
srcWidth	TokenNameIdentifier	 src Width
,	TokenNameCOMMA	
double	TokenNamedouble	
srcHeight	TokenNameIdentifier	 src Height
,	TokenNameCOMMA	
double	TokenNamedouble	
dstWidth	TokenNameIdentifier	 dst Width
,	TokenNameCOMMA	
double	TokenNamedouble	
dstHeight	TokenNameIdentifier	 dst Height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In this the default case, <image> element, we just 	TokenNameCOMMENT_LINE	In this the default case, <image> element, we just 
// set x, y, width and height attributes. 	TokenNameCOMMENT_LINE	set x, y, width and height attributes. 
// No additional transform is necessary. 	TokenNameCOMMENT_LINE	No additional transform is necessary. 
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
dstWidth	TokenNameIdentifier	 dst Width
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
dstHeight	TokenNameIdentifier	 dst Height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
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
/** * The handler should set the xlink:href tag and the width and * height attributes. */	TokenNameCOMMENT_JAVADOC	 The handler should set the xlink:href tag and the width and height attributes. 
public	TokenNamepublic	
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
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_IMAGE_NULL	TokenNameIdentifier	 ERR  IMAGE  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
height	TokenNameIdentifier	 height
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
width	TokenNameIdentifier	 width
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
height	TokenNameIdentifier	 height
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleEmptyImage	TokenNameIdentifier	 handle Empty Image
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
instanceof	TokenNameinstanceof	
RenderedImage	TokenNameIdentifier	 Rendered Image
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
BufferedImage	TokenNameIdentifier	 Buffered Image
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
buildBufferedImage	TokenNameIdentifier	 build Buffered Image
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
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
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method creates a BufferedImage of the right size and type * for the derived class. */	TokenNameCOMMENT_JAVADOC	 This method creates a BufferedImage of the right size and type for the derived class. 
public	TokenNamepublic	
BufferedImage	TokenNameIdentifier	 Buffered Image
buildBufferedImage	TokenNameIdentifier	 build Buffered Image
(	TokenNameLPAREN	
Dimension	TokenNameIdentifier	 Dimension
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
.	TokenNameDOT	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
getBufferedImageType	TokenNameIdentifier	 get Buffered Image Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// 	TokenNameCOMMENT_LINE	 
// Create an buffered image if necessary 	TokenNameCOMMENT_LINE	Create an buffered image if necessary 
// 	TokenNameCOMMENT_LINE	 
BufferedImage	TokenNameIdentifier	 Buffered Image
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
instanceof	TokenNameinstanceof	
BufferedImage	TokenNameIdentifier	 Buffered Image
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
getBufferedImageType	TokenNameIdentifier	 get Buffered Image Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Cache image and set xlink:href 	TokenNameCOMMENT_LINE	Cache image and set xlink:href 
// 	TokenNameCOMMENT_LINE	 
cacheBufferedImage	TokenNameIdentifier	 cache Buffered Image
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method will delegate to the <tt>handleHREF</tt> which * uses a <tt>RenderedImage</tt> */	TokenNameCOMMENT_JAVADOC	 This method will delegate to the <tt>handleHREF</tt> which uses a <tt>RenderedImage</tt> 
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
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
cacheBufferedImage	TokenNameIdentifier	 cache Buffered Image
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
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
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
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// encode the image in memory 	TokenNameCOMMENT_LINE	encode the image in memory 
encodeImage	TokenNameIdentifier	 encode Image
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happen since we do in-memory processing 	TokenNameCOMMENT_LINE	should not happen since we do in-memory processing 
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
(	TokenNameLPAREN	
ERR_UNEXPECTED	TokenNameIdentifier	 ERR  UNEXPECTED
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ask the cacher for a reference 	TokenNameCOMMENT_LINE	ask the cacher for a reference 
String	TokenNameIdentifier	 String
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
imageCacher	TokenNameIdentifier	 image Cacher
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the URL 	TokenNameCOMMENT_LINE	set the URL 
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
XLINK_HREF_QNAME	TokenNameIdentifier	 XLINK  HREF  QNAME
,	TokenNameCOMMA	
getRefPrefix	TokenNameIdentifier	 get Ref Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Should return the prefix with wich the image reference * should be pre-concatenated. */	TokenNameCOMMENT_JAVADOC	 Should return the prefix with wich the image reference should be pre-concatenated. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getRefPrefix	TokenNameIdentifier	 get Ref Prefix
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
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * This template method should be overridden by derived classes to * declare the image type they need for saving to file. */	TokenNameCOMMENT_JAVADOC	 This template method should be overridden by derived classes to declare the image type they need for saving to file. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getBufferedImageType	TokenNameIdentifier	 get Buffered Image Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
