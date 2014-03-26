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
RenderedImage	TokenNameIdentifier	 Rendered Image
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
/** * Default BumpMap implementation. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: BumpMap.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Default BumpMap implementation. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: BumpMap.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BumpMap	TokenNameIdentifier	 Bump Map
{	TokenNameLBRACE	
/** * Image whose alpha channel is used for the * normal calculation */	TokenNameCOMMENT_JAVADOC	 Image whose alpha channel is used for the normal calculation 
private	TokenNameprivate	
RenderedImage	TokenNameIdentifier	 Rendered Image
texture	TokenNameIdentifier	 texture
;	TokenNameSEMICOLON	
/** * Surface scale used in the normal computation */	TokenNameCOMMENT_JAVADOC	 Surface scale used in the normal computation 
private	TokenNameprivate	
double	TokenNamedouble	
surfaceScale	TokenNameIdentifier	 surface Scale
,	TokenNameCOMMA	
surfaceScaleX	TokenNameIdentifier	 surface Scale X
,	TokenNameCOMMA	
surfaceScaleY	TokenNameIdentifier	 surface Scale Y
;	TokenNameSEMICOLON	
/** * User space to device space scale factors */	TokenNameCOMMENT_JAVADOC	 User space to device space scale factors 
private	TokenNameprivate	
double	TokenNamedouble	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
scaleY	TokenNameIdentifier	 scale Y
;	TokenNameSEMICOLON	
/** * Stores the normals for this bumpMap. * scaleX and scaleY are the user space to device * space scales. */	TokenNameCOMMENT_JAVADOC	 Stores the normals for this bumpMap. scaleX and scaleY are the user space to device space scales. 
public	TokenNamepublic	
BumpMap	TokenNameIdentifier	 Bump Map
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
texture	TokenNameIdentifier	 texture
,	TokenNameCOMMA	
double	TokenNamedouble	
surfaceScale	TokenNameIdentifier	 surface Scale
,	TokenNameCOMMA	
double	TokenNamedouble	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
double	TokenNamedouble	
scaleY	TokenNameIdentifier	 scale Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
texture	TokenNameIdentifier	 texture
=	TokenNameEQUAL	
texture	TokenNameIdentifier	 texture
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
surfaceScaleX	TokenNameIdentifier	 surface Scale X
=	TokenNameEQUAL	
surfaceScale	TokenNameIdentifier	 surface Scale
*	TokenNameMULTIPLY	
scaleX	TokenNameIdentifier	 scale X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
surfaceScaleY	TokenNameIdentifier	 surface Scale Y
=	TokenNameEQUAL	
surfaceScale	TokenNameIdentifier	 surface Scale
*	TokenNameMULTIPLY	
scaleY	TokenNameIdentifier	 scale Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
surfaceScale	TokenNameIdentifier	 surface Scale
=	TokenNameEQUAL	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scaleX	TokenNameIdentifier	 scale X
=	TokenNameEQUAL	
scaleX	TokenNameIdentifier	 scale X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scaleY	TokenNameIdentifier	 scale Y
=	TokenNameEQUAL	
scaleY	TokenNameIdentifier	 scale Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return surface scale used by this bump map. */	TokenNameCOMMENT_JAVADOC	 @return surface scale used by this bump map. 
public	TokenNamepublic	
double	TokenNamedouble	
getSurfaceScale	TokenNameIdentifier	 get Surface Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param x x-axis coordinate for which the normal is computed * @param y y-axis coordinate for which the normal is computed */	TokenNameCOMMENT_JAVADOC	 @param x x-axis coordinate for which the normal is computed @param y y-axis coordinate for which the normal is computed 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNormalArray	TokenNameIdentifier	 get Normal Array
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
h	TokenNameIdentifier	 h
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
srcRect	TokenNameIdentifier	 src Rect
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
srcBound	TokenNameIdentifier	 src Bound
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
texture	TokenNameIdentifier	 texture
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
texture	TokenNameIdentifier	 texture
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
texture	TokenNameIdentifier	 texture
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
texture	TokenNameIdentifier	 texture
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
srcBound	TokenNameIdentifier	 src Bound
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
srcRect	TokenNameIdentifier	 src Rect
=	TokenNameEQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
srcBound	TokenNameIdentifier	 src Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Raster	TokenNameIdentifier	 Raster
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
texture	TokenNameIdentifier	 texture
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
srcRect	TokenNameIdentifier	 src Rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcRect	TokenNameIdentifier	 src Rect
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("SrcRect: " + srcRect); 	TokenNameCOMMENT_LINE	System.out.println("SrcRect: " + srcRect); 
// System.out.println("rect: [" + 	TokenNameCOMMENT_LINE	System.out.println("rect: [" + 
// x + ", " + y + ", " + 	TokenNameCOMMENT_LINE	x + ", " + y + ", " + 
// w + ", " + h + "]"); 	TokenNameCOMMENT_LINE	w + ", " + h + "]"); 
final	TokenNamefinal	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
sppsm	TokenNameIdentifier	 sppsm
;	TokenNameSEMICOLON	
sppsm	TokenNameIdentifier	 sppsm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
scanStride	TokenNameIdentifier	 scan Stride
=	TokenNameEQUAL	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
scanStridePP	TokenNameIdentifier	 scan Stride PP
=	TokenNameEQUAL	
scanStride	TokenNameIdentifier	 scan Stride
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
scanStrideMM	TokenNameIdentifier	 scan Stride MM
=	TokenNameEQUAL	
scanStride	TokenNameIdentifier	 scan Stride
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
prpc	TokenNameIdentifier	 prpc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prcc	TokenNameIdentifier	 prcc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prnc	TokenNameIdentifier	 prnc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
crnc	TokenNameIdentifier	 crnc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
nrpc	TokenNameIdentifier	 nrpc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nrcc	TokenNameIdentifier	 nrcc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nrnc	TokenNameIdentifier	 nrnc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
quarterSurfaceScaleX	TokenNameIdentifier	 quarter Surface Scale X
=	TokenNameEQUAL	
surfaceScaleX	TokenNameIdentifier	 surface Scale X
/	TokenNameDIVIDE	
4f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
quarterSurfaceScaleY	TokenNameIdentifier	 quarter Surface Scale Y
=	TokenNameEQUAL	
surfaceScaleY	TokenNameIdentifier	 surface Scale Y
/	TokenNameDIVIDE	
4f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
halfSurfaceScaleX	TokenNameIdentifier	 half Surface Scale X
=	TokenNameEQUAL	
surfaceScaleX	TokenNameIdentifier	 surface Scale X
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
halfSurfaceScaleY	TokenNameIdentifier	 half Surface Scale Y
=	TokenNameEQUAL	
surfaceScaleY	TokenNameIdentifier	 surface Scale Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
thirdSurfaceScaleX	TokenNameIdentifier	 third Surface Scale X
=	TokenNameEQUAL	
surfaceScaleX	TokenNameIdentifier	 surface Scale X
/	TokenNameDIVIDE	
3f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
thirdSurfaceScaleY	TokenNameIdentifier	 third Surface Scale Y
=	TokenNameEQUAL	
surfaceScaleY	TokenNameIdentifier	 surface Scale Y
/	TokenNameDIVIDE	
3f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
twoThirdSurfaceScaleX	TokenNameIdentifier	 two Third Surface Scale X
=	TokenNameEQUAL	
surfaceScaleX	TokenNameIdentifier	 surface Scale X
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
3f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
twoThirdSurfaceScaleY	TokenNameIdentifier	 two Third Surface Scale Y
=	TokenNameEQUAL	
surfaceScaleY	TokenNameIdentifier	 surface Scale Y
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
3f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
pixelScale	TokenNameIdentifier	 pixel Scale
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
// Process pixels on the border 	TokenNameCOMMENT_LINE	Process pixels on the border 
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
xEnd	TokenNameIdentifier	 x End
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yEnd	TokenNameIdentifier	 y End
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
yloc	TokenNameIdentifier	 yloc
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
<	TokenNameLESS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yloc	TokenNameIdentifier	 yloc
=	TokenNameEQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Top edge extend filters... 	TokenNameCOMMENT_LINE	Top edge extend filters... 
if	TokenNameif	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
==	TokenNameEQUAL_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
==	TokenNameEQUAL_EQUAL	
yEnd	TokenNameIdentifier	 y End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only one row of pixels... 	TokenNameCOMMENT_LINE	Only one row of pixels... 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NRow	TokenNameIdentifier	 N Row
=	TokenNameEQUAL	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
scanStride	TokenNameIdentifier	 scan Stride
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
!=	TokenNameNOT_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Top left pixel, in src (0, 0); 	TokenNameCOMMENT_LINE	Top left pixel, in src (0, 0); 
crnc	TokenNameIdentifier	 crnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
surfaceScaleX	TokenNameIdentifier	 surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
crcc	TokenNameIdentifier	 crcc
-	TokenNameMINUS	
crnc	TokenNameIdentifier	 crnc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
crnc	TokenNameIdentifier	 crnc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Single pix. 	TokenNameCOMMENT_LINE	Single pix. 
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Middle Top row... 	TokenNameCOMMENT_LINE	Middle Top row... 
crnc	TokenNameIdentifier	 crnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
surfaceScaleX	TokenNameIdentifier	 surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
crpc	TokenNameIdentifier	 crpc
-	TokenNameMINUS	
crnc	TokenNameIdentifier	 crnc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
crnc	TokenNameIdentifier	 crnc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
==	TokenNameEQUAL_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Last pixel of top row 	TokenNameCOMMENT_LINE	Last pixel of top row 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
surfaceScaleX	TokenNameIdentifier	 surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
crpc	TokenNameIdentifier	 crpc
-	TokenNameMINUS	
crcc	TokenNameIdentifier	 crcc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NRow	TokenNameIdentifier	 N Row
=	TokenNameEQUAL	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
scanStride	TokenNameIdentifier	 scan Stride
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
+=	TokenNamePLUS_EQUAL	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
nrcc	TokenNameIdentifier	 nrcc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
scanStride	TokenNameIdentifier	 scan Stride
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
!=	TokenNameNOT_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
nrpc	TokenNameIdentifier	 nrpc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
scanStrideMM	TokenNameIdentifier	 scan Stride MM
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Top left pixel, in src (0, 0); 	TokenNameCOMMENT_LINE	Top left pixel, in src (0, 0); 
crnc	TokenNameIdentifier	 crnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
nrnc	TokenNameIdentifier	 nrnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
scanStridePP	TokenNameIdentifier	 scan Stride PP
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
twoThirdSurfaceScaleX	TokenNameIdentifier	 two Third Surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crnc	TokenNameIdentifier	 crnc
+	TokenNamePLUS	
nrnc	TokenNameIdentifier	 nrnc
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
-	TokenNameMINUS	
nrcc	TokenNameIdentifier	 nrcc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
twoThirdSurfaceScaleY	TokenNameIdentifier	 two Third Surface Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
nrcc	TokenNameIdentifier	 nrcc
+	TokenNamePLUS	
nrnc	TokenNameIdentifier	 nrnc
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
-	TokenNameMINUS	
crnc	TokenNameIdentifier	 crnc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
nrpc	TokenNameIdentifier	 nrpc
=	TokenNameEQUAL	
nrcc	TokenNameIdentifier	 nrcc
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
crnc	TokenNameIdentifier	 crnc
;	TokenNameSEMICOLON	
nrcc	TokenNameIdentifier	 nrcc
=	TokenNameEQUAL	
nrnc	TokenNameIdentifier	 nrnc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Single pix 	TokenNameCOMMENT_LINE	Single pix 
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
nrpc	TokenNameIdentifier	 nrpc
=	TokenNameEQUAL	
nrcc	TokenNameIdentifier	 nrcc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Middle Top row... 	TokenNameCOMMENT_LINE	Middle Top row... 
crnc	TokenNameIdentifier	 crnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
nrnc	TokenNameIdentifier	 nrnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
scanStridePP	TokenNameIdentifier	 scan Stride PP
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
thirdSurfaceScaleX	TokenNameIdentifier	 third Surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crnc	TokenNameIdentifier	 crnc
+	TokenNamePLUS	
nrnc	TokenNameIdentifier	 nrnc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crpc	TokenNameIdentifier	 crpc
+	TokenNamePLUS	
nrpc	TokenNameIdentifier	 nrpc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
halfSurfaceScaleY	TokenNameIdentifier	 half Surface Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nrpc	TokenNameIdentifier	 nrpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
nrcc	TokenNameIdentifier	 nrcc
+	TokenNamePLUS	
nrnc	TokenNameIdentifier	 nrnc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
crpc	TokenNameIdentifier	 crpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
crnc	TokenNameIdentifier	 crnc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
nrpc	TokenNameIdentifier	 nrpc
=	TokenNameEQUAL	
nrcc	TokenNameIdentifier	 nrcc
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
crnc	TokenNameIdentifier	 crnc
;	TokenNameSEMICOLON	
nrcc	TokenNameIdentifier	 nrcc
=	TokenNameEQUAL	
nrnc	TokenNameIdentifier	 nrnc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
==	TokenNameEQUAL_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Last pixel of top row 	TokenNameCOMMENT_LINE	Last pixel of top row 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
twoThirdSurfaceScaleX	TokenNameIdentifier	 two Third Surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
nrcc	TokenNameIdentifier	 nrcc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crpc	TokenNameIdentifier	 crpc
+	TokenNamePLUS	
nrpc	TokenNameIdentifier	 nrpc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
twoThirdSurfaceScaleY	TokenNameIdentifier	 two Third Surface Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
nrcc	TokenNameIdentifier	 nrcc
+	TokenNamePLUS	
nrpc	TokenNameIdentifier	 nrpc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
crpc	TokenNameIdentifier	 crpc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yloc	TokenNameIdentifier	 yloc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
yloc	TokenNameIdentifier	 yloc
<	TokenNameLESS	
yEnd	TokenNameIdentifier	 y End
;	TokenNameSEMICOLON	
yloc	TokenNameIdentifier	 yloc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NRow	TokenNameIdentifier	 N Row
=	TokenNameEQUAL	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
scanStride	TokenNameIdentifier	 scan Stride
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
+=	TokenNamePLUS_EQUAL	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
prcc	TokenNameIdentifier	 prcc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
scanStride	TokenNameIdentifier	 scan Stride
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
nrcc	TokenNameIdentifier	 nrcc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
scanStride	TokenNameIdentifier	 scan Stride
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
!=	TokenNameNOT_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prpc	TokenNameIdentifier	 prpc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
scanStridePP	TokenNameIdentifier	 scan Stride PP
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
nrpc	TokenNameIdentifier	 nrpc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
scanStrideMM	TokenNameIdentifier	 scan Stride MM
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Now, process left column, from (0, 1) to (0, h-1) 	TokenNameCOMMENT_LINE	Now, process left column, from (0, 1) to (0, h-1) 
crnc	TokenNameIdentifier	 crnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
prnc	TokenNameIdentifier	 prnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
scanStrideMM	TokenNameIdentifier	 scan Stride MM
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
nrnc	TokenNameIdentifier	 nrnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
scanStridePP	TokenNameIdentifier	 scan Stride PP
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
halfSurfaceScaleX	TokenNameIdentifier	 half Surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prnc	TokenNameIdentifier	 prnc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crnc	TokenNameIdentifier	 crnc
+	TokenNamePLUS	
nrnc	TokenNameIdentifier	 nrnc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
prcc	TokenNameIdentifier	 prcc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
nrcc	TokenNameIdentifier	 nrcc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
thirdSurfaceScaleY	TokenNameIdentifier	 third Surface Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
prcc	TokenNameIdentifier	 prcc
+	TokenNamePLUS	
prnc	TokenNameIdentifier	 prnc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
crnc	TokenNameIdentifier	 crnc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
prpc	TokenNameIdentifier	 prpc
=	TokenNameEQUAL	
prcc	TokenNameIdentifier	 prcc
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
nrpc	TokenNameIdentifier	 nrpc
=	TokenNameEQUAL	
nrcc	TokenNameIdentifier	 nrcc
;	TokenNameSEMICOLON	
prcc	TokenNameIdentifier	 prcc
=	TokenNameEQUAL	
prnc	TokenNameIdentifier	 prnc
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
crnc	TokenNameIdentifier	 crnc
;	TokenNameSEMICOLON	
nrcc	TokenNameIdentifier	 nrcc
=	TokenNameEQUAL	
nrnc	TokenNameIdentifier	 nrnc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Single pix 	TokenNameCOMMENT_LINE	Single pix 
prpc	TokenNameIdentifier	 prpc
=	TokenNameEQUAL	
prcc	TokenNameIdentifier	 prcc
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
nrpc	TokenNameIdentifier	 nrpc
=	TokenNameEQUAL	
nrcc	TokenNameIdentifier	 nrcc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Middle Middle row... 	TokenNameCOMMENT_LINE	Middle Middle row... 
prnc	TokenNameIdentifier	 prnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
scanStrideMM	TokenNameIdentifier	 scan Stride MM
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
crnc	TokenNameIdentifier	 crnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
nrnc	TokenNameIdentifier	 nrnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
scanStridePP	TokenNameIdentifier	 scan Stride PP
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
quarterSurfaceScaleX	TokenNameIdentifier	 quarter Surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prnc	TokenNameIdentifier	 prnc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crnc	TokenNameIdentifier	 crnc
+	TokenNamePLUS	
nrnc	TokenNameIdentifier	 nrnc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
prpc	TokenNameIdentifier	 prpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crpc	TokenNameIdentifier	 crpc
+	TokenNamePLUS	
nrpc	TokenNameIdentifier	 nrpc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
quarterSurfaceScaleY	TokenNameIdentifier	 quarter Surface Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nrpc	TokenNameIdentifier	 nrpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
nrcc	TokenNameIdentifier	 nrcc
+	TokenNamePLUS	
nrnc	TokenNameIdentifier	 nrnc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
prpc	TokenNameIdentifier	 prpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
prcc	TokenNameIdentifier	 prcc
+	TokenNamePLUS	
prnc	TokenNameIdentifier	 prnc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
prpc	TokenNameIdentifier	 prpc
=	TokenNameEQUAL	
prcc	TokenNameIdentifier	 prcc
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
nrpc	TokenNameIdentifier	 nrpc
=	TokenNameEQUAL	
nrcc	TokenNameIdentifier	 nrcc
;	TokenNameSEMICOLON	
prcc	TokenNameIdentifier	 prcc
=	TokenNameEQUAL	
prnc	TokenNameIdentifier	 prnc
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
crnc	TokenNameIdentifier	 crnc
;	TokenNameSEMICOLON	
nrcc	TokenNameIdentifier	 nrcc
=	TokenNameEQUAL	
nrnc	TokenNameIdentifier	 nrnc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
==	TokenNameEQUAL_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Now, proces right column, from (w-1, 1) to (w-1, h-1) 	TokenNameCOMMENT_LINE	Now, proces right column, from (w-1, 1) to (w-1, h-1) 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
halfSurfaceScaleX	TokenNameIdentifier	 half Surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prcc	TokenNameIdentifier	 prcc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
nrcc	TokenNameIdentifier	 nrcc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
prpc	TokenNameIdentifier	 prpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crpc	TokenNameIdentifier	 crpc
+	TokenNamePLUS	
nrpc	TokenNameIdentifier	 nrpc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
thirdSurfaceScaleY	TokenNameIdentifier	 third Surface Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nrpc	TokenNameIdentifier	 nrpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
nrcc	TokenNameIdentifier	 nrcc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
prpc	TokenNameIdentifier	 prpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
prcc	TokenNameIdentifier	 prcc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
<	TokenNameLESS	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
==	TokenNameEQUAL_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NRow	TokenNameIdentifier	 N Row
=	TokenNameEQUAL	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
scanStride	TokenNameIdentifier	 scan Stride
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
+=	TokenNamePLUS_EQUAL	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
prcc	TokenNameIdentifier	 prcc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
scanStride	TokenNameIdentifier	 scan Stride
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
!=	TokenNameNOT_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prpc	TokenNameIdentifier	 prpc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
scanStridePP	TokenNameIdentifier	 scan Stride PP
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Process first pixel of last row 	TokenNameCOMMENT_LINE	Process first pixel of last row 
crnc	TokenNameIdentifier	 crnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
prnc	TokenNameIdentifier	 prnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
scanStrideMM	TokenNameIdentifier	 scan Stride MM
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
twoThirdSurfaceScaleX	TokenNameIdentifier	 two Third Surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crnc	TokenNameIdentifier	 crnc
+	TokenNamePLUS	
prnc	TokenNameIdentifier	 prnc
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
-	TokenNameMINUS	
prcc	TokenNameIdentifier	 prcc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
twoThirdSurfaceScaleY	TokenNameIdentifier	 two Third Surface Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
crnc	TokenNameIdentifier	 crnc
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
prcc	TokenNameIdentifier	 prcc
-	TokenNameMINUS	
prnc	TokenNameIdentifier	 prnc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
prpc	TokenNameIdentifier	 prpc
=	TokenNameEQUAL	
prcc	TokenNameIdentifier	 prcc
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
crnc	TokenNameIdentifier	 crnc
;	TokenNameSEMICOLON	
prcc	TokenNameIdentifier	 prcc
=	TokenNameEQUAL	
prnc	TokenNameIdentifier	 prnc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Single pix 	TokenNameCOMMENT_LINE	Single pix 
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
prpc	TokenNameIdentifier	 prpc
=	TokenNameEQUAL	
prcc	TokenNameIdentifier	 prcc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
;	TokenNameSEMICOLON	
xloc	TokenNameIdentifier	 xloc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Middle of Bottom row... 	TokenNameCOMMENT_LINE	Middle of Bottom row... 
crnc	TokenNameIdentifier	 crnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
prnc	TokenNameIdentifier	 prnc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
scanStrideMM	TokenNameIdentifier	 scan Stride MM
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
pixelScale	TokenNameIdentifier	 pixel Scale
;	TokenNameSEMICOLON	
// System.out.println("Vals: " + 	TokenNameCOMMENT_LINE	System.out.println("Vals: " + 
// prpc + "," + prcc + "," + prnc + " " + 	TokenNameCOMMENT_LINE	prpc + "," + prcc + "," + prnc + " " + 
// crpc + "," + crcc + "," + crnc ); 	TokenNameCOMMENT_LINE	crpc + "," + crcc + "," + crnc ); 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
thirdSurfaceScaleX	TokenNameIdentifier	 third Surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crnc	TokenNameIdentifier	 crnc
+	TokenNamePLUS	
prnc	TokenNameIdentifier	 prnc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crpc	TokenNameIdentifier	 crpc
+	TokenNamePLUS	
prpc	TokenNameIdentifier	 prpc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
halfSurfaceScaleY	TokenNameIdentifier	 half Surface Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
crpc	TokenNameIdentifier	 crpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
crnc	TokenNameIdentifier	 crnc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
prpc	TokenNameIdentifier	 prpc
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
prcc	TokenNameIdentifier	 prcc
+	TokenNamePLUS	
prnc	TokenNameIdentifier	 prnc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
crpc	TokenNameIdentifier	 crpc
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
;	TokenNameSEMICOLON	
prpc	TokenNameIdentifier	 prpc
=	TokenNameEQUAL	
prcc	TokenNameIdentifier	 prcc
;	TokenNameSEMICOLON	
crcc	TokenNameIdentifier	 crcc
=	TokenNameEQUAL	
crnc	TokenNameIdentifier	 crnc
;	TokenNameSEMICOLON	
prcc	TokenNameIdentifier	 prcc
=	TokenNameEQUAL	
prnc	TokenNameIdentifier	 prnc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
<	TokenNameLESS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
==	TokenNameEQUAL_EQUAL	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcRect	TokenNameIdentifier	 src Rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Bottom right corner 	TokenNameCOMMENT_LINE	Bottom right corner 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
NRow	TokenNameIdentifier	 N Row
[	TokenNameLBRACKET	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
twoThirdSurfaceScaleX	TokenNameIdentifier	 two Third Surface Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
prcc	TokenNameIdentifier	 prcc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crpc	TokenNameIdentifier	 crpc
+	TokenNamePLUS	
prpc	TokenNameIdentifier	 prpc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
twoThirdSurfaceScaleY	TokenNameIdentifier	 two Third Surface Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
crcc	TokenNameIdentifier	 crcc
+	TokenNamePLUS	
crpc	TokenNameIdentifier	 crpc
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
prcc	TokenNameIdentifier	 prcc
+	TokenNamePLUS	
prpc	TokenNameIdentifier	 prpc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
crcc	TokenNameIdentifier	 crcc
*	TokenNameMULTIPLY	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
