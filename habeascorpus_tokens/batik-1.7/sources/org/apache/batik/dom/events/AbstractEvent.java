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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xbl	TokenNameIdentifier	 xbl
.	TokenNameDOT	
OriginalEvent	TokenNameIdentifier	 Original Event
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
Event	TokenNameIdentifier	 Event
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * The abstract <code>Event</code> root class. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractEvent.java 503215 2007-02-03 14:53:42Z deweese $ */	TokenNameCOMMENT_JAVADOC	 The abstract <code>Event</code> root class. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractEvent.java 503215 2007-02-03 14:53:42Z deweese $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractEvent	TokenNameIdentifier	 Abstract Event
implements	TokenNameimplements	
Event	TokenNameIdentifier	 Event
,	TokenNameCOMMA	
OriginalEvent	TokenNameIdentifier	 Original Event
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** * The event type. */	TokenNameCOMMENT_JAVADOC	 The event type. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * Whether this event is bubbling. */	TokenNameCOMMENT_JAVADOC	 Whether this event is bubbling. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isBubbling	TokenNameIdentifier	 is Bubbling
;	TokenNameSEMICOLON	
/** * Whether this event is cancelable. */	TokenNameCOMMENT_JAVADOC	 Whether this event is cancelable. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
cancelable	TokenNameIdentifier	 cancelable
;	TokenNameSEMICOLON	
/** * The EventTarget whose EventListeners are currently being processed. */	TokenNameCOMMENT_JAVADOC	 The EventTarget whose EventListeners are currently being processed. 
protected	TokenNameprotected	
EventTarget	TokenNameIdentifier	 Event Target
currentTarget	TokenNameIdentifier	 current Target
;	TokenNameSEMICOLON	
/** * The target of this event. */	TokenNameCOMMENT_JAVADOC	 The target of this event. 
protected	TokenNameprotected	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
/** * The event phase. */	TokenNameCOMMENT_JAVADOC	 The event phase. 
protected	TokenNameprotected	
short	TokenNameshort	
eventPhase	TokenNameIdentifier	 event Phase
;	TokenNameSEMICOLON	
/** * The time the event was created. */	TokenNameCOMMENT_JAVADOC	 The time the event was created. 
protected	TokenNameprotected	
long	TokenNamelong	
timeStamp	TokenNameIdentifier	 time Stamp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the event propagation must be stopped after the current * event listener group has been completed. */	TokenNameCOMMENT_JAVADOC	 Whether the event propagation must be stopped after the current event listener group has been completed. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
stopPropagation	TokenNameIdentifier	 stop Propagation
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Whether the event propagation must be stopped immediately. */	TokenNameCOMMENT_JAVADOC	 Whether the event propagation must be stopped immediately. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Whether the default action must be processed. */	TokenNameCOMMENT_JAVADOC	 Whether the default action must be processed. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
preventDefault	TokenNameIdentifier	 prevent Default
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Namespace URI of this event. */	TokenNameCOMMENT_JAVADOC	 Namespace URI of this event. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * The event from which this event was cloned for sXBL event retargetting. */	TokenNameCOMMENT_JAVADOC	 The event from which this event was cloned for sXBL event retargetting. 
protected	TokenNameprotected	
Event	TokenNameIdentifier	 Event
originalEvent	TokenNameIdentifier	 original Event
;	TokenNameSEMICOLON	
/** * List of default Actionables to run at the end of bubble phase. */	TokenNameCOMMENT_JAVADOC	 List of default Actionables to run at the end of bubble phase. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
defaultActions	TokenNameIdentifier	 default Actions
;	TokenNameSEMICOLON	
/** * The number of nodes in the document this event will visit * during capturing, bubbling and firing at the target. * A value of 0 means to let the event be captured and bubble all * the way to the document node. This field is used to handle * events which should not cross sXBL shadow scopes without stopping * or retargetting. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in the document this event will visit during capturing, bubbling and firing at the target. A value of 0 means to let the event be captured and bubble all the way to the document node. This field is used to handle events which should not cross sXBL shadow scopes without stopping or retargetting. 
protected	TokenNameprotected	
int	TokenNameint	
bubbleLimit	TokenNameIdentifier	 bubble Limit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * DOM: The <code>type</code> property represents the event name * as a string property. The string must be an XML name. */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>type</code> property represents the event name as a string property. The string must be an XML name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: The <code>target</code> property indicates the * <code>EventTarget</code> whose <code>EventListeners</code> are * currently being processed. */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>target</code> property indicates the <code>EventTarget</code> whose <code>EventListeners</code> are currently being processed. 
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
getCurrentTarget	TokenNameIdentifier	 get Current Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentTarget	TokenNameIdentifier	 current Target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: The <code>target</code> property indicates the * <code>EventTarget</code> to which the event was originally * dispatched. */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>target</code> property indicates the <code>EventTarget</code> to which the event was originally dispatched. 
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: The <code>eventPhase</code> property indicates which phase * of event flow is currently being evaluated. */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>eventPhase</code> property indicates which phase of event flow is currently being evaluated. 
public	TokenNamepublic	
short	TokenNameshort	
getEventPhase	TokenNameIdentifier	 get Event Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eventPhase	TokenNameIdentifier	 event Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: The <code>bubbles</code> property indicates whether or not * an event is a bubbling event. If the event can bubble the * value is true, else the value is false. */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>bubbles</code> property indicates whether or not an event is a bubbling event. If the event can bubble the value is true, else the value is false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBubbles	TokenNameIdentifier	 get Bubbles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isBubbling	TokenNameIdentifier	 is Bubbling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: The <code>cancelable</code> property indicates whether or * not an event can have its default action prevented. If the * default action can be prevented the value is true, else the * value is false. */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>cancelable</code> property indicates whether or not an event can have its default action prevented. If the default action can be prevented the value is true, else the value is false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCancelable	TokenNameIdentifier	 get Cancelable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cancelable	TokenNameIdentifier	 cancelable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: Used to specify the time (in milliseconds relative to the * epoch) at * which the event was created. Due to the fact that some systems may not * provide this information the value of <code>timeStamp</code> may be * returned. Examples of epoch time are the time of the system start or * 0:0:0 UTC 1st January 1970. */	TokenNameCOMMENT_JAVADOC	 DOM: Used to specify the time (in milliseconds relative to the epoch) at which the event was created. Due to the fact that some systems may not provide this information the value of <code>timeStamp</code> may be returned. Examples of epoch time are the time of the system start or 0:0:0 UTC 1st January 1970. 
public	TokenNamepublic	
long	TokenNamelong	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeStamp	TokenNameIdentifier	 time Stamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the namespace URI of this event. */	TokenNameCOMMENT_JAVADOC	 Get the namespace URI of this event. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the event from which this event was cloned. */	TokenNameCOMMENT_JAVADOC	 Gets the event from which this event was cloned. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
getOriginalEvent	TokenNameIdentifier	 get Original Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originalEvent	TokenNameIdentifier	 original Event
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: The <code>stopPropagation</code> method is used prevent * further propagation of an event during event flow. If this * method is called by any <code>EventListener</code> the event * will cease propagating through the tree. The event will * complete dispatch to all listeners on the current * <code>EventTarget</code> before event flow stops. This method * may be used during any stage of event flow. */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>stopPropagation</code> method is used prevent further propagation of an event during event flow. If this method is called by any <code>EventListener</code> the event will cease propagating through the tree. The event will complete dispatch to all listeners on the current <code>EventTarget</code> before event flow stops. This method may be used during any stage of event flow. 
public	TokenNamepublic	
void	TokenNamevoid	
stopPropagation	TokenNameIdentifier	 stop Propagation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stopPropagation	TokenNameIdentifier	 stop Propagation
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: If an event is cancelable, the <code>preventDefault</code> * method is used to signify that the event is to be canceled, * meaning any default action normally taken by the implementation * as a result of the event will not occur. If, during any stage * of event flow, the <code>preventDefault</code> method is called * the event is canceled. Any default action associated with the * event will not occur. Calling this method for a non-cancelable * event has no effect. Once <code>preventDefault</code> has been * called it will remain in effect throughout the remainder of the * event's propagation. This method may be used during any stage * of event flow. */	TokenNameCOMMENT_JAVADOC	 DOM: If an event is cancelable, the <code>preventDefault</code> method is used to signify that the event is to be canceled, meaning any default action normally taken by the implementation as a result of the event will not occur. If, during any stage of event flow, the <code>preventDefault</code> method is called the event is canceled. Any default action associated with the event will not occur. Calling this method for a non-cancelable event has no effect. Once <code>preventDefault</code> has been called it will remain in effect throughout the remainder of the event's propagation. This method may be used during any stage of event flow. 
public	TokenNamepublic	
void	TokenNamevoid	
preventDefault	TokenNameIdentifier	 prevent Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
preventDefault	TokenNameIdentifier	 prevent Default
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Returns whether <code>preventDefault</code> has been * called on this object. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Returns whether <code>preventDefault</code> has been called on this object. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getDefaultPrevented	TokenNameIdentifier	 get Default Prevented
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
preventDefault	TokenNameIdentifier	 prevent Default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current list of default action runnables */	TokenNameCOMMENT_JAVADOC	 Returns the current list of default action runnables 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getDefaultActions	TokenNameIdentifier	 get Default Actions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultActions	TokenNameIdentifier	 default Actions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the runnable to the list of default action runnables */	TokenNameCOMMENT_JAVADOC	 Adds the runnable to the list of default action runnables 
public	TokenNamepublic	
void	TokenNamevoid	
addDefaultAction	TokenNameIdentifier	 add Default Action
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
rable	TokenNameIdentifier	 rable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaultActions	TokenNameIdentifier	 default Actions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
defaultActions	TokenNameIdentifier	 default Actions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultActions	TokenNameIdentifier	 default Actions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rable	TokenNameIdentifier	 rable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Stops propagation of this event immediately, even to * listeners in the current group. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Stops propagation of this event immediately, even to listeners in the current group. 
public	TokenNamepublic	
void	TokenNamevoid	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: The <code>initEvent</code> method is used to initialize the * value of interface. This method may only be called before the * <code>Event</code> has been dispatched via the * <code>dispatchEvent</code> method, though it may be called multiple * times during that phase if necessary. If called multiple times the * final invocation takes precedence. If called from a subclass of * <code>Event</code> interface only the values specified in the * <code>initEvent</code> method are modified, all other attributes are * left unchanged. * @param eventTypeArg Specifies the event type. This type may be any * event type currently defined in this specification or a new event * type.. The string must be an XML name . Any new event type must * not begin with any upper, lower, or mixed case version of the * string "DOM". This prefix is reserved for future DOM event sets. * @param canBubbleArg Specifies whether or not the event can bubble. * @param cancelableArg Specifies whether or not the event's default * action can be prevented. */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>initEvent</code> method is used to initialize the value of interface. This method may only be called before the <code>Event</code> has been dispatched via the <code>dispatchEvent</code> method, though it may be called multiple times during that phase if necessary. If called multiple times the final invocation takes precedence. If called from a subclass of <code>Event</code> interface only the values specified in the <code>initEvent</code> method are modified, all other attributes are left unchanged. @param eventTypeArg Specifies the event type. This type may be any event type currently defined in this specification or a new event type.. The string must be an XML name . Any new event type must not begin with any upper, lower, or mixed case version of the string "DOM". This prefix is reserved for future DOM event sets. @param canBubbleArg Specifies whether or not the event can bubble. @param cancelableArg Specifies whether or not the event's default action can be prevented. 
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
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
eventTypeArg	TokenNameIdentifier	 event Type Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isBubbling	TokenNameIdentifier	 is Bubbling
=	TokenNameEQUAL	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cancelable	TokenNameIdentifier	 cancelable
=	TokenNameEQUAL	
cancelableArg	TokenNameIdentifier	 cancelable Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements * {@link org.w3c.dom.events.Event#initEventNS(String,String,boolean,boolean)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.events.Event#initEventNS(String,String,boolean,boolean)}. 
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
eventTypeArg	TokenNameIdentifier	 event Type Arg
;	TokenNameSEMICOLON	
isBubbling	TokenNameIdentifier	 is Bubbling
=	TokenNameEQUAL	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
;	TokenNameSEMICOLON	
cancelable	TokenNameIdentifier	 cancelable
=	TokenNameEQUAL	
cancelableArg	TokenNameIdentifier	 cancelable Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
getStopPropagation	TokenNameIdentifier	 get Stop Propagation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stopPropagation	TokenNameIdentifier	 stop Propagation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
getStopImmediatePropagation	TokenNameIdentifier	 get Stop Immediate Propagation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setEventPhase	TokenNameIdentifier	 set Event Phase
(	TokenNameLPAREN	
short	TokenNameshort	
eventPhase	TokenNameIdentifier	 event Phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
eventPhase	TokenNameIdentifier	 event Phase
=	TokenNameEQUAL	
eventPhase	TokenNameIdentifier	 event Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
stopPropagation	TokenNameIdentifier	 stop Propagation
(	TokenNameLPAREN	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stopPropagation	TokenNameIdentifier	 stop Propagation
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
(	TokenNameLPAREN	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
preventDefault	TokenNameIdentifier	 prevent Default
(	TokenNameLPAREN	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
preventDefault	TokenNameIdentifier	 prevent Default
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setCurrentTarget	TokenNameIdentifier	 set Current Target
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
currentTarget	TokenNameIdentifier	 current Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentTarget	TokenNameIdentifier	 current Target
=	TokenNameEQUAL	
currentTarget	TokenNameIdentifier	 current Target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new Event with the same field values as this object. */	TokenNameCOMMENT_JAVADOC	 Returns a new Event with the same field values as this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
AbstractEvent	TokenNameIdentifier	 Abstract Event
newEvent	TokenNameIdentifier	 new Event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newEvent	TokenNameIdentifier	 new Event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newEvent	TokenNameIdentifier	 new Event
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clones this event and sets the originalEvent field of the new event * to be equal to this event. */	TokenNameCOMMENT_JAVADOC	 Clones this event and sets the originalEvent field of the new event to be equal to this event. 
public	TokenNamepublic	
AbstractEvent	TokenNameIdentifier	 Abstract Event
cloneEvent	TokenNameIdentifier	 clone Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
AbstractEvent	TokenNameIdentifier	 Abstract Event
newEvent	TokenNameIdentifier	 new Event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newEvent	TokenNameIdentifier	 new Event
.	TokenNameDOT	
originalEvent	TokenNameIdentifier	 original Event
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newEvent	TokenNameIdentifier	 new Event
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the bubble limit for this event. */	TokenNameCOMMENT_JAVADOC	 Returns the bubble limit for this event. 
public	TokenNamepublic	
int	TokenNameint	
getBubbleLimit	TokenNameIdentifier	 get Bubble Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bubbleLimit	TokenNameIdentifier	 bubble Limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the number of nodse this event will visit. */	TokenNameCOMMENT_JAVADOC	 Set the number of nodse this event will visit. 
public	TokenNamepublic	
void	TokenNamevoid	
setBubbleLimit	TokenNameIdentifier	 set Bubble Limit
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bubbleLimit	TokenNameIdentifier	 bubble Limit
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
