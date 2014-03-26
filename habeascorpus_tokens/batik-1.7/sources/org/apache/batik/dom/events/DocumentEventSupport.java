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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Event	TokenNameIdentifier	 Event
;	TokenNameSEMICOLON	
/** * This class implements the behavior of DocumentEvent. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DocumentEventSupport.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the behavior of DocumentEvent. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DocumentEventSupport.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DocumentEventSupport	TokenNameIdentifier	 Document Event Support
{	TokenNameLBRACE	
/** * The Event type. */	TokenNameCOMMENT_JAVADOC	 The Event type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EVENT_TYPE	TokenNameIdentifier	 EVENT  TYPE
=	TokenNameEQUAL	
"Event"	TokenNameStringLiteral	Event
;	TokenNameSEMICOLON	
/** * The MutationEvent type. */	TokenNameCOMMENT_JAVADOC	 The MutationEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MUTATION_EVENT_TYPE	TokenNameIdentifier	 MUTATION  EVENT  TYPE
=	TokenNameEQUAL	
"MutationEvent"	TokenNameStringLiteral	MutationEvent
;	TokenNameSEMICOLON	
/** * The MutationNameEvent type. */	TokenNameCOMMENT_JAVADOC	 The MutationNameEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MUTATION_NAME_EVENT_TYPE	TokenNameIdentifier	 MUTATION  NAME  EVENT  TYPE
=	TokenNameEQUAL	
"MutationNameEvent"	TokenNameStringLiteral	MutationNameEvent
;	TokenNameSEMICOLON	
/** * The MouseEvent type. */	TokenNameCOMMENT_JAVADOC	 The MouseEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MOUSE_EVENT_TYPE	TokenNameIdentifier	 MOUSE  EVENT  TYPE
=	TokenNameEQUAL	
"MouseEvent"	TokenNameStringLiteral	MouseEvent
;	TokenNameSEMICOLON	
/** * The UIEvent type. */	TokenNameCOMMENT_JAVADOC	 The UIEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UI_EVENT_TYPE	TokenNameIdentifier	 UI  EVENT  TYPE
=	TokenNameEQUAL	
"UIEvent"	TokenNameStringLiteral	UIEvent
;	TokenNameSEMICOLON	
/** * The KeyEvent type. */	TokenNameCOMMENT_JAVADOC	 The KeyEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEYBOARD_EVENT_TYPE	TokenNameIdentifier	 KEYBOARD  EVENT  TYPE
=	TokenNameEQUAL	
"KeyboardEvent"	TokenNameStringLiteral	KeyboardEvent
;	TokenNameSEMICOLON	
/** * The TextEvent type. */	TokenNameCOMMENT_JAVADOC	 The TextEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT_EVENT_TYPE	TokenNameIdentifier	 TEXT  EVENT  TYPE
=	TokenNameEQUAL	
"TextEvent"	TokenNameStringLiteral	TextEvent
;	TokenNameSEMICOLON	
/** * The CustomEvent type. */	TokenNameCOMMENT_JAVADOC	 The CustomEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CUSTOM_EVENT_TYPE	TokenNameIdentifier	 CUSTOM  EVENT  TYPE
=	TokenNameEQUAL	
"CustomEvent"	TokenNameStringLiteral	CustomEvent
;	TokenNameSEMICOLON	
/** * The Event type. */	TokenNameCOMMENT_JAVADOC	 The Event type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EVENT_DOM2_TYPE	TokenNameIdentifier	 EVENT  DO M2  TYPE
=	TokenNameEQUAL	
"Events"	TokenNameStringLiteral	Events
;	TokenNameSEMICOLON	
/** * The MutationEvent type. */	TokenNameCOMMENT_JAVADOC	 The MutationEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MUTATION_EVENT_DOM2_TYPE	TokenNameIdentifier	 MUTATION  EVENT  DO M2  TYPE
=	TokenNameEQUAL	
"MutationEvents"	TokenNameStringLiteral	MutationEvents
;	TokenNameSEMICOLON	
/** * The MouseEvent type. */	TokenNameCOMMENT_JAVADOC	 The MouseEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MOUSE_EVENT_DOM2_TYPE	TokenNameIdentifier	 MOUSE  EVENT  DO M2  TYPE
=	TokenNameEQUAL	
"MouseEvents"	TokenNameStringLiteral	MouseEvents
;	TokenNameSEMICOLON	
/** * The UIEvent type. */	TokenNameCOMMENT_JAVADOC	 The UIEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UI_EVENT_DOM2_TYPE	TokenNameIdentifier	 UI  EVENT  DO M2  TYPE
=	TokenNameEQUAL	
"UIEvents"	TokenNameStringLiteral	UIEvents
;	TokenNameSEMICOLON	
/** * The KeyEvent type. */	TokenNameCOMMENT_JAVADOC	 The KeyEvent type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_EVENT_DOM2_TYPE	TokenNameIdentifier	 KEY  EVENT  DO M2  TYPE
=	TokenNameEQUAL	
"KeyEvents"	TokenNameStringLiteral	KeyEvents
;	TokenNameSEMICOLON	
/** * The event factories table. */	TokenNameCOMMENT_JAVADOC	 The event factories table. 
protected	TokenNameprotected	
HashTable	TokenNameIdentifier	 Hash Table
eventFactories	TokenNameIdentifier	 event Factories
=	TokenNameEQUAL	
new	TokenNamenew	
HashTable	TokenNameIdentifier	 Hash Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
// DOM 3 event names: 	TokenNameCOMMENT_LINE	DOM 3 event names: 
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
EVENT_TYPE	TokenNameIdentifier	 EVENT  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SimpleEventFactory	TokenNameIdentifier	 Simple Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MUTATION_EVENT_TYPE	TokenNameIdentifier	 MUTATION  EVENT  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MutationEventFactory	TokenNameIdentifier	 Mutation Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MUTATION_NAME_EVENT_TYPE	TokenNameIdentifier	 MUTATION  NAME  EVENT  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MutationNameEventFactory	TokenNameIdentifier	 Mutation Name Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MOUSE_EVENT_TYPE	TokenNameIdentifier	 MOUSE  EVENT  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MouseEventFactory	TokenNameIdentifier	 Mouse Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
KEYBOARD_EVENT_TYPE	TokenNameIdentifier	 KEYBOARD  EVENT  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
KeyboardEventFactory	TokenNameIdentifier	 Keyboard Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
UI_EVENT_TYPE	TokenNameIdentifier	 UI  EVENT  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
UIEventFactory	TokenNameIdentifier	 UI Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
TEXT_EVENT_TYPE	TokenNameIdentifier	 TEXT  EVENT  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
TextEventFactory	TokenNameIdentifier	 Text Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CUSTOM_EVENT_TYPE	TokenNameIdentifier	 CUSTOM  EVENT  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CustomEventFactory	TokenNameIdentifier	 Custom Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// DOM 2 event names: 	TokenNameCOMMENT_LINE	DOM 2 event names: 
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
EVENT_DOM2_TYPE	TokenNameIdentifier	 EVENT  DO M2  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SimpleEventFactory	TokenNameIdentifier	 Simple Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MUTATION_EVENT_DOM2_TYPE	TokenNameIdentifier	 MUTATION  EVENT  DO M2  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MutationEventFactory	TokenNameIdentifier	 Mutation Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MOUSE_EVENT_DOM2_TYPE	TokenNameIdentifier	 MOUSE  EVENT  DO M2  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MouseEventFactory	TokenNameIdentifier	 Mouse Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
KEY_EVENT_DOM2_TYPE	TokenNameIdentifier	 KEY  EVENT  DO M2  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
KeyEventFactory	TokenNameIdentifier	 Key Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
UI_EVENT_DOM2_TYPE	TokenNameIdentifier	 UI  EVENT  DO M2  TYPE
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
UIEventFactory	TokenNameIdentifier	 UI Event Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new Event depending on the specified parameter. * * @param eventType The <code>eventType</code> parameter specifies the * type of <code>Event</code> interface to be created. If the * <code>Event</code> interface specified is supported by the * implementation this method will return a new <code>Event</code> of * the interface type requested. If the <code>Event</code> is to be * dispatched via the <code>dispatchEvent</code> method the * appropriate event init method must be called after creation in order * to initialize the <code>Event</code>'s values. As an example, a * user wishing to synthesize some kind of <code>UIEvent</code> would * call <code>createEvent</code> with the parameter "UIEvent". The * <code>initUIEvent</code> method could then be called on the newly * created <code>UIEvent</code> to set the specific type of UIEvent to * be dispatched and set its context information.The * <code>createEvent</code> method is used in creating * <code>Event</code>s when it is either inconvenient or unnecessary * for the user to create an <code>Event</code> themselves. In cases * where the implementation provided <code>Event</code> is * insufficient, users may supply their own <code>Event</code> * implementations for use with the <code>dispatchEvent</code> method. * * @return The newly created <code>Event</code> * * @exception DOMException * NOT_SUPPORTED_ERR: Raised if the implementation does not support the * type of <code>Event</code> interface requested */	TokenNameCOMMENT_JAVADOC	 Creates a new Event depending on the specified parameter. * @param eventType The <code>eventType</code> parameter specifies the type of <code>Event</code> interface to be created. If the <code>Event</code> interface specified is supported by the implementation this method will return a new <code>Event</code> of the interface type requested. If the <code>Event</code> is to be dispatched via the <code>dispatchEvent</code> method the appropriate event init method must be called after creation in order to initialize the <code>Event</code>'s values. As an example, a user wishing to synthesize some kind of <code>UIEvent</code> would call <code>createEvent</code> with the parameter "UIEvent". The <code>initUIEvent</code> method could then be called on the newly created <code>UIEvent</code> to set the specific type of UIEvent to be dispatched and set its context information.The <code>createEvent</code> method is used in creating <code>Event</code>s when it is either inconvenient or unnecessary for the user to create an <code>Event</code> themselves. In cases where the implementation provided <code>Event</code> is insufficient, users may supply their own <code>Event</code> implementations for use with the <code>dispatchEvent</code> method. * @return The newly created <code>Event</code> * @exception DOMException NOT_SUPPORTED_ERR: Raised if the implementation does not support the type of <code>Event</code> interface requested 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
EventFactory	TokenNameIdentifier	 Event Factory
ef	TokenNameIdentifier	 ef
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventFactory	TokenNameIdentifier	 Event Factory
)	TokenNameRPAREN	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
eventType	TokenNameIdentifier	 event Type
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ef	TokenNameIdentifier	 ef
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Bad event type: "	TokenNameStringLiteral	Bad event type: 
+	TokenNamePLUS	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ef	TokenNameIdentifier	 ef
.	TokenNameDOT	
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Registers a new EventFactory object. */	TokenNameCOMMENT_JAVADOC	 Registers a new EventFactory object. 
public	TokenNamepublic	
void	TokenNamevoid	
registerEventFactory	TokenNameIdentifier	 register Event Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
EventFactory	TokenNameIdentifier	 Event Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventFactories	TokenNameIdentifier	 event Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
eventType	TokenNameIdentifier	 event Type
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This interface represents an event factory. */	TokenNameCOMMENT_JAVADOC	 This interface represents an event factory. 
public	TokenNamepublic	
interface	TokenNameinterface	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To create a simple event. */	TokenNameCOMMENT_JAVADOC	 To create a simple event. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
SimpleEventFactory	TokenNameIdentifier	 Simple Event Factory
implements	TokenNameimplements	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMEvent	TokenNameIdentifier	 DOM Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a mutation event. */	TokenNameCOMMENT_JAVADOC	 To create a mutation event. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
MutationEventFactory	TokenNameIdentifier	 Mutation Event Factory
implements	TokenNameimplements	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a mutation name event. */	TokenNameCOMMENT_JAVADOC	 To create a mutation name event. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
MutationNameEventFactory	TokenNameIdentifier	 Mutation Name Event Factory
implements	TokenNameimplements	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMMutationNameEvent	TokenNameIdentifier	 DOM Mutation Name Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a mouse event. */	TokenNameCOMMENT_JAVADOC	 To create a mouse event. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
MouseEventFactory	TokenNameIdentifier	 Mouse Event Factory
implements	TokenNameimplements	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMMouseEvent	TokenNameIdentifier	 DOM Mouse Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a key event. */	TokenNameCOMMENT_JAVADOC	 To create a key event. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
KeyEventFactory	TokenNameIdentifier	 Key Event Factory
implements	TokenNameimplements	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMKeyEvent	TokenNameIdentifier	 DOM Key Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a keyboard event. */	TokenNameCOMMENT_JAVADOC	 To create a keyboard event. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
KeyboardEventFactory	TokenNameIdentifier	 Keyboard Event Factory
implements	TokenNameimplements	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a UI event. */	TokenNameCOMMENT_JAVADOC	 To create a UI event. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
UIEventFactory	TokenNameIdentifier	 UI Event Factory
implements	TokenNameimplements	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a Text event. */	TokenNameCOMMENT_JAVADOC	 To create a Text event. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
TextEventFactory	TokenNameIdentifier	 Text Event Factory
implements	TokenNameimplements	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMTextEvent	TokenNameIdentifier	 DOM Text Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a Custom event. */	TokenNameCOMMENT_JAVADOC	 To create a Custom event. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
CustomEventFactory	TokenNameIdentifier	 Custom Event Factory
implements	TokenNameimplements	
EventFactory	TokenNameIdentifier	 Event Factory
{	TokenNameLBRACE	
/** * Creates a new Event object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Event object. 
public	TokenNamepublic	
Event	TokenNameIdentifier	 Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMCustomEvent	TokenNameIdentifier	 DOM Custom Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
