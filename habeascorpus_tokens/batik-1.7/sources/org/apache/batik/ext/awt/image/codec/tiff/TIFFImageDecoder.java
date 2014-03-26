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
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
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
ImageDecoderImpl	TokenNameIdentifier	 Image Decoder Impl
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
SeekableStream	TokenNameIdentifier	 Seekable Stream
;	TokenNameSEMICOLON	
/** * A baseline TIFF reader. The reader has some functionality in addition to * the baseline specifications for Bilevel images, for which the group 3 and * group 4 decompression schemes have been implemented. Support for LZW * decompression has also been added. Support for Horizontal differencing * predictor decoding is also included, when used with LZW compression. * However, this support is limited to data with bitsPerSample value of 8. * When reading in RGB images, support for alpha and extraSamples being * present has been added. Support for reading in images with 16 bit samples * has been added. Support for the SampleFormat tag (signed samples as well * as floating-point samples) has also been added. In all other cases, support * is limited to Baseline specifications. * * @version $Id: TIFFImageDecoder.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A baseline TIFF reader. The reader has some functionality in addition to the baseline specifications for Bilevel images, for which the group 3 and group 4 decompression schemes have been implemented. Support for LZW decompression has also been added. Support for Horizontal differencing predictor decoding is also included, when used with LZW compression. However, this support is limited to data with bitsPerSample value of 8. When reading in RGB images, support for alpha and extraSamples being present has been added. Support for reading in images with 16 bit samples has been added. Support for the SampleFormat tag (signed samples as well as floating-point samples) has also been added. In all other cases, support is limited to Baseline specifications. * @version $Id: TIFFImageDecoder.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TIFFImageDecoder	TokenNameIdentifier	 TIFF Image Decoder
extends	TokenNameextends	
ImageDecoderImpl	TokenNameIdentifier	 Image Decoder Impl
{	TokenNameLBRACE	
// All the TIFF tags that we care about 	TokenNameCOMMENT_LINE	All the TIFF tags that we care about 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_IMAGE_WIDTH	TokenNameIdentifier	 TIFF  IMAGE  WIDTH
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_IMAGE_LENGTH	TokenNameIdentifier	 TIFF  IMAGE  LENGTH
=	TokenNameEQUAL	
257	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_BITS_PER_SAMPLE	TokenNameIdentifier	 TIFF  BITS  PER  SAMPLE
=	TokenNameEQUAL	
258	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_COMPRESSION	TokenNameIdentifier	 TIFF  COMPRESSION
=	TokenNameEQUAL	
259	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_PHOTOMETRIC_INTERPRETATION	TokenNameIdentifier	 TIFF  PHOTOMETRIC  INTERPRETATION
=	TokenNameEQUAL	
262	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_FILL_ORDER	TokenNameIdentifier	 TIFF  FILL  ORDER
=	TokenNameEQUAL	
266	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_STRIP_OFFSETS	TokenNameIdentifier	 TIFF  STRIP  OFFSETS
=	TokenNameEQUAL	
273	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_SAMPLES_PER_PIXEL	TokenNameIdentifier	 TIFF  SAMPLES  PER  PIXEL
=	TokenNameEQUAL	
277	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_ROWS_PER_STRIP	TokenNameIdentifier	 TIFF  ROWS  PER  STRIP
=	TokenNameEQUAL	
278	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_STRIP_BYTE_COUNTS	TokenNameIdentifier	 TIFF  STRIP  BYTE  COUNTS
=	TokenNameEQUAL	
279	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_X_RESOLUTION	TokenNameIdentifier	 TIFF  X  RESOLUTION
=	TokenNameEQUAL	
282	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_Y_RESOLUTION	TokenNameIdentifier	 TIFF  Y  RESOLUTION
=	TokenNameEQUAL	
283	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_PLANAR_CONFIGURATION	TokenNameIdentifier	 TIFF  PLANAR  CONFIGURATION
=	TokenNameEQUAL	
284	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_T4_OPTIONS	TokenNameIdentifier	 TIFF  T4  OPTIONS
=	TokenNameEQUAL	
292	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_T6_OPTIONS	TokenNameIdentifier	 TIFF  T6  OPTIONS
=	TokenNameEQUAL	
293	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_RESOLUTION_UNIT	TokenNameIdentifier	 TIFF  RESOLUTION  UNIT
=	TokenNameEQUAL	
296	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_PREDICTOR	TokenNameIdentifier	 TIFF  PREDICTOR
=	TokenNameEQUAL	
317	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_COLORMAP	TokenNameIdentifier	 TIFF  COLORMAP
=	TokenNameEQUAL	
320	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_TILE_WIDTH	TokenNameIdentifier	 TIFF  TILE  WIDTH
=	TokenNameEQUAL	
322	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_TILE_LENGTH	TokenNameIdentifier	 TIFF  TILE  LENGTH
=	TokenNameEQUAL	
323	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_TILE_OFFSETS	TokenNameIdentifier	 TIFF  TILE  OFFSETS
=	TokenNameEQUAL	
324	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_TILE_BYTE_COUNTS	TokenNameIdentifier	 TIFF  TILE  BYTE  COUNTS
=	TokenNameEQUAL	
325	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_EXTRA_SAMPLES	TokenNameIdentifier	 TIFF  EXTRA  SAMPLES
=	TokenNameEQUAL	
338	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_SAMPLE_FORMAT	TokenNameIdentifier	 TIFF  SAMPLE  FORMAT
=	TokenNameEQUAL	
339	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_S_MIN_SAMPLE_VALUE	TokenNameIdentifier	 TIFF  S  MIN  SAMPLE  VALUE
=	TokenNameEQUAL	
340	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_S_MAX_SAMPLE_VALUE	TokenNameIdentifier	 TIFF  S  MAX  SAMPLE  VALUE
=	TokenNameEQUAL	
341	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TIFFImageDecoder	TokenNameIdentifier	 TIFF Image Decoder
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumPages	TokenNameIdentifier	 get Num Pages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
TIFFDirectory	TokenNameIdentifier	 TIFF Directory
.	TokenNameDOT	
getNumDirectories	TokenNameIdentifier	 get Num Directories
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RenderedImage	TokenNameIdentifier	 Rendered Image
decodeAsRenderedImage	TokenNameIdentifier	 decode As Rendered Image
(	TokenNameLPAREN	
int	TokenNameint	
page	TokenNameIdentifier	 page
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
page	TokenNameIdentifier	 page
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
page	TokenNameIdentifier	 page
>=	TokenNameGREATER_EQUAL	
getNumPages	TokenNameIdentifier	 get Num Pages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"TIFFImageDecoder0"	TokenNameStringLiteral	TIFFImageDecoder0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TIFFImage	TokenNameIdentifier	 TIFF Image
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
(	TokenNameLPAREN	
TIFFDecodeParam	TokenNameIdentifier	 TIFF Decode Param
)	TokenNameRPAREN	
param	TokenNameIdentifier	 param
,	TokenNameCOMMA	
page	TokenNameIdentifier	 page
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
