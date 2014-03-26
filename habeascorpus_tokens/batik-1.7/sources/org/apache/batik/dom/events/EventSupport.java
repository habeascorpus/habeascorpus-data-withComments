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
List	TokenNameIdentifier	 List
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractDocument	TokenNameIdentifier	 Abstract Document
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
AbstractNode	TokenNameIdentifier	 Abstract Node
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashTable	TokenNameIdentifier	 Hash Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
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
EventException	TokenNameIdentifier	 Event Exception
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
EventListener	TokenNameIdentifier	 Event Listener
;	TokenNameSEMICOLON	
/** * The class allows registration and removal of EventListeners on * an NodeEventTarget and dispatch of events to that NodeEventTarget. * * @see NodeEventTarget * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: EventSupport.java 601207 2007-12-05 04:57:31Z cam $ */	TokenNameCOMMENT_JAVADOC	 The class allows registration and removal of EventListeners on an NodeEventTarget and dispatch of events to that NodeEventTarget. * @see NodeEventTarget @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: EventSupport.java 601207 2007-12-05 04:57:31Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
EventSupport	TokenNameIdentifier	 Event Support
{	TokenNameLBRACE	
/** * The capturing listeners table. */	TokenNameCOMMENT_JAVADOC	 The capturing listeners table. 
protected	TokenNameprotected	
HashTable	TokenNameIdentifier	 Hash Table
capturingListeners	TokenNameIdentifier	 capturing Listeners
;	TokenNameSEMICOLON	
/** * The bubbling listeners table. */	TokenNameCOMMENT_JAVADOC	 The bubbling listeners table. 
protected	TokenNameprotected	
HashTable	TokenNameIdentifier	 Hash Table
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
;	TokenNameSEMICOLON	
/** * The node for which events are being handled. */	TokenNameCOMMENT_JAVADOC	 The node for which events are being handled. 
protected	TokenNameprotected	
AbstractNode	TokenNameIdentifier	 Abstract Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
/** * Creates a new EventSupport object. * @param n the node for which events are being handled */	TokenNameCOMMENT_JAVADOC	 Creates a new EventSupport object. @param n the node for which events are being handled 
public	TokenNamepublic	
EventSupport	TokenNameIdentifier	 Event Support
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method allows the registration of event listeners on the * event target. If an <code>EventListener</code> is added to an * <code>EventTarget</code> which is currently processing an event * the new listener will not be triggered by the current event. * <br> If multiple identical <code>EventListener</code>s are * registered on the same <code>EventTarget</code> with the same * parameters the duplicate instances are discarded. They do not * cause the <code>EventListener</code> to be called twice and * since they are discarded they do not need to be removed with * the <code>removeEventListener</code> method. * * @param type The event type for which the user is registering * * @param listener The <code>listener</code> parameter takes an * interface implemented by the user which contains the methods to * be called when the event occurs. * * @param useCapture If true, <code>useCapture</code> indicates * that the user wishes to initiate capture. After initiating * capture, all events of the specified type will be dispatched to * the registered <code>EventListener</code> before being * dispatched to any <code>EventTargets</code> beneath them in the * tree. Events which are bubbling upward through the tree will * not trigger an <code>EventListener</code> designated to use * capture. */	TokenNameCOMMENT_JAVADOC	 This method allows the registration of event listeners on the event target. If an <code>EventListener</code> is added to an <code>EventTarget</code> which is currently processing an event the new listener will not be triggered by the current event. <br> If multiple identical <code>EventListener</code>s are registered on the same <code>EventTarget</code> with the same parameters the duplicate instances are discarded. They do not cause the <code>EventListener</code> to be called twice and since they are discarded they do not need to be removed with the <code>removeEventListener</code> method. * @param type The event type for which the user is registering * @param listener The <code>listener</code> parameter takes an interface implemented by the user which contains the methods to be called when the event occurs. * @param useCapture If true, <code>useCapture</code> indicates that the user wishes to initiate capture. After initiating capture, all events of the specified type will be dispatched to the registered <code>EventListener</code> before being dispatched to any <code>EventTargets</code> beneath them in the tree. Events which are bubbling upward through the tree will not trigger an <code>EventListener</code> designated to use capture. 
public	TokenNamepublic	
void	TokenNamevoid	
addEventListener	TokenNameIdentifier	 add Event Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
useCapture	TokenNameIdentifier	 use Capture
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Registers an event listener for the given namespaced event type * in the specified group. */	TokenNameCOMMENT_JAVADOC	 Registers an event listener for the given namespaced event type in the specified group. 
public	TokenNamepublic	
void	TokenNamevoid	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCapture	TokenNameIdentifier	 use Capture
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashTable	TokenNameIdentifier	 Hash Table
listeners	TokenNameIdentifier	 listeners
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
capturingListeners	TokenNameIdentifier	 capturing Listeners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
capturingListeners	TokenNameIdentifier	 capturing Listeners
=	TokenNameEQUAL	
new	TokenNamenew	
HashTable	TokenNameIdentifier	 Hash Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
capturingListeners	TokenNameIdentifier	 capturing Listeners
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
=	TokenNameEQUAL	
new	TokenNamenew	
HashTable	TokenNameIdentifier	 Hash Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
EventListenerList	TokenNameIdentifier	 Event Listener List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListenerList	TokenNameIdentifier	 Event Listener List
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
EventListenerList	TokenNameIdentifier	 Event Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
addListener	TokenNameIdentifier	 add Listener
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method allows the removal of event listeners from the * event target. If an <code>EventListener</code> is removed from * an <code>EventTarget</code> while it is processing an event, it * will complete its current actions but will not be triggered * again during any later stages of event flow. <br>If an * <code>EventListener</code> is removed from an * <code>EventTarget</code> which is currently processing an event * the removed listener will still be triggered by the current * event. <br>Calling <code>removeEventListener</code> with * arguments which do not identify any currently registered * <code>EventListener</code> on the <code>EventTarget</code> has * no effect. * * @param type Specifies the event type of the * <code>EventListener</code> being removed. * * @param listener The <code>EventListener</code> parameter * indicates the <code>EventListener </code> to be removed. * * @param useCapture Specifies whether the * <code>EventListener</code> being removed was registered as a * capturing listener or not. If a listener was registered twice, * one with capture and one without, each must be removed * separately. Removal of a capturing listener does not affect a * non-capturing version of the same listener, and vice versa. */	TokenNameCOMMENT_JAVADOC	 This method allows the removal of event listeners from the event target. If an <code>EventListener</code> is removed from an <code>EventTarget</code> while it is processing an event, it will complete its current actions but will not be triggered again during any later stages of event flow. <br>If an <code>EventListener</code> is removed from an <code>EventTarget</code> which is currently processing an event the removed listener will still be triggered by the current event. <br>Calling <code>removeEventListener</code> with arguments which do not identify any currently registered <code>EventListener</code> on the <code>EventTarget</code> has no effect. * @param type Specifies the event type of the <code>EventListener</code> being removed. * @param listener The <code>EventListener</code> parameter indicates the <code>EventListener </code> to be removed. * @param useCapture Specifies whether the <code>EventListener</code> being removed was registered as a capturing listener or not. If a listener was registered twice, one with capture and one without, each must be removed separately. Removal of a capturing listener does not affect a non-capturing version of the same listener, and vice versa. 
public	TokenNamepublic	
void	TokenNamevoid	
removeEventListener	TokenNameIdentifier	 remove Event Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deregisters an event listener. */	TokenNameCOMMENT_JAVADOC	 Deregisters an event listener. 
public	TokenNamepublic	
void	TokenNamevoid	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashTable	TokenNameIdentifier	 Hash Table
listeners	TokenNameIdentifier	 listeners
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
capturingListeners	TokenNameIdentifier	 capturing Listeners
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
EventListenerList	TokenNameIdentifier	 Event Listener List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListenerList	TokenNameIdentifier	 Event Listener List
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
removeListener	TokenNameIdentifier	 remove Listener
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Moves all of the event listeners from this EventSupport object * to the given EventSupport object. * Used by {@link * org.apache.batik.dom.AbstractDocument#renameNode(Node,String,String)}. */	TokenNameCOMMENT_JAVADOC	 Moves all of the event listeners from this EventSupport object to the given EventSupport object. Used by {@link org.apache.batik.dom.AbstractDocument#renameNode(Node,String,String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
moveEventListeners	TokenNameIdentifier	 move Event Listeners
(	TokenNameLPAREN	
EventSupport	TokenNameIdentifier	 Event Support
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
capturingListeners	TokenNameIdentifier	 capturing Listeners
=	TokenNameEQUAL	
capturingListeners	TokenNameIdentifier	 capturing Listeners
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
=	TokenNameEQUAL	
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
;	TokenNameSEMICOLON	
capturingListeners	TokenNameIdentifier	 capturing Listeners
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method allows the dispatch of events into the * implementations event model. Events dispatched in this manner * will have the same capturing and bubbling behavior as events * dispatched directly by the implementation. The target of the * event is the <code> EventTarget</code> on which * <code>dispatchEvent</code> is called. * * @param target the target node * @param evt Specifies the event type, behavior, and contextual * information to be used in processing the event. * * @return The return value of <code>dispatchEvent</code> * indicates whether any of the listeners which handled the event * called <code>preventDefault</code>. If * <code>preventDefault</code> was called the value is false, else * the value is true. * * @exception EventException * UNSPECIFIED_EVENT_TYPE_ERR: Raised if the * <code>Event</code>'s type was not specified by initializing * the event before <code>dispatchEvent</code> was * called. Specification of the <code>Event</code>'s type as * <code>null</code> or an empty string will also trigger this * exception. */	TokenNameCOMMENT_JAVADOC	 This method allows the dispatch of events into the implementations event model. Events dispatched in this manner will have the same capturing and bubbling behavior as events dispatched directly by the implementation. The target of the event is the <code> EventTarget</code> on which <code>dispatchEvent</code> is called. * @param target the target node @param evt Specifies the event type, behavior, and contextual information to be used in processing the event. * @return The return value of <code>dispatchEvent</code> indicates whether any of the listeners which handled the event called <code>preventDefault</code>. If <code>preventDefault</code> was called the value is false, else the value is true. * @exception EventException UNSPECIFIED_EVENT_TYPE_ERR: Raised if the <code>Event</code>'s type was not specified by initializing the event before <code>dispatchEvent</code> was called. Specification of the <code>Event</code>'s type as <code>null</code> or an empty string will also trigger this exception. 
public	TokenNamepublic	
boolean	TokenNameboolean	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
throws	TokenNamethrows	
EventException	TokenNameIdentifier	 Event Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
instanceof	TokenNameinstanceof	
AbstractEvent	TokenNameIdentifier	 Abstract Event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createEventException	TokenNameIdentifier	 create Event Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"unsupported.event"	TokenNameStringLiteral	unsupported.event
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createEventException	TokenNameIdentifier	 create Event Exception
(	TokenNameLPAREN	
EventException	TokenNameIdentifier	 Event Exception
.	TokenNameDOT	
UNSPECIFIED_EVENT_TYPE_ERR	TokenNameIdentifier	 UNSPECIFIED  EVENT  TYPE  ERR
,	TokenNameCOMMA	
"unspecified.event"	TokenNameStringLiteral	unspecified.event
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fix event status 	TokenNameCOMMENT_LINE	fix event status 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
stopPropagation	TokenNameIdentifier	 stop Propagation
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
preventDefault	TokenNameIdentifier	 prevent Default
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dump the tree hierarchy from top to the target 	TokenNameCOMMENT_LINE	dump the tree hierarchy from top to the target 
NodeEventTarget	TokenNameIdentifier	 Node Event Target
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ancestors	TokenNameIdentifier	 ancestors
=	TokenNameEQUAL	
getAncestors	TokenNameIdentifier	 get Ancestors
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CAPTURING_PHASE : fire event listeners from top to EventTarget 	TokenNameCOMMENT_LINE	CAPTURING_PHASE : fire event listeners from top to EventTarget 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setEventPhase	TokenNameIdentifier	 set Event Phase
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
CAPTURING_PHASE	TokenNameIdentifier	 CAPTURING  PHASE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
stoppedGroups	TokenNameIdentifier	 stopped Groups
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
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
ancestors	TokenNameIdentifier	 ancestors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
ancestors	TokenNameIdentifier	 ancestors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setCurrentTarget	TokenNameIdentifier	 set Current Target
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireEventListeners	TokenNameIdentifier	 fire Event Listeners
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
stoppedGroups	TokenNameIdentifier	 stopped Groups
,	TokenNameCOMMA	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stoppedGroups	TokenNameIdentifier	 stopped Groups
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// AT_TARGET : fire local event listeners 	TokenNameCOMMENT_LINE	AT_TARGET : fire local event listeners 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setEventPhase	TokenNameIdentifier	 set Event Phase
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
AT_TARGET	TokenNameIdentifier	 AT  TARGET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setCurrentTarget	TokenNameIdentifier	 set Current Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireEventListeners	TokenNameIdentifier	 fire Event Listeners
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
stoppedGroups	TokenNameIdentifier	 stopped Groups
,	TokenNameCOMMA	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stoppedGroups	TokenNameIdentifier	 stopped Groups
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// BUBBLING_PHASE : fire event listeners from target to top 	TokenNameCOMMENT_LINE	BUBBLING_PHASE : fire event listeners from target to top 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getBubbles	TokenNameIdentifier	 get Bubbles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setEventPhase	TokenNameIdentifier	 set Event Phase
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
.	TokenNameDOT	
BUBBLING_PHASE	TokenNameIdentifier	 BUBBLING  PHASE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
ancestors	TokenNameIdentifier	 ancestors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
ancestors	TokenNameIdentifier	 ancestors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setCurrentTarget	TokenNameIdentifier	 set Current Target
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireEventListeners	TokenNameIdentifier	 fire Event Listeners
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
stoppedGroups	TokenNameIdentifier	 stopped Groups
,	TokenNameCOMMA	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stoppedGroups	TokenNameIdentifier	 stopped Groups
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getDefaultPrevented	TokenNameIdentifier	 get Default Prevented
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runDefaultActions	TokenNameIdentifier	 run Default Actions
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getDefaultPrevented	TokenNameIdentifier	 get Default Prevented
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Runs all of the registered default actions for the given event object. */	TokenNameCOMMENT_JAVADOC	 Runs all of the registered default actions for the given event object. 
protected	TokenNameprotected	
void	TokenNamevoid	
runDefaultActions	TokenNameIdentifier	 run Default Actions
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
runables	TokenNameIdentifier	 runables
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getDefaultActions	TokenNameIdentifier	 get Default Actions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
runables	TokenNameIdentifier	 runables
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
runables	TokenNameIdentifier	 runables
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
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
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires the given listeners on the given event target. */	TokenNameCOMMENT_JAVADOC	 Fires the given listeners on the given event target. 
protected	TokenNameprotected	
void	TokenNamevoid	
fireEventListeners	TokenNameIdentifier	 fire Event Listeners
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
EventListenerList	TokenNameIdentifier	 Event Listener List
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
,	TokenNameCOMMA	
HashSet	TokenNameIdentifier	 Hash Set
stoppedGroups	TokenNameIdentifier	 stopped Groups
,	TokenNameCOMMA	
HashSet	TokenNameIdentifier	 Hash Set
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fire event listeners 	TokenNameCOMMENT_LINE	fire event listeners 
String	TokenNameIdentifier	 String
eventNS	TokenNameIdentifier	 event NS
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
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
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
listenerNS	TokenNameIdentifier	 listener NS
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
listenerNS	TokenNameIdentifier	 listener NS
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
eventNS	TokenNameIdentifier	 event NS
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
listenerNS	TokenNameIdentifier	 listener NS
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
eventNS	TokenNameIdentifier	 event NS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGroup	TokenNameIdentifier	 get Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stoppedGroups	TokenNameIdentifier	 stopped Groups
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
stoppedGroups	TokenNameIdentifier	 stopped Groups
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getListener	TokenNameIdentifier	 get Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getStopImmediatePropagation	TokenNameIdentifier	 get Stop Immediate Propagation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stoppedGroups	TokenNameIdentifier	 stopped Groups
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stoppedGroups	TokenNameIdentifier	 stopped Groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getStopPropagation	TokenNameIdentifier	 get Stop Propagation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
stopPropagation	TokenNameIdentifier	 stop Propagation
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ThreadDeath	TokenNameIdentifier	 Thread Death
td	TokenNameIdentifier	 td
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
td	TokenNameIdentifier	 td
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
{	TokenNameLBRACE	
th	TokenNameIdentifier	 th
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires the registered listeners on the given event target. */	TokenNameCOMMENT_JAVADOC	 Fires the registered listeners on the given event target. 
protected	TokenNameprotected	
void	TokenNamevoid	
fireEventListeners	TokenNameIdentifier	 fire Event Listeners
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCapture	TokenNameIdentifier	 use Capture
,	TokenNameCOMMA	
HashSet	TokenNameIdentifier	 Hash Set
stoppedGroups	TokenNameIdentifier	 stopped Groups
,	TokenNameCOMMA	
HashSet	TokenNameIdentifier	 Hash Set
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EventSupport	TokenNameIdentifier	 Event Support
support	TokenNameIdentifier	 support
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getEventSupport	TokenNameIdentifier	 get Event Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check if the event support has been instantiated 	TokenNameCOMMENT_LINE	check if the event support has been instantiated 
if	TokenNameif	
(	TokenNameLPAREN	
support	TokenNameIdentifier	 support
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
EventListenerList	TokenNameIdentifier	 Event Listener List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
getEventListeners	TokenNameIdentifier	 get Event Listeners
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check if the event listeners list is not empty 	TokenNameCOMMENT_LINE	check if the event listeners list is not empty 
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// dump event listeners, we get the registered listeners NOW 	TokenNameCOMMENT_LINE	dump event listeners, we get the registered listeners NOW 
EventListenerList	TokenNameIdentifier	 Event Listener List
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
getEventListeners	TokenNameIdentifier	 get Event Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireEventListeners	TokenNameIdentifier	 fire Event Listeners
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
listeners	TokenNameIdentifier	 listeners
,	TokenNameCOMMA	
stoppedGroups	TokenNameIdentifier	 stopped Groups
,	TokenNameCOMMA	
toBeStoppedGroups	TokenNameIdentifier	 to Be Stopped Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns all ancestors of the specified node. */	TokenNameCOMMENT_JAVADOC	 Returns all ancestors of the specified node. 
protected	TokenNameprotected	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAncestors	TokenNameIdentifier	 get Ancestors
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNodeEventTarget	TokenNameIdentifier	 get Parent Node Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip current node 	TokenNameCOMMENT_LINE	skip current node 
int	TokenNameint	
nancestors	TokenNameIdentifier	 nancestors
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNodeEventTarget	TokenNameIdentifier	 get Parent Node Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nancestors	TokenNameIdentifier	 nancestors
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ancestors	TokenNameIdentifier	 ancestors
=	TokenNameEQUAL	
new	TokenNamenew	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
[	TokenNameLBRACKET	
nancestors	TokenNameIdentifier	 nancestors
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nancestors	TokenNameIdentifier	 nancestors
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNodeEventTarget	TokenNameIdentifier	 get Parent Node Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ancestors	TokenNameIdentifier	 ancestors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ancestors	TokenNameIdentifier	 ancestors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this node target has an event listener for the * given event namespace URI and type. */	TokenNameCOMMENT_JAVADOC	 Returns whether this node target has an event listener for the given event namespace URI and type. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasEventListenerNS	TokenNameIdentifier	 has Event Listener NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
capturingListeners	TokenNameIdentifier	 capturing Listeners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventListenerList	TokenNameIdentifier	 Event Listener List
ell	TokenNameIdentifier	 ell
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListenerList	TokenNameIdentifier	 Event Listener List
)	TokenNameRPAREN	
capturingListeners	TokenNameIdentifier	 capturing Listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ell	TokenNameIdentifier	 ell
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ell	TokenNameIdentifier	 ell
.	TokenNameDOT	
hasEventListener	TokenNameIdentifier	 has Event Listener
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventListenerList	TokenNameIdentifier	 Event Listener List
ell	TokenNameIdentifier	 ell
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListenerList	TokenNameIdentifier	 Event Listener List
)	TokenNameRPAREN	
capturingListeners	TokenNameIdentifier	 capturing Listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ell	TokenNameIdentifier	 ell
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ell	TokenNameIdentifier	 ell
.	TokenNameDOT	
hasEventListener	TokenNameIdentifier	 has Event Listener
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a list event listeners depending on the specified event * type and phase. * @param type the event type * @param useCapture */	TokenNameCOMMENT_JAVADOC	 Returns a list event listeners depending on the specified event type and phase. @param type the event type @param useCapture 
public	TokenNamepublic	
EventListenerList	TokenNameIdentifier	 Event Listener List
getEventListeners	TokenNameIdentifier	 get Event Listeners
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCapture	TokenNameIdentifier	 use Capture
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashTable	TokenNameIdentifier	 Hash Table
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
useCapture	TokenNameIdentifier	 use Capture
?	TokenNameQUESTION	
capturingListeners	TokenNameIdentifier	 capturing Listeners
:	TokenNameCOLON	
bubblingListeners	TokenNameIdentifier	 bubbling Listeners
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
EventListenerList	TokenNameIdentifier	 Event Listener List
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an EventException. Overrides this method if you need to * create your own RangeException subclass. * @param code the exception code * @param key the resource key * @param args arguments to use when formatting the message */	TokenNameCOMMENT_JAVADOC	 Creates an EventException. Overrides this method if you need to create your own RangeException subclass. @param code the exception code @param key the resource key @param args arguments to use when formatting the message 
protected	TokenNameprotected	
EventException	TokenNameIdentifier	 Event Exception
createEventException	TokenNameIdentifier	 create Event Exception
(	TokenNameLPAREN	
short	TokenNameshort	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
EventException	TokenNameIdentifier	 Event Exception
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EventException	TokenNameIdentifier	 Event Exception
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Calls {@link AbstractEvent#setTarget}. */	TokenNameCOMMENT_JAVADOC	 Calls {@link AbstractEvent#setTarget}. 
protected	TokenNameprotected	
void	TokenNamevoid	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link AbstractEvent#stopPropagation(boolean)}. */	TokenNameCOMMENT_JAVADOC	 Calls {@link AbstractEvent#stopPropagation(boolean)}. 
protected	TokenNameprotected	
void	TokenNamevoid	
stopPropagation	TokenNameIdentifier	 stop Propagation
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
stopPropagation	TokenNameIdentifier	 stop Propagation
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link AbstractEvent#stopImmediatePropagation(boolean)}. */	TokenNameCOMMENT_JAVADOC	 Calls {@link AbstractEvent#stopImmediatePropagation(boolean)}. 
protected	TokenNameprotected	
void	TokenNamevoid	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
stopImmediatePropagation	TokenNameIdentifier	 stop Immediate Propagation
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link AbstractEvent#preventDefault(boolean)}. */	TokenNameCOMMENT_JAVADOC	 Calls {@link AbstractEvent#preventDefault(boolean)}. 
protected	TokenNameprotected	
void	TokenNamevoid	
preventDefault	TokenNameIdentifier	 prevent Default
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
preventDefault	TokenNameIdentifier	 prevent Default
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link AbstractEvent#setCurrentTarget}. */	TokenNameCOMMENT_JAVADOC	 Calls {@link AbstractEvent#setCurrentTarget}. 
protected	TokenNameprotected	
void	TokenNamevoid	
setCurrentTarget	TokenNameIdentifier	 set Current Target
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setCurrentTarget	TokenNameIdentifier	 set Current Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link AbstractEvent#setEventPhase}. */	TokenNameCOMMENT_JAVADOC	 Calls {@link AbstractEvent#setEventPhase}. 
protected	TokenNameprotected	
void	TokenNamevoid	
setEventPhase	TokenNameIdentifier	 set Event Phase
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
short	TokenNameshort	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setEventPhase	TokenNameIdentifier	 set Event Phase
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the ultimate original event for the given event. */	TokenNameCOMMENT_JAVADOC	 Returns the ultimate original event for the given event. 
public	TokenNamepublic	
static	TokenNamestatic	
Event	TokenNameIdentifier	 Event
getUltimateOriginalEvent	TokenNameIdentifier	 get Ultimate Original Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractEvent	TokenNameIdentifier	 Abstract Event
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractEvent	TokenNameIdentifier	 Abstract Event
origEvt	TokenNameIdentifier	 orig Evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractEvent	TokenNameIdentifier	 Abstract Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getOriginalEvent	TokenNameIdentifier	 get Original Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
origEvt	TokenNameIdentifier	 orig Evt
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
origEvt	TokenNameIdentifier	 orig Evt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
