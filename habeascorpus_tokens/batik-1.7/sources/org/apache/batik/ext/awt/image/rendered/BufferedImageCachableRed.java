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
BufferedImage	TokenNameIdentifier	 Buffered Image
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
GraphicsUtil	TokenNameIdentifier	 Graphics Util
;	TokenNameSEMICOLON	
/** * This implements CachableRed based on a BufferedImage. * You can use this to wrap a BufferedImage that you want to * appear as a CachableRed. * It essentially ignores the dependency and dirty region methods. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: BufferedImageCachableRed.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This implements CachableRed based on a BufferedImage. You can use this to wrap a BufferedImage that you want to appear as a CachableRed. It essentially ignores the dependency and dirty region methods. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: BufferedImageCachableRed.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
BufferedImageCachableRed	TokenNameIdentifier	 Buffered Image Cachable Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
// The bufferedImage that we wrap... 	TokenNameCOMMENT_LINE	The bufferedImage that we wrap... 
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
/** * Construct an instance of CachableRed around a BufferedImage. */	TokenNameCOMMENT_JAVADOC	 Construct an instance of CachableRed around a BufferedImage. 
public	TokenNamepublic	
BufferedImageCachableRed	TokenNameIdentifier	 Buffered Image Cachable Red
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BufferedImageCachableRed	TokenNameIdentifier	 Buffered Image Cachable Red
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
,	TokenNameCOMMA	
int	TokenNameint	
yloc	TokenNameIdentifier	 yloc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
,	TokenNameCOMMA	
yloc	TokenNameIdentifier	 yloc
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xloc	TokenNameIdentifier	 xloc
,	TokenNameCOMMA	
yloc	TokenNameIdentifier	 yloc
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * fetch the bufferedImage from this node. */	TokenNameCOMMENT_JAVADOC	 fetch the bufferedImage from this node. 
public	TokenNamepublic	
BufferedImage	TokenNameIdentifier	 Buffered Image
getBufferedImage	TokenNameIdentifier	 get Buffered Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPropertyNames	TokenNameIdentifier	 get Property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getPropertyNames	TokenNameIdentifier	 get Property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
tileX	TokenNameIdentifier	 tile X
,	TokenNameCOMMA	
tileY	TokenNameIdentifier	 tile Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Raster	TokenNameIdentifier	 Raster
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
createTranslatedChild	TokenNameIdentifier	 create Translated Child
(	TokenNameLPAREN	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
-	TokenNameMINUS	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Raster	TokenNameIdentifier	 Raster
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
createTranslatedChild	TokenNameIdentifier	 create Translated Child
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
WritableRaster	TokenNameIdentifier	 Writable Raster
wr2	TokenNameIdentifier	 wr2
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
createWritableTranslatedChild	TokenNameIdentifier	 create Writable Translated Child
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getRaster	TokenNameIdentifier	 get Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wr2	TokenNameIdentifier	 wr2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* This was the original code. This is _bad_ since it causes a * multiply and divide of the alpha channel to do the draw * operation. I believe that at some point I switched to * drawImage in order to avoid some issues with * BufferedImage's copyData implementation but I can't * reproduce them now. Anyway I'm now using GraphicsUtil which * should generally be as fast if not faster... */	TokenNameCOMMENT_BLOCK	 This was the original code. This is _bad_ since it causes a multiply and divide of the alpha channel to do the draw operation. I believe that at some point I switched to drawImage in order to avoid some issues with BufferedImage's copyData implementation but I can't reproduce them now. Anyway I'm now using GraphicsUtil which should generally be as fast if not faster... 
/* BufferedImage dest; dest = new BufferedImage(bi.getColorModel(), wr.createWritableTranslatedChild(0,0), bi.getColorModel().isAlphaPremultiplied(), null); java.awt.Graphics2D g2d = dest.createGraphics(); g2d.drawImage(bi, null, getMinX()-wr.getMinX(), getMinY()-wr.getMinY()); g2d.dispose(); */	TokenNameCOMMENT_BLOCK	 BufferedImage dest; dest = new BufferedImage(bi.getColorModel(), wr.createWritableTranslatedChild(0,0), bi.getColorModel().isAlphaPremultiplied(), null); java.awt.Graphics2D g2d = dest.createGraphics(); g2d.drawImage(bi, null, getMinX()-wr.getMinX(), getMinY()-wr.getMinY()); g2d.dispose(); 
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
