/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
timing	TokenNameIdentifier	 timing
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
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
EventListener	TokenNameIdentifier	 Event Listener
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
/** * A class to handle eventbase SMIL timing specifiers. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: EventbaseTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class to handle eventbase SMIL timing specifiers. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: EventbaseTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
EventbaseTimingSpecifier	TokenNameIdentifier	 Eventbase Timing Specifier
extends	TokenNameextends	
EventLikeTimingSpecifier	TokenNameIdentifier	 Event Like Timing Specifier
implements	TokenNameimplements	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
/** * The ID of the eventbase element. */	TokenNameCOMMENT_JAVADOC	 The ID of the eventbase element. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
eventbaseID	TokenNameIdentifier	 eventbase ID
;	TokenNameSEMICOLON	
/** * The eventbase element. */	TokenNameCOMMENT_JAVADOC	 The eventbase element. 
protected	TokenNameprotected	
TimedElement	TokenNameIdentifier	 Timed Element
eventbase	TokenNameIdentifier	 eventbase
;	TokenNameSEMICOLON	
/** * The eventbase element as an {@link EventTarget}. */	TokenNameCOMMENT_JAVADOC	 The eventbase element as an {@link EventTarget}. 
protected	TokenNameprotected	
EventTarget	TokenNameIdentifier	 Event Target
eventTarget	TokenNameIdentifier	 event Target
;	TokenNameSEMICOLON	
/** * The namespace URI of the event to sync to. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of the event to sync to. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
eventNamespaceURI	TokenNameIdentifier	 event Namespace URI
;	TokenNameSEMICOLON	
/** * The type of the event to sync to. */	TokenNameCOMMENT_JAVADOC	 The type of the event to sync to. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
eventType	TokenNameIdentifier	 event Type
;	TokenNameSEMICOLON	
/** * The animation name of the event to sync to. */	TokenNameCOMMENT_JAVADOC	 The animation name of the event to sync to. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
eventName	TokenNameIdentifier	 event Name
;	TokenNameSEMICOLON	
/** * Creates a new EventbaseTimingSpecifier object. */	TokenNameCOMMENT_JAVADOC	 Creates a new EventbaseTimingSpecifier object. 
public	TokenNamepublic	
EventbaseTimingSpecifier	TokenNameIdentifier	 Eventbase Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
eventbaseID	TokenNameIdentifier	 eventbase ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
eventName	TokenNameIdentifier	 event Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eventbaseID	TokenNameIdentifier	 eventbase ID
=	TokenNameEQUAL	
eventbaseID	TokenNameIdentifier	 eventbase ID
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eventName	TokenNameIdentifier	 event Name
=	TokenNameEQUAL	
eventName	TokenNameIdentifier	 event Name
;	TokenNameSEMICOLON	
TimedDocumentRoot	TokenNameIdentifier	 Timed Document Root
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eventNamespaceURI	TokenNameIdentifier	 event Namespace URI
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getEventNamespaceURI	TokenNameIdentifier	 get Event Namespace URI
(	TokenNameLPAREN	
eventName	TokenNameIdentifier	 event Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eventType	TokenNameIdentifier	 event Type
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getEventType	TokenNameIdentifier	 get Event Type
(	TokenNameLPAREN	
eventName	TokenNameIdentifier	 event Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eventbaseID	TokenNameIdentifier	 eventbase ID
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
eventTarget	TokenNameIdentifier	 event Target
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getAnimationEventTarget	TokenNameIdentifier	 get Animation Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
eventTarget	TokenNameIdentifier	 event Target
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getEventTargetById	TokenNameIdentifier	 get Event Target By Id
(	TokenNameLPAREN	
eventbaseID	TokenNameIdentifier	 eventbase ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a string representation of this timing specifier. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this timing specifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
eventbaseID	TokenNameIdentifier	 eventbase ID
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
eventbaseID	TokenNameIdentifier	 eventbase ID
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
+	TokenNamePLUS	
eventName	TokenNameIdentifier	 event Name
+	TokenNamePLUS	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this timing specifier by adding the initial instance time * to the owner's instance time list or setting up any event listeners. */	TokenNameCOMMENT_JAVADOC	 Initializes this timing specifier by adding the initial instance time to the owner's instance time list or setting up any event listeners. 
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
)	TokenNameRPAREN	
eventTarget	TokenNameIdentifier	 event Target
)	TokenNameRPAREN	
.	TokenNameDOT	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
eventNamespaceURI	TokenNameIdentifier	 event Namespace URI
,	TokenNameCOMMA	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deinitializes this timing specifier by removing any event listeners. */	TokenNameCOMMENT_JAVADOC	 Deinitializes this timing specifier by removing any event listeners. 
public	TokenNamepublic	
void	TokenNamevoid	
deinitialize	TokenNameIdentifier	 deinitialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
)	TokenNameRPAREN	
eventTarget	TokenNameIdentifier	 event Target
)	TokenNameRPAREN	
.	TokenNameDOT	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
eventNamespaceURI	TokenNameIdentifier	 event Namespace URI
,	TokenNameCOMMA	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// EventListener ///////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	EventListener ///////////////////////////////////////////////////////// 
/** * Handles an event fired on the eventbase element. */	TokenNameCOMMENT_JAVADOC	 Handles an event fired on the eventbase element. 
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
eventOccurred	TokenNameIdentifier	 event Occurred
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked to resolve an event-like timing specifier into an instance time. */	TokenNameCOMMENT_JAVADOC	 Invoked to resolve an event-like timing specifier into an instance time. 
public	TokenNamepublic	
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
convertEpochTime	TokenNameIdentifier	 convert Epoch Time
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstanceTime	TokenNameIdentifier	 Instance Time
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceTime	TokenNameIdentifier	 Instance Time
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
addInstanceTime	TokenNameIdentifier	 add Instance Time
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
