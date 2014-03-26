/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
rendered	TokenNameIdentifier	 rendered
.	TokenNameDOT	
AbstractRed	TokenNameIdentifier	 Abstract Red
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
rendered	TokenNameIdentifier	 rendered
.	TokenNameDOT	
CachableRed	TokenNameIdentifier	 Cachable Red
;	TokenNameSEMICOLON	
/** * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: HistogramRed.java 479564 2006-11-27 09:56:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: HistogramRed.java 479564 2006-11-27 09:56:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
HistogramRed	TokenNameIdentifier	 Histogram Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
// This is used to track which tiles we have computed 	TokenNameCOMMENT_LINE	This is used to track which tiles we have computed 
// a histogram for. 	TokenNameCOMMENT_LINE	a histogram for. 
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
computed	TokenNameIdentifier	 computed
;	TokenNameSEMICOLON	
int	TokenNameint	
tallied	TokenNameIdentifier	 tallied
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bins	TokenNameIdentifier	 bins
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
HistogramRed	TokenNameIdentifier	 Histogram Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tiles	TokenNameIdentifier	 tiles
=	TokenNameEQUAL	
getNumXTiles	TokenNameIdentifier	 get Num X Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
getNumYTiles	TokenNameIdentifier	 get Num Y Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computed	TokenNameIdentifier	 computed
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
tiles	TokenNameIdentifier	 tiles
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tallyTile	TokenNameIdentifier	 tally Tile
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
minX	TokenNameIdentifier	 min X
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
minY	TokenNameIdentifier	 min Y
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
samples	TokenNameIdentifier	 samples
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
minY	TokenNameIdentifier	 min Y
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
minY	TokenNameIdentifier	 min Y
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
samples	TokenNameIdentifier	 samples
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
minX	TokenNameIdentifier	 min X
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
samples	TokenNameIdentifier	 samples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Simple fixed point conversion to lumincence. 	TokenNameCOMMENT_LINE	Simple fixed point conversion to lumincence. 
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
samples	TokenNameIdentifier	 samples
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Red 	TokenNameCOMMENT_LINE	Red 
val	TokenNameIdentifier	 val
+=	TokenNamePLUS_EQUAL	
samples	TokenNameIdentifier	 samples
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Green 	TokenNameCOMMENT_LINE	Green 
val	TokenNameIdentifier	 val
+=	TokenNamePLUS_EQUAL	
samples	TokenNameIdentifier	 samples
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// blue 	TokenNameCOMMENT_LINE	blue 
bins	TokenNameIdentifier	 bins
[	TokenNameLBRACKET	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
tallied	TokenNameIdentifier	 tallied
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHistogram	TokenNameIdentifier	 get Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tallied	TokenNameIdentifier	 tallied
==	TokenNameEQUAL_EQUAL	
computed	TokenNameIdentifier	 computed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
bins	TokenNameIdentifier	 bins
;	TokenNameSEMICOLON	
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
int	TokenNameint	
yt0	TokenNameIdentifier	 yt0
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getMinTileY	TokenNameIdentifier	 get Min Tile Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xtiles	TokenNameIdentifier	 xtiles
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getNumXTiles	TokenNameIdentifier	 get Num X Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xt0	TokenNameIdentifier	 xt0
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getMinTileX	TokenNameIdentifier	 get Min Tile X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getNumYTiles	TokenNameIdentifier	 get Num Y Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
xtiles	TokenNameIdentifier	 xtiles
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
xt0	TokenNameIdentifier	 xt0
)	TokenNameRPAREN	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
xtiles	TokenNameIdentifier	 xtiles
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
computed	TokenNameIdentifier	 computed
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Raster	TokenNameIdentifier	 Raster
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
xt0	TokenNameIdentifier	 xt0
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
yt0	TokenNameIdentifier	 yt0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tallyTile	TokenNameIdentifier	 tally Tile
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computed	TokenNameIdentifier	 computed
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bins	TokenNameIdentifier	 bins
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
int	TokenNameint	
yt	TokenNameIdentifier	 yt
=	TokenNameEQUAL	
tileY	TokenNameIdentifier	 tile Y
-	TokenNameMINUS	
getMinTileY	TokenNameIdentifier	 get Min Tile Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
tileX	TokenNameIdentifier	 tile X
-	TokenNameMINUS	
getMinTileX	TokenNameIdentifier	 get Min Tile X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Raster	TokenNameIdentifier	 Raster
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
tileX	TokenNameIdentifier	 tile X
,	TokenNameCOMMA	
tileY	TokenNameIdentifier	 tile Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
xt	TokenNameIdentifier	 xt
+	TokenNamePLUS	
yt	TokenNameIdentifier	 yt
*	TokenNameMULTIPLY	
getNumXTiles	TokenNameIdentifier	 get Num X Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
computed	TokenNameIdentifier	 computed
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
tallyTile	TokenNameIdentifier	 tally Tile
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computed	TokenNameIdentifier	 computed
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
