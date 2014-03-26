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
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
Vector	TokenNameIdentifier	 Vector
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
/** * A simple class implemented the <code>RenderedImage</code> * interface. Only the <code>getTile()</code> method needs to be * implemented by subclasses. The instance variables must also be * filled in properly. * * <p> Normally in JAI <code>PlanarImage</code> is used for this * purpose, but in the interest of modularity the * use of <code>PlanarImage</code> has been avoided. * * @version $Id: SimpleRenderedImage.java 498747 2007-01-22 18:56:19Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A simple class implemented the <code>RenderedImage</code> interface. Only the <code>getTile()</code> method needs to be implemented by subclasses. The instance variables must also be filled in properly. * <p> Normally in JAI <code>PlanarImage</code> is used for this purpose, but in the interest of modularity the use of <code>PlanarImage</code> has been avoided. * @version $Id: SimpleRenderedImage.java 498747 2007-01-22 18:56:19Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SimpleRenderedImage	TokenNameIdentifier	 Simple Rendered Image
implements	TokenNameimplements	
RenderedImage	TokenNameIdentifier	 Rendered Image
{	TokenNameLBRACE	
/** The X coordinate of the image's upper-left pixel. */	TokenNameCOMMENT_JAVADOC	 The X coordinate of the image's upper-left pixel. 
protected	TokenNameprotected	
int	TokenNameint	
minX	TokenNameIdentifier	 min X
;	TokenNameSEMICOLON	
/** The Y coordinate of the image's upper-left pixel. */	TokenNameCOMMENT_JAVADOC	 The Y coordinate of the image's upper-left pixel. 
protected	TokenNameprotected	
int	TokenNameint	
minY	TokenNameIdentifier	 min Y
;	TokenNameSEMICOLON	
/** The image's width in pixels. */	TokenNameCOMMENT_JAVADOC	 The image's width in pixels. 
protected	TokenNameprotected	
int	TokenNameint	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
/** The image's height in pixels. */	TokenNameCOMMENT_JAVADOC	 The image's height in pixels. 
protected	TokenNameprotected	
int	TokenNameint	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
/** The width of a tile. */	TokenNameCOMMENT_JAVADOC	 The width of a tile. 
protected	TokenNameprotected	
int	TokenNameint	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
/** The height of a tile. */	TokenNameCOMMENT_JAVADOC	 The height of a tile. 
protected	TokenNameprotected	
int	TokenNameint	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
/** The X coordinate of the upper-left pixel of tile (0, 0). */	TokenNameCOMMENT_JAVADOC	 The X coordinate of the upper-left pixel of tile (0, 0). 
protected	TokenNameprotected	
int	TokenNameint	
tileGridXOffset	TokenNameIdentifier	 tile Grid X Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The Y coordinate of the upper-left pixel of tile (0, 0). */	TokenNameCOMMENT_JAVADOC	 The Y coordinate of the upper-left pixel of tile (0, 0). 
protected	TokenNameprotected	
int	TokenNameint	
tileGridYOffset	TokenNameIdentifier	 tile Grid Y Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The image's SampleModel. */	TokenNameCOMMENT_JAVADOC	 The image's SampleModel. 
protected	TokenNameprotected	
SampleModel	TokenNameIdentifier	 Sample Model
sampleModel	TokenNameIdentifier	 sample Model
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The image's ColorModel. */	TokenNameCOMMENT_JAVADOC	 The image's ColorModel. 
protected	TokenNameprotected	
ColorModel	TokenNameIdentifier	 Color Model
colorModel	TokenNameIdentifier	 color Model
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The image's sources, stored in a Vector. */	TokenNameCOMMENT_JAVADOC	 The image's sources, stored in a Vector. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
sources	TokenNameIdentifier	 sources
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A Hashtable containing the image properties. */	TokenNameCOMMENT_JAVADOC	 A Hashtable containing the image properties. 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleRenderedImage	TokenNameIdentifier	 Simple Rendered Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Returns the X coordinate of the leftmost column of the image. */	TokenNameCOMMENT_JAVADOC	 Returns the X coordinate of the leftmost column of the image. 
public	TokenNamepublic	
int	TokenNameint	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minX	TokenNameIdentifier	 min X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the X coordinate of the column immediatetely to the * right of the rightmost column of the image. getMaxX() is * implemented in terms of getMinX() and getWidth() and so does * not need to be implemented by subclasses. */	TokenNameCOMMENT_JAVADOC	 Returns the X coordinate of the column immediatetely to the right of the rightmost column of the image. getMaxX() is implemented in terms of getMinX() and getWidth() and so does not need to be implemented by subclasses. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getMaxX	TokenNameIdentifier	 get Max X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the X coordinate of the uppermost row of the image. */	TokenNameCOMMENT_JAVADOC	 Returns the X coordinate of the uppermost row of the image. 
public	TokenNamepublic	
int	TokenNameint	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minY	TokenNameIdentifier	 min Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Y coordinate of the row immediately below the * bottom row of the image. getMaxY() is implemented in terms of * getMinY() and getHeight() and so does not need to be * implemented by subclasses. */	TokenNameCOMMENT_JAVADOC	 Returns the Y coordinate of the row immediately below the bottom row of the image. getMaxY() is implemented in terms of getMinY() and getHeight() and so does not need to be implemented by subclasses. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getMaxY	TokenNameIdentifier	 get Max Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the width of the image. */	TokenNameCOMMENT_JAVADOC	 Returns the width of the image. 
public	TokenNamepublic	
int	TokenNameint	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the height of the image. */	TokenNameCOMMENT_JAVADOC	 Returns the height of the image. 
public	TokenNamepublic	
int	TokenNameint	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a Rectangle indicating the image bounds. */	TokenNameCOMMENT_JAVADOC	 Returns a Rectangle indicating the image bounds. 
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the width of a tile. */	TokenNameCOMMENT_JAVADOC	 Returns the width of a tile. 
public	TokenNamepublic	
int	TokenNameint	
getTileWidth	TokenNameIdentifier	 get Tile Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the height of a tile. */	TokenNameCOMMENT_JAVADOC	 Returns the height of a tile. 
public	TokenNamepublic	
int	TokenNameint	
getTileHeight	TokenNameIdentifier	 get Tile Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the X coordinate of the upper-left pixel of tile (0, 0). */	TokenNameCOMMENT_JAVADOC	 Returns the X coordinate of the upper-left pixel of tile (0, 0). 
public	TokenNamepublic	
int	TokenNameint	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tileGridXOffset	TokenNameIdentifier	 tile Grid X Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Y coordinate of the upper-left pixel of tile (0, 0). */	TokenNameCOMMENT_JAVADOC	 Returns the Y coordinate of the upper-left pixel of tile (0, 0). 
public	TokenNamepublic	
int	TokenNameint	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tileGridYOffset	TokenNameIdentifier	 tile Grid Y Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the horizontal index of the leftmost column of tiles. * getMinTileX() is implemented in terms of getMinX() * and so does not need to be implemented by subclasses. */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal index of the leftmost column of tiles. getMinTileX() is implemented in terms of getMinX() and so does not need to be implemented by subclasses. 
public	TokenNamepublic	
int	TokenNameint	
getMinTileX	TokenNameIdentifier	 get Min Tile X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XToTileX	TokenNameIdentifier	 X To Tile X
(	TokenNameLPAREN	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the horizontal index of the rightmost column of tiles. * getMaxTileX() is implemented in terms of getMaxX() * and so does not need to be implemented by subclasses. */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal index of the rightmost column of tiles. getMaxTileX() is implemented in terms of getMaxX() and so does not need to be implemented by subclasses. 
public	TokenNamepublic	
int	TokenNameint	
getMaxTileX	TokenNameIdentifier	 get Max Tile X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XToTileX	TokenNameIdentifier	 X To Tile X
(	TokenNameLPAREN	
getMaxX	TokenNameIdentifier	 get Max X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of tiles along the tile grid in the * horizontal direction. getNumXTiles() is implemented in terms * of getMinTileX() and getMaxTileX() and so does not need to be * implemented by subclasses. */	TokenNameCOMMENT_JAVADOC	 Returns the number of tiles along the tile grid in the horizontal direction. getNumXTiles() is implemented in terms of getMinTileX() and getMaxTileX() and so does not need to be implemented by subclasses. 
public	TokenNamepublic	
int	TokenNameint	
getNumXTiles	TokenNameIdentifier	 get Num X Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getMaxTileX	TokenNameIdentifier	 get Max Tile X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
getMinTileX	TokenNameIdentifier	 get Min Tile X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vertical index of the uppermost row of tiles. getMinTileY() * is implemented in terms of getMinY() and so does not need to be * implemented by subclasses. */	TokenNameCOMMENT_JAVADOC	 Returns the vertical index of the uppermost row of tiles. getMinTileY() is implemented in terms of getMinY() and so does not need to be implemented by subclasses. 
public	TokenNamepublic	
int	TokenNameint	
getMinTileY	TokenNameIdentifier	 get Min Tile Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
YToTileY	TokenNameIdentifier	 Y To Tile Y
(	TokenNameLPAREN	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vertical index of the bottom row of tiles. getMaxTileY() * is implemented in terms of getMaxY() and so does not need to * be implemented by subclasses. */	TokenNameCOMMENT_JAVADOC	 Returns the vertical index of the bottom row of tiles. getMaxTileY() is implemented in terms of getMaxY() and so does not need to be implemented by subclasses. 
public	TokenNamepublic	
int	TokenNameint	
getMaxTileY	TokenNameIdentifier	 get Max Tile Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
YToTileY	TokenNameIdentifier	 Y To Tile Y
(	TokenNameLPAREN	
getMaxY	TokenNameIdentifier	 get Max Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of tiles along the tile grid in the vertical * direction. getNumYTiles() is implemented in terms * of getMinTileY() and getMaxTileY() and so does not need to be * implemented by subclasses. */	TokenNameCOMMENT_JAVADOC	 Returns the number of tiles along the tile grid in the vertical direction. getNumYTiles() is implemented in terms of getMinTileY() and getMaxTileY() and so does not need to be implemented by subclasses. 
public	TokenNamepublic	
int	TokenNameint	
getNumYTiles	TokenNameIdentifier	 get Num Y Tiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getMaxTileY	TokenNameIdentifier	 get Max Tile Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
getMinTileY	TokenNameIdentifier	 get Min Tile Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the SampleModel of the image. */	TokenNameCOMMENT_JAVADOC	 Returns the SampleModel of the image. 
public	TokenNamepublic	
SampleModel	TokenNameIdentifier	 Sample Model
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sampleModel	TokenNameIdentifier	 sample Model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the ColorModel of the image. */	TokenNameCOMMENT_JAVADOC	 Returns the ColorModel of the image. 
public	TokenNamepublic	
ColorModel	TokenNameIdentifier	 Color Model
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
colorModel	TokenNameIdentifier	 color Model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a property from the property set of this image. If the * property name is not recognized, <code>null</code> will be returned. * * @param name the name of the property to get, as a * <code>String</code>. * @return a reference to the property * <code>Object</code>, or the value <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Gets a property from the property set of this image. If the property name is not recognized, <code>null</code> will be returned. * @param name the name of the property to get, as a <code>String</code>. @return a reference to the property <code>Object</code>, or the value <code>null</code> 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a list of the properties recognized by this image. If * no properties are available, an empty String[] will be returned. * * @return an array of <code>String</code>s representing valid * property names. */	TokenNameCOMMENT_JAVADOC	 Returns a list of the properties recognized by this image. If no properties are available, an empty String[] will be returned. * @return an array of <code>String</code>s representing valid property names. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPropertyNames	TokenNameIdentifier	 get Property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// int index = 0; 	TokenNameCOMMENT_LINE	int index = 0; 
// 	TokenNameCOMMENT_LINE	 
// Enumeration e = properties.keys(); 	TokenNameCOMMENT_LINE	Enumeration e = properties.keys(); 
// while (e.hasMoreElements()) { 	TokenNameCOMMENT_LINE	while (e.hasMoreElements()) { 
// String name = (String)e.nextElement(); 	TokenNameCOMMENT_LINE	String name = (String)e.nextElement(); 
// names[index++] = name; 	TokenNameCOMMENT_LINE	names[index++] = name; 
// } 	TokenNameCOMMENT_LINE	} 
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
names	TokenNameIdentifier	 names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of <code>String</code>s recognized as names by * this property source that begin with the supplied prefix. If * no property names match, <code>null</code> will be returned. * The comparison is done in a case-independent manner. * * <p> The default implementation calls * <code>getPropertyNames()</code> and searches the list of names * for matches. * * @return an array of <code>String</code>s giving the valid * property names (can be null). */	TokenNameCOMMENT_JAVADOC	 Returns an array of <code>String</code>s recognized as names by this property source that begin with the supplied prefix. If no property names match, <code>null</code> will be returned. The comparison is done in a case-independent manner. * <p> The default implementation calls <code>getPropertyNames()</code> and searches the list of names for matches. * @return an array of <code>String</code>s giving the valid property names (can be null). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPropertyNames	TokenNameIdentifier	 get Property Names
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
propertyNames	TokenNameIdentifier	 property Names
=	TokenNameEQUAL	
getPropertyNames	TokenNameIdentifier	 get Property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propertyNames	TokenNameIdentifier	 property Names
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
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
propertyNames	TokenNameIdentifier	 property Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
propertyNames	TokenNameIdentifier	 property Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
propertyNames	TokenNameIdentifier	 property Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Copy the strings from the Vector over to a String array. 	TokenNameCOMMENT_LINE	Copy the strings from the Vector over to a String array. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefixNames	TokenNameIdentifier	 prefix Names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// int count = 0; 	TokenNameCOMMENT_LINE	int count = 0; 
// for (Iterator it = names.iterator(); it.hasNext(); ) { // todo xx.toArray() 	TokenNameCOMMENT_LINE	for (Iterator it = names.iterator(); it.hasNext(); ) { // todo xx.toArray() 
// prefixNames[count++] = (String)it.next(); 	TokenNameCOMMENT_LINE	prefixNames[count++] = (String)it.next(); 
// } 	TokenNameCOMMENT_LINE	} 
names	TokenNameIdentifier	 names
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
prefixNames	TokenNameIdentifier	 prefix Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
prefixNames	TokenNameIdentifier	 prefix Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Utility methods. 	TokenNameCOMMENT_LINE	Utility methods. 
/** * Converts a pixel's X coordinate into a horizontal tile index * relative to a given tile grid layout specified by its X offset * and tile width. */	TokenNameCOMMENT_JAVADOC	 Converts a pixel's X coordinate into a horizontal tile index relative to a given tile grid layout specified by its X offset and tile width. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
XToTileX	TokenNameIdentifier	 X To Tile X
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
tileGridXOffset	TokenNameIdentifier	 tile Grid X Offset
,	TokenNameCOMMA	
int	TokenNameint	
tileWidth	TokenNameIdentifier	 tile Width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
-=	TokenNameMINUS_EQUAL	
tileGridXOffset	TokenNameIdentifier	 tile Grid X Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
// Force round to -infinity 	TokenNameCOMMENT_LINE	Force round to -infinity 
}	TokenNameRBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
/	TokenNameDIVIDE	
tileWidth	TokenNameIdentifier	 tile Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a pixel's Y coordinate into a vertical tile index * relative to a given tile grid layout specified by its Y offset * and tile height. */	TokenNameCOMMENT_JAVADOC	 Converts a pixel's Y coordinate into a vertical tile index relative to a given tile grid layout specified by its Y offset and tile height. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
YToTileY	TokenNameIdentifier	 Y To Tile Y
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
tileGridYOffset	TokenNameIdentifier	 tile Grid Y Offset
,	TokenNameCOMMA	
int	TokenNameint	
tileHeight	TokenNameIdentifier	 tile Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
y	TokenNameIdentifier	 y
-=	TokenNameMINUS_EQUAL	
tileGridYOffset	TokenNameIdentifier	 tile Grid Y Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
// Force round to -infinity 	TokenNameCOMMENT_LINE	Force round to -infinity 
}	TokenNameRBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
/	TokenNameDIVIDE	
tileHeight	TokenNameIdentifier	 tile Height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a pixel's X coordinate into a horizontal tile index. * This is a convenience method. No attempt is made to detect * out-of-range coordinates. * * @param x the X coordinate of a pixel. * @return the X index of the tile containing the pixel. */	TokenNameCOMMENT_JAVADOC	 Converts a pixel's X coordinate into a horizontal tile index. This is a convenience method. No attempt is made to detect out-of-range coordinates. * @param x the X coordinate of a pixel. @return the X index of the tile containing the pixel. 
public	TokenNamepublic	
int	TokenNameint	
XToTileX	TokenNameIdentifier	 X To Tile X
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XToTileX	TokenNameIdentifier	 X To Tile X
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getTileWidth	TokenNameIdentifier	 get Tile Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a pixel's Y coordinate into a vertical tile index. * This is a convenience method. No attempt is made to detect * out-of-range coordinates. * * @param y the Y coordinate of a pixel. * @return the Y index of the tile containing the pixel. */	TokenNameCOMMENT_JAVADOC	 Converts a pixel's Y coordinate into a vertical tile index. This is a convenience method. No attempt is made to detect out-of-range coordinates. * @param y the Y coordinate of a pixel. @return the Y index of the tile containing the pixel. 
public	TokenNamepublic	
int	TokenNameint	
YToTileY	TokenNameIdentifier	 Y To Tile Y
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
YToTileY	TokenNameIdentifier	 Y To Tile Y
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getTileHeight	TokenNameIdentifier	 get Tile Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a horizontal tile index into the X coordinate of its * upper left pixel relative to a given tile grid layout specified * by its X offset and tile width. */	TokenNameCOMMENT_JAVADOC	 Converts a horizontal tile index into the X coordinate of its upper left pixel relative to a given tile grid layout specified by its X offset and tile width. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
tileXToX	TokenNameIdentifier	 tile X To X
(	TokenNameLPAREN	
int	TokenNameint	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
int	TokenNameint	
tileGridXOffset	TokenNameIdentifier	 tile Grid X Offset
,	TokenNameCOMMA	
int	TokenNameint	
tileWidth	TokenNameIdentifier	 tile Width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tx	TokenNameIdentifier	 tx
*	TokenNameMULTIPLY	
tileWidth	TokenNameIdentifier	 tile Width
+	TokenNamePLUS	
tileGridXOffset	TokenNameIdentifier	 tile Grid X Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a vertical tile index into the Y coordinate of * its upper left pixel relative to a given tile grid layout * specified by its Y offset and tile height. */	TokenNameCOMMENT_JAVADOC	 Converts a vertical tile index into the Y coordinate of its upper left pixel relative to a given tile grid layout specified by its Y offset and tile height. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
tileYToY	TokenNameIdentifier	 tile Y To Y
(	TokenNameLPAREN	
int	TokenNameint	
ty	TokenNameIdentifier	 ty
,	TokenNameCOMMA	
int	TokenNameint	
tileGridYOffset	TokenNameIdentifier	 tile Grid Y Offset
,	TokenNameCOMMA	
int	TokenNameint	
tileHeight	TokenNameIdentifier	 tile Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ty	TokenNameIdentifier	 ty
*	TokenNameMULTIPLY	
tileHeight	TokenNameIdentifier	 tile Height
+	TokenNamePLUS	
tileGridYOffset	TokenNameIdentifier	 tile Grid Y Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a horizontal tile index into the X coordinate of its * upper left pixel. This is a convenience method. No attempt is made * to detect out-of-range indices. * * @param tx the horizontal index of a tile. * @return the X coordinate of the tile's upper left pixel. */	TokenNameCOMMENT_JAVADOC	 Converts a horizontal tile index into the X coordinate of its upper left pixel. This is a convenience method. No attempt is made to detect out-of-range indices. * @param tx the horizontal index of a tile. @return the X coordinate of the tile's upper left pixel. 
public	TokenNamepublic	
int	TokenNameint	
tileXToX	TokenNameIdentifier	 tile X To X
(	TokenNameLPAREN	
int	TokenNameint	
tx	TokenNameIdentifier	 tx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tx	TokenNameIdentifier	 tx
*	TokenNameMULTIPLY	
tileWidth	TokenNameIdentifier	 tile Width
+	TokenNamePLUS	
tileGridXOffset	TokenNameIdentifier	 tile Grid X Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a vertical tile index into the Y coordinate of its * upper left pixel. This is a convenience method. No attempt is made * to detect out-of-range indices. * * @param ty the vertical index of a tile. * @return the Y coordinate of the tile's upper left pixel. */	TokenNameCOMMENT_JAVADOC	 Converts a vertical tile index into the Y coordinate of its upper left pixel. This is a convenience method. No attempt is made to detect out-of-range indices. * @param ty the vertical index of a tile. @return the Y coordinate of the tile's upper left pixel. 
public	TokenNamepublic	
int	TokenNameint	
tileYToY	TokenNameIdentifier	 tile Y To Y
(	TokenNameLPAREN	
int	TokenNameint	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ty	TokenNameIdentifier	 ty
*	TokenNameMULTIPLY	
tileHeight	TokenNameIdentifier	 tile Height
+	TokenNamePLUS	
tileGridYOffset	TokenNameIdentifier	 tile Grid Y Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getSources	TokenNameIdentifier	 get Sources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the entire image in a single Raster. For images with * multiple tiles this will require making a copy. * * <p> The returned Raster is semantically a copy. This means * that updates to the source image will not be reflected in the * returned Raster. For non-writable (immutable) source images, * the returned value may be a reference to the image's internal * data. The returned Raster should be considered non-writable; * any attempt to alter its pixel data (such as by casting it to * WritableRaster or obtaining and modifying its DataBuffer) may * result in undefined behavior. The copyData method should be * used if the returned Raster is to be modified. * * @return a Raster containing a copy of this image's data. */	TokenNameCOMMENT_JAVADOC	 Returns the entire image in a single Raster. For images with multiple tiles this will require making a copy. * <p> The returned Raster is semantically a copy. This means that updates to the source image will not be reflected in the returned Raster. For non-writable (immutable) source images, the returned value may be a reference to the image's internal data. The returned Raster should be considered non-writable; any attempt to alter its pixel data (such as by casting it to WritableRaster or obtaining and modifying its DataBuffer) may result in undefined behavior. The copyData method should be used if the returned Raster is to be modified. * @return a Raster containing a copy of this image's data. 
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an arbitrary rectangular region of the RenderedImage * in a Raster. The rectangle of interest will be clipped against * the image bounds. * * <p> The returned Raster is semantically a copy. This means * that updates to the source image will not be reflected in the * returned Raster. For non-writable (immutable) source images, * the returned value may be a reference to the image's internal * data. The returned Raster should be considered non-writable; * any attempt to alter its pixel data (such as by casting it to * WritableRaster or obtaining and modifying its DataBuffer) may * result in undefined behavior. The copyData method should be * used if the returned Raster is to be modified. * * @param bounds the region of the RenderedImage to be returned. */	TokenNameCOMMENT_JAVADOC	 Returns an arbitrary rectangular region of the RenderedImage in a Raster. The rectangle of interest will be clipped against the image bounds. * <p> The returned Raster is semantically a copy. This means that updates to the source image will not be reflected in the returned Raster. For non-writable (immutable) source images, the returned value may be a reference to the image's internal data. The returned Raster should be considered non-writable; any attempt to alter its pixel data (such as by casting it to WritableRaster or obtaining and modifying its DataBuffer) may result in undefined behavior. The copyData method should be used if the returned Raster is to be modified. * @param bounds the region of the RenderedImage to be returned. 
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startX	TokenNameIdentifier	 start X
=	TokenNameEQUAL	
XToTileX	TokenNameIdentifier	 X To Tile X
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startY	TokenNameIdentifier	 start Y
=	TokenNameEQUAL	
YToTileY	TokenNameIdentifier	 Y To Tile Y
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endX	TokenNameIdentifier	 end X
=	TokenNameEQUAL	
XToTileX	TokenNameIdentifier	 X To Tile X
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endY	TokenNameIdentifier	 end Y
=	TokenNameEQUAL	
YToTileY	TokenNameIdentifier	 Y To Tile Y
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Raster	TokenNameIdentifier	 Raster
tile	TokenNameIdentifier	 tile
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
startX	TokenNameIdentifier	 start X
==	TokenNameEQUAL_EQUAL	
endX	TokenNameIdentifier	 end X
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
startY	TokenNameIdentifier	 start Y
==	TokenNameEQUAL_EQUAL	
endY	TokenNameIdentifier	 end Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
startX	TokenNameIdentifier	 start X
,	TokenNameCOMMA	
startY	TokenNameIdentifier	 start Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
createChild	TokenNameIdentifier	 create Child
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Create a WritableRaster of the desired size 	TokenNameCOMMENT_LINE	Create a WritableRaster of the desired size 
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
sampleModel	TokenNameIdentifier	 sample Model
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Translate it 	TokenNameCOMMENT_LINE	Translate it 
WritableRaster	TokenNameIdentifier	 Writable Raster
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
Raster	TokenNameIdentifier	 Raster
.	TokenNameDOT	
createWritableRaster	TokenNameIdentifier	 create Writable Raster
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
startY	TokenNameIdentifier	 start Y
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
endY	TokenNameIdentifier	 end Y
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startX	TokenNameIdentifier	 start X
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
endX	TokenNameIdentifier	 end X
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
intersectRect	TokenNameIdentifier	 intersect Rect
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Raster	TokenNameIdentifier	 Raster
liveRaster	TokenNameIdentifier	 live Raster
=	TokenNameEQUAL	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
createChild	TokenNameIdentifier	 create Child
(	TokenNameLPAREN	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
setDataElements	TokenNameIdentifier	 set Data Elements
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
liveRaster	TokenNameIdentifier	 live Raster
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copies an arbitrary rectangular region of the RenderedImage * into a caller-supplied WritableRaster. The region to be * computed is determined by clipping the bounds of the supplied * WritableRaster against the bounds of the image. The supplied * WritableRaster must have a SampleModel that is compatible with * that of the image. * * <p> If the raster argument is null, the entire image will * be copied into a newly-created WritableRaster with a SampleModel * that is compatible with that of the image. * * @param dest a WritableRaster to hold the returned portion of * the image. * @return a reference to the supplied WritableRaster, or to a * new WritableRaster if the supplied one was null. */	TokenNameCOMMENT_JAVADOC	 Copies an arbitrary rectangular region of the RenderedImage into a caller-supplied WritableRaster. The region to be computed is determined by clipping the bounds of the supplied WritableRaster against the bounds of the image. The supplied WritableRaster must have a SampleModel that is compatible with that of the image. * <p> If the raster argument is null, the entire image will be copied into a newly-created WritableRaster with a SampleModel that is compatible with that of the image. * @param dest a WritableRaster to hold the returned portion of the image. @return a reference to the supplied WritableRaster, or to a new WritableRaster if the supplied one was null. 
public	TokenNamepublic	
WritableRaster	TokenNameIdentifier	 Writable Raster
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
Raster	TokenNameIdentifier	 Raster
tile	TokenNameIdentifier	 tile
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point	TokenNameIdentifier	 Point
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
minX	TokenNameIdentifier	 min X
,	TokenNameCOMMA	
minY	TokenNameIdentifier	 min Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* A SampleModel to hold the entire image. */	TokenNameCOMMENT_BLOCK	 A SampleModel to hold the entire image. 
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
sampleModel	TokenNameIdentifier	 sample Model
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
Raster	TokenNameIdentifier	 Raster
.	TokenNameDOT	
createWritableRaster	TokenNameIdentifier	 create Writable Raster
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
startX	TokenNameIdentifier	 start X
=	TokenNameEQUAL	
XToTileX	TokenNameIdentifier	 X To Tile X
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startY	TokenNameIdentifier	 start Y
=	TokenNameEQUAL	
YToTileY	TokenNameIdentifier	 Y To Tile Y
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endX	TokenNameIdentifier	 end X
=	TokenNameEQUAL	
XToTileX	TokenNameIdentifier	 X To Tile X
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endY	TokenNameIdentifier	 end Y
=	TokenNameEQUAL	
YToTileY	TokenNameIdentifier	 Y To Tile Y
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
startY	TokenNameIdentifier	 start Y
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
endY	TokenNameIdentifier	 end Y
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startX	TokenNameIdentifier	 start X
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
endX	TokenNameIdentifier	 end X
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
intersectRect	TokenNameIdentifier	 intersect Rect
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Raster	TokenNameIdentifier	 Raster
liveRaster	TokenNameIdentifier	 live Raster
=	TokenNameEQUAL	
tile	TokenNameIdentifier	 tile
.	TokenNameDOT	
createChild	TokenNameIdentifier	 create Child
(	TokenNameLPAREN	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
intersectRect	TokenNameIdentifier	 intersect Rect
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * WritableRaster.setDataElements takes into account of * inRaster's minX and minY and add these to x and y. Since * liveRaster has the origin at the correct location, the * following call should not again give these coordinates in * places of x and y. */	TokenNameCOMMENT_BLOCK	 WritableRaster.setDataElements takes into account of inRaster's minX and minY and add these to x and y. Since liveRaster has the origin at the correct location, the following call should not again give these coordinates in places of x and y. 
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
setDataElements	TokenNameIdentifier	 set Data Elements
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
liveRaster	TokenNameIdentifier	 live Raster
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
