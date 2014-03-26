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
png	TokenNameIdentifier	 png
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
PropertyUtil	TokenNameIdentifier	 Property Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ColorModel	TokenNameIdentifier	 Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
IndexColorModel	TokenNameIdentifier	 Index Color Model
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
SampleModel	TokenNameIdentifier	 Sample Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * An instance of <code>ImageEncodeParam</code> for encoding images in * the PNG format. * * <p><b> This class is not a committed part of the JAI API. It may * be removed or changed in future releases of JAI.</b> * * @version $Id: PNGEncodeParam.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An instance of <code>ImageEncodeParam</code> for encoding images in the PNG format. * <p><b> This class is not a committed part of the JAI API. It may be removed or changed in future releases of JAI.</b> * @version $Id: PNGEncodeParam.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
implements	TokenNameimplements	
ImageEncodeParam	TokenNameIdentifier	 Image Encode Param
{	TokenNameLBRACE	
/** Constant for use with the sRGB chunk. */	TokenNameCOMMENT_JAVADOC	 Constant for use with the sRGB chunk. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INTENT_PERCEPTUAL	TokenNameIdentifier	 INTENT  PERCEPTUAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for use with the sRGB chunk. */	TokenNameCOMMENT_JAVADOC	 Constant for use with the sRGB chunk. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INTENT_RELATIVE	TokenNameIdentifier	 INTENT  RELATIVE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for use with the sRGB chunk. */	TokenNameCOMMENT_JAVADOC	 Constant for use with the sRGB chunk. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INTENT_SATURATION	TokenNameIdentifier	 INTENT  SATURATION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for use with the sRGB chunk. */	TokenNameCOMMENT_JAVADOC	 Constant for use with the sRGB chunk. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INTENT_ABSOLUTE	TokenNameIdentifier	 INTENT  ABSOLUTE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for use in filtering. */	TokenNameCOMMENT_JAVADOC	 Constant for use in filtering. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PNG_FILTER_NONE	TokenNameIdentifier	 PNG  FILTER  NONE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for use in filtering. */	TokenNameCOMMENT_JAVADOC	 Constant for use in filtering. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PNG_FILTER_SUB	TokenNameIdentifier	 PNG  FILTER  SUB
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for use in filtering. */	TokenNameCOMMENT_JAVADOC	 Constant for use in filtering. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PNG_FILTER_UP	TokenNameIdentifier	 PNG  FILTER  UP
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for use in filtering. */	TokenNameCOMMENT_JAVADOC	 Constant for use in filtering. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PNG_FILTER_AVERAGE	TokenNameIdentifier	 PNG  FILTER  AVERAGE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant for use in filtering. */	TokenNameCOMMENT_JAVADOC	 Constant for use in filtering. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PNG_FILTER_PAETH	TokenNameIdentifier	 PNG  FILTER  PAETH
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Returns an instance of <code>PNGEncodeParam.Palette</code>, * <code>PNGEncodeParam.Gray</code>, or * <code>PNGEncodeParam.RGB</code> appropriate for encoding * the given image. * * <p> If the image has an <code>IndexColorModel</code>, an * instance of <code>PNGEncodeParam.Palette</code> is returned. * Otherwise, if the image has 1 or 2 bands an instance of * <code>PNGEncodeParam.Gray</code> is returned. In all other * cases an instance of <code>PNGEncodeParam.RGB</code> is * returned. * * <p> Note that this method does not provide any guarantee that * the given image will be successfully encoded by the PNG * encoder, as it only performs a very superficial analysis of * the image structure. */	TokenNameCOMMENT_JAVADOC	 Returns an instance of <code>PNGEncodeParam.Palette</code>, <code>PNGEncodeParam.Gray</code>, or <code>PNGEncodeParam.RGB</code> appropriate for encoding the given image. * <p> If the image has an <code>IndexColorModel</code>, an instance of <code>PNGEncodeParam.Palette</code> is returned. Otherwise, if the image has 1 or 2 bands an instance of <code>PNGEncodeParam.Gray</code> is returned. In all other cases an instance of <code>PNGEncodeParam.RGB</code> is returned. * <p> Note that this method does not provide any guarantee that the given image will be successfully encoded by the PNG encoder, as it only performs a very superficial analysis of the image structure. 
public	TokenNamepublic	
static	TokenNamestatic	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
getDefaultEncodeParam	TokenNameIdentifier	 get Default Encode Param
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
im	TokenNameIdentifier	 im
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorModel	TokenNameIdentifier	 Color Model
colorModel	TokenNameIdentifier	 color Model
=	TokenNameEQUAL	
im	TokenNameIdentifier	 im
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colorModel	TokenNameIdentifier	 color Model
instanceof	TokenNameinstanceof	
IndexColorModel	TokenNameIdentifier	 Index Color Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
.	TokenNameDOT	
Palette	TokenNameIdentifier	 Palette
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SampleModel	TokenNameIdentifier	 Sample Model
sampleModel	TokenNameIdentifier	 sample Model
=	TokenNameEQUAL	
im	TokenNameIdentifier	 im
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numBands	TokenNameIdentifier	 num Bands
=	TokenNameEQUAL	
sampleModel	TokenNameIdentifier	 sample Model
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numBands	TokenNameIdentifier	 num Bands
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
numBands	TokenNameIdentifier	 num Bands
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
.	TokenNameDOT	
Gray	TokenNameIdentifier	 Gray
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
.	TokenNameDOT	
RGB	TokenNameIdentifier	 RGB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Palette	TokenNameIdentifier	 Palette
extends	TokenNameextends	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
{	TokenNameLBRACE	
/** Constructs an instance of <code>PNGEncodeParam.Palette</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an instance of <code>PNGEncodeParam.Palette</code>. 
public	TokenNamepublic	
Palette	TokenNameIdentifier	 Palette
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// bKGD chunk 	TokenNameCOMMENT_LINE	bKGD chunk 
private	TokenNameprivate	
boolean	TokenNameboolean	
backgroundSet	TokenNameIdentifier	 background Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Suppresses the 'bKGD' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'bKGD' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetBackground	TokenNameIdentifier	 unset Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
backgroundSet	TokenNameIdentifier	 background Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'bKGD' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'bKGD' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBackgroundSet	TokenNameIdentifier	 is Background Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
backgroundSet	TokenNameIdentifier	 background Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the desired bit depth for a palette image. The bit * depth must be one of 1, 2, 4, or 8, or else an * <code>IllegalArgumentException</code> will be thrown. */	TokenNameCOMMENT_JAVADOC	 Sets the desired bit depth for a palette image. The bit depth must be one of 1, 2, 4, or 8, or else an <code>IllegalArgumentException</code> will be thrown. 
public	TokenNamepublic	
void	TokenNamevoid	
setBitDepth	TokenNameIdentifier	 set Bit Depth
(	TokenNameLPAREN	
int	TokenNameint	
bitDepth	TokenNameIdentifier	 bit Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam2"	TokenNameStringLiteral	PNGEncodeParam2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bitDepth	TokenNameIdentifier	 bit Depth
=	TokenNameEQUAL	
bitDepth	TokenNameIdentifier	 bit Depth
;	TokenNameSEMICOLON	
bitDepthSet	TokenNameIdentifier	 bit Depth Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// PLTE chunk 	TokenNameCOMMENT_LINE	PLTE chunk 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
palette	TokenNameIdentifier	 palette
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
paletteSet	TokenNameIdentifier	 palette Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the RGB palette of the image to be encoded. * The <code>rgb</code> parameter contains alternating * R, G, B values for each color index used in the image. * The number of elements must be a multiple of 3 between * 3 and 3*256. * * <p> The 'PLTE' chunk will encode this information. * * @param rgb An array of <code>int</code>s. */	TokenNameCOMMENT_JAVADOC	 Sets the RGB palette of the image to be encoded. The <code>rgb</code> parameter contains alternating R, G, B values for each color index used in the image. The number of elements must be a multiple of 3 between 3 and 3*256. * <p> The 'PLTE' chunk will encode this information. * @param rgb An array of <code>int</code>s. 
public	TokenNamepublic	
void	TokenNamevoid	
setPalette	TokenNameIdentifier	 set Palette
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
rgb	TokenNameIdentifier	 rgb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
256	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam0"	TokenNameStringLiteral	PNGEncodeParam0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
%	TokenNameREMAINDER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam1"	TokenNameStringLiteral	PNGEncodeParam1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
palette	TokenNameIdentifier	 palette
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paletteSet	TokenNameIdentifier	 palette Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current RGB palette. * * <p> If the palette has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the palette is not set. * * @return An array of <code>int</code>s. */	TokenNameCOMMENT_JAVADOC	 Returns the current RGB palette. * <p> If the palette has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the palette is not set. * @return An array of <code>int</code>s. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPalette	TokenNameIdentifier	 get Palette
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
paletteSet	TokenNameIdentifier	 palette Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam3"	TokenNameStringLiteral	PNGEncodeParam3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
palette	TokenNameIdentifier	 palette
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'PLTE' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'PLTE' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetPalette	TokenNameIdentifier	 unset Palette
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
palette	TokenNameIdentifier	 palette
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
paletteSet	TokenNameIdentifier	 palette Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'PLTE' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'PLTE' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPaletteSet	TokenNameIdentifier	 is Palette Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
paletteSet	TokenNameIdentifier	 palette Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bKGD chunk 	TokenNameCOMMENT_LINE	bKGD chunk 
private	TokenNameprivate	
int	TokenNameint	
backgroundPaletteIndex	TokenNameIdentifier	 background Palette Index
;	TokenNameSEMICOLON	
/** * Sets the palette index of the suggested background color. * * <p> The 'bKGD' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the palette index of the suggested background color. * <p> The 'bKGD' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setBackgroundPaletteIndex	TokenNameIdentifier	 set Background Palette Index
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
backgroundPaletteIndex	TokenNameIdentifier	 background Palette Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
backgroundSet	TokenNameIdentifier	 background Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the palette index of the suggested background color. * * <p> If the background palette index has not previously been * set, or has been unset, an * <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the palette index is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the palette index of the suggested background color. * <p> If the background palette index has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the palette index is not set. 
public	TokenNamepublic	
int	TokenNameint	
getBackgroundPaletteIndex	TokenNameIdentifier	 get Background Palette Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
backgroundSet	TokenNameIdentifier	 background Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam4"	TokenNameStringLiteral	PNGEncodeParam4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
backgroundPaletteIndex	TokenNameIdentifier	 background Palette Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tRNS chunk 	TokenNameCOMMENT_LINE	tRNS chunk 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transparency	TokenNameIdentifier	 transparency
;	TokenNameSEMICOLON	
/** * Sets the alpha values associated with each palette entry. * The <code>alpha</code> parameter should have as many entries * as there are RGB triples in the palette. * * <p> The 'tRNS' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the alpha values associated with each palette entry. The <code>alpha</code> parameter should have as many entries as there are RGB triples in the palette. * <p> The 'tRNS' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setPaletteTransparency	TokenNameIdentifier	 set Palette Transparency
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transparency	TokenNameIdentifier	 transparency
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
alpha	TokenNameIdentifier	 alpha
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
alpha	TokenNameIdentifier	 alpha
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transparency	TokenNameIdentifier	 transparency
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
alpha	TokenNameIdentifier	 alpha
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transparencySet	TokenNameIdentifier	 transparency Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the alpha values associated with each palette entry. * * <p> If the palette transparency has not previously been * set, or has been unset, an * <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the palette transparency is * not set. */	TokenNameCOMMENT_JAVADOC	 Returns the alpha values associated with each palette entry. * <p> If the palette transparency has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the palette transparency is not set. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPaletteTransparency	TokenNameIdentifier	 get Palette Transparency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transparencySet	TokenNameIdentifier	 transparency Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam5"	TokenNameStringLiteral	PNGEncodeParam5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
transparency	TokenNameIdentifier	 transparency
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
alpha	TokenNameIdentifier	 alpha
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alpha	TokenNameIdentifier	 alpha
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
transparency	TokenNameIdentifier	 transparency
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Gray	TokenNameIdentifier	 Gray
extends	TokenNameextends	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
{	TokenNameLBRACE	
/** Constructs an instance of <code>PNGEncodeParam.Gray</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an instance of <code>PNGEncodeParam.Gray</code>. 
public	TokenNamepublic	
Gray	TokenNameIdentifier	 Gray
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// bKGD chunk 	TokenNameCOMMENT_LINE	bKGD chunk 
private	TokenNameprivate	
boolean	TokenNameboolean	
backgroundSet	TokenNameIdentifier	 background Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Suppresses the 'bKGD' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'bKGD' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetBackground	TokenNameIdentifier	 unset Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
backgroundSet	TokenNameIdentifier	 background Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'bKGD' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'bKGD' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBackgroundSet	TokenNameIdentifier	 is Background Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
backgroundSet	TokenNameIdentifier	 background Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the desired bit depth for a grayscale image. The bit * depth must be one of 1, 2, 4, 8, or 16. * * <p> When encoding a source image of a greater bit depth, * pixel values will be clamped to the smaller range after * shifting by the value given by <code>getBitShift()</code>. * When encoding a source image of a smaller bit depth, pixel * values will be shifted and left-filled with zeroes. */	TokenNameCOMMENT_JAVADOC	 Sets the desired bit depth for a grayscale image. The bit depth must be one of 1, 2, 4, 8, or 16. * <p> When encoding a source image of a greater bit depth, pixel values will be clamped to the smaller range after shifting by the value given by <code>getBitShift()</code>. When encoding a source image of a smaller bit depth, pixel values will be shifted and left-filled with zeroes. 
public	TokenNamepublic	
void	TokenNamevoid	
setBitDepth	TokenNameIdentifier	 set Bit Depth
(	TokenNameLPAREN	
int	TokenNameint	
bitDepth	TokenNameIdentifier	 bit Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
8	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
16	TokenNameIntegerLiteral	
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
bitDepth	TokenNameIdentifier	 bit Depth
=	TokenNameEQUAL	
bitDepth	TokenNameIdentifier	 bit Depth
;	TokenNameSEMICOLON	
bitDepthSet	TokenNameIdentifier	 bit Depth Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bKGD chunk 	TokenNameCOMMENT_LINE	bKGD chunk 
private	TokenNameprivate	
int	TokenNameint	
backgroundPaletteGray	TokenNameIdentifier	 background Palette Gray
;	TokenNameSEMICOLON	
/** * Sets the suggested gray level of the background. * * <p> The 'bKGD' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the suggested gray level of the background. * <p> The 'bKGD' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setBackgroundGray	TokenNameIdentifier	 set Background Gray
(	TokenNameLPAREN	
int	TokenNameint	
gray	TokenNameIdentifier	 gray
)	TokenNameRPAREN	
{	TokenNameLBRACE	
backgroundPaletteGray	TokenNameIdentifier	 background Palette Gray
=	TokenNameEQUAL	
gray	TokenNameIdentifier	 gray
;	TokenNameSEMICOLON	
backgroundSet	TokenNameIdentifier	 background Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the suggested gray level of the background. * * <p> If the background gray level has not previously been * set, or has been unset, an * <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the background gray level * is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the suggested gray level of the background. * <p> If the background gray level has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the background gray level is not set. 
public	TokenNamepublic	
int	TokenNameint	
getBackgroundGray	TokenNameIdentifier	 get Background Gray
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
backgroundSet	TokenNameIdentifier	 background Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam6"	TokenNameStringLiteral	PNGEncodeParam6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
backgroundPaletteGray	TokenNameIdentifier	 background Palette Gray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tRNS chunk 	TokenNameCOMMENT_LINE	tRNS chunk 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transparency	TokenNameIdentifier	 transparency
;	TokenNameSEMICOLON	
/** * Sets the gray value to be used to denote transparency. * * <p> Setting this attribute will cause the alpha channel * of the input image to be ignored. * * <p> The 'tRNS' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the gray value to be used to denote transparency. * <p> Setting this attribute will cause the alpha channel of the input image to be ignored. * <p> The 'tRNS' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setTransparentGray	TokenNameIdentifier	 set Transparent Gray
(	TokenNameLPAREN	
int	TokenNameint	
transparentGray	TokenNameIdentifier	 transparent Gray
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transparency	TokenNameIdentifier	 transparency
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
transparency	TokenNameIdentifier	 transparency
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
transparentGray	TokenNameIdentifier	 transparent Gray
;	TokenNameSEMICOLON	
transparencySet	TokenNameIdentifier	 transparency Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the gray value to be used to denote transparency. * * <p> If the transparent gray value has not previously been * set, or has been unset, an * <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the transparent gray value * is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the gray value to be used to denote transparency. * <p> If the transparent gray value has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the transparent gray value is not set. 
public	TokenNamepublic	
int	TokenNameint	
getTransparentGray	TokenNameIdentifier	 get Transparent Gray
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transparencySet	TokenNameIdentifier	 transparency Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam7"	TokenNameStringLiteral	PNGEncodeParam7
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
gray	TokenNameIdentifier	 gray
=	TokenNameEQUAL	
transparency	TokenNameIdentifier	 transparency
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gray	TokenNameIdentifier	 gray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
bitShift	TokenNameIdentifier	 bit Shift
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
bitShiftSet	TokenNameIdentifier	 bit Shift Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the desired bit shift for a grayscale image. * Pixels in the source image will be shifted right by * the given amount prior to being clamped to the maximum * value given by the encoded image's bit depth. */	TokenNameCOMMENT_JAVADOC	 Sets the desired bit shift for a grayscale image. Pixels in the source image will be shifted right by the given amount prior to being clamped to the maximum value given by the encoded image's bit depth. 
public	TokenNamepublic	
void	TokenNamevoid	
setBitShift	TokenNameIdentifier	 set Bit Shift
(	TokenNameLPAREN	
int	TokenNameint	
bitShift	TokenNameIdentifier	 bit Shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitShift	TokenNameIdentifier	 bit Shift
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bitShift	TokenNameIdentifier	 bit Shift
=	TokenNameEQUAL	
bitShift	TokenNameIdentifier	 bit Shift
;	TokenNameSEMICOLON	
bitShiftSet	TokenNameIdentifier	 bit Shift Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the desired bit shift for a grayscale image. * * <p> If the bit shift has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the bit shift is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the desired bit shift for a grayscale image. * <p> If the bit shift has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the bit shift is not set. 
public	TokenNamepublic	
int	TokenNameint	
getBitShift	TokenNameIdentifier	 get Bit Shift
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
bitShiftSet	TokenNameIdentifier	 bit Shift Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam8"	TokenNameStringLiteral	PNGEncodeParam8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bitShift	TokenNameIdentifier	 bit Shift
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the setting of the bit shift of a grayscale image. * Pixels in the source image will not be shifted prior to encoding. */	TokenNameCOMMENT_JAVADOC	 Suppresses the setting of the bit shift of a grayscale image. Pixels in the source image will not be shifted prior to encoding. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetBitShift	TokenNameIdentifier	 unset Bit Shift
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitShiftSet	TokenNameIdentifier	 bit Shift Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the bit shift has been set. */	TokenNameCOMMENT_JAVADOC	 Returns true if the bit shift has been set. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBitShiftSet	TokenNameIdentifier	 is Bit Shift Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bitShiftSet	TokenNameIdentifier	 bit Shift Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the bit depth has been set. */	TokenNameCOMMENT_JAVADOC	 Returns true if the bit depth has been set. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBitDepthSet	TokenNameIdentifier	 is Bit Depth Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bitDepthSet	TokenNameIdentifier	 bit Depth Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
RGB	TokenNameIdentifier	 RGB
extends	TokenNameextends	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
{	TokenNameLBRACE	
/** Constructs an instance of <code>PNGEncodeParam.RGB</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an instance of <code>PNGEncodeParam.RGB</code>. 
public	TokenNamepublic	
RGB	TokenNameIdentifier	 RGB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// bKGD chunk 	TokenNameCOMMENT_LINE	bKGD chunk 
private	TokenNameprivate	
boolean	TokenNameboolean	
backgroundSet	TokenNameIdentifier	 background Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Suppresses the 'bKGD' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'bKGD' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetBackground	TokenNameIdentifier	 unset Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
backgroundSet	TokenNameIdentifier	 background Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'bKGD' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'bKGD' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBackgroundSet	TokenNameIdentifier	 is Background Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
backgroundSet	TokenNameIdentifier	 background Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the desired bit depth for an RGB image. The bit * depth must be 8 or 16. */	TokenNameCOMMENT_JAVADOC	 Sets the desired bit depth for an RGB image. The bit depth must be 8 or 16. 
public	TokenNamepublic	
void	TokenNamevoid	
setBitDepth	TokenNameIdentifier	 set Bit Depth
(	TokenNameLPAREN	
int	TokenNameint	
bitDepth	TokenNameIdentifier	 bit Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
8	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitDepth	TokenNameIdentifier	 bit Depth
!=	TokenNameNOT_EQUAL	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bitDepth	TokenNameIdentifier	 bit Depth
=	TokenNameEQUAL	
bitDepth	TokenNameIdentifier	 bit Depth
;	TokenNameSEMICOLON	
bitDepthSet	TokenNameIdentifier	 bit Depth Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bKGD chunk 	TokenNameCOMMENT_LINE	bKGD chunk 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
backgroundRGB	TokenNameIdentifier	 background RGB
;	TokenNameSEMICOLON	
/** * Sets the RGB value of the suggested background color. * The <code>rgb</code> parameter should have 3 entries. * * <p> The 'bKGD' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the RGB value of the suggested background color. The <code>rgb</code> parameter should have 3 entries. * <p> The 'bKGD' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setBackgroundRGB	TokenNameIdentifier	 set Background RGB
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
backgroundRGB	TokenNameIdentifier	 background RGB
=	TokenNameEQUAL	
rgb	TokenNameIdentifier	 rgb
;	TokenNameSEMICOLON	
backgroundSet	TokenNameIdentifier	 background Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the RGB value of the suggested background color. * * <p> If the background color has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the background color is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the RGB value of the suggested background color. * <p> If the background color has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the background color is not set. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBackgroundRGB	TokenNameIdentifier	 get Background RGB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
backgroundSet	TokenNameIdentifier	 background Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam9"	TokenNameStringLiteral	PNGEncodeParam9
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
backgroundRGB	TokenNameIdentifier	 background RGB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tRNS chunk 	TokenNameCOMMENT_LINE	tRNS chunk 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transparency	TokenNameIdentifier	 transparency
;	TokenNameSEMICOLON	
/** * Sets the RGB value to be used to denote transparency. * * <p> Setting this attribute will cause the alpha channel * of the input image to be ignored. * * <p> The 'tRNS' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the RGB value to be used to denote transparency. * <p> Setting this attribute will cause the alpha channel of the input image to be ignored. * <p> The 'tRNS' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setTransparentRGB	TokenNameIdentifier	 set Transparent RGB
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transparentRGB	TokenNameIdentifier	 transparent RGB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transparency	TokenNameIdentifier	 transparency
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
transparentRGB	TokenNameIdentifier	 transparent RGB
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transparencySet	TokenNameIdentifier	 transparency Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the RGB value to be used to denote transparency. * * <p> If the transparent color has not previously been set, * or has been unset, an <code>IllegalStateException</code> * will be thrown. * * @throws IllegalStateException if the transparent color is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the RGB value to be used to denote transparency. * <p> If the transparent color has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the transparent color is not set. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTransparentRGB	TokenNameIdentifier	 get Transparent RGB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transparencySet	TokenNameIdentifier	 transparency Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam10"	TokenNameStringLiteral	PNGEncodeParam10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
transparency	TokenNameIdentifier	 transparency
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
bitDepth	TokenNameIdentifier	 bit Depth
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
bitDepthSet	TokenNameIdentifier	 bit Depth Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the desired bit depth of an image. */	TokenNameCOMMENT_JAVADOC	 Sets the desired bit depth of an image. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
setBitDepth	TokenNameIdentifier	 set Bit Depth
(	TokenNameLPAREN	
int	TokenNameint	
bitDepth	TokenNameIdentifier	 bit Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the desired bit depth for a grayscale image. * * <p> If the bit depth has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the bit depth is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the desired bit depth for a grayscale image. * <p> If the bit depth has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the bit depth is not set. 
public	TokenNamepublic	
int	TokenNameint	
getBitDepth	TokenNameIdentifier	 get Bit Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
bitDepthSet	TokenNameIdentifier	 bit Depth Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam11"	TokenNameStringLiteral	PNGEncodeParam11
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bitDepth	TokenNameIdentifier	 bit Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the setting of the bit depth of a grayscale image. * The depth of the encoded image will be inferred from the source * image bit depth, rounded up to the next power of 2 between 1 * and 16. */	TokenNameCOMMENT_JAVADOC	 Suppresses the setting of the bit depth of a grayscale image. The depth of the encoded image will be inferred from the source image bit depth, rounded up to the next power of 2 between 1 and 16. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetBitDepth	TokenNameIdentifier	 unset Bit Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitDepthSet	TokenNameIdentifier	 bit Depth Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
useInterlacing	TokenNameIdentifier	 use Interlacing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Turns Adam7 interlacing on or off. */	TokenNameCOMMENT_JAVADOC	 Turns Adam7 interlacing on or off. 
public	TokenNamepublic	
void	TokenNamevoid	
setInterlacing	TokenNameIdentifier	 set Interlacing
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useInterlacing	TokenNameIdentifier	 use Interlacing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
useInterlacing	TokenNameIdentifier	 use Interlacing
=	TokenNameEQUAL	
useInterlacing	TokenNameIdentifier	 use Interlacing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if Adam7 interlacing will be used. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if Adam7 interlacing will be used. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getInterlacing	TokenNameIdentifier	 get Interlacing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
useInterlacing	TokenNameIdentifier	 use Interlacing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bKGD chunk - delegate to subclasses 	TokenNameCOMMENT_LINE	bKGD chunk - delegate to subclasses 
// In JAI 1.0, 'backgroundSet' was private. The JDK 1.2 compiler 	TokenNameCOMMENT_LINE	In JAI 1.0, 'backgroundSet' was private. The JDK 1.2 compiler 
// was lenient and incorrectly allowed this variable to be 	TokenNameCOMMENT_LINE	was lenient and incorrectly allowed this variable to be 
// accessed from the subclasses. The JDK 1.3 compiler correctly 	TokenNameCOMMENT_LINE	accessed from the subclasses. The JDK 1.3 compiler correctly 
// flags this as a use of a non-static variable in a static 	TokenNameCOMMENT_LINE	flags this as a use of a non-static variable in a static 
// context. Changing 'backgroundSet' to protected would have 	TokenNameCOMMENT_LINE	context. Changing 'backgroundSet' to protected would have 
// solved the problem, but would have introduced a visible API 	TokenNameCOMMENT_LINE	solved the problem, but would have introduced a visible API 
// change. Thus we are forced to adopt the solution of placing a 	TokenNameCOMMENT_LINE	change. Thus we are forced to adopt the solution of placing a 
// separate private variable in each subclass and providing 	TokenNameCOMMENT_LINE	separate private variable in each subclass and providing 
// separate implementations of 'unsetBackground' and 	TokenNameCOMMENT_LINE	separate implementations of 'unsetBackground' and 
// 'isBackgroundSet' in each concrete subclass. 	TokenNameCOMMENT_LINE	'isBackgroundSet' in each concrete subclass. 
/** * Suppresses the 'bKGD' chunk from being output. * For API compatibility with JAI 1.0, the superclass * defines this method to throw a <code>RuntimeException</code>; * accordingly, subclasses must provide their own implementations. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'bKGD' chunk from being output. For API compatibility with JAI 1.0, the superclass defines this method to throw a <code>RuntimeException</code>; accordingly, subclasses must provide their own implementations. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetBackground	TokenNameIdentifier	 unset Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam23"	TokenNameStringLiteral	PNGEncodeParam23
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'bKGD' chunk will be output. * For API compatibility with JAI 1.0, the superclass * defines this method to throw a <code>RuntimeException</code>; * accordingly, subclasses must provide their own implementations. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'bKGD' chunk will be output. For API compatibility with JAI 1.0, the superclass defines this method to throw a <code>RuntimeException</code>; accordingly, subclasses must provide their own implementations. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBackgroundSet	TokenNameIdentifier	 is Background Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam24"	TokenNameStringLiteral	PNGEncodeParam24
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// cHRM chunk 	TokenNameCOMMENT_LINE	cHRM chunk 
private	TokenNameprivate	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chromaticity	TokenNameIdentifier	 chromaticity
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
chromaticitySet	TokenNameIdentifier	 chromaticity Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the white point and primary chromaticities in CIE (x, y) * space. * * <p> The <code>chromaticity</code> parameter should be a * <code>float</code> array of length 8 containing the white point * X and Y, red X and Y, green X and Y, and blue X and Y values in * order. * * <p> The 'cHRM' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the white point and primary chromaticities in CIE (x, y) space. * <p> The <code>chromaticity</code> parameter should be a <code>float</code> array of length 8 containing the white point X and Y, red X and Y, green X and Y, and blue X and Y values in order. * <p> The 'cHRM' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setChromaticity	TokenNameIdentifier	 set Chromaticity
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chromaticity	TokenNameIdentifier	 chromaticity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chromaticity	TokenNameIdentifier	 chromaticity
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
8	TokenNameIntegerLiteral	
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
chromaticity	TokenNameIdentifier	 chromaticity
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
chromaticity	TokenNameIdentifier	 chromaticity
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chromaticitySet	TokenNameIdentifier	 chromaticity Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A convenience method that calls the array version. */	TokenNameCOMMENT_JAVADOC	 A convenience method that calls the array version. 
public	TokenNamepublic	
void	TokenNamevoid	
setChromaticity	TokenNameIdentifier	 set Chromaticity
(	TokenNameLPAREN	
float	TokenNamefloat	
whitePointX	TokenNameIdentifier	 white Point X
,	TokenNameCOMMA	
float	TokenNamefloat	
whitePointY	TokenNameIdentifier	 white Point Y
,	TokenNameCOMMA	
float	TokenNamefloat	
redX	TokenNameIdentifier	 red X
,	TokenNameCOMMA	
float	TokenNamefloat	
redY	TokenNameIdentifier	 red Y
,	TokenNameCOMMA	
float	TokenNamefloat	
greenX	TokenNameIdentifier	 green X
,	TokenNameCOMMA	
float	TokenNamefloat	
greenY	TokenNameIdentifier	 green Y
,	TokenNameCOMMA	
float	TokenNamefloat	
blueX	TokenNameIdentifier	 blue X
,	TokenNameCOMMA	
float	TokenNamefloat	
blueY	TokenNameIdentifier	 blue Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chroma	TokenNameIdentifier	 chroma
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
chroma	TokenNameIdentifier	 chroma
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
whitePointX	TokenNameIdentifier	 white Point X
;	TokenNameSEMICOLON	
chroma	TokenNameIdentifier	 chroma
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
whitePointY	TokenNameIdentifier	 white Point Y
;	TokenNameSEMICOLON	
chroma	TokenNameIdentifier	 chroma
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
redX	TokenNameIdentifier	 red X
;	TokenNameSEMICOLON	
chroma	TokenNameIdentifier	 chroma
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
redY	TokenNameIdentifier	 red Y
;	TokenNameSEMICOLON	
chroma	TokenNameIdentifier	 chroma
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
greenX	TokenNameIdentifier	 green X
;	TokenNameSEMICOLON	
chroma	TokenNameIdentifier	 chroma
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
greenY	TokenNameIdentifier	 green Y
;	TokenNameSEMICOLON	
chroma	TokenNameIdentifier	 chroma
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
blueX	TokenNameIdentifier	 blue X
;	TokenNameSEMICOLON	
chroma	TokenNameIdentifier	 chroma
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
blueY	TokenNameIdentifier	 blue Y
;	TokenNameSEMICOLON	
setChromaticity	TokenNameIdentifier	 set Chromaticity
(	TokenNameLPAREN	
chroma	TokenNameIdentifier	 chroma
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the white point and primary chromaticities in * CIE (x, y) space. * * <p> See the documentation for the <code>setChromaticity</code> * method for the format of the returned data. * * <p> If the chromaticity has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the chromaticity is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the white point and primary chromaticities in CIE (x, y) space. * <p> See the documentation for the <code>setChromaticity</code> method for the format of the returned data. * <p> If the chromaticity has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the chromaticity is not set. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getChromaticity	TokenNameIdentifier	 get Chromaticity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
chromaticitySet	TokenNameIdentifier	 chromaticity Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam12"	TokenNameStringLiteral	PNGEncodeParam12
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
chromaticity	TokenNameIdentifier	 chromaticity
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'cHRM' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'cHRM' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetChromaticity	TokenNameIdentifier	 unset Chromaticity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chromaticity	TokenNameIdentifier	 chromaticity
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
chromaticitySet	TokenNameIdentifier	 chromaticity Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'cHRM' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'cHRM' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isChromaticitySet	TokenNameIdentifier	 is Chromaticity Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
chromaticitySet	TokenNameIdentifier	 chromaticity Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// gAMA chunk 	TokenNameCOMMENT_LINE	gAMA chunk 
private	TokenNameprivate	
float	TokenNamefloat	
gamma	TokenNameIdentifier	 gamma
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
gammaSet	TokenNameIdentifier	 gamma Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the file gamma value for the image. * * <p> The 'gAMA' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the file gamma value for the image. * <p> The 'gAMA' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setGamma	TokenNameIdentifier	 set Gamma
(	TokenNameLPAREN	
float	TokenNamefloat	
gamma	TokenNameIdentifier	 gamma
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
gamma	TokenNameIdentifier	 gamma
=	TokenNameEQUAL	
gamma	TokenNameIdentifier	 gamma
;	TokenNameSEMICOLON	
gammaSet	TokenNameIdentifier	 gamma Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the file gamma value for the image. * * <p> If the file gamma has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the gamma is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the file gamma value for the image. * <p> If the file gamma has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the gamma is not set. 
public	TokenNamepublic	
float	TokenNamefloat	
getGamma	TokenNameIdentifier	 get Gamma
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
gammaSet	TokenNameIdentifier	 gamma Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam13"	TokenNameStringLiteral	PNGEncodeParam13
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
gamma	TokenNameIdentifier	 gamma
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'gAMA' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'gAMA' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetGamma	TokenNameIdentifier	 unset Gamma
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gammaSet	TokenNameIdentifier	 gamma Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'gAMA' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'gAMA' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isGammaSet	TokenNameIdentifier	 is Gamma Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gammaSet	TokenNameIdentifier	 gamma Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hIST chunk 	TokenNameCOMMENT_LINE	hIST chunk 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paletteHistogram	TokenNameIdentifier	 palette Histogram
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
paletteHistogramSet	TokenNameIdentifier	 palette Histogram Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the palette histogram to be stored with this image. * The histogram consists of an array of integers, one per * palette entry. * * <p> The 'hIST' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the palette histogram to be stored with this image. The histogram consists of an array of integers, one per palette entry. * <p> The 'hIST' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setPaletteHistogram	TokenNameIdentifier	 set Palette Histogram
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paletteHistogram	TokenNameIdentifier	 palette Histogram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
paletteHistogram	TokenNameIdentifier	 palette Histogram
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
paletteHistogram	TokenNameIdentifier	 palette Histogram
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paletteHistogramSet	TokenNameIdentifier	 palette Histogram Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the palette histogram to be stored with this image. * * <p> If the histogram has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the histogram is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the palette histogram to be stored with this image. * <p> If the histogram has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the histogram is not set. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPaletteHistogram	TokenNameIdentifier	 get Palette Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
paletteHistogramSet	TokenNameIdentifier	 palette Histogram Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam14"	TokenNameStringLiteral	PNGEncodeParam14
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
paletteHistogram	TokenNameIdentifier	 palette Histogram
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'hIST' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'hIST' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetPaletteHistogram	TokenNameIdentifier	 unset Palette Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
paletteHistogram	TokenNameIdentifier	 palette Histogram
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
paletteHistogramSet	TokenNameIdentifier	 palette Histogram Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'hIST' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'hIST' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPaletteHistogramSet	TokenNameIdentifier	 is Palette Histogram Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
paletteHistogramSet	TokenNameIdentifier	 palette Histogram Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// iCCP chunk 	TokenNameCOMMENT_LINE	iCCP chunk 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ICCProfileData	TokenNameIdentifier	 ICC Profile Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
ICCProfileDataSet	TokenNameIdentifier	 ICC Profile Data Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the ICC profile data to be stored with this image. * The profile is represented in raw binary form. * * <p> The 'iCCP' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the ICC profile data to be stored with this image. The profile is represented in raw binary form. * <p> The 'iCCP' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setICCProfileData	TokenNameIdentifier	 set ICC Profile Data
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ICCProfileData	TokenNameIdentifier	 ICC Profile Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ICCProfileData	TokenNameIdentifier	 ICC Profile Data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
ICCProfileData	TokenNameIdentifier	 ICC Profile Data
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ICCProfileDataSet	TokenNameIdentifier	 ICC Profile Data Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the ICC profile data to be stored with this image. * * <p> If the ICC profile has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the ICC profile is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the ICC profile data to be stored with this image. * <p> If the ICC profile has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the ICC profile is not set. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getICCProfileData	TokenNameIdentifier	 get ICC Profile Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ICCProfileDataSet	TokenNameIdentifier	 ICC Profile Data Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam15"	TokenNameStringLiteral	PNGEncodeParam15
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
ICCProfileData	TokenNameIdentifier	 ICC Profile Data
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'iCCP' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'iCCP' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetICCProfileData	TokenNameIdentifier	 unset ICC Profile Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ICCProfileData	TokenNameIdentifier	 ICC Profile Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ICCProfileDataSet	TokenNameIdentifier	 ICC Profile Data Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'iCCP' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'iCCP' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isICCProfileDataSet	TokenNameIdentifier	 is ICC Profile Data Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ICCProfileDataSet	TokenNameIdentifier	 ICC Profile Data Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// pHYS chunk 	TokenNameCOMMENT_LINE	pHYS chunk 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
physicalDimension	TokenNameIdentifier	 physical Dimension
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
physicalDimensionSet	TokenNameIdentifier	 physical Dimension Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the physical dimension information to be stored with this * image. The physicalDimension parameter should be a 3-entry * array containing the number of pixels per unit in the X * direction, the number of pixels per unit in the Y direction, * and the unit specifier (0 = unknown, 1 = meters). * * <p> The 'pHYS' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the physical dimension information to be stored with this image. The physicalDimension parameter should be a 3-entry array containing the number of pixels per unit in the X direction, the number of pixels per unit in the Y direction, and the unit specifier (0 = unknown, 1 = meters). * <p> The 'pHYS' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setPhysicalDimension	TokenNameIdentifier	 set Physical Dimension
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
physicalDimension	TokenNameIdentifier	 physical Dimension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
physicalDimension	TokenNameIdentifier	 physical Dimension
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
physicalDimension	TokenNameIdentifier	 physical Dimension
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
physicalDimensionSet	TokenNameIdentifier	 physical Dimension Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A convenience method that calls the array version. */	TokenNameCOMMENT_JAVADOC	 A convenience method that calls the array version. 
public	TokenNamepublic	
void	TokenNamevoid	
setPhysicalDimension	TokenNameIdentifier	 set Physical Dimension
(	TokenNameLPAREN	
int	TokenNameint	
xPixelsPerUnit	TokenNameIdentifier	 x Pixels Per Unit
,	TokenNameCOMMA	
int	TokenNameint	
yPixelsPerUnit	TokenNameIdentifier	 y Pixels Per Unit
,	TokenNameCOMMA	
int	TokenNameint	
unitSpecifier	TokenNameIdentifier	 unit Specifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pd	TokenNameIdentifier	 pd
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pd	TokenNameIdentifier	 pd
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
xPixelsPerUnit	TokenNameIdentifier	 x Pixels Per Unit
;	TokenNameSEMICOLON	
pd	TokenNameIdentifier	 pd
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
yPixelsPerUnit	TokenNameIdentifier	 y Pixels Per Unit
;	TokenNameSEMICOLON	
pd	TokenNameIdentifier	 pd
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
unitSpecifier	TokenNameIdentifier	 unit Specifier
;	TokenNameSEMICOLON	
setPhysicalDimension	TokenNameIdentifier	 set Physical Dimension
(	TokenNameLPAREN	
pd	TokenNameIdentifier	 pd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the physical dimension information to be stored * with this image. * * <p> If the physical dimension information has not previously * been set, or has been unset, an * <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the physical dimension information * is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the physical dimension information to be stored with this image. * <p> If the physical dimension information has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the physical dimension information is not set. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPhysicalDimension	TokenNameIdentifier	 get Physical Dimension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
physicalDimensionSet	TokenNameIdentifier	 physical Dimension Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam16"	TokenNameStringLiteral	PNGEncodeParam16
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
physicalDimension	TokenNameIdentifier	 physical Dimension
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'pHYS' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'pHYS' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetPhysicalDimension	TokenNameIdentifier	 unset Physical Dimension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
physicalDimension	TokenNameIdentifier	 physical Dimension
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
physicalDimensionSet	TokenNameIdentifier	 physical Dimension Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'pHYS' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'pHYS' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPhysicalDimensionSet	TokenNameIdentifier	 is Physical Dimension Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
physicalDimensionSet	TokenNameIdentifier	 physical Dimension Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sPLT chunk 	TokenNameCOMMENT_LINE	sPLT chunk 
private	TokenNameprivate	
PNGSuggestedPaletteEntry	TokenNameIdentifier	 PNG Suggested Palette Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
suggestedPalette	TokenNameIdentifier	 suggested Palette
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
suggestedPaletteSet	TokenNameIdentifier	 suggested Palette Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the suggested palette information to be stored with this * image. The information is passed to this method as an array of * <code>PNGSuggestedPaletteEntry</code> objects. * * <p> The 'sPLT' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the suggested palette information to be stored with this image. The information is passed to this method as an array of <code>PNGSuggestedPaletteEntry</code> objects. * <p> The 'sPLT' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setSuggestedPalette	TokenNameIdentifier	 set Suggested Palette
(	TokenNameLPAREN	
PNGSuggestedPaletteEntry	TokenNameIdentifier	 PNG Suggested Palette Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
palette	TokenNameIdentifier	 palette
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suggestedPalette	TokenNameIdentifier	 suggested Palette
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PNGSuggestedPaletteEntry	TokenNameIdentifier	 PNG Suggested Palette Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
palette	TokenNameIdentifier	 palette
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suggestedPaletteSet	TokenNameIdentifier	 suggested Palette Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the suggested palette information to be stored with this * image. * * <p> If the suggested palette information has not previously * been set, or has been unset, an * <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the suggested palette * information is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the suggested palette information to be stored with this image. * <p> If the suggested palette information has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the suggested palette information is not set. 
public	TokenNamepublic	
PNGSuggestedPaletteEntry	TokenNameIdentifier	 PNG Suggested Palette Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSuggestedPalette	TokenNameIdentifier	 get Suggested Palette
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
suggestedPaletteSet	TokenNameIdentifier	 suggested Palette Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam17"	TokenNameStringLiteral	PNGEncodeParam17
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
PNGSuggestedPaletteEntry	TokenNameIdentifier	 PNG Suggested Palette Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
suggestedPalette	TokenNameIdentifier	 suggested Palette
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'sPLT' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'sPLT' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetSuggestedPalette	TokenNameIdentifier	 unset Suggested Palette
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suggestedPalette	TokenNameIdentifier	 suggested Palette
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
suggestedPaletteSet	TokenNameIdentifier	 suggested Palette Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'sPLT' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'sPLT' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSuggestedPaletteSet	TokenNameIdentifier	 is Suggested Palette Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
suggestedPaletteSet	TokenNameIdentifier	 suggested Palette Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sBIT chunk 	TokenNameCOMMENT_LINE	sBIT chunk 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
significantBits	TokenNameIdentifier	 significant Bits
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
significantBitsSet	TokenNameIdentifier	 significant Bits Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the number of significant bits for each band of the image. * * <p> The number of entries in the <code>significantBits</code> * array must be equal to the number of output bands in the image: * 1 for a gray image, 2 for gray+alpha, 3 for index or truecolor, * and 4 for truecolor+alpha. * * <p> The 'sBIT' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the number of significant bits for each band of the image. * <p> The number of entries in the <code>significantBits</code> array must be equal to the number of output bands in the image: 1 for a gray image, 2 for gray+alpha, 3 for index or truecolor, and 4 for truecolor+alpha. * <p> The 'sBIT' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setSignificantBits	TokenNameIdentifier	 set Significant Bits
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
significantBits	TokenNameIdentifier	 significant Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
significantBits	TokenNameIdentifier	 significant Bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
significantBits	TokenNameIdentifier	 significant Bits
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
significantBitsSet	TokenNameIdentifier	 significant Bits Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of significant bits for each band of the image. * * <p> If the significant bits values have not previously been * set, or have been unset, an <code>IllegalStateException</code> * will be thrown. * * @throws IllegalStateException if the significant bits values are * not set. */	TokenNameCOMMENT_JAVADOC	 Returns the number of significant bits for each band of the image. * <p> If the significant bits values have not previously been set, or have been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the significant bits values are not set. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSignificantBits	TokenNameIdentifier	 get Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
significantBitsSet	TokenNameIdentifier	 significant Bits Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam18"	TokenNameStringLiteral	PNGEncodeParam18
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
significantBits	TokenNameIdentifier	 significant Bits
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'sBIT' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'sBIT' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetSignificantBits	TokenNameIdentifier	 unset Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
significantBits	TokenNameIdentifier	 significant Bits
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
significantBitsSet	TokenNameIdentifier	 significant Bits Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if an 'sBIT' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if an 'sBIT' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSignificantBitsSet	TokenNameIdentifier	 is Significant Bits Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
significantBitsSet	TokenNameIdentifier	 significant Bits Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sRGB chunk 	TokenNameCOMMENT_LINE	sRGB chunk 
private	TokenNameprivate	
int	TokenNameint	
SRGBIntent	TokenNameIdentifier	 SRGB Intent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
SRGBIntentSet	TokenNameIdentifier	 SRGB Intent Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the sRGB rendering intent to be stored with this image. * The legal values are 0 = Perceptual, 1 = Relative Colorimetric, * 2 = Saturation, and 3 = Absolute Colorimetric. Refer to the * PNG specification for information on these values. * * <p> The 'sRGB' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the sRGB rendering intent to be stored with this image. The legal values are 0 = Perceptual, 1 = Relative Colorimetric, 2 = Saturation, and 3 = Absolute Colorimetric. Refer to the PNG specification for information on these values. * <p> The 'sRGB' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setSRGBIntent	TokenNameIdentifier	 set SRGB Intent
(	TokenNameLPAREN	
int	TokenNameint	
SRGBIntent	TokenNameIdentifier	 SRGB Intent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
SRGBIntent	TokenNameIdentifier	 SRGB Intent
=	TokenNameEQUAL	
SRGBIntent	TokenNameIdentifier	 SRGB Intent
;	TokenNameSEMICOLON	
SRGBIntentSet	TokenNameIdentifier	 SRGB Intent Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the sRGB rendering intent to be stored with this image. * * <p> If the sRGB intent has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the sRGB intent is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the sRGB rendering intent to be stored with this image. * <p> If the sRGB intent has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the sRGB intent is not set. 
public	TokenNamepublic	
int	TokenNameint	
getSRGBIntent	TokenNameIdentifier	 get SRGB Intent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
SRGBIntentSet	TokenNameIdentifier	 SRGB Intent Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam19"	TokenNameStringLiteral	PNGEncodeParam19
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
SRGBIntent	TokenNameIdentifier	 SRGB Intent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'sRGB' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'sRGB' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetSRGBIntent	TokenNameIdentifier	 unset SRGB Intent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SRGBIntentSet	TokenNameIdentifier	 SRGB Intent Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if an 'sRGB' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if an 'sRGB' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSRGBIntentSet	TokenNameIdentifier	 is SRGB Intent Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SRGBIntentSet	TokenNameIdentifier	 SRGB Intent Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tEXt chunk 	TokenNameCOMMENT_LINE	tEXt chunk 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
textSet	TokenNameIdentifier	 text Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the textual data to be stored in uncompressed form with this * image. The data is passed to this method as an array of * <code>String</code>s. * * <p> The 'tEXt' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the textual data to be stored in uncompressed form with this image. The data is passed to this method as an array of <code>String</code>s. * <p> The 'tEXt' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
textSet	TokenNameIdentifier	 text Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the text strings to be stored in uncompressed form with this * image as an array of <code>String</code>s. * * <p> If the text strings have not previously been set, or have been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the text strings are not set. */	TokenNameCOMMENT_JAVADOC	 Returns the text strings to be stored in uncompressed form with this image as an array of <code>String</code>s. * <p> If the text strings have not previously been set, or have been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the text strings are not set. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
textSet	TokenNameIdentifier	 text Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam20"	TokenNameStringLiteral	PNGEncodeParam20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'tEXt' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'tEXt' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetText	TokenNameIdentifier	 unset Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
textSet	TokenNameIdentifier	 text Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'tEXt' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'tEXt' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isTextSet	TokenNameIdentifier	 is Text Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textSet	TokenNameIdentifier	 text Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tIME chunk 	TokenNameCOMMENT_LINE	tIME chunk 
private	TokenNameprivate	
Date	TokenNameIdentifier	 Date
modificationTime	TokenNameIdentifier	 modification Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
modificationTimeSet	TokenNameIdentifier	 modification Time Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the modification time, as a <code>Date</code>, to be * stored with this image. The internal storage format will use * UTC regardless of how the <code>modificationTime</code> * parameter was created. * * <p> The 'tIME' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the modification time, as a <code>Date</code>, to be stored with this image. The internal storage format will use UTC regardless of how the <code>modificationTime</code> parameter was created. * <p> The 'tIME' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setModificationTime	TokenNameIdentifier	 set Modification Time
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
modificationTime	TokenNameIdentifier	 modification Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
modificationTime	TokenNameIdentifier	 modification Time
=	TokenNameEQUAL	
modificationTime	TokenNameIdentifier	 modification Time
;	TokenNameSEMICOLON	
modificationTimeSet	TokenNameIdentifier	 modification Time Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the modification time to be stored with this image. * * <p> If the bit depth has not previously been set, or has been * unset, an <code>IllegalStateException</code> will be thrown. * * @throws IllegalStateException if the bit depth is not set. */	TokenNameCOMMENT_JAVADOC	 Returns the modification time to be stored with this image. * <p> If the bit depth has not previously been set, or has been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the bit depth is not set. 
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
getModificationTime	TokenNameIdentifier	 get Modification Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
modificationTimeSet	TokenNameIdentifier	 modification Time Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam21"	TokenNameStringLiteral	PNGEncodeParam21
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
modificationTime	TokenNameIdentifier	 modification Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'tIME' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'tIME' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetModificationTime	TokenNameIdentifier	 unset Modification Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modificationTime	TokenNameIdentifier	 modification Time
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
modificationTimeSet	TokenNameIdentifier	 modification Time Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'tIME' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'tIME' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isModificationTimeSet	TokenNameIdentifier	 is Modification Time Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modificationTimeSet	TokenNameIdentifier	 modification Time Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tRNS chunk 	TokenNameCOMMENT_LINE	tRNS chunk 
boolean	TokenNameboolean	
transparencySet	TokenNameIdentifier	 transparency Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Suppresses the 'tRNS' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'tRNS' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetTransparency	TokenNameIdentifier	 unset Transparency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transparencySet	TokenNameIdentifier	 transparency Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'tRNS' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'tRNS' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isTransparencySet	TokenNameIdentifier	 is Transparency Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transparencySet	TokenNameIdentifier	 transparency Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// zTXT chunk 	TokenNameCOMMENT_LINE	zTXT chunk 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zText	TokenNameIdentifier	 z Text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
zTextSet	TokenNameIdentifier	 z Text Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the text strings to be stored in compressed form with this * image. The data is passed to this method as an array of * <code>String</code>s. * * <p> The 'zTXt' chunk will encode this information. */	TokenNameCOMMENT_JAVADOC	 Sets the text strings to be stored in compressed form with this image. The data is passed to this method as an array of <code>String</code>s. * <p> The 'zTXt' chunk will encode this information. 
public	TokenNamepublic	
void	TokenNamevoid	
setCompressedText	TokenNameIdentifier	 set Compressed Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
zText	TokenNameIdentifier	 z Text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
zTextSet	TokenNameIdentifier	 z Text Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the text strings to be stored in compressed form with * this image as an array of <code>String</code>s. * * <p> If the compressed text strings have not previously been * set, or have been unset, an <code>IllegalStateException</code> * will be thrown. * * @throws IllegalStateException if the compressed text strings are * not set. */	TokenNameCOMMENT_JAVADOC	 Returns the text strings to be stored in compressed form with this image as an array of <code>String</code>s. * <p> If the compressed text strings have not previously been set, or have been unset, an <code>IllegalStateException</code> will be thrown. * @throws IllegalStateException if the compressed text strings are not set. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCompressedText	TokenNameIdentifier	 get Compressed Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
zTextSet	TokenNameIdentifier	 z Text Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"PNGEncodeParam22"	TokenNameStringLiteral	PNGEncodeParam22
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
zText	TokenNameIdentifier	 z Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppresses the 'zTXt' chunk from being output. */	TokenNameCOMMENT_JAVADOC	 Suppresses the 'zTXt' chunk from being output. 
public	TokenNamepublic	
void	TokenNamevoid	
unsetCompressedText	TokenNameIdentifier	 unset Compressed Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zText	TokenNameIdentifier	 z Text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
zTextSet	TokenNameIdentifier	 z Text Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if a 'zTXT' chunk will be output. */	TokenNameCOMMENT_JAVADOC	 Returns true if a 'zTXT' chunk will be output. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompressedTextSet	TokenNameIdentifier	 is Compressed Text Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
zTextSet	TokenNameIdentifier	 z Text Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Other chunk types 	TokenNameCOMMENT_LINE	Other chunk types 
List	TokenNameIdentifier	 List
chunkType	TokenNameIdentifier	 chunk Type
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
chunkData	TokenNameIdentifier	 chunk Data
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds a private chunk, in binary form, to the list of chunks to * be stored with this image. * * @param type a 4-character String giving the chunk type name. * @param data an array of <code>byte</code>s containing the * chunk data. */	TokenNameCOMMENT_JAVADOC	 Adds a private chunk, in binary form, to the list of chunks to be stored with this image. * @param type a 4-character String giving the chunk type name. @param data an array of <code>byte</code>s containing the chunk data. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addPrivateChunk	TokenNameIdentifier	 add Private Chunk
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chunkType	TokenNameIdentifier	 chunk Type
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkData	TokenNameIdentifier	 chunk Data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of private chunks to be written to the * output file. */	TokenNameCOMMENT_JAVADOC	 Returns the number of private chunks to be written to the output file. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
getNumPrivateChunks	TokenNameIdentifier	 get Num Private Chunks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
chunkType	TokenNameIdentifier	 chunk Type
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type of the private chunk at a given index, as a * 4-character <code>String</code>. The index must be smaller * than the return value of <code>getNumPrivateChunks</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the type of the private chunk at a given index, as a 4-character <code>String</code>. The index must be smaller than the return value of <code>getNumPrivateChunks</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getPrivateChunkType	TokenNameIdentifier	 get Private Chunk Type
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
chunkType	TokenNameIdentifier	 chunk Type
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the data associated of the private chunk at a given * index, as an array of <code>byte</code>s. The index must be * smaller than the return value of * <code>getNumPrivateChunks</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the data associated of the private chunk at a given index, as an array of <code>byte</code>s. The index must be smaller than the return value of <code>getNumPrivateChunks</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPrivateChunkData	TokenNameIdentifier	 get Private Chunk Data
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
chunkData	TokenNameIdentifier	 chunk Data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove all private chunks associated with this parameter instance * whose 'safe-to-copy' bit is not set. This may be advisable when * transcoding PNG images. */	TokenNameCOMMENT_JAVADOC	 Remove all private chunks associated with this parameter instance whose 'safe-to-copy' bit is not set. This may be advisable when transcoding PNG images. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
removeUnsafeToCopyPrivateChunks	TokenNameIdentifier	 remove Unsafe To Copy Private Chunks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
newChunkType	TokenNameIdentifier	 new Chunk Type
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
newChunkData	TokenNameIdentifier	 new Chunk Data
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
getNumPrivateChunks	TokenNameIdentifier	 get Num Private Chunks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getPrivateChunkType	TokenNameIdentifier	 get Private Chunk Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
lastChar	TokenNameIdentifier	 last Char
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastChar	TokenNameIdentifier	 last Char
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
lastChar	TokenNameIdentifier	 last Char
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newChunkType	TokenNameIdentifier	 new Chunk Type
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newChunkData	TokenNameIdentifier	 new Chunk Data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getPrivateChunkData	TokenNameIdentifier	 get Private Chunk Data
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
chunkType	TokenNameIdentifier	 chunk Type
=	TokenNameEQUAL	
newChunkType	TokenNameIdentifier	 new Chunk Type
;	TokenNameSEMICOLON	
chunkData	TokenNameIdentifier	 chunk Data
=	TokenNameEQUAL	
newChunkData	TokenNameIdentifier	 new Chunk Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove all private chunks associated with this parameter instance. */	TokenNameCOMMENT_JAVADOC	 Remove all private chunks associated with this parameter instance. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
removeAllPrivateChunks	TokenNameIdentifier	 remove All Private Chunks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chunkType	TokenNameIdentifier	 chunk Type
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkData	TokenNameIdentifier	 chunk Data
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An abs() function for use by the Paeth predictor. */	TokenNameCOMMENT_JAVADOC	 An abs() function for use by the Paeth predictor. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
:	TokenNameCOLON	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The Paeth predictor routine used in PNG encoding. This routine * is included as a convenience to subclasses that override the * <code>filterRow</code> method. */	TokenNameCOMMENT_JAVADOC	 The Paeth predictor routine used in PNG encoding. This routine is included as a convenience to subclasses that override the <code>filterRow</code> method. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
paethPredictor	TokenNameIdentifier	 paeth Predictor
(	TokenNameLPAREN	
int	TokenNameint	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
-	TokenNameMINUS	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
int	TokenNameint	
pa	TokenNameIdentifier	 pa
=	TokenNameEQUAL	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pa	TokenNameIdentifier	 pa
<=	TokenNameLESS_EQUAL	
pb	TokenNameIdentifier	 pb
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
pa	TokenNameIdentifier	 pa
<=	TokenNameLESS_EQUAL	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
pb	TokenNameIdentifier	 pb
<=	TokenNameLESS_EQUAL	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Performs filtering on a row of an image. This method may be * overridden in order to provide a custom algorithm for choosing * the filter type for a given row. * * <p> The method is supplied with the current and previous rows * of the image. For the first row of the image, or of an * interlacing pass, the previous row array will be filled with * zeros as required by the PNG specification. * * <p> The method is also supplied with five scratch arrays. * These arrays may be used within the method for any purpose. * At method exit, the array at the index given by the return * value of the method should contain the filtered data. The * return value will also be used as the filter type. * * <p> The default implementation of the method performs a trial * encoding with each of the filter types, and computes the sum of * absolute values of the differences between the raw bytes of the * current row and the predicted values. The index of the filter * producing the smallest result is returned. * * <p> As an example, to perform only 'sub' filtering, this method * could be implemented (non-optimally) as follows: * * <pre> * for (int i = bytesPerPixel; i < bytesPerRow + bytesPerPixel; i++) { * int curr = currRow[i] & 0xff; * int left = currRow[i - bytesPerPixel] & 0xff; * scratchRow[PNG_FILTER_SUB][i] = (byte)(curr - left); * } * return PNG_FILTER_SUB; * </pre> * * @param currRow The current row as an array of <code>byte</code>s * of length at least <code>bytesPerRow + bytesPerPixel</code>. * The pixel data starts at index <code>bytesPerPixel</code>; * the initial <code>bytesPerPixel</code> bytes are zero. * @param prevRow The current row as an array of <code>byte</code>s * The pixel data starts at index <code>bytesPerPixel</code>; * the initial <code>bytesPerPixel</code> bytes are zero. * @param scratchRows An array of 5 <code>byte</code> arrays of * length at least <code>bytesPerRow + * bytesPerPixel</code>, useable to hold temporary results. * The filtered row will be returned as one of the entries * of this array. The returned filtered data should start * at index <code>bytesPerPixel</code>; The initial * <code>bytesPerPixel</code> bytes are not used. * @param bytesPerRow The number of bytes in the image row. * This value will always be greater than 0. * @param bytesPerPixel The number of bytes representing a single * pixel, rounded up to an integer. This is the 'bpp' parameter * described in the PNG specification. * * @return The filter type to be used. The entry of * <code>scratchRows[]</code> at this index holds the * filtered data. */	TokenNameCOMMENT_JAVADOC	 Performs filtering on a row of an image. This method may be overridden in order to provide a custom algorithm for choosing the filter type for a given row. * <p> The method is supplied with the current and previous rows of the image. For the first row of the image, or of an interlacing pass, the previous row array will be filled with zeros as required by the PNG specification. * <p> The method is also supplied with five scratch arrays. These arrays may be used within the method for any purpose. At method exit, the array at the index given by the return value of the method should contain the filtered data. The return value will also be used as the filter type. * <p> The default implementation of the method performs a trial encoding with each of the filter types, and computes the sum of absolute values of the differences between the raw bytes of the current row and the predicted values. The index of the filter producing the smallest result is returned. * <p> As an example, to perform only 'sub' filtering, this method could be implemented (non-optimally) as follows: * <pre> for (int i = bytesPerPixel; i < bytesPerRow + bytesPerPixel; i++) { int curr = currRow[i] & 0xff; int left = currRow[i - bytesPerPixel] & 0xff; scratchRow[PNG_FILTER_SUB][i] = (byte)(curr - left); } return PNG_FILTER_SUB; </pre> * @param currRow The current row as an array of <code>byte</code>s of length at least <code>bytesPerRow + bytesPerPixel</code>. The pixel data starts at index <code>bytesPerPixel</code>; the initial <code>bytesPerPixel</code> bytes are zero. @param prevRow The current row as an array of <code>byte</code>s The pixel data starts at index <code>bytesPerPixel</code>; the initial <code>bytesPerPixel</code> bytes are zero. @param scratchRows An array of 5 <code>byte</code> arrays of length at least <code>bytesPerRow + bytesPerPixel</code>, useable to hold temporary results. The filtered row will be returned as one of the entries of this array. The returned filtered data should start at index <code>bytesPerPixel</code>; The initial <code>bytesPerPixel</code> bytes are not used. @param bytesPerRow The number of bytes in the image row. This value will always be greater than 0. @param bytesPerPixel The number of bytes representing a single pixel, rounded up to an integer. This is the 'bpp' parameter described in the PNG specification. * @return The filter type to be used. The entry of <code>scratchRows[]</code> at this index holds the filtered data. 
public	TokenNamepublic	
int	TokenNameint	
filterRow	TokenNameIdentifier	 filter Row
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currRow	TokenNameIdentifier	 curr Row
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prevRow	TokenNameIdentifier	 prev Row
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scratchRows	TokenNameIdentifier	 scratch Rows
,	TokenNameCOMMA	
int	TokenNameint	
bytesPerRow	TokenNameIdentifier	 bytes Per Row
,	TokenNameCOMMA	
int	TokenNameint	
bytesPerPixel	TokenNameIdentifier	 bytes Per Pixel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
badness	TokenNameIdentifier	 badness
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
up	TokenNameIdentifier	 up
,	TokenNameCOMMA	
upleft	TokenNameIdentifier	 upleft
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
int	TokenNameint	
pa	TokenNameIdentifier	 pa
,	TokenNameCOMMA	
pb	TokenNameIdentifier	 pb
,	TokenNameCOMMA	
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
bytesPerPixel	TokenNameIdentifier	 bytes Per Pixel
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
bytesPerRow	TokenNameIdentifier	 bytes Per Row
+	TokenNamePLUS	
bytesPerPixel	TokenNameIdentifier	 bytes Per Pixel
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
currRow	TokenNameIdentifier	 curr Row
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
currRow	TokenNameIdentifier	 curr Row
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
bytesPerPixel	TokenNameIdentifier	 bytes Per Pixel
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
up	TokenNameIdentifier	 up
=	TokenNameEQUAL	
prevRow	TokenNameIdentifier	 prev Row
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
upleft	TokenNameIdentifier	 upleft
=	TokenNameEQUAL	
prevRow	TokenNameIdentifier	 prev Row
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
bytesPerPixel	TokenNameIdentifier	 bytes Per Pixel
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// no filter 	TokenNameCOMMENT_LINE	no filter 
badness	TokenNameIdentifier	 badness
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
curr	TokenNameIdentifier	 curr
;	TokenNameSEMICOLON	
// sub filter 	TokenNameCOMMENT_LINE	sub filter 
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
scratchRows	TokenNameIdentifier	 scratch Rows
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
badness	TokenNameIdentifier	 badness
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
diff	TokenNameIdentifier	 diff
:	TokenNameCOLON	
-	TokenNameMINUS	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
// up filter 	TokenNameCOMMENT_LINE	up filter 
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
up	TokenNameIdentifier	 up
;	TokenNameSEMICOLON	
scratchRows	TokenNameIdentifier	 scratch Rows
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
badness	TokenNameIdentifier	 badness
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
diff	TokenNameIdentifier	 diff
:	TokenNameCOLON	
-	TokenNameMINUS	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
// average filter 	TokenNameCOMMENT_LINE	average filter 
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
up	TokenNameIdentifier	 up
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scratchRows	TokenNameIdentifier	 scratch Rows
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
badness	TokenNameIdentifier	 badness
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
diff	TokenNameIdentifier	 diff
:	TokenNameCOLON	
-	TokenNameMINUS	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
// paeth filter 	TokenNameCOMMENT_LINE	paeth filter 
// Original code much simplier but doesn't take full 	TokenNameCOMMENT_LINE	Original code much simplier but doesn't take full 
// advantage of relationship between pa/b/c and 	TokenNameCOMMENT_LINE	advantage of relationship between pa/b/c and 
// information gleaned in abs operations. 	TokenNameCOMMENT_LINE	information gleaned in abs operations. 
/// pa = up -upleft; 	TokenNameCOMMENT_LINE	/ pa = up -upleft; 
/// pb = left-upleft; 	TokenNameCOMMENT_LINE	/ pb = left-upleft; 
/// pc = pa+pb; 	TokenNameCOMMENT_LINE	/ pc = pa+pb; 
/// pa = abs(pa); 	TokenNameCOMMENT_LINE	/ pa = abs(pa); 
/// pb = abs(pb); 	TokenNameCOMMENT_LINE	/ pb = abs(pb); 
/// pc = abs(pc); 	TokenNameCOMMENT_LINE	/ pc = abs(pc); 
/// if ((pa <= pb) && (pa <= pc)) 	TokenNameCOMMENT_LINE	/ if ((pa <= pb) && (pa <= pc)) 
/// diff = curr-left; 	TokenNameCOMMENT_LINE	/ diff = curr-left; 
/// else if (pb <= pc) 	TokenNameCOMMENT_LINE	/ else if (pb <= pc) 
/// diff = curr-up; 	TokenNameCOMMENT_LINE	/ diff = curr-up; 
/// else 	TokenNameCOMMENT_LINE	/ else 
/// diff = curr-upleft; 	TokenNameCOMMENT_LINE	/ diff = curr-upleft; 
pa	TokenNameIdentifier	 pa
=	TokenNameEQUAL	
up	TokenNameIdentifier	 up
-	TokenNameMINUS	
upleft	TokenNameIdentifier	 upleft
;	TokenNameSEMICOLON	
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
-	TokenNameMINUS	
upleft	TokenNameIdentifier	 upleft
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pa	TokenNameIdentifier	 pa
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pb	TokenNameIdentifier	 pb
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// both pa & pb neg so pc is always greater than or 	TokenNameCOMMENT_LINE	both pa & pb neg so pc is always greater than or 
// equal to pa or pb; 	TokenNameCOMMENT_LINE	equal to pa or pb; 
if	TokenNameif	
(	TokenNameLPAREN	
pa	TokenNameIdentifier	 pa
>=	TokenNameGREATER_EQUAL	
pb	TokenNameIdentifier	 pb
)	TokenNameRPAREN	
// since pa & pb neg check sense is reversed. 	TokenNameCOMMENT_LINE	since pa & pb neg check sense is reversed. 
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
else	TokenNameelse	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
up	TokenNameIdentifier	 up
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// pa neg pb pos so we must compute pc... 	TokenNameCOMMENT_LINE	pa neg pb pos so we must compute pc... 
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
pa	TokenNameIdentifier	 pa
+	TokenNamePLUS	
pb	TokenNameIdentifier	 pb
;	TokenNameSEMICOLON	
pa	TokenNameIdentifier	 pa
=	TokenNameEQUAL	
-	TokenNameMINUS	
pa	TokenNameIdentifier	 pa
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pa	TokenNameIdentifier	 pa
<=	TokenNameLESS_EQUAL	
pb	TokenNameIdentifier	 pb
)	TokenNameRPAREN	
// pc is positive and less than pb 	TokenNameCOMMENT_LINE	pc is positive and less than pb 
if	TokenNameif	
(	TokenNameLPAREN	
pa	TokenNameIdentifier	 pa
<=	TokenNameLESS_EQUAL	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
else	TokenNameelse	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
upleft	TokenNameIdentifier	 upleft
;	TokenNameSEMICOLON	
else	TokenNameelse	
// pc is negative and less than or equal to pa, 	TokenNameCOMMENT_LINE	pc is negative and less than or equal to pa, 
// but since pa is greater than pb this isn't an issue... 	TokenNameCOMMENT_LINE	but since pa is greater than pb this isn't an issue... 
if	TokenNameif	
(	TokenNameLPAREN	
pb	TokenNameIdentifier	 pb
<=	TokenNameLESS_EQUAL	
-	TokenNameMINUS	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
up	TokenNameIdentifier	 up
;	TokenNameSEMICOLON	
else	TokenNameelse	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
upleft	TokenNameIdentifier	 upleft
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pb	TokenNameIdentifier	 pb
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
-	TokenNameMINUS	
pb	TokenNameIdentifier	 pb
;	TokenNameSEMICOLON	
// make it positive... 	TokenNameCOMMENT_LINE	make it positive... 
if	TokenNameif	
(	TokenNameLPAREN	
pa	TokenNameIdentifier	 pa
<=	TokenNameLESS_EQUAL	
pb	TokenNameIdentifier	 pb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pc would be negative and less than or equal to pb 	TokenNameCOMMENT_LINE	pc would be negative and less than or equal to pb 
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
pb	TokenNameIdentifier	 pb
-	TokenNameMINUS	
pa	TokenNameIdentifier	 pa
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pa	TokenNameIdentifier	 pa
<=	TokenNameLESS_EQUAL	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
pb	TokenNameIdentifier	 pb
==	TokenNameEQUAL_EQUAL	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
// if pa is zero then pc==pb otherwise 	TokenNameCOMMENT_LINE	if pa is zero then pc==pb otherwise 
// pc must be less than pb. 	TokenNameCOMMENT_LINE	pc must be less than pb. 
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
up	TokenNameIdentifier	 up
;	TokenNameSEMICOLON	
else	TokenNameelse	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
upleft	TokenNameIdentifier	 upleft
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// pc would be positive and less than pa. 	TokenNameCOMMENT_LINE	pc would be positive and less than pa. 
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
pa	TokenNameIdentifier	 pa
-	TokenNameMINUS	
pb	TokenNameIdentifier	 pb
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pb	TokenNameIdentifier	 pb
<=	TokenNameLESS_EQUAL	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
up	TokenNameIdentifier	 up
;	TokenNameSEMICOLON	
else	TokenNameelse	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
upleft	TokenNameIdentifier	 upleft
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// both pos so pa+pb is always greater than pa/pb 	TokenNameCOMMENT_LINE	both pos so pa+pb is always greater than pa/pb 
if	TokenNameif	
(	TokenNameLPAREN	
pa	TokenNameIdentifier	 pa
<=	TokenNameLESS_EQUAL	
pb	TokenNameIdentifier	 pb
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
else	TokenNameelse	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
-	TokenNameMINUS	
up	TokenNameIdentifier	 up
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
scratchRows	TokenNameIdentifier	 scratch Rows
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
badness	TokenNameIdentifier	 badness
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
diff	TokenNameIdentifier	 diff
:	TokenNameCOLON	
-	TokenNameMINUS	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
filterType	TokenNameIdentifier	 filter Type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
minBadness	TokenNameIdentifier	 min Badness
=	TokenNameEQUAL	
badness	TokenNameIdentifier	 badness
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
badness	TokenNameIdentifier	 badness
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<	TokenNameLESS	
minBadness	TokenNameIdentifier	 min Badness
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minBadness	TokenNameIdentifier	 min Badness
=	TokenNameEQUAL	
badness	TokenNameIdentifier	 badness
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
filterType	TokenNameIdentifier	 filter Type
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filterType	TokenNameIdentifier	 filter Type
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
currRow	TokenNameIdentifier	 curr Row
,	TokenNameCOMMA	
bytesPerPixel	TokenNameIdentifier	 bytes Per Pixel
,	TokenNameCOMMA	
scratchRows	TokenNameIdentifier	 scratch Rows
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
bytesPerPixel	TokenNameIdentifier	 bytes Per Pixel
,	TokenNameCOMMA	
bytesPerRow	TokenNameIdentifier	 bytes Per Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
filterType	TokenNameIdentifier	 filter Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
