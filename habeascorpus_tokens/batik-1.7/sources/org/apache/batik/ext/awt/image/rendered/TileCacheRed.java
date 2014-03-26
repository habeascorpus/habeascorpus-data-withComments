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
/** * This implementation of RenderedImage only serves to put the tiles * generated by it's input into the TileCache. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: TileCacheRed.java 491223 2006-12-30 14:04:41Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This implementation of RenderedImage only serves to put the tiles generated by it's input into the TileCache. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: TileCacheRed.java 491223 2006-12-30 14:04:41Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TileCacheRed	TokenNameIdentifier	 Tile Cache Red
extends	TokenNameextends	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
{	TokenNameLBRACE	
/** * Place the results of computations of cr into the global tile cache. * @param cr The operation to cache results from. */	TokenNameCOMMENT_JAVADOC	 Place the results of computations of cr into the global tile cache. @param cr The operation to cache results from. 
public	TokenNamepublic	
TileCacheRed	TokenNameIdentifier	 Tile Cache Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Place the results of computations of cr into the global tile cache. * @param cr The operation to cache results from. */	TokenNameCOMMENT_JAVADOC	 Place the results of computations of cr into the global tile cache. @param cr The operation to cache results from. 
public	TokenNamepublic	
TileCacheRed	TokenNameIdentifier	 Tile Cache Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
int	TokenNameint	
tileWidth	TokenNameIdentifier	 tile Width
,	TokenNameCOMMA	
int	TokenNameint	
tileHeight	TokenNameIdentifier	 tile Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tileWidth	TokenNameIdentifier	 tile Width
>	TokenNameGREATER	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
tileWidth	TokenNameIdentifier	 tile Width
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tileHeight	TokenNameIdentifier	 tile Height
>	TokenNameGREATER	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
tileHeight	TokenNameIdentifier	 tile Height
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
tileWidth	TokenNameIdentifier	 tile Width
,	TokenNameCOMMA	
tileHeight	TokenNameIdentifier	 tile Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
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
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flushCache	TokenNameIdentifier	 flush Cache
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tx0	TokenNameIdentifier	 tx0
=	TokenNameEQUAL	
getXTile	TokenNameIdentifier	 get X Tile
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ty0	TokenNameIdentifier	 ty0
=	TokenNameEQUAL	
getYTile	TokenNameIdentifier	 get Y Tile
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tx1	TokenNameIdentifier	 tx1
=	TokenNameEQUAL	
getXTile	TokenNameIdentifier	 get X Tile
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ty1	TokenNameIdentifier	 ty1
=	TokenNameEQUAL	
getYTile	TokenNameIdentifier	 get Y Tile
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tx0	TokenNameIdentifier	 tx0
<	TokenNameLESS	
minTileX	TokenNameIdentifier	 min Tile X
)	TokenNameRPAREN	
tx0	TokenNameIdentifier	 tx0
=	TokenNameEQUAL	
minTileX	TokenNameIdentifier	 min Tile X
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ty0	TokenNameIdentifier	 ty0
<	TokenNameLESS	
minTileY	TokenNameIdentifier	 min Tile Y
)	TokenNameRPAREN	
ty0	TokenNameIdentifier	 ty0
=	TokenNameEQUAL	
minTileY	TokenNameIdentifier	 min Tile Y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tx1	TokenNameIdentifier	 tx1
>=	TokenNameGREATER_EQUAL	
minTileX	TokenNameIdentifier	 min Tile X
+	TokenNamePLUS	
numXTiles	TokenNameIdentifier	 num X Tiles
)	TokenNameRPAREN	
tx1	TokenNameIdentifier	 tx1
=	TokenNameEQUAL	
minTileX	TokenNameIdentifier	 min Tile X
+	TokenNamePLUS	
numXTiles	TokenNameIdentifier	 num X Tiles
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ty1	TokenNameIdentifier	 ty1
>=	TokenNameGREATER_EQUAL	
minTileY	TokenNameIdentifier	 min Tile Y
+	TokenNamePLUS	
numYTiles	TokenNameIdentifier	 num Y Tiles
)	TokenNameRPAREN	
ty1	TokenNameIdentifier	 ty1
=	TokenNameEQUAL	
minTileY	TokenNameIdentifier	 min Tile Y
+	TokenNamePLUS	
numYTiles	TokenNameIdentifier	 num Y Tiles
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tx1	TokenNameIdentifier	 tx1
<	TokenNameLESS	
tx0	TokenNameIdentifier	 tx0
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ty1	TokenNameIdentifier	 ty1
<	TokenNameLESS	
ty0	TokenNameIdentifier	 ty0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
TileStore	TokenNameIdentifier	 Tile Store
store	TokenNameIdentifier	 store
=	TokenNameEQUAL	
getTileStore	TokenNameIdentifier	 get Tile Store
(	TokenNameLPAREN	
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
setTile	TokenNameIdentifier	 set Tile
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	