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
RenderedImage	TokenNameIdentifier	 Rendered Image
;	TokenNameSEMICOLON	
/** * * @version $Id: TileCache.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: TileCache.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TileCache	TokenNameIdentifier	 Tile Cache
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
LRUCache	TokenNameIdentifier	 LRU Cache
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
LRUCache	TokenNameIdentifier	 LRU Cache
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TileStore	TokenNameIdentifier	 Tile Store
getTileGrid	TokenNameIdentifier	 get Tile Grid
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
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TileGrid	TokenNameIdentifier	 Tile Grid
(	TokenNameLPAREN	
minTileX	TokenNameIdentifier	 min Tile X
,	TokenNameCOMMA	
minTileY	TokenNameIdentifier	 min Tile Y
,	TokenNameCOMMA	
xSz	TokenNameIdentifier	 x Sz
,	TokenNameCOMMA	
ySz	TokenNameIdentifier	 y Sz
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TileStore	TokenNameIdentifier	 Tile Store
getTileGrid	TokenNameIdentifier	 get Tile Grid
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
img	TokenNameIdentifier	 img
,	TokenNameCOMMA	
TileGenerator	TokenNameIdentifier	 Tile Generator
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TileGrid	TokenNameIdentifier	 Tile Grid
(	TokenNameLPAREN	
img	TokenNameIdentifier	 img
.	TokenNameDOT	
getMinTileX	TokenNameIdentifier	 get Min Tile X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
img	TokenNameIdentifier	 img
.	TokenNameDOT	
getMinTileY	TokenNameIdentifier	 get Min Tile Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
img	TokenNameIdentifier	 img
.	TokenNameDOT	
getNumXTiles	TokenNameIdentifier	 get Num X Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
img	TokenNameIdentifier	 img
.	TokenNameDOT	
getNumYTiles	TokenNameIdentifier	 get Num Y Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TileStore	TokenNameIdentifier	 Tile Store
getTileMap	TokenNameIdentifier	 get Tile Map
(	TokenNameLPAREN	
TileGenerator	TokenNameIdentifier	 Tile Generator
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TileMap	TokenNameIdentifier	 Tile Map
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
