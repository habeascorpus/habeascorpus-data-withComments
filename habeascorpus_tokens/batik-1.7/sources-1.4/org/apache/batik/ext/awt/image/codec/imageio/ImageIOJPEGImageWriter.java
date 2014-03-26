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
imageio	TokenNameIdentifier	 imageio
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
imageio	TokenNameIdentifier	 imageio
.	TokenNameDOT	
ImageWriteParam	TokenNameIdentifier	 Image Write Param
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
imageio	TokenNameIdentifier	 imageio
.	TokenNameDOT	
ImageWriter	TokenNameIdentifier	 Image Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
imageio	TokenNameIdentifier	 imageio
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
IIOInvalidTreeException	TokenNameIdentifier	 IIO Invalid Tree Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
imageio	TokenNameIdentifier	 imageio
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
IIOMetadata	TokenNameIdentifier	 IIO Metadata
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
imageio	TokenNameIdentifier	 imageio
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
imageio	TokenNameIdentifier	 imageio
.	TokenNameDOT	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
jpeg	TokenNameIdentifier	 jpeg
.	TokenNameDOT	
JPEGImageWriteParam	TokenNameIdentifier	 JPEG Image Write Param
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
/** * ImageWriter that encodes JPEG images using Image I/O. * * @version $Id: ImageIOJPEGImageWriter.java 502538 2007-02-02 08:52:56Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 ImageWriter that encodes JPEG images using Image I/O. * @version $Id: ImageIOJPEGImageWriter.java 502538 2007-02-02 08:52:56Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ImageIOJPEGImageWriter	TokenNameIdentifier	 Image IOJPEG Image Writer
extends	TokenNameextends	
ImageIOImageWriter	TokenNameIdentifier	 Image IO Image Writer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JPEG_NATIVE_FORMAT	TokenNameIdentifier	 JPEG  NATIVE  FORMAT
=	TokenNameEQUAL	
"javax_imageio_jpeg_image_1.0"	TokenNameStringLiteral	javax_imageio_jpeg_image_1.0
;	TokenNameSEMICOLON	
/** * Main constructor. */	TokenNameCOMMENT_JAVADOC	 Main constructor. 
public	TokenNamepublic	
ImageIOJPEGImageWriter	TokenNameIdentifier	 Image IOJPEG Image Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"image/jpeg"	TokenNameStringLiteral	image/jpeg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ImageIOImageWriter#updateMetadata(javax.imageio.metadata.IIOMetadata, ImageWriterParams) */	TokenNameCOMMENT_JAVADOC	 @see ImageIOImageWriter#updateMetadata(javax.imageio.metadata.IIOMetadata, ImageWriterParams) 
protected	TokenNameprotected	
IIOMetadata	TokenNameIdentifier	 IIO Metadata
updateMetadata	TokenNameIdentifier	 update Metadata
(	TokenNameLPAREN	
IIOMetadata	TokenNameIdentifier	 IIO Metadata
meta	TokenNameIdentifier	 meta
,	TokenNameCOMMA	
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ImageIODebugUtil.dumpMetadata(meta); 	TokenNameCOMMENT_LINE	ImageIODebugUtil.dumpMetadata(meta); 
if	TokenNameif	
(	TokenNameLPAREN	
JPEG_NATIVE_FORMAT	TokenNameIdentifier	 JPEG  NATIVE  FORMAT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getNativeMetadataFormatName	TokenNameIdentifier	 get Native Metadata Format Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
meta	TokenNameIdentifier	 meta
=	TokenNameEQUAL	
addAdobeTransform	TokenNameIdentifier	 add Adobe Transform
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
)	TokenNameRPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getAsTree	TokenNameIdentifier	 get As Tree
(	TokenNameLPAREN	
JPEG_NATIVE_FORMAT	TokenNameIdentifier	 JPEG  NATIVE  FORMAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//IIOMetadataNode root = new IIOMetadataNode(jpegmeta); 	TokenNameCOMMENT_LINE	IIOMetadataNode root = new IIOMetadataNode(jpegmeta); 
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
jv	TokenNameIdentifier	 jv
=	TokenNameEQUAL	
getChildNode	TokenNameIdentifier	 get Child Node
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
"JPEGvariety"	TokenNameStringLiteral	JPEGvariety
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
jv	TokenNameIdentifier	 jv
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jv	TokenNameIdentifier	 jv
=	TokenNameEQUAL	
new	TokenNamenew	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
(	TokenNameLPAREN	
"JPEGvariety"	TokenNameStringLiteral	JPEGvariety
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
jv	TokenNameIdentifier	 jv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
getResolution	TokenNameIdentifier	 get Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getChildNode	TokenNameIdentifier	 get Child Node
(	TokenNameLPAREN	
jv	TokenNameIdentifier	 jv
,	TokenNameCOMMA	
"app0JFIF"	TokenNameStringLiteral	app0JFIF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
new	TokenNamenew	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
(	TokenNameLPAREN	
"app0JFIF"	TokenNameStringLiteral	app0JFIF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jv	TokenNameIdentifier	 jv
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//JPEG gets special treatment because there seems to be a bug in 	TokenNameCOMMENT_LINE	JPEG gets special treatment because there seems to be a bug in 
//the JPEG codec in ImageIO converting the pixel size incorrectly 	TokenNameCOMMENT_LINE	the JPEG codec in ImageIO converting the pixel size incorrectly 
//(or not at all) when using standard metadata format. 	TokenNameCOMMENT_LINE	(or not at all) when using standard metadata format. 
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"majorVersion"	TokenNameStringLiteral	majorVersion
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"minorVersion"	TokenNameStringLiteral	minorVersion
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"resUnits"	TokenNameStringLiteral	resUnits
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//dots per inch 	TokenNameCOMMENT_LINE	dots per inch 
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"Xdensity"	TokenNameStringLiteral	Xdensity
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
getResolution	TokenNameIdentifier	 get Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"Ydensity"	TokenNameStringLiteral	Ydensity
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
getResolution	TokenNameIdentifier	 get Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"thumbWidth"	TokenNameStringLiteral	thumbWidth
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"thumbHeight"	TokenNameStringLiteral	thumbHeight
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* IIOMetadataNode ms = getChildNode(root, "markerSequence"); if (ms == null) { ms = new IIOMetadataNode("markerSequence"); root.appendChild(ms); }*/	TokenNameCOMMENT_BLOCK	 IIOMetadataNode ms = getChildNode(root, "markerSequence"); if (ms == null) { ms = new IIOMetadataNode("markerSequence"); root.appendChild(ms); }
try	TokenNametry	
{	TokenNameLBRACE	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
setFromTree	TokenNameIdentifier	 set From Tree
(	TokenNameLPAREN	
JPEG_NATIVE_FORMAT	TokenNameIdentifier	 JPEG  NATIVE  FORMAT
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//meta.mergeTree(JPEG_NATIVE_FORMAT, root); 	TokenNameCOMMENT_LINE	meta.mergeTree(JPEG_NATIVE_FORMAT, root); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IIOInvalidTreeException	TokenNameIdentifier	 IIO Invalid Tree Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot update image metadata: "	TokenNameStringLiteral	Cannot update image metadata: 
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
//ImageIODebugUtil.dumpMetadata(meta); 	TokenNameCOMMENT_LINE	ImageIODebugUtil.dumpMetadata(meta); 
//meta = super.updateMetadata(meta, params); 	TokenNameCOMMENT_LINE	meta = super.updateMetadata(meta, params); 
//ImageIODebugUtil.dumpMetadata(meta); 	TokenNameCOMMENT_LINE	ImageIODebugUtil.dumpMetadata(meta); 
}	TokenNameRBRACE	
return	TokenNamereturn	
meta	TokenNameIdentifier	 meta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
IIOMetadata	TokenNameIdentifier	 IIO Metadata
addAdobeTransform	TokenNameIdentifier	 add Adobe Transform
(	TokenNameLPAREN	
IIOMetadata	TokenNameIdentifier	 IIO Metadata
meta	TokenNameIdentifier	 meta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add the adobe transformation (transform 1 -> to YCbCr) 	TokenNameCOMMENT_LINE	add the adobe transformation (transform 1 -> to YCbCr) 
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
)	TokenNameRPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getAsTree	TokenNameIdentifier	 get As Tree
(	TokenNameLPAREN	
JPEG_NATIVE_FORMAT	TokenNameIdentifier	 JPEG  NATIVE  FORMAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
markerSequence	TokenNameIdentifier	 marker Sequence
=	TokenNameEQUAL	
getChildNode	TokenNameIdentifier	 get Child Node
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
"markerSequence"	TokenNameStringLiteral	markerSequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
markerSequence	TokenNameIdentifier	 marker Sequence
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Invalid metadata!"	TokenNameStringLiteral	Invalid metadata!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
adobeTransform	TokenNameIdentifier	 adobe Transform
=	TokenNameEQUAL	
getChildNode	TokenNameIdentifier	 get Child Node
(	TokenNameLPAREN	
markerSequence	TokenNameIdentifier	 marker Sequence
,	TokenNameCOMMA	
"app14Adobe"	TokenNameStringLiteral	app14Adobe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
adobeTransform	TokenNameIdentifier	 adobe Transform
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
adobeTransform	TokenNameIdentifier	 adobe Transform
=	TokenNameEQUAL	
new	TokenNamenew	
IIOMetadataNode	TokenNameIdentifier	 IIO Metadata Node
(	TokenNameLPAREN	
"app14Adobe"	TokenNameStringLiteral	app14Adobe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adobeTransform	TokenNameIdentifier	 adobe Transform
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"transform"	TokenNameStringLiteral	transform
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// convert RGB to YCbCr 	TokenNameCOMMENT_LINE	convert RGB to YCbCr 
adobeTransform	TokenNameIdentifier	 adobe Transform
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
"101"	TokenNameStringLiteral	101
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adobeTransform	TokenNameIdentifier	 adobe Transform
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"flags0"	TokenNameStringLiteral	flags0
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adobeTransform	TokenNameIdentifier	 adobe Transform
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"flags1"	TokenNameStringLiteral	flags1
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
markerSequence	TokenNameIdentifier	 marker Sequence
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
adobeTransform	TokenNameIdentifier	 adobe Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
adobeTransform	TokenNameIdentifier	 adobe Transform
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"transform"	TokenNameStringLiteral	transform
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
setFromTree	TokenNameIdentifier	 set From Tree
(	TokenNameLPAREN	
JPEG_NATIVE_FORMAT	TokenNameIdentifier	 JPEG  NATIVE  FORMAT
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IIOInvalidTreeException	TokenNameIdentifier	 IIO Invalid Tree Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot update image metadata: "	TokenNameStringLiteral	Cannot update image metadata: 
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
return	TokenNamereturn	
meta	TokenNameIdentifier	 meta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ImageIOImageWriter#getDefaultWriteParam(javax.imageio.ImageWriter, java.awt.image.RenderedImage, ImageWriterParams) */	TokenNameCOMMENT_JAVADOC	 @see ImageIOImageWriter#getDefaultWriteParam(javax.imageio.ImageWriter, java.awt.image.RenderedImage, ImageWriterParams) 
protected	TokenNameprotected	
ImageWriteParam	TokenNameIdentifier	 Image Write Param
getDefaultWriteParam	TokenNameIdentifier	 get Default Write Param
(	TokenNameLPAREN	
ImageWriter	TokenNameIdentifier	 Image Writer
iiowriter	TokenNameIdentifier	 iiowriter
,	TokenNameCOMMA	
RenderedImage	TokenNameIdentifier	 Rendered Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JPEGImageWriteParam	TokenNameIdentifier	 JPEG Image Write Param
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
new	TokenNamenew	
JPEGImageWriteParam	TokenNameIdentifier	 JPEG Image Write Param
(	TokenNameLPAREN	
iiowriter	TokenNameIdentifier	 iiowriter
.	TokenNameDOT	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//ImageTypeSpecifier type = ImageTypeSpecifier.createFromRenderedImage(image); 	TokenNameCOMMENT_LINE	ImageTypeSpecifier type = ImageTypeSpecifier.createFromRenderedImage(image); 
/* ImageTypeSpecifier type = new ImageTypeSpecifier( image.getColorModel(), image.getSampleModel()); */	TokenNameCOMMENT_BLOCK	 ImageTypeSpecifier type = new ImageTypeSpecifier( image.getColorModel(), image.getSampleModel()); 
/* didn't work as expected... ImageTypeSpecifier type = ImageTypeSpecifier.createFromBufferedImageType( BufferedImage.TYPE_INT_RGB); param.setDestinationType(type); param.setSourceBands(new int[] {0, 1, 2}); */	TokenNameCOMMENT_BLOCK	 didn't work as expected... ImageTypeSpecifier type = ImageTypeSpecifier.createFromBufferedImageType( BufferedImage.TYPE_INT_RGB); param.setDestinationType(type); param.setSourceBands(new int[] {0, 1, 2}); 
return	TokenNamereturn	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
