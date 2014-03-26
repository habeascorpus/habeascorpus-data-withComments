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
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Point	TokenNameIdentifier	 Point
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
Point2D	TokenNameIdentifier	 Point2 D
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
/** * An event which indicates that a mouse action occurred in a graphics node. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: GraphicsNodeMouseEvent.java 575202 2007-09-13 07:45:18Z cam $ */	TokenNameCOMMENT_JAVADOC	 An event which indicates that a mouse action occurred in a graphics node. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: GraphicsNodeMouseEvent.java 575202 2007-09-13 07:45:18Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
extends	TokenNameextends	
GraphicsNodeInputEvent	TokenNameIdentifier	 Graphics Node Input Event
{	TokenNameLBRACE	
/** * The first number in the range of ids used for mouse events. */	TokenNameCOMMENT_JAVADOC	 The first number in the range of ids used for mouse events. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOUSE_FIRST	TokenNameIdentifier	 MOUSE  FIRST
=	TokenNameEQUAL	
500	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "mouseClicked" event. This MouseEvent occurs when a mouse * button is pressed and released. */	TokenNameCOMMENT_JAVADOC	 The id for the "mouseClicked" event. This MouseEvent occurs when a mouse button is pressed and released. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOUSE_CLICKED	TokenNameIdentifier	 MOUSE  CLICKED
=	TokenNameEQUAL	
MOUSE_FIRST	TokenNameIdentifier	 MOUSE  FIRST
;	TokenNameSEMICOLON	
/** * The id for the "mousePressed" event. This MouseEvent occurs when a mouse * button is pushed down. */	TokenNameCOMMENT_JAVADOC	 The id for the "mousePressed" event. This MouseEvent occurs when a mouse button is pushed down. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOUSE_PRESSED	TokenNameIdentifier	 MOUSE  PRESSED
=	TokenNameEQUAL	
MOUSE_FIRST	TokenNameIdentifier	 MOUSE  FIRST
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "mouseReleased" event. This MouseEvent occurs when a mouse * button is let up. */	TokenNameCOMMENT_JAVADOC	 The id for the "mouseReleased" event. This MouseEvent occurs when a mouse button is let up. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOUSE_RELEASED	TokenNameIdentifier	 MOUSE  RELEASED
=	TokenNameEQUAL	
MOUSE_FIRST	TokenNameIdentifier	 MOUSE  FIRST
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "mouseMoved" event. This MouseMotionEvent occurs * when the mouse position changes. */	TokenNameCOMMENT_JAVADOC	 The id for the "mouseMoved" event. This MouseMotionEvent occurs when the mouse position changes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOUSE_MOVED	TokenNameIdentifier	 MOUSE  MOVED
=	TokenNameEQUAL	
MOUSE_FIRST	TokenNameIdentifier	 MOUSE  FIRST
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "mouseEntered" event. This MouseEvent occurs * when the mouse cursor enters a graphics node's area. */	TokenNameCOMMENT_JAVADOC	 The id for the "mouseEntered" event. This MouseEvent occurs when the mouse cursor enters a graphics node's area. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOUSE_ENTERED	TokenNameIdentifier	 MOUSE  ENTERED
=	TokenNameEQUAL	
MOUSE_FIRST	TokenNameIdentifier	 MOUSE  FIRST
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "mouseExited" event. This MouseEvent occurs when * the mouse cursor leaves a graphics node's area. */	TokenNameCOMMENT_JAVADOC	 The id for the "mouseExited" event. This MouseEvent occurs when the mouse cursor leaves a graphics node's area. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOUSE_EXITED	TokenNameIdentifier	 MOUSE  EXITED
=	TokenNameEQUAL	
MOUSE_FIRST	TokenNameIdentifier	 MOUSE  FIRST
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "mouseDragged" event. This MouseEvent * occurs when the mouse position changes while the "drag" * modifier is active (for example, the shift key). */	TokenNameCOMMENT_JAVADOC	 The id for the "mouseDragged" event. This MouseEvent occurs when the mouse position changes while the "drag" modifier is active (for example, the shift key). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOUSE_DRAGGED	TokenNameIdentifier	 MOUSE  DRAGGED
=	TokenNameEQUAL	
MOUSE_FIRST	TokenNameIdentifier	 MOUSE  FIRST
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The graphics node mouse events x coordinate. * The x value is relative to the graphics node that fired the event. */	TokenNameCOMMENT_JAVADOC	 The graphics node mouse events x coordinate. The x value is relative to the graphics node that fired the event. 
float	TokenNamefloat	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The graphics node mouse events y coordinate. * The y value is relative to the graphics node that fired the event. */	TokenNameCOMMENT_JAVADOC	 The graphics node mouse events y coordinate. The y value is relative to the graphics node that fired the event. 
float	TokenNamefloat	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
int	TokenNameint	
clientX	TokenNameIdentifier	 client X
;	TokenNameSEMICOLON	
int	TokenNameint	
clientY	TokenNameIdentifier	 client Y
;	TokenNameSEMICOLON	
int	TokenNameint	
screenX	TokenNameIdentifier	 screen X
;	TokenNameSEMICOLON	
int	TokenNameint	
screenY	TokenNameIdentifier	 screen Y
;	TokenNameSEMICOLON	
/** * Indicates the number of quick consecutive clicks of a mouse button. */	TokenNameCOMMENT_JAVADOC	 Indicates the number of quick consecutive clicks of a mouse button. 
int	TokenNameint	
clickCount	TokenNameIdentifier	 click Count
;	TokenNameSEMICOLON	
/** * The mouse button that changed state. */	TokenNameCOMMENT_JAVADOC	 The mouse button that changed state. 
int	TokenNameint	
button	TokenNameIdentifier	 button
;	TokenNameSEMICOLON	
/** * Additional information. For a MOUSE_EXITED, this will contain the * destination node, for a MOUSE_ENTERED the last node and for * a MOUSE_DRAGGED the node under the mouse pointer. */	TokenNameCOMMENT_JAVADOC	 Additional information. For a MOUSE_EXITED, this will contain the destination node, for a MOUSE_ENTERED the last node and for a MOUSE_DRAGGED the node under the mouse pointer. 
GraphicsNode	TokenNameIdentifier	 Graphics Node
relatedNode	TokenNameIdentifier	 related Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructs a new graphics node mouse event. * @param source the graphics node where the event originated * @param id the id of this event * @param when the time the event occurred * @param modifiers the modifier keys down when event occurred * @param lockState the lock keys active when the event occurred * @param button the mouse button that changed state * @param x the mouse x coordinate * @param y the mouse y coordinate * @param screenX the mouse x coordinate relative to the screen * @param screenY the mouse y coordinate relative to the screen * @param clickCount the number of clicks * @param relatedNode the related node * @see #getRelatedNode */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node mouse event. @param source the graphics node where the event originated @param id the id of this event @param when the time the event occurred @param modifiers the modifier keys down when event occurred @param lockState the lock keys active when the event occurred @param button the mouse button that changed state @param x the mouse x coordinate @param y the mouse y coordinate @param screenX the mouse x coordinate relative to the screen @param screenY the mouse y coordinate relative to the screen @param clickCount the number of clicks @param relatedNode the related node @see #getRelatedNode 
public	TokenNamepublic	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
when	TokenNameIdentifier	 when
,	TokenNameCOMMA	
int	TokenNameint	
modifiers	TokenNameIdentifier	 modifiers
,	TokenNameCOMMA	
int	TokenNameint	
lockState	TokenNameIdentifier	 lock State
,	TokenNameCOMMA	
int	TokenNameint	
button	TokenNameIdentifier	 button
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
clientX	TokenNameIdentifier	 client X
,	TokenNameCOMMA	
int	TokenNameint	
clientY	TokenNameIdentifier	 client Y
,	TokenNameCOMMA	
int	TokenNameint	
screenX	TokenNameIdentifier	 screen X
,	TokenNameCOMMA	
int	TokenNameint	
screenY	TokenNameIdentifier	 screen Y
,	TokenNameCOMMA	
int	TokenNameint	
clickCount	TokenNameIdentifier	 click Count
,	TokenNameCOMMA	
GraphicsNode	TokenNameIdentifier	 Graphics Node
relatedNode	TokenNameIdentifier	 related Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
when	TokenNameIdentifier	 when
,	TokenNameCOMMA	
modifiers	TokenNameIdentifier	 modifiers
,	TokenNameCOMMA	
lockState	TokenNameIdentifier	 lock State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
button	TokenNameIdentifier	 button
=	TokenNameEQUAL	
button	TokenNameIdentifier	 button
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clientX	TokenNameIdentifier	 client X
=	TokenNameEQUAL	
clientX	TokenNameIdentifier	 client X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clientY	TokenNameIdentifier	 client Y
=	TokenNameEQUAL	
clientY	TokenNameIdentifier	 client Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
screenX	TokenNameIdentifier	 screen X
=	TokenNameEQUAL	
screenX	TokenNameIdentifier	 screen X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
screenY	TokenNameIdentifier	 screen Y
=	TokenNameEQUAL	
screenY	TokenNameIdentifier	 screen Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clickCount	TokenNameIdentifier	 click Count
=	TokenNameEQUAL	
clickCount	TokenNameIdentifier	 click Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
relatedNode	TokenNameIdentifier	 related Node
=	TokenNameEQUAL	
relatedNode	TokenNameIdentifier	 related Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new graphics node mouse event from an AWT MouseEvent. * @param source the source where the event originated * @param evt the AWT mouse event which is the source of this * GraphicsNodeEvent */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node mouse event from an AWT MouseEvent. @param source the source where the event originated @param evt the AWT mouse event which is the source of this GraphicsNodeEvent 
public	TokenNamepublic	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
,	TokenNameCOMMA	
int	TokenNameint	
button	TokenNameIdentifier	 button
,	TokenNameCOMMA	
int	TokenNameint	
lockState	TokenNameIdentifier	 lock State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
,	TokenNameCOMMA	
lockState	TokenNameIdentifier	 lock State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
button	TokenNameIdentifier	 button
=	TokenNameEQUAL	
button	TokenNameIdentifier	 button
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clickCount	TokenNameIdentifier	 click Count
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getClickCount	TokenNameIdentifier	 get Click Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the mouse button that changed state. */	TokenNameCOMMENT_JAVADOC	 Returns the mouse button that changed state. 
public	TokenNamepublic	
int	TokenNameint	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
button	TokenNameIdentifier	 button
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the horizontal x position of the event relative to the * source graphics node. * @return x a float indicating horizontal position relative to the node */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal x position of the event relative to the source graphics node. @return x a float indicating horizontal position relative to the node 
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vertical y position of the event relative to the source node. * @return y a float indicating vertical position relative to the node */	TokenNameCOMMENT_JAVADOC	 Returns the vertical y position of the event relative to the source node. @return y a float indicating vertical position relative to the node 
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the horizontal x position of the event relative to the * source graphics node. * @return x a float indicating horizontal position relative to the node */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal x position of the event relative to the source graphics node. @return x a float indicating horizontal position relative to the node 
public	TokenNamepublic	
float	TokenNamefloat	
getClientX	TokenNameIdentifier	 get Client X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clientX	TokenNameIdentifier	 client X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vertical y position of the event relative to the source node. * @return y a float indicating vertical position relative to the node */	TokenNameCOMMENT_JAVADOC	 Returns the vertical y position of the event relative to the source node. @return y a float indicating vertical position relative to the node 
public	TokenNamepublic	
float	TokenNamefloat	
getClientY	TokenNameIdentifier	 get Client Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clientY	TokenNameIdentifier	 client Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the horizontal x position of the event relative to the * screen. * @return x a float indicating horizontal position relative to the screen */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal x position of the event relative to the screen. @return x a float indicating horizontal position relative to the screen 
public	TokenNamepublic	
int	TokenNameint	
getScreenX	TokenNameIdentifier	 get Screen X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
screenX	TokenNameIdentifier	 screen X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vertical y position of the event relative to the screen. * @return y a float indicating vertical position relative to the screen */	TokenNameCOMMENT_JAVADOC	 Returns the vertical y position of the event relative to the screen. @return y a float indicating vertical position relative to the screen 
public	TokenNamepublic	
int	TokenNameint	
getScreenY	TokenNameIdentifier	 get Screen Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
screenY	TokenNameIdentifier	 screen Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the (x, y) position of the event relative to the screen. * @return a Point object containing the x and y coordinates */	TokenNameCOMMENT_JAVADOC	 Returns the (x, y) position of the event relative to the screen. @return a Point object containing the x and y coordinates 
public	TokenNamepublic	
Point	TokenNameIdentifier	 Point
getScreenPoint	TokenNameIdentifier	 get Screen Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
screenX	TokenNameIdentifier	 screen X
,	TokenNameCOMMA	
screenY	TokenNameIdentifier	 screen Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the (x, y) position of the event relative to the screen. * @return a Point object containing the x and y coordinates */	TokenNameCOMMENT_JAVADOC	 Returns the (x, y) position of the event relative to the screen. @return a Point object containing the x and y coordinates 
public	TokenNamepublic	
Point	TokenNameIdentifier	 Point
getClientPoint	TokenNameIdentifier	 get Client Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
clientX	TokenNameIdentifier	 client X
,	TokenNameCOMMA	
clientY	TokenNameIdentifier	 client Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the (x, y) position of the event relative to the source node. * @return a Point object containing the x and y coordinates */	TokenNameCOMMENT_JAVADOC	 Returns the (x, y) position of the event relative to the source node. @return a Point object containing the x and y coordinates 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getPoint2D	TokenNameIdentifier	 get Point2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of mouse clicks associated with this event. * @return integer value for the number of clicks */	TokenNameCOMMENT_JAVADOC	 Returns the number of mouse clicks associated with this event. @return integer value for the number of clicks 
public	TokenNamepublic	
int	TokenNameint	
getClickCount	TokenNameIdentifier	 get Click Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clickCount	TokenNameIdentifier	 click Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the related node for this <code>GraphicsNodeMouseEvent</code>. * For a <code>MOUSE_ENTERED</code> event it is the previous node target, * for a <code>MOUSE_EXITED</code> event it is the next node target and * for a <code>MOUSE_DRAGGED</code> event it is the node under the mouse * pointer. Otherwise the value is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the related node for this <code>GraphicsNodeMouseEvent</code>. For a <code>MOUSE_ENTERED</code> event it is the previous node target, for a <code>MOUSE_EXITED</code> event it is the next node target and for a <code>MOUSE_DRAGGED</code> event it is the node under the mouse pointer. Otherwise the value is <code>null</code>. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getRelatedNode	TokenNameIdentifier	 get Related Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
relatedNode	TokenNameIdentifier	 related Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
