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
tiff	TokenNameIdentifier	 tiff
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Deflater	TokenNameIdentifier	 Deflater
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
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ImageEncodeParam	TokenNameIdentifier	 Image Encode Param
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
/** * An instance of <code>ImageEncodeParam</code> for encoding images in * the TIFF format. * * <p> This class allows for the specification of encoding parameters. By * default, the image is encoded without any compression, and is written * out consisting of strips, not tiles. The particular compression scheme * to be used can be specified by using the <code>setCompression()</code> * method. The compression scheme specified will be honored only if it is * compatible with the type of image being written out. For example, * Group3 and Group4 compressions can only be used with Bilevel images. * Writing of tiled TIFF images can be enabled by calling the * <code>setWriteTiled()</code> method. * * <p><b> This class is not a committed part of the JAI API. It may * be removed or changed in future releases of JAI.</b> * * @version $Id: TIFFEncodeParam.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An instance of <code>ImageEncodeParam</code> for encoding images in the TIFF format. * <p> This class allows for the specification of encoding parameters. By default, the image is encoded without any compression, and is written out consisting of strips, not tiles. The particular compression scheme to be used can be specified by using the <code>setCompression()</code> method. The compression scheme specified will be honored only if it is compatible with the type of image being written out. For example, Group3 and Group4 compressions can only be used with Bilevel images. Writing of tiled TIFF images can be enabled by calling the <code>setWriteTiled()</code> method. * <p><b> This class is not a committed part of the JAI API. It may be removed or changed in future releases of JAI.</b> * @version $Id: TIFFEncodeParam.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TIFFEncodeParam	TokenNameIdentifier	 TIFF Encode Param
implements	TokenNameimplements	
ImageEncodeParam	TokenNameIdentifier	 Image Encode Param
{	TokenNameLBRACE	
/** No compression. */	TokenNameCOMMENT_JAVADOC	 No compression. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPRESSION_NONE	TokenNameIdentifier	 COMPRESSION  NONE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Modified Huffman Compression (CCITT Group 3 1D facsimile compression). * <p><b>Not currently supported.</b> */	TokenNameCOMMENT_JAVADOC	 Modified Huffman Compression (CCITT Group 3 1D facsimile compression). <p><b>Not currently supported.</b> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPRESSION_GROUP3_1D	TokenNameIdentifier	 COMPRESSION  GROU P3 1 D
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * CCITT T.4 bilevel compression (CCITT Group 3 2D facsimile compression). * <p><b>Not currently supported.</b> */	TokenNameCOMMENT_JAVADOC	 CCITT T.4 bilevel compression (CCITT Group 3 2D facsimile compression). <p><b>Not currently supported.</b> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPRESSION_GROUP3_2D	TokenNameIdentifier	 COMPRESSION  GROU P3 2 D
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * CCITT T.6 bilevel compression (CCITT Group 4 facsimile compression). * <p><b>Not currently supported.</b> */	TokenNameCOMMENT_JAVADOC	 CCITT T.6 bilevel compression (CCITT Group 4 facsimile compression). <p><b>Not currently supported.</b> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPRESSION_GROUP4	TokenNameIdentifier	 COMPRESSION  GROU P4
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * LZW compression. * <p><b>Not supported.</b> */	TokenNameCOMMENT_JAVADOC	 LZW compression. <p><b>Not supported.</b> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPRESSION_LZW	TokenNameIdentifier	 COMPRESSION  LZW
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Code for original JPEG-in-TIFF compression which has been * depricated (for many good reasons) in favor of Tech Note 2 * JPEG compression (compression scheme 7). * <p><b>Not supported.</b> */	TokenNameCOMMENT_JAVADOC	 Code for original JPEG-in-TIFF compression which has been depricated (for many good reasons) in favor of Tech Note 2 JPEG compression (compression scheme 7). <p><b>Not supported.</b> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPRESSION_JPEG_BROKEN	TokenNameIdentifier	 COMPRESSION  JPEG  BROKEN
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * <a href="ftp://ftp.sgi.com/graphics/tiff/TTN2.draft.txt"> * JPEG-in-TIFF</a> compression. */	TokenNameCOMMENT_JAVADOC	 <a href="ftp://ftp.sgi.com/graphics/tiff/TTN2.draft.txt"> JPEG-in-TIFF</a> compression. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPRESSION_JPEG_TTN2	TokenNameIdentifier	 COMPRESSION  JPEG  TT N2
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Byte-oriented run-length encoding "PackBits" compression. */	TokenNameCOMMENT_JAVADOC	 Byte-oriented run-length encoding "PackBits" compression. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPRESSION_PACKBITS	TokenNameIdentifier	 COMPRESSION  PACKBITS
=	TokenNameEQUAL	
32773	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * <a href="http://info.internet.isi.edu:80/in-notes/rfc/files/rfc1951.txt"> * DEFLATE</a> lossless compression (also known as "Zip-in-TIFF"). */	TokenNameCOMMENT_JAVADOC	 <a href="http://info.internet.isi.edu:80/in-notes/rfc/files/rfc1951.txt"> DEFLATE</a> lossless compression (also known as "Zip-in-TIFF"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPRESSION_DEFLATE	TokenNameIdentifier	 COMPRESSION  DEFLATE
=	TokenNameEQUAL	
32946	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
COMPRESSION_NONE	TokenNameIdentifier	 COMPRESSION  NONE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
writeTiled	TokenNameIdentifier	 write Tiled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
extraImages	TokenNameIdentifier	 extra Images
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TIFFField	TokenNameIdentifier	 TIFF Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extraFields	TokenNameIdentifier	 extra Fields
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
convertJPEGRGBToYCbCr	TokenNameIdentifier	 convert JPEGRGB To Y Cb Cr
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JPEGEncodeParam	TokenNameIdentifier	 JPEG Encode Param
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
deflateLevel	TokenNameIdentifier	 deflate Level
=	TokenNameEQUAL	
Deflater	TokenNameIdentifier	 Deflater
.	TokenNameDOT	
DEFAULT_COMPRESSION	TokenNameIdentifier	 DEFAULT  COMPRESSION
;	TokenNameSEMICOLON	
/** * Constructs a TIFFEncodeParam object with default values for * all parameters. */	TokenNameCOMMENT_JAVADOC	 Constructs a TIFFEncodeParam object with default values for all parameters. 
public	TokenNamepublic	
TIFFEncodeParam	TokenNameIdentifier	 TIFF Encode Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the value of the compression parameter. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the compression parameter. 
public	TokenNamepublic	
int	TokenNameint	
getCompression	TokenNameIdentifier	 get Compression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compression	TokenNameIdentifier	 compression
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specifies the type of compression to be used. The compression type * specified will be honored only if it is compatible with the image * being written out. Currently only PackBits, JPEG, and DEFLATE * compression schemes are supported. * * <p> If <code>compression</code> is set to any value but * <code>COMPRESSION_NONE</code> and the <code>OutputStream</code> * supplied to the <code>ImageEncoder</code> is not a * <code>SeekableOutputStream</code>, then the encoder will use either * a temporary file or a memory cache when compressing the data * depending on whether the file system is accessible. Compression * will therefore be more efficient if a <code>SeekableOutputStream</code> * is supplied. * * @param compression The compression type. */	TokenNameCOMMENT_JAVADOC	 Specifies the type of compression to be used. The compression type specified will be honored only if it is compatible with the image being written out. Currently only PackBits, JPEG, and DEFLATE compression schemes are supported. * <p> If <code>compression</code> is set to any value but <code>COMPRESSION_NONE</code> and the <code>OutputStream</code> supplied to the <code>ImageEncoder</code> is not a <code>SeekableOutputStream</code>, then the encoder will use either a temporary file or a memory cache when compressing the data depending on whether the file system is accessible. Compression will therefore be more efficient if a <code>SeekableOutputStream</code> is supplied. * @param compression The compression type. 
public	TokenNamepublic	
void	TokenNamevoid	
setCompression	TokenNameIdentifier	 set Compression
(	TokenNameLPAREN	
int	TokenNameint	
compression	TokenNameIdentifier	 compression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
compression	TokenNameIdentifier	 compression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
COMPRESSION_NONE	TokenNameIdentifier	 COMPRESSION  NONE
:	TokenNameCOLON	
case	TokenNamecase	
COMPRESSION_PACKBITS	TokenNameIdentifier	 COMPRESSION  PACKBITS
:	TokenNameCOLON	
case	TokenNamecase	
COMPRESSION_JPEG_TTN2	TokenNameIdentifier	 COMPRESSION  JPEG  TT N2
:	TokenNameCOLON	
case	TokenNamecase	
COMPRESSION_DEFLATE	TokenNameIdentifier	 COMPRESSION  DEFLATE
:	TokenNameCOLON	
// Do nothing. 	TokenNameCOMMENT_LINE	Do nothing. 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFEncodeParam0"	TokenNameStringLiteral	TIFFEncodeParam0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
compression	TokenNameIdentifier	 compression
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the writeTiled parameter. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the writeTiled parameter. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getWriteTiled	TokenNameIdentifier	 get Write Tiled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
writeTiled	TokenNameIdentifier	 write Tiled
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set, the data will be written out in tiled format, instead of * in strips. * * @param writeTiled Specifies whether the image data should be * wriiten out in tiled format. */	TokenNameCOMMENT_JAVADOC	 If set, the data will be written out in tiled format, instead of in strips. * @param writeTiled Specifies whether the image data should be wriiten out in tiled format. 
public	TokenNamepublic	
void	TokenNamevoid	
setWriteTiled	TokenNameIdentifier	 set Write Tiled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
writeTiled	TokenNameIdentifier	 write Tiled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
writeTiled	TokenNameIdentifier	 write Tiled
=	TokenNameEQUAL	
writeTiled	TokenNameIdentifier	 write Tiled
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the dimensions of the tiles to be written. If either * value is non-positive, the encoder will use a default value. * * <p> If the data are being written as tiles, i.e., * <code>getWriteTiled()</code> returns <code>true</code>, then the * default tile dimensions used by the encoder are those of the tiles * of the image being encoded. * * <p> If the data are being written as strips, i.e., * <code>getWriteTiled()</code> returns <code>false</code>, the width * of each strip is always the width of the image and the default * number of rows per strip is 8. * * <p> If JPEG compession is being used, the dimensions of the strips or * tiles may be modified to conform to the JPEG-in-TIFF specification. * * @param tileWidth The tile width; ignored if strips are used. * @param tileHeight The tile height or number of rows per strip. */	TokenNameCOMMENT_JAVADOC	 Sets the dimensions of the tiles to be written. If either value is non-positive, the encoder will use a default value. * <p> If the data are being written as tiles, i.e., <code>getWriteTiled()</code> returns <code>true</code>, then the default tile dimensions used by the encoder are those of the tiles of the image being encoded. * <p> If the data are being written as strips, i.e., <code>getWriteTiled()</code> returns <code>false</code>, the width of each strip is always the width of the image and the default number of rows per strip is 8. * <p> If JPEG compession is being used, the dimensions of the strips or tiles may be modified to conform to the JPEG-in-TIFF specification. * @param tileWidth The tile width; ignored if strips are used. @param tileHeight The tile height or number of rows per strip. 
public	TokenNamepublic	
void	TokenNamevoid	
setTileSize	TokenNameIdentifier	 set Tile Size
(	TokenNameLPAREN	
int	TokenNameint	
tileWidth	TokenNameIdentifier	 tile Width
,	TokenNameCOMMA	
int	TokenNameint	
tileHeight	TokenNameIdentifier	 tile Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tileWidth	TokenNameIdentifier	 tile Width
=	TokenNameEQUAL	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tileHeight	TokenNameIdentifier	 tile Height
=	TokenNameEQUAL	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the tile width set via <code>setTileSize()</code>. */	TokenNameCOMMENT_JAVADOC	 Retrieves the tile width set via <code>setTileSize()</code>. 
public	TokenNamepublic	
int	TokenNameint	
getTileWidth	TokenNameIdentifier	 get Tile Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the tile height set via <code>setTileSize()</code>. */	TokenNameCOMMENT_JAVADOC	 Retrieves the tile height set via <code>setTileSize()</code>. 
public	TokenNamepublic	
int	TokenNameint	
getTileHeight	TokenNameIdentifier	 get Tile Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets an <code>Iterator</code> of additional images to be written * after the image passed as an argument to the <code>ImageEncoder</code>. * The methods on the supplied <code>Iterator</code> must only be invoked * by the <code>ImageEncoder</code> which will exhaust the available * values unless an error occurs. * * <p> The value returned by an invocation of <code>next()</code> on the * <code>Iterator</code> must return either a <code>RenderedImage</code> * or an <code>Object[]</code> of length 2 wherein the element at index * zero is a <code>RenderedImage</code> amd the other element is a * <code>TIFFEncodeParam</code>. If no <code>TIFFEncodeParam</code> is * supplied in this manner for an additional image, the parameters used * to create the <code>ImageEncoder</code> will be used. The extra * image <code>Iterator</code> set on any <code>TIFFEncodeParam</code> * of an additional image will in all cases be ignored. */	TokenNameCOMMENT_JAVADOC	 Sets an <code>Iterator</code> of additional images to be written after the image passed as an argument to the <code>ImageEncoder</code>. The methods on the supplied <code>Iterator</code> must only be invoked by the <code>ImageEncoder</code> which will exhaust the available values unless an error occurs. * <p> The value returned by an invocation of <code>next()</code> on the <code>Iterator</code> must return either a <code>RenderedImage</code> or an <code>Object[]</code> of length 2 wherein the element at index zero is a <code>RenderedImage</code> amd the other element is a <code>TIFFEncodeParam</code>. If no <code>TIFFEncodeParam</code> is supplied in this manner for an additional image, the parameters used to create the <code>ImageEncoder</code> will be used. The extra image <code>Iterator</code> set on any <code>TIFFEncodeParam</code> of an additional image will in all cases be ignored. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setExtraImages	TokenNameIdentifier	 set Extra Images
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
extraImages	TokenNameIdentifier	 extra Images
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extraImages	TokenNameIdentifier	 extra Images
=	TokenNameEQUAL	
extraImages	TokenNameIdentifier	 extra Images
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the additional image <code>Iterator</code> specified via * <code>setExtraImages()</code> or <code>null</code> if none was * supplied or if a <code>null</code> value was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the additional image <code>Iterator</code> specified via <code>setExtraImages()</code> or <code>null</code> if none was supplied or if a <code>null</code> value was supplied. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Iterator	TokenNameIdentifier	 Iterator
getExtraImages	TokenNameIdentifier	 get Extra Images
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extraImages	TokenNameIdentifier	 extra Images
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the compression level for DEFLATE-compressed data which should * either be <code>java.util.Deflater.DEFAULT_COMPRESSION</code> or a * value in the range [1,9] where larger values indicate more compression. * The default setting is <code>Deflater.DEFAULT_COMPRESSION</code>. This * setting is ignored if the compression type is not DEFLATE. */	TokenNameCOMMENT_JAVADOC	 Sets the compression level for DEFLATE-compressed data which should either be <code>java.util.Deflater.DEFAULT_COMPRESSION</code> or a value in the range [1,9] where larger values indicate more compression. The default setting is <code>Deflater.DEFAULT_COMPRESSION</code>. This setting is ignored if the compression type is not DEFLATE. 
public	TokenNamepublic	
void	TokenNamevoid	
setDeflateLevel	TokenNameIdentifier	 set Deflate Level
(	TokenNameLPAREN	
int	TokenNameint	
deflateLevel	TokenNameIdentifier	 deflate Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deflateLevel	TokenNameIdentifier	 deflate Level
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
deflateLevel	TokenNameIdentifier	 deflate Level
>	TokenNameGREATER	
9	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
deflateLevel	TokenNameIdentifier	 deflate Level
!=	TokenNameNOT_EQUAL	
Deflater	TokenNameIdentifier	 Deflater
.	TokenNameDOT	
DEFAULT_COMPRESSION	TokenNameIdentifier	 DEFAULT  COMPRESSION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFEncodeParam1"	TokenNameStringLiteral	TIFFEncodeParam1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
deflateLevel	TokenNameIdentifier	 deflate Level
=	TokenNameEQUAL	
deflateLevel	TokenNameIdentifier	 deflate Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the compression level for DEFLATE compression. */	TokenNameCOMMENT_JAVADOC	 Gets the compression level for DEFLATE compression. 
public	TokenNamepublic	
int	TokenNameint	
getDeflateLevel	TokenNameIdentifier	 get Deflate Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deflateLevel	TokenNameIdentifier	 deflate Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets flag indicating whether to convert RGB data to YCbCr when the * compression type is JPEG. The default value is <code>true</code>. * This flag is ignored if the compression type is not JPEG. */	TokenNameCOMMENT_JAVADOC	 Sets flag indicating whether to convert RGB data to YCbCr when the compression type is JPEG. The default value is <code>true</code>. This flag is ignored if the compression type is not JPEG. 
public	TokenNamepublic	
void	TokenNamevoid	
setJPEGCompressRGBToYCbCr	TokenNameIdentifier	 set JPEG Compress RGB To Y Cb Cr
(	TokenNameLPAREN	
boolean	TokenNameboolean	
convertJPEGRGBToYCbCr	TokenNameIdentifier	 convert JPEGRGB To Y Cb Cr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
convertJPEGRGBToYCbCr	TokenNameIdentifier	 convert JPEGRGB To Y Cb Cr
=	TokenNameEQUAL	
convertJPEGRGBToYCbCr	TokenNameIdentifier	 convert JPEGRGB To Y Cb Cr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether RGB data will be converted to YCbCr when using JPEG compression. */	TokenNameCOMMENT_JAVADOC	 Whether RGB data will be converted to YCbCr when using JPEG compression. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getJPEGCompressRGBToYCbCr	TokenNameIdentifier	 get JPEG Compress RGB To Y Cb Cr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
convertJPEGRGBToYCbCr	TokenNameIdentifier	 convert JPEGRGB To Y Cb Cr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the JPEG compression parameters. These parameters are ignored * if the compression type is not JPEG. The argument may be * <code>null</code> to indicate that default compression parameters * are to be used. For maximum conformance with the specification it * is recommended in most cases that only the quality compression * parameter be set. * * <p> The <code>writeTablesOnly</code> and <code>JFIFHeader</code> * flags of the <code>JPEGEncodeParam</code> are ignored. The * <code>writeImageOnly</code> flag is used to determine whether the * JPEGTables field will be written to the TIFF stream: if * <code>writeImageOnly</code> is <code>true</code>, then the JPEGTables * field will be written and will contain a valid JPEG abbreviated * table specification datastream. In this case the data in each data * segment (strip or tile) will contain an abbreviated JPEG image * datastream. If the <code>writeImageOnly</code> flag is * <code>false</code>, then the JPEGTables field will not be written and * each data segment will contain a complete JPEG interchange datastream. */	TokenNameCOMMENT_JAVADOC	 Sets the JPEG compression parameters. These parameters are ignored if the compression type is not JPEG. The argument may be <code>null</code> to indicate that default compression parameters are to be used. For maximum conformance with the specification it is recommended in most cases that only the quality compression parameter be set. * <p> The <code>writeTablesOnly</code> and <code>JFIFHeader</code> flags of the <code>JPEGEncodeParam</code> are ignored. The <code>writeImageOnly</code> flag is used to determine whether the JPEGTables field will be written to the TIFF stream: if <code>writeImageOnly</code> is <code>true</code>, then the JPEGTables field will be written and will contain a valid JPEG abbreviated table specification datastream. In this case the data in each data segment (strip or tile) will contain an abbreviated JPEG image datastream. If the <code>writeImageOnly</code> flag is <code>false</code>, then the JPEGTables field will not be written and each data segment will contain a complete JPEG interchange datastream. 
public	TokenNamepublic	
void	TokenNamevoid	
setJPEGEncodeParam	TokenNameIdentifier	 set JPEG Encode Param
(	TokenNameLPAREN	
JPEGEncodeParam	TokenNameIdentifier	 JPEG Encode Param
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JPEGEncodeParam	TokenNameIdentifier	 JPEG Encode Param
)	TokenNameRPAREN	
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
.	TokenNameDOT	
setTableInfoValid	TokenNameIdentifier	 set Table Info Valid
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
.	TokenNameDOT	
setImageInfoValid	TokenNameIdentifier	 set Image Info Valid
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
=	TokenNameEQUAL	
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the JPEG compression parameters. */	TokenNameCOMMENT_JAVADOC	 Retrieves the JPEG compression parameters. 
public	TokenNamepublic	
JPEGEncodeParam	TokenNameIdentifier	 JPEG Encode Param
getJPEGEncodeParam	TokenNameIdentifier	 get JPEG Encode Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
jpegEncodeParam	TokenNameIdentifier	 jpeg Encode Param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets an array of extra fields to be written to the TIFF Image File * Directory (IFD). Fields with tags equal to the tag of any * automatically generated fields are ignored. No error checking is * performed with respect to the validity of the field contents or * the appropriateness of the field for the image being encoded. * * @param extraFields An array of extra fields; the parameter is * copied by reference. */	TokenNameCOMMENT_JAVADOC	 Sets an array of extra fields to be written to the TIFF Image File Directory (IFD). Fields with tags equal to the tag of any automatically generated fields are ignored. No error checking is performed with respect to the validity of the field contents or the appropriateness of the field for the image being encoded. * @param extraFields An array of extra fields; the parameter is copied by reference. 
public	TokenNamepublic	
void	TokenNamevoid	
setExtraFields	TokenNameIdentifier	 set Extra Fields
(	TokenNameLPAREN	
TIFFField	TokenNameIdentifier	 TIFF Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extraFields	TokenNameIdentifier	 extra Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extraFields	TokenNameIdentifier	 extra Fields
=	TokenNameEQUAL	
extraFields	TokenNameIdentifier	 extra Fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value set by <code>setExtraFields()</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the value set by <code>setExtraFields()</code>. 
public	TokenNamepublic	
TIFFField	TokenNameIdentifier	 TIFF Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extraFields	TokenNameIdentifier	 extra Fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
