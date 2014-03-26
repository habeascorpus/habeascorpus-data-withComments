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
Dimension	TokenNameIdentifier	 Dimension
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
/** * This class represents a rotate interactor. * To use it, just redefine the {@link * InteractorAdapter#startInteraction(InputEvent)} method. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractRotateInteractor.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a rotate interactor. To use it, just redefine the {@link InteractorAdapter#startInteraction(InputEvent)} method. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractRotateInteractor.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AbstractRotateInteractor	TokenNameIdentifier	 Abstract Rotate Interactor
extends	TokenNameextends	
InteractorAdapter	TokenNameIdentifier	 Interactor Adapter
{	TokenNameLBRACE	
/** * Whether the interactor has finished. */	TokenNameCOMMENT_JAVADOC	 Whether the interactor has finished. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
finished	TokenNameIdentifier	 finished
;	TokenNameSEMICOLON	
/** * The initial rotation angle. */	TokenNameCOMMENT_JAVADOC	 The initial rotation angle. 
protected	TokenNameprotected	
double	TokenNamedouble	
initialRotation	TokenNameIdentifier	 initial Rotation
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
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
false	TokenNamefalse	
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
Dimension	TokenNameIdentifier	 Dimension
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
height	TokenNameIdentifier	 height
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cos	TokenNameIdentifier	 cos
=	TokenNameEQUAL	
-	TokenNameMINUS	
dy	TokenNameIdentifier	 dy
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initialRotation	TokenNameIdentifier	 initial Rotation
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
acos	TokenNameIdentifier	 acos
(	TokenNameLPAREN	
cos	TokenNameIdentifier	 cos
)	TokenNameRPAREN	
:	TokenNameCOLON	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
acos	TokenNameIdentifier	 acos
(	TokenNameLPAREN	
cos	TokenNameIdentifier	 cos
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
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
rotateTransform	TokenNameIdentifier	 rotate Transform
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
setPaintingTransform	TokenNameIdentifier	 set Painting Transform
(	TokenNameLPAREN	
null	TokenNamenull	
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
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setPaintingTransform	TokenNameIdentifier	 set Painting Transform
(	TokenNameLPAREN	
rotateTransform	TokenNameIdentifier	 rotate Transform
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the rotate transform. */	TokenNameCOMMENT_JAVADOC	 Returns the rotate transform. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
rotateTransform	TokenNameIdentifier	 rotate Transform
(	TokenNameLPAREN	
Dimension	TokenNameIdentifier	 Dimension
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
height	TokenNameIdentifier	 height
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cos	TokenNameIdentifier	 cos
=	TokenNameEQUAL	
-	TokenNameMINUS	
dy	TokenNameIdentifier	 dy
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
acos	TokenNameIdentifier	 acos
(	TokenNameLPAREN	
cos	TokenNameIdentifier	 cos
)	TokenNameRPAREN	
:	TokenNameCOLON	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
acos	TokenNameIdentifier	 acos
(	TokenNameLPAREN	
cos	TokenNameIdentifier	 cos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
angle	TokenNameIdentifier	 angle
-=	TokenNameMINUS_EQUAL	
initialRotation	TokenNameIdentifier	 initial Rotation
;	TokenNameSEMICOLON	
return	TokenNamereturn	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getRotateInstance	TokenNameIdentifier	 get Rotate Instance
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
height	TokenNameIdentifier	 height
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
