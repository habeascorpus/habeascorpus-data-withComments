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
/** * The CustomEvent interface is the recommended interface for * application-specific event types. Unlike the <code>Event</code> * interface, it allows applications to provide contextual information about * the event type. Application-specific event types should have an * associated namespace to avoid clashes with future general-purpose event * types. * <p> To create an instance of the <code>CustomEvent</code> interface, use * the <code>DocumentEvent.createEvent("CustomEvent")</code> method call. * <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The CustomEvent interface is the recommended interface for application-specific event types. Unlike the <code>Event</code> interface, it allows applications to provide contextual information about the event type. Application-specific event types should have an associated namespace to avoid clashes with future general-purpose event types. <p> To create an instance of the <code>CustomEvent</code> interface, use the <code>DocumentEvent.createEvent("CustomEvent")</code> method call. <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. @since DOM Level 3 
public	TokenNamepublic	
interface	TokenNameinterface	
CustomEvent	TokenNameIdentifier	 Custom Event
extends	TokenNameextends	
Event	TokenNameIdentifier	 Event
{	TokenNameLBRACE	
/** * Specifies some detail information about the <code>Event</code>. */	TokenNameCOMMENT_JAVADOC	 Specifies some detail information about the <code>Event</code>. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getDetail	TokenNameIdentifier	 get Detail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initCustomEventNS</code> method is used to initialize the * value of a <code>CustomEvent</code> object and has the same behavior * as <code>Event.initEventNS()</code>. * @param namespaceURI Refer to the <code>Event.initEventNS()</code> * method for a description of this parameter. * @param typeArg Refer to the <code>Event.initEventNS()</code> method * for a description of this parameter. * @param canBubbleArg Refer to the <code>Event.initEventNS()</code> * method for a description of this parameter. * @param cancelableArg Refer to the <code>Event.initEventNS()</code> * method for a description of this parameter. * @param detailArg Specifies <code>CustomEvent.detail</code>. This * value may be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 The <code>initCustomEventNS</code> method is used to initialize the value of a <code>CustomEvent</code> object and has the same behavior as <code>Event.initEventNS()</code>. @param namespaceURI Refer to the <code>Event.initEventNS()</code> method for a description of this parameter. @param typeArg Refer to the <code>Event.initEventNS()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>Event.initEventNS()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>Event.initEventNS()</code> method for a description of this parameter. @param detailArg Specifies <code>CustomEvent.detail</code>. This value may be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
initCustomEventNS	TokenNameIdentifier	 init Custom Event NS
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
Object	TokenNameIdentifier	 Object
detailArg	TokenNameIdentifier	 detail Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
