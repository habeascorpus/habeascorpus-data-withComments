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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HaltingThread	TokenNameIdentifier	 Halting Thread
;	TokenNameSEMICOLON	
/** * This is an abstract base class that takes care of most of the * normal issues surrounding the implementation of the CachableRed * (RenderedImage) interface. It tries to make no assumptions about * the subclass implementation. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: AbstractTiledRed.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is an abstract base class that takes care of most of the normal issues surrounding the implementation of the CachableRed (RenderedImage) interface. It tries to make no assumptions about the subclass implementation. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: AbstractTiledRed.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
implements	TokenNameimplements	
TileGenerator	TokenNameIdentifier	 Tile Generator
{	TokenNameLBRACE	
private	TokenNameprivate	
TileStore	TokenNameIdentifier	 Tile Store
tiles	TokenNameIdentifier	 tiles
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
defaultTileSize	TokenNameIdentifier	 default Tile Size
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getDefaultTileSize	TokenNameIdentifier	 get Default Tile Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultTileSize	TokenNameIdentifier	 default Tile Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * void constructor. The subclass must call one of the * flavors of init before the object becomes usable. * This is useful when the proper parameters to the init * method need to be computed in the subclasses constructor. */	TokenNameCOMMENT_JAVADOC	 void constructor. The subclass must call one of the flavors of init before the object becomes usable. This is useful when the proper parameters to the init method need to be computed in the subclasses constructor. 
protected	TokenNameprotected	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct an Abstract RenderedImage from a bounds rect and props * (may be null). The srcs Vector will be empty. * @param bounds this defines the extent of the rable in the * user coordinate system. * @param props this initializes the props Map (may be null) */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract RenderedImage from a bounds rect and props (may be null). The srcs Vector will be empty. @param bounds this defines the extent of the rable in the user coordinate system. @param props this initializes the props Map (may be null) 
protected	TokenNameprotected	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract RenderedImage from a source image and * props (may be null). * @param src will be the first (and only) member of the srcs * Vector. Src is also used to set the bounds, ColorModel, * SampleModel, and tile grid offsets. * @param props this initializes the props Map. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract RenderedImage from a source image and props (may be null). @param src will be the first (and only) member of the srcs Vector. Src is also used to set the bounds, ColorModel, SampleModel, and tile grid offsets. @param props this initializes the props Map. 
protected	TokenNameprotected	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract RenderedImage from a source image, bounds * rect and props (may be null). * @param src will be the first (and only) member of the srcs * Vector. Src is also used to set the ColorModel, SampleModel, * and tile grid offsets. * @param bounds The bounds of this image. * @param props this initializes the props Map. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract RenderedImage from a source image, bounds rect and props (may be null). @param src will be the first (and only) member of the srcs Vector. Src is also used to set the ColorModel, SampleModel, and tile grid offsets. @param bounds The bounds of this image. @param props this initializes the props Map. 
protected	TokenNameprotected	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract RenderedImage from a source image, bounds * rect and props (may be null). * @param src will be the first (and only) member of the srcs * Vector. Src is also used to set the ColorModel, SampleModel, * and tile grid offsets. * @param bounds The bounds of this image. * @param cm The ColorModel to use. If null it will default to * ComponentColorModel. * @param sm The sample model to use. If null it will construct * a sample model the matches the given/generated ColorModel and is * the size of bounds. * @param props this initializes the props Map. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract RenderedImage from a source image, bounds rect and props (may be null). @param src will be the first (and only) member of the srcs Vector. Src is also used to set the ColorModel, SampleModel, and tile grid offsets. @param bounds The bounds of this image. @param cm The ColorModel to use. If null it will default to ComponentColorModel. @param sm The sample model to use. If null it will construct a sample model the matches the given/generated ColorModel and is the size of bounds. @param props this initializes the props Map. 
protected	TokenNameprotected	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract Rable from a bounds rect and props * (may be null). The srcs Vector will be empty. * @param src will be the first (and only) member of the srcs * Vector. Src is also used to set the ColorModel, SampleModel, * and tile grid offsets. * @param bounds this defines the extent of the rable in the * user coordinate system. * @param cm The ColorModel to use. If null it will default to * ComponentColorModel. * @param sm The sample model to use. If null it will construct * a sample model the matches the given/generated ColorModel and is * the size of bounds. * @param tileGridXOff The x location of tile 0,0. * @param tileGridYOff The y location of tile 0,0. * @param props this initializes the props Map. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract Rable from a bounds rect and props (may be null). The srcs Vector will be empty. @param src will be the first (and only) member of the srcs Vector. Src is also used to set the ColorModel, SampleModel, and tile grid offsets. @param bounds this defines the extent of the rable in the user coordinate system. @param cm The ColorModel to use. If null it will default to ComponentColorModel. @param sm The sample model to use. If null it will construct a sample model the matches the given/generated ColorModel and is the size of bounds. @param tileGridXOff The x location of tile 0,0. @param tileGridYOff The y location of tile 0,0. @param props this initializes the props Map. 
protected	TokenNameprotected	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
int	TokenNameint	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
int	TokenNameint	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is one of two basic init function (this is for single * source rendereds). * It is provided so subclasses can compute various values * before initializing all the state in the base class. * You really should call this method before returning from * your subclass constructor. * * @param src The source for the filter * @param bounds The bounds of the image * @param cm The ColorModel to use. If null it defaults to * ComponentColorModel/ src's ColorModel. * @param sm The Sample modle to use. If this is null it will * use the src's sample model if that is null it will * construct a sample model that matches the ColorModel * and is the size of the whole image. * @param tileGridXOff The x location of tile 0,0. * @param tileGridYOff The y location of tile 0,0. * @param props Any properties you want to associate with the image. */	TokenNameCOMMENT_JAVADOC	 This is one of two basic init function (this is for single source rendereds). It is provided so subclasses can compute various values before initializing all the state in the base class. You really should call this method before returning from your subclass constructor. * @param src The source for the filter @param bounds The bounds of the image @param cm The ColorModel to use. If null it defaults to ComponentColorModel/ src's ColorModel. @param sm The Sample modle to use. If this is null it will use the src's sample model if that is null it will construct a sample model that matches the ColorModel and is the size of the whole image. @param tileGridXOff The x location of tile 0,0. @param tileGridYOff The y location of tile 0,0. @param props Any properties you want to associate with the image. 
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
int	TokenNameint	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
int	TokenNameint	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is one of two basic init function (this is for single * source rendereds). * It is provided so subclasses can compute various values * before initializing all the state in the base class. * You really should call this method before returning from * your subclass constructor. * * @param src The source for the filter * @param bounds The bounds of the image * @param cm The ColorModel to use. If null it defaults to * ComponentColorModel/ src's ColorModel. * @param sm The Sample modle to use. If this is null it will * use the src's sample model if that is null it will * construct a sample model that matches the ColorModel * and is the size of the whole image. * @param tileGridXOff The x location of tile 0,0. * @param tileGridYOff The y location of tile 0,0. * @param tiles The tileStore to use (or null). * @param props Any properties you want to associate with the image. */	TokenNameCOMMENT_JAVADOC	 This is one of two basic init function (this is for single source rendereds). It is provided so subclasses can compute various values before initializing all the state in the base class. You really should call this method before returning from your subclass constructor. * @param src The source for the filter @param bounds The bounds of the image @param cm The ColorModel to use. If null it defaults to ComponentColorModel/ src's ColorModel. @param sm The Sample modle to use. If this is null it will use the src's sample model if that is null it will construct a sample model that matches the ColorModel and is the size of the whole image. @param tileGridXOff The x location of tile 0,0. @param tileGridYOff The y location of tile 0,0. @param tiles The tileStore to use (or null). @param props Any properties you want to associate with the image. 
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
int	TokenNameint	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
int	TokenNameint	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
TileStore	TokenNameIdentifier	 Tile Store
tiles	TokenNameIdentifier	 tiles
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tiles	TokenNameIdentifier	 tiles
=	TokenNameEQUAL	
tiles	TokenNameIdentifier	 tiles
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
tiles	TokenNameIdentifier	 tiles
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
tiles	TokenNameIdentifier	 tiles
=	TokenNameEQUAL	
createTileStore	TokenNameIdentifier	 create Tile Store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract Rable from a List of sources a bounds rect * and props (may be null). * @param srcs This is used to initialize the srcs Vector. All * the members of srcs must be CachableRed otherwise an error * will be thrown. * @param bounds this defines the extent of the rendered in pixels * @param props this initializes the props Map. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract Rable from a List of sources a bounds rect and props (may be null). @param srcs This is used to initialize the srcs Vector. All the members of srcs must be CachableRed otherwise an error will be thrown. @param bounds this defines the extent of the rendered in pixels @param props this initializes the props Map. 
protected	TokenNameprotected	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract RenderedImage from a bounds rect, * ColorModel (may be null), SampleModel (may be null) and props * (may be null). The srcs Vector will be empty. * @param srcs This is used to initialize the srcs Vector. All * the members of srcs must be CachableRed otherwise an error * will be thrown. * @param bounds this defines the extent of the rendered in pixels * @param cm The ColorModel to use. If null it will default to * ComponentColorModel. * @param sm The sample model to use. If null it will construct * a sample model the matches the given/generated ColorModel and is * the size of bounds. * @param props this initializes the props Map. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract RenderedImage from a bounds rect, ColorModel (may be null), SampleModel (may be null) and props (may be null). The srcs Vector will be empty. @param srcs This is used to initialize the srcs Vector. All the members of srcs must be CachableRed otherwise an error will be thrown. @param bounds this defines the extent of the rendered in pixels @param cm The ColorModel to use. If null it will default to ComponentColorModel. @param sm The sample model to use. If null it will construct a sample model the matches the given/generated ColorModel and is the size of bounds. @param props this initializes the props Map. 
protected	TokenNameprotected	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract RenderedImage from a bounds rect, * ColorModel (may be null), SampleModel (may be null), tile grid * offsets and props (may be null). The srcs Vector will be * empty. * @param srcs This is used to initialize the srcs Vector. All * the members of srcs must be CachableRed otherwise an error * will be thrown. * @param bounds this defines the extent of the rable in the * user coordinate system. * @param cm The ColorModel to use. If null it will default to * ComponentColorModel. * @param sm The sample model to use. If null it will construct * a sample model the matches the given/generated ColorModel and is * the size of bounds. * @param tileGridXOff The x location of tile 0,0. * @param tileGridYOff The y location of tile 0,0. * @param props this initializes the props Map. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract RenderedImage from a bounds rect, ColorModel (may be null), SampleModel (may be null), tile grid offsets and props (may be null). The srcs Vector will be empty. @param srcs This is used to initialize the srcs Vector. All the members of srcs must be CachableRed otherwise an error will be thrown. @param bounds this defines the extent of the rable in the user coordinate system. @param cm The ColorModel to use. If null it will default to ComponentColorModel. @param sm The sample model to use. If null it will construct a sample model the matches the given/generated ColorModel and is the size of bounds. @param tileGridXOff The x location of tile 0,0. @param tileGridYOff The y location of tile 0,0. @param props this initializes the props Map. 
protected	TokenNameprotected	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
int	TokenNameint	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
int	TokenNameint	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is the basic init function. * It is provided so subclasses can compute various values * before initializing all the state in the base class. * You really should call this method before returning from * your subclass constructor. * * @param srcs The list of sources * @param bounds The bounds of the image * @param cm The ColorModel to use. If null it defaults to * ComponentColorModel. * @param sm The Sample modle to use. If this is null it will * construct a sample model that matches the ColorModel * and is the size of the whole image. * @param tileGridXOff The x location of tile 0,0. * @param tileGridYOff The y location of tile 0,0. * @param props Any properties you want to associate with the image. */	TokenNameCOMMENT_JAVADOC	 This is the basic init function. It is provided so subclasses can compute various values before initializing all the state in the base class. You really should call this method before returning from your subclass constructor. * @param srcs The list of sources @param bounds The bounds of the image @param cm The ColorModel to use. If null it defaults to ComponentColorModel. @param sm The Sample modle to use. If this is null it will construct a sample model that matches the ColorModel and is the size of the whole image. @param tileGridXOff The x location of tile 0,0. @param tileGridYOff The y location of tile 0,0. @param props Any properties you want to associate with the image. 
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
int	TokenNameint	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
int	TokenNameint	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
,	TokenNameCOMMA	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tiles	TokenNameIdentifier	 tiles
=	TokenNameEQUAL	
createTileStore	TokenNameIdentifier	 create Tile Store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TileStore	TokenNameIdentifier	 Tile Store
getTileStore	TokenNameIdentifier	 get Tile Store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tiles	TokenNameIdentifier	 tiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setTileStore	TokenNameIdentifier	 set Tile Store
(	TokenNameLPAREN	
TileStore	TokenNameIdentifier	 Tile Store
tiles	TokenNameIdentifier	 tiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tiles	TokenNameIdentifier	 tiles
=	TokenNameEQUAL	
tiles	TokenNameIdentifier	 tiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
TileStore	TokenNameIdentifier	 Tile Store
createTileStore	TokenNameIdentifier	 create Tile Store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TileCache	TokenNameIdentifier	 Tile Cache
.	TokenNameDOT	
getTileMap	TokenNameIdentifier	 get Tile Map
(	TokenNameLPAREN	
this	TokenNamethis	
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
copyToRasterByBlocks	TokenNameIdentifier	 copy To Raster By Blocks
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
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
xt0	TokenNameIdentifier	 xt0
=	TokenNameEQUAL	
getXTile	TokenNameIdentifier	 get X Tile
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xt1	TokenNameIdentifier	 xt1
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
yt0	TokenNameIdentifier	 yt0
=	TokenNameEQUAL	
getYTile	TokenNameIdentifier	 get Y Tile
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
yt1	TokenNameIdentifier	 yt1
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
(	TokenNameLPAREN	
xt0	TokenNameIdentifier	 xt0
==	TokenNameEQUAL_EQUAL	
xt1	TokenNameIdentifier	 xt1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
yt0	TokenNameIdentifier	 yt0
==	TokenNameEQUAL_EQUAL	
yt1	TokenNameIdentifier	 yt1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Raster	TokenNameIdentifier	 Raster
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
xt0	TokenNameIdentifier	 xt0
,	TokenNameCOMMA	
yt0	TokenNameIdentifier	 yt0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
createChild	TokenNameIdentifier	 create Child
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
height	TokenNameIdentifier	 height
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
}	TokenNameRBRACE	
// rect crosses tile boundries... 	TokenNameCOMMENT_LINE	rect crosses tile boundries... 
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
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
return	TokenNamereturn	
tiles	TokenNameIdentifier	 tiles
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
genTile	TokenNameIdentifier	 gen Tile
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
=	TokenNameEQUAL	
makeTile	TokenNameIdentifier	 make Tile
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genRect	TokenNameIdentifier	 gen Rect
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
genRect	TokenNameIdentifier	 gen Rect
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// { copyToRaster(wr); } 	TokenNameCOMMENT_LINE	{ copyToRaster(wr); } 
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
tiles	TokenNameIdentifier	 tiles
.	TokenNameDOT	
setTile	TokenNameIdentifier	 set Tile
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
copyToRasterByBlocks	TokenNameIdentifier	 copy To Raster By Blocks
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
wrR	TokenNameIdentifier	 wr R
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tx0	TokenNameIdentifier	 tx0
=	TokenNameEQUAL	
getXTile	TokenNameIdentifier	 get X Tile
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ty0	TokenNameIdentifier	 ty0
=	TokenNameEQUAL	
getYTile	TokenNameIdentifier	 get Y Tile
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tx1	TokenNameIdentifier	 tx1
=	TokenNameEQUAL	
getXTile	TokenNameIdentifier	 get X Tile
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
wrR	TokenNameIdentifier	 wr R
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
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
wrR	TokenNameIdentifier	 wr R
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
// System.out.println("WR: " + wrR); 	TokenNameCOMMENT_LINE	System.out.println("WR: " + wrR); 
// System.out.println("ME: " + bounds); 	TokenNameCOMMENT_LINE	System.out.println("ME: " + bounds); 
int	TokenNameint	
insideTx0	TokenNameIdentifier	 inside Tx0
=	TokenNameEQUAL	
tx0	TokenNameIdentifier	 tx0
;	TokenNameSEMICOLON	
int	TokenNameint	
insideTx1	TokenNameIdentifier	 inside Tx1
=	TokenNameEQUAL	
tx1	TokenNameIdentifier	 tx1
;	TokenNameSEMICOLON	
int	TokenNameint	
insideTy0	TokenNameIdentifier	 inside Ty0
=	TokenNameEQUAL	
ty0	TokenNameIdentifier	 ty0
;	TokenNameSEMICOLON	
int	TokenNameint	
insideTy1	TokenNameIdentifier	 inside Ty1
=	TokenNameEQUAL	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
// Now figure out what tiles lie completely inside wr... 	TokenNameCOMMENT_LINE	Now figure out what tiles lie completely inside wr... 
int	TokenNameint	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
;	TokenNameSEMICOLON	
tx	TokenNameIdentifier	 tx
=	TokenNameEQUAL	
tx0	TokenNameIdentifier	 tx0
*	TokenNameMULTIPLY	
tileWidth	TokenNameIdentifier	 tile Width
+	TokenNamePLUS	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
<	TokenNameLESS	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// Partial tile off the left. 	TokenNameCOMMENT_LINE	Partial tile off the left. 
insideTx0	TokenNameIdentifier	 inside Tx0
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ty	TokenNameIdentifier	 ty
=	TokenNameEQUAL	
ty0	TokenNameIdentifier	 ty0
*	TokenNameMULTIPLY	
tileHeight	TokenNameIdentifier	 tile Height
+	TokenNamePLUS	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ty	TokenNameIdentifier	 ty
<	TokenNameLESS	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
!=	TokenNameNOT_EQUAL	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// Partial tile off the top. 	TokenNameCOMMENT_LINE	Partial tile off the top. 
insideTy0	TokenNameIdentifier	 inside Ty0
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
tx	TokenNameIdentifier	 tx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tx1	TokenNameIdentifier	 tx1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tileWidth	TokenNameIdentifier	 tile Width
+	TokenNamePLUS	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// Partial tile off right 	TokenNameCOMMENT_LINE	Partial tile off right 
insideTx1	TokenNameIdentifier	 inside Tx1
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
ty	TokenNameIdentifier	 ty
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ty1	TokenNameIdentifier	 ty1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tileHeight	TokenNameIdentifier	 tile Height
+	TokenNamePLUS	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ty	TokenNameIdentifier	 ty
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// Partial tile off bottom 	TokenNameCOMMENT_LINE	Partial tile off bottom 
insideTy1	TokenNameIdentifier	 inside Ty1
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
xtiles	TokenNameIdentifier	 xtiles
=	TokenNameEQUAL	
insideTx1	TokenNameIdentifier	 inside Tx1
-	TokenNameMINUS	
insideTx0	TokenNameIdentifier	 inside Tx0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
ytiles	TokenNameIdentifier	 ytiles
=	TokenNameEQUAL	
insideTy1	TokenNameIdentifier	 inside Ty1
-	TokenNameMINUS	
insideTy0	TokenNameIdentifier	 inside Ty0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
occupied	TokenNameIdentifier	 occupied
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xtiles	TokenNameIdentifier	 xtiles
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ytiles	TokenNameIdentifier	 ytiles
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
occupied	TokenNameIdentifier	 occupied
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
xtiles	TokenNameIdentifier	 xtiles
*	TokenNameMULTIPLY	
ytiles	TokenNameIdentifier	 ytiles
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
got	TokenNameIdentifier	 got
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tx1	TokenNameIdentifier	 tx1
-	TokenNameMINUS	
tx0	TokenNameIdentifier	 tx0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
ty1	TokenNameIdentifier	 ty1
-	TokenNameMINUS	
ty0	TokenNameIdentifier	 ty0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
numFound	TokenNameIdentifier	 num Found
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Collect all the tiles that we currently have in cache... 	TokenNameCOMMENT_LINE	Collect all the tiles that we currently have in cache... 
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
{	TokenNameLBRACE	
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
ras	TokenNameIdentifier	 ras
=	TokenNameEQUAL	
tiles	TokenNameIdentifier	 tiles
.	TokenNameDOT	
getTileNoCompute	TokenNameIdentifier	 get Tile No Compute
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
>=	TokenNameGREATER_EQUAL	
insideTy0	TokenNameIdentifier	 inside Ty0
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<=	TokenNameLESS_EQUAL	
insideTy1	TokenNameIdentifier	 inside Ty1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
insideTx0	TokenNameIdentifier	 inside Tx0
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<=	TokenNameLESS_EQUAL	
insideTx1	TokenNameIdentifier	 inside Tx1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
occupied	TokenNameIdentifier	 occupied
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
insideTx0	TokenNameIdentifier	 inside Tx0
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
insideTy0	TokenNameIdentifier	 inside Ty0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xtiles	TokenNameIdentifier	 xtiles
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
found	TokenNameIdentifier	 found
;	TokenNameSEMICOLON	
else	TokenNameelse	
got	TokenNameIdentifier	 got
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
found	TokenNameIdentifier	 found
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
numFound	TokenNameIdentifier	 num Found
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is_INT_PACK	TokenNameIdentifier	 is  INT  PACK
)	TokenNameRPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData_INT_PACK	TokenNameIdentifier	 copy Data  INT  PACK
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData_FALLBACK	TokenNameIdentifier	 copy Data  FALLBACK
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("Found: " + numFound + " out of " + 	TokenNameCOMMENT_LINE	System.out.println("Found: " + numFound + " out of " + 
// ((tx1-tx0+1)*(ty1-ty0+1))); 	TokenNameCOMMENT_LINE	((tx1-tx0+1)*(ty1-ty0+1))); 
// Compute the stuff from the middle in the largest possible Chunks. 	TokenNameCOMMENT_LINE	Compute the stuff from the middle in the largest possible Chunks. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xtiles	TokenNameIdentifier	 xtiles
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ytiles	TokenNameIdentifier	 ytiles
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TileBlock	TokenNameIdentifier	 Tile Block
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
new	TokenNamenew	
TileBlock	TokenNameIdentifier	 Tile Block
(	TokenNameLPAREN	
insideTx0	TokenNameIdentifier	 inside Tx0
,	TokenNameCOMMA	
insideTy0	TokenNameIdentifier	 inside Ty0
,	TokenNameCOMMA	
xtiles	TokenNameIdentifier	 xtiles
,	TokenNameCOMMA	
ytiles	TokenNameIdentifier	 ytiles
,	TokenNameCOMMA	
occupied	TokenNameIdentifier	 occupied
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
xtiles	TokenNameIdentifier	 xtiles
,	TokenNameCOMMA	
ytiles	TokenNameIdentifier	 ytiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Starting Splits"); 	TokenNameCOMMENT_LINE	System.out.println("Starting Splits"); 
drawBlock	TokenNameIdentifier	 draw Block
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Exception e= new Exception("Foo"); 	TokenNameCOMMENT_LINE	Exception e= new Exception("Foo"); 
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
}	TokenNameRBRACE	
// Check If we should halt early. 	TokenNameCOMMENT_LINE	Check If we should halt early. 
Thread	TokenNameIdentifier	 Thread
currentThread	TokenNameIdentifier	 current Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Fill in the ones that weren't in the cache. 	TokenNameCOMMENT_LINE	Fill in the ones that weren't in the cache. 
for	TokenNamefor	
(	TokenNameLPAREN	
ty	TokenNameIdentifier	 ty
=	TokenNameEQUAL	
ty0	TokenNameIdentifier	 ty0
;	TokenNameSEMICOLON	
ty	TokenNameIdentifier	 ty
<=	TokenNameLESS_EQUAL	
ty1	TokenNameIdentifier	 ty1
;	TokenNameSEMICOLON	
ty	TokenNameIdentifier	 ty
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
=	TokenNameEQUAL	
tx0	TokenNameIdentifier	 tx0
;	TokenNameSEMICOLON	
tx	TokenNameIdentifier	 tx
<=	TokenNameLESS_EQUAL	
tx1	TokenNameIdentifier	 tx1
;	TokenNameSEMICOLON	
tx	TokenNameIdentifier	 tx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// At least touch the tile... 	TokenNameCOMMENT_LINE	At least touch the tile... 
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
=	TokenNameEQUAL	
tiles	TokenNameIdentifier	 tiles
.	TokenNameDOT	
getTileNoCompute	TokenNameIdentifier	 get Tile No Compute
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ty	TokenNameIdentifier	 ty
>=	TokenNameGREATER_EQUAL	
insideTy0	TokenNameIdentifier	 inside Ty0
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ty	TokenNameIdentifier	 ty
<=	TokenNameLESS_EQUAL	
insideTy1	TokenNameIdentifier	 inside Ty1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
>=	TokenNameGREATER_EQUAL	
insideTx0	TokenNameIdentifier	 inside Tx0
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
<=	TokenNameLESS_EQUAL	
insideTx1	TokenNameIdentifier	 inside Tx1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Fill the tile from wr (since wr is full now 	TokenNameCOMMENT_LINE	Fill the tile from wr (since wr is full now 
// at least in the middle). 	TokenNameCOMMENT_LINE	at least in the middle). 
WritableRaster	TokenNameIdentifier	 Writable Raster
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
makeTile	TokenNameIdentifier	 make Tile
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
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
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
tile	TokenNameIdentifier	 tile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData_FALLBACK	TokenNameIdentifier	 copy Data  FALLBACK
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
tile	TokenNameIdentifier	 tile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tiles	TokenNameIdentifier	 tiles
.	TokenNameDOT	
setTile	TokenNameIdentifier	 set Tile
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
,	TokenNameCOMMA	
tile	TokenNameIdentifier	 tile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
got	TokenNameIdentifier	 got
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// System.out.println("Computing : " + x + "," + y); 	TokenNameCOMMENT_LINE	System.out.println("Computing : " + x + "," + y); 
ras	TokenNameIdentifier	 ras
=	TokenNameEQUAL	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute the tile.. 	TokenNameCOMMENT_LINE	Compute the tile.. 
// Check If we should halt early. 	TokenNameCOMMENT_LINE	Check If we should halt early. 
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
currentThread	TokenNameIdentifier	 current Thread
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is_INT_PACK	TokenNameIdentifier	 is  INT  PACK
)	TokenNameRPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData_INT_PACK	TokenNameIdentifier	 copy Data  INT  PACK
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData_FALLBACK	TokenNameIdentifier	 copy Data  FALLBACK
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("Ending Computation: " + this); 	TokenNameCOMMENT_LINE	System.out.println("Ending Computation: " + this); 
}	TokenNameRBRACE	
/** * Copies data from this images tile grid into wr. wr may * extend outside the bounds of this image in which case the * data in wr outside the bounds will not be touched. * @param wr Raster to fill with image data. */	TokenNameCOMMENT_JAVADOC	 Copies data from this images tile grid into wr. wr may extend outside the bounds of this image in which case the data in wr outside the bounds will not be touched. @param wr Raster to fill with image data. 
public	TokenNamepublic	
void	TokenNamevoid	
copyToRaster	TokenNameIdentifier	 copy To Raster
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
wrR	TokenNameIdentifier	 wr R
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tx0	TokenNameIdentifier	 tx0
=	TokenNameEQUAL	
getXTile	TokenNameIdentifier	 get X Tile
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ty0	TokenNameIdentifier	 ty0
=	TokenNameEQUAL	
getYTile	TokenNameIdentifier	 get Y Tile
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tx1	TokenNameIdentifier	 tx1
=	TokenNameEQUAL	
getXTile	TokenNameIdentifier	 get X Tile
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
wrR	TokenNameIdentifier	 wr R
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
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
wrR	TokenNameIdentifier	 wr R
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
int	TokenNameint	
xtiles	TokenNameIdentifier	 xtiles
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tx1	TokenNameIdentifier	 tx1
-	TokenNameMINUS	
tx0	TokenNameIdentifier	 tx0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
got	TokenNameIdentifier	 got
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
xtiles	TokenNameIdentifier	 xtiles
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
ty1	TokenNameIdentifier	 ty1
-	TokenNameMINUS	
ty0	TokenNameIdentifier	 ty0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Run through and get the tiles that are just sitting in the 	TokenNameCOMMENT_LINE	Run through and get the tiles that are just sitting in the 
// cache... 	TokenNameCOMMENT_LINE	cache... 
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
tiles	TokenNameIdentifier	 tiles
.	TokenNameDOT	
getTileNoCompute	TokenNameIdentifier	 get Tile No Compute
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Not there. 	TokenNameCOMMENT_LINE	Not there. 
got	TokenNameIdentifier	 got
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
tx0	TokenNameIdentifier	 tx0
+	TokenNamePLUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
ty0	TokenNameIdentifier	 ty0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xtiles	TokenNameIdentifier	 xtiles
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
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
// Run through and pick up the ones we need to compute... 	TokenNameCOMMENT_LINE	Run through and pick up the ones we need to compute... 
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
if	TokenNameif	
(	TokenNameLPAREN	
got	TokenNameIdentifier	 got
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
tx0	TokenNameIdentifier	 tx0
+	TokenNamePLUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
ty0	TokenNameIdentifier	 ty0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xtiles	TokenNameIdentifier	 xtiles
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// already have. 	TokenNameCOMMENT_LINE	already have. 
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
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
drawBlock	TokenNameIdentifier	 draw Block
(	TokenNameLPAREN	
TileBlock	TokenNameIdentifier	 Tile Block
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TileBlock	TokenNameIdentifier	 Tile Block
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blocks	TokenNameIdentifier	 blocks
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
.	TokenNameDOT	
getBestSplit	TokenNameIdentifier	 get Best Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
drawBlockInPlace	TokenNameIdentifier	 draw Block In Place
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
drawBlockAndCopy	TokenNameIdentifier	 draw Block And Copy
(	TokenNameLPAREN	
TileBlock	TokenNameIdentifier	 Tile Block
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blocks	TokenNameIdentifier	 blocks
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TileBlock	TokenNameIdentifier	 Tile Block
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getXLoc	TokenNameIdentifier	 get X Loc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tileWidth	TokenNameIdentifier	 tile Width
+	TokenNamePLUS	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
;	TokenNameSEMICOLON	
int	TokenNameint	
yloc	TokenNameIdentifier	 yloc
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getYLoc	TokenNameIdentifier	 get Y Loc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tileHeight	TokenNameIdentifier	 tile Height
+	TokenNamePLUS	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
==	TokenNameEQUAL_EQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
yloc	TokenNameIdentifier	 yloc
==	TokenNameEQUAL_EQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Safe to draw in place... 	TokenNameCOMMENT_LINE	Safe to draw in place... 
drawBlockInPlace	TokenNameIdentifier	 draw Block In Place
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
workTileWidth	TokenNameIdentifier	 work Tile Width
=	TokenNameEQUAL	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
// local is cheaper 	TokenNameCOMMENT_LINE	local is cheaper 
int	TokenNameint	
workTileHeight	TokenNameIdentifier	 work Tile Height
=	TokenNameEQUAL	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
// local is cheaper 	TokenNameCOMMENT_LINE	local is cheaper 
int	TokenNameint	
maxTileSize	TokenNameIdentifier	 max Tile Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TileBlock	TokenNameIdentifier	 Tile Block
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileWidth	TokenNameIdentifier	 work Tile Width
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileHeight	TokenNameIdentifier	 work Tile Height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
>	TokenNameGREATER	
maxTileSize	TokenNameIdentifier	 max Tile Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxTileSize	TokenNameIdentifier	 max Tile Size
=	TokenNameEQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dbi	TokenNameIdentifier	 dbi
=	TokenNameEQUAL	
new	TokenNamenew	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
(	TokenNameLPAREN	
maxTileSize	TokenNameIdentifier	 max Tile Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
masks	TokenNameIdentifier	 masks
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x00FF0000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0000FF00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000000FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF000000	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
use_INT_PACK	TokenNameIdentifier	 use  INT  PACK
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
is_INT_PACK_Data	TokenNameIdentifier	 is  INT  PACK  Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// cache for reuse in hasBeenHalted() 	TokenNameCOMMENT_LINE	cache for reuse in hasBeenHalted() 
Thread	TokenNameIdentifier	 Thread
currentThread	TokenNameIdentifier	 current Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TileBlock	TokenNameIdentifier	 Tile Block
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getXLoc	TokenNameIdentifier	 get X Loc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileWidth	TokenNameIdentifier	 work Tile Width
+	TokenNamePLUS	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
;	TokenNameSEMICOLON	
int	TokenNameint	
yloc	TokenNameIdentifier	 yloc
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getYLoc	TokenNameIdentifier	 get Y Loc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileHeight	TokenNameIdentifier	 work Tile Height
+	TokenNamePLUS	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
tb	TokenNameIdentifier	 tb
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
,	TokenNameCOMMA	
yloc	TokenNameIdentifier	 yloc
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileWidth	TokenNameIdentifier	 work Tile Width
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileHeight	TokenNameIdentifier	 work Tile Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tb	TokenNameIdentifier	 tb
=	TokenNameEQUAL	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point	TokenNameIdentifier	 Point
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
Raster	TokenNameIdentifier	 Raster
.	TokenNameDOT	
createPackedRaster	TokenNameIdentifier	 create Packed Raster
(	TokenNameLPAREN	
dbi	TokenNameIdentifier	 dbi
,	TokenNameCOMMA	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genRect	TokenNameIdentifier	 gen Rect
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_INT_PACK	TokenNameIdentifier	 use  INT  PACK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData_INT_PACK	TokenNameIdentifier	 copy Data  INT  PACK
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData_FALLBACK	TokenNameIdentifier	 copy Data  FALLBACK
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check If we should halt early. 	TokenNameCOMMENT_LINE	Check If we should halt early. 
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
currentThread	TokenNameIdentifier	 current Thread
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
drawBlockInPlace	TokenNameIdentifier	 draw Block In Place
(	TokenNameLPAREN	
TileBlock	TokenNameIdentifier	 Tile Block
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blocks	TokenNameIdentifier	 blocks
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Ending Splits: " + blocks.length); 	TokenNameCOMMENT_LINE	System.out.println("Ending Splits: " + blocks.length); 
// cache for reuse in hasBeenHalted() 	TokenNameCOMMENT_LINE	cache for reuse in hasBeenHalted() 
Thread	TokenNameIdentifier	 Thread
currentThread	TokenNameIdentifier	 current Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
workTileWidth	TokenNameIdentifier	 work Tile Width
=	TokenNameEQUAL	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
// local is cheaper 	TokenNameCOMMENT_LINE	local is cheaper 
int	TokenNameint	
workTileHeight	TokenNameIdentifier	 work Tile Height
=	TokenNameEQUAL	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
// local is cheaper 	TokenNameCOMMENT_LINE	local is cheaper 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TileBlock	TokenNameIdentifier	 Tile Block
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// System.out.println("Block " + i + ":\n" + curr); 	TokenNameCOMMENT_LINE	System.out.println("Block " + i + ":\n" + curr); 
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getXLoc	TokenNameIdentifier	 get X Loc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileWidth	TokenNameIdentifier	 work Tile Width
+	TokenNamePLUS	
tileGridXOff	TokenNameIdentifier	 tile Grid X Off
;	TokenNameSEMICOLON	
int	TokenNameint	
yloc	TokenNameIdentifier	 yloc
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getYLoc	TokenNameIdentifier	 get Y Loc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileHeight	TokenNameIdentifier	 work Tile Height
+	TokenNamePLUS	
tileGridYOff	TokenNameIdentifier	 tile Grid Y Off
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
tb	TokenNameIdentifier	 tb
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
,	TokenNameCOMMA	
yloc	TokenNameIdentifier	 yloc
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileWidth	TokenNameIdentifier	 work Tile Width
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
workTileHeight	TokenNameIdentifier	 work Tile Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tb	TokenNameIdentifier	 tb
=	TokenNameEQUAL	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
createWritableChild	TokenNameIdentifier	 create Writable Child
(	TokenNameLPAREN	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Computing : " + child); 	TokenNameCOMMENT_LINE	System.out.println("Computing : " + child); 
genRect	TokenNameIdentifier	 gen Rect
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check If we should halt early. 	TokenNameCOMMENT_LINE	Check If we should halt early. 
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
currentThread	TokenNameIdentifier	 current Thread
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
