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
/** * The root event class for all graphics node-level input events. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: GraphicsNodeInputEvent.java 575202 2007-09-13 07:45:18Z cam $ */	TokenNameCOMMENT_JAVADOC	 The root event class for all graphics node-level input events. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: GraphicsNodeInputEvent.java 575202 2007-09-13 07:45:18Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
GraphicsNodeInputEvent	TokenNameIdentifier	 Graphics Node Input Event
extends	TokenNameextends	
GraphicsNodeEvent	TokenNameIdentifier	 Graphics Node Event
{	TokenNameLBRACE	
/** * The shift key modifier constant. */	TokenNameCOMMENT_JAVADOC	 The shift key modifier constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHIFT_MASK	TokenNameIdentifier	 SHIFT  MASK
=	TokenNameEQUAL	
InputEvent	TokenNameIdentifier	 Input Event
.	TokenNameDOT	
SHIFT_MASK	TokenNameIdentifier	 SHIFT  MASK
;	TokenNameSEMICOLON	
/** * The control key modifier constant. */	TokenNameCOMMENT_JAVADOC	 The control key modifier constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CTRL_MASK	TokenNameIdentifier	 CTRL  MASK
=	TokenNameEQUAL	
InputEvent	TokenNameIdentifier	 Input Event
.	TokenNameDOT	
CTRL_MASK	TokenNameIdentifier	 CTRL  MASK
;	TokenNameSEMICOLON	
/** * The meta key modifier constant. */	TokenNameCOMMENT_JAVADOC	 The meta key modifier constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
META_MASK	TokenNameIdentifier	 META  MASK
=	TokenNameEQUAL	
InputEvent	TokenNameIdentifier	 Input Event
.	TokenNameDOT	
META_MASK	TokenNameIdentifier	 META  MASK
;	TokenNameSEMICOLON	
/** * The alt key modifier constant. */	TokenNameCOMMENT_JAVADOC	 The alt key modifier constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALT_MASK	TokenNameIdentifier	 ALT  MASK
=	TokenNameEQUAL	
InputEvent	TokenNameIdentifier	 Input Event
.	TokenNameDOT	
ALT_MASK	TokenNameIdentifier	 ALT  MASK
;	TokenNameSEMICOLON	
/** * The alt-graph key modifier constant. */	TokenNameCOMMENT_JAVADOC	 The alt-graph key modifier constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALT_GRAPH_MASK	TokenNameIdentifier	 ALT  GRAPH  MASK
=	TokenNameEQUAL	
InputEvent	TokenNameIdentifier	 Input Event
.	TokenNameDOT	
ALT_GRAPH_MASK	TokenNameIdentifier	 ALT  GRAPH  MASK
;	TokenNameSEMICOLON	
/** * The mouse button1 modifier constant. */	TokenNameCOMMENT_JAVADOC	 The mouse button1 modifier constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUTTON1_MASK	TokenNameIdentifier	 BUTTO N1  MASK
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// BUTTON1_DOWN_MASK 	TokenNameCOMMENT_LINE	BUTTON1_DOWN_MASK 
/** * The mouse button2 modifier constant. */	TokenNameCOMMENT_JAVADOC	 The mouse button2 modifier constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUTTON2_MASK	TokenNameIdentifier	 BUTTO N2  MASK
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// BUTTON2_DOWN_MASK 	TokenNameCOMMENT_LINE	BUTTON2_DOWN_MASK 
/** * The mouse button3 modifier constant. */	TokenNameCOMMENT_JAVADOC	 The mouse button3 modifier constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUTTON3_MASK	TokenNameIdentifier	 BUTTO N3  MASK
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// BUTTON3_DOWN_MASK 	TokenNameCOMMENT_LINE	BUTTON3_DOWN_MASK 
/** * The caps lock constant. */	TokenNameCOMMENT_JAVADOC	 The caps lock constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CAPS_LOCK_MASK	TokenNameIdentifier	 CAPS  LOCK  MASK
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The num lock constant. */	TokenNameCOMMENT_JAVADOC	 The num lock constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUM_LOCK_MASK	TokenNameIdentifier	 NUM  LOCK  MASK
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The scroll lock constant. */	TokenNameCOMMENT_JAVADOC	 The scroll lock constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SCROLL_LOCK_MASK	TokenNameIdentifier	 SCROLL  LOCK  MASK
=	TokenNameEQUAL	
0x04	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The kana lock constant. */	TokenNameCOMMENT_JAVADOC	 The kana lock constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KANA_LOCK_MASK	TokenNameIdentifier	 KANA  LOCK  MASK
=	TokenNameEQUAL	
0x08	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The graphics node input events Time stamp. The time stamp is in * UTC format that indicates when the input event was * created. */	TokenNameCOMMENT_JAVADOC	 The graphics node input events Time stamp. The time stamp is in UTC format that indicates when the input event was created. 
long	TokenNamelong	
when	TokenNameIdentifier	 when
;	TokenNameSEMICOLON	
/** * The state of the modifier keys at the time the graphics node * input event was fired. */	TokenNameCOMMENT_JAVADOC	 The state of the modifier keys at the time the graphics node input event was fired. 
int	TokenNameint	
modifiers	TokenNameIdentifier	 modifiers
;	TokenNameSEMICOLON	
/** * The state of the key locks at the time the graphics node input * event was fired. */	TokenNameCOMMENT_JAVADOC	 The state of the key locks at the time the graphics node input event was fired. 
int	TokenNameint	
lockState	TokenNameIdentifier	 lock State
;	TokenNameSEMICOLON	
/** * Constructs a new graphics node input event. * @param source the graphics node where the event originated * @param id the id of this event * @param when the time the event occurred * @param modifiers the modifier keys down while event occurred */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node input event. @param source the graphics node where the event originated @param id the id of this event @param when the time the event occurred @param modifiers the modifier keys down while event occurred 
protected	TokenNameprotected	
GraphicsNodeInputEvent	TokenNameIdentifier	 Graphics Node Input Event
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
when	TokenNameIdentifier	 when
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
modifiers	TokenNameIdentifier	 modifiers
=	TokenNameEQUAL	
modifiers	TokenNameIdentifier	 modifiers
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lockState	TokenNameIdentifier	 lock State
=	TokenNameEQUAL	
lockState	TokenNameIdentifier	 lock State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new graphics node input event from an AWT InputEvent. * @param source the graphics node where the event originated * @param evt the AWT InputEvent triggering this event's creation */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node input event from an AWT InputEvent. @param source the graphics node where the event originated @param evt the AWT InputEvent triggering this event's creation 
protected	TokenNameprotected	
GraphicsNodeInputEvent	TokenNameIdentifier	 Graphics Node Input Event
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
InputEvent	TokenNameIdentifier	 Input Event
evt	TokenNameIdentifier	 evt
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
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getWhen	TokenNameIdentifier	 get When
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
modifiers	TokenNameIdentifier	 modifiers
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lockState	TokenNameIdentifier	 lock State
=	TokenNameEQUAL	
lockState	TokenNameIdentifier	 lock State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether or not the Shift modifier is down on this event. */	TokenNameCOMMENT_JAVADOC	 Returns whether or not the Shift modifier is down on this event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isShiftDown	TokenNameIdentifier	 is Shift Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
&	TokenNameAND	
SHIFT_MASK	TokenNameIdentifier	 SHIFT  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether or not the Control modifier is down on this event. */	TokenNameCOMMENT_JAVADOC	 Returns whether or not the Control modifier is down on this event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isControlDown	TokenNameIdentifier	 is Control Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
&	TokenNameAND	
CTRL_MASK	TokenNameIdentifier	 CTRL  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether or not the Meta modifier is down on this event. */	TokenNameCOMMENT_JAVADOC	 Returns whether or not the Meta modifier is down on this event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isMetaDown	TokenNameIdentifier	 is Meta Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
AWTEventDispatcher	TokenNameIdentifier	 AWT Event Dispatcher
.	TokenNameDOT	
isMetaDown	TokenNameIdentifier	 is Meta Down
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether or not the Alt modifier is down on this event. */	TokenNameCOMMENT_JAVADOC	 Returns whether or not the Alt modifier is down on this event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAltDown	TokenNameIdentifier	 is Alt Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
&	TokenNameAND	
ALT_MASK	TokenNameIdentifier	 ALT  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether or not the Alt-Graph modifier is down on this event. */	TokenNameCOMMENT_JAVADOC	 Returns whether or not the Alt-Graph modifier is down on this event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAltGraphDown	TokenNameIdentifier	 is Alt Graph Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
&	TokenNameAND	
ALT_GRAPH_MASK	TokenNameIdentifier	 ALT  GRAPH  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the timestamp of when this event occurred. */	TokenNameCOMMENT_JAVADOC	 Returns the timestamp of when this event occurred. 
public	TokenNamepublic	
long	TokenNamelong	
getWhen	TokenNameIdentifier	 get When
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
when	TokenNameIdentifier	 when
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the modifiers flag for this event. */	TokenNameCOMMENT_JAVADOC	 Returns the modifiers flag for this event. 
public	TokenNamepublic	
int	TokenNameint	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifiers	TokenNameIdentifier	 modifiers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the lock state flags for this event. */	TokenNameCOMMENT_JAVADOC	 Returns the lock state flags for this event. 
public	TokenNamepublic	
int	TokenNameint	
getLockState	TokenNameIdentifier	 get Lock State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lockState	TokenNameIdentifier	 lock State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
