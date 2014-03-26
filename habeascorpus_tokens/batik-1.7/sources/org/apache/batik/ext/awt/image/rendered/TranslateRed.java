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
/** * This is a special case of an Affine that only contains integer * translations, this allows it to do it's work by simply changing * the coordinate system of the tiles. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: TranslateRed.java 478363 2006-11-22 23:01:13Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is a special case of an Affine that only contains integer translations, this allows it to do it's work by simply changing the coordinate system of the tiles. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: TranslateRed.java 478363 2006-11-22 23:01:13Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TranslateRed	TokenNameIdentifier	 Translate Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
protected	TokenNameprotected	
int	TokenNameint	
deltaX	TokenNameIdentifier	 delta X
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
deltaY	TokenNameIdentifier	 delta Y
;	TokenNameSEMICOLON	
/** * Construct an instance of TranslateRed * @param xloc The new x coordinate of cr.getMinX(). * @param yloc The new y coordinate of cr.getMinY(). */	TokenNameCOMMENT_JAVADOC	 Construct an instance of TranslateRed @param xloc The new x coordinate of cr.getMinX(). @param yloc The new y coordinate of cr.getMinY(). 
public	TokenNamepublic	
TranslateRed	TokenNameIdentifier	 Translate Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
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
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
xloc	TokenNameIdentifier	 xloc
,	TokenNameCOMMA	
yloc	TokenNameIdentifier	 yloc
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deltaX	TokenNameIdentifier	 delta X
=	TokenNameEQUAL	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deltaY	TokenNameIdentifier	 delta Y
=	TokenNameEQUAL	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The delata translation in x (absolute loc is available from getMinX()) */	TokenNameCOMMENT_JAVADOC	 The delata translation in x (absolute loc is available from getMinX()) 
public	TokenNamepublic	
int	TokenNameint	
getDeltaX	TokenNameIdentifier	 get Delta X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deltaX	TokenNameIdentifier	 delta X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The delata translation in y (absolute loc is available from getMinY()) */	TokenNameCOMMENT_JAVADOC	 The delata translation in y (absolute loc is available from getMinY()) 
public	TokenNamepublic	
int	TokenNameint	
getDeltaY	TokenNameIdentifier	 get Delta Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deltaY	TokenNameIdentifier	 delta Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * fetch the source image for this node. */	TokenNameCOMMENT_JAVADOC	 fetch the source image for this node. 
public	TokenNamepublic	
CachableRed	TokenNameIdentifier	 Cachable Red
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
Raster	TokenNameIdentifier	 Raster
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTile	TokenNameIdentifier	 get Tile
(	TokenNameLPAREN	
tileX	TokenNameIdentifier	 tile X
,	TokenNameCOMMA	
tileY	TokenNameIdentifier	 tile Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
createTranslatedChild	TokenNameIdentifier	 create Translated Child
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
deltaX	TokenNameIdentifier	 delta X
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
deltaY	TokenNameIdentifier	 delta Y
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
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
deltaX	TokenNameIdentifier	 delta X
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
deltaY	TokenNameIdentifier	 delta Y
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
r	TokenNameIdentifier	 r
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
-	TokenNameMINUS	
deltaX	TokenNameIdentifier	 delta X
,	TokenNameCOMMA	
-	TokenNameMINUS	
deltaY	TokenNameIdentifier	 delta Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Raster	TokenNameIdentifier	 Raster
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
deltaX	TokenNameIdentifier	 delta X
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
deltaY	TokenNameIdentifier	 delta Y
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
deltaX	TokenNameIdentifier	 delta X
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
deltaY	TokenNameIdentifier	 delta Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
wr2	TokenNameIdentifier	 wr2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
