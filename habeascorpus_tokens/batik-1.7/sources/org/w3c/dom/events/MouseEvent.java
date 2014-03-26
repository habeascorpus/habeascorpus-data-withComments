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
/** * The <code>MouseEvent</code> interface provides specific contextual * information associated with Mouse events. * <p> In the case of nested elements mouse events are always targeted at the * most deeply nested element. Ancestors of the targeted element may use * bubbling to obtain notification of mouse events which occur within theirs * descendent elements. * <p> To create an instance of the <code>MouseEvent</code> interface, use the * <code>DocumentEvent.createEvent("MouseEvent")</code> method call. * <p ><b>Note:</b> When initializing <code>MouseEvent</code> objects using * <code>initMouseEvent</code> or <code>initMouseEventNS</code>, * implementations should use the client coordinates <code>clientX</code> * and <code>clientY</code> for calculation of other coordinates (such as * target coordinates exposed by DOM Level 0 implementations). * <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. * @since DOM Level 2 */	TokenNameCOMMENT_JAVADOC	 The <code>MouseEvent</code> interface provides specific contextual information associated with Mouse events. <p> In the case of nested elements mouse events are always targeted at the most deeply nested element. Ancestors of the targeted element may use bubbling to obtain notification of mouse events which occur within theirs descendent elements. <p> To create an instance of the <code>MouseEvent</code> interface, use the <code>DocumentEvent.createEvent("MouseEvent")</code> method call. <p ><b>Note:</b> When initializing <code>MouseEvent</code> objects using <code>initMouseEvent</code> or <code>initMouseEventNS</code>, implementations should use the client coordinates <code>clientX</code> and <code>clientY</code> for calculation of other coordinates (such as target coordinates exposed by DOM Level 0 implementations). <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. @since DOM Level 2 
public	TokenNamepublic	
interface	TokenNameinterface	
MouseEvent	TokenNameIdentifier	 Mouse Event
extends	TokenNameextends	
UIEvent	TokenNameIdentifier	 UI Event
{	TokenNameLBRACE	
/** * The horizontal coordinate at which the event occurred relative to the * origin of the screen coordinate system. */	TokenNameCOMMENT_JAVADOC	 The horizontal coordinate at which the event occurred relative to the origin of the screen coordinate system. 
public	TokenNamepublic	
int	TokenNameint	
getScreenX	TokenNameIdentifier	 get Screen X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The vertical coordinate at which the event occurred relative to the * origin of the screen coordinate system. */	TokenNameCOMMENT_JAVADOC	 The vertical coordinate at which the event occurred relative to the origin of the screen coordinate system. 
public	TokenNamepublic	
int	TokenNameint	
getScreenY	TokenNameIdentifier	 get Screen Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The horizontal coordinate at which the event occurred relative to the * DOM implementation's client area. */	TokenNameCOMMENT_JAVADOC	 The horizontal coordinate at which the event occurred relative to the DOM implementation's client area. 
public	TokenNamepublic	
int	TokenNameint	
getClientX	TokenNameIdentifier	 get Client X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The vertical coordinate at which the event occurred relative to the * DOM implementation's client area. */	TokenNameCOMMENT_JAVADOC	 The vertical coordinate at which the event occurred relative to the DOM implementation's client area. 
public	TokenNamepublic	
int	TokenNameint	
getClientY	TokenNameIdentifier	 get Client Y
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
/** * <code>true</code> if the alt (alternative) key modifier is activated. * <p ><b>Note:</b> The Option key modifier on Macintosh systems must be * represented using this key modifier. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the alt (alternative) key modifier is activated. <p ><b>Note:</b> The Option key modifier on Macintosh systems must be represented using this key modifier. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAltKey	TokenNameIdentifier	 get Alt Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>true</code> if the meta (Meta) key modifier is activated. * <p ><b>Note:</b> The Command key modifier on Macintosh system must be * represented using this meta key. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the meta (Meta) key modifier is activated. <p ><b>Note:</b> The Command key modifier on Macintosh system must be represented using this meta key. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getMetaKey	TokenNameIdentifier	 get Meta Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * During mouse events caused by the depression or release of a mouse * button, <code>button</code> is used to indicate which mouse button * changed state. <code>0</code> indicates the normal button of the * mouse (in general on the left or the one button on Macintosh mice, * used to activate a button or select text). <code>2</code> indicates * the contextual property (in general on the right, used to display a * context menu) button of the mouse if present. <code>1</code> * indicates the extra (in general in the middle and often combined with * the mouse wheel) button. Some mice may provide or simulate more * buttons, and values higher than <code>2</code> can be used to * represent such buttons. */	TokenNameCOMMENT_JAVADOC	 During mouse events caused by the depression or release of a mouse button, <code>button</code> is used to indicate which mouse button changed state. <code>0</code> indicates the normal button of the mouse (in general on the left or the one button on Macintosh mice, used to activate a button or select text). <code>2</code> indicates the contextual property (in general on the right, used to display a context menu) button of the mouse if present. <code>1</code> indicates the extra (in general in the middle and often combined with the mouse wheel) button. Some mice may provide or simulate more buttons, and values higher than <code>2</code> can be used to represent such buttons. 
public	TokenNamepublic	
short	TokenNameshort	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to identify a secondary <code>EventTarget</code> related to a UI * event, depending on the type of event. */	TokenNameCOMMENT_JAVADOC	 Used to identify a secondary <code>EventTarget</code> related to a UI event, depending on the type of event. 
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
getRelatedTarget	TokenNameIdentifier	 get Related Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initMouseEvent</code> method is used to initialize the value * of a <code>MouseEvent</code> object and has the same behavior as * <code>UIEvent.initUIEvent()</code>. * @param typeArg Refer to the <code>UIEvent.initUIEvent()</code> method * for a description of this parameter. * @param canBubbleArg Refer to the <code>UIEvent.initUIEvent()</code> * method for a description of this parameter. * @param cancelableArg Refer to the <code>UIEvent.initUIEvent()</code> * method for a description of this parameter. * @param viewArg Refer to the <code>UIEvent.initUIEvent()</code> method * for a description of this parameter. * @param detailArg Refer to the <code>UIEvent.initUIEvent()</code> * method for a description of this parameter. * @param screenXArg Specifies <code>MouseEvent.screenX</code>. * @param screenYArg Specifies <code>MouseEvent.screenY</code>. * @param clientXArg Specifies <code>MouseEvent.clientX</code>. * @param clientYArg Specifies <code>MouseEvent.clientY</code>. * @param ctrlKeyArg Specifies <code>MouseEvent.ctrlKey</code>. * @param altKeyArg Specifies <code>MouseEvent.altKey</code>. * @param shiftKeyArg Specifies <code>MouseEvent.shiftKey</code>. * @param metaKeyArg Specifies <code>MouseEvent.metaKey</code>. * @param buttonArg Specifies <code>MouseEvent.button</code>. * @param relatedTargetArg Specifies * <code>MouseEvent.relatedTarget</code>. This value may be * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 The <code>initMouseEvent</code> method is used to initialize the value of a <code>MouseEvent</code> object and has the same behavior as <code>UIEvent.initUIEvent()</code>. @param typeArg Refer to the <code>UIEvent.initUIEvent()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>UIEvent.initUIEvent()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>UIEvent.initUIEvent()</code> method for a description of this parameter. @param viewArg Refer to the <code>UIEvent.initUIEvent()</code> method for a description of this parameter. @param detailArg Refer to the <code>UIEvent.initUIEvent()</code> method for a description of this parameter. @param screenXArg Specifies <code>MouseEvent.screenX</code>. @param screenYArg Specifies <code>MouseEvent.screenY</code>. @param clientXArg Specifies <code>MouseEvent.clientX</code>. @param clientYArg Specifies <code>MouseEvent.clientY</code>. @param ctrlKeyArg Specifies <code>MouseEvent.ctrlKey</code>. @param altKeyArg Specifies <code>MouseEvent.altKey</code>. @param shiftKeyArg Specifies <code>MouseEvent.shiftKey</code>. @param metaKeyArg Specifies <code>MouseEvent.metaKey</code>. @param buttonArg Specifies <code>MouseEvent.button</code>. @param relatedTargetArg Specifies <code>MouseEvent.relatedTarget</code>. This value may be <code>null</code>. 
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
;	TokenNameSEMICOLON	
/** * This methods queries the state of a modifier using a key identifier. * See also . * @param keyIdentifierArg A modifier key identifier, as defined by the * <code>KeyboardEvent.keyIdentifier</code> attribute. Common modifier * keys are <code>"Alt"</code>, <code>"AltGraph"</code>, * <code>"CapsLock"</code>, <code>"Control"</code>, <code>"Meta"</code> * , <code>"NumLock"</code>, <code>"Scroll"</code>, or * <code>"Shift"</code>. * <p ><b>Note:</b> If an application wishes to distinguish between * right and left modifiers, this information could be deduced using * keyboard events and <code>KeyboardEvent.keyLocation</code>. * @return <code>true</code> if it is modifier key and the modifier is * activated, <code>false</code> otherwise. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 This methods queries the state of a modifier using a key identifier. See also . @param keyIdentifierArg A modifier key identifier, as defined by the <code>KeyboardEvent.keyIdentifier</code> attribute. Common modifier keys are <code>"Alt"</code>, <code>"AltGraph"</code>, <code>"CapsLock"</code>, <code>"Control"</code>, <code>"Meta"</code> , <code>"NumLock"</code>, <code>"Scroll"</code>, or <code>"Shift"</code>. <p ><b>Note:</b> If an application wishes to distinguish between right and left modifiers, this information could be deduced using keyboard events and <code>KeyboardEvent.keyLocation</code>. @return <code>true</code> if it is modifier key and the modifier is activated, <code>false</code> otherwise. @since DOM Level 3 
public	TokenNamepublic	
boolean	TokenNameboolean	
getModifierState	TokenNameIdentifier	 get Modifier State
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initMouseEventNS</code> method is used to initialize the * value of a <code>MouseEvent</code> object and has the same behavior * as <code>UIEvent.initUIEventNS()</code>. * @param namespaceURI Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param typeArg Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param canBubbleArg Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param cancelableArg Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param viewArg Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param detailArg Refer to the <code>UIEvent.initUIEventNS()</code> * method for a description of this parameter. * @param screenXArg Refer to the * <code>MouseEvent.initMouseEvent()</code> method for a description * of this parameter. * @param screenYArg Refer to the * <code>MouseEvent.initMouseEvent()</code> method for a description * of this parameter. * @param clientXArg Refer to the * <code>MouseEvent.initMouseEvent()</code> method for a description * of this parameter. * @param clientYArg Refer to the * <code>MouseEvent.initMouseEvent()</code> method for a description * of this parameter. * @param buttonArg Refer to the <code>MouseEvent.initMouseEvent()</code> * method for a description of this parameter. * @param relatedTargetArg Refer to the * <code>MouseEvent.initMouseEvent()</code> method for a description * of this parameter. * @param modifiersList A <a href='http://www.w3.org/TR/2004/REC-xml-20040204/#NT-S'>white space</a> separated list of modifier key identifiers to be activated on this * object. As an example, <code>"Control Alt"</code> will activated * the control and alt modifiers. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The <code>initMouseEventNS</code> method is used to initialize the value of a <code>MouseEvent</code> object and has the same behavior as <code>UIEvent.initUIEventNS()</code>. @param namespaceURI Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param typeArg Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param viewArg Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param detailArg Refer to the <code>UIEvent.initUIEventNS()</code> method for a description of this parameter. @param screenXArg Refer to the <code>MouseEvent.initMouseEvent()</code> method for a description of this parameter. @param screenYArg Refer to the <code>MouseEvent.initMouseEvent()</code> method for a description of this parameter. @param clientXArg Refer to the <code>MouseEvent.initMouseEvent()</code> method for a description of this parameter. @param clientYArg Refer to the <code>MouseEvent.initMouseEvent()</code> method for a description of this parameter. @param buttonArg Refer to the <code>MouseEvent.initMouseEvent()</code> method for a description of this parameter. @param relatedTargetArg Refer to the <code>MouseEvent.initMouseEvent()</code> method for a description of this parameter. @param modifiersList A <a href='http://www.w3.org/TR/2004/REC-xml-20040204/#NT-S'>white space</a> separated list of modifier key identifiers to be activated on this object. As an example, <code>"Control Alt"</code> will activated the control and alt modifiers. @since DOM Level 3 
public	TokenNamepublic	
void	TokenNamevoid	
initMouseEventNS	TokenNameIdentifier	 init Mouse Event NS
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
