/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
BasicStroke	TokenNameIdentifier	 Basic Stroke
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
Dimension	TokenNameIdentifier	 Dimension
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics	TokenNameIdentifier	 Graphics
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
InputEvent	TokenNameIdentifier	 Input Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseEvent	TokenNameIdentifier	 Mouse Event
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
Line2D	TokenNameIdentifier	 Line2 D
;	TokenNameSEMICOLON	
/** * This class represents a zoom interactor. * To use it, just redefine the {@link * InteractorAdapter#startInteraction(InputEvent)} method. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractZoomInteractor.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a zoom interactor. To use it, just redefine the {@link InteractorAdapter#startInteraction(InputEvent)} method. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractZoomInteractor.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AbstractZoomInteractor	TokenNameIdentifier	 Abstract Zoom Interactor
extends	TokenNameextends	
InteractorAdapter	TokenNameIdentifier	 Interactor Adapter
{	TokenNameLBRACE	
/** * Whether the interactor has finished. */	TokenNameCOMMENT_JAVADOC	 Whether the interactor has finished. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The mouse x start position. */	TokenNameCOMMENT_JAVADOC	 The mouse x start position. 
protected	TokenNameprotected	
int	TokenNameint	
xStart	TokenNameIdentifier	 x Start
;	TokenNameSEMICOLON	
/** * The mouse y start position. */	TokenNameCOMMENT_JAVADOC	 The mouse y start position. 
protected	TokenNameprotected	
int	TokenNameint	
yStart	TokenNameIdentifier	 y Start
;	TokenNameSEMICOLON	
/** * The mouse x current position. */	TokenNameCOMMENT_JAVADOC	 The mouse x current position. 
protected	TokenNameprotected	
int	TokenNameint	
xCurrent	TokenNameIdentifier	 x Current
;	TokenNameSEMICOLON	
/** * The mouse y current position. */	TokenNameCOMMENT_JAVADOC	 The mouse y current position. 
protected	TokenNameprotected	
int	TokenNameint	
yCurrent	TokenNameIdentifier	 y Current
;	TokenNameSEMICOLON	
/** * The zoom marker top line. */	TokenNameCOMMENT_JAVADOC	 The zoom marker top line. 
protected	TokenNameprotected	
Line2D	TokenNameIdentifier	 Line2 D
markerTop	TokenNameIdentifier	 marker Top
;	TokenNameSEMICOLON	
/** * The zoom marker left line. */	TokenNameCOMMENT_JAVADOC	 The zoom marker left line. 
protected	TokenNameprotected	
Line2D	TokenNameIdentifier	 Line2 D
markerLeft	TokenNameIdentifier	 marker Left
;	TokenNameSEMICOLON	
/** * The zoom marker bottom line. */	TokenNameCOMMENT_JAVADOC	 The zoom marker bottom line. 
protected	TokenNameprotected	
Line2D	TokenNameIdentifier	 Line2 D
markerBottom	TokenNameIdentifier	 marker Bottom
;	TokenNameSEMICOLON	
/** * The zoom marker right line. */	TokenNameCOMMENT_JAVADOC	 The zoom marker right line. 
protected	TokenNameprotected	
Line2D	TokenNameIdentifier	 Line2 D
markerRight	TokenNameIdentifier	 marker Right
;	TokenNameSEMICOLON	
/** * The overlay. */	TokenNameCOMMENT_JAVADOC	 The overlay. 
protected	TokenNameprotected	
Overlay	TokenNameIdentifier	 Overlay
overlay	TokenNameIdentifier	 overlay
=	TokenNameEQUAL	
new	TokenNamenew	
ZoomOverlay	TokenNameIdentifier	 Zoom Overlay
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to draw marker */	TokenNameCOMMENT_JAVADOC	 Used to draw marker 
protected	TokenNameprotected	
BasicStroke	TokenNameIdentifier	 Basic Stroke
markerStroke	TokenNameIdentifier	 marker Stroke
=	TokenNameEQUAL	
new	TokenNamenew	
BasicStroke	TokenNameIdentifier	 Basic Stroke
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BasicStroke	TokenNameIdentifier	 Basic Stroke
.	TokenNameDOT	
CAP_SQUARE	TokenNameIdentifier	 CAP  SQUARE
,	TokenNameCOMMA	
BasicStroke	TokenNameIdentifier	 Basic Stroke
.	TokenNameDOT	
JOIN_MITER	TokenNameIdentifier	 JOIN  MITER
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tells whether the interactor has finished. */	TokenNameCOMMENT_JAVADOC	 Tells whether the interactor has finished. 
public	TokenNamepublic	
boolean	TokenNameboolean	
endInteraction	TokenNameIdentifier	 end Interaction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
finished	TokenNameIdentifier	 finished
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// MouseListener /////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	MouseListener /////////////////////////////////////////////////////// 
/** * Invoked when a mouse button has been pressed on a component. */	TokenNameCOMMENT_JAVADOC	 Invoked when a mouse button has been pressed on a component. 
public	TokenNamepublic	
void	TokenNamevoid	
mousePressed	TokenNameIdentifier	 mouse Pressed
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
finished	TokenNameIdentifier	 finished
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mouseExited	TokenNameIdentifier	 mouse Exited
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
markerTop	TokenNameIdentifier	 marker Top
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
markerLeft	TokenNameIdentifier	 marker Left
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
markerBottom	TokenNameIdentifier	 marker Bottom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
markerRight	TokenNameIdentifier	 marker Right
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
xStart	TokenNameIdentifier	 x Start
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yStart	TokenNameIdentifier	 y Start
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JGVTComponent	TokenNameIdentifier	 JGVT Component
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JGVTComponent	TokenNameIdentifier	 JGVT Component
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getOverlays	TokenNameIdentifier	 get Overlays
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
overlay	TokenNameIdentifier	 overlay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when a mouse button has been released on a component. */	TokenNameCOMMENT_JAVADOC	 Invoked when a mouse button has been released on a component. 
public	TokenNamepublic	
void	TokenNamevoid	
mouseReleased	TokenNameIdentifier	 mouse Released
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
JGVTComponent	TokenNameIdentifier	 JGVT Component
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JGVTComponent	TokenNameIdentifier	 JGVT Component
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getOverlays	TokenNameIdentifier	 get Overlays
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
overlay	TokenNameIdentifier	 overlay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
overlay	TokenNameIdentifier	 overlay
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGraphics	TokenNameIdentifier	 get Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xCurrent	TokenNameIdentifier	 x Current
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yCurrent	TokenNameIdentifier	 y Current
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xCurrent	TokenNameIdentifier	 x Current
-	TokenNameMINUS	
xStart	TokenNameIdentifier	 x Start
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
yCurrent	TokenNameIdentifier	 y Current
-	TokenNameMINUS	
yStart	TokenNameIdentifier	 y Start
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
xCurrent	TokenNameIdentifier	 x Current
-	TokenNameMINUS	
xStart	TokenNameIdentifier	 x Start
;	TokenNameSEMICOLON	
int	TokenNameint	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
yCurrent	TokenNameIdentifier	 y Current
-	TokenNameMINUS	
yStart	TokenNameIdentifier	 y Start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
-	TokenNameMINUS	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
xStart	TokenNameIdentifier	 x Start
=	TokenNameEQUAL	
xCurrent	TokenNameIdentifier	 x Current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
-	TokenNameMINUS	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
yStart	TokenNameIdentifier	 y Start
=	TokenNameEQUAL	
yCurrent	TokenNameIdentifier	 y Current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Dimension	TokenNameIdentifier	 Dimension
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Zoom factor 	TokenNameCOMMENT_LINE	Zoom factor 
float	TokenNamefloat	
scaleX	TokenNameIdentifier	 scale X
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
.	TokenNameDOT	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
float	TokenNamefloat	
scaleY	TokenNameIdentifier	 scale Y
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
.	TokenNameDOT	
height	TokenNameIdentifier	 height
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
float	TokenNamefloat	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
scaleX	TokenNameIdentifier	 scale X
<	TokenNameLESS	
scaleY	TokenNameIdentifier	 scale Y
)	TokenNameRPAREN	
?	TokenNameQUESTION	
scaleX	TokenNameIdentifier	 scale X
:	TokenNameCOLON	
scaleY	TokenNameIdentifier	 scale Y
;	TokenNameSEMICOLON	
// Zoom translate 	TokenNameCOMMENT_LINE	Zoom translate 
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
-	TokenNameMINUS	
xStart	TokenNameIdentifier	 x Start
,	TokenNameCOMMA	
-	TokenNameMINUS	
yStart	TokenNameIdentifier	 y Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getRenderingTransform	TokenNameIdentifier	 get Rendering Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setRenderingTransform	TokenNameIdentifier	 set Rendering Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Invoked when the mouse exits a component. */	TokenNameCOMMENT_JAVADOC	 Invoked when the mouse exits a component. 
public	TokenNamepublic	
void	TokenNamevoid	
mouseExited	TokenNameIdentifier	 mouse Exited
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
JGVTComponent	TokenNameIdentifier	 JGVT Component
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JGVTComponent	TokenNameIdentifier	 JGVT Component
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getOverlays	TokenNameIdentifier	 get Overlays
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
overlay	TokenNameIdentifier	 overlay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
overlay	TokenNameIdentifier	 overlay
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGraphics	TokenNameIdentifier	 get Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// MouseMotionListener ///////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	MouseMotionListener ///////////////////////////////////////////////// 
/** * Invoked when a mouse button is pressed on a component and then * dragged. Mouse drag events will continue to be delivered to * the component where the first originated until the mouse button is * released (regardless of whether the mouse position is within the * bounds of the component). */	TokenNameCOMMENT_JAVADOC	 Invoked when a mouse button is pressed on a component and then dragged. Mouse drag events will continue to be delivered to the component where the first originated until the mouse button is released (regardless of whether the mouse position is within the bounds of the component). 
public	TokenNamepublic	
void	TokenNamevoid	
mouseDragged	TokenNameIdentifier	 mouse Dragged
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JGVTComponent	TokenNameIdentifier	 JGVT Component
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JGVTComponent	TokenNameIdentifier	 JGVT Component
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
overlay	TokenNameIdentifier	 overlay
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGraphics	TokenNameIdentifier	 get Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xCurrent	TokenNameIdentifier	 x Current
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yCurrent	TokenNameIdentifier	 y Current
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Constrain rectangle to window's Aspect Ratio. 	TokenNameCOMMENT_LINE	Constrain rectangle to window's Aspect Ratio. 
float	TokenNamefloat	
xMin	TokenNameIdentifier	 x Min
,	TokenNameCOMMA	
yMin	TokenNameIdentifier	 y Min
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xStart	TokenNameIdentifier	 x Start
<	TokenNameLESS	
xCurrent	TokenNameIdentifier	 x Current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xMin	TokenNameIdentifier	 x Min
=	TokenNameEQUAL	
xStart	TokenNameIdentifier	 x Start
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
xCurrent	TokenNameIdentifier	 x Current
-	TokenNameMINUS	
xStart	TokenNameIdentifier	 x Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
xMin	TokenNameIdentifier	 x Min
=	TokenNameEQUAL	
xCurrent	TokenNameIdentifier	 x Current
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
xStart	TokenNameIdentifier	 x Start
-	TokenNameMINUS	
xCurrent	TokenNameIdentifier	 x Current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
yStart	TokenNameIdentifier	 y Start
<	TokenNameLESS	
yCurrent	TokenNameIdentifier	 y Current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yMin	TokenNameIdentifier	 y Min
=	TokenNameEQUAL	
yStart	TokenNameIdentifier	 y Start
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
yCurrent	TokenNameIdentifier	 y Current
-	TokenNameMINUS	
yStart	TokenNameIdentifier	 y Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
yMin	TokenNameIdentifier	 y Min
=	TokenNameEQUAL	
yCurrent	TokenNameIdentifier	 y Current
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
yStart	TokenNameIdentifier	 y Start
-	TokenNameMINUS	
yCurrent	TokenNameIdentifier	 y Current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Dimension	TokenNameIdentifier	 Dimension
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
compAR	TokenNameIdentifier	 comp AR
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compAR	TokenNameIdentifier	 comp AR
>	TokenNameGREATER	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
compAR	TokenNameIdentifier	 comp AR
*	TokenNameMULTIPLY	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
compAR	TokenNameIdentifier	 comp AR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
markerTop	TokenNameIdentifier	 marker Top
=	TokenNameEQUAL	
new	TokenNamenew	
Line2D	TokenNameIdentifier	 Line2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
xMin	TokenNameIdentifier	 x Min
,	TokenNameCOMMA	
yMin	TokenNameIdentifier	 y Min
,	TokenNameCOMMA	
xMin	TokenNameIdentifier	 x Min
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
yMin	TokenNameIdentifier	 y Min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
markerLeft	TokenNameIdentifier	 marker Left
=	TokenNameEQUAL	
new	TokenNamenew	
Line2D	TokenNameIdentifier	 Line2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
xMin	TokenNameIdentifier	 x Min
,	TokenNameCOMMA	
yMin	TokenNameIdentifier	 y Min
,	TokenNameCOMMA	
xMin	TokenNameIdentifier	 x Min
,	TokenNameCOMMA	
yMin	TokenNameIdentifier	 y Min
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
markerBottom	TokenNameIdentifier	 marker Bottom
=	TokenNameEQUAL	
new	TokenNamenew	
Line2D	TokenNameIdentifier	 Line2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
xMin	TokenNameIdentifier	 x Min
,	TokenNameCOMMA	
yMin	TokenNameIdentifier	 y Min
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
xMin	TokenNameIdentifier	 x Min
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
yMin	TokenNameIdentifier	 y Min
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
markerRight	TokenNameIdentifier	 marker Right
=	TokenNameEQUAL	
new	TokenNamenew	
Line2D	TokenNameIdentifier	 Line2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
xMin	TokenNameIdentifier	 x Min
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
yMin	TokenNameIdentifier	 y Min
,	TokenNameCOMMA	
xMin	TokenNameIdentifier	 x Min
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
yMin	TokenNameIdentifier	 y Min
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
overlay	TokenNameIdentifier	 overlay
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGraphics	TokenNameIdentifier	 get Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To paint the interactor. */	TokenNameCOMMENT_JAVADOC	 To paint the interactor. 
protected	TokenNameprotected	
class	TokenNameclass	
ZoomOverlay	TokenNameIdentifier	 Zoom Overlay
implements	TokenNameimplements	
Overlay	TokenNameIdentifier	 Overlay
{	TokenNameLBRACE	
/** * Paints this overlay. */	TokenNameCOMMENT_JAVADOC	 Paints this overlay. 
public	TokenNamepublic	
void	TokenNamevoid	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
Graphics	TokenNameIdentifier	 Graphics
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
markerTop	TokenNameIdentifier	 marker Top
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
)	TokenNameRPAREN	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setXORMode	TokenNameIdentifier	 set XOR Mode
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
white	TokenNameIdentifier	 white
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setStroke	TokenNameIdentifier	 set Stroke
(	TokenNameLPAREN	
markerStroke	TokenNameIdentifier	 marker Stroke
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
markerTop	TokenNameIdentifier	 marker Top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
markerLeft	TokenNameIdentifier	 marker Left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
markerBottom	TokenNameIdentifier	 marker Bottom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
markerRight	TokenNameIdentifier	 marker Right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
