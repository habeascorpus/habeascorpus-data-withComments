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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationException	TokenNameIdentifier	 Animation Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
i18n	TokenNameIdentifier	 i18n
.	TokenNameDOT	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ClockHandler	TokenNameIdentifier	 Clock Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ClockParser	TokenNameIdentifier	 Clock Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
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
SMILConstants	TokenNameIdentifier	 SMIL Constants
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
/** * An abstract base class for elements that can have timing applied to them. * The concrete versions of this class do not necessarily have to be the * same as the DOM class, and in fact, this will mostly be impossible unless * creating new DOM classes that inherit from these elements. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TimedElement.java 592593 2007-11-07 00:44:30Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract base class for elements that can have timing applied to them. The concrete versions of this class do not necessarily have to be the same as the DOM class, and in fact, this will mostly be impossible unless creating new DOM classes that inherit from these elements. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TimedElement.java 592593 2007-11-07 00:44:30Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TimedElement	TokenNameIdentifier	 Timed Element
implements	TokenNameimplements	
SMILConstants	TokenNameIdentifier	 SMIL Constants
{	TokenNameLBRACE	
// Constants for fill mode. 	TokenNameCOMMENT_LINE	Constants for fill mode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FILL_REMOVE	TokenNameIdentifier	 FILL  REMOVE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FILL_FREEZE	TokenNameIdentifier	 FILL  FREEZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Constants for restart mode. 	TokenNameCOMMENT_LINE	Constants for restart mode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RESTART_ALWAYS	TokenNameIdentifier	 RESTART  ALWAYS
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RESTART_WHEN_NOT_ACTIVE	TokenNameIdentifier	 RESTART  WHEN  NOT  ACTIVE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RESTART_NEVER	TokenNameIdentifier	 RESTART  NEVER
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Constants for time values. 	TokenNameCOMMENT_LINE	Constants for time values. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
/** * The root time container. */	TokenNameCOMMENT_JAVADOC	 The root time container. 
protected	TokenNameprotected	
TimedDocumentRoot	TokenNameIdentifier	 Timed Document Root
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
/** * The parent time container. */	TokenNameCOMMENT_JAVADOC	 The parent time container. 
protected	TokenNameprotected	
TimeContainer	TokenNameIdentifier	 Time Container
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
/** * Timing specifiers for the begin times of this element. */	TokenNameCOMMENT_JAVADOC	 Timing specifiers for the begin times of this element. 
protected	TokenNameprotected	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
beginTimes	TokenNameIdentifier	 begin Times
;	TokenNameSEMICOLON	
/** * Timing specifiers for the end times of this element. */	TokenNameCOMMENT_JAVADOC	 Timing specifiers for the end times of this element. 
protected	TokenNameprotected	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
endTimes	TokenNameIdentifier	 end Times
;	TokenNameSEMICOLON	
/** * Duration of this element, if {@link #durMedia} <code>= false</code>. * If unspecified, it will be {@link #UNRESOLVED}. */	TokenNameCOMMENT_JAVADOC	 Duration of this element, if {@link #durMedia} <code>= false</code>. If unspecified, it will be {@link #UNRESOLVED}. 
protected	TokenNameprotected	
float	TokenNamefloat	
simpleDur	TokenNameIdentifier	 simple Dur
;	TokenNameSEMICOLON	
/** * Whether the simple duration of this element should be equal * to the implicit duration. */	TokenNameCOMMENT_JAVADOC	 Whether the simple duration of this element should be equal to the implicit duration. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
durMedia	TokenNameIdentifier	 dur Media
;	TokenNameSEMICOLON	
/** * The number of repeats. If unspecified, it will be * {@link #UNRESOLVED}. */	TokenNameCOMMENT_JAVADOC	 The number of repeats. If unspecified, it will be {@link #UNRESOLVED}. 
protected	TokenNameprotected	
float	TokenNamefloat	
repeatCount	TokenNameIdentifier	 repeat Count
;	TokenNameSEMICOLON	
/** * The duration of repeats. If unspecified, it will be * {@link #UNRESOLVED}. */	TokenNameCOMMENT_JAVADOC	 The duration of repeats. If unspecified, it will be {@link #UNRESOLVED}. 
protected	TokenNameprotected	
float	TokenNamefloat	
repeatDur	TokenNameIdentifier	 repeat Dur
;	TokenNameSEMICOLON	
/** * The current repeat iteration. */	TokenNameCOMMENT_JAVADOC	 The current repeat iteration. 
protected	TokenNameprotected	
int	TokenNameint	
currentRepeatIteration	TokenNameIdentifier	 current Repeat Iteration
;	TokenNameSEMICOLON	
/** * The local active time of the last repeat. */	TokenNameCOMMENT_JAVADOC	 The local active time of the last repeat. 
protected	TokenNameprotected	
float	TokenNamefloat	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
;	TokenNameSEMICOLON	
/** * The fill mode for this element. Uses the FILL_* constants * defined in this class. */	TokenNameCOMMENT_JAVADOC	 The fill mode for this element. Uses the FILL_* constants defined in this class. 
protected	TokenNameprotected	
int	TokenNameint	
fillMode	TokenNameIdentifier	 fill Mode
;	TokenNameSEMICOLON	
/** * The restart mode for this element. Uses the RESTART_* constants * defined in this class. */	TokenNameCOMMENT_JAVADOC	 The restart mode for this element. Uses the RESTART_* constants defined in this class. 
protected	TokenNameprotected	
int	TokenNameint	
restartMode	TokenNameIdentifier	 restart Mode
;	TokenNameSEMICOLON	
/** * The minimum active duration of this element. If {@link #minMedia} * <code>= true</code>, it will be <code>0f</code>. */	TokenNameCOMMENT_JAVADOC	 The minimum active duration of this element. If {@link #minMedia} <code>= true</code>, it will be <code>0f</code>. 
protected	TokenNameprotected	
float	TokenNamefloat	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
/** * Whether the min value was specified as 'media'. */	TokenNameCOMMENT_JAVADOC	 Whether the min value was specified as 'media'. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
minMedia	TokenNameIdentifier	 min Media
;	TokenNameSEMICOLON	
/** * The maximum active duration of this element. If {@link #maxMedia} * <code>= true</code>, it will be {@link #INDEFINITE}. */	TokenNameCOMMENT_JAVADOC	 The maximum active duration of this element. If {@link #maxMedia} <code>= true</code>, it will be {@link #INDEFINITE}. 
protected	TokenNameprotected	
float	TokenNamefloat	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
/** * Whether the max value was specified as 'media'. */	TokenNameCOMMENT_JAVADOC	 Whether the max value was specified as 'media'. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
maxMedia	TokenNameIdentifier	 max Media
;	TokenNameSEMICOLON	
/** * Whether the element is currently active. */	TokenNameCOMMENT_JAVADOC	 Whether the element is currently active. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isActive	TokenNameIdentifier	 is Active
;	TokenNameSEMICOLON	
/** * Whether the element is currently frozen. */	TokenNameCOMMENT_JAVADOC	 Whether the element is currently frozen. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isFrozen	TokenNameIdentifier	 is Frozen
;	TokenNameSEMICOLON	
/** * The current time of this element in local active time. */	TokenNameCOMMENT_JAVADOC	 The current time of this element in local active time. 
protected	TokenNameprotected	
float	TokenNamefloat	
lastSampleTime	TokenNameIdentifier	 last Sample Time
;	TokenNameSEMICOLON	
/** * The computed repeat duration of the element. */	TokenNameCOMMENT_JAVADOC	 The computed repeat duration of the element. 
protected	TokenNameprotected	
float	TokenNamefloat	
repeatDuration	TokenNameIdentifier	 repeat Duration
;	TokenNameSEMICOLON	
/** * List of begin InstanceTimes. */	TokenNameCOMMENT_JAVADOC	 List of begin InstanceTimes. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
beginInstanceTimes	TokenNameIdentifier	 begin Instance Times
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * List of end InstanceTimes. */	TokenNameCOMMENT_JAVADOC	 List of end InstanceTimes. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
endInstanceTimes	TokenNameIdentifier	 end Instance Times
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The current Interval. */	TokenNameCOMMENT_JAVADOC	 The current Interval. 
protected	TokenNameprotected	
Interval	TokenNameIdentifier	 Interval
currentInterval	TokenNameIdentifier	 current Interval
;	TokenNameSEMICOLON	
/** * The end time of the previous interval, initially * {@link Float#NEGATIVE_INFINITY}. */	TokenNameCOMMENT_JAVADOC	 The end time of the previous interval, initially {@link Float#NEGATIVE_INFINITY}. 
protected	TokenNameprotected	
float	TokenNamefloat	
lastIntervalEnd	TokenNameIdentifier	 last Interval End
;	TokenNameSEMICOLON	
/** * List of previous intervals. */	TokenNameCOMMENT_JAVADOC	 List of previous intervals. 
// protected LinkedList previousIntervals = new LinkedList(); 	TokenNameCOMMENT_LINE	protected LinkedList previousIntervals = new LinkedList(); 
/** * The previous interval. */	TokenNameCOMMENT_JAVADOC	 The previous interval. 
protected	TokenNameprotected	
Interval	TokenNameIdentifier	 Interval
previousInterval	TokenNameIdentifier	 previous Interval
;	TokenNameSEMICOLON	
/** * List of TimingSpecifiers on other elements that depend on this * element's begin times. */	TokenNameCOMMENT_JAVADOC	 List of TimingSpecifiers on other elements that depend on this element's begin times. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
beginDependents	TokenNameIdentifier	 begin Dependents
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * List of TimingSpecifiers on other elements that depend on this * element's end times. */	TokenNameCOMMENT_JAVADOC	 List of TimingSpecifiers on other elements that depend on this element's end times. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
endDependents	TokenNameIdentifier	 end Dependents
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the list of instance times should be checked to update * the current interval. */	TokenNameCOMMENT_JAVADOC	 Whether the list of instance times should be checked to update the current interval. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldUpdateCurrentInterval	TokenNameIdentifier	 should Update Current Interval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Whether this timed element has parsed its timing attributes yet. */	TokenNameCOMMENT_JAVADOC	 Whether this timed element has parsed its timing attributes yet. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasParsed	TokenNameIdentifier	 has Parsed
;	TokenNameSEMICOLON	
/** * Map of {@link Event} objects to {@link HashSet}s of {@link * TimingSpecifier}s that caught them. */	TokenNameCOMMENT_JAVADOC	 Map of {@link Event} objects to {@link HashSet}s of {@link TimingSpecifier}s that caught them. 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
handledEvents	TokenNameIdentifier	 handled Events
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether this timed element is currently being sampled. */	TokenNameCOMMENT_JAVADOC	 Whether this timed element is currently being sampled. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isSampling	TokenNameIdentifier	 is Sampling
;	TokenNameSEMICOLON	
/** * Whether an instance time update message has already been propagated to * this timed element. */	TokenNameCOMMENT_JAVADOC	 Whether an instance time update message has already been propagated to this timed element. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasPropagated	TokenNameIdentifier	 has Propagated
;	TokenNameSEMICOLON	
/** * Creates a new TimedElement. */	TokenNameCOMMENT_JAVADOC	 Creates a new TimedElement. 
public	TokenNamepublic	
TimedElement	TokenNameIdentifier	 Timed Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginTimes	TokenNameIdentifier	 begin Times
=	TokenNameEQUAL	
new	TokenNamenew	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
endTimes	TokenNameIdentifier	 end Times
=	TokenNameEQUAL	
beginTimes	TokenNameIdentifier	 begin Times
;	TokenNameSEMICOLON	
simpleDur	TokenNameIdentifier	 simple Dur
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
repeatCount	TokenNameIdentifier	 repeat Count
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
repeatDur	TokenNameIdentifier	 repeat Dur
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
lastSampleTime	TokenNameIdentifier	 last Sample Time
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
lastIntervalEnd	TokenNameIdentifier	 last Interval End
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the root time container of this timed element. */	TokenNameCOMMENT_JAVADOC	 Returns the root time container of this timed element. 
public	TokenNamepublic	
TimedDocumentRoot	TokenNameIdentifier	 Timed Document Root
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current active time of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the current active time of this element. 
public	TokenNamepublic	
float	TokenNamefloat	
getActiveTime	TokenNameIdentifier	 get Active Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastSampleTime	TokenNameIdentifier	 last Sample Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current simple time of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the current simple time of this element. 
public	TokenNamepublic	
float	TokenNamefloat	
getSimpleTime	TokenNameIdentifier	 get Simple Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastSampleTime	TokenNameIdentifier	 last Sample Time
-	TokenNameMINUS	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by a TimingSpecifier of this element when a new * InstanceTime is created. This will be in response to an event * firing, a DOM method being called or a new Instance being * created by a syncbase element. */	TokenNameCOMMENT_JAVADOC	 Called by a TimingSpecifier of this element when a new InstanceTime is created. This will be in response to an event firing, a DOM method being called or a new Instance being created by a syncbase element. 
protected	TokenNameprotected	
float	TokenNamefloat	
addInstanceTime	TokenNameIdentifier	 add Instance Time
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "addInstanceTime", new Object[] { time, new Boolean(isBegin) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "addInstanceTime", new Object[] { time, new Boolean(isBegin) } ); try { 
hasPropagated	TokenNameIdentifier	 has Propagated
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
instanceTimes	TokenNameIdentifier	 instance Times
=	TokenNameEQUAL	
isBegin	TokenNameIdentifier	 is Begin
?	TokenNameQUESTION	
beginInstanceTimes	TokenNameIdentifier	 begin Instance Times
:	TokenNameCOLON	
endInstanceTimes	TokenNameIdentifier	 end Instance Times
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
instanceTimes	TokenNameIdentifier	 instance Times
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
instanceTimes	TokenNameIdentifier	 instance Times
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shouldUpdateCurrentInterval	TokenNameIdentifier	 should Update Current Interval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
isSampling	TokenNameIdentifier	 is Sampling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isSampling	TokenNameIdentifier	 is Sampling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
sampleAt	TokenNameIdentifier	 sample At
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
isHyperlinking	TokenNameIdentifier	 is Hyperlinking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasPropagated	TokenNameIdentifier	 has Propagated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
currentIntervalWillUpdate	TokenNameIdentifier	 current Interval Will Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Called by a TimingSpecifier of this element when an InstanceTime * should be removed. This will be in response to the pruning of an * Interval. */	TokenNameCOMMENT_JAVADOC	 Called by a TimingSpecifier of this element when an InstanceTime should be removed. This will be in response to the pruning of an Interval. 
protected	TokenNameprotected	
float	TokenNamefloat	
removeInstanceTime	TokenNameIdentifier	 remove Instance Time
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "removeInstanceTime", new Object[] { time, new Boolean(isBegin) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "removeInstanceTime", new Object[] { time, new Boolean(isBegin) } ); try { 
hasPropagated	TokenNameIdentifier	 has Propagated
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
instanceTimes	TokenNameIdentifier	 instance Times
=	TokenNameEQUAL	
isBegin	TokenNameIdentifier	 is Begin
?	TokenNameQUESTION	
beginInstanceTimes	TokenNameIdentifier	 begin Instance Times
:	TokenNameCOLON	
endInstanceTimes	TokenNameIdentifier	 end Instance Times
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
instanceTimes	TokenNameIdentifier	 instance Times
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
instanceTimes	TokenNameIdentifier	 instance Times
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
==	TokenNameEQUAL_EQUAL	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instanceTimes	TokenNameIdentifier	 instance Times
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
instanceTimes	TokenNameIdentifier	 instance Times
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
instanceTimes	TokenNameIdentifier	 instance Times
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
==	TokenNameEQUAL_EQUAL	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instanceTimes	TokenNameIdentifier	 instance Times
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
shouldUpdateCurrentInterval	TokenNameIdentifier	 should Update Current Interval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
isSampling	TokenNameIdentifier	 is Sampling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isSampling	TokenNameIdentifier	 is Sampling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
sampleAt	TokenNameIdentifier	 sample At
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
isHyperlinking	TokenNameIdentifier	 is Hyperlinking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasPropagated	TokenNameIdentifier	 has Propagated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
currentIntervalWillUpdate	TokenNameIdentifier	 current Interval Will Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Called by a TimingSpecifier of this element when an InstanceTime * has been updated. This will be in response to a dependent * syncbase change. */	TokenNameCOMMENT_JAVADOC	 Called by a TimingSpecifier of this element when an InstanceTime has been updated. This will be in response to a dependent syncbase change. 
protected	TokenNameprotected	
float	TokenNamefloat	
instanceTimeChanged	TokenNameIdentifier	 instance Time Changed
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "instanceTimeChanged", new Object[] { time, new Boolean(isBegin) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "instanceTimeChanged", new Object[] { time, new Boolean(isBegin) } ); try { 
hasPropagated	TokenNameIdentifier	 has Propagated
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
shouldUpdateCurrentInterval	TokenNameIdentifier	 should Update Current Interval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
isSampling	TokenNameIdentifier	 is Sampling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isSampling	TokenNameIdentifier	 is Sampling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
sampleAt	TokenNameIdentifier	 sample At
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
isHyperlinking	TokenNameIdentifier	 is Hyperlinking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasPropagated	TokenNameIdentifier	 has Propagated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Adds a dependent TimingSpecifier for this element. */	TokenNameCOMMENT_JAVADOC	 Adds a dependent TimingSpecifier for this element. 
protected	TokenNameprotected	
void	TokenNamevoid	
addDependent	TokenNameIdentifier	 add Dependent
(	TokenNameLPAREN	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
dependent	TokenNameIdentifier	 dependent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forBegin	TokenNameIdentifier	 for Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "addDependent", new Object[] { dependent, new Boolean(forBegin) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "addDependent", new Object[] { dependent, new Boolean(forBegin) } ); try { 
if	TokenNameif	
(	TokenNameLPAREN	
forBegin	TokenNameIdentifier	 for Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginDependents	TokenNameIdentifier	 begin Dependents
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependent	TokenNameIdentifier	 dependent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
endDependents	TokenNameIdentifier	 end Dependents
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependent	TokenNameIdentifier	 dependent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Removes a dependent TimingSpecifier for this element. */	TokenNameCOMMENT_JAVADOC	 Removes a dependent TimingSpecifier for this element. 
protected	TokenNameprotected	
void	TokenNamevoid	
removeDependent	TokenNameIdentifier	 remove Dependent
(	TokenNameLPAREN	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
dependent	TokenNameIdentifier	 dependent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forBegin	TokenNameIdentifier	 for Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "removeDependent", new Object[] { dependent, new Boolean(forBegin) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "removeDependent", new Object[] { dependent, new Boolean(forBegin) } ); try { 
if	TokenNameif	
(	TokenNameLPAREN	
forBegin	TokenNameIdentifier	 for Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginDependents	TokenNameIdentifier	 begin Dependents
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
dependent	TokenNameIdentifier	 dependent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
endDependents	TokenNameIdentifier	 end Dependents
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
dependent	TokenNameIdentifier	 dependent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Returns the simple duration time of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the simple duration time of this element. 
public	TokenNamepublic	
float	TokenNamefloat	
getSimpleDur	TokenNameIdentifier	 get Simple Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
durMedia	TokenNameIdentifier	 dur Media
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getImplicitDur	TokenNameIdentifier	 get Implicit Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
simpleDur	TokenNameIdentifier	 simple Dur
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
repeatCount	TokenNameIdentifier	 repeat Count
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
repeatDur	TokenNameIdentifier	 repeat Dur
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
endTimes	TokenNameIdentifier	 end Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getImplicitDur	TokenNameIdentifier	 get Implicit Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
simpleDur	TokenNameIdentifier	 simple Dur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns whether the given time value is equal to the * {@link #UNRESOLVED} value. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given time value is equal to the {@link #UNRESOLVED} value. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the active duration time of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the active duration time of this element. 
public	TokenNamepublic	
float	TokenNamefloat	
getActiveDur	TokenNameIdentifier	 get Active Dur
(	TokenNameLPAREN	
float	TokenNamefloat	
B	TokenNameIdentifier	 B
,	TokenNameCOMMA	
float	TokenNamefloat	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getSimpleDur	TokenNameIdentifier	 get Simple Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
PAD	TokenNameIdentifier	 PAD
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PAD	TokenNameIdentifier	 PAD
=	TokenNameEQUAL	
minusTime	TokenNameIdentifier	 minus Time
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repeatDuration	TokenNameIdentifier	 repeat Duration
=	TokenNameEQUAL	
minTime	TokenNameIdentifier	 min Time
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
maxTime	TokenNameIdentifier	 max Time
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
PAD	TokenNameIdentifier	 PAD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
repeatDuration	TokenNameIdentifier	 repeat Duration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
IAD	TokenNameIdentifier	 IAD
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IAD	TokenNameIdentifier	 IAD
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
repeatDur	TokenNameIdentifier	 repeat Dur
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
repeatCount	TokenNameIdentifier	 repeat Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IAD	TokenNameIdentifier	 IAD
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
float	TokenNamefloat	
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
repeatCount	TokenNameIdentifier	 repeat Count
)	TokenNameRPAREN	
?	TokenNameQUESTION	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
:	TokenNameCOLON	
multiplyTime	TokenNameIdentifier	 multiply Time
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
repeatCount	TokenNameIdentifier	 repeat Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
repeatDur	TokenNameIdentifier	 repeat Dur
)	TokenNameRPAREN	
?	TokenNameQUESTION	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
:	TokenNameCOLON	
repeatDur	TokenNameIdentifier	 repeat Dur
;	TokenNameSEMICOLON	
IAD	TokenNameIdentifier	 IAD
=	TokenNameEQUAL	
minTime	TokenNameIdentifier	 min Time
(	TokenNameLPAREN	
minTime	TokenNameIdentifier	 min Time
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
||	TokenNameOR_OR	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PAD	TokenNameIdentifier	 PAD
=	TokenNameEQUAL	
IAD	TokenNameIdentifier	 IAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
PAD	TokenNameIdentifier	 PAD
=	TokenNameEQUAL	
minTime	TokenNameIdentifier	 min Time
(	TokenNameLPAREN	
IAD	TokenNameIdentifier	 IAD
,	TokenNameCOMMA	
minusTime	TokenNameIdentifier	 minus Time
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
repeatDuration	TokenNameIdentifier	 repeat Duration
=	TokenNameEQUAL	
IAD	TokenNameIdentifier	 IAD
;	TokenNameSEMICOLON	
return	TokenNamereturn	
minTime	TokenNameIdentifier	 min Time
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
maxTime	TokenNameIdentifier	 max Time
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
PAD	TokenNameIdentifier	 PAD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subtracts one simple time from another. */	TokenNameCOMMENT_JAVADOC	 Subtracts one simple time from another. 
protected	TokenNameprotected	
float	TokenNamefloat	
minusTime	TokenNameIdentifier	 minus Time
(	TokenNameLPAREN	
float	TokenNamefloat	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
float	TokenNamefloat	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
||	TokenNameOR_OR	
t2	TokenNameIdentifier	 t2
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
t1	TokenNameIdentifier	 t1
-	TokenNameMINUS	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Multiplies one simple time by n. */	TokenNameCOMMENT_JAVADOC	 Multiplies one simple time by n. 
protected	TokenNameprotected	
float	TokenNamefloat	
multiplyTime	TokenNameIdentifier	 multiply Time
(	TokenNameLPAREN	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
float	TokenNamefloat	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
||	TokenNameOR_OR	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the minimum of two time values. */	TokenNameCOMMENT_JAVADOC	 Returns the minimum of two time values. 
protected	TokenNameprotected	
float	TokenNamefloat	
minTime	TokenNameIdentifier	 min Time
(	TokenNameLPAREN	
float	TokenNamefloat	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
float	TokenNamefloat	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
==	TokenNameEQUAL_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
||	TokenNameOR_OR	
t2	TokenNameIdentifier	 t2
==	TokenNameEQUAL_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
||	TokenNameOR_OR	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
t2	TokenNameIdentifier	 t2
!=	TokenNameNOT_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
||	TokenNameOR_OR	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
t1	TokenNameIdentifier	 t1
!=	TokenNameNOT_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
&&	TokenNameAND_AND	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
t2	TokenNameIdentifier	 t2
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
<	TokenNameLESS	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the maximum of two time values. */	TokenNameCOMMENT_JAVADOC	 Returns the maximum of two time values. 
protected	TokenNameprotected	
float	TokenNamefloat	
maxTime	TokenNameIdentifier	 max Time
(	TokenNameLPAREN	
float	TokenNamefloat	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
float	TokenNamefloat	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
||	TokenNameOR_OR	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
t2	TokenNameIdentifier	 t2
!=	TokenNameNOT_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
||	TokenNameOR_OR	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
t1	TokenNameIdentifier	 t1
!=	TokenNameNOT_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
&&	TokenNameAND_AND	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
t2	TokenNameIdentifier	 t2
==	TokenNameEQUAL_EQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
>	TokenNameGREATER	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the implicit duration of the element. Currently, nested time * containers are not supported by SVG so this just returns * {@link #UNRESOLVED} by default. This should be overriden in derived * classes that play media, since they will have an implicit duration. */	TokenNameCOMMENT_JAVADOC	 Returns the implicit duration of the element. Currently, nested time containers are not supported by SVG so this just returns {@link #UNRESOLVED} by default. This should be overriden in derived classes that play media, since they will have an implicit duration. 
protected	TokenNameprotected	
float	TokenNamefloat	
getImplicitDur	TokenNameIdentifier	 get Implicit Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Notifies dependents of a new interval. */	TokenNameCOMMENT_JAVADOC	 Notifies dependents of a new interval. 
protected	TokenNameprotected	
float	TokenNamefloat	
notifyNewInterval	TokenNameIdentifier	 notify New Interval
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "notifyNewInterval", new Object[] { interval } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "notifyNewInterval", new Object[] { interval } ); try { 
float	TokenNamefloat	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
beginDependents	TokenNameIdentifier	 begin Dependents
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
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Trace.print(ts.owner + "'s " + (ts.isBegin ? "begin" : "end" ) + ": " + ts); 	TokenNameCOMMENT_LINE	Trace.print(ts.owner + "'s " + (ts.isBegin ? "begin" : "end" ) + ": " + ts); 
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
newInterval	TokenNameIdentifier	 new Interval
(	TokenNameLPAREN	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
endDependents	TokenNameIdentifier	 end Dependents
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
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Trace.print(ts.owner + "'s " + (ts.isBegin ? "begin" : "end" ) + ": " + ts); 	TokenNameCOMMENT_LINE	Trace.print(ts.owner + "'s " + (ts.isBegin ? "begin" : "end" ) + ": " + ts); 
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
newInterval	TokenNameIdentifier	 new Interval
(	TokenNameLPAREN	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Notifies dependents of a removed interval. */	TokenNameCOMMENT_JAVADOC	 Notifies dependents of a removed interval. 
protected	TokenNameprotected	
float	TokenNamefloat	
notifyRemoveInterval	TokenNameIdentifier	 notify Remove Interval
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "notifyRemoveInterval", new Object[] { interval } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "notifyRemoveInterval", new Object[] { interval } ); try { 
float	TokenNamefloat	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
beginDependents	TokenNameIdentifier	 begin Dependents
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
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
removeInterval	TokenNameIdentifier	 remove Interval
(	TokenNameLPAREN	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
endDependents	TokenNameIdentifier	 end Dependents
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
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
removeInterval	TokenNameIdentifier	 remove Interval
(	TokenNameLPAREN	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Calculates the local simple time. Currently the hyperlinking parameter * is ignored, so DOM timing events are fired during hyperlinking seeks. * If we were following SMIL 2.1 rather than SMIL Animation, then these * events would have to be suppressed. * * @return the number of seconds until this element becomes active again * if it currently is not, {@link Float#POSITIVE_INFINITY} if this * element will become active at some undetermined point in the * future (because of unresolved begin times, for example) or * will never become active again, or <code>0f</code> if the * element is currently active. */	TokenNameCOMMENT_JAVADOC	 Calculates the local simple time. Currently the hyperlinking parameter is ignored, so DOM timing events are fired during hyperlinking seeks. If we were following SMIL 2.1 rather than SMIL Animation, then these events would have to be suppressed. * @return the number of seconds until this element becomes active again if it currently is not, {@link Float#POSITIVE_INFINITY} if this element will become active at some undetermined point in the future (because of unresolved begin times, for example) or will never become active again, or <code>0f</code> if the element is currently active. 
protected	TokenNameprotected	
float	TokenNamefloat	
sampleAt	TokenNameIdentifier	 sample At
(	TokenNameLPAREN	
float	TokenNamefloat	
parentSimpleTime	TokenNameIdentifier	 parent Simple Time
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "sampleAt", new Object[] { new Float(parentSimpleTime) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "sampleAt", new Object[] { new Float(parentSimpleTime) } ); try { 
isSampling	TokenNameIdentifier	 is Sampling
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
parentSimpleTime	TokenNameIdentifier	 parent Simple Time
;	TokenNameSEMICOLON	
// No time containers in SVG. 	TokenNameCOMMENT_LINE	No time containers in SVG. 
// First, process any events that occurred since the last sampling, 	TokenNameCOMMENT_LINE	First, process any events that occurred since the last sampling, 
// taking into account event sensitivity. 	TokenNameCOMMENT_LINE	taking into account event sensitivity. 
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
handledEvents	TokenNameIdentifier	 handled Events
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasBegin	TokenNameIdentifier	 has Begin
=	TokenNameEQUAL	
false	TokenNamefalse	
,	TokenNameCOMMA	
hasEnd	TokenNameIdentifier	 has End
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
hasBegin	TokenNameIdentifier	 has Begin
&&	TokenNameAND_AND	
hasEnd	TokenNameIdentifier	 has End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventLikeTimingSpecifier	TokenNameIdentifier	 Event Like Timing Specifier
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventLikeTimingSpecifier	TokenNameIdentifier	 Event Like Timing Specifier
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isBegin	TokenNameIdentifier	 is Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasBegin	TokenNameIdentifier	 has Begin
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
hasEnd	TokenNameIdentifier	 has End
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
useBegin	TokenNameIdentifier	 use Begin
,	TokenNameCOMMA	
useEnd	TokenNameIdentifier	 use End
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasBegin	TokenNameIdentifier	 has Begin
&&	TokenNameAND_AND	
hasEnd	TokenNameIdentifier	 has End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
useBegin	TokenNameIdentifier	 use Begin
=	TokenNameEQUAL	
!	TokenNameNOT	
isActive	TokenNameIdentifier	 is Active
||	TokenNameOR_OR	
restartMode	TokenNameIdentifier	 restart Mode
==	TokenNameEQUAL_EQUAL	
RESTART_ALWAYS	TokenNameIdentifier	 RESTART  ALWAYS
;	TokenNameSEMICOLON	
useEnd	TokenNameIdentifier	 use End
=	TokenNameEQUAL	
!	TokenNameNOT	
useBegin	TokenNameIdentifier	 use Begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
hasBegin	TokenNameIdentifier	 has Begin
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
isActive	TokenNameIdentifier	 is Active
||	TokenNameOR_OR	
restartMode	TokenNameIdentifier	 restart Mode
==	TokenNameEQUAL_EQUAL	
RESTART_ALWAYS	TokenNameIdentifier	 RESTART  ALWAYS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
useBegin	TokenNameIdentifier	 use Begin
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
useEnd	TokenNameIdentifier	 use End
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
hasEnd	TokenNameIdentifier	 has End
&&	TokenNameAND_AND	
isActive	TokenNameIdentifier	 is Active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
useBegin	TokenNameIdentifier	 use Begin
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
useEnd	TokenNameIdentifier	 use End
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventLikeTimingSpecifier	TokenNameIdentifier	 Event Like Timing Specifier
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventLikeTimingSpecifier	TokenNameIdentifier	 Event Like Timing Specifier
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isBegin	TokenNameIdentifier	 is Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isBegin	TokenNameIdentifier	 is Begin
&&	TokenNameAND_AND	
useBegin	TokenNameIdentifier	 use Begin
||	TokenNameOR_OR	
!	TokenNameNOT	
isBegin	TokenNameIdentifier	 is Begin
&&	TokenNameAND_AND	
useEnd	TokenNameIdentifier	 use End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shouldUpdateCurrentInterval	TokenNameIdentifier	 should Update Current Interval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
handledEvents	TokenNameIdentifier	 handled Events
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now process intervals. 	TokenNameCOMMENT_LINE	Now process intervals. 
if	TokenNameif	
(	TokenNameLPAREN	
currentInterval	TokenNameIdentifier	 current Interval
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastSampleTime	TokenNameIdentifier	 last Sample Time
<	TokenNameLESS	
begin	TokenNameIdentifier	 begin
&&	TokenNameAND_AND	
time	TokenNameIdentifier	 time
>=	TokenNameGREATER_EQUAL	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isActive	TokenNameIdentifier	 is Active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toActive	TokenNameIdentifier	 to Active
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
isFrozen	TokenNameIdentifier	 is Frozen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
=	TokenNameEQUAL	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
fireTimeEvent	TokenNameIdentifier	 fire Time Event
(	TokenNameLPAREN	
SMIL_BEGIN_EVENT_NAME	TokenNameIdentifier	 SMIL  BEGIN  EVENT  NAME
,	TokenNameCOMMA	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// For each sample, we might need to update the current interval's 	TokenNameCOMMENT_LINE	For each sample, we might need to update the current interval's 
// begin and end times, or end the current interval and compute 	TokenNameCOMMENT_LINE	begin and end times, or end the current interval and compute 
// a new one. 	TokenNameCOMMENT_LINE	a new one. 
boolean	TokenNameboolean	
hasEnded	TokenNameIdentifier	 has Ended
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
time	TokenNameIdentifier	 time
>=	TokenNameGREATER_EQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fire any repeat events that should have been fired since the 	TokenNameCOMMENT_LINE	Fire any repeat events that should have been fired since the 
// last sample. 	TokenNameCOMMENT_LINE	last sample. 
if	TokenNameif	
(	TokenNameLPAREN	
currentInterval	TokenNameIdentifier	 current Interval
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
>=	TokenNameGREATER_EQUAL	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getSimpleDur	TokenNameIdentifier	 get Simple Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
-	TokenNameMINUS	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
>=	TokenNameGREATER_EQUAL	
d	TokenNameIdentifier	 d
&&	TokenNameAND_AND	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
begin	TokenNameIdentifier	 begin
+	TokenNamePLUS	
repeatDuration	TokenNameIdentifier	 repeat Duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
+=	TokenNamePLUS_EQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
currentRepeatIteration	TokenNameIdentifier	 current Repeat Iteration
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fireTimeEvent	TokenNameIdentifier	 fire Time Event
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getRepeatEventName	TokenNameIdentifier	 get Repeat Event Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
,	TokenNameCOMMA	
currentRepeatIteration	TokenNameIdentifier	 current Repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Trace.print("begin loop"); 	TokenNameCOMMENT_LINE	Trace.print("begin loop"); 
float	TokenNamefloat	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shouldUpdateCurrentInterval	TokenNameIdentifier	 should Update Current Interval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
shouldUpdateCurrentInterval	TokenNameIdentifier	 should Update Current Interval
||	TokenNameOR_OR	
hasEnded	TokenNameIdentifier	 has Ended
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasEnded	TokenNameIdentifier	 has Ended
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// previousIntervals.add(currentInterval); 	TokenNameCOMMENT_LINE	previousIntervals.add(currentInterval); 
previousInterval	TokenNameIdentifier	 previous Interval
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
;	TokenNameSEMICOLON	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isFrozen	TokenNameIdentifier	 is Frozen
=	TokenNameEQUAL	
fillMode	TokenNameIdentifier	 fill Mode
==	TokenNameEQUAL_EQUAL	
FILL_FREEZE	TokenNameIdentifier	 FILL  FREEZE
;	TokenNameSEMICOLON	
toInactive	TokenNameIdentifier	 to Inactive
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTimeEvent	TokenNameIdentifier	 fire Time Event
(	TokenNameLPAREN	
SMIL_END_EVENT_NAME	TokenNameIdentifier	 SMIL  END  EVENT  NAME
,	TokenNameCOMMA	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
// currentInterval == null && previousIntervals.isEmpty(); 	TokenNameCOMMENT_LINE	currentInterval == null && previousIntervals.isEmpty(); 
currentInterval	TokenNameIdentifier	 current Interval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
previousInterval	TokenNameIdentifier	 previous Interval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentInterval	TokenNameIdentifier	 current Interval
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Hyperlinking, so remove the current interval and force a new 	TokenNameCOMMENT_LINE	Hyperlinking, so remove the current interval and force a new 
// one to be computed. 	TokenNameCOMMENT_LINE	one to be computed. 
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isFrozen	TokenNameIdentifier	 is Frozen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
toInactive	TokenNameIdentifier	 to Inactive
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentInterval	TokenNameIdentifier	 current Interval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// fireTimeEvent(SMIL_END_EVENT_NAME, currentInterval.getEnd(), 0); 	TokenNameCOMMENT_LINE	fireTimeEvent(SMIL_END_EVENT_NAME, currentInterval.getEnd(), 0); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentInterval	TokenNameIdentifier	 current Interval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
hasEnded	TokenNameIdentifier	 has Ended
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
||	TokenNameOR_OR	
hyperlinking	TokenNameIdentifier	 hyperlinking
||	TokenNameOR_OR	
restartMode	TokenNameIdentifier	 restart Mode
!=	TokenNameNOT_EQUAL	
RESTART_NEVER	TokenNameIdentifier	 RESTART  NEVER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
beginAfter	TokenNameIdentifier	 begin After
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
incl	TokenNameIdentifier	 incl
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
||	TokenNameOR_OR	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginAfter	TokenNameIdentifier	 begin After
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// beginAfter = ((Interval) previousIntervals.getLast()).getEnd(); 	TokenNameCOMMENT_LINE	beginAfter = ((Interval) previousIntervals.getLast()).getEnd(); 
beginAfter	TokenNameIdentifier	 begin After
=	TokenNameEQUAL	
previousInterval	TokenNameIdentifier	 previous Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incl	TokenNameIdentifier	 incl
=	TokenNameEQUAL	
beginAfter	TokenNameIdentifier	 begin After
!=	TokenNameNOT_EQUAL	
previousInterval	TokenNameIdentifier	 previous Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
=	TokenNameEQUAL	
computeInterval	TokenNameIdentifier	 compute Interval
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
beginAfter	TokenNameIdentifier	 begin After
,	TokenNameCOMMA	
incl	TokenNameIdentifier	 incl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
interval	TokenNameIdentifier	 interval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentInterval	TokenNameIdentifier	 current Interval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
float	TokenNamefloat	
dmt	TokenNameIdentifier	 dmt
=	TokenNameEQUAL	
selectNewInterval	TokenNameIdentifier	 select New Interval
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dmt	TokenNameIdentifier	 dmt
<	TokenNameLESS	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
dmt	TokenNameIdentifier	 dmt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentInterval	TokenNameIdentifier	 current Interval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
float	TokenNamefloat	
currentBegin	TokenNameIdentifier	 current Begin
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentBegin	TokenNameIdentifier	 current Begin
>	TokenNameGREATER	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Interval hasn't started yet. 	TokenNameCOMMENT_LINE	Interval hasn't started yet. 
float	TokenNamefloat	
beginAfter	TokenNameIdentifier	 begin After
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
incl	TokenNameIdentifier	 incl
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// if (previousIntervals.isEmpty()) { 	TokenNameCOMMENT_LINE	if (previousIntervals.isEmpty()) { 
if	TokenNameif	
(	TokenNameLPAREN	
previousInterval	TokenNameIdentifier	 previous Interval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginAfter	TokenNameIdentifier	 begin After
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// beginAfter = ((Interval) previousIntervals.getLast()).getEnd(); 	TokenNameCOMMENT_LINE	beginAfter = ((Interval) previousIntervals.getLast()).getEnd(); 
beginAfter	TokenNameIdentifier	 begin After
=	TokenNameEQUAL	
previousInterval	TokenNameIdentifier	 previous Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incl	TokenNameIdentifier	 incl
=	TokenNameEQUAL	
beginAfter	TokenNameIdentifier	 begin After
!=	TokenNameNOT_EQUAL	
previousInterval	TokenNameIdentifier	 previous Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
=	TokenNameEQUAL	
computeInterval	TokenNameIdentifier	 compute Interval
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
beginAfter	TokenNameIdentifier	 begin After
,	TokenNameCOMMA	
incl	TokenNameIdentifier	 incl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dmt	TokenNameIdentifier	 dmt
=	TokenNameEQUAL	
notifyRemoveInterval	TokenNameIdentifier	 notify Remove Interval
(	TokenNameLPAREN	
currentInterval	TokenNameIdentifier	 current Interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dmt	TokenNameIdentifier	 dmt
<	TokenNameLESS	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
dmt	TokenNameIdentifier	 dmt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
interval	TokenNameIdentifier	 interval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentInterval	TokenNameIdentifier	 current Interval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dmt	TokenNameIdentifier	 dmt
=	TokenNameEQUAL	
selectNewInterval	TokenNameIdentifier	 select New Interval
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dmt	TokenNameIdentifier	 dmt
<	TokenNameLESS	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
dmt	TokenNameIdentifier	 dmt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Interval has already started. 	TokenNameCOMMENT_LINE	Interval has already started. 
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
=	TokenNameEQUAL	
computeInterval	TokenNameIdentifier	 compute Interval
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
currentBegin	TokenNameIdentifier	 current Begin
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
newEnd	TokenNameIdentifier	 new End
=	TokenNameEQUAL	
interval	TokenNameIdentifier	 interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
newEnd	TokenNameIdentifier	 new End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
dmt	TokenNameIdentifier	 dmt
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
newEnd	TokenNameIdentifier	 new End
,	TokenNameCOMMA	
interval	TokenNameIdentifier	 interval
.	TokenNameDOT	
getEndInstanceTime	TokenNameIdentifier	 get End Instance Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dmt	TokenNameIdentifier	 dmt
<	TokenNameLESS	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
=	TokenNameEQUAL	
dmt	TokenNameIdentifier	 dmt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
shouldUpdateCurrentInterval	TokenNameIdentifier	 should Update Current Interval
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
hyperlinking	TokenNameIdentifier	 hyperlinking
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
hasEnded	TokenNameIdentifier	 has Ended
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
time	TokenNameIdentifier	 time
>=	TokenNameGREATER_EQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Trace.print("end loop"); 	TokenNameCOMMENT_LINE	Trace.print("end loop"); 
float	TokenNamefloat	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getSimpleDur	TokenNameIdentifier	 get Simple Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isActive	TokenNameIdentifier	 is Active
&&	TokenNameAND_AND	
!	TokenNameNOT	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
-	TokenNameMINUS	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
repeatDuration	TokenNameIdentifier	 repeat Duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.print("element between repeat and active duration"); 	TokenNameCOMMENT_LINE	Trace.print("element between repeat and active duration"); 
isFrozen	TokenNameIdentifier	 is Frozen
=	TokenNameEQUAL	
fillMode	TokenNameIdentifier	 fill Mode
==	TokenNameEQUAL_EQUAL	
FILL_FREEZE	TokenNameIdentifier	 FILL  FREEZE
;	TokenNameSEMICOLON	
toInactive	TokenNameIdentifier	 to Inactive
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Trace.print("element active, sampling at simple time " + (time - lastRepeatTime)); 	TokenNameCOMMENT_LINE	Trace.print("element active, sampling at simple time " + (time - lastRepeatTime)); 
sampledAt	TokenNameIdentifier	 sampled At
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
-	TokenNameMINUS	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
currentRepeatIteration	TokenNameIdentifier	 current Repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
atLast	TokenNameIdentifier	 at Last
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isActive	TokenNameIdentifier	 is Active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
repeatDuration	TokenNameIdentifier	 repeat Duration
-	TokenNameMINUS	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
;	TokenNameSEMICOLON	
atLast	TokenNameIdentifier	 at Last
=	TokenNameEQUAL	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
repeatDuration	TokenNameIdentifier	 repeat Duration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Interval previousInterval = (Interval) previousIntervals.getLast(); 	TokenNameCOMMENT_LINE	Interval previousInterval = (Interval) previousIntervals.getLast(); 
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
previousInterval	TokenNameIdentifier	 previous Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
;	TokenNameSEMICOLON	
atLast	TokenNameIdentifier	 at Last
=	TokenNameEQUAL	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
previousInterval	TokenNameIdentifier	 previous Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
atLast	TokenNameIdentifier	 at Last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.print("element frozen" + (isActive ? " (but still active)" : "") + ", sampling last value"); 	TokenNameCOMMENT_LINE	Trace.print("element frozen" + (isActive ? " (but still active)" : "") + ", sampling last value"); 
sampledLastValue	TokenNameIdentifier	 sampled Last Value
(	TokenNameLPAREN	
currentRepeatIteration	TokenNameIdentifier	 current Repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Trace.print("element frozen" + (isActive ? " (but still active)" : "") + ", sampling at simple time " + (t % d)); 	TokenNameCOMMENT_LINE	Trace.print("element frozen" + (isActive ? " (but still active)" : "") + ", sampling at simple time " + (t % d)); 
sampledAt	TokenNameIdentifier	 sampled At
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
%	TokenNameREMAINDER	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
currentRepeatIteration	TokenNameIdentifier	 current Repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isActive	TokenNameIdentifier	 is Active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.print("element not sampling"); 	TokenNameCOMMENT_LINE	Trace.print("element not sampling"); 
}	TokenNameRBRACE	
isSampling	TokenNameIdentifier	 is Sampling
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
lastSampleTime	TokenNameIdentifier	 last Sample Time
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentInterval	TokenNameIdentifier	 current Interval
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
isConstantAnimation	TokenNameIdentifier	 is Constant Animation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isFrozen	TokenNameIdentifier	 is Frozen
?	TokenNameQUESTION	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
time	TokenNameIdentifier	 time
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
<	TokenNameLESS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dependentMinTime	TokenNameIdentifier	 dependent Min Time
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Returns whether the end timing specifier list contains any eventbase, * accesskey or repeat timing specifiers. */	TokenNameCOMMENT_JAVADOC	 Returns whether the end timing specifier list contains any eventbase, accesskey or repeat timing specifiers. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
endHasEventConditions	TokenNameIdentifier	 end Has Event Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
endTimes	TokenNameIdentifier	 end Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endTimes	TokenNameIdentifier	 end Times
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isEventCondition	TokenNameIdentifier	 is Event Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the current interval to the one specified. This will notify * dependents and fire the 'begin' and any necessary 'repeat' events. * @param time the current sampling time * @param interval the Interval object to select to be current * @return the minimum time the animation engine can safely wait, as * determined by dependents of the interval */	TokenNameCOMMENT_JAVADOC	 Sets the current interval to the one specified. This will notify dependents and fire the 'begin' and any necessary 'repeat' events. @param time the current sampling time @param interval the Interval object to select to be current @return the minimum time the animation engine can safely wait, as determined by dependents of the interval 
protected	TokenNameprotected	
float	TokenNamefloat	
selectNewInterval	TokenNameIdentifier	 select New Interval
(	TokenNameLPAREN	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "selectNewInterval", new Object[] { interval }); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "selectNewInterval", new Object[] { interval }); try { 
currentInterval	TokenNameIdentifier	 current Interval
=	TokenNameEQUAL	
interval	TokenNameIdentifier	 interval
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dmt	TokenNameIdentifier	 dmt
=	TokenNameEQUAL	
notifyNewInterval	TokenNameIdentifier	 notify New Interval
(	TokenNameLPAREN	
currentInterval	TokenNameIdentifier	 current Interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
beginEventTime	TokenNameIdentifier	 begin Event Time
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
>=	TokenNameGREATER_EQUAL	
beginEventTime	TokenNameIdentifier	 begin Event Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
=	TokenNameEQUAL	
beginEventTime	TokenNameIdentifier	 begin Event Time
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
beginEventTime	TokenNameIdentifier	 begin Event Time
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginEventTime	TokenNameIdentifier	 begin Event Time
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
toActive	TokenNameIdentifier	 to Active
(	TokenNameLPAREN	
beginEventTime	TokenNameIdentifier	 begin Event Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
isFrozen	TokenNameIdentifier	 is Frozen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fireTimeEvent	TokenNameIdentifier	 fire Time Event
(	TokenNameLPAREN	
SMIL_BEGIN_EVENT_NAME	TokenNameIdentifier	 SMIL  BEGIN  EVENT  NAME
,	TokenNameCOMMA	
beginEventTime	TokenNameIdentifier	 begin Event Time
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getSimpleDur	TokenNameIdentifier	 get Simple Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
-	TokenNameMINUS	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
>=	TokenNameGREATER_EQUAL	
d	TokenNameIdentifier	 d
&&	TokenNameAND_AND	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
+=	TokenNamePLUS_EQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
currentRepeatIteration	TokenNameIdentifier	 current Repeat Iteration
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fireTimeEvent	TokenNameIdentifier	 fire Time Event
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getRepeatEventName	TokenNameIdentifier	 get Repeat Event Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
,	TokenNameCOMMA	
currentRepeatIteration	TokenNameIdentifier	 current Repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dmt	TokenNameIdentifier	 dmt
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Computes an interval from the begin and end instance time lists. * @param first indicates whether this is the first interval to compute * @param fixedBegin if true, specifies that the value given for * <code>beginAfter</code> is taken to be the actual begin * time for the interval; only the end value is computed. * @param beginAfter the earliest possible begin time for the computed * interval. * @param incl if true (and <code>!fixedBegin</code>), specifies that the * new interval's begin time must be greater than * <code>beginAfter</code>; otherwise, the begin time must be * greater than or equal to <code>beginAfter</code>. */	TokenNameCOMMENT_JAVADOC	 Computes an interval from the begin and end instance time lists. @param first indicates whether this is the first interval to compute @param fixedBegin if true, specifies that the value given for <code>beginAfter</code> is taken to be the actual begin time for the interval; only the end value is computed. @param beginAfter the earliest possible begin time for the computed interval. @param incl if true (and <code>!fixedBegin</code>), specifies that the new interval's begin time must be greater than <code>beginAfter</code>; otherwise, the begin time must be greater than or equal to <code>beginAfter</code>. 
protected	TokenNameprotected	
Interval	TokenNameIdentifier	 Interval
computeInterval	TokenNameIdentifier	 compute Interval
(	TokenNameLPAREN	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fixedBegin	TokenNameIdentifier	 fixed Begin
,	TokenNameCOMMA	
float	TokenNamefloat	
beginAfter	TokenNameIdentifier	 begin After
,	TokenNameCOMMA	
boolean	TokenNameboolean	
incl	TokenNameIdentifier	 incl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "computeInterval", new Object[] { new Boolean(first), new Boolean(fixedBegin), new Float(beginAfter)} ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "computeInterval", new Object[] { new Boolean(first), new Boolean(fixedBegin), new Float(beginAfter)} ); try { 
// Trace.print("computing interval from begins=" + beginInstanceTimes + ", ends=" + endInstanceTimes); 	TokenNameCOMMENT_LINE	Trace.print("computing interval from begins=" + beginInstanceTimes + ", ends=" + endInstanceTimes); 
Iterator	TokenNameIdentifier	 Iterator
beginIterator	TokenNameIdentifier	 begin Iterator
=	TokenNameEQUAL	
beginInstanceTimes	TokenNameIdentifier	 begin Instance Times
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
endIterator	TokenNameIdentifier	 end Iterator
=	TokenNameEQUAL	
endInstanceTimes	TokenNameIdentifier	 end Instance Times
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
parentSimpleDur	TokenNameIdentifier	 parent Simple Dur
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getSimpleDur	TokenNameIdentifier	 get Simple Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstanceTime	TokenNameIdentifier	 Instance Time
endInstanceTime	TokenNameIdentifier	 end Instance Time
=	TokenNameEQUAL	
endIterator	TokenNameIdentifier	 end Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
endIterator	TokenNameIdentifier	 end Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
firstEnd	TokenNameIdentifier	 first End
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
InstanceTime	TokenNameIdentifier	 Instance Time
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
InstanceTime	TokenNameIdentifier	 Instance Time
nextBeginInstanceTime	TokenNameIdentifier	 next Begin Instance Time
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
tempBegin	TokenNameIdentifier	 temp Begin
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fixedBegin	TokenNameIdentifier	 fixed Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempBegin	TokenNameIdentifier	 temp Begin
=	TokenNameEQUAL	
beginAfter	TokenNameIdentifier	 begin After
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
beginIterator	TokenNameIdentifier	 begin Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextBeginInstanceTime	TokenNameIdentifier	 next Begin Instance Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
beginIterator	TokenNameIdentifier	 begin Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextBeginInstanceTime	TokenNameIdentifier	 next Begin Instance Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
tempBegin	TokenNameIdentifier	 temp Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
beginIterator	TokenNameIdentifier	 begin Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ran out of begin values 	TokenNameCOMMENT_LINE	ran out of begin values 
// Trace.print("returning null interval"); 	TokenNameCOMMENT_LINE	Trace.print("returning null interval"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
beginIterator	TokenNameIdentifier	 begin Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempBegin	TokenNameIdentifier	 temp Begin
=	TokenNameEQUAL	
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
incl	TokenNameIdentifier	 incl
&&	TokenNameAND_AND	
tempBegin	TokenNameIdentifier	 temp Begin
>=	TokenNameGREATER_EQUAL	
beginAfter	TokenNameIdentifier	 begin After
||	TokenNameOR_OR	
!	TokenNameNOT	
incl	TokenNameIdentifier	 incl
&&	TokenNameAND_AND	
tempBegin	TokenNameIdentifier	 temp Begin
>	TokenNameGREATER	
beginAfter	TokenNameIdentifier	 begin After
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
beginIterator	TokenNameIdentifier	 begin Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextBeginInstanceTime	TokenNameIdentifier	 next Begin Instance Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
beginIterator	TokenNameIdentifier	 begin Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nextBeginInstanceTime	TokenNameIdentifier	 next Begin Instance Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XXX Not sure if this is exactly correct to 	TokenNameCOMMENT_LINE	XXX Not sure if this is exactly correct to 
// skip past these identical times, but it 	TokenNameCOMMENT_LINE	skip past these identical times, but it 
// avoids an infinite loop of 0s intervals 	TokenNameCOMMENT_LINE	avoids an infinite loop of 0s intervals 
// being created. 	TokenNameCOMMENT_LINE	being created. 
nextBeginInstanceTime	TokenNameIdentifier	 next Begin Instance Time
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tempBegin	TokenNameIdentifier	 temp Begin
>=	TokenNameGREATER_EQUAL	
parentSimpleDur	TokenNameIdentifier	 parent Simple Dur
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the begin value is after the parent has ended 	TokenNameCOMMENT_LINE	the begin value is after the parent has ended 
// Trace.print("returning null interval"); 	TokenNameCOMMENT_LINE	Trace.print("returning null interval"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
tempEnd	TokenNameIdentifier	 temp End
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endTimes	TokenNameIdentifier	 end Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no 'end' attribute specified 	TokenNameCOMMENT_LINE	no 'end' attribute specified 
tempEnd	TokenNameIdentifier	 temp End
=	TokenNameEQUAL	
tempBegin	TokenNameIdentifier	 temp Begin
+	TokenNamePLUS	
getActiveDur	TokenNameIdentifier	 get Active Dur
(	TokenNameLPAREN	
tempBegin	TokenNameIdentifier	 temp Begin
,	TokenNameCOMMA	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Trace.print("no end specified, so tempEnd = " + tempEnd); 	TokenNameCOMMENT_LINE	Trace.print("no end specified, so tempEnd = " + tempEnd); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endInstanceTimes	TokenNameIdentifier	 end Instance Times
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempEnd	TokenNameIdentifier	 temp End
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tempEnd	TokenNameIdentifier	 temp End
=	TokenNameEQUAL	
endInstanceTime	TokenNameIdentifier	 end Instance Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
&&	TokenNameAND_AND	
!	TokenNameNOT	
firstEnd	TokenNameIdentifier	 first End
&&	TokenNameAND_AND	
tempEnd	TokenNameIdentifier	 temp End
==	TokenNameEQUAL_EQUAL	
tempBegin	TokenNameIdentifier	 temp Begin
||	TokenNameOR_OR	
!	TokenNameNOT	
first	TokenNameIdentifier	 first
&&	TokenNameAND_AND	
currentInterval	TokenNameIdentifier	 current Interval
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tempEnd	TokenNameIdentifier	 temp End
==	TokenNameEQUAL_EQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
incl	TokenNameIdentifier	 incl
&&	TokenNameAND_AND	
beginAfter	TokenNameIdentifier	 begin After
>=	TokenNameGREATER_EQUAL	
tempEnd	TokenNameIdentifier	 temp End
||	TokenNameOR_OR	
!	TokenNameNOT	
incl	TokenNameIdentifier	 incl
&&	TokenNameAND_AND	
beginAfter	TokenNameIdentifier	 begin After
>	TokenNameGREATER	
tempEnd	TokenNameIdentifier	 temp End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
endIterator	TokenNameIdentifier	 end Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endHasEventConditions	TokenNameIdentifier	 end Has Event Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempEnd	TokenNameIdentifier	 temp End
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Trace.print("returning null interval"); 	TokenNameCOMMENT_LINE	Trace.print("returning null interval"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
endInstanceTime	TokenNameIdentifier	 end Instance Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
endIterator	TokenNameIdentifier	 end Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempEnd	TokenNameIdentifier	 temp End
=	TokenNameEQUAL	
endInstanceTime	TokenNameIdentifier	 end Instance Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tempEnd	TokenNameIdentifier	 temp End
>	TokenNameGREATER	
tempBegin	TokenNameIdentifier	 temp Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
firstEnd	TokenNameIdentifier	 first End
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tempEnd	TokenNameIdentifier	 temp End
>=	TokenNameGREATER_EQUAL	
tempBegin	TokenNameIdentifier	 temp Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
endIterator	TokenNameIdentifier	 end Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endHasEventConditions	TokenNameIdentifier	 end Has Event Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempEnd	TokenNameIdentifier	 temp End
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Trace.print("returning null interval"); 	TokenNameCOMMENT_LINE	Trace.print("returning null interval"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
endInstanceTime	TokenNameIdentifier	 end Instance Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
endIterator	TokenNameIdentifier	 end Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempEnd	TokenNameIdentifier	 temp End
=	TokenNameEQUAL	
endInstanceTime	TokenNameIdentifier	 end Instance Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
float	TokenNamefloat	
ad	TokenNameIdentifier	 ad
=	TokenNameEQUAL	
getActiveDur	TokenNameIdentifier	 get Active Dur
(	TokenNameLPAREN	
tempBegin	TokenNameIdentifier	 temp Begin
,	TokenNameCOMMA	
tempEnd	TokenNameIdentifier	 temp End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempEnd	TokenNameIdentifier	 temp End
=	TokenNameEQUAL	
tempBegin	TokenNameIdentifier	 temp Begin
+	TokenNamePLUS	
ad	TokenNameIdentifier	 ad
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
first	TokenNameIdentifier	 first
||	TokenNameOR_OR	
tempEnd	TokenNameIdentifier	 temp End
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
tempBegin	TokenNameIdentifier	 temp Begin
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
tempEnd	TokenNameIdentifier	 temp End
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
tempEnd	TokenNameIdentifier	 temp End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.print("considering restart semantics"); 	TokenNameCOMMENT_LINE	Trace.print("considering restart semantics"); 
if	TokenNameif	
(	TokenNameLPAREN	
restartMode	TokenNameIdentifier	 restart Mode
==	TokenNameEQUAL_EQUAL	
RESTART_ALWAYS	TokenNameIdentifier	 RESTART  ALWAYS
&&	TokenNameAND_AND	
nextBeginInstanceTime	TokenNameIdentifier	 next Begin Instance Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
nextBegin	TokenNameIdentifier	 next Begin
=	TokenNameEQUAL	
nextBeginInstanceTime	TokenNameIdentifier	 next Begin Instance Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Trace.print("nextBegin == " + nextBegin); 	TokenNameCOMMENT_LINE	Trace.print("nextBegin == " + nextBegin); 
if	TokenNameif	
(	TokenNameLPAREN	
nextBegin	TokenNameIdentifier	 next Begin
<	TokenNameLESS	
tempEnd	TokenNameIdentifier	 temp End
||	TokenNameOR_OR	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
tempEnd	TokenNameIdentifier	 temp End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempEnd	TokenNameIdentifier	 temp End
=	TokenNameEQUAL	
nextBegin	TokenNameIdentifier	 next Begin
;	TokenNameSEMICOLON	
endInstanceTime	TokenNameIdentifier	 end Instance Time
=	TokenNameEQUAL	
nextBeginInstanceTime	TokenNameIdentifier	 next Begin Instance Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Interval	TokenNameIdentifier	 Interval
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
new	TokenNamenew	
Interval	TokenNameIdentifier	 Interval
(	TokenNameLPAREN	
tempBegin	TokenNameIdentifier	 temp Begin
,	TokenNameCOMMA	
tempEnd	TokenNameIdentifier	 temp End
,	TokenNameCOMMA	
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
,	TokenNameCOMMA	
endInstanceTime	TokenNameIdentifier	 end Instance Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Trace.print("returning interval: " + i); 	TokenNameCOMMENT_LINE	Trace.print("returning interval: " + i); 
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fixedBegin	TokenNameIdentifier	 fixed Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.print("returning null interval"); 	TokenNameCOMMENT_LINE	Trace.print("returning null interval"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
beginAfter	TokenNameIdentifier	 begin After
=	TokenNameEQUAL	
tempEnd	TokenNameIdentifier	 temp End
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Resets this element. */	TokenNameCOMMENT_JAVADOC	 Resets this element. 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
boolean	TokenNameboolean	
clearCurrentBegin	TokenNameIdentifier	 clear Current Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
beginInstanceTimes	TokenNameIdentifier	 begin Instance Times
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
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
getClearOnReset	TokenNameIdentifier	 get Clear On Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
clearCurrentBegin	TokenNameIdentifier	 clear Current Begin
||	TokenNameOR_OR	
currentInterval	TokenNameIdentifier	 current Interval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBeginInstanceTime	TokenNameIdentifier	 get Begin Instance Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
endInstanceTimes	TokenNameIdentifier	 end Instance Times
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
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
getClearOnReset	TokenNameIdentifier	 get Clear On Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeFill	TokenNameIdentifier	 remove Fill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentRepeatIteration	TokenNameIdentifier	 current Repeat Iteration
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lastRepeatTime	TokenNameIdentifier	 last Repeat Time
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isFrozen	TokenNameIdentifier	 is Frozen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
lastSampleTime	TokenNameIdentifier	 last Sample Time
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
// XXX should reconvert resolved syncbase/wallclock/media-marker time 	TokenNameCOMMENT_LINE	XXX should reconvert resolved syncbase/wallclock/media-marker time 
// instances into the parent simple timespace 	TokenNameCOMMENT_LINE	instances into the parent simple timespace 
}	TokenNameRBRACE	
/** * Parses the animation attributes for this timed element. */	TokenNameCOMMENT_JAVADOC	 Parses the animation attributes for this timed element. 
public	TokenNamepublic	
void	TokenNamevoid	
parseAttributes	TokenNameIdentifier	 parse Attributes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dur	TokenNameIdentifier	 dur
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
repeatCount	TokenNameIdentifier	 repeat Count
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
repeatDur	TokenNameIdentifier	 repeat Dur
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fill	TokenNameIdentifier	 fill
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
restart	TokenNameIdentifier	 restart
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasParsed	TokenNameIdentifier	 has Parsed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseBegin	TokenNameIdentifier	 parse Begin
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseDur	TokenNameIdentifier	 parse Dur
(	TokenNameLPAREN	
dur	TokenNameIdentifier	 dur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseEnd	TokenNameIdentifier	 parse End
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseMin	TokenNameIdentifier	 parse Min
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseMax	TokenNameIdentifier	 parse Max
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parseRepeatCount	TokenNameIdentifier	 parse Repeat Count
(	TokenNameLPAREN	
repeatCount	TokenNameIdentifier	 repeat Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseRepeatDur	TokenNameIdentifier	 parse Repeat Dur
(	TokenNameLPAREN	
repeatDur	TokenNameIdentifier	 repeat Dur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseFill	TokenNameIdentifier	 parse Fill
(	TokenNameLPAREN	
fill	TokenNameIdentifier	 fill
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseRestart	TokenNameIdentifier	 parse Restart
(	TokenNameLPAREN	
restart	TokenNameIdentifier	 restart
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasParsed	TokenNameIdentifier	 has Parsed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a new 'begin' attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a new 'begin' attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseBegin	TokenNameIdentifier	 parse Begin
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
SMIL_BEGIN_DEFAULT_VALUE	TokenNameIdentifier	 SMIL  BEGIN  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
beginTimes	TokenNameIdentifier	 begin Times
=	TokenNameEQUAL	
TimingSpecifierListProducer	TokenNameIdentifier	 Timing Specifier List Producer
.	TokenNameDOT	
parseTimingSpecifierList	TokenNameIdentifier	 parse Timing Specifier List
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
.	TokenNameDOT	
this	TokenNamethis	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SMIL_BEGIN_ATTRIBUTE	TokenNameIdentifier	 SMIL  BEGIN  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a new 'dur' attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a new 'dur' attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseDur	TokenNameIdentifier	 parse Dur
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dur	TokenNameIdentifier	 dur
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dur	TokenNameIdentifier	 dur
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_MEDIA_VALUE	TokenNameIdentifier	 SMIL  MEDIA  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
durMedia	TokenNameIdentifier	 dur Media
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
simpleDur	TokenNameIdentifier	 simple Dur
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
durMedia	TokenNameIdentifier	 dur Media
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dur	TokenNameIdentifier	 dur
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
dur	TokenNameIdentifier	 dur
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_INDEFINITE_VALUE	TokenNameIdentifier	 SMIL  INDEFINITE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
simpleDur	TokenNameIdentifier	 simple Dur
=	TokenNameEQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
simpleDur	TokenNameIdentifier	 simple Dur
=	TokenNameEQUAL	
parseClockValue	TokenNameIdentifier	 parse Clock Value
(	TokenNameLPAREN	
dur	TokenNameIdentifier	 dur
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SMIL_DUR_ATTRIBUTE	TokenNameIdentifier	 SMIL  DUR  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
simpleDur	TokenNameIdentifier	 simple Dur
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
simpleDur	TokenNameIdentifier	 simple Dur
=	TokenNameEQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a clock value or offset and returns it as a float. */	TokenNameCOMMENT_JAVADOC	 Parses a clock value or offset and returns it as a float. 
protected	TokenNameprotected	
float	TokenNamefloat	
parseClockValue	TokenNameIdentifier	 parse Clock Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
boolean	TokenNameboolean	
parseOffset	TokenNameIdentifier	 parse Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
ClockParser	TokenNameIdentifier	 Clock Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
ClockParser	TokenNameIdentifier	 Clock Parser
(	TokenNameLPAREN	
parseOffset	TokenNameIdentifier	 parse Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
class	TokenNameclass	
Handler	TokenNameIdentifier	 Handler
implements	TokenNameimplements	
ClockHandler	TokenNameIdentifier	 Clock Handler
{	TokenNameLBRACE	
protected	TokenNameprotected	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
clockValue	TokenNameIdentifier	 clock Value
(	TokenNameLPAREN	
float	TokenNamefloat	
newClockValue	TokenNameIdentifier	 new Clock Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
newClockValue	TokenNameIdentifier	 new Clock Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Handler	TokenNameIdentifier	 Handler
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Handler	TokenNameIdentifier	 Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setClockHandler	TokenNameIdentifier	 set Clock Handler
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a new 'end' attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a new 'end' attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseEnd	TokenNameIdentifier	 parse End
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
endTimes	TokenNameIdentifier	 end Times
=	TokenNameEQUAL	
TimingSpecifierListProducer	TokenNameIdentifier	 Timing Specifier List Producer
.	TokenNameDOT	
parseTimingSpecifierList	TokenNameIdentifier	 parse Timing Specifier List
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
.	TokenNameDOT	
this	TokenNamethis	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SMIL_END_ATTRIBUTE	TokenNameIdentifier	 SMIL  END  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a new 'min' attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a new 'min' attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseMin	TokenNameIdentifier	 parse Min
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_MEDIA_VALUE	TokenNameIdentifier	 SMIL  MEDIA  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
minMedia	TokenNameIdentifier	 min Media
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
minMedia	TokenNameIdentifier	 min Media
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
parseClockValue	TokenNameIdentifier	 parse Clock Value
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a new 'max' attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a new 'max' attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseMax	TokenNameIdentifier	 parse Max
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_MEDIA_VALUE	TokenNameIdentifier	 SMIL  MEDIA  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
maxMedia	TokenNameIdentifier	 max Media
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
maxMedia	TokenNameIdentifier	 max Media
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_INDEFINITE_VALUE	TokenNameIdentifier	 SMIL  INDEFINITE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
parseClockValue	TokenNameIdentifier	 parse Clock Value
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a new 'repeatCount' attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a new 'repeatCount' attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseRepeatCount	TokenNameIdentifier	 parse Repeat Count
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repeatCount	TokenNameIdentifier	 repeat Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repeatCount	TokenNameIdentifier	 repeat Count
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repeatCount	TokenNameIdentifier	 repeat Count
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
repeatCount	TokenNameIdentifier	 repeat Count
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_INDEFINITE_VALUE	TokenNameIdentifier	 SMIL  INDEFINITE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repeatCount	TokenNameIdentifier	 repeat Count
=	TokenNameEQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repeatCount	TokenNameIdentifier	 repeat Count
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
repeatCount	TokenNameIdentifier	 repeat Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
repeatCount	TokenNameIdentifier	 repeat Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SMIL_REPEAT_COUNT_ATTRIBUTE	TokenNameIdentifier	 SMIL  REPEAT  COUNT  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a new 'repeatDur' attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a new 'repeatDur' attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseRepeatDur	TokenNameIdentifier	 parse Repeat Dur
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repeatDur	TokenNameIdentifier	 repeat Dur
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repeatDur	TokenNameIdentifier	 repeat Dur
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repeatDur	TokenNameIdentifier	 repeat Dur
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
repeatDur	TokenNameIdentifier	 repeat Dur
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_INDEFINITE_VALUE	TokenNameIdentifier	 SMIL  INDEFINITE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repeatDur	TokenNameIdentifier	 repeat Dur
=	TokenNameEQUAL	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repeatDur	TokenNameIdentifier	 repeat Dur
=	TokenNameEQUAL	
parseClockValue	TokenNameIdentifier	 parse Clock Value
(	TokenNameLPAREN	
repeatDur	TokenNameIdentifier	 repeat Dur
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SMIL_REPEAT_DUR_ATTRIBUTE	TokenNameIdentifier	 SMIL  REPEAT  DUR  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a new 'fill' attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a new 'fill' attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseFill	TokenNameIdentifier	 parse Fill
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fill	TokenNameIdentifier	 fill
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fill	TokenNameIdentifier	 fill
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
fill	TokenNameIdentifier	 fill
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_REMOVE_VALUE	TokenNameIdentifier	 SMIL  REMOVE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillMode	TokenNameIdentifier	 fill Mode
=	TokenNameEQUAL	
FILL_REMOVE	TokenNameIdentifier	 FILL  REMOVE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fill	TokenNameIdentifier	 fill
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_FREEZE_VALUE	TokenNameIdentifier	 SMIL  FREEZE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillMode	TokenNameIdentifier	 fill Mode
=	TokenNameEQUAL	
FILL_FREEZE	TokenNameIdentifier	 FILL  FREEZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SMIL_FILL_ATTRIBUTE	TokenNameIdentifier	 SMIL  FILL  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a new 'restart' attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a new 'restart' attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseRestart	TokenNameIdentifier	 parse Restart
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
restart	TokenNameIdentifier	 restart
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
restart	TokenNameIdentifier	 restart
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
restart	TokenNameIdentifier	 restart
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_ALWAYS_VALUE	TokenNameIdentifier	 SMIL  ALWAYS  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
restartMode	TokenNameIdentifier	 restart Mode
=	TokenNameEQUAL	
RESTART_ALWAYS	TokenNameIdentifier	 RESTART  ALWAYS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
restart	TokenNameIdentifier	 restart
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_WHEN_NOT_ACTIVE_VALUE	TokenNameIdentifier	 SMIL  WHEN  NOT  ACTIVE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
restartMode	TokenNameIdentifier	 restart Mode
=	TokenNameEQUAL	
RESTART_WHEN_NOT_ACTIVE	TokenNameIdentifier	 RESTART  WHEN  NOT  ACTIVE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
restart	TokenNameIdentifier	 restart
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMIL_NEVER_VALUE	TokenNameIdentifier	 SMIL  NEVER  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
restartMode	TokenNameIdentifier	 restart Mode
=	TokenNameEQUAL	
RESTART_NEVER	TokenNameIdentifier	 RESTART  NEVER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SMIL_RESTART_ATTRIBUTE	TokenNameIdentifier	 SMIL  RESTART  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Initializes this timed element. */	TokenNameCOMMENT_JAVADOC	 Initializes this timed element. 
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
beginTimes	TokenNameIdentifier	 begin Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginTimes	TokenNameIdentifier	 begin Times
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
endTimes	TokenNameIdentifier	 end Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endTimes	TokenNameIdentifier	 end Times
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Deinitializes this timed element. */	TokenNameCOMMENT_JAVADOC	 Deinitializes this timed element. 
public	TokenNamepublic	
void	TokenNamevoid	
deinitialize	TokenNameIdentifier	 deinitialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
beginTimes	TokenNameIdentifier	 begin Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginTimes	TokenNameIdentifier	 begin Times
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
deinitialize	TokenNameIdentifier	 deinitialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
endTimes	TokenNameIdentifier	 end Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endTimes	TokenNameIdentifier	 end Times
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
deinitialize	TokenNameIdentifier	 deinitialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds a time to the begin time instance list that will cause * the element to begin immediately (if restart semantics allow it). */	TokenNameCOMMENT_JAVADOC	 Adds a time to the begin time instance list that will cause the element to begin immediately (if restart semantics allow it). 
public	TokenNamepublic	
void	TokenNamevoid	
beginElement	TokenNameIdentifier	 begin Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginElement	TokenNameIdentifier	 begin Element
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a time to the begin time instance list that will cause * the element to begin at some offset to the current time (if restart * semantics allow it). */	TokenNameCOMMENT_JAVADOC	 Adds a time to the begin time instance list that will cause the element to begin at some offset to the current time (if restart semantics allow it). 
public	TokenNamepublic	
void	TokenNamevoid	
beginElement	TokenNameIdentifier	 begin Element
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
convertWallclockTime	TokenNameIdentifier	 convert Wallclock Time
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceTime	TokenNameIdentifier	 Instance Time
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addInstanceTime	TokenNameIdentifier	 add Instance Time
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a time to the end time instance list that will cause * the element to end immediately (if restart semantics allow it). */	TokenNameCOMMENT_JAVADOC	 Adds a time to the end time instance list that will cause the element to end immediately (if restart semantics allow it). 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a time to the end time instance list that will cause * the element to end at some offset to the current time (if restart * semantics allow it). */	TokenNameCOMMENT_JAVADOC	 Adds a time to the end time instance list that will cause the element to end at some offset to the current time (if restart semantics allow it). 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
convertWallclockTime	TokenNameIdentifier	 convert Wallclock Time
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceTime	TokenNameIdentifier	 Instance Time
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addInstanceTime	TokenNameIdentifier	 add Instance Time
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the last sample time of this element, in local active time. */	TokenNameCOMMENT_JAVADOC	 Returns the last sample time of this element, in local active time. 
public	TokenNamepublic	
float	TokenNamefloat	
getLastSampleTime	TokenNameIdentifier	 get Last Sample Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastSampleTime	TokenNameIdentifier	 last Sample Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the begin time of the current interval, in parent simple time, * or <code>Float.NaN</code> if the element is not active. */	TokenNameCOMMENT_JAVADOC	 Returns the begin time of the current interval, in parent simple time, or <code>Float.NaN</code> if the element is not active. 
public	TokenNamepublic	
float	TokenNamefloat	
getCurrentBeginTime	TokenNameIdentifier	 get Current Begin Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentInterval	TokenNameIdentifier	 current Interval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
lastSampleTime	TokenNameIdentifier	 last Sample Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this element can be begun or restarted currently. */	TokenNameCOMMENT_JAVADOC	 Returns whether this element can be begun or restarted currently. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canBegin	TokenNameIdentifier	 can Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentInterval	TokenNameIdentifier	 current Interval
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
isActive	TokenNameIdentifier	 is Active
&&	TokenNameAND_AND	
restartMode	TokenNameIdentifier	 restart Mode
!=	TokenNameNOT_EQUAL	
RESTART_NEVER	TokenNameIdentifier	 RESTART  NEVER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this element can be ended currently. */	TokenNameCOMMENT_JAVADOC	 Returns whether this element can be ended currently. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canEnd	TokenNameIdentifier	 can End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isActive	TokenNameIdentifier	 is Active
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the time that the document would seek to if this animation * element were hyperlinked to, or <code>NaN</code> if there is no * such begin time. */	TokenNameCOMMENT_JAVADOC	 Returns the time that the document would seek to if this animation element were hyperlinked to, or <code>NaN</code> if there is no such begin time. 
public	TokenNamepublic	
float	TokenNamefloat	
getHyperlinkBeginTime	TokenNameIdentifier	 get Hyperlink Begin Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isActive	TokenNameIdentifier	 is Active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentInterval	TokenNameIdentifier	 current Interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
beginInstanceTimes	TokenNameIdentifier	 begin Instance Times
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
beginInstanceTimes	TokenNameIdentifier	 begin Instance Times
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fires a TimeEvent of the given type on this element. * @param eventType the type of TimeEvent ("beginEvent", "endEvent" * or "repeatEvent"). * @param time the timestamp of the event object * @param detail the repeat iteration, if this event is a repeat event */	TokenNameCOMMENT_JAVADOC	 Fires a TimeEvent of the given type on this element. @param eventType the type of TimeEvent ("beginEvent", "endEvent" or "repeatEvent"). @param time the timestamp of the event object @param detail the repeat iteration, if this event is a repeat event 
protected	TokenNameprotected	
void	TokenNamevoid	
fireTimeEvent	TokenNameIdentifier	 fire Time Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
int	TokenNameint	
detail	TokenNameIdentifier	 detail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
)	TokenNameRPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getDocumentBeginTime	TokenNameIdentifier	 get Document Begin Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
*	TokenNameMULTIPLY	
1e3	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTimeEvent	TokenNameIdentifier	 fire Time Event
(	TokenNameLPAREN	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
detail	TokenNameIdentifier	 detail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked by a {@link TimingSpecifier} to indicate that an event occurred * that would create a new instance time for this timed element. These * will be processed at the beginning of the next tick. */	TokenNameCOMMENT_JAVADOC	 Invoked by a {@link TimingSpecifier} to indicate that an event occurred that would create a new instance time for this timed element. These will be processed at the beginning of the next tick. 
void	TokenNamevoid	
eventOccurred	TokenNameIdentifier	 event Occurred
(	TokenNameLPAREN	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Event	TokenNameIdentifier	 Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HashSet	TokenNameIdentifier	 Hash Set
)	TokenNameRPAREN	
handledEvents	TokenNameIdentifier	 handled Events
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handledEvents	TokenNameIdentifier	 handled Events
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
currentIntervalWillUpdate	TokenNameIdentifier	 current Interval Will Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fires a TimeEvent of the given type on this element. * @param eventType the type of TimeEvent ("beginEvent", "endEvent" * or "repeatEvent"). * @param time the timestamp of the event object */	TokenNameCOMMENT_JAVADOC	 Fires a TimeEvent of the given type on this element. @param eventType the type of TimeEvent ("beginEvent", "endEvent" or "repeatEvent"). @param time the timestamp of the event object 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
fireTimeEvent	TokenNameIdentifier	 fire Time Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
int	TokenNameint	
detail	TokenNameIdentifier	 detail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked to indicate this timed element became active at the * specified time. * @param begin the time the element became active, in document simple time */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate this timed element became active at the specified time. @param begin the time the element became active, in document simple time 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
toActive	TokenNameIdentifier	 to Active
(	TokenNameLPAREN	
float	TokenNamefloat	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked to indicate that this timed element became inactive. * @param stillActive if true, indicates that the element is still actually * active, but between the end of the computed repeat * duration and the end of the interval * @param isFrozen whether the element is frozen or not */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that this timed element became inactive. @param stillActive if true, indicates that the element is still actually active, but between the end of the computed repeat duration and the end of the interval @param isFrozen whether the element is frozen or not 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
toInactive	TokenNameIdentifier	 to Inactive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
stillActive	TokenNameIdentifier	 still Active
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked to indicate that this timed element has had its fill removed. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that this timed element has had its fill removed. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
removeFill	TokenNameIdentifier	 remove Fill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked to indicate that this timed element has been sampled at the * given time. * @param simpleTime the sample time in local simple time * @param simpleDur the simple duration of the element * @param repeatIteration the repeat iteration during which the element * was sampled */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that this timed element has been sampled at the given time. @param simpleTime the sample time in local simple time @param simpleDur the simple duration of the element @param repeatIteration the repeat iteration during which the element was sampled 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
sampledAt	TokenNameIdentifier	 sampled At
(	TokenNameLPAREN	
float	TokenNamefloat	
simpleTime	TokenNameIdentifier	 simple Time
,	TokenNameCOMMA	
float	TokenNamefloat	
simpleDur	TokenNameIdentifier	 simple Dur
,	TokenNameCOMMA	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked to indicate that this timed element has been sampled * at the end of its active time, at an integer multiple of the * simple duration. This is the "last" value that will be used * for filling, which cannot be sampled normally. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that this timed element has been sampled at the end of its active time, at an integer multiple of the simple duration. This is the "last" value that will be used for filling, which cannot be sampled normally. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
sampledLastValue	TokenNameIdentifier	 sampled Last Value
(	TokenNameLPAREN	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the timed element with the given ID. */	TokenNameCOMMENT_JAVADOC	 Returns the timed element with the given ID. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
TimedElement	TokenNameIdentifier	 Timed Element
getTimedElementById	TokenNameIdentifier	 get Timed Element By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the event target with the given ID. */	TokenNameCOMMENT_JAVADOC	 Returns the event target with the given ID. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
EventTarget	TokenNameIdentifier	 Event Target
getEventTargetById	TokenNameIdentifier	 get Event Target By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the event target that should be listened to for * access key events. */	TokenNameCOMMENT_JAVADOC	 Returns the event target that should be listened to for access key events. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
EventTarget	TokenNameIdentifier	 Event Target
getRootEventTarget	TokenNameIdentifier	 get Root Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the DOM element that corresponds to this timed element, if * such a DOM element exists. */	TokenNameCOMMENT_JAVADOC	 Returns the DOM element that corresponds to this timed element, if such a DOM element exists. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Element	TokenNameIdentifier	 Element
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the target of this animation as an {@link EventTarget}. Used * for eventbase timing specifiers where the element ID is omitted. */	TokenNameCOMMENT_JAVADOC	 Returns the target of this animation as an {@link EventTarget}. Used for eventbase timing specifiers where the element ID is omitted. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
EventTarget	TokenNameIdentifier	 Event Target
getAnimationEventTarget	TokenNameIdentifier	 get Animation Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether this timed element comes before the given timed element * in document order. */	TokenNameCOMMENT_JAVADOC	 Returns whether this timed element comes before the given timed element in document order. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isBefore	TokenNameIdentifier	 is Before
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether this timed element is for a constant animation (i.e., a * 'set' animation. */	TokenNameCOMMENT_JAVADOC	 Returns whether this timed element is for a constant animation (i.e., a 'set' animation. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isConstantAnimation	TokenNameIdentifier	 is Constant Animation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates and returns a new {@link AnimationException}. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new {@link AnimationException}. 
public	TokenNamepublic	
AnimationException	TokenNameIdentifier	 Animation Exception
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AnimationException	TokenNameIdentifier	 Animation Exception
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The error messages bundle class name. */	TokenNameCOMMENT_JAVADOC	 The error messages bundle class name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESOURCES	TokenNameIdentifier	 RESOURCES
=	TokenNameEQUAL	
"org.apache.batik.anim.resources.Messages"	TokenNameStringLiteral	org.apache.batik.anim.resources.Messages
;	TokenNameSEMICOLON	
/** * The localizable support for the error messages. */	TokenNameCOMMENT_JAVADOC	 The localizable support for the error messages. 
protected	TokenNameprotected	
static	TokenNamestatic	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
localizableSupport	TokenNameIdentifier	 localizable Support
=	TokenNameEQUAL	
new	TokenNamenew	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
(	TokenNameLPAREN	
RESOURCES	TokenNameIdentifier	 RESOURCES
,	TokenNameCOMMA	
TimedElement	TokenNameIdentifier	 Timed Element
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Implements {@link org.apache.batik.i18n.Localizable#setLocale(java.util.Locale)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.Localizable#setLocale(java.util.Locale)}. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.i18n.Localizable#getLocale()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.Localizable#getLocale()}. 
public	TokenNamepublic	
static	TokenNamestatic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.i18n.Localizable#formatMessage(String,Object[])}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.i18n.Localizable#formatMessage(String,Object[])}. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of the given time value. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of the given time value. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"UNRESOLVED"	TokenNameStringLiteral	UNRESOLVED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
==	TokenNameEQUAL_EQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"INDEFINITE"	TokenNameStringLiteral	INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
