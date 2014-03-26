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
rendered	TokenNameIdentifier	 rendered
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ColorSpace	TokenNameIdentifier	 Color Space
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
BandCombineOp	TokenNameIdentifier	 Band Combine Op
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
ColorConvertOp	TokenNameIdentifier	 Color Convert Op
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
DataBuffer	TokenNameIdentifier	 Data Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Raster	TokenNameIdentifier	 Raster
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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
WritableRaster	TokenNameIdentifier	 Writable Raster
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
/** * This function will tranform an image from any colorspace into a * luminance image. The alpha channel if any will be copied to the * new image. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: Any2sRGBRed.java 537934 2007-05-14 18:23:15Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This function will tranform an image from any colorspace into a luminance image. The alpha channel if any will be copied to the new image. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: Any2sRGBRed.java 537934 2007-05-14 18:23:15Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Any2sRGBRed	TokenNameIdentifier	 Any2s RGB Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
boolean	TokenNameboolean	
srcIsLsRGB	TokenNameIdentifier	 src Is Ls RGB
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Construct a luminance image from src. * * @param src The image to convert to a luminance image */	TokenNameCOMMENT_JAVADOC	 Construct a luminance image from src. * @param src The image to convert to a luminance image 
public	TokenNamepublic	
Any2sRGBRed	TokenNameIdentifier	 Any2s RGB Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fixColorModel	TokenNameIdentifier	 fix Color Model
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fixSampleModel	TokenNameIdentifier	 fix Sample Model
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
ColorSpace	TokenNameIdentifier	 Color Space
srcCS	TokenNameIdentifier	 src CS
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCS	TokenNameIdentifier	 src CS
==	TokenNameEQUAL_EQUAL	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
CS_LINEAR_RGB	TokenNameIdentifier	 CS  LINEAR  RGB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
srcIsLsRGB	TokenNameIdentifier	 src Is Ls RGB
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
is_INT_PACK_COMP	TokenNameIdentifier	 is  INT  PACK  COMP
(	TokenNameLPAREN	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
instanceof	TokenNameinstanceof	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Check transfer types 	TokenNameCOMMENT_LINE	Check transfer types 
if	TokenNameif	
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_INT	TokenNameIdentifier	 TYPE  INT
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
sppsm	TokenNameIdentifier	 sppsm
;	TokenNameSEMICOLON	
sppsm	TokenNameIdentifier	 sppsm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
sm	TokenNameIdentifier	 sm
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
masks	TokenNameIdentifier	 masks
=	TokenNameEQUAL	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getBitMasks	TokenNameIdentifier	 get Bit Masks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0x00ff0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0x0000ff00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0xff000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Exponent for linear to sRGB convertion */	TokenNameCOMMENT_JAVADOC	 Exponent for linear to sRGB convertion 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
GAMMA	TokenNameIdentifier	 GAMMA
=	TokenNameEQUAL	
2.4	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * Lookup tables for RGB lookups. The linearToSRGBLut is used * when noise values are considered to be on a linearScale. The * linearToLinear table is used when the values are considered to * be on the sRGB scale to begin with. */	TokenNameCOMMENT_JAVADOC	 Lookup tables for RGB lookups. The linearToSRGBLut is used when noise values are considered to be on a linearScale. The linearToLinear table is used when the values are considered to be on the sRGB scale to begin with. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
linearToSRGBLut	TokenNameIdentifier	 linear To SRGB Lut
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
GAMMA	TokenNameIdentifier	 GAMMA
;	TokenNameSEMICOLON	
// System.out.print("L2S: "); 	TokenNameCOMMENT_LINE	System.out.print("L2S: "); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<=	TokenNameLESS_EQUAL	
0.0031308	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
*=	TokenNameMULTIPLY_EQUAL	
12.92	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
1.055	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
-	TokenNameMINUS	
0.055	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
linearToSRGBLut	TokenNameIdentifier	 linear To SRGB Lut
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
*	TokenNameMULTIPLY	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.print(linearToSRGBLut[i] + ","); 	TokenNameCOMMENT_LINE	System.out.print(linearToSRGBLut[i] + ","); 
}	TokenNameRBRACE	
// System.out.println(""); 	TokenNameCOMMENT_LINE	System.out.println(""); 
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
WritableRaster	TokenNameIdentifier	 Writable Raster
applyLut_INT	TokenNameIdentifier	 apply Lut  INT
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lut	TokenNameIdentifier	 lut
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
srcBase	TokenNameIdentifier	 src Base
=	TokenNameEQUAL	
(	TokenNameLPAREN	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Access the pixel data array 	TokenNameCOMMENT_LINE	Access the pixel data array 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
=	TokenNameEQUAL	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
scanStride	TokenNameIdentifier	 scan Stride
=	TokenNameEQUAL	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
pix	TokenNameIdentifier	 pix
;	TokenNameSEMICOLON	
// For alpha premult we need to multiply all comps. 	TokenNameCOMMENT_LINE	For alpha premult we need to multiply all comps. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
srcBase	TokenNameIdentifier	 src Base
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
scanStride	TokenNameIdentifier	 scan Stride
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pix	TokenNameIdentifier	 pix
=	TokenNameEQUAL	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pix	TokenNameIdentifier	 pix
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
lut	TokenNameIdentifier	 lut
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
pix	TokenNameIdentifier	 pix
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
lut	TokenNameIdentifier	 lut
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
pix	TokenNameIdentifier	 pix
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
lut	TokenNameIdentifier	 lut
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
pix	TokenNameIdentifier	 pix
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
WritableRaster	TokenNameIdentifier	 Writable Raster
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get my source. 	TokenNameCOMMENT_LINE	Get my source. 
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
)	TokenNameRPAREN	
getSources	TokenNameIdentifier	 get Sources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
srcSM	TokenNameIdentifier	 src SM
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fast case, Linear SRGB source, INT Pack writable raster... 	TokenNameCOMMENT_LINE	Fast case, Linear SRGB source, INT Pack writable raster... 
if	TokenNameif	
(	TokenNameLPAREN	
srcIsLsRGB	TokenNameIdentifier	 src Is Ls RGB
&&	TokenNameAND_AND	
is_INT_PACK_COMP	TokenNameIdentifier	 is  INT  PACK  COMP
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
applyLut_INT	TokenNameIdentifier	 apply Lut  INT
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
linearToSRGBLut	TokenNameIdentifier	 linear To SRGB Lut
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We don't really know much about this source, let's 	TokenNameCOMMENT_LINE	We don't really know much about this source, let's 
// guess based on the number of bands... 	TokenNameCOMMENT_LINE	guess based on the number of bands... 
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Red 	TokenNameCOMMENT_LINE	Red 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Grn 	TokenNameCOMMENT_LINE	Grn 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Blu 	TokenNameCOMMENT_LINE	Blu 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Red 	TokenNameCOMMENT_LINE	Red 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Grn 	TokenNameCOMMENT_LINE	Grn 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Blu 	TokenNameCOMMENT_LINE	Blu 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Alpha 	TokenNameCOMMENT_LINE	Alpha 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Red 	TokenNameCOMMENT_LINE	Red 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Grn 	TokenNameCOMMENT_LINE	Grn 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Blu 	TokenNameCOMMENT_LINE	Blu 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Red 	TokenNameCOMMENT_LINE	Red 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Grn 	TokenNameCOMMENT_LINE	Grn 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Blu 	TokenNameCOMMENT_LINE	Blu 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Alpha 	TokenNameCOMMENT_LINE	Alpha 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Raster	TokenNameIdentifier	 Raster
srcRas	TokenNameIdentifier	 src Ras
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BandCombineOp	TokenNameIdentifier	 Band Combine Op
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
new	TokenNamenew	
BandCombineOp	TokenNameIdentifier	 Band Combine Op
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
srcRas	TokenNameIdentifier	 src Ras
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
CS_GRAY	TokenNameIdentifier	 CS  GRAY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is a little bit of a hack. There is only 	TokenNameCOMMENT_LINE	This is a little bit of a hack. There is only 
// a linear grayscale ICC profile in the JDK so 	TokenNameCOMMENT_LINE	a linear grayscale ICC profile in the JDK so 
// many things use this when the data _really_ 	TokenNameCOMMENT_LINE	many things use this when the data _really_ 
// has sRGB gamma applied. 	TokenNameCOMMENT_LINE	has sRGB gamma applied. 
try	TokenNametry	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Red 	TokenNameCOMMENT_LINE	Red 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Grn 	TokenNameCOMMENT_LINE	Grn 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Blu 	TokenNameCOMMENT_LINE	Blu 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Red 	TokenNameCOMMENT_LINE	Red 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Grn 	TokenNameCOMMENT_LINE	Grn 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Blu 	TokenNameCOMMENT_LINE	Blu 
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Alpha 	TokenNameCOMMENT_LINE	Alpha 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Raster	TokenNameIdentifier	 Raster
srcRas	TokenNameIdentifier	 src Ras
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BandCombineOp	TokenNameIdentifier	 Band Combine Op
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
new	TokenNamenew	
BandCombineOp	TokenNameIdentifier	 Band Combine Op
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
srcRas	TokenNameIdentifier	 src Ras
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
=	TokenNameEQUAL	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No transform needed, just reformat data... 	TokenNameCOMMENT_LINE	No transform needed, just reformat data... 
// System.out.println("Bypassing"); 	TokenNameCOMMENT_LINE	System.out.println("Bypassing"); 
if	TokenNameif	
(	TokenNameLPAREN	
is_INT_PACK_COMP	TokenNameIdentifier	 is  INT  PACK  COMP
(	TokenNameLPAREN	
srcSM	TokenNameIdentifier	 src SM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Raster	TokenNameIdentifier	 Raster
srcRas	TokenNameIdentifier	 src Ras
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
srcWr	TokenNameIdentifier	 src Wr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
)	TokenNameRPAREN	
srcRas	TokenNameIdentifier	 src Ras
;	TokenNameSEMICOLON	
// Divide out alpha if we have it. We need to do this since 	TokenNameCOMMENT_LINE	Divide out alpha if we have it. We need to do this since 
// the color convert may not be a linear operation which may 	TokenNameCOMMENT_LINE	the color convert may not be a linear operation which may 
// lead to out of range values. 	TokenNameCOMMENT_LINE	lead to out of range values. 
ColorModel	TokenNameIdentifier	 Color Model
srcBICM	TokenNameIdentifier	 src BICM
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
srcBICM	TokenNameIdentifier	 src BICM
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
srcWr	TokenNameIdentifier	 src Wr
,	TokenNameCOMMA	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
srcBI	TokenNameIdentifier	 src BI
,	TokenNameCOMMA	
dstBI	TokenNameIdentifier	 dst BI
;	TokenNameSEMICOLON	
srcBI	TokenNameIdentifier	 src BI
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
srcBICM	TokenNameIdentifier	 src BICM
,	TokenNameCOMMA	
srcWr	TokenNameIdentifier	 src Wr
.	TokenNameDOT	
createWritableTranslatedChild	TokenNameIdentifier	 create Writable Translated Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("src: " + srcBI.getWidth() + "x" + 	TokenNameCOMMENT_LINE	System.out.println("src: " + srcBI.getWidth() + "x" + 
// srcBI.getHeight()); 	TokenNameCOMMENT_LINE	srcBI.getHeight()); 
ColorConvertOp	TokenNameIdentifier	 Color Convert Op
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
new	TokenNamenew	
ColorConvertOp	TokenNameIdentifier	 Color Convert Op
(	TokenNameLPAREN	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstBI	TokenNameIdentifier	 dst BI
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
srcBI	TokenNameIdentifier	 src BI
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("After filter:"); 	TokenNameCOMMENT_LINE	System.out.println("After filter:"); 
WritableRaster	TokenNameIdentifier	 Writable Raster
wr00	TokenNameIdentifier	 wr00
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
createWritableTranslatedChild	TokenNameIdentifier	 create Writable Translated Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
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
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumComponents	TokenNameIdentifier	 get Num Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
copyBand	TokenNameIdentifier	 copy Band
(	TokenNameLPAREN	
dstBI	TokenNameIdentifier	 dst BI
.	TokenNameDOT	
getRaster	TokenNameIdentifier	 get Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
wr00	TokenNameIdentifier	 wr00
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
copyBand	TokenNameIdentifier	 copy Band
(	TokenNameLPAREN	
srcWr	TokenNameIdentifier	 src Wr
,	TokenNameCOMMA	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function 'fixes' the source's color model. Right now * it just selects if it should have one or two bands based on * if the source had an alpha channel. */	TokenNameCOMMENT_JAVADOC	 This function 'fixes' the source's color model. Right now it just selects if it should have one or two bands based on if the source had an alpha channel. 
protected	TokenNameprotected	
static	TokenNamestatic	
ColorModel	TokenNameIdentifier	 Color Model
fixColorModel	TokenNameIdentifier	 fix Color Model
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
sRGB_Unpre	TokenNameIdentifier	 s RGB  Unpre
;	TokenNameSEMICOLON	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
sRGB	TokenNameIdentifier	 s RGB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// No ColorModel so try to make some intelligent 	TokenNameCOMMENT_LINE	No ColorModel so try to make some intelligent 
// decisions based just on the number of bands... 	TokenNameCOMMENT_LINE	decisions based just on the number of bands... 
// 1 bands -> replicated into RGB 	TokenNameCOMMENT_LINE	1 bands -> replicated into RGB 
// 2 bands -> Band 0 replicated into RGB & Band 1 -> alpha premult 	TokenNameCOMMENT_LINE	2 bands -> Band 0 replicated into RGB & Band 1 -> alpha premult 
// 3 bands -> sRGB (not-linear?) 	TokenNameCOMMENT_LINE	3 bands -> sRGB (not-linear?) 
// 4 bands -> sRGB premult (not-linear?) 	TokenNameCOMMENT_LINE	4 bands -> sRGB premult (not-linear?) 
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
sRGB	TokenNameIdentifier	 s RGB
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
sRGB_Unpre	TokenNameIdentifier	 s RGB  Unpre
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
sRGB	TokenNameIdentifier	 s RGB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
sRGB_Unpre	TokenNameIdentifier	 s RGB  Unpre
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This function 'fixes' the source's sample model. * Right now it just selects if it should have 3 or 4 bands * based on if the source had an alpha channel. */	TokenNameCOMMENT_JAVADOC	 This function 'fixes' the source's sample model. Right now it just selects if it should have 3 or 4 bands based on if the source had an alpha channel. 
protected	TokenNameprotected	
static	TokenNamestatic	
SampleModel	TokenNameIdentifier	 Sample Model
fixSampleModel	TokenNameIdentifier	 fix Sample Model
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
(	TokenNameLPAREN	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_INT	TokenNameIdentifier	 TYPE  INT
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0xFF0000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF000000	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
(	TokenNameLPAREN	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_INT	TokenNameIdentifier	 TYPE  INT
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0xFF0000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
