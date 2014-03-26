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
Point	TokenNameIdentifier	 Point
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Rectangle	TokenNameIdentifier	 Rectangle
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
/** * This function will tranform an image from any colorspace into a * luminance image. The alpha channel if any will be copied to the * new image. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: Any2LsRGBRed.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This function will tranform an image from any colorspace into a luminance image. The alpha channel if any will be copied to the new image. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: Any2LsRGBRed.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Any2LsRGBRed	TokenNameIdentifier	 Any2 Ls RGB Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
boolean	TokenNameboolean	
srcIssRGB	TokenNameIdentifier	 src Iss RGB
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Construct a luminace image from src. * * @param src The image to convert to a luminance image */	TokenNameCOMMENT_JAVADOC	 Construct a luminace image from src. * @param src The image to convert to a luminance image 
public	TokenNamepublic	
Any2LsRGBRed	TokenNameIdentifier	 Any2 Ls RGB Red
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
CS_sRGB	TokenNameIdentifier	 CS s RGB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
srcIssRGB	TokenNameIdentifier	 src Iss RGB
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gamma for linear to sRGB convertion */	TokenNameCOMMENT_JAVADOC	 Gamma for linear to sRGB convertion 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
GAMMA	TokenNameIdentifier	 GAMMA
=	TokenNameEQUAL	
2.4	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
LFACT	TokenNameIdentifier	 LFACT
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
12.92	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
sRGBToLsRGB	TokenNameIdentifier	 s RGB To Ls RGB
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<=	TokenNameLESS_EQUAL	
0.003928	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
*	TokenNameMULTIPLY	
LFACT	TokenNameIdentifier	 LFACT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
0.055	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1.055	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
GAMMA	TokenNameIdentifier	 GAMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Lookup tables for RGB lookups. The linearToSRGBLut is used * when noise values are considered to be on a linearScale. The * linearToLinear table is used when the values are considered to * be on the sRGB scale to begin with. */	TokenNameCOMMENT_JAVADOC	 Lookup tables for RGB lookups. The linearToSRGBLut is used when noise values are considered to be on a linearScale. The linearToLinear table is used when the values are considered to be on the sRGB scale to begin with. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sRGBToLsRGBLut	TokenNameIdentifier	 s RGB To Ls RGB Lut
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
// System.out.print("S2L: "); 	TokenNameCOMMENT_LINE	System.out.print("S2L: "); 
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
sRGBToLsRGB	TokenNameIdentifier	 s RGB To Ls RGB
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sRGBToLsRGBLut	TokenNameIdentifier	 s RGB To Ls RGB Lut
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
// System.out.print(sRGBToLsRGBLut[i] + ","); 	TokenNameCOMMENT_LINE	System.out.print(sRGBToLsRGBLut[i] + ","); 
}	TokenNameRBRACE	
// System.out.println(""); 	TokenNameCOMMENT_LINE	System.out.println(""); 
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
// Fast case, SRGB source, INT Pack writable raster... 	TokenNameCOMMENT_LINE	Fast case, SRGB source, INT Pack writable raster... 
if	TokenNameif	
(	TokenNameLPAREN	
srcIssRGB	TokenNameIdentifier	 src Iss RGB
&&	TokenNameAND_AND	
Any2sRGBRed	TokenNameIdentifier	 Any2s RGB Red
.	TokenNameDOT	
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
Any2sRGBRed	TokenNameIdentifier	 Any2s RGB Red
.	TokenNameDOT	
applyLut_INT	TokenNameIdentifier	 apply Lut  INT
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
sRGBToLsRGBLut	TokenNameIdentifier	 s RGB To Ls RGB Lut
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
1	TokenNameIntegerLiteral	
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
0	TokenNameIntegerLiteral	
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
0	TokenNameIntegerLiteral	
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
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
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
0	TokenNameIntegerLiteral	
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
0	TokenNameIntegerLiteral	
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
1	TokenNameIntegerLiteral	
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
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
=	TokenNameEQUAL	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
dstBI	TokenNameIdentifier	 dst BI
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No alpha ao we don't have to work around the bug 	TokenNameCOMMENT_LINE	No alpha ao we don't have to work around the bug 
// in the color convert op. 	TokenNameCOMMENT_LINE	in the color convert op. 
dstBI	TokenNameIdentifier	 dst BI
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
dstCM	TokenNameIdentifier	 dst CM
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
createWritableTranslatedChild	TokenNameIdentifier	 create Writable Translated Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// All this nonsense is to work around the fact that 	TokenNameCOMMENT_LINE	All this nonsense is to work around the fact that 
// the Color convert op doesn't properly copy the 	TokenNameCOMMENT_LINE	the Color convert op doesn't properly copy the 
// Alpha from src to dst. 	TokenNameCOMMENT_LINE	Alpha from src to dst. 
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
dstSM	TokenNameIdentifier	 dst SM
;	TokenNameSEMICOLON	
dstSM	TokenNameIdentifier	 dst SM
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
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
masks	TokenNameIdentifier	 masks
=	TokenNameEQUAL	
dstSM	TokenNameIdentifier	 dst SM
.	TokenNameDOT	
getBitMasks	TokenNameIdentifier	 get Bit Masks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
dstSMNoA	TokenNameIdentifier	 dst SM No A
=	TokenNameEQUAL	
new	TokenNamenew	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
(	TokenNameLPAREN	
dstSM	TokenNameIdentifier	 dst SM
.	TokenNameDOT	
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dstSM	TokenNameIdentifier	 dst SM
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dstSM	TokenNameIdentifier	 dst SM
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dstSM	TokenNameIdentifier	 dst SM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
dstCMNoA	TokenNameIdentifier	 dst CM No A
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
Linear_sRGB	TokenNameIdentifier	 Linear s RGB
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstWr	TokenNameIdentifier	 dst Wr
;	TokenNameSEMICOLON	
dstWr	TokenNameIdentifier	 dst Wr
=	TokenNameEQUAL	
Raster	TokenNameIdentifier	 Raster
.	TokenNameDOT	
createWritableRaster	TokenNameIdentifier	 create Writable Raster
(	TokenNameLPAREN	
dstSMNoA	TokenNameIdentifier	 dst SM No A
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstWr	TokenNameIdentifier	 dst Wr
=	TokenNameEQUAL	
dstWr	TokenNameIdentifier	 dst Wr
.	TokenNameDOT	
createWritableChild	TokenNameIdentifier	 create Writable Child
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
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstBI	TokenNameIdentifier	 dst BI
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
dstCMNoA	TokenNameIdentifier	 dst CM No A
,	TokenNameCOMMA	
dstWr	TokenNameIdentifier	 dst Wr
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Divide out alpha if we have it. We need to do this since 	TokenNameCOMMENT_LINE	Divide out alpha if we have it. We need to do this since 
// the color convert may not be a linear operation which may 	TokenNameCOMMENT_LINE	the color convert may not be a linear operation which may 
// lead to out of range values. 	TokenNameCOMMENT_LINE	lead to out of range values. 
ColorModel	TokenNameIdentifier	 Color Model
srcBICM	TokenNameIdentifier	 src BICM
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
srcWr	TokenNameIdentifier	 src Wr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
wrR	TokenNameIdentifier	 wr R
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcWr	TokenNameIdentifier	 src Wr
=	TokenNameEQUAL	
Raster	TokenNameIdentifier	 Raster
.	TokenNameDOT	
createWritableRaster	TokenNameIdentifier	 create Writable Raster
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
srcWr	TokenNameIdentifier	 src Wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
srcWr	TokenNameIdentifier	 src Wr
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
makeRasterWritable	TokenNameIdentifier	 make Raster Writable
(	TokenNameLPAREN	
srcRas	TokenNameIdentifier	 src Ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BufferedImage	TokenNameIdentifier	 Buffered Image
srcBI	TokenNameIdentifier	 src BI
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
/* * System.out.println("src: " + srcBI.getWidth() + "x" + * srcBI.getHeight()); * System.out.println("dst: " + dstBI.getWidth() + "x" + * dstBI.getHeight()); */	TokenNameCOMMENT_BLOCK	 System.out.println("src: " + srcBI.getWidth() + "x" + srcBI.getHeight()); System.out.println("dst: " + dstBI.getWidth() + "x" + dstBI.getHeight()); 
ColorConvertOp	TokenNameIdentifier	 Color Convert Op
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
new	TokenNamenew	
ColorConvertOp	TokenNameIdentifier	 Color Convert Op
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
srcBI	TokenNameIdentifier	 src BI
,	TokenNameCOMMA	
dstBI	TokenNameIdentifier	 dst BI
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
}	TokenNameRBRACE	
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
Linear_sRGB_Unpre	TokenNameIdentifier	 Linear s RGB  Unpre
;	TokenNameSEMICOLON	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
Linear_sRGB	TokenNameIdentifier	 Linear s RGB
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
Linear_sRGB	TokenNameIdentifier	 Linear s RGB
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
Linear_sRGB_Unpre	TokenNameIdentifier	 Linear s RGB  Unpre
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
Linear_sRGB	TokenNameIdentifier	 Linear s RGB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
Linear_sRGB_Unpre	TokenNameIdentifier	 Linear s RGB  Unpre
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
