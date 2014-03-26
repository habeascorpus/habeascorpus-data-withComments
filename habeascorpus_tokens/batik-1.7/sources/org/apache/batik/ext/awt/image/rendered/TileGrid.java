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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Raster	TokenNameIdentifier	 Raster
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HaltingThread	TokenNameIdentifier	 Halting Thread
;	TokenNameSEMICOLON	
/** * This is a Grid based implementation of the TileStore. * This makes it pretty quick, but it can use a fair amount of * memory for large tile grids. * * @version $Id: TileGrid.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is a Grid based implementation of the TileStore. This makes it pretty quick, but it can use a fair amount of memory for large tile grids. * @version $Id: TileGrid.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TileGrid	TokenNameIdentifier	 Tile Grid
implements	TokenNameimplements	
TileStore	TokenNameIdentifier	 Tile Store
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
COUNT	TokenNameIdentifier	 COUNT
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
xSz	TokenNameIdentifier	 x Sz
,	TokenNameCOMMA	
ySz	TokenNameIdentifier	 y Sz
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minTileX	TokenNameIdentifier	 min Tile X
,	TokenNameCOMMA	
minTileY	TokenNameIdentifier	 min Tile Y
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rasters	TokenNameIdentifier	 rasters
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TileGenerator	TokenNameIdentifier	 Tile Generator
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LRUCache	TokenNameIdentifier	 LRU Cache
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TileGrid	TokenNameIdentifier	 Tile Grid
(	TokenNameLPAREN	
int	TokenNameint	
minTileX	TokenNameIdentifier	 min Tile X
,	TokenNameCOMMA	
int	TokenNameint	
minTileY	TokenNameIdentifier	 min Tile Y
,	TokenNameCOMMA	
int	TokenNameint	
xSz	TokenNameIdentifier	 x Sz
,	TokenNameCOMMA	
int	TokenNameint	
ySz	TokenNameIdentifier	 y Sz
,	TokenNameCOMMA	
TileGenerator	TokenNameIdentifier	 Tile Generator
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
LRUCache	TokenNameIdentifier	 LRU Cache
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minTileX	TokenNameIdentifier	 min Tile X
=	TokenNameEQUAL	
minTileX	TokenNameIdentifier	 min Tile X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minTileY	TokenNameIdentifier	 min Tile Y
=	TokenNameEQUAL	
minTileY	TokenNameIdentifier	 min Tile Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
xSz	TokenNameIdentifier	 x Sz
=	TokenNameEQUAL	
xSz	TokenNameIdentifier	 x Sz
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ySz	TokenNameIdentifier	 y Sz
=	TokenNameEQUAL	
ySz	TokenNameIdentifier	 y Sz
;	TokenNameSEMICOLON	
rasters	TokenNameIdentifier	 rasters
=	TokenNameEQUAL	
new	TokenNamenew	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
[	TokenNameLBRACKET	
ySz	TokenNameIdentifier	 y Sz
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTile	TokenNameIdentifier	 set Tile
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
-=	TokenNameMINUS_EQUAL	
minTileX	TokenNameIdentifier	 min Tile X
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
-=	TokenNameMINUS_EQUAL	
minTileY	TokenNameIdentifier	 min Tile Y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
xSz	TokenNameIdentifier	 x Sz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
>=	TokenNameGREATER_EQUAL	
ySz	TokenNameIdentifier	 y Sz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
rasters	TokenNameIdentifier	 rasters
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Clearing entry. 	TokenNameCOMMENT_LINE	Clearing entry. 
if	TokenNameif	
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
row	TokenNameIdentifier	 row
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
row	TokenNameIdentifier	 row
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
row	TokenNameIdentifier	 row
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
row	TokenNameIdentifier	 row
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
new	TokenNamenew	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
[	TokenNameLBRACKET	
xSz	TokenNameIdentifier	 x Sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
row	TokenNameIdentifier	 row
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
rasters	TokenNameIdentifier	 rasters
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
row	TokenNameIdentifier	 row
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setRaster	TokenNameIdentifier	 set Raster
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Setting: ("	TokenNameStringLiteral	Setting: (
+	TokenNamePLUS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
minTileX	TokenNameIdentifier	 min Tile X
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
minTileY	TokenNameIdentifier	 min Tile Y
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Returns Raster if the tile is _currently_ in the cache. 	TokenNameCOMMENT_LINE	Returns Raster if the tile is _currently_ in the cache. 
// If it is not currently in the cache it returns null. 	TokenNameCOMMENT_LINE	If it is not currently in the cache it returns null. 
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
getTileNoCompute	TokenNameIdentifier	 get Tile No Compute
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
-=	TokenNameMINUS_EQUAL	
minTileX	TokenNameIdentifier	 min Tile X
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
-=	TokenNameMINUS_EQUAL	
minTileY	TokenNameIdentifier	 min Tile Y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
xSz	TokenNameIdentifier	 x Sz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
>=	TokenNameGREATER_EQUAL	
ySz	TokenNameIdentifier	 y Sz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
rasters	TokenNameIdentifier	 rasters
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
row	TokenNameIdentifier	 row
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Raster	TokenNameIdentifier	 Raster
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
retrieveRaster	TokenNameIdentifier	 retrieve Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
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
x	TokenNameIdentifier	 x
-=	TokenNameMINUS_EQUAL	
minTileX	TokenNameIdentifier	 min Tile X
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
-=	TokenNameMINUS_EQUAL	
minTileY	TokenNameIdentifier	 min Tile Y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
xSz	TokenNameIdentifier	 x Sz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
>=	TokenNameGREATER_EQUAL	
ySz	TokenNameIdentifier	 y Sz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Fetching: ("	TokenNameStringLiteral	Fetching: (
+	TokenNamePLUS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
minTileX	TokenNameIdentifier	 min Tile X
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
minTileY	TokenNameIdentifier	 min Tile Y
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
TileGrid	TokenNameIdentifier	 Tile Grid
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
requests	TokenNameIdentifier	 requests
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
rasters	TokenNameIdentifier	 rasters
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
row	TokenNameIdentifier	 row
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ras	TokenNameIdentifier	 ras
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
retrieveRaster	TokenNameIdentifier	 retrieve Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
row	TokenNameIdentifier	 row
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
new	TokenNamenew	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
[	TokenNameLBRACKET	
xSz	TokenNameIdentifier	 x Sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rasters	TokenNameIdentifier	 rasters
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
row	TokenNameIdentifier	 row
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
row	TokenNameIdentifier	 row
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Generating: ("	TokenNameStringLiteral	Generating: (
+	TokenNamePLUS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
minTileX	TokenNameIdentifier	 min Tile X
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
minTileY	TokenNameIdentifier	 min Tile Y
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
TileGrid	TokenNameIdentifier	 Tile Grid
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
misses	TokenNameIdentifier	 misses
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ras	TokenNameIdentifier	 ras
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
genTile	TokenNameIdentifier	 gen Tile
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
minTileX	TokenNameIdentifier	 min Tile X
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
minTileY	TokenNameIdentifier	 min Tile Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// In all likelyhood the contents of this tile is junk! 	TokenNameCOMMENT_LINE	In all likelyhood the contents of this tile is junk! 
// So don't cache it (returning is probably fine since it 	TokenNameCOMMENT_LINE	So don't cache it (returning is probably fine since it 
// won't come back to haunt us... 	TokenNameCOMMENT_LINE	won't come back to haunt us... 
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ras	TokenNameIdentifier	 ras
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setRaster	TokenNameIdentifier	 set Raster
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Update the item's position in the cache.. 	TokenNameCOMMENT_LINE	Update the item's position in the cache.. 
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ras	TokenNameIdentifier	 ras
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
int	TokenNameint	
requests	TokenNameIdentifier	 requests
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
misses	TokenNameIdentifier	 misses
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
