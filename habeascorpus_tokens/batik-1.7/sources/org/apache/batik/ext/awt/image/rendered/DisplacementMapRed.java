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
Raster	TokenNameIdentifier	 Raster
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
ARGBChannel	TokenNameIdentifier	 ARGB Channel
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
PadMode	TokenNameIdentifier	 Pad Mode
;	TokenNameSEMICOLON	
/** * This implementation of RenderableImage will render its input * GraphicsNode on demand for tiles. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: DisplacementMapRed.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This implementation of RenderableImage will render its input GraphicsNode on demand for tiles. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: DisplacementMapRed.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DisplacementMapRed	TokenNameIdentifier	 Displacement Map Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
// Use these to control timing and Nearest Neighbot vs. Bilinear Interp. 	TokenNameCOMMENT_LINE	Use these to control timing and Nearest Neighbot vs. Bilinear Interp. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
TIME	TokenNameIdentifier	 TIME
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
USE_NN	TokenNameIdentifier	 USE  NN
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The displacement scale factor along the x axis */	TokenNameCOMMENT_JAVADOC	 The displacement scale factor along the x axis 
private	TokenNameprivate	
float	TokenNamefloat	
scaleX	TokenNameIdentifier	 scale X
;	TokenNameSEMICOLON	
/** * The displacement scale factor along the y axis */	TokenNameCOMMENT_JAVADOC	 The displacement scale factor along the y axis 
private	TokenNameprivate	
float	TokenNamefloat	
scaleY	TokenNameIdentifier	 scale Y
;	TokenNameSEMICOLON	
/** * The channel type of the operation on X axis */	TokenNameCOMMENT_JAVADOC	 The channel type of the operation on X axis 
private	TokenNameprivate	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
xChannel	TokenNameIdentifier	 x Channel
;	TokenNameSEMICOLON	
/** * The channel type of the operation on Y axis */	TokenNameCOMMENT_JAVADOC	 The channel type of the operation on Y axis 
private	TokenNameprivate	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
yChannel	TokenNameIdentifier	 y Channel
;	TokenNameSEMICOLON	
/** * The image to distort. */	TokenNameCOMMENT_JAVADOC	 The image to distort. 
CachableRed	TokenNameIdentifier	 Cachable Red
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
/** * The offset image (displacement map). */	TokenNameCOMMENT_JAVADOC	 The offset image (displacement map). 
CachableRed	TokenNameIdentifier	 Cachable Red
offsets	TokenNameIdentifier	 offsets
;	TokenNameSEMICOLON	
/** * The maximum possible offsets in x and y */	TokenNameCOMMENT_JAVADOC	 The maximum possible offsets in x and y 
int	TokenNameint	
maxOffX	TokenNameIdentifier	 max Off X
,	TokenNameCOMMA	
maxOffY	TokenNameIdentifier	 max Off Y
;	TokenNameSEMICOLON	
/** * The set of rendering hints */	TokenNameCOMMENT_JAVADOC	 The set of rendering hints 
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
;	TokenNameSEMICOLON	
/** * Computed tile Offsets Soft referencces to TileOffsets instances... */	TokenNameCOMMENT_JAVADOC	 Computed tile Offsets Soft referencces to TileOffsets instances... 
TileOffsets	TokenNameIdentifier	 Tile Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xOffsets	TokenNameIdentifier	 x Offsets
;	TokenNameSEMICOLON	
TileOffsets	TokenNameIdentifier	 Tile Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yOffsets	TokenNameIdentifier	 y Offsets
;	TokenNameSEMICOLON	
static	TokenNamestatic	
class	TokenNameclass	
TileOffsets	TokenNameIdentifier	 Tile Offsets
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tile	TokenNameIdentifier	 tile
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
TileOffsets	TokenNameIdentifier	 Tile Offsets
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
int	TokenNameint	
stride	TokenNameIdentifier	 stride
,	TokenNameCOMMA	
int	TokenNameint	
loc	TokenNameIdentifier	 loc
,	TokenNameCOMMA	
int	TokenNameint	
endLoc	TokenNameIdentifier	 end Loc
,	TokenNameCOMMA	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
int	TokenNameint	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
int	TokenNameint	
endTile	TokenNameIdentifier	 end Tile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
==	TokenNameEQUAL_EQUAL	
endTile	TokenNameIdentifier	 end Tile
)	TokenNameRPAREN	
endLoc	TokenNameIdentifier	 end Loc
-=	TokenNameMINUS_EQUAL	
slop	TokenNameIdentifier	 slop
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
this	TokenNamethis	
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tile	TokenNameIdentifier	 tile
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
*	TokenNameMULTIPLY	
stride	TokenNameIdentifier	 stride
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loc	TokenNameIdentifier	 loc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
==	TokenNameEQUAL_EQUAL	
endLoc	TokenNameIdentifier	 end Loc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tile	TokenNameIdentifier	 tile
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
==	TokenNameEQUAL_EQUAL	
endTile	TokenNameIdentifier	 end Tile
)	TokenNameRPAREN	
endLoc	TokenNameIdentifier	 end Loc
-=	TokenNameMINUS_EQUAL	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param image the image to distort * @param offsets the displacement map * @param xChannel defines the channel of off whose values will be * on X-axis operation * @param yChannel defines the channel of off whose values will be * @param scaleX defines the scale factor of the filter operation * on the X axis. * @param scaleY defines the scale factor of the filter operation * on the Y axis * @param rh the rendering hints */	TokenNameCOMMENT_JAVADOC	 @param image the image to distort @param offsets the displacement map @param xChannel defines the channel of off whose values will be on X-axis operation @param yChannel defines the channel of off whose values will be @param scaleX defines the scale factor of the filter operation on the X axis. @param scaleY defines the scale factor of the filter operation on the Y axis @param rh the rendering hints 
public	TokenNamepublic	
DisplacementMapRed	TokenNameIdentifier	 Displacement Map Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
CachableRed	TokenNameIdentifier	 Cachable Red
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
xChannel	TokenNameIdentifier	 x Channel
,	TokenNameCOMMA	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
yChannel	TokenNameIdentifier	 y Channel
,	TokenNameCOMMA	
float	TokenNamefloat	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
float	TokenNamefloat	
scaleY	TokenNameIdentifier	 scale Y
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xChannel	TokenNameIdentifier	 x Channel
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Must provide xChannel"	TokenNameStringLiteral	Must provide xChannel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
yChannel	TokenNameIdentifier	 y Channel
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Must provide yChannel"	TokenNameStringLiteral	Must provide yChannel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
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
xChannel	TokenNameIdentifier	 x Channel
=	TokenNameEQUAL	
xChannel	TokenNameIdentifier	 x Channel
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
yChannel	TokenNameIdentifier	 y Channel
=	TokenNameEQUAL	
yChannel	TokenNameIdentifier	 y Channel
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
rh	TokenNameIdentifier	 rh
;	TokenNameSEMICOLON	
maxOffX	TokenNameIdentifier	 max Off X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
scaleX	TokenNameIdentifier	 scale X
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxOffY	TokenNameIdentifier	 max Off Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
scaleY	TokenNameIdentifier	 scale Y
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-=	TokenNameMINUS_EQUAL	
maxOffX	TokenNameIdentifier	 max Off X
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
maxOffX	TokenNameIdentifier	 max Off X
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-=	TokenNameMINUS_EQUAL	
maxOffY	TokenNameIdentifier	 max Off Y
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
maxOffY	TokenNameIdentifier	 max Off Y
;	TokenNameSEMICOLON	
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
new	TokenNamenew	
PadRed	TokenNameIdentifier	 Pad Red
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
PadMode	TokenNameIdentifier	 Pad Mode
.	TokenNameDOT	
ZERO_PAD	TokenNameIdentifier	 ZERO  PAD
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
new	TokenNamenew	
TileCacheRed	TokenNameIdentifier	 Tile Cache Red
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
USE_NN	TokenNameIdentifier	 USE  NN
)	TokenNameRPAREN	
// For Bilinear we need alpha premult. 	TokenNameCOMMENT_LINE	For Bilinear we need alpha premult. 
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceColorModel	TokenNameIdentifier	 coerce Color Model
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xOffsets	TokenNameIdentifier	 x Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
TileOffsets	TokenNameIdentifier	 Tile Offsets
[	TokenNameLBRACKET	
getNumXTiles	TokenNameIdentifier	 get Num X Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yOffsets	TokenNameIdentifier	 y Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
TileOffsets	TokenNameIdentifier	 Tile Offsets
[	TokenNameLBRACKET	
getNumYTiles	TokenNameIdentifier	 get Num Y Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
Raster	TokenNameIdentifier	 Raster
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
int	TokenNameint	
tileX	TokenNameIdentifier	 tile X
,	TokenNameCOMMA	
int	TokenNameint	
tileY	TokenNameIdentifier	 tile Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WritableRaster	TokenNameIdentifier	 Writable Raster
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
makeTile	TokenNameIdentifier	 make Tile
(	TokenNameLPAREN	
tileX	TokenNameIdentifier	 tile X
,	TokenNameCOMMA	
tileY	TokenNameIdentifier	 tile Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
srcR	TokenNameIdentifier	 src R
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get Raster from offsetes 	TokenNameCOMMENT_LINE	Get Raster from offsetes 
Raster	TokenNameIdentifier	 Raster
mapRas	TokenNameIdentifier	 map Ras
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
mapCM	TokenNameIdentifier	 map CM
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ensure map isn't pre-multiplied. 	TokenNameCOMMENT_LINE	ensure map isn't pre-multiplied. 
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
)	TokenNameRPAREN	
mapRas	TokenNameIdentifier	 map Ras
,	TokenNameCOMMA	
mapCM	TokenNameIdentifier	 map CM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TileOffsets	TokenNameIdentifier	 Tile Offsets
xinfo	TokenNameIdentifier	 xinfo
=	TokenNameEQUAL	
getXOffsets	TokenNameIdentifier	 get X Offsets
(	TokenNameLPAREN	
tileX	TokenNameIdentifier	 tile X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TileOffsets	TokenNameIdentifier	 Tile Offsets
yinfo	TokenNameIdentifier	 yinfo
=	TokenNameEQUAL	
getYOffsets	TokenNameIdentifier	 get Y Offsets
(	TokenNameLPAREN	
tileY	TokenNameIdentifier	 tile Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
USE_NN	TokenNameIdentifier	 USE  NN
)	TokenNameRPAREN	
filterNN	TokenNameIdentifier	 filter NN
(	TokenNameLPAREN	
mapRas	TokenNameIdentifier	 map Ras
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
xinfo	TokenNameIdentifier	 xinfo
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
xinfo	TokenNameIdentifier	 xinfo
.	TokenNameDOT	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
yinfo	TokenNameIdentifier	 yinfo
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
yinfo	TokenNameIdentifier	 yinfo
.	TokenNameDOT	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
filterBL	TokenNameIdentifier	 filter BL
(	TokenNameLPAREN	
mapRas	TokenNameIdentifier	 map Ras
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
xinfo	TokenNameIdentifier	 xinfo
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
xinfo	TokenNameIdentifier	 xinfo
.	TokenNameDOT	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
yinfo	TokenNameIdentifier	 yinfo
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
yinfo	TokenNameIdentifier	 yinfo
.	TokenNameDOT	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
filterBLPre	TokenNameIdentifier	 filter BL Pre
(	TokenNameLPAREN	
mapRas	TokenNameIdentifier	 map Ras
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
xinfo	TokenNameIdentifier	 xinfo
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
xinfo	TokenNameIdentifier	 xinfo
.	TokenNameDOT	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
yinfo	TokenNameIdentifier	 yinfo
.	TokenNameDOT	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
yinfo	TokenNameIdentifier	 yinfo
.	TokenNameDOT	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TileOffsets	TokenNameIdentifier	 Tile Offsets
getXOffsets	TokenNameIdentifier	 get X Offsets
(	TokenNameLPAREN	
int	TokenNameint	
xTile	TokenNameIdentifier	 x Tile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TileOffsets	TokenNameIdentifier	 Tile Offsets
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
xOffsets	TokenNameIdentifier	 x Offsets
[	TokenNameLBRACKET	
xTile	TokenNameIdentifier	 x Tile
-	TokenNameMINUS	
getMinTileX	TokenNameIdentifier	 get Min Tile X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
sppsm	TokenNameIdentifier	 sppsm
;	TokenNameSEMICOLON	
sppsm	TokenNameIdentifier	 sppsm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tw	TokenNameIdentifier	 tw
=	TokenNameEQUAL	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The span we need to cover in the input image. 	TokenNameCOMMENT_LINE	The span we need to cover in the input image. 
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
tw	TokenNameIdentifier	 tw
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
maxOffX	TokenNameIdentifier	 max Off X
;	TokenNameSEMICOLON	
// The start and end X in image's tile coordinate system... 	TokenNameCOMMENT_LINE	The start and end X in image's tile coordinate system... 
int	TokenNameint	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
xTile	TokenNameIdentifier	 x Tile
*	TokenNameMULTIPLY	
tw	TokenNameIdentifier	 tw
-	TokenNameMINUS	
maxOffX	TokenNameIdentifier	 max Off X
-	TokenNameMINUS	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
tw	TokenNameIdentifier	 tw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endTile	TokenNameIdentifier	 end Tile
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
tw	TokenNameIdentifier	 tw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
x0	TokenNameIdentifier	 x0
-	TokenNameMINUS	
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
*	TokenNameMULTIPLY	
tw	TokenNameIdentifier	 tw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endLoc	TokenNameIdentifier	 end Loc
=	TokenNameEQUAL	
tw	TokenNameIdentifier	 tw
;	TokenNameSEMICOLON	
// Amount not used from right edge tile 	TokenNameCOMMENT_LINE	Amount not used from right edge tile 
int	TokenNameint	
slop	TokenNameIdentifier	 slop
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
endTile	TokenNameIdentifier	 end Tile
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tw	TokenNameIdentifier	 tw
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
x1	TokenNameIdentifier	 x1
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
TileOffsets	TokenNameIdentifier	 Tile Offsets
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
,	TokenNameCOMMA	
endLoc	TokenNameIdentifier	 end Loc
,	TokenNameCOMMA	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
endTile	TokenNameIdentifier	 end Tile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xOffsets	TokenNameIdentifier	 x Offsets
[	TokenNameLBRACKET	
xTile	TokenNameIdentifier	 x Tile
-	TokenNameMINUS	
getMinTileX	TokenNameIdentifier	 get Min Tile X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TileOffsets	TokenNameIdentifier	 Tile Offsets
getYOffsets	TokenNameIdentifier	 get Y Offsets
(	TokenNameLPAREN	
int	TokenNameint	
yTile	TokenNameIdentifier	 y Tile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TileOffsets	TokenNameIdentifier	 Tile Offsets
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
yOffsets	TokenNameIdentifier	 y Offsets
[	TokenNameLBRACKET	
yTile	TokenNameIdentifier	 y Tile
-	TokenNameMINUS	
getMinTileY	TokenNameIdentifier	 get Min Tile Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
sppsm	TokenNameIdentifier	 sppsm
;	TokenNameSEMICOLON	
sppsm	TokenNameIdentifier	 sppsm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
stride	TokenNameIdentifier	 stride
=	TokenNameEQUAL	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The span we need to cover in the input image. 	TokenNameCOMMENT_LINE	The span we need to cover in the input image. 
int	TokenNameint	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
th	TokenNameIdentifier	 th
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
maxOffY	TokenNameIdentifier	 max Off Y
;	TokenNameSEMICOLON	
// The start and end Y in image's tile coordinate system... 	TokenNameCOMMENT_LINE	The start and end Y in image's tile coordinate system... 
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
yTile	TokenNameIdentifier	 y Tile
*	TokenNameMULTIPLY	
th	TokenNameIdentifier	 th
-	TokenNameMINUS	
maxOffY	TokenNameIdentifier	 max Off Y
-	TokenNameMINUS	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
y0	TokenNameIdentifier	 y0
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endTile	TokenNameIdentifier	 end Tile
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
-	TokenNameMINUS	
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
*	TokenNameMULTIPLY	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endLoc	TokenNameIdentifier	 end Loc
=	TokenNameEQUAL	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
// Amount not used from bottom edge tile 	TokenNameCOMMENT_LINE	Amount not used from bottom edge tile 
int	TokenNameint	
slop	TokenNameIdentifier	 slop
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
endTile	TokenNameIdentifier	 end Tile
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
th	TokenNameIdentifier	 th
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
TileOffsets	TokenNameIdentifier	 Tile Offsets
(	TokenNameLPAREN	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stride	TokenNameIdentifier	 stride
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
,	TokenNameCOMMA	
endLoc	TokenNameIdentifier	 end Loc
,	TokenNameCOMMA	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
endTile	TokenNameIdentifier	 end Tile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yOffsets	TokenNameIdentifier	 y Offsets
[	TokenNameLBRACKET	
yTile	TokenNameIdentifier	 y Tile
-	TokenNameMINUS	
getMinTileY	TokenNameIdentifier	 get Min Tile Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
filterBL	TokenNameIdentifier	 filter BL
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xTile	TokenNameIdentifier	 x Tile
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xOff	TokenNameIdentifier	 x Off
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yTile	TokenNameIdentifier	 y Tile
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
xStart	TokenNameIdentifier	 x Start
=	TokenNameEQUAL	
maxOffX	TokenNameIdentifier	 max Off X
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yStart	TokenNameIdentifier	 y Start
=	TokenNameEQUAL	
maxOffY	TokenNameIdentifier	 max Off Y
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
xEnd	TokenNameIdentifier	 x End
=	TokenNameEQUAL	
xStart	TokenNameIdentifier	 x Start
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yEnd	TokenNameIdentifier	 y End
=	TokenNameEQUAL	
yStart	TokenNameIdentifier	 y Start
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
// Access the integer buffer for each image. 	TokenNameCOMMENT_LINE	Access the integer buffer for each image. 
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dstDB	TokenNameIdentifier	 dst DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
offDB	TokenNameIdentifier	 off DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Offset defines where in the stack the real data begin 	TokenNameCOMMENT_LINE	Offset defines where in the stack the real data begin 
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
dstSPPSM	TokenNameIdentifier	 dst SPPSM
,	TokenNameCOMMA	
offSPPSM	TokenNameIdentifier	 off SPPSM
;	TokenNameSEMICOLON	
dstSPPSM	TokenNameIdentifier	 dst SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstOff	TokenNameIdentifier	 dst Off
=	TokenNameEQUAL	
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
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offSPPSM	TokenNameIdentifier	 off SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offOff	TokenNameIdentifier	 off Off
=	TokenNameEQUAL	
offDB	TokenNameIdentifier	 off DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
offSPPSM	TokenNameIdentifier	 off SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Stride is the distance between two consecutive column elements, 	TokenNameCOMMENT_LINE	Stride is the distance between two consecutive column elements, 
// in the one-dimention dataBuffer 	TokenNameCOMMENT_LINE	in the one-dimention dataBuffer 
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
final	TokenNamefinal	
int	TokenNameint	
offScanStride	TokenNameIdentifier	 off Scan Stride
=	TokenNameEQUAL	
offSPPSM	TokenNameIdentifier	 off SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstAdjust	TokenNameIdentifier	 dst Adjust
=	TokenNameEQUAL	
dstScanStride	TokenNameIdentifier	 dst Scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offAdjust	TokenNameIdentifier	 off Adjust
=	TokenNameEQUAL	
offScanStride	TokenNameIdentifier	 off Scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// Access the pixel value array 	TokenNameCOMMENT_LINE	Access the pixel value array 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPixels	TokenNameIdentifier	 dst Pixels
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
offPixels	TokenNameIdentifier	 off Pixels
=	TokenNameEQUAL	
offDB	TokenNameIdentifier	 off DB
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Below is the number of shifts for each axis 	TokenNameCOMMENT_LINE	Below is the number of shifts for each axis 
// e.g when xChannel is ALPHA, the pixel needs 	TokenNameCOMMENT_LINE	e.g when xChannel is ALPHA, the pixel needs 
// to be shifted 24, RED 16, GREEN 8 and BLUE 0 	TokenNameCOMMENT_LINE	to be shifted 24, RED 16, GREEN 8 and BLUE 0 
final	TokenNamefinal	
int	TokenNameint	
xShift	TokenNameIdentifier	 x Shift
=	TokenNameEQUAL	
xChannel	TokenNameIdentifier	 x Channel
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yShift	TokenNameIdentifier	 y Shift
=	TokenNameEQUAL	
yChannel	TokenNameIdentifier	 y Channel
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The pointer of img and dst indicating where the pixel values are 	TokenNameCOMMENT_LINE	The pointer of img and dst indicating where the pixel values are 
int	TokenNameint	
dp	TokenNameIdentifier	 dp
=	TokenNameEQUAL	
dstOff	TokenNameIdentifier	 dst Off
,	TokenNameCOMMA	
ip	TokenNameIdentifier	 ip
=	TokenNameEQUAL	
offOff	TokenNameIdentifier	 off Off
;	TokenNameSEMICOLON	
// Fixed point representation of scale factor. 	TokenNameCOMMENT_LINE	Fixed point representation of scale factor. 
final	TokenNamefinal	
int	TokenNameint	
fpScaleX	TokenNameIdentifier	 fp Scale X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
scaleX	TokenNameIdentifier	 scale X
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpAdjX	TokenNameIdentifier	 fp Adj X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
-	TokenNameMINUS	
127.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
fpScaleX	TokenNameIdentifier	 fp Scale X
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpScaleY	TokenNameIdentifier	 fp Scale Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
scaleY	TokenNameIdentifier	 scale Y
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpAdjY	TokenNameIdentifier	 fp Adj Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
-	TokenNameMINUS	
127.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
fpScaleY	TokenNameIdentifier	 fp Scale Y
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pel00	TokenNameIdentifier	 pel00
,	TokenNameCOMMA	
pel01	TokenNameIdentifier	 pel01
,	TokenNameCOMMA	
pel10	TokenNameIdentifier	 pel10
,	TokenNameCOMMA	
pel11	TokenNameIdentifier	 pel11
,	TokenNameCOMMA	
xFrac	TokenNameIdentifier	 x Frac
,	TokenNameCOMMA	
yFrac	TokenNameIdentifier	 y Frac
,	TokenNameCOMMA	
newPel	TokenNameIdentifier	 new Pel
;	TokenNameSEMICOLON	
int	TokenNameint	
sp0	TokenNameIdentifier	 sp0
,	TokenNameCOMMA	
sp1	TokenNameIdentifier	 sp1
,	TokenNameCOMMA	
pel0	TokenNameIdentifier	 pel0
,	TokenNameCOMMA	
pel1	TokenNameIdentifier	 pel1
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
,	TokenNameCOMMA	
xDisplace	TokenNameIdentifier	 x Displace
,	TokenNameCOMMA	
yDisplace	TokenNameIdentifier	 y Displace
,	TokenNameCOMMA	
dPel	TokenNameIdentifier	 d Pel
;	TokenNameSEMICOLON	
int	TokenNameint	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
=	TokenNameEQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
xt1	TokenNameIdentifier	 xt1
,	TokenNameCOMMA	
yt1	TokenNameIdentifier	 yt1
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
yStart	TokenNameIdentifier	 y Start
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
yEnd	TokenNameIdentifier	 y End
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
xStart	TokenNameIdentifier	 x Start
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
ip	TokenNameIdentifier	 ip
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dPel	TokenNameIdentifier	 d Pel
=	TokenNameEQUAL	
offPixels	TokenNameIdentifier	 off Pixels
[	TokenNameLBRACKET	
ip	TokenNameIdentifier	 ip
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xDisplace	TokenNameIdentifier	 x Displace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fpScaleX	TokenNameIdentifier	 fp Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dPel	TokenNameIdentifier	 d Pel
>>	TokenNameRIGHT_SHIFT	
xShift	TokenNameIdentifier	 x Shift
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
fpAdjX	TokenNameIdentifier	 fp Adj X
;	TokenNameSEMICOLON	
yDisplace	TokenNameIdentifier	 y Displace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fpScaleY	TokenNameIdentifier	 fp Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dPel	TokenNameIdentifier	 d Pel
>>	TokenNameRIGHT_SHIFT	
yShift	TokenNameIdentifier	 y Shift
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
fpAdjY	TokenNameIdentifier	 fp Adj Y
;	TokenNameSEMICOLON	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
xDisplace	TokenNameIdentifier	 x Displace
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
(	TokenNameLPAREN	
yDisplace	TokenNameIdentifier	 y Displace
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
!=	TokenNameNOT_EQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
yt	TokenNameIdentifier	 yt
!=	TokenNameNOT_EQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yt	TokenNameIdentifier	 yt
=	TokenNameEQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pel00	TokenNameIdentifier	 pel00
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xt1	TokenNameIdentifier	 xt1
=	TokenNameEQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yt1	TokenNameIdentifier	 yt1
=	TokenNameEQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
yt	TokenNameIdentifier	 yt
==	TokenNameEQUAL_EQUAL	
yt1	TokenNameIdentifier	 yt1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Same tile vertically, check across... 	TokenNameCOMMENT_LINE	Same tile vertically, check across... 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
==	TokenNameEQUAL_EQUAL	
xt1	TokenNameIdentifier	 xt1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All from same tile.. 	TokenNameCOMMENT_LINE	All from same tile.. 
pel10	TokenNameIdentifier	 pel10
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel01	TokenNameIdentifier	 pel01
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel11	TokenNameIdentifier	 pel11
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Different tile horizontally... 	TokenNameCOMMENT_LINE	Different tile horizontally... 
pel01	TokenNameIdentifier	 pel01
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt1	TokenNameIdentifier	 xt1
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel10	TokenNameIdentifier	 pel10
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel11	TokenNameIdentifier	 pel11
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xt1	TokenNameIdentifier	 xt1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Steped into next tile down, check across... 	TokenNameCOMMENT_LINE	Steped into next tile down, check across... 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
==	TokenNameEQUAL_EQUAL	
xt1	TokenNameIdentifier	 xt1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Different tile horizontally. 	TokenNameCOMMENT_LINE	Different tile horizontally. 
pel10	TokenNameIdentifier	 pel10
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
yt1	TokenNameIdentifier	 yt1
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel01	TokenNameIdentifier	 pel01
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel11	TokenNameIdentifier	 pel11
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yt	TokenNameIdentifier	 yt
=	TokenNameEQUAL	
yt1	TokenNameIdentifier	 yt1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Ugg we are at the 4way intersection of tiles... 	TokenNameCOMMENT_LINE	Ugg we are at the 4way intersection of tiles... 
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
yt1	TokenNameIdentifier	 yt1
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel01	TokenNameIdentifier	 pel01
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt1	TokenNameIdentifier	 xt1
,	TokenNameCOMMA	
yt1	TokenNameIdentifier	 yt1
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel11	TokenNameIdentifier	 pel11
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt1	TokenNameIdentifier	 xt1
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel10	TokenNameIdentifier	 pel10
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xt1	TokenNameIdentifier	 xt1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
xFrac	TokenNameIdentifier	 x Frac
=	TokenNameEQUAL	
xDisplace	TokenNameIdentifier	 x Displace
&	TokenNameAND	
0x7FFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
yFrac	TokenNameIdentifier	 y Frac
=	TokenNameEQUAL	
yDisplace	TokenNameIdentifier	 y Displace
&	TokenNameAND	
0x7FFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Combine the alpha channels. 	TokenNameCOMMENT_LINE	Combine the alpha channels. 
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel00	TokenNameIdentifier	 pel00
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel10	TokenNameIdentifier	 pel10
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel0	TokenNameIdentifier	 pel0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel01	TokenNameIdentifier	 pel01
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel11	TokenNameIdentifier	 pel11
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel1	TokenNameIdentifier	 pel1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newPel	TokenNameIdentifier	 new Pel
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel0	TokenNameIdentifier	 pel0
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pel1	TokenNameIdentifier	 pel1
-	TokenNameMINUS	
pel0	TokenNameIdentifier	 pel0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
yFrac	TokenNameIdentifier	 y Frac
+	TokenNamePLUS	
0x00400000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7F800000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Combine the red channels. 	TokenNameCOMMENT_LINE	Combine the red channels. 
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel00	TokenNameIdentifier	 pel00
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel10	TokenNameIdentifier	 pel10
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel0	TokenNameIdentifier	 pel0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel01	TokenNameIdentifier	 pel01
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel11	TokenNameIdentifier	 pel11
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel1	TokenNameIdentifier	 pel1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newPel	TokenNameIdentifier	 new Pel
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel0	TokenNameIdentifier	 pel0
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pel1	TokenNameIdentifier	 pel1
-	TokenNameMINUS	
pel0	TokenNameIdentifier	 pel0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
yFrac	TokenNameIdentifier	 y Frac
+	TokenNamePLUS	
0x00400000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7F800000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Combine the green channels. 	TokenNameCOMMENT_LINE	Combine the green channels. 
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel00	TokenNameIdentifier	 pel00
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel10	TokenNameIdentifier	 pel10
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel0	TokenNameIdentifier	 pel0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel01	TokenNameIdentifier	 pel01
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel11	TokenNameIdentifier	 pel11
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel1	TokenNameIdentifier	 pel1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newPel	TokenNameIdentifier	 new Pel
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel0	TokenNameIdentifier	 pel0
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pel1	TokenNameIdentifier	 pel1
-	TokenNameMINUS	
pel0	TokenNameIdentifier	 pel0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
yFrac	TokenNameIdentifier	 y Frac
+	TokenNamePLUS	
0x00400000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7F800000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Combine the blue channels. 	TokenNameCOMMENT_LINE	Combine the blue channels. 
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel00	TokenNameIdentifier	 pel00
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel10	TokenNameIdentifier	 pel10
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel0	TokenNameIdentifier	 pel0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel01	TokenNameIdentifier	 pel01
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel11	TokenNameIdentifier	 pel11
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel1	TokenNameIdentifier	 pel1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newPel	TokenNameIdentifier	 new Pel
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel0	TokenNameIdentifier	 pel0
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pel1	TokenNameIdentifier	 pel1
-	TokenNameMINUS	
pel0	TokenNameIdentifier	 pel0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
yFrac	TokenNameIdentifier	 y Frac
+	TokenNamePLUS	
0x00400000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7F800000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstPixels	TokenNameIdentifier	 dst Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newPel	TokenNameIdentifier	 new Pel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstAdjust	TokenNameIdentifier	 dst Adjust
;	TokenNameSEMICOLON	
ip	TokenNameIdentifier	 ip
+=	TokenNamePLUS_EQUAL	
offAdjust	TokenNameIdentifier	 off Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
TIME	TokenNameIdentifier	 TIME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Time: "	TokenNameStringLiteral	Time: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of the filter() method for Raster 	TokenNameCOMMENT_LINE	end of the filter() method for Raster 
public	TokenNamepublic	
void	TokenNamevoid	
filterBLPre	TokenNameIdentifier	 filter BL Pre
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xTile	TokenNameIdentifier	 x Tile
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xOff	TokenNameIdentifier	 x Off
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yTile	TokenNameIdentifier	 y Tile
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
xStart	TokenNameIdentifier	 x Start
=	TokenNameEQUAL	
maxOffX	TokenNameIdentifier	 max Off X
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yStart	TokenNameIdentifier	 y Start
=	TokenNameEQUAL	
maxOffY	TokenNameIdentifier	 max Off Y
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
xEnd	TokenNameIdentifier	 x End
=	TokenNameEQUAL	
xStart	TokenNameIdentifier	 x Start
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yEnd	TokenNameIdentifier	 y End
=	TokenNameEQUAL	
yStart	TokenNameIdentifier	 y Start
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
// Access the integer buffer for each image. 	TokenNameCOMMENT_LINE	Access the integer buffer for each image. 
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dstDB	TokenNameIdentifier	 dst DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
offDB	TokenNameIdentifier	 off DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Offset defines where in the stack the real data begin 	TokenNameCOMMENT_LINE	Offset defines where in the stack the real data begin 
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
dstSPPSM	TokenNameIdentifier	 dst SPPSM
,	TokenNameCOMMA	
offSPPSM	TokenNameIdentifier	 off SPPSM
;	TokenNameSEMICOLON	
dstSPPSM	TokenNameIdentifier	 dst SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstOff	TokenNameIdentifier	 dst Off
=	TokenNameEQUAL	
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
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offSPPSM	TokenNameIdentifier	 off SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offOff	TokenNameIdentifier	 off Off
=	TokenNameEQUAL	
offDB	TokenNameIdentifier	 off DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
offSPPSM	TokenNameIdentifier	 off SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Stride is the distance between two consecutive column elements, 	TokenNameCOMMENT_LINE	Stride is the distance between two consecutive column elements, 
// in the one-dimention dataBuffer 	TokenNameCOMMENT_LINE	in the one-dimention dataBuffer 
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
final	TokenNamefinal	
int	TokenNameint	
offScanStride	TokenNameIdentifier	 off Scan Stride
=	TokenNameEQUAL	
offSPPSM	TokenNameIdentifier	 off SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstAdjust	TokenNameIdentifier	 dst Adjust
=	TokenNameEQUAL	
dstScanStride	TokenNameIdentifier	 dst Scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offAdjust	TokenNameIdentifier	 off Adjust
=	TokenNameEQUAL	
offScanStride	TokenNameIdentifier	 off Scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// Access the pixel value array 	TokenNameCOMMENT_LINE	Access the pixel value array 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPixels	TokenNameIdentifier	 dst Pixels
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
offPixels	TokenNameIdentifier	 off Pixels
=	TokenNameEQUAL	
offDB	TokenNameIdentifier	 off DB
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Below is the number of shifts for each axis 	TokenNameCOMMENT_LINE	Below is the number of shifts for each axis 
// e.g when xChannel is ALPHA, the pixel needs 	TokenNameCOMMENT_LINE	e.g when xChannel is ALPHA, the pixel needs 
// to be shifted 24, RED 16, GREEN 8 and BLUE 0 	TokenNameCOMMENT_LINE	to be shifted 24, RED 16, GREEN 8 and BLUE 0 
final	TokenNamefinal	
int	TokenNameint	
xShift	TokenNameIdentifier	 x Shift
=	TokenNameEQUAL	
xChannel	TokenNameIdentifier	 x Channel
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yShift	TokenNameIdentifier	 y Shift
=	TokenNameEQUAL	
yChannel	TokenNameIdentifier	 y Channel
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The pointer of img and dst indicating where the pixel values are 	TokenNameCOMMENT_LINE	The pointer of img and dst indicating where the pixel values are 
int	TokenNameint	
dp	TokenNameIdentifier	 dp
=	TokenNameEQUAL	
dstOff	TokenNameIdentifier	 dst Off
,	TokenNameCOMMA	
ip	TokenNameIdentifier	 ip
=	TokenNameEQUAL	
offOff	TokenNameIdentifier	 off Off
;	TokenNameSEMICOLON	
// Fixed point representation of scale factor. 	TokenNameCOMMENT_LINE	Fixed point representation of scale factor. 
// Fixed point representation of scale factor. 	TokenNameCOMMENT_LINE	Fixed point representation of scale factor. 
final	TokenNamefinal	
int	TokenNameint	
fpScaleX	TokenNameIdentifier	 fp Scale X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
scaleX	TokenNameIdentifier	 scale X
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpAdjX	TokenNameIdentifier	 fp Adj X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
-	TokenNameMINUS	
127.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
fpScaleX	TokenNameIdentifier	 fp Scale X
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpScaleY	TokenNameIdentifier	 fp Scale Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
scaleY	TokenNameIdentifier	 scale Y
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpAdjY	TokenNameIdentifier	 fp Adj Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
-	TokenNameMINUS	
127.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
fpScaleY	TokenNameIdentifier	 fp Scale Y
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pel00	TokenNameIdentifier	 pel00
,	TokenNameCOMMA	
pel01	TokenNameIdentifier	 pel01
,	TokenNameCOMMA	
pel10	TokenNameIdentifier	 pel10
,	TokenNameCOMMA	
pel11	TokenNameIdentifier	 pel11
,	TokenNameCOMMA	
xFrac	TokenNameIdentifier	 x Frac
,	TokenNameCOMMA	
yFrac	TokenNameIdentifier	 y Frac
,	TokenNameCOMMA	
newPel	TokenNameIdentifier	 new Pel
;	TokenNameSEMICOLON	
int	TokenNameint	
sp0	TokenNameIdentifier	 sp0
,	TokenNameCOMMA	
sp1	TokenNameIdentifier	 sp1
,	TokenNameCOMMA	
pel0	TokenNameIdentifier	 pel0
,	TokenNameCOMMA	
pel1	TokenNameIdentifier	 pel1
,	TokenNameCOMMA	
a00	TokenNameIdentifier	 a00
,	TokenNameCOMMA	
a01	TokenNameIdentifier	 a01
,	TokenNameCOMMA	
a10	TokenNameIdentifier	 a10
,	TokenNameCOMMA	
a11	TokenNameIdentifier	 a11
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
,	TokenNameCOMMA	
xDisplace	TokenNameIdentifier	 x Displace
,	TokenNameCOMMA	
yDisplace	TokenNameIdentifier	 y Displace
,	TokenNameCOMMA	
dPel	TokenNameIdentifier	 d Pel
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
=	TokenNameEQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
xt1	TokenNameIdentifier	 xt1
,	TokenNameCOMMA	
yt1	TokenNameIdentifier	 yt1
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
yStart	TokenNameIdentifier	 y Start
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
yEnd	TokenNameIdentifier	 y End
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
xStart	TokenNameIdentifier	 x Start
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
ip	TokenNameIdentifier	 ip
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dPel	TokenNameIdentifier	 d Pel
=	TokenNameEQUAL	
offPixels	TokenNameIdentifier	 off Pixels
[	TokenNameLBRACKET	
ip	TokenNameIdentifier	 ip
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xDisplace	TokenNameIdentifier	 x Displace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fpScaleX	TokenNameIdentifier	 fp Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dPel	TokenNameIdentifier	 d Pel
>>	TokenNameRIGHT_SHIFT	
xShift	TokenNameIdentifier	 x Shift
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
fpAdjX	TokenNameIdentifier	 fp Adj X
;	TokenNameSEMICOLON	
yDisplace	TokenNameIdentifier	 y Displace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fpScaleY	TokenNameIdentifier	 fp Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dPel	TokenNameIdentifier	 d Pel
>>	TokenNameRIGHT_SHIFT	
yShift	TokenNameIdentifier	 y Shift
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
fpAdjY	TokenNameIdentifier	 fp Adj Y
;	TokenNameSEMICOLON	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
xDisplace	TokenNameIdentifier	 x Displace
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
(	TokenNameLPAREN	
yDisplace	TokenNameIdentifier	 y Displace
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
!=	TokenNameNOT_EQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
yt	TokenNameIdentifier	 yt
!=	TokenNameNOT_EQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yt	TokenNameIdentifier	 yt
=	TokenNameEQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pel00	TokenNameIdentifier	 pel00
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xt1	TokenNameIdentifier	 xt1
=	TokenNameEQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yt1	TokenNameIdentifier	 yt1
=	TokenNameEQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
yt	TokenNameIdentifier	 yt
==	TokenNameEQUAL_EQUAL	
yt1	TokenNameIdentifier	 yt1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Same tile vertically, check across... 	TokenNameCOMMENT_LINE	Same tile vertically, check across... 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
==	TokenNameEQUAL_EQUAL	
xt1	TokenNameIdentifier	 xt1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All from same tile.. 	TokenNameCOMMENT_LINE	All from same tile.. 
pel10	TokenNameIdentifier	 pel10
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel01	TokenNameIdentifier	 pel01
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel11	TokenNameIdentifier	 pel11
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Different tile horizontally... 	TokenNameCOMMENT_LINE	Different tile horizontally... 
pel01	TokenNameIdentifier	 pel01
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt1	TokenNameIdentifier	 xt1
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel10	TokenNameIdentifier	 pel10
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel11	TokenNameIdentifier	 pel11
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xt1	TokenNameIdentifier	 xt1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Steped into next tile down, check across... 	TokenNameCOMMENT_LINE	Steped into next tile down, check across... 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
==	TokenNameEQUAL_EQUAL	
xt1	TokenNameIdentifier	 xt1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Different tile horizontally. 	TokenNameCOMMENT_LINE	Different tile horizontally. 
pel10	TokenNameIdentifier	 pel10
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
yt1	TokenNameIdentifier	 yt1
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel01	TokenNameIdentifier	 pel01
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel11	TokenNameIdentifier	 pel11
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yt	TokenNameIdentifier	 yt
=	TokenNameEQUAL	
yt1	TokenNameIdentifier	 yt1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Ugg we are at the 4way intersection of tiles... 	TokenNameCOMMENT_LINE	Ugg we are at the 4way intersection of tiles... 
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
yt1	TokenNameIdentifier	 yt1
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel01	TokenNameIdentifier	 pel01
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt1	TokenNameIdentifier	 xt1
,	TokenNameCOMMA	
yt1	TokenNameIdentifier	 yt1
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel11	TokenNameIdentifier	 pel11
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt1	TokenNameIdentifier	 xt1
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pel10	TokenNameIdentifier	 pel10
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xt1	TokenNameIdentifier	 xt1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
xFrac	TokenNameIdentifier	 x Frac
=	TokenNameEQUAL	
xDisplace	TokenNameIdentifier	 x Displace
&	TokenNameAND	
0x7FFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
yFrac	TokenNameIdentifier	 y Frac
=	TokenNameEQUAL	
yDisplace	TokenNameIdentifier	 y Displace
&	TokenNameAND	
0x7FFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Combine the alpha channels. 	TokenNameCOMMENT_LINE	Combine the alpha channels. 
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel00	TokenNameIdentifier	 pel00
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel10	TokenNameIdentifier	 pel10
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel0	TokenNameIdentifier	 pel0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
a00	TokenNameIdentifier	 a00
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
a10	TokenNameIdentifier	 a10
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel01	TokenNameIdentifier	 pel01
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel11	TokenNameIdentifier	 pel11
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel1	TokenNameIdentifier	 pel1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
a01	TokenNameIdentifier	 a01
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
a11	TokenNameIdentifier	 a11
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newPel	TokenNameIdentifier	 new Pel
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel0	TokenNameIdentifier	 pel0
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pel1	TokenNameIdentifier	 pel1
-	TokenNameMINUS	
pel0	TokenNameIdentifier	 pel0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
yFrac	TokenNameIdentifier	 y Frac
+	TokenNamePLUS	
0x00400000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7F800000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Combine the red channels. 	TokenNameCOMMENT_LINE	Combine the red channels. 
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel00	TokenNameIdentifier	 pel00
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a00	TokenNameIdentifier	 a00
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel10	TokenNameIdentifier	 pel10
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a10	TokenNameIdentifier	 a10
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel0	TokenNameIdentifier	 pel0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel01	TokenNameIdentifier	 pel01
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a01	TokenNameIdentifier	 a01
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel11	TokenNameIdentifier	 pel11
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a11	TokenNameIdentifier	 a11
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel1	TokenNameIdentifier	 pel1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newPel	TokenNameIdentifier	 new Pel
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel0	TokenNameIdentifier	 pel0
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pel1	TokenNameIdentifier	 pel1
-	TokenNameMINUS	
pel0	TokenNameIdentifier	 pel0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
yFrac	TokenNameIdentifier	 y Frac
+	TokenNamePLUS	
0x00400000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7F800000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Combine the green channels. 	TokenNameCOMMENT_LINE	Combine the green channels. 
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel00	TokenNameIdentifier	 pel00
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a00	TokenNameIdentifier	 a00
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel10	TokenNameIdentifier	 pel10
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a10	TokenNameIdentifier	 a10
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel0	TokenNameIdentifier	 pel0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel01	TokenNameIdentifier	 pel01
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a01	TokenNameIdentifier	 a01
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel11	TokenNameIdentifier	 pel11
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a11	TokenNameIdentifier	 a11
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel1	TokenNameIdentifier	 pel1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newPel	TokenNameIdentifier	 new Pel
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel0	TokenNameIdentifier	 pel0
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pel1	TokenNameIdentifier	 pel1
-	TokenNameMINUS	
pel0	TokenNameIdentifier	 pel0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
yFrac	TokenNameIdentifier	 y Frac
+	TokenNamePLUS	
0x00400000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7F800000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Combine the blue channels. 	TokenNameCOMMENT_LINE	Combine the blue channels. 
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel00	TokenNameIdentifier	 pel00
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a00	TokenNameIdentifier	 a00
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel10	TokenNameIdentifier	 pel10
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a10	TokenNameIdentifier	 a10
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel0	TokenNameIdentifier	 pel0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp0	TokenNameIdentifier	 sp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel01	TokenNameIdentifier	 pel01
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a01	TokenNameIdentifier	 a01
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp1	TokenNameIdentifier	 sp1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel11	TokenNameIdentifier	 pel11
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
a11	TokenNameIdentifier	 a11
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pel1	TokenNameIdentifier	 pel1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sp0	TokenNameIdentifier	 sp0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sp1	TokenNameIdentifier	 sp1
-	TokenNameMINUS	
sp0	TokenNameIdentifier	 sp0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xFrac	TokenNameIdentifier	 x Frac
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newPel	TokenNameIdentifier	 new Pel
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pel0	TokenNameIdentifier	 pel0
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pel1	TokenNameIdentifier	 pel1
-	TokenNameMINUS	
pel0	TokenNameIdentifier	 pel0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
yFrac	TokenNameIdentifier	 y Frac
+	TokenNamePLUS	
0x00400000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7F800000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstPixels	TokenNameIdentifier	 dst Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newPel	TokenNameIdentifier	 new Pel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstAdjust	TokenNameIdentifier	 dst Adjust
;	TokenNameSEMICOLON	
ip	TokenNameIdentifier	 ip
+=	TokenNamePLUS_EQUAL	
offAdjust	TokenNameIdentifier	 off Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
TIME	TokenNameIdentifier	 TIME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Time: "	TokenNameStringLiteral	Time: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of the filter() method for Raster 	TokenNameCOMMENT_LINE	end of the filter() method for Raster 
/** * Does displacement map using Nearest neighbor interpolation * * @param off the displacement map * @param dst stores the filtered image. If null, a destination will * be created. img and dst can refer to the same Raster, in * which situation the img will be modified. */	TokenNameCOMMENT_JAVADOC	 Does displacement map using Nearest neighbor interpolation * @param off the displacement map @param dst stores the filtered image. If null, a destination will be created. img and dst can refer to the same Raster, in which situation the img will be modified. 
public	TokenNamepublic	
void	TokenNamevoid	
filterNN	TokenNameIdentifier	 filter NN
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xTile	TokenNameIdentifier	 x Tile
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xOff	TokenNameIdentifier	 x Off
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yTile	TokenNameIdentifier	 y Tile
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yOff	TokenNameIdentifier	 y Off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
xStart	TokenNameIdentifier	 x Start
=	TokenNameEQUAL	
maxOffX	TokenNameIdentifier	 max Off X
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yStart	TokenNameIdentifier	 y Start
=	TokenNameEQUAL	
maxOffY	TokenNameIdentifier	 max Off Y
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
xEnd	TokenNameIdentifier	 x End
=	TokenNameEQUAL	
xStart	TokenNameIdentifier	 x Start
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yEnd	TokenNameIdentifier	 y End
=	TokenNameEQUAL	
yStart	TokenNameIdentifier	 y Start
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
// Access the integer buffer for each image. 	TokenNameCOMMENT_LINE	Access the integer buffer for each image. 
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dstDB	TokenNameIdentifier	 dst DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
offDB	TokenNameIdentifier	 off DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Offset defines where in the stack the real data begin 	TokenNameCOMMENT_LINE	Offset defines where in the stack the real data begin 
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
dstSPPSM	TokenNameIdentifier	 dst SPPSM
,	TokenNameCOMMA	
offSPPSM	TokenNameIdentifier	 off SPPSM
;	TokenNameSEMICOLON	
dstSPPSM	TokenNameIdentifier	 dst SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstOff	TokenNameIdentifier	 dst Off
=	TokenNameEQUAL	
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
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dst	TokenNameIdentifier	 dst
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offSPPSM	TokenNameIdentifier	 off SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offOff	TokenNameIdentifier	 off Off
=	TokenNameEQUAL	
offDB	TokenNameIdentifier	 off DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
offSPPSM	TokenNameIdentifier	 off SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Stride is the distance between two consecutive column elements, 	TokenNameCOMMENT_LINE	Stride is the distance between two consecutive column elements, 
// in the one-dimention dataBuffer 	TokenNameCOMMENT_LINE	in the one-dimention dataBuffer 
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
final	TokenNamefinal	
int	TokenNameint	
offScanStride	TokenNameIdentifier	 off Scan Stride
=	TokenNameEQUAL	
offSPPSM	TokenNameIdentifier	 off SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstAdjust	TokenNameIdentifier	 dst Adjust
=	TokenNameEQUAL	
dstScanStride	TokenNameIdentifier	 dst Scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offAdjust	TokenNameIdentifier	 off Adjust
=	TokenNameEQUAL	
offScanStride	TokenNameIdentifier	 off Scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// Access the pixel value array 	TokenNameCOMMENT_LINE	Access the pixel value array 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPixels	TokenNameIdentifier	 dst Pixels
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
offPixels	TokenNameIdentifier	 off Pixels
=	TokenNameEQUAL	
offDB	TokenNameIdentifier	 off DB
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Below is the number of shifts for each axis 	TokenNameCOMMENT_LINE	Below is the number of shifts for each axis 
// e.g when xChannel is ALPHA, the pixel needs 	TokenNameCOMMENT_LINE	e.g when xChannel is ALPHA, the pixel needs 
// to be shifted 24, RED 16, GREEN 8 and BLUE 0 	TokenNameCOMMENT_LINE	to be shifted 24, RED 16, GREEN 8 and BLUE 0 
final	TokenNamefinal	
int	TokenNameint	
xShift	TokenNameIdentifier	 x Shift
=	TokenNameEQUAL	
xChannel	TokenNameIdentifier	 x Channel
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
yShift	TokenNameIdentifier	 y Shift
=	TokenNameEQUAL	
yChannel	TokenNameIdentifier	 y Channel
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpScaleX	TokenNameIdentifier	 fp Scale X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
scaleX	TokenNameIdentifier	 scale X
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpScaleY	TokenNameIdentifier	 fp Scale Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
scaleY	TokenNameIdentifier	 scale Y
/	TokenNameDIVIDE	
255.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Calculate the shift to make '.5' no movement. 	TokenNameCOMMENT_LINE	Calculate the shift to make '.5' no movement. 
// This also includes rounding factor (0x4000) for Fixed Point stuff. 	TokenNameCOMMENT_LINE	This also includes rounding factor (0x4000) for Fixed Point stuff. 
final	TokenNamefinal	
int	TokenNameint	
fpAdjX	TokenNameIdentifier	 fp Adj X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
-	TokenNameMINUS	
127.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
fpScaleX	TokenNameIdentifier	 fp Scale X
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpAdjY	TokenNameIdentifier	 fp Adj Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
-	TokenNameMINUS	
127.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
fpScaleY	TokenNameIdentifier	 fp Scale Y
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The pointer of img and dst indicating where the pixel values are 	TokenNameCOMMENT_LINE	The pointer of img and dst indicating where the pixel values are 
int	TokenNameint	
dp	TokenNameIdentifier	 dp
=	TokenNameEQUAL	
dstOff	TokenNameIdentifier	 dst Off
,	TokenNameCOMMA	
ip	TokenNameIdentifier	 ip
=	TokenNameEQUAL	
offOff	TokenNameIdentifier	 off Off
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
yStart	TokenNameIdentifier	 y Start
,	TokenNameCOMMA	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
=	TokenNameEQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
,	TokenNameCOMMA	
xDisplace	TokenNameIdentifier	 x Displace
,	TokenNameCOMMA	
yDisplace	TokenNameIdentifier	 y Displace
,	TokenNameCOMMA	
dPel	TokenNameIdentifier	 d Pel
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
yEnd	TokenNameIdentifier	 y End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
xStart	TokenNameIdentifier	 x Start
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
xEnd	TokenNameIdentifier	 x End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dPel	TokenNameIdentifier	 d Pel
=	TokenNameEQUAL	
offPixels	TokenNameIdentifier	 off Pixels
[	TokenNameLBRACKET	
ip	TokenNameIdentifier	 ip
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xDisplace	TokenNameIdentifier	 x Displace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fpScaleX	TokenNameIdentifier	 fp Scale X
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dPel	TokenNameIdentifier	 d Pel
>>	TokenNameRIGHT_SHIFT	
xShift	TokenNameIdentifier	 x Shift
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
fpAdjX	TokenNameIdentifier	 fp Adj X
;	TokenNameSEMICOLON	
yDisplace	TokenNameIdentifier	 y Displace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fpScaleY	TokenNameIdentifier	 fp Scale Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dPel	TokenNameIdentifier	 d Pel
>>	TokenNameRIGHT_SHIFT	
yShift	TokenNameIdentifier	 y Shift
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
fpAdjY	TokenNameIdentifier	 fp Adj Y
;	TokenNameSEMICOLON	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
xDisplace	TokenNameIdentifier	 x Displace
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
(	TokenNameLPAREN	
yDisplace	TokenNameIdentifier	 y Displace
>>	TokenNameRIGHT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
!=	TokenNameNOT_EQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
yt	TokenNameIdentifier	 yt
!=	TokenNameNOT_EQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
xTile	TokenNameIdentifier	 x Tile
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yt	TokenNameIdentifier	 yt
=	TokenNameEQUAL	
yTile	TokenNameIdentifier	 y Tile
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
imgPix	TokenNameIdentifier	 img Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt	TokenNameIdentifier	 xt
,	TokenNameCOMMA	
yt	TokenNameIdentifier	 yt
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstPixels	TokenNameIdentifier	 dst Pixels
[	TokenNameLBRACKET	
dp	TokenNameIdentifier	 dp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
imgPix	TokenNameIdentifier	 img Pix
[	TokenNameLBRACKET	
xOff	TokenNameIdentifier	 x Off
[	TokenNameLBRACKET	
x0	TokenNameIdentifier	 x0
]	TokenNameRBRACKET	
+	TokenNamePLUS	
yOff	TokenNameIdentifier	 y Off
[	TokenNameLBRACKET	
y0	TokenNameIdentifier	 y0
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dp	TokenNameIdentifier	 dp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ip	TokenNameIdentifier	 ip
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dp	TokenNameIdentifier	 dp
+=	TokenNamePLUS_EQUAL	
dstAdjust	TokenNameIdentifier	 dst Adjust
;	TokenNameSEMICOLON	
ip	TokenNameIdentifier	 ip
+=	TokenNamePLUS_EQUAL	
offAdjust	TokenNameIdentifier	 off Adjust
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
TIME	TokenNameIdentifier	 TIME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Time: "	TokenNameStringLiteral	Time: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of the filter() method for Raster 	TokenNameCOMMENT_LINE	end of the filter() method for Raster 
}	TokenNameRBRACE	
