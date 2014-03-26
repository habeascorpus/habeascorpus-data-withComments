/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
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
ArrayList	TokenNameIdentifier	 Array List
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
ImageRenderer	TokenNameIdentifier	 Image Renderer
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
/** * This class manages the rendering of a GVT tree. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: RepaintManager.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class manages the rendering of a GVT tree. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: RepaintManager.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
RepaintManager	TokenNameIdentifier	 Repaint Manager
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COPY_OVERHEAD	TokenNameIdentifier	 COPY  OVERHEAD
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COPY_LINE_OVERHEAD	TokenNameIdentifier	 COPY  LINE  OVERHEAD
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The renderer used to repaint the buffer. */	TokenNameCOMMENT_JAVADOC	 The renderer used to repaint the buffer. 
protected	TokenNameprotected	
ImageRenderer	TokenNameIdentifier	 Image Renderer
renderer	TokenNameIdentifier	 renderer
;	TokenNameSEMICOLON	
/** * Creates a new repaint manager. */	TokenNameCOMMENT_JAVADOC	 Creates a new repaint manager. 
public	TokenNamepublic	
RepaintManager	TokenNameIdentifier	 Repaint Manager
(	TokenNameLPAREN	
ImageRenderer	TokenNameIdentifier	 Image Renderer
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
renderer	TokenNameIdentifier	 renderer
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Updates the rendering buffer. * @param areas The areas of interest in renderer space units. * @return the list of the rectangles to repaint. */	TokenNameCOMMENT_JAVADOC	 Updates the rendering buffer. @param areas The areas of interest in renderer space units. @return the list of the rectangles to repaint. 
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
updateRendering	TokenNameIdentifier	 update Rendering
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
areas	TokenNameIdentifier	 areas
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
areas	TokenNameIdentifier	 areas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
rects	TokenNameIdentifier	 rects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
areas	TokenNameIdentifier	 areas
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
areas	TokenNameIdentifier	 areas
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r2d	TokenNameIdentifier	 r2d
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This rectangle must be outset one pixel to ensure 	TokenNameCOMMENT_LINE	This rectangle must be outset one pixel to ensure 
// it includes the effects of anti-aliasing on objects. 	TokenNameCOMMENT_LINE	it includes the effects of anti-aliasing on objects. 
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
x1	TokenNameIdentifier	 x1
-	TokenNameMINUS	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
-	TokenNameMINUS	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rects	TokenNameIdentifier	 rects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RectListManager	TokenNameIdentifier	 Rect List Manager
devRLM	TokenNameIdentifier	 dev RLM
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
devRLM	TokenNameIdentifier	 dev RLM
=	TokenNameEQUAL	
new	TokenNamenew	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
devRLM	TokenNameIdentifier	 dev RLM
.	TokenNameDOT	
mergeRects	TokenNameIdentifier	 merge Rects
(	TokenNameLPAREN	
COPY_OVERHEAD	TokenNameIdentifier	 COPY  OVERHEAD
,	TokenNameCOMMA	
COPY_LINE_OVERHEAD	TokenNameIdentifier	 COPY  LINE  OVERHEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
repaint	TokenNameIdentifier	 repaint
(	TokenNameLPAREN	
devRLM	TokenNameIdentifier	 dev RLM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
devRLM	TokenNameIdentifier	 dev RLM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets up the renderer so that it is ready to render for the new * 'context' defined by the user to device transform, double buffering * state, area of interest and width/height. * @param u2d The user to device transform. * @param dbr Whether the double buffering should be used. * @param aoi The area of interest in the renderer space units. * @param width The offscreen buffer width. * @param height The offscreen buffer width. */	TokenNameCOMMENT_JAVADOC	 Sets up the renderer so that it is ready to render for the new 'context' defined by the user to device transform, double buffering state, area of interest and width/height. @param u2d The user to device transform. @param dbr Whether the double buffering should be used. @param aoi The area of interest in the renderer space units. @param width The offscreen buffer width. @param height The offscreen buffer width. 
public	TokenNamepublic	
void	TokenNamevoid	
setupRenderer	TokenNameIdentifier	 setup Renderer
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
u2d	TokenNameIdentifier	 u2d
,	TokenNameCOMMA	
boolean	TokenNameboolean	
dbr	TokenNameIdentifier	 dbr
,	TokenNameCOMMA	
Shape	TokenNameIdentifier	 Shape
aoi	TokenNameIdentifier	 aoi
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
u2d	TokenNameIdentifier	 u2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
setDoubleBuffered	TokenNameIdentifier	 set Double Buffered
(	TokenNameLPAREN	
dbr	TokenNameIdentifier	 dbr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
updateOffScreen	TokenNameIdentifier	 update Off Screen
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
clearOffScreen	TokenNameIdentifier	 clear Off Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the renderer's offscreen, i.e., the current state as rendered * by the associated renderer. */	TokenNameCOMMENT_JAVADOC	 Returns the renderer's offscreen, i.e., the current state as rendered by the associated renderer. 
public	TokenNamepublic	
BufferedImage	TokenNameIdentifier	 Buffered Image
getOffScreen	TokenNameIdentifier	 get Off Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
getOffScreen	TokenNameIdentifier	 get Off Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
