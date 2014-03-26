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
/** * A concrete version of {@link org.apache.batik.gvt.event.AWTEventDispatcher}. * * This class is used for JDKs &lt; 1.4, which don't have MouseWheelEvent * support. For JDKs &gt;= 1.4, the file * sources-1.4/org/apache/batik/gvt/event/AWTEventDispatcher defines a * version of this class that does support MouseWheelEvents. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AWTEventDispatcher.java 575202 2007-09-13 07:45:18Z cam $ */	TokenNameCOMMENT_JAVADOC	 A concrete version of {@link org.apache.batik.gvt.event.AWTEventDispatcher}. * This class is used for JDKs &lt; 1.4, which don't have MouseWheelEvent support. For JDKs &gt;= 1.4, the file sources-1.4/org/apache/batik/gvt/event/AWTEventDispatcher defines a version of this class that does support MouseWheelEvents. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AWTEventDispatcher.java 575202 2007-09-13 07:45:18Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AWTEventDispatcher	TokenNameIdentifier	 AWT Event Dispatcher
extends	TokenNameextends	
AbstractAWTEventDispatcher	TokenNameIdentifier	 Abstract AWT Event Dispatcher
{	TokenNameLBRACE	
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
getModifiers	TokenNameIdentifier	 get Modifiers
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
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the modifiers mask for this event. This just calls * {@link InputEvent#getModifiers()} on <code>evt</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the modifiers mask for this event. This just calls {@link InputEvent#getModifiers()} on <code>evt</code>. 
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
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the button whose state changed for the given event. This calls * {@link InputEvent#getModifiers()} to check which button caused the * event. */	TokenNameCOMMENT_JAVADOC	 Returns the button whose state changed for the given event. This calls {@link InputEvent#getModifiers()} to check which button caused the event. 
protected	TokenNameprotected	
int	TokenNameint	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
InputEvent	TokenNameIdentifier	 Input Event
.	TokenNameDOT	
BUTTON1_MASK	TokenNameIdentifier	 BUTTO N1  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
InputEvent	TokenNameIdentifier	 Input Event
.	TokenNameDOT	
BUTTON2_MASK	TokenNameIdentifier	 BUTTO N2  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
InputEvent	TokenNameIdentifier	 Input Event
.	TokenNameDOT	
BUTTON3_MASK	TokenNameIdentifier	 BUTTO N3  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
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
GraphicsNodeInputEvent	TokenNameIdentifier	 Graphics Node Input Event
.	TokenNameDOT	
META_MASK	TokenNameIdentifier	 META  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
