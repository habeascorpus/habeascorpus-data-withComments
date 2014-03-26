/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
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
/** * EventImpl is an implementation of the basic "generic" DOM Level 2 Event * object. It may be subclassed by more specialized event sets. * Note that in our implementation, events are re-dispatchable (dispatch * clears the stopPropagation and preventDefault flags before it starts); * I believe that is the DOM's intent but I don't see an explicit statement * to this effect. * * @xerces.internal * * @version $Id: EventImpl.java 533533 2007-04-29 17:30:08Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 EventImpl is an implementation of the basic "generic" DOM Level 2 Event object. It may be subclassed by more specialized event sets. Note that in our implementation, events are re-dispatchable (dispatch clears the stopPropagation and preventDefault flags before it starts); I believe that is the DOM's intent but I don't see an explicit statement to this effect. * @xerces.internal * @version $Id: EventImpl.java 533533 2007-04-29 17:30:08Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
EventImpl	TokenNameIdentifier	 Event Impl
implements	TokenNameimplements	
Event	TokenNameIdentifier	 Event
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
currentTarget	TokenNameIdentifier	 current Target
;	TokenNameSEMICOLON	
public	TokenNamepublic	
short	TokenNameshort	
eventPhase	TokenNameIdentifier	 event Phase
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
initialized	TokenNameIdentifier	 initialized
=	TokenNameEQUAL	
false	TokenNamefalse	
,	TokenNameCOMMA	
bubbles	TokenNameIdentifier	 bubbles
=	TokenNameEQUAL	
true	TokenNametrue	
,	TokenNameCOMMA	
cancelable	TokenNameIdentifier	 cancelable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
stopPropagation	TokenNameIdentifier	 stop Propagation
=	TokenNameEQUAL	
false	TokenNamefalse	
,	TokenNameCOMMA	
preventDefault	TokenNameIdentifier	 prevent Default
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
/** * The DOM doesn't deal with constructors, so instead we have an * initializer call to set most of the read-only fields. The * others are set, and reset, by the event subsystem during dispatch. * <p> * Note that init() -- and the subclass-specific initWhatever() calls -- * may be reinvoked. At least one initialization is required; repeated * initializations overwrite the event with new values of their * parameters. */	TokenNameCOMMENT_JAVADOC	 The DOM doesn't deal with constructors, so instead we have an initializer call to set most of the read-only fields. The others are set, and reset, by the event subsystem during dispatch. <p> Note that init() -- and the subclass-specific initWhatever() calls -- may be reinvoked. At least one initialization is required; repeated initializations overwrite the event with new values of their parameters. 
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
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
eventTypeArg	TokenNameIdentifier	 event Type Arg
;	TokenNameSEMICOLON	
bubbles	TokenNameIdentifier	 bubbles
=	TokenNameEQUAL	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
;	TokenNameSEMICOLON	
cancelable	TokenNameIdentifier	 cancelable
=	TokenNameEQUAL	
cancelableArg	TokenNameIdentifier	 cancelable Arg
;	TokenNameSEMICOLON	
initialized	TokenNameIdentifier	 initialized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true iff this Event is of a class and type which supports * bubbling. In the generic case, this is True. */	TokenNameCOMMENT_JAVADOC	 @return true iff this Event is of a class and type which supports bubbling. In the generic case, this is True. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBubbles	TokenNameIdentifier	 get Bubbles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bubbles	TokenNameIdentifier	 bubbles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true iff this Event is of a class and type which (a) has a * Default Behavior in this DOM, and (b)allows cancellation (blocking) * of that behavior. In the generic case, this is False. */	TokenNameCOMMENT_JAVADOC	 @return true iff this Event is of a class and type which (a) has a Default Behavior in this DOM, and (b)allows cancellation (blocking) of that behavior. In the generic case, this is False. 
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
/** * @return the Node (EventTarget) whose EventListeners are currently * being processed. During capture and bubble phases, this may not be * the target node. */	TokenNameCOMMENT_JAVADOC	 @return the Node (EventTarget) whose EventListeners are currently being processed. During capture and bubble phases, this may not be the target node. 
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
/** * @return the current processing phase for this event -- * CAPTURING_PHASE, AT_TARGET, BUBBLING_PHASE. (There may be * an internal DEFAULT_PHASE as well, but the users won't see it.) */	TokenNameCOMMENT_JAVADOC	 @return the current processing phase for this event -- CAPTURING_PHASE, AT_TARGET, BUBBLING_PHASE. (There may be an internal DEFAULT_PHASE as well, but the users won't see it.) 
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
/** * @return the EventTarget (Node) to which the event was originally * dispatched. */	TokenNameCOMMENT_JAVADOC	 @return the EventTarget (Node) to which the event was originally dispatched. 
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
/** * @return event name as a string */	TokenNameCOMMENT_JAVADOC	 @return event name as a string 
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
/** * Causes exit from in-progress event dispatch before the next * currentTarget is selected. Replaces the preventBubble() and * preventCapture() methods which were present in early drafts; * they may be reintroduced in future levels of the DOM. */	TokenNameCOMMENT_JAVADOC	 Causes exit from in-progress event dispatch before the next currentTarget is selected. Replaces the preventBubble() and preventCapture() methods which were present in early drafts; they may be reintroduced in future levels of the DOM. 
public	TokenNamepublic	
void	TokenNamevoid	
stopPropagation	TokenNameIdentifier	 stop Propagation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stopPropagation	TokenNameIdentifier	 stop Propagation
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prevents any default processing built into the target node from * occurring. */	TokenNameCOMMENT_JAVADOC	 Prevents any default processing built into the target node from occurring. 
public	TokenNamepublic	
void	TokenNamevoid	
preventDefault	TokenNameIdentifier	 prevent Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
preventDefault	TokenNameIdentifier	 prevent Default
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
