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
/** * A simple class that provides RenderedImage functionality * given a Raster and a ColorModel. * * @version $Id: SingleTileRenderedImage.java 479564 2006-11-27 09:56:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A simple class that provides RenderedImage functionality given a Raster and a ColorModel. * @version $Id: SingleTileRenderedImage.java 479564 2006-11-27 09:56:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SingleTileRenderedImage	TokenNameIdentifier	 Single Tile Rendered Image
extends	TokenNameextends	
SimpleRenderedImage	TokenNameIdentifier	 Simple Rendered Image
{	TokenNameLBRACE	
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
;	TokenNameSEMICOLON	
/** * Constructs a SingleTileRenderedImage based on a Raster * and a ColorModel. * * @param ras A Raster that will define tile (0, 0) of the image. * @param colorModel A ColorModel that will serve as the image's * ColorModel. */	TokenNameCOMMENT_JAVADOC	 Constructs a SingleTileRenderedImage based on a Raster and a ColorModel. * @param ras A Raster that will define tile (0, 0) of the image. @param colorModel A ColorModel that will serve as the image's ColorModel. 
public	TokenNamepublic	
SingleTileRenderedImage	TokenNameIdentifier	 Single Tile Rendered Image
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
colorModel	TokenNameIdentifier	 color Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ras	TokenNameIdentifier	 ras
=	TokenNameEQUAL	
ras	TokenNameIdentifier	 ras
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tileGridXOffset	TokenNameIdentifier	 tile Grid X Offset
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
minX	TokenNameIdentifier	 min X
=	TokenNameEQUAL	
ras	TokenNameIdentifier	 ras
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tileGridYOffset	TokenNameIdentifier	 tile Grid Y Offset
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
minY	TokenNameIdentifier	 min Y
=	TokenNameEQUAL	
ras	TokenNameIdentifier	 ras
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tileWidth	TokenNameIdentifier	 tile Width
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
ras	TokenNameIdentifier	 ras
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tileHeight	TokenNameIdentifier	 tile Height
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
ras	TokenNameIdentifier	 ras
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sampleModel	TokenNameIdentifier	 sample Model
=	TokenNameEQUAL	
ras	TokenNameIdentifier	 ras
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
colorModel	TokenNameIdentifier	 color Model
=	TokenNameEQUAL	
colorModel	TokenNameIdentifier	 color Model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the image's Raster as tile (0, 0). */	TokenNameCOMMENT_JAVADOC	 Returns the image's Raster as tile (0, 0). 
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
if	TokenNameif	
(	TokenNameLPAREN	
tileX	TokenNameIdentifier	 tile X
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
tileY	TokenNameIdentifier	 tile Y
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
PropertyUtil	TokenNameIdentifier	 Property Util
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"SingleTileRenderedImage0"	TokenNameStringLiteral	SingleTileRenderedImage0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ras	TokenNameIdentifier	 ras
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
