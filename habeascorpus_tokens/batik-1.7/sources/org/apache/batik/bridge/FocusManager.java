/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
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
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
DocumentEvent	TokenNameIdentifier	 Document Event
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
MouseEvent	TokenNameIdentifier	 Mouse Event
;	TokenNameSEMICOLON	
/** * A class that manages focus on elements. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: FocusManager.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class that manages focus on elements. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: FocusManager.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
FocusManager	TokenNameIdentifier	 Focus Manager
{	TokenNameLBRACE	
/** * The element that has the focus so far. */	TokenNameCOMMENT_JAVADOC	 The element that has the focus so far. 
protected	TokenNameprotected	
EventTarget	TokenNameIdentifier	 Event Target
lastFocusEventTarget	TokenNameIdentifier	 last Focus Event Target
;	TokenNameSEMICOLON	
/** * The document. */	TokenNameCOMMENT_JAVADOC	 The document. 
protected	TokenNameprotected	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * The EventListener that tracks 'mouseclick' events. */	TokenNameCOMMENT_JAVADOC	 The EventListener that tracks 'mouseclick' events. 
protected	TokenNameprotected	
EventListener	TokenNameIdentifier	 Event Listener
mouseclickListener	TokenNameIdentifier	 mouseclick Listener
;	TokenNameSEMICOLON	
/** * The EventListener that tracks 'DOMFocusIn' events. */	TokenNameCOMMENT_JAVADOC	 The EventListener that tracks 'DOMFocusIn' events. 
protected	TokenNameprotected	
EventListener	TokenNameIdentifier	 Event Listener
domFocusInListener	TokenNameIdentifier	 dom Focus In Listener
;	TokenNameSEMICOLON	
/** * The EventListener that tracks 'DOMFocusOut' events. */	TokenNameCOMMENT_JAVADOC	 The EventListener that tracks 'DOMFocusOut' events. 
protected	TokenNameprotected	
EventListener	TokenNameIdentifier	 Event Listener
domFocusOutListener	TokenNameIdentifier	 dom Focus Out Listener
;	TokenNameSEMICOLON	
/** * The EventListener that tracks 'mouseover' events. */	TokenNameCOMMENT_JAVADOC	 The EventListener that tracks 'mouseover' events. 
protected	TokenNameprotected	
EventListener	TokenNameIdentifier	 Event Listener
mouseoverListener	TokenNameIdentifier	 mouseover Listener
;	TokenNameSEMICOLON	
/** * The EventListener that tracks 'mouseout' events. */	TokenNameCOMMENT_JAVADOC	 The EventListener that tracks 'mouseout' events. 
protected	TokenNameprotected	
EventListener	TokenNameIdentifier	 Event Listener
mouseoutListener	TokenNameIdentifier	 mouseout Listener
;	TokenNameSEMICOLON	
/** * Constructs a new <tt>FocusManager</tt> for the specified document. * * @param doc the document */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>FocusManager</tt> for the specified document. * @param doc the document 
public	TokenNamepublic	
FocusManager	TokenNameIdentifier	 Focus Manager
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
addEventListeners	TokenNameIdentifier	 add Event Listeners
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the event listeners to the document. */	TokenNameCOMMENT_JAVADOC	 Adds the event listeners to the document. 
protected	TokenNameprotected	
void	TokenNamevoid	
addEventListeners	TokenNameIdentifier	 add Event Listeners
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
mouseclickListener	TokenNameIdentifier	 mouseclick Listener
=	TokenNameEQUAL	
new	TokenNamenew	
MouseClickTracker	TokenNameIdentifier	 Mouse Click Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"click"	TokenNameStringLiteral	click
,	TokenNameCOMMA	
mouseclickListener	TokenNameIdentifier	 mouseclick Listener
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mouseoverListener	TokenNameIdentifier	 mouseover Listener
=	TokenNameEQUAL	
new	TokenNamenew	
MouseOverTracker	TokenNameIdentifier	 Mouse Over Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"mouseover"	TokenNameStringLiteral	mouseover
,	TokenNameCOMMA	
mouseoverListener	TokenNameIdentifier	 mouseover Listener
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mouseoutListener	TokenNameIdentifier	 mouseout Listener
=	TokenNameEQUAL	
new	TokenNamenew	
MouseOutTracker	TokenNameIdentifier	 Mouse Out Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"mouseout"	TokenNameStringLiteral	mouseout
,	TokenNameCOMMA	
mouseoutListener	TokenNameIdentifier	 mouseout Listener
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
domFocusInListener	TokenNameIdentifier	 dom Focus In Listener
=	TokenNameEQUAL	
new	TokenNamenew	
DOMFocusInTracker	TokenNameIdentifier	 DOM Focus In Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMFocusIn"	TokenNameStringLiteral	DOMFocusIn
,	TokenNameCOMMA	
domFocusInListener	TokenNameIdentifier	 dom Focus In Listener
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
domFocusOutListener	TokenNameIdentifier	 dom Focus Out Listener
=	TokenNameEQUAL	
new	TokenNamenew	
DOMFocusOutTracker	TokenNameIdentifier	 DOM Focus Out Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMFocusOut"	TokenNameStringLiteral	DOMFocusOut
,	TokenNameCOMMA	
domFocusOutListener	TokenNameIdentifier	 dom Focus Out Listener
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the event listeners from the document. */	TokenNameCOMMENT_JAVADOC	 Removes the event listeners from the document. 
protected	TokenNameprotected	
void	TokenNamevoid	
removeEventListeners	TokenNameIdentifier	 remove Event Listeners
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"click"	TokenNameStringLiteral	click
,	TokenNameCOMMA	
mouseclickListener	TokenNameIdentifier	 mouseclick Listener
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"mouseover"	TokenNameStringLiteral	mouseover
,	TokenNameCOMMA	
mouseoverListener	TokenNameIdentifier	 mouseover Listener
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"mouseout"	TokenNameStringLiteral	mouseout
,	TokenNameCOMMA	
mouseoutListener	TokenNameIdentifier	 mouseout Listener
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMFocusIn"	TokenNameStringLiteral	DOMFocusIn
,	TokenNameCOMMA	
domFocusInListener	TokenNameIdentifier	 dom Focus In Listener
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMFocusOut"	TokenNameStringLiteral	DOMFocusOut
,	TokenNameCOMMA	
domFocusOutListener	TokenNameIdentifier	 dom Focus Out Listener
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current element that has the focus or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the current element that has the focus or null if any. 
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
getCurrentEventTarget	TokenNameIdentifier	 get Current Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastFocusEventTarget	TokenNameIdentifier	 last Focus Event Target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes all listeners attached to the document and that manage focus. */	TokenNameCOMMENT_JAVADOC	 Removes all listeners attached to the document and that manage focus. 
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
removeEventListeners	TokenNameIdentifier	 remove Event Listeners
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastFocusEventTarget	TokenNameIdentifier	 last Focus Event Target
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The class that is responsible for tracking 'mouseclick' changes. */	TokenNameCOMMENT_JAVADOC	 The class that is responsible for tracking 'mouseclick' changes. 
protected	TokenNameprotected	
class	TokenNameclass	
MouseClickTracker	TokenNameIdentifier	 Mouse Click Tracker
implements	TokenNameimplements	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MouseEvent	TokenNameIdentifier	 Mouse Event
mevt	TokenNameIdentifier	 mevt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
fireDOMActivateEvent	TokenNameIdentifier	 fire DOM Activate Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mevt	TokenNameIdentifier	 mevt
.	TokenNameDOT	
getDetail	TokenNameIdentifier	 get Detail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The class that is responsible for tracking 'DOMFocusIn' changes. */	TokenNameCOMMENT_JAVADOC	 The class that is responsible for tracking 'DOMFocusIn' changes. 
protected	TokenNameprotected	
class	TokenNameclass	
DOMFocusInTracker	TokenNameIdentifier	 DOM Focus In Tracker
implements	TokenNameimplements	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventTarget	TokenNameIdentifier	 Event Target
newTarget	TokenNameIdentifier	 new Target
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastFocusEventTarget	TokenNameIdentifier	 last Focus Event Target
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
lastFocusEventTarget	TokenNameIdentifier	 last Focus Event Target
!=	TokenNameNOT_EQUAL	
newTarget	TokenNameIdentifier	 new Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireDOMFocusOutEvent	TokenNameIdentifier	 fire DOM Focus Out Event
(	TokenNameLPAREN	
lastFocusEventTarget	TokenNameIdentifier	 last Focus Event Target
,	TokenNameCOMMA	
newTarget	TokenNameIdentifier	 new Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastFocusEventTarget	TokenNameIdentifier	 last Focus Event Target
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The class that is responsible for tracking 'DOMFocusOut' changes. */	TokenNameCOMMENT_JAVADOC	 The class that is responsible for tracking 'DOMFocusOut' changes. 
protected	TokenNameprotected	
class	TokenNameclass	
DOMFocusOutTracker	TokenNameIdentifier	 DOM Focus Out Tracker
implements	TokenNameimplements	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
DOMFocusOutTracker	TokenNameIdentifier	 DOM Focus Out Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastFocusEventTarget	TokenNameIdentifier	 last Focus Event Target
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The class that is responsible to update the focus according to * 'mouseover' event. */	TokenNameCOMMENT_JAVADOC	 The class that is responsible to update the focus according to 'mouseover' event. 
protected	TokenNameprotected	
class	TokenNameclass	
MouseOverTracker	TokenNameIdentifier	 Mouse Over Tracker
implements	TokenNameimplements	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MouseEvent	TokenNameIdentifier	 Mouse Event
me	TokenNameIdentifier	 me
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EventTarget	TokenNameIdentifier	 Event Target
relatedTarget	TokenNameIdentifier	 related Target
=	TokenNameEQUAL	
me	TokenNameIdentifier	 me
.	TokenNameDOT	
getRelatedTarget	TokenNameIdentifier	 get Related Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireDOMFocusInEvent	TokenNameIdentifier	 fire DOM Focus In Event
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
relatedTarget	TokenNameIdentifier	 related Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The class that is responsible to update the focus according to * 'mouseout' event. */	TokenNameCOMMENT_JAVADOC	 The class that is responsible to update the focus according to 'mouseout' event. 
protected	TokenNameprotected	
class	TokenNameclass	
MouseOutTracker	TokenNameIdentifier	 Mouse Out Tracker
implements	TokenNameimplements	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MouseEvent	TokenNameIdentifier	 Mouse Event
me	TokenNameIdentifier	 me
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EventTarget	TokenNameIdentifier	 Event Target
relatedTarget	TokenNameIdentifier	 related Target
=	TokenNameEQUAL	
me	TokenNameIdentifier	 me
.	TokenNameDOT	
getRelatedTarget	TokenNameIdentifier	 get Related Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireDOMFocusOutEvent	TokenNameIdentifier	 fire DOM Focus Out Event
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
relatedTarget	TokenNameIdentifier	 related Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires a 'DOMFocusIn' event to the specified target. * * @param target the newly focussed event target * @param relatedTarget the previously focussed event target */	TokenNameCOMMENT_JAVADOC	 Fires a 'DOMFocusIn' event to the specified target. * @param target the newly focussed event target @param relatedTarget the previously focussed event target 
protected	TokenNameprotected	
void	TokenNamevoid	
fireDOMFocusInEvent	TokenNameIdentifier	 fire DOM Focus In Event
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
EventTarget	TokenNameIdentifier	 Event Target
relatedTarget	TokenNameIdentifier	 related Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentEvent	TokenNameIdentifier	 Document Event
docEvt	TokenNameIdentifier	 doc Evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
uiEvt	TokenNameIdentifier	 ui Evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
)	TokenNameRPAREN	
docEvt	TokenNameIdentifier	 doc Evt
.	TokenNameDOT	
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
"UIEvents"	TokenNameStringLiteral	UIEvents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uiEvt	TokenNameIdentifier	 ui Evt
.	TokenNameDOT	
initUIEventNS	TokenNameIdentifier	 init UI Event NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMFocusIn"	TokenNameStringLiteral	DOMFocusIn
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
// canBubbleArg 	TokenNameCOMMENT_LINE	canBubbleArg 
false	TokenNamefalse	
,	TokenNameCOMMA	
// cancelableArg 	TokenNameCOMMENT_LINE	cancelableArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// viewArg 	TokenNameCOMMENT_LINE	viewArg 
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// detailArg 	TokenNameCOMMENT_LINE	detailArg 
target	TokenNameIdentifier	 target
.	TokenNameDOT	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
uiEvt	TokenNameIdentifier	 ui Evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fires a 'DOMFocusOut' event to the specified target. * * @param target the previously focussed event target * @param relatedTarget the newly focussed event target */	TokenNameCOMMENT_JAVADOC	 Fires a 'DOMFocusOut' event to the specified target. * @param target the previously focussed event target @param relatedTarget the newly focussed event target 
protected	TokenNameprotected	
void	TokenNamevoid	
fireDOMFocusOutEvent	TokenNameIdentifier	 fire DOM Focus Out Event
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
EventTarget	TokenNameIdentifier	 Event Target
relatedTarget	TokenNameIdentifier	 related Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentEvent	TokenNameIdentifier	 Document Event
docEvt	TokenNameIdentifier	 doc Evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
uiEvt	TokenNameIdentifier	 ui Evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
)	TokenNameRPAREN	
docEvt	TokenNameIdentifier	 doc Evt
.	TokenNameDOT	
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
"UIEvents"	TokenNameStringLiteral	UIEvents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uiEvt	TokenNameIdentifier	 ui Evt
.	TokenNameDOT	
initUIEventNS	TokenNameIdentifier	 init UI Event NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMFocusOut"	TokenNameStringLiteral	DOMFocusOut
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
// canBubbleArg 	TokenNameCOMMENT_LINE	canBubbleArg 
false	TokenNamefalse	
,	TokenNameCOMMA	
// cancelableArg 	TokenNameCOMMENT_LINE	cancelableArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// viewArg 	TokenNameCOMMENT_LINE	viewArg 
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// detailArg 	TokenNameCOMMENT_LINE	detailArg 
target	TokenNameIdentifier	 target
.	TokenNameDOT	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
uiEvt	TokenNameIdentifier	 ui Evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fires a 'DOMActivate' event to the specified target. * * @param target the event target * @param detailArg the detailArg parameter of the event */	TokenNameCOMMENT_JAVADOC	 Fires a 'DOMActivate' event to the specified target. * @param target the event target @param detailArg the detailArg parameter of the event 
protected	TokenNameprotected	
void	TokenNamevoid	
fireDOMActivateEvent	TokenNameIdentifier	 fire DOM Activate Event
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
detailArg	TokenNameIdentifier	 detail Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentEvent	TokenNameIdentifier	 Document Event
docEvt	TokenNameIdentifier	 doc Evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
uiEvt	TokenNameIdentifier	 ui Evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
)	TokenNameRPAREN	
docEvt	TokenNameIdentifier	 doc Evt
.	TokenNameDOT	
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
"UIEvents"	TokenNameStringLiteral	UIEvents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uiEvt	TokenNameIdentifier	 ui Evt
.	TokenNameDOT	
initUIEventNS	TokenNameIdentifier	 init UI Event NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMActivate"	TokenNameStringLiteral	DOMActivate
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
// canBubbleArg 	TokenNameCOMMENT_LINE	canBubbleArg 
true	TokenNametrue	
,	TokenNameCOMMA	
// cancelableArg 	TokenNameCOMMENT_LINE	cancelableArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// viewArg 	TokenNameCOMMENT_LINE	viewArg 
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// detailArg 	TokenNameCOMMENT_LINE	detailArg 
target	TokenNameIdentifier	 target
.	TokenNameDOT	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
uiEvt	TokenNameIdentifier	 ui Evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
