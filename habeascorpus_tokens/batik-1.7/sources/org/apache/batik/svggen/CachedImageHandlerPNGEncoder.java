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
/** * GenericImageHandler which caches PNG images. * * @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> * @version $Id: CachedImageHandlerPNGEncoder.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 GenericImageHandler which caches PNG images. * @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> @version $Id: CachedImageHandlerPNGEncoder.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
CachedImageHandlerPNGEncoder	TokenNameIdentifier	 Cached Image Handler PNG Encoder
extends	TokenNameextends	
DefaultCachedImageHandler	TokenNameIdentifier	 Default Cached Image Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CACHED_PNG_PREFIX	TokenNameIdentifier	 CACHED  PNG  PREFIX
=	TokenNameEQUAL	
"pngImage"	TokenNameStringLiteral	pngImage
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CACHED_PNG_SUFFIX	TokenNameIdentifier	 CACHED  PNG  SUFFIX
=	TokenNameEQUAL	
".png"	TokenNameStringLiteral	.png
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
refPrefix	TokenNameIdentifier	 ref Prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * @param imageDir directory where this handler should generate images. * If null, an IllegalArgumentException is thrown. * @param urlRoot root for the urls that point to images created by this * image handler. If null, then the url corresponding to imageDir * is used. */	TokenNameCOMMENT_JAVADOC	 @param imageDir directory where this handler should generate images. If null, an IllegalArgumentException is thrown. @param urlRoot root for the urls that point to images created by this image handler. If null, then the url corresponding to imageDir is used. 
public	TokenNamepublic	
CachedImageHandlerPNGEncoder	TokenNameIdentifier	 Cached Image Handler PNG Encoder
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
refPrefix	TokenNameIdentifier	 ref Prefix
=	TokenNameEQUAL	
urlRoot	TokenNameIdentifier	 url Root
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
;	TokenNameSEMICOLON	
setImageCacher	TokenNameIdentifier	 set Image Cacher
(	TokenNameLPAREN	
new	TokenNamenew	
ImageCacher	TokenNameIdentifier	 Image Cacher
.	TokenNameDOT	
External	TokenNameIdentifier	 External
(	TokenNameLPAREN	
imageDir	TokenNameIdentifier	 image Dir
,	TokenNameCOMMA	
CACHED_PNG_PREFIX	TokenNameIdentifier	 CACHED  PNG  PREFIX
,	TokenNameCOMMA	
CACHED_PNG_SUFFIX	TokenNameIdentifier	 CACHED  PNG  SUFFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRefPrefix	TokenNameIdentifier	 get Ref Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
refPrefix	TokenNameIdentifier	 ref Prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
