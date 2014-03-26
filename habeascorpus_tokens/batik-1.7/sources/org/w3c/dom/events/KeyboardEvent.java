/* * Copyright (c) 2006 World Wide Web Consortium, * * (Massachusetts Institute of Technology, European Research Consortium for * Informatics and Mathematics, Keio University). All Rights Reserved. This * work is distributed under the W3C(r) Software License [1] in the hope that * it will be useful, but WITHOUT ANY WARRANTY; without even the implied * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2006 World Wide Web Consortium, * (Massachusetts Institute of Technology, European Research Consortium for Informatics and Mathematics, Keio University). All Rights Reserved. This work is distributed under the W3C(r) Software License [1] in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
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
/** * The <code>KeyboardEvent</code> interface provides specific contextual * information associated with keyboard devices. Each keyboard event * references a key using an identifier. Keyboard events are commonly * directed at the element that has the focus. * <p> The <code>KeyboardEvent</code> interface provides convenient attributes * for some common modifiers keys: <code>KeyboardEvent.ctrlKey</code>, * <code>KeyboardEvent.shiftKey</code>, <code>KeyboardEvent.altKey</code>, * <code>KeyboardEvent.metaKey</code>. These attributes are equivalent to * use the method * <code>KeyboardEvent.getModifierState(keyIdentifierArg)</code> with * "Control", "Shift", "Alt", or "Meta" respectively. * <p> To create an instance of the <code>KeyboardEvent</code> interface, use * the <code>DocumentEvent.createEvent("KeyboardEvent")</code> method call. * <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The <code>KeyboardEvent</code> interface provides specific contextual information associated with keyboard devices. Each keyboard event references a key using an identifier. Keyboard events are commonly directed at the element that has the focus. <p> The <code>KeyboardEvent</code> interface provides convenient attributes for some common modifiers keys: <code>KeyboardEvent.ctrlKey</code>, <code>KeyboardEvent.shiftKey</code>, <code>KeyboardEvent.altKey</code>, <code>KeyboardEvent.metaKey</code>. These attributes are equivalent to use the method <code>KeyboardEvent.getModifierState(keyIdentifierArg)</code> with "Control", "Shift", "Alt", or "Meta" respectively. <p> To create an instance of the <code>KeyboardEvent</code> interface, use the <code>DocumentEvent.createEvent("KeyboardEvent")</code> method call. <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. @since DOM Level 3 
public	TokenNamepublic	
interface	TokenNameinterface	
KeyboardEvent	TokenNameIdentifier	 Keyboard Event
extends	TokenNameextends	
UIEvent	TokenNameIdentifier	 UI Event
{	TokenNameLBRACE	
// KeyLocationCode 	TokenNameCOMMENT_LINE	KeyLocationCode 
/** * The key activation is not distinguished as the left or right version * of the key, and did not originate from the numeric keypad (or did not * originate with a virtual key corresponding to the numeric keypad). * Example: the 'Q' key on a PC 101 Key US keyboard. */	TokenNameCOMMENT_JAVADOC	 The key activation is not distinguished as the left or right version of the key, and did not originate from the numeric keypad (or did not originate with a virtual key corresponding to the numeric keypad). Example: the 'Q' key on a PC 101 Key US keyboard. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_KEY_LOCATION_STANDARD	TokenNameIdentifier	 DOM  KEY  LOCATION  STANDARD
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The key activated is in the left key location (there is more than one * possible location for this key). Example: the left Shift key on a PC * 101 Key US keyboard. */	TokenNameCOMMENT_JAVADOC	 The key activated is in the left key location (there is more than one possible location for this key). Example: the left Shift key on a PC 101 Key US keyboard. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_KEY_LOCATION_LEFT	TokenNameIdentifier	 DOM  KEY  LOCATION  LEFT
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The key activation is in the right key location (there is more than * one possible location for this key). Example: the right Shift key on * a PC 101 Key US keyboard. */	TokenNameCOMMENT_JAVADOC	 The key activation is in the right key location (there is more than one possible location for this key). Example: the right Shift key on a PC 101 Key US keyboard. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_KEY_LOCATION_RIGHT	TokenNameIdentifier	 DOM  KEY  LOCATION  RIGHT
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The key activation originated on the numeric keypad or with a virtual * key corresponding to the numeric keypad. Example: the '1' key on a PC * 101 Key US keyboard located on the numeric pad. */	TokenNameCOMMENT_JAVADOC	 The key activation originated on the numeric keypad or with a virtual key corresponding to the numeric keypad. Example: the '1' key on a PC 101 Key US keyboard located on the numeric pad. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_KEY_LOCATION_NUMPAD	TokenNameIdentifier	 DOM  KEY  LOCATION  NUMPAD
=	TokenNameEQUAL	
0x03	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * <code>keyIdentifier</code> holds the identifier of the key. The key * identifiers are defined in Appendix A.2 "". Implementations that are * unable to identify a key must use the key identifier * <code>"Unidentified"</code>. */	TokenNameCOMMENT_JAVADOC	 <code>keyIdentifier</code> holds the identifier of the key. The key identifiers are defined in Appendix A.2 "". Implementations that are unable to identify a key must use the key identifier <code>"Unidentified"</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyIdentifier	TokenNameIdentifier	 get Key Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>keyLocation</code> attribute contains an indication of the * location of they key on the device, as described in . */	TokenNameCOMMENT_JAVADOC	 The <code>keyLocation</code> attribute contains an indication of the location of they key on the device, as described in . 
public	TokenNamepublic	
int	TokenNameint	
getKeyLocation	TokenNameIdentifier	 get Key Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>true</code> if the control (Ctrl) key modifier is activated. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the control (Ctrl) key modifier is activated. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCtrlKey	TokenNameIdentifier	 get Ctrl Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>true</code> if the shift (Shift) key modifier is activated. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the shift (Shift) key modifier is activated. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getShiftKey	TokenNameIdentifier	 get Shift Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>true</code> if the alternative (Alt) key modifier is activated. * <p ><b>Note:</b> The Option key modifier on Macintosh systems must be * represented using this key modifier. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the alternative (Alt) key modifier is activated. <p ><b>Note:</b> The Option key modifier on Macintosh systems must be represented using this key modifier. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAltKey	TokenNameIdentifier	 get Alt Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>true</code> if the meta (Meta) key modifier is activated. * <p ><b>Note:</b> The Command key modifier on Macintosh systems must be * represented using this key modifier. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the meta (Meta) key modifier is activated. <p ><b>Note:</b> The Command key modifier on Macintosh systems must be represented using this key modifier. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getMetaKey	TokenNameIdentifier	 get Meta Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This methods queries the state of a modifier using a key identifier. * See also . * @param keyIdentifierArg A modifier key identifier. Common modifier * keys are <code>"Alt"</code>, <code>"AltGraph"</code>, * <code>"CapsLock"</code>, <code>"Control"</code>, <code>"Meta"</code> * , <code>"NumLock"</code>, <code>"Scroll"</code>, or * <code>"Shift"</code>. * <p ><b>Note:</b> If an application wishes to distinguish between * right and left modifiers, this information could be deduced using * keyboard events and <code>KeyboardEvent.keyLocation</code>. * @return <code>true</code> if it is modifier key and the modifier is * activated, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 This methods queries the state of a modifier using a key identifier. See also . @param keyIdentifierArg A modifier key identifier. Common modifier keys are <code>"Alt"</code>, <code>"AltGraph"</code>, <code>"CapsLock"</code>, <code>"Control"</code>, <code>"Meta"</code> , <code>"NumLock"</code>, <code>"Scroll"</code>, or <code>"Shift"</code>. <p ><b>Note:</b> If an application wishes to distinguish between right and left modifiers, this information could be deduced using keyboard events and <code>KeyboardEvent.keyLocation</code>. @return <code>true</code> if it is modifier key and the modifier is activated, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getModifierState	TokenNameIdentifier	 get Modifier State
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initKeyboardEvent</code> method is used to initialize the * value of a <code>KeyboardEvent</code> object and has the same * behavior as <code>UIEvent.initUIEvent()</code>. The value of * <code>UIEvent.detail</code> remains undefined. * @param typeArg Refer to the <code>UIEvent.initUIEvent()</code> method * for a description of this parameter. * @param canBubbleArg Refer to the <code>UIEvent.initUIEvent()</code> * method for a description of this parameter. * @param cancelableArg Refer to the <code>UIEvent.initUIEvent()</code> * method for a description of this parameter. * @param viewArg Refer to the <code>UIEvent.initUIEvent()</code> method * for a description of this parameter. * @param keyIdentifierArg Specifies * <code>KeyboardEvent.keyIdentifier</code>. * @param keyLocationArg Specifies <code>KeyboardEvent.keyLocation</code> * . * @param modifiersList A <a href='http://www.w3.org/TR/2004/REC-xml-20040204/#NT-S'>white space</a> separated list of modifier key identifiers to be activated on this * object. */	TokenNameCOMMENT_JAVADOC	 The <code>initKeyboardEvent</code> method is used to initialize the value of a <code>KeyboardEvent</code> object and has the same behavior as <code>UIEvent.initUIEvent()</code>. The value of <code>UIEvent.detail</code> remains undefined. @param typeArg Refer to the <code>UIEvent.initUIEvent()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>UIEvent.initUIEvent()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>UIEvent.initUIEvent()</code> method for a description of this parameter. @param viewArg Refer to the <code>UIEvent.initUIEvent()</code> method for a description of this parameter. @param keyIdentifierArg Specifies <code>KeyboardEvent.keyIdentifier</code>. @param keyLocationArg Specifies <code>KeyboardEvent.keyLocation</code> . @param modifiersList A <a href='http://www.w3.org/TR/2004/REC-xml-20040204/#NT-S'>white space</a> separated list of modifier key identifiers to be activated on this object. 
public	TokenNamepublic	
void	TokenNamevoid	
initKeyboardEvent	TokenNameIdentifier	 init Keyboard Event
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
String	TokenNameIdentifier	 String
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
,	TokenNameCOMMA	
int	TokenNameint	
keyLocationArg	TokenNameIdentifier	 key Location Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
modifiersList	TokenNameIdentifier	 modifiers List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initKeyboardEventNS</code> method is used to initialize the * value of a <code>KeyboardEvent</code> object and has the same * behavior as <code>UIEvent.initUIEventNS()</code>. The value of * <code>UIEvent.detail</code> remains undefined. * @param namespaceURI Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param typeArg Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param canBubbleArg Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param cancelableArg Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param viewArg Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param keyIdentifierArg Refer to the * <code>KeyboardEvent.initKeyboardEvent()</code> method for a * description of this parameter. * @param keyLocationArg Refer to the * <code>KeyboardEvent.initKeyboardEvent()</code> method for a * description of this parameter. * @param modifiersList A <a href='http://www.w3.org/TR/2004/REC-xml-20040204/#NT-S'>white space</a> separated list of modifier key identifiers to be activated on this * object. As an example, <code>"Control Alt"</code> will activated * the control and alt modifiers. */	TokenNameCOMMENT_JAVADOC	 The <code>initKeyboardEventNS</code> method is used to initialize the value of a <code>KeyboardEvent</code> object and has the same behavior as <code>UIEvent.initUIEventNS()</code>. The value of <code>UIEvent.detail</code> remains undefined. @param namespaceURI Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param typeArg Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param viewArg Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param keyIdentifierArg Refer to the <code>KeyboardEvent.initKeyboardEvent()</code> method for a description of this parameter. @param keyLocationArg Refer to the <code>KeyboardEvent.initKeyboardEvent()</code> method for a description of this parameter. @param modifiersList A <a href='http://www.w3.org/TR/2004/REC-xml-20040204/#NT-S'>white space</a> separated list of modifier key identifiers to be activated on this object. As an example, <code>"Control Alt"</code> will activated the control and alt modifiers. 
public	TokenNamepublic	
void	TokenNamevoid	
initKeyboardEventNS	TokenNameIdentifier	 init Keyboard Event NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
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
String	TokenNameIdentifier	 String
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
,	TokenNameCOMMA	
int	TokenNameint	
keyLocationArg	TokenNameIdentifier	 key Location Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
modifiersList	TokenNameIdentifier	 modifiers List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
