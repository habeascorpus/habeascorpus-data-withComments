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
Cursor	TokenNameIdentifier	 Cursor
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
/** * This class represents a pan interactor. * To use it, just redefine the {@link * InteractorAdapter#startInteraction(InputEvent)} method. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractPanInteractor.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a pan interactor. To use it, just redefine the {@link InteractorAdapter#startInteraction(InputEvent)} method. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractPanInteractor.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractPanInteractor	TokenNameIdentifier	 Abstract Pan Interactor
extends	TokenNameextends	
InteractorAdapter	TokenNameIdentifier	 Interactor Adapter
{	TokenNameLBRACE	
/** * The cursor for panning. */	TokenNameCOMMENT_JAVADOC	 The cursor for panning. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Cursor	TokenNameIdentifier	 Cursor
PAN_CURSOR	TokenNameIdentifier	 PAN  CURSOR
=	TokenNameEQUAL	
new	TokenNamenew	
Cursor	TokenNameIdentifier	 Cursor
(	TokenNameLPAREN	
Cursor	TokenNameIdentifier	 Cursor
.	TokenNameDOT	
MOVE_CURSOR	TokenNameIdentifier	 MOVE  CURSOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** * To store the previous cursor. */	TokenNameCOMMENT_JAVADOC	 To store the previous cursor. 
protected	TokenNameprotected	
Cursor	TokenNameIdentifier	 Cursor
previousCursor	TokenNameIdentifier	 previous Cursor
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
previousCursor	TokenNameIdentifier	 previous Cursor
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getCursor	TokenNameIdentifier	 get Cursor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setCursor	TokenNameIdentifier	 set Cursor
(	TokenNameLPAREN	
PAN_CURSOR	TokenNameIdentifier	 PAN  CURSOR
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
if	TokenNameif	
(	TokenNameLPAREN	
finished	TokenNameIdentifier	 finished
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
xCurrent	TokenNameIdentifier	 x Current
-	TokenNameMINUS	
xStart	TokenNameIdentifier	 x Start
,	TokenNameCOMMA	
yCurrent	TokenNameIdentifier	 y Current
-	TokenNameMINUS	
yStart	TokenNameIdentifier	 y Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
rt	TokenNameIdentifier	 rt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getRenderingTransform	TokenNameIdentifier	 get Rendering Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rt	TokenNameIdentifier	 rt
.	TokenNameDOT	
preConcatenate	TokenNameIdentifier	 pre Concatenate
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setRenderingTransform	TokenNameIdentifier	 set Rendering Transform
(	TokenNameLPAREN	
rt	TokenNameIdentifier	 rt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getCursor	TokenNameIdentifier	 get Cursor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
PAN_CURSOR	TokenNameIdentifier	 PAN  CURSOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setCursor	TokenNameIdentifier	 set Cursor
(	TokenNameLPAREN	
previousCursor	TokenNameIdentifier	 previous Cursor
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
setPaintingTransform	TokenNameIdentifier	 set Painting Transform
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getCursor	TokenNameIdentifier	 get Cursor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
PAN_CURSOR	TokenNameIdentifier	 PAN  CURSOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setCursor	TokenNameIdentifier	 set Cursor
(	TokenNameLPAREN	
previousCursor	TokenNameIdentifier	 previous Cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
xCurrent	TokenNameIdentifier	 x Current
-	TokenNameMINUS	
xStart	TokenNameIdentifier	 x Start
,	TokenNameCOMMA	
yCurrent	TokenNameIdentifier	 y Current
-	TokenNameMINUS	
yStart	TokenNameIdentifier	 y Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setPaintingTransform	TokenNameIdentifier	 set Painting Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
