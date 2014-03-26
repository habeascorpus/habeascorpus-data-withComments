/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
tosvg	TokenNameIdentifier	 tosvg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Paint	TokenNameIdentifier	 Paint
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
TexturePaint	TokenNameIdentifier	 Texture Paint
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
WMFConstants	TokenNameIdentifier	 WMF Constants
;	TokenNameSEMICOLON	
/** * This class generate Paints from WMF hatch definitions. All generated * Paints are cached for future use. * * @version $Id: TextureFactory.java 498747 2007-01-22 18:56:19Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class generate Paints from WMF hatch definitions. All generated Paints are cached for future use. * @version $Id: TextureFactory.java 498747 2007-01-22 18:56:19Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TextureFactory	TokenNameIdentifier	 Texture Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
TextureFactory	TokenNameIdentifier	 Texture Factory
fac	TokenNameIdentifier	 fac
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
textures	TokenNameIdentifier	 textures
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SIZE	TokenNameIdentifier	 SIZE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextureFactory	TokenNameIdentifier	 Texture Factory
(	TokenNameLPAREN	
float	TokenNamefloat	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Get the unique instance of the class. */	TokenNameCOMMENT_JAVADOC	 Get the unique instance of the class. 
public	TokenNamepublic	
static	TokenNamestatic	
TextureFactory	TokenNameIdentifier	 Texture Factory
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fac	TokenNameIdentifier	 fac
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fac	TokenNameIdentifier	 fac
=	TokenNameEQUAL	
new	TokenNamenew	
TextureFactory	TokenNameIdentifier	 Texture Factory
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fac	TokenNameIdentifier	 fac
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the unique instance of the class, setting the scale of the pattern. * TODO : scale is not handled for now */	TokenNameCOMMENT_JAVADOC	 Get the unique instance of the class, setting the scale of the pattern. TODO : scale is not handled for now 
public	TokenNamepublic	
static	TokenNamestatic	
TextureFactory	TokenNameIdentifier	 Texture Factory
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
float	TokenNamefloat	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fac	TokenNameIdentifier	 fac
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fac	TokenNameIdentifier	 fac
=	TokenNameEQUAL	
new	TokenNamenew	
TextureFactory	TokenNameIdentifier	 Texture Factory
(	TokenNameLPAREN	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fac	TokenNameIdentifier	 fac
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Rest the factory. It empties all the previouly cached Paints are * disposed of. */	TokenNameCOMMENT_JAVADOC	 Rest the factory. It empties all the previouly cached Paints are disposed of. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get a texture from a WMF hatch definition (in black Color). This * texture will be cached, so the Paint will only be created once. */	TokenNameCOMMENT_JAVADOC	 Get a texture from a WMF hatch definition (in black Color). This texture will be cached, so the Paint will only be created once. 
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
getTexture	TokenNameIdentifier	 get Texture
(	TokenNameLPAREN	
int	TokenNameint	
textureId	TokenNameIdentifier	 texture Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
_itexture	TokenNameIdentifier	 itexture
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
_itexture	TokenNameIdentifier	 itexture
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Paint	TokenNameIdentifier	 Paint
)	TokenNameRPAREN	
(	TokenNameLPAREN	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
_itexture	TokenNameIdentifier	 itexture
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
createTexture	TokenNameIdentifier	 create Texture
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
_itexture	TokenNameIdentifier	 itexture
,	TokenNameCOMMA	
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Get a texture from a WMF hatch definition, with a foreground color. This * texture will be cached, so the Paint will only be created once. */	TokenNameCOMMENT_JAVADOC	 Get a texture from a WMF hatch definition, with a foreground color. This texture will be cached, so the Paint will only be created once. 
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
getTexture	TokenNameIdentifier	 get Texture
(	TokenNameLPAREN	
int	TokenNameint	
textureId	TokenNameIdentifier	 texture Id
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
foreground	TokenNameIdentifier	 foreground
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColoredTexture	TokenNameIdentifier	 Colored Texture
_ctexture	TokenNameIdentifier	 ctexture
=	TokenNameEQUAL	
new	TokenNamenew	
ColoredTexture	TokenNameIdentifier	 Colored Texture
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
,	TokenNameCOMMA	
foreground	TokenNameIdentifier	 foreground
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
_ctexture	TokenNameIdentifier	 ctexture
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Paint	TokenNameIdentifier	 Paint
)	TokenNameRPAREN	
(	TokenNameLPAREN	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
_ctexture	TokenNameIdentifier	 ctexture
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
createTexture	TokenNameIdentifier	 create Texture
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
,	TokenNameCOMMA	
foreground	TokenNameIdentifier	 foreground
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
_ctexture	TokenNameIdentifier	 ctexture
,	TokenNameCOMMA	
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Get a texture from a WMF hatch definition, with a foreground and a * background color. This texture will be cached, so the Paint will * only be created once. */	TokenNameCOMMENT_JAVADOC	 Get a texture from a WMF hatch definition, with a foreground and a background color. This texture will be cached, so the Paint will only be created once. 
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
getTexture	TokenNameIdentifier	 get Texture
(	TokenNameLPAREN	
int	TokenNameint	
textureId	TokenNameIdentifier	 texture Id
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
foreground	TokenNameIdentifier	 foreground
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
background	TokenNameIdentifier	 background
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColoredTexture	TokenNameIdentifier	 Colored Texture
_ctexture	TokenNameIdentifier	 ctexture
=	TokenNameEQUAL	
new	TokenNamenew	
ColoredTexture	TokenNameIdentifier	 Colored Texture
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
,	TokenNameCOMMA	
foreground	TokenNameIdentifier	 foreground
,	TokenNameCOMMA	
background	TokenNameIdentifier	 background
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
_ctexture	TokenNameIdentifier	 ctexture
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Paint	TokenNameIdentifier	 Paint
)	TokenNameRPAREN	
(	TokenNameLPAREN	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
_ctexture	TokenNameIdentifier	 ctexture
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
createTexture	TokenNameIdentifier	 create Texture
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
,	TokenNameCOMMA	
foreground	TokenNameIdentifier	 foreground
,	TokenNameCOMMA	
background	TokenNameIdentifier	 background
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
textures	TokenNameIdentifier	 textures
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
_ctexture	TokenNameIdentifier	 ctexture
,	TokenNameCOMMA	
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Called internally if the Paint does not exist in the cache and must * be created. */	TokenNameCOMMENT_JAVADOC	 Called internally if the Paint does not exist in the cache and must be created. 
private	TokenNameprivate	
Paint	TokenNameIdentifier	 Paint
createTexture	TokenNameIdentifier	 create Texture
(	TokenNameLPAREN	
int	TokenNameint	
textureId	TokenNameIdentifier	 texture Id
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
foreground	TokenNameIdentifier	 foreground
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
background	TokenNameIdentifier	 background
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BufferedImage	TokenNameIdentifier	 Buffered Image
img	TokenNameIdentifier	 img
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_INT_ARGB	TokenNameIdentifier	 TYPE  INT  ARGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
=	TokenNameEQUAL	
img	TokenNameIdentifier	 img
.	TokenNameDOT	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
rec	TokenNameIdentifier	 rec
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
background	TokenNameIdentifier	 background
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
background	TokenNameIdentifier	 background
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
fillRect	TokenNameIdentifier	 fill Rect
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
foreground	TokenNameIdentifier	 foreground
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
foreground	TokenNameIdentifier	 foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
==	TokenNameEQUAL_EQUAL	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
HS_VERTICAL	TokenNameIdentifier	 HS  VERTICAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawLine	TokenNameIdentifier	 draw Line
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
==	TokenNameEQUAL_EQUAL	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
HS_HORIZONTAL	TokenNameIdentifier	 HS  HORIZONTAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawLine	TokenNameIdentifier	 draw Line
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
==	TokenNameEQUAL_EQUAL	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
HS_BDIAGONAL	TokenNameIdentifier	 HS  BDIAGONAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawLine	TokenNameIdentifier	 draw Line
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
==	TokenNameEQUAL_EQUAL	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
HS_FDIAGONAL	TokenNameIdentifier	 HS  FDIAGONAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawLine	TokenNameIdentifier	 draw Line
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
==	TokenNameEQUAL_EQUAL	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
HS_DIAGCROSS	TokenNameIdentifier	 HS  DIAGCROSS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawLine	TokenNameIdentifier	 draw Line
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawLine	TokenNameIdentifier	 draw Line
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
textureId	TokenNameIdentifier	 texture Id
==	TokenNameEQUAL_EQUAL	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
HS_CROSS	TokenNameIdentifier	 HS  CROSS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawLine	TokenNameIdentifier	 draw Line
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawLine	TokenNameIdentifier	 draw Line
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
img	TokenNameIdentifier	 img
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
new	TokenNamenew	
TexturePaint	TokenNameIdentifier	 Texture Paint
(	TokenNameLPAREN	
img	TokenNameIdentifier	 img
,	TokenNameCOMMA	
rec	TokenNameIdentifier	 rec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Contain a handle to a Colored texture, with optional foreground and * background colors. */	TokenNameCOMMENT_JAVADOC	 Contain a handle to a Colored texture, with optional foreground and background colors. 
private	TokenNameprivate	
class	TokenNameclass	
ColoredTexture	TokenNameIdentifier	 Colored Texture
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
textureId	TokenNameIdentifier	 texture Id
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
foreground	TokenNameIdentifier	 foreground
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
background	TokenNameIdentifier	 background
;	TokenNameSEMICOLON	
ColoredTexture	TokenNameIdentifier	 Colored Texture
(	TokenNameLPAREN	
int	TokenNameint	
textureId	TokenNameIdentifier	 texture Id
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
foreground	TokenNameIdentifier	 foreground
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
background	TokenNameIdentifier	 background
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
textureId	TokenNameIdentifier	 texture Id
=	TokenNameEQUAL	
textureId	TokenNameIdentifier	 texture Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
foreground	TokenNameIdentifier	 foreground
=	TokenNameEQUAL	
foreground	TokenNameIdentifier	 foreground
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
background	TokenNameIdentifier	 background
=	TokenNameEQUAL	
background	TokenNameIdentifier	 background
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
