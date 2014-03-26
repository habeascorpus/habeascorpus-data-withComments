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
ColorModel	TokenNameIdentifier	 Color Model
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
Light	TokenNameIdentifier	 Light
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
SpotLight	TokenNameIdentifier	 Spot Light
;	TokenNameSEMICOLON	
/** * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SpecularLightingRed.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SpecularLightingRed.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SpecularLightingRed	TokenNameIdentifier	 Specular Lighting Red
extends	TokenNameextends	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
{	TokenNameLBRACE	
/** * Specular lighting constant */	TokenNameCOMMENT_JAVADOC	 Specular lighting constant 
private	TokenNameprivate	
double	TokenNamedouble	
ks	TokenNameIdentifier	 ks
;	TokenNameSEMICOLON	
/** * Specular lighting exponent */	TokenNameCOMMENT_JAVADOC	 Specular lighting exponent 
private	TokenNameprivate	
double	TokenNamedouble	
specularExponent	TokenNameIdentifier	 specular Exponent
;	TokenNameSEMICOLON	
/** * Light used for specular lighting */	TokenNameCOMMENT_JAVADOC	 Light used for specular lighting 
private	TokenNameprivate	
Light	TokenNameIdentifier	 Light
light	TokenNameIdentifier	 light
;	TokenNameSEMICOLON	
/** * BumpMap source */	TokenNameCOMMENT_JAVADOC	 BumpMap source 
private	TokenNameprivate	
BumpMap	TokenNameIdentifier	 Bump Map
bumpMap	TokenNameIdentifier	 bump Map
;	TokenNameSEMICOLON	
/** * Device space to user space scale factors, along * each axis. */	TokenNameCOMMENT_JAVADOC	 Device space to user space scale factors, along each axis. 
private	TokenNameprivate	
double	TokenNamedouble	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
scaleY	TokenNameIdentifier	 scale Y
;	TokenNameSEMICOLON	
/** * LitRegion */	TokenNameCOMMENT_JAVADOC	 LitRegion 
private	TokenNameprivate	
Rectangle	TokenNameIdentifier	 Rectangle
litRegion	TokenNameIdentifier	 lit Region
;	TokenNameSEMICOLON	
/** * true if calculations should be performed in linear sRGB */	TokenNameCOMMENT_JAVADOC	 true if calculations should be performed in linear sRGB 
private	TokenNameprivate	
boolean	TokenNameboolean	
linear	TokenNameIdentifier	 linear
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SpecularLightingRed	TokenNameIdentifier	 Specular Lighting Red
(	TokenNameLPAREN	
double	TokenNamedouble	
ks	TokenNameIdentifier	 ks
,	TokenNameCOMMA	
double	TokenNamedouble	
specularExponent	TokenNameIdentifier	 specular Exponent
,	TokenNameCOMMA	
Light	TokenNameIdentifier	 Light
light	TokenNameIdentifier	 light
,	TokenNameCOMMA	
BumpMap	TokenNameIdentifier	 Bump Map
bumpMap	TokenNameIdentifier	 bump Map
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
litRegion	TokenNameIdentifier	 lit Region
,	TokenNameCOMMA	
double	TokenNamedouble	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
double	TokenNamedouble	
scaleY	TokenNameIdentifier	 scale Y
,	TokenNameCOMMA	
boolean	TokenNameboolean	
linear	TokenNameIdentifier	 linear
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ks	TokenNameIdentifier	 ks
=	TokenNameEQUAL	
ks	TokenNameIdentifier	 ks
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
specularExponent	TokenNameIdentifier	 specular Exponent
=	TokenNameEQUAL	
specularExponent	TokenNameIdentifier	 specular Exponent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
light	TokenNameIdentifier	 light
=	TokenNameEQUAL	
light	TokenNameIdentifier	 light
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bumpMap	TokenNameIdentifier	 bump Map
=	TokenNameEQUAL	
bumpMap	TokenNameIdentifier	 bump Map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
litRegion	TokenNameIdentifier	 lit Region
=	TokenNameEQUAL	
litRegion	TokenNameIdentifier	 lit Region
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
this	TokenNamethis	
.	TokenNameDOT	
linear	TokenNameIdentifier	 linear
=	TokenNameEQUAL	
linear	TokenNameIdentifier	 linear
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linear	TokenNameIdentifier	 linear
)	TokenNameRPAREN	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
Linear_sRGB_Unpre	TokenNameIdentifier	 Linear s RGB  Unpre
;	TokenNameSEMICOLON	
else	TokenNameelse	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
sRGB_Unpre	TokenNameIdentifier	 s RGB  Unpre
;	TokenNameSEMICOLON	
int	TokenNameint	
tw	TokenNameIdentifier	 tw
=	TokenNameEQUAL	
litRegion	TokenNameIdentifier	 lit Region
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
int	TokenNameint	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
litRegion	TokenNameIdentifier	 lit Region
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
int	TokenNameint	
defSz	TokenNameIdentifier	 def Sz
=	TokenNameEQUAL	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
.	TokenNameDOT	
getDefaultTileSize	TokenNameIdentifier	 get Default Tile Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tw	TokenNameIdentifier	 tw
>	TokenNameGREATER	
defSz	TokenNameIdentifier	 def Sz
)	TokenNameRPAREN	
tw	TokenNameIdentifier	 tw
=	TokenNameEQUAL	
defSz	TokenNameIdentifier	 def Sz
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
>	TokenNameGREATER	
defSz	TokenNameIdentifier	 def Sz
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
defSz	TokenNameIdentifier	 def Sz
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
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
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
litRegion	TokenNameIdentifier	 lit Region
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
litRegion	TokenNameIdentifier	 lit Region
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
litRegion	TokenNameIdentifier	 lit Region
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
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
copyToRaster	TokenNameIdentifier	 copy To Raster
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
genRect	TokenNameIdentifier	 gen Rect
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Copy variable on stack for faster access in tight loop 	TokenNameCOMMENT_LINE	Copy variable on stack for faster access in tight loop 
final	TokenNamefinal	
double	TokenNamedouble	
scaleX	TokenNameIdentifier	 scale X
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
scaleX	TokenNameIdentifier	 scale X
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
scaleY	TokenNameIdentifier	 scale Y
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
scaleY	TokenNameIdentifier	 scale Y
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lightColor	TokenNameIdentifier	 light Color
=	TokenNameEQUAL	
light	TokenNameIdentifier	 light
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
linear	TokenNameIdentifier	 linear
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
minX	TokenNameIdentifier	 min X
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
minY	TokenNameIdentifier	 min Y
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
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
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
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
minX	TokenNameIdentifier	 min X
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minY	TokenNameIdentifier	 min Y
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// int offset = db.getOffset(); 	TokenNameCOMMENT_LINE	int offset = db.getOffset(); 
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
adjust	TokenNameIdentifier	 adjust
=	TokenNameEQUAL	
scanStride	TokenNameIdentifier	 scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// x and y are in user space 	TokenNameCOMMENT_LINE	x and y are in user space 
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
scaleX	TokenNameIdentifier	 scale X
*	TokenNameMULTIPLY	
minX	TokenNameIdentifier	 min X
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
scaleY	TokenNameIdentifier	 scale Y
*	TokenNameMULTIPLY	
minY	TokenNameIdentifier	 min Y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
pixel	TokenNameIdentifier	 pixel
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
double	TokenNamedouble	
mult	TokenNameIdentifier	 mult
;	TokenNameSEMICOLON	
mult	TokenNameIdentifier	 mult
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lightColor	TokenNameIdentifier	 light Color
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
lightColor	TokenNameIdentifier	 light Color
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
lightColor	TokenNameIdentifier	 light Color
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
lightColor	TokenNameIdentifier	 light Color
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
mult	TokenNameIdentifier	 mult
=	TokenNameEQUAL	
(	TokenNameLPAREN	
mult	TokenNameIdentifier	 mult
>	TokenNameGREATER	
lightColor	TokenNameIdentifier	 light Color
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
mult	TokenNameIdentifier	 mult
:	TokenNameCOLON	
lightColor	TokenNameIdentifier	 light Color
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
mult	TokenNameIdentifier	 mult
;	TokenNameSEMICOLON	
pixel	TokenNameIdentifier	 pixel
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
lightColor	TokenNameIdentifier	 light Color
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
lightColor	TokenNameIdentifier	 light Color
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pixel	TokenNameIdentifier	 pixel
=	TokenNameEQUAL	
pixel	TokenNameIdentifier	 pixel
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
lightColor	TokenNameIdentifier	 light Color
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pixel	TokenNameIdentifier	 pixel
=	TokenNameEQUAL	
pixel	TokenNameIdentifier	 pixel
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
mult	TokenNameIdentifier	 mult
*=	TokenNameMULTIPLY_EQUAL	
255	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
ks	TokenNameIdentifier	 ks
;	TokenNameSEMICOLON	
// System.out.println("Pixel: 0x" + Integer.toHexString(pixel)); 	TokenNameCOMMENT_LINE	System.out.println("Pixel: 0x" + Integer.toHexString(pixel)); 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NA	TokenNameIdentifier	 NA
=	TokenNameEQUAL	
bumpMap	TokenNameIdentifier	 bump Map
.	TokenNameDOT	
getNormalArray	TokenNameIdentifier	 get Normal Array
(	TokenNameLPAREN	
minX	TokenNameIdentifier	 min X
,	TokenNameCOMMA	
minY	TokenNameIdentifier	 min Y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Entering Specular Lighting"); 	TokenNameCOMMENT_LINE	System.out.println("Entering Specular Lighting"); 
if	TokenNameif	
(	TokenNameLPAREN	
light	TokenNameIdentifier	 light
instanceof	TokenNameinstanceof	
SpotLight	TokenNameIdentifier	 Spot Light
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpotLight	TokenNameIdentifier	 Spot Light
slight	TokenNameIdentifier	 slight
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SpotLight	TokenNameIdentifier	 Spot Light
)	TokenNameRPAREN	
light	TokenNameIdentifier	 light
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
LA	TokenNameIdentifier	 LA
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Row: " + i); 	TokenNameCOMMENT_LINE	System.out.println("Row: " + i); 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NR	TokenNameIdentifier	 NR
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
slight	TokenNameIdentifier	 slight
.	TokenNameDOT	
getLightRow4	TokenNameIdentifier	 get Light Row4
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
scaleY	TokenNameIdentifier	 scale Y
,	TokenNameCOMMA	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
NR	TokenNameIdentifier	 NR
,	TokenNameCOMMA	
LA	TokenNameIdentifier	 LA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get Normal 	TokenNameCOMMENT_LINE	Get Normal 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
NR	TokenNameIdentifier	 NR
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get Light Vector 	TokenNameCOMMENT_LINE	Get Light Vector 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
LA	TokenNameIdentifier	 LA
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vs	TokenNameIdentifier	 vs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dot	TokenNameIdentifier	 dot
=	TokenNameEQUAL	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
vs	TokenNameIdentifier	 vs
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
dot	TokenNameIdentifier	 dot
/	TokenNameDIVIDE	
norm	TokenNameIdentifier	 norm
,	TokenNameCOMMA	
specularExponent	TokenNameIdentifier	 specular Exponent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
mult	TokenNameIdentifier	 mult
*	TokenNameMULTIPLY	
vs	TokenNameIdentifier	 vs
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
|	TokenNameOR	
pixel	TokenNameIdentifier	 pixel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
light	TokenNameIdentifier	 light
.	TokenNameDOT	
isConstant	TokenNameIdentifier	 is Constant
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
LA	TokenNameIdentifier	 LA
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Row: " + i); 	TokenNameCOMMENT_LINE	System.out.println("Row: " + i); 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NR	TokenNameIdentifier	 NR
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
light	TokenNameIdentifier	 light
.	TokenNameDOT	
getLightRow	TokenNameIdentifier	 get Light Row
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
scaleY	TokenNameIdentifier	 scale Y
,	TokenNameCOMMA	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
NR	TokenNameIdentifier	 NR
,	TokenNameCOMMA	
LA	TokenNameIdentifier	 LA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get Normal 	TokenNameCOMMENT_LINE	Get Normal 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
NR	TokenNameIdentifier	 NR
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get Light Vector 	TokenNameCOMMENT_LINE	Get Light Vector 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
LA	TokenNameIdentifier	 LA
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dot	TokenNameIdentifier	 dot
=	TokenNameEQUAL	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// vs = vs/norm; 	TokenNameCOMMENT_LINE	vs = vs/norm; 
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
dot	TokenNameIdentifier	 dot
/	TokenNameDIVIDE	
norm	TokenNameIdentifier	 norm
,	TokenNameCOMMA	
specularExponent	TokenNameIdentifier	 specular Exponent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
mult	TokenNameIdentifier	 mult
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
|	TokenNameOR	
pixel	TokenNameIdentifier	 pixel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Get constant light vector 	TokenNameCOMMENT_LINE	Get constant light vector 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
light	TokenNameIdentifier	 light
.	TokenNameDOT	
getLight	TokenNameIdentifier	 get Light
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute Half-way vector 	TokenNameCOMMENT_LINE	Compute Half-way vector 
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/=	TokenNameDIVIDE_EQUAL	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/=	TokenNameDIVIDE_EQUAL	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/=	TokenNameDIVIDE_EQUAL	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NR	TokenNameIdentifier	 NR
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get Normal 	TokenNameCOMMENT_LINE	Get Normal 
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
NR	TokenNameIdentifier	 NR
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
mult	TokenNameIdentifier	 mult
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
N	TokenNameIdentifier	 N
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
specularExponent	TokenNameIdentifier	 specular Exponent
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
|	TokenNameOR	
pixel	TokenNameIdentifier	 pixel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("Exiting Specular Lighting"); 	TokenNameCOMMENT_LINE	System.out.println("Exiting Specular Lighting"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
