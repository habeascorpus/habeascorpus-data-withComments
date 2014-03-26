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
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
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
ColorModel	TokenNameIdentifier	 Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ConvolveOp	TokenNameIdentifier	 Convolve Op
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
DirectColorModel	TokenNameIdentifier	 Direct Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Kernel	TokenNameIdentifier	 Kernel
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
/** * This implementation of RenderableImage will render its input * GraphicsNode on demand for tiles. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: GaussianBlurRed8Bit.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This implementation of RenderableImage will render its input GraphicsNode on demand for tiles. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: GaussianBlurRed8Bit.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
GaussianBlurRed8Bit	TokenNameIdentifier	 Gaussian Blur Red8 Bit
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
int	TokenNameint	
xinset	TokenNameIdentifier	 xinset
,	TokenNameCOMMA	
yinset	TokenNameIdentifier	 yinset
;	TokenNameSEMICOLON	
double	TokenNamedouble	
stdDevX	TokenNameIdentifier	 std Dev X
,	TokenNameCOMMA	
stdDevY	TokenNameIdentifier	 std Dev Y
;	TokenNameSEMICOLON	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
;	TokenNameSEMICOLON	
ConvolveOp	TokenNameIdentifier	 Convolve Op
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
convOp	TokenNameIdentifier	 conv Op
=	TokenNameEQUAL	
new	TokenNamenew	
ConvolveOp	TokenNameIdentifier	 Convolve Op
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
dX	TokenNameIdentifier	 d X
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
;	TokenNameSEMICOLON	
/** * Construct a blurred version of <tt>src</tt>, by blurring with a * gaussian kernel with standard Deviation of <tt>stdDev</tt> pixels. * @param src The source image to blur * @param stdDev The Standard Deviation of the Gaussian kernel. * @param rh Rendering hints. */	TokenNameCOMMENT_JAVADOC	 Construct a blurred version of <tt>src</tt>, by blurring with a gaussian kernel with standard Deviation of <tt>stdDev</tt> pixels. @param src The source image to blur @param stdDev The Standard Deviation of the Gaussian kernel. @param rh Rendering hints. 
public	TokenNamepublic	
GaussianBlurRed8Bit	TokenNameIdentifier	 Gaussian Blur Red8 Bit
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
double	TokenNamedouble	
stdDev	TokenNameIdentifier	 std Dev
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
stdDev	TokenNameIdentifier	 std Dev
,	TokenNameCOMMA	
stdDev	TokenNameIdentifier	 std Dev
,	TokenNameCOMMA	
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a blurred version of <tt>src</tt>, by blurring with a * gaussian kernel with standard Deviation of <tt>stdDev</tt> pixels. * @param src The source image to blur * @param stdDevX The Standard Deviation of the Gaussian kernel in X * @param stdDevY The Standard Deviation of the Gaussian kernel in Y * @param rh Rendering hints. */	TokenNameCOMMENT_JAVADOC	 Construct a blurred version of <tt>src</tt>, by blurring with a gaussian kernel with standard Deviation of <tt>stdDev</tt> pixels. @param src The source image to blur @param stdDevX The Standard Deviation of the Gaussian kernel in X @param stdDevY The Standard Deviation of the Gaussian kernel in Y @param rh Rendering hints. 
public	TokenNamepublic	
GaussianBlurRed8Bit	TokenNameIdentifier	 Gaussian Blur Red8 Bit
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
double	TokenNamedouble	
stdDevX	TokenNameIdentifier	 std Dev X
,	TokenNameCOMMA	
double	TokenNamedouble	
stdDevY	TokenNameIdentifier	 std Dev Y
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remember to call super.init() 	TokenNameCOMMENT_LINE	Remember to call super.init() 
this	TokenNamethis	
.	TokenNameDOT	
stdDevX	TokenNameIdentifier	 std Dev X
=	TokenNameEQUAL	
stdDevX	TokenNameIdentifier	 std Dev X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stdDevY	TokenNameIdentifier	 std Dev Y
=	TokenNameEQUAL	
stdDevY	TokenNameIdentifier	 std Dev Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
rh	TokenNameIdentifier	 rh
;	TokenNameSEMICOLON	
xinset	TokenNameIdentifier	 xinset
=	TokenNameEQUAL	
surroundPixels	TokenNameIdentifier	 surround Pixels
(	TokenNameLPAREN	
stdDevX	TokenNameIdentifier	 std Dev X
,	TokenNameCOMMA	
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yinset	TokenNameIdentifier	 yinset
=	TokenNameEQUAL	
surroundPixels	TokenNameIdentifier	 surround Pixels
(	TokenNameLPAREN	
stdDevY	TokenNameIdentifier	 std Dev Y
,	TokenNameCOMMA	
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
myBounds	TokenNameIdentifier	 my Bounds
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
xinset	TokenNameIdentifier	 xinset
;	TokenNameSEMICOLON	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
yinset	TokenNameIdentifier	 yinset
;	TokenNameSEMICOLON	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
xinset	TokenNameIdentifier	 xinset
;	TokenNameSEMICOLON	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
yinset	TokenNameIdentifier	 yinset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
fixColorModel	TokenNameIdentifier	 fix Color Model
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tw	TokenNameIdentifier	 tw
=	TokenNameEQUAL	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tw	TokenNameIdentifier	 tw
>	TokenNameGREATER	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
tw	TokenNameIdentifier	 tw
=	TokenNameEQUAL	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
>	TokenNameGREATER	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
myBounds	TokenNameIdentifier	 my Bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
tw	TokenNameIdentifier	 tw
,	TokenNameCOMMA	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
myBounds	TokenNameIdentifier	 my Bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
xinset	TokenNameIdentifier	 xinset
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
yinset	TokenNameIdentifier	 yinset
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
highQuality	TokenNameIdentifier	 high Quality
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_RENDER_QUALITY	TokenNameIdentifier	 VALUE  RENDER  QUALITY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_RENDERING	TokenNameIdentifier	 KEY  RENDERING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("StdDev: " + stdDevX + "x" + stdDevY); 	TokenNameCOMMENT_LINE	System.out.println("StdDev: " + stdDevX + "x" + stdDevY); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xinset	TokenNameIdentifier	 xinset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stdDevX	TokenNameIdentifier	 std Dev X
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
highQuality	TokenNameIdentifier	 high Quality
)	TokenNameRPAREN	
)	TokenNameRPAREN	
convOp	TokenNameIdentifier	 conv Op
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ConvolveOp	TokenNameIdentifier	 Convolve Op
(	TokenNameLPAREN	
makeQualityKernelX	TokenNameIdentifier	 make Quality Kernel X
(	TokenNameLPAREN	
xinset	TokenNameIdentifier	 xinset
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
dX	TokenNameIdentifier	 d X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
DSQRT2PI	TokenNameIdentifier	 DSQR T2 PI
*	TokenNameMULTIPLY	
stdDevX	TokenNameIdentifier	 std Dev X
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
yinset	TokenNameIdentifier	 yinset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stdDevY	TokenNameIdentifier	 std Dev Y
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
highQuality	TokenNameIdentifier	 high Quality
)	TokenNameRPAREN	
)	TokenNameRPAREN	
convOp	TokenNameIdentifier	 conv Op
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ConvolveOp	TokenNameIdentifier	 Convolve Op
(	TokenNameLPAREN	
makeQualityKernelY	TokenNameIdentifier	 make Quality Kernel Y
(	TokenNameLPAREN	
yinset	TokenNameIdentifier	 yinset
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
dY	TokenNameIdentifier	 d Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
DSQRT2PI	TokenNameIdentifier	 DSQR T2 PI
*	TokenNameMULTIPLY	
stdDevY	TokenNameIdentifier	 std Dev Y
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constant: sqrt(2*PI) */	TokenNameCOMMENT_JAVADOC	 Constant: sqrt(2*PI) 
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
SQRT2PI	TokenNameIdentifier	 SQR T2 PI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constant: 3*sqrt(2*PI)/4 */	TokenNameCOMMENT_JAVADOC	 Constant: 3*sqrt(2*PI)/4 
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
DSQRT2PI	TokenNameIdentifier	 DSQR T2 PI
=	TokenNameEQUAL	
SQRT2PI	TokenNameIdentifier	 SQR T2 PI
*	TokenNameMULTIPLY	
3f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
4f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * Constant: precision used in computation of the Kernel radius */	TokenNameCOMMENT_JAVADOC	 Constant: precision used in computation of the Kernel radius 
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
precision	TokenNameIdentifier	 precision
=	TokenNameEQUAL	
0.499f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * Calculate the number of surround pixels required for a given * standard Deviation. */	TokenNameCOMMENT_JAVADOC	 Calculate the number of surround pixels required for a given standard Deviation. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
surroundPixels	TokenNameIdentifier	 surround Pixels
(	TokenNameLPAREN	
double	TokenNamedouble	
stdDev	TokenNameIdentifier	 std Dev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
surroundPixels	TokenNameIdentifier	 surround Pixels
(	TokenNameLPAREN	
stdDev	TokenNameIdentifier	 std Dev
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculate the number of surround pixels required for a given * standard Deviation. Also takes into account rendering quality * hint. */	TokenNameCOMMENT_JAVADOC	 Calculate the number of surround pixels required for a given standard Deviation. Also takes into account rendering quality hint. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
surroundPixels	TokenNameIdentifier	 surround Pixels
(	TokenNameLPAREN	
double	TokenNamedouble	
stdDev	TokenNameIdentifier	 std Dev
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
highQuality	TokenNameIdentifier	 high Quality
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_RENDER_QUALITY	TokenNameIdentifier	 VALUE  RENDER  QUALITY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_RENDERING	TokenNameIdentifier	 KEY  RENDERING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stdDev	TokenNameIdentifier	 std Dev
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
highQuality	TokenNameIdentifier	 high Quality
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Start with 1/2 the zero box enery. 	TokenNameCOMMENT_LINE	Start with 1/2 the zero box enery. 
float	TokenNamefloat	
areaSum	TokenNameIdentifier	 area Sum
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0.5	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
stdDev	TokenNameIdentifier	 std Dev
*	TokenNameMULTIPLY	
SQRT2PI	TokenNameIdentifier	 SQR T2 PI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
areaSum	TokenNameIdentifier	 area Sum
<	TokenNameLESS	
precision	TokenNameIdentifier	 precision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
areaSum	TokenNameIdentifier	 area Sum
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stdDev	TokenNameIdentifier	 std Dev
*	TokenNameMULTIPLY	
stdDev	TokenNameIdentifier	 std Dev
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
stdDev	TokenNameIdentifier	 std Dev
*	TokenNameMULTIPLY	
SQRT2PI	TokenNameIdentifier	 SQR T2 PI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//compute d 	TokenNameCOMMENT_LINE	compute d 
int	TokenNameint	
diam	TokenNameIdentifier	 diam
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
DSQRT2PI	TokenNameIdentifier	 DSQR T2 PI
*	TokenNameMULTIPLY	
stdDev	TokenNameIdentifier	 std Dev
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diam	TokenNameIdentifier	 diam
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
diam	TokenNameIdentifier	 diam
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
diam	TokenNameIdentifier	 diam
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// even case 	TokenNameCOMMENT_LINE	even case 
else	TokenNameelse	
return	TokenNamereturn	
diam	TokenNameIdentifier	 diam
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
diam	TokenNameIdentifier	 diam
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Odd case 	TokenNameCOMMENT_LINE	Odd case 
}	TokenNameRBRACE	
/* * Here we compute the data for the one-dimensional kernel of * length '2*(radius-1) + 1' * * @param radius stdDeviationX or stdDeviationY. * @see #makeQualityKernels */	TokenNameCOMMENT_BLOCK	 Here we compute the data for the one-dimensional kernel of length '2*(radius-1) + 1' * @param radius stdDeviationX or stdDeviationY. @see #makeQualityKernels 
private	TokenNameprivate	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
computeQualityKernelData	TokenNameIdentifier	 compute Quality Kernel Data
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
double	TokenNamedouble	
stdDev	TokenNameIdentifier	 std Dev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
kernelData	TokenNameIdentifier	 kernel Data
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Used to normalise the kernel 	TokenNameCOMMENT_LINE	Used to normalise the kernel 
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
kernelData	TokenNameIdentifier	 kernel Data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
-	TokenNameMINUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stdDev	TokenNameIdentifier	 std Dev
*	TokenNameMULTIPLY	
stdDev	TokenNameIdentifier	 std Dev
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
SQRT2PI	TokenNameIdentifier	 SQR T2 PI
*	TokenNameMULTIPLY	
stdDev	TokenNameIdentifier	 std Dev
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
kernelData	TokenNameIdentifier	 kernel Data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Normalise: make elements sum to 1 	TokenNameCOMMENT_LINE	Normalise: make elements sum to 1 
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
kernelData	TokenNameIdentifier	 kernel Data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/=	TokenNameDIVIDE_EQUAL	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
return	TokenNamereturn	
kernelData	TokenNameIdentifier	 kernel Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Kernel	TokenNameIdentifier	 Kernel
makeQualityKernelX	TokenNameIdentifier	 make Quality Kernel X
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Kernel	TokenNameIdentifier	 Kernel
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
computeQualityKernelData	TokenNameIdentifier	 compute Quality Kernel Data
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
stdDevX	TokenNameIdentifier	 std Dev X
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Kernel	TokenNameIdentifier	 Kernel
makeQualityKernelY	TokenNameIdentifier	 make Quality Kernel Y
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Kernel	TokenNameIdentifier	 Kernel
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
computeQualityKernelData	TokenNameIdentifier	 compute Quality Kernel Data
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
stdDevY	TokenNameIdentifier	 std Dev Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-=	TokenNameMINUS_EQUAL	
xinset	TokenNameIdentifier	 xinset
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-=	TokenNameMINUS_EQUAL	
yinset	TokenNameIdentifier	 yinset
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
xinset	TokenNameIdentifier	 xinset
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
yinset	TokenNameIdentifier	 yinset
;	TokenNameSEMICOLON	
// System.out.println("Gaussian GenR: " + wr); 	TokenNameCOMMENT_LINE	System.out.println("Gaussian GenR: " + wr); 
// System.out.println("SrcReq: " + r); 	TokenNameCOMMENT_LINE	System.out.println("SrcReq: " + r); 
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
tmpR2	TokenNameIdentifier	 tmp R2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
createCompatibleWritableRaster	TokenNameIdentifier	 create Compatible Writable Raster
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
WritableRaster	TokenNameIdentifier	 Writable Raster
fill	TokenNameIdentifier	 fill
;	TokenNameSEMICOLON	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
tmpR1	TokenNameIdentifier	 tmp R1
.	TokenNameDOT	
createWritableTranslatedChild	TokenNameIdentifier	 create Writable Translated Child
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
fill	TokenNameIdentifier	 fill
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For the blur box approx we can use dest as our intermediate 	TokenNameCOMMENT_LINE	For the blur box approx we can use dest as our intermediate 
// otherwise we let it default to null which means we create a new 	TokenNameCOMMENT_LINE	otherwise we let it default to null which means we create a new 
// one... 	TokenNameCOMMENT_LINE	one... 
// this lets the Vertical conv know how much is junk, so it 	TokenNameCOMMENT_LINE	this lets the Vertical conv know how much is junk, so it 
// doesn't bother to convolve the top and bottom edges 	TokenNameCOMMENT_LINE	doesn't bother to convolve the top and bottom edges 
int	TokenNameint	
skipX	TokenNameIdentifier	 skip X
;	TokenNameSEMICOLON	
// long t1 = System.currentTimeMillis(); 	TokenNameCOMMENT_LINE	long t1 = System.currentTimeMillis(); 
if	TokenNameif	
(	TokenNameLPAREN	
xinset	TokenNameIdentifier	 xinset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skipX	TokenNameIdentifier	 skip X
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
convOp	TokenNameIdentifier	 conv Op
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpR2	TokenNameIdentifier	 tmp R2
=	TokenNameEQUAL	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createCompatibleWritableRaster	TokenNameIdentifier	 create Compatible Writable Raster
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpR2	TokenNameIdentifier	 tmp R2
=	TokenNameEQUAL	
convOp	TokenNameIdentifier	 conv Op
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR2	TokenNameIdentifier	 tmp R2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipX	TokenNameIdentifier	 skip X
=	TokenNameEQUAL	
convOp	TokenNameIdentifier	 conv Op
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getKernel	TokenNameIdentifier	 get Kernel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXOrigin	TokenNameIdentifier	 get X Origin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Swap them... 	TokenNameCOMMENT_LINE	Swap them... 
WritableRaster	TokenNameIdentifier	 Writable Raster
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
tmpR1	TokenNameIdentifier	 tmp R1
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
tmpR2	TokenNameIdentifier	 tmp R2
;	TokenNameSEMICOLON	
tmpR2	TokenNameIdentifier	 tmp R2
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dX	TokenNameIdentifier	 d X
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterH	TokenNameIdentifier	 box Filter H
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterH	TokenNameIdentifier	 box Filter H
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterH	TokenNameIdentifier	 box Filter H
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipX	TokenNameIdentifier	 skip X
=	TokenNameEQUAL	
dX	TokenNameIdentifier	 d X
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterH	TokenNameIdentifier	 box Filter H
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterH	TokenNameIdentifier	 box Filter H
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterH	TokenNameIdentifier	 box Filter H
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipX	TokenNameIdentifier	 skip X
=	TokenNameEQUAL	
dX	TokenNameIdentifier	 d X
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
dX	TokenNameIdentifier	 d X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
yinset	TokenNameIdentifier	 yinset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpR2	TokenNameIdentifier	 tmp R2
=	TokenNameEQUAL	
tmpR1	TokenNameIdentifier	 tmp R1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
convOp	TokenNameIdentifier	 conv Op
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tmpR2	TokenNameIdentifier	 tmp R2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpR2	TokenNameIdentifier	 tmp R2
=	TokenNameEQUAL	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createCompatibleWritableRaster	TokenNameIdentifier	 create Compatible Writable Raster
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tmpR2	TokenNameIdentifier	 tmp R2
=	TokenNameEQUAL	
convOp	TokenNameIdentifier	 conv Op
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR2	TokenNameIdentifier	 tmp R2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dY	TokenNameIdentifier	 d Y
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterV	TokenNameIdentifier	 box Filter V
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
skipX	TokenNameIdentifier	 skip X
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterV	TokenNameIdentifier	 box Filter V
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
skipX	TokenNameIdentifier	 skip X
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterV	TokenNameIdentifier	 box Filter V
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
skipX	TokenNameIdentifier	 skip X
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterV	TokenNameIdentifier	 box Filter V
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
skipX	TokenNameIdentifier	 skip X
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterV	TokenNameIdentifier	 box Filter V
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
skipX	TokenNameIdentifier	 skip X
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpR1	TokenNameIdentifier	 tmp R1
=	TokenNameEQUAL	
boxFilterV	TokenNameIdentifier	 box Filter V
(	TokenNameLPAREN	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
tmpR1	TokenNameIdentifier	 tmp R1
,	TokenNameCOMMA	
skipX	TokenNameIdentifier	 skip X
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tmpR2	TokenNameIdentifier	 tmp R2
=	TokenNameEQUAL	
tmpR1	TokenNameIdentifier	 tmp R1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// long t2 = System.currentTimeMillis(); 	TokenNameCOMMENT_LINE	long t2 = System.currentTimeMillis(); 
// System.out.println("Time: " + (t2-t1) + 	TokenNameCOMMENT_LINE	System.out.println("Time: " + (t2-t1) + 
// (((convOp[0] != null) || (convOp[1] != null))? 	TokenNameCOMMENT_LINE	(((convOp[0] != null) || (convOp[1] != null))? 
// " ConvOp":"")); 	TokenNameCOMMENT_LINE	" ConvOp":"")); 
// System.out.println("Rasters WR :" + wr.getBounds()); 	TokenNameCOMMENT_LINE	System.out.println("Rasters WR :" + wr.getBounds()); 
// System.out.println(" tmp:" + tmpR2.getBounds()); 	TokenNameCOMMENT_LINE	System.out.println(" tmp:" + tmpR2.getBounds()); 
// System.out.println(" bounds:" + getBounds()); 	TokenNameCOMMENT_LINE	System.out.println(" bounds:" + getBounds()); 
// System.out.println(" skipX:" + skipX + 	TokenNameCOMMENT_LINE	System.out.println(" skipX:" + skipX + 
// " dx:" + dX + " Dy: " + dY); 	TokenNameCOMMENT_LINE	" dx:" + dX + " Dy: " + dY); 
tmpR2	TokenNameIdentifier	 tmp R2
=	TokenNameEQUAL	
tmpR2	TokenNameIdentifier	 tmp R2
.	TokenNameDOT	
createWritableTranslatedChild	TokenNameIdentifier	 create Writable Translated Child
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
tmpR2	TokenNameIdentifier	 tmp R2
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
WritableRaster	TokenNameIdentifier	 Writable Raster
boxFilterH	TokenNameIdentifier	 box Filter H
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
int	TokenNameint	
skipX	TokenNameIdentifier	 skip X
,	TokenNameCOMMA	
int	TokenNameint	
skipY	TokenNameIdentifier	 skip Y
,	TokenNameCOMMA	
int	TokenNameint	
boxSz	TokenNameIdentifier	 box Sz
,	TokenNameCOMMA	
int	TokenNameint	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the raster is wide enough to do _any_ work 	TokenNameCOMMENT_LINE	Check if the raster is wide enough to do _any_ work 
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
<	TokenNameLESS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
skipX	TokenNameIdentifier	 skip X
)	TokenNameRPAREN	
+	TokenNamePLUS	
boxSz	TokenNameIdentifier	 box Sz
)	TokenNameRPAREN	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
<	TokenNameLESS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
skipY	TokenNameIdentifier	 skip Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
srcSPPSM	TokenNameIdentifier	 src SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
dstSPPSM	TokenNameIdentifier	 dst SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Stride is the distance between two consecutive column elements, 	TokenNameCOMMENT_LINE	Stride is the distance between two consecutive column elements, 
// in the one-dimention dataBuffer 	TokenNameCOMMENT_LINE	in the one-dimention dataBuffer 
final	TokenNamefinal	
int	TokenNameint	
srcScanStride	TokenNameIdentifier	 src Scan Stride
=	TokenNameEQUAL	
srcSPPSM	TokenNameIdentifier	 src SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstScanStride	TokenNameIdentifier	 dst Scan Stride
=	TokenNameEQUAL	
dstSPPSM	TokenNameIdentifier	 dst SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Access the integer buffer for each image. 	TokenNameCOMMENT_LINE	Access the integer buffer for each image. 
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
srcDB	TokenNameIdentifier	 src DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dstDB	TokenNameIdentifier	 dst DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Offset defines where in the stack the real data begin 	TokenNameCOMMENT_LINE	Offset defines where in the stack the real data begin 
final	TokenNamefinal	
int	TokenNameint	
srcOff	TokenNameIdentifier	 src Off
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcDB	TokenNameIdentifier	 src DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcSPPSM	TokenNameIdentifier	 src SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstOff	TokenNameIdentifier	 dst Off
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstDB	TokenNameIdentifier	 dst DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstSPPSM	TokenNameIdentifier	 dst SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Access the pixel value array 	TokenNameCOMMENT_LINE	Access the pixel value array 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
=	TokenNameEQUAL	
srcDB	TokenNameIdentifier	 src DB
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
destPixels	TokenNameIdentifier	 dest Pixels
=	TokenNameEQUAL	
dstDB	TokenNameIdentifier	 dst DB
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
boxSz	TokenNameIdentifier	 box Sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
// Fixed point normalization factor (8.24) 	TokenNameCOMMENT_LINE	Fixed point normalization factor (8.24) 
int	TokenNameint	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
boxSz	TokenNameIdentifier	 box Sz
;	TokenNameSEMICOLON	
/* * System.out.println("Info: srcOff: " + srcOff + * " x: " + skipX + * " y: " + skipY + * " w: " + w + * " h: " + h + * " boxSz " + boxSz + * " srcStride: " + srcScanStride); */	TokenNameCOMMENT_BLOCK	 System.out.println("Info: srcOff: " + srcOff + " x: " + skipX + " y: " + skipY + " w: " + w + " h: " + h + " boxSz " + boxSz + " srcStride: " + srcScanStride); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
skipY	TokenNameIdentifier	 skip Y
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
skipY	TokenNameIdentifier	 skip Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
srcOff	TokenNameIdentifier	 src Off
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
srcScanStride	TokenNameIdentifier	 src Scan Stride
;	TokenNameSEMICOLON	
int	TokenNameint	
dp	TokenNameIdentifier	 dp
=	TokenNameEQUAL	
dstOff	TokenNameIdentifier	 dst Off
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
dstScanStride	TokenNameIdentifier	 dst Scan Stride
;	TokenNameSEMICOLON	
int	TokenNameint	
rowEnd	TokenNameIdentifier	 row End
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
-	TokenNameMINUS	
skipX	TokenNameIdentifier	 skip X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sumA	TokenNameIdentifier	 sum A
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sumR	TokenNameIdentifier	 sum R
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sumG	TokenNameIdentifier	 sum G
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sumB	TokenNameIdentifier	 sum B
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
+=	TokenNamePLUS_EQUAL	
skipX	TokenNameIdentifier	 skip X
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
boxSz	TokenNameIdentifier	 box Sz
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumA	TokenNameIdentifier	 sum A
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumR	TokenNameIdentifier	 sum R
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumG	TokenNameIdentifier	 sum G
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumB	TokenNameIdentifier	 sum B
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
skipX	TokenNameIdentifier	 skip X
+	TokenNamePLUS	
loc	TokenNameIdentifier	 loc
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumA	TokenNameIdentifier	 sum A
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumR	TokenNameIdentifier	 sum R
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumG	TokenNameIdentifier	 sum G
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumB	TokenNameIdentifier	 sum B
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
rowEnd	TokenNameIdentifier	 row End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sumA	TokenNameIdentifier	 sum A
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumR	TokenNameIdentifier	 sum R
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumG	TokenNameIdentifier	 sum G
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumB	TokenNameIdentifier	 sum B
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumA	TokenNameIdentifier	 sum A
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumR	TokenNameIdentifier	 sum R
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumG	TokenNameIdentifier	 sum G
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumB	TokenNameIdentifier	 sum B
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumA	TokenNameIdentifier	 sum A
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumR	TokenNameIdentifier	 sum R
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumG	TokenNameIdentifier	 sum G
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumB	TokenNameIdentifier	 sum B
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
boxSz	TokenNameIdentifier	 box Sz
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
WritableRaster	TokenNameIdentifier	 Writable Raster
boxFilterV	TokenNameIdentifier	 box Filter V
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
int	TokenNameint	
skipX	TokenNameIdentifier	 skip X
,	TokenNameCOMMA	
int	TokenNameint	
skipY	TokenNameIdentifier	 skip Y
,	TokenNameCOMMA	
int	TokenNameint	
boxSz	TokenNameIdentifier	 box Sz
,	TokenNameCOMMA	
int	TokenNameint	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the raster is wide enough to do _any_ work 	TokenNameCOMMENT_LINE	Check if the raster is wide enough to do _any_ work 
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
<	TokenNameLESS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
skipX	TokenNameIdentifier	 skip X
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
<	TokenNameLESS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
skipY	TokenNameIdentifier	 skip Y
)	TokenNameRPAREN	
+	TokenNamePLUS	
boxSz	TokenNameIdentifier	 box Sz
)	TokenNameRPAREN	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
srcSPPSM	TokenNameIdentifier	 src SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
dstSPPSM	TokenNameIdentifier	 dst SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Stride is the distance between two consecutive column elements, 	TokenNameCOMMENT_LINE	Stride is the distance between two consecutive column elements, 
// in the one-dimention dataBuffer 	TokenNameCOMMENT_LINE	in the one-dimention dataBuffer 
final	TokenNamefinal	
int	TokenNameint	
srcScanStride	TokenNameIdentifier	 src Scan Stride
=	TokenNameEQUAL	
srcSPPSM	TokenNameIdentifier	 src SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstScanStride	TokenNameIdentifier	 dst Scan Stride
=	TokenNameEQUAL	
dstSPPSM	TokenNameIdentifier	 dst SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Access the integer buffer for each image. 	TokenNameCOMMENT_LINE	Access the integer buffer for each image. 
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
srcDB	TokenNameIdentifier	 src DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dstDB	TokenNameIdentifier	 dst DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Offset defines where in the stack the real data begin 	TokenNameCOMMENT_LINE	Offset defines where in the stack the real data begin 
final	TokenNamefinal	
int	TokenNameint	
srcOff	TokenNameIdentifier	 src Off
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcDB	TokenNameIdentifier	 src DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcSPPSM	TokenNameIdentifier	 src SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstOff	TokenNameIdentifier	 dst Off
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstDB	TokenNameIdentifier	 dst DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstSPPSM	TokenNameIdentifier	 dst SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Access the pixel value array 	TokenNameCOMMENT_LINE	Access the pixel value array 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
=	TokenNameEQUAL	
srcDB	TokenNameIdentifier	 src DB
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
destPixels	TokenNameIdentifier	 dest Pixels
=	TokenNameEQUAL	
dstDB	TokenNameIdentifier	 dst DB
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
boxSz	TokenNameIdentifier	 box Sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
// Fixed point normalization factor (8.24) 	TokenNameCOMMENT_LINE	Fixed point normalization factor (8.24) 
final	TokenNamefinal	
int	TokenNameint	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
boxSz	TokenNameIdentifier	 box Sz
;	TokenNameSEMICOLON	
/* * System.out.println("Info: srcOff: " + srcOff + * " x: " + skipX + * " y: " + skipY + * " w: " + w + * " h: " + h + * " boxSz " + boxSz + * " srcStride: " + srcScanStride); */	TokenNameCOMMENT_BLOCK	 System.out.println("Info: srcOff: " + srcOff + " x: " + skipX + " y: " + skipY + " w: " + w + " h: " + h + " boxSz " + boxSz + " srcStride: " + srcScanStride); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
skipX	TokenNameIdentifier	 skip X
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
-	TokenNameMINUS	
skipX	TokenNameIdentifier	 skip X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
srcOff	TokenNameIdentifier	 src Off
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
dp	TokenNameIdentifier	 dp
=	TokenNameEQUAL	
dstOff	TokenNameIdentifier	 dst Off
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
colEnd	TokenNameIdentifier	 col End
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
skipY	TokenNameIdentifier	 skip Y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcScanStride	TokenNameIdentifier	 src Scan Stride
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sumA	TokenNameIdentifier	 sum A
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sumR	TokenNameIdentifier	 sum R
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sumG	TokenNameIdentifier	 sum G
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sumB	TokenNameIdentifier	 sum B
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
+=	TokenNamePLUS_EQUAL	
skipY	TokenNameIdentifier	 skip Y
*	TokenNameMULTIPLY	
srcScanStride	TokenNameIdentifier	 src Scan Stride
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
(	TokenNameLPAREN	
boxSz	TokenNameIdentifier	 box Sz
*	TokenNameMULTIPLY	
srcScanStride	TokenNameIdentifier	 src Scan Stride
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumA	TokenNameIdentifier	 sum A
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumR	TokenNameIdentifier	 sum R
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumG	TokenNameIdentifier	 sum G
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumB	TokenNameIdentifier	 sum B
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
+=	TokenNamePLUS_EQUAL	
srcScanStride	TokenNameIdentifier	 src Scan Stride
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
skipY	TokenNameIdentifier	 skip Y
+	TokenNamePLUS	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstScanStride	TokenNameIdentifier	 dst Scan Stride
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumA	TokenNameIdentifier	 sum A
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumR	TokenNameIdentifier	 sum R
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumG	TokenNameIdentifier	 sum G
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumB	TokenNameIdentifier	 sum B
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstScanStride	TokenNameIdentifier	 dst Scan Stride
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
colEnd	TokenNameIdentifier	 col End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sumA	TokenNameIdentifier	 sum A
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumR	TokenNameIdentifier	 sum R
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumG	TokenNameIdentifier	 sum G
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumB	TokenNameIdentifier	 sum B
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumA	TokenNameIdentifier	 sum A
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumR	TokenNameIdentifier	 sum R
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumG	TokenNameIdentifier	 sum G
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sumB	TokenNameIdentifier	 sum B
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
destPixels	TokenNameIdentifier	 dest Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumA	TokenNameIdentifier	 sum A
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumR	TokenNameIdentifier	 sum R
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumG	TokenNameIdentifier	 sum G
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sumB	TokenNameIdentifier	 sum B
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
boxSz	TokenNameIdentifier	 box Sz
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
+=	TokenNamePLUS_EQUAL	
srcScanStride	TokenNameIdentifier	 src Scan Stride
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstScanStride	TokenNameIdentifier	 dst Scan Stride
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
masks	TokenNameIdentifier	 masks
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0x00FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0xFF0000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0x00FF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0x0000FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0x00FF0000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0x0000FF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0x000000FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0xFF000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"GaussianBlurRed8Bit only supports one to four band images"	TokenNameStringLiteral	GaussianBlurRed8Bit only supports one to four band images
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ColorSpace	TokenNameIdentifier	 Color Space
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DirectColorModel	TokenNameIdentifier	 Direct Color Model
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
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
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_INT	TokenNameIdentifier	 TYPE  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
