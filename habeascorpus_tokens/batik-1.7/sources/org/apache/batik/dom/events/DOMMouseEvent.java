/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
EventTarget	TokenNameIdentifier	 Event Target
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
MouseEvent	TokenNameIdentifier	 Mouse Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
views	TokenNameIdentifier	 views
.	TokenNameDOT	
AbstractView	TokenNameIdentifier	 Abstract View
;	TokenNameSEMICOLON	
/** * The MouseEvent class provides specific contextual information * associated with Mouse events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DOMMouseEvent.java 598494 2007-11-27 02:46:33Z cam $ */	TokenNameCOMMENT_JAVADOC	 The MouseEvent class provides specific contextual information associated with Mouse events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DOMMouseEvent.java 598494 2007-11-27 02:46:33Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMMouseEvent	TokenNameIdentifier	 DOM Mouse Event
extends	TokenNameextends	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
implements	TokenNameimplements	
MouseEvent	TokenNameIdentifier	 Mouse Event
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
screenX	TokenNameIdentifier	 screen X
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
screenY	TokenNameIdentifier	 screen Y
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
clientX	TokenNameIdentifier	 client X
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
clientY	TokenNameIdentifier	 client Y
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
button	TokenNameIdentifier	 button
;	TokenNameSEMICOLON	
private	TokenNameprivate	
EventTarget	TokenNameIdentifier	 Event Target
relatedTarget	TokenNameIdentifier	 related Target
;	TokenNameSEMICOLON	
/** * The modifier keys in effect at the time of the event. */	TokenNameCOMMENT_JAVADOC	 The modifier keys in effect at the time of the event. 
protected	TokenNameprotected	
HashSet	TokenNameIdentifier	 Hash Set
modifierKeys	TokenNameIdentifier	 modifier Keys
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * DOM: <code>screenX</code> indicates the horizontal coordinate * at which the event occurred relative to the origin of the * screen coordinate system. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>screenX</code> indicates the horizontal coordinate at which the event occurred relative to the origin of the screen coordinate system. 
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
/** * DOM: <code>screenY</code> indicates the vertical coordinate at * which the event occurred relative to the origin of the screen * coordinate system. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>screenY</code> indicates the vertical coordinate at which the event occurred relative to the origin of the screen coordinate system. 
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
/** * DOM: <code>clientX</code> indicates the horizontal coordinate * at which the event occurred relative to the DOM * implementation's client area. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>clientX</code> indicates the horizontal coordinate at which the event occurred relative to the DOM implementation's client area. 
public	TokenNamepublic	
int	TokenNameint	
getClientX	TokenNameIdentifier	 get Client X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clientX	TokenNameIdentifier	 client X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: <code>clientY</code> indicates the vertical coordinate at * which the event occurred relative to the DOM implementation's * client area. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>clientY</code> indicates the vertical coordinate at which the event occurred relative to the DOM implementation's client area. 
public	TokenNamepublic	
int	TokenNameint	
getClientY	TokenNameIdentifier	 get Client Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clientY	TokenNameIdentifier	 client Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: <code>ctrlKey</code> indicates whether the 'ctrl' key was * depressed during the firing of the event. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>ctrlKey</code> indicates whether the 'ctrl' key was depressed during the firing of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCtrlKey	TokenNameIdentifier	 get Ctrl Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
.	TokenNameDOT	
KEY_CONTROL	TokenNameIdentifier	 KEY  CONTROL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: <code>shiftKey</code> indicates whether the 'shift' key * was depressed during the firing of the event. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>shiftKey</code> indicates whether the 'shift' key was depressed during the firing of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getShiftKey	TokenNameIdentifier	 get Shift Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
.	TokenNameDOT	
KEY_SHIFT	TokenNameIdentifier	 KEY  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: <code>altKey</code> indicates whether the 'alt' key was * depressed during the firing of the event. On some platforms * this key may map to an alternative key name. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>altKey</code> indicates whether the 'alt' key was depressed during the firing of the event. On some platforms this key may map to an alternative key name. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAltKey	TokenNameIdentifier	 get Alt Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
.	TokenNameDOT	
KEY_ALT	TokenNameIdentifier	 KEY  ALT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: <code>metaKey</code> indicates whether the 'meta' key was * depressed during the firing of the event. On some platforms * this key may map to an alternative key name. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>metaKey</code> indicates whether the 'meta' key was depressed during the firing of the event. On some platforms this key may map to an alternative key name. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getMetaKey	TokenNameIdentifier	 get Meta Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
.	TokenNameDOT	
KEY_META	TokenNameIdentifier	 KEY  META
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: During mouse events caused by the depression or release of * a mouse button, <code>button</code> is used to indicate which * mouse button changed state. The values for <code>button</code> * range from zero to indicate the left button of the mouse, one * to indicate the middle button if present, and two to indicate * the right button. For mice configured for left handed use in * which the button actions are reversed the values are instead * read from right to left. */	TokenNameCOMMENT_JAVADOC	 DOM: During mouse events caused by the depression or release of a mouse button, <code>button</code> is used to indicate which mouse button changed state. The values for <code>button</code> range from zero to indicate the left button of the mouse, one to indicate the middle button if present, and two to indicate the right button. For mice configured for left handed use in which the button actions are reversed the values are instead read from right to left. 
public	TokenNamepublic	
short	TokenNameshort	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
button	TokenNameIdentifier	 button
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: Used to identify a secondary <code>EventTarget</code> related * to a UI * event. Currently this attribute is used with the mouseover event to * indicate the <code>EventTarget</code> which the pointing device exited * and with the mouseout event to indicate the <code>EventTarget</code> * which the pointing device entered. */	TokenNameCOMMENT_JAVADOC	 DOM: Used to identify a secondary <code>EventTarget</code> related to a UI event. Currently this attribute is used with the mouseover event to indicate the <code>EventTarget</code> which the pointing device exited and with the mouseout event to indicate the <code>EventTarget</code> which the pointing device entered. 
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
getRelatedTarget	TokenNameIdentifier	 get Related Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
relatedTarget	TokenNameIdentifier	 related Target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Returns whether the given modifier key was pressed at the * time of the event. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Returns whether the given modifier key was pressed at the time of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getModifierState	TokenNameIdentifier	 get Modifier State
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the modifiers string for this event. */	TokenNameCOMMENT_JAVADOC	 Returns the modifiers string for this event. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getModifiersString	TokenNameIdentifier	 get Modifiers String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: The <code>initMouseEvent</code> method is used to * initialize the value of a <code>MouseEvent</code> created * through the <code>DocumentEvent</code> interface. This method * may only be called before the <code>MouseEvent</code> has been * dispatched via the <code>dispatchEvent</code> method, though it * may be called multiple times during that phase if necessary. * If called multiple times, the final invocation takes * precedence. * * @param typeArg Specifies the event type. * @param canBubbleArg Specifies whether or not the event can bubble. * @param cancelableArg Specifies whether or not the event's default * action can be prevented. * @param viewArg Specifies the <code>Event</code>'s * <code>AbstractView</code>. * @param detailArg Specifies the <code>Event</code>'s mouse click count. * @param screenXArg Specifies the <code>Event</code>'s screen x coordinate * @param screenYArg Specifies the <code>Event</code>'s screen y coordinate * @param clientXArg Specifies the <code>Event</code>'s client x coordinate * @param clientYArg Specifies the <code>Event</code>'s client y coordinate * @param ctrlKeyArg Specifies whether or not control key was depressed * during the <code>Event</code>. * @param altKeyArg Specifies whether or not alt key was depressed during * the <code>Event</code>. * @param shiftKeyArg Specifies whether or not shift key was depressed * during the <code>Event</code>. * @param metaKeyArg Specifies whether or not meta key was depressed * during the <code>Event</code>. * @param buttonArg Specifies the <code>Event</code>'s mouse button. * @param relatedTargetArg Specifies the <code>Event</code>'s related * <code>EventTarget</code>. */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>initMouseEvent</code> method is used to initialize the value of a <code>MouseEvent</code> created through the <code>DocumentEvent</code> interface. This method may only be called before the <code>MouseEvent</code> has been dispatched via the <code>dispatchEvent</code> method, though it may be called multiple times during that phase if necessary. If called multiple times, the final invocation takes precedence. * @param typeArg Specifies the event type. @param canBubbleArg Specifies whether or not the event can bubble. @param cancelableArg Specifies whether or not the event's default action can be prevented. @param viewArg Specifies the <code>Event</code>'s <code>AbstractView</code>. @param detailArg Specifies the <code>Event</code>'s mouse click count. @param screenXArg Specifies the <code>Event</code>'s screen x coordinate @param screenYArg Specifies the <code>Event</code>'s screen y coordinate @param clientXArg Specifies the <code>Event</code>'s client x coordinate @param clientYArg Specifies the <code>Event</code>'s client y coordinate @param ctrlKeyArg Specifies whether or not control key was depressed during the <code>Event</code>. @param altKeyArg Specifies whether or not alt key was depressed during the <code>Event</code>. @param shiftKeyArg Specifies whether or not shift key was depressed during the <code>Event</code>. @param metaKeyArg Specifies whether or not meta key was depressed during the <code>Event</code>. @param buttonArg Specifies the <code>Event</code>'s mouse button. @param relatedTargetArg Specifies the <code>Event</code>'s related <code>EventTarget</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
initMouseEvent	TokenNameIdentifier	 init Mouse Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
int	TokenNameint	
detailArg	TokenNameIdentifier	 detail Arg
,	TokenNameCOMMA	
int	TokenNameint	
screenXArg	TokenNameIdentifier	 screen X Arg
,	TokenNameCOMMA	
int	TokenNameint	
screenYArg	TokenNameIdentifier	 screen Y Arg
,	TokenNameCOMMA	
int	TokenNameint	
clientXArg	TokenNameIdentifier	 client X Arg
,	TokenNameCOMMA	
int	TokenNameint	
clientYArg	TokenNameIdentifier	 client Y Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ctrlKeyArg	TokenNameIdentifier	 ctrl Key Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
altKeyArg	TokenNameIdentifier	 alt Key Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shiftKeyArg	TokenNameIdentifier	 shift Key Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
metaKeyArg	TokenNameIdentifier	 meta Key Arg
,	TokenNameCOMMA	
short	TokenNameshort	
buttonArg	TokenNameIdentifier	 button Arg
,	TokenNameCOMMA	
EventTarget	TokenNameIdentifier	 Event Target
relatedTargetArg	TokenNameIdentifier	 related Target Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initUIEvent	TokenNameIdentifier	 init UI Event
(	TokenNameLPAREN	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
detailArg	TokenNameIdentifier	 detail Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
screenX	TokenNameIdentifier	 screen X
=	TokenNameEQUAL	
screenXArg	TokenNameIdentifier	 screen X Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
screenY	TokenNameIdentifier	 screen Y
=	TokenNameEQUAL	
screenYArg	TokenNameIdentifier	 screen Y Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clientX	TokenNameIdentifier	 client X
=	TokenNameEQUAL	
clientXArg	TokenNameIdentifier	 client X Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clientY	TokenNameIdentifier	 client Y
=	TokenNameEQUAL	
clientYArg	TokenNameIdentifier	 client Y Arg
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ctrlKeyArg	TokenNameIdentifier	 ctrl Key Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
.	TokenNameDOT	
KEY_CONTROL	TokenNameIdentifier	 KEY  CONTROL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
altKeyArg	TokenNameIdentifier	 alt Key Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
.	TokenNameDOT	
KEY_ALT	TokenNameIdentifier	 KEY  ALT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shiftKeyArg	TokenNameIdentifier	 shift Key Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
.	TokenNameDOT	
KEY_SHIFT	TokenNameIdentifier	 KEY  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
metaKeyArg	TokenNameIdentifier	 meta Key Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
.	TokenNameDOT	
KEY_META	TokenNameIdentifier	 KEY  META
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
button	TokenNameIdentifier	 button
=	TokenNameEQUAL	
buttonArg	TokenNameIdentifier	 button Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
relatedTarget	TokenNameIdentifier	 related Target
=	TokenNameEQUAL	
relatedTargetArg	TokenNameIdentifier	 related Target Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Initializes this event object. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Initializes this event object. 
public	TokenNamepublic	
void	TokenNamevoid	
initMouseEventNS	TokenNameIdentifier	 init Mouse Event NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
int	TokenNameint	
detailArg	TokenNameIdentifier	 detail Arg
,	TokenNameCOMMA	
int	TokenNameint	
screenXArg	TokenNameIdentifier	 screen X Arg
,	TokenNameCOMMA	
int	TokenNameint	
screenYArg	TokenNameIdentifier	 screen Y Arg
,	TokenNameCOMMA	
int	TokenNameint	
clientXArg	TokenNameIdentifier	 client X Arg
,	TokenNameCOMMA	
int	TokenNameint	
clientYArg	TokenNameIdentifier	 client Y Arg
,	TokenNameCOMMA	
short	TokenNameshort	
buttonArg	TokenNameIdentifier	 button Arg
,	TokenNameCOMMA	
EventTarget	TokenNameIdentifier	 Event Target
relatedTargetArg	TokenNameIdentifier	 related Target Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
modifiersList	TokenNameIdentifier	 modifiers List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initUIEventNS	TokenNameIdentifier	 init UI Event NS
(	TokenNameLPAREN	
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
detailArg	TokenNameIdentifier	 detail Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
screenX	TokenNameIdentifier	 screen X
=	TokenNameEQUAL	
screenXArg	TokenNameIdentifier	 screen X Arg
;	TokenNameSEMICOLON	
screenY	TokenNameIdentifier	 screen Y
=	TokenNameEQUAL	
screenYArg	TokenNameIdentifier	 screen Y Arg
;	TokenNameSEMICOLON	
clientX	TokenNameIdentifier	 client X
=	TokenNameEQUAL	
clientXArg	TokenNameIdentifier	 client X Arg
;	TokenNameSEMICOLON	
clientY	TokenNameIdentifier	 client Y
=	TokenNameEQUAL	
clientYArg	TokenNameIdentifier	 client Y Arg
;	TokenNameSEMICOLON	
button	TokenNameIdentifier	 button
=	TokenNameEQUAL	
buttonArg	TokenNameIdentifier	 button Arg
;	TokenNameSEMICOLON	
relatedTarget	TokenNameIdentifier	 related Target
=	TokenNameEQUAL	
relatedTargetArg	TokenNameIdentifier	 related Target Arg
;	TokenNameSEMICOLON	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
modifiers	TokenNameIdentifier	 modifiers
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
modifiersList	TokenNameIdentifier	 modifiers List
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
modifiers	TokenNameIdentifier	 modifiers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
