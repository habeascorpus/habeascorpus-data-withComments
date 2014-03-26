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
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Paint	TokenNameIdentifier	 Paint
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
ColorModel	TokenNameIdentifier	 Color Model
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
/** * This implementation of RenderedImage will generate an infinate * field of a single color. It reports bounds but will in fact render * out to infinity. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: FloodRed.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This implementation of RenderedImage will generate an infinate field of a single color. It reports bounds but will in fact render out to infinity. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: FloodRed.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
FloodRed	TokenNameIdentifier	 Flood Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
/** * A single tile that we move around as needed... */	TokenNameCOMMENT_JAVADOC	 A single tile that we move around as needed... 
private	TokenNameprivate	
WritableRaster	TokenNameIdentifier	 Writable Raster
raster	TokenNameIdentifier	 raster
;	TokenNameSEMICOLON	
/** * Construct a fully transparent black image <tt>bounds</tt> size. * @param bounds the bounds of the image (in fact will respond with * any request). */	TokenNameCOMMENT_JAVADOC	 Construct a fully transparent black image <tt>bounds</tt> size. @param bounds the bounds of the image (in fact will respond with any request). 
public	TokenNamepublic	
FloodRed	TokenNameIdentifier	 Flood Red
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a fully transparent image <tt>bounds</tt> size, will * paint one tile with paint. Thus paint should not be a pattered * paint or gradient but should be a solid color. * @param bounds the bounds of the image (in fact will respond with * any request). */	TokenNameCOMMENT_JAVADOC	 Construct a fully transparent image <tt>bounds</tt> size, will paint one tile with paint. Thus paint should not be a pattered paint or gradient but should be a solid color. @param bounds the bounds of the image (in fact will respond with any request). 
public	TokenNamepublic	
FloodRed	TokenNameIdentifier	 Flood Red
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We _must_ call init... 	TokenNameCOMMENT_LINE	We _must_ call init... 
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
sRGB_Unpre	TokenNameIdentifier	 s RGB  Unpre
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
int	TokenNameint	
tw	TokenNameIdentifier	 tw
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
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
int	TokenNameint	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
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
// fix my sample model so it makes sense given my size. 	TokenNameCOMMENT_LINE	fix my sample model so it makes sense given my size. 
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
// Finish initializing our base class... 	TokenNameCOMMENT_LINE	Finish initializing our base class... 
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
raster	TokenNameIdentifier	 raster
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
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
offScreen	TokenNameIdentifier	 off Screen
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
raster	TokenNameIdentifier	 raster
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
offScreen	TokenNameIdentifier	 off Screen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setPaint	TokenNameIdentifier	 set Paint
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
fillRect	TokenNameIdentifier	 fill Rect
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We have a Single raster that we translate where needed 	TokenNameCOMMENT_LINE	We have a Single raster that we translate where needed 
// position. So just offest appropriately. 	TokenNameCOMMENT_LINE	position. So just offest appropriately. 
int	TokenNameint	
tx	TokenNameIdentifier	 tx
=	TokenNameEQUAL	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
int	TokenNameint	
ty	TokenNameIdentifier	 ty
=	TokenNameEQUAL	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
return	TokenNamereturn	
raster	TokenNameIdentifier	 raster
.	TokenNameDOT	
createTranslatedChild	TokenNameIdentifier	 create Translated Child
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
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
int	TokenNameint	
tx0	TokenNameIdentifier	 tx0
=	TokenNameEQUAL	
getXTile	TokenNameIdentifier	 get X Tile
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ty0	TokenNameIdentifier	 ty0
=	TokenNameEQUAL	
getYTile	TokenNameIdentifier	 get Y Tile
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tx1	TokenNameIdentifier	 tx1
=	TokenNameEQUAL	
getXTile	TokenNameIdentifier	 get X Tile
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ty1	TokenNameIdentifier	 ty1
=	TokenNameEQUAL	
getYTile	TokenNameIdentifier	 get Y Tile
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
is_INT_PACK	TokenNameIdentifier	 is  INT  PACK
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
is_INT_PACK_Data	TokenNameIdentifier	 is  INT  PACK  Data
(	TokenNameLPAREN	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
ty0	TokenNameIdentifier	 ty0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<=	TokenNameLESS_EQUAL	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
tx0	TokenNameIdentifier	 tx0
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<=	TokenNameLESS_EQUAL	
tx1	TokenNameIdentifier	 tx1
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Raster	TokenNameIdentifier	 Raster
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is_INT_PACK	TokenNameIdentifier	 is  INT  PACK
)	TokenNameRPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData_INT_PACK	TokenNameIdentifier	 copy Data  INT  PACK
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData_FALLBACK	TokenNameIdentifier	 copy Data  FALLBACK
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
