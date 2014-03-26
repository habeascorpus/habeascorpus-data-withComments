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
/** * This subclass of {@link ImageHandlerBase64Encoder} implements * functionality specific to the cached version of the image * encoder. * * @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> * @version $Id: CachedImageHandlerBase64Encoder.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This subclass of {@link ImageHandlerBase64Encoder} implements functionality specific to the cached version of the image encoder. * @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> @version $Id: CachedImageHandlerBase64Encoder.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
CachedImageHandlerBase64Encoder	TokenNameIdentifier	 Cached Image Handler Base64 Encoder
extends	TokenNameextends	
DefaultCachedImageHandler	TokenNameIdentifier	 Default Cached Image Handler
{	TokenNameLBRACE	
/** * Build a <code>CachedImageHandlerBase64Encoder</code> instance. */	TokenNameCOMMENT_JAVADOC	 Build a <code>CachedImageHandlerBase64Encoder</code> instance. 
public	TokenNamepublic	
CachedImageHandlerBase64Encoder	TokenNameIdentifier	 Cached Image Handler Base64 Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setImageCacher	TokenNameIdentifier	 set Image Cacher
(	TokenNameLPAREN	
new	TokenNamenew	
ImageCacher	TokenNameIdentifier	 Image Cacher
.	TokenNameDOT	
Embedded	TokenNameIdentifier	 Embedded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// For this cached version we return <use> 	TokenNameCOMMENT_LINE	For this cached version we return <use> 
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
SVG_USE_TAG	TokenNameIdentifier	 SVG  USE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
imageElement	TokenNameIdentifier	 image Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRefPrefix	TokenNameIdentifier	 get Ref Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
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
// If scaling is necessary, create a transform, since "width" and "height" 	TokenNameCOMMENT_LINE	If scaling is necessary, create a transform, since "width" and "height" 
// have no effect on a <use> element referring to an <image> element. 	TokenNameCOMMENT_LINE	have no effect on a <use> element referring to an <image> element. 
AffineTransform	TokenNameIdentifier	 Affine Transform
af	TokenNameIdentifier	 af
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
hRatio	TokenNameIdentifier	 h Ratio
=	TokenNameEQUAL	
dstWidth	TokenNameIdentifier	 dst Width
/	TokenNameDIVIDE	
srcWidth	TokenNameIdentifier	 src Width
;	TokenNameSEMICOLON	
double	TokenNamedouble	
vRatio	TokenNameIdentifier	 v Ratio
=	TokenNameEQUAL	
dstHeight	TokenNameIdentifier	 dst Height
/	TokenNameDIVIDE	
srcHeight	TokenNameIdentifier	 src Height
;	TokenNameSEMICOLON	
af	TokenNameIdentifier	 af
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hRatio	TokenNameIdentifier	 h Ratio
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
vRatio	TokenNameIdentifier	 v Ratio
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
af	TokenNameIdentifier	 af
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
hRatio	TokenNameIdentifier	 h Ratio
,	TokenNameCOMMA	
vRatio	TokenNameIdentifier	 v Ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
af	TokenNameIdentifier	 af
.	TokenNameDOT	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
af	TokenNameIdentifier	 af
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Uses PNG encoding. */	TokenNameCOMMENT_JAVADOC	 Uses PNG encoding. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
Base64EncoderStream	TokenNameIdentifier	 Base64 Encoder Stream
b64Encoder	TokenNameIdentifier	 b64 Encoder
=	TokenNameEQUAL	
new	TokenNamenew	
Base64EncoderStream	TokenNameIdentifier	 Base64 Encoder Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
b64Encoder	TokenNameIdentifier	 b64 Encoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b64Encoder	TokenNameIdentifier	 b64 Encoder
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getBufferedImageType	TokenNameIdentifier	 get Buffered Image Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_INT_ARGB	TokenNameIdentifier	 TYPE  INT  ARGB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
