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
/** * This class represents a zoom interactor. * To use it, just redefine the {@link * InteractorAdapter#startInteraction(InputEvent)} method. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractImageZoomInteractor.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a zoom interactor. To use it, just redefine the {@link InteractorAdapter#startInteraction(InputEvent)} method. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractImageZoomInteractor.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AbstractImageZoomInteractor	TokenNameIdentifier	 Abstract Image Zoom Interactor
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
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getPaintingTransform	TokenNameIdentifier	 get Painting Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setRenderingTransform	TokenNameIdentifier	 set Rendering Transform
(	TokenNameLPAREN	
rt	TokenNameIdentifier	 rt
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
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
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
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
xStart	TokenNameIdentifier	 x Start
,	TokenNameCOMMA	
yStart	TokenNameIdentifier	 y Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
yCurrent	TokenNameIdentifier	 y Current
-	TokenNameMINUS	
yStart	TokenNameIdentifier	 y Start
;	TokenNameSEMICOLON	
double	TokenNamedouble	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dy	TokenNameIdentifier	 dy
-=	TokenNameMINUS_EQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
>	TokenNameGREATER	
-	TokenNameMINUS	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1.0	TokenNameDoubleLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
15.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dy	TokenNameIdentifier	 dy
+=	TokenNamePLUS_EQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
<	TokenNameLESS	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1.0	TokenNameDoubleLiteral	
:	TokenNameCOLON	
dy	TokenNameIdentifier	 dy
/	TokenNameDIVIDE	
15.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
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
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setPaintingTransform	TokenNameIdentifier	 set Painting Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
