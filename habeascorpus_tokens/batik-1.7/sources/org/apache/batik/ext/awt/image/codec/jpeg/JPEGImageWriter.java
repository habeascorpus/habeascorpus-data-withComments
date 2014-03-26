/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
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
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
jpeg	TokenNameIdentifier	 jpeg
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
GraphicsUtil	TokenNameIdentifier	 Graphics Util
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
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
sun	TokenNameIdentifier	 sun
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
jpeg	TokenNameIdentifier	 jpeg
.	TokenNameDOT	
JPEGCodec	TokenNameIdentifier	 JPEG Codec
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
sun	TokenNameIdentifier	 sun
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
jpeg	TokenNameIdentifier	 jpeg
.	TokenNameDOT	
JPEGEncodeParam	TokenNameIdentifier	 JPEG Encode Param
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
sun	TokenNameIdentifier	 sun
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
jpeg	TokenNameIdentifier	 jpeg
.	TokenNameDOT	
JPEGImageEncoder	TokenNameIdentifier	 JPEG Image Encoder
;	TokenNameSEMICOLON	
/** * ImageWriter implementation that uses the sun.com.image.codec.jpeg * intefaces to write JPEG files. * * @version $Id: JPEGImageWriter.java 582434 2007-10-06 02:11:51Z cam $ */	TokenNameCOMMENT_JAVADOC	 ImageWriter implementation that uses the sun.com.image.codec.jpeg intefaces to write JPEG files. * @version $Id: JPEGImageWriter.java 582434 2007-10-06 02:11:51Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
JPEGImageWriter	TokenNameIdentifier	 JPEG Image Writer
implements	TokenNameimplements	
ImageWriter	TokenNameIdentifier	 Image Writer
{	TokenNameLBRACE	
/** * @see ImageWriter#writeImage(java.awt.image.RenderedImage, java.io.OutputStream) */	TokenNameCOMMENT_JAVADOC	 @see ImageWriter#writeImage(java.awt.image.RenderedImage, java.io.OutputStream) 
public	TokenNamepublic	
void	TokenNamevoid	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ImageWriter#writeImage(java.awt.image.RenderedImage, java.io.OutputStream, org.apache.batik.ext.awt.image.spi.ImageWriterParams) */	TokenNameCOMMENT_JAVADOC	 @see ImageWriter#writeImage(java.awt.image.RenderedImage, java.io.OutputStream, org.apache.batik.ext.awt.image.spi.ImageWriterParams) 
public	TokenNamepublic	
void	TokenNamevoid	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
instanceof	TokenNameinstanceof	
BufferedImage	TokenNameIdentifier	 Buffered Image
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//TODO Is this the right way? 	TokenNameCOMMENT_LINE	TODO Is this the right way? 
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
makeLinearBufferedImage	TokenNameIdentifier	 make Linear Buffered Image
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
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
JPEGImageEncoder	TokenNameIdentifier	 JPEG Image Encoder
encoder	TokenNameIdentifier	 encoder
=	TokenNameEQUAL	
JPEGCodec	TokenNameIdentifier	 JPEG Codec
.	TokenNameDOT	
createJPEGEncoder	TokenNameIdentifier	 create JPEG Encoder
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JPEGEncodeParam	TokenNameIdentifier	 JPEG Encode Param
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
getDefaultJPEGEncodeParam	TokenNameIdentifier	 get Default JPEG Encode Param
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
getJPEGQuality	TokenNameIdentifier	 get JPEG Quality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
setQuality	TokenNameIdentifier	 set Quality
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
getJPEGQuality	TokenNameIdentifier	 get JPEG Quality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
getJPEGForceBaseline	TokenNameIdentifier	 get JPEG Force Baseline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see ImageWriter#getMIMEType() */	TokenNameCOMMENT_JAVADOC	 @see ImageWriter#getMIMEType() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMIMEType	TokenNameIdentifier	 get MIME Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"image/jpeg"	TokenNameStringLiteral	image/jpeg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
