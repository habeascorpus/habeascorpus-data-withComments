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
/** * The <code>Event</code> interface is used to provide contextual information * about an event to the listener processing the event. An object which * implements the <code>Event</code> interface is passed as the parameter to * an <code>EventListener</code>. More specific context information is * passed to event listeners by deriving additional interfaces from * <code>Event</code> which contain information directly relating to the * type of event they represent. These derived interfaces are also * implemented by the object passed to the event listener. * <p> To create an instance of the <code>Event</code> interface, use the * <code>DocumentEvent.createEvent("Event")</code> method call. * <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. * @since DOM Level 2 */	TokenNameCOMMENT_JAVADOC	 The <code>Event</code> interface is used to provide contextual information about an event to the listener processing the event. An object which implements the <code>Event</code> interface is passed as the parameter to an <code>EventListener</code>. More specific context information is passed to event listeners by deriving additional interfaces from <code>Event</code> which contain information directly relating to the type of event they represent. These derived interfaces are also implemented by the object passed to the event listener. <p> To create an instance of the <code>Event</code> interface, use the <code>DocumentEvent.createEvent("Event")</code> method call. <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. @since DOM Level 2 
public	TokenNamepublic	
interface	TokenNameinterface	
Event	TokenNameIdentifier	 Event
{	TokenNameLBRACE	
// PhaseType 	TokenNameCOMMENT_LINE	PhaseType 
/** * The current event phase is the capture phase. */	TokenNameCOMMENT_JAVADOC	 The current event phase is the capture phase. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CAPTURING_PHASE	TokenNameIdentifier	 CAPTURING  PHASE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The current event is in the target phase, i.e. it is being evaluated * at the event target. */	TokenNameCOMMENT_JAVADOC	 The current event is in the target phase, i.e. it is being evaluated at the event target. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AT_TARGET	TokenNameIdentifier	 AT  TARGET
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The current event phase is the bubbling phase. */	TokenNameCOMMENT_JAVADOC	 The current event phase is the bubbling phase. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
BUBBLING_PHASE	TokenNameIdentifier	 BUBBLING  PHASE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The local name of the event type. The name must be an <a href='http://www.w3.org/TR/2004/REC-xml-names11-20040204/#NT-NCName'>NCName</a> as defined in [<a href='http://www.w3.org/TR/2004/REC-xml-names11-20040204/'>XML Namespaces 1.1</a>] * and is case-sensitive. */	TokenNameCOMMENT_JAVADOC	 The local name of the event type. The name must be an <a href='http://www.w3.org/TR/2004/REC-xml-names11-20040204/#NT-NCName'>NCName</a> as defined in [<a href='http://www.w3.org/TR/2004/REC-xml-names11-20040204/'>XML Namespaces 1.1</a>] and is case-sensitive. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to indicate the event target. This attribute contains the target * node when used with the . */	TokenNameCOMMENT_JAVADOC	 Used to indicate the event target. This attribute contains the target node when used with the . 
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to indicate the <code>EventTarget</code> whose * <code>EventListeners</code> are currently being processed. This is * particularly useful during the capture and bubbling phases. This * attribute could contain the target node or a target ancestor when * used with the . */	TokenNameCOMMENT_JAVADOC	 Used to indicate the <code>EventTarget</code> whose <code>EventListeners</code> are currently being processed. This is particularly useful during the capture and bubbling phases. This attribute could contain the target node or a target ancestor when used with the . 
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
getCurrentTarget	TokenNameIdentifier	 get Current Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to indicate which phase of event flow is currently being * accomplished. */	TokenNameCOMMENT_JAVADOC	 Used to indicate which phase of event flow is currently being accomplished. 
public	TokenNamepublic	
short	TokenNameshort	
getEventPhase	TokenNameIdentifier	 get Event Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to indicate whether or not an event is a bubbling event. If the * event can bubble the value is <code>true</code>, otherwise the value * is <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 Used to indicate whether or not an event is a bubbling event. If the event can bubble the value is <code>true</code>, otherwise the value is <code>false</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBubbles	TokenNameIdentifier	 get Bubbles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to indicate whether or not an event can have its default action * prevented (see also ). If the default action can be prevented the * value is <code>true</code>, otherwise the value is <code>false</code> * . */	TokenNameCOMMENT_JAVADOC	 Used to indicate whether or not an event can have its default action prevented (see also ). If the default action can be prevented the value is <code>true</code>, otherwise the value is <code>false</code> . 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCancelable	TokenNameIdentifier	 get Cancelable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to specify the time at which the event was created in * milliseconds relative to 1970-01-01T00:00:00Z. Due to the fact that * some systems may not provide this information the value of * <code>timeStamp</code> may be not available for all events. When not * available, the value is <code>0</code>. */	TokenNameCOMMENT_JAVADOC	 Used to specify the time at which the event was created in milliseconds relative to 1970-01-01T00:00:00Z. Due to the fact that some systems may not provide this information the value of <code>timeStamp</code> may be not available for all events. When not available, the value is <code>0</code>. 
public	TokenNamepublic	
long	TokenNamelong	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method is used to prevent event listeners of the same group to be * triggered but its effect is deferred until all event listeners * attached on the <code>Event.currentTarget</code> have been triggered * (see ). Once it has been called, further calls to that method have no * additional effect. * <p ><b>Note:</b> This method does not prevent the default action from * being invoked; use <code>Event.preventDefault()</code> for that * effect. */	TokenNameCOMMENT_JAVADOC	 This method is used to prevent event listeners of the same group to be triggered but its effect is deferred until all event listeners attached on the <code>Event.currentTarget</code> have been triggered (see ). Once it has been called, further calls to that method have no additional effect. <p ><b>Note:</b> This method does not prevent the default action from being invoked; use <code>Event.preventDefault()</code> for that effect. 
public	TokenNamepublic	
void	TokenNamevoid	
stopPropagation	TokenNameIdentifier	 stop Propagation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If an event is cancelable, the <code>preventDefault</code> method is * used to signify that the event is to be canceled, meaning any default * action normally taken by the implementation as a result of the event * will not occur (see also ), and thus independently of event groups. * Calling this method for a non-cancelable event has no effect. * <p ><b>Note:</b> This method does not stop the event propagation; use * <code>Event.stopPropagation()</code> or * <code>Event.stopImmediatePropagation()</code> for that effect. */	TokenNameCOMMENT_JAVADOC	 If an event is cancelable, the <code>preventDefault</code> method is used to signify that the event is to be canceled, meaning any default action normally taken by the implementation as a result of the event will not occur (see also ), and thus independently of event groups. Calling this method for a non-cancelable event has no effect. <p ><b>Note:</b> This method does not stop the event propagation; use <code>Event.stopPropagation()</code> or <code>Event.stopImmediatePropagation()</code> for that effect. 
public	TokenNamepublic	
void	TokenNamevoid	
preventDefault	TokenNameIdentifier	 prevent Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initEvent</code> method is used to initialize the value of * an <code>Event</code> created through the * <code>DocumentEvent.createEvent</code> method. This method may only * be called before the <code>Event</code> has been dispatched via the * <code>EventTarget.dispatchEvent()</code> method. If the method is * called several times before invoking * <code>EventTarget.dispatchEvent</code>, only the final invocation * takes precedence. This method has no effect if called after the event * has been dispatched. If called from a subclass of the * <code>Event</code> interface only the values specified in this method * are modified, all other attributes are left unchanged. * <br> This method sets the <code>Event.type</code> attribute to * <code>eventTypeArg</code>, and <code>Event.namespaceURI</code> to * <code>null</code>. To initialize an event with a namespace URI, use * the <code>Event.initEventNS()</code> method. * @param eventTypeArg Specifies <code>Event.type</code>, the local name * of the event type. * @param canBubbleArg Specifies <code>Event.bubbles</code>. This * parameter overrides the intrinsic bubbling behavior of the event. * @param cancelableArg Specifies <code>Event.cancelable</code>. This * parameter overrides the intrinsic cancelable behavior of the event. * */	TokenNameCOMMENT_JAVADOC	 The <code>initEvent</code> method is used to initialize the value of an <code>Event</code> created through the <code>DocumentEvent.createEvent</code> method. This method may only be called before the <code>Event</code> has been dispatched via the <code>EventTarget.dispatchEvent()</code> method. If the method is called several times before invoking <code>EventTarget.dispatchEvent</code>, only the final invocation takes precedence. This method has no effect if called after the event has been dispatched. If called from a subclass of the <code>Event</code> interface only the values specified in this method are modified, all other attributes are left unchanged. <br> This method sets the <code>Event.type</code> attribute to <code>eventTypeArg</code>, and <code>Event.namespaceURI</code> to <code>null</code>. To initialize an event with a namespace URI, use the <code>Event.initEventNS()</code> method. @param eventTypeArg Specifies <code>Event.type</code>, the local name of the event type. @param canBubbleArg Specifies <code>Event.bubbles</code>. This parameter overrides the intrinsic bubbling behavior of the event. @param cancelableArg Specifies <code>Event.cancelable</code>. This parameter overrides the intrinsic cancelable behavior of the event. 
public	TokenNamepublic	
void	TokenNamevoid	
initEvent	TokenNameIdentifier	 init Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eventTypeArg	TokenNameIdentifier	 event Type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The namespace URI associated with this event at creation time, or * <code>null</code> if it is unspecified. * <br> For events initialized with a DOM Level 2 Events method, such as * <code>Event.initEvent()</code>, this is always <code>null</code>. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The namespace URI associated with this event at creation time, or <code>null</code> if it is unspecified. <br> For events initialized with a DOM Level 2 Events method, such as <code>Event.initEvent()</code>, this is always <code>null</code>. @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method is used to prevent event listeners of the same group to be * triggered and, unlike <code>Event.stopPropagation()</code> its effect * is immediate (see ). Once it has been called, further calls to that * method have no additional effect. * <p ><b>Note:</b> This method does not prevent the default action from * being invoked; use <code>Event.preventDefault()</code> for that * effect. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 This method is used to prevent event listeners of the same group to be triggered and, unlike <code>Event.stopPropagation()</code> its effect is immediate (see ). Once it has been called, further calls to that method have no additional effect. <p ><b>Note:</b> This method does not prevent the default action from being invoked; use <code>Event.preventDefault()</code> for that effect. @since DOM Level 3 
public	TokenNamepublic	
void	TokenNamevoid	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to indicate whether <code>Event.preventDefault()</code> has been * called for this event. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Used to indicate whether <code>Event.preventDefault()</code> has been called for this event. @since DOM Level 3 
public	TokenNamepublic	
boolean	TokenNameboolean	
getDefaultPrevented	TokenNameIdentifier	 get Default Prevented
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initEventNS</code> method is used to initialize the value of * an <code>Event</code> object and has the same behavior as * <code>Event.initEvent()</code>. * @param namespaceURIArg Specifies <code>Event.namespaceURI</code>, the * namespace URI associated with this event, or <code>null</code> if * no namespace. * @param eventTypeArg Refer to the <code>Event.initEvent()</code> * method for a description of this parameter. * @param canBubbleArg Refer to the <code>Event.initEvent()</code> * method for a description of this parameter. * @param cancelableArg Refer to the <code>Event.initEvent()</code> * method for a description of this parameter. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The <code>initEventNS</code> method is used to initialize the value of an <code>Event</code> object and has the same behavior as <code>Event.initEvent()</code>. @param namespaceURIArg Specifies <code>Event.namespaceURI</code>, the namespace URI associated with this event, or <code>null</code> if no namespace. @param eventTypeArg Refer to the <code>Event.initEvent()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>Event.initEvent()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>Event.initEvent()</code> method for a description of this parameter. @since DOM Level 3 
public	TokenNamepublic	
void	TokenNamevoid	
initEventNS	TokenNameIdentifier	 init Event NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
eventTypeArg	TokenNameIdentifier	 event Type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
