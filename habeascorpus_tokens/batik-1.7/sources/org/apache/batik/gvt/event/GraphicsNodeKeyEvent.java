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
/** * An event which indicates that a keystroke occurred in a graphics node. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: GraphicsNodeKeyEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An event which indicates that a keystroke occurred in a graphics node. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: GraphicsNodeKeyEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
extends	TokenNameextends	
GraphicsNodeInputEvent	TokenNameIdentifier	 Graphics Node Input Event
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KEY_FIRST	TokenNameIdentifier	 KEY  FIRST
=	TokenNameEQUAL	
400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The "key typed" event. This event is generated when a character is * entered. In the simplest case, it is produced by a single key press. * Often, however, characters are produced by series of key presses, and * the mapping from key pressed events to key typed events may be * many-to-one or many-to-many. */	TokenNameCOMMENT_JAVADOC	 The "key typed" event. This event is generated when a character is entered. In the simplest case, it is produced by a single key press. Often, however, characters are produced by series of key presses, and the mapping from key pressed events to key typed events may be many-to-one or many-to-many. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KEY_TYPED	TokenNameIdentifier	 KEY  TYPED
=	TokenNameEQUAL	
KEY_FIRST	TokenNameIdentifier	 KEY  FIRST
;	TokenNameSEMICOLON	
/** * The "key pressed" event. This event is generated when a key * is pushed down. */	TokenNameCOMMENT_JAVADOC	 The "key pressed" event. This event is generated when a key is pushed down. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KEY_PRESSED	TokenNameIdentifier	 KEY  PRESSED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
KEY_FIRST	TokenNameIdentifier	 KEY  FIRST
;	TokenNameSEMICOLON	
/** * The "key released" event. This event is generated when a key * is let up. */	TokenNameCOMMENT_JAVADOC	 The "key released" event. This event is generated when a key is let up. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KEY_RELEASED	TokenNameIdentifier	 KEY  RELEASED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
KEY_FIRST	TokenNameIdentifier	 KEY  FIRST
;	TokenNameSEMICOLON	
/** * The unique value assigned to each of the keys on the * keyboard. There is a common set of key codes that * can be fired by most keyboards. * The symbolic name for a key code should be used rather * than the code value itself. */	TokenNameCOMMENT_JAVADOC	 The unique value assigned to each of the keys on the keyboard. There is a common set of key codes that can be fired by most keyboards. The symbolic name for a key code should be used rather than the code value itself. 
protected	TokenNameprotected	
int	TokenNameint	
keyCode	TokenNameIdentifier	 key Code
;	TokenNameSEMICOLON	
/** * <code>keyChar</code> is a valid unicode character * that is fired by a key or a key combination on * a keyboard. */	TokenNameCOMMENT_JAVADOC	 <code>keyChar</code> is a valid unicode character that is fired by a key or a key combination on a keyboard. 
protected	TokenNameprotected	
char	TokenNamechar	
keyChar	TokenNameIdentifier	 key Char
;	TokenNameSEMICOLON	
/** * The key location. */	TokenNameCOMMENT_JAVADOC	 The key location. 
protected	TokenNameprotected	
int	TokenNameint	
keyLocation	TokenNameIdentifier	 key Location
;	TokenNameSEMICOLON	
/** * Constructs a new graphics node key event. * @param source the graphics node where the event originated * @param id the id of this event * @param when the time the event occurred * @param modifiers the modifier keys down while event occurred * @param lockState bitmask indicating which key locks were activated * @param keyCode the Java key code * @param keyChar the generated character * @param keyLocation the location of the key */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node key event. @param source the graphics node where the event originated @param id the id of this event @param when the time the event occurred @param modifiers the modifier keys down while event occurred @param lockState bitmask indicating which key locks were activated @param keyCode the Java key code @param keyChar the generated character @param keyLocation the location of the key 
public	TokenNamepublic	
GraphicsNodeKeyEvent	TokenNameIdentifier	 Graphics Node Key Event
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
keyCode	TokenNameIdentifier	 key Code
,	TokenNameCOMMA	
char	TokenNamechar	
keyChar	TokenNameIdentifier	 key Char
,	TokenNameCOMMA	
int	TokenNameint	
keyLocation	TokenNameIdentifier	 key Location
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
keyCode	TokenNameIdentifier	 key Code
=	TokenNameEQUAL	
keyCode	TokenNameIdentifier	 key Code
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyChar	TokenNameIdentifier	 key Char
=	TokenNameEQUAL	
keyChar	TokenNameIdentifier	 key Char
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyLocation	TokenNameIdentifier	 key Location
=	TokenNameEQUAL	
keyLocation	TokenNameIdentifier	 key Location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the integer code for the physical key pressed. Not localized. */	TokenNameCOMMENT_JAVADOC	 Return the integer code for the physical key pressed. Not localized. 
public	TokenNamepublic	
int	TokenNameint	
getKeyCode	TokenNameIdentifier	 get Key Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyCode	TokenNameIdentifier	 key Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a character corresponding to physical key pressed. * May be localized. */	TokenNameCOMMENT_JAVADOC	 Return a character corresponding to physical key pressed. May be localized. 
public	TokenNamepublic	
char	TokenNamechar	
getKeyChar	TokenNameIdentifier	 get Key Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyChar	TokenNameIdentifier	 key Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the key location. */	TokenNameCOMMENT_JAVADOC	 Returns the key location. 
public	TokenNamepublic	
int	TokenNameint	
getKeyLocation	TokenNameIdentifier	 get Key Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyLocation	TokenNameIdentifier	 key Location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
