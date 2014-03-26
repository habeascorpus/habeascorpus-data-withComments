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
MouseEvent	TokenNameIdentifier	 Mouse Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseWheelListener	TokenNameIdentifier	 Mouse Wheel Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventObject	TokenNameIdentifier	 Event Object
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
/** * A concrete version of {@link org.apache.batik.gvt.event.AWTEventDispatcher}. * * This class is used for JDKs &gt;= 1.4, which have MouseWheelEvent * support. For JDKs &lt; 1.4, the file * sources-1.3/org/apache/batik/gvt/event/AWTEventDispatcher defines a * version of this class that does not support MouseWheelEvents. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AWTEventDispatcher.java 575202 2007-09-13 07:45:18Z cam $ */	TokenNameCOMMENT_JAVADOC	 A concrete version of {@link org.apache.batik.gvt.event.AWTEventDispatcher}. * This class is used for JDKs &gt;= 1.4, which have MouseWheelEvent support. For JDKs &lt; 1.4, the file sources-1.3/org/apache/batik/gvt/event/AWTEventDispatcher defines a version of this class that does not support MouseWheelEvents. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AWTEventDispatcher.java 575202 2007-09-13 07:45:18Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AWTEventDispatcher	TokenNameIdentifier	 AWT Event Dispatcher
extends	TokenNameextends	
AbstractAWTEventDispatcher	TokenNameIdentifier	 Abstract AWT Event Dispatcher
implements	TokenNameimplements	
MouseWheelListener	TokenNameIdentifier	 Mouse Wheel Listener
{	TokenNameLBRACE	
/** * Dispatches the specified AWT mouse wheel event down to the GVT tree. * The mouse wheel event is mutated to a GraphicsNodeMouseWheelEvent. * @param evt the mouse event to propagate */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse wheel event down to the GVT tree. The mouse wheel event is mutated to a GraphicsNodeMouseWheelEvent. @param evt the mouse event to propagate 
public	TokenNamepublic	
void	TokenNamevoid	
mouseWheelMoved	TokenNameIdentifier	 mouse Wheel Moved
(	TokenNameLPAREN	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
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
evt	TokenNameIdentifier	 evt
instanceof	TokenNameinstanceof	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
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
dispatchMouseWheelEvent	TokenNameIdentifier	 dispatch Mouse Wheel Event
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT mouse wheel event. * @param evt the mouse wheel event to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT mouse wheel event. @param evt the mouse wheel event to dispatch 
protected	TokenNameprotected	
void	TokenNamevoid	
dispatchMouseWheelEvent	TokenNameIdentifier	 dispatch Mouse Wheel Event
(	TokenNameLPAREN	
MouseWheelEvent	TokenNameIdentifier	 Mouse Wheel Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastHit	TokenNameIdentifier	 last Hit
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processMouseWheelEvent	TokenNameIdentifier	 process Mouse Wheel Event
(	TokenNameLPAREN	
new	TokenNamenew	
GraphicsNodeMouseWheelEvent	TokenNameIdentifier	 Graphics Node Mouse Wheel Event
(	TokenNameLPAREN	
lastHit	TokenNameIdentifier	 last Hit
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
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getModifiersEx	TokenNameIdentifier	 get Modifiers Ex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getCurrentLockState	TokenNameIdentifier	 get Current Lock State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getWheelRotation	TokenNameIdentifier	 get Wheel Rotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Processes the specified event by firing the 'global' listeners * attached to this event dispatcher. * @param evt the event to process */	TokenNameCOMMENT_JAVADOC	 Processes the specified event by firing the 'global' listeners attached to this event dispatcher. @param evt the event to process 
protected	TokenNameprotected	
void	TokenNamevoid	
processMouseWheelEvent	TokenNameIdentifier	 process Mouse Wheel Event
(	TokenNameLPAREN	
GraphicsNodeMouseWheelEvent	TokenNameIdentifier	 Graphics Node Mouse Wheel Event
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
GraphicsNodeMouseWheelListener	TokenNameIdentifier	 Graphics Node Mouse Wheel Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNodeMouseWheelListener	TokenNameIdentifier	 Graphics Node Mouse Wheel Listener
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
getListeners	TokenNameIdentifier	 get Listeners
(	TokenNameLPAREN	
GraphicsNodeMouseWheelListener	TokenNameIdentifier	 Graphics Node Mouse Wheel Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
mouseWheelMoved	TokenNameIdentifier	 mouse Wheel Moved
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Dispatches the specified AWT key event. * @param evt the key event to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified AWT key event. @param evt the key event to dispatch 
protected	TokenNameprotected	
void	TokenNamevoid	
dispatchKeyEvent	TokenNameIdentifier	 dispatch Key Event
(	TokenNameLPAREN	
KeyEvent	TokenNameIdentifier	 Key Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentKeyEventTarget	TokenNameIdentifier	 current Key Event Target
=	TokenNameEQUAL	
lastHit	TokenNameIdentifier	 last Hit
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
currentKeyEventTarget	TokenNameIdentifier	 current Key Event Target
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
root	TokenNameIdentifier	 root
:	TokenNameCOLON	
currentKeyEventTarget	TokenNameIdentifier	 current Key Event Target
;	TokenNameSEMICOLON	
processKeyEvent	TokenNameIdentifier	 process Key Event
(	TokenNameLPAREN	
new	TokenNamenew	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
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
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getModifiersEx	TokenNameIdentifier	 get Modifiers Ex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getCurrentLockState	TokenNameIdentifier	 get Current Lock State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getKeyCode	TokenNameIdentifier	 get Key Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getKeyChar	TokenNameIdentifier	 get Key Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getKeyLocation	TokenNameIdentifier	 get Key Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the modifiers mask for this event. This just calls * {@link InputEvent#getModifiersEx()} on <code>evt</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the modifiers mask for this event. This just calls {@link InputEvent#getModifiersEx()} on <code>evt</code>. 
protected	TokenNameprotected	
int	TokenNameint	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
InputEvent	TokenNameIdentifier	 Input Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getModifiersEx	TokenNameIdentifier	 get Modifiers Ex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the button whose state changed for the given event. This just * calls {@link MouseEvent#getButton()}. */	TokenNameCOMMENT_JAVADOC	 Returns the button whose state changed for the given event. This just calls {@link MouseEvent#getButton()}. 
protected	TokenNameprotected	
int	TokenNameint	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the meta key is down according to the given modifiers * bitfield. */	TokenNameCOMMENT_JAVADOC	 Returns whether the meta key is down according to the given modifiers bitfield. 
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
isMetaDown	TokenNameIdentifier	 is Meta Down
(	TokenNameLPAREN	
int	TokenNameint	
modifiers	TokenNameIdentifier	 modifiers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* META_DOWN_MASK */	TokenNameCOMMENT_BLOCK	 META_DOWN_MASK 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
