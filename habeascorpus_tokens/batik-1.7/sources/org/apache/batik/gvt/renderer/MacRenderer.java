/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
renderer	TokenNameIdentifier	 renderer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
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
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
RectListManager	TokenNameIdentifier	 Rect List Manager
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
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
GraphicsNode	TokenNameIdentifier	 Graphics Node
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
/** * Simple implementation of the Renderer that supports dynamic updates. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: MacRenderer.java 504819 2007-02-08 08:23:19Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Simple implementation of the Renderer that supports dynamic updates. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: MacRenderer.java 504819 2007-02-08 08:23:19Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
MacRenderer	TokenNameIdentifier	 Mac Renderer
implements	TokenNameimplements	
ImageRenderer	TokenNameIdentifier	 Image Renderer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COPY_OVERHEAD	TokenNameIdentifier	 COPY  OVERHEAD
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COPY_LINE_OVERHEAD	TokenNameIdentifier	 COPY  LINE  OVERHEAD
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
AffineTransform	TokenNameIdentifier	 Affine Transform
IDENTITY	TokenNameIdentifier	 IDENTITY
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
RenderingHints	TokenNameIdentifier	 Rendering Hints
renderingHints	TokenNameIdentifier	 rendering Hints
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
usr2dev	TokenNameIdentifier	 usr2dev
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
rootGN	TokenNameIdentifier	 root GN
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
offScreenWidth	TokenNameIdentifier	 off Screen Width
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
offScreenHeight	TokenNameIdentifier	 off Screen Height
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
BufferedImage	TokenNameIdentifier	 Buffered Image
currImg	TokenNameIdentifier	 curr Img
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
BufferedImage	TokenNameIdentifier	 Buffered Image
workImg	TokenNameIdentifier	 work Img
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
RectListManager	TokenNameIdentifier	 Rect List Manager
damagedAreas	TokenNameIdentifier	 damaged Areas
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
IMAGE_TYPE	TokenNameIdentifier	 IMAGE  TYPE
=	TokenNameEQUAL	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_INT_ARGB_PRE	TokenNameIdentifier	 TYPE  INT  ARGB  PRE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Color	TokenNameIdentifier	 Color
TRANSPARENT_WHITE	TokenNameIdentifier	 TRANSPARENT  WHITE
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
RenderingHints	TokenNameIdentifier	 Rendering Hints
defaultRenderingHints	TokenNameIdentifier	 default Rendering Hints
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
defaultRenderingHints	TokenNameIdentifier	 default Rendering Hints
=	TokenNameEQUAL	
new	TokenNamenew	
RenderingHints	TokenNameIdentifier	 Rendering Hints
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultRenderingHints	TokenNameIdentifier	 default Rendering Hints
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_ANTIALIASING	TokenNameIdentifier	 KEY  ANTIALIASING
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_ANTIALIAS_ON	TokenNameIdentifier	 VALUE  ANTIALIAS  ON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultRenderingHints	TokenNameIdentifier	 default Rendering Hints
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_INTERPOLATION	TokenNameIdentifier	 KEY  INTERPOLATION
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_INTERPOLATION_BILINEAR	TokenNameIdentifier	 VALUE  INTERPOLATION  BILINEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new dynamic renderer with the specified buffer image. */	TokenNameCOMMENT_JAVADOC	 Constructs a new dynamic renderer with the specified buffer image. 
public	TokenNamepublic	
MacRenderer	TokenNameIdentifier	 Mac Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
renderingHints	TokenNameIdentifier	 rendering Hints
=	TokenNameEQUAL	
new	TokenNamenew	
RenderingHints	TokenNameIdentifier	 Rendering Hints
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderingHints	TokenNameIdentifier	 rendering Hints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
defaultRenderingHints	TokenNameIdentifier	 default Rendering Hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usr2dev	TokenNameIdentifier	 usr2dev
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MacRenderer	TokenNameIdentifier	 Mac Renderer
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
rh	TokenNameIdentifier	 rh
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
renderingHints	TokenNameIdentifier	 rendering Hints
=	TokenNameEQUAL	
new	TokenNamenew	
RenderingHints	TokenNameIdentifier	 Rendering Hints
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderingHints	TokenNameIdentifier	 rendering Hints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootGN	TokenNameIdentifier	 root GN
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
currImg	TokenNameIdentifier	 curr Img
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
workImg	TokenNameIdentifier	 work Img
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
renderingHints	TokenNameIdentifier	 rendering Hints
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
usr2dev	TokenNameIdentifier	 usr2dev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
damagedAreas	TokenNameIdentifier	 damaged Areas
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
damagedAreas	TokenNameIdentifier	 damaged Areas
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
damagedAreas	TokenNameIdentifier	 damaged Areas
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This associates the given GVT Tree with this renderer. * Any previous tree association is forgotten. * Not certain if this should be just GraphicsNode, or CanvasGraphicsNode. */	TokenNameCOMMENT_JAVADOC	 This associates the given GVT Tree with this renderer. Any previous tree association is forgotten. Not certain if this should be just GraphicsNode, or CanvasGraphicsNode. 
public	TokenNamepublic	
void	TokenNamevoid	
setTree	TokenNameIdentifier	 set Tree
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
treeRoot	TokenNameIdentifier	 tree Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootGN	TokenNameIdentifier	 root GN
=	TokenNameEQUAL	
treeRoot	TokenNameIdentifier	 tree Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the GVT tree associated with this renderer */	TokenNameCOMMENT_JAVADOC	 Returns the GVT tree associated with this renderer 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getTree	TokenNameIdentifier	 get Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rootGN	TokenNameIdentifier	 root GN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the transform from the current user space (as defined by * the top node of the GVT tree, to the associated device space. */	TokenNameCOMMENT_JAVADOC	 Sets the transform from the current user space (as defined by the top node of the GVT tree, to the associated device space. 
public	TokenNamepublic	
void	TokenNamevoid	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
usr2dev	TokenNameIdentifier	 usr2dev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
usr2dev	TokenNameIdentifier	 usr2dev
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
usr2dev	TokenNameIdentifier	 usr2dev
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
this	TokenNamethis	
.	TokenNameDOT	
usr2dev	TokenNameIdentifier	 usr2dev
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
usr2dev	TokenNameIdentifier	 usr2dev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
=	TokenNameEQUAL	
workImg	TokenNameIdentifier	 work Img
.	TokenNameDOT	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setComposite	TokenNameIdentifier	 set Composite
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
Clear	TokenNameIdentifier	 Clear
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
workImg	TokenNameIdentifier	 work Img
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
workImg	TokenNameIdentifier	 work Img
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
damagedAreas	TokenNameIdentifier	 damaged Areas
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the transform from the current user space (as defined * by the top node of the GVT tree) to the device space. */	TokenNameCOMMENT_JAVADOC	 Returns the transform from the current user space (as defined by the top node of the GVT tree) to the device space. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
usr2dev	TokenNameIdentifier	 usr2dev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param rh Set of rendering hints to use for future renderings */	TokenNameCOMMENT_JAVADOC	 @param rh Set of rendering hints to use for future renderings 
public	TokenNamepublic	
void	TokenNamevoid	
setRenderingHints	TokenNameIdentifier	 set Rendering Hints
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
renderingHints	TokenNameIdentifier	 rendering Hints
=	TokenNameEQUAL	
new	TokenNamenew	
RenderingHints	TokenNameIdentifier	 Rendering Hints
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
renderingHints	TokenNameIdentifier	 rendering Hints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
damagedAreas	TokenNameIdentifier	 damaged Areas
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the RenderingHints which the Renderer is using for its * rendering */	TokenNameCOMMENT_JAVADOC	 @return the RenderingHints which the Renderer is using for its rendering 
public	TokenNamepublic	
RenderingHints	TokenNameIdentifier	 Rendering Hints
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
renderingHints	TokenNameIdentifier	 rendering Hints
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the Renderer is currently doubleBuffering is * rendering requests. If it is then getOffscreen will only * return completed renderings (or null if nothing is available). */	TokenNameCOMMENT_JAVADOC	 Returns true if the Renderer is currently doubleBuffering is rendering requests. If it is then getOffscreen will only return completed renderings (or null if nothing is available). 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turns on/off double buffering in renderer. Turning off * double buffering makes it possible to see the ongoing results * of a render operation. * * @param isDoubleBuffered the new value for double buffering */	TokenNameCOMMENT_JAVADOC	 Turns on/off double buffering in renderer. Turning off double buffering makes it possible to see the ongoing results of a render operation. * @param isDoubleBuffered the new value for double buffering 
public	TokenNamepublic	
void	TokenNamevoid	
setDoubleBuffered	TokenNameIdentifier	 set Double Buffered
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
==	TokenNameEQUAL_EQUAL	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
=	TokenNameEQUAL	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
workImg	TokenNameIdentifier	 work Img
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// start double buffer, split buffers 	TokenNameCOMMENT_LINE	start double buffer, split buffers 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// No longer double buffering so delete second offscreen 	TokenNameCOMMENT_LINE	No longer double buffering so delete second offscreen 
workImg	TokenNameIdentifier	 work Img
=	TokenNameEQUAL	
currImg	TokenNameIdentifier	 curr Img
;	TokenNameSEMICOLON	
damagedAreas	TokenNameIdentifier	 damaged Areas
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Update the size of the image to be returned by getOffScreen. * Note that this change will not be reflected by calls to * getOffscreen until either clearOffScreen has completed (when * isDoubleBuffered is false) or reapint has completed (when * isDoubleBuffered is true). * */	TokenNameCOMMENT_JAVADOC	 Update the size of the image to be returned by getOffScreen. Note that this change will not be reflected by calls to getOffscreen until either clearOffScreen has completed (when isDoubleBuffered is false) or reapint has completed (when isDoubleBuffered is true). 
public	TokenNamepublic	
void	TokenNamevoid	
updateOffScreen	TokenNameIdentifier	 update Off Screen
(	TokenNameLPAREN	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offScreenWidth	TokenNameIdentifier	 off Screen Width
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
offScreenHeight	TokenNameIdentifier	 off Screen Height
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current offscreen image. * * The exact symantics of this vary base on the value of * isDoubleBuffered. If isDoubleBuffered is false this will * return the image currently being worked on as soon as it is * available. * * if isDoubleBuffered is false this will return the most recently * completed result of repaint. */	TokenNameCOMMENT_JAVADOC	 Returns the current offscreen image. * The exact symantics of this vary base on the value of isDoubleBuffered. If isDoubleBuffered is false this will return the image currently being worked on as soon as it is available. * if isDoubleBuffered is false this will return the most recently completed result of repaint. 
public	TokenNamepublic	
BufferedImage	TokenNameIdentifier	 Buffered Image
getOffScreen	TokenNameIdentifier	 get Off Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rootGN	TokenNameIdentifier	 root GN
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
currImg	TokenNameIdentifier	 curr Img
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets up and clears the current offscreen buffer. * * When not double buffering one should call this method before * calling getOffscreen to get the offscreen being drawn into. * This ensures the buffer is up to date and doesn't contain junk. * * When double buffering this call can effectively be skipped, * since getOffscreen will only refect the new rendering after * repaint completes. */	TokenNameCOMMENT_JAVADOC	 Sets up and clears the current offscreen buffer. * When not double buffering one should call this method before calling getOffscreen to get the offscreen being drawn into. This ensures the buffer is up to date and doesn't contain junk. * When double buffering this call can effectively be skipped, since getOffscreen will only refect the new rendering after repaint completes. 
public	TokenNamepublic	
void	TokenNamevoid	
clearOffScreen	TokenNameIdentifier	 clear Off Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No need to clear in double buffer case people will 	TokenNameCOMMENT_LINE	No need to clear in double buffer case people will 
// only see it when it is done... 	TokenNameCOMMENT_LINE	only see it when it is done... 
if	TokenNameif	
(	TokenNameLPAREN	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
updateWorkingBuffers	TokenNameIdentifier	 update Working Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
=	TokenNameEQUAL	
workImg	TokenNameIdentifier	 work Img
.	TokenNameDOT	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setComposite	TokenNameIdentifier	 set Composite
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
Clear	TokenNameIdentifier	 Clear
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
workImg	TokenNameIdentifier	 work Img
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
workImg	TokenNameIdentifier	 work Img
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
damagedAreas	TokenNameIdentifier	 damaged Areas
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since we don't cache we don't need to flush 	TokenNameCOMMENT_LINE	Since we don't cache we don't need to flush 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since we don't cache we don't need to flush 	TokenNameCOMMENT_LINE	Since we don't cache we don't need to flush 
}	TokenNameRBRACE	
/** * Flush a list of rectangles of cached image data. */	TokenNameCOMMENT_JAVADOC	 Flush a list of rectangles of cached image data. 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
areas	TokenNameIdentifier	 areas
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since we don't cache we don't need to flush 	TokenNameCOMMENT_LINE	Since we don't cache we don't need to flush 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
updateWorkingBuffers	TokenNameIdentifier	 update Working Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rootGN	TokenNameIdentifier	 root GN
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currImg	TokenNameIdentifier	 curr Img
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
workImg	TokenNameIdentifier	 work Img
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
offScreenWidth	TokenNameIdentifier	 off Screen Width
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
offScreenHeight	TokenNameIdentifier	 off Screen Height
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
workImg	TokenNameIdentifier	 work Img
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
IMAGE_TYPE	TokenNameIdentifier	 IMAGE  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// workImg = new BI(w, h, IMAGE_TYPE); 	TokenNameCOMMENT_LINE	workImg = new BI(w, h, IMAGE_TYPE); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currImg	TokenNameIdentifier	 curr Img
=	TokenNameEQUAL	
workImg	TokenNameIdentifier	 work Img
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
repaint	TokenNameIdentifier	 repaint
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
area	TokenNameIdentifier	 area
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
area	TokenNameIdentifier	 area
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
RectListManager	TokenNameIdentifier	 Rect List Manager
rlm	TokenNameIdentifier	 rlm
=	TokenNameEQUAL	
new	TokenNamenew	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
usr2dev	TokenNameIdentifier	 usr2dev
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
area	TokenNameIdentifier	 area
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repaint	TokenNameIdentifier	 repaint
(	TokenNameLPAREN	
rlm	TokenNameIdentifier	 rlm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Repaints the associated GVT tree under the list of <tt>areas</tt>. * * If double buffered is true and this method completes cleanly it * will set the result of the repaint as the image returned by * getOffscreen otherwise the old image will still be returned. * If double buffered is false it is possible some effects of * the failed rendering will be visible in the image returned * by getOffscreen. * * @param devRLM regions to be repainted, in the current * user space coordinate system. */	TokenNameCOMMENT_JAVADOC	 Repaints the associated GVT tree under the list of <tt>areas</tt>. * If double buffered is true and this method completes cleanly it will set the result of the repaint as the image returned by getOffscreen otherwise the old image will still be returned. If double buffered is false it is possible some effects of the failed rendering will be visible in the image returned by getOffscreen. * @param devRLM regions to be repainted, in the current user space coordinate system. 
// long lastFrame = -1; 	TokenNameCOMMENT_LINE	long lastFrame = -1; 
public	TokenNamepublic	
void	TokenNamevoid	
repaint	TokenNameIdentifier	 repaint
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
devRLM	TokenNameIdentifier	 dev RLM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
devRLM	TokenNameIdentifier	 dev RLM
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
updateWorkingBuffers	TokenNameIdentifier	 update Working Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rootGN	TokenNameIdentifier	 root GN
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Ensure only one thread works on WorkImg at a time... 	TokenNameCOMMENT_LINE	Ensure only one thread works on WorkImg at a time... 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
createGraphics	TokenNameIdentifier	 create Graphics
(	TokenNameLPAREN	
workImg	TokenNameIdentifier	 work Img
,	TokenNameCOMMA	
renderingHints	TokenNameIdentifier	 rendering Hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
dr	TokenNameIdentifier	 dr
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
offScreenWidth	TokenNameIdentifier	 off Screen Width
,	TokenNameCOMMA	
offScreenHeight	TokenNameIdentifier	 off Screen Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
currImg	TokenNameIdentifier	 curr Img
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
damagedAreas	TokenNameIdentifier	 damaged Areas
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
damagedAreas	TokenNameIdentifier	 damaged Areas
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
devRLM	TokenNameIdentifier	 dev RLM
,	TokenNameCOMMA	
COPY_OVERHEAD	TokenNameIdentifier	 COPY  OVERHEAD
,	TokenNameCOMMA	
COPY_LINE_OVERHEAD	TokenNameIdentifier	 COPY  LINE  OVERHEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
damagedAreas	TokenNameIdentifier	 damaged Areas
.	TokenNameDOT	
mergeRects	TokenNameIdentifier	 merge Rects
(	TokenNameLPAREN	
COPY_OVERHEAD	TokenNameIdentifier	 COPY  OVERHEAD
,	TokenNameCOMMA	
COPY_LINE_OVERHEAD	TokenNameIdentifier	 COPY  LINE  OVERHEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
damagedAreas	TokenNameIdentifier	 damaged Areas
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setComposite	TokenNameIdentifier	 set Composite
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
Src	TokenNameIdentifier	 Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setClip	TokenNameIdentifier	 set Clip
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setComposite	TokenNameIdentifier	 set Composite
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
Clear	TokenNameIdentifier	 Clear
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
fillRect	TokenNameIdentifier	 fill Rect
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setComposite	TokenNameIdentifier	 set Composite
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SrcOver	TokenNameIdentifier	 Src Over
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
currImg	TokenNameIdentifier	 curr Img
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
devRLM	TokenNameIdentifier	 dev RLM
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
IDENTITY	TokenNameIdentifier	 IDENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setClip	TokenNameIdentifier	 set Clip
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setComposite	TokenNameIdentifier	 set Composite
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
Clear	TokenNameIdentifier	 Clear
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
fillRect	TokenNameIdentifier	 fill Rect
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setComposite	TokenNameIdentifier	 set Composite
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SrcOver	TokenNameIdentifier	 Src Over
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
usr2dev	TokenNameIdentifier	 usr2dev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootGN	TokenNameIdentifier	 root GN
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// System.out.println("Dmg: " + damagedAreas); 	TokenNameCOMMENT_LINE	System.out.println("Dmg: " + damagedAreas); 
// System.out.println("Areas: " + devRects); 	TokenNameCOMMENT_LINE	System.out.println("Areas: " + devRects); 
// Swap the buffers if the rendering completed cleanly. 	TokenNameCOMMENT_LINE	Swap the buffers if the rendering completed cleanly. 
if	TokenNameif	
(	TokenNameLPAREN	
isDoubleBuffered	TokenNameIdentifier	 is Double Buffered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BufferedImage	TokenNameIdentifier	 Buffered Image
tmpImg	TokenNameIdentifier	 tmp Img
=	TokenNameEQUAL	
workImg	TokenNameIdentifier	 work Img
;	TokenNameSEMICOLON	
workImg	TokenNameIdentifier	 work Img
=	TokenNameEQUAL	
currImg	TokenNameIdentifier	 curr Img
;	TokenNameSEMICOLON	
currImg	TokenNameIdentifier	 curr Img
=	TokenNameEQUAL	
tmpImg	TokenNameIdentifier	 tmp Img
;	TokenNameSEMICOLON	
damagedAreas	TokenNameIdentifier	 damaged Areas
=	TokenNameEQUAL	
devRLM	TokenNameIdentifier	 dev RLM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
