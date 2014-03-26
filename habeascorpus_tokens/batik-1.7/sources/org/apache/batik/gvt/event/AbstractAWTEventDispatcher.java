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
Toolkit	TokenNameIdentifier	 Toolkit
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
KeyEvent	TokenNameIdentifier	 Key Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
KeyListener	TokenNameIdentifier	 Key Listener
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseListener	TokenNameIdentifier	 Mouse Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseMotionListener	TokenNameIdentifier	 Mouse Motion Listener
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
Point2D	TokenNameIdentifier	 Point2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Array	TokenNameIdentifier	 Array
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventListener	TokenNameIdentifier	 Event Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventObject	TokenNameIdentifier	 Event Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
EventListenerList	TokenNameIdentifier	 Event Listener List
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
/** * An EventDispatcher implementation based on AWT events. * * <p>Mouse events are dispatched to their "containing" node (the * GraphicsNode corresponding to the mouse event coordinate). Searches * for containment are performed from the EventDispatcher's "root" * node.</p> * * This class is made abstract so that concrete versions can be made * for different JDK versions. * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> * @version $Id: AbstractAWTEventDispatcher.java 575202 2007-09-13 07:45:18Z cam $ */	TokenNameCOMMENT_JAVADOC	 An EventDispatcher implementation based on AWT events. * <p>Mouse events are dispatched to their "containing" node (the GraphicsNode corresponding to the mouse event coordinate). Searches for containment are performed from the EventDispatcher's "root" node.</p> * This class is made abstract so that concrete versions can be made for different JDK versions. * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> @version $Id: AbstractAWTEventDispatcher.java 575202 2007-09-13 07:45:18Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractAWTEventDispatcher	TokenNameIdentifier	 Abstract AWT Event Dispatcher
implements	TokenNameimplements	
EventDispatcher	TokenNameIdentifier	 Event Dispatcher
,	TokenNameCOMMA	
MouseListener	TokenNameIdentifier	 Mouse Listener
,	TokenNameCOMMA	
MouseMotionListener	TokenNameIdentifier	 Mouse Motion Listener
,	TokenNameCOMMA	
KeyListener	TokenNameIdentifier	 Key Listener
{	TokenNameLBRACE	
/** * The root GraphicsNode as determined by setRootNode(). */	TokenNameCOMMENT_JAVADOC	 The root GraphicsNode as determined by setRootNode(). 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
/** * The base AffineTransform for InputEvent-to-GraphicsNodeEvent * coordinates as determined by setBaseTransform(). */	TokenNameCOMMENT_JAVADOC	 The base AffineTransform for InputEvent-to-GraphicsNodeEvent coordinates as determined by setBaseTransform(). 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
baseTransform	TokenNameIdentifier	 base Transform
;	TokenNameSEMICOLON	
/** * The global listener list. */	TokenNameCOMMENT_JAVADOC	 The global listener list. 
protected	TokenNameprotected	
EventListenerList	TokenNameIdentifier	 Event Listener List
glisteners	TokenNameIdentifier	 glisteners
;	TokenNameSEMICOLON	
/** * The lastest node which has been targeted by an event. */	TokenNameCOMMENT_JAVADOC	 The lastest node which has been targeted by an event. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
lastHit	TokenNameIdentifier	 last Hit
;	TokenNameSEMICOLON	
/** * The current GraphicsNode targeted by an key events. */	TokenNameCOMMENT_JAVADOC	 The current GraphicsNode targeted by an key events. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
currentKeyEventTarget	TokenNameIdentifier	 current Key Event Target
;	TokenNameSEMICOLON	
/** * These are used to queue events while a rendering event * is in progress. */	TokenNameCOMMENT_JAVADOC	 These are used to queue events while a rendering event is in progress. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
eventQueue	TokenNameIdentifier	 event Queue
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
eventDispatchEnabled	TokenNameIdentifier	 event Dispatch Enabled
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
eventQueueMaxSize	TokenNameIdentifier	 event Queue Max Size
=	TokenNameEQUAL	
MAX_QUEUE_SIZE	TokenNameIdentifier	 MAX  QUEUE  SIZE
;	TokenNameSEMICOLON	
/** * default max size of the event queue. */	TokenNameCOMMENT_JAVADOC	 default max size of the event queue. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_QUEUE_SIZE	TokenNameIdentifier	 MAX  QUEUE  SIZE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nodeIncrementEventID	TokenNameIdentifier	 node Increment Event ID
=	TokenNameEQUAL	
KeyEvent	TokenNameIdentifier	 Key Event
.	TokenNameDOT	
KEY_PRESSED	TokenNameIdentifier	 KEY  PRESSED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nodeIncrementEventCode	TokenNameIdentifier	 node Increment Event Code
=	TokenNameEQUAL	
KeyEvent	TokenNameIdentifier	 Key Event
.	TokenNameDOT	
VK_TAB	TokenNameIdentifier	 VK  TAB
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nodeIncrementEventModifiers	TokenNameIdentifier	 node Increment Event Modifiers
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nodeDecrementEventID	TokenNameIdentifier	 node Decrement Event ID
=	TokenNameEQUAL	
KeyEvent	TokenNameIdentifier	 Key Event
.	TokenNameDOT	
KEY_PRESSED	TokenNameIdentifier	 KEY  PRESSED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nodeDecrementEventCode	TokenNameIdentifier	 node Decrement Event Code
=	TokenNameEQUAL	
KeyEvent	TokenNameIdentifier	 Key Event
.	TokenNameDOT	
VK_TAB	TokenNameIdentifier	 VK  TAB
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nodeDecrementEventModifiers	TokenNameIdentifier	 node Decrement Event Modifiers
=	TokenNameEQUAL	
InputEvent	TokenNameIdentifier	 Input Event
.	TokenNameDOT	
SHIFT_MASK	TokenNameIdentifier	 SHIFT  MASK
;	TokenNameSEMICOLON	
/** * Constructs a new event dispatcher. */	TokenNameCOMMENT_JAVADOC	 Constructs a new event dispatcher. 
public	TokenNamepublic	
AbstractAWTEventDispatcher	TokenNameIdentifier	 Abstract AWT Event Dispatcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the root node for MouseEvent dispatch containment searches * and field selections. * @param root the root node */	TokenNameCOMMENT_JAVADOC	 Sets the root node for MouseEvent dispatch containment searches and field selections. @param root the root node 
public	TokenNamepublic	
void	TokenNamevoid	
setRootNode	TokenNameIdentifier	 set Root Node
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
root	TokenNameIdentifier	 root
!=	TokenNameNOT_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// new root so clear 'old' events. 	TokenNameCOMMENT_LINE	new root so clear 'old' events. 
this	TokenNamethis	
.	TokenNameDOT	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the root node for MouseEvent dispatch containment * searches and field selections. */	TokenNameCOMMENT_JAVADOC	 Returns the root node for MouseEvent dispatch containment searches and field selections. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getRootNode	TokenNameIdentifier	 get Root Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the base transform applied to MouseEvent coordinates prior * to dispatch. * @param t the affine transform */	TokenNameCOMMENT_JAVADOC	 Sets the base transform applied to MouseEvent coordinates prior to dispatch. @param t the affine transform 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseTransform	TokenNameIdentifier	 set Base Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
baseTransform	TokenNameIdentifier	 base Transform
!=	TokenNameNOT_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
baseTransform	TokenNameIdentifier	 base Transform
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
baseTransform	TokenNameIdentifier	 base Transform
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// new Display transform so events are not where user 	TokenNameCOMMENT_LINE	new Display transform so events are not where user 
// thinks they were. 	TokenNameCOMMENT_LINE	thinks they were. 
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseTransform	TokenNameIdentifier	 base Transform
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the base transform applied to MouseEvent coordinates prior * to dispatch. */	TokenNameCOMMENT_JAVADOC	 Returns the base transform applied to MouseEvent coordinates prior to dispatch. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getBaseTransform	TokenNameIdentifier	 get Base Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
baseTransform	TokenNameIdentifier	 base Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// AWT listeners wrapper 	TokenNameCOMMENT_LINE	AWT listeners wrapper 
// 	TokenNameCOMMENT_LINE	 
/** * Dispatches the specified AWT mouse event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeMouseEvent. * @param evt the mouse event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse event down to the GVT tree. The mouse event is mutated to a GraphicsNodeMouseEvent. @param evt the mouse event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
mousePressed	TokenNameIdentifier	 mouse Pressed
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT mouse event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeMouseEvent. * @param evt the mouse event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse event down to the GVT tree. The mouse event is mutated to a GraphicsNodeMouseEvent. @param evt the mouse event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
mouseReleased	TokenNameIdentifier	 mouse Released
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT mouse event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeMouseEvent. * @param evt the mouse event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse event down to the GVT tree. The mouse event is mutated to a GraphicsNodeMouseEvent. @param evt the mouse event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
mouseEntered	TokenNameIdentifier	 mouse Entered
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT mouse event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeMouseEvent. * @param evt the mouse event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse event down to the GVT tree. The mouse event is mutated to a GraphicsNodeMouseEvent. @param evt the mouse event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
mouseExited	TokenNameIdentifier	 mouse Exited
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT mouse event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeMouseEvent. * @param evt the mouse event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse event down to the GVT tree. The mouse event is mutated to a GraphicsNodeMouseEvent. @param evt the mouse event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
mouseClicked	TokenNameIdentifier	 mouse Clicked
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT mouse event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeMouseEvent. * @param evt the mouse event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse event down to the GVT tree. The mouse event is mutated to a GraphicsNodeMouseEvent. @param evt the mouse event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
mouseMoved	TokenNameIdentifier	 mouse Moved
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT mouse event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeMouseEvent. * @param evt the mouse event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse event down to the GVT tree. The mouse event is mutated to a GraphicsNodeMouseEvent. @param evt the mouse event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
mouseDragged	TokenNameIdentifier	 mouse Dragged
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT key event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeKeyEvent. * @param evt the key event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT key event down to the GVT tree. The mouse event is mutated to a GraphicsNodeKeyEvent. @param evt the key event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
keyPressed	TokenNameIdentifier	 key Pressed
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT key event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeKeyEvent. * @param evt the key event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT key event down to the GVT tree. The mouse event is mutated to a GraphicsNodeKeyEvent. @param evt the key event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
keyReleased	TokenNameIdentifier	 key Released
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT key event down to the GVT tree. * The mouse event is mutated to a GraphicsNodeKeyEvent. * @param evt the key event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT key event down to the GVT tree. The mouse event is mutated to a GraphicsNodeKeyEvent. @param evt the key event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
keyTyped	TokenNameIdentifier	 key Typed
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Global GVT listeners support 	TokenNameCOMMENT_LINE	Global GVT listeners support 
// 	TokenNameCOMMENT_LINE	 
/** * Adds the specified 'global' GraphicsNodeMouseListener which is * notified of all MouseEvents dispatched. * @param l the listener to add */	TokenNameCOMMENT_JAVADOC	 Adds the specified 'global' GraphicsNodeMouseListener which is notified of all MouseEvents dispatched. @param l the listener to add 
public	TokenNamepublic	
void	TokenNamevoid	
addGraphicsNodeMouseListener	TokenNameIdentifier	 add Graphics Node Mouse Listener
(	TokenNameLPAREN	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glisteners	TokenNameIdentifier	 glisteners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glisteners	TokenNameIdentifier	 glisteners
=	TokenNameEQUAL	
new	TokenNamenew	
EventListenerList	TokenNameIdentifier	 Event Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
glisteners	TokenNameIdentifier	 glisteners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the specified 'global' GraphicsNodeMouseListener which is * notified of all MouseEvents dispatched. * @param l the listener to remove */	TokenNameCOMMENT_JAVADOC	 Removes the specified 'global' GraphicsNodeMouseListener which is notified of all MouseEvents dispatched. @param l the listener to remove 
public	TokenNamepublic	
void	TokenNamevoid	
removeGraphicsNodeMouseListener	TokenNameIdentifier	 remove Graphics Node Mouse Listener
(	TokenNameLPAREN	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glisteners	TokenNameIdentifier	 glisteners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glisteners	TokenNameIdentifier	 glisteners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the specified 'global' GraphicsNodeMouseWheelListener which is * notified of all MouseWheelEvents dispatched. * @param l the listener to add */	TokenNameCOMMENT_JAVADOC	 Adds the specified 'global' GraphicsNodeMouseWheelListener which is notified of all MouseWheelEvents dispatched. @param l the listener to add 
public	TokenNamepublic	
void	TokenNamevoid	
addGraphicsNodeMouseWheelListener	TokenNameIdentifier	 add Graphics Node Mouse Wheel Listener
(	TokenNameLPAREN	
GraphicsNodeMouseWheelListener	TokenNameIdentifier	 Graphics Node Mouse Wheel Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glisteners	TokenNameIdentifier	 glisteners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glisteners	TokenNameIdentifier	 glisteners
=	TokenNameEQUAL	
new	TokenNamenew	
EventListenerList	TokenNameIdentifier	 Event Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
glisteners	TokenNameIdentifier	 glisteners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GraphicsNodeMouseWheelListener	TokenNameIdentifier	 Graphics Node Mouse Wheel Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the specified 'global' GraphicsNodeMouseWheelListener which is * notified of all MouseWheelEvents dispatched. * @param l the listener to remove */	TokenNameCOMMENT_JAVADOC	 Removes the specified 'global' GraphicsNodeMouseWheelListener which is notified of all MouseWheelEvents dispatched. @param l the listener to remove 
public	TokenNamepublic	
void	TokenNamevoid	
removeGraphicsNodeMouseWheelListener	TokenNameIdentifier	 remove Graphics Node Mouse Wheel Listener
(	TokenNameLPAREN	
GraphicsNodeMouseWheelListener	TokenNameIdentifier	 Graphics Node Mouse Wheel Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glisteners	TokenNameIdentifier	 glisteners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glisteners	TokenNameIdentifier	 glisteners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
GraphicsNodeMouseWheelListener	TokenNameIdentifier	 Graphics Node Mouse Wheel Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the specified 'global' GraphicsNodeKeyListener which is * notified of all KeyEvents dispatched. * @param l the listener to add */	TokenNameCOMMENT_JAVADOC	 Adds the specified 'global' GraphicsNodeKeyListener which is notified of all KeyEvents dispatched. @param l the listener to add 
public	TokenNamepublic	
void	TokenNamevoid	
addGraphicsNodeKeyListener	TokenNameIdentifier	 add Graphics Node Key Listener
(	TokenNameLPAREN	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glisteners	TokenNameIdentifier	 glisteners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glisteners	TokenNameIdentifier	 glisteners
=	TokenNameEQUAL	
new	TokenNamenew	
EventListenerList	TokenNameIdentifier	 Event Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
glisteners	TokenNameIdentifier	 glisteners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the specified 'global' GraphicsNodeKeyListener which is * notified of all KeyEvents dispatched. * @param l the listener to remove */	TokenNameCOMMENT_JAVADOC	 Removes the specified 'global' GraphicsNodeKeyListener which is notified of all KeyEvents dispatched. @param l the listener to remove 
public	TokenNamepublic	
void	TokenNamevoid	
removeGraphicsNodeKeyListener	TokenNameIdentifier	 remove Graphics Node Key Listener
(	TokenNameLPAREN	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glisteners	TokenNameIdentifier	 glisteners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glisteners	TokenNameIdentifier	 glisteners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns an array of listeners that were added to this event * dispatcher and of the specified type. * @param listenerType the type of the listeners to return */	TokenNameCOMMENT_JAVADOC	 Returns an array of listeners that were added to this event dispatcher and of the specified type. @param listenerType the type of the listeners to return 
public	TokenNamepublic	
EventListener	TokenNameIdentifier	 Event Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getListeners	TokenNameIdentifier	 get Listeners
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
listenerType	TokenNameIdentifier	 listener Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO the listeners should be cached per class in a map. 	TokenNameCOMMENT_LINE	TODO the listeners should be cached per class in a map. 
// this list is build again and again in mouse-event-handling... 	TokenNameCOMMENT_LINE	this list is build again and again in mouse-event-handling... 
// note: the cache must be flushed when the gListeners is modified 	TokenNameCOMMENT_LINE	note: the cache must be flushed when the gListeners is modified 
Object	TokenNameIdentifier	 Object
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
Array	TokenNameIdentifier	 Array
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
listenerType	TokenNameIdentifier	 listener Type
,	TokenNameCOMMA	
glisteners	TokenNameIdentifier	 glisteners
.	TokenNameDOT	
getListenerCount	TokenNameIdentifier	 get Listener Count
(	TokenNameLPAREN	
listenerType	TokenNameIdentifier	 listener Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pairElements	TokenNameIdentifier	 pair Elements
=	TokenNameEQUAL	
glisteners	TokenNameIdentifier	 glisteners
.	TokenNameDOT	
getListenerList	TokenNameIdentifier	 get Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pairElements	TokenNameIdentifier	 pair Elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pairElements	TokenNameIdentifier	 pair Elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
listenerType	TokenNameIdentifier	 listener Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Array	TokenNameIdentifier	 Array
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
pairElements	TokenNameIdentifier	 pair Elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Event dispatch implementation 	TokenNameCOMMENT_LINE	Event dispatch implementation 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
setEventDispatchEnabled	TokenNameIdentifier	 set Event Dispatch Enabled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventDispatchEnabled	TokenNameIdentifier	 event Dispatch Enabled
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eventDispatchEnabled	TokenNameIdentifier	 event Dispatch Enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Dispatch any queued events. 	TokenNameCOMMENT_LINE	Dispatch any queued events. 
while	TokenNamewhile	
(	TokenNameLPAREN	
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventObject	TokenNameIdentifier	 Event Object
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventObject	TokenNameIdentifier	 Event Object
)	TokenNameRPAREN	
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEventQueueMaxSize	TokenNameIdentifier	 set Event Queue Max Size
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventQueueMaxSize	TokenNameIdentifier	 event Queue Max Size
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the current size is larger than the new size: shrink 	TokenNameCOMMENT_LINE	the current size is larger than the new size: shrink 
while	TokenNamewhile	
(	TokenNameLPAREN	
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
eventQueueMaxSize	TokenNameIdentifier	 event Queue Max Size
)	TokenNameRPAREN	
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT event. * @param evt the event to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT event. @param evt the event to dispatch 
public	TokenNamepublic	
void	TokenNamevoid	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
EventObject	TokenNameIdentifier	 Event Object
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// No root do not store anything. 	TokenNameCOMMENT_LINE	No root do not store anything. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
eventDispatchEnabled	TokenNameIdentifier	 event Dispatch Enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eventQueueMaxSize	TokenNameIdentifier	 event Queue Max Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
eventQueueMaxSize	TokenNameIdentifier	 event Queue Max Size
)	TokenNameRPAREN	
// Limit how many events we queue - don't want 	TokenNameCOMMENT_LINE	Limit how many events we queue - don't want 
// user waiting forever for them to clear. 	TokenNameCOMMENT_LINE	user waiting forever for them to clear. 
eventQueue	TokenNameIdentifier	 event Queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
instanceof	TokenNameinstanceof	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchMouseEvent	TokenNameIdentifier	 dispatch Mouse Event
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
instanceof	TokenNameinstanceof	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputEvent	TokenNameIdentifier	 Input Event
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isNodeIncrementEvent	TokenNameIdentifier	 is Node Increment Event
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
incrementKeyTarget	TokenNameIdentifier	 increment Key Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isNodeDecrementEvent	TokenNameIdentifier	 is Node Decrement Event
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decrementKeyTarget	TokenNameIdentifier	 decrement Key Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dispatchKeyEvent	TokenNameIdentifier	 dispatch Key Event
(	TokenNameLPAREN	
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a bitmask representing the state of the key locks. */	TokenNameCOMMENT_JAVADOC	 Returns a bitmask representing the state of the key locks. 
protected	TokenNameprotected	
int	TokenNameint	
getCurrentLockState	TokenNameIdentifier	 get Current Lock State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Toolkit	TokenNameIdentifier	 Toolkit
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
Toolkit	TokenNameIdentifier	 Toolkit
.	TokenNameDOT	
getDefaultToolkit	TokenNameIdentifier	 get Default Toolkit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lockState	TokenNameIdentifier	 lock State
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getLockingKeyState	TokenNameIdentifier	 get Locking Key State
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
.	TokenNameDOT	
VK_KANA_LOCK	TokenNameIdentifier	 VK  KANA  LOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lockState	TokenNameIdentifier	 lock State
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
lockState	TokenNameIdentifier	 lock State
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getLockingKeyState	TokenNameIdentifier	 get Locking Key State
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
.	TokenNameDOT	
VK_SCROLL_LOCK	TokenNameIdentifier	 VK  SCROLL  LOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lockState	TokenNameIdentifier	 lock State
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
lockState	TokenNameIdentifier	 lock State
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getLockingKeyState	TokenNameIdentifier	 get Locking Key State
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
.	TokenNameDOT	
VK_NUM_LOCK	TokenNameIdentifier	 VK  NUM  LOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lockState	TokenNameIdentifier	 lock State
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
lockState	TokenNameIdentifier	 lock State
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getLockingKeyState	TokenNameIdentifier	 get Locking Key State
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
.	TokenNameDOT	
VK_CAPS_LOCK	TokenNameIdentifier	 VK  CAPS  LOCK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lockState	TokenNameIdentifier	 lock State
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
lockState	TokenNameIdentifier	 lock State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT key event. * Abstract because KeyEvent.getKeyLocation() is available only in * JDKs &gt;= 1.4. * @param evt the key event to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT key event. Abstract because KeyEvent.getKeyLocation() is available only in JDKs &gt;= 1.4. @param evt the key event to dispatch 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
dispatchKeyEvent	TokenNameIdentifier	 dispatch Key Event
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the modifiers mask for this event. Overridden in the descendent * class to use {@link InputEvent#getModifiers()} in JRE 1.3 or * {@link InputEvent#getModifiersEx()} in JREs &gt;= 1.4. */	TokenNameCOMMENT_JAVADOC	 Returns the modifiers mask for this event. Overridden in the descendent class to use {@link InputEvent#getModifiers()} in JRE 1.3 or {@link InputEvent#getModifiersEx()} in JREs &gt;= 1.4. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the button whose state changed for the given event. Overridden * in the descendant class to use {@link InputEvent#getModifiers()} in JRE * 1.3 or {@link MouseEvent#getButton()} in JREs &gt;= 1.4. */	TokenNameCOMMENT_JAVADOC	 Returns the button whose state changed for the given event. Overridden in the descendant class to use {@link InputEvent#getModifiers()} in JRE 1.3 or {@link MouseEvent#getButton()} in JREs &gt;= 1.4. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Dispatches the specified AWT mouse event. * @param evt the mouse event to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse event. @param evt the mouse event to dispatch 
protected	TokenNameprotected	
void	TokenNamevoid	
dispatchMouseEvent	TokenNameIdentifier	 dispatch Mouse Event
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
gvtevt	TokenNameIdentifier	 gvtevt
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
gnp	TokenNameIdentifier	 gnp
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseTransform	TokenNameIdentifier	 base Transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gnp	TokenNameIdentifier	 gnp
=	TokenNameEQUAL	
baseTransform	TokenNameIdentifier	 base Transform
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
nodeHitAt	TokenNameIdentifier	 node Hit At
(	TokenNameLPAREN	
gnp	TokenNameIdentifier	 gnp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the receiving node has changed, send a notification 	TokenNameCOMMENT_LINE	If the receiving node has changed, send a notification 
// check if we enter a new node 	TokenNameCOMMENT_LINE	check if we enter a new node 
Point	TokenNameIdentifier	 Point
screenPos	TokenNameIdentifier	 screen Pos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getComponent	TokenNameIdentifier	 get Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isShowing	TokenNameIdentifier	 is Showing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
screenPos	TokenNameIdentifier	 screen Pos
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
screenPos	TokenNameIdentifier	 screen Pos
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getComponent	TokenNameIdentifier	 get Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocationOnScreen	TokenNameIdentifier	 get Location On Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
currentLockState	TokenNameIdentifier	 current Lock State
=	TokenNameEQUAL	
getCurrentLockState	TokenNameIdentifier	 get Current Lock State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastHit	TokenNameIdentifier	 last Hit
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// post a MOUSE_EXITED event 	TokenNameCOMMENT_LINE	post a MOUSE_EXITED event 
if	TokenNameif	
(	TokenNameLPAREN	
lastHit	TokenNameIdentifier	 last Hit
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gvtevt	TokenNameIdentifier	 gvtevt
=	TokenNameEQUAL	
new	TokenNamenew	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
(	TokenNameLPAREN	
lastHit	TokenNameIdentifier	 last Hit
,	TokenNameCOMMA	
MouseEvent	TokenNameIdentifier	 Mouse Event
.	TokenNameDOT	
MOUSE_EXITED	TokenNameIdentifier	 MOUSE  EXITED
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getWhen	TokenNameIdentifier	 get When
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentLockState	TokenNameIdentifier	 current Lock State
,	TokenNameCOMMA	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gnp	TokenNameIdentifier	 gnp
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gnp	TokenNameIdentifier	 gnp
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// evt.getX() ?? 	TokenNameCOMMENT_LINE	evt.getX() ?? 
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// evt.getY() ?? 	TokenNameCOMMENT_LINE	evt.getY() ?? 
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getClickCount	TokenNameIdentifier	 get Click Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processMouseEvent	TokenNameIdentifier	 process Mouse Event
(	TokenNameLPAREN	
gvtevt	TokenNameIdentifier	 gvtevt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// lastHit.processMouseEvent(gvtevt); 	TokenNameCOMMENT_LINE	lastHit.processMouseEvent(gvtevt); 
}	TokenNameRBRACE	
// post a MOUSE_ENTERED event 	TokenNameCOMMENT_LINE	post a MOUSE_ENTERED event 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gvtevt	TokenNameIdentifier	 gvtevt
=	TokenNameEQUAL	
new	TokenNamenew	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
MouseEvent	TokenNameIdentifier	 Mouse Event
.	TokenNameDOT	
MOUSE_ENTERED	TokenNameIdentifier	 MOUSE  ENTERED
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getWhen	TokenNameIdentifier	 get When
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentLockState	TokenNameIdentifier	 current Lock State
,	TokenNameCOMMA	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gnp	TokenNameIdentifier	 gnp
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gnp	TokenNameIdentifier	 gnp
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getClickCount	TokenNameIdentifier	 get Click Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastHit	TokenNameIdentifier	 last Hit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processMouseEvent	TokenNameIdentifier	 process Mouse Event
(	TokenNameLPAREN	
gvtevt	TokenNameIdentifier	 gvtevt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// node.processMouseEvent(gvtevt); 	TokenNameCOMMENT_LINE	node.processMouseEvent(gvtevt); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// In all cases, dispatch the original event 	TokenNameCOMMENT_LINE	In all cases, dispatch the original event 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gvtevt	TokenNameIdentifier	 gvtevt
=	TokenNameEQUAL	
new	TokenNamenew	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getWhen	TokenNameIdentifier	 get When
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentLockState	TokenNameIdentifier	 current Lock State
,	TokenNameCOMMA	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gnp	TokenNameIdentifier	 gnp
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gnp	TokenNameIdentifier	 gnp
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getClickCount	TokenNameIdentifier	 get Click Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// node.processMouseEvent(gvtevt); 	TokenNameCOMMENT_LINE	node.processMouseEvent(gvtevt); 
processMouseEvent	TokenNameIdentifier	 process Mouse Event
(	TokenNameLPAREN	
gvtevt	TokenNameIdentifier	 gvtevt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this is a deselect event, dispatch it to the root 	TokenNameCOMMENT_LINE	this is a deselect event, dispatch it to the root 
gvtevt	TokenNameIdentifier	 gvtevt
=	TokenNameEQUAL	
new	TokenNamenew	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getWhen	TokenNameIdentifier	 get When
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentLockState	TokenNameIdentifier	 current Lock State
,	TokenNameCOMMA	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gnp	TokenNameIdentifier	 gnp
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gnp	TokenNameIdentifier	 gnp
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
screenPos	TokenNameIdentifier	 screen Pos
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getClickCount	TokenNameIdentifier	 get Click Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processMouseEvent	TokenNameIdentifier	 process Mouse Event
(	TokenNameLPAREN	
gvtevt	TokenNameIdentifier	 gvtevt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastHit	TokenNameIdentifier	 last Hit
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Processes the specified event by firing the 'global' listeners * attached to this event dispatcher. * @param evt the event to process */	TokenNameCOMMENT_JAVADOC	 Processes the specified event by firing the 'global' listeners attached to this event dispatcher. @param evt the event to process 
protected	TokenNameprotected	
void	TokenNamevoid	
processMouseEvent	TokenNameIdentifier	 process Mouse Event
(	TokenNameLPAREN	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glisteners	TokenNameIdentifier	 glisteners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
getListeners	TokenNameIdentifier	 get Listeners
(	TokenNameLPAREN	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
.	TokenNameDOT	
MOUSE_MOVED	TokenNameIdentifier	 MOUSE  MOVED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
mouseMoved	TokenNameIdentifier	 mouse Moved
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
.	TokenNameDOT	
MOUSE_DRAGGED	TokenNameIdentifier	 MOUSE  DRAGGED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
mouseDragged	TokenNameIdentifier	 mouse Dragged
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
.	TokenNameDOT	
MOUSE_ENTERED	TokenNameIdentifier	 MOUSE  ENTERED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
mouseEntered	TokenNameIdentifier	 mouse Entered
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
.	TokenNameDOT	
MOUSE_EXITED	TokenNameIdentifier	 MOUSE  EXITED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
mouseExited	TokenNameIdentifier	 mouse Exited
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
.	TokenNameDOT	
MOUSE_CLICKED	TokenNameIdentifier	 MOUSE  CLICKED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
mouseClicked	TokenNameIdentifier	 mouse Clicked
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
.	TokenNameDOT	
MOUSE_PRESSED	TokenNameIdentifier	 MOUSE  PRESSED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
mousePressed	TokenNameIdentifier	 mouse Pressed
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GraphicsNodeMouseEvent	TokenNameIdentifier	 Graphics Node Mouse Event
.	TokenNameDOT	
MOUSE_RELEASED	TokenNameIdentifier	 MOUSE  RELEASED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
mouseReleased	TokenNameIdentifier	 mouse Released
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Unknown Mouse Event type: "	TokenNameStringLiteral	Unknown Mouse Event type: 
+	TokenNamePLUS	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Dispatches a graphics node key event to by firing the 'global' * listeners attached to this event dispatcher. * * @param evt the evt to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatches a graphics node key event to by firing the 'global' listeners attached to this event dispatcher. * @param evt the evt to dispatch 
public	TokenNamepublic	
void	TokenNamevoid	
processKeyEvent	TokenNameIdentifier	 process Key Event
(	TokenNameLPAREN	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
glisteners	TokenNameIdentifier	 glisteners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
getListeners	TokenNameIdentifier	 get Listeners
(	TokenNameLPAREN	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
.	TokenNameDOT	
KEY_PRESSED	TokenNameIdentifier	 KEY  PRESSED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
keyPressed	TokenNameIdentifier	 key Pressed
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
.	TokenNameDOT	
KEY_RELEASED	TokenNameIdentifier	 KEY  RELEASED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
keyReleased	TokenNameIdentifier	 key Released
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
.	TokenNameDOT	
KEY_TYPED	TokenNameIdentifier	 KEY  TYPED
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
keyTyped	TokenNameIdentifier	 key Typed
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Unknown Key Event type: "	TokenNameStringLiteral	Unknown Key Event type: 
+	TokenNamePLUS	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
incrementKeyTarget	TokenNameIdentifier	 increment Key Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// <!> FIXME TODO: Not implemented. 	TokenNameCOMMENT_LINE	<!> FIXME TODO: Not implemented. 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Increment not implemented."	TokenNameStringLiteral	Increment not implemented.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
decrementKeyTarget	TokenNameIdentifier	 decrement Key Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// <!> FIXME TODO: Not implemented. 	TokenNameCOMMENT_LINE	<!> FIXME TODO: Not implemented. 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Decrement not implemented."	TokenNameStringLiteral	Decrement not implemented.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Associates all InputEvents of type <tt>e.getID()</tt> * with "incrementing" of the currently selected GraphicsNode. */	TokenNameCOMMENT_JAVADOC	 Associates all InputEvents of type <tt>e.getID()</tt> with "incrementing" of the currently selected GraphicsNode. 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeIncrementEvent	TokenNameIdentifier	 set Node Increment Event
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeIncrementEventID	TokenNameIdentifier	 node Increment Event ID
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeIncrementEventCode	TokenNameIdentifier	 node Increment Event Code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getKeyCode	TokenNameIdentifier	 get Key Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nodeIncrementEventModifiers	TokenNameIdentifier	 node Increment Event Modifiers
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Associates all InputEvents of type <tt>e.getID()</tt> * with "decrementing" of the currently selected GraphicsNode. * The notion of "currently selected" GraphicsNode is used * for dispatching KeyEvents. */	TokenNameCOMMENT_JAVADOC	 Associates all InputEvents of type <tt>e.getID()</tt> with "decrementing" of the currently selected GraphicsNode. The notion of "currently selected" GraphicsNode is used for dispatching KeyEvents. 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeDecrementEvent	TokenNameIdentifier	 set Node Decrement Event
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeDecrementEventID	TokenNameIdentifier	 node Decrement Event ID
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeDecrementEventCode	TokenNameIdentifier	 node Decrement Event Code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getKeyCode	TokenNameIdentifier	 get Key Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nodeDecrementEventModifiers	TokenNameIdentifier	 node Decrement Event Modifiers
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the input event e is a node increment event, * false otherwise. * @param e the input event */	TokenNameCOMMENT_JAVADOC	 Returns true if the input event e is a node increment event, false otherwise. @param e the input event 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isNodeIncrementEvent	TokenNameIdentifier	 is Node Increment Event
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DONE: Improve code readability! 	TokenNameCOMMENT_LINE	DONE: Improve code readability! 
// return ((e.getID() == nodeIncrementEventID) && 	TokenNameCOMMENT_LINE	return ((e.getID() == nodeIncrementEventID) && 
// ((e instanceof KeyEvent) ? 	TokenNameCOMMENT_LINE	((e instanceof KeyEvent) ? 
// (((KeyEvent) e).getKeyCode() == nodeIncrementEventCode) : true) && 	TokenNameCOMMENT_LINE	(((KeyEvent) e).getKeyCode() == nodeIncrementEventCode) : true) && 
// ((e.getModifiers() & nodeIncrementEventModifiers) != 0)); 	TokenNameCOMMENT_LINE	((e.getModifiers() & nodeIncrementEventModifiers) != 0)); 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeIncrementEventID	TokenNameIdentifier	 node Increment Event ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not an incrementEvent: false 	TokenNameCOMMENT_LINE	not an incrementEvent: false 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getKeyCode	TokenNameIdentifier	 get Key Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeIncrementEventCode	TokenNameIdentifier	 node Increment Event Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// it was a KeyEvent, but not a nodeIncrementEventCode : false 	TokenNameCOMMENT_LINE	it was a KeyEvent, but not a nodeIncrementEventCode : false 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// here: it was not a KeyEvent at all OR a KeyEvent with nodeIncrementEventCode 	TokenNameCOMMENT_LINE	here: it was not a KeyEvent at all OR a KeyEvent with nodeIncrementEventCode 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
nodeIncrementEventModifiers	TokenNameIdentifier	 node Increment Event Modifiers
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no nodeIncrementEventModifiers were set: false 	TokenNameCOMMENT_LINE	no nodeIncrementEventModifiers were set: false 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this is the only path to success... 	TokenNameCOMMENT_LINE	this is the only path to success... 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the input event e is a node decrement event, * false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the input event e is a node decrement event, false otherwise. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isNodeDecrementEvent	TokenNameIdentifier	 is Node Decrement Event
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DONE: Improve code readability! YES !! 	TokenNameCOMMENT_LINE	DONE: Improve code readability! YES !! 
// return ((e.getID() == nodeDecrementEventID) && 	TokenNameCOMMENT_LINE	return ((e.getID() == nodeDecrementEventID) && 
// ((e instanceof KeyEvent) ? 	TokenNameCOMMENT_LINE	((e instanceof KeyEvent) ? 
// ( ((KeyEvent) e).getKeyCode() == nodeDecrementEventCode) : true) && 	TokenNameCOMMENT_LINE	( ((KeyEvent) e).getKeyCode() == nodeDecrementEventCode) : true) && 
// ((e.getModifiers() & nodeDecrementEventModifiers) != 0 )); 	TokenNameCOMMENT_LINE	((e.getModifiers() & nodeDecrementEventModifiers) != 0 )); 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeDecrementEventID	TokenNameIdentifier	 node Decrement Event ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not an nodeDecrementEvent: false 	TokenNameCOMMENT_LINE	not an nodeDecrementEvent: false 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getKeyCode	TokenNameIdentifier	 get Key Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeDecrementEventCode	TokenNameIdentifier	 node Decrement Event Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// it was a KeyEvent, but not a nodeDecrementEventCode : false 	TokenNameCOMMENT_LINE	it was a KeyEvent, but not a nodeDecrementEventCode : false 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// here: it was not a KeyEvent at all OR a KeyEvent with nodeIncrementEventCode 	TokenNameCOMMENT_LINE	here: it was not a KeyEvent at all OR a KeyEvent with nodeIncrementEventCode 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
nodeDecrementEventModifiers	TokenNameIdentifier	 node Decrement Event Modifiers
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no nodeDecrementEventModifiers were set: false 	TokenNameCOMMENT_LINE	no nodeDecrementEventModifiers were set: false 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this is the only path to success... 	TokenNameCOMMENT_LINE	this is the only path to success... 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
