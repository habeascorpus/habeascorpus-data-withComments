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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Raster	TokenNameIdentifier	 Raster
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
SoftReference	TokenNameIdentifier	 Soft Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
CleanerThread	TokenNameIdentifier	 Cleaner Thread
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
/** * * @version $Id: TileMap.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: TileMap.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TileMap	TokenNameIdentifier	 Tile Map
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
HashMap	TokenNameIdentifier	 Hash Map
rasters	TokenNameIdentifier	 rasters
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
class	TokenNameclass	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
extends	TokenNameextends	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
{	TokenNameLBRACE	
public	TokenNamepublic	
Point	TokenNameIdentifier	 Point
pt	TokenNameIdentifier	 pt
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SoftReference	TokenNameIdentifier	 Soft Reference
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
class	TokenNameclass	
RasterSoftRef	TokenNameIdentifier	 Raster Soft Ref
extends	TokenNameextends	
CleanerThread	TokenNameIdentifier	 Cleaner Thread
.	TokenNameDOT	
SoftReferenceCleared	TokenNameIdentifier	 Soft Reference Cleared
{	TokenNameLBRACE	
RasterSoftRef	TokenNameIdentifier	 Raster Soft Ref
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cleared	TokenNameIdentifier	 cleared
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Cleaned: "	TokenNameStringLiteral	Cleaned: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TileMap	TokenNameIdentifier	 Tile Map
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TileMap	TokenNameIdentifier	 Tile Map
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tm	TokenNameIdentifier	 tm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
rasters	TokenNameIdentifier	 rasters
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
(	TokenNameLPAREN	
TileMap	TokenNameIdentifier	 Tile Map
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Point	TokenNameIdentifier	 Point
pt	TokenNameIdentifier	 pt
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
SoftReference	TokenNameIdentifier	 Soft Reference
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRaster	TokenNameIdentifier	 set Raster
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hRaster	TokenNameIdentifier	 h Raster
=	TokenNameEQUAL	
ras	TokenNameIdentifier	 ras
;	TokenNameSEMICOLON	
wRaster	TokenNameIdentifier	 w Raster
=	TokenNameEQUAL	
new	TokenNamenew	
RasterSoftRef	TokenNameIdentifier	 Raster Soft Ref
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
TileMap	TokenNameIdentifier	 Tile Map
(	TokenNameLPAREN	
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
Point	TokenNameIdentifier	 Point
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Clearing entry... 	TokenNameCOMMENT_LINE	Clearing entry... 
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
rasters	TokenNameIdentifier	 rasters
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
rasters	TokenNameIdentifier	 rasters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
pt	TokenNameIdentifier	 pt
,	TokenNameCOMMA	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rasters	TokenNameIdentifier	 rasters
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setRaster	TokenNameIdentifier	 set Raster
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
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
Point	TokenNameIdentifier	 Point
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
rasters	TokenNameIdentifier	 rasters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
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
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
TileMap	TokenNameIdentifier	 Tile Map
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
Point	TokenNameIdentifier	 Point
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
rasters	TokenNameIdentifier	 rasters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
ras	TokenNameIdentifier	 ras
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
retrieveRaster	TokenNameIdentifier	 retrieve Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
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
TileMap	TokenNameIdentifier	 Tile Map
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
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// In all likelyhood the contents of this tile is junk! 	TokenNameCOMMENT_LINE	In all likelyhood the contents of this tile is junk! 
// So don't cache it (returning is probably fine since it 	TokenNameCOMMENT_LINE	So don't cache it (returning is probably fine since it 
// shouldn't come back to haunt us...) 	TokenNameCOMMENT_LINE	shouldn't come back to haunt us...) 
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
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setRaster	TokenNameIdentifier	 set Raster
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
TileMapLRUMember	TokenNameIdentifier	 Tile Map LRU Member
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
pt	TokenNameIdentifier	 pt
,	TokenNameCOMMA	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rasters	TokenNameIdentifier	 rasters
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
