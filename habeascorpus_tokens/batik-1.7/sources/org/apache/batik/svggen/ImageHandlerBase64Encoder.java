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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ImageWriter	TokenNameIdentifier	 Image Writer
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ImageWriterRegistry	TokenNameIdentifier	 Image Writer Registry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Base64EncoderStream	TokenNameIdentifier	 Base64 Encoder Stream
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
/** * This implementation of ImageHandler encodes the input image as * a PNG image first, then encodes the PNG image using Base64 * encoding and uses the result to encoder the image url using * the data protocol. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ImageHandlerBase64Encoder.java 475477 2006-11-15 22:44:28Z cam $ * @see org.apache.batik.svggen.SVGGraphics2D * @see org.apache.batik.svggen.ImageHandler */	TokenNameCOMMENT_JAVADOC	 This implementation of ImageHandler encodes the input image as a PNG image first, then encodes the PNG image using Base64 encoding and uses the result to encoder the image url using the data protocol. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ImageHandlerBase64Encoder.java 475477 2006-11-15 22:44:28Z cam $ @see org.apache.batik.svggen.SVGGraphics2D @see org.apache.batik.svggen.ImageHandler 
public	TokenNamepublic	
class	TokenNameclass	
ImageHandlerBase64Encoder	TokenNameIdentifier	 Image Handler Base64 Encoder
extends	TokenNameextends	
DefaultImageHandler	TokenNameIdentifier	 Default Image Handler
{	TokenNameLBRACE	
/** * Build an <code>ImageHandlerBase64Encoder</code> instance. */	TokenNameCOMMENT_JAVADOC	 Build an <code>ImageHandlerBase64Encoder</code> instance. 
public	TokenNamepublic	
ImageHandlerBase64Encoder	TokenNameIdentifier	 Image Handler Base64 Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
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
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_INT_ARGB	TokenNameIdentifier	 TYPE  INT  ARGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
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
/** * The handler should set the xlink:href tag and the width and * height attributes. */	TokenNameCOMMENT_JAVADOC	 The handler should set the xlink:href tag and the width and height attributes. 
public	TokenNamepublic	
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
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_IMAGE_NULL	TokenNameIdentifier	 ERR  IMAGE  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RenderedImage	TokenNameIdentifier	 Rendered Image
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
createDefaultRendering	TokenNameIdentifier	 create Default Rendering
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
handleHREF	TokenNameIdentifier	 handle HREF
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
DATA_PROTOCOL_PNG_PREFIX	TokenNameIdentifier	 DATA  PROTOCOL  PNG  PREFIX
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
/** * This version of handleHREF encodes the input image into a * PNG image whose bytes are then encoded with Base64. The * resulting encoded data is used to set the url on the * input imageElement, using the data: protocol. */	TokenNameCOMMENT_JAVADOC	 This version of handleHREF encodes the input image into a PNG image whose bytes are then encoded with Base64. The resulting encoded data is used to set the url on the input imageElement, using the data: protocol. 
public	TokenNamepublic	
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
// Setup Base64Encoder stream to byte array. 	TokenNameCOMMENT_LINE	Setup Base64Encoder stream to byte array. 
// 	TokenNameCOMMENT_LINE	 
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Base64EncoderStream	TokenNameIdentifier	 Base64 Encoder Stream
b64Encoder	TokenNameIdentifier	 b64 Encoder
=	TokenNameEQUAL	
new	TokenNamenew	
Base64EncoderStream	TokenNameIdentifier	 Base64 Encoder Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Now, encode the input image to the base 64 stream. 	TokenNameCOMMENT_LINE	Now, encode the input image to the base 64 stream. 
// 	TokenNameCOMMENT_LINE	 
encodeImage	TokenNameIdentifier	 encode Image
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
b64Encoder	TokenNameIdentifier	 b64 Encoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Close the b64 encoder stream (terminates the b64 streams). 	TokenNameCOMMENT_LINE	Close the b64 encoder stream (terminates the b64 streams). 
b64Encoder	TokenNameIdentifier	 b64 Encoder
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
// Should not happen because we are doing in-memory processing 	TokenNameCOMMENT_LINE	Should not happen because we are doing in-memory processing 
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
// 	TokenNameCOMMENT_LINE	 
// Finally, write out url 	TokenNameCOMMENT_LINE	Finally, write out url 
// 	TokenNameCOMMENT_LINE	 
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
XLINK_HREF_QNAME	TokenNameIdentifier	 XLINK  HREF  QNAME
,	TokenNameCOMMA	
DATA_PROTOCOL_PNG_PREFIX	TokenNameIdentifier	 DATA  PROTOCOL  PNG  PREFIX
+	TokenNamePLUS	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
encodeImage	TokenNameIdentifier	 encode Image
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ImageWriter	TokenNameIdentifier	 Image Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
ImageWriterRegistry	TokenNameIdentifier	 Image Writer Registry
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWriterFor	TokenNameIdentifier	 get Writer For
(	TokenNameLPAREN	
"image/png"	TokenNameStringLiteral	image/png
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are doing in-memory processing. This should not happen. 	TokenNameCOMMENT_LINE	We are doing in-memory processing. This should not happen. 
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
(	TokenNameLPAREN	
ERR_UNEXPECTED	TokenNameIdentifier	 ERR  UNEXPECTED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method creates a BufferedImage with an alpha channel, as this is * supported by Base64. */	TokenNameCOMMENT_JAVADOC	 This method creates a BufferedImage with an alpha channel, as this is supported by Base64. 
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
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_INT_ARGB	TokenNameIdentifier	 TYPE  INT  ARGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
